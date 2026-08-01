package org.apache.commons.compress.compressors.snappy;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum FramedSnappyDialect {
    STANDARD(true, true),
    IWORK_ARCHIVE(false, false);

    private final boolean checksumWithCompressedChunks;
    private final boolean streamIdentifier;

    FramedSnappyDialect(boolean z, boolean z2) {
        this.streamIdentifier = z;
        this.checksumWithCompressedChunks = z2;
    }

    public boolean hasStreamIdentifier() {
        return this.streamIdentifier;
    }

    public boolean usesChecksumWithCompressedChunks() {
        return this.checksumWithCompressedChunks;
    }
}
