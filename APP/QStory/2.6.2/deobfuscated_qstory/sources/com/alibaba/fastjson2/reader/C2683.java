package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2683 extends C2684 {
    public C2683(String str, Type type, Class cls, int i, long j, String str2, JSONSchema jSONSchema, Field field, String str3, BiConsumer biConsumer) {
        super(str, type, cls, i, j, str2, null, null, jSONSchema, field, str3, biConsumer);
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo5438(Object obj, String str, Object obj2) {
        try {
            ((Map) this.f8422.get(obj)).put(str, obj2);
        } catch (Exception unused) {
            C0276.m849(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"));
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2684, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo5437(long j, Object obj, Object obj2) {
        if (this.f8156 == null || !(obj2 instanceof Collection)) {
            super.mo5437(j, obj, obj2);
            return;
        }
        try {
            Map map = (Map) this.f8422.get(obj);
            C2691.m5448(map, (Collection) obj2, this.f8156, this.f8155, AbstractC2932.m6328(this.f8153, j | this.f8420), this.f8154);
        } catch (Exception unused) {
            C0276.m849(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"));
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2690, com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5426(Object obj, Object obj2) {
        if (obj2 == null) {
            return;
        }
        try {
            Map map = (Map) this.f8422.get(obj);
            if (map == Collections.EMPTY_MAP || map == null || "java.util.Collections$UnmodifiableMap".equals(map.getClass().getName())) {
                return;
            }
            map.putAll((Map) obj2);
        } catch (Exception e) {
            C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void mo5439(AbstractC2898 abstractC2898, Object obj) {
        InterfaceC2787 interfaceC2787;
        InterfaceC2787 interfaceC2787M6056;
        try {
            Map map = (Map) this.f8422.get(obj);
            String strMo6058 = abstractC2898.mo6058();
            if (this.f8414 == null) {
                InterfaceC2787 interfaceC2787Mo5450 = mo5450(abstractC2898);
                if (interfaceC2787Mo5450 instanceof C2713) {
                    interfaceC2787M6056 = C2703.f8211;
                    this.f8414 = interfaceC2787M6056;
                } else if (interfaceC2787Mo5450 instanceof C2714) {
                    interfaceC2787M6056 = abstractC2898.m6056(((C2714) interfaceC2787Mo5450).f8267);
                    this.f8414 = interfaceC2787M6056;
                } else {
                    interfaceC2787 = C2703.f8206;
                }
                map.put(strMo6058, interfaceC2787M6056.mo5418(abstractC2898, null, strMo6058, 0L));
            }
            interfaceC2787 = this.f8414;
            interfaceC2787M6056 = interfaceC2787;
            map.put(strMo6058, interfaceC2787M6056.mo5418(abstractC2898, null, strMo6058, 0L));
        } catch (Exception e) {
            C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), this.f8426, " error", abstractC2898), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean mo5440() {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.C2684, com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5427(AbstractC2898 abstractC2898, Object obj) {
        if (this.f8156 != null && abstractC2898.mo6123()) {
            try {
                Map map = (Map) this.f8422.get(obj);
                Type type = this.f8153;
                C2691.m5448(map, abstractC2898.mo6076(type), this.f8156, this.f8155, AbstractC2932.m6328(type, this.f8420), this.f8154);
                return;
            } catch (Exception unused) {
                C0276.m849(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"));
                return;
            }
        }
        if (this.f8162 == null) {
            this.f8162 = abstractC2898.f9199.m6353(this.f8421);
        }
        boolean z = abstractC2898.f9197;
        InterfaceC2787 interfaceC2787 = this.f8162;
        Type type2 = this.f8421;
        mo5426(obj, z ? interfaceC2787.mo5422(abstractC2898, type2, this.f8426, this.f8420) : interfaceC2787.mo5418(abstractC2898, type2, this.f8426, this.f8420));
    }
}
