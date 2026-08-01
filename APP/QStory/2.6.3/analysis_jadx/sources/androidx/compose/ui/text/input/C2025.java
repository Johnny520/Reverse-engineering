package androidx.compose.ui.text.input;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3066;
import kotlin.jvm.internal.AbstractC4395;
import p194.C7832;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2025 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C2025 f5968 = new C2025(false, 0, true, 1, 1, C7832.f21372);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C7832 f5969;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f5970;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f5971;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f5972;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f5973;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f5974;

    public C2025(boolean z, int i, boolean z2, int i2, int i3, C7832 c7832) {
        this.f5974 = z;
        this.f5973 = i;
        this.f5972 = z2;
        this.f5971 = i2;
        this.f5970 = i3;
        this.f5969 = c7832;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2025)) {
            return false;
        }
        C2025 c2025 = (C2025) obj;
        return this.f5974 == c2025.f5974 && this.f5973 == c2025.f5973 && this.f5972 == c2025.f5972 && this.f5971 == c2025.f5971 && this.f5970 == c2025.f5970 && AbstractC4395.m8907(this.f5969, c2025.f5969);
    }

    public final int hashCode() {
        return this.f5969.f21374.hashCode() + AbstractC0053.m144(this.f5970, AbstractC0053.m144(this.f5971, AbstractC0053.m141(AbstractC0053.m144(this.f5973, Boolean.hashCode(this.f5974) * 31, 31), 31, this.f5972), 31), 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=");
        sb.append(this.f5974);
        sb.append(", capitalization=");
        int i = this.f5973;
        sb.append((Object) (i == -1 ? "Unspecified" : i == 0 ? "None" : i == 1 ? "Characters" : i == 2 ? "Words" : i == 3 ? "Sentences" : "Invalid"));
        sb.append(", autoCorrect=");
        sb.append(this.f5972);
        sb.append(", keyboardType=");
        sb.append((Object) AbstractC3066.m6845(this.f5971));
        sb.append(", imeAction=");
        sb.append((Object) C2028.m3735(this.f5970));
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f5969);
        sb.append(')');
        return sb.toString();
    }
}
