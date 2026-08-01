package io.ktor.client.statement;

import kotlin.jvm.internal.AbstractC4395;
import p059.C6857;

/* JADX INFO: renamed from: io.ktor.client.statement.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3945 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f12157;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6857 f12158;

    public C3945(C6857 c6857, Object obj) {
        c6857.getClass();
        obj.getClass();
        this.f12158 = c6857;
        this.f12157 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3945)) {
            return false;
        }
        C3945 c3945 = (C3945) obj;
        return AbstractC4395.m8907(this.f12158, c3945.f12158) && AbstractC4395.m8907(this.f12157, c3945.f12157);
    }

    public final int hashCode() {
        return this.f12157.hashCode() + (this.f12158.hashCode() * 31);
    }

    public final String toString() {
        return "HttpResponseContainer(expectedType=" + this.f12158 + ", response=" + this.f12157 + ')';
    }
}
