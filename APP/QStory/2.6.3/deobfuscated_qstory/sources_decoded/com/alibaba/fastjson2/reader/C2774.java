package com.alibaba.fastjson2.reader;

import java.util.List;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2774 implements ToIntFunction {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f8472;

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.f8472) {
            case 0:
                return ((List) obj).size();
            default:
                return ((StackTraceElement) obj).getLineNumber();
        }
    }
}
