package androidx.compose.runtime;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2214 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f4329;

    public C2214(String str) {
        this.f4329 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2214) && this.f4329.equals(((C2214) obj).f4329);
    }

    public final int hashCode() {
        return this.f4329.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("OpaqueKey(key="), this.f4329, ')');
    }
}
