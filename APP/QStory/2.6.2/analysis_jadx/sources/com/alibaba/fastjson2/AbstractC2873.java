package com.alibaba.fastjson2;

import java.lang.reflect.Array;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2873 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (obj == null) {
            return null;
        }
        int i = 0;
        if (obj instanceof List) {
            List list = (List) obj;
            while (i < list.size()) {
                if (mo5904(list.get(i))) {
                    return Integer.valueOf(i);
                }
                i++;
            }
            return -1;
        }
        if (!obj.getClass().isArray()) {
            return mo5904(obj) ? 0 : null;
        }
        int length = Array.getLength(obj);
        while (i < length) {
            if (mo5904(Array.get(obj, i))) {
                return Integer.valueOf(i);
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract boolean mo5904(Object obj);
}
