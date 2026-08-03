package com.bumptech.glide.util;

/* JADX INFO: loaded from: classes.dex */
public final class ByteBufferUtil {
    private static final java.util.concurrent.atomic.AtomicReference<byte[]> BUFFER_REF = null;
    private static final int BUFFER_SIZE = 16384;

    public static class ByteBufferStream extends java.io.InputStream {
        private static final int UNSET = -1;

        @Yue.InterfaceC4410
        private final java.nio.ByteBuffer byteBuffer;
        private int markPos;

        public ByteBufferStream(@Yue.InterfaceC4410 java.nio.ByteBuffer r2) {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.markPos = r0
                r1.byteBuffer = r2
                return
        }

        @Override // java.io.InputStream
        public int available() {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.byteBuffer
                int r0 = r0.remaining()
                return r0
        }

        @Override // java.io.InputStream
        public synchronized void mark(int r1) {
                r0 = this;
                monitor-enter(r0)
                java.nio.ByteBuffer r1 = r0.byteBuffer     // Catch: java.lang.Throwable -> Lb
                int r1 = r1.position()     // Catch: java.lang.Throwable -> Lb
                r0.markPos = r1     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r0)
                return
            Lb:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                throw r1
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // java.io.InputStream
        public int read() {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.byteBuffer
                boolean r0 = r0.hasRemaining()
                if (r0 != 0) goto La
                r0 = -1
                return r0
            La:
                java.nio.ByteBuffer r0 = r1.byteBuffer
                byte r0 = r0.get()
                r0 = r0 & 255(0xff, float:3.57E-43)
                return r0
        }

        @Override // java.io.InputStream
        public int read(@Yue.InterfaceC4410 byte[] r2, int r3, int r4) {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.byteBuffer
                boolean r0 = r0.hasRemaining()
                if (r0 != 0) goto La
                r2 = -1
                return r2
            La:
                int r0 = r1.available()
                int r4 = java.lang.Math.min(r4, r0)
                java.nio.ByteBuffer r0 = r1.byteBuffer
                r0.get(r2, r3, r4)
                return r4
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws java.io.IOException {
                r2 = this;
                monitor-enter(r2)
                int r0 = r2.markPos     // Catch: java.lang.Throwable -> Ld
                r1 = -1
                if (r0 == r1) goto Lf
                java.nio.ByteBuffer r1 = r2.byteBuffer     // Catch: java.lang.Throwable -> Ld
                r1.position(r0)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r2)
                return
            Ld:
                r0 = move-exception
                goto L17
            Lf:
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Ld
                java.lang.String r1 = "Cannot reset to unset mark position"
                r0.<init>(r1)     // Catch: java.lang.Throwable -> Ld
                throw r0     // Catch: java.lang.Throwable -> Ld
            L17:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r0
        }

        @Override // java.io.InputStream
        public long skip(long r4) {
                r3 = this;
                java.nio.ByteBuffer r0 = r3.byteBuffer
                boolean r0 = r0.hasRemaining()
                if (r0 != 0) goto Lb
                r4 = -1
                return r4
            Lb:
                int r0 = r3.available()
                long r0 = (long) r0
                long r4 = java.lang.Math.min(r4, r0)
                java.nio.ByteBuffer r0 = r3.byteBuffer
                int r1 = r0.position()
                long r1 = (long) r1
                long r1 = r1 + r4
                int r1 = (int) r1
                r0.position(r1)
                return r4
        }
    }

    public static final class SafeArray {
        final byte[] data;
        final int limit;
        final int offset;

        public SafeArray(@Yue.InterfaceC4410 byte[] r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.data = r1
                r0.offset = r2
                r0.limit = r3
                return
        }
    }

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            com.bumptech.glide.util.ByteBufferUtil.BUFFER_REF = r0
            return
    }

    private ByteBufferUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    public static java.nio.ByteBuffer fromFile(@Yue.InterfaceC4410 java.io.File r8) throws java.io.IOException {
            r0 = 0
            long r5 = r8.length()     // Catch: java.lang.Throwable -> L33
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L3e
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L36
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "r"
            r7.<init>(r8, r1)     // Catch: java.lang.Throwable -> L33
            java.nio.channels.FileChannel r0 = r7.getChannel()     // Catch: java.lang.Throwable -> L31
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L31
            r3 = 0
            r1 = r0
            java.nio.MappedByteBuffer r8 = r1.map(r2, r3, r5)     // Catch: java.lang.Throwable -> L31
            java.nio.MappedByteBuffer r8 = r8.load()     // Catch: java.lang.Throwable -> L31
            r0.close()     // Catch: java.io.IOException -> L2d
        L2d:
            r7.close()     // Catch: java.io.IOException -> L30
        L30:
            return r8
        L31:
            r8 = move-exception
            goto L46
        L33:
            r8 = move-exception
            r7 = r0
            goto L46
        L36:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "File unsuitable for memory mapping"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L33
            throw r8     // Catch: java.lang.Throwable -> L33
        L3e:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "File too large to map into memory"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L33
            throw r8     // Catch: java.lang.Throwable -> L33
        L46:
            if (r0 == 0) goto L4b
            r0.close()     // Catch: java.io.IOException -> L4b
        L4b:
            if (r7 == 0) goto L50
            r7.close()     // Catch: java.io.IOException -> L50
        L50:
            throw r8
    }

    @Yue.InterfaceC4410
    public static java.nio.ByteBuffer fromStream(@Yue.InterfaceC4410 java.io.InputStream r4) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.<init>(r1)
            java.util.concurrent.atomic.AtomicReference<byte[]> r2 = com.bumptech.glide.util.ByteBufferUtil.BUFFER_REF
            r3 = 0
            java.lang.Object r2 = r2.getAndSet(r3)
            byte[] r2 = (byte[]) r2
            if (r2 != 0) goto L14
            byte[] r2 = new byte[r1]
        L14:
            int r1 = r4.read(r2)
            if (r1 < 0) goto L1f
            r3 = 0
            r0.write(r2, r3, r1)
            goto L14
        L1f:
            java.util.concurrent.atomic.AtomicReference<byte[]> r4 = com.bumptech.glide.util.ByteBufferUtil.BUFFER_REF
            r4.set(r2)
            byte[] r4 = r0.toByteArray()
            int r0 = r4.length
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            java.nio.ByteBuffer r4 = r0.put(r4)
            java.nio.ByteBuffer r4 = rewind(r4)
            return r4
    }

    @Yue.InterfaceC4544
    private static com.bumptech.glide.util.ByteBufferUtil.SafeArray getSafeArray(@Yue.InterfaceC4410 java.nio.ByteBuffer r3) {
            boolean r0 = r3.isReadOnly()
            if (r0 != 0) goto L1e
            boolean r0 = r3.hasArray()
            if (r0 == 0) goto L1e
            com.bumptech.glide.util.ByteBufferUtil$SafeArray r0 = new com.bumptech.glide.util.ByteBufferUtil$SafeArray
            byte[] r1 = r3.array()
            int r2 = r3.arrayOffset()
            int r3 = r3.limit()
            r0.<init>(r1, r2, r3)
            return r0
        L1e:
            r3 = 0
            return r3
    }

    public static java.nio.ByteBuffer rewind(java.nio.ByteBuffer r1) {
            r0 = 0
            java.nio.Buffer r1 = r1.position(r0)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            return r1
    }

    @Yue.InterfaceC4410
    public static byte[] toBytes(@Yue.InterfaceC4410 java.nio.ByteBuffer r2) {
            com.bumptech.glide.util.ByteBufferUtil$SafeArray r0 = getSafeArray(r2)
            if (r0 == 0) goto L16
            int r1 = r0.offset
            if (r1 != 0) goto L16
            int r1 = r0.limit
            byte[] r0 = r0.data
            int r0 = r0.length
            if (r1 != r0) goto L16
            byte[] r2 = r2.array()
            goto L27
        L16:
            java.nio.ByteBuffer r2 = r2.asReadOnlyBuffer()
            int r0 = r2.limit()
            byte[] r0 = new byte[r0]
            rewind(r2)
            r2.get(r0)
            r2 = r0
        L27:
            return r2
    }

    public static void toFile(@Yue.InterfaceC4410 java.nio.ByteBuffer r3, @Yue.InterfaceC4410 java.io.File r4) throws java.io.IOException {
            rewind(r3)
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "rw"
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L25
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch: java.lang.Throwable -> L23
            r0.write(r3)     // Catch: java.lang.Throwable -> L23
            r3 = 0
            r0.force(r3)     // Catch: java.lang.Throwable -> L23
            r0.close()     // Catch: java.lang.Throwable -> L23
            r1.close()     // Catch: java.lang.Throwable -> L23
            r0.close()     // Catch: java.io.IOException -> L1f
        L1f:
            r1.close()     // Catch: java.io.IOException -> L22
        L22:
            return
        L23:
            r3 = move-exception
            goto L27
        L25:
            r3 = move-exception
            r1 = r0
        L27:
            if (r0 == 0) goto L2c
            r0.close()     // Catch: java.io.IOException -> L2c
        L2c:
            if (r1 == 0) goto L31
            r1.close()     // Catch: java.io.IOException -> L31
        L31:
            throw r3
    }

    @Yue.InterfaceC4410
    public static java.io.InputStream toStream(@Yue.InterfaceC4410 java.nio.ByteBuffer r1) {
            com.bumptech.glide.util.ByteBufferUtil$ByteBufferStream r0 = new com.bumptech.glide.util.ByteBufferUtil$ByteBufferStream
            r0.<init>(r1)
            return r0
    }

    public static void toStream(@Yue.InterfaceC4410 java.nio.ByteBuffer r3, @Yue.InterfaceC4410 java.io.OutputStream r4) throws java.io.IOException {
            com.bumptech.glide.util.ByteBufferUtil$SafeArray r0 = getSafeArray(r3)
            if (r0 == 0) goto L11
            byte[] r3 = r0.data
            int r1 = r0.offset
            int r0 = r0.limit
            int r0 = r0 + r1
            r4.write(r3, r1, r0)
            goto L3c
        L11:
            java.util.concurrent.atomic.AtomicReference<byte[]> r0 = com.bumptech.glide.util.ByteBufferUtil.BUFFER_REF
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto L20
            r0 = 16384(0x4000, float:2.2959E-41)
            byte[] r0 = new byte[r0]
        L20:
            int r1 = r3.remaining()
            if (r1 <= 0) goto L37
            int r1 = r3.remaining()
            int r2 = r0.length
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            r3.get(r0, r2, r1)
            r4.write(r0, r2, r1)
            goto L20
        L37:
            java.util.concurrent.atomic.AtomicReference<byte[]> r3 = com.bumptech.glide.util.ByteBufferUtil.BUFFER_REF
            r3.set(r0)
        L3c:
            return
    }
}
