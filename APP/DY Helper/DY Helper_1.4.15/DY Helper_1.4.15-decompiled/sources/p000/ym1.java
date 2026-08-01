package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ym1 implements java.io.Serializable {

    /* JADX INFO: renamed from: ε */
    public final java.util.regex.Pattern f12688;

    public ym1(java.lang.String r1) {
            r0 = this;
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r1.getClass()
            r0.<init>()
            r0.f12688 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.C0188cu m6940(p000.ym1 r3, java.lang.String r4) {
            r3.getClass()
            r4.getClass()
            int r0 = r4.length()
            if (r0 < 0) goto L1b
            z61 r0 = new z61
            r1 = 4
            r0.<init>(r3, r1, r4)
            xm1 r3 = p000.xm1.f12214
            cu r4 = new cu
            r1 = 2
            r4.<init>(r0, r1, r3)
            return r4
        L1b:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Start index out of bounds: "
            java.lang.String r1 = ", input length: "
            r2 = 0
            java.lang.StringBuilder r0 = p000.a12.m19(r2, r0, r1)
            int r4 = r4.length()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    public final java.lang.String toString() {
            r0 = this;
            java.util.regex.Pattern r0 = r0.f12688
            java.lang.String r0 = r0.toString()
            r0.getClass()
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final p000.ix0 m6941(java.lang.String r2, int r3) {
            r1 = this;
            r2.getClass()
            java.util.regex.Pattern r1 = r1.f12688
            java.util.regex.Matcher r1 = r1.matcher(r2)
            r0 = 0
            java.util.regex.Matcher r1 = r1.useAnchoringBounds(r0)
            r0 = 1
            java.util.regex.Matcher r1 = r1.useTransparentBounds(r0)
            int r0 = r2.length()
            java.util.regex.Matcher r1 = r1.region(r3, r0)
            boolean r3 = r1.lookingAt()
            if (r3 == 0) goto L27
            ix0 r3 = new ix0
            r3.<init>(r1, r2)
            return r3
        L27:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public final boolean m6942(java.lang.CharSequence r1) {
            r0 = this;
            r1.getClass()
            java.util.regex.Pattern r0 = r0.f12688
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final java.lang.String m6943(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            java.util.regex.Pattern r0 = r0.f12688
            java.util.regex.Matcher r0 = r0.matcher(r1)
            java.lang.String r0 = r0.replaceAll(r2)
            r0.getClass()
            return r0
    }
}
