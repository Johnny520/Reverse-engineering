package androidx.compose.ui.text;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2030 implements InterfaceC2053 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f5980;

    public C2030(String str) {
        this.f5980 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2030) {
            return this.f5980.equals(((C2030) obj).f5980);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5980.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m148(new StringBuilder("UrlAnnotation(url="), this.f5980, ')');
    }
}
