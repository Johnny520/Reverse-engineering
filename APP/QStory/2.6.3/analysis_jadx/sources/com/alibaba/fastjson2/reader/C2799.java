package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2799 extends C2772 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final long f8656;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final String f8657;

    public C2799(Class cls, String str, String str2, long j, JSONSchema jSONSchema, Supplier supplier, Function function, AbstractC2762[] abstractC2762Arr) {
        super(cls, str, null, j, jSONSchema, supplier, function, null, null, null, abstractC2762Arr);
        this.f8657 = str2;
        this.f8656 = str2 == null ? 0L : AbstractC2860.m5774(str2);
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        Object objMo5463 = null;
        if (abstractC2899.mo6151()) {
            return null;
        }
        if (!abstractC2899.mo6148()) {
            C0276.m850(abstractC2899.mo6170("read rootName error " + this.f8446));
            return null;
        }
        while (!abstractC2899.mo6152()) {
            if (this.f8656 == abstractC2899.mo6129()) {
                objMo5463 = super.mo5463(abstractC2899, type, obj, j);
            } else {
                abstractC2899.mo6233();
            }
        }
        return objMo5463;
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        Object objMo5467 = null;
        if (abstractC2899.mo6151()) {
            return null;
        }
        if (!abstractC2899.mo6148()) {
            C0276.m850(abstractC2899.mo6170("read rootName error " + this.f8446));
            return null;
        }
        while (!abstractC2899.mo6152()) {
            if (this.f8656 == abstractC2899.mo6129()) {
                objMo5467 = super.mo5467(abstractC2899, type, obj, j);
            } else {
                abstractC2899.mo6233();
            }
        }
        return objMo5467;
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo5507(Map map, long j) {
        Map map2 = (Map) map.get(this.f8657);
        if (map2 == null) {
            return null;
        }
        return super.mo5507(map2, j);
    }
}
