package com.alibaba.fastjson2.reader;

import java.util.List;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2773 implements ToIntFunction {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f8470;

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.f8470) {
            case 0:
                return ((List) obj).size();
            default:
                return ((StackTraceElement) obj).getLineNumber();
        }
    }
}
