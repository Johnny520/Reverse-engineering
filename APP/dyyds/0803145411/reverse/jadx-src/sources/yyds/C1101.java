package yyds;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: yyds.ᛵᛵᲀᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1101 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final WeakReference f5066;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final WeakReference f5067;

    public C1101(WeakReference weakReference, WeakReference weakReference2) {
        AbstractC2328.m4341(-924624427320174L);
        AbstractC2328.m4341(-924667376993134L);
        this.f5066 = weakReference;
        this.f5067 = weakReference2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1101)) {
            return false;
        }
        C1101 c1101 = (C1101) obj;
        return this.f5066.equals(c1101.f5066) && this.f5067.equals(c1101.f5067);
    }

    public final int hashCode() {
        return this.f5067.hashCode() + (this.f5066.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2328.m4341(-924787636077422L) + this.f5066 + AbstractC2328.m4341(-924895010259822L) + this.f5067 + ')';
    }
}
