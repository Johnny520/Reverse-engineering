package org.apache.commons.compress.archivers.dump;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
