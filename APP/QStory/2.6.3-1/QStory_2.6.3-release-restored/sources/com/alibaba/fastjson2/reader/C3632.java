package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3693;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3632 extends C3605 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final long f9001;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final String f9002;

    public C3632(Class cls, String str, String str2, long j, JSONSchema jSONSchema, Supplier supplier, Function function, AbstractC3595[] abstractC3595Arr) {
        super(cls, str, null, j, jSONSchema, supplier, function, null, null, null, abstractC3595Arr);
        this.f9002 = str2;
        this.f9001 = str2 == null ? 0L : AbstractC3693.m6334(str2);
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        Object objMo6023 = null;
        if (abstractC3732.mo6711()) {
            return null;
        }
        if (!abstractC3732.mo6708()) {
            C1123.m1410(abstractC3732.mo6730("read rootName error " + this.f8791));
            return null;
        }
        while (!abstractC3732.mo6712()) {
            if (this.f9001 == abstractC3732.mo6689()) {
                objMo6023 = super.mo6023(abstractC3732, type, obj, j);
            } else {
                abstractC3732.mo6793();
            }
        }
        return objMo6023;
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        Object objMo6027 = null;
        if (abstractC3732.mo6711()) {
            return null;
        }
        if (!abstractC3732.mo6708()) {
            C1123.m1410(abstractC3732.mo6730("read rootName error " + this.f8791));
            return null;
        }
        while (!abstractC3732.mo6712()) {
            if (this.f9001 == abstractC3732.mo6689()) {
                objMo6027 = super.mo6027(abstractC3732, type, obj, j);
            } else {
                abstractC3732.mo6793();
            }
        }
        return objMo6027;
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo6067(Map map, long j) {
        Map map2 = (Map) map.get(this.f9002);
        if (map2 == null) {
            return null;
        }
        return super.mo6067(map2, j);
    }
}
