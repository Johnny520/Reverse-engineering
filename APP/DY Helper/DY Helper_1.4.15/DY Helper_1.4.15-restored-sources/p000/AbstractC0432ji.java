package p000;

/* JADX INFO: renamed from: ji */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0432ji {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f5474;

    /* JADX INFO: renamed from: β */
    public final long f5475;

    /* JADX INFO: renamed from: γ */
    public final int f5476;

    public AbstractC0432ji(java.lang.String r1, long r2, int r4) {
            r0 = this;
            r0.<init>()
            r0.f5474 = r1
            r0.f5475 = r2
            r0.f5476 = r4
            int r0 = r1.length()
            if (r0 == 0) goto L1e
            r0 = -1
            if (r4 < r0) goto L17
            r0 = 63
            if (r4 > r0) goto L17
            return
        L17:
            java.lang.String r0 = "The id must be between -1 and 63"
            p000.C1080.m7275(r0)
            r0 = 0
            throw r0
        L1e:
            java.lang.String r0 = "The name of a color space cannot be null and must contain at least 1 character"
            p000.C1080.m7275(r0)
            r0 = 0
            throw r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r2 = 1
            return r2
        L4:
            if (r3 == 0) goto L2e
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto L11
            goto L2e
        L11:
            ji r3 = (p000.AbstractC0432ji) r3
            int r0 = r2.f5476
            int r1 = r3.f5476
            if (r0 == r1) goto L1a
            goto L2e
        L1a:
            java.lang.String r0 = r2.f5474
            java.lang.String r1 = r3.f5474
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L25
            goto L2e
        L25:
            long r0 = r2.f5475
            long r2 = r3.f5475
            boolean r2 = p000.AbstractC0213di.m1746(r0, r2)
            return r2
        L2e:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f5474
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = p000.AbstractC0213di.f3169
            long r2 = r4.f5475
            int r0 = p000.lz1.m3677(r0, r1, r2)
            int r4 = r4.f5476
            int r0 = r0 + r4
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.f5474
            r0.append(r1)
            java.lang.String r1 = " (id="
            r0.append(r1)
            int r1 = r5.f5476
            r0.append(r1)
            java.lang.String r1 = ", model="
            r0.append(r1)
            long r1 = p000.AbstractC0213di.f3165
            long r3 = r5.f5475
            boolean r5 = p000.AbstractC0213di.m1746(r3, r1)
            if (r5 == 0) goto L26
            java.lang.String r5 = "Rgb"
            goto L49
        L26:
            long r1 = p000.AbstractC0213di.f3166
            boolean r5 = p000.AbstractC0213di.m1746(r3, r1)
            if (r5 == 0) goto L31
            java.lang.String r5 = "Xyz"
            goto L49
        L31:
            long r1 = p000.AbstractC0213di.f3167
            boolean r5 = p000.AbstractC0213di.m1746(r3, r1)
            if (r5 == 0) goto L3c
            java.lang.String r5 = "Lab"
            goto L49
        L3c:
            long r1 = p000.AbstractC0213di.f3168
            boolean r5 = p000.AbstractC0213di.m1746(r3, r1)
            if (r5 == 0) goto L47
            java.lang.String r5 = "Cmyk"
            goto L49
        L47:
            java.lang.String r5 = "Unknown"
        L49:
            r0.append(r5)
            r5 = 41
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: α */
    public abstract float mo568(int r1);

    /* JADX INFO: renamed from: β */
    public abstract float mo569(int r1);

    /* JADX INFO: renamed from: γ */
    public boolean mo2959() {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public abstract long mo570(float r1, float r2, float r3);

    /* JADX INFO: renamed from: ε */
    public abstract float mo571(float r1, float r2, float r3);

    /* JADX INFO: renamed from: ζ */
    public abstract long mo572(float r1, float r2, float r3, float r4, p000.AbstractC0432ji r5);
}
