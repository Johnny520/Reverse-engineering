package androidx.compose.p001ui.text;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2864 implements InterfaceC2887 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f6325;

    public C2864(String str) {
        this.f6325 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2864) {
            return this.f6325.equals(((C2864) obj).f6325);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6325.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("UrlAnnotation(url="), this.f6325, ')');
    }
}
