package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3527 extends C3516 {
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final Map m6057(Object obj) {
        try {
            return (Map) this.f8772.invoke(obj, null);
        } catch (Exception unused) {
            C1123.m1410(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"));
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6043(Object obj, String str, Object obj2) {
        m6057(obj).put(str, obj2);
    }

    @Override // com.alibaba.fastjson2.reader.C3516, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6042(long j, Object obj, Object obj2) throws IOException {
        if (this.f8499 == null || !(obj2 instanceof Collection)) {
            super.mo6042(j, obj, obj2);
            return;
        }
        C3525.m6053(m6057(obj), (Collection) obj2, this.f8499, this.f8498, AbstractC3766.m6946(this.f8496, j | this.f8767), this.f8497);
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6031(Object obj, Object obj2) {
        Map mapM6057;
        if (obj2 == null || (mapM6057 = m6057(obj)) == Collections.EMPTY_MAP || mapM6057 == null || "java.util.Collections$UnmodifiableMap".equals(mapM6057.getClass().getName())) {
            return;
        }
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6216(obj2);
        }
        mapM6057.putAll((Map) obj2);
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo6044(AbstractC3732 abstractC3732, Object obj) {
        InterfaceC3621 interfaceC3621M6662;
        String strMo6664 = abstractC3732.mo6664();
        if (this.f8761 != null) {
            interfaceC3621M6662 = this.f8761;
        } else {
            InterfaceC3621 interfaceC3621Mo6055 = mo6055(abstractC3732);
            if (interfaceC3621Mo6055 instanceof C3547) {
                interfaceC3621M6662 = C3537.f8558;
                this.f8761 = interfaceC3621M6662;
            } else if (interfaceC3621Mo6055 instanceof C3548) {
                interfaceC3621M6662 = abstractC3732.m6662(((C3548) interfaceC3621Mo6055).f8614);
                this.f8761 = interfaceC3621M6662;
            } else {
                interfaceC3621M6662 = C3537.f8553;
            }
        }
        m6057(obj).put(strMo6664, interfaceC3621M6662.mo6023(abstractC3732, this.f8762, this.f8773, 0L));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo6045() {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.C3516, com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo6032(AbstractC3732 abstractC3732, Object obj) {
        if (this.f8499 != null && abstractC3732.mo6729()) {
            Map mapM6057 = m6057(obj);
            Type type = this.f8496;
            C3525.m6053(mapM6057, abstractC3732.mo6682(type), this.f8499, this.f8498, AbstractC3766.m6946(type, this.f8767), this.f8497);
        } else {
            if (this.f8509 == null) {
                this.f8509 = abstractC3732.f9546.m6971(this.f8768);
            }
            boolean z = abstractC3732.f9544;
            InterfaceC3621 interfaceC3621 = this.f8509;
            Type type2 = this.f8762;
            mo6031(obj, z ? interfaceC3621.mo6027(abstractC3732, type2, this.f8773, this.f8767) : interfaceC3621.mo6023(abstractC3732, type2, this.f8773, this.f8767));
        }
    }
}
