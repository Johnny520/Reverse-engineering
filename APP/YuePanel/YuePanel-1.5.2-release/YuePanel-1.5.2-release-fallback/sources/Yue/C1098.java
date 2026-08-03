package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1098 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.nio.charset.CodingErrorAction f3258 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int[] f3259 = null;

    static {
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPORT
            Yue.C1098.f3258 = r0
            r0 = 400(0x190, float:5.6E-43)
            int[] r0 = new int[r0]
            r0 = {x000e: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 10, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 3, 11, 6, 6, 6, 5, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 0, 1, 2, 3, 5, 8, 7, 1, 1, 1, 4, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1} // fill-array
            Yue.C1098.f3259 = r0
            return
    }

    public C1098() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static byte[] m5882(java.lang.String r1) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            byte[] r1 = r1.getBytes(r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static boolean m5883(java.nio.ByteBuffer r1) {
            r0 = 0
            boolean r1 = m5884(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m5884(java.nio.ByteBuffer r6, int r7) {
            int r0 = r6.remaining()
            r1 = 0
            if (r0 >= r7) goto L8
            return r1
        L8:
            r2 = r1
        L9:
            r3 = 1
            if (r7 >= r0) goto L23
            int[] r4 = Yue.C1098.f3259
            int r2 = r2 << 4
            int r2 = r2 + 256
            byte r5 = r6.get(r7)
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r4[r5]
            int r2 = r2 + r5
            r2 = r4[r2]
            if (r2 != r3) goto L20
            return r1
        L20:
            int r7 = r7 + 1
            goto L9
        L23:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.lang.String m5885(byte[] r2) {
            int r0 = r2.length
            r1 = 0
            java.lang.String r2 = m5886(r2, r1, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static java.lang.String m5886(byte[] r2, int r3, int r4) {
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static java.lang.String m5887(java.nio.ByteBuffer r2) throws Yue.C3342 {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.CharsetDecoder r0 = r0.newDecoder()
            java.nio.charset.CodingErrorAction r1 = Yue.C1098.f3258
            r0.onMalformedInput(r1)
            r0.onUnmappableCharacter(r1)
            r2.mark()     // Catch: java.nio.charset.CharacterCodingException -> L1d
            java.nio.CharBuffer r0 = r0.decode(r2)     // Catch: java.nio.charset.CharacterCodingException -> L1d
            java.lang.String r0 = r0.toString()     // Catch: java.nio.charset.CharacterCodingException -> L1d
            r2.reset()     // Catch: java.nio.charset.CharacterCodingException -> L1d
            return r0
        L1d:
            r2 = move-exception
            Yue.ۥ۠ۥۧۤ r0 = new Yue.ۥ۠ۥۧۤ
            r1 = 1007(0x3ef, float:1.411E-42)
            r0.<init>(r1, r2)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static java.lang.String m5888(byte[] r0) throws Yue.C3342 {
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r0 = m5887(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static byte[] m5889(java.lang.String r1) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r1.getBytes(r0)
            return r1
    }
}
