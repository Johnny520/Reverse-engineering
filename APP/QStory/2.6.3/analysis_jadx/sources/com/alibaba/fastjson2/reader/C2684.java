package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2684 extends C2685 {
    public C2684(String str, Type type, Class cls, int i, long j, String str2, JSONSchema jSONSchema, Field field, String str3, BiConsumer biConsumer) {
        super(str, type, cls, i, j, str2, null, null, jSONSchema, field, str3, biConsumer);
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo5483(Object obj, String str, Object obj2) {
        try {
            ((Map) this.f8424.get(obj)).put(str, obj2);
        } catch (Exception unused) {
            C0276.m850(AbstractC0053.m151(new StringBuilder("set "), this.f8428, " error"));
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2685, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo5482(long j, Object obj, Object obj2) {
        if (this.f8158 == null || !(obj2 instanceof Collection)) {
            super.mo5482(j, obj, obj2);
            return;
        }
        try {
            Map map = (Map) this.f8424.get(obj);
            C2692.m5493(map, (Collection) obj2, this.f8158, this.f8157, AbstractC2933.m6386(this.f8155, j | this.f8422), this.f8156);
        } catch (Exception unused) {
            C0276.m850(AbstractC0053.m151(new StringBuilder("set "), this.f8428, " error"));
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5471(Object obj, Object obj2) {
        if (obj2 == null) {
            return;
        }
        try {
            Map map = (Map) this.f8424.get(obj);
            if (map == Collections.EMPTY_MAP || map == null || "java.util.Collections$UnmodifiableMap".equals(map.getClass().getName())) {
                return;
            }
            map.putAll((Map) obj2);
        } catch (Exception e) {
            C0276.m843(AbstractC0053.m151(new StringBuilder("set "), this.f8428, " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void mo5484(AbstractC2899 abstractC2899, Object obj) {
        InterfaceC2788 interfaceC2788;
        InterfaceC2788 interfaceC2788M6102;
        try {
            Map map = (Map) this.f8424.get(obj);
            String strMo6104 = abstractC2899.mo6104();
            if (this.f8416 == null) {
                InterfaceC2788 interfaceC2788Mo5495 = mo5495(abstractC2899);
                if (interfaceC2788Mo5495 instanceof C2714) {
                    interfaceC2788M6102 = C2704.f8213;
                    this.f8416 = interfaceC2788M6102;
                } else if (interfaceC2788Mo5495 instanceof C2715) {
                    interfaceC2788M6102 = abstractC2899.m6102(((C2715) interfaceC2788Mo5495).f8269);
                    this.f8416 = interfaceC2788M6102;
                } else {
                    interfaceC2788 = C2704.f8208;
                }
                map.put(strMo6104, interfaceC2788M6102.mo5463(abstractC2899, null, strMo6104, 0L));
            }
            interfaceC2788 = this.f8416;
            interfaceC2788M6102 = interfaceC2788;
            map.put(strMo6104, interfaceC2788M6102.mo5463(abstractC2899, null, strMo6104, 0L));
        } catch (Exception e) {
            C0276.m843(AbstractC2442.m4577(new StringBuilder("set "), this.f8428, " error", abstractC2899), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean mo5485() {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.C2685, com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5472(AbstractC2899 abstractC2899, Object obj) {
        if (this.f8158 != null && abstractC2899.mo6169()) {
            try {
                Map map = (Map) this.f8424.get(obj);
                Type type = this.f8155;
                C2692.m5493(map, abstractC2899.mo6122(type), this.f8158, this.f8157, AbstractC2933.m6386(type, this.f8422), this.f8156);
                return;
            } catch (Exception unused) {
                C0276.m850(AbstractC0053.m151(new StringBuilder("set "), this.f8428, " error"));
                return;
            }
        }
        if (this.f8164 == null) {
            this.f8164 = abstractC2899.f9201.m6411(this.f8423);
        }
        boolean z = abstractC2899.f9199;
        InterfaceC2788 interfaceC2788 = this.f8164;
        Type type2 = this.f8423;
        mo5471(obj, z ? interfaceC2788.mo5467(abstractC2899, type2, this.f8428, this.f8422) : interfaceC2788.mo5463(abstractC2899, type2, this.f8428, this.f8422));
    }
}
