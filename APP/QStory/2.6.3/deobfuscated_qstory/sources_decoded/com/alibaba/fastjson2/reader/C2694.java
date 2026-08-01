package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2694 extends C2683 {
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final Map m5497(Object obj) {
        try {
            return (Map) this.f8427.invoke(obj, null);
        } catch (Exception unused) {
            C0276.m850(AbstractC0053.m151(new StringBuilder("set "), this.f8428, " error"));
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo5483(Object obj, String str, Object obj2) {
        m5497(obj).put(str, obj2);
    }

    @Override // com.alibaba.fastjson2.reader.C2683, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo5482(long j, Object obj, Object obj2) throws IOException {
        if (this.f8154 == null || !(obj2 instanceof Collection)) {
            super.mo5482(j, obj, obj2);
            return;
        }
        C2692.m5493(m5497(obj), (Collection) obj2, this.f8154, this.f8153, AbstractC2933.m6386(this.f8151, j | this.f8422), this.f8152);
    }

    @Override // com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5471(Object obj, Object obj2) {
        Map mapM5497;
        if (obj2 == null || (mapM5497 = m5497(obj)) == Collections.EMPTY_MAP || mapM5497 == null || "java.util.Collections$UnmodifiableMap".equals(mapM5497.getClass().getName())) {
            return;
        }
        JSONSchema jSONSchema = this.f8413;
        if (jSONSchema != null) {
            jSONSchema.m5656(obj2);
        }
        mapM5497.putAll((Map) obj2);
    }

    @Override // com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo5484(AbstractC2899 abstractC2899, Object obj) {
        InterfaceC2788 interfaceC2788M6102;
        String strMo6104 = abstractC2899.mo6104();
        if (this.f8416 != null) {
            interfaceC2788M6102 = this.f8416;
        } else {
            InterfaceC2788 interfaceC2788Mo5495 = mo5495(abstractC2899);
            if (interfaceC2788Mo5495 instanceof C2714) {
                interfaceC2788M6102 = C2704.f8213;
                this.f8416 = interfaceC2788M6102;
            } else if (interfaceC2788Mo5495 instanceof C2715) {
                interfaceC2788M6102 = abstractC2899.m6102(((C2715) interfaceC2788Mo5495).f8269);
                this.f8416 = interfaceC2788M6102;
            } else {
                interfaceC2788M6102 = C2704.f8208;
            }
        }
        m5497(obj).put(strMo6104, interfaceC2788M6102.mo5463(abstractC2899, this.f8417, this.f8428, 0L));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo5485() {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.C2683, com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5472(AbstractC2899 abstractC2899, Object obj) {
        if (this.f8154 != null && abstractC2899.mo6169()) {
            Map mapM5497 = m5497(obj);
            Type type = this.f8151;
            C2692.m5493(mapM5497, abstractC2899.mo6122(type), this.f8154, this.f8153, AbstractC2933.m6386(type, this.f8422), this.f8152);
        } else {
            if (this.f8164 == null) {
                this.f8164 = abstractC2899.f9201.m6411(this.f8423);
            }
            boolean z = abstractC2899.f9199;
            InterfaceC2788 interfaceC2788 = this.f8164;
            Type type2 = this.f8417;
            mo5471(obj, z ? interfaceC2788.mo5467(abstractC2899, type2, this.f8428, this.f8422) : interfaceC2788.mo5463(abstractC2899, type2, this.f8428, this.f8422));
        }
    }
}
