package p119;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.text.C2068;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7377 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2068 f19995;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2068 f19996;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f19994 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C7372 f19993 = null;

    public C7377(C2068 c2068, C2068 c20682) {
        this.f19996 = c2068;
        this.f19995 = c20682;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7377)) {
            return false;
        }
        C7377 c7377 = (C7377) obj;
        return this.f19996.equals(c7377.f19996) && AbstractC4395.m8907(this.f19995, c7377.f19995) && this.f19994 == c7377.f19994 && AbstractC4395.m8907(this.f19993, c7377.f19993);
    }

    public final int hashCode() {
        int iM141 = AbstractC0053.m141((this.f19995.hashCode() + (this.f19996.hashCode() * 31)) * 31, 31, this.f19994);
        C7372 c7372 = this.f19993;
        return iM141 + (c7372 == null ? 0 : c7372.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f19996) + ", substitution=" + ((Object) this.f19995) + ", isShowingSubstitution=" + this.f19994 + ", layoutCache=" + this.f19993 + ')';
    }
}
