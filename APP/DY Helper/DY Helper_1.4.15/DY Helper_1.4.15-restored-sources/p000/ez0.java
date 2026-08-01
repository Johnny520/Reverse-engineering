package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ez0 {

    /* JADX INFO: renamed from: γ */
    public static final p000.ym1 f3688 = null;

    /* JADX INFO: renamed from: δ */
    public static final p000.ym1 f3689 = null;

    /* JADX INFO: renamed from: α */
    public final java.lang.String f3690;

    /* JADX INFO: renamed from: β */
    public final java.lang.String[] f3691;

    static {
            ym1 r0 = new ym1
            java.lang.String r1 = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)"
            r0.<init>(r1)
            p000.ez0.f3688 = r0
            ym1 r0 = new ym1
            java.lang.String r1 = ";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?"
            r0.<init>(r1)
            p000.ez0.f3689 = r0
            return
    }

    public ez0(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            r1.getClass()
            r4.getClass()
            r0.<init>()
            r0.f3690 = r1
            r0.f3691 = r4
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.ez0
            if (r0 == 0) goto L12
            ez0 r2 = (p000.ez0) r2
            java.lang.String r2 = r2.f3690
            java.lang.String r1 = r1.f3690
            boolean r1 = p000.ln0.m3626(r2, r1)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.f3690
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.f3690
            return r0
    }
}
