package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class TalkingDataSearch extends org.json.JSONObject {
    private static final java.lang.String a = "category";
    private static final java.lang.String b = "content";

    private TalkingDataSearch() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.tendcloud.tenddata.TalkingDataSearch createSearch() {
            com.tendcloud.tenddata.TalkingDataSearch r0 = new com.tendcloud.tenddata.TalkingDataSearch
            r0.<init>()
            return r0
    }

    public com.tendcloud.tenddata.TalkingDataSearch setCategory(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "category"
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L6
            goto Lc
        L6:
            r2 = move-exception
            java.lang.String r0 = "set category error "
            com.tendcloud.tenddata.h.a(r0, r2)
        Lc:
            return r1
    }

    public com.tendcloud.tenddata.TalkingDataSearch setContent(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "content"
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L6
            goto Lc
        L6:
            r2 = move-exception
            java.lang.String r0 = "set content error "
            com.tendcloud.tenddata.h.a(r0, r2)
        Lc:
            return r1
    }
}
