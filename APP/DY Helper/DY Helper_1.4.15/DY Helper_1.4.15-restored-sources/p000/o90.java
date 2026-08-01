package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o90 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7991;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f7992;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f7993;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f7994;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.io.Serializable f7995;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ java.lang.Object f7996;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ java.lang.Object f7997;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ java.lang.Object f7998;

    public /* synthetic */ o90(android.content.Context r2, p000.s90 r3, java.util.concurrent.atomic.AtomicBoolean r4, java.util.concurrent.atomic.AtomicReference r5, p000.m90 r6, p000.n90 r7, p000.C0700pu r8) {
            r1 = this;
            r0 = 0
            r1.f7991 = r0
            r1.<init>()
            r1.f7993 = r2
            r1.f7994 = r3
            r1.f7995 = r4
            r1.f7992 = r5
            r1.f7996 = r6
            r1.f7997 = r7
            r1.f7998 = r8
            return
    }

    public /* synthetic */ o90(java.lang.reflect.Method r2, java.lang.Object r3, java.util.LinkedHashMap r4, java.lang.Object r5, java.lang.Object r6, java.util.concurrent.atomic.AtomicReference r7, java.util.concurrent.CountDownLatch r8) {
            r1 = this;
            r0 = 1
            r1.f7991 = r0
            r1.<init>()
            r1.f7993 = r2
            r1.f7994 = r3
            r1.f7995 = r4
            r1.f7996 = r5
            r1.f7997 = r6
            r1.f7992 = r7
            r1.f7998 = r8
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r12 = this;
            int r0 = r12.f7991
            switch(r0) {
                case 0: goto L43;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r12.f7993
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.Object r1 = r12.f7994
            java.io.Serializable r2 = r12.f7995
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.lang.Object r3 = r12.f7996
            java.lang.Object r4 = r12.f7997
            java.lang.Object r5 = r12.f7998
            java.util.concurrent.CountDownLatch r5 = (java.util.concurrent.CountDownLatch) r5
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4}     // Catch: java.lang.Throwable -> L1f
            r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L1f
            goto L42
        L1f:
            r0 = move-exception
            boolean r1 = r0 instanceof java.lang.reflect.InvocationTargetException
            if (r1 == 0) goto L28
            r1 = r0
            java.lang.reflect.InvocationTargetException r1 = (java.lang.reflect.InvocationTargetException) r1
            goto L29
        L28:
            r1 = 0
        L29:
            if (r1 == 0) goto L34
            java.lang.Throwable r1 = r1.getTargetException()
            if (r1 != 0) goto L32
            goto L34
        L32:
            r0 = r1
            goto L3a
        L34:
            java.lang.Throwable r1 = r0.getCause()
            if (r1 != 0) goto L32
        L3a:
            java.util.concurrent.atomic.AtomicReference r12 = r12.f7992
            r12.set(r0)
            r5.countDown()
        L42:
            return
        L43:
            java.lang.String r0 = "GeoNames 国外地区数据库下载、解压和校验完成，来源="
            java.lang.Object r1 = r12.f7993
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r12.f7994
            s90 r2 = (p000.s90) r2
            java.io.Serializable r3 = r12.f7995
            java.util.concurrent.atomic.AtomicBoolean r3 = (java.util.concurrent.atomic.AtomicBoolean) r3
            java.util.concurrent.atomic.AtomicReference r4 = r12.f7992
            java.lang.Object r5 = r12.f7996
            m90 r5 = (p000.m90) r5
            java.lang.Object r6 = r12.f7997
            n90 r6 = (p000.n90) r6
            java.lang.Object r12 = r12.f7998
            pu r12 = (p000.C0700pu) r12
            java.lang.String r7 = "raf02e3c7781e553e"
            java.util.concurrent.atomic.AtomicBoolean r8 = p000.u90.f10654
            java.lang.String r9 = "GeoNames 国外地区数据库下载结束，来源="
            r10 = 0
            r11 = 0
            p000.u90.m5831(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L8c
            boolean r1 = r3.get()     // Catch: java.lang.Throwable -> L8c
            if (r1 != 0) goto L8e
            java.lang.String r1 = r2.f9771     // Catch: java.lang.Throwable -> L8c
            java.lang.String r0 = r0.concat(r1)     // Catch: java.lang.Throwable -> L8c
            r1 = 4
            p000.C0888ux.m5988(r7, r0, r11, r1, r11)     // Catch: java.lang.Throwable -> L8c
            r6.invoke()     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r12 = r4.getAndSet(r11)
            uk1 r12 = (p000.uk1) r12
            if (r12 == 0) goto L88
        L85:
            r12.m5929()
        L88:
            r8.set(r10)
            goto Lca
        L8c:
            r0 = move-exception
            goto L94
        L8e:
            k30 r0 = new k30     // Catch: java.lang.Throwable -> L8c
            r0.<init>()     // Catch: java.lang.Throwable -> L8c
            throw r0     // Catch: java.lang.Throwable -> L8c
        L94:
            java.lang.String r1 = r2.f9771     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> La5
            if (r2 != 0) goto La7
            java.lang.Class r2 = r0.getClass()     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = r2.getSimpleName()     // Catch: java.lang.Throwable -> La5
            goto La7
        La5:
            r12 = move-exception
            goto Lcb
        La7:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La5
            r3.<init>(r9)     // Catch: java.lang.Throwable -> La5
            r3.append(r1)     // Catch: java.lang.Throwable -> La5
            java.lang.String r1 = "，原因="
            r3.append(r1)     // Catch: java.lang.Throwable -> La5
            r3.append(r2)     // Catch: java.lang.Throwable -> La5
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> La5
            p000.C0888ux.m5987(r7, r1, r0)     // Catch: java.lang.Throwable -> La5
            r12.invoke(r0)     // Catch: java.lang.Throwable -> La5
            java.lang.Object r12 = r4.getAndSet(r11)
            uk1 r12 = (p000.uk1) r12
            if (r12 == 0) goto L88
            goto L85
        Lca:
            return
        Lcb:
            java.lang.Object r0 = r4.getAndSet(r11)
            uk1 r0 = (p000.uk1) r0
            if (r0 == 0) goto Ld6
            r0.m5929()
        Ld6:
            r8.set(r10)
            throw r12
    }
}
