package org.apache.commons.compress.archivers.dump;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public enum DumpArchiveConstants$COMPRESSION_TYPE {
    UNKNOWN(-1),
    ZLIB(0),
    BZLIB(1),
    LZO(2);

    final int code;

    DumpArchiveConstants$COMPRESSION_TYPE(int i) {
        this.code = i;
    }

    public static DumpArchiveConstants$COMPRESSION_TYPE find(int i) {
        for (DumpArchiveConstants$COMPRESSION_TYPE dumpArchiveConstants$COMPRESSION_TYPE : values()) {
            if (dumpArchiveConstants$COMPRESSION_TYPE.code == i) {
                return dumpArchiveConstants$COMPRESSION_TYPE;
            }
        }
        return UNKNOWN;
    }
}
