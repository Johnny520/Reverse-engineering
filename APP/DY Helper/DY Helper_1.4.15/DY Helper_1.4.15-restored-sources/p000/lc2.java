package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class lc2 {

    /* JADX INFO: renamed from: β */
    public static final p000.oc2 f6557 = null;

    /* JADX INFO: renamed from: α */
    public final p000.oc2 f6558;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lc
            cc2 r0 = new cc2
            r0.<init>()
            goto L1b
        Lc:
            r1 = 31
            if (r0 < r1) goto L16
            bc2 r0 = new bc2
            r0.<init>()
            goto L1b
        L16:
            ac2 r0 = new ac2
            r0.<init>()
        L1b:
            oc2 r0 = r0.mo1698()
            lc2 r0 = r0.f8033
            oc2 r0 = r0.mo2296()
            lc2 r0 = r0.f8033
            oc2 r0 = r0.mo2095()
            lc2 r0 = r0.f8033
            oc2 r0 = r0.mo2096()
            p000.lc2.f6557 = r0
            return
    }

    public lc2(p000.oc2 r1) {
            r0 = this;
            r0.<init>()
            r0.f6558 = r1
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.lc2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            lc2 r5 = (p000.lc2) r5
            boolean r1 = r4.mo1910()
            boolean r3 = r5.mo1910()
            if (r1 != r3) goto L4b
            boolean r1 = r4.mo2098()
            boolean r3 = r5.mo2098()
            if (r1 != r3) goto L4b
            nm0 r1 = r4.mo1908()
            nm0 r3 = r5.mo1908()
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L4b
            nm0 r1 = r4.mo2097()
            nm0 r3 = r5.mo2097()
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L4b
            mt r4 = r4.mo2297()
            mt r5 = r5.mo2297()
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 == 0) goto L4b
            return r0
        L4b:
            return r2
    }

    public int hashCode() {
            r4 = this;
            boolean r0 = r4.mo1910()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r4.mo2098()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            nm0 r2 = r4.mo1908()
            nm0 r3 = r4.mo2097()
            mt r4 = r4.mo2297()
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r1, r2, r3, r4}
            int r4 = java.util.Objects.hash(r4)
            return r4
    }

    /* JADX INFO: renamed from: α */
    public p000.oc2 mo2296() {
            r0 = this;
            oc2 r0 = r0.f6558
            return r0
    }

    /* JADX INFO: renamed from: β */
    public p000.oc2 mo2095() {
            r0 = this;
            oc2 r0 = r0.f6558
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public p000.oc2 mo2096() {
            r0 = this;
            oc2 r0 = r0.f6558
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public void mo1904(android.view.View r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ε */
    public void mo1905(p000.oc2 r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ζ */
    public p000.C0561mt mo2297() {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: η */
    public p000.nm0 mo1906(int r1) {
            r0 = this;
            nm0 r0 = p000.nm0.f7673
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public p000.nm0 mo1907(int r1) {
            r0 = this;
            r0 = r1 & 8
            if (r0 != 0) goto L7
            nm0 r0 = p000.nm0.f7673
            return r0
        L7:
            java.lang.String r0 = "Unable to query the maximum insets for IME"
            p000.C1080.m7275(r0)
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public p000.nm0 mo2490() {
            r0 = this;
            nm0 r0 = r0.mo1908()
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public p000.nm0 mo2097() {
            r0 = this;
            nm0 r0 = p000.nm0.f7673
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public p000.nm0 mo2491() {
            r0 = this;
            nm0 r0 = r0.mo1908()
            return r0
    }

    /* JADX INFO: renamed from: μ */
    public p000.nm0 mo1908() {
            r0 = this;
            nm0 r0 = p000.nm0.f7673
            return r0
    }

    /* JADX INFO: renamed from: ν */
    public p000.nm0 mo2492() {
            r0 = this;
            nm0 r0 = r0.mo1908()
            return r0
    }

    /* JADX INFO: renamed from: ξ */
    public p000.oc2 mo1909(int r1, int r2, int r3, int r4) {
            r0 = this;
            oc2 r0 = p000.lc2.f6557
            return r0
    }

    /* JADX INFO: renamed from: ο */
    public boolean mo2098() {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: π */
    public boolean mo1910() {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ρ */
    public boolean mo1911(int r1) {
            r0 = this;
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: σ */
    public void mo1912(p000.nm0[] r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: τ */
    public void mo1913(p000.nm0 r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: υ */
    public void mo1914(p000.oc2 r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: φ */
    public void mo1915(int r1) {
            r0 = this;
            return
    }
}
