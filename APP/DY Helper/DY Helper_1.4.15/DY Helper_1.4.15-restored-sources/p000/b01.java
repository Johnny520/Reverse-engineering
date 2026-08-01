package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b01 implements java.util.function.Supplier {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f1400;

    public /* synthetic */ b01(int r1) {
            r0 = this;
            r0.f1400 = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
            r2 = this;
            int r2 = r2.f1400
            r0 = 0
            switch(r2) {
                case 0: goto L21;
                case 1: goto L1a;
                case 2: goto L10;
                case 3: goto Lb;
                default: goto L6;
            }
        L6:
            l82 r2 = p000.l82.f6483
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            return r2
        Lb:
            o22 r2 = p000.o22.f7889
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            return r2
        L10:
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r0 = "yyyy-MM-dd"
            java.util.Locale r1 = java.util.Locale.US
            r2.<init>(r0, r1)
            return r2
        L1a:
            cn1 r2 = p000.cn1.f2212
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L21:
            f01 r2 = p000.f01.f3708
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
    }
}
