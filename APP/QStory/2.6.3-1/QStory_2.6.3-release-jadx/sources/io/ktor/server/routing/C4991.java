package io.ktor.server.routing;

import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4991 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final RoutingPathSegmentKind f12943;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f12944;

    public C4991(String str, RoutingPathSegmentKind routingPathSegmentKind) {
        str.getClass();
        routingPathSegmentKind.getClass();
        this.f12944 = str;
        this.f12943 = routingPathSegmentKind;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4991)) {
            return false;
        }
        C4991 c4991 = (C4991) obj;
        return AbstractC5227.m9466(this.f12944, c4991.f12944) && this.f12943 == c4991.f12943;
    }

    public final int hashCode() {
        return this.f12943.hashCode() + (this.f12944.hashCode() * 31);
    }

    public final String toString() {
        return "RoutingPathSegment(value=" + this.f12944 + ", kind=" + this.f12943 + ')';
    }
}
