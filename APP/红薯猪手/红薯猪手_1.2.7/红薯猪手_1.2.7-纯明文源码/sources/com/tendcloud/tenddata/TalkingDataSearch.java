package com.tendcloud.tenddata;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class TalkingDataSearch extends JSONObject {

    /* JADX INFO: renamed from: a */
    private static final String f62a = "category";

    /* JADX INFO: renamed from: b */
    private static final String f63b = "content";

    private TalkingDataSearch() {
    }

    public static TalkingDataSearch createSearch() {
        return new TalkingDataSearch();
    }

    public TalkingDataSearch setCategory(String str) {
        try {
            put(f62a, str);
        } catch (Throwable th) {
            C0115h.m529a("set category error ", th);
        }
        return this;
    }

    public TalkingDataSearch setContent(String str) {
        try {
            put(f63b, str);
        } catch (Throwable th) {
            C0115h.m529a("set content error ", th);
        }
        return this;
    }
}
