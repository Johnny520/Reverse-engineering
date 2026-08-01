package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zw1 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f13341;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.a80 f13342;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.a80 f13343;

    public /* synthetic */ zw1(p000.a80 r1, p000.a80 r2, int r3) {
            r0 = this;
            r0.f13341 = r3
            r0.f13342 = r1
            r0.f13343 = r2
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f13341
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            a80 r0 = r1.f13342
            r0.invoke(r2)
            a80 r1 = r1.f13343
            r1.invoke(r2)
        Lf:
            s62 r1 = p000.s62.f9751
            return r1
        L12:
            a80 r0 = r1.f13342
            r0.invoke(r2)
            a80 r1 = r1.f13343
            r1.invoke(r2)
            goto Lf
    }
}
