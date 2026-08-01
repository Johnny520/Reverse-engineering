package org.apache.commons.compress.archivers.dump;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum DumpArchiveConstants$SEGMENT_TYPE {
    TAPE(1),
    INODE(2),
    BITS(3),
    ADDR(4),
    END(5),
    CLRI(6);

    final int code;

    DumpArchiveConstants$SEGMENT_TYPE(int i) {
        this.code = i;
    }

    public static DumpArchiveConstants$SEGMENT_TYPE find(int i) {
        for (DumpArchiveConstants$SEGMENT_TYPE dumpArchiveConstants$SEGMENT_TYPE : values()) {
            if (dumpArchiveConstants$SEGMENT_TYPE.code == i) {
                return dumpArchiveConstants$SEGMENT_TYPE;
            }
        }
        return null;
    }
}
