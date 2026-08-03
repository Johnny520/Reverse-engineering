package com.google.flatbuffers;

/* JADX INFO: loaded from: classes.dex */
public class Utf8Old extends com.google.flatbuffers.Utf8 {
    private static final java.lang.ThreadLocal<com.google.flatbuffers.Utf8Old.Cache> CACHE = null;

    public static class Cache {
        final java.nio.charset.CharsetDecoder decoder;
        final java.nio.charset.CharsetEncoder encoder;
        java.lang.CharSequence lastInput;
        java.nio.ByteBuffer lastOutput;

        public Cache() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.lastInput = r0
                r2.lastOutput = r0
                java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
                java.nio.charset.CharsetEncoder r1 = r0.newEncoder()
                r2.encoder = r1
                java.nio.charset.CharsetDecoder r0 = r0.newDecoder()
                r2.decoder = r0
                return
        }
    }

    static {
            Yue.ۥۣۣۢۤ r0 = new Yue.ۥۣۣۢۤ
            r0.<init>()
            java.lang.ThreadLocal r0 = java.lang.ThreadLocal.withInitial(r0)
            com.google.flatbuffers.Utf8Old.CACHE = r0
            return
    }

    public Utf8Old() {
            r0 = this;
            r0.<init>()
            return
    }

    private static /* synthetic */ com.google.flatbuffers.Utf8Old.Cache lambda$static$0() {
            com.google.flatbuffers.Utf8Old$Cache r0 = new com.google.flatbuffers.Utf8Old$Cache
            r0.<init>()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ com.google.flatbuffers.Utf8Old.Cache m30638() {
            com.google.flatbuffers.Utf8Old$Cache r0 = lambda$static$0()
            return r0
    }

    @Override // com.google.flatbuffers.Utf8
    public java.lang.String decodeUtf8(java.nio.ByteBuffer r2, int r3, int r4) {
            r1 = this;
            java.lang.ThreadLocal<com.google.flatbuffers.Utf8Old$Cache> r0 = com.google.flatbuffers.Utf8Old.CACHE
            java.lang.Object r0 = r0.get()
            com.google.flatbuffers.Utf8Old$Cache r0 = (com.google.flatbuffers.Utf8Old.Cache) r0
            java.nio.charset.CharsetDecoder r0 = r0.decoder
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

    @Override // com.google.flatbuffers.Utf8
    public void encodeUtf8(java.lang.CharSequence r3, java.nio.ByteBuffer r4) {
            r2 = this;
            java.lang.ThreadLocal<com.google.flatbuffers.Utf8Old$Cache> r0 = com.google.flatbuffers.Utf8Old.CACHE
            java.lang.Object r0 = r0.get()
            com.google.flatbuffers.Utf8Old$Cache r0 = (com.google.flatbuffers.Utf8Old.Cache) r0
            java.lang.CharSequence r1 = r0.lastInput
            if (r1 == r3) goto Lf
            r2.encodedLength(r3)
        Lf:
            java.nio.ByteBuffer r3 = r0.lastOutput
            r4.put(r3)
            return
    }

    @Override // com.google.flatbuffers.Utf8
    public int encodedLength(java.lang.CharSequence r5) {
            r4 = this;
            java.lang.ThreadLocal<com.google.flatbuffers.Utf8Old$Cache> r0 = com.google.flatbuffers.Utf8Old.CACHE
            java.lang.Object r0 = r0.get()
            com.google.flatbuffers.Utf8Old$Cache r0 = (com.google.flatbuffers.Utf8Old.Cache) r0
            int r1 = r5.length()
            float r1 = (float) r1
            java.nio.charset.CharsetEncoder r2 = r0.encoder
            float r2 = r2.maxBytesPerChar()
            float r1 = r1 * r2
            int r1 = (int) r1
            java.nio.ByteBuffer r2 = r0.lastOutput
            if (r2 == 0) goto L1f
            int r2 = r2.capacity()
            if (r2 >= r1) goto L2b
        L1f:
            r2 = 128(0x80, float:1.8E-43)
            int r1 = java.lang.Math.max(r2, r1)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r0.lastOutput = r1
        L2b:
            java.nio.ByteBuffer r1 = r0.lastOutput
            r1.clear()
            r0.lastInput = r5
            boolean r1 = r5 instanceof java.nio.CharBuffer
            if (r1 == 0) goto L39
            java.nio.CharBuffer r5 = (java.nio.CharBuffer) r5
            goto L3d
        L39:
            java.nio.CharBuffer r5 = java.nio.CharBuffer.wrap(r5)
        L3d:
            java.nio.charset.CharsetEncoder r1 = r0.encoder
            java.nio.ByteBuffer r2 = r0.lastOutput
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
            java.nio.ByteBuffer r5 = r0.lastOutput
            r5.flip()
            java.nio.ByteBuffer r5 = r0.lastOutput
            int r5 = r5.remaining()
            return r5
    }
}
