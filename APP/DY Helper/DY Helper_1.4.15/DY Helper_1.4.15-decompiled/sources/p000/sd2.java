package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class sd2 {

    /* JADX INFO: renamed from: α */
    public static final byte[] f9867 = null;

    static {
            r0 = 0
            byte[] r1 = new byte[r0]
            p000.sd2.f9867 = r1
            dd r1 = p000.C0208dd.f3085
            java.lang.String r1 = "efbbbf"
            dd r1 = p000.C0381i2.m2590(r1)
            java.lang.String r2 = "feff"
            dd r2 = p000.C0381i2.m2590(r2)
            java.lang.String r3 = "fffe0000"
            dd r3 = p000.C0381i2.m2590(r3)
            java.lang.String r4 = "fffe"
            dd r4 = p000.C0381i2.m2590(r4)
            java.lang.String r5 = "0000feff"
            dd r5 = p000.C0381i2.m2590(r5)
            dd[] r1 = new p000.C0208dd[]{r1, r2, r3, r4, r5}
            java.util.ArrayList r6 = new java.util.ArrayList
            v6 r2 = new v6
            r2.<init>(r1, r0)
            r6.<init>(r2)
            int r2 = r6.size()
            r3 = 1
            if (r2 <= r3) goto L3d
            java.util.Collections.sort(r6)
        L3d:
            int r2 = r6.size()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r2)
            r3 = r0
        L47:
            if (r3 >= r2) goto L54
            r4 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9.add(r4)
            int r3 = r3 + 1
            goto L47
        L54:
            r2 = r0
            r3 = r2
        L56:
            r10 = 5
            if (r2 >= r10) goto L6c
            r4 = r1[r2]
            int r5 = r3 + 1
            int r4 = p000.AbstractC1021yh.m6882(r6, r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9.set(r4, r3)
            int r2 = r2 + 1
            r3 = r5
            goto L56
        L6c:
            java.lang.Object r2 = r6.get(r0)
            dd r2 = (p000.C0208dd) r2
            int r2 = r2.mo1701()
            if (r2 <= 0) goto L118
            r2 = r0
        L79:
            int r3 = r6.size()
            if (r2 >= r3) goto Lee
            java.lang.Object r3 = r6.get(r2)
            dd r3 = (p000.C0208dd) r3
            int r4 = r2 + 1
            r5 = r4
        L88:
            int r7 = r6.size()
            if (r5 >= r7) goto Lec
            java.lang.Object r7 = r6.get(r5)
            dd r7 = (p000.C0208dd) r7
            r7.getClass()
            r3.getClass()
            int r8 = r3.mo1701()
            boolean r8 = r7.mo1706(r3, r8)
            if (r8 == 0) goto Lec
            int r8 = r7.mo1701()
            int r11 = r3.mo1701()
            if (r8 == r11) goto Ld4
            java.lang.Object r7 = r9.get(r5)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.Object r8 = r9.get(r2)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r7 <= r8) goto Ld1
            r6.remove(r5)
            java.lang.Object r7 = r9.remove(r5)
            java.lang.Number r7 = (java.lang.Number) r7
            r7.intValue()
            goto L88
        Ld1:
            int r5 = r5 + 1
            goto L88
        Ld4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "duplicate option: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        Lec:
            r2 = r4
            goto L79
        Lee:
            sc r4 = new sc
            r4.<init>()
            r7 = 0
            int r8 = r6.size()
            r2 = 0
            r5 = 0
            p000.j81.m2899(r2, r4, r5, r6, r7, r8, r9)
            long r2 = r4.f9828
            r5 = 4
            long r5 = (long) r5
            long r2 = r2 / r5
            int r2 = (int) r2
            int[] r3 = new int[r2]
        L106:
            if (r0 >= r2) goto L111
            int r5 = r4.readInt()
            r3[r0] = r5
            int r0 = r0 + 1
            goto L106
        L111:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r10)
            dd[] r0 = (p000.C0208dd[]) r0
            return
        L118:
            java.lang.String r0 = "the empty byte string is not a supported option"
            p000.C1080.m7275(r0)
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m5471(long r4, long r6, long r8) {
            long r0 = r6 | r8
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L13
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L13
            long r0 = r4 - r6
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 < 0) goto L13
            return
        L13:
            java.lang.ArrayIndexOutOfBoundsException r8 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "length="
            r9.<init>(r0)
            r9.append(r4)
            java.lang.String r4 = ", offset="
            r9.append(r4)
            r9.append(r6)
            java.lang.String r4 = ", count="
            r9.append(r4)
            r9.append(r6)
            java.lang.String r4 = r9.toString()
            r8.<init>(r4)
            throw r8
    }

    /* JADX INFO: renamed from: β */
    public static final void m5472(java.io.Closeable r0) {
            r0.getClass()
            r0.close()     // Catch: java.lang.Exception -> L6 java.lang.RuntimeException -> L7
        L6:
            return
        L7:
            r0 = move-exception
            throw r0
    }

    /* JADX INFO: renamed from: γ */
    public static final int m5473(int r1, int r2, java.lang.String r3, java.lang.String r4) {
        L0:
            if (r1 >= r2) goto L10
            char r0 = r3.charAt(r1)
            boolean r0 = p000.q02.m4655(r4, r0)
            if (r0 == 0) goto Ld
            return r1
        Ld:
            int r1 = r1 + 1
            goto L0
        L10:
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public static final int m5474(java.lang.String r1, char r2, int r3, int r4) {
        L0:
            if (r3 >= r4) goto Lc
            char r0 = r1.charAt(r3)
            if (r0 != r2) goto L9
            return r3
        L9:
            int r3 = r3 + 1
            goto L0
        Lc:
            return r4
    }

    /* JADX INFO: renamed from: ε */
    public static final boolean m5475(java.lang.String[] r7, java.lang.String[] r8, java.util.Comparator r9) {
            r7.getClass()
            int r0 = r7.length
            r1 = 0
            if (r0 != 0) goto L8
            goto L28
        L8:
            if (r8 == 0) goto L28
            int r0 = r8.length
            if (r0 != 0) goto Le
            goto L28
        Le:
            int r0 = r7.length
            r2 = r1
        L10:
            if (r2 >= r0) goto L28
            r3 = r7[r2]
            int r4 = r8.length
            r5 = r1
        L16:
            if (r5 >= r4) goto L25
            r6 = r8[r5]
            int r6 = r9.compare(r3, r6)
            if (r6 != 0) goto L22
            r7 = 1
            return r7
        L22:
            int r5 = r5 + 1
            goto L16
        L25:
            int r2 = r2 + 1
            goto L10
        L28:
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public static final int m5476(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L20
            char r2 = r4.charAt(r1)
            r3 = 31
            int r3 = p000.ln0.m3632(r2, r3)
            if (r3 <= 0) goto L1f
            r3 = 127(0x7f, float:1.78E-43)
            int r2 = p000.ln0.m3632(r2, r3)
            if (r2 < 0) goto L1c
            goto L1f
        L1c:
            int r1 = r1 + 1
            goto L5
        L1f:
            return r1
        L20:
            r4 = -1
            return r4
    }

    /* JADX INFO: renamed from: η */
    public static final int m5477(int r2, int r3, java.lang.String r4) {
        L0:
            if (r2 >= r3) goto L1e
            char r0 = r4.charAt(r2)
            r1 = 9
            if (r0 == r1) goto L1b
            r1 = 10
            if (r0 == r1) goto L1b
            r1 = 12
            if (r0 == r1) goto L1b
            r1 = 13
            if (r0 == r1) goto L1b
            r1 = 32
            if (r0 == r1) goto L1b
            return r2
        L1b:
            int r2 = r2 + 1
            goto L0
        L1e:
            return r3
    }

    /* JADX INFO: renamed from: θ */
    public static final int m5478(int r2, int r3, java.lang.String r4) {
            int r3 = r3 + (-1)
            if (r2 > r3) goto L24
        L4:
            char r0 = r4.charAt(r3)
            r1 = 9
            if (r0 == r1) goto L1f
            r1 = 10
            if (r0 == r1) goto L1f
            r1 = 12
            if (r0 == r1) goto L1f
            r1 = 13
            if (r0 == r1) goto L1f
            r1 = 32
            if (r0 == r1) goto L1f
            int r3 = r3 + 1
            return r3
        L1f:
            if (r3 == r2) goto L24
            int r3 = r3 + (-1)
            goto L4
        L24:
            return r2
    }

    /* JADX INFO: renamed from: ι */
    public static final java.lang.String[] m5479(java.lang.String[] r8, java.lang.String[] r9, java.util.Comparator r10) {
            r8.getClass()
            r9.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r8.length
            r2 = 0
            r3 = r2
        Le:
            if (r3 >= r1) goto L28
            r4 = r8[r3]
            int r5 = r9.length
            r6 = r2
        L14:
            if (r6 >= r5) goto L25
            r7 = r9[r6]
            int r7 = r10.compare(r4, r7)
            if (r7 != 0) goto L22
            r0.add(r4)
            goto L25
        L22:
            int r6 = r6 + 1
            goto L14
        L25:
            int r3 = r3 + 1
            goto Le
        L28:
            java.lang.String[] r8 = new java.lang.String[r2]
            java.lang.Object[] r8 = r0.toArray(r8)
            java.lang.String[] r8 = (java.lang.String[]) r8
            return r8
    }

    /* JADX INFO: renamed from: κ */
    public static final boolean m5480(java.lang.String r1) {
            r1.getClass()
            java.lang.String r0 = "Authorization"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L26
            java.lang.String r0 = "Cookie"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L26
            java.lang.String r0 = "Proxy-Authorization"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L26
            java.lang.String r0 = "Set-Cookie"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L24
            goto L26
        L24:
            r1 = 0
            return r1
        L26:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: λ */
    public static final int m5481(char r2) {
            r0 = 48
            if (r0 > r2) goto La
            r1 = 58
            if (r2 >= r1) goto La
            int r2 = r2 - r0
            return r2
        La:
            r0 = 97
            if (r0 > r2) goto L15
            r0 = 103(0x67, float:1.44E-43)
            if (r2 >= r0) goto L15
            int r2 = r2 + (-87)
            return r2
        L15:
            r0 = 65
            if (r0 > r2) goto L20
            r0 = 71
            if (r2 >= r0) goto L20
            int r2 = r2 + (-55)
            return r2
        L20:
            r2 = -1
            return r2
    }

    /* JADX INFO: renamed from: μ */
    public static final int m5482(p000.InterfaceC0014ad r2) {
            r2.getClass()
            byte r0 = r2.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            byte r1 = r2.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            byte r2 = r2.readByte()
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            return r2
    }

    /* JADX INFO: renamed from: ν */
    public static final int m5483(java.lang.String r2, int r3) {
            if (r2 == 0) goto L1b
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L1b
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L11
            r2 = 2147483647(0x7fffffff, float:NaN)
            return r2
        L11:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L19
            r2 = 0
            return r2
        L19:
            int r2 = (int) r2
            return r2
        L1b:
            return r3
    }
}
