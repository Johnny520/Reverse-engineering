package io.ktor.server.routing;

import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4158 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final RoutingPathSegmentKind f12594;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f12595;

    public C4158(String str, RoutingPathSegmentKind routingPathSegmentKind) {
        str.getClass();
        routingPathSegmentKind.getClass();
        this.f12595 = str;
        this.f12594 = routingPathSegmentKind;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4158)) {
            return false;
        }
        C4158 c4158 = (C4158) obj;
        return AbstractC4394.m8917(this.f12595, c4158.f12595) && this.f12594 == c4158.f12594;
    }

    public final int hashCode() {
        return this.f12594.hashCode() + (this.f12595.hashCode() * 31);
    }

    public final String toString() {
        return "RoutingPathSegment(value=" + this.f12595 + ", kind=" + this.f12594 + ')';
    }
}
