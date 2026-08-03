package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1726 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.util.regex.Pattern f5380 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.nio.charset.Charset f5381 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String f5382 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f5383 = 5120;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final char[] f5384 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f5385 = 32;

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۢۦ$ۥ, reason: contains not printable characters */
    public static class C1727 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f5386;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final boolean f5387;

        public C1727(java.lang.String r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.f5386 = r1
                r0.f5387 = r2
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ java.lang.String m8240(Yue.C1726.C1727 r0) {
                java.lang.String r0 = r0.f5386
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m8241(Yue.C1726.C1727 r0) {
                boolean r0 = r0.f5387
                return r0
        }
    }

    static {
            java.lang.String r0 = "(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            Yue.C1726.f5380 = r0
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            Yue.C1726.f5381 = r0
            java.lang.String r0 = r0.name()
            Yue.C1726.f5382 = r0
            java.lang.String r0 = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
            char[] r0 = r0.toCharArray()
            Yue.C1726.f5384 = r0
            return
    }

    public C1726() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m8228(java.io.InputStream r3, java.io.OutputStream r4) throws java.io.IOException {
            r0 = 32768(0x8000, float:4.5918E-41)
            byte[] r0 = new byte[r0]
        L5:
            int r1 = r3.read(r0)
            r2 = -1
            if (r1 == r2) goto L11
            r2 = 0
            r4.write(r0, r2, r1)
            goto L5
        L11:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.C1726.C1727 m8229(java.nio.ByteBuffer r8) {
            r8.mark()
            r0 = 4
            byte[] r1 = new byte[r0]
            int r2 = r8.remaining()
            if (r2 < r0) goto L12
            r8.get(r1)
            r8.rewind()
        L12:
            r8 = 0
            r0 = r1[r8]
            r2 = 3
            r3 = 2
            r4 = -1
            r5 = -2
            r6 = 1
            if (r0 != 0) goto L28
            r7 = r1[r6]
            if (r7 != 0) goto L28
            r7 = r1[r3]
            if (r7 != r5) goto L28
            r7 = r1[r2]
            if (r7 == r4) goto L36
        L28:
            if (r0 != r4) goto L3e
            r7 = r1[r6]
            if (r7 != r5) goto L3e
            r7 = r1[r3]
            if (r7 != 0) goto L3e
            r2 = r1[r2]
            if (r2 != 0) goto L3e
        L36:
            Yue.ۥ۟ۨۢۦ$ۥ r0 = new Yue.ۥ۟ۨۢۦ$ۥ
            java.lang.String r1 = "UTF-32"
            r0.<init>(r1, r8)
            return r0
        L3e:
            if (r0 != r5) goto L44
            r2 = r1[r6]
            if (r2 == r4) goto L4a
        L44:
            if (r0 != r4) goto L52
            r2 = r1[r6]
            if (r2 != r5) goto L52
        L4a:
            Yue.ۥ۟ۨۢۦ$ۥ r0 = new Yue.ۥ۟ۨۢۦ$ۥ
            java.lang.String r1 = "UTF-16"
            r0.<init>(r1, r8)
            return r0
        L52:
            r8 = -17
            if (r0 != r8) goto L6a
            r8 = r1[r6]
            r0 = -69
            if (r8 != r0) goto L6a
            r8 = r1[r3]
            r0 = -65
            if (r8 != r0) goto L6a
            Yue.ۥ۟ۨۢۦ$ۥ r8 = new Yue.ۥ۟ۨۢۦ$ۥ
            java.lang.String r0 = "UTF-8"
            r8.<init>(r0, r6)
            return r8
        L6a:
            r8 = 0
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.nio.ByteBuffer m8230() {
            r0 = 0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.lang.String m8231(java.lang.String r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.util.regex.Pattern r1 = Yue.C1726.f5380
            java.util.regex.Matcher r2 = r1.matcher(r2)
            boolean r1 = r2.find()
            if (r1 == 0) goto L26
            r0 = 1
            java.lang.String r2 = r2.group(r0)
            java.lang.String r2 = r2.trim()
            java.lang.String r0 = "charset="
            java.lang.String r1 = ""
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r2 = m8239(r2)
            return r2
        L26:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Yue.C1948 m8232(java.io.File r1, java.lang.String r2, java.lang.String r3) throws java.io.IOException {
            Yue.ۥۣۡۧۦ r0 = Yue.C4700.m18617()
            Yue.ۥ۠۟ۧۥ r1 = m8233(r1, r2, r3, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Yue.C1948 m8233(java.io.File r3, java.lang.String r4, java.lang.String r5, Yue.C4700 r6) throws java.io.IOException {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
            java.lang.String r1 = r3.getName()
            java.lang.String r1 = Yue.C4415.m17326(r1)
            java.lang.String r2 = ".gz"
            boolean r2 = r1.endsWith(r2)
            if (r2 != 0) goto L1d
            java.lang.String r2 = ".z"
            boolean r1 = r1.endsWith(r2)
            if (r1 == 0) goto L47
        L1d:
            int r1 = r0.read()     // Catch: java.lang.Throwable -> L2f
            r2 = 31
            if (r1 != r2) goto L31
            int r1 = r0.read()     // Catch: java.lang.Throwable -> L2f
            r2 = 139(0x8b, float:1.95E-43)
            if (r1 != r2) goto L31
            r1 = 1
            goto L32
        L2f:
            r3 = move-exception
            goto L4c
        L31:
            r1 = 0
        L32:
            r0.close()
            if (r1 == 0) goto L42
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r3)
            r0.<init>(r1)
            goto L47
        L42:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
        L47:
            Yue.ۥ۠۟ۧۥ r3 = m8237(r0, r4, r5, r6)
            return r3
        L4c:
            r0.close()
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static Yue.C1948 m8234(java.io.InputStream r1, java.lang.String r2, java.lang.String r3) throws java.io.IOException {
            Yue.ۥۣۡۧۦ r0 = Yue.C4700.m18617()
            Yue.ۥ۠۟ۧۥ r1 = m8237(r1, r2, r3, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static Yue.C1948 m8235(java.io.InputStream r0, java.lang.String r1, java.lang.String r2, Yue.C4700 r3) throws java.io.IOException {
            Yue.ۥ۠۟ۧۥ r0 = m8237(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static java.lang.String m8236() {
            java.lang.StringBuilder r0 = Yue.C5973.m22113()
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r2 = 0
        La:
            r3 = 32
            if (r2 >= r3) goto L1d
            char[] r3 = Yue.C1726.f5384
            int r4 = r3.length
            int r4 = r1.nextInt(r4)
            char r3 = r3[r4]
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L1d:
            java.lang.String r0 = Yue.C5973.m22128(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static Yue.C1948 m8237(java.io.InputStream r12, java.lang.String r13, java.lang.String r14, Yue.C4700 r15) throws java.io.IOException {
            java.lang.String r0 = "charset"
            if (r12 != 0) goto La
            Yue.ۥ۠۟ۧۥ r12 = new Yue.ۥ۠۟ۧۥ
            r12.<init>(r14)
            return r12
        La:
            r1 = 32768(0x8000, float:4.5918E-41)
            r2 = 0
            Yue.ۥ۟ۧۥۧ r12 = Yue.C1618.m7838(r12, r1, r2)
            r12.mark(r1)     // Catch: java.lang.Throwable -> L34
            r3 = 5119(0x13ff, float:7.173E-42)
            java.nio.ByteBuffer r3 = m8238(r12, r3)     // Catch: java.lang.Throwable -> L34
            int r4 = r12.read()     // Catch: java.lang.Throwable -> L34
            r5 = -1
            r6 = 1
            if (r4 != r5) goto L25
            r4 = r6
            goto L26
        L25:
            r4 = r2
        L26:
            r12.reset()     // Catch: java.lang.Throwable -> L34
            Yue.ۥ۟ۨۢۦ$ۥ r5 = m8229(r3)     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto L37
            java.lang.String r13 = Yue.C1726.C1727.m8240(r5)     // Catch: java.lang.Throwable -> L34
            goto L37
        L34:
            r13 = move-exception
            goto L165
        L37:
            r7 = 0
            if (r13 != 0) goto Lfc
            java.nio.charset.Charset r8 = Yue.C1726.f5381     // Catch: java.lang.Throwable -> L34 java.io.UncheckedIOException -> L5c
            java.nio.CharBuffer r3 = r8.decode(r3)     // Catch: java.lang.Throwable -> L34 java.io.UncheckedIOException -> L5c
            boolean r8 = r3.hasArray()     // Catch: java.lang.Throwable -> L34 java.io.UncheckedIOException -> L5c
            if (r8 == 0) goto L5f
            java.io.CharArrayReader r8 = new java.io.CharArrayReader     // Catch: java.lang.Throwable -> L34 java.io.UncheckedIOException -> L5c
            char[] r9 = r3.array()     // Catch: java.lang.Throwable -> L34 java.io.UncheckedIOException -> L5c
            int r10 = r3.arrayOffset()     // Catch: java.lang.Throwable -> L34 java.io.UncheckedIOException -> L5c
            int r3 = r3.limit()     // Catch: java.lang.Throwable -> L34 java.io.UncheckedIOException -> L5c
            r8.<init>(r9, r10, r3)     // Catch: java.lang.Throwable -> L34 java.io.UncheckedIOException -> L5c
            Yue.ۥ۠۟ۧۥ r3 = r15.m18633(r8, r14)     // Catch: java.lang.Throwable -> L34 java.io.UncheckedIOException -> L5c
            goto L67
        L5c:
            r13 = move-exception
            goto Lf7
        L5f:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L34 java.io.UncheckedIOException -> L5c
            Yue.ۥ۠۟ۧۥ r3 = r15.m18634(r3, r14)     // Catch: java.lang.Throwable -> L34 java.io.UncheckedIOException -> L5c
        L67:
            java.lang.String r8 = "meta[http-equiv=content-type], meta[charset]"
            Yue.ۥ۠۠ۥۧ r8 = r3.m9913(r8)     // Catch: java.lang.Throwable -> L34
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L34
            r9 = r7
        L72:
            boolean r10 = r8.hasNext()     // Catch: java.lang.Throwable -> L34
            if (r10 == 0) goto L9e
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> L34
            Yue.ۥ۠۠ۥۥ r10 = (Yue.C2104) r10     // Catch: java.lang.Throwable -> L34
            java.lang.String r11 = "http-equiv"
            boolean r11 = r10.mo14514(r11)     // Catch: java.lang.Throwable -> L34
            if (r11 == 0) goto L90
            java.lang.String r9 = "content"
            java.lang.String r9 = r10.mo14513(r9)     // Catch: java.lang.Throwable -> L34
            java.lang.String r9 = m8231(r9)     // Catch: java.lang.Throwable -> L34
        L90:
            if (r9 != 0) goto L9c
            boolean r11 = r10.mo14514(r0)     // Catch: java.lang.Throwable -> L34
            if (r11 == 0) goto L9c
            java.lang.String r9 = r10.mo14513(r0)     // Catch: java.lang.Throwable -> L34
        L9c:
            if (r9 == 0) goto L72
        L9e:
            if (r9 != 0) goto Ld7
            int r0 = r3.mo9797()     // Catch: java.lang.Throwable -> L34
            if (r0 <= 0) goto Ld7
            Yue.ۥۣۡۢۤ r0 = r3.m17271(r2)     // Catch: java.lang.Throwable -> L34
            boolean r8 = r0 instanceof Yue.C7165     // Catch: java.lang.Throwable -> L34
            if (r8 == 0) goto Lb1
            Yue.ۥۢۦۣ r0 = (Yue.C7165) r0     // Catch: java.lang.Throwable -> L34
            goto Lc3
        Lb1:
            boolean r8 = r0 instanceof Yue.C1274     // Catch: java.lang.Throwable -> L34
            if (r8 == 0) goto Lc2
            Yue.ۥ۟ۥۤۤ r0 = (Yue.C1274) r0     // Catch: java.lang.Throwable -> L34
            boolean r8 = r0.m6697()     // Catch: java.lang.Throwable -> L34
            if (r8 == 0) goto Lc2
            Yue.ۥۢۦۣ r0 = r0.m6694()     // Catch: java.lang.Throwable -> L34
            goto Lc3
        Lc2:
            r0 = r7
        Lc3:
            if (r0 == 0) goto Ld7
            java.lang.String r8 = r0.m27614()     // Catch: java.lang.Throwable -> L34
            java.lang.String r10 = "xml"
            boolean r8 = r8.equalsIgnoreCase(r10)     // Catch: java.lang.Throwable -> L34
            if (r8 == 0) goto Ld7
            java.lang.String r8 = "encoding"
            java.lang.String r9 = r0.mo14513(r8)     // Catch: java.lang.Throwable -> L34
        Ld7:
            java.lang.String r0 = m8239(r9)     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto Lf2
            java.lang.String r8 = Yue.C1726.f5382     // Catch: java.lang.Throwable -> L34
            boolean r8 = r0.equalsIgnoreCase(r8)     // Catch: java.lang.Throwable -> L34
            if (r8 != 0) goto Lf2
            java.lang.String r13 = r0.trim()     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "[\"']"
            java.lang.String r3 = ""
            java.lang.String r13 = r13.replaceAll(r0, r3)     // Catch: java.lang.Throwable -> L34
            goto L101
        Lf2:
            if (r4 != 0) goto Lf5
            goto L101
        Lf5:
            r7 = r3
            goto L101
        Lf7:
            java.io.IOException r13 = r13.getCause()     // Catch: java.lang.Throwable -> L34
            throw r13     // Catch: java.lang.Throwable -> L34
        Lfc:
            java.lang.String r0 = "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML"
            Yue.C6657.m25633(r13, r0)     // Catch: java.lang.Throwable -> L34
        L101:
            if (r7 != 0) goto L161
            if (r13 != 0) goto L107
            java.lang.String r13 = Yue.C1726.f5382     // Catch: java.lang.Throwable -> L34
        L107:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L34
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L34
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r13)     // Catch: java.lang.Throwable -> L34
            r3.<init>(r12, r4)     // Catch: java.lang.Throwable -> L34
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto L12e
            boolean r1 = Yue.C1726.C1727.m8241(r5)     // Catch: java.lang.Throwable -> L12c
            if (r1 == 0) goto L12e
            r3 = 1
            long r7 = r0.skip(r3)     // Catch: java.lang.Throwable -> L12c
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 != 0) goto L128
            r2 = r6
        L128:
            Yue.C6657.m25628(r2)     // Catch: java.lang.Throwable -> L12c
            goto L12e
        L12c:
            r13 = move-exception
            goto L15d
        L12e:
            Yue.ۥ۠۟ۧۥ r7 = r15.m18633(r0, r14)     // Catch: java.lang.Throwable -> L12c java.io.UncheckedIOException -> L157
            java.lang.String r14 = Yue.C1726.f5382     // Catch: java.lang.Throwable -> L12c
            boolean r14 = r13.equals(r14)     // Catch: java.lang.Throwable -> L12c
            if (r14 == 0) goto L13d
            java.nio.charset.Charset r13 = Yue.C1726.f5381     // Catch: java.lang.Throwable -> L12c
            goto L141
        L13d:
            java.nio.charset.Charset r13 = java.nio.charset.Charset.forName(r13)     // Catch: java.lang.Throwable -> L12c
        L141:
            Yue.ۥ۠۟ۧۥ$ۥ r14 = r7.m8955()     // Catch: java.lang.Throwable -> L12c
            r14.m8967(r13)     // Catch: java.lang.Throwable -> L12c
            boolean r13 = r13.canEncode()     // Catch: java.lang.Throwable -> L12c
            if (r13 != 0) goto L153
            java.nio.charset.Charset r13 = Yue.C1726.f5381     // Catch: java.lang.Throwable -> L12c
            r7.m8943(r13)     // Catch: java.lang.Throwable -> L12c
        L153:
            r0.close()     // Catch: java.lang.Throwable -> L34
            goto L161
        L157:
            r13 = move-exception
            java.io.IOException r13 = r13.getCause()     // Catch: java.lang.Throwable -> L12c
            throw r13     // Catch: java.lang.Throwable -> L12c
        L15d:
            r0.close()     // Catch: java.lang.Throwable -> L34
            throw r13     // Catch: java.lang.Throwable -> L34
        L161:
            r12.close()
            return r7
        L165:
            r12.close()
            throw r13
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static java.nio.ByteBuffer m8238(java.io.InputStream r0, int r1) throws java.io.IOException {
            java.nio.ByteBuffer r0 = Yue.C1618.m7837(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static java.lang.String m8239(java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L2a
            int r1 = r3.length()
            if (r1 != 0) goto La
            goto L2a
        La:
            java.lang.String r3 = r3.trim()
            java.lang.String r1 = "[\"']"
            java.lang.String r2 = ""
            java.lang.String r3 = r3.replaceAll(r1, r2)
            boolean r1 = java.nio.charset.Charset.isSupported(r3)     // Catch: java.nio.charset.IllegalCharsetNameException -> L2a
            if (r1 == 0) goto L1d
            return r3
        L1d:
            java.util.Locale r1 = java.util.Locale.ENGLISH     // Catch: java.nio.charset.IllegalCharsetNameException -> L2a
            java.lang.String r3 = r3.toUpperCase(r1)     // Catch: java.nio.charset.IllegalCharsetNameException -> L2a
            boolean r1 = java.nio.charset.Charset.isSupported(r3)     // Catch: java.nio.charset.IllegalCharsetNameException -> L2a
            if (r1 == 0) goto L2a
            return r3
        L2a:
            return r0
    }
}
