package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class vc0 implements java.lang.Iterable, p000.lo0 {

    /* JADX INFO: renamed from: ζ */
    public static final p000.vc0 f11229 = null;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String[] f11230;

    static {
            vc0 r0 = new vc0
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.<init>(r1)
            p000.vc0.f11229 = r0
            return
    }

    public vc0(java.lang.String[] r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f11230 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.vc0
            if (r0 == 0) goto L12
            vc0 r2 = (p000.vc0) r2
            java.lang.String[] r2 = r2.f11230
            java.lang.String[] r1 = r1.f11230
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String[] r0 = r0.f11230
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r6 = this;
            int r0 = r6.size()
            l91[] r1 = new p000.l91[r0]
            r2 = 0
        L7:
            if (r2 >= r0) goto L1b
            java.lang.String r3 = r6.m6169(r2)
            java.lang.String r4 = r6.m6171(r2)
            l91 r5 = new l91
            r5.<init>(r3, r4)
            r1[r2] = r5
            int r2 = r2 + 1
            goto L7
        L1b:
            τ r6 = new τ
            r6.<init>(r1)
            return r6
    }

    public final int size() {
            r0 = this;
            java.lang.String[] r0 = r0.f11230
            int r0 = r0.length
            int r0 = r0 / 2
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L2f
            java.lang.String r3 = r6.m6169(r2)
            java.lang.String r4 = r6.m6171(r2)
            r0.append(r3)
            java.lang.String r5 = ": "
            r0.append(r5)
            boolean r3 = p000.sd2.m5480(r3)
            if (r3 == 0) goto L24
            java.lang.String r4 = "██"
        L24:
            r0.append(r4)
            java.lang.String r3 = "\n"
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L2f:
            java.lang.String r6 = r0.toString()
            return r6
    }

    /* JADX INFO: renamed from: α */
    public final java.lang.String m6168(java.lang.String r4) {
            r3 = this;
            java.lang.String[] r3 = r3.f11230
            r3.getClass()
            int r0 = r3.length
            int r0 = r0 + (-2)
            r1 = 0
            r2 = -2
            int r1 = p000.g81.m2275(r0, r1, r2)
            if (r1 > r0) goto L22
        L10:
            r2 = r3[r0]
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L1d
            int r0 = r0 + 1
            r3 = r3[r0]
            return r3
        L1d:
            if (r0 == r1) goto L22
            int r0 = r0 + (-2)
            goto L10
        L22:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: β */
    public final java.lang.String m6169(int r3) {
            r2 = this;
            int r0 = r3 * 2
            java.lang.String[] r2 = r2.f11230
            java.lang.Object r2 = p000.AbstractC0312g7.m2253(r0, r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto Ld
            return r2
        Ld:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "name["
            r0.<init>(r1)
            r0.append(r3)
            r3 = 93
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: γ */
    public final p000.uc0 m6170() {
            r2 = this;
            uc0 r0 = new uc0
            r0.<init>()
            java.util.ArrayList r1 = r0.f10691
            java.lang.String[] r2 = r2.f11230
            p000.AbstractC0984xh.m6659(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final java.lang.String m6171(int r3) {
            r2 = this;
            int r0 = r3 * 2
            int r0 = r0 + 1
            java.lang.String[] r2 = r2.f11230
            java.lang.Object r2 = p000.AbstractC0312g7.m2253(r0, r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto Lf
            return r2
        Lf:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "value["
            r0.<init>(r1)
            r0.append(r3)
            r3 = 93
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }
}
