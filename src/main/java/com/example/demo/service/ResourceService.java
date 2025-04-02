package com.example.demo.service;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.example.openapi.model.ContractInfoResponse;
import com.example.openapi.model.ContractInfoResponseAAE91;


@Service
public class ResourceService {

    private final Map<String, Map<String, Object>> resourceStorage = new ConcurrentHashMap<>();

    // コンストラクタでスタブデータを初期化
    public ResourceService() {
        // ユーザー情報リソースのスタブデータ
        resourceStorage.put("userinfo", Map.of(
            "id", 1,
            "name", "John Doe",
            "email", "john.doe@example.com"
        ));

        // 契約情報リソースのスタブデータ
        resourceStorage.put("contractinfo", Map.of(
            "contractId", "C12345",
            "contractDate", "2025-03-25",
            "contractAmount", 1000000
        ));
    }

    // リソースを取得（GET）
    public Optional<Map<String, Object>> getResourceData(String resourceName) {
        return Optional.ofNullable(resourceStorage.get(resourceName));
    }

    // 契約情報取得
    public ContractInfoResponse getContractInfo() {
        // DBや外部APIから契約情報を取得する処理を実装
        // ここでは仮のデータを返す
        ContractInfoResponse response = new ContractInfoResponse();
        ContractInfoResponseAAE91 aae91 = new ContractInfoResponseAAE91();
        aae91.setAAE91056("実装　さま");
        response.setAAE91(aae91);

        return response;
    }    

    // リソースを作成（POST）
    public boolean createResource(String resourceName, Map<String, Object> requestData) {
        if (resourceStorage.containsKey(resourceName)) {
            return false; // 既に存在する場合は作成失敗
        }
        resourceStorage.put(resourceName, requestData);
        return true;
    }
}
