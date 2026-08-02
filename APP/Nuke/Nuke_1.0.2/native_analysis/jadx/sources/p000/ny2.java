package p000;

import android.view.textclassifier.TextClassification;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ny2 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f7369a;

    /* JADX INFO: renamed from: b */
    public final long f7370b;

    /* JADX INFO: renamed from: c */
    public final TextClassification f7371c;

    public ny2(CharSequence charSequence, long j, TextClassification textClassification) {
        this.f7369a = charSequence;
        this.f7370b = j;
        this.f7371c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny2)) {
            return false;
        }
        ny2 ny2Var = (ny2) obj;
        return t11.m5086l(this.f7369a, ny2Var.f7369a) && f13.m1493b(this.f7370b, ny2Var.f7370b) && t11.m5086l(this.f7371c, ny2Var.f7371c);
    }

    public final int hashCode() {
        int iHashCode = this.f7369a.hashCode() * 31;
        int i = f13.f2738c;
        return this.f7371c.hashCode() + hk1.m2204c(iHashCode, 31, this.f7370b);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f7369a) + ", selection=" + ((Object) f13.m1499h(this.f7370b)) + ", textClassification=" + this.f7371c + ')';
    }
}
