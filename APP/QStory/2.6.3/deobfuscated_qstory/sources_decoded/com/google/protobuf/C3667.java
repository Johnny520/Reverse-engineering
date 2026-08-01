package com.google.protobuf;

import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3667 implements ToIntFunction {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f11402;

    public /* synthetic */ C3667(int i) {
        this.f11402 = i;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.f11402) {
            case 0:
                return ((C3664) obj).f11386.getNumber();
            default:
                return ((C3657) obj).f11355.getNumber();
        }
    }
}
