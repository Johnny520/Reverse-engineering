package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class gf1 {

    /* JADX INFO: renamed from: α */
    public static final p000.gf1 f4355 = null;

    static {
            gf1 r0 = new gf1
            r0.<init>()
            p000.gf1.f4355 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.String m2301(java.lang.String r6) {
            r6.getClass()
            java.lang.CharSequence r6 = p000.q02.m4660(r6)
            java.lang.String r6 = r6.toString()
            r6.getClass()
            java.lang.CharSequence r0 = p000.q02.m4660(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "__smart__"
            boolean r0 = p000.ln0.m3626(r0, r1)
            r2 = 0
            if (r0 == 0) goto L21
            r6 = r1
            goto L3d
        L21:
            r0 = 10
            java.lang.Integer r6 = p000.x02.m6487(r6, r0)
            if (r6 == 0) goto L38
            int r0 = r6.intValue()
            if (r0 <= 0) goto L30
            goto L31
        L30:
            r6 = r2
        L31:
            if (r6 == 0) goto L38
            java.lang.String r6 = r6.toString()
            goto L39
        L38:
            r6 = r2
        L39:
            if (r6 != 0) goto L3d
            java.lang.String r6 = ""
        L3d:
            java.lang.CharSequence r0 = p000.q02.m4660(r6)
            java.lang.String r0 = r0.toString()
            boolean r0 = p000.ln0.m3626(r0, r1)
            java.lang.String r3 = "智能选择"
            if (r0 == 0) goto L4e
            return r3
        L4e:
            boolean r0 = p000.q02.m4671(r6)
            java.lang.String r4 = "未选择"
            if (r0 == 0) goto L57
            return r4
        L57:
            java.lang.CharSequence r0 = p000.q02.m4660(r6)
            java.lang.String r0 = r0.toString()
            r0.getClass()
            java.lang.CharSequence r5 = p000.q02.m4660(r0)
            java.lang.String r5 = r5.toString()
            boolean r1 = p000.ln0.m3626(r5, r1)
            if (r1 == 0) goto L71
            goto Lb9
        L71:
            ef1 r1 = m2303()
            java.util.List r1 = r1.f3533
            java.util.Iterator r1 = r1.iterator()
        L7b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L91
            java.lang.Object r3 = r1.next()
            r5 = r3
            df1 r5 = (p000.df1) r5
            java.lang.String r5 = r5.f3116
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L7b
            r2 = r3
        L91:
            df1 r2 = (p000.df1) r2
            if (r2 == 0) goto L98
            java.lang.String r3 = r2.f3117
            goto Lb9
        L98:
            java.lang.String r1 = "204"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto La3
            java.lang.String r3 = "辣条"
            goto Lb9
        La3:
            boolean r1 = p000.q02.m4671(r0)
            if (r1 == 0) goto Laa
            goto Lab
        Laa:
            r4 = r0
        Lab:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "食物 #"
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
        Lb9:
            java.lang.String r0 = " #"
            java.lang.String r6 = p000.lz1.m3688(r3, r0, r6)
            return r6
    }

    /* JADX INFO: renamed from: β */
    public static boolean m2302(p000.ky1 r6) {
            int r0 = r6.f6325
            r1 = 1
            if (r0 != r1) goto L1c
            java.lang.String r0 = r6.f6322
            boolean r0 = p000.q02.m4671(r0)
            if (r0 != 0) goto L1c
            long r2 = r6.f6323
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L1c
            long r2 = r6.f6324
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L1c
            return r1
        L1c:
            r6 = 0
            return r6
    }

    /* JADX INFO: renamed from: γ */
    public static p000.ef1 m2303() {
            boolean r0 = p000.ui1.m5867()
            jz r1 = p000.C0450jz.f5672
            r2 = 0
            if (r0 != 0) goto L10
            ef1 r0 = new ef1
            r0.<init>(r2, r1)
            return r0
        L10:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = "pet_elf_food_catalog_cache"
            java.lang.String r5 = "{}"
            java.lang.String r4 = p000.ui1.m5893(r4, r5)     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L1e
            goto L25
        L1e:
            r0 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        L25:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            boolean r5 = r0 instanceof p000.eo1
            if (r5 == 0) goto L2f
            r0 = r4
        L2f:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.String r4 = "foods"
            org.json.JSONArray r4 = r0.optJSONArray(r4)
            r5 = 0
            if (r4 == 0) goto Le7
            zt0 r6 = p000.AbstractC1021yh.m6893()
            int r7 = r4.length()
            r8 = 100
            if (r7 <= r8) goto L47
            r7 = r8
        L47:
            r8 = 0
        L48:
            if (r8 >= r7) goto Le3
            org.json.JSONObject r9 = r4.optJSONObject(r8)
            if (r9 != 0) goto L52
            goto Ldf
        L52:
            java.lang.String r10 = "id"
            java.lang.String r10 = r9.optString(r10)
            r10.getClass()
            java.lang.CharSequence r10 = p000.q02.m4660(r10)
            java.lang.String r10 = r10.toString()
            int r11 = r10.length()
            if (r11 <= 0) goto L6b
            r13 = r10
            goto L6c
        L6b:
            r13 = r5
        L6c:
            if (r13 != 0) goto L70
            goto Ldf
        L70:
            java.lang.String r10 = "name"
            java.lang.String r10 = r9.optString(r10)
            r10.getClass()
            java.lang.CharSequence r10 = p000.q02.m4660(r10)
            java.lang.String r10 = r10.toString()
            int r11 = r10.length()
            if (r11 <= 0) goto L89
            r14 = r10
            goto L8a
        L89:
            r14 = r5
        L8a:
            if (r14 != 0) goto L8d
            goto Ldf
        L8d:
            java.lang.String r10 = "price"
            java.lang.Integer r15 = m2304(r10, r9)
            java.lang.String r10 = "duration"
            java.lang.Integer r16 = m2304(r10, r9)
            java.lang.String r10 = "closeness"
            java.lang.Integer r17 = m2304(r10, r9)
            java.lang.String r10 = "icon"
            java.lang.String r10 = r9.optString(r10)
            r10.getClass()
            java.lang.CharSequence r10 = p000.q02.m4660(r10)
            java.lang.String r10 = r10.toString()
            int r11 = r10.length()
            if (r11 <= 0) goto Lb9
            r18 = r10
            goto Lbb
        Lb9:
            r18 = r5
        Lbb:
            java.lang.String r10 = "label"
            java.lang.String r9 = r9.optString(r10)
            r9.getClass()
            java.lang.CharSequence r9 = p000.q02.m4660(r9)
            java.lang.String r9 = r9.toString()
            int r10 = r9.length()
            if (r10 <= 0) goto Ld5
            r19 = r9
            goto Ld7
        Ld5:
            r19 = r5
        Ld7:
            df1 r12 = new df1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r6.add(r12)
        Ldf:
            int r8 = r8 + 1
            goto L48
        Le3:
            zt0 r5 = p000.AbstractC1021yh.m6883(r6)
        Le7:
            if (r5 != 0) goto Lea
            goto Leb
        Lea:
            r1 = r5
        Leb:
            ef1 r4 = new ef1
            java.lang.String r5 = "updated_at"
            long r5 = r0.optLong(r5, r2)
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto Lf8
            goto Lf9
        Lf8:
            r2 = r5
        Lf9:
            r4.<init>(r2, r1)
            return r4
    }

    /* JADX INFO: renamed from: δ */
    public static java.lang.Integer m2304(java.lang.String r1, org.json.JSONObject r2) {
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L2d
            boolean r0 = r2.isNull(r1)
            if (r0 == 0) goto Ld
            goto L2d
        Ld:
            java.lang.Object r1 = r2.opt(r1)
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto L20
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L20:
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L2d
            java.lang.String r1 = (java.lang.String) r1
            r2 = 10
            java.lang.Integer r1 = p000.x02.m6487(r1, r2)
            return r1
        L2d:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public static p000.ef1 m2305(java.util.List r10) {
            long r0 = java.lang.System.currentTimeMillis()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "updated_at"
            r2.put(r3, r0)
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.util.Iterator r4 = r10.iterator()
        L17:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L87
            java.lang.Object r5 = r4.next()
            df1 r5 = (p000.df1) r5
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r7 = "id"
            java.lang.String r8 = r5.f3116
            r6.put(r7, r8)
            java.lang.String r7 = "name"
            java.lang.String r8 = r5.f3117
            r6.put(r7, r8)
            java.lang.Integer r7 = r5.f3118
            if (r7 == 0) goto L43
            int r7 = r7.intValue()
            java.lang.String r8 = "price"
            r6.put(r8, r7)
        L43:
            java.lang.Integer r7 = r5.f3119
            if (r7 == 0) goto L50
            int r7 = r7.intValue()
            java.lang.String r8 = "duration"
            r6.put(r8, r7)
        L50:
            java.lang.Integer r7 = r5.f3120
            if (r7 == 0) goto L5d
            int r7 = r7.intValue()
            java.lang.String r8 = "closeness"
            r6.put(r8, r7)
        L5d:
            java.lang.String r7 = r5.f3121
            r8 = 0
            if (r7 == 0) goto L71
            boolean r9 = p000.q02.m4671(r7)
            if (r9 != 0) goto L69
            goto L6a
        L69:
            r7 = r8
        L6a:
            if (r7 == 0) goto L71
            java.lang.String r9 = "icon"
            r6.put(r9, r7)
        L71:
            java.lang.String r5 = r5.f3122
            if (r5 == 0) goto L83
            boolean r7 = p000.q02.m4671(r5)
            if (r7 != 0) goto L7c
            r8 = r5
        L7c:
            if (r8 == 0) goto L83
            java.lang.String r5 = "label"
            r6.put(r5, r8)
        L83:
            r3.put(r6)
            goto L17
        L87:
            java.lang.String r4 = "foods"
            r2.put(r4, r3)
            java.lang.Object r3 = p000.ui1.f10844
            java.lang.String r2 = r2.toString()
            r2.getClass()
            java.lang.String r3 = "pet_elf_food_catalog_cache"
            p000.ui1.m5875(r3, r2)
            ef1 r2 = new ef1
            r2.<init>(r0, r10)
            return r2
    }
}
