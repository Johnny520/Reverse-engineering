package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t20 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10137;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.ClassLoader f10138;

    public /* synthetic */ t20(java.lang.ClassLoader r1, int r2) {
            r0 = this;
            r0.f10137 = r2
            r0.f10138 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ t20(java.lang.ClassLoader r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.f10137 = r3
            r0.f10138 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: β */
    private final java.lang.Object m5581(java.lang.Object r10) {
            r9 = this;
            java.lang.ClassLoader r9 = r9.f10138
            org.luckypray.dexkit.DexKitBridge r10 = (org.luckypray.dexkit.DexKitBridge) r10
            r10.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.uv0.f10964
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.String r2 = "~78D3ECFA63DB52E5A19E9BAEB1F7800A11F1EB5A04E5B7A221312F42CA326BDF84B464FE4832D738AC40A470FA237C08CA8228174BCD0BE11003D6A14F53CEC1BDE7E952FC87873CAAC51D93E24B25B15D"
            java.lang.String r2 = p000.jf0.m2957(r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.Class r2 = java.lang.Class.forName(r2, r1, r9)     // Catch: java.lang.Throwable -> L1a
            goto L21
        L1a:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L21:
            boolean r3 = r2 instanceof p000.eo1
            r4 = 0
            if (r3 == 0) goto L27
            r2 = r4
        L27:
            java.lang.Class r2 = (java.lang.Class) r2
            r3 = 1
            if (r2 != 0) goto L2e
        L2c:
            r1 = r4
            goto L9b
        L2e:
            java.lang.reflect.Constructor[] r2 = r2.getConstructors()
            r2.getClass()
            ss1 r2 = p000.AbstractC0312g7.m2232(r2)
            java.util.Iterator r2 = r2.iterator()
        L3d:
            boolean r5 = r2.hasNext()
            r6 = 2
            if (r5 == 0) goto L7f
            java.lang.Object r5 = r2.next()
            java.lang.reflect.Constructor r5 = (java.lang.reflect.Constructor) r5
            java.lang.Class[] r5 = r5.getParameterTypes()
            r5.getClass()
            java.util.List r5 = p000.AbstractC0312g7.m2262(r5)
            int r7 = r5.size()
            r8 = 3
            if (r7 != r8) goto L3d
            java.lang.Object r7 = r5.get(r1)
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 != 0) goto L3d
            java.lang.Object r7 = r5.get(r3)
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 != 0) goto L3d
            java.lang.Object r7 = r5.get(r6)
            java.lang.Class r7 = (java.lang.Class) r7
            boolean r7 = r7.isInterface()
            if (r7 == 0) goto L3d
            goto L80
        L7f:
            r5 = r4
        L80:
            if (r5 == 0) goto L2c
            tv0 r1 = new tv0
            java.lang.Object r2 = r5.get(r3)
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.String r2 = r2.getName()
            java.lang.Object r5 = r5.get(r6)
            java.lang.Class r5 = (java.lang.Class) r5
            java.lang.String r5 = r5.getName()
            r1.<init>(r2, r5)
        L9b:
            if (r1 != 0) goto La1
            jz r9 = p000.C0450jz.f5672
            goto L156
        La1:
            rv0 r2 = new rv0     // Catch: java.lang.Throwable -> Lab
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> Lab
            org.luckypray.dexkit.result.MethodDataList r10 = r10.findMethod(r2)     // Catch: java.lang.Throwable -> Lab
            goto Lb2
        Lab:
            r10 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r10)
            r10 = r2
        Lb2:
            boolean r2 = r10 instanceof p000.eo1
            if (r2 == 0) goto Lb7
            r10 = r4
        Lb7:
            org.luckypray.dexkit.result.MethodDataList r10 = (org.luckypray.dexkit.result.MethodDataList) r10
            if (r10 == 0) goto Ld5
            java.util.Iterator r10 = r10.iterator()
        Lbf:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Ld5
            java.lang.Object r2 = r10.next()
            org.luckypray.dexkit.result.MethodData r2 = (org.luckypray.dexkit.result.MethodData) r2
            java.lang.reflect.Method r2 = r2.getMethodInstance(r9)
            if (r2 == 0) goto Lbf
            r0.add(r2)
            goto Lbf
        Ld5:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r0.iterator()
        Lde:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Lf7
            java.lang.Object r2 = r10.next()
            r5 = r2
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            int r5 = p000.uv0.m5960(r5, r1)
            r6 = 3000(0xbb8, float:4.204E-42)
            if (r5 < r6) goto Lde
            r9.add(r2)
            goto Lde
        Lf7:
            ye r10 = new ye
            r2 = 26
            r10.<init>(r2, r1)
            java.util.List r9 = p000.AbstractC0984xh.m6658(r9, r10)
            java.util.Iterator r10 = r9.iterator()
        L106:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L116
            java.lang.Object r1 = r10.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.setAccessible(r3)
            goto L106
        L116:
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r9.iterator()
        L124:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L13f
            java.lang.Object r2 = r9.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r3 = p000.uv0.m5962(r3)
            boolean r3 = r10.add(r3)
            if (r3 == 0) goto L124
            r1.add(r2)
            goto L124
        L13f:
            int r9 = r0.size()
            int r10 = r1.size()
            java.lang.String r0 = "comment DexKit candidates="
            java.lang.String r2 = ", matched="
            java.lang.String r9 = p000.AbstractC0602nx.m4125(r9, r10, r0, r2)
            r10 = 4
            java.lang.String r0 = "rf5644a5272eb2eef"
            p000.C0888ux.m5988(r0, r9, r4, r10, r4)
            r9 = r1
        L156:
            return r9
    }

    /* JADX INFO: renamed from: γ */
    private final java.lang.Object m5582(java.lang.Object r4) {
            r3 = this;
            org.luckypray.dexkit.DexKitBridge r4 = (org.luckypray.dexkit.DexKitBridge) r4
            l41 r0 = p000.l41.f6416
            r4.getClass()
            sv0 r0 = new sv0
            r1 = 15
            r0.<init>(r1)
            org.luckypray.dexkit.result.MethodDataList r4 = r4.findMethod(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L1b:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r4.next()
            org.luckypray.dexkit.result.MethodData r1 = (org.luckypray.dexkit.result.MethodData) r1
            java.lang.ClassLoader r2 = r3.f10138
            java.lang.reflect.Method r1 = p000.l41.m3493(r1, r2)
            if (r1 == 0) goto L1b
            r0.add(r1)
            goto L1b
        L33:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r0.iterator()
        L3c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r4.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r1 = p000.l41.m3489(r1)
            if (r1 == 0) goto L3c
            r3.add(r0)
            goto L3c
        L53:
            return r3
    }

    /* JADX INFO: renamed from: δ */
    private final java.lang.Object m5583(java.lang.Object r6) {
            r5 = this;
            org.luckypray.dexkit.DexKitBridge r6 = (org.luckypray.dexkit.DexKitBridge) r6
            r6.getClass()
            l41 r0 = p000.l41.f6416
            java.lang.String r0 = "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B670A64ED4873391028A158374B5BB5B7FAFD848057E3FEABDBF8C529E1C2B7769BF5D7377F9A803FFDAE1A9D0E0DFE3B2567"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.ClassLoader r5 = r5.f10138
            java.util.List r0 = p000.l41.m3486(r6, r5, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.util.Set r4 = p000.l41.f6420
            java.lang.String r3 = r3.getName()
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L1c
            r1.add(r2)
            goto L1c
        L39:
            java.lang.String r0 = "调整缓存上限"
            java.lang.String r2 = "将清空已有缓存"
            java.lang.String[] r0 = new java.lang.String[]{r0, r2}
            java.util.List r5 = p000.l41.m3485(r6, r5, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L4e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r0 = r5.next()
            r2 = r0
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            boolean r3 = p000.l41.m3488(r2)
            if (r3 == 0) goto L4e
            java.lang.Class r2 = r2.getDeclaringClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "offlinemode"
            r4 = 1
            boolean r2 = p000.q02.m4654(r2, r3, r4)
            if (r2 == 0) goto L4e
            r6.add(r0)
            goto L4e
        L76:
            java.util.ArrayList r5 = p000.AbstractC0984xh.m6651(r1, r6)
            return r5
    }

    /* JADX INFO: renamed from: ζ */
    private final java.lang.Object m5584(java.lang.Object r4) {
            r3 = this;
            org.luckypray.dexkit.DexKitBridge r4 = (org.luckypray.dexkit.DexKitBridge) r4
            r4.getClass()
            l41 r0 = p000.l41.f6416
            java.lang.String r0 = "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B670A64ED4873391028A158374B5BB5B7FAFD848057E3FEABDBF8C529E1C2B7769BF5D7377F9A803FFDAE1A9D0E0DFE3B2567"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.ClassLoader r3 = r3.f10138
            java.util.List r3 = p000.l41.m3486(r4, r3, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L1c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r3.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.util.Set r2 = p000.l41.f6421
            java.lang.String r1 = r1.getName()
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L1c
            r4.add(r0)
            goto L1c
        L39:
            return r4
    }

    /* JADX INFO: renamed from: η */
    private final java.lang.Object m5585(java.lang.Object r6) {
            r5 = this;
            org.luckypray.dexkit.DexKitBridge r6 = (org.luckypray.dexkit.DexKitBridge) r6
            r6.getClass()
            l41 r0 = p000.l41.f6416
            java.lang.String r0 = "~78F7D766E6AD8F2F174318E7D62B7C5A33BB7F4AE8124A81AFC66CE9CAF1612AB0CC190D4DE79087AC9AA6387725E92C44671B8A1F53B7D95FD0FC4A146F6E9C4118321BB624C9457379A394FC87165DFAF1C84EA1F2939C"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.ClassLoader r5 = r5.f10138
            java.util.List r0 = p000.l41.m3486(r6, r5, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.util.Set r4 = p000.l41.f6419
            java.lang.String r3 = r3.getName()
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L1c
            r1.add(r2)
            goto L1c
        L39:
            java.lang.String r0 = "setCacheCount, mPbSize = "
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r5 = p000.l41.m3485(r6, r5, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L4c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r0 = r5.next()
            r2 = r0
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            boolean r3 = p000.l41.m3488(r2)
            if (r3 == 0) goto L4c
            java.lang.Class r2 = r2.getDeclaringClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "offlinemode"
            r4 = 1
            boolean r2 = p000.q02.m4654(r2, r3, r4)
            if (r2 == 0) goto L4c
            r6.add(r0)
            goto L4c
        L74:
            java.util.ArrayList r5 = p000.AbstractC0984xh.m6651(r1, r6)
            return r5
    }

    /* JADX INFO: renamed from: θ */
    private final java.lang.Object m5586(java.lang.Object r4) {
            r3 = this;
            org.luckypray.dexkit.DexKitBridge r4 = (org.luckypray.dexkit.DexKitBridge) r4
            l41 r0 = p000.l41.f6416
            r4.getClass()
            sv0 r0 = new sv0
            r1 = 13
            r0.<init>(r1)
            org.luckypray.dexkit.result.MethodDataList r4 = r4.findMethod(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L1b:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r4.next()
            org.luckypray.dexkit.result.MethodData r1 = (org.luckypray.dexkit.result.MethodData) r1
            java.lang.ClassLoader r2 = r3.f10138
            java.lang.reflect.Method r1 = p000.l41.m3493(r1, r2)
            if (r1 == 0) goto L1b
            r0.add(r1)
            goto L1b
        L33:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r0.iterator()
        L3c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r4.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r1 = p000.l41.m3490(r1)
            if (r1 == 0) goto L3c
            r3.add(r0)
            goto L3c
        L53:
            return r3
    }

    /* JADX INFO: renamed from: ι */
    private final java.lang.Object m5587(java.lang.Object r5) {
            r4 = this;
            org.luckypray.dexkit.DexKitBridge r5 = (org.luckypray.dexkit.DexKitBridge) r5
            l41 r0 = p000.l41.f6416
            r5.getClass()
            sv0 r0 = new sv0
            r1 = 14
            r0.<init>(r1)
            org.luckypray.dexkit.result.MethodDataList r5 = r5.findMethod(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L1b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r5.next()
            org.luckypray.dexkit.result.MethodData r1 = (org.luckypray.dexkit.result.MethodData) r1
            java.lang.ClassLoader r2 = r4.f10138
            java.lang.reflect.Method r1 = p000.l41.m3493(r1, r2)
            if (r1 == 0) goto L1b
            r0.add(r1)
            goto L1b
        L33:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r0.iterator()
        L3c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r0 = r5.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r2 = p000.l41.m3487(r1)
            if (r2 == 0) goto L3c
            java.lang.Class r1 = r1.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "offlinemode"
            r3 = 1
            boolean r1 = p000.q02.m4654(r1, r2, r3)
            if (r1 == 0) goto L3c
            r4.add(r0)
            goto L3c
        L64:
            return r4
    }

    /* JADX INFO: renamed from: κ */
    private final java.lang.Object m5588(java.lang.Object r5) {
            r4 = this;
            org.luckypray.dexkit.DexKitBridge r5 = (org.luckypray.dexkit.DexKitBridge) r5
            r5.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "rec_from_group_id"
            java.lang.String r2 = "recommend_rank"
            java.lang.String r3 = "recommend_page"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r1)
            java.lang.ClassLoader r4 = r4.f10138
            java.util.List r1 = p000.p81.m4390(r5, r4, r1)
            p000.AbstractC0984xh.m6660(r0, r1)
            java.lang.String r1 = "flow_type"
            java.lang.String r2 = "from_gid"
            java.lang.String r3 = "is_outer"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r1)
            java.util.List r5 = p000.p81.m4390(r5, r4, r1)
            p000.AbstractC0984xh.m6660(r0, r5)
            java.lang.String r5 = "X.C845060Wxx"
            java.lang.Class r4 = p000.p81.m4396(r4, r5)
            if (r4 == 0) goto L41
            r0.add(r4)
        L41:
            f7 r4 = new f7
            r5 = 1
            r4.<init>(r5, r0)
            f71 r5 = new f71
            r0 = 5
            r5.<init>(r0)
            cu r0 = new cu
            r1 = 0
            r0.<init>(r4, r1, r5)
            f71 r4 = new f71
            r5 = 6
            r4.<init>(r5)
            y30 r5 = new y30
            r1 = 1
            r5.<init>(r0, r1, r4)
            uh0 r4 = new uh0
            r0 = 24
            r4.<init>(r0)
            java.util.List r5 = p000.us1.m5949(r5)
            p000.AbstractC0019ai.m168(r5, r4)
            java.util.Iterator r4 = r5.iterator()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L7a
            jz r4 = p000.C0450jz.f5672
            goto L9c
        L7a:
            java.lang.Object r5 = r4.next()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L89
            java.util.List r4 = p000.AbstractC1021yh.m6896(r5)
            goto L9c
        L89:
            java.util.ArrayList r5 = p000.lz1.m3696(r5)
        L8d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r4.next()
            r5.add(r0)
            goto L8d
        L9b:
            r4 = r5
        L9c:
            return r4
    }

    /* JADX INFO: renamed from: λ */
    private final java.lang.Object m5589(java.lang.Object r5) {
            r4 = this;
            org.luckypray.dexkit.DexKitBridge r5 = (org.luckypray.dexkit.DexKitBridge) r5
            r5.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "topview_splash_dislike"
            java.lang.String r2 = "click_mute_author"
            java.lang.String r3 = "is_first_level_not_interesting_action"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r1)
            java.lang.ClassLoader r4 = r4.f10138
            java.util.List r1 = p000.p81.m4390(r5, r4, r1)
            p000.AbstractC0984xh.m6660(r0, r1)
            java.lang.String r1 = "button_type"
            java.lang.String r2 = "is_meteormode"
            java.lang.String r3 = "dislike_type"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r1)
            java.util.List r5 = p000.p81.m4390(r5, r4, r1)
            p000.AbstractC0984xh.m6660(r0, r5)
            java.lang.String r5 = "~789325E9C4B2AA228E18888457F2F91C62869634665744D0739FD84B98DBD2867A6B9B84318D72C0AB2C5BBC54D41867D271D27F1B4C8D3B6EAE18A46E40BCBD51"
            java.lang.String r5 = p000.jf0.m2957(r5)
            java.lang.Class r4 = p000.p81.m4396(r4, r5)
            if (r4 == 0) goto L45
            r0.add(r4)
        L45:
            f7 r4 = new f7
            r5 = 1
            r4.<init>(r5, r0)
            f71 r5 = new f71
            r0 = 3
            r5.<init>(r0)
            cu r0 = new cu
            r1 = 0
            r0.<init>(r4, r1, r5)
            f71 r4 = new f71
            r5 = 4
            r4.<init>(r5)
            y30 r5 = new y30
            r1 = 1
            r5.<init>(r0, r1, r4)
            uh0 r4 = new uh0
            r0 = 23
            r4.<init>(r0)
            java.util.List r5 = p000.us1.m5949(r5)
            p000.AbstractC0019ai.m168(r5, r4)
            java.util.Iterator r4 = r5.iterator()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L7e
            jz r4 = p000.C0450jz.f5672
            goto La0
        L7e:
            java.lang.Object r5 = r4.next()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L8d
            java.util.List r4 = p000.AbstractC1021yh.m6896(r5)
            goto La0
        L8d:
            java.util.ArrayList r5 = p000.lz1.m3696(r5)
        L91:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L9f
            java.lang.Object r0 = r4.next()
            r5.add(r0)
            goto L91
        L9f:
            r4 = r5
        La0:
            return r4
    }

    /* JADX INFO: renamed from: μ */
    private final java.lang.Object m5590(java.lang.Object r6) {
            r5 = this;
            java.lang.ClassLoader r5 = r5.f10138
            l91 r6 = (p000.l91) r6
            r6.getClass()
            java.lang.Object r0 = r6.f6502
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r6 = r6.f6503
            java.lang.String r6 = (java.lang.String) r6
            r1 = 0
            r2 = 0
            java.lang.Class r5 = java.lang.Class.forName(r0, r1, r5)     // Catch: java.lang.Throwable -> L40
            java.lang.reflect.Method[] r5 = r5.getMethods()     // Catch: java.lang.Throwable -> L40
            r5.getClass()     // Catch: java.lang.Throwable -> L40
            int r0 = r5.length     // Catch: java.lang.Throwable -> L40
        L1d:
            if (r1 >= r0) goto L45
            r3 = r5[r1]     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = r3.getName()     // Catch: java.lang.Throwable -> L40
            boolean r4 = p000.ln0.m3626(r4, r6)     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L42
            java.lang.Class[] r4 = r3.getParameterTypes()     // Catch: java.lang.Throwable -> L40
            r4.getClass()     // Catch: java.lang.Throwable -> L40
            int r4 = r4.length     // Catch: java.lang.Throwable -> L40
            if (r4 != 0) goto L42
            int r4 = r3.getModifiers()     // Catch: java.lang.Throwable -> L40
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L42
            goto L46
        L40:
            r5 = move-exception
            goto L70
        L42:
            int r1 = r1 + 1
            goto L1d
        L45:
            r3 = r2
        L46:
            if (r3 != 0) goto L49
            goto L6e
        L49:
            java.lang.Object r5 = r3.invoke(r2, r2)     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L6e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L6e
            java.lang.CharSequence r5 = p000.q02.m4660(r5)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L6e
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L40
            if (r6 <= 0) goto L6e
            java.lang.String r6 = "0"
            boolean r6 = r5.equals(r6)     // Catch: java.lang.Throwable -> L40
            if (r6 != 0) goto L6e
            goto L76
        L6e:
            r5 = r2
            goto L76
        L70:
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L76:
            boolean r6 = r5 instanceof p000.eo1
            if (r6 == 0) goto L7b
            goto L7c
        L7b:
            r2 = r5
        L7c:
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    /* JADX INFO: renamed from: ν */
    private final java.lang.Object m5591(java.lang.Object r9) {
            r8 = this;
            org.luckypray.dexkit.DexKitBridge r9 = (org.luckypray.dexkit.DexKitBridge) r9
            r9.getClass()
            java.util.List r0 = p000.uh1.f10811
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String r1 = "java.lang.String"
            java.lang.String[] r2 = new java.lang.String[]{r1}
            java.lang.ClassLoader r8 = r8.f10138
            java.lang.String r3 = "onPlayCompleted"
            p000.uh1.m5862(r9, r8, r0, r3, r2)
            java.lang.String r2 = "int"
            java.lang.String[] r4 = new java.lang.String[]{r1, r2}
            p000.uh1.m5862(r9, r8, r0, r3, r4)
            java.lang.String[] r4 = new java.lang.String[]{r1}
            java.lang.String r5 = "onPlayCompletedFirstTime"
            p000.uh1.m5862(r9, r8, r0, r5, r4)
            java.lang.String r4 = "~792CC2D8C5D51E39AD4E690FAB6B92B18C03F96CC58EAD434E9B00A2D2C063C389CCBAA1A923338920BA399B8488"
            java.lang.String r6 = p000.jf0.m2957(r4)
            java.lang.String[] r6 = new java.lang.String[]{r1, r6}
            p000.uh1.m5862(r9, r8, r0, r5, r6)
            r6 = 0
            java.lang.String[] r7 = new java.lang.String[]{r6, r1}
            p000.uh1.m5862(r9, r8, r0, r3, r7)
            java.lang.String[] r2 = new java.lang.String[]{r6, r1, r2}
            p000.uh1.m5862(r9, r8, r0, r3, r2)
            java.lang.String[] r2 = new java.lang.String[]{r6, r1}
            p000.uh1.m5862(r9, r8, r0, r5, r2)
            java.lang.String r2 = p000.jf0.m2957(r4)
            java.lang.String[] r1 = new java.lang.String[]{r6, r1, r2}
            p000.uh1.m5862(r9, r8, r0, r5, r1)
            java.lang.String r1 = "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B532A4FB444045E5F45F7E1B2B50D5955DD465C390D2E76F87756154E0D31183F4"
            java.lang.String r2 = p000.jf0.m2957(r1)
            java.lang.String[] r2 = new java.lang.String[]{r6, r2}
            p000.uh1.m5862(r9, r8, r0, r3, r2)
            java.lang.String r2 = p000.jf0.m2957(r1)
            java.lang.String[] r2 = new java.lang.String[]{r6, r2}
            java.lang.String r3 = "onPlayCompletedFirst"
            p000.uh1.m5862(r9, r8, r0, r3, r2)
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String[] r1 = new java.lang.String[]{r6, r1}
            java.lang.String r2 = "beforeNotifyCompletedPlay"
            p000.uh1.m5862(r9, r8, r0, r2, r1)
            boolean r1 = r0.isEmpty()
            r2 = 4
            java.lang.String r3 = "r5fd016b85524a7fd"
            if (r1 == 0) goto Le6
            cf1 r1 = new cf1     // Catch: java.lang.Throwable -> Lc4
            r4 = 22
            r1.<init>(r4)     // Catch: java.lang.Throwable -> Lc4
            org.luckypray.dexkit.result.MethodDataList r9 = r9.findMethod(r1)     // Catch: java.lang.Throwable -> Lc4
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> Lc4
        L98:
            boolean r1 = r9.hasNext()     // Catch: java.lang.Throwable -> Lc4
            if (r1 == 0) goto Lc6
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Throwable -> Lc4
            org.luckypray.dexkit.result.MethodData r1 = (org.luckypray.dexkit.result.MethodData) r1     // Catch: java.lang.Throwable -> Lc4
            java.lang.reflect.Method r1 = r1.getMethodInstance(r8)     // Catch: java.lang.Throwable -> La9
            goto Lb0
        La9:
            r1 = move-exception
            eo1 r4 = new eo1     // Catch: java.lang.Throwable -> Lc4
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Lc4
            r1 = r4
        Lb0:
            boolean r4 = r1 instanceof p000.eo1     // Catch: java.lang.Throwable -> Lc4
            if (r4 == 0) goto Lb5
            r1 = r6
        Lb5:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> Lc4
            if (r1 != 0) goto Lba
            goto L98
        Lba:
            boolean r4 = p000.uh1.m5860(r1)     // Catch: java.lang.Throwable -> Lc4
            if (r4 == 0) goto L98
            p000.uh1.m5856(r0, r1)     // Catch: java.lang.Throwable -> Lc4
            goto L98
        Lc4:
            r8 = move-exception
            goto Lc9
        Lc6:
            s62 r8 = p000.s62.f9751     // Catch: java.lang.Throwable -> Lc4
            goto Lcf
        Lc9:
            eo1 r9 = new eo1
            r9.<init>(r8)
            r8 = r9
        Lcf:
            java.lang.Throwable r8 = p000.fo1.m2190(r8)
            if (r8 == 0) goto Le6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "query feed type-only completed methods failed: "
            r9.<init>(r1)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            p000.C0888ux.m5988(r3, r8, r6, r2, r6)     // Catch: java.lang.Throwable -> Le6
        Le6:
            int r8 = r0.size()
            java.lang.String r9 = "DexKit completed methods found="
            java.lang.String r8 = p000.a12.m17(r9, r8)
            p000.C0888ux.m5988(r3, r8, r6, r2, r6)     // Catch: java.lang.Throwable -> Lf3
        Lf3:
            java.util.Collection r8 = r0.values()
            r8.getClass()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r8 = p000.AbstractC0984xh.m6666(r8)
            return r8
    }

    /* JADX INFO: renamed from: ξ */
    private final java.lang.Object m5592(java.lang.Object r8) {
            r7 = this;
            org.luckypray.dexkit.DexKitBridge r8 = (org.luckypray.dexkit.DexKitBridge) r8
            r8.getClass()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.List r1 = p000.ki1.f5939
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            yh0 r3 = new yh0     // Catch: java.lang.Throwable -> L3f
            r4 = 9
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L3f
            org.luckypray.dexkit.result.ClassDataList r3 = r8.findClass(r3)     // Catch: java.lang.Throwable -> L3f
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L3f
        L2b:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L41
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L3f
            org.luckypray.dexkit.result.ClassData r4 = (org.luckypray.dexkit.result.ClassData) r4     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L3f
            r0.add(r4)     // Catch: java.lang.Throwable -> L3f
            goto L2b
        L3f:
            r3 = move-exception
            goto L44
        L41:
            s62 r3 = p000.s62.f9751     // Catch: java.lang.Throwable -> L3f
            goto L4a
        L44:
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L4a:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L10
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "模板时间类名查询失败 name="
            java.lang.String r5 = ": "
            java.lang.String r6 = "r99b7e71b74d4ef6d"
            p000.AbstractC0602nx.m4144(r4, r2, r5, r3, r6)
            goto L10
        L5e:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r0 = r0.iterator()
        L67:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.ClassLoader r2 = r7.f10138
            java.lang.Class r1 = p000.AbstractC0093bx.m1082(r2, r1)
            if (r1 == 0) goto L67
            r8.add(r1)
            goto L67
        L7f:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r8.iterator()
        L88:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L9f
            java.lang.Object r0 = r8.next()
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = p000.ki1.m3274(r1)
            if (r1 == 0) goto L88
            r7.add(r0)
            goto L88
        L9f:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        Lad:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lc8
            java.lang.Object r1 = r7.next()
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.String r2 = r2.getName()
            boolean r2 = r8.add(r2)
            if (r2 == 0) goto Lad
            r0.add(r1)
            goto Lad
        Lc8:
            return r0
    }

    /* JADX INFO: renamed from: ο */
    private final java.lang.Object m5593(java.lang.Object r8) {
            r7 = this;
            org.luckypray.dexkit.DexKitBridge r8 = (org.luckypray.dexkit.DexKitBridge) r8
            r8.getClass()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.List r1 = p000.mi1.f7163
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            yh0 r3 = new yh0     // Catch: java.lang.Throwable -> L3f
            r4 = 11
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L3f
            org.luckypray.dexkit.result.ClassDataList r3 = r8.findClass(r3)     // Catch: java.lang.Throwable -> L3f
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L3f
        L2b:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L41
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L3f
            org.luckypray.dexkit.result.ClassData r4 = (org.luckypray.dexkit.result.ClassData) r4     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L3f
            r0.add(r4)     // Catch: java.lang.Throwable -> L3f
            goto L2b
        L3f:
            r3 = move-exception
            goto L44
        L41:
            s62 r3 = p000.s62.f9751     // Catch: java.lang.Throwable -> L3f
            goto L4a
        L44:
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L4a:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L10
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "strict className scan failed name="
            java.lang.String r5 = ": "
            java.lang.String r6 = "rb95bed5e6997b6c3"
            p000.AbstractC0602nx.m4144(r4, r2, r5, r3, r6)
            goto L10
        L5e:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r0 = r0.iterator()
        L67:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.ClassLoader r2 = r7.f10138
            java.lang.Class r1 = p000.AbstractC0093bx.m1082(r2, r1)
            if (r1 == 0) goto L67
            r8.add(r1)
            goto L67
        L7f:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r8.iterator()
        L88:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto La3
            java.lang.Object r0 = r8.next()
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            mi1 r2 = p000.mi1.f7162
            int r1 = p000.mi1.m3837(r1)
            r2 = 2000(0x7d0, float:2.803E-42)
            if (r1 < r2) goto L88
            r7.add(r0)
            goto L88
        La3:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        Lb1:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lcc
            java.lang.Object r1 = r7.next()
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.String r2 = r2.getName()
            boolean r2 = r8.add(r2)
            if (r2 == 0) goto Lb1
            r0.add(r1)
            goto Lb1
        Lcc:
            ib1 r7 = new ib1
            r8 = 21
            r7.<init>(r8)
            java.util.List r7 = p000.AbstractC0984xh.m6658(r0, r7)
            return r7
    }

    /* JADX INFO: renamed from: π */
    private final java.lang.Object m5594(java.lang.Object r6) {
            r5 = this;
            java.lang.ClassLoader r5 = r5.f10138
            org.luckypray.dexkit.DexKitBridge r6 = (org.luckypray.dexkit.DexKitBridge) r6
            r6.getClass()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.lang.String r1 = "setData: "
            java.lang.String r2 = "IMShareContactsListAdapter"
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.lang.String[][] r1 = new java.lang.String[][]{r1, r2}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r1)
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L67
            java.lang.Object r2 = r1.next()
            java.lang.String[] r2 = (java.lang.String[]) r2
            zi r3 = new zi     // Catch: java.lang.Throwable -> L24
            r4 = 6
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L24
            org.luckypray.dexkit.result.MethodDataList r2 = r6.findMethod(r3)     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L24
        L3e:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L24
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L24
            org.luckypray.dexkit.result.MethodData r3 = (org.luckypray.dexkit.result.MethodData) r3     // Catch: java.lang.Throwable -> L24
            java.lang.reflect.Method r3 = r3.getMethodInstance(r5)     // Catch: java.lang.Throwable -> L53
            java.lang.Class r3 = r3.getDeclaringClass()     // Catch: java.lang.Throwable -> L53
            goto L5a
        L53:
            r3 = move-exception
            eo1 r4 = new eo1     // Catch: java.lang.Throwable -> L24
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L24
            r3 = r4
        L5a:
            boolean r4 = r3 instanceof p000.eo1     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L5f
            r3 = 0
        L5f:
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L3e
            r0.add(r3)     // Catch: java.lang.Throwable -> L24
            goto L3e
        L67:
            java.util.List r5 = p000.fk1.m2144(r0)
            return r5
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r25) {
            r24 = this;
            r0 = r24
            int r1 = r0.f10137
            r3 = 14
            r4 = 25
            r5 = 2
            r6 = 23
            r7 = 6
            r8 = 3
            s62 r9 = p000.s62.f9751
            r10 = 5
            r11 = 0
            r12 = 19
            r14 = 4
            jz r15 = p000.C0450jz.f5672
            r13 = 1
            java.lang.ClassLoader r2 = r0.f10138
            switch(r1) {
                case 0: goto L9f5;
                case 1: goto L992;
                case 2: goto L8b6;
                case 3: goto L839;
                case 4: goto L80f;
                case 5: goto L762;
                case 6: goto L673;
                case 7: goto L5f2;
                case 8: goto L47a;
                case 9: goto L3cd;
                case 10: goto L34e;
                case 11: goto L1c8;
                case 12: goto L146;
                case 13: goto L80;
                case 14: goto L7b;
                case 15: goto L76;
                case 16: goto L71;
                case 17: goto L6c;
                case 18: goto L67;
                case 19: goto L62;
                case 20: goto L5d;
                case 21: goto L58;
                case 22: goto L53;
                case 23: goto L4e;
                case 24: goto L49;
                case 25: goto L44;
                case 26: goto L3f;
                case 27: goto L33;
                case 28: goto L2e;
                default: goto L1c;
            }
        L1c:
            r0 = r25
            java.lang.Class r0 = (java.lang.Class) r0
            r0.getClass()
            ry1 r1 = p000.ry1.f9602
            int r0 = p000.ry1.m5280(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L2e:
            java.lang.Object r0 = r24.m5594(r25)
            return r0
        L33:
            r0 = r25
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            java.lang.Class r0 = p000.AbstractC0093bx.m1082(r2, r0)
            return r0
        L3f:
            java.lang.Object r0 = r24.m5593(r25)
            return r0
        L44:
            java.lang.Object r0 = r24.m5592(r25)
            return r0
        L49:
            java.lang.Object r0 = r24.m5591(r25)
            return r0
        L4e:
            java.lang.Object r0 = r24.m5590(r25)
            return r0
        L53:
            java.lang.Object r0 = r24.m5589(r25)
            return r0
        L58:
            java.lang.Object r0 = r24.m5588(r25)
            return r0
        L5d:
            java.lang.Object r0 = r24.m5587(r25)
            return r0
        L62:
            java.lang.Object r0 = r24.m5586(r25)
            return r0
        L67:
            java.lang.Object r0 = r24.m5582(r25)
            return r0
        L6c:
            java.lang.Object r0 = r24.m5585(r25)
            return r0
        L71:
            java.lang.Object r0 = r24.m5584(r25)
            return r0
        L76:
            java.lang.Object r0 = r24.m5583(r25)
            return r0
        L7b:
            java.lang.Object r0 = r24.m5581(r25)
            return r0
        L80:
            r1 = r25
            org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1
            r1.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.uv0.f10964
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r0 = "~78F34A746881AA3660EE86BE622F7993067D6CB566F11858AD9BFDFAF7546DEFBE6F7A699FA0B4E1E231EAB579946FE2D2FA5C5B0B85A1F36EBFE6A126665CE055B3E4F9F2C8200D94DA2CD0520C73EF472A0B678E1F90F349"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r4 = "~781A9FBE2FBD8F61F657275D326874C55508DE7AC4D364B88930CC7C2AF8B2F6F1F42FB5723DCF19FDB169E3B07C1571F28AB7C03C50DB95F93145BAB7A004FEEA08CD9ED47324A2FC64074299E44EC1B9FF3E0358910EF4B9C33D8620934304D760AC"
            java.lang.String r4 = p000.jf0.m2957(r4)
            java.lang.String[] r0 = new java.lang.String[]{r0, r4}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r4 = r0.iterator()
        La6:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Le6
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            yh0 r5 = new yh0     // Catch: java.lang.Throwable -> Lbc
            r5.<init>(r0, r14)     // Catch: java.lang.Throwable -> Lbc
            org.luckypray.dexkit.result.MethodDataList r0 = r1.findMethod(r5)     // Catch: java.lang.Throwable -> Lbc
            goto Lc3
        Lbc:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        Lc3:
            boolean r5 = r0 instanceof p000.eo1
            if (r5 == 0) goto Lc8
            r0 = 0
        Lc8:
            org.luckypray.dexkit.result.MethodDataList r0 = (org.luckypray.dexkit.result.MethodDataList) r0
            if (r0 == 0) goto La6
            java.util.Iterator r0 = r0.iterator()
        Ld0:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto La6
            java.lang.Object r5 = r0.next()
            org.luckypray.dexkit.result.MethodData r5 = (org.luckypray.dexkit.result.MethodData) r5
            java.lang.reflect.Method r5 = r5.getMethodInstance(r2)
            if (r5 == 0) goto Ld0
            r3.add(r5)
            goto Ld0
        Le6:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r3.iterator()
        Lef:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L108
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            int r3 = p000.uv0.m5961(r3)
            r4 = 2000(0x7d0, float:2.803E-42)
            if (r3 < r4) goto Lef
            r0.add(r2)
            goto Lef
        L108:
            java.util.Iterator r1 = r0.iterator()
        L10c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L11c
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r2.setAccessible(r13)
            goto L10c
        L11c:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L12a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L145
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r4 = p000.uv0.m5962(r4)
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto L12a
            r2.add(r3)
            goto L12a
        L145:
            return r2
        L146:
            r0 = r25
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            r0.getClass()
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.tu0.f10462
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            xh0 r3 = new xh0
            r3.<init>(r0, r2, r14)
            java.lang.Object r3 = r3.invoke()     // Catch: java.lang.Throwable -> L162
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> L162
            p000.AbstractC0984xh.m6660(r1, r3)     // Catch: java.lang.Throwable -> L162
        L162:
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L176
            xh0 r3 = new xh0
            r3.<init>(r0, r2, r10)
            java.lang.Object r0 = r3.invoke()     // Catch: java.lang.Throwable -> L176
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L176
            p000.AbstractC0984xh.m6660(r1, r0)     // Catch: java.lang.Throwable -> L176
        L176:
            java.util.List r0 = p000.tu0.m5744(r2)
            java.util.ArrayList r0 = p000.AbstractC0984xh.m6651(r1, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L187:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L19e
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            boolean r3 = p000.tu0.m5742(r3)
            if (r3 == 0) goto L187
            r1.add(r2)
            goto L187
        L19e:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L1ac:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L1c7
            java.lang.Object r3 = r1.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r4 = p000.tu0.m5746(r4)
            boolean r4 = r0.add(r4)
            if (r4 == 0) goto L1ac
            r2.add(r3)
            goto L1ac
        L1c7:
            return r2
        L1c8:
            r1 = r25
            org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1
            r1.getClass()
            java.util.Set r0 = p000.cp0.f2703
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.List r0 = p000.cp0.f2708
            java.util.Iterator r4 = r0.iterator()
        L1dc:
            boolean r0 = r4.hasNext()
            java.lang.String r5 = ", "
            if (r0 == 0) goto L25b
            java.lang.Object r0 = r4.next()
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            org.luckypray.dexkit.query.FindClass$Companion r0 = org.luckypray.dexkit.query.FindClass.Companion     // Catch: java.lang.Throwable -> L230
            org.luckypray.dexkit.query.FindClass r0 = r0.create()     // Catch: java.lang.Throwable -> L230
            org.luckypray.dexkit.query.matchers.ClassMatcher$Companion r6 = org.luckypray.dexkit.query.matchers.ClassMatcher.Companion     // Catch: java.lang.Throwable -> L230
            org.luckypray.dexkit.query.matchers.ClassMatcher r10 = r6.create()     // Catch: java.lang.Throwable -> L230
            r14 = 6
            r15 = 0
            r12 = 0
            r13 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r6 = org.luckypray.dexkit.query.matchers.ClassMatcher.className$default(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L230
            org.luckypray.dexkit.query.FindClass r0 = r0.matcher(r6)     // Catch: java.lang.Throwable -> L230
            org.luckypray.dexkit.result.ClassDataList r0 = r1.findClass(r0)     // Catch: java.lang.Throwable -> L230
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> L230
        L20b:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L230
            if (r0 == 0) goto L232
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> L230
            org.luckypray.dexkit.result.ClassData r0 = (org.luckypray.dexkit.result.ClassData) r0     // Catch: java.lang.Throwable -> L230
            java.lang.Class r0 = r0.getInstance(r2)     // Catch: java.lang.Throwable -> L21c
            goto L223
        L21c:
            r0 = move-exception
            eo1 r7 = new eo1     // Catch: java.lang.Throwable -> L230
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L230
            r0 = r7
        L223:
            boolean r7 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L230
            if (r7 == 0) goto L228
            r0 = 0
        L228:
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Throwable -> L230
            if (r0 == 0) goto L20b
            r3.add(r0)     // Catch: java.lang.Throwable -> L230
            goto L20b
        L230:
            r0 = move-exception
            goto L234
        L232:
            r6 = r9
            goto L239
        L234:
            eo1 r6 = new eo1
            r6.<init>(r0)
        L239:
            java.lang.Throwable r0 = p000.fo1.m2190(r6)
            if (r0 == 0) goto L1dc
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "DexKit exact class query failed: "
            r6.<init>(r7)
            r6.append(r11)
            r6.append(r5)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            p000.cp0.m1606(r0)
            goto L1dc
        L25b:
            java.util.Set r0 = p000.cp0.f2703
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r4 = r0.iterator()
        L263:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2f7
            java.lang.Object r0 = r4.next()
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            org.luckypray.dexkit.query.FindMethod$Companion r0 = org.luckypray.dexkit.query.FindMethod.Companion     // Catch: java.lang.Throwable -> L2c4
            org.luckypray.dexkit.query.FindMethod r0 = r0.create()     // Catch: java.lang.Throwable -> L2c4
            org.luckypray.dexkit.query.matchers.MethodMatcher$Companion r7 = org.luckypray.dexkit.query.matchers.MethodMatcher.Companion     // Catch: java.lang.Throwable -> L2c4
            org.luckypray.dexkit.query.matchers.MethodMatcher r7 = r7.create()     // Catch: java.lang.Throwable -> L2c4
            java.lang.String[] r8 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L2c4
            org.luckypray.dexkit.query.matchers.MethodMatcher r10 = r7.usingStrings(r8)     // Catch: java.lang.Throwable -> L2c4
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            java.lang.String r11 = r7.getName()     // Catch: java.lang.Throwable -> L2c4
            r14 = 6
            r15 = 0
            r12 = 0
            r13 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher r7 = org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L2c4
            org.luckypray.dexkit.query.FindMethod r0 = r0.matcher(r7)     // Catch: java.lang.Throwable -> L2c4
            org.luckypray.dexkit.result.MethodDataList r0 = r1.findMethod(r0)     // Catch: java.lang.Throwable -> L2c4
            java.util.Iterator r7 = r0.iterator()     // Catch: java.lang.Throwable -> L2c4
        L29e:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L2c4
            if (r0 == 0) goto L2cd
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L2c4
            org.luckypray.dexkit.result.MethodData r0 = (org.luckypray.dexkit.result.MethodData) r0     // Catch: java.lang.Throwable -> L2c4
            java.lang.reflect.Method r0 = r0.getMethodInstance(r2)     // Catch: java.lang.Throwable -> L2af
            goto L2b6
        L2af:
            r0 = move-exception
            eo1 r8 = new eo1     // Catch: java.lang.Throwable -> L2c4
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L2c4
            r0 = r8
        L2b6:
            boolean r8 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L2c4
            if (r8 == 0) goto L2bb
            r0 = 0
        L2bb:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L2c4
            if (r0 == 0) goto L2c6
            java.lang.Class r0 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L2c4
            goto L2c7
        L2c4:
            r0 = move-exception
            goto L2cf
        L2c6:
            r0 = 0
        L2c7:
            if (r0 == 0) goto L29e
            r3.add(r0)     // Catch: java.lang.Throwable -> L2c4
            goto L29e
        L2cd:
            r7 = r9
            goto L2d4
        L2cf:
            eo1 r7 = new eo1
            r7.<init>(r0)
        L2d4:
            java.lang.Throwable r0 = p000.fo1.m2190(r7)
            if (r0 == 0) goto L263
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "DexKit moduleName query failed: "
            r7.<init>(r8)
            r7.append(r6)
            r7.append(r5)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            p000.cp0.m1606(r0)
            goto L263
        L2f7:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r3.iterator()
        L300:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L319
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.Class r3 = (java.lang.Class) r3
            int r3 = p000.cp0.m1607(r3)
            r4 = 900(0x384, float:1.261E-42)
            if (r3 < r4) goto L300
            r0.add(r2)
            goto L300
        L319:
            uh0 r1 = new uh0
            r2 = 11
            r1.<init>(r2)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r0, r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L332:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L34d
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.String r4 = r4.getName()
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto L332
            r2.add(r3)
            goto L332
        L34d:
            return r2
        L34e:
            r0 = r25
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            r0.getClass()
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.bk0.f1755
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            wj0 r3 = new wj0     // Catch: java.lang.Throwable -> L36a
            r3.<init>(r12)     // Catch: java.lang.Throwable -> L36a
            org.luckypray.dexkit.result.MethodDataList r0 = r0.findMethod(r3)     // Catch: java.lang.Throwable -> L36a
            java.util.ArrayList r0 = p000.bk0.m973(r0, r2)     // Catch: java.lang.Throwable -> L36a
            goto L371
        L36a:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L371:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L376
            goto L377
        L376:
            r15 = r0
        L377:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            p000.AbstractC0984xh.m6660(r1, r15)
            java.util.List r0 = p000.bk0.m970(r2)
            p000.AbstractC0984xh.m6660(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L38c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a3
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            boolean r3 = p000.bk0.m969(r3)
            if (r3 == 0) goto L38c
            r0.add(r2)
            goto L38c
        L3a3:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L3b1:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L3cc
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r4 = p000.bk0.m972(r4)
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto L3b1
            r2.add(r3)
            goto L3b1
        L3cc:
            return r2
        L3cd:
            r0 = r25
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            zj0 r3 = p000.zj0.f13118     // Catch: java.lang.Throwable -> L3eb
            fj0 r3 = new fj0     // Catch: java.lang.Throwable -> L3eb
            r4 = 20
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3eb
            org.luckypray.dexkit.result.MethodDataList r0 = r0.findMethod(r3)     // Catch: java.lang.Throwable -> L3eb
            java.util.ArrayList r0 = p000.zj0.m7140(r0, r2)     // Catch: java.lang.Throwable -> L3eb
            goto L3f2
        L3eb:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L3f2:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L3f7
            r0 = r15
        L3f7:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            p000.AbstractC0984xh.m6660(r1, r0)
            ng r16 = new ng
            zj0 r18 = p000.zj0.f13118
            r22 = 0
            r23 = 23
            r17 = 1
            java.lang.Class<zj0> r19 = p000.zj0.class
            java.lang.String r20 = "isNoticeUnreadMapMethod"
            java.lang.String r21 = "isNoticeUnreadMapMethod(Ljava/lang/reflect/Method;)Z"
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r0 = r16
            java.util.ArrayList r0 = p000.C0966x.m6425(r2, r0)
            p000.AbstractC0984xh.m6660(r1, r0)
            f7 r0 = new f7
            r0.<init>(r13, r1)
            fj0 r1 = new fj0
            r2 = 21
            r1.<init>(r2)
            y30 r2 = new y30
            r2.<init>(r0, r13, r1)
            fj0 r0 = new fj0
            r1 = 22
            r0.<init>(r1)
            y30 r1 = new y30
            r1.<init>(r2, r13, r0)
            uh0 r0 = new uh0
            r2 = 8
            r0.<init>(r2)
            fj0 r2 = new fj0
            r2.<init>(r6)
            bu r3 = new bu
            java.util.List r1 = p000.us1.m5949(r1)
            p000.AbstractC0019ai.m168(r1, r0)
            java.util.Iterator r0 = r1.iterator()
            r3.<init>(r0, r2)
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L458
            goto L479
        L458:
            java.lang.Object r0 = r3.next()
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L467
            java.util.List r15 = p000.AbstractC1021yh.m6896(r0)
            goto L479
        L467:
            java.util.ArrayList r15 = p000.lz1.m3696(r0)
        L46b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L479
            java.lang.Object r0 = r3.next()
            r15.add(r0)
            goto L46b
        L479:
            return r15
        L47a:
            r1 = r25
            org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1
            r1.getClass()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r0 = "~79504AF3C39B11021DAC8210F33C72EF521D7099C0A60F0CD80D768DA874A7739F1535D8D0B64C96CD3C16C27FA1E8BC98"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r4 = "~796422A8818C0EADCA9A33DA50D2E82D10279E237AB2D2E13462F13C8FD278512E981CB013C5C5C9450412A36D5EFF6CF526A8C7D6454A342B959326"
            java.lang.String r6 = p000.jf0.m2957(r4)
            zj0 r9 = p000.zj0.f13118     // Catch: java.lang.Throwable -> L4a2
            ub r9 = new ub     // Catch: java.lang.Throwable -> L4a2
            r9.<init>(r8, r0, r6)     // Catch: java.lang.Throwable -> L4a2
            org.luckypray.dexkit.result.MethodDataList r0 = r1.findMethod(r9)     // Catch: java.lang.Throwable -> L4a2
            java.util.ArrayList r0 = p000.zj0.m7140(r0, r2)     // Catch: java.lang.Throwable -> L4a2
            goto L4a9
        L4a2:
            r0 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r0)
            r0 = r6
        L4a9:
            boolean r6 = r0 instanceof p000.eo1
            if (r6 == 0) goto L4ae
            r0 = r15
        L4ae:
            java.util.List r0 = (java.util.List) r0
            p000.AbstractC0984xh.m6660(r3, r0)
            zj0 r0 = p000.zj0.f13118     // Catch: java.lang.Throwable -> L4c3
            wj0 r0 = new wj0     // Catch: java.lang.Throwable -> L4c3
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L4c3
            org.luckypray.dexkit.result.MethodDataList r0 = r1.findMethod(r0)     // Catch: java.lang.Throwable -> L4c3
            java.util.ArrayList r0 = p000.zj0.m7140(r0, r2)     // Catch: java.lang.Throwable -> L4c3
            goto L4ca
        L4c3:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L4ca:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L4cf
            r0 = r15
        L4cf:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            p000.AbstractC0984xh.m6660(r3, r0)
            java.lang.String r0 = "~794CAD4569E61E2D43B867359EB6123EE8F803FCDE2CE5CBCC8F2E17EC0A94ED7DDF376B1F1CCFFF57998EAEE9C317A38A8FB63CCDD0"
            java.lang.String r0 = p000.jf0.m2957(r0)     // Catch: java.lang.Throwable -> L50b
            java.lang.Class r0 = java.lang.Class.forName(r0, r11, r2)     // Catch: java.lang.Throwable -> L50b
            zj0 r1 = p000.zj0.f13118     // Catch: java.lang.Throwable -> L50b
            r0.getClass()     // Catch: java.lang.Throwable -> L50b
            java.util.ArrayList r0 = p000.zj0.m7141(r0)     // Catch: java.lang.Throwable -> L50b
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L50b
            r1.<init>()     // Catch: java.lang.Throwable -> L50b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L50b
        L4f0:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L50b
            if (r2 == 0) goto L50e
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L50b
            r6 = r2
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> L50b
            int r6 = r6.getModifiers()     // Catch: java.lang.Throwable -> L50b
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)     // Catch: java.lang.Throwable -> L50b
            if (r6 == 0) goto L4f0
            r1.add(r2)     // Catch: java.lang.Throwable -> L50b
            goto L4f0
        L50b:
            r0 = move-exception
            goto L57d
        L50e:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L50b
            r0.<init>()     // Catch: java.lang.Throwable -> L50b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L50b
        L517:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L50b
            if (r2 == 0) goto L532
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L50b
            r6 = r2
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> L50b
            java.lang.Class[] r6 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L50b
            r6.getClass()     // Catch: java.lang.Throwable -> L50b
            int r6 = r6.length     // Catch: java.lang.Throwable -> L50b
            if (r6 != 0) goto L517
            r0.add(r2)     // Catch: java.lang.Throwable -> L50b
            goto L517
        L532:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L50b
            r1.<init>()     // Catch: java.lang.Throwable -> L50b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L50b
        L53b:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L50b
            if (r2 == 0) goto L569
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L50b
            r6 = r2
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> L50b
            java.lang.Class r6 = r6.getReturnType()     // Catch: java.lang.Throwable -> L50b
            r6.getClass()     // Catch: java.lang.Throwable -> L50b
            java.lang.String r9 = r6.getName()     // Catch: java.lang.Throwable -> L50b
            java.lang.String r10 = p000.jf0.m2957(r4)     // Catch: java.lang.Throwable -> L50b
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> L50b
            if (r9 == 0) goto L55f
            r6 = r13
            goto L563
        L55f:
            boolean r6 = p000.C0966x.m6451(r6)     // Catch: java.lang.Throwable -> L50b
        L563:
            if (r6 == 0) goto L53b
            r1.add(r2)     // Catch: java.lang.Throwable -> L50b
            goto L53b
        L569:
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> L50b
        L56d:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L50b
            if (r2 == 0) goto L582
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L50b
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L50b
            r2.setAccessible(r13)     // Catch: java.lang.Throwable -> L50b
            goto L56d
        L57d:
            eo1 r1 = new eo1
            r1.<init>(r0)
        L582:
            boolean r0 = r1 instanceof p000.eo1
            if (r0 == 0) goto L587
            r1 = r15
        L587:
            java.util.List r1 = (java.util.List) r1
            p000.AbstractC0984xh.m6660(r3, r1)
            f7 r0 = new f7
            r0.<init>(r13, r3)
            wj0 r1 = new wj0
            r1.<init>(r13)
            y30 r2 = new y30
            r2.<init>(r0, r13, r1)
            wj0 r0 = new wj0
            r0.<init>(r5)
            y30 r1 = new y30
            r1.<init>(r2, r13, r0)
            wj0 r0 = new wj0
            r0.<init>(r8)
            y30 r2 = new y30
            r2.<init>(r1, r13, r0)
            uh0 r0 = new uh0
            r0.<init>(r7)
            wj0 r1 = new wj0
            r1.<init>(r14)
            bu r3 = new bu
            java.util.List r2 = p000.us1.m5949(r2)
            p000.AbstractC0019ai.m168(r2, r0)
            java.util.Iterator r0 = r2.iterator()
            r3.<init>(r0, r1)
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L5d0
            goto L5f1
        L5d0:
            java.lang.Object r0 = r3.next()
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L5df
            java.util.List r15 = p000.AbstractC1021yh.m6896(r0)
            goto L5f1
        L5df:
            java.util.ArrayList r15 = p000.lz1.m3696(r0)
        L5e3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5f1
            java.lang.Object r0 = r3.next()
            r15.add(r0)
            goto L5e3
        L5f1:
            return r15
        L5f2:
            r0 = r25
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r0 = p000.C0966x.m6416(r2, r0)
            p000.AbstractC0984xh.m6660(r1, r0)
            ng r16 = new ng
            zj0 r18 = p000.zj0.f13118
            r22 = 0
            r23 = 21
            r17 = 1
            java.lang.Class<zj0> r19 = p000.zj0.class
            java.lang.String r20 = "isNoticeClearUnreadMethod"
            java.lang.String r21 = "isNoticeClearUnreadMethod(Ljava/lang/reflect/Method;)Z"
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r0 = r16
            java.util.ArrayList r0 = p000.C0966x.m6425(r2, r0)
            p000.AbstractC0984xh.m6660(r1, r0)
            f7 r0 = new f7
            r0.<init>(r13, r1)
            wj0 r1 = new wj0
            r1.<init>(r10)
            y30 r2 = new y30
            r2.<init>(r0, r13, r1)
            uh0 r0 = new uh0
            r0.<init>(r10)
            wj0 r1 = new wj0
            r1.<init>(r7)
            bu r3 = new bu
            java.util.List r2 = p000.us1.m5949(r2)
            p000.AbstractC0019ai.m168(r2, r0)
            java.util.Iterator r0 = r2.iterator()
            r3.<init>(r0, r1)
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L651
            goto L672
        L651:
            java.lang.Object r0 = r3.next()
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L660
            java.util.List r15 = p000.AbstractC1021yh.m6896(r0)
            goto L672
        L660:
            java.util.ArrayList r15 = p000.lz1.m3696(r0)
        L664:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L672
            java.lang.Object r0 = r3.next()
            r15.add(r0)
            goto L664
        L672:
            return r15
        L673:
            r1 = r25
            org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1
            r1.getClass()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            zj0 r0 = p000.zj0.f13118     // Catch: java.lang.Throwable -> L691
            fj0 r0 = new fj0     // Catch: java.lang.Throwable -> L691
            r5 = 24
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L691
            org.luckypray.dexkit.result.MethodDataList r0 = r1.findMethod(r0)     // Catch: java.lang.Throwable -> L691
            java.util.ArrayList r0 = p000.zj0.m7140(r0, r2)     // Catch: java.lang.Throwable -> L691
            goto L698
        L691:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L698:
            boolean r5 = r0 instanceof p000.eo1
            if (r5 == 0) goto L69d
            r0 = r15
        L69d:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            p000.AbstractC0984xh.m6660(r3, r0)
            zj0 r0 = p000.zj0.f13118     // Catch: java.lang.Throwable -> L6b2
            fj0 r0 = new fj0     // Catch: java.lang.Throwable -> L6b2
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L6b2
            org.luckypray.dexkit.result.MethodDataList r0 = r1.findMethod(r0)     // Catch: java.lang.Throwable -> L6b2
            java.util.ArrayList r0 = p000.zj0.m7140(r0, r2)     // Catch: java.lang.Throwable -> L6b2
            goto L6b9
        L6b2:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L6b9:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L6be
            r0 = r15
        L6be:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            p000.AbstractC0984xh.m6660(r3, r0)
            java.lang.String r0 = "~796422A8818C0EADCA9A33DA50D2E82D10279E237AB2D2E13465F36685DE700F208610F00484FDC242593DAB7C63FD6BF226A9E1C77A5F232FB29534"
            java.lang.String r0 = p000.jf0.m2957(r0)     // Catch: java.lang.Throwable -> L6ef
            java.lang.Class r0 = java.lang.Class.forName(r0, r11, r2)     // Catch: java.lang.Throwable -> L6ef
            zj0 r1 = p000.zj0.f13118     // Catch: java.lang.Throwable -> L6ef
            r0.getClass()     // Catch: java.lang.Throwable -> L6ef
            java.lang.String r1 = "LJIIL"
            java.lang.Class[] r2 = p000.zj0.m7158()     // Catch: java.lang.Throwable -> L6ef
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r7)     // Catch: java.lang.Throwable -> L6ef
            java.lang.Class[] r2 = (java.lang.Class[]) r2     // Catch: java.lang.Throwable -> L6ef
            java.lang.reflect.Method r1 = p000.zj0.m7145(r0, r1, r2)     // Catch: java.lang.Throwable -> L6ef
            java.lang.reflect.Method r0 = p000.zj0.m7144(r0)     // Catch: java.lang.Throwable -> L6ef
            java.lang.reflect.Method[] r0 = new java.lang.reflect.Method[]{r1, r0}     // Catch: java.lang.Throwable -> L6ef
            java.util.ArrayList r0 = p000.AbstractC0312g7.m2248(r0)     // Catch: java.lang.Throwable -> L6ef
            goto L6f6
        L6ef:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L6f6:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L6fb
            r0 = r15
        L6fb:
            java.util.List r0 = (java.util.List) r0
            p000.AbstractC0984xh.m6660(r3, r0)
            f7 r0 = new f7
            r0.<init>(r13, r3)
            fj0 r1 = new fj0
            r2 = 26
            r1.<init>(r2)
            y30 r2 = new y30
            r2.<init>(r0, r13, r1)
            fj0 r0 = new fj0
            r1 = 27
            r0.<init>(r1)
            y30 r1 = new y30
            r1.<init>(r2, r13, r0)
            uh0 r0 = new uh0
            r0.<init>(r14)
            fj0 r2 = new fj0
            r3 = 28
            r2.<init>(r3)
            bu r3 = new bu
            java.util.List r1 = p000.us1.m5949(r1)
            p000.AbstractC0019ai.m168(r1, r0)
            java.util.Iterator r0 = r1.iterator()
            r3.<init>(r0, r2)
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L740
            goto L761
        L740:
            java.lang.Object r0 = r3.next()
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L74f
            java.util.List r15 = p000.AbstractC1021yh.m6896(r0)
            goto L761
        L74f:
            java.util.ArrayList r15 = p000.lz1.m3696(r0)
        L753:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L761
            java.lang.Object r0 = r3.next()
            r15.add(r0)
            goto L753
        L761:
            return r15
        L762:
            r0 = r25
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r4 = p000.C0966x.m6416(r2, r0)
            p000.AbstractC0984xh.m6660(r1, r4)
            zj0 r4 = p000.zj0.f13118     // Catch: java.lang.Throwable -> L787
            wj0 r4 = new wj0     // Catch: java.lang.Throwable -> L787
            r5 = 13
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L787
            org.luckypray.dexkit.result.MethodDataList r0 = r0.findMethod(r4)     // Catch: java.lang.Throwable -> L787
            java.util.ArrayList r0 = p000.zj0.m7140(r0, r2)     // Catch: java.lang.Throwable -> L787
            goto L78e
        L787:
            r0 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        L78e:
            boolean r4 = r0 instanceof p000.eo1
            if (r4 == 0) goto L793
            r0 = r15
        L793:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            p000.AbstractC0984xh.m6660(r1, r0)
            ng r4 = new ng
            zj0 r6 = p000.zj0.f13118
            r10 = 0
            r11 = 22
            r5 = 1
            java.lang.Class<zj0> r7 = p000.zj0.class
            java.lang.String r8 = "isNoticeSetUnreadCountMethod"
            java.lang.String r9 = "isNoticeSetUnreadCountMethod(Ljava/lang/reflect/Method;)Z"
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            java.util.ArrayList r0 = p000.C0966x.m6425(r2, r4)
            p000.AbstractC0984xh.m6660(r1, r0)
            f7 r0 = new f7
            r0.<init>(r13, r1)
            wj0 r1 = new wj0
            r1.<init>(r3)
            y30 r2 = new y30
            r2.<init>(r0, r13, r1)
            wj0 r0 = new wj0
            r1 = 15
            r0.<init>(r1)
            y30 r1 = new y30
            r1.<init>(r2, r13, r0)
            uh0 r0 = new uh0
            r2 = 7
            r0.<init>(r2)
            fj0 r2 = new fj0
            r2.<init>(r12)
            bu r3 = new bu
            java.util.List r1 = p000.us1.m5949(r1)
            p000.AbstractC0019ai.m168(r1, r0)
            java.util.Iterator r0 = r1.iterator()
            r3.<init>(r0, r2)
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L7ed
            goto L80e
        L7ed:
            java.lang.Object r0 = r3.next()
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L7fc
            java.util.List r15 = p000.AbstractC1021yh.m6896(r0)
            goto L80e
        L7fc:
            java.util.ArrayList r15 = p000.lz1.m3696(r0)
        L800:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L80e
            java.lang.Object r0 = r3.next()
            r15.add(r0)
            goto L800
        L80e:
            return r15
        L80f:
            r0 = r25
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            r0.getClass()
            vj0 r1 = p000.vj0.f11310
            java.util.List r3 = p000.vj0.m6255(r0, r2, r13)
            java.util.List r4 = r1.m6267(r3)
            int r6 = r4.size()
            if (r6 != r5) goto L828
            r13 = r4
            goto L829
        L828:
            r13 = 0
        L829:
            if (r13 == 0) goto L82c
            goto L838
        L82c:
            java.util.List r0 = p000.vj0.m6255(r0, r2, r11)
            java.util.ArrayList r0 = p000.AbstractC0984xh.m6651(r3, r0)
            java.util.List r13 = r1.m6267(r0)
        L838:
            return r13
        L839:
            r0 = r25
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            r0.getClass()
            android.os.Handler r1 = p000.ah0.f229
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.lang.String r3 = "im_msg_list_same_item_id_exception"
            org.luckypray.dexkit.query.FindMethod$Companion r4 = org.luckypray.dexkit.query.FindMethod.Companion     // Catch: java.lang.Throwable -> L8a2
            org.luckypray.dexkit.query.FindMethod r4 = r4.create()     // Catch: java.lang.Throwable -> L8a2
            org.luckypray.dexkit.query.matchers.MethodMatcher$Companion r5 = org.luckypray.dexkit.query.matchers.MethodMatcher.Companion     // Catch: java.lang.Throwable -> L8a2
            org.luckypray.dexkit.query.matchers.MethodMatcher r5 = r5.create()     // Catch: java.lang.Throwable -> L8a2
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L8a2
            org.luckypray.dexkit.query.matchers.MethodMatcher r3 = r5.usingStrings(r3)     // Catch: java.lang.Throwable -> L8a2
            org.luckypray.dexkit.query.FindMethod r3 = r4.matcher(r3)     // Catch: java.lang.Throwable -> L8a2
            org.luckypray.dexkit.result.MethodDataList r0 = r0.findMethod(r3)     // Catch: java.lang.Throwable -> L8a2
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L8a2
            r3.getClass()     // Catch: java.lang.Throwable -> L8a2
        L86c:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L8a2
            if (r0 == 0) goto L8a8
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L8a2
            r0.getClass()     // Catch: java.lang.Throwable -> L8a2
            org.luckypray.dexkit.result.MethodData r0 = (org.luckypray.dexkit.result.MethodData) r0     // Catch: java.lang.Throwable -> L8a2
            java.lang.reflect.Method r0 = r0.getMethodInstance(r2)     // Catch: java.lang.Throwable -> L880
            goto L887
        L880:
            r0 = move-exception
            eo1 r4 = new eo1     // Catch: java.lang.Throwable -> L8a2
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L8a2
            r0 = r4
        L887:
            boolean r4 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L8a2
            if (r4 == 0) goto L88c
            r0 = 0
        L88c:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L8a2
            if (r0 != 0) goto L891
            goto L86c
        L891:
            java.lang.Class r0 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L8a2
            if (r0 != 0) goto L898
            goto L86c
        L898:
            boolean r4 = p000.ah0.m125(r0)     // Catch: java.lang.Throwable -> L8a2
            if (r4 == 0) goto L86c
            r1.add(r0)     // Catch: java.lang.Throwable -> L8a2
            goto L86c
        L8a2:
            r0 = move-exception
            eo1 r9 = new eo1
            r9.<init>(r0)
        L8a8:
            java.lang.Throwable r0 = p000.fo1.m2190(r9)
            if (r0 == 0) goto L8b1
            r0.getMessage()
        L8b1:
            java.util.List r0 = p000.AbstractC0984xh.m6666(r1)
            return r0
        L8b6:
            r1 = r25
            org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1
            r1.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r0 = "~79504AF3C39B11021DAC8210F33C72EF521D7099C0A60F0CD8057C9CA539AF329A0030D8C8B05C9AC10C29CF5CAFEBBC86"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r7 = "~7924EBBB26E5F66AE51C20F0B6D7913B6350E34D1800219366D00F3ECE76895F8E4CEECA58736F4E112BCC66"
            java.lang.String r7 = p000.jf0.m2957(r7)
            java.lang.String[] r0 = new java.lang.String[]{r0, r7}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r7 = r0.iterator()
        L8da:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L929
            java.lang.Object r0 = r7.next()
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            s9 r0 = new s9     // Catch: java.lang.Throwable -> L90f
            r0.<init>(r10, r4)     // Catch: java.lang.Throwable -> L90f
            org.luckypray.dexkit.result.MethodDataList r0 = r1.findMethod(r0)     // Catch: java.lang.Throwable -> L90f
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L90f
            r11.<init>()     // Catch: java.lang.Throwable -> L90f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L90f
        L8f9:
            boolean r12 = r0.hasNext()     // Catch: java.lang.Throwable -> L90f
            if (r12 == 0) goto L911
            java.lang.Object r12 = r0.next()     // Catch: java.lang.Throwable -> L90f
            org.luckypray.dexkit.result.MethodData r12 = (org.luckypray.dexkit.result.MethodData) r12     // Catch: java.lang.Throwable -> L90f
            java.lang.reflect.Method r12 = r12.getMethodInstance(r2)     // Catch: java.lang.Throwable -> L90f
            if (r12 == 0) goto L8f9
            r11.add(r12)     // Catch: java.lang.Throwable -> L90f
            goto L8f9
        L90f:
            r0 = move-exception
            goto L916
        L911:
            p000.AbstractC0984xh.m6660(r5, r11)     // Catch: java.lang.Throwable -> L90f
            r11 = r9
            goto L91b
        L916:
            eo1 r11 = new eo1
            r11.<init>(r0)
        L91b:
            java.lang.Throwable r0 = p000.fo1.m2190(r11)
            if (r0 == 0) goto L8da
            java.lang.String r11 = "r45da87c70c377d6f"
            java.lang.String r12 = "DexKit 定位视频 UrlModel Getter 失败 returnType="
            p000.AbstractC0602nx.m4145(r12, r10, r11, r0)
            goto L8da
        L929:
            f7 r0 = new f7
            r0.<init>(r13, r5)
            s20 r1 = new s20
            r1.<init>(r6)
            y30 r2 = new y30
            r2.<init>(r0, r13, r1)
            s20 r0 = new s20
            r0.<init>(r3)
            t52 r0 = p000.us1.m5945(r2, r0)
            qt r1 = new qt
            r2 = 17
            r1.<init>(r2)
            cu r2 = new cu
            r2.<init>(r0, r8, r1)
            s20 r0 = new s20
            r1 = 15
            r0.<init>(r1)
            y30 r1 = new y30
            r1.<init>(r2, r13, r0)
            s20 r0 = new s20
            r2 = 16
            r0.<init>(r2)
            bu r2 = new bu
            java.util.Iterator r1 = r1.iterator()
            r2.<init>(r1, r0)
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L970
            goto L991
        L970:
            java.lang.Object r0 = r2.next()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L97f
            java.util.List r15 = p000.AbstractC1021yh.m6896(r0)
            goto L991
        L97f:
            java.util.ArrayList r15 = p000.lz1.m3696(r0)
        L983:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L991
            java.lang.Object r0 = r2.next()
            r15.add(r0)
            goto L983
        L991:
            return r15
        L992:
            r0 = r25
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r8 = "insertPreloadMedia"
            java.lang.String r9 = "startDataLoader"
            java.lang.String r3 = "setIntValue"
            java.lang.String r4 = "addTask"
            java.lang.String r5 = "addPreloadModelMedia"
            java.lang.String r6 = "addPriorityPreloadTask"
            java.lang.String r7 = "addPreloadMedias"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9}
            java.util.List r3 = p000.AbstractC1021yh.m6897(r3)
            java.util.Iterator r3 = r3.iterator()
        L9b8:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L9f0
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            s9 r5 = new s9     // Catch: java.lang.Throwable -> L9b8
            r5.<init>(r4, r12)     // Catch: java.lang.Throwable -> L9b8
            org.luckypray.dexkit.result.MethodDataList r4 = r0.findMethod(r5)     // Catch: java.lang.Throwable -> L9b8
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9b8
            r5.<init>()     // Catch: java.lang.Throwable -> L9b8
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L9b8
        L9d6:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L9b8
            if (r6 == 0) goto L9ec
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L9b8
            org.luckypray.dexkit.result.MethodData r6 = (org.luckypray.dexkit.result.MethodData) r6     // Catch: java.lang.Throwable -> L9b8
            java.lang.reflect.Method r6 = p000.pd2.m4503(r6, r2)     // Catch: java.lang.Throwable -> L9b8
            if (r6 == 0) goto L9d6
            r5.add(r6)     // Catch: java.lang.Throwable -> L9b8
            goto L9d6
        L9ec:
            p000.AbstractC0984xh.m6660(r1, r5)     // Catch: java.lang.Throwable -> L9b8
            goto L9b8
        L9f0:
            java.util.ArrayList r0 = p000.pd2.m4493(r1)
            return r0
        L9f5:
            r0 = r25
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            r0.getClass()
            l20 r1 = new l20     // Catch: java.lang.Throwable -> La24
            r1.<init>(r12)     // Catch: java.lang.Throwable -> La24
            org.luckypray.dexkit.result.MethodDataList r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> La24
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La24
            r1.<init>()     // Catch: java.lang.Throwable -> La24
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> La24
        La0e:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> La24
            if (r3 == 0) goto La2a
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> La24
            org.luckypray.dexkit.result.MethodData r3 = (org.luckypray.dexkit.result.MethodData) r3     // Catch: java.lang.Throwable -> La24
            java.lang.reflect.Method r3 = p000.pd2.m4503(r3, r2)     // Catch: java.lang.Throwable -> La24
            if (r3 == 0) goto La0e
            r1.add(r3)     // Catch: java.lang.Throwable -> La24
            goto La0e
        La24:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
        La2a:
            boolean r0 = r1 instanceof p000.eo1
            if (r0 == 0) goto La2f
            goto La30
        La2f:
            r15 = r1
        La30:
            java.util.List r15 = (java.util.List) r15
            return r15
    }
}
