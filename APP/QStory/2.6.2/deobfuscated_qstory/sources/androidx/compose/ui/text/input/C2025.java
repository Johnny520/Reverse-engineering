package androidx.compose.ui.text.input;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3064;
import kotlin.jvm.internal.AbstractC4394;
import p194.C7831;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2025 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C2025 f5967 = new C2025(false, 0, true, 1, 1, C7831.f21375);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C7831 f5968;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f5969;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f5970;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f5971;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f5972;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f5973;

    public C2025(boolean z, int i, boolean z2, int i2, int i3, C7831 c7831) {
        this.f5973 = z;
        this.f5972 = i;
        this.f5971 = z2;
        this.f5970 = i2;
        this.f5969 = i3;
        this.f5968 = c7831;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2025)) {
            return false;
        }
        C2025 c2025 = (C2025) obj;
        return this.f5973 == c2025.f5973 && this.f5972 == c2025.f5972 && this.f5971 == c2025.f5971 && this.f5970 == c2025.f5970 && this.f5969 == c2025.f5969 && AbstractC4394.m8917(this.f5968, c2025.f5968);
    }

    public final int hashCode() {
        return this.f5968.f21377.hashCode() + AbstractC0053.m143(this.f5969, AbstractC0053.m143(this.f5970, AbstractC0053.m140(AbstractC0053.m143(this.f5972, Boolean.hashCode(this.f5973) * 31, 31), 31, this.f5971), 31), 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=");
        sb.append(this.f5973);
        sb.append(", capitalization=");
        int i = this.f5972;
        sb.append((Object) (i == -1 ? "Unspecified" : i == 0 ? "None" : i == 1 ? "Characters" : i == 2 ? "Words" : i == 3 ? "Sentences" : "Invalid"));
        sb.append(", autoCorrect=");
        sb.append(this.f5971);
        sb.append(", keyboardType=");
        sb.append((Object) AbstractC3064.m6784(this.f5970));
        sb.append(", imeAction=");
        sb.append((Object) C2028.m3725(this.f5969));
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f5968);
        sb.append(')');
        return sb.toString();
    }
}
