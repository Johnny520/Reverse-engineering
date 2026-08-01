package androidx.compose.p001ui.text.input;

import androidx.activity.AbstractC0900;
import com.bumptech.glide.AbstractC3898;
import kotlin.jvm.internal.AbstractC5227;
import p210.C8661;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2859 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C2859 f6313 = new C2859(false, 0, true, 1, 1, C8661.f21717);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8661 f6314;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f6315;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f6316;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f6317;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6318;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f6319;

    public C2859(boolean z, int i, boolean z2, int i2, int i3, C8661 c8661) {
        this.f6319 = z;
        this.f6318 = i;
        this.f6317 = z2;
        this.f6316 = i2;
        this.f6315 = i3;
        this.f6314 = c8661;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2859)) {
            return false;
        }
        C2859 c2859 = (C2859) obj;
        return this.f6319 == c2859.f6319 && this.f6318 == c2859.f6318 && this.f6317 == c2859.f6317 && this.f6316 == c2859.f6316 && this.f6315 == c2859.f6315 && AbstractC5227.m9466(this.f6314, c2859.f6314);
    }

    public final int hashCode() {
        return this.f6314.f21719.hashCode() + AbstractC0900.m704(this.f6315, AbstractC0900.m704(this.f6316, AbstractC0900.m701(AbstractC0900.m704(this.f6318, Boolean.hashCode(this.f6319) * 31, 31), 31, this.f6317), 31), 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=");
        sb.append(this.f6319);
        sb.append(", capitalization=");
        int i = this.f6318;
        sb.append((Object) (i == -1 ? "Unspecified" : i == 0 ? "None" : i == 1 ? "Characters" : i == 2 ? "Words" : i == 3 ? "Sentences" : "Invalid"));
        sb.append(", autoCorrect=");
        sb.append(this.f6317);
        sb.append(", keyboardType=");
        sb.append((Object) AbstractC3898.m7405(this.f6316));
        sb.append(", imeAction=");
        sb.append((Object) C2862.m4295(this.f6315));
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f6314);
        sb.append(')');
        return sb.toString();
    }
}
