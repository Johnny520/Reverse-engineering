package g1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends g1.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f4107d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f4108e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float[] f4109f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float[] f4110g = null;

    static {
            r0 = 9
            float[] r1 = new float[r0]
            r1 = {x0034: FILL_ARRAY_DATA , data: [1062315416, 1023875789, 1027960238, 1052329625, 1064167266, 1049058052, -1107037235, 1024724339, 1059210267} // fill-array
            g1.a r2 = g1.a.f4056b
            float[] r2 = r2.f4057a
            r3 = 3
            float[] r4 = new float[r3]
            r4 = {x004a: FILL_ARRAY_DATA , data: [1064752793, 1065353216, 1062420362} // fill-array
            float[] r3 = new float[r3]
            r3 = {x0054: FILL_ARRAY_DATA , data: [1064521545, 1065353216, 1066098967} // fill-array
            float[] r2 = g1.k.c(r2, r4, r3)
            float[] r1 = g1.k.g(r1, r2)
            g1.m.f4107d = r1
            float[] r0 = new float[r0]
            r0 = {x005e: FILL_ARRAY_DATA , data: [1045922130, 1073557262, 1020540084, 1061890697, -1071944178, 1061708731, -1148883250, 1055306808, -1085340320} // fill-array
            g1.m.f4108e = r0
            float[] r1 = g1.k.f(r1)
            g1.m.f4109f = r1
            float[] r0 = g1.k.f(r0)
            g1.m.f4110g = r0
            return
    }

    @Override // g1.c
    public final float a(int r1) {
            r0 = this;
            if (r1 != 0) goto L5
            r1 = 1065353216(0x3f800000, float:1.0)
            return r1
        L5:
            r1 = 1056964608(0x3f000000, float:0.5)
            return r1
    }

    @Override // g1.c
    public final float b(int r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r1 = -1090519040(0xffffffffbf000000, float:-0.5)
            return r1
    }

    @Override // g1.c
    public final long d(float r11, float r12, float r13) {
            r10 = this;
            r0 = 0
            int r1 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r1 >= 0) goto L6
            r11 = r0
        L6:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r1 <= 0) goto Ld
            r11 = r0
        Ld:
            r0 = -1090519040(0xffffffffbf000000, float:-0.5)
            int r1 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r1 >= 0) goto L14
            r12 = r0
        L14:
            r1 = 1056964608(0x3f000000, float:0.5)
            int r2 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r2 <= 0) goto L1b
            r12 = r1
        L1b:
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L20
            r13 = r0
        L20:
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 <= 0) goto L25
            goto L26
        L25:
            r1 = r13
        L26:
            float[] r13 = g1.m.f4110g
            r0 = 0
            r2 = r13[r0]
            float r2 = r2 * r11
            r3 = 3
            r4 = r13[r3]
            float r4 = r4 * r12
            float r4 = r4 + r2
            r2 = 6
            r5 = r13[r2]
            float r5 = r5 * r1
            float r5 = r5 + r4
            r4 = 1
            r6 = r13[r4]
            float r6 = r6 * r11
            r7 = 4
            r8 = r13[r7]
            float r8 = r8 * r12
            float r8 = r8 + r6
            r6 = 7
            r9 = r13[r6]
            float r9 = r9 * r1
            float r9 = r9 + r8
            r8 = 2
            r8 = r13[r8]
            float r8 = r8 * r11
            r11 = 5
            r11 = r13[r11]
            float r11 = r11 * r12
            float r11 = r11 + r8
            r12 = 8
            r12 = r13[r12]
            float r12 = r12 * r1
            float r12 = r12 + r11
            float r11 = r5 * r5
            float r11 = r11 * r5
            float r13 = r9 * r9
            float r13 = r13 * r9
            float r1 = r12 * r12
            float r1 = r1 * r12
            float[] r12 = g1.m.f4109f
            r0 = r12[r0]
            float r0 = r0 * r11
            r3 = r12[r3]
            float r3 = r3 * r13
            float r3 = r3 + r0
            r0 = r12[r2]
            float r0 = r0 * r1
            float r0 = r0 + r3
            r2 = r12[r4]
            float r2 = r2 * r11
            r11 = r12[r7]
            float r11 = r11 * r13
            float r11 = r11 + r2
            r12 = r12[r6]
            float r12 = r12 * r1
            float r12 = r12 + r11
            int r11 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r11
            int r11 = java.lang.Float.floatToRawIntBits(r12)
            long r11 = (long) r11
            r13 = 32
            long r0 = r0 << r13
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r2
            long r11 = r11 | r0
            return r11
    }

    @Override // g1.c
    public final float e(float r7, float r8, float r9) {
            r6 = this;
            r0 = 0
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 >= 0) goto L6
            r7 = r0
        L6:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 <= 0) goto Ld
            r7 = r0
        Ld:
            r0 = -1090519040(0xffffffffbf000000, float:-0.5)
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 >= 0) goto L14
            r8 = r0
        L14:
            r1 = 1056964608(0x3f000000, float:0.5)
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r2 <= 0) goto L1b
            r8 = r1
        L1b:
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 >= 0) goto L20
            r9 = r0
        L20:
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L25
            goto L26
        L25:
            r1 = r9
        L26:
            r9 = 0
            float[] r0 = g1.m.f4110g
            r9 = r0[r9]
            float r9 = r9 * r7
            r2 = 3
            r2 = r0[r2]
            float r2 = r2 * r8
            float r2 = r2 + r9
            r9 = 6
            r9 = r0[r9]
            float r9 = r9 * r1
            float r9 = r9 + r2
            r2 = 1
            r2 = r0[r2]
            float r2 = r2 * r7
            r3 = 4
            r3 = r0[r3]
            float r3 = r3 * r8
            float r3 = r3 + r2
            r2 = 7
            r2 = r0[r2]
            float r2 = r2 * r1
            float r2 = r2 + r3
            r3 = 2
            r4 = r0[r3]
            float r4 = r4 * r7
            r7 = 5
            r5 = r0[r7]
            float r5 = r5 * r8
            float r5 = r5 + r4
            r8 = 8
            r0 = r0[r8]
            float r0 = r0 * r1
            float r0 = r0 + r5
            float r1 = r9 * r9
            float r1 = r1 * r9
            float r9 = r2 * r2
            float r9 = r9 * r2
            float r2 = r0 * r0
            float r2 = r2 * r0
            float[] r0 = g1.m.f4109f
            r3 = r0[r3]
            float r3 = r3 * r1
            r7 = r0[r7]
            float r7 = r7 * r9
            float r7 = r7 + r3
            r8 = r0[r8]
            float r8 = r8 * r2
            float r8 = r8 + r7
            return r8
    }

    @Override // g1.c
    public final long f(float r13, float r14, float r15, float r16, g1.c r17) {
            r12 = this;
            float[] r0 = g1.m.f4107d
            r1 = 0
            r2 = r0[r1]
            float r2 = r2 * r13
            r3 = 3
            r4 = r0[r3]
            float r4 = r4 * r14
            float r4 = r4 + r2
            r2 = 6
            r5 = r0[r2]
            float r5 = r5 * r15
            float r5 = r5 + r4
            r4 = 1
            r6 = r0[r4]
            float r6 = r6 * r13
            r7 = 4
            r8 = r0[r7]
            float r8 = r8 * r14
            float r8 = r8 + r6
            r6 = 7
            r9 = r0[r6]
            float r9 = r9 * r15
            float r9 = r9 + r8
            r8 = 2
            r10 = r0[r8]
            float r10 = r10 * r13
            r13 = 5
            r11 = r0[r13]
            float r11 = r11 * r14
            float r11 = r11 + r10
            r14 = 8
            r0 = r0[r14]
            float r0 = r0 * r15
            float r0 = r0 + r11
            float r5 = fb.v0.o(r5)
            float r9 = fb.v0.o(r9)
            float r0 = fb.v0.o(r0)
            float[] r10 = g1.m.f4108e
            r1 = r10[r1]
            float r1 = r1 * r5
            r3 = r10[r3]
            float r3 = r3 * r9
            float r3 = r3 + r1
            r1 = r10[r2]
            float r1 = r1 * r0
            float r1 = r1 + r3
            r2 = r10[r4]
            float r2 = r2 * r5
            r3 = r10[r7]
            float r3 = r3 * r9
            float r3 = r3 + r2
            r2 = r10[r6]
            float r2 = r2 * r0
            float r2 = r2 + r3
            r3 = r10[r8]
            float r3 = r3 * r5
            r13 = r10[r13]
            float r13 = r13 * r9
            float r13 = r13 + r3
            r14 = r10[r14]
            float r14 = r14 * r0
            float r14 = r14 + r13
            r13 = r16
            r0 = r17
            long r13 = f1.c0.b(r1, r2, r14, r13, r0)
            return r13
    }
}
