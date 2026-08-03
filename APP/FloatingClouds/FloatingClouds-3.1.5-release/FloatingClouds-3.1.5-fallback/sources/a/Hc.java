package a;

/* JADX INFO: loaded from: classes.dex */
public final class Hc extends a.K1 {
    public a.C0251le[] f;
    public a.C0251le[] g;
    public int h;
    public a.Hc.b i;

    public class a implements java.util.Comparator<a.C0251le> {
        @Override // java.util.Comparator
        public final int compare(a.C0251le r1, a.C0251le r2) {
                r0 = this;
                a.le r1 = (a.C0251le) r1
                a.le r2 = (a.C0251le) r2
                int r1 = r1.b
                int r2 = r2.b
                int r1 = r1 - r2
                return r1
        }
    }

    public class b implements java.lang.Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a.C0251le f114a;
        public final /* synthetic */ a.Hc b;

        public b(a.Hc r1) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                return
        }

        @Override // java.lang.Comparable
        public final int compareTo(java.lang.Object r2) {
                r1 = this;
                a.le r2 = (a.C0251le) r2
                a.le r0 = r1.f114a
                int r0 = r0.b
                int r2 = r2.b
                int r0 = r0 - r2
                return r0
        }

        public final java.lang.String toString() {
                r3 = this;
                a.le r0 = r3.f114a
                java.lang.String r1 = "[ "
                if (r0 == 0) goto L28
                r0 = 0
            L7:
                r2 = 9
                if (r0 >= r2) goto L28
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                a.le r1 = r3.f114a
                float[] r1 = r1.h
                r1 = r1[r0]
                r2.append(r1)
                java.lang.String r1 = " "
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                int r0 = r0 + 1
                goto L7
            L28:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = "] "
                r0.append(r1)
                a.le r1 = r3.f114a
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    @Override // a.K1, a.B9.a
    public final a.C0251le a(boolean[] r10) {
            r9 = this;
            r0 = -1
            r1 = 0
            r2 = r0
        L3:
            int r3 = r9.h
            if (r1 >= r3) goto L4d
            a.le[] r3 = r9.f
            r4 = r3[r1]
            int r5 = r4.b
            boolean r5 = r10[r5]
            if (r5 == 0) goto L12
            goto L4a
        L12:
            a.Hc$b r5 = r9.i
            r5.f114a = r4
            r4 = 8
            if (r2 != r0) goto L30
        L1a:
            if (r4 < 0) goto L4a
            a.le r3 = r5.f114a
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
            a.le r7 = r5.f114a
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
            a.le[] r10 = r9.f
            r10 = r10[r2]
            return r10
    }

    @Override // a.K1
    public final void h(a.K1 r19, boolean r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            a.le r2 = r1.f147a
            if (r2 != 0) goto L9
            return
        L9:
            a.K1$a r3 = r1.d
            int r4 = r3.k()
            r6 = 0
        L10:
            if (r6 >= r4) goto L8a
            a.le r7 = r3.f(r6)
            float r8 = r3.a(r6)
            a.Hc$b r9 = r0.i
            r9.f114a = r7
            boolean r10 = r7.f563a
            float[] r11 = r2.h
            r12 = 953267991(0x38d1b717, float:1.0E-4)
            r13 = 9
            r14 = 0
            if (r10 == 0) goto L59
            r7 = 1
            r10 = 0
        L2c:
            if (r10 >= r13) goto L4f
            a.le r15 = r9.f114a
            float[] r15 = r15.h
            r16 = r15[r10]
            r17 = r11[r10]
            float r17 = r17 * r8
            float r17 = r17 + r16
            r15[r10] = r17
            float r15 = java.lang.Math.abs(r17)
            int r15 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r15 >= 0) goto L4b
            a.le r15 = r9.f114a
            float[] r15 = r15.h
            r15[r10] = r14
            goto L4c
        L4b:
            r7 = 0
        L4c:
            int r10 = r10 + 1
            goto L2c
        L4f:
            if (r7 == 0) goto L7f
            a.le r7 = r9.f114a
            a.Hc r9 = r9.b
            r9.j(r7)
            goto L7f
        L59:
            r10 = 0
        L5a:
            if (r10 >= r13) goto L7c
            r15 = r11[r10]
            int r16 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r16 == 0) goto L73
            float r15 = r15 * r8
            float r16 = java.lang.Math.abs(r15)
            int r16 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r16 >= 0) goto L6c
            r15 = r14
        L6c:
            a.le r5 = r9.f114a
            float[] r5 = r5.h
            r5[r10] = r15
            goto L79
        L73:
            a.le r5 = r9.f114a
            float[] r5 = r5.h
            r5[r10] = r14
        L79:
            int r10 = r10 + 1
            goto L5a
        L7c:
            r0.i(r7)
        L7f:
            float r5 = r0.b
            float r7 = r1.b
            float r7 = r7 * r8
            float r7 = r7 + r5
            r0.b = r7
            int r6 = r6 + 1
            goto L10
        L8a:
            r0.j(r2)
            return
    }

    public final void i(a.C0251le r6) {
            r5 = this;
            int r0 = r5.h
            r1 = 1
            int r0 = r0 + r1
            a.le[] r2 = r5.f
            int r3 = r2.length
            if (r0 <= r3) goto L1f
            int r0 = r2.length
            int r0 = r0 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            a.le[] r0 = (a.C0251le[]) r0
            r5.f = r0
            int r2 = r0.length
            int r2 = r2 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            a.le[] r0 = (a.C0251le[]) r0
            r5.g = r0
        L1f:
            a.le[] r0 = r5.f
            int r2 = r5.h
            r0[r2] = r6
            int r3 = r2 + 1
            r5.h = r3
            if (r3 <= r1) goto L5d
            r0 = r0[r2]
            int r0 = r0.b
            int r2 = r6.b
            if (r0 <= r2) goto L5d
            r0 = 0
            r2 = r0
        L35:
            int r3 = r5.h
            if (r2 >= r3) goto L44
            a.le[] r3 = r5.g
            a.le[] r4 = r5.f
            r4 = r4[r2]
            r3[r2] = r4
            int r2 = r2 + 1
            goto L35
        L44:
            a.le[] r2 = r5.g
            a.Hc$a r4 = new a.Hc$a
            r4.<init>()
            java.util.Arrays.sort(r2, r0, r3, r4)
        L4e:
            int r2 = r5.h
            if (r0 >= r2) goto L5d
            a.le[] r2 = r5.f
            a.le[] r3 = r5.g
            r3 = r3[r0]
            r2[r0] = r3
            int r0 = r0 + 1
            goto L4e
        L5d:
            r6.f563a = r1
            r6.a(r5)
            return
    }

    public final void j(a.C0251le r6) {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.h
            if (r1 >= r2) goto L26
            a.le[] r2 = r5.f
            r2 = r2[r1]
            if (r2 != r6) goto L23
        Lc:
            int r2 = r5.h
            int r3 = r2 + (-1)
            if (r1 >= r3) goto L1c
            a.le[] r2 = r5.f
            int r3 = r1 + 1
            r4 = r2[r3]
            r2[r1] = r4
            r1 = r3
            goto Lc
        L1c:
            int r2 = r2 + (-1)
            r5.h = r2
            r6.f563a = r0
            return
        L23:
            int r1 = r1 + 1
            goto L2
        L26:
            return
    }

    @Override // a.K1
    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " goal -> ("
            r0.<init>(r1)
            float r1 = r4.b
            r0.append(r1)
            java.lang.String r1 = ") : "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
        L16:
            int r2 = r4.h
            if (r1 >= r2) goto L39
            a.le[] r2 = r4.f
            r2 = r2[r1]
            a.Hc$b r3 = r4.i
            r3.f114a = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = " "
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            int r1 = r1 + 1
            goto L16
        L39:
            return r0
    }
}
