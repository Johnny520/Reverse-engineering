package com.alibaba.fastjson2;

import androidx.collection.C0276;
import bsh.C2669;
import bsh.classpath.C2603;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import p291.C8524;
import p291.InterfaceC8523;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2958 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final JSONArray f9370;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C2955 f9371;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2926 f9372;

    public C2958(C2955 c2955, C2926 c2926, JSONArray jSONArray) {
        this.f9371 = c2955;
        this.f9372 = c2926;
        this.f9370 = jSONArray;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        m6424(obj, this.f9370, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m6424(Object obj, JSONArray jSONArray, int i) {
        long j = this.f9371.f9357;
        if (i >= 2048) {
            C0276.m850("level too large");
            return;
        }
        if (obj instanceof Map) {
            Collection collectionValues = ((Map) obj).values();
            if (j == C2955.f9356) {
                jSONArray.addAll(collectionValues);
            } else if (j == C2955.f9355) {
                jSONArray.add(obj);
            }
            collectionValues.forEach(this);
            return;
        }
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            if (j == C2955.f9356) {
                jSONArray.addAll(collection);
            } else if (j == C2955.f9355) {
                jSONArray.add(obj);
            }
            collection.forEach(this);
            return;
        }
        if (obj != null) {
            InterfaceC8523 interfaceC8523M6027 = this.f9372.f9274.m6379().m6027(obj.getClass());
            if (interfaceC8523M6027 instanceof C8524) {
                List list = ((C8524) interfaceC8523M6027).f23713;
                m6424((list == null || list.isEmpty()) ? new ArrayList() : list.stream().filter(new C2603(1)).map(new C2669(obj, 2)).collect(Collectors.toList()), jSONArray, i + 1);
            }
        }
    }
}
