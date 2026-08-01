package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zx extends defpackage.p6 {
    public defpackage.a40[] f;
    public defpackage.a40[] g;
    public int h;
    public defpackage.yx i;

    @Override // defpackage.p6
    public final defpackage.a40 d(boolean[] r10) {
            r9 = this;
            r0 = -1
            r1 = 0
            r2 = r0
        L3:
            int r3 = r9.h
            if (r1 >= r3) goto L4d
            a40[] r3 = r9.f
            r4 = r3[r1]
            int r5 = r4.b
            boolean r5 = r10[r5]
            if (r5 == 0) goto L12
            goto L4a
        L12:
            yx r5 = r9.i
            r5.a = r4
            r4 = 8
            if (r2 != r0) goto L30
        L1a:
            if (r4 < 0) goto L4a
            a40 r3 = r5.a
            float[] r3 = r3.h
            r3 = r3[r4]
            r6 = 0
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 <= 0) goto L28
            goto L4a
        L28:
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 >= 0) goto L2d
            goto L49
        L2d:
            int r4 = r4 + (-1)
            goto L1a
        L30:
            r3 = r3[r2]
        L32:
            if (r4 < 0) goto L4a
            float[] r6 = r3.h
            r6 = r6[r4]
            a40 r7 = r5.a
            float[] r7 = r7.h
            r7 = r7[r4]
            int r8 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r8 != 0) goto L45
            int r4 = r4 + (-1)
            goto L32
        L45:
            int r3 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r3 >= 0) goto L4a
        L49:
            r2 = r1
        L4a:
            int r1 = r1 + 1
            goto L3
        L4d:
            if (r2 != r0) goto L51
            r10 = 0
            return r10
        L51:
            a40[] r10 = r9.f
            r10 = r10[r2]
            return r10
    }

    @Override // defpackage.p6
    public final void h(defpackage.p6 r19, boolean r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            a40 r2 = r1.a
            if (r2 != 0) goto L9
            return
        L9:
            float[] r3 = r2.h
            o6 r4 = r1.d
            int r5 = r4.k()
            r7 = 0
        L12:
            if (r7 >= r5) goto L8a
            a40 r8 = r4.e(r7)
            float r9 = r4.a(r7)
            yx r10 = r0.i
            r10.a = r8
            boolean r11 = r8.a
            r12 = 953267991(0x38d1b717, float:1.0E-4)
            r13 = 9
            r14 = 0
            if (r11 == 0) goto L59
            r8 = 1
            r11 = 0
        L2c:
            if (r11 >= r13) goto L4f
            a40 r15 = r10.a
            float[] r15 = r15.h
            r16 = r15[r11]
            r17 = r3[r11]
            float r17 = r17 * r9
            float r17 = r17 + r16
            r15[r11] = r17
            float r15 = java.lang.Math.abs(r17)
            int r15 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r15 >= 0) goto L4b
            a40 r15 = r10.a
            float[] r15 = r15.h
            r15[r11] = r14
            goto L4c
        L4b:
            r8 = 0
        L4c:
            int r11 = r11 + 1
            goto L2c
        L4f:
            if (r8 == 0) goto L7f
            zx r8 = r10.b
            a40 r10 = r10.a
            r8.j(r10)
            goto L7f
        L59:
            r11 = 0
        L5a:
            if (r11 >= r13) goto L7c
            r15 = r3[r11]
            int r16 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r16 == 0) goto L73
            float r15 = r15 * r9
            float r16 = java.lang.Math.abs(r15)
            int r16 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r16 >= 0) goto L6c
            r15 = r14
        L6c:
            a40 r6 = r10.a
            float[] r6 = r6.h
            r6[r11] = r15
            goto L79
        L73:
            a40 r6 = r10.a
            float[] r6 = r6.h
            r6[r11] = r14
        L79:
            int r11 = r11 + 1
            goto L5a
        L7c:
            r0.i(r8)
        L7f:
            float r6 = r0.b
            float r8 = r1.b
            float r8 = r8 * r9
            float r8 = r8 + r6
            r0.b = r8
            int r7 = r7 + 1
            goto L12
        L8a:
            r0.j(r2)
            return
    }

    public final void i(defpackage.a40 r7) {
            r6 = this;
            int r0 = r6.h
            r1 = 1
            int r0 = r0 + r1
            a40[] r2 = r6.f
            int r3 = r2.length
            if (r0 <= r3) goto L1f
            int r0 = r2.length
            int r0 = r0 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            a40[] r0 = (defpackage.a40[]) r0
            r6.f = r0
            int r2 = r0.length
            int r2 = r2 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            a40[] r0 = (defpackage.a40[]) r0
            r6.g = r0
        L1f:
            a40[] r0 = r6.f
            int r2 = r6.h
            r0[r2] = r7
            int r3 = r2 + 1
            r6.h = r3
            if (r3 <= r1) goto L5e
            r0 = r0[r2]
            int r0 = r0.b
            int r2 = r7.b
            if (r0 <= r2) goto L5e
            r0 = 0
            r2 = r0
        L35:
            int r3 = r6.h
            if (r2 >= r3) goto L44
            a40[] r3 = r6.g
            a40[] r4 = r6.f
            r4 = r4[r2]
            r3[r2] = r4
            int r2 = r2 + 1
            goto L35
        L44:
            a40[] r2 = r6.g
            ce r4 = new ce
            r5 = 2
            r4.<init>(r5)
            java.util.Arrays.sort(r2, r0, r3, r4)
        L4f:
            int r2 = r6.h
            if (r0 >= r2) goto L5e
            a40[] r2 = r6.f
            a40[] r3 = r6.g
            r3 = r3[r0]
            r2[r0] = r3
            int r0 = r0 + 1
            goto L4f
        L5e:
            r7.a = r1
            r7.a(r6)
            return
    }

    public final void j(defpackage.a40 r6) {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.h
            if (r1 >= r2) goto L26
            a40[] r2 = r5.f
            r2 = r2[r1]
            if (r2 != r6) goto L23
        Lc:
            int r2 = r5.h
            int r3 = r2 + (-1)
            if (r1 >= r3) goto L1c
            a40[] r2 = r5.f
            int r3 = r1 + 1
            r4 = r2[r3]
            r2[r1] = r4
            r1 = r3
            goto Lc
        L1c:
            int r2 = r2 + (-1)
            r5.h = r2
            r6.a = r0
            return
        L23:
            int r1 = r1 + 1
            goto L2
        L26:
            return
    }

    @Override // defpackage.p6
    public final java.lang.String toString() {
            r4 = this;
            yx r0 = r4.i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " goal -> ("
            r1.<init>(r2)
            float r2 = r4.b
            r1.append(r2)
            java.lang.String r2 = ") : "
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
        L18:
            int r3 = r4.h
            if (r2 >= r3) goto L39
            a40[] r3 = r4.f
            r3 = r3[r2]
            r0.a = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = " "
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            int r2 = r2 + 1
            goto L18
        L39:
            return r1
    }
}
