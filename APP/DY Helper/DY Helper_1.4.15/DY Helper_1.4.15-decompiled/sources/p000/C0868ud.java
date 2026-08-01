package p000;

/* JADX INFO: renamed from: ud */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0868ud implements p000.w31 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f10699;

    /* JADX INFO: renamed from: β */
    public final java.lang.Object f10700;

    public /* synthetic */ C0868ud(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f10699 = r1
            r0.f10700 = r2
            r0.<init>()
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            int r0 = r2.f10699
            switch(r0) {
                case 0: goto L1d;
                default: goto L5;
            }
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DisposeOnCancel["
            r0.<init>(r1)
            java.lang.Object r2 = r2.f10700
            vt r2 = (p000.InterfaceC0922vt) r2
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CancelHandler.UserSupplied["
            r0.<init>(r1)
            java.lang.Object r1 = r2.f10700
            a80 r1 = (p000.a80) r1
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r2 = p000.AbstractC1021yh.m6855(r2)
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
