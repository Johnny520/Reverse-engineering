package g1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f4134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f4135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f4136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f4137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f4138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f4139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f4140g;

    public /* synthetic */ s(double r16, double r18, double r20, double r22, double r24) {
            r15 = this;
            r11 = 0
            r13 = 0
            r0 = r15
            r1 = r16
            r3 = r18
            r5 = r20
            r7 = r22
            r9 = r24
            r0.<init>(r1, r3, r5, r7, r9, r11, r13)
            return
    }

    public s(double r2, double r4, double r6, double r8, double r10, double r12, double r14) {
            r1 = this;
            r1.<init>()
            r1.f4134a = r2
            r1.f4135b = r4
            r1.f4136c = r6
            r1.f4137d = r8
            r1.f4138e = r10
            r1.f4139f = r12
            r1.f4140g = r14
            boolean r0 = java.lang.Double.isNaN(r4)
            if (r0 != 0) goto Lbd
            boolean r6 = java.lang.Double.isNaN(r6)
            if (r6 != 0) goto Lbd
            boolean r6 = java.lang.Double.isNaN(r8)
            if (r6 != 0) goto Lbd
            boolean r6 = java.lang.Double.isNaN(r10)
            if (r6 != 0) goto Lbd
            boolean r6 = java.lang.Double.isNaN(r12)
            if (r6 != 0) goto Lbd
            boolean r6 = java.lang.Double.isNaN(r14)
            if (r6 != 0) goto Lbd
            boolean r6 = java.lang.Double.isNaN(r2)
            if (r6 != 0) goto Lbd
            r6 = -4611686018427387904(0xc000000000000000, double:-2.0)
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 != 0) goto L42
            goto L48
        L42:
            r6 = -4609434218613702656(0xc008000000000000, double:-3.0)
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 != 0) goto L49
        L48:
            return
        L49:
            r6 = 0
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 < 0) goto La9
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 > 0) goto La9
            int r14 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r14 != 0) goto L69
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 == 0) goto L62
            int r14 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r14 == 0) goto L62
            goto L69
        L62:
            java.lang.String r2 = "Parameter a or g is zero, the transfer function is constant"
            j8.o.t(r2)
            r2 = 0
            throw r2
        L69:
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 < 0) goto L79
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L72
            goto L79
        L72:
            java.lang.String r2 = "Parameter c is zero, the transfer function is constant"
            j8.o.t(r2)
            r2 = 0
            throw r2
        L79:
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 != 0) goto L7e
            goto L82
        L7e:
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 != 0) goto L8e
        L82:
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L87
            goto L8e
        L87:
            java.lang.String r2 = "Parameter a or g is zero, and c is zero, the transfer function is constant"
            j8.o.t(r2)
            r2 = 0
            throw r2
        L8e:
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 < 0) goto La2
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L9b
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L9b
            return
        L9b:
            java.lang.String r2 = "The transfer function must be positive or increasing"
            j8.o.t(r2)
            r2 = 0
            throw r2
        La2:
            java.lang.String r2 = "The transfer function must be increasing"
            j8.o.t(r2)
            r2 = 0
            throw r2
        La9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Parameter d must be in the range [0..1], was "
            r3.<init>(r4)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        Lbd:
            java.lang.String r2 = "Parameters cannot be NaN"
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof g1.s
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            g1.s r8 = (g1.s) r8
            double r3 = r7.f4134a
            double r5 = r8.f4134a
            int r1 = java.lang.Double.compare(r3, r5)
            if (r1 == 0) goto L17
            return r2
        L17:
            double r3 = r7.f4135b
            double r5 = r8.f4135b
            int r1 = java.lang.Double.compare(r3, r5)
            if (r1 == 0) goto L22
            return r2
        L22:
            double r3 = r7.f4136c
            double r5 = r8.f4136c
            int r1 = java.lang.Double.compare(r3, r5)
            if (r1 == 0) goto L2d
            return r2
        L2d:
            double r3 = r7.f4137d
            double r5 = r8.f4137d
            int r1 = java.lang.Double.compare(r3, r5)
            if (r1 == 0) goto L38
            return r2
        L38:
            double r3 = r7.f4138e
            double r5 = r8.f4138e
            int r1 = java.lang.Double.compare(r3, r5)
            if (r1 == 0) goto L43
            return r2
        L43:
            double r3 = r7.f4139f
            double r5 = r8.f4139f
            int r1 = java.lang.Double.compare(r3, r5)
            if (r1 == 0) goto L4e
            return r2
        L4e:
            double r3 = r7.f4140g
            double r5 = r8.f4140g
            int r8 = java.lang.Double.compare(r3, r5)
            if (r8 == 0) goto L59
            return r2
        L59:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            double r0 = r4.f4134a
            int r0 = java.lang.Double.hashCode(r0)
            int r0 = r0 * 31
            double r1 = r4.f4135b
            int r1 = java.lang.Double.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            double r2 = r4.f4136c
            int r0 = java.lang.Double.hashCode(r2)
            int r0 = r0 + r1
            int r0 = r0 * 31
            double r1 = r4.f4137d
            int r1 = java.lang.Double.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            double r2 = r4.f4138e
            int r0 = java.lang.Double.hashCode(r2)
            int r0 = r0 + r1
            int r0 = r0 * 31
            double r1 = r4.f4139f
            int r1 = java.lang.Double.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            double r2 = r4.f4140g
            int r0 = java.lang.Double.hashCode(r2)
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TransferParameters(gamma="
            r0.<init>(r1)
            double r1 = r3.f4134a
            r0.append(r1)
            java.lang.String r1 = ", a="
            r0.append(r1)
            double r1 = r3.f4135b
            r0.append(r1)
            java.lang.String r1 = ", b="
            r0.append(r1)
            double r1 = r3.f4136c
            r0.append(r1)
            java.lang.String r1 = ", c="
            r0.append(r1)
            double r1 = r3.f4137d
            r0.append(r1)
            java.lang.String r1 = ", d="
            r0.append(r1)
            double r1 = r3.f4138e
            r0.append(r1)
            java.lang.String r1 = ", e="
            r0.append(r1)
            double r1 = r3.f4139f
            r0.append(r1)
            java.lang.String r1 = ", f="
            r0.append(r1)
            double r1 = r3.f4140g
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
