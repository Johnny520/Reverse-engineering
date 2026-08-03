package okio.internal;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ZipEntry {
    private final okio.Path canonicalPath;
    private final java.util.List<okio.Path> children;
    private final java.lang.String comment;
    private final long compressedSize;
    private final int compressionMethod;
    private final long crc;
    private final boolean isDirectory;
    private final java.lang.Long lastModifiedAtMillis;
    private final long offset;
    private final long size;

    public ZipEntry(okio.Path r1, boolean r2, java.lang.String r3, long r4, long r6, long r8, int r10, java.lang.Long r11, long r12) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r0.<init>()
            r0.canonicalPath = r1
            r0.isDirectory = r2
            r0.comment = r3
            r0.crc = r4
            r0.compressedSize = r6
            r0.size = r8
            r0.compressionMethod = r10
            r0.lastModifiedAtMillis = r11
            r0.offset = r12
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.children = r1
            return
    }

    public /* synthetic */ ZipEntry(okio.Path r14, boolean r15, java.lang.String r16, long r17, long r19, long r21, int r23, java.lang.Long r24, long r25, int r27, gg.g r28) {
            r13 = this;
            r0 = r27
            r1 = r0 & 2
            if (r1 == 0) goto L8
            r1 = 0
            goto L9
        L8:
            r1 = r15
        L9:
            r2 = r0 & 4
            if (r2 == 0) goto L10
            java.lang.String r2 = ""
            goto L12
        L10:
            r2 = r16
        L12:
            r3 = r0 & 8
            r4 = -1
            if (r3 == 0) goto L1a
            r6 = r4
            goto L1c
        L1a:
            r6 = r17
        L1c:
            r3 = r0 & 16
            if (r3 == 0) goto L22
            r8 = r4
            goto L24
        L22:
            r8 = r19
        L24:
            r3 = r0 & 32
            if (r3 == 0) goto L2a
            r10 = r4
            goto L2c
        L2a:
            r10 = r21
        L2c:
            r3 = r0 & 64
            if (r3 == 0) goto L32
            r3 = -1
            goto L34
        L32:
            r3 = r23
        L34:
            r12 = r0 & 128(0x80, float:1.8E-43)
            if (r12 == 0) goto L3a
            r12 = 0
            goto L3c
        L3a:
            r12 = r24
        L3c:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L54
            r27 = r4
        L42:
            r15 = r13
            r16 = r14
            r17 = r1
            r18 = r2
            r25 = r3
            r19 = r6
            r21 = r8
            r23 = r10
            r26 = r12
            goto L57
        L54:
            r27 = r25
            goto L42
        L57:
            r15.<init>(r16, r17, r18, r19, r21, r23, r25, r26, r27)
            return
    }

    public final okio.Path getCanonicalPath() {
            r1 = this;
            okio.Path r0 = r1.canonicalPath
            return r0
    }

    public final java.util.List<okio.Path> getChildren() {
            r1 = this;
            java.util.List<okio.Path> r0 = r1.children
            return r0
    }

    public final java.lang.String getComment() {
            r1 = this;
            java.lang.String r0 = r1.comment
            return r0
    }

    public final long getCompressedSize() {
            r2 = this;
            long r0 = r2.compressedSize
            return r0
    }

    public final int getCompressionMethod() {
            r1 = this;
            int r0 = r1.compressionMethod
            return r0
    }

    public final long getCrc() {
            r2 = this;
            long r0 = r2.crc
            return r0
    }

    public final java.lang.Long getLastModifiedAtMillis() {
            r1 = this;
            java.lang.Long r0 = r1.lastModifiedAtMillis
            return r0
    }

    public final long getOffset() {
            r2 = this;
            long r0 = r2.offset
            return r0
    }

    public final long getSize() {
            r2 = this;
            long r0 = r2.size
            return r0
    }

    public final boolean isDirectory() {
            r1 = this;
            boolean r0 = r1.isDirectory
            return r0
    }
}
