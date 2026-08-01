package com.alibaba.fastjson2;

import java.time.ZoneId;
import p307.C9368;
import p307.InterfaceC9352;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3728 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final ZoneId f9495 = ZoneId.systemDefault();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f9496;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ZoneId f9497;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f9498;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9368 f9499;

    public C3728(C9368 c9368, JSONWriter$Feature... jSONWriter$FeatureArr) {
        if (c9368 == null) {
            C6755.m11869("objectWriterProvider must not null");
            throw null;
        }
        String str = AbstractC3766.f9634;
        this.f9498 = 0L;
        this.f9499 = c9368;
        this.f9497 = null;
        this.f9496 = AbstractC3766.f9642;
        for (JSONWriter$Feature jSONWriter$Feature : jSONWriter$FeatureArr) {
            this.f9498 |= jSONWriter$Feature.mask;
        }
        String str2 = AbstractC3766.f9634;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ZoneId m6585() {
        if (this.f9497 == null) {
            this.f9497 = f9495;
        }
        return this.f9497;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC9352 m6586(Class cls, Class cls2) {
        return this.f9499.m14665(cls, cls2, (this.f9498 & JSONWriter$Feature.FieldBased.mask) != 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC9352 m6587(Class cls) {
        return this.f9499.m14665(cls, cls, (this.f9498 & JSONWriter$Feature.FieldBased.mask) != 0);
    }

    public C3728(C9368 c9368) {
        if (c9368 != null) {
            String str = AbstractC3766.f9634;
            this.f9498 = 0L;
            this.f9499 = c9368;
            this.f9497 = null;
            this.f9496 = AbstractC3766.f9642;
            return;
        }
        C6755.m11869("objectWriterProvider must not null");
        throw null;
    }
}
