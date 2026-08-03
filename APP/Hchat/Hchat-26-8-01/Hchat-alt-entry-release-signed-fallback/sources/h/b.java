package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f4614a = null;

    static {
            r0 = 101(0x65, float:1.42E-43)
            float[] r1 = new float[r0]
            h.b.f4614a = r1
            float[] r0 = new float[r0]
            r2 = 0
            r3 = 0
            r4 = r3
            r3 = r2
        Lc:
            r5 = 100
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r4 >= r5) goto L96
            float r7 = (float) r4
            float r5 = (float) r5
            float r7 = r7 / r5
            r5 = r6
        L16:
            float r8 = r5 - r2
            r9 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r9
            float r8 = r8 + r2
            r10 = 1077936128(0x40400000, float:3.0)
            float r11 = r8 * r10
            float r12 = r6 - r8
            float r11 = r11 * r12
            r13 = 1043542835(0x3e333333, float:0.175)
            float r14 = r12 * r13
            r15 = 1051931444(0x3eb33334, float:0.35000002)
            float r16 = r8 * r15
            float r16 = r16 + r14
            float r16 = r16 * r11
            float r14 = r8 * r8
            float r14 = r14 * r8
            float r16 = r16 + r14
            float r17 = r16 - r7
            r18 = r6
            float r6 = java.lang.Math.abs(r17)
            r17 = r9
            r19 = r10
            double r9 = (double) r6
            r20 = 4532020583610935537(0x3ee4f8b588e368f1, double:1.0E-5)
            int r6 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r6 < 0) goto L56
            int r6 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r6 <= 0) goto L54
            r5 = r8
        L51:
            r6 = r18
            goto L16
        L54:
            r2 = r8
            goto L51
        L56:
            r5 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 * r5
            float r12 = r12 + r8
            float r12 = r12 * r11
            float r12 = r12 + r14
            r1[r4] = r12
            r6 = r18
        L60:
            float r8 = r6 - r3
            float r8 = r8 / r17
            float r8 = r8 + r3
            float r10 = r8 * r19
            float r9 = r18 - r8
            float r10 = r10 * r9
            float r11 = r9 * r5
            float r11 = r11 + r8
            float r11 = r11 * r10
            float r12 = r8 * r8
            float r12 = r12 * r8
            float r11 = r11 + r12
            float r14 = r11 - r7
            float r14 = java.lang.Math.abs(r14)
            r22 = r6
            double r5 = (double) r14
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 < 0) goto L8b
            int r5 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r5 <= 0) goto L87
            r6 = r8
        L84:
            r5 = 1056964608(0x3f000000, float:0.5)
            goto L60
        L87:
            r3 = r8
            r6 = r22
            goto L84
        L8b:
            float r9 = r9 * r13
            float r8 = r8 * r15
            float r8 = r8 + r9
            float r8 = r8 * r10
            float r8 = r8 + r12
            r0[r4] = r8
            int r4 = r4 + 1
            goto Lc
        L96:
            r18 = r6
            r0[r5] = r18
            r1[r5] = r18
            return
    }

    public static h.a a(float r5) {
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r5 = r9.e0.q(r5, r0, r1)
            r2 = 100
            float r3 = (float) r2
            float r4 = r3 * r5
            int r4 = (int) r4
            if (r4 >= r2) goto L23
            float r0 = (float) r4
            float r0 = r0 / r3
            int r1 = r4 + 1
            float r2 = (float) r1
            float r2 = r2 / r3
            float[] r3 = h.b.f4614a
            r4 = r3[r4]
            r1 = r3[r1]
            float r1 = r1 - r4
            float r2 = r2 - r0
            float r1 = r1 / r2
            float r5 = r5 - r0
            float r5 = r5 * r1
            float r5 = r5 + r4
            r0 = r1
            r1 = r5
        L23:
            h.a r5 = new h.a
            r5.<init>(r1, r0)
            return r5
    }
}
