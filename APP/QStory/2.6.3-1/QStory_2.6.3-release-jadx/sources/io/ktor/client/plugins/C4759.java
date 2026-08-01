package io.ktor.client.plugins;

import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.text.AbstractC5976;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.client.plugins.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4759 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Long f12484;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Long f12485;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Long f12486;

    static {
        AbstractC5228.f13320.mo9476(C4759.class);
        try {
            AbstractC5228.m9471(C4759.class);
        } catch (Throwable unused) {
        }
        if (AbstractC5976.m10731("TimeoutConfiguration")) {
            C6755.m11869("Name can't be blank");
        }
    }

    public C4759() {
        this.f12486 = 0L;
        this.f12485 = 0L;
        this.f12484 = 0L;
        this.f12486 = null;
        this.f12485 = null;
        this.f12484 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m8847(Long l) {
        if (l == null || l.longValue() > 0) {
            return;
        }
        C6755.m11869("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4759.class != obj.getClass()) {
            return false;
        }
        C4759 c4759 = (C4759) obj;
        return AbstractC5227.m9466(this.f12486, c4759.f12486) && AbstractC5227.m9466(this.f12485, c4759.f12485) && AbstractC5227.m9466(this.f12484, c4759.f12484);
    }

    public final int hashCode() {
        Long l = this.f12486;
        int iHashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.f12485;
        int iHashCode2 = (iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.f12484;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }
}
