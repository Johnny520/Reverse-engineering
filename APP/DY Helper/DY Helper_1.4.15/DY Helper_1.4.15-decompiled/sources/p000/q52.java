package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class q52 {

    /* JADX INFO: renamed from: α */
    public final double f8876;

    /* JADX INFO: renamed from: β */
    public final double f8877;

    /* JADX INFO: renamed from: γ */
    public final double f8878;

    /* JADX INFO: renamed from: δ */
    public final double f8879;

    /* JADX INFO: renamed from: ε */
    public final double f8880;

    /* JADX INFO: renamed from: ζ */
    public final double f8881;

    /* JADX INFO: renamed from: η */
    public final double f8882;

    public /* synthetic */ q52(double r16, double r18, double r20, double r22, double r24) {
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

    public q52(double r1, double r3, double r5, double r7, double r9, double r11, double r13) {
            r0 = this;
            r0.<init>()
            r0.f8876 = r1
            r0.f8877 = r3
            r0.f8878 = r5
            r0.f8879 = r7
            r0.f8880 = r9
            r0.f8881 = r11
            r0.f8882 = r13
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 != 0) goto Lbd
            boolean r0 = java.lang.Double.isNaN(r5)
            if (r0 != 0) goto Lbd
            boolean r0 = java.lang.Double.isNaN(r7)
            if (r0 != 0) goto Lbd
            boolean r0 = java.lang.Double.isNaN(r9)
            if (r0 != 0) goto Lbd
            boolean r0 = java.lang.Double.isNaN(r11)
            if (r0 != 0) goto Lbd
            boolean r0 = java.lang.Double.isNaN(r13)
            if (r0 != 0) goto Lbd
            boolean r0 = java.lang.Double.isNaN(r1)
            if (r0 != 0) goto Lbd
            r5 = -4611686018427387904(0xc000000000000000, double:-2.0)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L42
            goto L48
        L42:
            r5 = -4609434218613702656(0xc008000000000000, double:-3.0)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L49
        L48:
            return
        L49:
            r5 = 0
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 < 0) goto La9
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 > 0) goto La9
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 != 0) goto L69
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L62
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L62
            goto L69
        L62:
            java.lang.String r0 = "Parameter a or g is zero, the transfer function is constant"
            p000.C1080.m7275(r0)
            r0 = 0
            throw r0
        L69:
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 < 0) goto L79
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 == 0) goto L72
            goto L79
        L72:
            java.lang.String r0 = "Parameter c is zero, the transfer function is constant"
            p000.C1080.m7275(r0)
            r0 = 0
            throw r0
        L79:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L7e
            goto L82
        L7e:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L8e
        L82:
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 == 0) goto L87
            goto L8e
        L87:
            java.lang.String r0 = "Parameter a or g is zero, and c is zero, the transfer function is constant"
            p000.C1080.m7275(r0)
            r0 = 0
            throw r0
        L8e:
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto La2
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L9b
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L9b
            return
        L9b:
            java.lang.String r0 = "The transfer function must be positive or increasing"
            p000.C1080.m7275(r0)
            r0 = 0
            throw r0
        La2:
            java.lang.String r0 = "The transfer function must be increasing"
            p000.C1080.m7275(r0)
            r0 = 0
            throw r0
        La9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Parameter d must be in the range [0..1], was "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lbd:
            java.lang.String r0 = "Parameters cannot be NaN"
            p000.C1080.m7275(r0)
            r0 = 0
            throw r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p000.q52
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            q52 r8 = (p000.q52) r8
            double r3 = r7.f8876
            double r5 = r8.f8876
            int r1 = java.lang.Double.compare(r3, r5)
            if (r1 == 0) goto L17
            return r2
        L17:
            double r3 = r7.f8877
            double r5 = r8.f8877
            int r1 = java.lang.Double.compare(r3, r5)
            if (r1 == 0) goto L22
            return r2
        L22:
            double r3 = r7.f8878
            double r5 = r8.f8878
            int r1 = java.lang.Double.compare(r3, r5)
            if (r1 == 0) goto L2d
            return r2
        L2d:
            double r3 = r7.f8879
            double r5 = r8.f8879
            int r1 = java.lang.Double.compare(r3, r5)
            if (r1 == 0) goto L38
            return r2
        L38:
            double r3 = r7.f8880
            double r5 = r8.f8880
            int r1 = java.lang.Double.compare(r3, r5)
            if (r1 == 0) goto L43
            return r2
        L43:
            double r3 = r7.f8881
            double r5 = r8.f8881
            int r1 = java.lang.Double.compare(r3, r5)
            if (r1 == 0) goto L4e
            return r2
        L4e:
            double r3 = r7.f8882
            double r7 = r8.f8882
            int r7 = java.lang.Double.compare(r3, r7)
            if (r7 == 0) goto L59
            return r2
        L59:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            double r0 = r4.f8876
            int r0 = java.lang.Double.hashCode(r0)
            int r0 = r0 * 31
            double r1 = r4.f8877
            int r1 = java.lang.Double.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            double r2 = r4.f8878
            int r0 = java.lang.Double.hashCode(r2)
            int r0 = r0 + r1
            int r0 = r0 * 31
            double r1 = r4.f8879
            int r1 = java.lang.Double.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            double r2 = r4.f8880
            int r0 = java.lang.Double.hashCode(r2)
            int r0 = r0 + r1
            int r0 = r0 * 31
            double r1 = r4.f8881
            int r1 = java.lang.Double.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            double r2 = r4.f8882
            int r4 = java.lang.Double.hashCode(r2)
            int r4 = r4 + r1
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TransferParameters(gamma="
            r0.<init>(r1)
            double r1 = r3.f8876
            r0.append(r1)
            java.lang.String r1 = ", a="
            r0.append(r1)
            double r1 = r3.f8877
            r0.append(r1)
            java.lang.String r1 = ", b="
            r0.append(r1)
            double r1 = r3.f8878
            r0.append(r1)
            java.lang.String r1 = ", c="
            r0.append(r1)
            double r1 = r3.f8879
            r0.append(r1)
            java.lang.String r1 = ", d="
            r0.append(r1)
            double r1 = r3.f8880
            r0.append(r1)
            java.lang.String r1 = ", e="
            r0.append(r1)
            double r1 = r3.f8881
            r0.append(r1)
            java.lang.String r1 = ", f="
            r0.append(r1)
            double r1 = r3.f8882
            r0.append(r1)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
