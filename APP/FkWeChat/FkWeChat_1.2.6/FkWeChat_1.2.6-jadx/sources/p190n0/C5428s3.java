package p190n0;

import android.view.textclassifier.TextClassification;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p319w2.C9137t3;

/* JADX INFO: renamed from: n0.s3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5428s3 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f16743a;

    /* JADX INFO: renamed from: b */
    public final long f16744b;

    /* JADX INFO: renamed from: c */
    public final TextClassification f16745c;

    public C5428s3(CharSequence charSequence, long j10, TextClassification textClassification) {
        this.f16743a = charSequence;
        this.f16744b = j10;
        this.f16745c = textClassification;
    }

    /* JADX INFO: renamed from: a */
    public final long m22154a() {
        return this.f16744b;
    }

    /* JADX INFO: renamed from: b */
    public final CharSequence m22155b() {
        return this.f16743a;
    }

    /* JADX INFO: renamed from: c */
    public final TextClassification m22156c() {
        return this.f16745c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5428s3)) {
            return false;
        }
        C5428s3 c5428s3 = (C5428s3) obj;
        return AbstractC1061t.m3842c(this.f16743a, c5428s3.f16743a) && C9137t3.m35516g(this.f16744b, c5428s3.f16744b) && AbstractC1061t.m3842c(this.f16745c, c5428s3.f16745c);
    }

    public int hashCode() {
        return (((this.f16743a.hashCode() * 31) + C9137t3.m35524o(this.f16744b)) * 31) + this.f16745c.hashCode();
    }

    public String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f16743a) + ", selection=" + ((Object) C9137t3.m35526q(this.f16744b)) + ", textClassification=" + this.f16745c + ')';
    }

    public /* synthetic */ C5428s3(CharSequence charSequence, long j10, TextClassification textClassification, AbstractC1043k abstractC1043k) {
        this(charSequence, j10, textClassification);
    }
}
