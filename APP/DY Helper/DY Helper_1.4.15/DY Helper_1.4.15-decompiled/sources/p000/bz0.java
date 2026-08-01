package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class bz0 {

    /* JADX INFO: renamed from: α */
    public final int f1895;

    /* JADX INFO: renamed from: β */
    public final int f1896;

    /* JADX INFO: renamed from: γ */
    public final int f1897;

    /* JADX INFO: renamed from: δ */
    public final int f1898;

    /* JADX INFO: renamed from: ε */
    public final int f1899;

    /* JADX INFO: renamed from: ζ */
    public final int f1900;

    /* JADX INFO: renamed from: η */
    public final int f1901;

    /* JADX INFO: renamed from: θ */
    public final int f1902;

    /* JADX INFO: renamed from: ι */
    public final int f1903;

    /* JADX INFO: renamed from: κ */
    public final int f1904;

    /* JADX INFO: renamed from: λ */
    public final int f1905;

    public bz0(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11) {
            r0 = this;
            r0.<init>()
            r0.f1895 = r1
            r0.f1896 = r2
            r0.f1897 = r3
            r0.f1898 = r4
            r0.f1899 = r5
            r0.f1900 = r6
            r0.f1901 = r7
            r0.f1902 = r8
            r0.f1903 = r9
            r0.f1904 = r10
            r0.f1905 = r11
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.bz0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            bz0 r5 = (p000.bz0) r5
            int r1 = r4.f1895
            int r3 = r5.f1895
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.f1896
            int r3 = r5.f1896
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r1 = r4.f1897
            int r3 = r5.f1897
            if (r1 == r3) goto L21
            return r2
        L21:
            int r1 = r4.f1898
            int r3 = r5.f1898
            if (r1 == r3) goto L28
            return r2
        L28:
            int r1 = r4.f1899
            int r3 = r5.f1899
            if (r1 == r3) goto L2f
            return r2
        L2f:
            int r1 = r4.f1900
            int r3 = r5.f1900
            if (r1 == r3) goto L36
            return r2
        L36:
            int r1 = r4.f1901
            int r3 = r5.f1901
            if (r1 == r3) goto L3d
            return r2
        L3d:
            int r1 = r4.f1902
            int r3 = r5.f1902
            if (r1 == r3) goto L44
            return r2
        L44:
            int r1 = r4.f1903
            int r3 = r5.f1903
            if (r1 == r3) goto L4b
            return r2
        L4b:
            int r1 = r4.f1904
            int r3 = r5.f1904
            if (r1 == r3) goto L52
            return r2
        L52:
            int r4 = r4.f1905
            int r5 = r5.f1905
            if (r4 == r5) goto L59
            return r2
        L59:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f1895
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f1896
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f1897
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f1898
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f1899
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f1900
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f1901
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f1902
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f1903
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f1904
            int r0 = p000.a12.m14(r2, r0, r1)
            int r3 = r3.f1905
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", cardBg="
            java.lang.String r1 = ", mediaBg="
            java.lang.String r2 = "SelectTheme(pageBg="
            int r3 = r5.f1895
            int r4 = r5.f1896
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", textPrimary="
            java.lang.String r2 = ", textSecondary="
            int r3 = r5.f1897
            int r4 = r5.f1898
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", textHint="
            java.lang.String r2 = ", stroke="
            int r3 = r5.f1899
            int r4 = r5.f1900
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", accent="
            java.lang.String r2 = ", accentSoft="
            int r3 = r5.f1901
            int r4 = r5.f1902
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", neutralButton="
            java.lang.String r2 = ", ripple="
            int r3 = r5.f1903
            int r4 = r5.f1904
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            int r5 = r5.f1905
            java.lang.String r5 = p000.AbstractC0602nx.m4131(r0, r5, r1)
            return r5
    }
}
