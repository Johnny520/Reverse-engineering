package com.alibaba.fastjson2;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import p291.AbstractC8502;
import p291.C8532;
import p291.InterfaceC8531;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2956 implements BiConsumer, Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final JSONArray f9365;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C2954 f9366;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2925 f9367;

    public C2956(C2954 c2954, C2925 c2925, JSONArray jSONArray) {
        this.f9366 = c2954;
        this.f9367 = c2925;
        this.f9365 = jSONArray;
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
        InterfaceC8531 interfaceC8531M5982 = this.f9367.f9272.m6321().m5982(obj.getClass());
        boolean z = interfaceC8531M5982 instanceof C8532;
        long j = this.f9366.f9355;
        JSONArray jSONArray = this.f9365;
        if (!z) {
            if (j == C2954.f9354) {
                jSONArray.add(obj);
                return;
            }
            return;
        }
        AbstractC8502 abstractC8502Mo14072 = interfaceC8531M5982.mo14072(j);
        if (abstractC8502Mo14072 != null) {
            Object objMo13976 = abstractC8502Mo14072.mo13976(obj);
            if (objMo13976 != null) {
                jSONArray.add(objMo13976);
                return;
            }
            return;
        }
        int i = 0;
        while (true) {
            List list = ((C8532) interfaceC8531M5982).f23722;
            if (i >= list.size()) {
                return;
            }
            accept(((AbstractC8502) list.get(i)).mo13976(obj));
            i++;
        }
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        C2954 c2954 = this.f9366;
        boolean zEquals = c2954.f9356.equals(obj);
        JSONArray jSONArray = this.f9365;
        if (zEquals) {
            jSONArray.add(obj2);
        }
        if (obj2 instanceof Map) {
            ((Map) obj2).forEach(this);
        } else if (obj2 instanceof List) {
            ((List) obj2).forEach(this);
        } else if (c2954.f9355 == C2954.f9354) {
            jSONArray.add(obj2);
        }
    }
}
