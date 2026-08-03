package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦۣ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7166 extends java.io.Reader {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f24744 = 512;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final java.util.Hashtable f24745 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public java.io.Reader f24746;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public java.lang.String f24747;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f24748;

    /* JADX INFO: renamed from: Yue.ۥۢۦۣ۟$ۥ, reason: contains not printable characters */
    public static final class C7167 extends Yue.C7166.AbstractC7168 {
        public C7167(java.io.InputStream r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.io.Reader
        public int read(char[] r6, int r7, int r8) throws java.io.IOException {
                r5 = this;
                java.io.InputStream r0 = r5.f24749
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                int r2 = r7 + r8
                int r3 = r6.length
                if (r2 > r3) goto L62
                if (r7 < 0) goto L62
                int r2 = r5.f24752
                int r3 = r5.f24751
                int r2 = r2 - r3
                r3 = 0
                r4 = 1
                if (r2 >= r4) goto L2b
                r5.f24751 = r3
                byte[] r2 = r5.f24750
                int r4 = r2.length
                int r0 = r0.read(r2, r3, r4)
                r5.f24752 = r0
                if (r0 > 0) goto L27
                r5.close()
                return r1
            L27:
                if (r8 <= r0) goto L2e
                r8 = r0
                goto L2e
            L2b:
                if (r8 <= r2) goto L2e
                r8 = r2
            L2e:
                if (r3 >= r8) goto L61
                byte[] r0 = r5.f24750
                int r1 = r5.f24751
                int r2 = r1 + 1
                r5.f24751 = r2
                r0 = r0[r1]
                if (r0 < 0) goto L44
                int r1 = r7 + r3
                char r0 = (char) r0
                r6[r1] = r0
                int r3 = r3 + 1
                goto L2e
            L44:
                java.io.CharConversionException r6 = new java.io.CharConversionException
                java.lang.StringBuffer r7 = new java.lang.StringBuffer
                r7.<init>()
                java.lang.String r8 = "Illegal ASCII character, 0x"
                r7.append(r8)
                r8 = r0 & 255(0xff, float:3.57E-43)
                java.lang.String r8 = java.lang.Integer.toHexString(r8)
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
            L61:
                return r8
            L62:
                java.lang.ArrayIndexOutOfBoundsException r6 = new java.lang.ArrayIndexOutOfBoundsException
                r6.<init>()
                throw r6
        }

        @Override // Yue.C7166.AbstractC7168
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public java.lang.String mo27621() {
                r1 = this;
                java.lang.String r0 = "US-ASCII"
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۦۣ۟$ۥ۟, reason: contains not printable characters */
    public static abstract class AbstractC7168 extends java.io.Reader {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public java.io.InputStream f24749;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public byte[] f24750;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f24751;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f24752;

        public AbstractC7168(java.io.InputStream r1) {
                r0 = this;
                r0.<init>(r1)
                r0.f24749 = r1
                r1 = 8192(0x2000, float:1.148E-41)
                byte[] r1 = new byte[r1]
                r0.f24750 = r1
                return
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r1 = this;
                java.io.InputStream r0 = r1.f24749
                if (r0 == 0) goto L11
                r0.close()
                r0 = 0
                r1.f24752 = r0
                r1.f24751 = r0
                r0 = 0
                r1.f24750 = r0
                r1.f24749 = r0
            L11:
                return
        }

        @Override // java.io.Reader
        public boolean ready() throws java.io.IOException {
                r3 = this;
                java.io.InputStream r0 = r3.f24749
                if (r0 == 0) goto L14
                int r1 = r3.f24752
                int r2 = r3.f24751
                int r1 = r1 - r2
                if (r1 > 0) goto L14
                int r0 = r0.available()
                if (r0 == 0) goto L12
                goto L14
            L12:
                r0 = 0
                goto L15
            L14:
                r0 = 1
            L15:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public abstract java.lang.String mo27621();
    }

    /* JADX INFO: renamed from: Yue.ۥۢۦۣ۟$ۥ۟۟, reason: contains not printable characters */
    public static final class C7169 extends Yue.C7166.AbstractC7168 {
        public C7169(java.io.InputStream r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.io.Reader
        public int read(char[] r6, int r7, int r8) throws java.io.IOException {
                r5 = this;
                java.io.InputStream r0 = r5.f24749
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                int r2 = r7 + r8
                int r3 = r6.length
                if (r2 > r3) goto L45
                if (r7 < 0) goto L45
                int r2 = r5.f24752
                int r3 = r5.f24751
                int r2 = r2 - r3
                r3 = 0
                r4 = 1
                if (r2 >= r4) goto L2b
                r5.f24751 = r3
                byte[] r2 = r5.f24750
                int r4 = r2.length
                int r0 = r0.read(r2, r3, r4)
                r5.f24752 = r0
                if (r0 > 0) goto L27
                r5.close()
                return r1
            L27:
                if (r8 <= r0) goto L2e
                r8 = r0
                goto L2e
            L2b:
                if (r8 <= r2) goto L2e
                r8 = r2
            L2e:
                if (r3 >= r8) goto L44
                int r0 = r7 + r3
                byte[] r1 = r5.f24750
                int r2 = r5.f24751
                int r4 = r2 + 1
                r5.f24751 = r4
                r1 = r1[r2]
                r1 = r1 & 255(0xff, float:3.57E-43)
                char r1 = (char) r1
                r6[r0] = r1
                int r3 = r3 + 1
                goto L2e
            L44:
                return r8
            L45:
                java.lang.ArrayIndexOutOfBoundsException r6 = new java.lang.ArrayIndexOutOfBoundsException
                r6.<init>()
                throw r6
        }

        @Override // Yue.C7166.AbstractC7168
        /* JADX INFO: renamed from: ۥ۟ */
        public java.lang.String mo27621() {
                r1 = this;
                java.lang.String r0 = "ISO-8859-1"
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۦۣ۟$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C7170 extends Yue.C7166.AbstractC7168 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public char f24753;

        public C7170(java.io.InputStream r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.io.Reader
        public int read(char[] r10, int r11, int r12) throws java.io.IOException {
                r9 = this;
                r0 = 0
                if (r12 > 0) goto L4
                return r0
            L4:
                int r1 = r11 + r12
                int r2 = r10.length
                if (r1 > r2) goto L180
                if (r11 < 0) goto L180
                char r1 = r9.f24753
                r2 = 1
                if (r1 == 0) goto L17
                r10[r11] = r1
                r9.f24753 = r0
                r3 = r0
                r1 = r2
                goto L19
            L17:
                r1 = r0
                r3 = r1
            L19:
                r4 = -1
                if (r1 >= r12) goto L179
                int r3 = r9.f24752
                int r5 = r9.f24751
                if (r3 > r5) goto L3a
                java.io.InputStream r3 = r9.f24749
                if (r3 != 0) goto L29
            L26:
                r3 = r4
                goto L179
            L29:
                r9.f24751 = r0
                byte[] r5 = r9.f24750
                int r6 = r5.length
                int r3 = r3.read(r5, r0, r6)
                r9.f24752 = r3
                if (r3 > 0) goto L3a
                r9.close()
                goto L26
            L3a:
                byte[] r3 = r9.f24750
                int r4 = r9.f24751
                r5 = r3[r4]
                r6 = r5 & 255(0xff, float:3.57E-43)
                r7 = r5 & 128(0x80, float:1.8E-43)
                if (r7 != 0) goto L53
                int r4 = r4 + 1
                r9.f24751 = r4
                int r3 = r1 + 1
                int r1 = r1 + r11
                char r4 = (char) r6
                r10[r1] = r4
                r1 = r3
                r3 = r6
                goto L19
            L53:
                r6 = r5 & 224(0xe0, float:3.14E-43)
                r7 = 192(0xc0, float:2.69E-43)
                if (r6 != r7) goto L67
                int r6 = r4 + 1
                r5 = r5 & 31
                int r5 = r5 << 6
                int r4 = r4 + 2
                r3 = r3[r6]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
            L63:
                r3 = r3 & 63
                int r5 = r5 + r3
                goto Lc5
            L67:
                r6 = r5 & 240(0xf0, float:3.36E-43)
                r8 = 224(0xe0, float:3.14E-43)
                if (r6 != r8) goto L84
                int r6 = r4 + 1
                r5 = r5 & 15
                int r5 = r5 << 12
                int r8 = r4 + 2
                r6 = r3[r6]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L81
                r6 = r6 & 63
                int r6 = r6 << 6
                int r5 = r5 + r6
                int r4 = r4 + 3
                r3 = r3[r8]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
                goto L63
            L81:
                r4 = r8
                goto L10c
            L84:
                r6 = r5 & 248(0xf8, float:3.48E-43)
                r8 = 240(0xf0, float:3.36E-43)
                if (r6 != r8) goto Le9
                int r6 = r4 + 1
                r5 = r5 & 7
                int r5 = r5 << 18
                int r8 = r4 + 2
                r6 = r3[r6]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L81
                r6 = r6 & 63
                int r6 = r6 << 12
                int r5 = r5 + r6
                int r6 = r4 + 3
                r8 = r3[r8]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Le7
                r8 = r8 & 63
                int r8 = r8 << 6
                int r5 = r5 + r8
                int r4 = r4 + 4
                r3 = r3[r6]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
                r3 = r3 & 63
                int r5 = r5 + r3
                r3 = 1114111(0x10ffff, float:1.561202E-39)
                if (r5 > r3) goto Lc7
                r3 = 65535(0xffff, float:9.1834E-41)
                if (r5 <= r3) goto Lc5
                r3 = 65536(0x10000, float:9.1835E-41)
                int r5 = r5 - r3
                r3 = r5 & 1023(0x3ff, float:1.434E-42)
                r6 = 56320(0xdc00, float:7.8921E-41)
                int r3 = r3 + r6
                char r3 = (char) r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
                r9.f24753 = r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
                int r3 = r5 >> 10
                r5 = 55296(0xd800, float:7.7486E-41)
                int r5 = r5 + r3
            Lc5:
                r3 = r5
                goto L10d
            Lc7:
                java.io.CharConversionException r3 = new java.io.CharConversionException     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
                java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
                r6.<init>()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
                java.lang.String r8 = "UTF-8 encoding of character 0x00"
                r6.append(r8)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
                java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
                r6.append(r5)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
                java.lang.String r5 = " can't be converted to Unicode."
                r6.append(r5)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
                java.lang.String r5 = r6.toString()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
                r3.<init>(r5)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
                throw r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
            Le7:
                r4 = r6
                goto L10c
            Le9:
                java.io.CharConversionException r3 = new java.io.CharConversionException     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
                java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
                r5.<init>()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
                java.lang.String r6 = "Unconvertible UTF-8 character beginning with 0x"
                r5.append(r6)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
                byte[] r6 = r9.f24750     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
                int r8 = r9.f24751     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
                r6 = r6[r8]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
                r6 = r6 & 255(0xff, float:3.57E-43)
                java.lang.String r6 = java.lang.Integer.toHexString(r6)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
                r5.append(r6)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
                java.lang.String r5 = r5.toString()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
                r3.<init>(r5)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
                throw r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10c
            L10c:
                r3 = r0
            L10d:
                int r5 = r9.f24752
                if (r4 <= r5) goto L140
                byte[] r4 = r9.f24750
                int r6 = r9.f24751
                int r5 = r5 - r6
                java.lang.System.arraycopy(r4, r6, r4, r0, r5)
                int r4 = r9.f24752
                int r5 = r9.f24751
                int r4 = r4 - r5
                r9.f24752 = r4
                r9.f24751 = r0
                java.io.InputStream r5 = r9.f24749
                byte[] r6 = r9.f24750
                int r7 = r6.length
                int r7 = r7 - r4
                int r4 = r5.read(r6, r4, r7)
                if (r4 < 0) goto L135
                int r5 = r9.f24752
                int r5 = r5 + r4
                r9.f24752 = r5
                goto L19
            L135:
                r9.close()
                java.io.CharConversionException r10 = new java.io.CharConversionException
                java.lang.String r11 = "Partial UTF-8 char"
                r10.<init>(r11)
                throw r10
            L140:
                int r5 = r9.f24751
                int r5 = r5 + r2
            L143:
                r9.f24751 = r5
                int r5 = r9.f24751
                if (r5 >= r4) goto L160
                byte[] r6 = r9.f24750
                r6 = r6[r5]
                r6 = r6 & r7
                r8 = 128(0x80, float:1.8E-43)
                if (r6 != r8) goto L155
                int r5 = r5 + 1
                goto L143
            L155:
                r9.close()
                java.io.CharConversionException r10 = new java.io.CharConversionException
                java.lang.String r11 = "Malformed UTF-8 char -- is an XML encoding declaration missing?"
                r10.<init>(r11)
                throw r10
            L160:
                int r4 = r1 + 1
                int r5 = r11 + r1
                char r6 = (char) r3
                r10[r5] = r6
                char r5 = r9.f24753
                if (r5 == 0) goto L176
                if (r4 >= r12) goto L176
                int r1 = r1 + 2
                int r4 = r4 + r11
                r10[r4] = r5
                r9.f24753 = r0
                goto L19
            L176:
                r1 = r4
                goto L19
            L179:
                if (r1 <= 0) goto L17c
                return r1
            L17c:
                if (r3 != r4) goto L17f
                r0 = r4
            L17f:
                return r0
            L180:
                java.lang.ArrayIndexOutOfBoundsException r10 = new java.lang.ArrayIndexOutOfBoundsException
                r10.<init>()
                throw r10
        }

        @Override // Yue.C7166.AbstractC7168
        /* JADX INFO: renamed from: ۥ۟ */
        public java.lang.String mo27621() {
                r1 = this;
                java.lang.String r0 = "UTF-8"
                return r0
        }
    }

    static {
            java.util.Hashtable r0 = new java.util.Hashtable
            r1 = 31
            r0.<init>(r1)
            Yue.C7166.f24745 = r0
            java.lang.String r1 = "UTF-16"
            java.lang.String r2 = "Unicode"
            r0.put(r1, r2)
            java.lang.String r1 = "ISO-10646-UCS-2"
            r0.put(r1, r2)
            java.lang.String r1 = "EBCDIC-CP-US"
            java.lang.String r2 = "cp037"
            r0.put(r1, r2)
            java.lang.String r1 = "EBCDIC-CP-CA"
            r0.put(r1, r2)
            java.lang.String r1 = "EBCDIC-CP-NL"
            r0.put(r1, r2)
            java.lang.String r1 = "EBCDIC-CP-WT"
            r0.put(r1, r2)
            java.lang.String r1 = "EBCDIC-CP-DK"
            java.lang.String r2 = "cp277"
            r0.put(r1, r2)
            java.lang.String r1 = "EBCDIC-CP-NO"
            r0.put(r1, r2)
            java.lang.String r1 = "EBCDIC-CP-FI"
            java.lang.String r2 = "cp278"
            r0.put(r1, r2)
            java.lang.String r1 = "EBCDIC-CP-SE"
            r0.put(r1, r2)
            java.lang.String r1 = "EBCDIC-CP-IT"
            java.lang.String r2 = "cp280"
            r0.put(r1, r2)
            java.lang.String r1 = "EBCDIC-CP-ES"
            java.lang.String r2 = "cp284"
            r0.put(r1, r2)
            java.lang.String r1 = "EBCDIC-CP-GB"
            java.lang.String r2 = "cp285"
            r0.put(r1, r2)
            java.lang.String r1 = "EBCDIC-CP-FR"
            java.lang.String r2 = "cp297"
            r0.put(r1, r2)
            java.lang.String r1 = "EBCDIC-CP-AR1"
            java.lang.String r2 = "cp420"
            r0.put(r1, r2)
            java.lang.String r1 = "EBCDIC-CP-HE"
            java.lang.String r2 = "cp424"
            r0.put(r1, r2)
            java.lang.String r1 = "EBCDIC-CP-BE"
            java.lang.String r2 = "cp500"
            r0.put(r1, r2)
            java.lang.String r1 = "EBCDIC-CP-CH"
            r0.put(r1, r2)
            java.lang.String r1 = "EBCDIC-CP-ROECE"
            java.lang.String r2 = "cp870"
            r0.put(r1, r2)
            java.lang.String r1 = "EBCDIC-CP-YU"
            r0.put(r1, r2)
            java.lang.String r1 = "EBCDIC-CP-IS"
            java.lang.String r2 = "cp871"
            r0.put(r1, r2)
            java.lang.String r1 = "EBCDIC-CP-AR2"
            java.lang.String r2 = "cp918"
            r0.put(r1, r2)
            return
    }

    public C7166(java.io.InputStream r9) throws java.io.IOException {
            r8 = this;
            r8.<init>(r9)
            java.io.PushbackInputStream r0 = new java.io.PushbackInputStream
            r1 = 512(0x200, float:7.17E-43)
            r0.<init>(r9, r1)
            r9 = 4
            byte[] r1 = new byte[r9]
            int r2 = r0.read(r1)
            r3 = 0
            if (r2 <= 0) goto L17
            r0.unread(r1, r3, r2)
        L17:
            if (r2 != r9) goto La0
            r9 = r1[r3]
            r2 = 255(0xff, float:3.57E-43)
            r9 = r9 & r2
            r3 = 60
            r4 = 63
            r5 = 3
            r6 = 2
            r7 = 1
            if (r9 == 0) goto L8e
            if (r9 == r3) goto L65
            r3 = 76
            if (r9 == r3) goto L4b
            java.lang.String r3 = "UTF-16"
            r4 = 254(0xfe, float:3.56E-43)
            if (r9 == r4) goto L41
            if (r9 == r2) goto L37
            goto La0
        L37:
            r9 = r1[r7]
            r9 = r9 & r2
            if (r9 == r4) goto L3d
            goto La0
        L3d:
            r8.m27619(r0, r3)
            return
        L41:
            r9 = r1[r7]
            r9 = r9 & r2
            if (r9 == r2) goto L47
            goto La0
        L47:
            r8.m27619(r0, r3)
            return
        L4b:
            r9 = r1[r7]
            r3 = 111(0x6f, float:1.56E-43)
            if (r9 != r3) goto La0
            r9 = r1[r6]
            r9 = r9 & r2
            r3 = 167(0xa7, float:2.34E-43)
            if (r9 != r3) goto La0
            r9 = r1[r5]
            r9 = r9 & r2
            r1 = 148(0x94, float:2.07E-43)
            if (r9 != r1) goto La0
            java.lang.String r9 = "CP037"
            r8.m27620(r0, r9)
            return
        L65:
            r9 = r1[r7]
            r9 = r9 & r2
            if (r9 == 0) goto L80
            if (r9 == r4) goto L6d
            goto La0
        L6d:
            r9 = r1[r6]
            r2 = 120(0x78, float:1.68E-43)
            if (r9 != r2) goto La0
            r9 = r1[r5]
            r1 = 109(0x6d, float:1.53E-43)
            if (r9 == r1) goto L7a
            goto La0
        L7a:
            java.lang.String r9 = "UTF8"
            r8.m27620(r0, r9)
            return
        L80:
            r9 = r1[r6]
            if (r9 != r4) goto La0
            r9 = r1[r5]
            if (r9 != 0) goto La0
            java.lang.String r9 = "UnicodeLittle"
            r8.m27619(r0, r9)
            return
        L8e:
            r9 = r1[r7]
            if (r9 != r3) goto La0
            r9 = r1[r6]
            if (r9 != 0) goto La0
            r9 = r1[r5]
            if (r9 != r4) goto La0
            java.lang.String r9 = "UnicodeBig"
            r8.m27619(r0, r9)
            return
        La0:
            java.lang.String r9 = "UTF-8"
            r8.m27619(r0, r9)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.io.Reader m27615(java.io.InputStream r1) throws java.io.IOException {
            Yue.ۥۢۦۣ۟ r0 = new Yue.ۥۢۦۣ۟
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.io.Reader m27616(java.io.InputStream r1, java.lang.String r2) throws java.io.IOException {
            if (r2 != 0) goto L8
            Yue.ۥۢۦۣ۟ r2 = new Yue.ۥۢۦۣ۟
            r2.<init>(r1)
            return r2
        L8:
            java.lang.String r0 = "UTF-8"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L48
            java.lang.String r0 = "UTF8"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L19
            goto L48
        L19:
            java.lang.String r0 = "US-ASCII"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L42
            java.lang.String r0 = "ASCII"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L2a
            goto L42
        L2a:
            java.lang.String r0 = "ISO-8859-1"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L38
            Yue.ۥۢۦۣ۟$ۥ۟۟ r2 = new Yue.ۥۢۦۣ۟$ۥ۟۟
            r2.<init>(r1)
            return r2
        L38:
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.lang.String r2 = m27617(r2)
            r0.<init>(r1, r2)
            return r0
        L42:
            Yue.ۥۢۦۣ۟$ۥ r2 = new Yue.ۥۢۦۣ۟$ۥ
            r2.<init>(r1)
            return r2
        L48:
            Yue.ۥۢۦۣ۟$ۥ۟۟۟ r2 = new Yue.ۥۢۦۣ۟$ۥ۟۟۟
            r2.<init>(r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static java.lang.String m27617(java.lang.String r2) {
            java.lang.String r0 = r2.toUpperCase()
            java.util.Hashtable r1 = Yue.C7166.f24745
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lf
            r2 = r0
        Lf:
            return r2
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.f24748
            if (r0 == 0) goto L5
            return
        L5:
            java.io.Reader r0 = r1.f24746
            r0.close()
            r0 = 0
            r1.f24746 = r0
            r0 = 1
            r1.f24748 = r0
            return
    }

    @Override // java.io.Reader
    public void mark(int r2) throws java.io.IOException {
            r1 = this;
            java.io.Reader r0 = r1.f24746
            if (r0 == 0) goto L7
            r0.mark(r2)
        L7:
            return
    }

    @Override // java.io.Reader
    public boolean markSupported() {
            r1 = this;
            java.io.Reader r0 = r1.f24746
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            boolean r0 = r0.markSupported()
        La:
            return r0
    }

    @Override // java.io.Reader
    public int read() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.f24748
            if (r0 != 0) goto L11
            java.io.Reader r0 = r2.f24746
            int r0 = r0.read()
            r1 = -1
            if (r0 != r1) goto L10
            r2.close()
        L10:
            return r0
        L11:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Stream closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.Reader
    public int read(char[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.f24748
            r1 = -1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.io.Reader r0 = r2.f24746
            int r3 = r0.read(r3, r4, r5)
            if (r3 != r1) goto L11
            r2.close()
        L11:
            return r3
    }

    @Override // java.io.Reader
    public boolean ready() throws java.io.IOException {
            r1 = this;
            java.io.Reader r0 = r1.f24746
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            boolean r0 = r0.ready()
        La:
            return r0
    }

    @Override // java.io.Reader
    public void reset() throws java.io.IOException {
            r1 = this;
            java.io.Reader r0 = r1.f24746
            if (r0 == 0) goto L7
            r0.reset()
        L7:
            return
    }

    @Override // java.io.Reader
    public long skip(long r2) throws java.io.IOException {
            r1 = this;
            java.io.Reader r0 = r1.f24746
            if (r0 != 0) goto L7
            r2 = 0
            goto Lb
        L7:
            long r2 = r0.skip(r2)
        Lb:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.lang.String m27618() {
            r1 = this;
            java.lang.String r0 = r1.f24747
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m27619(java.io.InputStream r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            r0.f24747 = r2
            java.io.Reader r1 = m27616(r1, r2)
            r0.f24746 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m27620(java.io.PushbackInputStream r18, java.lang.String r19) throws java.io.IOException {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 512(0x200, float:7.17E-43)
            byte[] r3 = new byte[r2]
            r4 = 0
            int r2 = r1.read(r3, r4, r2)
            r1.unread(r3, r4, r2)
            java.io.InputStreamReader r5 = new java.io.InputStreamReader
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            r7 = 4
            r6.<init>(r3, r7, r2)
            r2 = r19
            r5.<init>(r6, r2)
            int r2 = r5.read()
            r3 = 108(0x6c, float:1.51E-43)
            java.lang.String r6 = "UTF-8"
            if (r2 == r3) goto L2b
            r0.m27619(r1, r6)
            return
        L2b:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r7 = r4
            r8 = r7
            r10 = r8
            r12 = r10
            r9 = 0
            r11 = 0
        L36:
            r13 = 507(0x1fb, float:7.1E-43)
            if (r7 >= r13) goto L113
            int r13 = r5.read()
            r14 = -1
            if (r13 != r14) goto L43
            goto L113
        L43:
            r14 = 32
            if (r13 == r14) goto L10f
            r14 = 9
            if (r13 == r14) goto L10f
            r14 = 10
            if (r13 == r14) goto L10f
            r14 = 13
            if (r13 != r14) goto L55
            goto L10f
        L55:
            if (r7 != 0) goto L59
            goto L113
        L59:
            r14 = 63
            r15 = 1
            if (r13 != r14) goto L60
            r8 = r15
            goto L69
        L60:
            if (r8 == 0) goto L69
            r8 = 62
            if (r13 != r8) goto L68
            goto L113
        L68:
            r8 = r4
        L69:
            if (r9 == 0) goto Ldf
            if (r10 != 0) goto L6f
            goto Ldf
        L6f:
            char r14 = (char) r13
            boolean r15 = java.lang.Character.isWhitespace(r14)
            if (r15 == 0) goto L78
            goto L10f
        L78:
            r15 = 34
            if (r13 == r15) goto L80
            r15 = 39
            if (r13 != r15) goto Ldb
        L80:
            if (r12 != 0) goto L88
            r2.setLength(r4)
            r12 = r14
            goto L10f
        L88:
            if (r13 != r12) goto Ldb
            java.lang.String r13 = "encoding"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto Ld9
            java.lang.String r2 = r2.toString()
            r0.f24747 = r2
        L98:
            java.lang.String r2 = r0.f24747
            int r2 = r2.length()
            if (r4 >= r2) goto Ld3
            java.lang.String r2 = r0.f24747
            char r2 = r2.charAt(r4)
            r3 = 65
            if (r2 < r3) goto Lae
            r3 = 90
            if (r2 <= r3) goto Ld0
        Lae:
            r3 = 97
            if (r2 < r3) goto Lb7
            r3 = 122(0x7a, float:1.71E-43)
            if (r2 > r3) goto Lb7
            goto Ld0
        Lb7:
            if (r4 != 0) goto Lba
            goto L113
        Lba:
            if (r4 <= 0) goto L113
            r3 = 45
            if (r2 == r3) goto Ld0
            r3 = 48
            if (r2 < r3) goto Lc8
            r3 = 57
            if (r2 <= r3) goto Ld0
        Lc8:
            r3 = 46
            if (r2 == r3) goto Ld0
            r3 = 95
            if (r2 != r3) goto L113
        Ld0:
            int r4 = r4 + 1
            goto L98
        Ld3:
            java.lang.String r2 = r0.f24747
            r0.m27619(r1, r2)
            return
        Ld9:
            r9 = 0
            goto L10f
        Ldb:
            r2.append(r14)
            goto L10f
        Ldf:
            if (r11 != 0) goto Lf2
            char r13 = (char) r13
            boolean r14 = java.lang.Character.isWhitespace(r13)
            if (r14 == 0) goto Le9
            goto L10f
        Le9:
            r2.setLength(r4)
            r2.append(r13)
            r11 = r2
            r10 = r4
            goto L10f
        Lf2:
            char r14 = (char) r13
            boolean r16 = java.lang.Character.isWhitespace(r14)
            if (r16 == 0) goto Lfe
            java.lang.String r9 = r11.toString()
            goto L10f
        Lfe:
            r3 = 61
            if (r13 != r3) goto L10c
            if (r9 != 0) goto L108
            java.lang.String r9 = r11.toString()
        L108:
            r12 = r4
            r10 = r15
            r11 = 0
            goto L10f
        L10c:
            r11.append(r14)
        L10f:
            int r7 = r7 + 1
            goto L36
        L113:
            r0.m27619(r1, r6)
            return
    }
}
