package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wh0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11717;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.ClassLoader f11718;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.bi0 f11719;

    public /* synthetic */ wh0(java.lang.ClassLoader r1, p000.bi0 r2, int r3) {
            r0 = this;
            r0.f11717 = r3
            r0.f11718 = r1
            r0.f11719 = r2
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r6 = this;
            int r0 = r6.f11717
            s62 r1 = p000.s62.f9751
            bi0 r2 = r6.f11719
            java.lang.ClassLoader r6 = r6.f11718
            switch(r0) {
                case 0: goto L70;
                default: goto Lb;
            }
        Lb:
            ci0 r0 = p000.ci0.f2128
            java.util.List r0 = p000.ci0.m1210(r6, r2)
            java.util.List r0 = p000.ci0.m1209(r2, r0)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L1e
            jz r0 = p000.C0450jz.f5672
            goto L6f
        L1e:
            java.util.concurrent.ConcurrentHashMap r3 = p000.ci0.f2139
            java.lang.String r4 = r2.name()
            int r6 = java.lang.System.identityHashCode(r6)
            java.lang.String r5 = "@"
            java.lang.String r6 = p000.AbstractC0602nx.m4130(r4, r5, r6)
            java.lang.String r4 = r2.f1727
            r3.put(r6, r0)
            java.lang.Object r6 = p000.C0666ox.f8297     // Catch: java.lang.Throwable -> L3b
            kx r6 = r2.f1726     // Catch: java.lang.Throwable -> L3b
            p000.C0666ox.m4327(r6, r0)     // Catch: java.lang.Throwable -> L3b
            goto L41
        L3b:
            r6 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r6)
        L41:
            java.lang.Throwable r6 = p000.fo1.m2190(r1)
            java.lang.String r1 = "保存 "
            java.lang.String r2 = "rf41ec7c6342b5bdc"
            if (r6 == 0) goto L54
            java.lang.String r6 = r6.getMessage()
            java.lang.String r3 = " fallback 缓存失败: "
            p000.AbstractC0602nx.m4144(r1, r4, r3, r6, r2)
        L54:
            int r6 = r0.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r3.append(r4)
            java.lang.String r1 = " fallback 缓存成功, reason=reflection_fallback, count="
            r3.append(r1)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            p000.C0888ux.m5975(r2, r6)
        L6f:
            return r0
        L70:
            ci0 r0 = p000.ci0.f2128
            r3 = 1
            r0.m1215(r6, r2, r3)
            return r1
    }
}
