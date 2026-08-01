package okio.internal;

/* JADX INFO: compiled from: FixedLengthSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m115d2 = {"Lokio/internal/FixedLengthSource;", "Lokio/ForwardingSource;", "delegate", "Lokio/Source;", "size", "", "truncate", "", "(Lokio/Source;JZ)V", "bytesReceived", "read", "sink", "Lokio/Buffer;", "byteCount", "truncateToSize", "", "newSize", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public final class FixedLengthSource extends okio.ForwardingSource {
    private long bytesReceived;
    private final long size;
    private final boolean truncate;

    public FixedLengthSource(okio.Source r2, long r3, boolean r5) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>(r2)
            r1.size = r3
            r1.truncate = r5
            return
    }

    private final void truncateToSize(okio.Buffer r3, long r4) {
            r2 = this;
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r1 = r3
            okio.Source r1 = (okio.Source) r1
            r0.writeAll(r1)
            r3.write(r0, r4)
            r0.clear()
            return
    }

    @Override // okio.ForwardingSource, okio.Source
    public long read(okio.Buffer r16, long r17) {
            r15 = this;
            r0 = r15
            r1 = r16
            java.lang.String r2 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            long r2 = r0.bytesReceived
            long r4 = r0.size
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = -1
            r5 = 0
            if (r2 <= 0) goto L19
            r9 = r17
            r7 = r5
            goto L31
        L19:
            boolean r2 = r0.truncate
            if (r2 == 0) goto L2e
            long r7 = r0.size
            long r9 = r0.bytesReceived
            long r7 = r7 - r9
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 != 0) goto L27
            return r3
        L27:
            r9 = r17
            long r7 = java.lang.Math.min(r9, r7)
            goto L31
        L2e:
            r9 = r17
            r7 = r9
        L31:
            long r11 = super.read(r1, r7)
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 == 0) goto L3f
            long r13 = r0.bytesReceived
            long r13 = r13 + r11
            r0.bytesReceived = r13
        L3f:
            long r13 = r0.bytesReceived
            long r5 = r0.size
            int r2 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r2 >= 0) goto L4b
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 == 0) goto L53
        L4b:
            long r2 = r0.bytesReceived
            long r4 = r0.size
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L95
        L53:
            r2 = 0
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 <= 0) goto L6e
            long r2 = r0.bytesReceived
            long r4 = r0.size
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L6e
            long r2 = r16.size()
            long r4 = r0.bytesReceived
            long r13 = r0.size
            long r4 = r4 - r13
            long r2 = r2 - r4
            r15.truncateToSize(r1, r2)
        L6e:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "expected "
            java.lang.StringBuilder r3 = r3.append(r4)
            long r4 = r0.size
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " bytes but got "
            java.lang.StringBuilder r3 = r3.append(r4)
            long r4 = r0.bytesReceived
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L95:
            return r11
    }
}
