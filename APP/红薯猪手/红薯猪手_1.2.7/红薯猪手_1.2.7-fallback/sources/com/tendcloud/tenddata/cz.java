package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class cz extends com.tendcloud.tenddata.cy {
    public static final java.lang.String a = "TalkingData";
    public static final java.lang.String c = "SaaS";
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 4;
    public static final int i = 5;
    public static final int j = 6;
    public static final int k = 7;
    public static final int l = 8;
    private static java.lang.String n = "";
    private static int o = 4;
    private final java.lang.String m;

    public cz() {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "Android"
            r3.m = r0
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "version"
            r3.a(r2, r1)
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "minorVersion"
            r3.a(r2, r1)
            r1 = 28
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "build"
            r3.a(r2, r1)
            java.lang.String r1 = "2606"
            boolean r2 = com.tendcloud.tenddata.y.b(r1)
            if (r2 != 0) goto L3b
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = "jobNum"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L3b
            r3.a(r2, r1)     // Catch: java.lang.Throwable -> L3b
        L3b:
            java.lang.String r1 = "partner"
            java.lang.String r2 = "SaaS"
            r3.a(r1, r2)
            java.lang.String r1 = "platform"
            r3.a(r1, r0)
            java.lang.String r0 = "type"
            java.lang.String r1 = "TalkingData"
            r3.a(r0, r1)
            java.lang.String r0 = com.tendcloud.tenddata.cz.n
            java.lang.String r1 = "framework"
            r3.a(r1, r0)
            int r0 = com.tendcloud.tenddata.cz.o
            if (r0 <= 0) goto L62
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "from"
            r3.a(r1, r0)
        L62:
            return
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = com.tendcloud.tenddata.cz.n
            return r0
    }

    public void a(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            org.json.JSONObject r0 = r4.b
            java.lang.String r1 = "features"
            boolean r0 = r0.isNull(r1)
            if (r0 == 0) goto L10
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            goto L1c
        L10:
            org.json.JSONObject r0 = r4.b     // Catch: org.json.JSONException -> L17
            org.json.JSONArray r0 = r0.getJSONArray(r1)     // Catch: org.json.JSONException -> L17
            goto L1c
        L17:
            r0 = move-exception
            r0.printStackTrace()
            r0 = 0
        L1c:
            if (r0 == 0) goto L3d
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "name"
            r2.put(r3, r5)     // Catch: org.json.JSONException -> L36
            java.lang.String r5 = "version"
            r2.put(r5, r6)     // Catch: org.json.JSONException -> L36
            java.lang.String r5 = "minorVersion"
            r2.put(r5, r7)     // Catch: org.json.JSONException -> L36
            r0.put(r2)     // Catch: org.json.JSONException -> L36
            goto L3a
        L36:
            r5 = move-exception
            r5.printStackTrace()
        L3a:
            r4.a(r1, r0)
        L3d:
            return
    }

    public void setFrameWork(java.lang.String r1) {
            r0 = this;
            com.tendcloud.tenddata.cz.n = r1
            return
    }

    public void setRule(int r2) {
            r1 = this;
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = "rule"
            r1.a(r0, r2)
            return
    }
}
