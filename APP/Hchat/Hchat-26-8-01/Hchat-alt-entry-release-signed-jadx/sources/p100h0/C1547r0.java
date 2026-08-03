package p100h0;

import android.view.textclassifier.TextClassification;
import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p119i2.C1939m0;

/* JADX INFO: renamed from: h0.r0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1547r0 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f5157a;

    /* JADX INFO: renamed from: b */
    public final long f5158b;

    /* JADX INFO: renamed from: c */
    public final TextClassification f5159c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1547r0(CharSequence charSequence, long j3, TextClassification textClassification) {
        this.f5157a = charSequence;
        this.f5158b = j3;
        this.f5159c = textClassification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1547r0)) {
            return false;
        }
        C1547r0 c1547r0 = (C1547r0) obj;
        return AbstractC1416l.m3825a(this.f5157a, c1547r0.f5157a) && C1939m0.m4812b(this.f5158b, c1547r0.f5158b) && AbstractC1416l.m3825a(this.f5159c, c1547r0.f5159c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f5157a.hashCode() * 31;
        int i9 = C1939m0.f6574c;
        return this.f5159c.hashCode() + AbstractC0921a.m2243f(iHashCode, 31, this.f5158b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f5157a) + ", selection=" + ((Object) C1939m0.m4818h(this.f5158b)) + ", textClassification=" + this.f5159c + ')';
    }
}
