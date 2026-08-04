package yyds;

import android.view.DisplayCutout;

/* JADX INFO: renamed from: yyds.ᛳᛱᛶᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0515 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final DisplayCutout f2468;

    public C0515(DisplayCutout displayCutout) {
        this.f2468 = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0515.class != obj.getClass()) {
            return false;
        }
        return this.f2468.equals(((C0515) obj).f2468);
    }

    public final int hashCode() {
        return this.f2468.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f2468 + "}";
    }
}
