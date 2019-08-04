package jp.ac.aiit.syspro.SysProAssignmentApi.assignment;

import java.util.ArrayList;
import java.util.List;

public class Location {
    /** ステータス */
    int status;

    /** メッセージ */
    String message;

    /** 郵便番号情報リスト */
    List<ZipCodeData> results = new ArrayList<>();

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ZipCodeData> getResults() {
        return results;
    }

    public void setResults(List<ZipCodeData> results) {
        this.results = results;
    }
}
