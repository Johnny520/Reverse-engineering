package yyds;

import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛴᛷᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0901 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1516 f4109;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ViewGroup f4110;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ArrayList f4111;

    public native C0901(C1516 c1516, ViewGroup viewGroup, ArrayList arrayList);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0901)) {
            return false;
        }
        C0901 c0901 = (C0901) obj;
        return this.f4109.equals(c0901.f4109) && this.f4110.equals(c0901.f4110) && this.f4111.equals(c0901.f4111);
    }

    public final int hashCode() {
        return this.f4111.hashCode() + ((this.f4110.hashCode() + (this.f4109.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return AbstractC2328.m4341(-116122603651950L) + this.f4109 + AbstractC2328.m4341(-116208502997870L) + this.f4110 + AbstractC2328.m4341(-116242862736238L) + this.f4111 + ')';
    }
}
