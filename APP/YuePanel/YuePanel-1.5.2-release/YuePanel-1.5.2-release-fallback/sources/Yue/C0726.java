package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C0726 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f2008 = 0;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f2009 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f2010 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f2011 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f2012 = 16;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f2013 = 32;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f2014 = 76;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final byte f2015 = 61;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final byte f2016 = 10;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final java.lang.String f2017 = "US-ASCII";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final byte f2018 = -5;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final byte[] f2019 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final byte[] f2020 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final byte[] f2021 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final byte[] f2022 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final byte[] f2023 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final byte[] f2024 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final /* synthetic */ boolean f2025 = false;

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۥ۟$ۥ, reason: contains not printable characters */
    public static class C0727 extends java.io.FilterOutputStream {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public boolean f2026;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f2027;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public byte[] f2028;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f2029;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f2030;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public boolean f2031;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public byte[] f2032;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public boolean f2033;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public int f2034;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public byte[] f2035;

        public C0727(java.io.OutputStream r2) {
                r1 = this;
                r0 = 1
                r1.<init>(r2, r0)
                return
        }

        public C0727(java.io.OutputStream r3, int r4) {
                r2 = this;
                r2.<init>(r3)
                r3 = r4 & 8
                r0 = 1
                r1 = 0
                if (r3 == 0) goto Lb
                r3 = r0
                goto Lc
            Lb:
                r3 = r1
            Lc:
                r2.f2031 = r3
                r3 = r4 & 1
                if (r3 == 0) goto L13
                goto L14
            L13:
                r0 = r1
            L14:
                r2.f2026 = r0
                r3 = 4
                if (r0 == 0) goto L1b
                r0 = 3
                goto L1c
            L1b:
                r0 = r3
            L1c:
                r2.f2029 = r0
                byte[] r0 = new byte[r0]
                r2.f2028 = r0
                r2.f2027 = r1
                r2.f2030 = r1
                r2.f2033 = r1
                byte[] r3 = new byte[r3]
                r2.f2032 = r3
                r2.f2034 = r4
                byte[] r3 = Yue.C0726.m4517(r4)
                r2.f2035 = r3
                return
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r1 = this;
                r1.m4528()
                super.close()
                r0 = 0
                r1.f2028 = r0
                r1.out = r0
                return
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int r6) throws java.io.IOException {
                r5 = this;
                boolean r0 = r5.f2033
                if (r0 == 0) goto La
                java.io.OutputStream r0 = r5.out
                r0.write(r6)
                return
            La:
                boolean r0 = r5.f2026
                r1 = 0
                if (r0 == 0) goto L45
                byte[] r0 = r5.f2028
                int r2 = r5.f2027
                int r3 = r2 + 1
                r5.f2027 = r3
                byte r6 = (byte) r6
                r0[r2] = r6
                int r6 = r5.f2029
                if (r3 < r6) goto L71
                java.io.OutputStream r2 = r5.out
                byte[] r3 = r5.f2032
                int r4 = r5.f2034
                byte[] r6 = Yue.C0726.m4518(r3, r0, r6, r4)
                r2.write(r6)
                int r6 = r5.f2030
                int r6 = r6 + 4
                r5.f2030 = r6
                boolean r0 = r5.f2031
                if (r0 == 0) goto L42
                r0 = 76
                if (r6 < r0) goto L42
                java.io.OutputStream r6 = r5.out
                r0 = 10
                r6.write(r0)
                r5.f2030 = r1
            L42:
                r5.f2027 = r1
                goto L71
            L45:
                byte[] r0 = r5.f2035
                r2 = r6 & 127(0x7f, float:1.78E-43)
                r0 = r0[r2]
                r2 = -5
                if (r0 <= r2) goto L6f
                byte[] r0 = r5.f2028
                int r2 = r5.f2027
                int r3 = r2 + 1
                r5.f2027 = r3
                byte r6 = (byte) r6
                r0[r2] = r6
                int r6 = r5.f2029
                if (r3 < r6) goto L71
                byte[] r6 = r5.f2032
                int r2 = r5.f2034
                int r6 = Yue.C0726.m4519(r0, r1, r6, r1, r2)
                java.io.OutputStream r0 = r5.out
                byte[] r2 = r5.f2032
                r0.write(r2, r1, r6)
                r5.f2027 = r1
                goto L71
            L6f:
                if (r0 != r2) goto L72
            L71:
                return
            L72:
                java.io.IOException r6 = new java.io.IOException
                java.lang.String r0 = "Invalid character in Base64 data."
                r6.<init>(r0)
                throw r6
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] r3, int r4, int r5) throws java.io.IOException {
                r2 = this;
                boolean r0 = r2.f2033
                if (r0 == 0) goto La
                java.io.OutputStream r0 = r2.out
                r0.write(r3, r4, r5)
                return
            La:
                r0 = 0
            Lb:
                if (r0 >= r5) goto L17
                int r1 = r4 + r0
                r1 = r3[r1]
                r2.write(r1)
                int r0 = r0 + 1
                goto Lb
            L17:
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m4528() throws java.io.IOException {
                r5 = this;
                int r0 = r5.f2027
                if (r0 <= 0) goto L23
                boolean r1 = r5.f2026
                if (r1 == 0) goto L1b
                java.io.OutputStream r1 = r5.out
                byte[] r2 = r5.f2032
                byte[] r3 = r5.f2028
                int r4 = r5.f2034
                byte[] r0 = Yue.C0726.m4518(r2, r3, r0, r4)
                r1.write(r0)
                r0 = 0
                r5.f2027 = r0
                goto L23
            L1b:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Base64 input not properly padded."
                r0.<init>(r1)
                throw r0
            L23:
                return
        }
    }

    static {
            r0 = 64
            byte[] r0 = new byte[r0]
            r0 = {x0038: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47} // fill-array
            Yue.C0726.f2019 = r0
            r0 = 256(0x100, float:3.59E-43)
            byte[] r0 = new byte[r0]
            r0 = {x005c: FILL_ARRAY_DATA , data: [-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9} // fill-array
            Yue.C0726.f2020 = r0
            r0 = 64
            byte[] r0 = new byte[r0]
            r0 = {x00e0: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95} // fill-array
            Yue.C0726.f2021 = r0
            r0 = 256(0x100, float:3.59E-43)
            byte[] r0 = new byte[r0]
            r0 = {x0104: FILL_ARRAY_DATA , data: [-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9} // fill-array
            Yue.C0726.f2022 = r0
            r0 = 64
            byte[] r0 = new byte[r0]
            r0 = {x0188: FILL_ARRAY_DATA , data: [45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122} // fill-array
            Yue.C0726.f2023 = r0
            r0 = 257(0x101, float:3.6E-43)
            byte[] r0 = new byte[r0]
            r0 = {x01ac: FILL_ARRAY_DATA , data: [-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9} // fill-array
            Yue.C0726.f2024 = r0
            return
    }

    public C0726() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ byte[] m4517(int r0) {
            byte[] r0 = m4527(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ byte[] m4518(byte[] r0, byte[] r1, int r2, int r3) {
            byte[] r0 = m4522(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ int m4519(byte[] r0, int r1, byte[] r2, int r3, int r4) {
            int r0 = m4520(r0, r1, r2, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m4520(byte[] r5, int r6, byte[] r7, int r8, int r9) {
            if (r5 == 0) goto Lc9
            if (r7 == 0) goto Lc1
            if (r6 < 0) goto La8
            int r0 = r6 + 3
            int r1 = r5.length
            if (r0 >= r1) goto La8
            if (r8 < 0) goto L8f
            int r1 = r8 + 2
            int r2 = r7.length
            if (r1 >= r2) goto L8f
            byte[] r9 = m4527(r9)
            int r2 = r6 + 2
            r2 = r5[r2]
            r3 = 61
            r4 = 1
            if (r2 != r3) goto L37
            r0 = r5[r6]
            r0 = r9[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 18
            int r6 = r6 + r4
            r5 = r5[r6]
            r5 = r9[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 12
            r5 = r5 | r0
            int r5 = r5 >>> 16
            byte r5 = (byte) r5
            r7[r8] = r5
            return r4
        L37:
            r0 = r5[r0]
            if (r0 != r3) goto L61
            r0 = r5[r6]
            r0 = r9[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 18
            int r6 = r6 + r4
            r5 = r5[r6]
            r5 = r9[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 12
            r5 = r5 | r0
            r6 = r9[r2]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 6
            r5 = r5 | r6
            int r6 = r5 >>> 16
            byte r6 = (byte) r6
            r7[r8] = r6
            int r8 = r8 + r4
            int r5 = r5 >>> 8
            byte r5 = (byte) r5
            r7[r8] = r5
            r5 = 2
            return r5
        L61:
            r3 = r5[r6]
            r3 = r9[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 18
            int r6 = r6 + r4
            r5 = r5[r6]
            r5 = r9[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 12
            r5 = r5 | r3
            r6 = r9[r2]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 6
            r5 = r5 | r6
            r6 = r9[r0]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 | r6
            int r6 = r5 >> 16
            byte r6 = (byte) r6
            r7[r8] = r6
            int r8 = r8 + r4
            int r6 = r5 >> 8
            byte r6 = (byte) r6
            r7[r8] = r6
            byte r5 = (byte) r5
            r7[r1] = r5
            r5 = 3
            return r5
        L8f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            int r6 = r7.length
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}
            java.lang.String r7 = "Destination array with length %d cannot have offset of %d and still store three bytes."
            java.lang.String r6 = java.lang.String.format(r7, r6)
            r5.<init>(r6)
            throw r5
        La8:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            int r5 = r5.length
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6}
            java.lang.String r6 = "Source array with length %d cannot have offset of %d and still process four bytes."
            java.lang.String r5 = java.lang.String.format(r6, r5)
            r7.<init>(r5)
            throw r7
        Lc1:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Destination array was null."
            r5.<init>(r6)
            throw r5
        Lc9:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Source array was null."
            r5.<init>(r6)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static byte[] m4521(byte[] r4, int r5, int r6, byte[] r7, int r8, int r9) {
            byte[] r9 = m4526(r9)
            r0 = 0
            if (r6 <= 0) goto Le
            r1 = r4[r5]
            int r1 = r1 << 24
            int r1 = r1 >>> 8
            goto Lf
        Le:
            r1 = r0
        Lf:
            r2 = 1
            if (r6 <= r2) goto L1b
            int r3 = r5 + 1
            r3 = r4[r3]
            int r3 = r3 << 24
            int r3 = r3 >>> 16
            goto L1c
        L1b:
            r3 = r0
        L1c:
            r1 = r1 | r3
            r3 = 2
            if (r6 <= r3) goto L27
            int r5 = r5 + r3
            r4 = r4[r5]
            int r4 = r4 << 24
            int r0 = r4 >>> 24
        L27:
            r4 = r1 | r0
            r5 = 61
            r0 = 3
            if (r6 == r2) goto L73
            if (r6 == r3) goto L55
            if (r6 == r0) goto L33
            return r7
        L33:
            int r5 = r4 >>> 18
            r5 = r9[r5]
            r7[r8] = r5
            int r5 = r8 + 1
            int r6 = r4 >>> 12
            r6 = r6 & 63
            r6 = r9[r6]
            r7[r5] = r6
            int r5 = r8 + 2
            int r6 = r4 >>> 6
            r6 = r6 & 63
            r6 = r9[r6]
            r7[r5] = r6
            int r8 = r8 + r0
            r4 = r4 & 63
            r4 = r9[r4]
            r7[r8] = r4
            return r7
        L55:
            int r6 = r4 >>> 18
            r6 = r9[r6]
            r7[r8] = r6
            int r6 = r8 + 1
            int r1 = r4 >>> 12
            r1 = r1 & 63
            r1 = r9[r1]
            r7[r6] = r1
            int r6 = r8 + 2
            int r4 = r4 >>> 6
            r4 = r4 & 63
            r4 = r9[r4]
            r7[r6] = r4
            int r8 = r8 + r0
            r7[r8] = r5
            return r7
        L73:
            int r6 = r4 >>> 18
            r6 = r9[r6]
            r7[r8] = r6
            int r6 = r8 + 1
            int r4 = r4 >>> 12
            r4 = r4 & 63
            r4 = r9[r4]
            r7[r6] = r4
            int r4 = r8 + 2
            r7[r4] = r5
            int r8 = r8 + r0
            r7[r8] = r5
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static byte[] m4522(byte[] r6, byte[] r7, int r8, int r9) {
            r1 = 0
            r4 = 0
            r0 = r7
            r2 = r8
            r3 = r6
            r5 = r9
            m4521(r0, r1, r2, r3, r4, r5)
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static java.lang.String m4523(byte[] r2) {
            int r0 = r2.length     // Catch: java.io.IOException -> L7
            r1 = 0
            java.lang.String r2 = m4524(r2, r1, r0, r1)     // Catch: java.io.IOException -> L7
            goto L8
        L7:
            r2 = 0
        L8:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static java.lang.String m4524(byte[] r0, int r1, int r2, int r3) throws java.io.IOException {
            byte[] r0 = m4525(r0, r1, r2, r3)
            java.lang.String r1 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> Lc
            java.lang.String r2 = "US-ASCII"
            r1.<init>(r0, r2)     // Catch: java.io.UnsupportedEncodingException -> Lc
            return r1
        Lc:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static byte[] m4525(byte[] r18, int r19, int r20, int r21) throws java.io.IOException {
            r0 = r18
            r7 = r19
            r8 = r20
            if (r0 == 0) goto L120
            if (r7 < 0) goto L109
            if (r8 < 0) goto Lf2
            int r1 = r7 + r8
            int r2 = r0.length
            if (r1 > r2) goto Ld5
            r1 = r21 & 2
            r9 = 1
            if (r1 == 0) goto L69
            r1 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L52
            r2.<init>()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L52
            Yue.ۥ۟ۢۥ۟$ۥ r3 = new Yue.ۥ۟ۢۥ۟$ۥ     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            r4 = r21 | 1
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L44
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L44
            r4.write(r0, r7, r8)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3f
            r4.close()     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3f
            r4.close()     // Catch: java.lang.Exception -> L31
        L31:
            r3.close()     // Catch: java.lang.Exception -> L34
        L34:
            r2.close()     // Catch: java.lang.Exception -> L37
        L37:
            byte[] r0 = r2.toByteArray()
            return r0
        L3c:
            r0 = move-exception
        L3d:
            r1 = r4
            goto L59
        L3f:
            r0 = move-exception
        L40:
            r1 = r2
            goto L55
        L42:
            r0 = move-exception
            goto L59
        L44:
            r0 = move-exception
            r4 = r1
            goto L40
        L47:
            r0 = move-exception
            r3 = r1
            goto L59
        L4a:
            r0 = move-exception
            r3 = r1
            r4 = r3
            goto L40
        L4e:
            r0 = move-exception
            r2 = r1
            r3 = r2
            goto L59
        L52:
            r0 = move-exception
            r3 = r1
            r4 = r3
        L55:
            throw r0     // Catch: java.lang.Throwable -> L56
        L56:
            r0 = move-exception
            r2 = r1
            goto L3d
        L59:
            if (r1 == 0) goto L5e
            r1.close()     // Catch: java.lang.Exception -> L5e
        L5e:
            if (r3 == 0) goto L63
            r3.close()     // Catch: java.lang.Exception -> L63
        L63:
            if (r2 == 0) goto L68
            r2.close()     // Catch: java.lang.Exception -> L68
        L68:
            throw r0
        L69:
            r1 = r21 & 8
            if (r1 == 0) goto L6f
            r11 = r9
            goto L70
        L6f:
            r11 = 0
        L70:
            int r1 = r8 / 3
            r12 = 4
            int r1 = r1 * r12
            int r2 = r8 % 3
            if (r2 <= 0) goto L7a
            r2 = r12
            goto L7b
        L7a:
            r2 = 0
        L7b:
            int r1 = r1 + r2
            if (r11 == 0) goto L81
            int r2 = r1 / 76
            int r1 = r1 + r2
        L81:
            r13 = r1
            byte[] r14 = new byte[r13]
            int r15 = r8 + (-2)
            r6 = 0
            r16 = 0
            r17 = 0
        L8b:
            if (r6 >= r15) goto Lb5
            int r2 = r6 + r7
            r3 = 3
            r1 = r18
            r4 = r14
            r5 = r16
            r10 = r6
            r6 = r21
            m4521(r1, r2, r3, r4, r5, r6)
            int r1 = r17 + 4
            if (r11 == 0) goto Lae
            r2 = 76
            if (r1 < r2) goto Lae
            int r1 = r16 + 4
            r2 = 10
            r14[r1] = r2
            int r16 = r16 + 1
            r17 = 0
            goto Lb0
        Lae:
            r17 = r1
        Lb0:
            int r6 = r10 + 3
            int r16 = r16 + 4
            goto L8b
        Lb5:
            r10 = r6
            if (r10 >= r8) goto Lc8
            int r2 = r10 + r7
            int r3 = r8 - r10
            r1 = r18
            r4 = r14
            r5 = r16
            r6 = r21
            m4521(r1, r2, r3, r4, r5, r6)
            int r16 = r16 + 4
        Lc8:
            r0 = r16
            int r13 = r13 - r9
            if (r0 > r13) goto Ld4
            byte[] r1 = new byte[r0]
            r2 = 0
            java.lang.System.arraycopy(r14, r2, r1, r2, r0)
            return r1
        Ld4:
            return r14
        Ld5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r3, r0}
            java.lang.String r2 = "Cannot have offset of %d and length of %d with array of length %d"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            r1.<init>(r0)
            throw r1
        Lf2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot have length offset: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L109:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot have negative offset: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L120:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot serialize a null array."
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final byte[] m4526(int r2) {
            r0 = r2 & 16
            r1 = 16
            if (r0 != r1) goto L9
            byte[] r2 = Yue.C0726.f2021
            return r2
        L9:
            r0 = 32
            r2 = r2 & r0
            if (r2 != r0) goto L11
            byte[] r2 = Yue.C0726.f2023
            return r2
        L11:
            byte[] r2 = Yue.C0726.f2019
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final byte[] m4527(int r2) {
            r0 = r2 & 16
            r1 = 16
            if (r0 != r1) goto L9
            byte[] r2 = Yue.C0726.f2022
            return r2
        L9:
            r0 = 32
            r2 = r2 & r0
            if (r2 != r0) goto L11
            byte[] r2 = Yue.C0726.f2024
            return r2
        L11:
            byte[] r2 = Yue.C0726.f2020
            return r2
    }
}
