package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassification;
import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.text.C2869;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1729 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final TextClassification f2876;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f2877;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final CharSequence f2878;

    public C1729(CharSequence charSequence, long j, TextClassification textClassification) {
        this.f2878 = charSequence;
        this.f2877 = j;
        this.f2876 = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1729)) {
            return false;
        }
        C1729 c1729 = (C1729) obj;
        return AbstractC5227.m9466(this.f2878, c1729.f2878) && C2869.m4313(this.f2877, c1729.f2877) && AbstractC5227.m9466(this.f2876, c1729.f2876);
    }

    public final int hashCode() {
        int iHashCode = this.f2878.hashCode() * 31;
        int i = C2869.f6347;
        return this.f2876.hashCode() + AbstractC0900.m702(iHashCode, 31, this.f2877);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f2878) + ", selection=" + ((Object) C2869.m4318(this.f2877)) + ", textClassification=" + this.f2876 + ')';
    }
}
