package yyds;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: yyds.ᛱᛴᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0117 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public String f806;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public String f807;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public List f808;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0117)) {
            return false;
        }
        C0117 c0117 = (C0117) obj;
        return Objects.equals(this.f806, c0117.f806) && Objects.equals(this.f807, c0117.f807) && Objects.equals(this.f808, c0117.f808);
    }

    public final int hashCode() {
        return Objects.hash(this.f806, this.f807, this.f808);
    }
}
