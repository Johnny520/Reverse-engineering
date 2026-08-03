package tf;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends x6.d {
    public static lg.d A0(java.lang.Object[] r3) {
            r3.getClass()
            lg.d r0 = new lg.d
            int r3 = r3.length
            r1 = 1
            int r3 = r3 - r1
            r2 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static int B0(long[] r0) {
            r0.getClass()
            int r0 = r0.length
            int r0 = r0 + (-1)
            return r0
    }

    public static java.lang.Object C0(int r1, java.lang.Object[] r2) {
            r2.getClass()
            if (r1 < 0) goto Lb
            int r0 = r2.length
            if (r1 >= r0) goto Lb
            r1 = r2[r1]
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static int D0(java.lang.Object[] r3, java.lang.Object r4) {
            r3.getClass()
            r0 = 0
            if (r4 != 0) goto L11
            int r4 = r3.length
        L7:
            if (r0 >= r4) goto L20
            r1 = r3[r0]
            if (r1 != 0) goto Le
            return r0
        Le:
            int r0 = r0 + 1
            goto L7
        L11:
            int r1 = r3.length
        L12:
            if (r0 >= r1) goto L20
            r2 = r3[r0]
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L1d
            return r0
        L1d:
            int r0 = r0 + 1
            goto L12
        L20:
            r3 = -1
            return r3
    }

    public static java.lang.String E0(byte[] r7, fg.l r8) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            int r2 = r7.length
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L28
            r5 = r7[r3]
            r6 = 1
            int r4 = r4 + r6
            if (r4 <= r6) goto L18
            r0.append(r1)
        L18:
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            java.lang.Object r5 = r8.invoke(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r0.append(r5)
            int r3 = r3 + 1
            goto Ld
        L28:
            r0.append(r1)
            java.lang.String r7 = r0.toString()
            return r7
    }

    public static java.lang.String F0(java.lang.Object[] r7, fg.l r8, int r9) {
            r0 = r9 & 1
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            java.lang.String r0 = ", "
            goto La
        L9:
            r0 = r1
        La:
            r2 = r9 & 2
            if (r2 == 0) goto L10
            r2 = r1
            goto L12
        L10:
            java.lang.String r2 = "innermostOf("
        L12:
            r3 = r9 & 4
            if (r3 == 0) goto L17
            goto L19
        L17:
            java.lang.String r1 = ")"
        L19:
            r9 = r9 & 32
            if (r9 == 0) goto L1e
            r8 = 0
        L1e:
            r7.getClass()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            int r2 = r7.length
            r3 = 0
            r4 = r3
        L2c:
            if (r3 >= r2) goto L3d
            r5 = r7[r3]
            r6 = 1
            int r4 = r4 + r6
            if (r4 <= r6) goto L37
            r9.append(r0)
        L37:
            ac.p.f(r9, r5, r8)
            int r3 = r3 + 1
            goto L2c
        L3d:
            r9.append(r1)
            java.lang.String r7 = r9.toString()
            return r7
    }

    public static java.lang.Object G0(java.lang.Object[] r2) {
            jg.a r0 = jg.d.f6902g
            int r0 = r2.length
            if (r0 == 0) goto Lf
            int r0 = r2.length
            jg.a r1 = jg.d.f6902g
            int r0 = r1.g(r0)
            r2 = r2[r0]
            return r2
        Lf:
            java.lang.String r2 = "Array is empty."
            j8.o.l(r2)
            r2 = 0
            return r2
    }

    public static java.util.List H0(java.lang.Object[] r2, java.util.Comparator r3) {
            int r0 = r2.length
            if (r0 != 0) goto L4
            goto L10
        L4:
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            int r0 = r2.length
            r1 = 1
            if (r0 <= r1) goto L10
            java.util.Arrays.sort(r2, r3)
        L10:
            java.util.List r2 = java.util.Arrays.asList(r2)
            r2.getClass()
            return r2
    }

    public static java.util.List I0(byte[] r7) {
            int r0 = r7.length
            r1 = 6
            r2 = 1
            r3 = 0
            if (r1 < r0) goto L2f
            int r0 = r7.length
            if (r0 == 0) goto L2c
            if (r0 == r2) goto L21
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.length
            r0.<init>(r1)
            int r1 = r7.length
        L12:
            if (r3 >= r1) goto L20
            r2 = r7[r3]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r0.add(r2)
            int r3 = r3 + 1
            goto L12
        L20:
            return r0
        L21:
            r7 = r7[r3]
            java.lang.Byte r7 = java.lang.Byte.valueOf(r7)
            java.util.List r7 = a.a.x0(r7)
            return r7
        L2c:
            tf.t r7 = tf.t.f13167g
            return r7
        L2f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            int r4 = r7.length
            r5 = r3
        L36:
            if (r3 >= r4) goto L48
            r6 = r7[r3]
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
            r0.add(r6)
            int r5 = r5 + r2
            if (r5 != r1) goto L45
            goto L48
        L45:
            int r3 = r3 + 1
            goto L36
        L48:
            return r0
    }

    public static final void J0(java.lang.Object[] r3, java.util.LinkedHashSet r4) {
            int r0 = r3.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lc
            r2 = r3[r1]
            r4.add(r2)
            int r1 = r1 + 1
            goto L2
        Lc:
            return
    }

    public static java.util.List K0(int[] r4) {
            r4.getClass()
            int r0 = r4.length
            if (r0 == 0) goto L2b
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L20
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r4.length
            r0.<init>(r2)
            int r2 = r4.length
        L11:
            if (r1 >= r2) goto L1f
            r3 = r4[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            int r1 = r1 + 1
            goto L11
        L1f:
            return r0
        L20:
            r4 = r4[r1]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.List r4 = a.a.x0(r4)
            return r4
        L2b:
            tf.t r4 = tf.t.f13167g
            return r4
    }

    public static java.util.List L0(java.lang.Object[] r2) {
            r2.getClass()
            int r0 = r2.length
            if (r0 == 0) goto L1e
            r1 = 1
            if (r0 == r1) goto L16
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.util.List r2 = java.util.Arrays.asList(r2)
            r2.getClass()
            return r2
        L16:
            r0 = 0
            r2 = r2[r0]
            java.util.List r2 = a.a.x0(r2)
            return r2
        L1e:
            tf.t r2 = tf.t.f13167g
            return r2
    }

    public static ng.j k0(java.lang.Object[] r2) {
            int r0 = r2.length
            if (r0 != 0) goto L6
            ng.g r2 = ng.g.f9436a
            return r2
        L6:
            dg.n r0 = new dg.n
            r1 = 5
            r0.<init>(r2, r1)
            return r0
    }

    public static boolean l0(char[] r4, char r5) {
            int r0 = r4.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto Ld
            char r3 = r4[r2]
            if (r5 != r3) goto La
            goto Le
        La:
            int r2 = r2 + 1
            goto L3
        Ld:
            r2 = -1
        Le:
            if (r2 < 0) goto L12
            r4 = 1
            return r4
        L12:
            return r1
    }

    public static boolean m0(java.lang.Object[] r0, java.lang.Object r1) {
            r0.getClass()
            int r0 = D0(r0, r1)
            if (r0 < 0) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static void n0(int r0, int r1, java.lang.Object[] r2, int r3, java.lang.Object[] r4) {
            r2.getClass()
            r4.getClass()
            int r3 = r3 - r1
            java.lang.System.arraycopy(r2, r1, r4, r0, r3)
            return
    }

    public static void o0(byte[] r0, int r1, int r2, byte[] r3, int r4) {
            r0.getClass()
            r3.getClass()
            int r4 = r4 - r2
            java.lang.System.arraycopy(r0, r2, r3, r1, r4)
            return
    }

    public static void p0(int[] r0, int[] r1, int r2, int r3, int r4) {
            r0.getClass()
            r1.getClass()
            int r4 = r4 - r3
            java.lang.System.arraycopy(r0, r3, r1, r2, r4)
            return
    }

    public static void q0(long[] r0, long[] r1, int r2, int r3, int r4) {
            r0.getClass()
            r1.getClass()
            int r4 = r4 - r3
            java.lang.System.arraycopy(r0, r3, r1, r2, r4)
            return
    }

    public static /* synthetic */ void r0(int r1, int r2, java.lang.Object[] r3, int r4, java.lang.Object[] r5) {
            r4 = r4 & 4
            r0 = 0
            if (r4 == 0) goto L6
            r1 = r0
        L6:
            n0(r0, r1, r3, r2, r5)
            return
    }

    public static /* synthetic */ void s0(int[] r2, int[] r3, int r4, int r5, int r6) {
            r0 = r6 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r6 = r6 & 8
            if (r6 == 0) goto Lb
            int r5 = r2.length
        Lb:
            p0(r2, r3, r4, r1, r5)
            return
    }

    public static byte[] t0(byte[] r1, int r2, int r3) {
            r1.getClass()
            int r0 = r1.length
            x6.d.r(r3, r0)
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            r1.getClass()
            return r1
    }

    public static java.lang.Object[] u0(java.lang.Object[] r1, int r2, int r3) {
            r1.getClass()
            int r0 = r1.length
            x6.d.r(r3, r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            r1.getClass()
            return r1
    }

    public static void v0(int r0, int r1, java.lang.Object r2, java.lang.Object[] r3) {
            r3.getClass()
            java.util.Arrays.fill(r3, r0, r1, r2)
            return
    }

    public static void w0(long r2, long[] r4) {
            int r0 = r4.length
            r4.getClass()
            r1 = 0
            java.util.Arrays.fill(r4, r1, r0, r2)
            return
    }

    public static /* synthetic */ void x0(java.lang.String r2, java.lang.Object[] r3) {
            r0 = 0
            int r1 = r3.length
            v0(r0, r1, r2, r3)
            return
    }

    public static void y0(int[] r2, int r3) {
            int r0 = r2.length
            r2.getClass()
            r1 = 0
            java.util.Arrays.fill(r2, r1, r0, r3)
            return
    }

    public static java.lang.Object z0(java.lang.Object[] r1) {
            r1.getClass()
            int r0 = r1.length
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            r0 = 0
            r1 = r1[r0]
            return r1
    }
}
