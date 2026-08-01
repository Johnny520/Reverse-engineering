package com.alibaba.fastjson2;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import p291.AbstractC8494;
import p291.C8524;
import p291.InterfaceC8523;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2957 implements BiConsumer, Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final JSONArray f9367;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C2955 f9368;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2926 f9369;

    public C2957(C2955 c2955, C2926 c2926, JSONArray jSONArray) {
        this.f9368 = c2955;
        this.f9369 = c2926;
        this.f9367 = jSONArray;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Map) {
            ((Map) obj).forEach(this);
            return;
        }
        if (obj instanceof List) {
            ((List) obj).forEach(this);
            return;
        }
        InterfaceC8523 interfaceC8523M6027 = this.f9369.f9274.m6379().m6027(obj.getClass());
        boolean z = interfaceC8523M6027 instanceof C8524;
        long j = this.f9368.f9357;
        JSONArray jSONArray = this.f9367;
        if (!z) {
            if (j == C2955.f9356) {
                jSONArray.add(obj);
                return;
            }
            return;
        }
        AbstractC8494 abstractC8494Mo14091 = interfaceC8523M6027.mo14091(j);
        if (abstractC8494Mo14091 != null) {
            Object objMo13995 = abstractC8494Mo14091.mo13995(obj);
            if (objMo13995 != null) {
                jSONArray.add(objMo13995);
                return;
            }
            return;
        }
        int i = 0;
        while (true) {
            List list = ((C8524) interfaceC8523M6027).f23713;
            if (i >= list.size()) {
                return;
            }
            accept(((AbstractC8494) list.get(i)).mo13995(obj));
            i++;
        }
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        C2955 c2955 = this.f9368;
        boolean zEquals = c2955.f9358.equals(obj);
        JSONArray jSONArray = this.f9367;
        if (zEquals) {
            jSONArray.add(obj2);
        }
        if (obj2 instanceof Map) {
            ((Map) obj2).forEach(this);
        } else if (obj2 instanceof List) {
            ((List) obj2).forEach(this);
        } else if (c2955.f9357 == C2955.f9356) {
            jSONArray.add(obj2);
        }
    }
}
