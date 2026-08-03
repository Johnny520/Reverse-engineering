package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends f1.p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f3061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3063e;

    public h0(java.util.List r1, long r2, long r4) {
            r0 = this;
            r0.<init>()
            r0.f3061c = r1
            r0.f3062d = r2
            r0.f3063e = r4
            return
    }

    @Override // f1.p0
    public final android.graphics.Shader b(long r20) {
            r19 = this;
            r0 = r19
            long r1 = r0.f3062d
            r3 = 32
            long r4 = r1 >> r3
            int r4 = (int) r4
            float r5 = java.lang.Float.intBitsToFloat(r4)
            r6 = 2139095040(0x7f800000, float:Infinity)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L16
            long r4 = r20 >> r3
            int r4 = (int) r4
        L16:
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r7
            int r1 = (int) r1
            float r2 = java.lang.Float.intBitsToFloat(r1)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L2c
            long r1 = r20 & r7
            int r1 = (int) r1
        L2c:
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r9 = r0.f3063e
            long r11 = r9 >> r3
            int r2 = (int) r11
            float r5 = java.lang.Float.intBitsToFloat(r2)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L40
            long r11 = r20 >> r3
            int r2 = (int) r11
        L40:
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r9 = r9 & r7
            int r5 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r5)
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r6 != 0) goto L51
            long r5 = r20 & r7
            int r5 = (int) r5
        L51:
            float r5 = java.lang.Float.intBitsToFloat(r5)
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r9 = (long) r4
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r11 = (long) r1
            long r9 = r9 << r3
            long r11 = r11 & r7
            long r9 = r9 | r11
            int r1 = java.lang.Float.floatToRawIntBits(r2)
            long r1 = (long) r1
            int r4 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r4
            long r1 = r1 << r3
            long r4 = r4 & r7
            long r1 = r1 | r4
            java.util.List r4 = r0.f3061c
            int r5 = r4.size()
            r6 = 2
            if (r5 < r6) goto Lbc
            android.graphics.LinearGradient r11 = new android.graphics.LinearGradient
            long r5 = r9 >> r3
            int r5 = (int) r5
            float r12 = java.lang.Float.intBitsToFloat(r5)
            long r5 = r9 & r7
            int r5 = (int) r5
            float r13 = java.lang.Float.intBitsToFloat(r5)
            long r5 = r1 >> r3
            int r3 = (int) r5
            float r14 = java.lang.Float.intBitsToFloat(r3)
            long r1 = r1 & r7
            int r1 = (int) r1
            float r15 = java.lang.Float.intBitsToFloat(r1)
            int r1 = r4.size()
            int[] r2 = new int[r1]
            r3 = 0
            r5 = r3
        L9d:
            if (r5 >= r1) goto Lb0
            java.lang.Object r6 = r4.get(r5)
            f1.w r6 = (f1.w) r6
            long r6 = r6.f3133a
            int r6 = f1.c0.w(r6)
            r2[r5] = r6
            int r5 = r5 + 1
            goto L9d
        Lb0:
            r17 = 0
            android.graphics.Shader$TileMode r18 = f1.c0.v(r3)
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            return r11
        Lbc:
            java.lang.String r1 = "colors must have length of at least 2 if colorStops is omitted."
            j8.o.t(r1)
            r1 = 0
            return r1
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof f1.h0
            if (r1 != 0) goto L9
            goto L2b
        L9:
            f1.h0 r6 = (f1.h0) r6
            java.util.List r1 = r6.f3061c
            java.util.List r2 = r5.f3061c
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L16
            goto L2b
        L16:
            long r1 = r5.f3062d
            long r3 = r6.f3062d
            boolean r1 = e1.b.b(r1, r3)
            if (r1 != 0) goto L21
            goto L2b
        L21:
            long r1 = r5.f3063e
            long r3 = r6.f3063e
            boolean r6 = e1.b.b(r1, r3)
            if (r6 != 0) goto L2d
        L2b:
            r6 = 0
            return r6
        L2d:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.util.List r0 = r4.f3061c
            int r0 = r0.hashCode()
            int r0 = r0 * 961
            long r1 = r4.f3062d
            r3 = 31
            int r0 = eh.a.f(r0, r3, r1)
            long r1 = r4.f3063e
            int r0 = eh.a.f(r0, r3, r1)
            r1 = 0
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r18 = this;
            r0 = r18
            long r1 = r0.f3062d
            r3 = 9187343241974906880(0x7f8000007f800000, double:1.404448428688076E306)
            long r5 = r1 & r3
            long r5 = r5 ^ r3
            r7 = 4294967297(0x100000001, double:2.1219957915E-314)
            long r5 = r5 - r7
            r9 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r5 = r5 & r9
            r11 = 0
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            java.lang.String r6 = ""
            java.lang.String r13 = ", "
            if (r5 != 0) goto L38
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r14 = "start="
            r5.<init>(r14)
            java.lang.String r1 = e1.b.g(r1)
            r5.append(r1)
            r5.append(r13)
            java.lang.String r1 = r5.toString()
            goto L39
        L38:
            r1 = r6
        L39:
            long r14 = r0.f3063e
            long r16 = r14 & r3
            long r2 = r16 ^ r3
            long r2 = r2 - r7
            long r2 = r2 & r9
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L5a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "end="
            r2.<init>(r3)
            java.lang.String r3 = e1.b.g(r14)
            r2.append(r3)
            r2.append(r13)
            java.lang.String r6 = r2.toString()
        L5a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "LinearGradient(colors="
            r2.<init>(r3)
            java.util.List r3 = r0.f3061c
            r2.append(r3)
            java.lang.String r3 = ", stops=null, "
            r2.append(r3)
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = "tileMode="
            r2.append(r1)
            java.lang.String r1 = "Clamp"
            r2.append(r1)
            r1 = 41
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
    }
}
