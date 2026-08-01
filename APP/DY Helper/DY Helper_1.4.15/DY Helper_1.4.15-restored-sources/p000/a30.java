package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a30 extends p000.p80 implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f55;

    public /* synthetic */ a30(int r1, java.lang.Object r2, java.lang.Class r3, java.lang.String r4, java.lang.String r5, int r6, int r7) {
            r0 = this;
            r0.f55 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
            r10 = this;
            int r0 = r10.f55
            r1 = 0
            switch(r0) {
                case 0: goto L185;
                case 1: goto La9;
                default: goto L6;
            }
        L6:
            id1 r11 = (p000.id1) r11
            id1 r12 = (p000.id1) r12
            r11.getClass()
            r12.getClass()
            java.lang.Object r10 = r10.receiver
            qc1 r10 = (p000.qc1) r10
            r10.getClass()
            java.lang.Integer r10 = r11.f5019
            java.lang.String r0 = "Required value was null."
            if (r10 == 0) goto La5
            int r10 = r10.intValue()
            java.lang.Integer r2 = r12.f5019
            if (r2 == 0) goto La1
            int r2 = r2.intValue()
            java.lang.Integer r3 = r11.f5020
            if (r3 == 0) goto L9d
            int r3 = r3.intValue()
            java.lang.Integer r4 = r12.f5020
            if (r4 == 0) goto L99
            int r0 = r4.intValue()
            if (r10 == 0) goto L4d
            if (r2 != 0) goto L3e
            goto L4d
        L3e:
            long r4 = (long) r3
            long r6 = (long) r2
            long r4 = r4 * r6
            long r6 = (long) r0
            long r8 = (long) r10
            long r6 = r6 * r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L60
            int r10 = p000.ln0.m3633(r6, r4)
            goto L94
        L4d:
            if (r10 != 0) goto L53
            if (r2 == 0) goto L53
            r10 = -1
            goto L94
        L53:
            if (r2 != 0) goto L59
            if (r10 == 0) goto L59
            r10 = 1
            goto L94
        L59:
            if (r3 == r0) goto L60
            int r10 = p000.ln0.m3632(r0, r3)
            goto L94
        L60:
            int r3 = r3 - r10
            int r0 = r0 - r2
            if (r3 == r0) goto L69
            int r10 = p000.ln0.m3632(r0, r3)
            goto L94
        L69:
            if (r10 == r2) goto L70
            int r10 = p000.ln0.m3632(r10, r2)
            goto L94
        L70:
            java.lang.Integer r10 = r11.f5018
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r10 == 0) goto L7c
            int r10 = r10.intValue()
            goto L7d
        L7c:
            r10 = r0
        L7d:
            java.lang.Integer r1 = r12.f5018
            if (r1 == 0) goto L85
            int r0 = r1.intValue()
        L85:
            if (r10 == r0) goto L8c
            int r10 = p000.ln0.m3632(r10, r0)
            goto L94
        L8c:
            int r10 = r11.f5015
            int r11 = r12.f5015
            int r10 = p000.ln0.m3632(r10, r11)
        L94:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            goto La8
        L99:
            p000.C1080.m7279(r0)
            goto La8
        L9d:
            p000.C1080.m7279(r0)
            goto La8
        La1:
            p000.C1080.m7279(r0)
            goto La8
        La5:
            p000.C1080.m7279(r0)
        La8:
            return r1
        La9:
            org.luckypray.dexkit.DexKitBridge r11 = (org.luckypray.dexkit.DexKitBridge) r11
            java.lang.ClassLoader r12 = (java.lang.ClassLoader) r12
            r11.getClass()
            r12.getClass()
            java.lang.Object r10 = r10.receiver
            b30 r10 = (p000.b30) r10
            r10.getClass()
            b30 r10 = p000.b30.f1438
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.List r2 = p000.b30.f1440
            java.util.Iterator r2 = r2.iterator()
        Lc7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Ldd
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Class r3 = p000.b30.m703(r11, r12, r3)
            if (r3 == 0) goto Lc7
            r0.add(r3)
            goto Lc7
        Ldd:
            s20 r2 = new s20     // Catch: java.lang.Throwable -> L106
            r3 = 5
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L106
            org.luckypray.dexkit.result.ClassDataList r11 = r11.findClass(r2)     // Catch: java.lang.Throwable -> L106
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L106
            r2.<init>()     // Catch: java.lang.Throwable -> L106
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L106
        Lf0:
            boolean r3 = r11.hasNext()     // Catch: java.lang.Throwable -> L106
            if (r3 == 0) goto L108
            java.lang.Object r3 = r11.next()     // Catch: java.lang.Throwable -> L106
            org.luckypray.dexkit.result.ClassData r3 = (org.luckypray.dexkit.result.ClassData) r3     // Catch: java.lang.Throwable -> L106
            java.lang.Class r3 = p000.b30.m702(r3, r12)     // Catch: java.lang.Throwable -> L106
            if (r3 == 0) goto Lf0
            r2.add(r3)     // Catch: java.lang.Throwable -> L106
            goto Lf0
        L106:
            r11 = move-exception
            goto L11f
        L108:
            java.util.Iterator r11 = r2.iterator()     // Catch: java.lang.Throwable -> L106
        L10c:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> L106
            if (r12 == 0) goto L11c
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> L106
            java.lang.Class r12 = (java.lang.Class) r12     // Catch: java.lang.Throwable -> L106
            r0.add(r12)     // Catch: java.lang.Throwable -> L106
            goto L10c
        L11c:
            s62 r11 = p000.s62.f9751     // Catch: java.lang.Throwable -> L106
            goto L125
        L11f:
            eo1 r12 = new eo1
            r12.<init>(r11)
            r11 = r12
        L125:
            java.lang.Throwable r11 = p000.fo1.m2190(r11)
            if (r11 == 0) goto L13b
            java.lang.String r11 = r11.getMessage()
            java.lang.String r12 = "DexKit 结构定位 Flux 右侧控件类失败: "
            java.lang.String r11 = p000.lz1.m3687(r12, r11)
            r12 = 4
            java.lang.String r2 = "rd9730769dd2a56d9"
            p000.C0888ux.m5988(r2, r11, r1, r12, r1)
        L13b:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r0.iterator()
        L144:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L15b
            java.lang.Object r0 = r12.next()
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r10.m709(r1)
            if (r1 == 0) goto L144
            r11.add(r0)
            goto L144
        L15b:
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
        L169:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L184
            java.lang.Object r0 = r11.next()
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r1.getName()
            boolean r1 = r10.add(r1)
            if (r1 == 0) goto L169
            r12.add(r0)
            goto L169
        L184:
            return r12
        L185:
            org.luckypray.dexkit.DexKitBridge r11 = (org.luckypray.dexkit.DexKitBridge) r11
            java.lang.ClassLoader r12 = (java.lang.ClassLoader) r12
            r11.getClass()
            r12.getClass()
            java.lang.Object r10 = r10.receiver
            b30 r10 = (p000.b30) r10
            r10.getClass()
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            java.util.List r0 = p000.b30.f1441
            java.util.Iterator r0 = r0.iterator()
        L1a1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b9
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            b30 r2 = p000.b30.f1438
            java.lang.Class r1 = p000.b30.m703(r11, r12, r1)
            if (r1 == 0) goto L1a1
            r10.add(r1)
            goto L1a1
        L1b9:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L1c2:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L1d9
            java.lang.Object r12 = r10.next()
            r0 = r12
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r0 = p000.b30.m705(r0)
            if (r0 == 0) goto L1c2
            r11.add(r12)
            goto L1c2
        L1d9:
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
        L1e7:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L202
            java.lang.Object r0 = r11.next()
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r1.getName()
            boolean r1 = r10.add(r1)
            if (r1 == 0) goto L1e7
            r12.add(r0)
            goto L1e7
        L202:
            return r12
    }
}
