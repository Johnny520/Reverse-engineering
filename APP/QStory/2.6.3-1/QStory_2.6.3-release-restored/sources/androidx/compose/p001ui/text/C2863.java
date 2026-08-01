package androidx.compose.p001ui.text;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2863 implements InterfaceC2887 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f6324;

    public C2863(String str) {
        this.f6324 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2863) {
            return this.f6324.equals(((C2863) obj).f6324);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6324.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f6324, ')');
    }
}
