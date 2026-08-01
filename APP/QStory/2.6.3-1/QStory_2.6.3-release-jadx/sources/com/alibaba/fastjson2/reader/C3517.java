package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.AbstractC3766;
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
public final class C3517 extends C3518 {
    public C3517(String str, Type type, Class cls, int i, long j, String str2, JSONSchema jSONSchema, Field field, String str3, BiConsumer biConsumer) {
        super(str, type, cls, i, j, str2, null, null, jSONSchema, field, str3, biConsumer);
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo6043(Object obj, String str, Object obj2) {
        try {
            ((Map) this.f8769.get(obj)).put(str, obj2);
        } catch (Exception unused) {
            C1123.m1410(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"));
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3518, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6042(long j, Object obj, Object obj2) {
        if (this.f8503 == null || !(obj2 instanceof Collection)) {
            super.mo6042(j, obj, obj2);
            return;
        }
        try {
            Map map = (Map) this.f8769.get(obj);
            C3525.m6053(map, (Collection) obj2, this.f8503, this.f8502, AbstractC3766.m6946(this.f8500, j | this.f8767), this.f8501);
        } catch (Exception unused) {
            C1123.m1410(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"));
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3524, com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6031(Object obj, Object obj2) {
        if (obj2 == null) {
            return;
        }
        try {
            Map map = (Map) this.f8769.get(obj);
            if (map == Collections.EMPTY_MAP || map == null || "java.util.Collections$UnmodifiableMap".equals(map.getClass().getName())) {
                return;
            }
            map.putAll((Map) obj2);
        } catch (Exception e) {
            C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void mo6044(AbstractC3732 abstractC3732, Object obj) {
        InterfaceC3621 interfaceC3621;
        InterfaceC3621 interfaceC3621M6662;
        try {
            Map map = (Map) this.f8769.get(obj);
            String strMo6664 = abstractC3732.mo6664();
            if (this.f8761 == null) {
                InterfaceC3621 interfaceC3621Mo6055 = mo6055(abstractC3732);
                if (interfaceC3621Mo6055 instanceof C3547) {
                    interfaceC3621M6662 = C3537.f8558;
                    this.f8761 = interfaceC3621M6662;
                } else if (interfaceC3621Mo6055 instanceof C3548) {
                    interfaceC3621M6662 = abstractC3732.m6662(((C3548) interfaceC3621Mo6055).f8614);
                    this.f8761 = interfaceC3621M6662;
                } else {
                    interfaceC3621 = C3537.f8553;
                }
                map.put(strMo6664, interfaceC3621M6662.mo6023(abstractC3732, null, strMo6664, 0L));
            }
            interfaceC3621 = this.f8761;
            interfaceC3621M6662 = interfaceC3621;
            map.put(strMo6664, interfaceC3621M6662.mo6023(abstractC3732, null, strMo6664, 0L));
        } catch (Exception e) {
            C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), this.f8773, " error", abstractC3732), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean mo6045() {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.C3518, com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo6032(AbstractC3732 abstractC3732, Object obj) {
        if (this.f8503 != null && abstractC3732.mo6729()) {
            try {
                Map map = (Map) this.f8769.get(obj);
                Type type = this.f8500;
                C3525.m6053(map, abstractC3732.mo6682(type), this.f8503, this.f8502, AbstractC3766.m6946(type, this.f8767), this.f8501);
                return;
            } catch (Exception unused) {
                C1123.m1410(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"));
                return;
            }
        }
        if (this.f8509 == null) {
            this.f8509 = abstractC3732.f9546.m6971(this.f8768);
        }
        boolean z = abstractC3732.f9544;
        InterfaceC3621 interfaceC3621 = this.f8509;
        Type type2 = this.f8768;
        mo6031(obj, z ? interfaceC3621.mo6027(abstractC3732, type2, this.f8773, this.f8767) : interfaceC3621.mo6023(abstractC3732, type2, this.f8773, this.f8767));
    }
}
