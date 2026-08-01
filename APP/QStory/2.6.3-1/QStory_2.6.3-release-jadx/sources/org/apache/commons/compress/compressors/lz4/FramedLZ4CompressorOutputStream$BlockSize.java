package org.apache.commons.compress.compressors.lz4;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
