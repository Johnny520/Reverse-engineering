package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2693 extends C2682 {
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final Map m5452(Object obj) {
        try {
            return (Map) this.f8425.invoke(obj, null);
        } catch (Exception unused) {
            C0276.m849(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"));
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo5438(Object obj, String str, Object obj2) {
        m5452(obj).put(str, obj2);
    }

    @Override // com.alibaba.fastjson2.reader.C2682, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo5437(long j, Object obj, Object obj2) throws IOException {
        if (this.f8152 == null || !(obj2 instanceof Collection)) {
            super.mo5437(j, obj, obj2);
            return;
        }
        C2691.m5448(m5452(obj), (Collection) obj2, this.f8152, this.f8151, AbstractC2932.m6328(this.f8149, j | this.f8420), this.f8150);
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5426(Object obj, Object obj2) {
        Map mapM5452;
        if (obj2 == null || (mapM5452 = m5452(obj)) == Collections.EMPTY_MAP || mapM5452 == null || "java.util.Collections$UnmodifiableMap".equals(mapM5452.getClass().getName())) {
            return;
        }
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5611(obj2);
        }
        mapM5452.putAll((Map) obj2);
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo5439(AbstractC2898 abstractC2898, Object obj) {
        InterfaceC2787 interfaceC2787M6056;
        String strMo6058 = abstractC2898.mo6058();
        if (this.f8414 != null) {
            interfaceC2787M6056 = this.f8414;
        } else {
            InterfaceC2787 interfaceC2787Mo5450 = mo5450(abstractC2898);
            if (interfaceC2787Mo5450 instanceof C2713) {
                interfaceC2787M6056 = C2703.f8211;
                this.f8414 = interfaceC2787M6056;
            } else if (interfaceC2787Mo5450 instanceof C2714) {
                interfaceC2787M6056 = abstractC2898.m6056(((C2714) interfaceC2787Mo5450).f8267);
                this.f8414 = interfaceC2787M6056;
            } else {
                interfaceC2787M6056 = C2703.f8206;
            }
        }
        m5452(obj).put(strMo6058, interfaceC2787M6056.mo5418(abstractC2898, this.f8415, this.f8426, 0L));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo5440() {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.C2682, com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5427(AbstractC2898 abstractC2898, Object obj) {
        if (this.f8152 != null && abstractC2898.mo6123()) {
            Map mapM5452 = m5452(obj);
            Type type = this.f8149;
            C2691.m5448(mapM5452, abstractC2898.mo6076(type), this.f8152, this.f8151, AbstractC2932.m6328(type, this.f8420), this.f8150);
        } else {
            if (this.f8162 == null) {
                this.f8162 = abstractC2898.f9199.m6353(this.f8421);
            }
            boolean z = abstractC2898.f9197;
            InterfaceC2787 interfaceC2787 = this.f8162;
            Type type2 = this.f8415;
            mo5426(obj, z ? interfaceC2787.mo5422(abstractC2898, type2, this.f8426, this.f8420) : interfaceC2787.mo5418(abstractC2898, type2, this.f8426, this.f8420));
        }
    }
}
