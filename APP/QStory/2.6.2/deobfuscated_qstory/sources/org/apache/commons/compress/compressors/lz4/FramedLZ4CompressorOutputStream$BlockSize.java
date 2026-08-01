package org.apache.commons.compress.compressors.lz4;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public enum FramedLZ4CompressorOutputStream$BlockSize {
    K64(65536, 4),
    K256(262144, 5),
    M1(1048576, 6),
    M4(4194304, 7);

    private final int index;
    private final int size;

    FramedLZ4CompressorOutputStream$BlockSize(int i, int i2) {
        this.size = i;
        this.index = i2;
    }

    public int getIndex() {
        return this.index;
    }

    public int getSize() {
        return this.size;
    }
}
