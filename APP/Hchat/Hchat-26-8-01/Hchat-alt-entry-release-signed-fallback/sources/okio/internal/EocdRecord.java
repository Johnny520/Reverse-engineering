package okio.internal;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class EocdRecord {
    private final long centralDirectoryOffset;
    private final int commentByteCount;
    private final long entryCount;

    public EocdRecord(long r1, long r3, int r5) {
            r0 = this;
            r0.<init>()
            r0.entryCount = r1
            r0.centralDirectoryOffset = r3
            r0.commentByteCount = r5
            return
    }

    public final long getCentralDirectoryOffset() {
            r2 = this;
            long r0 = r2.centralDirectoryOffset
            return r0
    }

    public final int getCommentByteCount() {
            r1 = this;
            int r0 = r1.commentByteCount
            return r0
    }

    public final long getEntryCount() {
            r2 = this;
            long r0 = r2.entryCount
            return r0
    }
}
