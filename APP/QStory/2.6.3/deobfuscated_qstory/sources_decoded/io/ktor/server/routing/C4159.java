package io.ktor.server.routing;

import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4159 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final RoutingPathSegmentKind f12598;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f12599;

    public C4159(String str, RoutingPathSegmentKind routingPathSegmentKind) {
        str.getClass();
        routingPathSegmentKind.getClass();
        this.f12599 = str;
        this.f12598 = routingPathSegmentKind;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4159)) {
            return false;
        }
        C4159 c4159 = (C4159) obj;
        return AbstractC4395.m8907(this.f12599, c4159.f12599) && this.f12598 == c4159.f12598;
    }

    public final int hashCode() {
        return this.f12598.hashCode() + (this.f12599.hashCode() * 31);
    }

    public final String toString() {
        return "RoutingPathSegment(value=" + this.f12599 + ", kind=" + this.f12598 + ')';
    }
}
