package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lb0 implements java.lang.reflect.InvocationHandler {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f6532;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f6533;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ java.lang.Object f6534;

    /* JADX INFO: renamed from: δ */
    public final /* synthetic */ java.io.Serializable f6535;

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ java.lang.Object f6536;

    public /* synthetic */ lb0(java.lang.Object r2, p000.um1 r3, p000.um1 r4, java.util.concurrent.CountDownLatch r5) {
            r1 = this;
            r0 = 1
            r1.f6532 = r0
            r1.<init>()
            r1.f6534 = r2
            r1.f6535 = r3
            r1.f6536 = r4
            r1.f6533 = r5
            return
    }

    public /* synthetic */ lb0(java.util.concurrent.atomic.AtomicReference r2, java.util.concurrent.CountDownLatch r3, p000.uw0 r4, java.util.concurrent.atomic.AtomicReference r5) {
            r1 = this;
            r0 = 0
            r1.f6532 = r0
            r1.<init>()
            r1.f6534 = r2
            r1.f6533 = r3
            r1.f6536 = r4
            r1.f6535 = r5
            return
    }

    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object r9, java.lang.reflect.Method r10, java.lang.Object[] r11) {
            r8 = this;
            int r0 = r8.f6532
            switch(r0) {
                case 0: goto L1b;
                default: goto L5;
            }
        L5:
            java.io.Serializable r0 = r8.f6535
            r2 = r0
            um1 r2 = (p000.um1) r2
            java.lang.Object r0 = r8.f6536
            r3 = r0
            um1 r3 = (p000.um1) r3
            java.util.concurrent.CountDownLatch r4 = r8.f6533
            java.lang.Object r1 = r8.f6534
            r5 = r9
            r6 = r10
            r7 = r11
            java.lang.Object r8 = com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient.m1433(r1, r2, r3, r4, r5, r6, r7)
            return r8
        L1b:
            r5 = r9
            r6 = r10
            r7 = r11
            java.lang.Object r9 = r8.f6534
            java.util.concurrent.atomic.AtomicReference r9 = (java.util.concurrent.atomic.AtomicReference) r9
            java.lang.Object r10 = r8.f6536
            uw0 r10 = (p000.uw0) r10
            java.io.Serializable r11 = r8.f6535
            java.util.concurrent.atomic.AtomicReference r11 = (java.util.concurrent.atomic.AtomicReference) r11
            java.lang.Class r0 = r6.getDeclaringClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L3f
            r5.getClass()
            java.lang.Object r8 = p000.C0966x.m6447(r5, r6, r7)
            goto Lc9
        L3f:
            java.lang.String r0 = r6.getName()
            java.lang.String r1 = "onFailure"
            boolean r0 = p000.ln0.m3626(r0, r1)
            java.util.concurrent.CountDownLatch r8 = r8.f6533
            r1 = 0
            if (r0 == 0) goto L76
            if (r7 == 0) goto L55
            java.lang.Object r10 = p000.AbstractC0312g7.m2250(r7)
            goto L56
        L55:
            r10 = r1
        L56:
            java.lang.String r0 = p000.C0966x.m6448(r10)
        L5a:
            boolean r10 = r9.compareAndSet(r1, r0)
            if (r10 == 0) goto L61
            goto L67
        L61:
            java.lang.Object r10 = r9.get()
            if (r10 == 0) goto L5a
        L67:
            r8.countDown()
            java.lang.Class r8 = r6.getReturnType()
            r8.getClass()
            java.lang.Object r8 = p000.C0966x.m6443(r8)
            goto Lc9
        L76:
            if (r7 == 0) goto L7c
            java.lang.Object r1 = p000.AbstractC0312g7.m2250(r7)
        L7c:
            if (r1 == 0) goto Lbe
            java.lang.Object r0 = p000.AbstractC0312g7.m2249(r7)     // Catch: java.lang.Throwable -> L8a
            r0.getClass()     // Catch: java.lang.Throwable -> L8a
            pb0 r10 = p000.C0966x.m6415(r0, r10)     // Catch: java.lang.Throwable -> L8a
            goto L92
        L8a:
            r0 = move-exception
            r10 = r0
            eo1 r0 = new eo1
            r0.<init>(r10)
            r10 = r0
        L92:
            boolean r0 = r10 instanceof p000.eo1
            if (r0 != 0) goto L9c
            r0 = r10
            pb0 r0 = (p000.pb0) r0
            r11.set(r0)
        L9c:
            java.lang.Throwable r10 = p000.fo1.m2190(r10)
            if (r10 == 0) goto Laf
            java.lang.String r10 = p000.C0966x.m6432(r10)
            java.lang.String r11 = "群申请返回解析失败："
            java.lang.String r10 = r11.concat(r10)
            r9.set(r10)
        Laf:
            r8.countDown()
            java.lang.Class r8 = r6.getReturnType()
            r8.getClass()
            java.lang.Object r8 = p000.C0966x.m6443(r8)
            goto Lc9
        Lbe:
            java.lang.Class r8 = r6.getReturnType()
            r8.getClass()
            java.lang.Object r8 = p000.C0966x.m6443(r8)
        Lc9:
            return r8
    }
}
