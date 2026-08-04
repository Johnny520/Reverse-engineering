package yyds;

import java.io.IOException;

/* JADX INFO: renamed from: yyds.ᛸᛲᛶᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1721 extends AbstractC2720 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8707;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean f8708;

    public /* synthetic */ C1721(int i, boolean z) {
        this.f8707 = i;
        this.f8708 = z;
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo484(C1942 c1942) {
        switch (this.f8707) {
            case 0:
                if (c1942.m3744() != 9) {
                    return Double.valueOf(c1942.m3762());
                }
                c1942.m3767();
                return null;
            default:
                if (c1942.m3744() != 9) {
                    return Float.valueOf((float) c1942.m3762());
                }
                c1942.m3767();
                return null;
        }
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo485(C1405 c1405, Object obj) throws IOException {
        int i = this.f8707;
        boolean z = this.f8708;
        switch (i) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    c1405.m2857();
                    return;
                }
                double dDoubleValue = number.doubleValue();
                if (z) {
                    AbstractC0193.m817(dDoubleValue);
                }
                c1405.m2863();
                if (c1405.f6653 == 1 || !(Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
                    c1405.m2853();
                    c1405.f6654.append((CharSequence) Double.toString(dDoubleValue));
                    return;
                } else {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + dDoubleValue);
                }
            default:
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    c1405.m2857();
                    return;
                }
                float fFloatValue = numberValueOf.floatValue();
                if (z) {
                    AbstractC0193.m817(fFloatValue);
                }
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(fFloatValue);
                }
                c1405.m2867(numberValueOf);
                return;
        }
    }
}
