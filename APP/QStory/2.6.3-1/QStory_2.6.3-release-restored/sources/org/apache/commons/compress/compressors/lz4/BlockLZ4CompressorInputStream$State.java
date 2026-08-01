package org.apache.commons.compress.compressors.lz4;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
enum BlockLZ4CompressorInputStream$State {
    NO_BLOCK,
    IN_LITERAL,
    LOOKING_FOR_BACK_REFERENCE,
    IN_BACK_REFERENCE,
    EOF
}
