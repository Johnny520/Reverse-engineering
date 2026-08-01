package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class p91 {
    /* JADX INFO: renamed from: Α */
    public static java.util.List m4406(android.app.Activity r8) {
            java.lang.String r0 = "DYHelper: 扫描到 "
            r8.getClass()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            android.view.Window r8 = r8.getWindow()     // Catch: java.lang.Throwable -> L16
            r2 = 0
            if (r8 == 0) goto L19
            android.view.View r8 = r8.getDecorView()     // Catch: java.lang.Throwable -> L16
            goto L1a
        L16:
            r8 = move-exception
            goto L124
        L19:
            r8 = r2
        L1a:
            boolean r3 = r8 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L21
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8     // Catch: java.lang.Throwable -> L16
            goto L22
        L21:
            r8 = r2
        L22:
            if (r8 != 0) goto L27
            jz r8 = p000.C0450jz.f5672     // Catch: java.lang.Throwable -> L16
            return r8
        L27:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L16
            r3.<init>()     // Catch: java.lang.Throwable -> L16
            r4 = 0
            m4426(r8, r3, r4)     // Catch: java.lang.Throwable -> L16
            int r8 = r3.size()     // Catch: java.lang.Throwable -> L16
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L16
            r4.append(r8)     // Catch: java.lang.Throwable -> L16
            java.lang.String r8 = " 个 RecyclerView"
            r4.append(r8)     // Catch: java.lang.Throwable -> L16
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L16
            p000.C0888ux.m5985(r8)     // Catch: java.lang.Throwable -> L16
            java.util.Iterator r8 = r3.iterator()     // Catch: java.lang.Throwable -> L16
        L4c:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L12d
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Throwable -> L16
            r0.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r0 = m4428(r0)     // Catch: java.lang.Throwable -> L109
            if (r0 != 0) goto L60
            goto L4c
        L60:
            java.util.List r3 = m4420(r0)     // Catch: java.lang.Throwable -> L109
            if (r3 != 0) goto L67
            goto L4c
        L67:
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L109
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L109
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L109
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L109
            r5.<init>()     // Catch: java.lang.Throwable -> L109
            java.lang.String r6 = "DYHelper: Adapter ["
            r5.append(r6)     // Catch: java.lang.Throwable -> L109
            r5.append(r0)     // Catch: java.lang.Throwable -> L109
            java.lang.String r0 = "] 数据量: "
            r5.append(r0)     // Catch: java.lang.Throwable -> L109
            r5.append(r4)     // Catch: java.lang.Throwable -> L109
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L109
            p000.C0888ux.m5985(r0)     // Catch: java.lang.Throwable -> L109
            java.util.Iterator r0 = r3.iterator()     // Catch: java.lang.Throwable -> L109
        L93:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L109
            if (r3 == 0) goto L4c
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L109
            if (r3 == 0) goto L93
            java.lang.Class r4 = r3.getClass()     // Catch: java.lang.Throwable -> L109
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L109
            java.lang.String r5 = "Aweme"
            r6 = 1
            boolean r4 = p000.q02.m4654(r4, r5, r6)     // Catch: java.lang.Throwable -> L109
            if (r4 == 0) goto L93
            java.util.concurrent.atomic.AtomicReference r4 = p000.b10.f1403     // Catch: java.lang.Throwable -> Lb7
            f8 r3 = p000.b10.m673(r3)     // Catch: java.lang.Throwable -> Lb7
            goto Lbe
        Lb7:
            r3 = move-exception
            eo1 r4 = new eo1     // Catch: java.lang.Throwable -> Lef
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lef
            r3 = r4
        Lbe:
            java.lang.Throwable r4 = p000.fo1.m2190(r3)     // Catch: java.lang.Throwable -> Lef
            if (r4 != 0) goto Lc5
            goto Ldd
        Lc5:
            java.lang.String r3 = "DYHelper"
            java.lang.String r5 = r4.getMessage()     // Catch: java.lang.Throwable -> Lef
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lef
            java.lang.String r7 = "[downoload dev][RV-SCAN-PARSE-FAIL] "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lef
            r6.append(r5)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> Lef
            p000.C0888ux.m5977(r3, r5, r4)     // Catch: java.lang.Throwable -> Lef
            r3 = r2
        Ldd:
            f8 r3 = (p000.C0276f8) r3     // Catch: java.lang.Throwable -> Lef
            if (r3 == 0) goto L93
            h8 r4 = r3.f3798     // Catch: java.lang.Throwable -> Lef
            h8 r5 = p000.EnumC0350h8.f4619     // Catch: java.lang.Throwable -> Lef
            if (r4 == r5) goto L93
            java.lang.String r4 = r3.f3800     // Catch: java.lang.Throwable -> Lef
            if (r4 == 0) goto L93
            r1.put(r4, r3)     // Catch: java.lang.Throwable -> Lef
            goto L93
        Lef:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L109
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L109
            r4.<init>()     // Catch: java.lang.Throwable -> L109
            java.lang.String r5 = "DYHelper: 单条 Aweme 提取失败: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L109
            r4.append(r3)     // Catch: java.lang.Throwable -> L109
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L109
            p000.C0888ux.m5985(r3)     // Catch: java.lang.Throwable -> L109
            goto L93
        L109:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L16
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r3.<init>()     // Catch: java.lang.Throwable -> L16
            java.lang.String r4 = "DYHelper: 处理 RecyclerView 失败: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L16
            r3.append(r0)     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L16
            p000.C0888ux.m5985(r0)     // Catch: java.lang.Throwable -> L16
            goto L4c
        L124:
            java.lang.String r8 = r8.getMessage()
            java.lang.String r0 = "DYHelper: 扫描异常: "
            p000.AbstractC0602nx.m4142(r0, r8)
        L12d:
            int r8 = r1.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "DYHelper: 共提取到 "
            r0.<init>(r2)
            r0.append(r8)
            java.lang.String r8 = " 个有效 Aweme"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            p000.C0888ux.m5985(r8)
            java.util.Collection r8 = r1.values()
            r8.getClass()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r8 = p000.AbstractC0984xh.m6666(r8)
            return r8
    }

    /* JADX INFO: renamed from: Β */
    public static final void m4407(android.text.Spannable r2, long r3, int r5, int r6) {
            r0 = 16
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L14
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            int r3 = p000.kn0.m3355(r3)
            r0.<init>(r3)
            r3 = 33
            r2.setSpan(r0, r5, r6, r3)
        L14:
            return
    }

    /* JADX INFO: renamed from: Γ */
    public static final void m4408(android.text.Spannable r6, long r7, p000.InterfaceC1031yr r9, int r10, int r11) {
            long r0 = p000.y32.m6819(r7)
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r2 = p000.z32.m7086(r0, r2)
            r3 = 33
            if (r2 == 0) goto L23
            android.text.style.AbsoluteSizeSpan r0 = new android.text.style.AbsoluteSizeSpan
            float r7 = r9.mo595(r7)
            int r7 = p000.jx0.m3061(r7)
            r8 = 0
            r0.<init>(r7, r8)
            r6.setSpan(r0, r10, r11, r3)
            return
        L23:
            r4 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r9 = p000.z32.m7086(r0, r4)
            if (r9 == 0) goto L3a
            android.text.style.RelativeSizeSpan r9 = new android.text.style.RelativeSizeSpan
            float r7 = p000.y32.m6820(r7)
            r9.<init>(r7)
            r6.setSpan(r9, r10, r11, r3)
        L3a:
            return
    }

    /* JADX INFO: renamed from: Δ */
    public static final void m4409(android.text.Spannable r2, p000.av0 r3, int r4, int r5) {
            if (r3 == 0) goto L44
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r3, r1)
            r0.<init>(r1)
            java.lang.Object r3 = r3.f1320
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r3.next()
            zu0 r1 = (p000.zu0) r1
            java.util.Locale r1 = r1.f13307
            r0.add(r1)
            goto L13
        L25:
            r3 = 0
            java.util.Locale[] r3 = new java.util.Locale[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            java.util.Locale[] r3 = (java.util.Locale[]) r3
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.util.Locale[] r3 = (java.util.Locale[]) r3
            android.os.LocaleList r0 = new android.os.LocaleList
            r0.<init>(r3)
            android.text.style.LocaleSpan r3 = new android.text.style.LocaleSpan
            r3.<init>(r0)
            r0 = 33
            r2.setSpan(r3, r4, r5, r0)
        L44:
            return
    }

    /* JADX INFO: renamed from: Ε */
    public static final p000.zn1 m4410(p000.zn1 r5) {
            r5.getClass()
            yn1 r0 = r5.m7206()
            v62 r1 = new v62
            bo1 r5 = r5.f13203
            ez0 r2 = r5.mo566()
            long r3 = r5.mo565()
            r1.<init>(r2, r3)
            r0.f12697 = r1
            zn1 r5 = r0.m6945()
            return r5
    }

    /* JADX INFO: renamed from: Ζ */
    public static void m4411(int r2, p000.p70 r3, java.lang.String r4) {
            r2 = r2 & 2
            r0 = 1
            if (r2 == 0) goto L7
            r2 = 0
            goto L8
        L7:
            r2 = r0
        L8:
            i42 r1 = new i42
            r1.<init>(r3)
            if (r2 == 0) goto L12
            r1.setDaemon(r0)
        L12:
            r1.setName(r4)
            r1.start()
            return
    }

    /* JADX INFO: renamed from: Η */
    public static org.json.JSONObject m4412(java.lang.Object r2) {
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
            zw0 r2 = m4414(r2)     // Catch: java.lang.Throwable -> L18
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

    /* JADX INFO: renamed from: Θ */
    public static java.util.List m4413(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L7
            java.util.List r1 = (java.util.List) r1
            return r1
        L7:
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L12
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = p000.AbstractC0984xh.m6666(r1)
            return r1
        L12:
            boolean r0 = r1 instanceof java.lang.Object[]
            if (r0 == 0) goto L1d
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.util.List r1 = p000.AbstractC0312g7.m2262(r1)
            return r1
        L1d:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: Ι */
    public static p000.zw0 m4414(java.util.Map r3) {
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
    public static p000.C0783s2 m4415(java.lang.String r7, p000.w32 r8, long r9, p000.C1068zr r11, p000.f50 r12, int r13) {
            r1 = r7
            s2 r7 = new s2
            w2 r0 = new w2
            jz r3 = p000.C0450jz.f5672
            r4 = r3
            r2 = r8
            r6 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11 = r9
            r8 = r0
            r10 = 1
            r9 = r13
            r7.<init>(r8, r9, r10, r11)
            return r7
    }

    /* JADX INFO: renamed from: β */
    public static final p000.bs1 m4416(p000.yp0 r8, boolean r9) {
            k31 r0 = r8.f12733
            q01 r0 = r0.f5729
            int r1 = r0.f8774
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L64
        Lb:
            if (r0 == 0) goto L64
            int r1 = r0.f8773
            r1 = r1 & 8
            if (r1 == 0) goto L5b
            r1 = r0
            r3 = r2
        L15:
            if (r1 == 0) goto L5b
            boolean r4 = r1 instanceof p000.zr1
            if (r4 == 0) goto L1d
            r2 = r1
            goto L64
        L1d:
            int r4 = r1.f8773
            r4 = r4 & 8
            if (r4 == 0) goto L56
            boolean r4 = r1 instanceof p000.C1014ya
            if (r4 == 0) goto L56
            r4 = r1
            ya r4 = (p000.C1014ya) r4
            q01 r4 = r4.f12512
            r5 = 0
        L2d:
            r6 = 1
            if (r4 == 0) goto L53
            int r7 = r4.f8773
            r7 = r7 & 8
            if (r7 == 0) goto L50
            int r5 = r5 + 1
            if (r5 != r6) goto L3c
            r1 = r4
            goto L50
        L3c:
            if (r3 != 0) goto L47
            k21 r3 = new k21
            r6 = 16
            q01[] r6 = new p000.q01[r6]
            r3.<init>(r6)
        L47:
            if (r1 == 0) goto L4d
            r3.m3127(r1)
            r1 = r2
        L4d:
            r3.m3127(r4)
        L50:
            q01 r4 = r4.f8776
            goto L2d
        L53:
            if (r5 != r6) goto L56
            goto L15
        L56:
            q01 r1 = p000.h62.m2387(r3)
            goto L15
        L5b:
            int r1 = r0.f8774
            r1 = r1 & 8
            if (r1 == 0) goto L64
            q01 r0 = r0.f8776
            goto Lb
        L64:
            r2.getClass()
            zr1 r2 = (p000.zr1) r2
            q01 r2 = (p000.q01) r2
            q01 r0 = r2.f8771
            xr1 r1 = r8.m7007()
            if (r1 != 0) goto L78
            xr1 r1 = new xr1
            r1.<init>()
        L78:
            bs1 r2 = new bs1
            r2.<init>(r0, r9, r8, r1)
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public static final void m4417(java.util.logging.Logger r1, p000.t22 r2, p000.w22 r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r3.f11549
            r0.append(r3)
            r3 = 32
            r0.append(r3)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r3)
            java.lang.String r4 = "%-22s"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.append(r3)
            java.lang.String r3 = ": "
            r0.append(r3)
            java.lang.String r2 = r2.f10139
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.fine(r2)
            return
    }

    /* JADX INFO: renamed from: δ */
    public static void m4418(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ε */
    public static final void m4419(int r3, int r4) {
            if (r3 <= 0) goto L5
            if (r4 <= 0) goto L5
            return
        L5:
            java.lang.String r0 = " must be greater than zero."
            if (r3 == r4) goto L12
            java.lang.String r1 = "Both size "
            java.lang.String r2 = " and step "
            java.lang.String r3 = p000.AbstractC0602nx.m4128(r1, r3, r2, r4, r0)
            goto L18
        L12:
            java.lang.String r4 = "size "
            java.lang.String r3 = p000.AbstractC0602nx.m4127(r4, r3, r0)
        L18:
            p000.C1080.m7266(r3)
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static java.util.List m4420(java.lang.Object r14) {
            java.lang.Class r0 = r14.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r12 = "models"
            java.lang.String r13 = "mModels"
            java.lang.String r1 = "mData"
            java.lang.String r2 = "mItems"
            java.lang.String r3 = "data"
            java.lang.String r4 = "items"
            java.lang.String r5 = "list"
            java.lang.String r6 = "mList"
            java.lang.String r7 = "dataList"
            java.lang.String r8 = "mDataList"
            java.lang.String r9 = "awemeList"
            java.lang.String r10 = "feedList"
            java.lang.String r11 = "mFeedList"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r1)
            java.util.Iterator r1 = r1.iterator()
        L2e:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "' ("
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            java.lang.String r5 = "Aweme"
            r6 = 1
            r7 = 0
            if (r2 == 0) goto Lc5
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Class r8 = r14.getClass()     // Catch: java.lang.Throwable -> L2e
        L46:
            if (r8 == 0) goto L5f
            boolean r9 = r8.equals(r4)     // Catch: java.lang.Throwable -> L2e
            if (r9 != 0) goto L5f
            java.lang.reflect.Field r9 = r8.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L2e java.lang.NoSuchFieldException -> L5a
            r9.setAccessible(r6)     // Catch: java.lang.Throwable -> L2e java.lang.NoSuchFieldException -> L5a
            java.lang.Object r7 = r9.get(r14)     // Catch: java.lang.Throwable -> L2e java.lang.NoSuchFieldException -> L5a
            goto L5f
        L5a:
            java.lang.Class r8 = r8.getSuperclass()     // Catch: java.lang.Throwable -> L2e
            goto L46
        L5f:
            if (r7 != 0) goto L62
            goto L2e
        L62:
            java.util.List r4 = m4413(r7)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L2e
            boolean r7 = r4.isEmpty()     // Catch: java.lang.Throwable -> L2e
            if (r7 != 0) goto L2e
            boolean r7 = r4.isEmpty()     // Catch: java.lang.Throwable -> L2e
            if (r7 == 0) goto L75
            goto L2e
        L75:
            java.util.Iterator r7 = r4.iterator()     // Catch: java.lang.Throwable -> L2e
        L79:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L2e
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L79
            java.lang.Class r8 = r8.getClass()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L2e
            boolean r8 = p000.q02.m4654(r8, r5, r6)     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L79
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L2e
            r6 = 46
            java.lang.String r6 = p000.q02.m4687(r0, r6, r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r7.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = "DYHelper: 找到数据字段 '"
            r7.append(r8)     // Catch: java.lang.Throwable -> L2e
            r7.append(r2)     // Catch: java.lang.Throwable -> L2e
            r7.append(r3)     // Catch: java.lang.Throwable -> L2e
            r7.append(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = " 条, Adapter: "
            r7.append(r2)     // Catch: java.lang.Throwable -> L2e
            r7.append(r6)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = ")"
            r7.append(r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> L2e
            p000.C0888ux.m5985(r2)     // Catch: java.lang.Throwable -> L2e
            return r4
        Lc5:
            java.lang.Class r0 = r14.getClass()
        Lc9:
            if (r0 == 0) goto L169
            boolean r1 = r0.equals(r4)
            if (r1 != 0) goto L169
            java.lang.reflect.Field[] r1 = r0.getDeclaredFields()
            τ r1 = p000.h62.m2434(r1)
        Ld9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L163
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Class<java.util.List> r8 = java.util.List.class
            java.lang.Class r9 = r2.getType()     // Catch: java.lang.Throwable -> Ld9
            boolean r8 = r8.isAssignableFrom(r9)     // Catch: java.lang.Throwable -> Ld9
            if (r8 != 0) goto Lfe
            java.lang.Class<java.util.Collection> r8 = java.util.Collection.class
            java.lang.Class r9 = r2.getType()     // Catch: java.lang.Throwable -> Ld9
            boolean r8 = r8.isAssignableFrom(r9)     // Catch: java.lang.Throwable -> Ld9
            if (r8 != 0) goto Lfe
            goto Ld9
        Lfe:
            r2.setAccessible(r6)     // Catch: java.lang.Throwable -> Ld9
            java.lang.Object r8 = r2.get(r14)     // Catch: java.lang.Throwable -> Ld9
            if (r8 != 0) goto L108
            goto Ld9
        L108:
            java.util.List r8 = m4413(r8)     // Catch: java.lang.Throwable -> Ld9
            if (r8 != 0) goto L10f
            goto Ld9
        L10f:
            int r9 = r8.size()     // Catch: java.lang.Throwable -> Ld9
            r10 = 2
            if (r9 < r10) goto Ld9
            boolean r9 = r8.isEmpty()     // Catch: java.lang.Throwable -> Ld9
            if (r9 == 0) goto L11d
            goto Ld9
        L11d:
            java.util.Iterator r9 = r8.iterator()     // Catch: java.lang.Throwable -> Ld9
        L121:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> Ld9
            if (r10 == 0) goto Ld9
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> Ld9
            if (r10 == 0) goto L121
            java.lang.Class r10 = r10.getClass()     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r10 = r10.getName()     // Catch: java.lang.Throwable -> Ld9
            boolean r10 = p000.q02.m4654(r10, r5, r6)     // Catch: java.lang.Throwable -> Ld9
            if (r10 == 0) goto L121
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> Ld9
            int r9 = r8.size()     // Catch: java.lang.Throwable -> Ld9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld9
            r10.<init>()     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r11 = "DYHelper: 暴力扫描发现数据字段 '"
            r10.append(r11)     // Catch: java.lang.Throwable -> Ld9
            r10.append(r2)     // Catch: java.lang.Throwable -> Ld9
            r10.append(r3)     // Catch: java.lang.Throwable -> Ld9
            r10.append(r9)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r2 = " 条)"
            r10.append(r2)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r2 = r10.toString()     // Catch: java.lang.Throwable -> Ld9
            p000.C0888ux.m5985(r2)     // Catch: java.lang.Throwable -> Ld9
            return r8
        L163:
            java.lang.Class r0 = r0.getSuperclass()
            goto Lc9
        L169:
            java.lang.String r0 = "getItemCount"
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L207
            java.lang.reflect.Method r0 = m4425(r14, r0, r2)     // Catch: java.lang.Throwable -> L207
            if (r0 == 0) goto L207
            java.lang.Object r0 = r0.invoke(r14, r7)     // Catch: java.lang.Throwable -> L207
            boolean r2 = r0 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L207
            if (r2 == 0) goto L17f
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L207
            goto L180
        L17f:
            r0 = r7
        L180:
            if (r0 == 0) goto L187
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L207
            goto L188
        L187:
            r0 = r1
        L188:
            if (r0 <= 0) goto L207
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r2) goto L207
            java.lang.String r2 = "getItem"
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L207
            r3.getClass()     // Catch: java.lang.Throwable -> L207
            java.lang.Class[] r4 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L207
            java.lang.reflect.Method r2 = m4425(r14, r2, r4)     // Catch: java.lang.Throwable -> L207
            if (r2 != 0) goto L1a9
            java.lang.String r2 = "getData"
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L207
            java.lang.reflect.Method r2 = m4425(r14, r2, r3)     // Catch: java.lang.Throwable -> L207
        L1a9:
            if (r2 == 0) goto L207
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L207
            r3.<init>()     // Catch: java.lang.Throwable -> L207
        L1b0:
            if (r1 >= r0) goto L1c8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L1c2
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L1c2
            java.lang.Object r4 = r2.invoke(r14, r4)     // Catch: java.lang.Throwable -> L1c2
            r3.add(r4)     // Catch: java.lang.Throwable -> L1c2
            goto L1c5
        L1c2:
            r3.add(r7)     // Catch: java.lang.Throwable -> L207
        L1c5:
            int r1 = r1 + 1
            goto L1b0
        L1c8:
            boolean r14 = r3.isEmpty()     // Catch: java.lang.Throwable -> L207
            if (r14 == 0) goto L1cf
            goto L207
        L1cf:
            java.util.Iterator r14 = r3.iterator()     // Catch: java.lang.Throwable -> L207
        L1d3:
            boolean r1 = r14.hasNext()     // Catch: java.lang.Throwable -> L207
            if (r1 == 0) goto L207
            java.lang.Object r1 = r14.next()     // Catch: java.lang.Throwable -> L207
            if (r1 == 0) goto L1d3
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L207
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L207
            boolean r1 = p000.q02.m4654(r1, r5, r6)     // Catch: java.lang.Throwable -> L207
            if (r1 == 0) goto L1d3
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L207
            r14.<init>()     // Catch: java.lang.Throwable -> L207
            java.lang.String r1 = "DYHelper: 通过 getItem() 获取 "
            r14.append(r1)     // Catch: java.lang.Throwable -> L207
            r14.append(r0)     // Catch: java.lang.Throwable -> L207
            java.lang.String r0 = " 条数据"
            r14.append(r0)     // Catch: java.lang.Throwable -> L207
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L207
            p000.C0888ux.m5985(r14)     // Catch: java.lang.Throwable -> L207
            return r3
        L207:
            return r7
    }

    /* JADX INFO: renamed from: η */
    public static p000.ye1 m4421(org.json.JSONObject... r9) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            int r1 = r9.length
            r2 = 0
            r3 = r2
            r4 = r3
        L9:
            if (r3 >= r1) goto L24
            r5 = r9[r3]
            int r6 = r4 + 1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "root"
            r7.<init>(r8)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            m4422(r0, r5, r4, r2)
            int r3 = r3 + 1
            r4 = r6
            goto L9
        L24:
            ye1 r9 = new ye1
            java.util.Collection r0 = r0.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = p000.AbstractC0984xh.m6666(r0)
            r9.<init>(r0)
            return r9
    }

    /* JADX INFO: renamed from: θ */
    public static final void m4422(java.util.LinkedHashMap r11, java.lang.Object r12, java.lang.String r13, int r14) {
            if (r12 == 0) goto L14f
            java.lang.Object r0 = org.json.JSONObject.NULL
            if (r12 == r0) goto L14f
            r0 = 12
            if (r14 <= r0) goto Lc
            goto L14f
        Lc:
            boolean r0 = r12 instanceof org.json.JSONObject
            r1 = 0
            if (r0 == 0) goto Lad
            org.json.JSONObject r12 = (org.json.JSONObject) r12
            java.lang.String r0 = "food_id"
            java.lang.String r2 = "foodId"
            java.lang.String r3 = "foodID"
            java.lang.String[] r0 = new java.lang.String[]{r3, r0, r2}
            java.lang.String r3 = m4434(r12, r0)
            if (r3 != 0) goto L25
        L23:
            r10 = r13
            goto L83
        L25:
            java.lang.String r0 = "food_name"
            java.lang.String r2 = "name"
            java.lang.String r4 = "foodName"
            java.lang.String[] r0 = new java.lang.String[]{r4, r0, r2}
            java.lang.String r4 = m4434(r12, r0)
            if (r4 != 0) goto L36
            goto L23
        L36:
            ze1 r2 = new ze1
            java.lang.String r0 = "food_price"
            java.lang.String r1 = "price"
            java.lang.String r5 = "foodPrice"
            java.lang.String[] r0 = new java.lang.String[]{r5, r0, r1}
            java.lang.Integer r5 = m4432(r12, r0)
            java.lang.String r0 = "time"
            java.lang.String r1 = "duration"
            java.lang.String r6 = "foodTime"
            java.lang.String r7 = "food_time"
            java.lang.String[] r0 = new java.lang.String[]{r6, r7, r0, r1}
            java.lang.Integer r6 = m4432(r12, r0)
            java.lang.String r0 = "gain_closeness"
            java.lang.String r1 = "closeness"
            java.lang.String r7 = "gainCloseness"
            java.lang.String[] r0 = new java.lang.String[]{r7, r0, r1}
            java.lang.Integer r7 = m4432(r12, r0)
            java.lang.String r0 = "icon"
            java.lang.String r1 = "pic"
            java.lang.String r8 = "foodIcon"
            java.lang.String r9 = "food_icon"
            java.lang.String[] r0 = new java.lang.String[]{r8, r9, r0, r1}
            java.lang.String r8 = m4434(r12, r0)
            java.lang.String r0 = "label"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r9 = m4434(r12, r0)
            r10 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = r2
        L83:
            if (r1 == 0) goto L8d
            java.lang.String r13 = r1.f13064
            java.lang.Object r13 = r11.putIfAbsent(r13, r1)
            ze1 r13 = (p000.ze1) r13
        L8d:
            java.util.Iterator r13 = r12.keys()
        L91:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L14f
            java.lang.Object r0 = r13.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "."
            java.lang.String r1 = p000.lz1.m3688(r10, r1, r0)
            java.lang.Object r0 = r12.opt(r0)
            int r2 = r14 + 1
            m4422(r11, r0, r1, r2)
            goto L91
        Lad:
            r10 = r13
            boolean r13 = r12 instanceof org.json.JSONArray
            if (r13 == 0) goto Le0
            org.json.JSONArray r12 = (org.json.JSONArray) r12
            int r13 = r12.length()
            r0 = 0
        Lb9:
            if (r0 >= r13) goto L14f
            java.lang.Object r1 = r12.opt(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            java.lang.String r3 = "["
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = "]"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            int r3 = r14 + 1
            m4422(r11, r1, r2, r3)
            int r0 = r0 + 1
            goto Lb9
        Le0:
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L14f
            java.lang.String r12 = (java.lang.String) r12
            java.lang.CharSequence r12 = p000.q02.m4660(r12)
            java.lang.String r12 = r12.toString()
            int r13 = r12.length()
            r0 = 2
            if (r0 > r13) goto L14f
            r0 = 500001(0x7a121, float:7.0065E-40)
            if (r13 >= r0) goto L14f
            r13 = 123(0x7b, float:1.72E-43)
            boolean r13 = p000.q02.m4684(r12, r13)
            if (r13 == 0) goto L125
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L108
            r13.<init>(r12)     // Catch: java.lang.Throwable -> L108
            goto L10f
        L108:
            r0 = move-exception
            r12 = r0
            eo1 r13 = new eo1
            r13.<init>(r12)
        L10f:
            boolean r12 = r13 instanceof p000.eo1
            if (r12 == 0) goto L114
            goto L115
        L114:
            r1 = r13
        L115:
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            if (r1 == 0) goto L14f
            java.lang.String r12 = "{json}"
            java.lang.String r12 = r10.concat(r12)
            int r14 = r14 + 1
            m4422(r11, r1, r12, r14)
            goto L14f
        L125:
            r13 = 91
            boolean r13 = p000.q02.m4684(r12, r13)
            if (r13 == 0) goto L14f
            org.json.JSONArray r13 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L133
            r13.<init>(r12)     // Catch: java.lang.Throwable -> L133
            goto L13a
        L133:
            r0 = move-exception
            r12 = r0
            eo1 r13 = new eo1
            r13.<init>(r12)
        L13a:
            boolean r12 = r13 instanceof p000.eo1
            if (r12 == 0) goto L13f
            goto L140
        L13f:
            r1 = r13
        L140:
            org.json.JSONArray r1 = (org.json.JSONArray) r1
            if (r1 == 0) goto L14f
            java.lang.String r12 = "[json]"
            java.lang.String r12 = r10.concat(r12)
            int r14 = r14 + 1
            m4422(r11, r1, r12, r14)
        L14f:
            return
    }

    /* JADX INFO: renamed from: ι */
    public static java.lang.Object m4423(java.lang.ClassLoader r16, long r17, int r19, int r20) {
            java.lang.String r0 = "code"
            java.lang.String r1 = "status_code"
            r16.getClass()
            r2 = 0
            int r2 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r2 <= 0) goto Lbb
            if (r19 <= 0) goto Lb3
            if (r20 < 0) goto Lab
            java.util.LinkedHashMap r2 = p000.xn0.m6713(r16, r17)     // Catch: java.lang.Throwable -> Lc3
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Lc3
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r4 = "food_id"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r19)     // Catch: java.lang.Throwable -> Lc3
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r4 = "food_price"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r20)     // Catch: java.lang.Throwable -> Lc3
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r4 = "is_post_free"
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lc3
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r4 = "is_exquisite_image"
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r4 = "https://stark-gate.zijieapi.com/ttgame/social_pet/feed"
            r5 = r16
            ve1 r2 = m4437(r5, r4, r3, r2)     // Catch: java.lang.Throwable -> Lc3
            org.json.JSONObject r3 = r2.f11254     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r4 = "data"
            org.json.JSONObject r4 = r3.optJSONObject(r4)     // Catch: java.lang.Throwable -> Lc3
            if (r4 != 0) goto L4b
            r4 = r3
        L4b:
            java.lang.String r5 = "info"
            org.json.JSONObject r15 = r4.optJSONObject(r5)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r5 = "base_resp"
            org.json.JSONObject r5 = r3.optJSONObject(r5)     // Catch: java.lang.Throwable -> Lc3
            boolean r6 = r3.has(r0)     // Catch: java.lang.Throwable -> Lc3
            r7 = -1
            if (r6 == 0) goto L64
            int r7 = r3.optInt(r0, r7)     // Catch: java.lang.Throwable -> Lc3
        L62:
            r9 = r7
            goto L81
        L64:
            boolean r0 = r3.has(r1)     // Catch: java.lang.Throwable -> Lc3
            if (r0 == 0) goto L6f
            int r7 = r3.optInt(r1, r7)     // Catch: java.lang.Throwable -> Lc3
            goto L62
        L6f:
            if (r5 == 0) goto L7d
            boolean r0 = r5.has(r1)     // Catch: java.lang.Throwable -> Lc3
            r6 = 1
            if (r0 != r6) goto L7d
            int r7 = r5.optInt(r1, r7)     // Catch: java.lang.Throwable -> Lc3
            goto L62
        L7d:
            if (r15 == 0) goto L62
            r7 = 0
            goto L62
        L81:
            we1 r6 = new we1     // Catch: java.lang.Throwable -> Lc3
            int r7 = r2.f11252     // Catch: java.lang.Throwable -> Lc3
            java.lang.Integer r8 = r2.f11253     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r10 = m4436(r3, r4)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r0 = "balance_spark"
            java.lang.Long r13 = m4433(r0, r4)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r0 = "together"
            org.json.JSONObject r0 = r4.optJSONObject(r0)     // Catch: java.lang.Throwable -> Lc3
            if (r0 == 0) goto La5
            java.lang.String r1 = "closeness"
            java.lang.Long r0 = m4433(r1, r0)     // Catch: java.lang.Throwable -> Lc3
        L9f:
            r11 = r19
            r12 = r20
            r14 = r0
            goto La7
        La5:
            r0 = 0
            goto L9f
        La7:
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> Lc3
            return r6
        Lab:
            java.lang.String r0 = "foodPrice 不能小于 0"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lc3
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lc3
            throw r1     // Catch: java.lang.Throwable -> Lc3
        Lb3:
            java.lang.String r0 = "foodId 必须大于 0"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lc3
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lc3
            throw r1     // Catch: java.lang.Throwable -> Lc3
        Lbb:
            java.lang.String r0 = "conversationShortId 必须大于 0"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lc3
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lc3
            throw r1     // Catch: java.lang.Throwable -> Lc3
        Lc3:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            return r1
    }

    /* JADX INFO: renamed from: κ */
    public static java.lang.Object m4424(java.lang.ClassLoader r21, long r22) {
            java.lang.String r0 = "code"
            java.lang.String r1 = "food_info"
            java.lang.String r2 = "status_code"
            r21.getClass()
            r3 = 0
            int r3 = (r22 > r3 ? 1 : (r22 == r3 ? 0 : -1))
            if (r3 <= 0) goto L104
            java.util.LinkedHashMap r3 = p000.xn0.m6713(r21, r22)     // Catch: java.lang.Throwable -> L10c
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L10c
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L10c
            java.lang.String r5 = "is_exquisite_image"
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L10c
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L10c
            java.lang.String r5 = "https://stark-gate.zijieapi.com/ttgame/social_pet/feed/get"
            r6 = r21
            ve1 r3 = m4437(r6, r5, r4, r3)     // Catch: java.lang.Throwable -> L10c
            org.json.JSONObject r4 = r3.f11254     // Catch: java.lang.Throwable -> L10c
            java.lang.String r5 = "data"
            org.json.JSONObject r5 = r4.optJSONObject(r5)     // Catch: java.lang.Throwable -> L10c
            if (r5 != 0) goto L32
            r5 = r4
        L32:
            org.json.JSONObject r6 = r5.optJSONObject(r1)     // Catch: java.lang.Throwable -> L10c
            r7 = 0
            if (r6 == 0) goto L40
            java.lang.String r8 = "list"
            org.json.JSONArray r6 = r6.optJSONArray(r8)     // Catch: java.lang.Throwable -> L10c
            goto L41
        L40:
            r6 = r7
        L41:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L10c
            r8.<init>()     // Catch: java.lang.Throwable -> L10c
            r9 = 0
            if (r6 == 0) goto L65
            int r10 = r6.length()     // Catch: java.lang.Throwable -> L10c
            r11 = r9
        L4e:
            if (r11 >= r10) goto L65
            org.json.JSONObject r12 = r6.optJSONObject(r11)     // Catch: java.lang.Throwable -> L10c
            if (r12 == 0) goto L62
            ze1 r12 = m4435(r12, r11)     // Catch: java.lang.Throwable -> L10c
            java.lang.String r13 = r12.f13064     // Catch: java.lang.Throwable -> L10c
            java.lang.Object r12 = r8.putIfAbsent(r13, r12)     // Catch: java.lang.Throwable -> L10c
            ze1 r12 = (p000.ze1) r12     // Catch: java.lang.Throwable -> L10c
        L62:
            int r11 = r11 + 1
            goto L4e
        L65:
            org.json.JSONObject[] r10 = new org.json.JSONObject[]{r5}     // Catch: java.lang.Throwable -> L10c
            ye1 r10 = m4421(r10)     // Catch: java.lang.Throwable -> L10c
            java.util.List r10 = r10.f12595     // Catch: java.lang.Throwable -> L10c
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L10c
        L73:
            boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> L10c
            if (r11 == 0) goto L85
            java.lang.Object r11 = r10.next()     // Catch: java.lang.Throwable -> L10c
            ze1 r11 = (p000.ze1) r11     // Catch: java.lang.Throwable -> L10c
            java.lang.String r12 = r11.f13064     // Catch: java.lang.Throwable -> L10c
            r8.putIfAbsent(r12, r11)     // Catch: java.lang.Throwable -> L10c
            goto L73
        L85:
            java.lang.String r10 = "base_resp"
            org.json.JSONObject r10 = r4.optJSONObject(r10)     // Catch: java.lang.Throwable -> L10c
            boolean r11 = r4.has(r2)     // Catch: java.lang.Throwable -> L10c
            r12 = -1
            if (r11 == 0) goto L99
            int r12 = r4.optInt(r2, r12)     // Catch: java.lang.Throwable -> L10c
        L96:
            r16 = r12
            goto Lba
        L99:
            boolean r11 = r4.has(r0)     // Catch: java.lang.Throwable -> L10c
            if (r11 == 0) goto La4
            int r12 = r4.optInt(r0, r12)     // Catch: java.lang.Throwable -> L10c
            goto L96
        La4:
            if (r10 == 0) goto Lb2
            boolean r0 = r10.has(r2)     // Catch: java.lang.Throwable -> L10c
            r11 = 1
            if (r0 != r11) goto Lb2
            int r12 = r10.optInt(r2, r12)     // Catch: java.lang.Throwable -> L10c
            goto L96
        Lb2:
            boolean r0 = r5.has(r1)     // Catch: java.lang.Throwable -> L10c
            if (r0 == 0) goto L96
            r16 = r9
        Lba:
            int r14 = r3.f11252     // Catch: java.lang.Throwable -> L10c
            java.lang.Integer r15 = r3.f11253     // Catch: java.lang.Throwable -> L10c
            java.lang.String r0 = "status_msg"
            java.lang.String r0 = r4.optString(r0)     // Catch: java.lang.Throwable -> L10c
            boolean r1 = p000.q02.m4671(r0)     // Catch: java.lang.Throwable -> L10c
            if (r1 != 0) goto Lcb
            goto Lcc
        Lcb:
            r0 = r7
        Lcc:
            if (r0 != 0) goto Lde
            if (r10 == 0) goto Le1
            java.lang.String r0 = "status_message"
            java.lang.String r0 = r10.optString(r0)     // Catch: java.lang.Throwable -> L10c
            if (r0 == 0) goto Le1
            boolean r1 = p000.q02.m4671(r0)     // Catch: java.lang.Throwable -> L10c
            if (r1 != 0) goto Le1
        Lde:
            r17 = r0
            goto Le3
        Le1:
            r17 = r7
        Le3:
            if (r6 == 0) goto Le9
            int r9 = r6.length()     // Catch: java.lang.Throwable -> L10c
        Le9:
            r18 = r9
            java.util.Collection r0 = r8.values()     // Catch: java.lang.Throwable -> L10c
            r0.getClass()     // Catch: java.lang.Throwable -> L10c
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L10c
            java.util.List r19 = p000.AbstractC0984xh.m6666(r0)     // Catch: java.lang.Throwable -> L10c
            java.lang.String r0 = "info"
            org.json.JSONObject r20 = r5.optJSONObject(r0)     // Catch: java.lang.Throwable -> L10c
            xe1 r13 = new xe1     // Catch: java.lang.Throwable -> L10c
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L10c
            return r13
        L104:
            java.lang.String r0 = "conversationShortId 必须大于 0"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L10c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L10c
            throw r1     // Catch: java.lang.Throwable -> L10c
        L10c:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            return r1
    }

    /* JADX INFO: renamed from: λ */
    public static java.lang.reflect.Method m4425(java.lang.Object r2, java.lang.String r3, java.lang.Class... r4) {
            java.lang.Class r2 = r2.getClass()
        L4:
            r0 = 0
            if (r2 == 0) goto L2c
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L2c
            int r1 = r4.length     // Catch: java.lang.NoSuchMethodException -> L27
            if (r1 != 0) goto L17
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r3, r0)     // Catch: java.lang.NoSuchMethodException -> L27
            goto L22
        L17:
            int r0 = r4.length     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r0)     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.Class[] r0 = (java.lang.Class[]) r0     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r3, r0)     // Catch: java.lang.NoSuchMethodException -> L27
        L22:
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L27
            return r0
        L27:
            java.lang.Class r2 = r2.getSuperclass()
            goto L4
        L2c:
            return r0
    }

    /* JADX INFO: renamed from: μ */
    public static void m4426(android.view.View r5, java.util.ArrayList r6, int r7) {
            r0 = 15
            if (r7 <= r0) goto L5
            goto L3d
        L5:
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "RecyclerView"
            r2 = 1
            boolean r1 = p000.q02.m4654(r0, r1, r2)
            if (r1 != 0) goto L1e
            java.lang.String r1 = "recycler"
            boolean r0 = p000.q02.m4654(r0, r1, r2)
            if (r0 == 0) goto L21
        L1e:
            r6.add(r5)
        L21:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L3d
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r0 = r5.getChildCount()
            r1 = 0
        L2c:
            if (r1 >= r0) goto L3d
            android.view.View r3 = r5.getChildAt(r1)
            r3.getClass()
            int r4 = r7 + 1
            m4426(r3, r6, r4)
            int r1 = r1 + 1
            goto L2c
        L3d:
            return
    }

    /* JADX INFO: renamed from: ν */
    public static final java.lang.String m4427(long r12) {
            r0 = -999500000(0xffffffffc46cd720, double:NaN)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            java.lang.String r1 = " s "
            r2 = 1000000000(0x3b9aca00, float:0.0047237873)
            r3 = 500000000(0x1dcd6500, float:5.436748E-21)
            if (r0 > 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r3 = (long) r3
            long r12 = r12 - r3
            long r2 = (long) r2
            long r12 = r12 / r2
            r0.append(r12)
            r0.append(r1)
            java.lang.String r12 = r0.toString()
            goto Lb0
        L24:
            r4 = -999500(0xfffffffffff0bfb4, double:NaN)
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            java.lang.String r4 = " ms"
            r5 = 1000000(0xf4240, float:1.401298E-39)
            r6 = 500000(0x7a120, float:7.00649E-40)
            if (r0 > 0) goto L47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r6
            long r12 = r12 - r1
            long r1 = (long) r5
            long r12 = r12 / r1
            r0.append(r12)
            r0.append(r4)
            java.lang.String r12 = r0.toString()
            goto Lb0
        L47:
            r7 = 0
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            java.lang.String r7 = " µs"
            r8 = 1000(0x3e8, float:1.401E-42)
            r9 = 500(0x1f4, float:7.0E-43)
            if (r0 > 0) goto L67
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r9
            long r12 = r12 - r1
            long r1 = (long) r8
            long r12 = r12 / r1
            r0.append(r12)
            r0.append(r7)
            java.lang.String r12 = r0.toString()
            goto Lb0
        L67:
            r10 = 999500(0xf404c, double:4.938186E-318)
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 >= 0) goto L82
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r9
            long r12 = r12 + r1
            long r1 = (long) r8
            long r12 = r12 / r1
            r0.append(r12)
            r0.append(r7)
            java.lang.String r12 = r0.toString()
            goto Lb0
        L82:
            r7 = 999500000(0x3b9328e0, double:4.93818613E-315)
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 >= 0) goto L9d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r6
            long r12 = r12 + r1
            long r1 = (long) r5
            long r12 = r12 / r1
            r0.append(r12)
            r0.append(r4)
            java.lang.String r12 = r0.toString()
            goto Lb0
        L9d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r3 = (long) r3
            long r12 = r12 + r3
            long r2 = (long) r2
            long r12 = r12 / r2
            r0.append(r12)
            r0.append(r1)
            java.lang.String r12 = r0.toString()
        Lb0:
            r13 = 1
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r13)
            java.lang.String r13 = "%6s"
            java.lang.String r12 = java.lang.String.format(r13, r12)
            return r12
    }

    /* JADX INFO: renamed from: ξ */
    public static java.lang.Object m4428(java.lang.Object r5) {
            java.lang.String r0 = "getAdapter"
            java.lang.String r1 = "getAdapter2"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Class r3 = r5.getClass()     // Catch: java.lang.Throwable -> L10
            java.lang.reflect.Method r1 = r3.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L10
            java.lang.Object r5 = r1.invoke(r5, r2)     // Catch: java.lang.Throwable -> L10
            return r5
        L2a:
            java.lang.String r0 = "mAdapter"
            java.lang.String r1 = "adapter"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7b
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L3a
            r3 = 0
            r1 = r1[r3]     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r1 = p000.qe0.m4879(r5, r1)     // Catch: java.lang.Throwable -> L52
            goto L78
        L52:
            java.lang.Class r3 = r5.getClass()     // Catch: java.lang.Throwable -> L77
        L56:
            if (r3 == 0) goto L6a
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Throwable -> L77
            if (r4 != 0) goto L6a
            java.lang.reflect.Field r1 = r3.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L65 java.lang.Throwable -> L77
            goto L6b
        L65:
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Throwable -> L77
            goto L56
        L6a:
            r1 = r2
        L6b:
            if (r1 != 0) goto L6e
            goto L77
        L6e:
            r3 = 1
            r1.setAccessible(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L77
            goto L78
        L77:
            r1 = r2
        L78:
            if (r1 == 0) goto L3a
            return r1
        L7b:
            return r2
    }

    /* JADX INFO: renamed from: ο */
    public static final android.view.ViewParent m4429(android.view.View r1) {
            r1.getClass()
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto La
            return r0
        La:
            r0 = 2131297157(0x7f090385, float:1.821225E38)
            java.lang.Object r1 = r1.getTag(r0)
            boolean r0 = r1 instanceof android.view.ViewParent
            if (r0 == 0) goto L18
            android.view.ViewParent r1 = (android.view.ViewParent) r1
            return r1
        L18:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: π */
    public static final boolean m4430() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ρ */
    public static final p000.ux1 m4431(p000.ux1 r24, p000.ux1 r25) {
            r0 = r25
            if (r24 != 0) goto L5
            return r0
        L5:
            if (r0 != 0) goto L8
            return r24
        L8:
            f32 r1 = r0.f10996
            long r3 = r1.mo2033()
            kn0 r5 = r1.mo2034()
            float r6 = r1.mo2035()
            long r7 = r0.f10997
            d60 r9 = r0.f10998
            b60 r10 = r0.f10999
            c60 r11 = r0.f11000
            br r12 = r0.f11001
            java.lang.String r13 = r0.f11002
            long r14 = r0.f11003
            r8 r1 = r0.f11004
            g32 r2 = r0.f11005
            r16 = r1
            av0 r1 = r0.f11006
            r18 = r1
            r17 = r2
            long r1 = r0.f11007
            r19 = r1
            c32 r1 = r0.f11008
            fv1 r2 = r0.f11009
            kn0 r0 = r0.f11010
            r23 = r0
            r21 = r1
            r22 = r2
            r2 = r24
            ux1 r0 = p000.vx1.m6284(r2, r3, r5, r6, r7, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r23)
            return r0
    }

    /* JADX INFO: renamed from: σ */
    public static java.lang.Integer m4432(org.json.JSONObject r2, java.lang.String... r3) {
            ss1 r3 = p000.AbstractC0312g7.m2232(r3)
            gd1 r0 = new gd1
            r1 = 3
            r0.<init>(r2, r1)
            y30 r2 = p000.us1.m5943(r3, r0)
            java.lang.Object r2 = p000.us1.m5953(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            return r2
    }

    /* JADX INFO: renamed from: τ */
    public static java.lang.Long m4433(java.lang.String r0, org.json.JSONObject r1) {
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

    /* JADX INFO: renamed from: υ */
    public static java.lang.String m4434(org.json.JSONObject r2, java.lang.String... r3) {
            ss1 r3 = p000.AbstractC0312g7.m2232(r3)
            gd1 r0 = new gd1
            r1 = 4
            r0.<init>(r2, r1)
            y30 r2 = p000.us1.m5943(r3, r0)
            af1 r3 = p000.af1.f216
            java.util.Iterator r2 = r2.iterator()
        L14:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r3.invoke(r0)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L14
            goto L2d
        L2c:
            r0 = 0
        L2d:
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    /* JADX INFO: renamed from: φ */
    public static p000.ze1 m4435(org.json.JSONObject r17, int r18) {
            r0 = r17
            r1 = r18
            java.lang.String r2 = "cfg"
            java.lang.Object r2 = r0.opt(r2)
            org.json.JSONObject r2 = m4412(r2)
            java.lang.String r3 = "food_id"
            java.lang.String r4 = "foodId"
            java.lang.String r5 = "foodID"
            java.lang.String[] r6 = new java.lang.String[]{r3, r4, r5}
            java.lang.String r6 = m4434(r0, r6)
            r7 = 0
            if (r6 != 0) goto L34
            if (r2 == 0) goto L2b
            java.lang.String[] r3 = new java.lang.String[]{r5, r3, r4}
            java.lang.String r3 = m4434(r2, r3)
            r6 = r3
            goto L2c
        L2b:
            r6 = r7
        L2c:
            if (r6 != 0) goto L34
            java.lang.String r3 = "unknown-"
            java.lang.String r6 = p000.a12.m17(r3, r1)
        L34:
            r9 = r6
            java.lang.String r3 = "name"
            java.lang.String r4 = "food_name"
            java.lang.String r5 = "foodName"
            if (r2 == 0) goto L4a
            java.lang.String[] r6 = new java.lang.String[]{r5, r4, r3}
            java.lang.String r6 = m4434(r2, r6)
            if (r6 != 0) goto L48
            goto L4a
        L48:
            r10 = r6
            goto L57
        L4a:
            java.lang.String[] r3 = new java.lang.String[]{r4, r5, r3}
            java.lang.String r6 = m4434(r0, r3)
            if (r6 != 0) goto L48
            java.lang.String r6 = "未下发名称"
            goto L48
        L57:
            ze1 r8 = new ze1
            java.lang.String r3 = "price"
            java.lang.String r4 = "food_price"
            java.lang.String r5 = "foodPrice"
            java.lang.String[] r6 = new java.lang.String[]{r3, r4, r5}
            java.lang.Integer r6 = m4432(r0, r6)
            if (r6 != 0) goto L73
            if (r2 == 0) goto L75
            java.lang.String[] r3 = new java.lang.String[]{r5, r4, r3}
            java.lang.Integer r6 = m4432(r2, r3)
        L73:
            r11 = r6
            goto L76
        L75:
            r11 = r7
        L76:
            java.lang.String r3 = "time"
            java.lang.String r4 = "food_time"
            java.lang.String r5 = "foodTime"
            java.lang.String r6 = "duration"
            java.lang.String[] r12 = new java.lang.String[]{r3, r4, r5, r6}
            java.lang.Integer r12 = m4432(r0, r12)
            if (r12 != 0) goto L94
            if (r2 == 0) goto L93
            java.lang.String[] r3 = new java.lang.String[]{r5, r4, r3, r6}
            java.lang.Integer r12 = m4432(r2, r3)
            goto L94
        L93:
            r12 = r7
        L94:
            java.lang.String r3 = "closeness"
            java.lang.String r4 = "gain_closeness"
            java.lang.String r5 = "gainCloseness"
            java.lang.String[] r6 = new java.lang.String[]{r3, r4, r5}
            java.lang.Integer r6 = m4432(r0, r6)
            if (r6 != 0) goto Lb0
            if (r2 == 0) goto Lae
            java.lang.String[] r3 = new java.lang.String[]{r5, r4, r3}
            java.lang.Integer r7 = m4432(r2, r3)
        Lae:
            r13 = r7
            goto Lb1
        Lb0:
            r13 = r6
        Lb1:
            java.lang.String r3 = "icon"
            java.lang.String r4 = "food_icon"
            java.lang.String r5 = "foodIcon"
            if (r2 == 0) goto Lc6
            java.lang.String[] r6 = new java.lang.String[]{r5, r4, r3}
            java.lang.String r2 = m4434(r2, r6)
            if (r2 != 0) goto Lc4
            goto Lc6
        Lc4:
            r14 = r2
            goto Ld1
        Lc6:
            java.lang.String r2 = "pic"
            java.lang.String[] r2 = new java.lang.String[]{r4, r5, r3, r2}
            java.lang.String r2 = m4434(r0, r2)
            goto Lc4
        Ld1:
            java.lang.String r2 = "label"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.lang.String r15 = m4434(r0, r2)
            java.lang.String r0 = "response.food_info.list["
            java.lang.String r2 = "]"
            java.lang.String r16 = p000.AbstractC0602nx.m4127(r0, r1, r2)
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r8
    }

    /* JADX INFO: renamed from: χ */
    public static java.lang.String m4436(org.json.JSONObject r8, org.json.JSONObject r9) {
            java.lang.String r0 = "base_resp"
            org.json.JSONObject r0 = r8.optJSONObject(r0)
            java.lang.String r1 = "message"
            java.lang.String r2 = r8.optString(r1)
            java.lang.String r3 = "msg"
            r4 = r3
            java.lang.String r3 = r8.optString(r4)
            java.lang.String r5 = "status_msg"
            java.lang.String r8 = r8.optString(r5)
            java.lang.String r5 = r9.optString(r1)
            java.lang.String r6 = r9.optString(r4)
            if (r0 == 0) goto L2c
            java.lang.String r9 = "status_message"
            java.lang.String r9 = r0.optString(r9)
        L29:
            r4 = r8
            r7 = r9
            goto L2e
        L2c:
            r9 = 0
            goto L29
        L2e:
            java.lang.String[] r8 = new java.lang.String[]{r2, r3, r4, r5, r6, r7}
            ss1 r8 = p000.AbstractC0312g7.m2232(r8)
            f71 r9 = new f71
            r0 = 29
            r9.<init>(r0)
            y30 r8 = p000.us1.m5943(r8, r9)
            java.lang.Object r8 = p000.us1.m5953(r8)
            java.lang.String r8 = (java.lang.String) r8
            return r8
    }

    /* JADX INFO: renamed from: ψ */
    public static p000.ve1 m4437(java.lang.ClassLoader r2, java.lang.String r3, java.util.LinkedHashMap r4, java.util.LinkedHashMap r5) {
            r0 = 32
            rf1 r2 = p000.xn0.m6755(r2, r3, r4, r5, r0)
            boolean r3 = r2.m5085()
            if (r3 != 0) goto L18
            java.lang.Throwable r2 = r2.f9363
            if (r2 != 0) goto L17
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "食物宿主请求失败"
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
            zw0 r3 = m4414(r3)
            goto L35
        L34:
            r3 = r5
        L35:
            if (r3 != 0) goto L39
            kz r3 = p000.C0493kz.f6332
        L39:
            java.lang.String r4 = "response"
            java.lang.Object r4 = r3.get(r4)
            org.json.JSONObject r4 = m4412(r4)
            if (r4 != 0) goto L56
            java.lang.String r4 = "rawResponse"
            java.lang.Object r4 = r3.get(r4)
            org.json.JSONObject r4 = m4412(r4)
            if (r4 != 0) goto L56
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
        L56:
            ve1 r0 = new ve1
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
            java.lang.String r2 = "食物 Bridge 结果为空"
            p000.C1080.m7279(r2)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ω */
    public static final float m4438(long r4, float r6, p000.InterfaceC1031yr r7) {
            long r0 = p000.y32.m6819(r4)
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r2 = p000.z32.m7086(r0, r2)
            if (r2 == 0) goto L31
            float r0 = r7.mo590()
            double r0 = (double) r0
            r2 = 4607407598781385933(0x3ff0cccccccccccd, double:1.05)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L2c
            long r0 = r7.mo596(r6)
            float r4 = p000.y32.m6820(r4)
            float r5 = p000.y32.m6820(r0)
            float r4 = r4 / r5
        L2a:
            float r4 = r4 * r6
            return r4
        L2c:
            float r4 = r7.mo595(r4)
            return r4
        L31:
            r2 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r7 = p000.z32.m7086(r0, r2)
            if (r7 == 0) goto L41
            float r4 = p000.y32.m6820(r4)
            goto L2a
        L41:
            r4 = 2143289344(0x7fc00000, float:NaN)
            return r4
    }
}
