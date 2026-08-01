package androidx.compose.runtime;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1379 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f3983;

    public C1379(String str) {
        this.f3983 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1379) && this.f3983.equals(((C1379) obj).f3983);
    }

    public final int hashCode() {
        return this.f3983.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("OpaqueKey(key="), this.f3983, ')');
    }
}
