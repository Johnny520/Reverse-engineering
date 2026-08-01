package com.google.protobuf;

import java.util.Map;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3388 implements Map.Entry {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Map.Entry f11046;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f11046.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C3383 c3383 = (C3383) this.f11046.getValue();
        if (c3383 == null) {
            return null;
        }
        return c3383.m7488();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof InterfaceC3441)) {
            C5925.m11310("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            return null;
        }
        C3383 c3383 = (C3383) this.f11046.getValue();
        InterfaceC3441 interfaceC3441 = c3383.f11034;
        c3383.f11036 = null;
        c3383.f11033 = null;
        c3383.f11034 = (InterfaceC3441) obj;
        return interfaceC3441;
    }
}
