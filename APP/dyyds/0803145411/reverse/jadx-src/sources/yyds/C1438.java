package yyds;

import android.view.View;

/* JADX INFO: renamed from: yyds.ᛶᲁᲀᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1438 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f6831;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public AbstractC0353 f6832;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f6833;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f6834;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean f6835;

    public C1438() {
        m2939();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
        sb.append(this.f6833);
        sb.append(", mCoordinate=");
        sb.append(this.f6834);
        sb.append(", mLayoutFromEnd=");
        sb.append(this.f6835);
        sb.append(", mValid=");
        return AbstractC0897.m1986(sb, this.f6831, '}');
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m2937() {
        boolean z = this.f6835;
        AbstractC0353 abstractC0353 = this.f6832;
        this.f6834 = z ? abstractC0353.mo1039() : abstractC0353.mo1038();
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m2938(View view, int i) {
        AbstractC0353 abstractC0353 = this.f6832;
        int iMo1036 = Integer.MIN_VALUE == abstractC0353.f1828 ? 0 : abstractC0353.mo1036() - abstractC0353.f1828;
        if (iMo1036 >= 0) {
            boolean z = this.f6835;
            AbstractC0353 abstractC03532 = this.f6832;
            if (z) {
                int iMo1056 = abstractC03532.mo1056(view);
                AbstractC0353 abstractC03533 = this.f6832;
                this.f6834 = (Integer.MIN_VALUE != abstractC03533.f1828 ? abstractC03533.mo1036() - abstractC03533.f1828 : 0) + iMo1056;
            } else {
                this.f6834 = abstractC03532.mo1046(view);
            }
            this.f6833 = i;
            return;
        }
        this.f6833 = i;
        boolean z2 = this.f6835;
        AbstractC0353 abstractC03534 = this.f6832;
        if (!z2) {
            int iMo1046 = abstractC03534.mo1046(view);
            int iMo1038 = iMo1046 - this.f6832.mo1038();
            this.f6834 = iMo1046;
            if (iMo1038 > 0) {
                int iMo1039 = (this.f6832.mo1039() - Math.min(0, (this.f6832.mo1039() - iMo1036) - this.f6832.mo1056(view))) - (this.f6832.mo1040(view) + iMo1046);
                if (iMo1039 < 0) {
                    this.f6834 -= Math.min(iMo1038, -iMo1039);
                    return;
                }
                return;
            }
            return;
        }
        int iMo10392 = (abstractC03534.mo1039() - iMo1036) - this.f6832.mo1056(view);
        this.f6834 = this.f6832.mo1039() - iMo10392;
        if (iMo10392 > 0) {
            int iMo1040 = this.f6834 - this.f6832.mo1040(view);
            int iMo10382 = this.f6832.mo1038();
            int iMin = iMo1040 - (Math.min(this.f6832.mo1046(view) - iMo10382, 0) + iMo10382);
            if (iMin < 0) {
                this.f6834 = Math.min(iMo10392, -iMin) + this.f6834;
            }
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m2939() {
        this.f6833 = -1;
        this.f6834 = Integer.MIN_VALUE;
        this.f6835 = false;
        this.f6831 = false;
    }
}
