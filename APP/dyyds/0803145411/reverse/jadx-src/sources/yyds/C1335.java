package yyds;

import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: yyds.ᛶᛵᛷᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1335 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final LinearLayout f6183;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final TextView f6184;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1016 f6185;

    public C1335(LinearLayout linearLayout, TextView textView, C1016 c1016) {
        AbstractC2328.m4341(-1577725744284526L);
        AbstractC2328.m4341(-1577747219121006L);
        AbstractC2328.m4341(-1577768693957486L);
        this.f6183 = linearLayout;
        this.f6184 = textView;
        this.f6185 = c1016;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1335)) {
            return false;
        }
        C1335 c1335 = (C1335) obj;
        return this.f6183.equals(c1335.f6183) && this.f6184.equals(c1335.f6184) && this.f6185.equals(c1335.f6185);
    }

    public final int hashCode() {
        return this.f6185.hashCode() + ((this.f6184.hashCode() + (this.f6183.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return AbstractC2328.m4341(-1577863183237998L) + this.f6183 + AbstractC2328.m4341(-1577944787616622L) + this.f6184 + AbstractC2328.m4341(-1577979147354990L) + this.f6185 + ')';
    }
}
