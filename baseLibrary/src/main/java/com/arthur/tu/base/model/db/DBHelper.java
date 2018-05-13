package com.arthur.tu.base.model.db;

import com.arthur.tu.base.model.bean.Collection;
import com.arthur.tu.base.model.bean.Record;
import com.arthur.tu.base.model.bean.SearchKey;

import java.util.List;

import io.realm.Realm;

public interface DBHelper {
    Realm getRealm();

    void insertCollection(Collection bean);

    void deleteCollection(String id);

    void deleteAllCollection();

    boolean queryCollectionId(String id);

    List<Collection> getCollectionList();

    void insertRecord(Record bean, int maxSize);

    void deleteRecord(String id);

    boolean queryRecordId(String id);

    List<Record> getRecordList();

    void deleteAllRecord();

    void insertSearchHistory(SearchKey bean);

    List<SearchKey> getSearchHistoryList(String value);

    void deleteSearchHistoryList(String value);

    void deleteSearchHistoryAll();

    List<SearchKey> getSearchHistoryListAll();
}
