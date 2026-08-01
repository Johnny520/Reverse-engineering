package com.google.protobuf;

import java.util.Map;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4220 implements Map.Entry {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Map.Entry f11391;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f11391.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C4215 c4215 = (C4215) this.f11391.getValue();
        if (c4215 == null) {
            return null;
        }
        return c4215.m8047();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof InterfaceC4273)) {
            C6755.m11869("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            return null;
        }
        C4215 c4215 = (C4215) this.f11391.getValue();
        InterfaceC4273 interfaceC4273 = c4215.f11379;
        c4215.f11381 = null;
        c4215.f11378 = null;
        c4215.f11379 = (InterfaceC4273) obj;
        return interfaceC4273;
    }
}
