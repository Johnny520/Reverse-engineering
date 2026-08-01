package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class w41 extends p000.bp0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11562;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.d51 f11563;

    public /* synthetic */ w41(p000.d51 r1, int r2) {
            r0 = this;
            r0.f11562 = r2
            r0.f11563 = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f11562
            switch(r0) {
                case 0: goto L2e;
                default: goto L5;
            }
        L5:
            j8 r3 = (p000.C0422j8) r3
            r3.getClass()
            d51 r2 = r2.f11563
            w6 r2 = r2.f2894
            int r3 = r2.mo4827()
            java.util.ListIterator r2 = r2.listIterator(r3)
        L16:
            boolean r3 = r2.hasPrevious()
            if (r3 == 0) goto L28
            java.lang.Object r3 = r2.previous()
            r0 = r3
            u60 r0 = (p000.u60) r0
            boolean r0 = r0.f10607
            if (r0 == 0) goto L16
            goto L29
        L28:
            r3 = 0
        L29:
            u60 r3 = (p000.u60) r3
            s62 r2 = p000.s62.f9751
            return r2
        L2e:
            j8 r3 = (p000.C0422j8) r3
            r3.getClass()
            d51 r2 = r2.f11563
            w6 r3 = r2.f2894
            int r0 = r3.mo4827()
            java.util.ListIterator r3 = r3.listIterator(r0)
        L3f:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L51
            java.lang.Object r0 = r3.previous()
            r1 = r0
            u60 r1 = (p000.u60) r1
            boolean r1 = r1.f10607
            if (r1 == 0) goto L3f
            goto L52
        L51:
            r0 = 0
        L52:
            u60 r0 = (p000.u60) r0
            r2.f2895 = r0
            s62 r2 = p000.s62.f9751
            return r2
    }
}
