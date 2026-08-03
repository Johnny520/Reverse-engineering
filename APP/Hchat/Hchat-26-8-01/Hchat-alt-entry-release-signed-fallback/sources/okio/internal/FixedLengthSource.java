package okio.internal;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class FixedLengthSource extends okio.ForwardingSource {
    private long bytesReceived;
    private final long size;
    private final boolean truncate;

    public FixedLengthSource(okio.Source r1, long r2, boolean r4) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1)
            r0.size = r2
            r0.truncate = r4
            return
    }

    private final void truncateToSize(okio.Buffer r2, long r3) {
            r1 = this;
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r0.writeAll(r2)
            r2.write(r0, r3)
            r0.clear()
            return
    }

    @Override // okio.ForwardingSource, okio.Source
    public long read(okio.Buffer r10, long r11) {
            r9 = this;
            r10.getClass()
            long r0 = r9.bytesReceived
            long r2 = r9.size
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = -1
            r7 = 0
            if (r4 <= 0) goto L11
            r11 = r7
            goto L1f
        L11:
            boolean r4 = r9.truncate
            if (r4 == 0) goto L1f
            long r2 = r2 - r0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto L1b
            return r5
        L1b:
            long r11 = java.lang.Math.min(r11, r2)
        L1f:
            long r11 = super.read(r10, r11)
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 == 0) goto L2c
            long r1 = r9.bytesReceived
            long r1 = r1 + r11
            r9.bytesReceived = r1
        L2c:
            long r1 = r9.bytesReceived
            long r3 = r9.size
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L36
            if (r0 == 0) goto L3a
        L36:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L6f
        L3a:
            int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r11 <= 0) goto L4f
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 <= 0) goto L4f
            long r11 = r10.size()
            long r0 = r9.bytesReceived
            long r2 = r9.size
            long r0 = r0 - r2
            long r11 = r11 - r0
            r9.truncateToSize(r10, r11)
        L4f:
            java.io.IOException r10 = new java.io.IOException
            long r11 = r9.size
            long r0 = r9.bytesReceived
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "expected "
            r2.<init>(r3)
            r2.append(r11)
            java.lang.String r11 = " bytes but got "
            r2.append(r11)
            r2.append(r0)
            java.lang.String r11 = r2.toString()
            r10.<init>(r11)
            throw r10
        L6f:
            return r11
    }
}
