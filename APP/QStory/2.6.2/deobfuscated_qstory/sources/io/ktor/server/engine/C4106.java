package io.ktor.server.engine;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4106 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f12473;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4106 f12472 = new C4106("HTTP");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4106 f12471 = new C4106("HTTPS");

    public C4106(String str) {
        this.f12473 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4106) && this.f12473.equals(((C4106) obj).f12473);
    }

    public final int hashCode() {
        return this.f12473.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("ConnectorType(name="), this.f12473, ')');
    }
}
