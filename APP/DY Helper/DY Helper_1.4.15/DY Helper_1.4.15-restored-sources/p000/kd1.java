package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class kd1 {

    /* JADX INFO: renamed from: α */
    public static final p000.kd1 f5861 = null;

    /* JADX INFO: renamed from: β */
    public static volatile java.util.List f5862;

    static {
            kd1 r0 = new kd1
            r0.<init>()
            p000.kd1.f5861 = r0
            return
    }

    /* JADX INFO: renamed from: β */
    public static java.util.List m3188(java.lang.String r27) {
            boolean r0 = p000.q02.m4671(r27)
            if (r0 == 0) goto L9
            jz r0 = p000.C0450jz.f5672
            return r0
        L9:
            org.json.JSONArray r0 = new org.json.JSONArray
            r1 = r27
            r0.<init>(r1)
            int r1 = r0.length()
            r2 = 0
            xm0 r1 = p000.j81.m2893(r2, r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L22:
            r4 = r1
            wm0 r4 = (p000.wm0) r4
            boolean r5 = r4.f11765
            if (r5 == 0) goto L101
            int r4 = r4.nextInt()
            org.json.JSONObject r4 = r0.optJSONObject(r4)
            r5 = 0
            if (r4 != 0) goto L36
            goto Lfa
        L36:
            java.lang.String r6 = "seed_id"
            java.lang.Object r6 = r4.opt(r6)
            java.lang.Integer r6 = m3198(r6)
            if (r6 == 0) goto L49
            int r7 = r6.intValue()
            if (r7 <= 0) goto L49
            goto L4a
        L49:
            r6 = r5
        L4a:
            if (r6 == 0) goto Lfa
            int r8 = r6.intValue()
            id1 r7 = new id1
            java.lang.String r5 = "name"
            java.lang.String r9 = m3193(r5, r4)
            java.lang.String r5 = "icon_url"
            java.lang.String r10 = m3193(r5, r4)
            java.lang.String r5 = "growth_time"
            java.lang.Object r5 = r4.opt(r5)
            java.lang.Integer r11 = m3198(r5)
            java.lang.String r5 = "price"
            java.lang.Object r5 = r4.opt(r5)
            java.lang.Integer r12 = m3198(r5)
            java.lang.String r5 = "income"
            java.lang.Object r5 = r4.opt(r5)
            java.lang.Integer r13 = m3198(r5)
            java.lang.String r5 = "experience"
            java.lang.Object r5 = r4.opt(r5)
            java.lang.Integer r14 = m3198(r5)
            java.lang.String r5 = "unlock_level"
            java.lang.Object r5 = r4.opt(r5)
            java.lang.Integer r15 = m3198(r5)
            java.lang.String r5 = "product_item_id"
            java.lang.Object r5 = r4.opt(r5)
            java.lang.Integer r16 = m3198(r5)
            java.lang.String r5 = "product_item_count"
            java.lang.Object r5 = r4.opt(r5)
            java.lang.Integer r17 = m3198(r5)
            java.lang.String r5 = "limit_count"
            java.lang.Object r5 = r4.opt(r5)
            java.lang.Integer r18 = m3198(r5)
            java.lang.String r5 = "item_tag"
            java.lang.String r19 = m3193(r5, r4)
            java.lang.String r5 = "weight"
            java.lang.Object r5 = r4.opt(r5)
            java.lang.Integer r20 = m3198(r5)
            java.lang.String r5 = "watering_time"
            java.lang.Object r5 = r4.opt(r5)
            java.lang.Integer r21 = m3198(r5)
            java.lang.String r5 = "watering_cd"
            java.lang.Object r5 = r4.opt(r5)
            java.lang.Integer r22 = m3198(r5)
            java.lang.String r5 = "active_from_epoch"
            java.lang.Object r5 = r4.opt(r5)
            java.lang.Long r23 = m3199(r5)
            java.lang.String r5 = "active_until_epoch"
            java.lang.Object r5 = r4.opt(r5)
            java.lang.Long r24 = m3199(r5)
            java.lang.String r5 = "limit_dimension"
            java.lang.Object r5 = r4.opt(r5)
            java.lang.Integer r25 = m3198(r5)
            java.lang.String r5 = "in_shop"
            boolean r26 = r4.optBoolean(r5, r2)
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r5 = r7
        Lfa:
            if (r5 == 0) goto L22
            r3.add(r5)
            goto L22
        L101:
            java.util.List r0 = m3197(r3)
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static boolean m3189(java.lang.String r3) {
            r0 = 63
            java.lang.String r3 = p000.q02.m4689(r3, r0, r3)
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 0
            r2 = 47
            r0[r1] = r2
            java.lang.String r3 = p000.q02.m4663(r3, r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r0)
            r3.getClass()
            java.lang.String r0 = "/config/v2/load"
            boolean r3 = p000.x02.m6479(r3, r0, r1)
            return r3
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.String m3190(java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.length()
            r2 = 0
        La:
            if (r2 >= r1) goto L1c
            char r3 = r5.charAt(r2)
            boolean r4 = java.lang.Character.isLetterOrDigit(r3)
            if (r4 == 0) goto L19
            r0.append(r3)
        L19:
            int r2 = r2 + 1
            goto La
        L1c:
            java.lang.String r5 = r0.toString()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r0)
            r5.getClass()
            return r5
    }

    /* JADX INFO: renamed from: η */
    public static java.lang.Object m3191(java.lang.String r4, org.json.JSONObject r5) {
            boolean r0 = r5.has(r4)
            if (r0 == 0) goto Lb
            java.lang.Object r4 = r5.opt(r4)
            return r4
        Lb:
            java.lang.String r4 = m3190(r4)
            java.util.Iterator r0 = r5.keys()
            r0.getClass()
            ss1 r0 = p000.us1.m5951(r0)
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            r3.getClass()
            java.lang.String r3 = m3190(r3)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L1e
            goto L3b
        L3a:
            r1 = r2
        L3b:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L44
            java.lang.Object r4 = r5.opt(r1)
            return r4
        L44:
            return r2
    }

    /* JADX INFO: renamed from: θ */
    public static java.lang.String m3192(java.lang.String r1, org.json.JSONObject r2) {
            java.lang.Object r1 = m3191(r1, r2)
            r2 = 0
            if (r1 == 0) goto L25
            java.lang.Object r0 = org.json.JSONObject.NULL
            if (r1 != r0) goto Lc
            r1 = r2
        Lc:
            if (r1 == 0) goto L25
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L25
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L25
            int r0 = r1.length()
            if (r0 <= 0) goto L25
            return r1
        L25:
            return r2
    }

    /* JADX INFO: renamed from: κ */
    public static java.lang.String m3193(java.lang.String r1, org.json.JSONObject r2) {
            java.lang.Object r1 = r2.opt(r1)
            r2 = 0
            if (r1 == 0) goto L25
            java.lang.Object r0 = org.json.JSONObject.NULL
            if (r1 != r0) goto Lc
            r1 = r2
        Lc:
            if (r1 == 0) goto L25
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L25
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L25
            int r0 = r1.length()
            if (r0 <= 0) goto L25
            return r1
        L25:
            return r2
    }

    /* JADX INFO: renamed from: λ */
    public static java.lang.Object m3194(java.lang.String r3) {
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            int r0 = r3.length()
            r1 = 2
            r2 = 0
            if (r0 >= r1) goto L11
            goto L54
        L11:
            r0 = 123(0x7b, float:1.72E-43)
            boolean r0 = p000.q02.m4684(r3, r0)
            if (r0 == 0) goto L34
            r0 = 125(0x7d, float:1.75E-43)
            boolean r0 = p000.q02.m4657(r3, r0)
            if (r0 == 0) goto L34
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L27
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L27
            goto L2d
        L27:
            r3 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r3)
        L2d:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L32
            goto L54
        L32:
            r2 = r0
            goto L54
        L34:
            r0 = 91
            boolean r0 = p000.q02.m4684(r3, r0)
            if (r0 == 0) goto L54
            r0 = 93
            boolean r0 = p000.q02.m4657(r3, r0)
            if (r0 == 0) goto L54
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L4a
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L4a
            goto L50
        L4a:
            r3 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r3)
        L50:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L32
        L54:
            return r2
    }

    /* JADX INFO: renamed from: μ */
    public static void m3195(java.util.List r5) {
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L7
            return
        L7:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.List r5 = m3197(r5)
            java.util.Iterator r5 = r5.iterator()
        L14:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto Laf
            java.lang.Object r1 = r5.next()
            id1 r1 = (p000.id1) r1
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "seed_id"
            int r4 = r1.f5015
            r2.put(r3, r4)
            java.lang.String r3 = "name"
            java.lang.String r4 = r1.f5016
            m3196(r2, r3, r4)
            java.lang.String r3 = "icon_url"
            java.lang.String r4 = r1.f5017
            m3196(r2, r3, r4)
            java.lang.String r3 = "growth_time"
            java.lang.Integer r4 = r1.f5018
            m3196(r2, r3, r4)
            java.lang.String r3 = "price"
            java.lang.Integer r4 = r1.f5019
            m3196(r2, r3, r4)
            java.lang.String r3 = "income"
            java.lang.Integer r4 = r1.f5020
            m3196(r2, r3, r4)
            java.lang.String r3 = "experience"
            java.lang.Integer r4 = r1.f5021
            m3196(r2, r3, r4)
            java.lang.String r3 = "unlock_level"
            java.lang.Integer r4 = r1.f5022
            m3196(r2, r3, r4)
            java.lang.String r3 = "product_item_id"
            java.lang.Integer r4 = r1.f5023
            m3196(r2, r3, r4)
            java.lang.String r3 = "product_item_count"
            java.lang.Integer r4 = r1.f5024
            m3196(r2, r3, r4)
            java.lang.String r3 = "limit_count"
            java.lang.Integer r4 = r1.f5025
            m3196(r2, r3, r4)
            java.lang.String r3 = "item_tag"
            java.lang.String r4 = r1.f5026
            m3196(r2, r3, r4)
            java.lang.String r3 = "weight"
            java.lang.Integer r4 = r1.f5027
            m3196(r2, r3, r4)
            java.lang.String r3 = "watering_time"
            java.lang.Integer r4 = r1.f5028
            m3196(r2, r3, r4)
            java.lang.String r3 = "watering_cd"
            java.lang.Integer r4 = r1.f5029
            m3196(r2, r3, r4)
            java.lang.String r3 = "active_from_epoch"
            java.lang.Long r4 = r1.f5030
            m3196(r2, r3, r4)
            java.lang.String r3 = "active_until_epoch"
            java.lang.Long r4 = r1.f5031
            m3196(r2, r3, r4)
            java.lang.String r3 = "limit_dimension"
            java.lang.Integer r4 = r1.f5032
            m3196(r2, r3, r4)
            java.lang.String r3 = "in_shop"
            boolean r1 = r1.f5033
            r2.put(r3, r1)
            r0.put(r2)
            goto L14
        Laf:
            java.lang.String r5 = r0.toString()
            r5.getClass()
            java.lang.String r0 = "pet_elf_camp_seed_catalog_cache"
            p000.ui1.m5875(r0, r5)
            return
    }

    /* JADX INFO: renamed from: ν */
    public static void m3196(org.json.JSONObject r0, java.lang.String r1, java.lang.Object r2) {
            if (r2 != 0) goto L4
            java.lang.Object r2 = org.json.JSONObject.NULL
        L4:
            r0.put(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ξ */
    public static java.util.List m3197(java.util.Collection r3) {
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r3.next()
            r2 = r1
            id1 r2 = (p000.id1) r2
            int r2 = r2.f5015
            if (r2 <= 0) goto Lb
            r0.add(r1)
            goto Lb
        L20:
            ib1 r3 = new ib1
            r1 = 5
            r3.<init>(r1)
            ye r1 = new ye
            r2 = 29
            r1.<init>(r2, r3)
            jd1 r3 = new jd1
            r2 = 0
            r3.<init>(r2, r1)
            java.util.List r3 = p000.AbstractC0984xh.m6658(r0, r3)
            return r3
    }

    /* JADX INFO: renamed from: ο */
    public static java.lang.Integer m3198(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto Lf
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        Lf:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L22
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            java.lang.Integer r1 = p000.x02.m6486(r1)
            return r1
        L22:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: π */
    public static java.lang.Long m3199(java.lang.Object r2) {
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto Lf
            java.lang.Number r2 = (java.lang.Number) r2
            long r0 = r2.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        Lf:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L22
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            java.lang.Long r2 = p000.x02.m6488(r2)
            return r2
        L22:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final synchronized java.util.List m3200(org.json.JSONObject r15) {
            r14 = this;
            monitor-enter(r14)
            r15.getClass()     // Catch: java.lang.Throwable -> L15d
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L15d
            r5.<init>()     // Catch: java.lang.Throwable -> L15d
            ij0 r6 = new ij0     // Catch: java.lang.Throwable -> L15d
            r0 = 1
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L15d
            hd1 r3 = p000.hd1.f4694     // Catch: java.lang.Throwable -> L15d
            r4 = 0
            r1 = r14
            r2 = r15
            r1.m3204(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L23
            boolean r14 = r5.isEmpty()     // Catch: java.lang.Throwable -> L23
            if (r14 == 0) goto L27
            java.util.List r14 = r1.m3202()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r1)
            return r14
        L23:
            r0 = move-exception
        L24:
            r14 = r0
            goto L161
        L27:
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L23
            r14.<init>()     // Catch: java.lang.Throwable -> L23
            java.util.List r15 = r1.m3202()     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r15 = r15.iterator()     // Catch: java.lang.Throwable -> L23
        L34:
            boolean r0 = r15.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r15.next()     // Catch: java.lang.Throwable -> L23
            id1 r0 = (p000.id1) r0     // Catch: java.lang.Throwable -> L23
            int r2 = r0.f5015     // Catch: java.lang.Throwable -> L23
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L23
            r14.put(r2, r0)     // Catch: java.lang.Throwable -> L23
            goto L34
        L4a:
            java.util.Collection r15 = r5.values()     // Catch: java.lang.Throwable -> L23
            r15.getClass()     // Catch: java.lang.Throwable -> L23
            java.lang.Iterable r15 = (java.lang.Iterable) r15     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r15 = r15.iterator()     // Catch: java.lang.Throwable -> L23
        L57:
            boolean r0 = r15.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r15.next()     // Catch: java.lang.Throwable -> L23
            id1 r0 = (p000.id1) r0     // Catch: java.lang.Throwable -> L23
            int r2 = r0.f5015     // Catch: java.lang.Throwable -> L23
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L23
            int r3 = r0.f5015     // Catch: java.lang.Throwable -> L23
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L23
            java.lang.Object r3 = r14.get(r3)     // Catch: java.lang.Throwable -> L23
            id1 r3 = (p000.id1) r3     // Catch: java.lang.Throwable -> L23
            if (r3 == 0) goto L7b
            id1 r0 = r3.m2744(r0)     // Catch: java.lang.Throwable -> L23
        L7b:
            r14.put(r2, r0)     // Catch: java.lang.Throwable -> L23
            goto L57
        L7f:
            java.util.Collection r14 = r14.values()     // Catch: java.lang.Throwable -> L23
            r14.getClass()     // Catch: java.lang.Throwable -> L23
            java.util.List r14 = m3197(r14)     // Catch: java.lang.Throwable -> L23
            p000.kd1.f5862 = r14     // Catch: java.lang.Throwable -> L23
            m3195(r14)     // Catch: java.lang.Throwable -> L23
            java.lang.String r15 = "rdf9a626134090cfa"
            int r0 = r14.size()     // Catch: java.lang.Throwable -> L23
            boolean r2 = r14.isEmpty()     // Catch: java.lang.Throwable -> L23
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L9f
            r5 = r4
            goto Lbd
        L9f:
            java.util.Iterator r2 = r14.iterator()     // Catch: java.lang.Throwable -> L23
            r5 = r4
        La4:
            boolean r7 = r2.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r7 == 0) goto Lbd
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L23
            id1 r7 = (p000.id1) r7     // Catch: java.lang.Throwable -> L23
            boolean r7 = r7.f5033     // Catch: java.lang.Throwable -> L23
            if (r7 == 0) goto La4
            int r5 = r5 + 1
            if (r5 < 0) goto Lb9
            goto La4
        Lb9:
            p000.AbstractC1021yh.m6916()     // Catch: java.lang.Throwable -> L23
            throw r3     // Catch: java.lang.Throwable -> L23
        Lbd:
            boolean r2 = r14.isEmpty()     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto Lc4
            goto Le8
        Lc4:
            java.util.Iterator r2 = r14.iterator()     // Catch: java.lang.Throwable -> L23
        Lc8:
            boolean r7 = r2.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r7 == 0) goto Le8
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L23
            id1 r7 = (p000.id1) r7     // Catch: java.lang.Throwable -> L23
            java.lang.String r7 = r7.f5017     // Catch: java.lang.Throwable -> L23
            if (r7 == 0) goto Lc8
            boolean r7 = p000.q02.m4671(r7)     // Catch: java.lang.Throwable -> L23
            if (r7 == 0) goto Ldf
            goto Lc8
        Ldf:
            int r4 = r4 + 1
            if (r4 < 0) goto Le4
            goto Lc8
        Le4:
            p000.AbstractC1021yh.m6916()     // Catch: java.lang.Throwable -> L23
            throw r3     // Catch: java.lang.Throwable -> L23
        Le8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r2.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r7 = "已更新宿主作物目录 count="
            r2.append(r7)     // Catch: java.lang.Throwable -> L23
            r2.append(r0)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = " shop="
            r2.append(r0)     // Catch: java.lang.Throwable -> L23
            r2.append(r5)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = " icon="
            r2.append(r0)     // Catch: java.lang.Throwable -> L23
            r2.append(r4)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L23
            r2 = 4
            p000.C0888ux.m5992(r15, r0, r3, r2, r3)     // Catch: java.lang.Throwable -> L23
            boolean r15 = r14.isEmpty()     // Catch: java.lang.Throwable -> L23
            if (r15 == 0) goto L114
            goto L12f
        L114:
            java.util.Iterator r15 = r14.iterator()     // Catch: java.lang.Throwable -> L23
        L118:
            boolean r0 = r15.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L12f
            java.lang.Object r0 = r15.next()     // Catch: java.lang.Throwable -> L23
            id1 r0 = (p000.id1) r0     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.f5017     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L118
            boolean r0 = p000.q02.m4671(r0)     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L15b
            goto L118
        L12f:
            java.util.LinkedHashSet r15 = r6.f5096     // Catch: java.lang.Throwable -> L23
            boolean r15 = r15.isEmpty()     // Catch: java.lang.Throwable -> L23
            if (r15 != 0) goto L15b
            java.lang.String r15 = "rdf9a626134090cfa"
            java.util.LinkedHashSet r7 = r6.f5096     // Catch: java.lang.Throwable -> L23
            java.lang.String r8 = ";"
            r12 = 0
            r13 = 62
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L23
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r4.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r5 = "宿主种子配置未识别到图标 URL missingIconShapes="
            r4.append(r5)     // Catch: java.lang.Throwable -> L23
            r4.append(r0)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L23
            p000.C0888ux.m5992(r15, r0, r3, r2, r3)     // Catch: java.lang.Throwable -> L23
        L15b:
            monitor-exit(r1)
            return r14
        L15d:
            r0 = move-exception
            r1 = r14
            goto L24
        L161:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            throw r14
    }

    /* JADX INFO: renamed from: γ */
    public final java.lang.String m3201(int r10, java.lang.Object r11) {
            r9 = this;
            r0 = 0
            if (r11 == 0) goto Lc3
            java.lang.Object r1 = org.json.JSONObject.NULL
            if (r11 == r1) goto Lc3
            r1 = 4
            if (r10 <= r1) goto Lc
            goto Lc3
        Lc:
            boolean r1 = r11 instanceof java.lang.String
            r2 = 0
            if (r1 == 0) goto L49
            java.lang.String r11 = (java.lang.String) r11
            java.lang.CharSequence r9 = p000.q02.m4660(r11)
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "https://"
            r1 = 1
            boolean r11 = p000.x02.m6485(r9, r11, r1)
            if (r11 != 0) goto L37
            java.lang.String r11 = "http://"
            boolean r11 = p000.x02.m6485(r9, r11, r1)
            if (r11 != 0) goto L37
            java.lang.String r11 = "//"
            boolean r11 = p000.x02.m6485(r9, r11, r2)
            if (r11 == 0) goto L35
            goto L37
        L35:
            r11 = r0
            goto L38
        L37:
            r11 = r9
        L38:
            if (r11 != 0) goto L48
            java.lang.Object r9 = m3194(r9)
            if (r9 == 0) goto Lc3
            kd1 r11 = p000.kd1.f5861
            int r10 = r10 + r1
            java.lang.String r9 = r11.m3201(r10, r9)
            return r9
        L48:
            return r11
        L49:
            boolean r1 = r11 instanceof org.json.JSONObject
            if (r1 == 0) goto L9e
            java.lang.String r0 = "urlList"
            java.lang.String r1 = "src"
            java.lang.String r2 = "url"
            java.lang.String r3 = "uri"
            java.lang.String r4 = "url_list"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            f7 r1 = new f7
            r2 = 1
            r1.<init>(r2, r0)
            r0 = r11
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.util.Iterator r0 = r0.keys()
            r0.getClass()
            ss1 r0 = p000.us1.m5951(r0)
            c40 r0 = p000.us1.m5946(r1, r0)
            ny0 r1 = new ny0
            r7 = 0
            r8 = 13
            java.lang.Class<kd1> r4 = p000.kd1.class
            java.lang.String r5 = "normalizeKey"
            java.lang.String r6 = "normalizeKey(Ljava/lang/String;)Ljava/lang/String;"
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            cu r9 = new cu
            r2 = 0
            r9.<init>(r0, r2, r1)
            ya1 r0 = new ya1
            r1 = 16
            r0.<init>(r10, r1, r11)
            y30 r9 = p000.us1.m5943(r9, r0)
            java.lang.Object r9 = p000.us1.m5953(r9)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L9e:
            boolean r9 = r11 instanceof org.json.JSONArray
            if (r9 == 0) goto Lc3
            r9 = r11
            org.json.JSONArray r9 = (org.json.JSONArray) r9
            int r9 = r9.length()
            xm0 r9 = p000.j81.m2893(r2, r9)
            f7 r9 = p000.AbstractC0984xh.m6661(r9)
            ya1 r0 = new ya1
            r1 = 17
            r0.<init>(r10, r1, r11)
            y30 r9 = p000.us1.m5943(r9, r0)
            java.lang.Object r9 = p000.us1.m5953(r9)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        Lc3:
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public final synchronized java.util.List m3202() {
            r3 = this;
            monitor-enter(r3)
            java.util.List r0 = p000.kd1.f5862     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L7
            monitor-exit(r3)
            return r0
        L7:
            boolean r0 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L13
            jz r0 = p000.C0450jz.f5672     // Catch: java.lang.Throwable -> L11
            monitor-exit(r3)
            return r0
        L11:
            r0 = move-exception
            goto L3d
        L13:
            java.lang.String r0 = "pet_elf_camp_seed_catalog_cache"
            java.lang.String r1 = ""
            java.lang.String r0 = p000.ui1.m5893(r0, r1)     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = m3188(r0)     // Catch: java.lang.Throwable -> L20
            goto L27
        L20:
            r0 = move-exception
            eo1 r1 = new eo1     // Catch: java.lang.Throwable -> L11
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L11
            r0 = r1
        L27:
            java.lang.Throwable r1 = p000.fo1.m2190(r0)     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L2e
            goto L37
        L2e:
            java.lang.String r0 = "rdf9a626134090cfa"
            java.lang.String r2 = "读取作物目录缓存失败，已安全忽略"
            p000.C0888ux.m5977(r0, r2, r1)     // Catch: java.lang.Throwable -> L11
            jz r0 = p000.C0450jz.f5672     // Catch: java.lang.Throwable -> L11
        L37:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L11
            p000.kd1.f5862 = r0     // Catch: java.lang.Throwable -> L11
            monitor-exit(r3)
            return r0
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            throw r0
    }

    /* JADX INFO: renamed from: ι */
    public final java.lang.String m3203(org.json.JSONObject r10) {
            r9 = this;
            java.lang.String r7 = "SeedPic"
            java.lang.String r8 = "ItemPic"
            java.lang.String r0 = "SeedIcon"
            java.lang.String r1 = "IconUrl"
            java.lang.String r2 = "IconURL"
            java.lang.String r3 = "Icon"
            java.lang.String r4 = "ItemIcon"
            java.lang.String r5 = "SeedImage"
            java.lang.String r6 = "ItemImage"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r1 = r10.keys()
            r1.getClass()
            ss1 r1 = p000.us1.m5951(r1)
            f71 r2 = new f71
            r3 = 19
            r2.<init>(r3)
            y30 r3 = new y30
            r4 = 1
            r3.<init>(r1, r4, r2)
            f7 r1 = new f7
            r2 = 1
            r1.<init>(r2, r0)
            c40 r0 = p000.us1.m5946(r1, r3)
            ny0 r1 = new ny0
            r7 = 0
            r8 = 14
            java.lang.Class<kd1> r4 = p000.kd1.class
            java.lang.String r5 = "normalizeKey"
            java.lang.String r6 = "normalizeKey(Ljava/lang/String;)Ljava/lang/String;"
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            cu r9 = new cu
            r2 = 0
            r9.<init>(r0, r2, r1)
            gd1 r0 = new gd1
            r1 = 0
            r0.<init>(r10, r1)
            y30 r9 = p000.us1.m5943(r9, r0)
            java.lang.Object r9 = p000.us1.m5953(r9)
            java.lang.String r9 = (java.lang.String) r9
            return r9
    }

    /* JADX INFO: renamed from: ρ */
    public final void m3204(java.lang.Object r30, p000.hd1 r31, int r32, java.util.LinkedHashMap r33, p000.ij0 r34) {
            r29 = this;
            r0 = r29
            r1 = r30
            r6 = r32
            r4 = r33
            r5 = r34
            if (r1 == 0) goto L23d
            java.lang.Object r2 = org.json.JSONObject.NULL
            if (r1 == r2) goto L23d
            r2 = 16
            if (r6 <= r2) goto L16
            goto L23d
        L16:
            boolean r2 = r1 instanceof org.json.JSONObject
            r7 = 1
            if (r2 == 0) goto L1f4
            int r2 = r31.ordinal()
            r3 = 0
            if (r2 == 0) goto L13a
            if (r2 == r7) goto Lb0
            r8 = 2
            if (r2 != r8) goto Lac
            r2 = r1
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.lang.String r8 = "ItemID"
            java.lang.Object r8 = m3191(r8, r2)
            java.lang.Integer r8 = m3198(r8)
            if (r8 == 0) goto L13a
            int r9 = r8.intValue()
            if (r9 <= 0) goto L3d
            goto L3e
        L3d:
            r8 = r3
        L3e:
            if (r8 == 0) goto L13a
            int r10 = r8.intValue()
            id1 r9 = new id1
            java.lang.String r3 = "ItemName"
            java.lang.String r11 = m3192(r3, r2)
            java.lang.String r12 = r0.m3203(r2)
            java.lang.String r3 = "BuyMoneyPrice"
            java.lang.Object r3 = m3191(r3, r2)
            java.lang.Integer r14 = m3198(r3)
            java.lang.String r3 = "LimitCampLv"
            java.lang.Object r3 = m3191(r3, r2)
            java.lang.Integer r17 = m3198(r3)
            java.lang.String r3 = "LimitNum"
            java.lang.Object r3 = m3191(r3, r2)
            java.lang.Integer r20 = m3198(r3)
            java.lang.String r3 = "weight"
            java.lang.Object r3 = m3191(r3, r2)
            java.lang.Integer r22 = m3198(r3)
            java.lang.String r3 = "TimeActive"
            java.lang.Object r3 = m3191(r3, r2)
            java.lang.Long r25 = m3199(r3)
            java.lang.String r3 = "TimeEnd"
            java.lang.Object r3 = m3191(r3, r2)
            java.lang.Long r26 = m3199(r3)
            java.lang.String r3 = "LimitDimension"
            java.lang.Object r2 = m3191(r3, r2)
            java.lang.Integer r27 = m3198(r2)
            r28 = 27496(0x6b68, float:3.853E-41)
            r13 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        La9:
            r3 = r9
            goto L13a
        Lac:
            p000.C1080.m7272()
            return
        Lb0:
            r2 = r1
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.lang.String r8 = "SeedID"
            java.lang.Object r8 = m3191(r8, r2)
            java.lang.Integer r8 = m3198(r8)
            if (r8 == 0) goto L13a
            int r9 = r8.intValue()
            if (r9 <= 0) goto Lc6
            goto Lc7
        Lc6:
            r8 = r3
        Lc7:
            if (r8 == 0) goto L13a
            int r10 = r8.intValue()
            id1 r9 = new id1
            java.lang.String r3 = "SeedName"
            java.lang.String r11 = m3192(r3, r2)
            java.lang.String r12 = r0.m3203(r2)
            java.lang.String r3 = "GrowthTime"
            java.lang.Object r3 = m3191(r3, r2)
            java.lang.Integer r13 = m3198(r3)
            java.lang.String r3 = "ProductMoneyNum"
            java.lang.Object r3 = m3191(r3, r2)
            java.lang.Integer r15 = m3198(r3)
            java.lang.String r3 = "ProductCampExp"
            java.lang.Object r3 = m3191(r3, r2)
            java.lang.Integer r16 = m3198(r3)
            java.lang.String r3 = "ProductItemID"
            java.lang.Object r3 = m3191(r3, r2)
            java.lang.Integer r18 = m3198(r3)
            java.lang.String r3 = "ProductItemNum"
            java.lang.Object r3 = m3191(r3, r2)
            java.lang.Integer r19 = m3198(r3)
            java.lang.String r3 = "ItemTag"
            java.lang.String r21 = m3192(r3, r2)
            java.lang.String r3 = "WateringTime"
            java.lang.Object r3 = m3191(r3, r2)
            java.lang.Integer r23 = m3198(r3)
            java.lang.String r3 = "WateringCD"
            java.lang.Object r2 = m3191(r3, r2)
            java.lang.Integer r24 = m3198(r2)
            r27 = 0
            r28 = 496784(0x79490, float:6.96143E-40)
            r14 = 0
            r17 = 0
            r20 = 0
            r22 = 0
            r25 = 0
            r26 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto La9
        L13a:
            if (r3 == 0) goto L197
            java.lang.String r2 = r3.f5017
            if (r2 == 0) goto L146
            boolean r2 = p000.q02.m4671(r2)
            if (r2 == 0) goto L197
        L146:
            r2 = r1
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.util.LinkedHashSet r8 = r5.f5096
            int r9 = r8.size()
            r10 = 3
            if (r9 < r10) goto L153
            goto L197
        L153:
            java.util.Iterator r9 = r2.keys()
            r9.getClass()
            ss1 r9 = p000.us1.m5951(r9)
            f7 r10 = new f7
            r11 = 4
            r10.<init>(r11, r9)
            r9 = 24
            ss1 r9 = p000.us1.m5947(r10, r9)
            gd1 r10 = new gd1
            r10.<init>(r5, r2)
            r2 = 30
            java.lang.String r11 = ","
            java.lang.String r2 = p000.us1.m5955(r9, r11, r10, r2)
            java.lang.String r9 = r31.name()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r9 = "["
            r10.append(r9)
            r10.append(r2)
            java.lang.String r2 = "]"
            r10.append(r2)
            java.lang.String r2 = r10.toString()
            r8.add(r2)
        L197:
            if (r3 == 0) goto L1b2
            int r2 = r3.f5015
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r4.get(r2)
            id1 r2 = (p000.id1) r2
            if (r2 == 0) goto L1af
            id1 r3 = r2.m2744(r3)
        L1af:
            r4.put(r8, r3)
        L1b2:
            r8 = r1
            org.json.JSONObject r8 = (org.json.JSONObject) r8
            java.util.Iterator r9 = r8.keys()
        L1b9:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L23d
            java.lang.Object r1 = r9.next()
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            java.lang.String r2 = m3190(r1)
            java.lang.String r3 = "campseed"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L1d7
            hd1 r2 = p000.hd1.f4695
            goto L1e4
        L1d7:
            java.lang.String r3 = "shopseed"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1e2
            hd1 r2 = p000.hd1.f4696
            goto L1e4
        L1e2:
            r2 = r31
        L1e4:
            java.lang.Object r1 = r8.opt(r1)
            int r3 = r6 + 1
            r0.m3204(r1, r2, r3, r4, r5)
            r0 = r29
            r4 = r33
            r5 = r34
            goto L1b9
        L1f4:
            boolean r0 = r1 instanceof org.json.JSONArray
            r2 = r0
            kd1 r0 = p000.kd1.f5861
            if (r2 == 0) goto L226
            r8 = r1
            org.json.JSONArray r8 = (org.json.JSONArray) r8
            int r1 = r8.length()
            r2 = 0
            xm0 r1 = p000.j81.m2893(r2, r1)
            java.util.Iterator r9 = r1.iterator()
        L20b:
            r1 = r9
            wm0 r1 = (p000.wm0) r1
            boolean r2 = r1.f11765
            if (r2 == 0) goto L23d
            int r1 = r1.nextInt()
            java.lang.Object r1 = r8.opt(r1)
            int r3 = r6 + 1
            r2 = r31
            r4 = r33
            r5 = r34
            r0.m3204(r1, r2, r3, r4, r5)
            goto L20b
        L226:
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L23d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = m3194(r1)
            if (r1 == 0) goto L23d
            int r3 = r6 + 1
            r2 = r31
            r4 = r33
            r5 = r34
            r0.m3204(r1, r2, r3, r4, r5)
        L23d:
            return
    }
}
