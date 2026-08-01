package p000;

/* JADX INFO: renamed from: al */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0022al extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ p000.a80 f303;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.String f304;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ p000.a80 f305;

    public C0022al(p000.a80 r1, java.lang.String r2, p000.a80 r3) {
            r0 = this;
            r0.f303 = r1
            r0.f304 = r2
            r0.f305 = r3
            r0.<init>()
            return
    }

    @Override // p000.m01
    public final void afterHookedMethod(p000.k01 r2) {
            r1 = this;
            r2.getClass()
            a80 r0 = r1.f305
            java.lang.Object r2 = r2.f5691     // Catch: java.lang.Throwable -> Ld
            r0.invoke(r2)     // Catch: java.lang.Throwable -> Ld
            s62 r2 = p000.s62.f9751     // Catch: java.lang.Throwable -> Ld
            goto L14
        Ld:
            r2 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r2)
            r2 = r0
        L14:
            java.lang.Throwable r2 = p000.fo1.m2190(r2)
            if (r2 == 0) goto L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.f304
            r0.append(r1)
            java.lang.String r1 = " 后置处理失败"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "rc108c6a5c31674e3"
            p000.C0888ux.m5977(r0, r1, r2)
        L32:
            return
    }

    @Override // p000.m01
    public final void beforeHookedMethod(p000.k01 r2) {
            r1 = this;
            r2.getClass()
            a80 r0 = r1.f303
            java.lang.Object r2 = r2.f5691     // Catch: java.lang.Throwable -> Ld
            r0.invoke(r2)     // Catch: java.lang.Throwable -> Ld
            s62 r2 = p000.s62.f9751     // Catch: java.lang.Throwable -> Ld
            goto L14
        Ld:
            r2 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r2)
            r2 = r0
        L14:
            java.lang.Throwable r2 = p000.fo1.m2190(r2)
            if (r2 == 0) goto L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.f304
            r0.append(r1)
            java.lang.String r1 = " 前置处理失败"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "rc108c6a5c31674e3"
            p000.C0888ux.m5977(r0, r1, r2)
        L32:
            return
    }
}
