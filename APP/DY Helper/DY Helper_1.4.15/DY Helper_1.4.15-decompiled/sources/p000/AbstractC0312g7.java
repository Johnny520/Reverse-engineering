package p000;

/* JADX INFO: renamed from: g7 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0312g7 extends p000.AbstractC0782s1 {
    /* JADX INFO: renamed from: Θ */
    public static p000.ss1 m2232(java.lang.Object[] r2) {
            int r0 = r2.length
            if (r0 != 0) goto L6
            mz r2 = p000.C0567mz.f7331
            return r2
        L6:
            f7 r0 = new f7
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: Ι */
    public static boolean m2233(char[] r4, char r5) {
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

    /* JADX INFO: renamed from: Κ */
    public static boolean m2234(java.lang.Object[] r0, java.lang.Object r1) {
            r0.getClass()
            int r0 = m2254(r0, r1)
            if (r0 < 0) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: Λ */
    public static void m2235(int r0, int r1, int r2, int[] r3, int[] r4) {
            r3.getClass()
            r4.getClass()
            int r2 = r2 - r1
            java.lang.System.arraycopy(r3, r1, r4, r0, r2)
            return
    }

    /* JADX INFO: renamed from: Μ */
    public static void m2236(byte[] r0, byte[] r1, int r2, int r3, int r4) {
            r0.getClass()
            r1.getClass()
            int r4 = r4 - r3
            java.lang.System.arraycopy(r0, r3, r1, r2, r4)
            return
    }

    /* JADX INFO: renamed from: Ν */
    public static void m2237(long[] r0, long[] r1, int r2, int r3, int r4) {
            r0.getClass()
            r1.getClass()
            int r4 = r4 - r3
            java.lang.System.arraycopy(r0, r3, r1, r2, r4)
            return
    }

    /* JADX INFO: renamed from: Ξ */
    public static void m2238(java.lang.Object[] r0, java.lang.Object[] r1, int r2, int r3, int r4) {
            r0.getClass()
            r1.getClass()
            int r4 = r4 - r3
            java.lang.System.arraycopy(r0, r3, r1, r2, r4)
            return
    }

    /* JADX INFO: renamed from: Ο */
    public static /* synthetic */ void m2239(int r2, int r3, int r4, int[] r5, int[] r6) {
            r0 = r4 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r2 = r1
        L6:
            r4 = r4 & 8
            if (r4 == 0) goto Lb
            int r3 = r5.length
        Lb:
            m2235(r2, r1, r3, r5, r6)
            return
    }

    /* JADX INFO: renamed from: Π */
    public static /* synthetic */ void m2240(java.lang.Object[] r2, java.lang.Object[] r3, int r4, int r5, int r6) {
            r0 = r6 & 4
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r6 = r6 & 8
            if (r6 == 0) goto Lb
            int r5 = r2.length
        Lb:
            m2238(r2, r3, r1, r4, r5)
            return
    }

    /* JADX INFO: renamed from: Ρ */
    public static byte[] m2241(byte[] r1, int r2, int r3) {
            r1.getClass()
            int r0 = r1.length
            p000.AbstractC0782s1.m5330(r3, r0)
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            r1.getClass()
            return r1
    }

    /* JADX INFO: renamed from: Σ */
    public static java.lang.Object[] m2242(java.lang.Object[] r1, int r2, int r3) {
            r1.getClass()
            int r0 = r1.length
            p000.AbstractC0782s1.m5330(r3, r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            r1.getClass()
            return r1
    }

    /* JADX INFO: renamed from: Τ */
    public static java.util.List m2243(java.lang.Object[] r7) {
            int r0 = r7.length
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            if (r0 >= 0) goto L7
            r0 = r2
        L7:
            if (r0 < 0) goto L35
            if (r0 != 0) goto Le
            jz r7 = p000.C0450jz.f5672
            return r7
        Le:
            int r3 = r7.length
            if (r0 < r3) goto L16
            java.util.List r7 = m2262(r7)
            return r7
        L16:
            if (r0 != r1) goto L1f
            r7 = r7[r2]
            java.util.List r7 = p000.AbstractC1021yh.m6896(r7)
            return r7
        L1f:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            int r4 = r7.length
            r5 = r2
        L26:
            if (r2 >= r4) goto L34
            r6 = r7[r2]
            r3.add(r6)
            int r5 = r5 + r1
            if (r5 != r0) goto L31
            goto L34
        L31:
            int r2 = r2 + 1
            goto L26
        L34:
            return r3
        L35:
            java.lang.String r7 = "Requested element count "
            java.lang.String r1 = " is less than zero."
            java.lang.String r7 = p000.AbstractC0602nx.m4127(r7, r0, r1)
            p000.C1080.m7266(r7)
            r7 = 0
            return r7
    }

    /* JADX INFO: renamed from: Υ */
    public static void m2244(int r0, int r1, java.lang.Object r2, java.lang.Object[] r3) {
            r3.getClass()
            java.util.Arrays.fill(r3, r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: Φ */
    public static void m2245(long r2, long[] r4) {
            int r0 = r4.length
            r4.getClass()
            r1 = 0
            java.util.Arrays.fill(r4, r1, r0, r2)
            return
    }

    /* JADX INFO: renamed from: Χ */
    public static /* synthetic */ void m2246(java.lang.String r2, java.lang.Object[] r3) {
            r0 = 0
            int r1 = r3.length
            m2244(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: Ψ */
    public static void m2247(int[] r3) {
            int r0 = r3.length
            r3.getClass()
            r1 = 0
            r2 = -1
            java.util.Arrays.fill(r3, r1, r0, r2)
            return
    }

    /* JADX INFO: renamed from: Ω */
    public static java.util.ArrayList m2248(java.lang.Object[] r4) {
            r4.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r4.length
            r2 = 0
        La:
            if (r2 >= r1) goto L16
            r3 = r4[r2]
            if (r3 == 0) goto L13
            r0.add(r3)
        L13:
            int r2 = r2 + 1
            goto La
        L16:
            return r0
    }

    /* JADX INFO: renamed from: а */
    public static java.lang.Object m2249(java.lang.Object[] r1) {
            r1.getClass()
            int r0 = r1.length
            if (r0 == 0) goto La
            r0 = 0
            r1 = r1[r0]
            return r1
        La:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "Array is empty."
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: б */
    public static java.lang.Object m2250(java.lang.Object[] r1) {
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

    /* JADX INFO: renamed from: в */
    public static p000.xm0 m2251(java.lang.Object[] r3) {
            r3.getClass()
            xm0 r0 = new xm0
            int r3 = r3.length
            r1 = 1
            int r3 = r3 - r1
            r2 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    /* JADX INFO: renamed from: г */
    public static int m2252(long[] r0) {
            r0.getClass()
            int r0 = r0.length
            int r0 = r0 + (-1)
            return r0
    }

    /* JADX INFO: renamed from: д */
    public static java.lang.Object m2253(int r1, java.lang.Object[] r2) {
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

    /* JADX INFO: renamed from: е */
    public static int m2254(java.lang.Object[] r3, java.lang.Object r4) {
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

    /* JADX INFO: renamed from: ж */
    public static java.lang.String m2255(byte[] r7, p000.a80 r8) {
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

    /* JADX INFO: renamed from: з */
    public static java.lang.String m2256(java.lang.Object[] r5, java.lang.String r6, java.lang.String r7, p000.a80 r8, int r9) {
            r0 = r9 & 1
            if (r0 == 0) goto L6
            java.lang.String r6 = ", "
        L6:
            r0 = r9 & 2
            java.lang.String r1 = ""
            if (r0 == 0) goto Ld
            r7 = r1
        Ld:
            r0 = r9 & 4
            if (r0 == 0) goto L12
            goto L14
        L12:
            java.lang.String r1 = ")"
        L14:
            r9 = r9 & 32
            if (r9 == 0) goto L19
            r8 = 0
        L19:
            r5.getClass()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            int r7 = r5.length
            r0 = 0
            r2 = r0
        L27:
            if (r0 >= r7) goto L38
            r3 = r5[r0]
            r4 = 1
            int r2 = r2 + r4
            if (r2 <= r4) goto L32
            r9.append(r6)
        L32:
            p000.i81.m2656(r9, r3, r8)
            int r0 = r0 + 1
            goto L27
        L38:
            r9.append(r1)
            java.lang.String r5 = r9.toString()
            return r5
    }

    /* JADX INFO: renamed from: и */
    public static char m2257(char[] r2) {
            int r0 = r2.length
            if (r0 == 0) goto L11
            r1 = 1
            if (r0 != r1) goto La
            r0 = 0
            char r2 = r2[r0]
            return r2
        La:
            java.lang.String r2 = "Array has more than one element."
            p000.C1080.m7275(r2)
            r2 = 0
            return r2
        L11:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.String r0 = "Array is empty."
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: й */
    public static java.lang.Object m2258(java.lang.Object[] r2) {
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto L8
            r0 = 0
            r2 = r2[r0]
            return r2
        L8:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: к */
    public static java.util.List m2259(java.lang.Object[] r2, java.util.Comparator r3) {
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

    /* JADX INFO: renamed from: л */
    public static final void m2260(java.lang.Object[] r3, java.util.LinkedHashSet r4) {
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

    /* JADX INFO: renamed from: м */
    public static java.util.List m2261(int[] r4) {
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
            java.util.List r4 = p000.AbstractC1021yh.m6896(r4)
            return r4
        L2b:
            jz r4 = p000.C0450jz.f5672
            return r4
    }

    /* JADX INFO: renamed from: н */
    public static java.util.List m2262(java.lang.Object[] r3) {
            r3.getClass()
            int r0 = r3.length
            if (r0 == 0) goto L1c
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L15
            java.util.ArrayList r0 = new java.util.ArrayList
            v6 r1 = new v6
            r1.<init>(r3, r2)
            r0.<init>(r1)
            return r0
        L15:
            r3 = r3[r2]
            java.util.List r3 = p000.AbstractC1021yh.m6896(r3)
            return r3
        L1c:
            jz r3 = p000.C0450jz.f5672
            return r3
    }

    /* JADX INFO: renamed from: о */
    public static java.util.Set m2263(java.lang.Object[] r2) {
            int r0 = r2.length
            if (r0 == 0) goto L1c
            r1 = 1
            if (r0 == r1) goto L14
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r2.length
            int r1 = p000.ex0.m1970(r1)
            r0.<init>(r1)
            m2260(r2, r0)
            return r0
        L14:
            r0 = 0
            r2 = r2[r0]
            java.util.Set r2 = p000.g81.m2288(r2)
            return r2
        L1c:
            nz r2 = p000.C0604nz.f7825
            return r2
    }
}
