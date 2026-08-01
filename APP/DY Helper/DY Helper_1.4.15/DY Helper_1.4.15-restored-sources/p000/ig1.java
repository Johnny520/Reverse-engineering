package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ig1 implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5075;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.util.List f5076;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.app.Activity f5077;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.lg1 f5078;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.String f5079;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ java.lang.String f5080;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ java.lang.String f5081;

    public /* synthetic */ ig1(int r1, java.util.List r2, android.app.Activity r3, p000.lg1 r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r0 = this;
            r0.<init>()
            r0.f5075 = r1
            r0.f5076 = r2
            r0.f5077 = r3
            r0.f5078 = r4
            r0.f5079 = r5
            r0.f5080 = r6
            r0.f5081 = r7
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            double r0 = (double) r7
            r2 = 1
            if (r8 >= r2) goto L12
            r3 = r2
            goto L13
        L12:
            r3 = r8
        L13:
            double r3 = (double) r3
            double r0 = r0 / r3
            java.util.List r3 = r6.f5076
            int r3 = r3.size()
            if (r3 >= r2) goto L1e
            goto L1f
        L1e:
            r2 = r3
        L1f:
            double r2 = (double) r2
            r4 = 4634978072750194688(0x4052c00000000000, double:75.0)
            double r4 = r4 / r2
            double r4 = r4 * r0
            int r0 = (int) r4
            int r1 = r6.f5075
            int r1 = r1 + r0
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.pg1.f8551
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r6.f5081
            r0.append(r2)
            java.lang.String r2 = " · 互发消息 "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r7 = "/"
            r0.append(r7)
            r0.append(r8)
            java.lang.String r7 = r0.toString()
            lg1 r8 = r6.f5078
            boolean r8 = p000.pg1.m4539(r8)
            if (r8 != 0) goto L54
            goto L5d
        L54:
            android.app.Activity r8 = r6.f5077
            java.lang.String r0 = r6.f5079
            java.lang.String r6 = r6.f5080
            com.example.dyhelper.p002ui.C0182.m1600(r8, r0, r6, r7, r1)
        L5d:
            s62 r6 = p000.s62.f9751
            return r6
    }
}
