package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6647 extends Yue.AbstractC6640 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.ThreadLocal<Yue.C6647.C6648> f23194 = null;

    /* JADX INFO: renamed from: Yue.ۥۣۢۤۥ$ۥ, reason: contains not printable characters */
    public static class C6648 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.nio.charset.CharsetEncoder f23195;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.nio.charset.CharsetDecoder f23196;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public java.lang.CharSequence f23197;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public java.nio.ByteBuffer f23198;

        public C6648() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.f23197 = r0
                r2.f23198 = r0
                java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
                java.nio.charset.CharsetEncoder r1 = r0.newEncoder()
                r2.f23195 = r1
                java.nio.charset.CharsetDecoder r0 = r0.newDecoder()
                r2.f23196 = r0
                return
        }
    }

    static {
            Yue.ۥۣۢۤۤ r0 = new Yue.ۥۣۢۤۤ
            r0.<init>()
            java.lang.ThreadLocal r0 = java.lang.ThreadLocal.withInitial(r0)
            Yue.C6647.f23194 = r0
            return
    }

    public C6647() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ Yue.C6647.C6648 m25538() {
            Yue.ۥۣۢۤۥ$ۥ r0 = m25539()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ Yue.C6647.C6648 m25539() {
            Yue.ۥۣۢۤۥ$ۥ r0 = new Yue.ۥۣۢۤۥ$ۥ
            r0.<init>()
            return r0
    }

    @Override // Yue.AbstractC6640
    /* JADX INFO: renamed from: ۥ */
    public java.lang.String mo25511(java.nio.ByteBuffer r2, int r3, int r4) {
            r1 = this;
            java.lang.ThreadLocal<Yue.ۥۣۢۤۥ$ۥ> r0 = Yue.C6647.f23194
            java.lang.Object r0 = r0.get()
            Yue.ۥۣۢۤۥ$ۥ r0 = (Yue.C6647.C6648) r0
            java.nio.charset.CharsetDecoder r0 = r0.f23196
            r0.reset()
            java.nio.ByteBuffer r2 = r2.duplicate()
            r2.position(r3)
            int r3 = r3 + r4
            r2.limit(r3)
            java.nio.CharBuffer r2 = r0.decode(r2)     // Catch: java.nio.charset.CharacterCodingException -> L21
            java.lang.String r2 = r2.toString()     // Catch: java.nio.charset.CharacterCodingException -> L21
            return r2
        L21:
            r2 = move-exception
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Bad encoding"
            r3.<init>(r4, r2)
            throw r3
    }

    @Override // Yue.AbstractC6640
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo25512(java.lang.CharSequence r3, java.nio.ByteBuffer r4) {
            r2 = this;
            java.lang.ThreadLocal<Yue.ۥۣۢۤۥ$ۥ> r0 = Yue.C6647.f23194
            java.lang.Object r0 = r0.get()
            Yue.ۥۣۢۤۥ$ۥ r0 = (Yue.C6647.C6648) r0
            java.lang.CharSequence r1 = r0.f23197
            if (r1 == r3) goto Lf
            r2.mo25513(r3)
        Lf:
            java.nio.ByteBuffer r3 = r0.f23198
            r4.put(r3)
            return
    }

    @Override // Yue.AbstractC6640
    /* JADX INFO: renamed from: ۥ۟۟ */
    public int mo25513(java.lang.CharSequence r5) {
            r4 = this;
            java.lang.ThreadLocal<Yue.ۥۣۢۤۥ$ۥ> r0 = Yue.C6647.f23194
            java.lang.Object r0 = r0.get()
            Yue.ۥۣۢۤۥ$ۥ r0 = (Yue.C6647.C6648) r0
            int r1 = r5.length()
            float r1 = (float) r1
            java.nio.charset.CharsetEncoder r2 = r0.f23195
            float r2 = r2.maxBytesPerChar()
            float r1 = r1 * r2
            int r1 = (int) r1
            java.nio.ByteBuffer r2 = r0.f23198
            if (r2 == 0) goto L1f
            int r2 = r2.capacity()
            if (r2 >= r1) goto L2b
        L1f:
            r2 = 128(0x80, float:1.8E-43)
            int r1 = java.lang.Math.max(r2, r1)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r0.f23198 = r1
        L2b:
            java.nio.ByteBuffer r1 = r0.f23198
            r1.clear()
            r0.f23197 = r5
            boolean r1 = r5 instanceof java.nio.CharBuffer
            if (r1 == 0) goto L39
            java.nio.CharBuffer r5 = (java.nio.CharBuffer) r5
            goto L3d
        L39:
            java.nio.CharBuffer r5 = java.nio.CharBuffer.wrap(r5)
        L3d:
            java.nio.charset.CharsetEncoder r1 = r0.f23195
            java.nio.ByteBuffer r2 = r0.f23198
            r3 = 1
            java.nio.charset.CoderResult r5 = r1.encode(r5, r2, r3)
            boolean r1 = r5.isError()
            if (r1 == 0) goto L59
            r5.throwException()     // Catch: java.nio.charset.CharacterCodingException -> L50
            goto L59
        L50:
            r5 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "bad character encoding"
            r0.<init>(r1, r5)
            throw r0
        L59:
            java.nio.ByteBuffer r5 = r0.f23198
            r5.flip()
            java.nio.ByteBuffer r5 = r0.f23198
            int r5 = r5.remaining()
            return r5
    }
}
