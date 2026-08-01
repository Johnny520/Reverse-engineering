package androidx.compose.ui.text;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2029 implements InterfaceC2053 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f5978;

    public C2029(String str) {
        this.f5978 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2029) {
            return this.f5978.equals(((C2029) obj).f5978);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5978.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f5978, ')');
    }
}
