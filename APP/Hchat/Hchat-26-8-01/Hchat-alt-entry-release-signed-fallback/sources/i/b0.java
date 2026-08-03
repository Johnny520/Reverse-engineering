package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements i.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i.v f5595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5597d;

    public b0(int r5, int r6, i.v r7) {
            r4 = this;
            r4.<init>()
            r4.f5594a = r5
            r4.f5595b = r7
            long r0 = (long) r5
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r2
            r4.f5596c = r0
            long r5 = (long) r6
            long r5 = r5 * r2
            r4.f5597d = r5
            return
    }

    @Override // i.z
    public final long b(float r3, float r4, float r5) {
            r2 = this;
            long r3 = r2.f5597d
            long r0 = r2.f5596c
            long r3 = r3 + r0
            return r3
    }

    @Override // i.z
    public final float c(float r10, float r11, float r12, long r13) {
            r9 = this;
            long r1 = r9.f5597d
            long r1 = r13 - r1
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lb
            r1 = r3
        Lb:
            long r5 = r9.f5596c
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L13
            r6 = r5
            goto L14
        L13:
            r6 = r1
        L14:
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 != 0) goto L19
            return r12
        L19:
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r6 - r1
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            float r8 = r0.e(r1, r2, r3, r4)
            r4 = r6
            float r1 = r0.e(r1, r2, r3, r4)
            float r1 = r1 - r8
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r0
            return r1
    }

    @Override // i.z
    public final float e(float r3, float r4, float r5, long r6) {
            r2 = this;
            long r0 = r2.f5597d
            long r6 = r6 - r0
            r0 = 0
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 >= 0) goto La
            r6 = r0
        La:
            long r0 = r2.f5596c
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 <= 0) goto L11
            r6 = r0
        L11:
            int r5 = r2.f5594a
            if (r5 != 0) goto L18
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L1b
        L18:
            float r5 = (float) r6
            float r6 = (float) r0
            float r5 = r5 / r6
        L1b:
            i.v r6 = r2.f5595b
            float r5 = r6.b(r5)
            r6 = 1
            float r6 = (float) r6
            float r6 = r6 - r5
            float r6 = r6 * r3
            float r4 = r4 * r5
            float r4 = r4 + r6
            return r4
    }
}
