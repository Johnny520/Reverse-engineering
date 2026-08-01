package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2859;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2798 extends C2771 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final long f8654;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final String f8655;

    public C2798(Class cls, String str, String str2, long j, JSONSchema jSONSchema, Supplier supplier, Function function, AbstractC2761[] abstractC2761Arr) {
        super(cls, str, null, j, jSONSchema, supplier, function, null, null, null, abstractC2761Arr);
        this.f8655 = str2;
        this.f8654 = str2 == null ? 0L : AbstractC2859.m5729(str2);
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        Object objMo5418 = null;
        if (abstractC2898.mo6105()) {
            return null;
        }
        if (!abstractC2898.mo6102()) {
            C0276.m849(abstractC2898.mo6124("read rootName error " + this.f8444));
            return null;
        }
        while (!abstractC2898.mo6106()) {
            if (this.f8654 == abstractC2898.mo6083()) {
                objMo5418 = super.mo5418(abstractC2898, type, obj, j);
            } else {
                abstractC2898.mo6188();
            }
        }
        return objMo5418;
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        Object objMo5422 = null;
        if (abstractC2898.mo6105()) {
            return null;
        }
        if (!abstractC2898.mo6102()) {
            C0276.m849(abstractC2898.mo6124("read rootName error " + this.f8444));
            return null;
        }
        while (!abstractC2898.mo6106()) {
            if (this.f8654 == abstractC2898.mo6083()) {
                objMo5422 = super.mo5422(abstractC2898, type, obj, j);
            } else {
                abstractC2898.mo6188();
            }
        }
        return objMo5422;
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo5462(Map map, long j) {
        Map map2 = (Map) map.get(this.f8655);
        if (map2 == null) {
            return null;
        }
        return super.mo5462(map2, j);
    }
}
