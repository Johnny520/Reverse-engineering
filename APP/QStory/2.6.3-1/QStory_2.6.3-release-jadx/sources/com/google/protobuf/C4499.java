package com.google.protobuf;

import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4499 implements ToIntFunction {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f11747;

    public /* synthetic */ C4499(int i) {
        this.f11747 = i;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.f11747) {
            case 0:
                return ((C4496) obj).f11731.getNumber();
            default:
                return ((C4489) obj).f11700.getNumber();
        }
    }
}
