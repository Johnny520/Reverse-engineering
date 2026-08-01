package io.ktor.server.engine;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4107 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f12477;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4107 f12476 = new C4107("HTTP");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4107 f12475 = new C4107("HTTPS");

    public C4107(String str) {
        this.f12477 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4107) && this.f12477.equals(((C4107) obj).f12477);
    }

    public final int hashCode() {
        return this.f12477.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m148(new StringBuilder("ConnectorType(name="), this.f12477, ')');
    }
}
