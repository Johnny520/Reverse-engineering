package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lt1 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f6775;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f6776;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.um1 f6777;

    public /* synthetic */ lt1(android.app.Activity r2, p000.um1 r3) {
            r1 = this;
            r0 = 1
            r1.f6775 = r0
            r1.<init>()
            r1.f6776 = r2
            r1.f6777 = r3
            return
    }

    public /* synthetic */ lt1(p000.um1 r2, android.app.Activity r3) {
            r1 = this;
            r0 = 0
            r1.f6775 = r0
            r1.<init>()
            r1.f6777 = r2
            r1.f6776 = r3
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f6775
            s62 r1 = p000.s62.f9751
            um1 r2 = r5.f6777
            android.app.Activity r5 = r5.f6776
            switch(r0) {
                case 0: goto L1f;
                default: goto Lb;
            }
        Lb:
            android.net.Uri r6 = (android.net.Uri) r6
            if (r6 != 0) goto L10
            goto L1e
        L10:
            java.lang.Thread r0 = new java.lang.Thread
            jg1 r3 = new jg1
            r4 = 4
            r3.<init>(r5, r6, r2, r4)
            r0.<init>(r3)
            r0.start()
        L1e:
            return r1
        L1f:
            a80 r6 = (p000.a80) r6
            r6.getClass()
            r2.f10912 = r6
            bv1 r6 = p000.bv1.f1853
            lt1 r6 = new lt1
            r6.<init>(r5, r2)
            p000.bv1.m1038(r5, r6)
            return r1
    }
}
