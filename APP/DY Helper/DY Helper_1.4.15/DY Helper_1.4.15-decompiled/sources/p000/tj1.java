package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class tj1 implements p000.a80 {

    /* JADX INFO: renamed from: ζ */
    public static final p000.tj1 f10399 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.tj1 f10400 = null;

    /* JADX INFO: renamed from: θ */
    public static final p000.tj1 f10401 = null;

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10402;

    static {
            tj1 r0 = new tj1
            r1 = 0
            r0.<init>(r1)
            p000.tj1.f10399 = r0
            tj1 r0 = new tj1
            r1 = 1
            r0.<init>(r1)
            p000.tj1.f10400 = r0
            tj1 r0 = new tj1
            r1 = 2
            r0.<init>(r1)
            p000.tj1.f10401 = r0
            return
    }

    public /* synthetic */ tj1(int r1) {
            r0 = this;
            r0.f10402 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r1 = r1.f10402
            switch(r1) {
                case 0: goto L2f;
                case 1: goto L28;
                default: goto L5;
            }
        L5:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r1 = p000.ln0.m3626(r2, r1)
            if (r1 == 0) goto L15
            long r1 = p000.C0114ci.f2125
            ci r0 = new ci
            r0.<init>(r1)
            goto L27
        L15:
            r2.getClass()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            long r1 = (long) r1
            r0 = 32
            long r1 = r1 << r0
            ci r0 = new ci
            r0.<init>(r1)
        L27:
            return r0
        L28:
            boolean r1 = r2 instanceof android.view.ViewGroup
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L2f:
            boolean r1 = r2 instanceof android.widget.TextView
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }
}
