package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hi0 implements p000.v41 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ java.lang.Object f4745;

    public /* synthetic */ hi0(java.lang.Object r1) {
            r0 = this;
            r0.f4745 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    public p000.hi0 m2509(java.lang.String r9, p000.C0379i0 r10) {
            r8 = this;
            java.lang.Object r8 = r8.f4745
            li0 r8 = (p000.li0) r8
            wi0 r0 = p000.wi0.f11726
            java.lang.ClassLoader r8 = r8.f6660
            java.util.concurrent.ConcurrentHashMap r0 = p000.wi0.f11733
            r8.getClass()
            boolean r1 = p000.q02.m4671(r9)
            r2 = 0
            if (r1 != 0) goto L105
            java.util.concurrent.atomic.AtomicReference r1 = p000.wi0.f11729
            r1.set(r8)
            r1.set(r8)
            ci0 r1 = p000.ci0.f2128
            java.lang.Object r1 = r1.m1214(r8)
            if (r1 == 0) goto Lff
            java.lang.String r3 = "~794CAD4578EC442949BD7B3992FC5526A1F842EFCC67EBC28B842F17AB0A90AF5FD222611757C5C247868F98FFC52DA39A9E9A3FD8CE"
            java.lang.String r4 = p000.jf0.m2957(r3)
            java.lang.Class r4 = p000.AbstractC0093bx.m1082(r8, r4)
            if (r4 == 0) goto Lf5
            java.lang.Class r3 = r1.getClass()
            java.lang.String r5 = "~795CFE82BF8D864C285649BA56CE33B4C18838459A84C50FE419E35FE204466F8D2561AAF8AA290694109CAA750A811D72F9"
            java.lang.String r5 = p000.jf0.m2957(r5)
            java.lang.Class r8 = p000.AbstractC0093bx.m1082(r8, r5)
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            if (r8 == 0) goto L4c
            java.util.ArrayList r8 = p000.wi0.m6381(r8)
            p000.AbstractC0984xh.m6660(r5, r8)
        L4c:
            java.util.ArrayList r8 = p000.wi0.m6381(r3)
            p000.AbstractC0984xh.m6660(r5, r8)
            f7 r8 = new f7
            r3 = 1
            r8.<init>(r3, r5)
            t00 r5 = new t00
            r6 = 3
            r5.<init>(r4, r6)
            y30 r7 = new y30
            r7.<init>(r8, r3, r5)
            sh0 r8 = new sh0
            r5 = 25
            r8.<init>(r5)
            t52 r5 = new t52
            r5.<init>(r7, r8)
            sh0 r8 = new sh0
            r7 = 26
            r8.<init>(r7)
            y30 r7 = new y30
            r7.<init>(r5, r3, r8)
            uh0 r8 = new uh0
            r8.<init>(r3)
            cu r5 = new cu
            r5.<init>(r7, r6, r8)
            sh0 r8 = new sh0
            r6 = 27
            r8.<init>(r6)
            t52 r6 = new t52
            r6.<init>(r5, r8)
            java.lang.Object r8 = p000.us1.m5953(r6)
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            if (r8 == 0) goto L9e
            r8.setAccessible(r3)
            goto L9f
        L9e:
            r8 = r2
        L9f:
            if (r8 == 0) goto Lef
            java.util.concurrent.atomic.AtomicLong r2 = p000.wi0.f11732
            long r5 = r2.incrementAndGet()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            java.lang.String r7 = "@"
            r2.append(r7)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.ClassLoader r5 = r4.getClassLoader()
            java.lang.Class[] r4 = new java.lang.Class[]{r4}
            si0 r6 = new si0
            r6.<init>(r2, r10)
            java.lang.Object r10 = java.lang.reflect.Proxy.newProxyInstance(r5, r4, r6)
            r10.getClass()
            r0.put(r2, r10)
            r8.setAccessible(r3)     // Catch: java.lang.Throwable -> Le2
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r10}     // Catch: java.lang.Throwable -> Le2
            r8.invoke(r1, r9)     // Catch: java.lang.Throwable -> Le2
            hi0 r8 = new hi0
            r8.<init>(r2)
            return r8
        Le2:
            r8 = move-exception
            r0.remove(r2)
            java.lang.Throwable r9 = r8.getCause()
            if (r9 != 0) goto Led
            goto Lee
        Led:
            r8 = r9
        Lee:
            throw r8
        Lef:
            java.lang.String r8 = "未找到稳定会话删除方法"
            p000.ql1.m4936(r8)
            return r2
        Lf5:
            java.lang.ClassNotFoundException r8 = new java.lang.ClassNotFoundException
            java.lang.String r9 = p000.jf0.m2957(r3)
            r8.<init>(r9)
            throw r8
        Lff:
            java.lang.String r8 = "未获取到 IConversationListModel"
            p000.C1080.m7279(r8)
            return r2
        L105:
            java.lang.String r8 = "conversationId 不能为空"
            p000.C1080.m7275(r8)
            return r2
    }

    /* JADX INFO: renamed from: β */
    public void m2510() {
            r8 = this;
            java.lang.Object r8 = r8.f4745
            e80 r8 = (p000.e80) r8
            java.lang.Object r0 = p000.ax1.f1362
            monitor-enter(r0)
            java.lang.Object r1 = p000.ax1.f1367     // Catch: java.lang.Throwable -> L3c
            r1.getClass()     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3c
            r3 = 10
            int r3 = p000.AbstractC1021yh.m6889(r1, r3)     // Catch: java.lang.Throwable -> L3c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3c
            r3 = 0
            r4 = r3
        L1d:
            boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L38
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            if (r4 != 0) goto L32
            boolean r7 = p000.ln0.m3626(r5, r8)     // Catch: java.lang.Throwable -> L3c
            if (r7 == 0) goto L32
            r4 = r6
            r6 = r3
        L32:
            if (r6 == 0) goto L1d
            r2.add(r5)     // Catch: java.lang.Throwable -> L3c
            goto L1d
        L38:
            p000.ax1.f1367 = r2     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)
            return
        L3c:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
    }

    @Override // p000.v41
    /* JADX INFO: renamed from: η */
    public p000.oc2 mo408(android.view.View r6, p000.oc2 r7) {
            r5 = this;
            java.lang.Object r5 = r5.f4745
            androidx.core.view.insets.α r5 = (androidx.core.view.insets.C0044) r5
            java.util.ArrayList r6 = r5.f1021
            lc2 r0 = r7.f8033
            r1 = 519(0x207, float:7.27E-43)
            nm0 r2 = r0.mo1906(r1)
            r3 = 64
            nm0 r4 = r0.mo1906(r3)
            nm0 r2 = p000.nm0.m4079(r2, r4)
            nm0 r1 = r0.mo1907(r1)
            nm0 r0 = r0.mo1907(r3)
            nm0 r0 = p000.nm0.m4079(r1, r0)
            nm0 r1 = r5.f1022
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L34
            nm0 r1 = r5.f1023
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L58
        L34:
            r5.f1022 = r2
            r5.f1023 = r0
            int r5 = r6.size()
            int r5 = r5 + (-1)
        L3e:
            if (r5 < 0) goto L58
            java.lang.Object r0 = r6.get(r5)
            yj1 r0 = (p000.yj1) r0
            java.util.ArrayList r0 = r0.f12649
            int r1 = r0.size()
            int r1 = r1 + (-1)
            if (r1 >= 0) goto L53
            int r5 = r5 + (-1)
            goto L3e
        L53:
            java.lang.ClassCastException r5 = p000.lz1.m3685(r1, r0)
            throw r5
        L58:
            return r7
    }
}
