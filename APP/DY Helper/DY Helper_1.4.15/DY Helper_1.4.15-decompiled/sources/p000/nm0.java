package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class nm0 {

    /* JADX INFO: renamed from: ε */
    public static final p000.nm0 f7673 = null;

    /* JADX INFO: renamed from: α */
    public final int f7674;

    /* JADX INFO: renamed from: β */
    public final int f7675;

    /* JADX INFO: renamed from: γ */
    public final int f7676;

    /* JADX INFO: renamed from: δ */
    public final int f7677;

    static {
            nm0 r0 = new nm0
            r1 = 0
            r0.<init>(r1, r1, r1, r1)
            p000.nm0.f7673 = r0
            return
    }

    public nm0(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f7674 = r1
            r0.f7675 = r2
            r0.f7676 = r3
            r0.f7677 = r4
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.nm0 m4079(p000.nm0 r4, p000.nm0 r5) {
            int r0 = r4.f7674
            int r1 = r5.f7674
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r4.f7675
            int r2 = r5.f7675
            int r1 = java.lang.Math.min(r1, r2)
            int r2 = r4.f7676
            int r3 = r5.f7676
            int r2 = java.lang.Math.min(r2, r3)
            int r4 = r4.f7677
            int r5 = r5.f7677
            int r4 = java.lang.Math.min(r4, r5)
            nm0 r4 = m4080(r0, r1, r2, r4)
            return r4
    }

    /* JADX INFO: renamed from: β */
    public static p000.nm0 m4080(int r1, int r2, int r3, int r4) {
            if (r1 != 0) goto Lb
            if (r2 != 0) goto Lb
            if (r3 != 0) goto Lb
            if (r4 != 0) goto Lb
            nm0 r1 = p000.nm0.f7673
            return r1
        Lb:
            nm0 r0 = new nm0
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static p000.nm0 m4081(android.graphics.Insets r3) {
            int r0 = r3.left
            int r1 = r3.top
            int r2 = r3.right
            int r3 = r3.bottom
            nm0 r3 = m4080(r0, r1, r2, r3)
            return r3
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L2f
            java.lang.Class<nm0> r2 = p000.nm0.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L2f
        L10:
            nm0 r5 = (p000.nm0) r5
            int r2 = r4.f7677
            int r3 = r5.f7677
            if (r2 == r3) goto L19
            return r1
        L19:
            int r2 = r4.f7674
            int r3 = r5.f7674
            if (r2 == r3) goto L20
            return r1
        L20:
            int r2 = r4.f7676
            int r3 = r5.f7676
            if (r2 == r3) goto L27
            return r1
        L27:
            int r4 = r4.f7675
            int r5 = r5.f7675
            if (r4 == r5) goto L2e
            return r1
        L2e:
            return r0
        L2f:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f7674
            int r0 = r0 * 31
            int r1 = r2.f7675
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f7676
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r2.f7677
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Insets{left="
            r0.<init>(r1)
            int r1 = r2.f7674
            r0.append(r1)
            java.lang.String r1 = ", top="
            r0.append(r1)
            int r1 = r2.f7675
            r0.append(r1)
            java.lang.String r1 = ", right="
            r0.append(r1)
            int r1 = r2.f7676
            r0.append(r1)
            java.lang.String r1 = ", bottom="
            r0.append(r1)
            int r2 = r2.f7677
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public final android.graphics.Insets m4082() {
            r3 = this;
            int r0 = r3.f7676
            int r1 = r3.f7677
            int r2 = r3.f7674
            int r3 = r3.f7675
            android.graphics.Insets r3 = android.graphics.Insets.of(r2, r3, r0, r1)
            return r3
    }
}
