package com.google.protobuf;

import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3666 implements ToIntFunction {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f11397;

    public /* synthetic */ C3666(int i) {
        this.f11397 = i;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.f11397) {
            case 0:
                return ((C3663) obj).f11381.getNumber();
            default:
                return ((C3656) obj).f11350.getNumber();
        }
    }
}
