package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.a f6381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f6386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f6387g;

    public r(i2.a r1, int r2, int r3, int r4, int r5, float r6, float r7) {
            r0 = this;
            r0.<init>()
            r0.f6381a = r1
            r0.f6382b = r2
            r0.f6383c = r3
            r0.f6384d = r4
            r0.f6385e = r5
            r0.f6386f = r6
            r0.f6387g = r7
            return
    }

    public final e1.c a(e1.c r7) {
            r6 = this;
            r0 = 0
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            float r2 = r6.f6386f
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r2
            r4 = 32
            long r0 = r0 << r4
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 | r2
            e1.c r7 = r7.i(r0)
            return r7
    }

    public final long b(long r4, boolean r6) {
            r3 = this;
            if (r6 == 0) goto Lb
            long r0 = i2.m0.f6358b
            boolean r6 = i2.m0.b(r4, r0)
            if (r6 == 0) goto Lb
            return r0
        Lb:
            int r6 = i2.m0.f6359c
            r6 = 32
            long r0 = r4 >> r6
            int r6 = (int) r0
            int r0 = r3.f6382b
            int r6 = r6 + r0
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r1
            int r4 = (int) r4
            int r4 = r4 + r0
            long r4 = i2.e0.b(r6, r4)
            return r4
    }

    public final e1.c c(e1.c r8) {
            r7 = this;
            float r0 = r7.f6386f
            float r0 = -r0
            r1 = 0
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r1 = (long) r1
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r3 = (long) r0
            r0 = 32
            long r0 = r1 << r0
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r3 & r5
            long r0 = r0 | r2
            e1.c r8 = r8.i(r0)
            return r8
    }

    public final int d(int r3) {
            r2 = this;
            int r0 = r2.f6383c
            int r1 = r2.f6382b
            int r3 = r9.e0.r(r3, r1, r0)
            int r3 = r3 - r1
            return r3
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L48
        L3:
            boolean r0 = r3 instanceof i2.r
            if (r0 != 0) goto L8
            goto L46
        L8:
            i2.r r3 = (i2.r) r3
            i2.a r0 = r2.f6381a
            i2.a r1 = r3.f6381a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L46
        L15:
            int r0 = r2.f6382b
            int r1 = r3.f6382b
            if (r0 == r1) goto L1c
            goto L46
        L1c:
            int r0 = r2.f6383c
            int r1 = r3.f6383c
            if (r0 == r1) goto L23
            goto L46
        L23:
            int r0 = r2.f6384d
            int r1 = r3.f6384d
            if (r0 == r1) goto L2a
            goto L46
        L2a:
            int r0 = r2.f6385e
            int r1 = r3.f6385e
            if (r0 == r1) goto L31
            goto L46
        L31:
            float r0 = r2.f6386f
            float r1 = r3.f6386f
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L3c
            goto L46
        L3c:
            float r0 = r2.f6387g
            float r3 = r3.f6387g
            int r3 = java.lang.Float.compare(r0, r3)
            if (r3 == 0) goto L48
        L46:
            r3 = 0
            return r3
        L48:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            i2.a r0 = r3.f6381a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f6382b
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f6383c
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f6384d
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f6385e
            int r0 = eh.a.e(r2, r0, r1)
            float r2 = r3.f6386f
            int r0 = eh.a.d(r2, r0, r1)
            float r1 = r3.f6387g
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ParagraphInfo(paragraph="
            r0.<init>(r1)
            i2.a r1 = r3.f6381a
            r0.append(r1)
            java.lang.String r1 = ", startIndex="
            r0.append(r1)
            int r1 = r3.f6382b
            r0.append(r1)
            java.lang.String r1 = ", endIndex="
            r0.append(r1)
            int r1 = r3.f6383c
            r0.append(r1)
            java.lang.String r1 = ", startLineIndex="
            r0.append(r1)
            int r1 = r3.f6384d
            r0.append(r1)
            java.lang.String r1 = ", endLineIndex="
            r0.append(r1)
            int r1 = r3.f6385e
            r0.append(r1)
            java.lang.String r1 = ", top="
            r0.append(r1)
            float r1 = r3.f6386f
            r0.append(r1)
            java.lang.String r1 = ", bottom="
            r0.append(r1)
            float r1 = r3.f6387g
            r2 = 41
            java.lang.String r0 = eh.a.o(r0, r1, r2)
            return r0
    }
}
