package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zb1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f13027;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ long f13028;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.a80 f13029;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f13030;

    public /* synthetic */ zb1(long r1, p000.a80 r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.f13027 = r5
            r0.f13028 = r1
            r0.f13029 = r3
            r0.f13030 = r4
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            int r0 = r6.f13027
            switch(r0) {
                case 0: goto L41;
                case 1: goto L23;
                default: goto L5;
            }
        L5:
            long r0 = r6.f13028
            a80 r2 = r6.f13029
            mb1 r2 = (p000.mb1) r2
            java.lang.Object r6 = r6.f13030
            gc1 r6 = (p000.gc1) r6
            a r3 = p000.jc1.f5426
            java.lang.Object r3 = r3.f1
            ｚ r3 = (p000.C1156) r3
            long r4 = r3.f13524
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L22
            boolean r0 = r3.f13525
            if (r0 == 0) goto L22
            r2.invoke(r6)
        L22:
            return
        L23:
            long r0 = r6.f13028
            a80 r2 = r6.f13029
            mb1 r2 = (p000.mb1) r2
            java.lang.Object r6 = r6.f13030
            dc1 r6 = (p000.dc1) r6
            a r3 = p000.jc1.f5426
            java.lang.Object r3 = r3.f1
            ｚ r3 = (p000.C1156) r3
            long r4 = r3.f13524
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L40
            boolean r0 = r3.f13525
            if (r0 != 0) goto L40
            r2.invoke(r6)
        L40:
            return
        L41:
            long r0 = r6.f13028
            a80 r2 = r6.f13029
            mb1 r2 = (p000.mb1) r2
            java.lang.Object r6 = r6.f13030
            dc1 r6 = (p000.dc1) r6
            a r3 = p000.jc1.f5426
            java.lang.Object r3 = r3.f1
            ｚ r3 = (p000.C1156) r3
            long r4 = r3.f13524
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L5e
            boolean r0 = r3.f13525
            if (r0 != 0) goto L5e
            r2.invoke(r6)
        L5e:
            return
    }
}
