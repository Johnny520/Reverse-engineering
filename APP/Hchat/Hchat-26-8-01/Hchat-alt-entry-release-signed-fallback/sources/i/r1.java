package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements i.n1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i.p1 f5772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i.p0 f5773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f5774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f5775j;

    public r1(i.p1 r3, i.p0 r4, long r5) {
            r2 = this;
            r2.<init>()
            r2.f5772g = r3
            r2.f5773h = r4
            int r4 = r3.s()
            int r3 = r3.v()
            int r3 = r3 + r4
            long r3 = (long) r3
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r0
            r2.f5774i = r3
            long r5 = r5 * r0
            r2.f5775j = r5
            return
    }

    @Override // i.n1
    public final boolean a() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // i.n1
    public final long b(i.q r1, i.q r2, i.q r3) {
            r0 = this;
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r1
    }

    public final long c(long r9) {
            r8 = this;
            long r0 = r8.f5775j
            long r2 = r9 + r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto Lb
            return r4
        Lb:
            long r9 = r9 + r0
            long r0 = r8.f5774i
            long r2 = r9 / r0
            i.p0 r6 = r8.f5773h
            i.p0 r7 = i.p0.f5746g
            if (r6 == r7) goto L25
            r6 = 2
            long r6 = (long) r6
            long r6 = r2 % r6
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 != 0) goto L1f
            goto L25
        L1f:
            r4 = 1
            long r2 = r2 + r4
            long r2 = r2 * r0
            long r2 = r2 - r9
            return r2
        L25:
            long r2 = r2 * r0
            long r9 = r9 - r2
            return r9
    }

    public final i.q d(long r11, i.q r13, i.q r14, i.q r15) {
            r10 = this;
            long r0 = r10.f5775j
            long r11 = r11 + r0
            long r2 = r10.f5774i
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 <= 0) goto L15
            i.p1 r4 = r10.f5772g
            long r5 = r2 - r0
            r7 = r13
            r9 = r14
            r8 = r15
            i.q r11 = r4.n(r5, r7, r8, r9)
            return r11
        L15:
            r9 = r14
            return r9
    }

    @Override // i.n1
    public final i.q n(long r10, i.q r12, i.q r13, i.q r14) {
            r9 = this;
            long r1 = r9.c(r10)
            r3 = r9
            r4 = r10
            r6 = r12
            r8 = r13
            r7 = r14
            i.q r5 = r3.d(r4, r6, r7, r8)
            r10 = r3
            r3 = r6
            r4 = r8
            i.p1 r0 = r10.f5772g
            i.q r11 = r0.n(r1, r3, r4, r5)
            return r11
    }

    @Override // i.n1
    public final i.q w(long r10, i.q r12, i.q r13, i.q r14) {
            r9 = this;
            long r1 = r9.c(r10)
            r3 = r9
            r4 = r10
            r6 = r12
            r8 = r13
            r7 = r14
            i.q r5 = r3.d(r4, r6, r7, r8)
            r10 = r3
            r3 = r6
            r4 = r8
            i.p1 r0 = r10.f5772g
            i.q r11 = r0.w(r1, r3, r4, r5)
            return r11
    }
}
