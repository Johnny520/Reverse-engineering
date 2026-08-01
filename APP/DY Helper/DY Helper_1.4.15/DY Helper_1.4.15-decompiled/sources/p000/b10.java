package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class b10 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicReference f1403 = null;

    /* JADX INFO: renamed from: β */
    public static volatile boolean f1404;

    /* JADX INFO: renamed from: γ */
    public static volatile java.lang.String f1405;

    /* JADX INFO: renamed from: δ */
    public static boolean f1406;

    /* JADX INFO: renamed from: ε */
    public static volatile java.lang.String f1407;

    /* JADX INFO: renamed from: ζ */
    public static volatile java.lang.String f1408;

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            p000.b10.f1403 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m654(java.lang.Object r5) {
            java.lang.String r0 = "B"
            java.lang.String r1 = "n"
            java.lang.String r2 = "w"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}     // Catch: java.lang.Throwable -> L83
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)     // Catch: java.lang.Throwable -> L83
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L83
        L12:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L83
            r2 = 0
            if (r1 == 0) goto L71
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L83
            java.lang.Object r1 = p000.qe0.m4879(r5, r1)     // Catch: java.lang.Throwable -> L41
            if (r1 != 0) goto L27
        L25:
            r1 = r2
            goto L67
        L27:
            boolean r3 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L41
            if (r3 != 0) goto L25
            boolean r3 = r1 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L41
            if (r3 != 0) goto L25
            boolean r3 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L34
            goto L25
        L34:
            java.lang.String r3 = "uid"
            java.lang.Object r1 = p000.qe0.m4879(r1, r3)     // Catch: java.lang.Throwable -> L41
            boolean r3 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L43
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L41
            goto L44
        L41:
            r1 = move-exception
            goto L61
        L43:
            r1 = r2
        L44:
            if (r1 == 0) goto L25
            boolean r3 = p000.q02.m4671(r1)     // Catch: java.lang.Throwable -> L41
            if (r3 != 0) goto L25
            r3 = 0
        L4d:
            int r4 = r1.length()     // Catch: java.lang.Throwable -> L41
            if (r3 >= r4) goto L67
            char r4 = r1.charAt(r3)     // Catch: java.lang.Throwable -> L41
            boolean r4 = java.lang.Character.isDigit(r4)     // Catch: java.lang.Throwable -> L41
            if (r4 != 0) goto L5e
            goto L25
        L5e:
            int r3 = r3 + 1
            goto L4d
        L61:
            eo1 r3 = new eo1     // Catch: java.lang.Throwable -> L83
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L83
            r1 = r3
        L67:
            boolean r3 = r1 instanceof p000.eo1     // Catch: java.lang.Throwable -> L83
            if (r3 == 0) goto L6c
            goto L6d
        L6c:
            r2 = r1
        L6d:
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L83
            if (r2 == 0) goto L12
        L71:
            if (r2 != 0) goto L74
            goto L83
        L74:
            java.lang.String r5 = p000.b10.f1405     // Catch: java.lang.Throwable -> L83
            boolean r5 = r2.equals(r5)     // Catch: java.lang.Throwable -> L83
            if (r5 != 0) goto L83
            p000.b10.f1405 = r2     // Catch: java.lang.Throwable -> L83
            java.util.LinkedHashMap r5 = p000.d72.f2936     // Catch: java.lang.Throwable -> L83
            r5.clear()     // Catch: java.lang.Throwable -> L83
        L83:
            return
    }

    /* JADX INFO: renamed from: β */
    public static p000.y00 m655(java.lang.Object r14) {
            java.util.concurrent.ConcurrentHashMap r0 = p000.C0239e8.f3440     // Catch: java.lang.Throwable -> L7
            d8 r14 = p000.C0239e8.m1868(r14)     // Catch: java.lang.Throwable -> L7
            goto Lf
        L7:
            r0 = move-exception
            r14 = r0
            eo1 r0 = new eo1
            r0.<init>(r14)
            r14 = r0
        Lf:
            java.lang.Throwable r0 = p000.fo1.m2190(r14)
            if (r0 != 0) goto L3c
            d8 r14 = (p000.C0203d8) r14
            java.lang.String r0 = r14.f2937
            boolean r1 = p000.q02.m4671(r0)
            if (r1 == 0) goto L21
            java.lang.String r0 = "未知"
        L21:
            r2 = r0
            java.lang.String r3 = r14.f2938
            java.lang.String r4 = r14.f2939
            java.lang.String r5 = r14.f2940
            java.lang.String r6 = r14.f2941
            int r7 = r14.f2942
            int r8 = r14.f2943
            int r9 = r14.f2944
            int r10 = r14.f2945
            java.lang.String r11 = r14.f2946
            long r12 = r14.f2947
            y00 r1 = new y00
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
        L3c:
            java.lang.String r14 = r0.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DYHelper: 作者信息解析失败: "
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            p000.C0888ux.m5985(r14)
            y00 r0 = new y00
            r9 = 0
            r11 = 0
            java.lang.String r1 = "未知"
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.String m656(java.lang.Object r17) {
            r1 = r17
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r3 = 0
            java.lang.String r0 = "video"
            java.lang.Object r4 = p000.qe0.m4879(r1, r0)     // Catch: java.lang.Throwable -> L69
            if (r4 == 0) goto L69
            java.lang.String r5 = "cover"
            java.lang.String r6 = "_cover"
            java.lang.String r7 = "originCover"
            java.lang.String r8 = "_originCover"
            java.lang.String r9 = "dynamicCover"
            java.lang.String r10 = "_dynamicCover"
            java.lang.String r11 = "animatedCover"
            java.lang.String r12 = "_animatedCover"
            java.lang.String r13 = "bigThumbs"
            java.lang.String r14 = "coverMedium"
            java.lang.String r15 = "coverLarge"
            java.lang.String[] r0 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15}     // Catch: java.lang.Throwable -> L69
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r5 = r0.iterator()     // Catch: java.lang.Throwable -> L69
        L32:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L69
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = p000.qe0.m4879(r4, r0)     // Catch: java.lang.Throwable -> L43
            goto L4a
        L43:
            r0 = move-exception
            eo1 r6 = new eo1     // Catch: java.lang.Throwable -> L69
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L69
            r0 = r6
        L4a:
            boolean r6 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L69
            if (r6 == 0) goto L4f
            r0 = r3
        L4f:
            java.util.List r0 = m663(r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L32
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L69
        L59:
            boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r6 == 0) goto L32
            java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L69
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L69
            r2.add(r6)     // Catch: java.lang.Throwable -> L69
            goto L59
        L69:
            java.lang.String r15 = "coverUrl"
            java.lang.String r16 = "cover_url"
            java.lang.String r7 = "cover"
            java.lang.String r8 = "_cover"
            java.lang.String r9 = "originCover"
            java.lang.String r10 = "_originCover"
            java.lang.String r11 = "dynamicCover"
            java.lang.String r12 = "_dynamicCover"
            java.lang.String r13 = "videoCover"
            java.lang.String r14 = "video_cover"
            java.lang.String[] r0 = new java.lang.String[]{r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r4 = r0.iterator()
        L89:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lc0
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = p000.qe0.m4879(r1, r0)     // Catch: java.lang.Throwable -> L9a
            goto La1
        L9a:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        La1:
            boolean r5 = r0 instanceof p000.eo1
            if (r5 == 0) goto La6
            r0 = r3
        La6:
            java.util.List r0 = m663(r0)
            if (r0 == 0) goto L89
            java.util.Iterator r0 = r0.iterator()
        Lb0:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L89
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            r2.add(r5)
            goto Lb0
        Lc0:
            java.util.List r0 = p000.el0.f3589
            java.lang.String r0 = p000.el0.m1934(r2)
            if (r0 != 0) goto Le6
            java.util.Iterator r0 = r2.iterator()
        Lcc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Le3
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = "http"
            r5 = 1
            boolean r2 = p000.x02.m6485(r2, r4, r5)
            if (r2 == 0) goto Lcc
            r3 = r1
        Le3:
            r0 = r3
            java.lang.String r0 = (java.lang.String) r0
        Le6:
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static p000.f00 m657(java.lang.Object r9) {
            java.lang.String r0 = "ipAttribution"
            java.lang.String r2 = m671(r9, r0)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = "city"
            java.lang.String r3 = m671(r9, r0)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = "region"
            java.lang.String r4 = m671(r9, r0)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = "segmentLatitudes"
            java.lang.String r5 = m671(r9, r0)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = "segmentLongitudes"
            java.lang.String r6 = m671(r9, r0)     // Catch: java.lang.Throwable -> L3a
            r0 = 0
            java.lang.String r1 = "getPoiStruct"
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L28
            java.lang.Object r9 = p000.qe0.m4869(r9, r1, r7)     // Catch: java.lang.Throwable -> L28
            goto L30
        L28:
            java.lang.String r1 = "poiAnchorStruct"
            java.lang.Object r9 = p000.qe0.m4879(r9, r1)     // Catch: java.lang.Throwable -> L2f
            goto L30
        L2f:
            r9 = 0
        L30:
            if (r9 == 0) goto L33
            r0 = 1
        L33:
            r7 = r0
            f00 r1 = new f00     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L3a
            goto L46
        L3a:
            f00 r2 = new f00
            r8 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1 = r2
        L46:
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public static p000.d62 m658(java.lang.Object r10) {
            java.lang.String r0 = "LJIIJJI"
            java.lang.String r1 = "address"
            r2 = 0
            r3 = 0
            java.lang.String r4 = "getPoiStruct"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r10 = p000.qe0.m4869(r10, r4, r5)     // Catch: java.lang.Throwable -> Lf
            goto L17
        Lf:
            java.lang.String r4 = "poiAnchorStruct"
            java.lang.Object r10 = p000.qe0.m4879(r10, r4)     // Catch: java.lang.Throwable -> L16
            goto L17
        L16:
            r10 = r3
        L17:
            if (r10 != 0) goto L1f
            d62 r10 = new d62     // Catch: java.lang.Throwable -> L70
            r10.<init>(r3, r3, r3)     // Catch: java.lang.Throwable -> L70
            return r10
        L1f:
            java.lang.String r4 = "poiName"
            java.lang.String r4 = m671(r10, r4)     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = "poiBusinessAreaName"
            java.lang.String r5 = m671(r10, r5)     // Catch: java.lang.Throwable -> L70
            java.lang.Object r6 = p000.qe0.m4879(r10, r1)     // Catch: java.lang.Throwable -> L54
            if (r6 == 0) goto L54
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r7 = p000.qe0.m4869(r6, r0, r7)     // Catch: java.lang.Throwable -> L3e
            boolean r8 = r7 instanceof java.lang.String     // Catch: java.lang.Throwable -> L3e
            if (r8 == 0) goto L3e
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L3e
            goto L3f
        L3e:
            r7 = r3
        L3f:
            java.lang.String r8 = "LIZLLL"
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r6 = p000.qe0.m4869(r6, r8, r9)     // Catch: java.lang.Throwable -> L4e
            boolean r8 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> L4e
            if (r8 == 0) goto L4e
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L4e
            goto L4f
        L4e:
            r6 = r3
        L4f:
            if (r6 != 0) goto L52
            goto L55
        L52:
            r7 = r6
            goto L55
        L54:
            r7 = r3
        L55:
            java.lang.Object r10 = p000.qe0.m4879(r10, r1)     // Catch: java.lang.Throwable -> L6a
            if (r10 == 0) goto L6a
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r10 = p000.qe0.m4869(r10, r0, r1)     // Catch: java.lang.Throwable -> L6a
            boolean r0 = r10 instanceof java.lang.String     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L69
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L6a
            r5 = r10
            goto L6a
        L69:
            r5 = r3
        L6a:
            d62 r10 = new d62     // Catch: java.lang.Throwable -> L70
            r10.<init>(r4, r5, r7)     // Catch: java.lang.Throwable -> L70
            goto L75
        L70:
            d62 r10 = new d62
            r10.<init>(r3, r3, r3)
        L75:
            return r10
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.String m659(java.lang.Object r4) {
            java.lang.String r0 = "shareUrl"
            java.lang.String r1 = "shareInfo"
            java.lang.Object r1 = p000.qe0.m4879(r4, r1)     // Catch: java.lang.Throwable -> L11
            java.lang.Object r1 = p000.qe0.m4879(r1, r0)     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = m660(r1)     // Catch: java.lang.Throwable -> L11
            goto L18
        L11:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L18:
            boolean r2 = r1 instanceof p000.eo1
            r3 = 0
            if (r2 == 0) goto L1e
            r1 = r3
        L1e:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L3b
            java.lang.Object r4 = p000.qe0.m4879(r4, r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = m660(r4)     // Catch: java.lang.Throwable -> L2b
            goto L32
        L2b:
            r4 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r4)
            r4 = r0
        L32:
            boolean r0 = r4 instanceof p000.eo1
            if (r0 == 0) goto L37
            goto L38
        L37:
            r3 = r4
        L38:
            r1 = r3
            java.lang.String r1 = (java.lang.String) r1
        L3b:
            return r1
    }

    /* JADX INFO: renamed from: η */
    public static final java.lang.String m660(java.lang.Object r3) {
            boolean r0 = r3 instanceof java.lang.String
            r1 = 0
            if (r0 == 0) goto L8
            java.lang.String r3 = (java.lang.String) r3
            goto L9
        L8:
            r3 = r1
        L9:
            if (r3 == 0) goto L1f
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L1f
            java.lang.String r0 = "http"
            r2 = 1
            boolean r0 = p000.x02.m6485(r3, r0, r2)
            if (r0 == 0) goto L1f
            return r3
        L1f:
            return r1
    }

    /* JADX INFO: renamed from: θ */
    public static p000.z00 m661(java.lang.Object r14) {
            java.lang.String r0 = "statistics"
            java.lang.Object r14 = p000.qe0.m4879(r14, r0)     // Catch: java.lang.Throwable -> L7
            goto Lf
        L7:
            r0 = move-exception
            r14 = r0
            eo1 r0 = new eo1
            r0.<init>(r14)
            r14 = r0
        Lf:
            boolean r0 = r14 instanceof p000.eo1
            if (r0 == 0) goto L14
            r14 = 0
        L14:
            z00 r0 = new z00
            java.lang.String r1 = "digg_count"
            java.lang.String r2 = "d"
            java.lang.String r3 = "diggCount"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
            long r1 = m662(r14, r1)
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L2b
            goto L2c
        L2b:
            r1 = r3
        L2c:
            java.lang.String r5 = "comment_count"
            java.lang.String r6 = "b"
            java.lang.String r7 = "commentCount"
            java.lang.String[] r5 = new java.lang.String[]{r7, r5, r6}
            long r5 = m662(r14, r5)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L3f
            goto L40
        L3f:
            r5 = r3
        L40:
            java.lang.String r7 = "favorite_count"
            java.lang.String r8 = "j"
            java.lang.String r9 = "collectCount"
            java.lang.String r10 = "collect_count"
            java.lang.String r11 = "favoriteCount"
            java.lang.String[] r7 = new java.lang.String[]{r9, r10, r11, r7, r8}
            long r7 = m662(r14, r7)
            int r14 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r14 <= 0) goto L59
            r3 = r5
            r5 = r7
            goto L5c
        L59:
            r12 = r5
            r5 = r3
            r3 = r12
        L5c:
            r0.<init>(r1, r3, r5)
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public static final long m662(java.lang.Object r5, java.lang.String... r6) {
            int r0 = r6.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L55
            r2 = r6[r1]
            r3 = 0
            if (r5 != 0) goto Lb
            r2 = r3
            goto L17
        Lb:
            java.lang.Object r2 = p000.qe0.m4879(r5, r2)     // Catch: java.lang.Throwable -> L10
            goto L17
        L10:
            r2 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r2)
            r2 = r4
        L17:
            boolean r4 = r2 instanceof p000.eo1
            if (r4 == 0) goto L1c
            goto L1d
        L1c:
            r3 = r2
        L1d:
            boolean r2 = r3 instanceof java.lang.Long
            if (r2 == 0) goto L28
            java.lang.Number r3 = (java.lang.Number) r3
            long r5 = r3.longValue()
            return r5
        L28:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 == 0) goto L34
            java.lang.Number r3 = (java.lang.Number) r3
            int r5 = r3.intValue()
            long r5 = (long) r5
            return r5
        L34:
            boolean r2 = r3 instanceof java.lang.Number
            if (r2 == 0) goto L3f
            java.lang.Number r3 = (java.lang.Number) r3
            long r5 = r3.longValue()
            return r5
        L3f:
            boolean r2 = r3 instanceof java.lang.String
            if (r2 == 0) goto L52
            java.lang.String r3 = (java.lang.String) r3
            r2 = 10
            java.lang.Long r2 = p000.x02.m6489(r3, r2)
            if (r2 == 0) goto L52
            long r5 = r2.longValue()
            return r5
        L52:
            int r1 = r1 + 1
            goto L2
        L55:
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: κ */
    public static java.util.List m663(java.lang.Object r10) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1 = 0
            if (r10 != 0) goto L9
            return r1
        L9:
            boolean r2 = r10 instanceof java.lang.String
            if (r2 == 0) goto L14
            java.lang.String r10 = (java.lang.String) r10
            m665(r0, r10)
            goto L85
        L14:
            boolean r2 = r10 instanceof java.util.List
            if (r2 == 0) goto L1e
            java.util.List r10 = (java.util.List) r10
            m664(r0, r10)
            goto L85
        L1e:
            boolean r2 = r10 instanceof java.lang.Object[]
            if (r2 == 0) goto L2c
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            java.util.List r10 = p000.AbstractC0312g7.m2262(r10)
            m664(r0, r10)
            goto L85
        L2c:
            java.lang.String r8 = "uri"
            java.lang.String r9 = "url"
            java.lang.String r2 = "urlList"
            java.lang.String r3 = "_urlList"
            java.lang.String r4 = "url_list"
            java.lang.String r5 = "downUrlList"
            java.lang.String r6 = "_downUrlList"
            java.lang.String r7 = "down_url_list"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.List r2 = p000.AbstractC1021yh.m6897(r2)
            java.util.Iterator r2 = r2.iterator()
        L48:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L7a
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = p000.qe0.m4879(r10, r3)     // Catch: java.lang.Throwable -> L48
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L62
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L48
            m665(r0, r3)     // Catch: java.lang.Throwable -> L48
            goto L48
        L62:
            boolean r4 = r3 instanceof java.util.List     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L6c
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L48
            m664(r0, r3)     // Catch: java.lang.Throwable -> L48
            goto L48
        L6c:
            boolean r4 = r3 instanceof java.lang.Object[]     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L48
            java.lang.Object[] r3 = (java.lang.Object[]) r3     // Catch: java.lang.Throwable -> L48
            java.util.List r3 = p000.AbstractC0312g7.m2262(r3)     // Catch: java.lang.Throwable -> L48
            m664(r0, r3)     // Catch: java.lang.Throwable -> L48
            goto L48
        L7a:
            java.util.List r10 = m670(r10)
            if (r10 == 0) goto L81
            goto L82
        L81:
            r10 = r1
        L82:
            m664(r0, r10)
        L85:
            java.util.List r10 = p000.AbstractC0984xh.m6666(r0)
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L90
            goto L91
        L90:
            r1 = r10
        L91:
            return r1
    }

    /* JADX INFO: renamed from: λ */
    public static final void m664(java.util.LinkedHashSet r2, java.util.List r3) {
            if (r3 == 0) goto L34
            java.util.Iterator r3 = r3.iterator()
        L6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r3.next()
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L1a
            java.lang.String r0 = (java.lang.String) r0
            m665(r2, r0)
            goto L6
        L1a:
            java.util.List r0 = m663(r0)
            if (r0 == 0) goto L6
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r2.add(r1)
            goto L24
        L34:
            return
    }

    /* JADX INFO: renamed from: μ */
    public static final void m665(java.util.LinkedHashSet r2, java.lang.String r3) {
            if (r3 == 0) goto L1c
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L1c
            java.lang.String r0 = "http"
            r1 = 1
            boolean r0 = p000.x02.m6485(r3, r0, r1)
            if (r0 == 0) goto L16
            goto L17
        L16:
            r3 = 0
        L17:
            if (r3 == 0) goto L1c
            r2.add(r3)
        L1c:
            return
    }

    /* JADX INFO: renamed from: ν */
    public static java.util.ArrayList m666(java.lang.Object r6) {
            r0 = 0
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Throwable -> Lad
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> Lad
            if (r1 != 0) goto Lc
            goto L40
        Lc:
            kx r2 = p000.EnumC0491kx.f6199     // Catch: java.lang.Throwable -> Lad
            java.lang.String r3 = "bit_rate"
            java.lang.String r4 = "java.util.List"
            java.lang.Object r1 = m675(r6, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> Lad
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> Lad
            if (r2 == 0) goto L1d
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> Lad
            goto L1e
        L1d:
            r1 = r0
        L1e:
            if (r1 != 0) goto L32
            java.lang.String r1 = "bitRateList"
            java.lang.Object r6 = p000.qe0.m4879(r6, r1)     // Catch: java.lang.Throwable -> Lad
            boolean r1 = r6 instanceof java.util.List     // Catch: java.lang.Throwable -> Lad
            if (r1 == 0) goto L2e
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> Lad
            r1 = r6
            goto L2f
        L2e:
            r1 = r0
        L2f:
            if (r1 != 0) goto L32
            goto L40
        L32:
            boolean r6 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lad
            if (r6 == 0) goto L39
            goto L40
        L39:
            r6 = 0
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> Lad
            if (r1 != 0) goto L41
        L40:
            return r0
        L41:
            java.lang.String r2 = "playAddr"
            java.lang.Object r2 = p000.qe0.m4879(r1, r2)     // Catch: java.lang.Throwable -> L50
            if (r2 != 0) goto L51
            java.lang.String r2 = "_playAddr"
            java.lang.Object r2 = p000.qe0.m4879(r1, r2)     // Catch: java.lang.Throwable -> L50
            goto L51
        L50:
            r2 = r0
        L51:
            if (r2 == 0) goto Lad
            java.lang.String r1 = "urlList"
            java.lang.Object r1 = p000.qe0.m4879(r2, r1)     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            java.util.List r1 = m670(r2)     // Catch: java.lang.Throwable -> Lad
        L5e:
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> Lad
            if (r2 == 0) goto L65
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> Lad
            goto L66
        L65:
            r1 = r0
        L66:
            if (r1 == 0) goto Lad
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lad
            r2.<init>()     // Catch: java.lang.Throwable -> Lad
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lad
        L71:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> Lad
            if (r3 == 0) goto L83
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> Lad
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lad
            if (r4 == 0) goto L71
            r2.add(r3)     // Catch: java.lang.Throwable -> Lad
            goto L71
        L83:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lad
            r1.<init>()     // Catch: java.lang.Throwable -> Lad
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lad
        L8c:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Lad
            if (r3 == 0) goto La5
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Lad
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lad
            java.lang.String r5 = "http"
            boolean r4 = p000.x02.m6485(r4, r5, r6)     // Catch: java.lang.Throwable -> Lad
            if (r4 == 0) goto L8c
            r1.add(r3)     // Catch: java.lang.Throwable -> Lad
            goto L8c
        La5:
            boolean r6 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lad
            if (r6 == 0) goto Lac
            goto Lad
        Lac:
            r0 = r1
        Lad:
            return r0
    }

    /* JADX INFO: renamed from: ξ */
    public static java.util.List m667(java.lang.Object r0, java.lang.String r1) {
            java.lang.Object r0 = p000.qe0.m4879(r0, r1)     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto L7
            goto Lc
        L7:
            java.util.List r0 = m663(r0)     // Catch: java.lang.Throwable -> Lc
            return r0
        Lc:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ο */
    public static java.util.List m668(java.lang.Object r0, java.lang.ClassLoader r1, p000.EnumC0491kx r2, java.lang.String r3, java.lang.String r4) {
            if (r1 != 0) goto L3
            goto L9
        L3:
            java.lang.Object r0 = m675(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            java.util.List r0 = m663(r0)
            return r0
    }

    /* JADX INFO: renamed from: π */
    public static p000.a10 m669(java.lang.Object r9) {
            java.lang.String r0 = "~79504AF3C39B11021DAC8210F33C72EF521D7099C0A60F0CD8057C9CA539AF329A0030D8C8B05C9AC10C29CF5CAFEBBC86"
            r1 = 0
            r2 = 0
            java.lang.String r3 = "video"
            java.lang.Object r9 = p000.qe0.m4879(r9, r3)     // Catch: java.lang.Throwable -> L187
            if (r9 != 0) goto L12
            a10 r9 = new a10     // Catch: java.lang.Throwable -> L187
            r9.<init>(r2, r1)     // Catch: java.lang.Throwable -> L187
            return r9
        L12:
            java.lang.Class r3 = r9.getClass()     // Catch: java.lang.Throwable -> L187
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L187
            if (r3 == 0) goto L39
            kx r4 = p000.EnumC0491kx.f6202     // Catch: java.lang.Throwable -> L187
            java.lang.String r5 = "has_watermark"
            java.lang.String r6 = "boolean"
            java.lang.Object r4 = m675(r9, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L187
            if (r4 == 0) goto L39
            boolean r5 = r4 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L187
            if (r5 == 0) goto L2f
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L187
            goto L30
        L2f:
            r4 = r2
        L30:
            if (r4 == 0) goto L37
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L187
            goto L4d
        L37:
            r4 = r1
            goto L4d
        L39:
            java.lang.String r4 = "hasWaterMark"
            java.lang.Object r4 = p000.qe0.m4879(r9, r4)     // Catch: java.lang.Throwable -> L37
            boolean r5 = r4 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L37
            if (r5 == 0) goto L46
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L37
            goto L47
        L46:
            r4 = r2
        L47:
            if (r4 == 0) goto L37
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L37
        L4d:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L187
            r5.<init>()     // Catch: java.lang.Throwable -> L187
            kx r6 = p000.EnumC0491kx.f6195     // Catch: java.lang.Throwable -> L187
            java.lang.String r7 = "play_addr_h264"
            java.lang.String r8 = p000.jf0.m2957(r0)     // Catch: java.lang.Throwable -> L187
            java.util.List r6 = m668(r9, r3, r6, r7, r8)     // Catch: java.lang.Throwable -> L187
            if (r6 == 0) goto L63
            r5.addAll(r6)     // Catch: java.lang.Throwable -> L187
        L63:
            boolean r6 = r5.isEmpty()     // Catch: java.lang.Throwable -> L187
            if (r6 == 0) goto L7a
            kx r6 = p000.EnumC0491kx.f6196     // Catch: java.lang.Throwable -> L187
            java.lang.String r7 = "play_addr"
            java.lang.String r8 = p000.jf0.m2957(r0)     // Catch: java.lang.Throwable -> L187
            java.util.List r6 = m668(r9, r3, r6, r7, r8)     // Catch: java.lang.Throwable -> L187
            if (r6 == 0) goto L7a
            r5.addAll(r6)     // Catch: java.lang.Throwable -> L187
        L7a:
            boolean r6 = r5.isEmpty()     // Catch: java.lang.Throwable -> L187
            if (r6 == 0) goto L91
            kx r6 = p000.EnumC0491kx.f6197     // Catch: java.lang.Throwable -> L187
            java.lang.String r7 = "play_addr_265"
            java.lang.String r0 = p000.jf0.m2957(r0)     // Catch: java.lang.Throwable -> L187
            java.util.List r0 = m668(r9, r3, r6, r7, r0)     // Catch: java.lang.Throwable -> L187
            if (r0 == 0) goto L91
            r5.addAll(r0)     // Catch: java.lang.Throwable -> L187
        L91:
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L187
            java.lang.String r6 = "~7924EBBB26E5F66AE51C20F0B6D7913B6350E34D1800219366D00F3ECE76895F8E4CEECA58736F4E112BCC66"
            if (r0 == 0) goto Laa
            kx r0 = p000.EnumC0491kx.f6198     // Catch: java.lang.Throwable -> L187
            java.lang.String r7 = "play_addr_lowbr"
            java.lang.String r8 = p000.jf0.m2957(r6)     // Catch: java.lang.Throwable -> L187
            java.util.List r0 = m668(r9, r3, r0, r7, r8)     // Catch: java.lang.Throwable -> L187
            if (r0 == 0) goto Laa
            r5.addAll(r0)     // Catch: java.lang.Throwable -> L187
        Laa:
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L187
            if (r0 == 0) goto Lb9
            java.util.ArrayList r0 = m666(r9)     // Catch: java.lang.Throwable -> L187
            if (r0 == 0) goto Lb9
            r5.addAll(r0)     // Catch: java.lang.Throwable -> L187
        Lb9:
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L187
            if (r0 == 0) goto Ld0
            kx r0 = p000.EnumC0491kx.f6200     // Catch: java.lang.Throwable -> L187
            java.lang.String r7 = "download_addr"
            java.lang.String r8 = p000.jf0.m2957(r6)     // Catch: java.lang.Throwable -> L187
            java.util.List r0 = m668(r9, r3, r0, r7, r8)     // Catch: java.lang.Throwable -> L187
            if (r0 == 0) goto Ld0
            r5.addAll(r0)     // Catch: java.lang.Throwable -> L187
        Ld0:
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L187
            if (r0 == 0) goto Le7
            kx r0 = p000.EnumC0491kx.f6201     // Catch: java.lang.Throwable -> L187
            java.lang.String r7 = "new_download_addr"
            java.lang.String r6 = p000.jf0.m2957(r6)     // Catch: java.lang.Throwable -> L187
            java.util.List r0 = m668(r9, r3, r0, r7, r6)     // Catch: java.lang.Throwable -> L187
            if (r0 == 0) goto Le7
            r5.addAll(r0)     // Catch: java.lang.Throwable -> L187
        Le7:
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L187
            if (r0 == 0) goto Lf8
            java.lang.String r0 = "_h264PlayAddr"
            java.util.List r0 = m667(r9, r0)     // Catch: java.lang.Throwable -> L187
            if (r0 == 0) goto Lf8
            r5.addAll(r0)     // Catch: java.lang.Throwable -> L187
        Lf8:
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L187
            if (r0 == 0) goto L109
            java.lang.String r0 = "_playAddr"
            java.util.List r0 = m667(r9, r0)     // Catch: java.lang.Throwable -> L187
            if (r0 == 0) goto L109
            r5.addAll(r0)     // Catch: java.lang.Throwable -> L187
        L109:
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L187
            if (r0 == 0) goto L11a
            java.lang.String r0 = "_playAddrH265"
            java.util.List r0 = m667(r9, r0)     // Catch: java.lang.Throwable -> L187
            if (r0 == 0) goto L11a
            r5.addAll(r0)     // Catch: java.lang.Throwable -> L187
        L11a:
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L187
            if (r0 == 0) goto L12b
            java.lang.String r0 = "playAddrLowbr"
            java.util.List r0 = m667(r9, r0)     // Catch: java.lang.Throwable -> L187
            if (r0 == 0) goto L12b
            r5.addAll(r0)     // Catch: java.lang.Throwable -> L187
        L12b:
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L187
            if (r0 == 0) goto L13c
            java.lang.String r0 = "downloadAddr"
            java.util.List r0 = m667(r9, r0)     // Catch: java.lang.Throwable -> L187
            if (r0 == 0) goto L13c
            r5.addAll(r0)     // Catch: java.lang.Throwable -> L187
        L13c:
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L187
            if (r0 == 0) goto L14d
            java.lang.String r0 = "newDownloadAddr"
            java.util.List r9 = m667(r9, r0)     // Catch: java.lang.Throwable -> L187
            if (r9 == 0) goto L14d
            r5.addAll(r9)     // Catch: java.lang.Throwable -> L187
        L14d:
            if (r4 != 0) goto L179
            boolean r9 = r5.isEmpty()     // Catch: java.lang.Throwable -> L187
            if (r9 == 0) goto L156
            goto L177
        L156:
            java.util.Iterator r9 = r5.iterator()     // Catch: java.lang.Throwable -> L187
        L15a:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L187
            if (r0 == 0) goto L177
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> L187
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L187
            java.lang.String r3 = "playwm"
            boolean r3 = p000.q02.m4654(r0, r3, r1)     // Catch: java.lang.Throwable -> L187
            if (r3 != 0) goto L179
            java.lang.String r3 = "watermark"
            boolean r0 = p000.q02.m4654(r0, r3, r1)     // Catch: java.lang.Throwable -> L187
            if (r0 == 0) goto L15a
            goto L179
        L177:
            r9 = r1
            goto L17a
        L179:
            r9 = 1
        L17a:
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L187
            if (r0 == 0) goto L181
            r5 = r2
        L181:
            a10 r0 = new a10     // Catch: java.lang.Throwable -> L187
            r0.<init>(r5, r9)     // Catch: java.lang.Throwable -> L187
            goto L18c
        L187:
            a10 r0 = new a10
            r0.<init>(r2, r1)
        L18c:
            return r0
    }

    /* JADX INFO: renamed from: ρ */
    public static java.util.List m670(java.lang.Object r5) {
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.Throwable -> L56
        L4:
            if (r0 == 0) goto L56
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Throwable -> L56
            if (r1 != 0) goto L56
            java.lang.reflect.Field[] r1 = r0.getDeclaredFields()     // Catch: java.lang.Throwable -> L56
            τ r1 = p000.h62.m2434(r1)     // Catch: java.lang.Throwable -> L56
        L16:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L51
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L56
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: java.lang.Throwable -> L56
            java.lang.Class<java.util.List> r3 = java.util.List.class
            java.lang.Class r4 = r2.getType()     // Catch: java.lang.Throwable -> L56
            boolean r3 = r3.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L16
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L56
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L56
            boolean r3 = r2 instanceof java.util.List     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L16
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L56
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L56
            if (r3 != 0) goto L16
            r3 = r2
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L56
            java.lang.Object r3 = p000.AbstractC0984xh.m6638(r3)     // Catch: java.lang.Throwable -> L56
            boolean r3 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L16
            java.util.List r2 = (java.util.List) r2
            return r2
        L51:
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> L56
            goto L4
        L56:
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: σ */
    public static java.lang.String m671(java.lang.Object r0, java.lang.String r1) {
            java.lang.Object r0 = p000.qe0.m4879(r0, r1)     // Catch: java.lang.Throwable -> Lb
            boolean r1 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Lb
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lb
            return r0
        Lb:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: τ */
    public static boolean m672() {
            boolean r0 = p000.b10.f1404
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: υ */
    public static p000.C0276f8 m673(java.lang.Object r61) {
            r0 = r61
            h8 r1 = p000.EnumC0350h8.f4617
            jz r2 = p000.C0450jz.f5672
            r0.getClass()
            java.lang.String r3 = "desc"
            java.lang.String r3 = m671(r0, r3)     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r4 = "无描述"
            if (r3 != 0) goto L14
            r3 = r4
        L14:
            java.lang.String r5 = "aid"
            java.lang.String r5 = m671(r0, r5)     // Catch: java.lang.Throwable -> L8f5
            if (r5 != 0) goto L2a
            java.lang.String r5 = "awemeId"
            java.lang.String r5 = m671(r0, r5)     // Catch: java.lang.Throwable -> L8f5
            if (r5 != 0) goto L2a
            java.lang.String r5 = "id"
            java.lang.String r5 = m671(r0, r5)     // Catch: java.lang.Throwable -> L8f5
        L2a:
            java.lang.String r8 = "createTime"
            java.lang.Object r8 = p000.qe0.m4879(r0, r8)     // Catch: java.lang.Throwable -> L57
            boolean r9 = r8 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L57
            if (r9 == 0) goto L3b
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> L57
            long r8 = r8.longValue()     // Catch: java.lang.Throwable -> L57
            goto L54
        L3b:
            boolean r9 = r8 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L57
            if (r9 == 0) goto L47
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> L57
            int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L57
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L57
            goto L54
        L47:
            boolean r9 = r8 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L57
            if (r9 == 0) goto L52
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> L57
            long r8 = r8.longValue()     // Catch: java.lang.Throwable -> L57
            goto L54
        L52:
            r8 = 0
        L54:
            r28 = r8
            goto L59
        L57:
            r28 = 0
        L59:
            y00 r8 = m655(r0)     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r9 = r8.f12410     // Catch: java.lang.Throwable -> L8f5
            p000.b10.f1407 = r9     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r9 = r8.f12411     // Catch: java.lang.Throwable -> L8f5
            p000.b10.f1408 = r9     // Catch: java.lang.Throwable -> L8f5
            pu0 r9 = p000.pu0.f8717     // Catch: java.lang.Throwable -> L8f5
            lu0 r9 = r9.m4639(r0)     // Catch: java.lang.Throwable -> L8f5
            df0 r10 = p000.C0966x.m6427(r0)     // Catch: java.lang.Throwable -> L8f5
            a10 r11 = m669(r0)     // Catch: java.lang.Throwable -> L8f5
            k7 r12 = p000.AbstractC0978xb.m6594(r0)     // Catch: java.lang.Throwable -> L8f5
            java.util.ArrayList r13 = p000.AbstractC1021yh.m6850(r0)     // Catch: java.lang.Throwable -> L8f5
            java.util.List r14 = p000.AbstractC1021yh.m6849(r0)     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r15 = m656(r0)     // Catch: java.lang.Throwable -> L8f5
            r16 = 0
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L8f5
            r6.<init>()     // Catch: java.lang.Throwable -> L8f5
            if (r9 == 0) goto L91
            r18 = 0
            java.lang.String r7 = r9.f6789     // Catch: java.lang.Throwable -> L8f5
            goto L95
        L91:
            r18 = 0
            r7 = r18
        L95:
            java.lang.String r0 = "http"
            if (r7 == 0) goto L9f
            boolean r20 = p000.q02.m4671(r7)     // Catch: java.lang.Throwable -> L8f5
            if (r20 == 0) goto La3
        L9f:
            r20 = r1
            r1 = 0
            goto Laf
        La3:
            r20 = r1
            r1 = 0
            boolean r19 = p000.x02.m6485(r7, r0, r1)     // Catch: java.lang.Throwable -> L8f5
            if (r19 == 0) goto Laf
            r6.add(r7)     // Catch: java.lang.Throwable -> L8f5
        Laf:
            i8 r7 = r10.f3113     // Catch: java.lang.Throwable -> L8f5
            if (r7 == 0) goto Lb6
            java.util.List r7 = r7.f4956     // Catch: java.lang.Throwable -> L8f5
            goto Lb8
        Lb6:
            r7 = r18
        Lb8:
            m674(r6, r7)     // Catch: java.lang.Throwable -> L8f5
            i8 r7 = r10.f3113     // Catch: java.lang.Throwable -> L8f5
            if (r7 == 0) goto Lc2
            java.util.List r7 = r7.f4955     // Catch: java.lang.Throwable -> L8f5
            goto Lc4
        Lc2:
            r7 = r18
        Lc4:
            m674(r6, r7)     // Catch: java.lang.Throwable -> L8f5
            i8 r7 = r10.f3113     // Catch: java.lang.Throwable -> L8f5
            if (r7 == 0) goto Lce
            java.util.List r7 = r7.f4957     // Catch: java.lang.Throwable -> L8f5
            goto Ld0
        Lce:
            r7 = r18
        Ld0:
            m674(r6, r7)     // Catch: java.lang.Throwable -> L8f5
            java.util.List r7 = r11.m13()     // Catch: java.lang.Throwable -> L8f5
            m674(r6, r7)     // Catch: java.lang.Throwable -> L8f5
            java.util.List r6 = p000.AbstractC0984xh.m6666(r6)     // Catch: java.lang.Throwable -> L8f5
            boolean r7 = r6.isEmpty()     // Catch: java.lang.Throwable -> L8f5
            if (r7 == 0) goto Le6
            r6 = r18
        Le6:
            if (r9 == 0) goto L11e
            java.util.List r19 = r9.m3662()     // Catch: java.lang.Throwable -> L8f5
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8f5
            r1.<init>()     // Catch: java.lang.Throwable -> L8f5
            java.util.Iterator r19 = r19.iterator()     // Catch: java.lang.Throwable -> L8f5
        Lf5:
            boolean r22 = r19.hasNext()     // Catch: java.lang.Throwable -> L8f5
            if (r22 == 0) goto L115
            java.lang.Object r7 = r19.next()     // Catch: java.lang.Throwable -> L8f5
            r23 = r2
            r2 = r7
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L8f5
            r24 = r3
            r3 = 1
            boolean r2 = p000.x02.m6485(r2, r0, r3)     // Catch: java.lang.Throwable -> L8f5
            if (r2 == 0) goto L110
            r1.add(r7)     // Catch: java.lang.Throwable -> L8f5
        L110:
            r2 = r23
            r3 = r24
            goto Lf5
        L115:
            r23 = r2
            r24 = r3
            java.util.List r1 = p000.AbstractC0984xh.m6633(r1)     // Catch: java.lang.Throwable -> L8f5
            goto L124
        L11e:
            r23 = r2
            r24 = r3
            r1 = r18
        L124:
            if (r1 != 0) goto L128
            r1 = r23
        L128:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L8f5
            if (r2 == 0) goto L142
            if (r9 == 0) goto L13c
            java.lang.String r1 = r9.f6789     // Catch: java.lang.Throwable -> L8f5
            if (r1 == 0) goto L13c
            r3 = 1
            boolean r2 = p000.x02.m6485(r1, r0, r3)     // Catch: java.lang.Throwable -> L8f5
            if (r2 == 0) goto L13c
            goto L13e
        L13c:
            r1 = r18
        L13e:
            java.util.List r1 = p000.AbstractC1021yh.m6898(r1)     // Catch: java.lang.Throwable -> L8f5
        L142:
            if (r9 == 0) goto L178
            java.util.List r2 = r9.m3661()     // Catch: java.lang.Throwable -> L8f5
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8f5
            r3.<init>()     // Catch: java.lang.Throwable -> L8f5
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L8f5
        L151:
            boolean r7 = r2.hasNext()     // Catch: java.lang.Throwable -> L8f5
            if (r7 == 0) goto L171
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L8f5
            r19 = r2
            r2 = r7
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L8f5
            r25 = r4
            r4 = 1
            boolean r2 = p000.x02.m6485(r2, r0, r4)     // Catch: java.lang.Throwable -> L8f5
            if (r2 == 0) goto L16c
            r3.add(r7)     // Catch: java.lang.Throwable -> L8f5
        L16c:
            r2 = r19
            r4 = r25
            goto L151
        L171:
            r25 = r4
            java.util.List r2 = p000.AbstractC0984xh.m6633(r3)     // Catch: java.lang.Throwable -> L8f5
            goto L17c
        L178:
            r25 = r4
            r2 = r18
        L17c:
            if (r2 != 0) goto L180
            r2 = r23
        L180:
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L8f5
            if (r3 == 0) goto L19a
            if (r9 == 0) goto L194
            java.lang.String r2 = r9.f6790     // Catch: java.lang.Throwable -> L8f5
            if (r2 == 0) goto L194
            r3 = 1
            boolean r4 = p000.x02.m6485(r2, r0, r3)     // Catch: java.lang.Throwable -> L8f5
            if (r4 == 0) goto L194
            goto L196
        L194:
            r2 = r18
        L196:
            java.util.List r2 = p000.AbstractC1021yh.m6898(r2)     // Catch: java.lang.Throwable -> L8f5
        L19a:
            if (r9 == 0) goto L2b8
            java.util.List r3 = r9.m3660()     // Catch: java.lang.Throwable -> L8f5
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8f5
            r4.<init>()     // Catch: java.lang.Throwable -> L8f5
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch: java.lang.Throwable -> L8f5
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L8f5
        L1ab:
            boolean r7 = r3.hasNext()     // Catch: java.lang.Throwable -> L8f5
            if (r7 == 0) goto L2ab
            java.lang.Object r7 = r3.next()     // Catch: java.lang.Throwable -> L8f5
            mu0 r7 = (p000.mu0) r7     // Catch: java.lang.Throwable -> L8f5
            r19 = r2
            java.lang.String r2 = r7.m3885()     // Catch: java.lang.Throwable -> L8f5
            if (r2 == 0) goto L1ce
            r26 = r3
            r3 = 1
            boolean r22 = p000.x02.m6485(r2, r0, r3)     // Catch: java.lang.Throwable -> L8f5
            if (r22 == 0) goto L1cb
            r32 = r2
            goto L1d2
        L1cb:
            r32 = r18
            goto L1d2
        L1ce:
            r26 = r3
            r3 = 1
            goto L1cb
        L1d2:
            java.lang.String r2 = r7.m3882()     // Catch: java.lang.Throwable -> L8f5
            if (r2 == 0) goto L1e1
            boolean r22 = p000.x02.m6485(r2, r0, r3)     // Catch: java.lang.Throwable -> L8f5
            if (r22 == 0) goto L1e1
            r33 = r2
            goto L1e3
        L1e1:
            r33 = r18
        L1e3:
            java.lang.String r2 = r7.m3881()     // Catch: java.lang.Throwable -> L8f5
            if (r2 == 0) goto L1f2
            boolean r27 = p000.x02.m6485(r2, r0, r3)     // Catch: java.lang.Throwable -> L8f5
            if (r27 == 0) goto L1f2
            r34 = r2
            goto L1f4
        L1f2:
            r34 = r18
        L1f4:
            java.util.List r2 = r7.m3886()     // Catch: java.lang.Throwable -> L8f5
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8f5
            r3.<init>()     // Catch: java.lang.Throwable -> L8f5
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L8f5
        L201:
            boolean r27 = r2.hasNext()     // Catch: java.lang.Throwable -> L8f5
            if (r27 == 0) goto L225
            r27 = r2
            java.lang.Object r2 = r27.next()     // Catch: java.lang.Throwable -> L8f5
            r37 = r5
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L8f5
            r38 = r6
            r6 = 1
            boolean r5 = p000.x02.m6485(r5, r0, r6)     // Catch: java.lang.Throwable -> L8f5
            if (r5 == 0) goto L21e
            r3.add(r2)     // Catch: java.lang.Throwable -> L8f5
        L21e:
            r2 = r27
            r5 = r37
            r6 = r38
            goto L201
        L225:
            r37 = r5
            r38 = r6
            java.util.List r2 = p000.AbstractC0984xh.m6633(r3)     // Catch: java.lang.Throwable -> L8f5
            java.util.List r3 = r7.m3883()     // Catch: java.lang.Throwable -> L8f5
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8f5
            r5.<init>()     // Catch: java.lang.Throwable -> L8f5
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L8f5
        L23a:
            boolean r6 = r3.hasNext()     // Catch: java.lang.Throwable -> L8f5
            if (r6 == 0) goto L25a
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Throwable -> L8f5
            r27 = r2
            r2 = r6
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L8f5
            r30 = r3
            r3 = 1
            boolean r2 = p000.x02.m6485(r2, r0, r3)     // Catch: java.lang.Throwable -> L8f5
            if (r2 == 0) goto L255
            r5.add(r6)     // Catch: java.lang.Throwable -> L8f5
        L255:
            r2 = r27
            r3 = r30
            goto L23a
        L25a:
            r27 = r2
            java.util.List r2 = p000.AbstractC0984xh.m6633(r5)     // Catch: java.lang.Throwable -> L8f5
            if (r32 != 0) goto L26b
            boolean r3 = r27.isEmpty()     // Catch: java.lang.Throwable -> L8f5
            if (r3 == 0) goto L26b
            r2 = r18
            goto L29c
        L26b:
            int r31 = r7.m3884()     // Catch: java.lang.Throwable -> L8f5
            boolean r3 = r27.isEmpty()     // Catch: java.lang.Throwable -> L8f5
            if (r3 == 0) goto L277
            r27 = r23
        L277:
            boolean r3 = r27.isEmpty()     // Catch: java.lang.Throwable -> L8f5
            if (r3 != 0) goto L280
            r35 = r27
            goto L282
        L280:
            r35 = r18
        L282:
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L8f5
            if (r3 == 0) goto L28a
            r2 = r23
        L28a:
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L8f5
            if (r3 != 0) goto L293
            r36 = r2
            goto L295
        L293:
            r36 = r18
        L295:
            qu0 r30 = new qu0     // Catch: java.lang.Throwable -> L8f5
            r30.<init>(r31, r32, r33, r34, r35, r36)     // Catch: java.lang.Throwable -> L8f5
            r2 = r30
        L29c:
            if (r2 == 0) goto L2a1
            r4.add(r2)     // Catch: java.lang.Throwable -> L8f5
        L2a1:
            r2 = r19
            r3 = r26
            r5 = r37
            r6 = r38
            goto L1ab
        L2ab:
            r19 = r2
            r37 = r5
            r38 = r6
            boolean r2 = r4.isEmpty()     // Catch: java.lang.Throwable -> L8f5
            if (r2 == 0) goto L2c0
            goto L2be
        L2b8:
            r19 = r2
            r37 = r5
            r38 = r6
        L2be:
            r4 = r18
        L2c0:
            if (r14 == 0) goto L2e8
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8f5
            r2.<init>()     // Catch: java.lang.Throwable -> L8f5
            java.util.Iterator r3 = r14.iterator()     // Catch: java.lang.Throwable -> L8f5
        L2cb:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L8f5
            if (r5 == 0) goto L2e3
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L8f5
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L8f5
            r7 = 1
            boolean r6 = p000.x02.m6485(r6, r0, r7)     // Catch: java.lang.Throwable -> L8f5
            if (r6 == 0) goto L2cb
            r2.add(r5)     // Catch: java.lang.Throwable -> L8f5
            goto L2cb
        L2e3:
            java.util.List r2 = p000.AbstractC0984xh.m6633(r2)     // Catch: java.lang.Throwable -> L8f5
            goto L2ea
        L2e8:
            r2 = r18
        L2ea:
            if (r2 != 0) goto L2ee
            r2 = r23
        L2ee:
            java.util.List r3 = r10.m1737()     // Catch: java.lang.Throwable -> L8f5
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8f5
            r6 = 10
            int r6 = p000.AbstractC1021yh.m6889(r3, r6)     // Catch: java.lang.Throwable -> L8f5
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L8f5
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L8f5
            r6 = 0
        L302:
            boolean r7 = r3.hasNext()     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r14 = "DYHelper"
            if (r7 == 0) goto L402
            java.lang.Object r7 = r3.next()     // Catch: java.lang.Throwable -> L8f5
            int r26 = r6 + 1
            if (r6 < 0) goto L3fe
            g8 r7 = (p000.C0313g8) r7     // Catch: java.lang.Throwable -> L8f5
            if (r13 == 0) goto L32b
            java.lang.Object r6 = p000.AbstractC0984xh.m6641(r6, r13)     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L8f5
            if (r6 == 0) goto L32b
            r27 = r3
            r3 = 1
            boolean r30 = p000.x02.m6485(r6, r0, r3)     // Catch: java.lang.Throwable -> L8f5
            if (r30 == 0) goto L328
            goto L32e
        L328:
            r6 = r18
            goto L32e
        L32b:
            r27 = r3
            goto L328
        L32e:
            if (r6 == 0) goto L336
            boolean r3 = p000.q02.m4671(r6)     // Catch: java.lang.Throwable -> L8f5
            if (r3 == 0) goto L33c
        L336:
            r30 = r4
            r32 = r11
            goto L3f1
        L33c:
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L8f5
            r3.<init>()     // Catch: java.lang.Throwable -> L8f5
            r3.add(r6)     // Catch: java.lang.Throwable -> L8f5
            r30 = r4
            java.util.List r4 = r7.f4274     // Catch: java.lang.Throwable -> L8f5
            if (r4 != 0) goto L34c
            r4 = r23
        L34c:
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L8f5
        L350:
            boolean r31 = r4.hasNext()     // Catch: java.lang.Throwable -> L8f5
            if (r31 == 0) goto L366
            java.lang.Object r31 = r4.next()     // Catch: java.lang.Throwable -> L8f5
            r32 = r4
            r4 = r31
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L8f5
            r3.add(r4)     // Catch: java.lang.Throwable -> L8f5
            r4 = r32
            goto L350
        L366:
            java.util.List r4 = r7.f4273     // Catch: java.lang.Throwable -> L8f5
            if (r4 != 0) goto L36c
            r4 = r23
        L36c:
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L8f5
        L370:
            boolean r31 = r4.hasNext()     // Catch: java.lang.Throwable -> L8f5
            if (r31 == 0) goto L386
            java.lang.Object r31 = r4.next()     // Catch: java.lang.Throwable -> L8f5
            r32 = r4
            r4 = r31
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L8f5
            r3.add(r4)     // Catch: java.lang.Throwable -> L8f5
            r4 = r32
            goto L370
        L386:
            java.util.List r4 = r7.f4272     // Catch: java.lang.Throwable -> L8f5
            if (r4 != 0) goto L38c
            r4 = r23
        L38c:
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L8f5
        L390:
            boolean r31 = r4.hasNext()     // Catch: java.lang.Throwable -> L8f5
            if (r31 == 0) goto L3a6
            java.lang.Object r31 = r4.next()     // Catch: java.lang.Throwable -> L8f5
            r32 = r4
            r4 = r31
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L8f5
            r3.add(r4)     // Catch: java.lang.Throwable -> L8f5
            r4 = r32
            goto L390
        L3a6:
            java.util.List r4 = p000.AbstractC1021yh.m6896(r6)     // Catch: java.lang.Throwable -> L8f5
            r31 = r3
            java.util.List r3 = p000.AbstractC1021yh.m6896(r6)     // Catch: java.lang.Throwable -> L8f5
            r32 = r11
            java.util.List r11 = p000.AbstractC1021yh.m6896(r6)     // Catch: java.lang.Throwable -> L8f5
            g8 r3 = p000.C0313g8.m2266(r7, r4, r3, r11)     // Catch: java.lang.Throwable -> L8f5
            boolean r4 = p000.C0888ux.m5984()     // Catch: java.lang.Throwable -> L8f5
            if (r4 == 0) goto L3ed
            int r4 = r7.f4267     // Catch: java.lang.Throwable -> L8f5
            int r7 = r31.size()     // Catch: java.lang.Throwable -> L8f5
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8f5
            r11.<init>()     // Catch: java.lang.Throwable -> L8f5
            r31 = r3
            java.lang.String r3 = "[downoload dev][FEED-AWEME-PARSE] page="
            r11.append(r3)     // Catch: java.lang.Throwable -> L8f5
            r11.append(r4)     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r3 = ", legacyStill="
            r11.append(r3)     // Catch: java.lang.Throwable -> L8f5
            r11.append(r6)     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r3 = ", mergedStillCandidates="
            r11.append(r3)     // Catch: java.lang.Throwable -> L8f5
            r11.append(r7)     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r3 = r11.toString()     // Catch: java.lang.Throwable -> L8f5
            p000.C0888ux.m5975(r14, r3)     // Catch: java.lang.Throwable -> L8f5
            goto L3ef
        L3ed:
            r31 = r3
        L3ef:
            r7 = r31
        L3f1:
            r5.add(r7)     // Catch: java.lang.Throwable -> L8f5
            r6 = r26
            r3 = r27
            r4 = r30
            r11 = r32
            goto L302
        L3fe:
            p000.AbstractC1021yh.m6917()     // Catch: java.lang.Throwable -> L8f5
            throw r18     // Catch: java.lang.Throwable -> L8f5
        L402:
            r30 = r4
            r32 = r11
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8f5
            r3.<init>()     // Catch: java.lang.Throwable -> L8f5
            java.util.Iterator r4 = r5.iterator()     // Catch: java.lang.Throwable -> L8f5
        L40f:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L8f5
            if (r6 == 0) goto L431
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L8f5
            g8 r6 = (p000.C0313g8) r6     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r6 = r6.m2267()     // Catch: java.lang.Throwable -> L8f5
            if (r6 == 0) goto L429
            r7 = 1
            boolean r11 = p000.x02.m6485(r6, r0, r7)     // Catch: java.lang.Throwable -> L8f5
            if (r11 == 0) goto L429
            goto L42b
        L429:
            r6 = r18
        L42b:
            if (r6 == 0) goto L40f
            r3.add(r6)     // Catch: java.lang.Throwable -> L8f5
            goto L40f
        L431:
            java.util.List r3 = p000.AbstractC0984xh.m6633(r3)     // Catch: java.lang.Throwable -> L8f5
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8f5
            r4.<init>()     // Catch: java.lang.Throwable -> L8f5
            java.util.Iterator r6 = r5.iterator()     // Catch: java.lang.Throwable -> L8f5
        L43e:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L8f5
            if (r7 == 0) goto L55a
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L8f5
            g8 r7 = (p000.C0313g8) r7     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r11 = r7.m2267()     // Catch: java.lang.Throwable -> L8f5
            if (r11 == 0) goto L45f
            r26 = r5
            r5 = 1
            boolean r22 = p000.x02.m6485(r11, r0, r5)     // Catch: java.lang.Throwable -> L8f5
            if (r22 == 0) goto L45c
            r41 = r11
            goto L463
        L45c:
            r41 = r18
            goto L463
        L45f:
            r26 = r5
            r5 = 1
            goto L45c
        L463:
            java.lang.String r11 = r7.m2268()     // Catch: java.lang.Throwable -> L8f5
            if (r11 == 0) goto L472
            boolean r27 = p000.x02.m6485(r11, r0, r5)     // Catch: java.lang.Throwable -> L8f5
            if (r27 == 0) goto L472
            r42 = r11
            goto L474
        L472:
            r42 = r18
        L474:
            i8 r5 = r7.f4275     // Catch: java.lang.Throwable -> L8f5
            if (r5 == 0) goto L47b
            java.util.List r11 = r5.f4955     // Catch: java.lang.Throwable -> L8f5
            goto L47d
        L47b:
            r11 = r18
        L47d:
            if (r11 != 0) goto L481
            r11 = r23
        L481:
            if (r5 == 0) goto L486
            java.util.List r5 = r5.f4957     // Catch: java.lang.Throwable -> L8f5
            goto L488
        L486:
            r5 = r18
        L488:
            if (r5 != 0) goto L48c
            r5 = r23
        L48c:
            java.util.ArrayList r5 = p000.AbstractC0984xh.m6651(r11, r5)     // Catch: java.lang.Throwable -> L8f5
            i8 r11 = r7.f4275     // Catch: java.lang.Throwable -> L8f5
            if (r11 == 0) goto L497
            java.util.List r11 = r11.f4956     // Catch: java.lang.Throwable -> L8f5
            goto L499
        L497:
            r11 = r18
        L499:
            if (r11 != 0) goto L49d
            r11 = r23
        L49d:
            java.util.ArrayList r5 = p000.AbstractC0984xh.m6651(r5, r11)     // Catch: java.lang.Throwable -> L8f5
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8f5
            r11.<init>()     // Catch: java.lang.Throwable -> L8f5
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L8f5
        L4aa:
            boolean r27 = r5.hasNext()     // Catch: java.lang.Throwable -> L8f5
            if (r27 == 0) goto L4ce
            r27 = r5
            java.lang.Object r5 = r27.next()     // Catch: java.lang.Throwable -> L8f5
            r31 = r6
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L8f5
            r33 = r12
            r12 = 1
            boolean r6 = p000.x02.m6485(r6, r0, r12)     // Catch: java.lang.Throwable -> L8f5
            if (r6 == 0) goto L4c7
            r11.add(r5)     // Catch: java.lang.Throwable -> L8f5
        L4c7:
            r5 = r27
            r6 = r31
            r12 = r33
            goto L4aa
        L4ce:
            r31 = r6
            r33 = r12
            java.util.List r5 = p000.AbstractC0984xh.m6633(r11)     // Catch: java.lang.Throwable -> L8f5
            java.util.List r6 = r7.f4274     // Catch: java.lang.Throwable -> L8f5
            if (r6 != 0) goto L4dc
            r6 = r23
        L4dc:
            java.util.List r11 = r7.f4273     // Catch: java.lang.Throwable -> L8f5
            if (r11 != 0) goto L4e2
            r11 = r23
        L4e2:
            java.util.ArrayList r6 = p000.AbstractC0984xh.m6651(r6, r11)     // Catch: java.lang.Throwable -> L8f5
            java.util.List r11 = r7.f4272     // Catch: java.lang.Throwable -> L8f5
            if (r11 != 0) goto L4ec
            r11 = r23
        L4ec:
            java.util.ArrayList r6 = p000.AbstractC0984xh.m6651(r6, r11)     // Catch: java.lang.Throwable -> L8f5
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8f5
            r11.<init>()     // Catch: java.lang.Throwable -> L8f5
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L8f5
        L4f9:
            boolean r12 = r6.hasNext()     // Catch: java.lang.Throwable -> L8f5
            if (r12 == 0) goto L519
            java.lang.Object r12 = r6.next()     // Catch: java.lang.Throwable -> L8f5
            r27 = r5
            r5 = r12
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L8f5
            r34 = r6
            r6 = 1
            boolean r5 = p000.x02.m6485(r5, r0, r6)     // Catch: java.lang.Throwable -> L8f5
            if (r5 == 0) goto L514
            r11.add(r12)     // Catch: java.lang.Throwable -> L8f5
        L514:
            r5 = r27
            r6 = r34
            goto L4f9
        L519:
            r27 = r5
            java.util.List r5 = p000.AbstractC0984xh.m6633(r11)     // Catch: java.lang.Throwable -> L8f5
            if (r41 != 0) goto L52a
            boolean r6 = r27.isEmpty()     // Catch: java.lang.Throwable -> L8f5
            if (r6 == 0) goto L52a
            r5 = r18
            goto L54d
        L52a:
            int r6 = r7.f4267     // Catch: java.lang.Throwable -> L8f5
            boolean r7 = r27.isEmpty()     // Catch: java.lang.Throwable -> L8f5
            if (r7 != 0) goto L535
            r44 = r27
            goto L537
        L535:
            r44 = r18
        L537:
            boolean r7 = r5.isEmpty()     // Catch: java.lang.Throwable -> L8f5
            if (r7 != 0) goto L540
            r45 = r5
            goto L542
        L540:
            r45 = r18
        L542:
            qu0 r39 = new qu0     // Catch: java.lang.Throwable -> L8f5
            r43 = r42
            r40 = r6
            r39.<init>(r40, r41, r42, r43, r44, r45)     // Catch: java.lang.Throwable -> L8f5
            r5 = r39
        L54d:
            if (r5 == 0) goto L552
            r4.add(r5)     // Catch: java.lang.Throwable -> L8f5
        L552:
            r5 = r26
            r6 = r31
            r12 = r33
            goto L43e
        L55a:
            r26 = r5
            r33 = r12
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> L8f5
            if (r5 == 0) goto L566
            r4 = r18
        L566:
            java.util.ArrayList r1 = p000.AbstractC0984xh.m6651(r3, r1)     // Catch: java.lang.Throwable -> L8f5
            java.util.ArrayList r1 = p000.AbstractC0984xh.m6651(r1, r2)     // Catch: java.lang.Throwable -> L8f5
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8f5
            r2.<init>()     // Catch: java.lang.Throwable -> L8f5
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L8f5
        L577:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L8f5
            if (r3 == 0) goto L58f
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L8f5
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L8f5
            r6 = 1
            boolean r5 = p000.x02.m6485(r5, r0, r6)     // Catch: java.lang.Throwable -> L8f5
            if (r5 == 0) goto L577
            r2.add(r3)     // Catch: java.lang.Throwable -> L8f5
            goto L577
        L58f:
            java.util.List r1 = p000.AbstractC0984xh.m6633(r2)     // Catch: java.lang.Throwable -> L8f5
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L8f5
            if (r2 == 0) goto L59e
            r43 = r18
        L59b:
            r1 = r16
            goto L5a1
        L59e:
            r43 = r1
            goto L59b
        L5a1:
            java.lang.String r17 = m659(r61)     // Catch: java.lang.Throwable -> L8f5
            d62 r3 = m658(r61)     // Catch: java.lang.Throwable -> L8f5
            f00 r5 = m657(r61)     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r6 = r5.m1981()     // Catch: java.lang.Throwable -> L8f5
            z00 r7 = m661(r61)     // Catch: java.lang.Throwable -> L8f5
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8f5
            r11.<init>()     // Catch: java.lang.Throwable -> L8f5
            java.util.Iterator r12 = r26.iterator()     // Catch: java.lang.Throwable -> L8f5
        L5be:
            boolean r16 = r12.hasNext()     // Catch: java.lang.Throwable -> L8f5
            if (r16 == 0) goto L5e4
            java.lang.Object r16 = r12.next()     // Catch: java.lang.Throwable -> L8f5
            g8 r16 = (p000.C0313g8) r16     // Catch: java.lang.Throwable -> L8f5
            r34 = r1
            java.lang.String r1 = r16.m2268()     // Catch: java.lang.Throwable -> L8f5
            if (r1 == 0) goto L5da
            r2 = 1
            boolean r16 = p000.x02.m6485(r1, r0, r2)     // Catch: java.lang.Throwable -> L8f5
            if (r16 == 0) goto L5da
            goto L5dc
        L5da:
            r1 = r18
        L5dc:
            if (r1 == 0) goto L5e1
            r11.add(r1)     // Catch: java.lang.Throwable -> L8f5
        L5e1:
            r1 = r34
            goto L5be
        L5e4:
            r34 = r1
            java.util.List r1 = p000.AbstractC0984xh.m6633(r11)     // Catch: java.lang.Throwable -> L8f5
            if (r13 == 0) goto L619
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8f5
            r2.<init>()     // Catch: java.lang.Throwable -> L8f5
            java.util.Iterator r11 = r13.iterator()     // Catch: java.lang.Throwable -> L8f5
        L5f5:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> L8f5
            if (r12 == 0) goto L611
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> L8f5
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L8f5
            r61 = r1
            r1 = 1
            boolean r13 = p000.x02.m6485(r13, r0, r1)     // Catch: java.lang.Throwable -> L8f5
            if (r13 == 0) goto L60e
            r2.add(r12)     // Catch: java.lang.Throwable -> L8f5
        L60e:
            r1 = r61
            goto L5f5
        L611:
            r61 = r1
            r1 = 1
            java.util.List r0 = p000.AbstractC0984xh.m6633(r2)     // Catch: java.lang.Throwable -> L8f5
            goto L61e
        L619:
            r61 = r1
            r1 = 1
            r0 = r18
        L61e:
            if (r0 != 0) goto L622
            r0 = r23
        L622:
            boolean r2 = r61.isEmpty()     // Catch: java.lang.Throwable -> L8f5
            if (r2 != 0) goto L62b
            r2 = r61
            goto L63e
        L62b:
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Throwable -> L8f5
            if (r2 != 0) goto L633
            r2 = r0
            goto L63e
        L633:
            boolean r2 = r19.isEmpty()     // Catch: java.lang.Throwable -> L8f5
            if (r2 != 0) goto L63c
            r2 = r19
            goto L63e
        L63c:
            r2 = r23
        L63e:
            boolean r11 = r2.isEmpty()     // Catch: java.lang.Throwable -> L8f5
            if (r11 == 0) goto L646
            r2 = r18
        L646:
            if (r9 == 0) goto L64b
        L648:
            r11 = r20
            goto L6a0
        L64b:
            boolean r11 = r26.isEmpty()     // Catch: java.lang.Throwable -> L8f5
            if (r11 == 0) goto L652
            goto L667
        L652:
            java.util.Iterator r11 = r26.iterator()     // Catch: java.lang.Throwable -> L8f5
        L656:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> L8f5
            if (r12 == 0) goto L667
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> L8f5
            g8 r12 = (p000.C0313g8) r12     // Catch: java.lang.Throwable -> L8f5
            i8 r12 = r12.f4275     // Catch: java.lang.Throwable -> L8f5
            if (r12 == 0) goto L656
            goto L648
        L667:
            boolean r11 = r10.m1736()     // Catch: java.lang.Throwable -> L8f5
            if (r11 == 0) goto L675
            if (r43 == 0) goto L675
            boolean r11 = r43.isEmpty()     // Catch: java.lang.Throwable -> L8f5
            if (r11 == 0) goto L648
        L675:
            if (r2 == 0) goto L67d
            boolean r11 = r2.isEmpty()     // Catch: java.lang.Throwable -> L8f5
            if (r11 == 0) goto L686
        L67d:
            if (r43 == 0) goto L689
            boolean r11 = r43.isEmpty()     // Catch: java.lang.Throwable -> L8f5
            if (r11 == 0) goto L686
            goto L689
        L686:
            h8 r11 = p000.EnumC0350h8.f4616     // Catch: java.lang.Throwable -> L8f5
            goto L6a0
        L689:
            if (r38 == 0) goto L695
            boolean r11 = r38.isEmpty()     // Catch: java.lang.Throwable -> L8f5
            if (r11 == 0) goto L692
            goto L695
        L692:
            h8 r11 = p000.EnumC0350h8.f4615     // Catch: java.lang.Throwable -> L8f5
            goto L6a0
        L695:
            boolean r11 = r33.m3172()     // Catch: java.lang.Throwable -> L8f5
            if (r11 == 0) goto L69e
            h8 r11 = p000.EnumC0350h8.f4618     // Catch: java.lang.Throwable -> L8f5
            goto L6a0
        L69e:
            h8 r11 = p000.EnumC0350h8.f4619     // Catch: java.lang.Throwable -> L8f5
        L6a0:
            boolean r12 = p000.C0888ux.m5984()     // Catch: java.lang.Throwable -> L8f5
            if (r12 == 0) goto L7aa
            if (r37 != 0) goto L6b0
            if (r9 == 0) goto L6ad
            java.lang.String r12 = r9.f6782     // Catch: java.lang.Throwable -> L8f5
            goto L6b2
        L6ad:
            r12 = r18
            goto L6b2
        L6b0:
            r12 = r37
        L6b2:
            int r13 = r61.size()     // Catch: java.lang.Throwable -> L8f5
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L8f5
            int r1 = r19.size()     // Catch: java.lang.Throwable -> L8f5
            if (r2 == 0) goto L6cb
            int r16 = r2.size()     // Catch: java.lang.Throwable -> L8f5
            r61 = r2
            r2 = r16
        L6c8:
            r16 = r3
            goto L6cf
        L6cb:
            r61 = r2
            r2 = 0
            goto L6c8
        L6cf:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8f5
            r3.<init>()     // Catch: java.lang.Throwable -> L8f5
            r19 = r4
            java.lang.String r4 = "[downoload dev][FEED-AWEME-PARSE] image source awemeId="
            r3.append(r4)     // Catch: java.lang.Throwable -> L8f5
            r3.append(r12)     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r4 = ", structuredImages="
            r3.append(r4)     // Catch: java.lang.Throwable -> L8f5
            r3.append(r13)     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r4 = ", extractedImages="
            r3.append(r4)     // Catch: java.lang.Throwable -> L8f5
            r3.append(r0)     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r0 = ", livePhotoImages="
            r3.append(r0)     // Catch: java.lang.Throwable -> L8f5
            r3.append(r1)     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r0 = ", finalImages="
            r3.append(r0)     // Catch: java.lang.Throwable -> L8f5
            r3.append(r2)     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L8f5
            p000.C0888ux.m5975(r14, r0)     // Catch: java.lang.Throwable -> L8f5
            if (r37 != 0) goto L70f
            if (r9 == 0) goto L70c
            java.lang.String r0 = r9.f6782     // Catch: java.lang.Throwable -> L8f5
            goto L711
        L70c:
            r0 = r18
            goto L711
        L70f:
            r0 = r37
        L711:
            i8 r1 = r10.f3113     // Catch: java.lang.Throwable -> L8f5
            if (r1 == 0) goto L717
            r3 = 1
            goto L718
        L717:
            r3 = 0
        L718:
            int r1 = r26.size()     // Catch: java.lang.Throwable -> L8f5
            if (r61 == 0) goto L723
            int r2 = r61.size()     // Catch: java.lang.Throwable -> L8f5
            goto L724
        L723:
            r2 = 0
        L724:
            if (r38 == 0) goto L72b
            int r4 = r38.size()     // Catch: java.lang.Throwable -> L8f5
            goto L72c
        L72b:
            r4 = 0
        L72c:
            if (r43 == 0) goto L733
            int r12 = r43.size()     // Catch: java.lang.Throwable -> L8f5
            goto L734
        L733:
            r12 = 0
        L734:
            if (r19 == 0) goto L73b
            int r13 = r19.size()     // Catch: java.lang.Throwable -> L8f5
            goto L73c
        L73b:
            r13 = 0
        L73c:
            if (r30 == 0) goto L74b
            int r20 = r30.size()     // Catch: java.lang.Throwable -> L8f5
            r23 = r20
            r20 = r5
            r5 = r23
        L748:
            r23 = r6
            goto L74f
        L74b:
            r20 = r5
            r5 = 0
            goto L748
        L74f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8f5
            r6.<init>()     // Catch: java.lang.Throwable -> L8f5
            r27 = r7
            java.lang.String r7 = "[downoload dev][FEED-AWEME-PARSE] awemeId="
            r6.append(r7)     // Catch: java.lang.Throwable -> L8f5
            r6.append(r0)     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r0 = ", type="
            r6.append(r0)     // Catch: java.lang.Throwable -> L8f5
            r6.append(r11)     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r0 = ", rootVideo="
            r6.append(r0)     // Catch: java.lang.Throwable -> L8f5
            r6.append(r3)     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r0 = ", pageItems="
            r6.append(r0)     // Catch: java.lang.Throwable -> L8f5
            r6.append(r1)     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r0 = ", images="
            r6.append(r0)     // Catch: java.lang.Throwable -> L8f5
            r6.append(r2)     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r0 = ", videos="
            r6.append(r0)     // Catch: java.lang.Throwable -> L8f5
            r6.append(r4)     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r0 = ", animated="
            r6.append(r0)     // Catch: java.lang.Throwable -> L8f5
            r6.append(r12)     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r0 = ", structuredLiveItems="
            r6.append(r0)     // Catch: java.lang.Throwable -> L8f5
            r6.append(r13)     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r0 = ", legacyLiveItems="
            r6.append(r0)     // Catch: java.lang.Throwable -> L8f5
            r6.append(r5)     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L8f5
            p000.C0888ux.m5975(r14, r0)     // Catch: java.lang.Throwable -> L8f5
            r0 = r16
        L7a7:
            r16 = r11
            goto L7b6
        L7aa:
            r61 = r2
            r19 = r4
            r20 = r5
            r23 = r6
            r27 = r7
            r0 = r3
            goto L7a7
        L7b6:
            java.lang.String r11 = r8.m6808()     // Catch: java.lang.Throwable -> L8f5
            boolean r1 = p000.q02.m4671(r24)     // Catch: java.lang.Throwable -> L8f5
            if (r1 == 0) goto L7c3
            r12 = r25
            goto L7c5
        L7c3:
            r12 = r24
        L7c5:
            if (r15 != 0) goto L7dc
            if (r61 == 0) goto L7d1
            java.lang.Object r1 = p000.AbstractC0984xh.m6640(r61)     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L8f5
            r15 = r1
            goto L7d3
        L7d1:
            r15 = r18
        L7d3:
            if (r15 != 0) goto L7dc
            if (r9 == 0) goto L7da
            java.lang.String r15 = r9.f6791     // Catch: java.lang.Throwable -> L8f5
            goto L7dc
        L7da:
            r15 = r18
        L7dc:
            if (r37 != 0) goto L7e6
            if (r9 == 0) goto L7e3
            java.lang.String r5 = r9.f6782     // Catch: java.lang.Throwable -> L8f5
            goto L7e8
        L7e3:
            r5 = r18
            goto L7e8
        L7e6:
            r5 = r37
        L7e8:
            java.lang.String r1 = r8.f12410     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r60 = r8.m6810()     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r2 = r8.f12411     // Catch: java.lang.Throwable -> L8f5
            if (r2 != 0) goto L7fe
            if (r9 == 0) goto L800
            java.lang.String r2 = r9.m3656()     // Catch: java.lang.Throwable -> L8f5
            boolean r3 = p000.q02.m4671(r2)     // Catch: java.lang.Throwable -> L8f5
            if (r3 != 0) goto L800
        L7fe:
            r3 = 0
            goto L803
        L800:
            r2 = r18
            goto L7fe
        L803:
            java.lang.String r21 = r8.m6809()     // Catch: java.lang.Throwable -> L8f5
            r6 = 1
            int r22 = r8.m6804()     // Catch: java.lang.Throwable -> L8f5
            r4 = r23
            int r23 = r8.m6805()     // Catch: java.lang.Throwable -> L8f5
            int r24 = r8.m6803()     // Catch: java.lang.Throwable -> L8f5
            int r25 = r8.m6811()     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r7 = r8.m6806()     // Catch: java.lang.Throwable -> L8f5
            if (r7 == 0) goto L82d
            boolean r13 = p000.q02.m4671(r7)     // Catch: java.lang.Throwable -> L8f5
            if (r13 != 0) goto L827
            goto L829
        L827:
            r7 = r18
        L829:
            if (r7 != 0) goto L82c
            goto L82d
        L82c:
            r4 = r7
        L82d:
            long r7 = r8.m6807()     // Catch: java.lang.Throwable -> L8f5
            int r7 = (r7 > r34 ? 1 : (r7 == r34 ? 0 : -1))
            if (r7 <= 0) goto L836
            r3 = r6
        L836:
            java.lang.Object r6 = r0.m1666()     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L8f5
            java.lang.Object r7 = r0.m1667()     // Catch: java.lang.Throwable -> L8f5
            r31 = r7
            java.lang.String r31 = (java.lang.String) r31     // Catch: java.lang.Throwable -> L8f5
            java.lang.Object r0 = r0.m1668()     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L8f5
            boolean r7 = r32.m12()     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r34 = r20.m1980()     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r35 = r20.m1982()     // Catch: java.lang.Throwable -> L8f5
            java.util.List r36 = r33.m3168()     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r37 = r33.m3174()     // Catch: java.lang.Throwable -> L8f5
            r13 = r38
            java.lang.String r38 = r33.m3169()     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r39 = r33.m3173()     // Catch: java.lang.Throwable -> L8f5
            java.lang.String r40 = r33.m3170()     // Catch: java.lang.Throwable -> L8f5
            long r41 = r33.m3171()     // Catch: java.lang.Throwable -> L8f5
            if (r9 == 0) goto L87d
            int r8 = r9.m3657()     // Catch: java.lang.Throwable -> L8f5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L8f5
            r44 = r8
            goto L87f
        L87d:
            r44 = r18
        L87f:
            if (r9 == 0) goto L888
            java.lang.String r8 = r9.m3658()     // Catch: java.lang.Throwable -> L8f5
            r45 = r8
            goto L88a
        L888:
            r45 = r18
        L88a:
            if (r9 == 0) goto L891
            java.lang.String r8 = r9.f6789     // Catch: java.lang.Throwable -> L8f5
            r46 = r8
            goto L893
        L891:
            r46 = r18
        L893:
            if (r9 == 0) goto L89a
            java.lang.String r8 = r9.f6790     // Catch: java.lang.Throwable -> L8f5
            r47 = r8
            goto L89c
        L89a:
            r47 = r18
        L89c:
            if (r9 == 0) goto L8a3
            java.lang.String r8 = r9.f6791     // Catch: java.lang.Throwable -> L8f5
            r48 = r8
            goto L8a5
        L8a3:
            r48 = r18
        L8a5:
            if (r9 == 0) goto L8ae
            java.util.List r8 = r9.m3663()     // Catch: java.lang.Throwable -> L8f5
            r49 = r8
            goto L8b0
        L8ae:
            r49 = r18
        L8b0:
            if (r9 == 0) goto L8b9
            java.util.List r8 = r9.m3659()     // Catch: java.lang.Throwable -> L8f5
            r50 = r8
            goto L8bb
        L8b9:
            r50 = r18
        L8bb:
            if (r19 != 0) goto L8c0
            r51 = r30
            goto L8c2
        L8c0:
            r51 = r19
        L8c2:
            i8 r8 = r10.f3113     // Catch: java.lang.Throwable -> L8f5
            boolean r9 = r26.isEmpty()     // Catch: java.lang.Throwable -> L8f5
            if (r9 == 0) goto L8cd
            r53 = r18
            goto L8cf
        L8cd:
            r53 = r26
        L8cf:
            long r54 = r27.m7054()     // Catch: java.lang.Throwable -> L8f5
            long r56 = r27.m7053()     // Catch: java.lang.Throwable -> L8f5
            long r58 = r27.m7052()     // Catch: java.lang.Throwable -> L8f5
            f8 r10 = new f8     // Catch: java.lang.Throwable -> L8f5
            r14 = r61
            r32 = r0
            r19 = r1
            r20 = r2
            r27 = r3
            r26 = r4
            r18 = r5
            r30 = r6
            r33 = r7
            r52 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r56, r58, r60)     // Catch: java.lang.Throwable -> L8f5
            goto L905
        L8f5:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "DYHelper: parseAweme 失败: "
            p000.AbstractC0602nx.m4142(r1, r0)
            f8 r0 = p000.C0276f8.f3771
            f8 r10 = p000.kn0.m3378()
        L905:
            return r10
    }

    /* JADX INFO: renamed from: φ */
    public static final void m674(java.util.LinkedHashSet r3, java.util.List r4) {
            if (r4 == 0) goto L28
            java.util.Iterator r4 = r4.iterator()
        L6:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L6
            boolean r1 = p000.q02.m4671(r0)
            if (r1 == 0) goto L1b
            goto L6
        L1b:
            java.lang.String r1 = "http"
            r2 = 0
            boolean r1 = p000.x02.m6485(r0, r1, r2)
            if (r1 == 0) goto L6
            r3.add(r0)
            goto L6
        L28:
            return
    }

    /* JADX INFO: renamed from: χ */
    public static java.lang.Object m675(java.lang.Object r2, java.lang.ClassLoader r3, p000.EnumC0491kx r4, java.lang.String r5, java.lang.String r6) {
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.h30.f4556
            r3.getClass()
            java.lang.reflect.Field r3 = p000.C0666ox.m4322(r4, r3)
            r4 = 0
            if (r3 == 0) goto L11
            r0 = 1
            r3.setAccessible(r0)
            goto L12
        L11:
            r3 = r4
        L12:
            if (r3 == 0) goto L35
            java.lang.Class r0 = r3.getDeclaringClass()
            java.lang.Class r1 = r2.getClass()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L35
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L27
            goto L2e
        L27:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L2e:
            boolean r3 = r2 instanceof p000.eo1
            if (r3 == 0) goto L33
            goto L34
        L33:
            r4 = r2
        L34:
            return r4
        L35:
            java.lang.Class r3 = r2.getClass()
            java.lang.reflect.Field r3 = p000.h30.m2345(r3, r5, r6)
            if (r3 == 0) goto L51
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L44
            goto L4b
        L44:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L4b:
            boolean r3 = r2 instanceof p000.eo1
            if (r3 == 0) goto L50
            goto L51
        L50:
            r4 = r2
        L51:
            return r4
    }
}
