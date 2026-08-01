package org.apache.commons.compress.archivers.dump;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public enum DumpArchiveEntry$TYPE {
    WHITEOUT(14),
    SOCKET(12),
    LINK(10),
    FILE(8),
    BLKDEV(6),
    DIRECTORY(4),
    CHRDEV(2),
    FIFO(1),
    UNKNOWN(15);

    private final int code;

    DumpArchiveEntry$TYPE(int i) {
        this.code = i;
    }

    public static DumpArchiveEntry$TYPE find(int i) {
        DumpArchiveEntry$TYPE dumpArchiveEntry$TYPE = UNKNOWN;
        for (DumpArchiveEntry$TYPE dumpArchiveEntry$TYPE2 : values()) {
            if (i == dumpArchiveEntry$TYPE2.code) {
                dumpArchiveEntry$TYPE = dumpArchiveEntry$TYPE2;
            }
        }
        return dumpArchiveEntry$TYPE;
    }
}
