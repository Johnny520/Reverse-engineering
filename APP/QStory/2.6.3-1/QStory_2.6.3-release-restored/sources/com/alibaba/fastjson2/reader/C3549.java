package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONReader$Feature;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3549 extends C3548 {
    public C3549(Class cls, Class cls2, long j) {
        super(cls, cls2, null, String.class, j, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r0.mo6697('\"', 'n', 'u', 'l', 'l', '\"') != false) goto L22;
     */
    @Override // com.alibaba.fastjson2.reader.C3548, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        AbstractC3732 abstractC37322;
        Object objPut;
        if (abstractC3732.f9544) {
            return mo6027(abstractC3732, type, obj, j);
        }
        if (!abstractC3732.mo6708()) {
            if (abstractC3732.f9538 != '[') {
                if (!abstractC3732.mo6711()) {
                    abstractC37322 = abstractC3732;
                }
                return null;
            }
            abstractC3732.mo6733();
            if (abstractC3732.f9538 == '{') {
                Object objMo6023 = mo6023(abstractC3732, String.class, obj, j);
                if (abstractC3732.mo6702()) {
                    abstractC3732.mo6705();
                    return objMo6023;
                }
            }
            C1123.m1410(abstractC3732.mo6730("expect '{', but '['"));
            return null;
        }
        abstractC37322 = abstractC3732;
        C3776 c3776 = abstractC37322.f9546;
        Map map = this.f8616 == HashMap.class ? new HashMap() : (Map) mo6059(c3776.f9665 | j);
        long j2 = j | c3776.f9665;
        int i = 0;
        while (!abstractC37322.mo6712()) {
            String strMo6686 = abstractC37322.mo6686();
            if (this.f8622 && abstractC37322.mo6701()) {
                JSONArray jSONArray = new JSONArray();
                while (!abstractC37322.mo6702()) {
                    jSONArray.add(abstractC37322.mo6744());
                }
                map.put(strMo6686, jSONArray);
            } else {
                String strMo6744 = abstractC37322.mo6744();
                if ((i != 0 || (JSONReader$Feature.SupportAutoType.mask & j2) == 0 || !strMo6686.equals("@type")) && ((strMo6744 != null || (JSONReader$Feature.IgnoreNullPropertyValue.mask & j2) == 0) && (objPut = map.put(strMo6686, strMo6744)) != null && (JSONReader$Feature.DuplicateKeyValueAsArray.mask & j2) != 0)) {
                    if (objPut instanceof Collection) {
                        ((Collection) objPut).add(strMo6744);
                        map.put(strMo6686, objPut);
                    } else {
                        map.put(strMo6686, JSONArray.m1of(objPut, (Object) strMo6744));
                    }
                }
            }
            i++;
        }
        abstractC37322.mo6704(',');
        return map;
    }
}
