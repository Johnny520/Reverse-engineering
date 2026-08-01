package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class pe1 {

    /* JADX INFO: renamed from: α */
    public static final p000.pe1 f8537 = null;

    static {
            pe1 r0 = new pe1
            r0.<init>()
            p000.pe1.f8537 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static int m4505(org.json.JSONObject r4, p000.ne1 r5) {
            java.lang.String r0 = "base_resp"
            org.json.JSONObject r0 = r4.optJSONObject(r0)
            java.lang.String r1 = "code"
            boolean r2 = r4.has(r1)
            r3 = -1
            if (r2 == 0) goto L14
            int r4 = r4.optInt(r1, r3)
            return r4
        L14:
            java.lang.String r1 = "status_code"
            boolean r2 = r4.has(r1)
            if (r2 == 0) goto L21
            int r4 = r4.optInt(r1, r3)
            return r4
        L21:
            if (r0 == 0) goto L2f
            boolean r4 = r0.has(r1)
            r2 = 1
            if (r4 != r2) goto L2f
            int r4 = r0.optInt(r1, r3)
            return r4
        L2f:
            if (r5 == 0) goto L33
            r4 = 0
            return r4
        L33:
            return r3
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.String m4506(org.json.JSONObject r4) {
            java.lang.String r0 = "base_resp"
            org.json.JSONObject r0 = r4.optJSONObject(r0)
            java.lang.String r1 = "message"
            java.lang.String r1 = r4.optString(r1)
            java.lang.String r2 = "msg"
            java.lang.String r2 = r4.optString(r2)
            java.lang.String r3 = "status_msg"
            java.lang.String r4 = r4.optString(r3)
            if (r0 == 0) goto L21
            java.lang.String r3 = "status_message"
            java.lang.String r0 = r0.optString(r3)
            goto L22
        L21:
            r0 = 0
        L22:
            java.lang.String[] r4 = new java.lang.String[]{r1, r2, r4, r0}
            ss1 r4 = p000.AbstractC0312g7.m2232(r4)
            f71 r0 = new f71
            r1 = 25
            r0.<init>(r1)
            y30 r4 = p000.us1.m5943(r4, r0)
            java.lang.Object r4 = p000.us1.m5953(r4)
            java.lang.String r4 = (java.lang.String) r4
            return r4
    }

    /* JADX INFO: renamed from: δ */
    public static final org.json.JSONObject m4507(int r3, java.lang.Object r4) {
            r0 = 0
            if (r4 == 0) goto Laa
            java.lang.Object r1 = org.json.JSONObject.NULL
            if (r4 == r1) goto Laa
            r1 = 6
            if (r3 <= r1) goto Lc
            goto Laa
        Lc:
            boolean r1 = r4 instanceof org.json.JSONObject
            if (r1 == 0) goto L4f
            r1 = r4
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.String r2 = "closeness"
            org.json.JSONObject r2 = r1.optJSONObject(r2)
            if (r2 != 0) goto L4e
            java.lang.String r2 = "behavior_closeness"
            boolean r2 = r1.has(r2)
            if (r2 != 0) goto L2b
            java.lang.String r2 = "level_num"
            boolean r2 = r1.has(r2)
            if (r2 == 0) goto L2c
        L2b:
            r0 = r4
        L2c:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            if (r0 != 0) goto L4d
            java.util.Iterator r0 = r1.keys()
            r0.getClass()
            ss1 r0 = p000.us1.m5951(r0)
            ya1 r1 = new ya1
            r2 = 18
            r1.<init>(r3, r2, r4)
            y30 r3 = p000.us1.m5943(r0, r1)
            java.lang.Object r3 = p000.us1.m5953(r3)
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            return r3
        L4d:
            return r0
        L4e:
            return r2
        L4f:
            boolean r1 = r4 instanceof org.json.JSONArray
            if (r1 == 0) goto L75
            r0 = r4
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            int r0 = r0.length()
            r1 = 0
            xm0 r0 = p000.j81.m2893(r1, r0)
            f7 r0 = p000.AbstractC0984xh.m6661(r0)
            ya1 r1 = new ya1
            r2 = 19
            r1.<init>(r3, r2, r4)
            y30 r3 = p000.us1.m5943(r0, r1)
            java.lang.Object r3 = p000.us1.m5953(r3)
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            return r3
        L75:
            boolean r1 = r4 instanceof java.lang.String
            if (r1 == 0) goto Laa
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = p000.q02.m4660(r4)
            java.lang.String r4 = r4.toString()
            r1 = 123(0x7b, float:1.72E-43)
            boolean r1 = p000.q02.m4684(r4, r1)
            if (r1 == 0) goto L8c
            goto L8d
        L8c:
            r4 = r0
        L8d:
            if (r4 == 0) goto Laa
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L95
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L95
            goto L9b
        L95:
            r4 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r4)
        L9b:
            boolean r4 = r1 instanceof p000.eo1
            if (r4 == 0) goto La0
            r1 = r0
        La0:
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            if (r1 == 0) goto Laa
            int r3 = r3 + 1
            org.json.JSONObject r0 = m4507(r3, r1)
        Laa:
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static java.lang.Integer m4508(java.lang.String r0, org.json.JSONObject r1) {
            java.lang.Object r0 = r1.opt(r0)
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L13
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L13:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L20
            java.lang.String r0 = (java.lang.String) r0
            r1 = 10
            java.lang.Integer r0 = p000.x02.m6487(r0, r1)
            return r0
        L20:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.Long m4509(java.lang.String r0, org.json.JSONObject r1) {
            java.lang.Object r0 = r1.opt(r0)
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L13
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L13:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L20
            java.lang.String r0 = (java.lang.String) r0
            r1 = 10
            java.lang.Long r0 = p000.x02.m6489(r0, r1)
            return r0
        L20:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static p000.le1 m4510(java.lang.ClassLoader r2, java.lang.String r3, java.util.LinkedHashMap r4, java.util.LinkedHashMap r5) {
            r0 = 32
            rf1 r2 = p000.xn0.m6755(r2, r3, r4, r5, r0)
            boolean r3 = r2.m5085()
            if (r3 != 0) goto L18
            java.lang.Throwable r2 = r2.f9363
            if (r2 != 0) goto L17
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "亲密度宿主请求失败"
            r2.<init>(r3)
        L17:
            throw r2
        L18:
            java.lang.Object r2 = r2.f9362
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L9f
            java.lang.String r3 = "data"
            java.lang.Object r3 = r2.get(r3)
            boolean r4 = r3 instanceof java.util.Map
            r5 = 0
            if (r4 == 0) goto L2c
            java.util.Map r3 = (java.util.Map) r3
            goto L2d
        L2c:
            r3 = r5
        L2d:
            if (r3 == 0) goto L34
            zw0 r3 = m4512(r3)
            goto L35
        L34:
            r3 = r5
        L35:
            if (r3 != 0) goto L39
            kz r3 = p000.C0493kz.f6332
        L39:
            java.lang.String r4 = "response"
            java.lang.Object r4 = r3.get(r4)
            org.json.JSONObject r4 = m4511(r4)
            if (r4 != 0) goto L56
            java.lang.String r4 = "rawResponse"
            java.lang.Object r4 = r3.get(r4)
            org.json.JSONObject r4 = m4511(r4)
            if (r4 != 0) goto L56
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
        L56:
            le1 r0 = new le1
            java.lang.String r1 = "code"
            java.lang.Object r2 = r2.get(r1)
            boolean r1 = r2 instanceof java.lang.Number
            if (r1 == 0) goto L69
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            goto L7b
        L69:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1 = 10
            java.lang.Integer r2 = p000.x02.m6487(r2, r1)
            if (r2 == 0) goto L7a
            int r2 = r2.intValue()
            goto L7b
        L7a:
            r2 = -1
        L7b:
            java.lang.String r1 = "httpCode"
            java.lang.Object r3 = r3.get(r1)
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L90
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            goto L9b
        L90:
            if (r3 != 0) goto L93
            goto L9b
        L93:
            java.lang.String r3 = r3.toString()
            java.lang.Integer r5 = p000.x02.m6486(r3)
        L9b:
            r0.<init>(r2, r5, r4)
            return r0
        L9f:
            java.lang.String r2 = "亲密度 Bridge 结果为空"
            p000.C1080.m7279(r2)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ι */
    public static org.json.JSONObject m4511(java.lang.Object r2) {
            boolean r0 = r2 instanceof org.json.JSONObject
            if (r0 == 0) goto L7
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            return r2
        L7:
            boolean r0 = r2 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L27
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L18
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L18
            zw0 r2 = m4512(r2)     // Catch: java.lang.Throwable -> L18
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L18
            goto L1e
        L18:
            r2 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r2)
        L1e:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L23
            goto L24
        L23:
            r1 = r0
        L24:
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            goto L41
        L27:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L41
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L33
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L33
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L33
            goto L39
        L33:
            r2 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r2)
        L39:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L3e
            goto L3f
        L3e:
            r1 = r0
        L3f:
            org.json.JSONObject r1 = (org.json.JSONObject) r1
        L41:
            return r1
    }

    /* JADX INFO: renamed from: κ */
    public static p000.zw0 m4512(java.util.Map r3) {
            zw0 r0 = new zw0
            r0.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            if (r2 == 0) goto Ld
            java.lang.String r2 = r2.toString()
            r0.put(r2, r1)
            goto Ld
        L2b:
            zw0 r3 = r0.m7241()
            return r3
    }

    /* JADX INFO: renamed from: γ */
    public final java.lang.Object m4513(java.lang.ClassLoader r7, long r8) {
            r6 = this;
            r7.getClass()
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L50
            java.util.LinkedHashMap r8 = p000.xn0.m6713(r7, r8)     // Catch: java.lang.Throwable -> L58
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L58
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = "module_list"
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L58
            java.util.List r1 = p000.AbstractC1021yh.m6896(r1)     // Catch: java.lang.Throwable -> L58
            r9.put(r0, r1)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = "source"
            java.lang.String r1 = "IMClientFetch"
            r9.put(r0, r1)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = "https://stark-gate.zijieapi.com/ttgame/social_pet/home/info"
            le1 r7 = m4510(r7, r0, r9, r8)     // Catch: java.lang.Throwable -> L58
            org.json.JSONObject r8 = r7.f6591     // Catch: java.lang.Throwable -> L58
            r9 = 0
            org.json.JSONObject r9 = m4507(r9, r8)     // Catch: java.lang.Throwable -> L58
            if (r9 == 0) goto L3c
            ne1 r6 = r6.m4514(r9)     // Catch: java.lang.Throwable -> L58
        L3a:
            r5 = r6
            goto L3e
        L3c:
            r6 = 0
            goto L3a
        L3e:
            oe1 r0 = new oe1     // Catch: java.lang.Throwable -> L58
            int r1 = r7.f6589     // Catch: java.lang.Throwable -> L58
            java.lang.Integer r2 = r7.f6590     // Catch: java.lang.Throwable -> L58
            int r3 = m4505(r8, r5)     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = m4506(r8)     // Catch: java.lang.Throwable -> L58
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L58
            return r0
        L50:
            java.lang.String r6 = "conversationShortId 必须大于 0"
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L58
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L58
            throw r7     // Catch: java.lang.Throwable -> L58
        L58:
            r0 = move-exception
            r6 = r0
            eo1 r7 = new eo1
            r7.<init>(r6)
            return r7
    }

    /* JADX INFO: renamed from: η */
    public final p000.ne1 m4514(org.json.JSONObject r10) {
            r9 = this;
            java.lang.String r0 = "behavior_closeness"
            org.json.JSONArray r3 = r10.optJSONArray(r0)
            if (r3 == 0) goto L3f
            r0 = 0
            int r1 = r3.length()
            xm0 r0 = p000.j81.m2893(r0, r1)
            f7 r0 = p000.AbstractC0984xh.m6661(r0)
            ny0 r1 = new ny0
            r7 = 0
            r8 = 16
            r2 = 1
            java.lang.Class<org.json.JSONArray> r4 = org.json.JSONArray.class
            java.lang.String r5 = "optJSONObject"
            java.lang.String r6 = "optJSONObject(I)Lorg/json/JSONObject;"
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            y30 r0 = p000.us1.m5943(r0, r1)
            ny0 r1 = new ny0
            r8 = 15
            java.lang.Class<pe1> r4 = p000.pe1.class
            java.lang.String r5 = "parseBehavior"
            java.lang.String r6 = "parseBehavior(Lorg/json/JSONObject;)Lcom/example/dyhelper/hook/IM/pet/PetElfClosenessApiClient$Behavior;"
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            y30 r9 = p000.us1.m5943(r0, r1)
            java.util.List r9 = p000.us1.m5948(r9)
            goto L40
        L3f:
            r9 = 0
        L40:
            if (r9 != 0) goto L44
            jz r9 = p000.C0450jz.f5672
        L44:
            r7 = r9
            ne1 r0 = new ne1
            java.lang.String r9 = "level_num"
            java.lang.Integer r1 = m4508(r9, r10)
            java.lang.String r9 = "level_max"
            java.lang.Integer r2 = m4508(r9, r10)
            java.lang.String r9 = "level_current"
            java.lang.Long r3 = m4509(r9, r10)
            java.lang.String r9 = "level_delta_closeness"
            java.lang.Long r4 = m4509(r9, r10)
            java.lang.String r9 = "total"
            java.lang.Long r5 = m4509(r9, r10)
            java.lang.String r9 = "level_target"
            java.lang.Long r6 = m4509(r9, r10)
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }
}
