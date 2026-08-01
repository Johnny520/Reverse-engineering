package p119;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.text.C2068;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7376 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2068 f20000;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2068 f20001;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f19999 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C7371 f19998 = null;

    public C7376(C2068 c2068, C2068 c20682) {
        this.f20001 = c2068;
        this.f20000 = c20682;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7376)) {
            return false;
        }
        C7376 c7376 = (C7376) obj;
        return this.f20001.equals(c7376.f20001) && AbstractC4394.m8917(this.f20000, c7376.f20000) && this.f19999 == c7376.f19999 && AbstractC4394.m8917(this.f19998, c7376.f19998);
    }

    public final int hashCode() {
        int iM140 = AbstractC0053.m140((this.f20000.hashCode() + (this.f20001.hashCode() * 31)) * 31, 31, this.f19999);
        C7371 c7371 = this.f19998;
        return iM140 + (c7371 == null ? 0 : c7371.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f20001) + ", substitution=" + ((Object) this.f20000) + ", isShowingSubstitution=" + this.f19999 + ", layoutCache=" + this.f19998 + ')';
    }
}
