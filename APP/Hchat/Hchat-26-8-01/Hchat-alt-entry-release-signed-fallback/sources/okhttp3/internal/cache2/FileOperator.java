package okhttp3.internal.cache2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class FileOperator {
    private final java.nio.channels.FileChannel fileChannel;

    public FileOperator(java.nio.channels.FileChannel r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.fileChannel = r1
            return
    }

    public final void read(long r10, okio.Buffer r12, long r13) {
            r9 = this;
            r12.getClass()
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 < 0) goto L1a
            r4 = r10
            r6 = r13
        Lb:
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 <= 0) goto L19
            java.nio.channels.FileChannel r3 = r9.fileChannel
            r8 = r12
            long r10 = r3.transferTo(r4, r6, r8)
            long r4 = r4 + r10
            long r6 = r6 - r10
            goto Lb
        L19:
            return
        L1a:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException
            r10.<init>()
            throw r10
    }

    public final void write(long r10, okio.Buffer r12, long r13) {
            r9 = this;
            r12.getClass()
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 < 0) goto L22
            long r2 = r12.size()
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 > 0) goto L22
            r5 = r10
            r7 = r13
        L13:
            int r10 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r10 <= 0) goto L21
            java.nio.channels.FileChannel r3 = r9.fileChannel
            r4 = r12
            long r10 = r3.transferFrom(r4, r5, r7)
            long r5 = r5 + r10
            long r7 = r7 - r10
            goto L13
        L21:
            return
        L22:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException
            r10.<init>()
            throw r10
    }
}
