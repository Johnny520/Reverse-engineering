package io.ktor.client.statement;

import kotlin.jvm.internal.AbstractC4394;
import p059.C6856;

/* JADX INFO: renamed from: io.ktor.client.statement.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3944 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f12153;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6856 f12154;

    public C3944(C6856 c6856, Object obj) {
        c6856.getClass();
        obj.getClass();
        this.f12154 = c6856;
        this.f12153 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3944)) {
            return false;
        }
        C3944 c3944 = (C3944) obj;
        return AbstractC4394.m8917(this.f12154, c3944.f12154) && AbstractC4394.m8917(this.f12153, c3944.f12153);
    }

    public final int hashCode() {
        return this.f12153.hashCode() + (this.f12154.hashCode() * 31);
    }

    public final String toString() {
        return "HttpResponseContainer(expectedType=" + this.f12154 + ", response=" + this.f12153 + ')';
    }
}
