package com.alibaba.fastjson2.reader;

import java.util.Map;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2780 implements BiConsumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8503;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f8503) {
            case 0:
                ((Throwable) obj).setStackTrace((StackTraceElement[]) obj2);
                break;
            default:
                Map map = (Map) obj;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    map.put(entry.getKey(), entry.getValue());
                }
                break;
        }
    }
}
