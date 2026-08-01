package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class f31 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicReference f3740 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.ConcurrentHashMap f3741 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.ConcurrentHashMap f3742 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.atomic.AtomicReference f3743 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.List f3744 = null;

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            p000.f31.f3740 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.f31.f3741 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.f31.f3742 = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            kz r1 = p000.C0493kz.f6332
            r0.<init>(r1)
            p000.f31.f3743 = r0
            java.lang.String r18 = "webp_image"
            java.lang.String r19 = "webpImage"
            java.lang.String r2 = "animated_image"
            java.lang.String r3 = "animatedImage"
            java.lang.String r4 = "dynamic_image"
            java.lang.String r5 = "dynamicImage"
            java.lang.String r6 = "motion_image"
            java.lang.String r7 = "motionImage"
            java.lang.String r8 = "live_photo"
            java.lang.String r9 = "livePhoto"
            java.lang.String r10 = "live_photo_image"
            java.lang.String r11 = "livePhotoImage"
            java.lang.String r12 = "video"
            java.lang.String r13 = "video_info"
            java.lang.String r14 = "videoInfo"
            java.lang.String r15 = "gif"
            java.lang.String r16 = "gif_image"
            java.lang.String r17 = "gifImage"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.f31.f3744 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m2015(org.json.JSONObject r58) {
            java.lang.String r0 = "sec_uid"
            java.lang.String r1 = "signature"
            java.lang.String r2 = "user"
            r3 = r58
            org.json.JSONObject r2 = r3.optJSONObject(r2)     // Catch: java.lang.Throwable -> Lc0
            if (r2 != 0) goto L10
            goto Lc0
        L10:
            java.lang.String r3 = "uid"
            r4 = 0
            java.lang.String r14 = r2.optString(r3, r4)     // Catch: java.lang.Throwable -> Lc0
            if (r14 != 0) goto L1b
            goto Lc0
        L1b:
            java.lang.String r21 = m2023(r2)     // Catch: java.lang.Throwable -> Lc0
            f8 r5 = new f8     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r3 = "nickname"
            java.lang.String r6 = "未知"
            java.lang.String r6 = r2.optString(r3, r6)     // Catch: java.lang.Throwable -> Lc0
            r6.getClass()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r3 = ""
            java.lang.String r7 = r2.optString(r1, r3)     // Catch: java.lang.Throwable -> Lc0
            r7.getClass()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r15 = r2.optString(r0, r4)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r16 = r2.optString(r1, r4)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = "follower_count"
            r3 = 0
            int r17 = r2.optInt(r1, r3)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = "following_count"
            int r18 = r2.optInt(r1, r3)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = "aweme_count"
            int r19 = r2.optInt(r1, r3)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = "verification_type"
            int r20 = r2.optInt(r1, r3)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = "live_status"
            r8 = 0
            long r10 = r2.optLong(r1, r8)     // Catch: java.lang.Throwable -> Lc0
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 <= 0) goto L63
            r3 = 1
        L63:
            r22 = r3
            r56 = -130820(0xfffffffffffe00fc, float:NaN)
            r57 = 8191(0x1fff, float:1.1478E-41)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r51 = 0
            r53 = 0
            r55 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r51, r53, r55, r56, r57)     // Catch: java.lang.Throwable -> Lc0
            java.util.concurrent.atomic.AtomicReference r1 = p000.f31.f3740     // Catch: java.lang.Throwable -> Lc0
            r1.set(r5)     // Catch: java.lang.Throwable -> Lc0
            boolean r1 = p000.q02.m4671(r14)     // Catch: java.lang.Throwable -> Lc0
            if (r1 != 0) goto Lc0
            java.util.concurrent.atomic.AtomicReference r1 = p000.b10.f1403     // Catch: java.lang.Throwable -> Lc0
            p000.b10.f1407 = r14     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r0 = r2.optString(r0, r4)     // Catch: java.lang.Throwable -> Lc0
            p000.b10.f1408 = r0     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m2016(java.lang.Object r7, java.lang.String r8) {
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lc4
            r0.<init>(r8)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r8 = r0.getHost()     // Catch: java.lang.Throwable -> Lc4
            r8.getClass()     // Catch: java.lang.Throwable -> Lc4
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> Lc4
            r0.getClass()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r8 = r8.toLowerCase(r0)     // Catch: java.lang.Throwable -> Lc4
            r8.getClass()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r0 = "headers"
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r7 = p000.qe0.m4869(r7, r0, r2)     // Catch: java.lang.Throwable -> Lc4
            if (r7 != 0) goto L25
            goto Lc4
        L25:
            java.lang.String r0 = "size"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r0 = p000.qe0.m4869(r7, r0, r2)     // Catch: java.lang.Throwable -> Lc4
            boolean r2 = r0 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> Lc4
            r3 = 0
            if (r2 == 0) goto L35
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> Lc4
            goto L36
        L35:
            r0 = r3
        L36:
            if (r0 == 0) goto Lc4
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> Lc4
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Lc4
            r2.<init>()     // Catch: java.lang.Throwable -> Lc4
        L41:
            if (r1 >= r0) goto L83
            java.lang.Object r4 = p000.qe0.f8982     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r4 = "name"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r4 = p000.qe0.m4869(r7, r4, r5)     // Catch: java.lang.Throwable -> Lc4
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lc4
            if (r5 == 0) goto L5a
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lc4
            goto L5b
        L5a:
            r4 = r3
        L5b:
            if (r4 != 0) goto L5e
            goto L80
        L5e:
            java.lang.String r5 = "value"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r5 = p000.qe0.m4869(r7, r5, r6)     // Catch: java.lang.Throwable -> Lc4
            boolean r6 = r5 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lc4
            if (r6 == 0) goto L73
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lc4
            goto L74
        L73:
            r5 = r3
        L74:
            if (r5 != 0) goto L77
            goto L80
        L77:
            boolean r6 = m2032(r4, r5)     // Catch: java.lang.Throwable -> Lc4
            if (r6 == 0) goto L80
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> Lc4
        L80:
            int r1 = r1 + 1
            goto L41
        L83:
            boolean r7 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lc4
            if (r7 != 0) goto Lc4
            java.util.concurrent.ConcurrentHashMap r7 = p000.f31.f3742     // Catch: java.lang.Throwable -> Lc4
            r7.put(r8, r2)     // Catch: java.lang.Throwable -> Lc4
            java.util.concurrent.atomic.AtomicReference r7 = p000.f31.f3743     // Catch: java.lang.Throwable -> Lc4
            r7.set(r2)     // Catch: java.lang.Throwable -> Lc4
            java.util.Set r7 = r2.keySet()     // Catch: java.lang.Throwable -> Lc4
            r7.getClass()     // Catch: java.lang.Throwable -> Lc4
            r0 = r7
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> Lc4
            r5 = 0
            r6 = 63
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r7 = p000.AbstractC0984xh.m6644(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lc4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
            r0.<init>()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = "DYHelper: [HTTP-CTX] cache headers host="
            r0.append(r1)     // Catch: java.lang.Throwable -> Lc4
            r0.append(r8)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r8 = " keys="
            r0.append(r8)     // Catch: java.lang.Throwable -> Lc4
            r0.append(r7)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> Lc4
            p000.C0888ux.m5985(r7)     // Catch: java.lang.Throwable -> Lc4
        Lc4:
            return
    }

    /* JADX INFO: renamed from: γ */
    public static void m2017(org.json.JSONObject r6, java.util.ArrayList r7, int r8) {
            r0 = 5
            if (r8 <= r0) goto L5
            goto La6
        L5:
            java.util.Iterator r0 = r6.keys()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La6
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r6.opt(r1)
            r1.getClass()
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r3)
            r1.getClass()
            java.lang.String r3 = "animated"
            r4 = 0
            boolean r3 = p000.q02.m4654(r1, r3, r4)
            if (r3 != 0) goto La1
            java.lang.String r3 = "animate"
            boolean r3 = p000.q02.m4654(r1, r3, r4)
            if (r3 != 0) goto La1
            java.lang.String r3 = "animation"
            boolean r3 = p000.q02.m4654(r1, r3, r4)
            if (r3 != 0) goto La1
            java.lang.String r3 = "dynamic"
            boolean r3 = p000.q02.m4654(r1, r3, r4)
            if (r3 != 0) goto La1
            java.lang.String r3 = "motion"
            boolean r3 = p000.q02.m4654(r1, r3, r4)
            if (r3 != 0) goto La1
            java.lang.String r3 = "live_photo"
            boolean r3 = p000.q02.m4654(r1, r3, r4)
            if (r3 != 0) goto La1
            java.lang.String r3 = "livephoto"
            boolean r3 = p000.q02.m4654(r1, r3, r4)
            if (r3 != 0) goto La1
            java.lang.String r3 = "gif"
            boolean r3 = p000.q02.m4654(r1, r3, r4)
            if (r3 != 0) goto La1
            java.lang.String r3 = "webp"
            boolean r3 = p000.q02.m4654(r1, r3, r4)
            if (r3 != 0) goto La1
            java.lang.String r3 = "video"
            boolean r1 = p000.q02.m4654(r1, r3, r4)
            if (r1 == 0) goto L77
            goto La1
        L77:
            boolean r1 = r2 instanceof org.json.JSONObject
            if (r1 == 0) goto L83
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            int r1 = r8 + 1
            m2017(r2, r7, r1)
            goto L9
        L83:
            boolean r1 = r2 instanceof org.json.JSONArray
            if (r1 == 0) goto L9
            org.json.JSONArray r2 = (org.json.JSONArray) r2
            int r1 = r2.length()
        L8d:
            if (r4 >= r1) goto L9
            java.lang.Object r3 = r2.opt(r4)
            boolean r5 = r3 instanceof org.json.JSONObject
            if (r5 == 0) goto L9e
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            int r5 = r8 + 1
            m2017(r3, r7, r5)
        L9e:
            int r4 = r4 + 1
            goto L8d
        La1:
            m2018(r2, r7, r4)
            goto L9
        La6:
            return
    }

    /* JADX INFO: renamed from: δ */
    public static void m2018(java.lang.Object r4, java.util.ArrayList r5, int r6) {
            if (r4 == 0) goto L5a
            java.lang.Object r0 = org.json.JSONObject.NULL
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L5a
            r0 = 6
            if (r6 <= r0) goto Le
            goto L5a
        Le:
            boolean r0 = r4 instanceof java.lang.String
            r1 = 0
            if (r0 == 0) goto L22
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "http"
            boolean r6 = p000.x02.m6485(r6, r0, r1)
            if (r6 == 0) goto L5a
            r5.add(r4)
            return
        L22:
            boolean r0 = r4 instanceof org.json.JSONArray
            if (r0 == 0) goto L3a
            org.json.JSONArray r4 = (org.json.JSONArray) r4
            int r0 = r4.length()
        L2c:
            if (r1 >= r0) goto L5a
            java.lang.Object r2 = r4.opt(r1)
            int r3 = r6 + 1
            m2018(r2, r5, r3)
            int r1 = r1 + 1
            goto L2c
        L3a:
            boolean r0 = r4 instanceof org.json.JSONObject
            if (r0 == 0) goto L5a
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            java.util.Iterator r0 = r4.keys()
        L44:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.opt(r1)
            int r2 = r6 + 1
            m2018(r1, r5, r2)
            goto L44
        L5a:
            return
    }

    /* JADX INFO: renamed from: ε */
    public static void m2019(org.json.JSONObject r4) {
            java.lang.String r0 = "author"
            org.json.JSONObject r0 = r4.optJSONObject(r0)     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L9
            goto L45
        L9:
            java.lang.String r1 = "uid"
            r2 = 0
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.Throwable -> L45
            if (r1 != 0) goto L13
            goto L45
        L13:
            java.lang.String r0 = m2023(r0)     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L1f
            boolean r3 = p000.q02.m4671(r0)     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L37
        L1f:
            java.lang.String r3 = "ip_attribution"
            java.lang.String r4 = r4.optString(r3, r2)     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L37
            boolean r2 = p000.q02.m4671(r4)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L2e
            goto L37
        L2e:
            java.lang.String r2 = "null"
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L37
            r0 = r4
        L37:
            if (r0 == 0) goto L45
            boolean r4 = p000.q02.m4671(r0)     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L40
            goto L45
        L40:
            java.util.concurrent.ConcurrentHashMap r4 = p000.f31.f3741     // Catch: java.lang.Throwable -> L45
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> L45
        L45:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.String m2020(org.json.JSONObject r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = p000.f31.f3744
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r4.opt(r2)
            m2018(r2, r0, r3)
            goto Lb
        L20:
            java.util.List r1 = p000.el0.f3589
            r1 = 1
            java.lang.String r0 = p000.el0.m1933(r0, r1)
            if (r0 == 0) goto L2a
            return r0
        L2a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            m2017(r4, r0, r3)
            java.lang.String r0 = p000.el0.m1933(r0, r1)
            if (r0 == 0) goto L39
            return r0
        L39:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            m2018(r4, r0, r3)
            java.lang.String r4 = p000.el0.m1933(r0, r3)
            return r4
    }

    /* JADX INFO: renamed from: η */
    public static java.lang.String m2021(org.json.JSONObject r12) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "cover_large"
            java.lang.String r11 = "coverLarge"
            java.lang.String r1 = "cover"
            java.lang.String r2 = "origin_cover"
            java.lang.String r3 = "originCover"
            java.lang.String r4 = "dynamic_cover"
            java.lang.String r5 = "dynamicCover"
            java.lang.String r6 = "animated_cover"
            java.lang.String r7 = "animatedCover"
            java.lang.String r8 = "cover_medium"
            java.lang.String r9 = "coverMedium"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r1)
            java.util.Iterator r1 = r1.iterator()
        L27:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r12.opt(r2)
            r4 = 0
            m2018(r3, r0, r4)
            org.json.JSONObject r2 = r12.optJSONObject(r2)
            java.util.List r2 = m2024(r2)
            r0.addAll(r2)
            goto L27
        L47:
            java.util.List r12 = p000.el0.f3589
            java.lang.String r12 = p000.el0.m1934(r0)
            if (r12 != 0) goto L6e
            java.util.Iterator r12 = r0.iterator()
        L53:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r12.next()
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "http"
            r3 = 1
            boolean r1 = p000.x02.m6485(r1, r2, r3)
            if (r1 == 0) goto L53
            goto L6b
        L6a:
            r0 = 0
        L6b:
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L6e:
            return r12
    }

    /* JADX INFO: renamed from: θ */
    public static java.lang.String m2022(org.json.JSONObject r7) {
            java.lang.String r0 = "origin_image"
            org.json.JSONObject r1 = r7.optJSONObject(r0)
            java.lang.String r0 = "download_image"
            org.json.JSONObject r2 = r7.optJSONObject(r0)
            java.lang.String r0 = "download"
            org.json.JSONObject r3 = r7.optJSONObject(r0)
            java.lang.String r0 = "display_image"
            org.json.JSONObject r4 = r7.optJSONObject(r0)
            java.lang.String r0 = "thumb"
            org.json.JSONObject r5 = r7.optJSONObject(r0)
            r6 = r7
            org.json.JSONObject[] r7 = new org.json.JSONObject[]{r1, r2, r3, r4, r5, r6}
            java.util.List r7 = p000.AbstractC1021yh.m6897(r7)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L30:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r7.next()
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.util.List r1 = m2024(r1)
            r0.addAll(r1)
            goto L30
        L44:
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L4c
            r7 = 0
            return r7
        L4c:
            java.util.List r7 = p000.el0.f3589
            java.lang.String r7 = p000.el0.m1934(r0)
            return r7
    }

    /* JADX INFO: renamed from: ι */
    public static java.lang.String m2023(org.json.JSONObject r38) {
            r0 = r38
            java.lang.String r1 = "ip_location_string"
            java.lang.String r2 = "location"
            java.lang.String r3 = "ip_location"
            java.lang.String r4 = "ipLocation"
            java.lang.String[] r1 = new java.lang.String[]{r3, r4, r1, r2}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r1)
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r0.optString(r2, r3)
            if (r2 == 0) goto L16
            boolean r3 = p000.q02.m4671(r2)
            if (r3 == 0) goto L30
            goto L16
        L30:
            java.lang.String r3 = "null"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L16
            return r2
        L39:
            java.lang.String r36 = "香港"
            java.lang.String r37 = "澳门"
            java.lang.String r4 = "北京"
            java.lang.String r5 = "天津"
            java.lang.String r6 = "上海"
            java.lang.String r7 = "重庆"
            java.lang.String r8 = "河北"
            java.lang.String r9 = "山西"
            java.lang.String r10 = "辽宁"
            java.lang.String r11 = "吉林"
            java.lang.String r12 = "黑龙江"
            java.lang.String r13 = "江苏"
            java.lang.String r14 = "浙江"
            java.lang.String r15 = "安徽"
            java.lang.String r16 = "福建"
            java.lang.String r17 = "江西"
            java.lang.String r18 = "山东"
            java.lang.String r19 = "河南"
            java.lang.String r20 = "湖北"
            java.lang.String r21 = "湖南"
            java.lang.String r22 = "广东"
            java.lang.String r23 = "海南"
            java.lang.String r24 = "四川"
            java.lang.String r25 = "贵州"
            java.lang.String r26 = "云南"
            java.lang.String r27 = "陕西"
            java.lang.String r28 = "甘肃"
            java.lang.String r29 = "青海"
            java.lang.String r30 = "台湾"
            java.lang.String r31 = "内蒙古"
            java.lang.String r32 = "广西"
            java.lang.String r33 = "西藏"
            java.lang.String r34 = "宁夏"
            java.lang.String r35 = "新疆"
            java.lang.String[] r1 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37}
            java.util.Set r1 = p000.AbstractC0312g7.m2263(r1)
            java.lang.String r12 = "language"
            java.lang.String r13 = "region"
            java.lang.String r4 = "nickname"
            java.lang.String r5 = "signature"
            java.lang.String r6 = "uid"
            java.lang.String r7 = "sec_uid"
            java.lang.String r8 = "unique_id"
            java.lang.String r9 = "short_id"
            java.lang.String r10 = "avatar_uri"
            java.lang.String r11 = "share_url"
            java.lang.String[] r2 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            java.util.Set r2 = p000.AbstractC0312g7.m2263(r2)
            java.util.Iterator r4 = r0.keys()
        La5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L10b
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = r2.contains(r5)
            if (r6 != 0) goto La5
            java.lang.String r6 = r0.optString(r5, r3)
            if (r6 != 0) goto Lbe
            goto La5
        Lbe:
            int r7 = r6.length()
            r8 = 2
            if (r8 > r7) goto La5
            r8 = 16
            if (r7 >= r8) goto La5
            r7 = r1
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r8 = r7 instanceof java.util.Collection
            if (r8 == 0) goto Lda
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto Lda
            goto La5
        Lda:
            java.util.Iterator r7 = r7.iterator()
        Lde:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto La5
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            r9 = 0
            boolean r8 = p000.q02.m4654(r6, r8, r9)
            if (r8 == 0) goto Lde
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DYHelper: 📍 发现IP key: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r1 = " = "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            p000.C0888ux.m5985(r0)
            return r6
        L10b:
            return r3
    }

    /* JADX INFO: renamed from: κ */
    public static java.util.List m2024(org.json.JSONObject r8) {
            if (r8 != 0) goto L5
            jz r8 = p000.C0450jz.f5672
            return r8
        L5:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "origin_url_list"
            java.lang.String r2 = "url_list"
            java.lang.String r3 = "download_url_list"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r1)
            java.util.Iterator r1 = r1.iterator()
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            org.json.JSONArray r2 = r8.optJSONArray(r2)
            if (r2 != 0) goto L2f
            goto L1c
        L2f:
            int r3 = r2.length()
            r4 = 0
            r5 = r4
        L35:
            if (r5 >= r3) goto L1c
            java.lang.String r6 = r2.optString(r5)
            r6.getClass()
            java.lang.String r7 = "http"
            boolean r7 = p000.x02.m6485(r6, r7, r4)
            if (r7 == 0) goto L49
            r0.add(r6)
        L49:
            int r5 = r5 + 1
            goto L35
        L4c:
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public static void m2025(org.json.JSONObject r3) {
            java.lang.String r0 = "DYHelper: 📍 用户详情IP: uid="
            java.lang.String r1 = "user"
            org.json.JSONObject r3 = r3.optJSONObject(r1)     // Catch: java.lang.Throwable -> L3e
            if (r3 != 0) goto Lb
            goto L3e
        Lb:
            java.lang.String r1 = "uid"
            r2 = 0
            java.lang.String r1 = r3.optString(r1, r2)     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L15
            goto L3e
        L15:
            java.lang.String r3 = m2023(r3)     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L3e
            boolean r2 = p000.q02.m4671(r3)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L22
            goto L3e
        L22:
            java.util.concurrent.ConcurrentHashMap r2 = p000.f31.f3741     // Catch: java.lang.Throwable -> L3e
            r2.put(r1, r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L3e
            r2.append(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = ", ip="
            r2.append(r0)     // Catch: java.lang.Throwable -> L3e
            r2.append(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Throwable -> L3e
            p000.C0888ux.m5985(r3)     // Catch: java.lang.Throwable -> L3e
        L3e:
            return
    }

    /* JADX INFO: renamed from: μ */
    public static long m2026(org.json.JSONObject r7, java.lang.String... r8) {
            r0 = 0
            if (r7 != 0) goto L5
            goto L1d
        L5:
            int r2 = r8.length
            r3 = 0
        L7:
            if (r3 >= r2) goto L1d
            r4 = r8[r3]
            boolean r5 = r7.has(r4)
            if (r5 == 0) goto L1a
            long r4 = r7.optLong(r4, r0)
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L1a
            return r4
        L1a:
            int r3 = r3 + 1
            goto L7
        L1d:
            return r0
    }

    /* JADX INFO: renamed from: ν */
    public static java.util.Map m2027(java.lang.String r8) {
            kz r0 = p000.C0493kz.f6332
            java.util.concurrent.atomic.AtomicReference r1 = p000.f31.f3743
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L75
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L75
            java.lang.String r8 = r2.getHost()     // Catch: java.lang.Throwable -> L75
            r8.getClass()     // Catch: java.lang.Throwable -> L75
            java.util.Locale r2 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L75
            r2.getClass()     // Catch: java.lang.Throwable -> L75
            java.lang.String r8 = r8.toLowerCase(r2)     // Catch: java.lang.Throwable -> L75
            r8.getClass()     // Catch: java.lang.Throwable -> L75
            java.util.concurrent.ConcurrentHashMap r2 = p000.f31.f3742     // Catch: java.lang.Throwable -> L75
            java.lang.Object r3 = r2.get(r8)     // Catch: java.lang.Throwable -> L75
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Throwable -> L75
            if (r3 != 0) goto L74
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L75
            r2.getClass()     // Catch: java.lang.Throwable -> L75
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L75
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L75
        L33:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L75
            r4 = 0
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L75
            r5 = r3
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L75
            r5.getClass()     // Catch: java.lang.Throwable -> L75
            java.lang.Object r5 = r5.getKey()     // Catch: java.lang.Throwable -> L75
            r5.getClass()     // Catch: java.lang.Throwable -> L75
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L75
            r6 = 0
            boolean r7 = p000.x02.m6479(r8, r5, r6)     // Catch: java.lang.Throwable -> L75
            if (r7 != 0) goto L5c
            boolean r5 = p000.x02.m6479(r5, r8, r6)     // Catch: java.lang.Throwable -> L75
            if (r5 == 0) goto L33
            goto L5c
        L5b:
            r3 = r4
        L5c:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L75
            if (r3 == 0) goto L67
            java.lang.Object r8 = r3.getValue()     // Catch: java.lang.Throwable -> L75
            r4 = r8
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Throwable -> L75
        L67:
            if (r4 != 0) goto L73
            java.lang.Object r8 = r1.get()     // Catch: java.lang.Throwable -> L75
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Throwable -> L75
            if (r8 != 0) goto L72
            return r0
        L72:
            return r8
        L73:
            return r4
        L74:
            return r3
        L75:
            java.lang.Object r8 = r1.get()
            java.util.Map r8 = (java.util.Map) r8
            if (r8 != 0) goto L7e
            goto L7f
        L7e:
            r0 = r8
        L7f:
            return r0
    }

    /* JADX INFO: renamed from: ξ */
    public static boolean m2028(org.json.JSONObject r5) {
            java.lang.String r0 = "aweme_type"
            r1 = -1
            int r0 = r5.optInt(r0, r1)
            r1 = 59
            if (r0 != r1) goto Ld
            goto Lc8
        Ld:
            java.lang.String r0 = "images"
            org.json.JSONArray r1 = r5.optJSONArray(r0)
            if (r1 != 0) goto L23
            java.lang.String r1 = "image_post_info"
            org.json.JSONObject r5 = r5.optJSONObject(r1)
            if (r5 == 0) goto L22
            org.json.JSONArray r1 = r5.optJSONArray(r0)
            goto L23
        L22:
            r1 = 0
        L23:
            r5 = 0
            if (r1 == 0) goto Lc9
            int r0 = r1.length()
            r2 = r5
        L2b:
            if (r2 >= r0) goto Lc9
            org.json.JSONObject r3 = r1.optJSONObject(r2)
            if (r3 != 0) goto L35
            goto Lc4
        L35:
            java.lang.String r4 = "live_photo"
            boolean r4 = r3.has(r4)
            if (r4 != 0) goto Lc8
            java.lang.String r4 = "livePhoto"
            boolean r4 = r3.has(r4)
            if (r4 != 0) goto Lc8
            java.lang.String r4 = "live_photo_image"
            boolean r4 = r3.has(r4)
            if (r4 != 0) goto Lc8
            java.lang.String r4 = "livePhotoImage"
            boolean r4 = r3.has(r4)
            if (r4 != 0) goto Lc8
            java.lang.String r4 = "animated_image"
            boolean r4 = r3.has(r4)
            if (r4 != 0) goto Lc8
            java.lang.String r4 = "animatedImage"
            boolean r4 = r3.has(r4)
            if (r4 != 0) goto Lc8
            java.lang.String r4 = "dynamic_image"
            boolean r4 = r3.has(r4)
            if (r4 != 0) goto Lc8
            java.lang.String r4 = "dynamicImage"
            boolean r4 = r3.has(r4)
            if (r4 != 0) goto Lc8
            java.lang.String r4 = "motion_image"
            boolean r4 = r3.has(r4)
            if (r4 != 0) goto Lc8
            java.lang.String r4 = "motionImage"
            boolean r4 = r3.has(r4)
            if (r4 != 0) goto Lc8
            java.lang.String r4 = "video_info"
            boolean r4 = r3.has(r4)
            if (r4 != 0) goto Lc8
            java.lang.String r4 = "videoInfo"
            boolean r4 = r3.has(r4)
            if (r4 == 0) goto L96
            goto Lc8
        L96:
            java.lang.String r4 = "video"
            org.json.JSONObject r3 = r3.optJSONObject(r4)
            if (r3 == 0) goto Lc4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            m2018(r3, r4, r5)
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto Lad
            goto Lc4
        Lad:
            java.util.Iterator r3 = r4.iterator()
        Lb1:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lc4
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = m2029(r4)
            if (r4 == 0) goto Lb1
            goto Lc8
        Lc4:
            int r2 = r2 + 1
            goto L2b
        Lc8:
            r5 = 1
        Lc9:
            return r5
    }

    /* JADX INFO: renamed from: ο */
    public static boolean m2029(java.lang.String r5) {
            java.lang.String r0 = "http"
            r1 = 1
            boolean r0 = p000.x02.m6485(r5, r0, r1)
            r2 = 0
            if (r0 != 0) goto Lc
            goto L172
        Lc:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = p000.AbstractC0602nx.m4134(r0, r5, r0)
            java.net.URL r4 = new java.net.URL     // Catch: java.lang.Throwable -> L26
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = r4.getHost()     // Catch: java.lang.Throwable -> L26
            r4.getClass()     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = r4.toLowerCase(r0)     // Catch: java.lang.Throwable -> L26
            r0.getClass()     // Catch: java.lang.Throwable -> L26
            goto L2d
        L26:
            r0 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        L2d:
            boolean r4 = r0 instanceof p000.eo1
            if (r4 == 0) goto L33
            java.lang.String r0 = ""
        L33:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = "music"
            boolean r4 = p000.q02.m4654(r0, r4, r2)
            if (r4 != 0) goto L172
            java.lang.String r4 = "audio"
            boolean r0 = p000.q02.m4654(r0, r4, r2)
            if (r0 != 0) goto L172
            java.lang.String r0 = "/music/"
            boolean r0 = p000.q02.m4654(r3, r0, r2)
            if (r0 != 0) goto L172
            java.lang.String r0 = "/audio/"
            boolean r0 = p000.q02.m4654(r3, r0, r2)
            if (r0 != 0) goto L172
            java.lang.String r0 = "mime=audio"
            boolean r0 = p000.q02.m4654(r3, r0, r2)
            if (r0 != 0) goto L172
            java.lang.String r0 = "mime_type=audio"
            boolean r0 = p000.q02.m4654(r3, r0, r2)
            if (r0 != 0) goto L172
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = p000.q02.m4654(r3, r0, r2)
            if (r0 != 0) goto L172
            java.lang.String r0 = ".mp3"
            boolean r0 = p000.q02.m4654(r3, r0, r2)
            if (r0 != 0) goto L172
            java.lang.String r0 = ".m4a"
            boolean r0 = p000.q02.m4654(r3, r0, r2)
            if (r0 != 0) goto L172
            java.lang.String r0 = ".aac"
            boolean r0 = p000.q02.m4654(r3, r0, r2)
            if (r0 != 0) goto L172
            java.lang.String r0 = ".ogg"
            boolean r0 = p000.q02.m4654(r3, r0, r2)
            if (r0 != 0) goto L172
            java.lang.String r0 = ".wav"
            boolean r0 = p000.q02.m4654(r3, r0, r2)
            if (r0 != 0) goto L172
            java.lang.String r0 = ".flac"
            boolean r0 = p000.q02.m4654(r3, r0, r2)
            if (r0 == 0) goto L9f
            goto L172
        L9f:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = p000.AbstractC0602nx.m4134(r0, r5, r0)
            java.lang.String r4 = ".jpg"
            boolean r4 = p000.q02.m4654(r3, r4, r2)
            if (r4 != 0) goto L172
            java.lang.String r4 = ".jpeg"
            boolean r4 = p000.q02.m4654(r3, r4, r2)
            if (r4 != 0) goto L172
            java.lang.String r4 = ".png"
            boolean r4 = p000.q02.m4654(r3, r4, r2)
            if (r4 != 0) goto L172
            java.lang.String r4 = ".webp"
            boolean r4 = p000.q02.m4654(r3, r4, r2)
            if (r4 != 0) goto L172
            java.lang.String r4 = ".heic"
            boolean r4 = p000.q02.m4654(r3, r4, r2)
            if (r4 != 0) goto L172
            java.lang.String r4 = ".heif"
            boolean r4 = p000.q02.m4654(r3, r4, r2)
            if (r4 != 0) goto L172
            java.lang.String r4 = ".avif"
            boolean r4 = p000.q02.m4654(r3, r4, r2)
            if (r4 != 0) goto L172
            java.lang.String r4 = "mime_type=image"
            boolean r4 = p000.q02.m4654(r3, r4, r2)
            if (r4 != 0) goto L172
            java.lang.String r4 = "image_type=image"
            boolean r4 = p000.q02.m4654(r3, r4, r2)
            if (r4 != 0) goto L172
            java.lang.String r4 = "image/"
            boolean r3 = p000.q02.m4654(r3, r4, r2)
            if (r3 == 0) goto Lf7
            goto L172
        Lf7:
            java.lang.String r5 = r5.toLowerCase(r0)
            r5.getClass()
            java.lang.String r0 = ".m3u8"
            boolean r0 = p000.q02.m4654(r5, r0, r2)
            if (r0 != 0) goto L172
            java.lang.String r0 = "m3u8"
            boolean r0 = p000.q02.m4654(r5, r0, r2)
            if (r0 != 0) goto L172
            java.lang.String r0 = ".mpd"
            boolean r0 = p000.q02.m4654(r5, r0, r2)
            if (r0 != 0) goto L172
            java.lang.String r0 = "dash"
            boolean r0 = p000.q02.m4654(r5, r0, r2)
            if (r0 != 0) goto L172
            java.lang.String r0 = ".m4s"
            boolean r0 = p000.q02.m4654(r5, r0, r2)
            if (r0 == 0) goto L127
            goto L172
        L127:
            java.lang.String r0 = ".mp4"
            boolean r0 = p000.q02.m4654(r5, r0, r2)
            if (r0 != 0) goto L171
            java.lang.String r0 = "format=mp4"
            boolean r0 = p000.q02.m4654(r5, r0, r2)
            if (r0 != 0) goto L171
            java.lang.String r0 = "mime=video/mp4"
            boolean r0 = p000.q02.m4654(r5, r0, r2)
            if (r0 != 0) goto L171
            java.lang.String r0 = "mime_type=video"
            boolean r0 = p000.q02.m4654(r5, r0, r2)
            if (r0 != 0) goto L171
            java.lang.String r0 = "video_mp4"
            boolean r0 = p000.q02.m4654(r5, r0, r2)
            if (r0 != 0) goto L171
            java.lang.String r0 = "/play/"
            boolean r0 = p000.q02.m4654(r5, r0, r2)
            if (r0 != 0) goto L171
            java.lang.String r0 = "playaddr"
            boolean r0 = p000.q02.m4654(r5, r0, r2)
            if (r0 != 0) goto L171
            java.lang.String r0 = "play_addr"
            boolean r0 = p000.q02.m4654(r5, r0, r2)
            if (r0 != 0) goto L171
            java.lang.String r0 = "/video/tos/"
            boolean r5 = p000.q02.m4654(r5, r0, r2)
            if (r5 == 0) goto L170
            goto L171
        L170:
            r1 = r2
        L171:
            return r1
        L172:
            return r2
    }

    /* JADX INFO: renamed from: π */
    public static p000.C0276f8 m2030(org.json.JSONObject r62) {
            r0 = r62
            java.lang.String r1 = "images"
            java.lang.String r2 = "video"
            r3 = 0
            java.lang.String r4 = "desc"
            java.lang.String r5 = ""
            java.lang.String r8 = r0.optString(r4, r5)     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = "aweme_id"
            java.lang.String r14 = r0.optString(r4, r3)     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = "create_time"
            r5 = 0
            long r24 = r0.optLong(r4, r5)     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = "author"
            org.json.JSONObject r4 = r0.optJSONObject(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r7 = "未知"
            if (r4 == 0) goto L35
            java.lang.String r9 = "nickname"
            java.lang.String r9 = r4.optString(r9, r7)     // Catch: java.lang.Throwable -> L32
            if (r9 != 0) goto L30
            goto L35
        L30:
            r7 = r9
            goto L35
        L32:
            r0 = move-exception
            goto L47f
        L35:
            if (r4 == 0) goto L3f
            java.lang.String r9 = "uid"
            java.lang.String r9 = r4.optString(r9)     // Catch: java.lang.Throwable -> L32
            r15 = r9
            goto L40
        L3f:
            r15 = r3
        L40:
            java.lang.String r9 = "null"
            if (r4 == 0) goto L5f
            java.lang.String r10 = "unique_id"
            java.lang.String r10 = r4.optString(r10)     // Catch: java.lang.Throwable -> L32
            if (r10 == 0) goto L5f
            boolean r11 = p000.q02.m4671(r10)     // Catch: java.lang.Throwable -> L32
            if (r11 != 0) goto L59
            boolean r11 = r10.equals(r9)     // Catch: java.lang.Throwable -> L32
            if (r11 != 0) goto L59
            goto L5a
        L59:
            r10 = r3
        L5a:
            if (r10 == 0) goto L5f
        L5c:
            r56 = r10
            goto L92
        L5f:
            if (r4 == 0) goto L76
            java.lang.String r10 = "uniqueId"
            java.lang.String r10 = r4.optString(r10)     // Catch: java.lang.Throwable -> L32
            if (r10 == 0) goto L76
            boolean r11 = p000.q02.m4671(r10)     // Catch: java.lang.Throwable -> L32
            if (r11 != 0) goto L76
            boolean r11 = r10.equals(r9)     // Catch: java.lang.Throwable -> L32
            if (r11 != 0) goto L76
            goto L77
        L76:
            r10 = r3
        L77:
            if (r10 != 0) goto L5c
            if (r4 == 0) goto L90
            java.lang.String r10 = "short_id"
            java.lang.String r10 = r4.optString(r10)     // Catch: java.lang.Throwable -> L32
            if (r10 == 0) goto L90
            boolean r11 = p000.q02.m4671(r10)     // Catch: java.lang.Throwable -> L32
            if (r11 != 0) goto L90
            boolean r11 = r10.equals(r9)     // Catch: java.lang.Throwable -> L32
            if (r11 != 0) goto L90
            goto L5c
        L90:
            r56 = r3
        L92:
            if (r4 == 0) goto L9d
            java.lang.String r10 = "sec_uid"
            java.lang.String r10 = r4.optString(r10)     // Catch: java.lang.Throwable -> L32
            r16 = r10
            goto L9f
        L9d:
            r16 = r3
        L9f:
            if (r4 == 0) goto Laa
            java.lang.String r10 = "signature"
            java.lang.String r10 = r4.optString(r10)     // Catch: java.lang.Throwable -> L32
            r17 = r10
            goto Lac
        Laa:
            r17 = r3
        Lac:
            r10 = 0
            if (r4 == 0) goto Lb8
            java.lang.String r11 = "follower_count"
            int r11 = r4.optInt(r11, r10)     // Catch: java.lang.Throwable -> L32
            r18 = r11
            goto Lba
        Lb8:
            r18 = r10
        Lba:
            if (r4 == 0) goto Lc5
            java.lang.String r11 = "following_count"
            int r11 = r4.optInt(r11, r10)     // Catch: java.lang.Throwable -> L32
            r19 = r11
            goto Lc7
        Lc5:
            r19 = r10
        Lc7:
            if (r4 == 0) goto Ld2
            java.lang.String r11 = "aweme_count"
            int r11 = r4.optInt(r11, r10)     // Catch: java.lang.Throwable -> L32
            r20 = r11
            goto Ld4
        Ld2:
            r20 = r10
        Ld4:
            if (r4 == 0) goto Ldf
            java.lang.String r11 = "verification_type"
            int r11 = r4.optInt(r11, r10)     // Catch: java.lang.Throwable -> L32
            r21 = r11
            goto Le1
        Ldf:
            r21 = r10
        Le1:
            if (r4 == 0) goto Lea
            java.lang.String r11 = "live_status"
            long r11 = r4.optLong(r11, r5)     // Catch: java.lang.Throwable -> L32
            goto Leb
        Lea:
            r11 = r5
        Leb:
            java.lang.String r13 = "ip_attribution"
            java.lang.String r13 = r0.optString(r13, r3)     // Catch: java.lang.Throwable -> L32
            if (r13 == 0) goto L100
            boolean r22 = p000.q02.m4671(r13)     // Catch: java.lang.Throwable -> L32
            if (r22 != 0) goto L100
            boolean r22 = r13.equals(r9)     // Catch: java.lang.Throwable -> L32
            if (r22 != 0) goto L100
            goto L101
        L100:
            r13 = r3
        L101:
            if (r4 == 0) goto L10a
            java.lang.String r13 = m2023(r4)     // Catch: java.lang.Throwable -> L32
        L107:
            r22 = r13
            goto L121
        L10a:
            if (r13 != 0) goto L107
            if (r15 == 0) goto L11f
            boolean r4 = p000.q02.m4671(r15)     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L115
            goto L11f
        L115:
            java.util.concurrent.ConcurrentHashMap r4 = p000.f31.f3741     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r4.get(r15)     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L32
            r13 = r4
            goto L107
        L11f:
            r13 = r3
            goto L107
        L121:
            java.lang.String r4 = "share_info"
            org.json.JSONObject r4 = r0.optJSONObject(r4)     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L131
            java.lang.String r13 = "share_url"
            java.lang.String r4 = r4.optString(r13)     // Catch: java.lang.Throwable -> L32
            r13 = r4
            goto L132
        L131:
            r13 = r3
        L132:
            org.json.JSONObject r4 = r0.optJSONObject(r2)     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L143
            r26 = r5
            java.lang.String r5 = "has_watermark"
            boolean r4 = r4.optBoolean(r5, r10)     // Catch: java.lang.Throwable -> L32
            r29 = r4
            goto L147
        L143:
            r26 = r5
            r29 = r10
        L147:
            java.lang.String r4 = "statistics"
            org.json.JSONObject r4 = r0.optJSONObject(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = "digg_count"
            java.lang.String r6 = "diggCount"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}     // Catch: java.lang.Throwable -> L32
            long r50 = m2026(r4, r5)     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = "comment_count"
            java.lang.String r6 = "commentCount"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}     // Catch: java.lang.Throwable -> L32
            long r52 = m2026(r4, r5)     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = "collect_count"
            java.lang.String r6 = "collectCount"
            java.lang.String r10 = "favorite_count"
            java.lang.String r3 = "favoriteCount"
            java.lang.String[] r3 = new java.lang.String[]{r5, r6, r10, r3}     // Catch: java.lang.Throwable -> L32
            long r54 = m2026(r4, r3)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "poi_info"
            org.json.JSONObject r3 = r0.optJSONObject(r3)     // Catch: java.lang.Throwable -> L32
            if (r3 != 0) goto L183
            java.lang.String r3 = "poi_struct"
            org.json.JSONObject r3 = r0.optJSONObject(r3)     // Catch: java.lang.Throwable -> L32
        L183:
            if (r3 == 0) goto L192
            java.lang.String r4 = "poi_name"
            java.lang.String r4 = r3.optString(r4)     // Catch: java.lang.Throwable -> L32
            r60 = r26
            r26 = r4
            r4 = r60
            goto L196
        L192:
            r4 = r26
            r26 = 0
        L196:
            java.lang.String r6 = "address_info"
            java.lang.String r10 = "city"
            if (r3 == 0) goto L1b0
            r27 = r4
            org.json.JSONObject r4 = r3.optJSONObject(r6)     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L1b2
            java.lang.String r4 = r4.optString(r10)     // Catch: java.lang.Throwable -> L32
            if (r4 != 0) goto L1ab
            goto L1b2
        L1ab:
            r30 = r27
            r27 = r4
            goto L1bd
        L1b0:
            r27 = r4
        L1b2:
            if (r3 == 0) goto L1b9
            java.lang.String r4 = r3.optString(r10)     // Catch: java.lang.Throwable -> L32
            goto L1ab
        L1b9:
            r30 = r27
            r27 = 0
        L1bd:
            java.lang.String r4 = "address"
            if (r3 == 0) goto L1d2
            org.json.JSONObject r5 = r3.optJSONObject(r6)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L1d2
            java.lang.String r5 = r5.optString(r4)     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L1ce
            goto L1d2
        L1ce:
            r28 = r5
        L1d0:
            r3 = 0
            goto L1de
        L1d2:
            if (r3 == 0) goto L1db
            java.lang.String r3 = r3.optString(r4)     // Catch: java.lang.Throwable -> L32
            r28 = r3
            goto L1d0
        L1db:
            r3 = 0
            r28 = 0
        L1de:
            java.lang.String r4 = r0.optString(r10, r3)     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L1f7
            boolean r3 = p000.q02.m4671(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 != 0) goto L1f7
            boolean r3 = r4.equals(r9)     // Catch: java.lang.Throwable -> L32
            if (r3 != 0) goto L1f7
            r60 = r30
            r30 = r4
            r4 = r60
            goto L1fb
        L1f7:
            r4 = r30
            r30 = 0
        L1fb:
            java.lang.String r3 = "region"
            r6 = 0
            java.lang.String r3 = r0.optString(r3, r6)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L213
            boolean r6 = p000.q02.m4671(r3)     // Catch: java.lang.Throwable -> L32
            if (r6 != 0) goto L213
            boolean r6 = r3.equals(r9)     // Catch: java.lang.Throwable -> L32
            if (r6 != 0) goto L213
            r31 = r3
            goto L215
        L213:
            r31 = 0
        L215:
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L32
            r3.<init>()     // Catch: java.lang.Throwable -> L32
            org.json.JSONObject r2 = r0.optJSONObject(r2)     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L2e4
            java.lang.String r6 = m2021(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.String r32 = "play_addr_h264"
            java.lang.String r33 = "play_addr"
            java.lang.String r34 = "play_addr_265"
            java.lang.String r35 = "play_addr_lowbr"
            java.lang.String r36 = "download_addr"
            java.lang.String r37 = "new_download_addr"
            java.lang.String[] r9 = new java.lang.String[]{r32, r33, r34, r35, r36, r37}     // Catch: java.lang.Throwable -> L32
            java.util.List r9 = p000.AbstractC1021yh.m6897(r9)     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L32
        L23c:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L32
            r32 = r4
            java.lang.String r4 = "http"
            java.lang.String r5 = "url_list"
            if (r10 == 0) goto L288
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L32
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L32
            org.json.JSONObject r10 = r2.optJSONObject(r10)     // Catch: java.lang.Throwable -> L32
            if (r10 != 0) goto L257
        L254:
            r4 = r32
            goto L23c
        L257:
            org.json.JSONArray r5 = r10.optJSONArray(r5)     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L25e
            goto L254
        L25e:
            int r10 = r5.length()     // Catch: java.lang.Throwable -> L32
            r34 = r6
            r6 = 0
        L265:
            if (r6 >= r10) goto L283
            r35 = r7
            java.lang.String r7 = r5.optString(r6)     // Catch: java.lang.Throwable -> L32
            r7.getClass()     // Catch: java.lang.Throwable -> L32
            r36 = r5
            r5 = 0
            boolean r37 = p000.x02.m6485(r7, r4, r5)     // Catch: java.lang.Throwable -> L32
            if (r37 == 0) goto L27c
            r3.add(r7)     // Catch: java.lang.Throwable -> L32
        L27c:
            int r6 = r6 + 1
            r7 = r35
            r5 = r36
            goto L265
        L283:
            r4 = r32
            r6 = r34
            goto L23c
        L288:
            r34 = r6
            r35 = r7
            java.lang.String r6 = "bit_rate"
            org.json.JSONArray r2 = r2.optJSONArray(r6)     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L2e2
            int r6 = r2.length()     // Catch: java.lang.Throwable -> L32
            r7 = 0
        L299:
            if (r7 >= r6) goto L2e2
            org.json.JSONObject r9 = r2.optJSONObject(r7)     // Catch: java.lang.Throwable -> L32
            if (r9 != 0) goto L2a7
        L2a1:
            r36 = r2
        L2a3:
            r37 = r5
            r2 = 0
            goto L2db
        L2a7:
            java.lang.String r10 = "play_addr"
            org.json.JSONObject r9 = r9.optJSONObject(r10)     // Catch: java.lang.Throwable -> L32
            if (r9 != 0) goto L2b0
            goto L2a1
        L2b0:
            org.json.JSONArray r9 = r9.optJSONArray(r5)     // Catch: java.lang.Throwable -> L32
            if (r9 != 0) goto L2b7
            goto L2a1
        L2b7:
            int r10 = r9.length()     // Catch: java.lang.Throwable -> L32
            r36 = r2
            r2 = 0
        L2be:
            if (r2 >= r10) goto L2a3
            r37 = r5
            java.lang.String r5 = r9.optString(r2)     // Catch: java.lang.Throwable -> L32
            r5.getClass()     // Catch: java.lang.Throwable -> L32
            r38 = r2
            r2 = 0
            boolean r23 = p000.x02.m6485(r5, r4, r2)     // Catch: java.lang.Throwable -> L32
            if (r23 == 0) goto L2d5
            r3.add(r5)     // Catch: java.lang.Throwable -> L32
        L2d5:
            int r5 = r38 + 1
            r2 = r5
            r5 = r37
            goto L2be
        L2db:
            int r7 = r7 + 1
            r2 = r36
            r5 = r37
            goto L299
        L2e2:
            r2 = 0
            goto L2eb
        L2e4:
            r32 = r4
            r35 = r7
            r2 = 0
            r34 = 0
        L2eb:
            if (r34 == 0) goto L2f3
            boolean r4 = p000.q02.m4671(r34)     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L2f7
        L2f3:
            java.lang.String r34 = m2021(r0)     // Catch: java.lang.Throwable -> L32
        L2f7:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L32
            r4.<init>()     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r5 = r3.iterator()     // Catch: java.lang.Throwable -> L32
        L300:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r6 == 0) goto L317
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L32
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L32
            boolean r7 = m2029(r7)     // Catch: java.lang.Throwable -> L32
            if (r7 == 0) goto L300
            r4.add(r6)     // Catch: java.lang.Throwable -> L32
            goto L300
        L317:
            java.util.Set r4 = p000.AbstractC0984xh.m6670(r4)     // Catch: java.lang.Throwable -> L32
            java.util.List r4 = p000.AbstractC0984xh.m6666(r4)     // Catch: java.lang.Throwable -> L32
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L32
            int r6 = r4.size()     // Catch: java.lang.Throwable -> L32
            if (r5 == r6) goto L355
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L32
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r6.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.String r7 = "DYHelper: [VIDEO-JSON-FILTER] awemeId="
            r6.append(r7)     // Catch: java.lang.Throwable -> L32
            r6.append(r14)     // Catch: java.lang.Throwable -> L32
            java.lang.String r7 = ", raw="
            r6.append(r7)     // Catch: java.lang.Throwable -> L32
            r6.append(r3)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = ", valid="
            r6.append(r3)     // Catch: java.lang.Throwable -> L32
            r6.append(r5)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L32
            p000.C0888ux.m5985(r3)     // Catch: java.lang.Throwable -> L32
        L355:
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L32
            r3.<init>()     // Catch: java.lang.Throwable -> L32
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L32
            r5.<init>()     // Catch: java.lang.Throwable -> L32
            org.json.JSONArray r6 = r0.optJSONArray(r1)     // Catch: java.lang.Throwable -> L32
            if (r6 != 0) goto L374
            java.lang.String r6 = "image_post_info"
            org.json.JSONObject r6 = r0.optJSONObject(r6)     // Catch: java.lang.Throwable -> L32
            if (r6 == 0) goto L372
            org.json.JSONArray r1 = r6.optJSONArray(r1)     // Catch: java.lang.Throwable -> L32
            goto L375
        L372:
            r1 = 0
            goto L375
        L374:
            r1 = r6
        L375:
            if (r1 == 0) goto L3c8
            int r6 = r1.length()     // Catch: java.lang.Throwable -> L32
            r7 = r2
        L37c:
            if (r7 >= r6) goto L3c8
            org.json.JSONObject r9 = r1.optJSONObject(r7)     // Catch: java.lang.Throwable -> L32
            if (r9 != 0) goto L385
            goto L3c4
        L385:
            java.lang.String r10 = m2020(r9)     // Catch: java.lang.Throwable -> L32
            if (r10 == 0) goto L395
            boolean r23 = p000.q02.m4671(r10)     // Catch: java.lang.Throwable -> L32
            if (r23 == 0) goto L392
            goto L395
        L392:
            r5.add(r10)     // Catch: java.lang.Throwable -> L32
        L395:
            java.lang.String r9 = m2022(r9)     // Catch: java.lang.Throwable -> L32
            if (r9 == 0) goto L3a6
            boolean r10 = p000.q02.m4671(r9)     // Catch: java.lang.Throwable -> L32
            if (r10 == 0) goto L3a2
            goto L3a6
        L3a2:
            r3.add(r9)     // Catch: java.lang.Throwable -> L32
            goto L3c4
        L3a6:
            int r9 = r7 + 1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r10.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "DYHelper: [IMG-JSON] 第"
            r10.append(r2)     // Catch: java.lang.Throwable -> L32
            r10.append(r9)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "张图片未提取到有效URL, awemeId="
            r10.append(r2)     // Catch: java.lang.Throwable -> L32
            r10.append(r14)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = r10.toString()     // Catch: java.lang.Throwable -> L32
            p000.C0888ux.m5985(r2)     // Catch: java.lang.Throwable -> L32
        L3c4:
            int r7 = r7 + 1
            r2 = 0
            goto L37c
        L3c8:
            boolean r1 = r5.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L3f7
            boolean r1 = r3.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L3f7
            boolean r1 = r4.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L3f7
            boolean r0 = m2028(r0)     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L3f7
            r5.addAll(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r0.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "DYHelper: [ANIM-JSON] explicit live-photo marker, use root video, awemeId="
            r0.append(r1)     // Catch: java.lang.Throwable -> L32
            r0.append(r14)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L32
            p000.C0888ux.m5985(r0)     // Catch: java.lang.Throwable -> L32
        L3f7:
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L400
            h8 r0 = p000.EnumC0350h8.f4617     // Catch: java.lang.Throwable -> L32
            goto L411
        L400:
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L409
            h8 r0 = p000.EnumC0350h8.f4616     // Catch: java.lang.Throwable -> L32
            goto L411
        L409:
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L47c
            h8 r0 = p000.EnumC0350h8.f4615     // Catch: java.lang.Throwable -> L32
        L411:
            r8.getClass()     // Catch: java.lang.Throwable -> L32
            boolean r1 = r4.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L41c
            r9 = 0
            goto L41d
        L41c:
            r9 = r4
        L41d:
            java.util.List r1 = p000.AbstractC0984xh.m6666(r3)     // Catch: java.lang.Throwable -> L32
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L429
            r10 = 0
            goto L42a
        L429:
            r10 = r1
        L42a:
            if (r34 != 0) goto L434
            java.lang.Object r1 = p000.AbstractC0984xh.m6639(r3)     // Catch: java.lang.Throwable -> L32
            r34 = r1
            java.lang.String r34 = (java.lang.String) r34     // Catch: java.lang.Throwable -> L32
        L434:
            int r1 = (r11 > r32 ? 1 : (r11 == r32 ? 0 : -1))
            if (r1 <= 0) goto L43c
            r1 = 1
            r23 = r1
            goto L43e
        L43c:
            r23 = 0
        L43e:
            java.util.List r1 = p000.AbstractC0984xh.m6666(r5)     // Catch: java.lang.Throwable -> L32
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L44b
            r39 = 0
            goto L44d
        L44b:
            r39 = r1
        L44d:
            f8 r6 = new f8     // Catch: java.lang.Throwable -> L32
            r57 = -1090519040(0xffffffffbf000000, float:-0.5)
            r58 = 511(0x1ff, float:7.16E-43)
            r32 = 0
            r33 = 0
            r11 = r34
            r34 = 0
            r7 = r35
            r35 = 0
            r36 = 0
            r37 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r52, r54, r56, r57, r58)     // Catch: java.lang.Throwable -> L32
            return r6
        L47c:
            r59 = 0
            return r59
        L47f:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "DYHelper: parseAwemeJson 失败: "
            p000.AbstractC0602nx.m4142(r1, r0)
            r59 = 0
            return r59
    }

    /* JADX INFO: renamed from: ρ */
    public static java.lang.String m2031(java.lang.Object r6) {
            r0 = 2097152(0x200000, double:1.036131E-317)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 0
            r2 = 0
            java.lang.String r3 = "peekBody"
            java.lang.Object[] r4 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L22
            java.lang.Object r3 = p000.qe0.m4869(r6, r3, r4)     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = "string"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L22
            java.lang.Object r3 = p000.qe0.m4869(r3, r4, r5)     // Catch: java.lang.Throwable -> L22
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L22
            if (r4 == 0) goto L2c
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L22
            return r3
        L22:
            java.lang.String r3 = "body"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r6 = p000.qe0.m4869(r6, r3, r4)     // Catch: java.lang.Throwable -> L5d
            if (r6 != 0) goto L2d
        L2c:
            return r1
        L2d:
            java.lang.String r3 = "source"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r6 = p000.qe0.m4869(r6, r3, r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = "request"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L5d
            p000.qe0.m4869(r6, r3, r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = "buffer"
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r6 = p000.qe0.m4869(r6, r0, r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = "clone"
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r6 = p000.qe0.m4869(r6, r0, r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = "readUtf8"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r6 = p000.qe0.m4869(r6, r0, r2)     // Catch: java.lang.Throwable -> L5d
            boolean r0 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L5d
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L5d
            r1 = r6
        L5d:
            return r1
    }

    /* JADX INFO: renamed from: σ */
    public static boolean m2032(java.lang.String r0, java.lang.String r1) {
            boolean r1 = p000.q02.m4671(r1)
            if (r1 == 0) goto L8
            goto Lee
        L8:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = p000.AbstractC0602nx.m4134(r1, r0, r1)
            java.lang.String r1 = "host"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L18
            goto Lee
        L18:
            java.lang.String r1 = "content-length"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L22
            goto Lee
        L22:
            java.lang.String r1 = "content-type"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L2c
            goto Lee
        L2c:
            java.lang.String r1 = "accept-encoding"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L36
            goto Lee
        L36:
            java.lang.String r1 = "connection"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L40
            goto Lee
        L40:
            java.lang.String r1 = "range"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L4a
            goto Lee
        L4a:
            java.lang.String r1 = "x-gorgon"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L54
            goto Lee
        L54:
            java.lang.String r1 = "x-khronos"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L5e
            goto Lee
        L5e:
            java.lang.String r1 = "x-argus"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L68
            goto Lee
        L68:
            java.lang.String r1 = "x-ladon"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L72
            goto Lee
        L72:
            java.lang.String r1 = "x-medusa"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L7c
            goto Lee
        L7c:
            java.lang.String r1 = "x-helios"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L85
            goto Lee
        L85:
            java.lang.String r1 = "user-agent"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto Lf0
            java.lang.String r1 = "cookie"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto Lf0
            java.lang.String r1 = "referer"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto Lf0
            java.lang.String r1 = "origin"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto Lf0
            java.lang.String r1 = "x-tt-token"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto Lf0
            java.lang.String r1 = "passport-sdk-version"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto Lf0
            java.lang.String r1 = "sdk-version"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto Lf0
            java.lang.String r1 = "x-ss-cookie"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto Lf0
            java.lang.String r1 = "x-ss-stub"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto Lf0
            java.lang.String r1 = "x-ss-req-ticket"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto Lf0
            java.lang.String r1 = "x-tt-dt"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto Lf0
            java.lang.String r1 = "x-tt-trace-id"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto Lf0
            java.lang.String r1 = "x-common-params-v2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lee
            goto Lf0
        Lee:
            r0 = 0
            return r0
        Lf0:
            r0 = 1
            return r0
    }
}
