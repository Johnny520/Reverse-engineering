package okhttp3.internal.cache2;

/* JADX INFO: compiled from: FileOperator.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\u001e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m115d2 = {"Lokhttp3/internal/cache2/FileOperator;", "", "fileChannel", "Ljava/nio/channels/FileChannel;", "(Ljava/nio/channels/FileChannel;)V", "read", "", "pos", "", "sink", "Lokio/Buffer;", "byteCount", "write", "source", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class FileOperator {
    private final java.nio.channels.FileChannel fileChannel;

    public FileOperator(java.nio.channels.FileChannel r2) {
            r1 = this;
            java.lang.String r0 = "fileChannel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.fileChannel = r2
            return
    }

    public final void read(long r15, okio.Buffer r17, long r18) {
            r14 = this;
            r0 = r17
            java.lang.String r1 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            int r3 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r3 < 0) goto L25
            r3 = r15
            r5 = r18
        L10:
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 <= 0) goto L23
            r13 = r14
            java.nio.channels.FileChannel r7 = r13.fileChannel
            r12 = r0
            java.nio.channels.WritableByteChannel r12 = (java.nio.channels.WritableByteChannel) r12
            r8 = r3
            r10 = r5
            long r7 = r7.transferTo(r8, r10, r12)
            long r3 = r3 + r7
            long r5 = r5 - r7
            goto L10
        L23:
            r13 = r14
            return
        L25:
            r13 = r14
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    public final void write(long r15, okio.Buffer r17, long r18) throws java.io.IOException {
            r14 = this;
            r0 = r17
            java.lang.String r1 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            int r3 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r3 < 0) goto L2d
            long r3 = r17.size()
            int r3 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r3 > 0) goto L2d
            r3 = r15
            r5 = r18
        L18:
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 <= 0) goto L2b
            r13 = r14
            java.nio.channels.FileChannel r7 = r13.fileChannel
            r8 = r0
            java.nio.channels.ReadableByteChannel r8 = (java.nio.channels.ReadableByteChannel) r8
            r9 = r3
            r11 = r5
            long r7 = r7.transferFrom(r8, r9, r11)
            long r3 = r3 + r7
            long r5 = r5 - r7
            goto L18
        L2b:
            r13 = r14
            return
        L2d:
            r13 = r14
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }
}
