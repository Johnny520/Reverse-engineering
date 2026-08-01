package org.apache.commons.compress.archivers.dump;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
