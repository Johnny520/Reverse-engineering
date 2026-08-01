package com.google.protobuf;

import p025.AbstractC7012;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BinaryWriter$UnpairedSurrogateException extends IllegalArgumentException {
    public BinaryWriter$UnpairedSurrogateException(int i, int i2) {
        super(AbstractC7012.m12150(i, i2, "Unpaired surrogate at index ", " of "));
    }
}
