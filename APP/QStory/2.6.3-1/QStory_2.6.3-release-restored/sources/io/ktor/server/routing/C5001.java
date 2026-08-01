package io.ktor.server.routing;

import kotlin.jvm.internal.AbstractC5227;
import p252.C8926;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5001 extends AbstractC4992 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final double f12971;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8926 f12972;

    public C5001(double d, C8926 c8926) {
        c8926.getClass();
        this.f12971 = d;
        this.f12972 = c8926;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5001)) {
            return false;
        }
        C5001 c5001 = (C5001) obj;
        return Double.compare(this.f12971, c5001.f12971) == 0 && AbstractC5227.m9466(this.f12972, c5001.f12972);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12972.f22704) + (Double.hashCode(this.f12971) * 31);
    }

    public final String toString() {
        return "Failure(quality=" + this.f12971 + ", failureStatusCode=" + this.f12972 + ')';
    }
}
