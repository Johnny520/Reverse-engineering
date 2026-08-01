package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassification;
import androidx.activity.AbstractC0053;
import androidx.compose.ui.text.C2035;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0891 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final TextClassification f2531;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f2532;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final CharSequence f2533;

    public C0891(CharSequence charSequence, long j, TextClassification textClassification) {
        this.f2533 = charSequence;
        this.f2532 = j;
        this.f2531 = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0891)) {
            return false;
        }
        C0891 c0891 = (C0891) obj;
        return AbstractC4395.m8907(this.f2533, c0891.f2533) && C2035.m3753(this.f2532, c0891.f2532) && AbstractC4395.m8907(this.f2531, c0891.f2531);
    }

    public final int hashCode() {
        int iHashCode = this.f2533.hashCode() * 31;
        int i = C2035.f6002;
        return this.f2531.hashCode() + AbstractC0053.m142(iHashCode, 31, this.f2532);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f2533) + ", selection=" + ((Object) C2035.m3758(this.f2532)) + ", textClassification=" + this.f2531 + ')';
    }
}
