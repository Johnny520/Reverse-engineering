package io.ktor.client.plugins;

import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5143;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.client.plugins.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3926 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Long f12134;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Long f12135;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Long f12136;

    static {
        AbstractC4395.f12971.mo8927(C3926.class);
        try {
            AbstractC4395.m8922(C3926.class);
        } catch (Throwable unused) {
        }
        if (AbstractC5143.m10164("TimeoutConfiguration")) {
            C5919.m11249("Name can't be blank");
        }
    }

    public C3926() {
        this.f12136 = 0L;
        this.f12135 = 0L;
        this.f12134 = 0L;
        this.f12136 = null;
        this.f12135 = null;
        this.f12134 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m8298(Long l) {
        if (l == null || l.longValue() > 0) {
            return;
        }
        C5919.m11249("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3926.class != obj.getClass()) {
            return false;
        }
        C3926 c3926 = (C3926) obj;
        return AbstractC4394.m8917(this.f12136, c3926.f12136) && AbstractC4394.m8917(this.f12135, c3926.f12135) && AbstractC4394.m8917(this.f12134, c3926.f12134);
    }

    public final int hashCode() {
        Long l = this.f12136;
        int iHashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.f12135;
        int iHashCode2 = (iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.f12134;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }
}
