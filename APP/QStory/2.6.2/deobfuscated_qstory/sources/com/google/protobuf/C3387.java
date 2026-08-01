package com.google.protobuf;

import java.util.Map;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3387 implements Map.Entry {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Map.Entry f11041;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f11041.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C3382 c3382 = (C3382) this.f11041.getValue();
        if (c3382 == null) {
            return null;
        }
        return c3382.m7501();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof InterfaceC3440)) {
            C5919.m11249("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            return null;
        }
        C3382 c3382 = (C3382) this.f11041.getValue();
        InterfaceC3440 interfaceC3440 = c3382.f11029;
        c3382.f11031 = null;
        c3382.f11028 = null;
        c3382.f11029 = (InterfaceC3440) obj;
        return interfaceC3440;
    }
}
