package com.alibaba.fastjson2;

import androidx.collection.C1123;
import bsh.C3502;
import bsh.classpath.C3436;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import p307.C9353;
import p307.InterfaceC9352;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3791 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final JSONArray f9715;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C3788 f9716;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3759 f9717;

    public C3791(C3788 c3788, C3759 c3759, JSONArray jSONArray) {
        this.f9716 = c3788;
        this.f9717 = c3759;
        this.f9715 = jSONArray;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        m6984(obj, this.f9715, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m6984(Object obj, JSONArray jSONArray, int i) {
        long j = this.f9716.f9702;
        if (i >= 2048) {
            C1123.m1410("level too large");
            return;
        }
        if (obj instanceof Map) {
            Collection collectionValues = ((Map) obj).values();
            if (j == C3788.f9701) {
                jSONArray.addAll(collectionValues);
            } else if (j == C3788.f9700) {
                jSONArray.add(obj);
            }
            collectionValues.forEach(this);
            return;
        }
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            if (j == C3788.f9701) {
                jSONArray.addAll(collection);
            } else if (j == C3788.f9700) {
                jSONArray.add(obj);
            }
            collection.forEach(this);
            return;
        }
        if (obj != null) {
            InterfaceC9352 interfaceC9352M6587 = this.f9717.f9619.m6939().m6587(obj.getClass());
            if (interfaceC9352M6587 instanceof C9353) {
                List list = ((C9353) interfaceC9352M6587).f24058;
                m6984((list == null || list.isEmpty()) ? new ArrayList() : list.stream().filter(new C3436(1)).map(new C3502(obj, 2)).collect(Collectors.toList()), jSONArray, i + 1);
            }
        }
    }
}
