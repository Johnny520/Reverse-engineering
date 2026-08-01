package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yf0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12598;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ int f12599;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ int f12600;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f12601;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f12602;

    public /* synthetic */ yf0(p000.dg0 r1, int r2, p000.C0793sc r3, int r4, boolean r5) {
            r0 = this;
            r5 = 0
            r0.f12598 = r5
            r0.<init>()
            r0.f12601 = r1
            r0.f12599 = r2
            r0.f12602 = r3
            r0.f12600 = r4
            return
    }

    public /* synthetic */ yf0(p000.li0 r2, int r3, int r4, p000.hj0 r5) {
            r1 = this;
            r0 = 1
            r1.f12598 = r0
            r1.<init>()
            r1.f12601 = r2
            r1.f12599 = r3
            r1.f12600 = r4
            r1.f12602 = r5
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r6 = this;
            int r0 = r6.f12598
            switch(r0) {
                case 0: goto L61;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r6.f12601
            li0 r0 = (p000.li0) r0
            int r1 = r6.f12599
            int r2 = r6.f12600
            java.lang.Object r6 = r6.f12602
            hj0 r6 = (p000.hj0) r6
            r0.f6652 = r1
            r0.f6653 = r2
            r0.f6654 = r6
            yi0 r1 = r6.f4748
            yi0 r2 = p000.yi0.f12635
            if (r1 != r2) goto L5b
            ij0 r1 = r0.f6677
            xi0 r2 = r6.f4747
            java.lang.String r2 = r2.f12180
            monitor-enter(r1)
            java.util.LinkedHashSet r3 = r1.f5096     // Catch: java.lang.Throwable -> L58
            r3.remove(r2)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r1)
            java.util.List r1 = r0.f6680
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L35:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L52
            java.lang.Object r3 = r1.next()
            r4 = r3
            xi0 r4 = (p000.xi0) r4
            java.lang.String r4 = r4.f12180
            xi0 r5 = r6.f4747
            java.lang.String r5 = r5.f12180
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L35
            r2.add(r3)
            goto L35
        L52:
            r0.f6680 = r2
            r0.m3568()
            goto L5e
        L58:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            throw r6
        L5b:
            r0.m3575()
        L5e:
            s62 r6 = p000.s62.f9751
            return r6
        L61:
            java.lang.Object r0 = r6.f12601
            dg0 r0 = (p000.dg0) r0
            int r1 = r6.f12599
            java.lang.Object r2 = r6.f12602
            sc r2 = (p000.C0793sc) r2
            int r6 = r6.f12600
            xn0 r3 = r0.f3142     // Catch: java.io.IOException -> L8c
            r3.getClass()     // Catch: java.io.IOException -> L8c
            long r3 = (long) r6     // Catch: java.io.IOException -> L8c
            r2.skip(r3)     // Catch: java.io.IOException -> L8c
            lg0 r6 = r0.f3129     // Catch: java.io.IOException -> L8c
            sz r2 = p000.EnumC0816sz.f10092     // Catch: java.io.IOException -> L8c
            r6.m3563(r1, r2)     // Catch: java.io.IOException -> L8c
            monitor-enter(r0)     // Catch: java.io.IOException -> L8c
            java.util.LinkedHashSet r6 = r0.f3131     // Catch: java.lang.Throwable -> L89
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L89
            r6.remove(r1)     // Catch: java.lang.Throwable -> L89
            monitor-exit(r0)     // Catch: java.io.IOException -> L8c
            goto L8c
        L89:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.io.IOException -> L8c
            throw r6     // Catch: java.io.IOException -> L8c
        L8c:
            s62 r6 = p000.s62.f9751
            return r6
    }
}
