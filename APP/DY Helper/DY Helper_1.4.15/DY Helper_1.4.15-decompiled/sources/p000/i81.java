package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class i81 {

    /* JADX INFO: renamed from: α */
    public static volatile boolean f4958;

    /* JADX INFO: renamed from: Α */
    public static void m2648(android.content.Context r2) {
            r2.getClass()
            java.lang.String r0 = "该功能仅限内测用户使用，请先完成内测验证"
            r1 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r0, r1)
            r2.show()
            return
    }

    /* JADX INFO: renamed from: Β */
    public static final void m2649(java.lang.Object r1) {
            boolean r0 = r1 instanceof p000.eo1
            if (r0 != 0) goto L5
            return
        L5:
            eo1 r1 = (p000.eo1) r1
            java.lang.Throwable r1 = r1.f3622
            throw r1
    }

    /* JADX INFO: renamed from: Γ */
    public static org.json.JSONObject m2650(java.lang.Object r2) {
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
            zw0 r2 = m2651(r2)     // Catch: java.lang.Throwable -> L18
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

    /* JADX INFO: renamed from: Δ */
    public static p000.zw0 m2651(java.util.Map r3) {
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

    /* JADX INFO: renamed from: α */
    public static final java.lang.Object[] m2652(java.lang.Object[] r3, int r4, java.lang.Object r5, java.lang.Object r6) {
            int r0 = r3.length
            int r0 = r0 + 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2 = 6
            p000.AbstractC0312g7.m2240(r3, r0, r1, r4, r2)
            int r1 = r4 + 2
            int r2 = r3.length
            p000.AbstractC0312g7.m2238(r3, r0, r1, r4, r2)
            r0[r4] = r5
            int r4 = r4 + 1
            r0[r4] = r6
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static final java.lang.Object[] m2653(int r3, java.lang.Object[] r4) {
            int r0 = r4.length
            int r0 = r0 + (-2)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2 = 6
            p000.AbstractC0312g7.m2240(r4, r0, r1, r3, r2)
            int r1 = r3 + 2
            int r2 = r4.length
            p000.AbstractC0312g7.m2238(r4, r0, r3, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static final java.lang.Object[] m2654(int r3, java.lang.Object[] r4) {
            int r0 = r4.length
            int r0 = r0 + (-1)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2 = 6
            p000.AbstractC0312g7.m2240(r4, r0, r1, r3, r2)
            int r1 = r3 + 1
            int r2 = r4.length
            p000.AbstractC0312g7.m2238(r4, r0, r3, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static final void m2655(p000.b21 r4, java.lang.Object r5, java.lang.Object r6) {
            int r0 = r4.m694(r5)
            if (r0 >= 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            if (r1 == 0) goto Ld
            r2 = 0
            goto L11
        Ld:
            java.lang.Object[] r2 = r4.f1429
            r2 = r2[r0]
        L11:
            if (r2 != 0) goto L14
            goto L2f
        L14:
            boolean r3 = r2 instanceof p000.c21
            if (r3 == 0) goto L1f
            r3 = r2
            c21 r3 = (p000.c21) r3
            r3.m1107(r6)
            goto L2e
        L1f:
            if (r2 == r6) goto L2e
            c21 r3 = new c21
            r3.<init>()
            r3.m1107(r2)
            r3.m1107(r6)
            r6 = r3
            goto L2f
        L2e:
            r6 = r2
        L2f:
            if (r1 == 0) goto L3b
            int r0 = ~r0
            java.lang.Object[] r1 = r4.f1428
            r1[r0] = r5
            java.lang.Object[] r4 = r4.f1429
            r4[r0] = r6
            return
        L3b:
            java.lang.Object[] r4 = r4.f1429
            r4[r0] = r6
            return
    }

    /* JADX INFO: renamed from: ε */
    public static void m2656(java.lang.StringBuilder r0, java.lang.Object r1, p000.a80 r2) {
            if (r2 == 0) goto Lc
            java.lang.Object r1 = r2.invoke(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.append(r1)
            return
        Lc:
            if (r1 != 0) goto L10
            r2 = 1
            goto L12
        L10:
            boolean r2 = r1 instanceof java.lang.CharSequence
        L12:
            if (r2 == 0) goto L1a
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.append(r1)
            return
        L1a:
            boolean r2 = r1 instanceof java.lang.Character
            if (r2 == 0) goto L28
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
            r0.append(r1)
            return
        L28:
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static final int m2657(long r5, long[] r7) {
            int r0 = r7.length
            int r0 = r0 + (-1)
            r1 = 0
        L4:
            if (r1 > r0) goto L19
            int r2 = r1 + r0
            int r2 = r2 >>> 1
            r3 = r7[r2]
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L13
            int r1 = r2 + 1
            goto L4
        L13:
            if (r3 >= 0) goto L18
            int r0 = r2 + (-1)
            goto L4
        L18:
            return r2
        L19:
            int r1 = r1 + 1
            int r5 = -r1
            return r5
    }

    /* JADX INFO: renamed from: η */
    public static int m2658(org.json.JSONObject r5, boolean r6) {
            r0 = 0
            org.json.JSONObject r1 = m2666(r0, r5)
            java.lang.String r2 = "code"
            boolean r3 = r5.has(r2)
            r4 = -1
            if (r3 == 0) goto L13
            int r5 = r5.optInt(r2, r4)
            return r5
        L13:
            java.lang.String r2 = "status_code"
            boolean r3 = r5.has(r2)
            if (r3 == 0) goto L20
            int r5 = r5.optInt(r2, r4)
            return r5
        L20:
            if (r1 == 0) goto L2e
            boolean r5 = r1.has(r2)
            r3 = 1
            if (r5 != r3) goto L2e
            int r5 = r1.optInt(r2, r4)
            return r5
        L2e:
            if (r6 == 0) goto L31
            return r0
        L31:
            return r4
    }

    /* JADX INFO: renamed from: θ */
    public static java.lang.String m2659(org.json.JSONObject r4) {
            r0 = 0
            org.json.JSONObject r0 = m2666(r0, r4)
            java.lang.String r1 = "message"
            java.lang.String r1 = r4.optString(r1)
            java.lang.String r2 = "msg"
            java.lang.String r2 = r4.optString(r2)
            java.lang.String r3 = "status_msg"
            java.lang.String r4 = r4.optString(r3)
            if (r0 == 0) goto L20
            java.lang.String r3 = "status_message"
            java.lang.String r0 = r0.optString(r3)
            goto L21
        L20:
            r0 = 0
        L21:
            java.lang.String[] r4 = new java.lang.String[]{r1, r2, r4, r0}
            ss1 r4 = p000.AbstractC0312g7.m2232(r4)
            f71 r0 = new f71
            r1 = 8
            r0.<init>(r1)
            y30 r4 = p000.us1.m5943(r4, r0)
            java.lang.Object r4 = p000.us1.m5953(r4)
            java.lang.String r4 = (java.lang.String) r4
            return r4
    }

    /* JADX INFO: renamed from: ι */
    public static p000.b21 m2660() {
            long[] r0 = p000.tq1.f10431
            b21 r0 = new b21
            r0.<init>()
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public static final p000.eo1 m2661(java.lang.Throwable r1) {
            r1.getClass()
            eo1 r0 = new eo1
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public static p000.rf1 m2662(android.app.Activity r3, p000.ky1 r4) {
            java.util.concurrent.atomic.AtomicReference r0 = p000.ry1.f9578
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L13
            java.lang.Class r0 = r0.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            if (r0 == 0) goto L13
            goto L1b
        L13:
            java.lang.Class r3 = r3.getClass()
            java.lang.ClassLoader r0 = r3.getClassLoader()
        L1b:
            xn0 r3 = p000.xn0.f12242
            r0.getClass()
            long r1 = r4.f6323
            rf1 r3 = r3.m6760(r0, r1)
            java.lang.Object r4 = r3.f9362
            gg1 r4 = (p000.gg1) r4
            boolean r0 = r3.m5085()
            if (r0 == 0) goto L61
            if (r4 != 0) goto L33
            goto L61
        L33:
            int r0 = r4.f4365
            if (r0 != 0) goto L38
            return r3
        L38:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.f4366
            if (r4 != 0) goto L40
            java.lang.String r4 = ""
        L40:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "任务列表业务失败 "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ": "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r3.<init>(r4)
            rf1 r4 = new rf1
            r0 = 0
            r1 = 1
            r4.<init>(r0, r3, r1)
            return r4
        L61:
            return r3
    }

    /* JADX INFO: renamed from: μ */
    public static java.lang.Object m2663(java.lang.ClassLoader r6, p000.vc1 r7) {
            java.lang.String r0 = "GET"
            java.lang.String r1 = "https://vassets-backend.douyin.com/gameplay/farm/get_farm_info"
            kz r2 = p000.C0493kz.f6332     // Catch: java.lang.Throwable -> L27
            za1 r6 = m2675(r6, r7, r0, r1, r2)     // Catch: java.lang.Throwable -> L27
            org.json.JSONObject r7 = r6.f13020     // Catch: java.lang.Throwable -> L27
            zd1 r5 = p000.xn0.m6744(r7)     // Catch: java.lang.Throwable -> L27
            ab1 r0 = new ab1     // Catch: java.lang.Throwable -> L27
            int r1 = r6.f13018     // Catch: java.lang.Throwable -> L27
            java.lang.Integer r2 = r6.f13019     // Catch: java.lang.Throwable -> L27
            if (r5 == 0) goto L1a
            r6 = 1
            goto L1b
        L1a:
            r6 = 0
        L1b:
            int r3 = m2658(r7, r6)     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = m2659(r7)     // Catch: java.lang.Throwable -> L27
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L27
            return r0
        L27:
            r0 = move-exception
            r6 = r0
            eo1 r7 = new eo1
            r7.<init>(r6)
            return r7
    }

    /* JADX INFO: renamed from: ν */
    public static p000.gk1 m2664(p000.ce0 r11, java.lang.Object r12) {
            java.lang.reflect.Constructor r0 = r11.f2087
            r1 = 0
            if (r12 == 0) goto Lae
            java.lang.Class r2 = r0.getDeclaringClass()
            boolean r2 = r2.isInstance(r12)
            if (r2 != 0) goto L11
            goto Lae
        L11:
            java.lang.reflect.Field r2 = r11.f2084
            java.lang.Object r2 = r2.get(r12)
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L1e
            java.util.List r2 = (java.util.List) r2
            goto L1f
        L1e:
            r2 = r1
        L1f:
            if (r2 != 0) goto L23
            goto Lae
        L23:
            td0 r3 = p000.vd0.m6178(r2)
            boolean r4 = r3.f10322
            if (r4 != 0) goto L2d
            goto Lae
        L2d:
            java.util.ArrayList r4 = r3.f10321
            boolean r3 = r3.f10323
            if (r3 != 0) goto L35
            goto Lae
        L35:
            java.lang.reflect.Field r3 = r11.f2085
            boolean r12 = r3.getBoolean(r12)
            java.lang.Class[] r3 = r0.getParameterTypes()
            r3.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r3.length
            r5.<init>(r6)
            int r6 = r3.length
            r7 = 0
            r8 = r7
        L4b:
            if (r8 >= r6) goto L8c
            r9 = r3[r8]
            java.lang.Class<java.util.List> r10 = java.util.List.class
            boolean r10 = r10.isAssignableFrom(r9)
            if (r10 == 0) goto L5d
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r4)
            goto L77
        L5d:
            java.lang.Class r10 = java.lang.Boolean.TYPE
            boolean r10 = p000.ln0.m3626(r9, r10)
            if (r10 == 0) goto L6a
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r12)
            goto L77
        L6a:
            java.lang.reflect.Field r10 = r11.f2086
            java.lang.Class r10 = r10.getType()
            boolean r10 = p000.ln0.m3626(r9, r10)
            if (r10 == 0) goto L7d
            r9 = r1
        L77:
            r5.add(r9)
            int r8 = r8 + 1
            goto L4b
        L7d:
            java.lang.String r11 = r9.getName()
            java.lang.String r12 = "快捷分享状态构造参数结构已变化: "
            java.lang.String r11 = r12.concat(r11)
            p000.C1080.m7279(r11)
            r11 = 0
            return r11
        L8c:
            java.io.Serializable[] r11 = new java.io.Serializable[r7]
            java.lang.Object[] r11 = r5.toArray(r11)
            java.io.Serializable[] r11 = (java.io.Serializable[]) r11
            int r12 = r11.length
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r12)
            java.lang.Object r11 = r0.newInstance(r11)
            gk1 r12 = new gk1
            r11.getClass()
            int r0 = r2.size()
            int r1 = r4.size()
            r12.<init>(r0, r1, r11)
            return r12
        Lae:
            return r1
    }

    /* JADX INFO: renamed from: ξ */
    public static final java.lang.Boolean m2665(int r4, java.lang.Object r5) {
            if (r5 == 0) goto La0
            java.lang.Object r0 = org.json.JSONObject.NULL
            if (r5 == r0) goto La0
            r0 = 5
            if (r4 <= r0) goto Lb
            goto La0
        Lb:
            boolean r0 = r5 instanceof org.json.JSONObject
            r1 = 0
            if (r0 == 0) goto L7c
            r0 = r5
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.String r2 = "success"
            java.lang.Object r2 = r0.opt(r2)
            boolean r3 = r2 instanceof java.lang.Boolean
            if (r3 == 0) goto L20
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            return r2
        L20:
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L32
            java.lang.Number r2 = (java.lang.Number) r2
            int r4 = r2.intValue()
            if (r4 == 0) goto L2d
            r1 = 1
        L2d:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            return r4
        L32:
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L60
            java.lang.String r4 = "1"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L5d
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "true"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L4a
            goto L5d
        L4a:
            java.lang.String r5 = "0"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L5a
            java.lang.String r5 = "false"
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto La0
        L5a:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L5d:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L60:
            java.util.Iterator r0 = r0.keys()
            r0.getClass()
            ss1 r0 = p000.us1.m5951(r0)
            ya1 r1 = new ya1
            r2 = 0
            r1.<init>(r4, r2, r5)
            y30 r4 = p000.us1.m5943(r0, r1)
            java.lang.Object r4 = p000.us1.m5953(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            return r4
        L7c:
            boolean r0 = r5 instanceof org.json.JSONArray
            if (r0 == 0) goto La0
            r0 = r5
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            int r0 = r0.length()
            xm0 r0 = p000.j81.m2893(r1, r0)
            f7 r0 = p000.AbstractC0984xh.m6661(r0)
            ya1 r1 = new ya1
            r2 = 1
            r1.<init>(r4, r2, r5)
            y30 r4 = p000.us1.m5943(r0, r1)
            java.lang.Object r4 = p000.us1.m5953(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            return r4
        La0:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ο */
    public static final org.json.JSONObject m2666(int r3, java.lang.Object r4) {
            r0 = 0
            if (r4 == 0) goto L7d
            java.lang.Object r1 = org.json.JSONObject.NULL
            if (r4 == r1) goto L7d
            r1 = 5
            if (r3 <= r1) goto Lb
            goto L7d
        Lb:
            boolean r1 = r4 instanceof org.json.JSONObject
            if (r1 == 0) goto L37
            r0 = r4
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.String r1 = "base_resp"
            org.json.JSONObject r1 = r0.optJSONObject(r1)
            if (r1 != 0) goto L36
            java.util.Iterator r0 = r0.keys()
            r0.getClass()
            ss1 r0 = p000.us1.m5951(r0)
            ya1 r1 = new ya1
            r2 = 2
            r1.<init>(r3, r2, r4)
            y30 r3 = p000.us1.m5943(r0, r1)
            java.lang.Object r3 = p000.us1.m5953(r3)
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            return r3
        L36:
            return r1
        L37:
            boolean r1 = r4 instanceof org.json.JSONArray
            if (r1 == 0) goto L5c
            r0 = r4
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            int r0 = r0.length()
            r1 = 0
            xm0 r0 = p000.j81.m2893(r1, r0)
            f7 r0 = p000.AbstractC0984xh.m6661(r0)
            ya1 r1 = new ya1
            r2 = 3
            r1.<init>(r3, r2, r4)
            y30 r3 = p000.us1.m5943(r0, r1)
            java.lang.Object r3 = p000.us1.m5953(r3)
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            return r3
        L5c:
            boolean r1 = r4 instanceof java.lang.String
            if (r1 == 0) goto L7d
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L68
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L68
            goto L6e
        L68:
            r4 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r4)
        L6e:
            boolean r4 = r1 instanceof p000.eo1
            if (r4 == 0) goto L73
            r1 = r0
        L73:
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            if (r1 == 0) goto L7d
            int r3 = r3 + 1
            org.json.JSONObject r0 = m2666(r3, r1)
        L7d:
            return r0
    }

    /* JADX INFO: renamed from: π */
    public static final boolean m2667(java.lang.Object r5, int r6, java.util.Set r7) {
            r0 = 0
            if (r5 == 0) goto Lbb
            java.lang.Object r1 = org.json.JSONObject.NULL
            if (r5 == r1) goto Lbb
            r1 = 5
            if (r6 <= r1) goto Lc
            goto Lbb
        Lc:
            boolean r1 = r5 instanceof org.json.JSONObject
            r2 = 1
            if (r1 == 0) goto L63
            r1 = r7
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            boolean r3 = r1 instanceof java.util.Collection
            if (r3 == 0) goto L24
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L24
            goto L3b
        L24:
            java.util.Iterator r1 = r1.iterator()
        L28:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r5.has(r3)
            if (r3 == 0) goto L28
            goto L9a
        L3b:
            java.util.Iterator r1 = r5.keys()
            r1.getClass()
            ss1 r1 = p000.us1.m5951(r1)
            java.util.Iterator r1 = r1.iterator()
        L4a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lbb
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r5.opt(r3)
            int r4 = r6 + 1
            boolean r3 = m2667(r3, r4, r7)
            if (r3 == 0) goto L4a
            goto L9a
        L63:
            boolean r1 = r5 instanceof org.json.JSONArray
            if (r1 == 0) goto L9b
            org.json.JSONArray r5 = (org.json.JSONArray) r5
            int r1 = r5.length()
            xm0 r1 = p000.j81.m2893(r0, r1)
            boolean r3 = r1 instanceof java.util.Collection
            if (r3 == 0) goto L7f
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L7f
            goto Lbb
        L7f:
            java.util.Iterator r1 = r1.iterator()
        L83:
            r3 = r1
            wm0 r3 = (p000.wm0) r3
            boolean r4 = r3.f11765
            if (r4 == 0) goto Lbb
            int r3 = r3.nextInt()
            java.lang.Object r3 = r5.opt(r3)
            int r4 = r6 + 1
            boolean r3 = m2667(r3, r4, r7)
            if (r3 == 0) goto L83
        L9a:
            return r2
        L9b:
            boolean r1 = r5 instanceof java.lang.String
            if (r1 == 0) goto Lbb
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La7
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> La7
            r1.<init>(r5)     // Catch: java.lang.Throwable -> La7
            goto Lad
        La7:
            r5 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r5)
        Lad:
            boolean r5 = r1 instanceof p000.eo1
            if (r5 == 0) goto Lb2
            r1 = 0
        Lb2:
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            if (r1 == 0) goto Lbb
            int r6 = r6 + r2
            boolean r0 = m2667(r1, r6, r7)
        Lbb:
            return r0
    }

    /* JADX INFO: renamed from: ρ */
    public static final int m2668(int r0, int r1) {
            int r0 = r0 >> r1
            r0 = r0 & 31
            return r0
    }

    /* JADX INFO: renamed from: σ */
    public static final int m2669(int r0, int r1) {
            int r0 = r0 >> r1
            r0 = r0 & 31
            return r0
    }

    /* JADX INFO: renamed from: τ */
    public static boolean m2670(android.content.Context r3) {
            if (r3 == 0) goto L4d
            boolean r0 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto Lb
            p000.ui1.m5896(r3)     // Catch: java.lang.Throwable -> L52
        Lb:
            java.lang.String r0 = p000.ui1.m5890()     // Catch: java.lang.Throwable -> L52
            java.lang.CharSequence r0 = p000.q02.m4660(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L52
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.AbstractC0976x9.f12071     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = p000.AbstractC0976x9.f12078     // Catch: java.lang.Throwable -> L52
            java.lang.CharSequence r1 = p000.q02.m4660(r1)     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L52
            boolean r2 = p000.q02.m4671(r1)     // Catch: java.lang.Throwable -> L52
            if (r2 != 0) goto L35
            boolean r2 = p000.q02.m4671(r0)     // Catch: java.lang.Throwable -> L52
            if (r2 != 0) goto L4d
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto L4d
        L35:
            boolean r0 = p000.i81.f4958     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L3a
            goto L4d
        L3a:
            r0 = 1
            p000.i81.f4958 = r0     // Catch: java.lang.Throwable -> L52
            java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> L52
            r4 r1 = new r4     // Catch: java.lang.Throwable -> L52
            r2 = 3
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = "DY-Settings-BetaWarmup"
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L52
            r0.start()     // Catch: java.lang.Throwable -> L52
        L4d:
            boolean r3 = p000.AbstractC0976x9.m6532()     // Catch: java.lang.Throwable -> L52
            return r3
        L52:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            java.lang.String r0 = "检查内测状态失败: "
            java.lang.String r3 = p000.lz1.m3687(r0, r3)
            r0 = 4
            java.lang.String r1 = "DYHelper"
            r2 = 0
            p000.C0888ux.m5988(r1, r3, r2, r0, r2)
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: υ */
    public static p000.kc1 m2671(p000.za1 r17) {
            r0 = r17
            org.json.JSONObject r1 = r0.f13020
            r2 = 0
            java.lang.Boolean r8 = m2665(r2, r1)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r3 = p000.ln0.m3626(r8, r3)
            if (r3 != 0) goto L2f
            java.lang.String r15 = "item_list"
            java.lang.String r16 = "saved_time"
            java.lang.String r9 = "decorate"
            java.lang.String r10 = "decorate_list"
            java.lang.String r11 = "bag_info"
            java.lang.String r12 = "camp_exp"
            java.lang.String r13 = "currency_info"
            java.lang.String r14 = "changed_item_list"
            java.lang.String[] r3 = new java.lang.String[]{r9, r10, r11, r12, r13, r14, r15, r16}
            java.util.Set r3 = p000.AbstractC0312g7.m2263(r3)
            boolean r3 = m2667(r1, r2, r3)
            if (r3 == 0) goto L30
        L2f:
            r2 = 1
        L30:
            kc1 r3 = new kc1
            int r4 = r0.f13018
            java.lang.Integer r5 = r0.f13019
            int r6 = m2658(r1, r2)
            java.lang.String r7 = m2659(r1)
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
    }

    /* JADX INFO: renamed from: φ */
    public static final java.lang.String m2672(java.io.Reader r4) {
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            r1 = 8192(0x2000, float:1.148E-41)
            char[] r1 = new char[r1]
            int r2 = r4.read(r1)
        Ld:
            if (r2 < 0) goto L18
            r3 = 0
            r0.write(r1, r3, r2)
            int r2 = r4.read(r1)
            goto Ld
        L18:
            java.lang.String r4 = r0.toString()
            r4.getClass()
            return r4
    }

    /* JADX INFO: renamed from: χ */
    public static final boolean m2673(p000.b21 r3, java.lang.Object r4, java.lang.Object r5) {
            java.lang.Object r0 = r3.m695(r4)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r0 instanceof p000.c21
            if (r2 == 0) goto L1e
            c21 r0 = (p000.c21) r0
            boolean r5 = r0.m1117(r5)
            if (r5 == 0) goto L1d
            boolean r0 = r0.m1113()
            if (r0 == 0) goto L1d
            r3.m699(r4)
        L1d:
            return r5
        L1e:
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L29
            r3.m699(r4)
            r3 = 1
            return r3
        L29:
            return r1
    }

    /* JADX INFO: renamed from: ψ */
    public static final void m2674(p000.b21 r13, java.lang.Object r14) {
            long[] r0 = r13.f1427
            int r1 = r0.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L5c
            r2 = 0
            r3 = r2
        L9:
            r4 = r0[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L57
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L23:
            if (r8 >= r6) goto L55
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L51
            int r9 = r3 << 3
            int r9 = r9 + r8
            java.lang.Object[] r10 = r13.f1428
            r10 = r10[r9]
            java.lang.Object[] r10 = r13.f1429
            r10 = r10[r9]
            boolean r11 = r10 instanceof p000.c21
            if (r11 == 0) goto L47
            c21 r10 = (p000.c21) r10
            r10.m1117(r14)
            boolean r10 = r10.m1113()
            goto L4c
        L47:
            if (r10 != r14) goto L4b
            r10 = 1
            goto L4c
        L4b:
            r10 = r2
        L4c:
            if (r10 == 0) goto L51
            r13.m700(r9)
        L51:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L23
        L55:
            if (r6 != r7) goto L5c
        L57:
            if (r3 == r1) goto L5c
            int r3 = r3 + 1
            goto L9
        L5c:
            return
    }

    /* JADX INFO: renamed from: ω */
    public static p000.za1 m2675(java.lang.ClassLoader r9, p000.vc1 r10, java.lang.String r11, java.lang.String r12, java.util.Map r13) {
            java.lang.String r0 = r10.f11231
            uc1 r1 = r10.f11232
            java.util.Map r7 = r10.f11233
            boolean r0 = p000.q02.m4671(r0)
            if (r0 != 0) goto L134
            java.lang.String r0 = "Agw-Js-Conv"
            java.lang.Object r0 = r7.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L12d
            boolean r0 = p000.q02.m4671(r0)
            if (r0 != 0) goto L12d
            uc1 r0 = p000.uc1.f10693
            if (r1 != r0) goto L38
            java.lang.String r0 = "X-Hamlet-Is-Unity"
            java.lang.Object r0 = r7.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L31
            boolean r0 = p000.q02.m4671(r0)
            if (r0 != 0) goto L31
            goto L38
        L31:
            java.lang.String r9 = "sec_pet_id 鉴权缺少 X-Hamlet-Is-Unity 请求头"
            p000.C1080.m7275(r9)
        L36:
            r9 = 0
            return r9
        L38:
            int r0 = r1.f10695
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            l91 r2 = new l91
            java.lang.String r3 = "client_type"
            r2.<init>(r3, r0)
            java.lang.String r0 = r1.f10696
            java.lang.String r1 = r10.f11231
            l91 r3 = new l91
            r3.<init>(r0, r1)
            l91[] r0 = new p000.l91[]{r2, r3}
            java.util.LinkedHashMap r6 = p000.ex0.m1969(r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r13)
            r0.putAll(r6)
            java.util.concurrent.ConcurrentHashMap r13 = p000.bd1.f1665
            java.lang.String r1 = r10.m6173()
            r13.put(r1, r10)
            java.lang.String r1 = "GET"
            boolean r1 = r11.equals(r1)     // Catch: java.lang.Throwable -> L123
            kz r8 = p000.C0493kz.f6332
            if (r1 == 0) goto L76
            r5 = r8
        L72:
            r2 = r9
            r3 = r11
            r4 = r12
            goto L78
        L76:
            r5 = r0
            goto L72
        L78:
            rf1 r9 = p000.xn0.m6754(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L123
            java.lang.String r11 = r10.m6173()
            r13.remove(r11, r10)
            boolean r10 = r9.m5085()
            if (r10 != 0) goto L95
            java.lang.Throwable r9 = r9.f9363
            if (r9 != 0) goto L94
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "营地宿主请求失败"
            r9.<init>(r10)
        L94:
            throw r9
        L95:
            java.lang.Object r9 = r9.f9362
            java.util.Map r9 = (java.util.Map) r9
            if (r9 == 0) goto L11c
            java.lang.String r10 = "data"
            java.lang.Object r10 = r9.get(r10)
            boolean r11 = r10 instanceof java.util.Map
            r12 = 0
            if (r11 == 0) goto La9
            java.util.Map r10 = (java.util.Map) r10
            goto Laa
        La9:
            r10 = r12
        Laa:
            if (r10 == 0) goto Lb1
            zw0 r10 = m2651(r10)
            goto Lb2
        Lb1:
            r10 = r12
        Lb2:
            if (r10 != 0) goto Lb5
            goto Lb6
        Lb5:
            r8 = r10
        Lb6:
            java.lang.String r10 = "response"
            java.lang.Object r10 = r8.get(r10)
            org.json.JSONObject r10 = m2650(r10)
            if (r10 != 0) goto Ld3
            java.lang.String r10 = "rawResponse"
            java.lang.Object r10 = r8.get(r10)
            org.json.JSONObject r10 = m2650(r10)
            if (r10 != 0) goto Ld3
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
        Ld3:
            za1 r11 = new za1
            java.lang.String r13 = "code"
            java.lang.Object r9 = r9.get(r13)
            boolean r13 = r9 instanceof java.lang.Number
            if (r13 == 0) goto Le6
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            goto Lf8
        Le6:
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r13 = 10
            java.lang.Integer r9 = p000.x02.m6487(r9, r13)
            if (r9 == 0) goto Lf7
            int r9 = r9.intValue()
            goto Lf8
        Lf7:
            r9 = -1
        Lf8:
            java.lang.String r13 = "httpCode"
            java.lang.Object r13 = r8.get(r13)
            boolean r0 = r13 instanceof java.lang.Number
            if (r0 == 0) goto L10d
            java.lang.Number r13 = (java.lang.Number) r13
            int r12 = r13.intValue()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L118
        L10d:
            if (r13 != 0) goto L110
            goto L118
        L110:
            java.lang.String r12 = r13.toString()
            java.lang.Integer r12 = p000.x02.m6486(r12)
        L118:
            r11.<init>(r9, r12, r10)
            return r11
        L11c:
            java.lang.String r9 = "营地 Bridge 结果为空"
            p000.C1080.m7279(r9)
            goto L36
        L123:
            r0 = move-exception
            r9 = r0
            java.lang.String r11 = r10.m6173()
            r13.remove(r11, r10)
            throw r9
        L12d:
            java.lang.String r9 = "缺少 Agw-Js-Conv 请求头"
            p000.C1080.m7275(r9)
            goto L36
        L134:
            java.lang.String r9 = "缺少宿主营地身份"
            p000.C1080.m7275(r9)
            goto L36
    }
}
