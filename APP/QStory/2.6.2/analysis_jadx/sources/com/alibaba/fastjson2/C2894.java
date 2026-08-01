package com.alibaba.fastjson2;

import java.time.ZoneId;
import p291.C8547;
import p291.InterfaceC8531;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2894 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final ZoneId f9148 = ZoneId.systemDefault();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f9149;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ZoneId f9150;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f9151;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8547 f9152;

    public C2894(C8547 c8547, JSONWriter$Feature... jSONWriter$FeatureArr) {
        if (c8547 == null) {
            C5919.m11249("objectWriterProvider must not null");
            throw null;
        }
        String str = AbstractC2932.f9287;
        this.f9151 = 0L;
        this.f9152 = c8547;
        this.f9150 = null;
        this.f9149 = AbstractC2932.f9295;
        for (JSONWriter$Feature jSONWriter$Feature : jSONWriter$FeatureArr) {
            this.f9151 |= jSONWriter$Feature.mask;
        }
        String str2 = AbstractC2932.f9287;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ZoneId m5980() {
        if (this.f9150 == null) {
            this.f9150 = f9148;
        }
        return this.f9150;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8531 m5981(Class cls, Class cls2) {
        return this.f9152.m14087(cls, cls2, (this.f9151 & JSONWriter$Feature.FieldBased.mask) != 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC8531 m5982(Class cls) {
        return this.f9152.m14087(cls, cls, (this.f9151 & JSONWriter$Feature.FieldBased.mask) != 0);
    }

    public C2894(C8547 c8547) {
        if (c8547 != null) {
            String str = AbstractC2932.f9287;
            this.f9151 = 0L;
            this.f9152 = c8547;
            this.f9150 = null;
            this.f9149 = AbstractC2932.f9295;
            return;
        }
        C5919.m11249("objectWriterProvider must not null");
        throw null;
    }
}
