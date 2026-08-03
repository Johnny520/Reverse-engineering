package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class bf {
    private static volatile com.tendcloud.tenddata.bf a;

    static {
            com.tendcloud.tenddata.z r0 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> Lb
            com.tendcloud.tenddata.bf r1 = a()     // Catch: java.lang.Throwable -> Lb
            r0.register(r1)     // Catch: java.lang.Throwable -> Lb
        Lb:
            return
    }

    private bf() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.tendcloud.tenddata.bf a() {
            com.tendcloud.tenddata.bf r0 = com.tendcloud.tenddata.bf.a
            if (r0 != 0) goto L17
            java.lang.Class<com.tendcloud.tenddata.bf> r0 = com.tendcloud.tenddata.bf.class
            monitor-enter(r0)
            com.tendcloud.tenddata.bf r1 = com.tendcloud.tenddata.bf.a     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            com.tendcloud.tenddata.bf r1 = new com.tendcloud.tenddata.bf     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            com.tendcloud.tenddata.bf.a = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L17:
            com.tendcloud.tenddata.bf r0 = com.tendcloud.tenddata.bf.a
            return r0
    }

    private java.util.Map<java.lang.String, java.lang.Object> a(java.util.Map<java.lang.String, java.lang.Object> r5) {
            r4 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            if (r5 == 0) goto L56
            int r1 = r5.size()     // Catch: java.lang.Throwable -> L56
            if (r1 != 0) goto Le
            return r0
        Le:
            r1 = 0
            java.util.Set r5 = r5.entrySet()     // Catch: java.lang.Throwable -> L56
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L56
        L17:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L56
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L56
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L56
            java.lang.Object r3 = r2.getValue()     // Catch: java.lang.Throwable -> L56
            boolean r3 = r3 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L37
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L56
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L56
        L33:
            r0.put(r3, r2)     // Catch: java.lang.Throwable -> L56
            goto L50
        L37:
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = com.tendcloud.tenddata.y.a(r3)     // Catch: java.lang.Throwable -> L56
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = com.tendcloud.tenddata.y.a(r2)     // Catch: java.lang.Throwable -> L56
            goto L33
        L50:
            int r1 = r1 + 1
            r2 = 50
            if (r1 != r2) goto L17
        L56:
            return r0
    }

    public final void onTDEBEventAppEvent(com.tendcloud.tenddata.zz.a r10) {
            r9 = this;
            java.lang.String r0 = "eventValue"
            java.lang.String r1 = "eventLabel"
            java.lang.String r2 = "value"
            if (r10 == 0) goto La8
            java.util.HashMap<java.lang.String, java.lang.Object> r3 = r10.paraMap     // Catch: java.lang.NumberFormatException -> La8
            if (r3 == 0) goto La8
            java.lang.String r4 = "apiType"
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.NumberFormatException -> La8
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.NumberFormatException -> La8
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> La8
            r4 = 2
            if (r3 == r4) goto L1f
            goto La8
        L1f:
            java.util.HashMap<java.lang.String, java.lang.Object> r3 = r10.paraMap     // Catch: java.lang.NumberFormatException -> La8
            java.lang.String r4 = "service"
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.NumberFormatException -> La8
            com.tendcloud.tenddata.a r3 = (com.tendcloud.tenddata.a) r3     // Catch: java.lang.NumberFormatException -> La8
            java.util.TreeMap r4 = new java.util.TreeMap     // Catch: java.lang.NumberFormatException -> La8
            r4.<init>()     // Catch: java.lang.NumberFormatException -> La8
            java.util.HashMap<java.lang.String, java.lang.Object> r5 = r10.paraMap     // Catch: java.lang.NumberFormatException -> La8
            java.lang.String r6 = "eventId"
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.NumberFormatException -> La8
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.NumberFormatException -> La8
            java.util.HashMap<java.lang.String, java.lang.Object> r6 = r10.paraMap     // Catch: java.lang.NumberFormatException -> La8
            java.lang.Object r6 = r6.get(r2)     // Catch: java.lang.NumberFormatException -> La8
            java.util.Map<java.lang.String, java.lang.Object> r7 = com.tendcloud.tenddata.ab.d     // Catch: java.lang.NumberFormatException -> La8
            int r8 = r7.size()     // Catch: java.lang.NumberFormatException -> La8
            if (r8 <= 0) goto L4b
            r4.putAll(r7)     // Catch: java.lang.NumberFormatException -> La8
        L4b:
            java.util.HashMap<java.lang.String, java.lang.Object> r7 = r10.paraMap     // Catch: java.lang.NumberFormatException -> La8
            java.lang.String r8 = "map"
            java.lang.Object r7 = r7.get(r8)     // Catch: java.lang.NumberFormatException -> La8
            if (r7 == 0) goto L5e
            boolean r8 = r7 instanceof java.util.Map     // Catch: java.lang.NumberFormatException -> La8
            if (r8 == 0) goto L5e
            java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.NumberFormatException -> La8
            r4.putAll(r7)     // Catch: java.lang.NumberFormatException -> La8
        L5e:
            com.tendcloud.tenddata.bv r7 = new com.tendcloud.tenddata.bv     // Catch: java.lang.NumberFormatException -> La8
            r7.<init>()     // Catch: java.lang.NumberFormatException -> La8
            java.lang.String r8 = "appEvent"
            r7.b = r8     // Catch: java.lang.NumberFormatException -> La8
            r7.c = r5     // Catch: java.lang.NumberFormatException -> La8
            r7.a = r3     // Catch: java.lang.NumberFormatException -> La8
            java.util.TreeMap r3 = new java.util.TreeMap     // Catch: java.lang.NumberFormatException -> La8
            r3.<init>()     // Catch: java.lang.NumberFormatException -> La8
            java.util.HashMap<java.lang.String, java.lang.Object> r5 = r10.paraMap     // Catch: java.lang.NumberFormatException -> La8
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.NumberFormatException -> La8
            if (r5 == 0) goto L7f
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.NumberFormatException -> La8
            r3.put(r1, r5)     // Catch: java.lang.NumberFormatException -> La8
        L7f:
            java.util.Map r1 = r9.a(r4)     // Catch: java.lang.NumberFormatException -> La8
            java.lang.String r4 = "eventParam"
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.NumberFormatException -> La8
            r5.<init>(r1)     // Catch: java.lang.NumberFormatException -> La8
            r3.put(r4, r5)     // Catch: java.lang.NumberFormatException -> La8
            boolean r1 = r6 instanceof java.lang.Double     // Catch: java.lang.NumberFormatException -> La8
            if (r1 == 0) goto L94
            r3.put(r2, r6)     // Catch: java.lang.NumberFormatException -> La8
        L94:
            java.util.HashMap<java.lang.String, java.lang.Object> r10 = r10.paraMap     // Catch: java.lang.NumberFormatException -> La8
            java.lang.Object r10 = r10.get(r0)     // Catch: java.lang.NumberFormatException -> La8
            if (r10 == 0) goto L9f
            r3.put(r0, r10)     // Catch: java.lang.NumberFormatException -> La8
        L9f:
            r7.d = r3     // Catch: java.lang.NumberFormatException -> La8
            com.tendcloud.tenddata.z r10 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.NumberFormatException -> La8
            r10.post(r7)     // Catch: java.lang.NumberFormatException -> La8
        La8:
            return
    }
}
