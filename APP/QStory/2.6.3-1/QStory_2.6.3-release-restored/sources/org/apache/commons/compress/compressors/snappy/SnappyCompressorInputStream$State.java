package org.apache.commons.compress.compressors.snappy;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
enum SnappyCompressorInputStream$State {
    NO_BLOCK,
    IN_LITERAL,
    IN_BACK_REFERENCE
}
