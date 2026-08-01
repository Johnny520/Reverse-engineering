package io.ktor.client.statement;

import kotlin.jvm.internal.AbstractC5227;
import p075.C7686;

/* JADX INFO: renamed from: io.ktor.client.statement.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4777 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f12502;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7686 f12503;

    public C4777(C7686 c7686, Object obj) {
        c7686.getClass();
        obj.getClass();
        this.f12503 = c7686;
        this.f12502 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4777)) {
            return false;
        }
        C4777 c4777 = (C4777) obj;
        return AbstractC5227.m9466(this.f12503, c4777.f12503) && AbstractC5227.m9466(this.f12502, c4777.f12502);
    }

    public final int hashCode() {
        return this.f12502.hashCode() + (this.f12503.hashCode() * 31);
    }

    public final String toString() {
        return "HttpResponseContainer(expectedType=" + this.f12503 + ", response=" + this.f12502 + ')';
    }
}
