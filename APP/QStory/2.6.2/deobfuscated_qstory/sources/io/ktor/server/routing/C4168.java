package io.ktor.server.routing;

import kotlin.jvm.internal.AbstractC4394;
import p236.C8096;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4168 extends AbstractC4159 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final double f12622;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8096 f12623;

    public C4168(double d, C8096 c8096) {
        c8096.getClass();
        this.f12622 = d;
        this.f12623 = c8096;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4168)) {
            return false;
        }
        C4168 c4168 = (C4168) obj;
        return Double.compare(this.f12622, c4168.f12622) == 0 && AbstractC4394.m8917(this.f12623, c4168.f12623);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12623.f22361) + (Double.hashCode(this.f12622) * 31);
    }

    public final String toString() {
        return "Failure(quality=" + this.f12622 + ", failureStatusCode=" + this.f12623 + ')';
    }
}
