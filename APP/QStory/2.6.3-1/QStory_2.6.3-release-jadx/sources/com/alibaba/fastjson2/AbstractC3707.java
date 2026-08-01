package com.alibaba.fastjson2;

import java.lang.reflect.Array;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3707 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (obj == null) {
            return null;
        }
        int i = 0;
        if (obj instanceof List) {
            List list = (List) obj;
            while (i < list.size()) {
                if (mo6509(list.get(i))) {
                    return Integer.valueOf(i);
                }
                i++;
            }
            return -1;
        }
        if (!obj.getClass().isArray()) {
            return mo6509(obj) ? 0 : null;
        }
        int length = Array.getLength(obj);
        while (i < length) {
            if (mo6509(Array.get(obj, i))) {
                return Integer.valueOf(i);
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract boolean mo6509(Object obj);
}
