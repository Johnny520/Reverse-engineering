package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dn0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3222;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f3223;

    public /* synthetic */ dn0(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f3222 = r1
            r0.f3223 = r2
            r0.<init>()
            return
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
            r1 = this;
            int r0 = r1.f3222
            java.lang.Object r1 = r1.f3223
            switch(r0) {
                case 0: goto Lf;
                default: goto L7;
            }
        L7:
            gt0 r1 = (p000.gt0) r1
            r0 = 0
            r1.m2324(r0)
            r1 = 1
            return r1
        Lf:
            xb0 r1 = (p000.xb0) r1
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ 1
            return r1
    }
}
