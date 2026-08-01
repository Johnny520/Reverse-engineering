package p135;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.text.C2902;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8206 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2902 f20340;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2902 f20341;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f20339 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C8201 f20338 = null;

    public C8206(C2902 c2902, C2902 c29022) {
        this.f20341 = c2902;
        this.f20340 = c29022;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8206)) {
            return false;
        }
        C8206 c8206 = (C8206) obj;
        return this.f20341.equals(c8206.f20341) && AbstractC5227.m9466(this.f20340, c8206.f20340) && this.f20339 == c8206.f20339 && AbstractC5227.m9466(this.f20338, c8206.f20338);
    }

    public final int hashCode() {
        int iM701 = AbstractC0900.m701((this.f20340.hashCode() + (this.f20341.hashCode() * 31)) * 31, 31, this.f20339);
        C8201 c8201 = this.f20338;
        return iM701 + (c8201 == null ? 0 : c8201.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f20341) + ", substitution=" + ((Object) this.f20340) + ", isShowingSubstitution=" + this.f20339 + ", layoutCache=" + this.f20338 + ')';
    }
}
