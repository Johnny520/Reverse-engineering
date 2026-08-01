package com.alibaba.fastjson2;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import p307.AbstractC9323;
import p307.C9353;
import p307.InterfaceC9352;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3790 implements BiConsumer, Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final JSONArray f9712;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C3788 f9713;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3759 f9714;

    public C3790(C3788 c3788, C3759 c3759, JSONArray jSONArray) {
        this.f9713 = c3788;
        this.f9714 = c3759;
        this.f9712 = jSONArray;
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
        InterfaceC9352 interfaceC9352M6587 = this.f9714.f9619.m6939().m6587(obj.getClass());
        boolean z = interfaceC9352M6587 instanceof C9353;
        long j = this.f9713.f9702;
        JSONArray jSONArray = this.f9712;
        if (!z) {
            if (j == C3788.f9701) {
                jSONArray.add(obj);
                return;
            }
            return;
        }
        AbstractC9323 abstractC9323Mo14650 = interfaceC9352M6587.mo14650(j);
        if (abstractC9323Mo14650 != null) {
            Object objMo14554 = abstractC9323Mo14650.mo14554(obj);
            if (objMo14554 != null) {
                jSONArray.add(objMo14554);
                return;
            }
            return;
        }
        int i = 0;
        while (true) {
            List list = ((C9353) interfaceC9352M6587).f24058;
            if (i >= list.size()) {
                return;
            }
            accept(((AbstractC9323) list.get(i)).mo14554(obj));
            i++;
        }
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        C3788 c3788 = this.f9713;
        boolean zEquals = c3788.f9703.equals(obj);
        JSONArray jSONArray = this.f9712;
        if (zEquals) {
            jSONArray.add(obj2);
        }
        if (obj2 instanceof Map) {
            ((Map) obj2).forEach(this);
        } else if (obj2 instanceof List) {
            ((List) obj2).forEach(this);
        } else if (c3788.f9702 == C3788.f9701) {
            jSONArray.add(obj2);
        }
    }
}
