package com.alibaba.fastjson2;

import java.time.ZoneId;
import p291.C8539;
import p291.InterfaceC8523;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2895 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final ZoneId f9150 = ZoneId.systemDefault();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f9151;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ZoneId f9152;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f9153;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8539 f9154;

    public C2895(C8539 c8539, JSONWriter$Feature... jSONWriter$FeatureArr) {
        if (c8539 == null) {
            C5925.m11310("objectWriterProvider must not null");
            throw null;
        }
        String str = AbstractC2933.f9289;
        this.f9153 = 0L;
        this.f9154 = c8539;
        this.f9152 = null;
        this.f9151 = AbstractC2933.f9297;
        for (JSONWriter$Feature jSONWriter$Feature : jSONWriter$FeatureArr) {
            this.f9153 |= jSONWriter$Feature.mask;
        }
        String str2 = AbstractC2933.f9289;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ZoneId m6025() {
        if (this.f9152 == null) {
            this.f9152 = f9150;
        }
        return this.f9152;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8523 m6026(Class cls, Class cls2) {
        return this.f9154.m14106(cls, cls2, (this.f9153 & JSONWriter$Feature.FieldBased.mask) != 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC8523 m6027(Class cls) {
        return this.f9154.m14106(cls, cls, (this.f9153 & JSONWriter$Feature.FieldBased.mask) != 0);
    }

    public C2895(C8539 c8539) {
        if (c8539 != null) {
            String str = AbstractC2933.f9289;
            this.f9153 = 0L;
            this.f9154 = c8539;
            this.f9152 = null;
            this.f9151 = AbstractC2933.f9297;
            return;
        }
        C5925.m11310("objectWriterProvider must not null");
        throw null;
    }
}
