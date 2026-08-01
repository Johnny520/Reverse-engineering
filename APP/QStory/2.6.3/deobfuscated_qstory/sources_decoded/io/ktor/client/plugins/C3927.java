package io.ktor.client.plugins;

import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.text.AbstractC5144;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.client.plugins.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3927 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Long f12139;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Long f12140;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Long f12141;

    static {
        AbstractC4396.f12975.mo8917(C3927.class);
        try {
            AbstractC4396.m8912(C3927.class);
        } catch (Throwable unused) {
        }
        if (AbstractC5144.m10172("TimeoutConfiguration")) {
            C5925.m11310("Name can't be blank");
        }
    }

    public C3927() {
        this.f12141 = 0L;
        this.f12140 = 0L;
        this.f12139 = 0L;
        this.f12141 = null;
        this.f12140 = null;
        this.f12139 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m8288(Long l) {
        if (l == null || l.longValue() > 0) {
            return;
        }
        C5925.m11310("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3927.class != obj.getClass()) {
            return false;
        }
        C3927 c3927 = (C3927) obj;
        return AbstractC4395.m8907(this.f12141, c3927.f12141) && AbstractC4395.m8907(this.f12140, c3927.f12140) && AbstractC4395.m8907(this.f12139, c3927.f12139);
    }

    public final int hashCode() {
        Long l = this.f12141;
        int iHashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.f12140;
        int iHashCode2 = (iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.f12139;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }
}
