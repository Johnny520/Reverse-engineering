package p058L;

import android.view.textclassifier.TextClassification;
import p011B4.AbstractC0231b;
import p092S0.C1259L;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: L.L */
/* JADX INFO: loaded from: classes.dex */
public final class C0910L {

    /* JADX INFO: renamed from: a */
    public final CharSequence f2826a;

    /* JADX INFO: renamed from: b */
    public final long f2827b;

    /* JADX INFO: renamed from: c */
    public final TextClassification f2828c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0910L(CharSequence charSequence, long j5, TextClassification textClassification) {
        this.f2826a = charSequence;
        this.f2827b = j5;
        this.f2828c = textClassification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0910L)) {
            return false;
        }
        C0910L c0910l = (C0910L) obj;
        return AbstractC1665j.m2981a(this.f2826a, c0910l.f2826a) && C1259L.m2334b(this.f2827b, c0910l.f2827b) && AbstractC1665j.m2981a(this.f2828c, c0910l.f2828c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f2826a.hashCode() * 31;
        int i5 = C1259L.f4537c;
        return this.f2828c.hashCode() + AbstractC0231b.m392c(iHashCode, 31, this.f2827b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f2826a) + ", selection=" + ((Object) C1259L.m2340h(this.f2827b)) + ", textClassification=" + this.f2828c + ')';
    }
}
