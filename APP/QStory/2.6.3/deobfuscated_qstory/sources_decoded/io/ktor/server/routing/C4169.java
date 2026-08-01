package io.ktor.server.routing;

import kotlin.jvm.internal.AbstractC4395;
import p236.C8097;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4169 extends AbstractC4160 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final double f12626;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8097 f12627;

    public C4169(double d, C8097 c8097) {
        c8097.getClass();
        this.f12626 = d;
        this.f12627 = c8097;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4169)) {
            return false;
        }
        C4169 c4169 = (C4169) obj;
        return Double.compare(this.f12626, c4169.f12626) == 0 && AbstractC4395.m8907(this.f12627, c4169.f12627);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12627.f22359) + (Double.hashCode(this.f12626) * 31);
    }

    public final String toString() {
        return "Failure(quality=" + this.f12626 + ", failureStatusCode=" + this.f12627 + ')';
    }
}
