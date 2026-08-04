package yyds;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: renamed from: yyds.ᲈᲇᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2785 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Resources f13609;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Resources.Theme f13610;

    public C2785(Resources resources, Resources.Theme theme) {
        this.f13609 = resources;
        this.f13610 = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2785.class == obj.getClass()) {
            C2785 c2785 = (C2785) obj;
            if (this.f13609.equals(c2785.f13609) && Objects.equals(this.f13610, c2785.f13610)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13609, this.f13610);
    }
}
