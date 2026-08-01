package io.ktor.server.engine;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4939 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f12822;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4939 f12821 = new C4939("HTTP");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4939 f12820 = new C4939("HTTPS");

    public C4939(String str) {
        this.f12822 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4939) && this.f12822.equals(((C4939) obj).f12822);
    }

    public final int hashCode() {
        return this.f12822.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("ConnectorType(name="), this.f12822, ')');
    }
}
