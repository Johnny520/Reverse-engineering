package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Buffer implements okio.BufferedSource, okio.BufferedSink, java.lang.Cloneable, java.nio.channels.ByteChannel {
    public okio.Segment head;
    private long size;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class UnsafeCursor implements java.io.Closeable {
        public okio.Buffer buffer;
        public byte[] data;
        public int end;
        public long offset;
        public boolean readWrite;
        private okio.Segment segment;
        public int start;

        public UnsafeCursor() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.offset = r0
                r0 = -1
                r2.start = r0
                r2.end = r0
                return
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r3 = this;
                okio.Buffer r0 = r3.buffer
                if (r0 == 0) goto L16
                r0 = 0
                r3.buffer = r0
                r3.setSegment$okio(r0)
                r1 = -1
                r3.offset = r1
                r3.data = r0
                r0 = -1
                r3.start = r0
                r3.end = r0
                return
            L16:
                java.lang.String r0 = "not attached to a buffer"
                j8.o.A(r0)
                return
        }

        public final long expandBuffer(int r10) {
                r9 = this;
                if (r10 <= 0) goto L4a
                r0 = 8192(0x2000, float:1.148E-41)
                if (r10 > r0) goto L40
                okio.Buffer r1 = r9.buffer
                if (r1 == 0) goto L3a
                boolean r2 = r9.readWrite
                if (r2 == 0) goto L32
                long r2 = r1.size()
                okio.Segment r10 = r1.writableSegment$okio(r10)
                int r4 = r10.limit
                int r4 = 8192 - r4
                r10.limit = r0
                long r5 = (long) r4
                long r7 = r2 + r5
                r1.setSize$okio(r7)
                r9.setSegment$okio(r10)
                r9.offset = r2
                byte[] r10 = r10.data
                r9.data = r10
                int r10 = 8192 - r4
                r9.start = r10
                r9.end = r0
                return r5
            L32:
                java.lang.String r10 = "expandBuffer() only permitted for read/write buffers"
                j8.o.A(r10)
            L37:
                r0 = 0
                return r0
            L3a:
                java.lang.String r10 = "not attached to a buffer"
                j8.o.A(r10)
                goto L37
            L40:
                java.lang.String r0 = "minByteCount > Segment.SIZE: "
                java.lang.String r10 = eh.a.l(r10, r0)
                j8.o.q(r10)
                goto L37
            L4a:
                java.lang.String r0 = "minByteCount <= 0: "
                java.lang.String r10 = eh.a.l(r10, r0)
                j8.o.q(r10)
                goto L37
        }

        public final okio.Segment getSegment$okio() {
                r1 = this;
                okio.Segment r0 = r1.segment
                return r0
        }

        public final int next() {
                r4 = this;
                long r0 = r4.offset
                okio.Buffer r2 = r4.buffer
                r2.getClass()
                long r2 = r2.size()
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L2a
                long r0 = r4.offset
                r2 = -1
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 != 0) goto L1e
                r0 = 0
                int r0 = r4.seek(r0)
                return r0
            L1e:
                int r2 = r4.end
                int r3 = r4.start
                int r2 = r2 - r3
                long r2 = (long) r2
                long r0 = r0 + r2
                int r0 = r4.seek(r0)
                return r0
            L2a:
                java.lang.String r0 = "no more bytes"
                j8.o.A(r0)
                r0 = 0
                return r0
        }

        public final long resizeBuffer(long r14) {
                r13 = this;
                okio.Buffer r0 = r13.buffer
                if (r0 == 0) goto L98
                boolean r1 = r13.readWrite
                if (r1 == 0) goto L92
                long r1 = r0.size()
                int r3 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
                r4 = 0
                if (r3 > 0) goto L5a
                int r3 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
                if (r3 < 0) goto L4e
                long r6 = r1 - r14
            L18:
                int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r3 <= 0) goto L40
                okio.Segment r3 = r0.head
                r3.getClass()
                okio.Segment r3 = r3.prev
                r3.getClass()
                int r8 = r3.limit
                int r9 = r3.pos
                int r9 = r8 - r9
                long r9 = (long) r9
                int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r11 > 0) goto L3c
                okio.Segment r8 = r3.pop()
                r0.head = r8
                okio.SegmentPool.recycle(r3)
                long r6 = r6 - r9
                goto L18
            L3c:
                int r4 = (int) r6
                int r8 = r8 - r4
                r3.limit = r8
            L40:
                r3 = 0
                r13.setSegment$okio(r3)
                r13.offset = r14
                r13.data = r3
                r3 = -1
                r13.start = r3
                r13.end = r3
                goto L8e
            L4e:
                java.lang.String r0 = "newSize < 0: "
                java.lang.String r14 = bc.e.g(r14, r0)
                j8.o.q(r14)
            L57:
                r14 = 0
                return r14
            L5a:
                if (r3 <= 0) goto L8e
                long r6 = r14 - r1
                r3 = 1
                r8 = r3
            L60:
                int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r9 <= 0) goto L8e
                okio.Segment r9 = r0.writableSegment$okio(r3)
                int r10 = r9.limit
                int r10 = 8192 - r10
                long r10 = (long) r10
                long r10 = java.lang.Math.min(r6, r10)
                int r10 = (int) r10
                int r11 = r9.limit
                int r11 = r11 + r10
                r9.limit = r11
                long r11 = (long) r10
                long r6 = r6 - r11
                if (r8 == 0) goto L60
                r13.setSegment$okio(r9)
                r13.offset = r1
                byte[] r8 = r9.data
                r13.data = r8
                int r8 = r9.limit
                int r9 = r8 - r10
                r13.start = r9
                r13.end = r8
                r8 = 0
                goto L60
            L8e:
                r0.setSize$okio(r14)
                return r1
            L92:
                java.lang.String r14 = "resizeBuffer() only permitted for read/write buffers"
                j8.o.A(r14)
                goto L57
            L98:
                java.lang.String r14 = "not attached to a buffer"
                j8.o.A(r14)
                goto L57
        }

        public final int seek(long r12) {
                r11 = this;
                okio.Buffer r0 = r11.buffer
                if (r0 == 0) goto Le3
                r1 = -1
                int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
                if (r1 < 0) goto Lca
                long r2 = r0.size()
                int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
                if (r2 > 0) goto Lca
                if (r1 == 0) goto Lbc
                long r1 = r0.size()
                int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
                if (r1 != 0) goto L1e
                goto Lbc
            L1e:
                long r1 = r0.size()
                okio.Segment r3 = r0.head
                okio.Segment r4 = r11.getSegment$okio()
                r5 = 0
                if (r4 == 0) goto L4e
                long r7 = r11.offset
                int r4 = r11.start
                okio.Segment r9 = r11.getSegment$okio()
                r9.getClass()
                int r9 = r9.pos
                int r4 = r4 - r9
                long r9 = (long) r4
                long r7 = r7 - r9
                int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
                if (r4 <= 0) goto L48
                okio.Segment r1 = r11.getSegment$okio()
                r4 = r3
                r3 = r1
                r1 = r7
                goto L4f
            L48:
                okio.Segment r4 = r11.getSegment$okio()
                r5 = r7
                goto L4f
            L4e:
                r4 = r3
            L4f:
                long r7 = r1 - r12
                long r9 = r12 - r5
                int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r7 <= 0) goto L6c
            L57:
                r4.getClass()
                int r1 = r4.limit
                int r2 = r4.pos
                int r3 = r1 - r2
                long r7 = (long) r3
                long r7 = r7 + r5
                int r3 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
                if (r3 < 0) goto L82
                int r1 = r1 - r2
                long r1 = (long) r1
                long r5 = r5 + r1
                okio.Segment r4 = r4.next
                goto L57
            L6c:
                int r4 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
                if (r4 <= 0) goto L80
                r3.getClass()
                okio.Segment r3 = r3.prev
                r3.getClass()
                int r4 = r3.limit
                int r5 = r3.pos
                int r4 = r4 - r5
                long r4 = (long) r4
                long r1 = r1 - r4
                goto L6c
            L80:
                r5 = r1
                r4 = r3
            L82:
                boolean r1 = r11.readWrite
                if (r1 == 0) goto La3
                r4.getClass()
                boolean r1 = r4.shared
                if (r1 == 0) goto La3
                okio.Segment r1 = r4.unsharedCopy()
                okio.Segment r2 = r0.head
                if (r2 != r4) goto L97
                r0.head = r1
            L97:
                okio.Segment r4 = r4.push(r1)
                okio.Segment r0 = r4.prev
                r0.getClass()
                r0.pop()
            La3:
                r11.setSegment$okio(r4)
                r11.offset = r12
                r4.getClass()
                byte[] r0 = r4.data
                r11.data = r0
                int r0 = r4.pos
                long r12 = r12 - r5
                int r12 = (int) r12
                int r0 = r0 + r12
                r11.start = r0
                int r12 = r4.limit
                r11.end = r12
                int r12 = r12 - r0
                return r12
            Lbc:
                r0 = 0
                r11.setSegment$okio(r0)
                r11.offset = r12
                r11.data = r0
                r12 = -1
                r11.start = r12
                r11.end = r12
                return r12
            Lca:
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.String r2 = "offset="
                java.lang.String r3 = " > size="
                java.lang.StringBuilder r12 = p.a.o(r12, r2, r3)
                long r2 = r0.size()
                r12.append(r2)
                java.lang.String r12 = r12.toString()
                r1.<init>(r12)
                throw r1
            Le3:
                java.lang.String r12 = "not attached to a buffer"
                j8.o.A(r12)
                r12 = 0
                return r12
        }

        public final void setSegment$okio(okio.Segment r1) {
                r0 = this;
                r0.segment = r1
                return
        }
    }



    public Buffer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ okio.Buffer copyTo$default(okio.Buffer r6, java.io.OutputStream r7, long r8, long r10, int r12, java.lang.Object r13) {
            r13 = r12 & 2
            if (r13 == 0) goto L6
            r8 = 0
        L6:
            r2 = r8
            r8 = r12 & 4
            if (r8 == 0) goto Lf
            long r8 = r6.size
            long r10 = r8 - r2
        Lf:
            r0 = r6
            r1 = r7
            r4 = r10
            okio.Buffer r6 = r0.copyTo(r1, r2, r4)
            return r6
    }

    public static /* synthetic */ okio.Buffer copyTo$default(okio.Buffer r0, okio.Buffer r1, long r2, int r4, java.lang.Object r5) {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            r2 = 0
        L6:
            okio.Buffer r0 = r0.copyTo(r1, r2)
            return r0
    }

    public static /* synthetic */ okio.Buffer copyTo$default(okio.Buffer r6, okio.Buffer r7, long r8, long r10, int r12, java.lang.Object r13) {
            r12 = r12 & 2
            if (r12 == 0) goto L6
            r8 = 0
        L6:
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            okio.Buffer r6 = r0.copyTo(r1, r2, r4)
            return r6
    }

    private final okio.ByteString digest(java.lang.String r6) {
            r5 = this;
            java.security.MessageDigest r6 = java.security.MessageDigest.getInstance(r6)
            okio.Segment r0 = r5.head
            if (r0 == 0) goto L29
            byte[] r1 = r0.data
            int r2 = r0.pos
            int r3 = r0.limit
            int r3 = r3 - r2
            r6.update(r1, r2, r3)
            okio.Segment r1 = r0.next
            r1.getClass()
        L17:
            if (r1 == r0) goto L29
            byte[] r2 = r1.data
            int r3 = r1.pos
            int r4 = r1.limit
            int r4 = r4 - r3
            r6.update(r2, r3, r4)
            okio.Segment r1 = r1.next
            r1.getClass()
            goto L17
        L29:
            okio.ByteString r0 = new okio.ByteString
            byte[] r6 = r6.digest()
            r6.getClass()
            r0.<init>(r6)
            return r0
    }

    private final okio.ByteString hmac(java.lang.String r5, okio.ByteString r6) {
            r4 = this;
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r5)     // Catch: java.security.InvalidKeyException -> L35
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidKeyException -> L35
            byte[] r6 = r6.internalArray$okio()     // Catch: java.security.InvalidKeyException -> L35
            r1.<init>(r6, r5)     // Catch: java.security.InvalidKeyException -> L35
            r0.init(r1)     // Catch: java.security.InvalidKeyException -> L35
            okio.Segment r5 = r4.head     // Catch: java.security.InvalidKeyException -> L35
            if (r5 == 0) goto L37
            byte[] r6 = r5.data     // Catch: java.security.InvalidKeyException -> L35
            int r1 = r5.pos     // Catch: java.security.InvalidKeyException -> L35
            int r2 = r5.limit     // Catch: java.security.InvalidKeyException -> L35
            int r2 = r2 - r1
            r0.update(r6, r1, r2)     // Catch: java.security.InvalidKeyException -> L35
            okio.Segment r6 = r5.next     // Catch: java.security.InvalidKeyException -> L35
            r6.getClass()     // Catch: java.security.InvalidKeyException -> L35
        L23:
            if (r6 == r5) goto L37
            byte[] r1 = r6.data     // Catch: java.security.InvalidKeyException -> L35
            int r2 = r6.pos     // Catch: java.security.InvalidKeyException -> L35
            int r3 = r6.limit     // Catch: java.security.InvalidKeyException -> L35
            int r3 = r3 - r2
            r0.update(r1, r2, r3)     // Catch: java.security.InvalidKeyException -> L35
            okio.Segment r6 = r6.next     // Catch: java.security.InvalidKeyException -> L35
            r6.getClass()     // Catch: java.security.InvalidKeyException -> L35
            goto L23
        L35:
            r5 = move-exception
            goto L44
        L37:
            okio.ByteString r5 = new okio.ByteString     // Catch: java.security.InvalidKeyException -> L35
            byte[] r6 = r0.doFinal()     // Catch: java.security.InvalidKeyException -> L35
            r6.getClass()     // Catch: java.security.InvalidKeyException -> L35
            r5.<init>(r6)     // Catch: java.security.InvalidKeyException -> L35
            return r5
        L44:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r5)
            throw r6
    }

    public static /* synthetic */ okio.Buffer.UnsafeCursor readAndWriteUnsafe$default(okio.Buffer r0, okio.Buffer.UnsafeCursor r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L8
            okio.Buffer$UnsafeCursor r1 = okio.SegmentedByteString.getDEFAULT__new_UnsafeCursor()
        L8:
            okio.Buffer$UnsafeCursor r0 = r0.readAndWriteUnsafe(r1)
            return r0
    }

    private final void readFrom(java.io.InputStream r5, long r6, boolean r8) {
            r4 = this;
        L0:
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L8
            if (r8 == 0) goto L33
        L8:
            r0 = 1
            okio.Segment r0 = r4.writableSegment$okio(r0)
            int r1 = r0.limit
            int r1 = 8192 - r1
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r6, r1)
            int r1 = (int) r1
            byte[] r2 = r0.data
            int r3 = r0.limit
            int r1 = r5.read(r2, r3, r1)
            r2 = -1
            if (r1 != r2) goto L38
            int r5 = r0.pos
            int r6 = r0.limit
            if (r5 != r6) goto L31
            okio.Segment r5 = r0.pop()
            r4.head = r5
            okio.SegmentPool.recycle(r0)
        L31:
            if (r8 == 0) goto L34
        L33:
            return
        L34:
            j8.o.a()
            return
        L38:
            int r2 = r0.limit
            int r2 = r2 + r1
            r0.limit = r2
            long r2 = r4.size
            long r0 = (long) r1
            long r2 = r2 + r0
            r4.size = r2
            long r6 = r6 - r0
            goto L0
    }

    public static /* synthetic */ okio.Buffer.UnsafeCursor readUnsafe$default(okio.Buffer r0, okio.Buffer.UnsafeCursor r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L8
            okio.Buffer$UnsafeCursor r1 = okio.SegmentedByteString.getDEFAULT__new_UnsafeCursor()
        L8:
            okio.Buffer$UnsafeCursor r0 = r0.readUnsafe(r1)
            return r0
    }

    public static /* synthetic */ okio.Buffer writeTo$default(okio.Buffer r0, java.io.OutputStream r1, long r2, int r4, java.lang.Object r5) {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            long r2 = r0.size
        L6:
            okio.Buffer r0 = r0.writeTo(r1, r2)
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m152deprecated_getByte(long r1) {
            r0 = this;
            byte r1 = r0.getByte(r1)
            return r1
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final long m153deprecated_size() {
            r2 = this;
            long r0 = r2.size
            return r0
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public okio.Buffer buffer() {
            r0 = this;
            return r0
    }

    public final void clear() {
            r2 = this;
            long r0 = r2.size()
            r2.skip(r0)
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            okio.Buffer r0 = r1.m154clone()
            return r0
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public okio.Buffer m154clone() {
            r1 = this;
            okio.Buffer r0 = r1.copy()
            return r0
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    public final long completeSegmentByteCount() {
            r5 = this;
            long r0 = r5.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            return r2
        Lb:
            okio.Segment r2 = r5.head
            r2.getClass()
            okio.Segment r2 = r2.prev
            r2.getClass()
            int r3 = r2.limit
            r4 = 8192(0x2000, float:1.148E-41)
            if (r3 >= r4) goto L24
            boolean r4 = r2.owner
            if (r4 == 0) goto L24
            int r2 = r2.pos
            int r3 = r3 - r2
            long r2 = (long) r3
            long r0 = r0 - r2
        L24:
            return r0
    }

    public final okio.Buffer copy() {
            r6 = this;
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            long r1 = r6.size()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L10
            return r0
        L10:
            okio.Segment r1 = r6.head
            r1.getClass()
            okio.Segment r2 = r1.sharedCopy()
            r0.head = r2
            r2.prev = r2
            r2.next = r2
            okio.Segment r3 = r1.next
        L21:
            if (r3 == r1) goto L35
            okio.Segment r4 = r2.prev
            r4.getClass()
            r3.getClass()
            okio.Segment r5 = r3.sharedCopy()
            r4.push(r5)
            okio.Segment r3 = r3.next
            goto L21
        L35:
            long r1 = r6.size()
            r0.setSize$okio(r1)
            return r0
    }

    public final okio.Buffer copyTo(java.io.OutputStream r9) {
            r8 = this;
            r9.getClass()
            r6 = 6
            r7 = 0
            r2 = 0
            r4 = 0
            r0 = r8
            r1 = r9
            okio.Buffer r9 = copyTo$default(r0, r1, r2, r4, r6, r7)
            return r9
    }

    public final okio.Buffer copyTo(java.io.OutputStream r9, long r10) {
            r8 = this;
            r9.getClass()
            r6 = 4
            r7 = 0
            r4 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            okio.Buffer r9 = copyTo$default(r0, r1, r2, r4, r6, r7)
            return r9
    }

    public final okio.Buffer copyTo(java.io.OutputStream r9, long r10, long r12) {
            r8 = this;
            r9.getClass()
            long r0 = r8.size
            r2 = r10
            r4 = r12
            okio.SegmentedByteString.checkOffsetAndCount(r0, r2, r4)
            r10 = 0
            int r12 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r12 != 0) goto L11
            goto L49
        L11:
            okio.Segment r12 = r8.head
        L13:
            r12.getClass()
            int r13 = r12.limit
            int r0 = r12.pos
            int r1 = r13 - r0
            long r6 = (long) r1
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 < 0) goto L27
            int r13 = r13 - r0
            long r0 = (long) r13
            long r2 = r2 - r0
            okio.Segment r12 = r12.next
            goto L13
        L27:
            r0 = r12
            r12 = r4
        L29:
            int r1 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r1 <= 0) goto L49
            r0.getClass()
            int r1 = r0.pos
            long r4 = (long) r1
            long r4 = r4 + r2
            int r1 = (int) r4
            int r2 = r0.limit
            int r2 = r2 - r1
            long r2 = (long) r2
            long r2 = java.lang.Math.min(r2, r12)
            int r2 = (int) r2
            byte[] r3 = r0.data
            r9.write(r3, r1, r2)
            long r1 = (long) r2
            long r12 = r12 - r1
            okio.Segment r0 = r0.next
            r2 = r10
            goto L29
        L49:
            return r8
    }

    public final okio.Buffer copyTo(okio.Buffer r9, long r10) {
            r8 = this;
            r9.getClass()
            long r0 = r8.size
            long r6 = r0 - r10
            r2 = r8
            r3 = r9
            r4 = r10
            okio.Buffer r9 = r2.copyTo(r3, r4, r6)
            return r9
    }

    public final okio.Buffer copyTo(okio.Buffer r9, long r10, long r12) {
            r8 = this;
            r9.getClass()
            long r0 = r8.size()
            r2 = r10
            r4 = r12
            okio.SegmentedByteString.checkOffsetAndCount(r0, r2, r4)
            r10 = 0
            int r12 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r12 != 0) goto L13
            goto L6f
        L13:
            long r12 = r9.size()
            long r12 = r12 + r4
            r9.setSize$okio(r12)
            okio.Segment r12 = r8.head
        L1d:
            r12.getClass()
            int r13 = r12.limit
            int r0 = r12.pos
            int r1 = r13 - r0
            long r6 = (long) r1
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 < 0) goto L31
            int r13 = r13 - r0
            long r0 = (long) r13
            long r2 = r2 - r0
            okio.Segment r12 = r12.next
            goto L1d
        L31:
            r0 = r12
            r12 = r4
        L33:
            int r1 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r1 <= 0) goto L6f
            r0.getClass()
            okio.Segment r1 = r0.sharedCopy()
            int r4 = r1.pos
            int r2 = (int) r2
            int r4 = r4 + r2
            r1.pos = r4
            int r2 = (int) r12
            int r4 = r4 + r2
            int r2 = r1.limit
            int r2 = java.lang.Math.min(r4, r2)
            r1.limit = r2
            okio.Segment r2 = r9.head
            if (r2 != 0) goto L59
            r1.prev = r1
            r1.next = r1
            r9.head = r1
            goto L64
        L59:
            r2.getClass()
            okio.Segment r2 = r2.prev
            r2.getClass()
            r2.push(r1)
        L64:
            int r2 = r1.limit
            int r1 = r1.pos
            int r2 = r2 - r1
            long r1 = (long) r2
            long r12 = r12 - r1
            okio.Segment r0 = r0.next
            r2 = r10
            goto L33
        L6f:
            return r8
    }

    @Override // okio.BufferedSink
    public okio.Buffer emit() {
            r0 = this;
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink emit() {
            r1 = this;
            okio.Buffer r0 = r1.emit()
            return r0
    }

    @Override // okio.BufferedSink
    public okio.Buffer emitCompleteSegments() {
            r0 = this;
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink emitCompleteSegments() {
            r1 = this;
            okio.Buffer r0 = r1.emitCompleteSegments()
            return r0
    }

    public boolean equals(java.lang.Object r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r0 != r1) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof okio.Buffer
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            long r5 = r0.size()
            okio.Buffer r1 = (okio.Buffer) r1
            long r7 = r1.size()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L1d
            return r4
        L1d:
            long r5 = r0.size()
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L28
            return r2
        L28:
            okio.Segment r3 = r0.head
            r3.getClass()
            okio.Segment r1 = r1.head
            r1.getClass()
            int r5 = r3.pos
            int r6 = r1.pos
            r9 = r7
        L37:
            long r11 = r0.size()
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L7e
            int r11 = r3.limit
            int r11 = r11 - r5
            int r12 = r1.limit
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L4b:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L66
            byte[] r15 = r3.data
            int r16 = r5 + 1
            r5 = r15[r5]
            byte[] r15 = r1.data
            int r17 = r6 + 1
            r6 = r15[r6]
            if (r5 == r6) goto L5e
            return r4
        L5e:
            r5 = 1
            long r13 = r13 + r5
            r5 = r16
            r6 = r17
            goto L4b
        L66:
            int r13 = r3.limit
            if (r5 != r13) goto L71
            okio.Segment r3 = r3.next
            r3.getClass()
            int r5 = r3.pos
        L71:
            int r13 = r1.limit
            if (r6 != r13) goto L7c
            okio.Segment r1 = r1.next
            r1.getClass()
            int r6 = r1.pos
        L7c:
            long r9 = r9 + r11
            goto L37
        L7e:
            return r2
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
            r4 = this;
            long r0 = r4.size
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
            r0 = this;
            return
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public okio.Buffer getBuffer() {
            r0 = this;
            return r0
    }

    public final byte getByte(long r8) {
            r7 = this;
            long r0 = r7.size()
            r4 = 1
            r2 = r8
            okio.SegmentedByteString.checkOffsetAndCount(r0, r2, r4)
            okio.Segment r8 = r7.head
            r8.getClass()
            long r0 = r7.size()
            long r0 = r0 - r2
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 >= 0) goto L38
            long r0 = r7.size()
        L1c:
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 <= 0) goto L2d
            okio.Segment r8 = r8.prev
            r8.getClass()
            int r9 = r8.limit
            int r4 = r8.pos
            int r9 = r9 - r4
            long r4 = (long) r9
            long r0 = r0 - r4
            goto L1c
        L2d:
            byte[] r9 = r8.data
            int r8 = r8.pos
            long r4 = (long) r8
            long r4 = r4 + r2
            long r4 = r4 - r0
            int r8 = (int) r4
            r8 = r9[r8]
            return r8
        L38:
            r0 = 0
        L3a:
            int r9 = r8.limit
            int r4 = r8.pos
            int r9 = r9 - r4
            long r5 = (long) r9
            long r5 = r5 + r0
            int r9 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r9 > 0) goto L4c
            okio.Segment r8 = r8.next
            r8.getClass()
            r0 = r5
            goto L3a
        L4c:
            byte[] r8 = r8.data
            long r4 = (long) r4
            long r4 = r4 + r2
            long r4 = r4 - r0
            int r9 = (int) r4
            r8 = r8[r9]
            return r8
    }

    public int hashCode() {
            r5 = this;
            okio.Segment r0 = r5.head
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r1 = 1
        L7:
            int r2 = r0.pos
            int r3 = r0.limit
        Lb:
            if (r2 >= r3) goto L17
            int r1 = r1 * 31
            byte[] r4 = r0.data
            r4 = r4[r2]
            int r1 = r1 + r4
            int r2 = r2 + 1
            goto Lb
        L17:
            okio.Segment r0 = r0.next
            r0.getClass()
            okio.Segment r2 = r5.head
            if (r0 != r2) goto L7
            return r1
    }

    public final okio.ByteString hmacSha1(okio.ByteString r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r0 = "HmacSHA1"
            okio.ByteString r2 = r1.hmac(r0, r2)
            return r2
    }

    public final okio.ByteString hmacSha256(okio.ByteString r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r0 = "HmacSHA256"
            okio.ByteString r2 = r1.hmac(r0, r2)
            return r2
    }

    public final okio.ByteString hmacSha512(okio.ByteString r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r0 = "HmacSHA512"
            okio.ByteString r2 = r1.hmac(r0, r2)
            return r2
    }

    @Override // okio.BufferedSource
    public long indexOf(byte r7) {
            r6 = this;
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = r6
            r1 = r7
            long r1 = r0.indexOf(r1, r2, r4)
            return r1
    }

    @Override // okio.BufferedSource
    public long indexOf(byte r7, long r8) {
            r6 = this;
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = r6
            r1 = r7
            r2 = r8
            long r7 = r0.indexOf(r1, r2, r4)
            return r7
    }

    @Override // okio.BufferedSource
    public long indexOf(byte r11, long r12, long r14) {
            r10 = this;
            r0 = 0
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 > 0) goto Lbb
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 > 0) goto Lbb
            long r2 = r10.size()
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 <= 0) goto L16
            long r14 = r10.size()
        L16:
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            r3 = -1
            if (r2 != 0) goto L1d
            return r3
        L1d:
            okio.Segment r2 = r10.head
            if (r2 != 0) goto L22
            return r3
        L22:
            long r5 = r10.size()
            long r5 = r5 - r12
            int r5 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r5 >= 0) goto L77
            long r0 = r10.size()
        L2f:
            int r5 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r5 <= 0) goto L40
            okio.Segment r2 = r2.prev
            r2.getClass()
            int r5 = r2.limit
            int r6 = r2.pos
            int r5 = r5 - r6
            long r5 = (long) r5
            long r0 = r0 - r5
            goto L2f
        L40:
            int r5 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r5 >= 0) goto L76
            byte[] r5 = r2.data
            int r6 = r2.limit
            long r6 = (long) r6
            int r8 = r2.pos
            long r8 = (long) r8
            long r8 = r8 + r14
            long r8 = r8 - r0
            long r6 = java.lang.Math.min(r6, r8)
            int r6 = (int) r6
            int r7 = r2.pos
            long r7 = (long) r7
            long r7 = r7 + r12
            long r7 = r7 - r0
            int r12 = (int) r7
        L59:
            if (r12 >= r6) goto L68
            r13 = r5[r12]
            if (r13 != r11) goto L65
        L5f:
            int r11 = r2.pos
            int r12 = r12 - r11
            long r11 = (long) r12
            long r11 = r11 + r0
            return r11
        L65:
            int r12 = r12 + 1
            goto L59
        L68:
            int r12 = r2.limit
            int r13 = r2.pos
            int r12 = r12 - r13
            long r12 = (long) r12
            long r0 = r0 + r12
            okio.Segment r2 = r2.next
            r2.getClass()
            r12 = r0
            goto L40
        L76:
            return r3
        L77:
            int r5 = r2.limit
            int r6 = r2.pos
            int r5 = r5 - r6
            long r5 = (long) r5
            long r5 = r5 + r0
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 > 0) goto L89
            okio.Segment r2 = r2.next
            r2.getClass()
            r0 = r5
            goto L77
        L89:
            int r5 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r5 >= 0) goto Lba
            byte[] r5 = r2.data
            int r6 = r2.limit
            long r6 = (long) r6
            int r8 = r2.pos
            long r8 = (long) r8
            long r8 = r8 + r14
            long r8 = r8 - r0
            long r6 = java.lang.Math.min(r6, r8)
            int r6 = (int) r6
            int r7 = r2.pos
            long r7 = (long) r7
            long r7 = r7 + r12
            long r7 = r7 - r0
            int r12 = (int) r7
        La2:
            if (r12 >= r6) goto Lac
            r13 = r5[r12]
            if (r13 != r11) goto La9
            goto L5f
        La9:
            int r12 = r12 + 1
            goto La2
        Lac:
            int r12 = r2.limit
            int r13 = r2.pos
            int r12 = r12 - r13
            long r12 = (long) r12
            long r0 = r0 + r12
            okio.Segment r2 = r2.next
            r2.getClass()
            r12 = r0
            goto L89
        Lba:
            return r3
        Lbb:
            long r0 = r10.size()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r2 = "size="
            r11.<init>(r2)
            r11.append(r0)
            java.lang.String r0 = " fromIndex="
            r11.append(r0)
            r11.append(r12)
            java.lang.String r12 = " toIndex="
            r11.append(r12)
            r11.append(r14)
            java.lang.String r11 = r11.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
    }

    @Override // okio.BufferedSource
    public long indexOf(okio.ByteString r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            long r0 = r2.indexOf(r3, r0)
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOf(okio.ByteString r19, long r20) {
            r18 = this;
            r0 = r20
            r19.getClass()
            int r2 = r19.size()
            if (r2 <= 0) goto L111
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L103
            r4 = r18
            okio.Segment r5 = r4.head
            r6 = -1
            if (r5 != 0) goto L1a
            return r6
        L1a:
            long r8 = r4.size()
            long r8 = r8 - r0
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r9 = 1
            r11 = 0
            if (r8 >= 0) goto L99
            long r2 = r4.size()
        L2a:
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 <= 0) goto L3b
            okio.Segment r5 = r5.prev
            r5.getClass()
            int r8 = r5.limit
            int r13 = r5.pos
            int r8 = r8 - r13
            long r13 = (long) r8
            long r2 = r2 - r13
            goto L2a
        L3b:
            byte[] r8 = r19.internalArray$okio()
            r11 = r8[r11]
            int r13 = r19.size()
            long r14 = r4.size()
            r16 = r6
            long r6 = (long) r13
            long r14 = r14 - r6
            long r14 = r14 + r9
        L4e:
            int r6 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r6 >= 0) goto L98
            byte[] r6 = r5.data
            int r7 = r5.limit
            int r9 = r5.pos
            long r9 = (long) r9
            long r9 = r9 + r14
            long r9 = r9 - r2
            r19 = r13
            long r12 = (long) r7
            long r9 = java.lang.Math.min(r12, r9)
            int r7 = (int) r9
            int r9 = r5.pos
            long r9 = (long) r9
            long r9 = r9 + r0
            long r9 = r9 - r2
            int r0 = (int) r9
        L69:
            if (r0 >= r7) goto L87
            r1 = r6[r0]
            if (r1 != r11) goto L80
            int r1 = r0 + 1
            r9 = r19
            r10 = 1
            boolean r1 = okio.internal.Buffer.rangeEquals(r5, r1, r8, r10, r9)
            if (r1 == 0) goto L82
            int r1 = r5.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r0 = r0 + r2
            return r0
        L80:
            r9 = r19
        L82:
            int r0 = r0 + 1
            r19 = r9
            goto L69
        L87:
            r9 = r19
            int r0 = r5.limit
            int r1 = r5.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r2 = r2 + r0
            okio.Segment r5 = r5.next
            r5.getClass()
            r0 = r2
            r13 = r9
            goto L4e
        L98:
            return r16
        L99:
            r16 = r6
        L9b:
            int r6 = r5.limit
            int r7 = r5.pos
            int r6 = r6 - r7
            long r6 = (long) r6
            long r6 = r6 + r2
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 > 0) goto Lad
            okio.Segment r5 = r5.next
            r5.getClass()
            r2 = r6
            goto L9b
        Lad:
            byte[] r6 = r19.internalArray$okio()
            r7 = r6[r11]
            int r8 = r19.size()
            long r11 = r4.size()
            long r13 = (long) r8
            long r11 = r11 - r13
            long r11 = r11 + r9
        Lbe:
            int r9 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r9 >= 0) goto L102
            byte[] r9 = r5.data
            int r10 = r5.limit
            int r13 = r5.pos
            long r13 = (long) r13
            long r13 = r13 + r11
            long r13 = r13 - r2
            r19 = r0
            long r0 = (long) r10
            long r0 = java.lang.Math.min(r0, r13)
            int r0 = (int) r0
            int r1 = r5.pos
            long r13 = (long) r1
            long r13 = r13 + r19
            long r13 = r13 - r2
            int r1 = (int) r13
        Lda:
            if (r1 >= r0) goto Lf3
            r10 = r9[r1]
            if (r10 != r7) goto Lef
            int r10 = r1 + 1
            r13 = 1
            boolean r10 = okio.internal.Buffer.rangeEquals(r5, r10, r6, r13, r8)
            if (r10 == 0) goto Lf0
            int r0 = r5.pos
            int r1 = r1 - r0
            long r0 = (long) r1
            long r0 = r0 + r2
            return r0
        Lef:
            r13 = 1
        Lf0:
            int r1 = r1 + 1
            goto Lda
        Lf3:
            r13 = 1
            int r0 = r5.limit
            int r1 = r5.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r2 = r2 + r0
            okio.Segment r5 = r5.next
            r5.getClass()
            r0 = r2
            goto Lbe
        L102:
            return r16
        L103:
            r4 = r18
            java.lang.String r2 = "fromIndex < 0: "
            java.lang.String r0 = bc.e.g(r0, r2)
            j8.o.q(r0)
            r0 = 0
            return r0
        L111:
            r4 = r18
            java.lang.String r0 = "bytes is empty"
            j8.o.t(r0)
            r0 = 0
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOfElement(okio.ByteString r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            long r0 = r2.indexOfElement(r3, r0)
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOfElement(okio.ByteString r12, long r13) {
            r11 = this;
            r12.getClass()
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 < 0) goto L13d
            okio.Segment r2 = r11.head
            r3 = -1
            if (r2 != 0) goto L10
            return r3
        L10:
            long r5 = r11.size()
            long r5 = r5 - r13
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            r6 = 2
            r7 = 0
            r8 = 1
            if (r5 >= 0) goto Lae
            long r0 = r11.size()
        L20:
            int r5 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r5 <= 0) goto L31
            okio.Segment r2 = r2.prev
            r2.getClass()
            int r5 = r2.limit
            int r9 = r2.pos
            int r5 = r5 - r9
            long r9 = (long) r5
            long r0 = r0 - r9
            goto L20
        L31:
            int r5 = r12.size()
            if (r5 != r6) goto L71
            byte r5 = r12.getByte(r7)
            byte r12 = r12.getByte(r8)
        L3f:
            long r6 = r11.size()
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 >= 0) goto Lad
            byte[] r6 = r2.data
            int r7 = r2.pos
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            int r13 = (int) r7
            int r14 = r2.limit
        L51:
            if (r13 >= r14) goto L63
            r7 = r6[r13]
            if (r7 == r5) goto L5d
            if (r7 != r12) goto L5a
            goto L5d
        L5a:
            int r13 = r13 + 1
            goto L51
        L5d:
            int r12 = r2.pos
            int r13 = r13 - r12
            long r12 = (long) r13
            long r12 = r12 + r0
            return r12
        L63:
            int r13 = r2.limit
            int r14 = r2.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r2 = r2.next
            r2.getClass()
            r13 = r0
            goto L3f
        L71:
            byte[] r12 = r12.internalArray$okio()
        L75:
            long r5 = r11.size()
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto Lad
            byte[] r5 = r2.data
            int r6 = r2.pos
            long r8 = (long) r6
            long r8 = r8 + r13
            long r8 = r8 - r0
            int r13 = (int) r8
            int r14 = r2.limit
        L87:
            if (r13 >= r14) goto L9f
            r6 = r5[r13]
            int r8 = r12.length
            r9 = r7
        L8d:
            if (r9 >= r8) goto L9c
            r10 = r12[r9]
            if (r6 != r10) goto L99
            int r12 = r2.pos
            int r13 = r13 - r12
            long r12 = (long) r13
            long r12 = r12 + r0
            return r12
        L99:
            int r9 = r9 + 1
            goto L8d
        L9c:
            int r13 = r13 + 1
            goto L87
        L9f:
            int r13 = r2.limit
            int r14 = r2.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r2 = r2.next
            r2.getClass()
            r13 = r0
            goto L75
        Lad:
            return r3
        Lae:
            int r5 = r2.limit
            int r9 = r2.pos
            int r5 = r5 - r9
            long r9 = (long) r5
            long r9 = r9 + r0
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 > 0) goto Lc0
            okio.Segment r2 = r2.next
            r2.getClass()
            r0 = r9
            goto Lae
        Lc0:
            int r5 = r12.size()
            if (r5 != r6) goto L100
            byte r5 = r12.getByte(r7)
            byte r12 = r12.getByte(r8)
        Lce:
            long r6 = r11.size()
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 >= 0) goto L13c
            byte[] r6 = r2.data
            int r7 = r2.pos
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            int r13 = (int) r7
            int r14 = r2.limit
        Le0:
            if (r13 >= r14) goto Lf2
            r7 = r6[r13]
            if (r7 == r5) goto Lec
            if (r7 != r12) goto Le9
            goto Lec
        Le9:
            int r13 = r13 + 1
            goto Le0
        Lec:
            int r12 = r2.pos
            int r13 = r13 - r12
            long r12 = (long) r13
            long r12 = r12 + r0
            return r12
        Lf2:
            int r13 = r2.limit
            int r14 = r2.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r2 = r2.next
            r2.getClass()
            r13 = r0
            goto Lce
        L100:
            byte[] r12 = r12.internalArray$okio()
        L104:
            long r5 = r11.size()
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L13c
            byte[] r5 = r2.data
            int r6 = r2.pos
            long r8 = (long) r6
            long r8 = r8 + r13
            long r8 = r8 - r0
            int r13 = (int) r8
            int r14 = r2.limit
        L116:
            if (r13 >= r14) goto L12e
            r6 = r5[r13]
            int r8 = r12.length
            r9 = r7
        L11c:
            if (r9 >= r8) goto L12b
            r10 = r12[r9]
            if (r6 != r10) goto L128
            int r12 = r2.pos
            int r13 = r13 - r12
            long r12 = (long) r13
            long r12 = r12 + r0
            return r12
        L128:
            int r9 = r9 + 1
            goto L11c
        L12b:
            int r13 = r13 + 1
            goto L116
        L12e:
            int r13 = r2.limit
            int r14 = r2.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r2 = r2.next
            r2.getClass()
            r13 = r0
            goto L104
        L13c:
            return r3
        L13d:
            java.lang.String r12 = "fromIndex < 0: "
            java.lang.String r12 = bc.e.g(r13, r12)
            j8.o.q(r12)
            r12 = 0
            return r12
    }

    @Override // okio.BufferedSource
    public java.io.InputStream inputStream() {
            r1 = this;
            okio.Buffer$inputStream$1 r0 = new okio.Buffer$inputStream$1
            r0.<init>(r1)
            return r0
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final okio.ByteString md5() {
            r1 = this;
            java.lang.String r0 = "MD5"
            okio.ByteString r0 = r1.digest(r0)
            return r0
    }

    @Override // okio.BufferedSink
    public java.io.OutputStream outputStream() {
            r1 = this;
            okio.Buffer$outputStream$1 r0 = new okio.Buffer$outputStream$1
            r0.<init>(r1)
            return r0
    }

    @Override // okio.BufferedSource
    public okio.BufferedSource peek() {
            r1 = this;
            okio.PeekSource r0 = new okio.PeekSource
            r0.<init>(r1)
            okio.BufferedSource r0 = okio.Okio.buffer(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long r7, okio.ByteString r9) {
            r6 = this;
            r9.getClass()
            r4 = 0
            int r5 = r9.size()
            r0 = r6
            r1 = r7
            r3 = r9
            boolean r7 = r0.rangeEquals(r1, r3, r4, r5)
            return r7
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long r7, okio.ByteString r9, int r10, int r11) {
            r6 = this;
            r9.getClass()
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L37
            if (r10 < 0) goto L37
            if (r11 < 0) goto L37
            long r2 = r6.size()
            long r2 = r2 - r7
            long r4 = (long) r11
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L37
            int r0 = r9.size()
            int r0 = r0 - r10
            if (r0 >= r11) goto L20
            goto L37
        L20:
            r0 = r1
        L21:
            if (r0 >= r11) goto L35
            long r2 = (long) r0
            long r2 = r2 + r7
            byte r2 = r6.getByte(r2)
            int r3 = r10 + r0
            byte r3 = r9.getByte(r3)
            if (r2 == r3) goto L32
            return r1
        L32:
            int r0 = r0 + 1
            goto L21
        L35:
            r7 = 1
            return r7
        L37:
            return r1
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer r7) {
            r6 = this;
            r7.getClass()
            okio.Segment r0 = r6.head
            if (r0 != 0) goto L9
            r7 = -1
            return r7
        L9:
            int r1 = r7.remaining()
            int r2 = r0.limit
            int r3 = r0.pos
            int r2 = r2 - r3
            int r1 = java.lang.Math.min(r1, r2)
            byte[] r2 = r0.data
            int r3 = r0.pos
            r7.put(r2, r3, r1)
            int r7 = r0.pos
            int r7 = r7 + r1
            r0.pos = r7
            long r2 = r6.size
            long r4 = (long) r1
            long r2 = r2 - r4
            r6.size = r2
            int r2 = r0.limit
            if (r7 != r2) goto L35
            okio.Segment r7 = r0.pop()
            r6.head = r7
            okio.SegmentPool.recycle(r0)
        L35:
            return r1
    }

    @Override // okio.BufferedSource
    public int read(byte[] r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            int r1 = r3.length
            int r3 = r2.read(r3, r0, r1)
            return r3
    }

    @Override // okio.BufferedSource
    public int read(byte[] r8, int r9, int r10) {
            r7 = this;
            r8.getClass()
            int r0 = r8.length
            long r1 = (long) r0
            long r3 = (long) r9
            long r5 = (long) r10
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            okio.Segment r0 = r7.head
            if (r0 != 0) goto L10
            r8 = -1
            return r8
        L10:
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            int r10 = java.lang.Math.min(r10, r1)
            byte[] r1 = r0.data
            int r2 = r0.pos
            int r3 = r2 + r10
            tf.l.o0(r1, r9, r2, r8, r3)
            int r8 = r0.pos
            int r8 = r8 + r10
            r0.pos = r8
            long r8 = r7.size()
            long r1 = (long) r10
            long r8 = r8 - r1
            r7.setSize$okio(r8)
            int r8 = r0.pos
            int r9 = r0.limit
            if (r8 != r9) goto L3f
            okio.Segment r8 = r0.pop()
            r7.head = r8
            okio.SegmentPool.recycle(r0)
        L3f:
            return r10
    }

    @Override // okio.Source
    public long read(okio.Buffer r5, long r6) {
            r4 = this;
            r5.getClass()
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L24
            long r2 = r4.size()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L14
            r5 = -1
            return r5
        L14:
            long r0 = r4.size()
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L20
            long r6 = r4.size()
        L20:
            r5.write(r4, r6)
            return r6
        L24:
            java.lang.String r5 = "byteCount < 0: "
            java.lang.String r5 = bc.e.g(r6, r5)
            j8.o.q(r5)
            r5 = 0
            return r5
    }

    @Override // okio.BufferedSource
    public long readAll(okio.Sink r5) {
            r4 = this;
            r5.getClass()
            long r0 = r4.size()
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L10
            r5.write(r4, r0)
        L10:
            return r0
    }

    public final okio.Buffer.UnsafeCursor readAndWriteUnsafe() {
            r2 = this;
            r0 = 0
            r1 = 1
            okio.Buffer$UnsafeCursor r0 = readAndWriteUnsafe$default(r2, r0, r1, r0)
            return r0
    }

    public final okio.Buffer.UnsafeCursor readAndWriteUnsafe(okio.Buffer.UnsafeCursor r1) {
            r0 = this;
            r1.getClass()
            okio.Buffer$UnsafeCursor r1 = okio.internal.Buffer.commonReadAndWriteUnsafe(r0, r1)
            return r1
    }

    @Override // okio.BufferedSource
    public byte readByte() {
            r9 = this;
            long r0 = r9.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L32
            okio.Segment r0 = r9.head
            r0.getClass()
            int r1 = r0.pos
            int r2 = r0.limit
            byte[] r3 = r0.data
            int r4 = r1 + 1
            r1 = r3[r1]
            long r5 = r9.size()
            r7 = 1
            long r5 = r5 - r7
            r9.setSize$okio(r5)
            if (r4 != r2) goto L2f
            okio.Segment r2 = r0.pop()
            r9.head = r2
            okio.SegmentPool.recycle(r0)
            return r1
        L2f:
            r0.pos = r4
            return r1
        L32:
            j8.o.a()
            r0 = 0
            return r0
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray() {
            r2 = this;
            long r0 = r2.size()
            byte[] r0 = r2.readByteArray(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray(long r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L21
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L21
            long r0 = r2.size()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L1c
            int r3 = (int) r3
            byte[] r3 = new byte[r3]
            r2.readFully(r3)
            return r3
        L1c:
            j8.o.a()
            r3 = 0
            return r3
        L21:
            java.lang.String r0 = "byteCount: "
            java.lang.String r3 = bc.e.g(r3, r0)
            j8.o.q(r3)
            r3 = 0
            return r3
    }

    @Override // okio.BufferedSource
    public okio.ByteString readByteString() {
            r2 = this;
            long r0 = r2.size()
            okio.ByteString r0 = r2.readByteString(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public okio.ByteString readByteString(long r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L33
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L33
            long r0 = r2.size()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L2e
            r0 = 4096(0x1000, double:2.0237E-320)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L24
            int r0 = (int) r3
            okio.ByteString r0 = r2.snapshot(r0)
            r2.skip(r3)
            return r0
        L24:
            okio.ByteString r0 = new okio.ByteString
            byte[] r3 = r2.readByteArray(r3)
            r0.<init>(r3)
            return r0
        L2e:
            j8.o.a()
        L31:
            r3 = 0
            return r3
        L33:
            java.lang.String r0 = "byteCount: "
            java.lang.String r3 = bc.e.g(r3, r0)
            j8.o.q(r3)
            goto L31
    }

    @Override // okio.BufferedSource
    public long readDecimalLong() {
            r19 = this;
            r0 = r19
            long r1 = r0.size()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto Ld7
            r1 = 0
            r5 = -7
            r2 = r1
            r8 = r3
            r6 = r5
            r5 = r2
        L13:
            okio.Segment r10 = r0.head
            r10.getClass()
            byte[] r11 = r10.data
            int r12 = r10.pos
            int r13 = r10.limit
        L1e:
            if (r12 >= r13) goto L78
            r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L63
            r14 = 57
            if (r15 > r14) goto L63
            int r14 = 48 - r15
            r16 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r16 < 0) goto L45
            r17 = r3
            if (r16 != 0) goto L3f
            long r3 = (long) r14
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 >= 0) goto L3f
            goto L45
        L3f:
            r3 = 10
            long r8 = r8 * r3
            long r3 = (long) r14
            long r8 = r8 + r3
            goto L6f
        L45:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            okio.Buffer r1 = r1.writeDecimalLong(r8)
            okio.Buffer r1 = r1.writeByte(r15)
            if (r2 != 0) goto L57
            r1.readByte()
        L57:
            java.lang.String r2 = "Number too large: "
            java.lang.String r1 = r1.readUtf8()
            j8.o.v(r1, r2)
        L60:
            r1 = 0
            return r1
        L63:
            r17 = r3
            r3 = 45
            if (r15 != r3) goto L76
            if (r1 != 0) goto L76
            r2 = 1
            long r6 = r6 - r2
            r2 = 1
        L6f:
            int r12 = r12 + 1
            int r1 = r1 + 1
            r3 = r17
            goto L1e
        L76:
            r5 = 1
            goto L7a
        L78:
            r17 = r3
        L7a:
            if (r12 != r13) goto L86
            okio.Segment r3 = r10.pop()
            r0.head = r3
            okio.SegmentPool.recycle(r10)
            goto L88
        L86:
            r10.pos = r12
        L88:
            if (r5 != 0) goto L92
            okio.Segment r3 = r0.head
            if (r3 != 0) goto L8f
            goto L92
        L8f:
            r3 = r17
            goto L13
        L92:
            long r3 = r0.size()
            long r5 = (long) r1
            long r3 = r3 - r5
            r0.setSize$okio(r3)
            if (r2 == 0) goto L9f
            r14 = 2
            goto La0
        L9f:
            r14 = 1
        La0:
            if (r1 >= r14) goto Ld2
            long r3 = r0.size()
            int r1 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r1 == 0) goto Lce
            if (r2 == 0) goto Laf
            java.lang.String r1 = "Expected a digit"
            goto Lb1
        Laf:
            java.lang.String r1 = "Expected a digit or '-'"
        Lb1:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r3 = " but was 0x"
            java.lang.StringBuilder r1 = bc.e.n(r1, r3)
            r3 = r17
            byte r3 = r0.getByte(r3)
            java.lang.String r3 = okio.SegmentedByteString.toHexString(r3)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        Lce:
            j8.o.a()
            goto L60
        Ld2:
            if (r2 == 0) goto Ld5
            return r8
        Ld5:
            long r1 = -r8
            return r1
        Ld7:
            j8.o.a()
            goto L60
    }

    public final okio.Buffer readFrom(java.io.InputStream r4) {
            r3 = this;
            r4.getClass()
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = 1
            r3.readFrom(r4, r0, r2)
            return r3
    }

    public final okio.Buffer readFrom(java.io.InputStream r3, long r4) {
            r2 = this;
            r3.getClass()
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto Le
            r0 = 0
            r2.readFrom(r3, r4, r0)
            return r2
        Le:
            java.lang.String r3 = "byteCount < 0: "
            java.lang.String r3 = bc.e.g(r4, r3)
            j8.o.q(r3)
            r3 = 0
            return r3
    }

    @Override // okio.BufferedSource
    public void readFully(okio.Buffer r3, long r4) {
            r2 = this;
            r3.getClass()
            long r0 = r2.size()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto Lf
            r3.write(r2, r4)
            return
        Lf:
            long r4 = r2.size()
            r3.write(r2, r4)
            j8.o.a()
            return
    }

    @Override // okio.BufferedSource
    public void readFully(byte[] r4) {
            r3 = this;
            r4.getClass()
            r0 = 0
        L4:
            int r1 = r4.length
            if (r0 >= r1) goto L15
            int r1 = r4.length
            int r1 = r1 - r0
            int r1 = r3.read(r4, r0, r1)
            r2 = -1
            if (r1 == r2) goto L12
            int r0 = r0 + r1
            goto L4
        L12:
            j8.o.a()
        L15:
            return
    }

    @Override // okio.BufferedSource
    public long readHexadecimalUnsignedLong() {
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L91
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            okio.Segment r6 = r14.head
            r6.getClass()
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L18:
            if (r8 >= r9) goto L73
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L65
            r11 = 70
            if (r10 > r11) goto L65
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r0 = r0.writeByte(r10)
            java.lang.String r1 = "Number too large: "
            java.lang.String r0 = r0.readUtf8()
            j8.o.v(r0, r1)
        L62:
            r0 = 0
            return r0
        L65:
            if (r0 == 0) goto L69
            r1 = 1
            goto L73
        L69:
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = okio.SegmentedByteString.toHexString(r10)
            j8.o.v(r1, r0)
            goto L62
        L73:
            if (r8 != r9) goto L7f
            okio.Segment r7 = r6.pop()
            r14.head = r7
            okio.SegmentPool.recycle(r6)
            goto L81
        L7f:
            r6.pos = r8
        L81:
            if (r1 != 0) goto L87
            okio.Segment r6 = r14.head
            if (r6 != 0) goto Ld
        L87:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        L91:
            j8.o.a()
            goto L62
    }

    @Override // okio.BufferedSource
    public int readInt() {
            r9 = this;
            long r0 = r9.size()
            r2 = 4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L76
            okio.Segment r0 = r9.head
            r0.getClass()
            int r1 = r0.pos
            int r4 = r0.limit
            int r5 = r4 - r1
            long r5 = (long) r5
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto L3c
            byte r0 = r9.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            byte r1 = r9.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            byte r1 = r9.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            byte r1 = r9.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            return r0
        L3c:
            byte[] r5 = r0.data
            int r6 = r1 + 1
            r7 = r5[r1]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 24
            int r8 = r1 + 2
            r6 = r5[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r6 = r6 | r7
            int r7 = r1 + 3
            r8 = r5[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            r6 = r6 | r8
            int r1 = r1 + 4
            r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r6
            long r6 = r9.size()
            long r6 = r6 - r2
            r9.setSize$okio(r6)
            if (r1 != r4) goto L73
            okio.Segment r1 = r0.pop()
            r9.head = r1
            okio.SegmentPool.recycle(r0)
            return r5
        L73:
            r0.pos = r1
            return r5
        L76:
            j8.o.a()
            r0 = 0
            return r0
    }

    @Override // okio.BufferedSource
    public int readIntLe() {
            r1 = this;
            int r0 = r1.readInt()
            int r0 = okio.SegmentedByteString.reverseBytes(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public long readLong() {
            r15 = this;
            long r0 = r15.size()
            r2 = 8
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L97
            okio.Segment r0 = r15.head
            r0.getClass()
            int r1 = r0.pos
            int r4 = r0.limit
            int r5 = r4 - r1
            long r5 = (long) r5
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 32
            if (r5 >= 0) goto L30
            int r0 = r15.readInt()
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = r0 << r6
            int r4 = r15.readInt()
            long r4 = (long) r4
            long r2 = r2 & r4
            long r0 = r0 | r2
            return r0
        L30:
            byte[] r5 = r0.data
            int r7 = r1 + 1
            r8 = r5[r1]
            long r8 = (long) r8
            r10 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r10
            r12 = 56
            long r8 = r8 << r12
            int r12 = r1 + 2
            r7 = r5[r7]
            long r13 = (long) r7
            long r13 = r13 & r10
            r7 = 48
            long r13 = r13 << r7
            long r7 = r8 | r13
            int r9 = r1 + 3
            r12 = r5[r12]
            long r12 = (long) r12
            long r12 = r12 & r10
            r14 = 40
            long r12 = r12 << r14
            long r7 = r7 | r12
            int r12 = r1 + 4
            r9 = r5[r9]
            long r13 = (long) r9
            long r13 = r13 & r10
            long r13 = r13 << r6
            long r6 = r7 | r13
            int r8 = r1 + 5
            r9 = r5[r12]
            long r12 = (long) r9
            long r12 = r12 & r10
            r9 = 24
            long r12 = r12 << r9
            long r6 = r6 | r12
            int r9 = r1 + 6
            r8 = r5[r8]
            long r12 = (long) r8
            long r12 = r12 & r10
            r8 = 16
            long r12 = r12 << r8
            long r6 = r6 | r12
            int r8 = r1 + 7
            r9 = r5[r9]
            long r12 = (long) r9
            long r12 = r12 & r10
            r9 = 8
            long r12 = r12 << r9
            long r6 = r6 | r12
            int r1 = r1 + r9
            r5 = r5[r8]
            long r8 = (long) r5
            long r8 = r8 & r10
            long r5 = r6 | r8
            long r7 = r15.size()
            long r7 = r7 - r2
            r15.setSize$okio(r7)
            if (r1 != r4) goto L94
            okio.Segment r1 = r0.pop()
            r15.head = r1
            okio.SegmentPool.recycle(r0)
            return r5
        L94:
            r0.pos = r1
            return r5
        L97:
            j8.o.a()
            r0 = 0
            return r0
    }

    @Override // okio.BufferedSource
    public long readLongLe() {
            r2 = this;
            long r0 = r2.readLong()
            long r0 = okio.SegmentedByteString.reverseBytes(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public short readShort() {
            r9 = this;
            long r0 = r9.size()
            r2 = 2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L51
            okio.Segment r0 = r9.head
            r0.getClass()
            int r1 = r0.pos
            int r4 = r0.limit
            int r5 = r4 - r1
            r6 = 2
            if (r5 >= r6) goto L29
            byte r0 = r9.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            byte r1 = r9.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            short r0 = (short) r0
            return r0
        L29:
            byte[] r5 = r0.data
            int r7 = r1 + 1
            r8 = r5[r1]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            int r1 = r1 + r6
            r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r8
            long r6 = r9.size()
            long r6 = r6 - r2
            r9.setSize$okio(r6)
            if (r1 != r4) goto L4d
            okio.Segment r1 = r0.pop()
            r9.head = r1
            okio.SegmentPool.recycle(r0)
            goto L4f
        L4d:
            r0.pos = r1
        L4f:
            short r0 = (short) r5
            return r0
        L51:
            j8.o.a()
            r0 = 0
            return r0
    }

    @Override // okio.BufferedSource
    public short readShortLe() {
            r1 = this;
            short r0 = r1.readShort()
            short r0 = okio.SegmentedByteString.reverseBytes(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readString(long r7, java.nio.charset.Charset r9) {
            r6 = this;
            r9.getClass()
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L5a
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 > 0) goto L5a
            long r1 = r6.size
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 < 0) goto L55
            if (r0 != 0) goto L1b
            java.lang.String r7 = ""
            return r7
        L1b:
            okio.Segment r0 = r6.head
            r0.getClass()
            int r1 = r0.pos
            long r2 = (long) r1
            long r2 = r2 + r7
            int r4 = r0.limit
            long r4 = (long) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L35
            java.lang.String r0 = new java.lang.String
            byte[] r7 = r6.readByteArray(r7)
            r0.<init>(r7, r9)
            return r0
        L35:
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r0.data
            int r4 = (int) r7
            r2.<init>(r3, r1, r4, r9)
            int r9 = r0.pos
            int r9 = r9 + r4
            r0.pos = r9
            long r3 = r6.size
            long r3 = r3 - r7
            r6.size = r3
            int r7 = r0.limit
            if (r9 != r7) goto L54
            okio.Segment r7 = r0.pop()
            r6.head = r7
            okio.SegmentPool.recycle(r0)
        L54:
            return r2
        L55:
            j8.o.a()
        L58:
            r7 = 0
            return r7
        L5a:
            java.lang.String r9 = "byteCount: "
            java.lang.String r7 = bc.e.g(r7, r9)
            j8.o.q(r7)
            goto L58
    }

    @Override // okio.BufferedSource
    public java.lang.String readString(java.nio.charset.Charset r3) {
            r2 = this;
            r3.getClass()
            long r0 = r2.size
            java.lang.String r3 = r2.readString(r0, r3)
            return r3
    }

    public final okio.Buffer.UnsafeCursor readUnsafe() {
            r2 = this;
            r0 = 0
            r1 = 1
            okio.Buffer$UnsafeCursor r0 = readUnsafe$default(r2, r0, r1, r0)
            return r0
    }

    public final okio.Buffer.UnsafeCursor readUnsafe(okio.Buffer.UnsafeCursor r1) {
            r0 = this;
            r1.getClass()
            okio.Buffer$UnsafeCursor r1 = okio.internal.Buffer.commonReadUnsafe(r0, r1)
            return r1
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8() {
            r3 = this;
            long r0 = r3.size
            java.nio.charset.Charset r2 = og.a.f9804a
            java.lang.String r0 = r3.readString(r0, r2)
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8(long r2) {
            r1 = this;
            java.nio.charset.Charset r0 = og.a.f9804a
            java.lang.String r2 = r1.readString(r2, r0)
            return r2
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() {
            r12 = this;
            long r0 = r12.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La8
            byte r0 = r12.getByte(r2)
            r1 = r0 & 128(0x80, float:1.8E-43)
            r2 = 1
            r3 = 128(0x80, float:1.8E-43)
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r1 != 0) goto L1e
            r1 = r0 & 127(0x7f, float:1.78E-43)
            r5 = 0
            r6 = r5
            r5 = r2
            goto L40
        L1e:
            r1 = r0 & 224(0xe0, float:3.14E-43)
            r5 = 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L29
            r1 = r0 & 31
            r5 = 2
            r6 = r3
            goto L40
        L29:
            r1 = r0 & 240(0xf0, float:3.36E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r1 != r5) goto L35
            r1 = r0 & 15
            r5 = 3
            r6 = 2048(0x800, float:2.87E-42)
            goto L40
        L35:
            r1 = r0 & 248(0xf8, float:3.48E-43)
            r5 = 240(0xf0, float:3.36E-43)
            if (r1 != r5) goto La2
            r1 = r0 & 7
            r5 = 4
            r6 = 65536(0x10000, float:9.1835E-41)
        L40:
            long r7 = r12.size()
            long r9 = (long) r5
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L78
        L49:
            if (r2 >= r5) goto L60
            long r7 = (long) r2
            byte r0 = r12.getByte(r7)
            r11 = r0 & 192(0xc0, float:2.69E-43)
            if (r11 != r3) goto L5c
            int r1 = r1 << 6
            r0 = r0 & 63
            r1 = r1 | r0
            int r2 = r2 + 1
            goto L49
        L5c:
            r12.skip(r7)
            return r4
        L60:
            r12.skip(r9)
            r0 = 1114111(0x10ffff, float:1.561202E-39)
            if (r1 <= r0) goto L69
            return r4
        L69:
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r0 > r1) goto L74
            r0 = 57344(0xe000, float:8.0356E-41)
            if (r1 >= r0) goto L74
            return r4
        L74:
            if (r1 >= r6) goto L77
            return r4
        L77:
            return r1
        L78:
            java.io.EOFException r1 = new java.io.EOFException
            java.lang.String r2 = "size < "
            java.lang.String r3 = ": "
            java.lang.StringBuilder r2 = eh.a.t(r5, r2, r3)
            long r3 = r12.size()
            r2.append(r3)
            java.lang.String r3 = " (to read code point prefixed 0x"
            r2.append(r3)
            java.lang.String r0 = okio.SegmentedByteString.toHexString(r0)
            r2.append(r0)
            r0 = 41
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        La2:
            r0 = 1
            r12.skip(r0)
            return r4
        La8:
            j8.o.a()
            r0 = 0
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8Line() {
            r4 = this;
            r0 = 10
            long r0 = r4.indexOf(r0)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L11
            java.lang.String r0 = okio.internal.Buffer.readUtf8Line(r4, r0)
            return r0
        L11:
            long r0 = r4.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L24
            long r0 = r4.size()
            java.lang.String r0 = r4.readUtf8(r0)
            return r0
        L24:
            r0 = 0
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8LineStrict() {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r0 = r2.readUtf8LineStrict(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8LineStrict(long r11) {
            r10 = this;
            r0 = 0
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 < 0) goto L74
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r6 = 1
            if (r2 != 0) goto L13
        L11:
            r4 = r0
            goto L16
        L13:
            long r0 = r11 + r6
            goto L11
        L16:
            r1 = 10
            r2 = 0
            r0 = r10
            long r1 = r0.indexOf(r1, r2, r4)
            r8 = -1
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 == 0) goto L2a
            java.lang.String r1 = okio.internal.Buffer.readUtf8Line(r10, r1)
            return r1
        L2a:
            long r1 = r10.size()
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 >= 0) goto L49
            long r1 = r4 - r6
            byte r1 = r10.getByte(r1)
            r2 = 13
            if (r1 != r2) goto L49
            byte r1 = r10.getByte(r4)
            r2 = 10
            if (r1 != r2) goto L49
            java.lang.String r1 = okio.internal.Buffer.readUtf8Line(r10, r4)
            return r1
        L49:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            long r2 = r10.size()
            r4 = 32
            long r4 = (long) r4
            long r4 = java.lang.Math.min(r4, r2)
            r2 = 0
            r0 = r10
            r0.copyTo(r1, r2, r4)
            long r2 = r10.size()
            long r2 = java.lang.Math.min(r2, r11)
            okio.ByteString r0 = r1.readByteString()
            java.lang.String r0 = r0.hex()
            j8.o.g(r0, r2)
        L72:
            r0 = 0
            return r0
        L74:
            java.lang.String r0 = "limit < 0: "
            java.lang.String r0 = bc.e.g(r11, r0)
            j8.o.q(r0)
            goto L72
    }

    @Override // okio.BufferedSource
    public boolean request(long r3) {
            r2 = this;
            long r0 = r2.size
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L8
            r3 = 1
            return r3
        L8:
            r3 = 0
            return r3
    }

    @Override // okio.BufferedSource
    public void require(long r3) {
            r2 = this;
            long r0 = r2.size
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L7
            return
        L7:
            j8.o.a()
            return
    }

    @Override // okio.BufferedSource
    public int select(okio.Options r4) {
            r3 = this;
            r4.getClass()
            r0 = 2
            r1 = 0
            r2 = 0
            int r0 = okio.internal.Buffer.selectPrefix$default(r3, r4, r2, r0, r1)
            r1 = -1
            if (r0 != r1) goto Le
            return r1
        Le:
            okio.ByteString[] r4 = r4.getByteStrings$okio()
            r4 = r4[r0]
            int r4 = r4.size()
            long r1 = (long) r4
            r3.skip(r1)
            return r0
    }

    public final void setSize$okio(long r1) {
            r0 = this;
            r0.size = r1
            return
    }

    public final okio.ByteString sha1() {
            r1 = this;
            java.lang.String r0 = "SHA-1"
            okio.ByteString r0 = r1.digest(r0)
            return r0
    }

    public final okio.ByteString sha256() {
            r1 = this;
            java.lang.String r0 = "SHA-256"
            okio.ByteString r0 = r1.digest(r0)
            return r0
    }

    public final okio.ByteString sha512() {
            r1 = this;
            java.lang.String r0 = "SHA-512"
            okio.ByteString r0 = r1.digest(r0)
            return r0
    }

    public final long size() {
            r2 = this;
            long r0 = r2.size
            return r0
    }

    @Override // okio.BufferedSource
    public void skip(long r7) {
            r6 = this;
        L0:
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L35
            okio.Segment r0 = r6.head
            if (r0 == 0) goto L32
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r7, r1)
            int r1 = (int) r1
            long r2 = r6.size()
            long r4 = (long) r1
            long r2 = r2 - r4
            r6.setSize$okio(r2)
            long r7 = r7 - r4
            int r2 = r0.pos
            int r2 = r2 + r1
            r0.pos = r2
            int r1 = r0.limit
            if (r2 != r1) goto L0
            okio.Segment r1 = r0.pop()
            r6.head = r1
            okio.SegmentPool.recycle(r0)
            goto L0
        L32:
            j8.o.a()
        L35:
            return
    }

    public final okio.ByteString snapshot() {
            r4 = this;
            long r0 = r4.size()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L15
            long r0 = r4.size()
            int r0 = (int) r0
            okio.ByteString r0 = r4.snapshot(r0)
            return r0
        L15:
            long r0 = r4.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "size > Int.MAX_VALUE: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public final okio.ByteString snapshot(int r9) {
            r8 = this;
            if (r9 != 0) goto L5
            okio.ByteString r9 = okio.ByteString.EMPTY
            return r9
        L5:
            long r0 = r8.size()
            r2 = 0
            long r4 = (long) r9
            okio.SegmentedByteString.checkOffsetAndCount(r0, r2, r4)
            okio.Segment r0 = r8.head
            r1 = 0
            r2 = r1
            r3 = r2
        L14:
            if (r2 >= r9) goto L2d
            r0.getClass()
            int r4 = r0.limit
            int r5 = r0.pos
            if (r4 == r5) goto L26
            int r4 = r4 - r5
            int r2 = r2 + r4
            int r3 = r3 + 1
            okio.Segment r0 = r0.next
            goto L14
        L26:
            java.lang.String r9 = "s.limit == s.pos"
            j8.o.f(r9)
            r9 = 0
            return r9
        L2d:
            byte[][] r0 = new byte[r3][]
            int r2 = r3 * 2
            int[] r2 = new int[r2]
            okio.Segment r4 = r8.head
            r5 = r4
            r4 = r1
        L37:
            if (r1 >= r9) goto L59
            r5.getClass()
            byte[] r6 = r5.data
            r0[r4] = r6
            int r6 = r5.limit
            int r7 = r5.pos
            int r6 = r6 - r7
            int r1 = r1 + r6
            int r6 = java.lang.Math.min(r1, r9)
            r2[r4] = r6
            int r6 = r4 + r3
            int r7 = r5.pos
            r2[r6] = r7
            r6 = 1
            r5.shared = r6
            int r4 = r4 + r6
            okio.Segment r5 = r5.next
            goto L37
        L59:
            okio.SegmentedByteString r9 = new okio.SegmentedByteString
            r9.<init>(r0, r2)
            return r9
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
            r1 = this;
            okio.Timeout r0 = okio.Timeout.NONE
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            okio.ByteString r0 = r1.snapshot()
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final okio.Segment writableSegment$okio(int r4) {
            r3 = this;
            r0 = 1
            if (r4 < r0) goto L32
            r0 = 8192(0x2000, float:1.148E-41)
            if (r4 > r0) goto L32
            okio.Segment r1 = r3.head
            if (r1 != 0) goto L16
            okio.Segment r4 = okio.SegmentPool.take()
            r3.head = r4
            r4.prev = r4
            r4.next = r4
            return r4
        L16:
            r1.getClass()
            okio.Segment r1 = r1.prev
            r1.getClass()
            int r2 = r1.limit
            int r2 = r2 + r4
            if (r2 > r0) goto L29
            boolean r4 = r1.owner
            if (r4 != 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            okio.Segment r4 = okio.SegmentPool.take()
            okio.Segment r4 = r1.push(r4)
            return r4
        L32:
            java.lang.String r4 = "unexpected capacity"
            j8.o.t(r4)
            r4 = 0
            return r4
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer r7) {
            r6 = this;
            r7.getClass()
            int r0 = r7.remaining()
            r1 = r0
        L8:
            if (r1 <= 0) goto L25
            r2 = 1
            okio.Segment r2 = r6.writableSegment$okio(r2)
            int r3 = r2.limit
            int r3 = 8192 - r3
            int r3 = java.lang.Math.min(r1, r3)
            byte[] r4 = r2.data
            int r5 = r2.limit
            r7.get(r4, r5, r3)
            int r1 = r1 - r3
            int r4 = r2.limit
            int r4 = r4 + r3
            r2.limit = r4
            goto L8
        L25:
            long r1 = r6.size
            long r3 = (long) r0
            long r1 = r1 + r3
            r6.size = r1
            return r0
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(okio.ByteString r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            int r1 = r3.size()
            r3.write$okio(r2, r0, r1)
            return r2
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(okio.ByteString r1, int r2, int r3) {
            r0 = this;
            r1.getClass()
            r1.write$okio(r0, r2, r3)
            return r0
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(okio.Source r5, long r6) {
            r4 = this;
            r5.getClass()
        L3:
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1a
            long r0 = r5.read(r4, r6)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L15
            long r6 = r6 - r0
            goto L3
        L15:
            j8.o.a()
            r5 = 0
            return r5
        L1a:
            return r4
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(byte[] r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            int r1 = r3.length
            okio.Buffer r3 = r2.write(r3, r0, r1)
            return r3
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(byte[] r8, int r9, int r10) {
            r7 = this;
            r8.getClass()
            int r0 = r8.length
            long r1 = (long) r0
            long r3 = (long) r9
            long r5 = (long) r10
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            int r10 = r10 + r9
        Lb:
            if (r9 >= r10) goto L2c
            r0 = 1
            okio.Segment r0 = r7.writableSegment$okio(r0)
            int r1 = r10 - r9
            int r2 = r0.limit
            int r2 = 8192 - r2
            int r1 = java.lang.Math.min(r1, r2)
            byte[] r2 = r0.data
            int r3 = r0.limit
            int r4 = r9 + r1
            tf.l.o0(r8, r3, r9, r2, r4)
            int r9 = r0.limit
            int r9 = r9 + r1
            r0.limit = r9
            r9 = r4
            goto Lb
        L2c:
            long r8 = r7.size()
            long r8 = r8 + r5
            r7.setSize$okio(r8)
            return r7
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink write(okio.ByteString r1) {
            r0 = this;
            okio.Buffer r1 = r0.write(r1)
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink write(okio.ByteString r1, int r2, int r3) {
            r0 = this;
            okio.Buffer r1 = r0.write(r1, r2, r3)
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink write(okio.Source r1, long r2) {
            r0 = this;
            okio.Buffer r1 = r0.write(r1, r2)
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink write(byte[] r1) {
            r0 = this;
            okio.Buffer r1 = r0.write(r1)
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink write(byte[] r1, int r2, int r3) {
            r0 = this;
            okio.Buffer r1 = r0.write(r1, r2, r3)
            return r1
    }

    @Override // okio.Sink
    public void write(okio.Buffer r7, long r8) {
            r6 = this;
            r7.getClass()
            if (r7 == r6) goto Lb3
            long r0 = r7.size()
            r2 = 0
            r4 = r8
            okio.SegmentedByteString.checkOffsetAndCount(r0, r2, r4)
        Lf:
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lb2
            okio.Segment r0 = r7.head
            r0.getClass()
            int r0 = r0.limit
            okio.Segment r1 = r7.head
            r1.getClass()
            int r1 = r1.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 >= 0) goto L74
            okio.Segment r0 = r6.head
            if (r0 == 0) goto L33
            r0.getClass()
            okio.Segment r0 = r0.prev
            goto L34
        L33:
            r0 = 0
        L34:
            if (r0 == 0) goto L68
            boolean r1 = r0.owner
            if (r1 == 0) goto L68
            int r1 = r0.limit
            long r1 = (long) r1
            long r1 = r1 + r8
            boolean r3 = r0.shared
            if (r3 == 0) goto L44
            r3 = 0
            goto L46
        L44:
            int r3 = r0.pos
        L46:
            long r3 = (long) r3
            long r1 = r1 - r3
            r3 = 8192(0x2000, double:4.0474E-320)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L68
            okio.Segment r1 = r7.head
            r1.getClass()
            int r2 = (int) r8
            r1.writeTo(r0, r2)
            long r0 = r7.size()
            long r0 = r0 - r8
            r7.setSize$okio(r0)
            long r0 = r6.size()
            long r0 = r0 + r8
            r6.setSize$okio(r0)
            return
        L68:
            okio.Segment r0 = r7.head
            r0.getClass()
            int r1 = (int) r8
            okio.Segment r0 = r0.split(r1)
            r7.head = r0
        L74:
            okio.Segment r0 = r7.head
            r0.getClass()
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            okio.Segment r3 = r0.pop()
            r7.head = r3
            okio.Segment r3 = r6.head
            if (r3 != 0) goto L90
            r6.head = r0
            r0.prev = r0
            r0.next = r0
            goto L9f
        L90:
            r3.getClass()
            okio.Segment r3 = r3.prev
            r3.getClass()
            okio.Segment r0 = r3.push(r0)
            r0.compact()
        L9f:
            long r3 = r7.size()
            long r3 = r3 - r1
            r7.setSize$okio(r3)
            long r3 = r6.size()
            long r3 = r3 + r1
            r6.setSize$okio(r3)
            long r8 = r8 - r1
            goto Lf
        Lb2:
            return
        Lb3:
            java.lang.String r7 = "source == this"
            j8.o.t(r7)
            return
    }

    @Override // okio.BufferedSink
    public long writeAll(okio.Source r7) {
            r6 = this;
            r7.getClass()
            r0 = 0
        L5:
            r2 = 8192(0x2000, double:4.0474E-320)
            long r2 = r7.read(r6, r2)
            r4 = -1
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L13
            long r0 = r0 + r2
            goto L5
        L13:
            return r0
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeByte(int r5) {
            r4 = this;
            r0 = 1
            okio.Segment r0 = r4.writableSegment$okio(r0)
            byte[] r1 = r0.data
            int r2 = r0.limit
            int r3 = r2 + 1
            r0.limit = r3
            byte r5 = (byte) r5
            r1[r2] = r5
            long r0 = r4.size()
            r2 = 1
            long r0 = r0 + r2
            r4.setSize$okio(r0)
            return r4
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeByte(int r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeByte(r1)
            return r1
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeDecimalLong(long r13) {
            r12 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto Ld
            r13 = 48
            okio.Buffer r13 = r12.writeByte(r13)
            return r13
        Ld:
            r3 = 1
            if (r2 >= 0) goto L1e
            long r13 = -r13
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L1c
            java.lang.String r13 = "-9223372036854775808"
            okio.Buffer r13 = r12.writeUtf8(r13)
            return r13
        L1c:
            r2 = r3
            goto L1f
        L1e:
            r2 = 0
        L1f:
            r4 = 100000000(0x5f5e100, double:4.94065646E-316)
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            r5 = 10
            if (r4 >= 0) goto L6d
            r6 = 10000(0x2710, double:4.9407E-320)
            int r4 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r4 >= 0) goto L4b
            r6 = 100
            int r4 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r4 >= 0) goto L3f
            r6 = 10
            int r4 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r4 >= 0) goto L3c
            goto Le4
        L3c:
            r3 = 2
            goto Le4
        L3f:
            r3 = 1000(0x3e8, double:4.94E-321)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L48
            r3 = 3
            goto Le4
        L48:
            r3 = 4
            goto Le4
        L4b:
            r3 = 1000000(0xf4240, double:4.940656E-318)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L5f
            r3 = 100000(0x186a0, double:4.94066E-319)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L5c
            r3 = 5
            goto Le4
        L5c:
            r3 = 6
            goto Le4
        L5f:
            r3 = 10000000(0x989680, double:4.9406565E-317)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L69
            r3 = 7
            goto Le4
        L69:
            r3 = 8
            goto Le4
        L6d:
            r3 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9a
            r3 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L8b
            r3 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L89
            r3 = 9
            goto Le4
        L89:
            r3 = r5
            goto Le4
        L8b:
            r3 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L97
            r3 = 11
            goto Le4
        L97:
            r3 = 12
            goto Le4
        L9a:
            r3 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Lbe
            r3 = 10000000000000(0x9184e72a000, double:4.9406564584125E-311)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Laf
            r3 = 13
            goto Le4
        Laf:
            r3 = 100000000000000(0x5af3107a4000, double:4.94065645841247E-310)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Lbb
            r3 = 14
            goto Le4
        Lbb:
            r3 = 15
            goto Le4
        Lbe:
            r3 = 100000000000000000(0x16345785d8a0000, double:5.620395787888205E-302)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Ld6
            r3 = 10000000000000000(0x2386f26fc10000, double:5.431165199810528E-308)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Ld3
            r3 = 16
            goto Le4
        Ld3:
            r3 = 17
            goto Le4
        Ld6:
            r3 = 1000000000000000000(0xde0b6b3a7640000, double:7.832953389245686E-242)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Le2
            r3 = 18
            goto Le4
        Le2:
            r3 = 19
        Le4:
            if (r2 == 0) goto Le8
            int r3 = r3 + 1
        Le8:
            okio.Segment r4 = r12.writableSegment$okio(r3)
            byte[] r6 = r4.data
            int r7 = r4.limit
            int r7 = r7 + r3
        Lf1:
            int r8 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r8 == 0) goto L105
            long r8 = (long) r5
            long r10 = r13 % r8
            int r10 = (int) r10
            int r7 = r7 + (-1)
            byte[] r11 = okio.internal.Buffer.getHEX_DIGIT_BYTES()
            r10 = r11[r10]
            r6[r7] = r10
            long r13 = r13 / r8
            goto Lf1
        L105:
            if (r2 == 0) goto L10d
            int r7 = r7 + (-1)
            r13 = 45
            r6[r7] = r13
        L10d:
            int r13 = r4.limit
            int r13 = r13 + r3
            r4.limit = r13
            long r13 = r12.size()
            long r0 = (long) r3
            long r13 = r13 + r0
            r12.setSize$okio(r13)
            return r12
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeDecimalLong(long r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeDecimalLong(r1)
            return r1
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeHexadecimalUnsignedLong(long r13) {
            r12 = this;
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 != 0) goto Ld
            r13 = 48
            okio.Buffer r13 = r12.writeByte(r13)
            return r13
        Ld:
            r0 = 1
            long r1 = r13 >>> r0
            long r1 = r1 | r13
            r3 = 2
            long r4 = r1 >>> r3
            long r1 = r1 | r4
            r4 = 4
            long r5 = r1 >>> r4
            long r1 = r1 | r5
            r5 = 8
            long r6 = r1 >>> r5
            long r1 = r1 | r6
            r6 = 16
            long r7 = r1 >>> r6
            long r1 = r1 | r7
            r7 = 32
            long r8 = r1 >>> r7
            long r1 = r1 | r8
            long r8 = r1 >>> r0
            r10 = 6148914691236517205(0x5555555555555555, double:1.1945305291614955E103)
            long r8 = r8 & r10
            long r1 = r1 - r8
            long r8 = r1 >>> r3
            r10 = 3689348814741910323(0x3333333333333333, double:4.667261458395856E-62)
            long r8 = r8 & r10
            long r1 = r1 & r10
            long r8 = r8 + r1
            long r1 = r8 >>> r4
            long r1 = r1 + r8
            r8 = 1085102592571150095(0xf0f0f0f0f0f0f0f, double:3.815736827118017E-236)
            long r1 = r1 & r8
            long r8 = r1 >>> r5
            long r1 = r1 + r8
            long r5 = r1 >>> r6
            long r1 = r1 + r5
            r5 = 63
            long r8 = r1 & r5
            long r1 = r1 >>> r7
            long r1 = r1 & r5
            long r8 = r8 + r1
            r1 = 3
            long r1 = (long) r1
            long r8 = r8 + r1
            long r1 = (long) r4
            long r8 = r8 / r1
            int r1 = (int) r8
            okio.Segment r2 = r12.writableSegment$okio(r1)
            byte[] r3 = r2.data
            int r5 = r2.limit
            int r6 = r5 + r1
            int r6 = r6 - r0
        L62:
            if (r6 < r5) goto L74
            byte[] r0 = okio.internal.Buffer.getHEX_DIGIT_BYTES()
            r7 = 15
            long r7 = r7 & r13
            int r7 = (int) r7
            r0 = r0[r7]
            r3[r6] = r0
            long r13 = r13 >>> r4
            int r6 = r6 + (-1)
            goto L62
        L74:
            int r13 = r2.limit
            int r13 = r13 + r1
            r2.limit = r13
            long r13 = r12.size()
            long r0 = (long) r1
            long r13 = r13 + r0
            r12.setSize$okio(r13)
            return r12
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeHexadecimalUnsignedLong(long r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeHexadecimalUnsignedLong(r1)
            return r1
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeInt(int r8) {
            r7 = this;
            r0 = 4
            okio.Segment r1 = r7.writableSegment$okio(r0)
            byte[] r2 = r1.data
            int r3 = r1.limit
            int r4 = r3 + 1
            int r5 = r8 >>> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r2[r3] = r5
            int r5 = r3 + 2
            int r6 = r8 >>> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r3 + 3
            int r6 = r8 >>> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r2[r5] = r6
            int r3 = r3 + r0
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r2[r4] = r8
            r1.limit = r3
            long r0 = r7.size()
            r2 = 4
            long r0 = r0 + r2
            r7.setSize$okio(r0)
            return r7
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeInt(int r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeInt(r1)
            return r1
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeIntLe(int r1) {
            r0 = this;
            int r1 = okio.SegmentedByteString.reverseBytes(r1)
            okio.Buffer r1 = r0.writeInt(r1)
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeIntLe(int r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeIntLe(r1)
            return r1
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeLong(long r12) {
            r11 = this;
            r0 = 8
            okio.Segment r1 = r11.writableSegment$okio(r0)
            byte[] r2 = r1.data
            int r3 = r1.limit
            int r4 = r3 + 1
            r5 = 56
            long r5 = r12 >>> r5
            r7 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r7
            int r5 = (int) r5
            byte r5 = (byte) r5
            r2[r3] = r5
            int r5 = r3 + 2
            r6 = 48
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r3 + 3
            r6 = 40
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r5] = r6
            int r5 = r3 + 4
            r6 = 32
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r3 + 5
            r6 = 24
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r5] = r6
            int r5 = r3 + 6
            r6 = 16
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r3 + 7
            long r9 = r12 >>> r0
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r5] = r6
            int r3 = r3 + r0
            long r12 = r12 & r7
            int r12 = (int) r12
            byte r12 = (byte) r12
            r2[r4] = r12
            r1.limit = r3
            long r12 = r11.size()
            r0 = 8
            long r12 = r12 + r0
            r11.setSize$okio(r12)
            return r11
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeLong(long r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeLong(r1)
            return r1
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeLongLe(long r1) {
            r0 = this;
            long r1 = okio.SegmentedByteString.reverseBytes(r1)
            okio.Buffer r1 = r0.writeLong(r1)
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeLongLe(long r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeLongLe(r1)
            return r1
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeShort(int r7) {
            r6 = this;
            r0 = 2
            okio.Segment r1 = r6.writableSegment$okio(r0)
            byte[] r2 = r1.data
            int r3 = r1.limit
            int r4 = r3 + 1
            int r5 = r7 >>> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r2[r3] = r5
            int r3 = r3 + r0
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r2[r4] = r7
            r1.limit = r3
            long r0 = r6.size()
            r2 = 2
            long r0 = r0 + r2
            r6.setSize$okio(r0)
            return r6
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeShort(int r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeShort(r1)
            return r1
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeShortLe(int r1) {
            r0 = this;
            short r1 = (short) r1
            short r1 = okio.SegmentedByteString.reverseBytes(r1)
            okio.Buffer r1 = r0.writeShort(r1)
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeShortLe(int r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeShortLe(r1)
            return r1
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeString(java.lang.String r2, int r3, int r4, java.nio.charset.Charset r5) {
            r1 = this;
            r2.getClass()
            r5.getClass()
            if (r3 < 0) goto L4d
            if (r4 < r3) goto L40
            int r0 = r2.length()
            if (r4 > r0) goto L2f
            java.nio.charset.Charset r0 = og.a.f9804a
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L1d
            okio.Buffer r2 = r1.writeUtf8(r2, r3, r4)
            return r2
        L1d:
            java.lang.String r2 = r2.substring(r3, r4)
            byte[] r2 = r2.getBytes(r5)
            r2.getClass()
            r3 = 0
            int r4 = r2.length
            okio.Buffer r2 = r1.write(r2, r3, r4)
            return r2
        L2f:
            java.lang.String r3 = "endIndex > string.length: "
            java.lang.String r5 = " > "
            java.lang.StringBuilder r3 = eh.a.t(r4, r3, r5)
            int r2 = r2.length()
            okio.a.e(r2, r3)
            r2 = 0
            return r2
        L40:
            java.lang.String r2 = "endIndex < beginIndex: "
            java.lang.String r5 = " < "
            java.lang.String r2 = p.a.j(r4, r2, r5, r3)
            j8.o.q(r2)
            r2 = 0
            return r2
        L4d:
            java.lang.String r2 = "beginIndex < 0: "
            java.lang.String r2 = eh.a.l(r3, r2)
            j8.o.q(r2)
            r2 = 0
            return r2
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeString(java.lang.String r3, java.nio.charset.Charset r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            r0 = 0
            int r1 = r3.length()
            okio.Buffer r3 = r2.writeString(r3, r0, r1, r4)
            return r3
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeString(java.lang.String r1, int r2, int r3, java.nio.charset.Charset r4) {
            r0 = this;
            okio.Buffer r1 = r0.writeString(r1, r2, r3, r4)
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeString(java.lang.String r1, java.nio.charset.Charset r2) {
            r0 = this;
            okio.Buffer r1 = r0.writeString(r1, r2)
            return r1
    }

    public final okio.Buffer writeTo(java.io.OutputStream r7) {
            r6 = this;
            r7.getClass()
            r4 = 2
            r5 = 0
            r2 = 0
            r0 = r6
            r1 = r7
            okio.Buffer r7 = writeTo$default(r0, r1, r2, r4, r5)
            return r7
    }

    public final okio.Buffer writeTo(java.io.OutputStream r8, long r9) {
            r7 = this;
            r8.getClass()
            long r0 = r7.size
            r2 = 0
            r4 = r9
            okio.SegmentedByteString.checkOffsetAndCount(r0, r2, r4)
            okio.Segment r9 = r7.head
            r0 = r9
            r9 = r4
        Lf:
            r1 = 0
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 <= 0) goto L45
            r0.getClass()
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r9, r1)
            int r1 = (int) r1
            byte[] r2 = r0.data
            int r3 = r0.pos
            r8.write(r2, r3, r1)
            int r2 = r0.pos
            int r2 = r2 + r1
            r0.pos = r2
            long r3 = r7.size
            long r5 = (long) r1
            long r3 = r3 - r5
            r7.size = r3
            long r9 = r9 - r5
            int r1 = r0.limit
            if (r2 != r1) goto Lf
            okio.Segment r1 = r0.pop()
            r7.head = r1
            okio.SegmentPool.recycle(r0)
            r0 = r1
            goto Lf
        L45:
            return r7
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeUtf8(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            int r1 = r3.length()
            okio.Buffer r3 = r2.writeUtf8(r3, r0, r1)
            return r3
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeUtf8(java.lang.String r10, int r11, int r12) {
            r9 = this;
            r10.getClass()
            if (r11 < 0) goto L138
            if (r12 < r11) goto L12c
            int r0 = r10.length()
            if (r12 > r0) goto L11b
        Ld:
            if (r11 >= r12) goto L11a
            char r0 = r10.charAt(r11)
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto L4e
            r2 = 1
            okio.Segment r2 = r9.writableSegment$okio(r2)
            byte[] r3 = r2.data
            int r4 = r2.limit
            int r4 = r4 - r11
            int r5 = 8192 - r4
            int r5 = java.lang.Math.min(r12, r5)
            int r6 = r11 + 1
            int r11 = r11 + r4
            byte r0 = (byte) r0
            r3[r11] = r0
        L2d:
            r11 = r6
            if (r11 >= r5) goto L3d
            char r0 = r10.charAt(r11)
            if (r0 >= r1) goto L3d
            int r6 = r11 + 1
            int r11 = r11 + r4
            byte r0 = (byte) r0
            r3[r11] = r0
            goto L2d
        L3d:
            int r4 = r4 + r11
            int r0 = r2.limit
            int r4 = r4 - r0
            int r0 = r0 + r4
            r2.limit = r0
            long r0 = r9.size()
            long r2 = (long) r4
            long r0 = r0 + r2
            r9.setSize$okio(r0)
            goto Ld
        L4e:
            r2 = 2048(0x800, float:2.87E-42)
            if (r0 >= r2) goto L7a
            r2 = 2
            okio.Segment r3 = r9.writableSegment$okio(r2)
            byte[] r4 = r3.data
            int r5 = r3.limit
            int r6 = r0 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            r4[r6] = r0
            int r5 = r5 + r2
            r3.limit = r5
            long r0 = r9.size()
            r2 = 2
            long r0 = r0 + r2
            r9.setSize$okio(r0)
        L77:
            int r11 = r11 + 1
            goto Ld
        L7a:
            r2 = 55296(0xd800, float:7.7486E-41)
            r3 = 63
            if (r0 < r2) goto Lea
            r2 = 57343(0xdfff, float:8.0355E-41)
            if (r0 <= r2) goto L87
            goto Lea
        L87:
            int r2 = r11 + 1
            if (r2 >= r12) goto L90
            char r4 = r10.charAt(r2)
            goto L91
        L90:
            r4 = 0
        L91:
            r5 = 56319(0xdbff, float:7.892E-41)
            if (r0 > r5) goto Le4
            r5 = 56320(0xdc00, float:7.8921E-41)
            if (r5 > r4) goto Le4
            r5 = 57344(0xe000, float:8.0356E-41)
            if (r4 >= r5) goto Le4
            r0 = r0 & 1023(0x3ff, float:1.434E-42)
            int r0 = r0 << 10
            r2 = r4 & 1023(0x3ff, float:1.434E-42)
            r0 = r0 | r2
            r2 = 65536(0x10000, float:9.1835E-41)
            int r0 = r0 + r2
            r2 = 4
            okio.Segment r4 = r9.writableSegment$okio(r2)
            byte[] r5 = r4.data
            int r6 = r4.limit
            int r7 = r0 >> 18
            r7 = r7 | 240(0xf0, float:3.36E-43)
            byte r7 = (byte) r7
            r5[r6] = r7
            int r7 = r6 + 1
            int r8 = r0 >> 12
            r8 = r8 & r3
            r8 = r8 | r1
            byte r8 = (byte) r8
            r5[r7] = r8
            int r7 = r6 + 2
            int r8 = r0 >> 6
            r8 = r8 & r3
            r8 = r8 | r1
            byte r8 = (byte) r8
            r5[r7] = r8
            int r7 = r6 + 3
            r0 = r0 & r3
            r0 = r0 | r1
            byte r0 = (byte) r0
            r5[r7] = r0
            int r6 = r6 + r2
            r4.limit = r6
            long r0 = r9.size()
            r2 = 4
            long r0 = r0 + r2
            r9.setSize$okio(r0)
            int r11 = r11 + 2
            goto Ld
        Le4:
            r9.writeByte(r3)
            r11 = r2
            goto Ld
        Lea:
            r2 = 3
            okio.Segment r4 = r9.writableSegment$okio(r2)
            byte[] r5 = r4.data
            int r6 = r4.limit
            int r7 = r0 >> 12
            r7 = r7 | 224(0xe0, float:3.14E-43)
            byte r7 = (byte) r7
            r5[r6] = r7
            int r7 = r6 + 1
            int r8 = r0 >> 6
            r3 = r3 & r8
            r3 = r3 | r1
            byte r3 = (byte) r3
            r5[r7] = r3
            int r3 = r6 + 2
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            r5[r3] = r0
            int r6 = r6 + r2
            r4.limit = r6
            long r0 = r9.size()
            r2 = 3
            long r0 = r0 + r2
            r9.setSize$okio(r0)
            goto L77
        L11a:
            return r9
        L11b:
            java.lang.String r11 = "endIndex > string.length: "
            java.lang.String r0 = " > "
            java.lang.StringBuilder r11 = eh.a.t(r12, r11, r0)
            int r10 = r10.length()
            okio.a.e(r10, r11)
        L12a:
            r10 = 0
            return r10
        L12c:
            java.lang.String r10 = "endIndex < beginIndex: "
            java.lang.String r0 = " < "
            java.lang.String r10 = p.a.j(r12, r10, r0, r11)
            j8.o.q(r10)
            goto L12a
        L138:
            java.lang.String r10 = "beginIndex < 0: "
            java.lang.String r10 = eh.a.l(r11, r10)
            j8.o.q(r10)
            goto L12a
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeUtf8(java.lang.String r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeUtf8(r1)
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeUtf8(java.lang.String r1, int r2, int r3) {
            r0 = this;
            okio.Buffer r1 = r0.writeUtf8(r1, r2, r3)
            return r1
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeUtf8CodePoint(int r9) {
            r8 = this;
            r0 = 128(0x80, float:1.8E-43)
            if (r9 >= r0) goto L8
            r8.writeByte(r9)
            return r8
        L8:
            r1 = 2048(0x800, float:2.87E-42)
            r2 = 63
            if (r9 >= r1) goto L33
            r1 = 2
            okio.Segment r3 = r8.writableSegment$okio(r1)
            byte[] r4 = r3.data
            int r5 = r3.limit
            int r6 = r9 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            r9 = r9 & r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r4[r6] = r9
            int r5 = r5 + r1
            r3.limit = r5
            long r0 = r8.size()
            r2 = 2
            long r0 = r0 + r2
            r8.setSize$okio(r0)
            return r8
        L33:
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r1 > r9) goto L41
            r1 = 57344(0xe000, float:8.0356E-41)
            if (r9 >= r1) goto L41
            r8.writeByte(r2)
            return r8
        L41:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r9 >= r1) goto L73
            r1 = 3
            okio.Segment r3 = r8.writableSegment$okio(r1)
            byte[] r4 = r3.data
            int r5 = r3.limit
            int r6 = r9 >> 12
            r6 = r6 | 224(0xe0, float:3.14E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            int r7 = r9 >> 6
            r7 = r7 & r2
            r7 = r7 | r0
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 2
            r9 = r9 & r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r4[r6] = r9
            int r5 = r5 + r1
            r3.limit = r5
            long r0 = r8.size()
            r2 = 3
            long r0 = r0 + r2
            r8.setSize$okio(r0)
            return r8
        L73:
            r1 = 1114111(0x10ffff, float:1.561202E-39)
            if (r9 > r1) goto Laf
            r1 = 4
            okio.Segment r3 = r8.writableSegment$okio(r1)
            byte[] r4 = r3.data
            int r5 = r3.limit
            int r6 = r9 >> 18
            r6 = r6 | 240(0xf0, float:3.36E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            int r7 = r9 >> 12
            r7 = r7 & r2
            r7 = r7 | r0
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 2
            int r7 = r9 >> 6
            r7 = r7 & r2
            r7 = r7 | r0
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 3
            r9 = r9 & r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r4[r6] = r9
            int r5 = r5 + r1
            r3.limit = r5
            long r0 = r8.size()
            r2 = 4
            long r0 = r0 + r2
            r8.setSize$okio(r0)
            return r8
        Laf:
            java.lang.String r0 = "Unexpected code point: 0x"
            java.lang.String r9 = okio.SegmentedByteString.toHexString(r9)
            j8.o.x(r9, r0)
            r9 = 0
            return r9
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeUtf8CodePoint(int r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeUtf8CodePoint(r1)
            return r1
    }
}
