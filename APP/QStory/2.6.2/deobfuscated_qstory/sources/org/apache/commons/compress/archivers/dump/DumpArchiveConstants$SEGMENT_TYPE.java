package org.apache.commons.compress.archivers.dump;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
