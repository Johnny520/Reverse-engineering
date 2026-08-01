package com.alibaba.fastjson2;

import androidx.collection.C0276;
import bsh.C2668;
import bsh.classpath.C2602;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import p291.C8532;
import p291.InterfaceC8531;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2957 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final JSONArray f9368;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C2954 f9369;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2925 f9370;

    public C2957(C2954 c2954, C2925 c2925, JSONArray jSONArray) {
        this.f9369 = c2954;
        this.f9370 = c2925;
        this.f9368 = jSONArray;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        m6366(obj, this.f9368, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m6366(Object obj, JSONArray jSONArray, int i) {
        long j = this.f9369.f9355;
        if (i >= 2048) {
            C0276.m849("level too large");
            return;
        }
        if (obj instanceof Map) {
            Collection collectionValues = ((Map) obj).values();
            if (j == C2954.f9354) {
                jSONArray.addAll(collectionValues);
            } else if (j == C2954.f9353) {
                jSONArray.add(obj);
            }
            collectionValues.forEach(this);
            return;
        }
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            if (j == C2954.f9354) {
                jSONArray.addAll(collection);
            } else if (j == C2954.f9353) {
                jSONArray.add(obj);
            }
            collection.forEach(this);
            return;
        }
        if (obj != null) {
            InterfaceC8531 interfaceC8531M5982 = this.f9370.f9272.m6321().m5982(obj.getClass());
            if (interfaceC8531M5982 instanceof C8532) {
                List list = ((C8532) interfaceC8531M5982).f23722;
                m6366((list == null || list.isEmpty()) ? new ArrayList() : list.stream().filter(new C2602(1)).map(new C2668(obj, 2)).collect(Collectors.toList()), jSONArray, i + 1);
            }
        }
    }
}
