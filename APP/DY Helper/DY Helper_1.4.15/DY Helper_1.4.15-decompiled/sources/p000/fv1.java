package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class fv1 {

    /* JADX INFO: renamed from: δ */
    public static final p000.fv1 f4142 = null;

    /* JADX INFO: renamed from: α */
    public final long f4143;

    /* JADX INFO: renamed from: β */
    public final long f4144;

    /* JADX INFO: renamed from: γ */
    public final float f4145;

    static {
            fv1 r0 = new fv1
            r1 = 4278190080(0xff000000, double:2.113706745E-314)
            long r1 = p000.kn0.m3359(r1)
            r3 = 0
            r5 = 0
            r0.<init>(r1, r3, r5)
            p000.fv1.f4142 = r0
            return
    }

    public fv1(long r1, long r3, float r5) {
            r0 = this;
            r0.<init>()
            r0.f4143 = r1
            r0.f4144 = r3
            r0.f4145 = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L28
        L3:
            boolean r0 = r5 instanceof p000.fv1
            if (r0 != 0) goto L8
            goto L2a
        L8:
            fv1 r5 = (p000.fv1) r5
            long r0 = r5.f4143
            long r2 = r4.f4143
            boolean r0 = p000.C0114ci.m1192(r2, r0)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            long r0 = r4.f4144
            long r2 = r5.f4144
            boolean r0 = p000.o41.m4203(r0, r2)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            float r4 = r4.f4145
            float r5 = r5.f4145
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L2a
        L28:
            r4 = 1
            return r4
        L2a:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r4 = this;
            int r0 = p000.C0114ci.f2126
            long r0 = r4.f4143
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f4144
            int r0 = p000.lz1.m3677(r0, r1, r2)
            float r4 = r4.f4145
            int r4 = java.lang.Float.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Shadow(color="
            r0.<init>(r1)
            long r1 = r3.f4143
            java.lang.String r1 = p000.C0114ci.m1198(r1)
            r0.append(r1)
            java.lang.String r1 = ", offset="
            r0.append(r1)
            long r1 = r3.f4144
            java.lang.String r1 = p000.o41.m4206(r1)
            r0.append(r1)
            java.lang.String r1 = ", blurRadius="
            r0.append(r1)
            float r3 = r3.f4145
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
