package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassification;
import androidx.activity.AbstractC0053;
import androidx.compose.ui.text.C2035;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0891 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final TextClassification f2530;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f2531;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final CharSequence f2532;

    public C0891(CharSequence charSequence, long j, TextClassification textClassification) {
        this.f2532 = charSequence;
        this.f2531 = j;
        this.f2530 = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0891)) {
            return false;
        }
        C0891 c0891 = (C0891) obj;
        return AbstractC4394.m8917(this.f2532, c0891.f2532) && C2035.m3743(this.f2531, c0891.f2531) && AbstractC4394.m8917(this.f2530, c0891.f2530);
    }

    public final int hashCode() {
        int iHashCode = this.f2532.hashCode() * 31;
        int i = C2035.f6001;
        return this.f2530.hashCode() + AbstractC0053.m141(iHashCode, 31, this.f2531);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f2532) + ", selection=" + ((Object) C2035.m3748(this.f2531)) + ", textClassification=" + this.f2530 + ')';
    }
}
