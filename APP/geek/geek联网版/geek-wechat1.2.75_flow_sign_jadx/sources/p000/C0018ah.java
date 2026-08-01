package p000;

import android.view.DisplayCutout;

/* JADX INFO: renamed from: ah */
/* JADX INFO: loaded from: classes.dex */
public final class C0018ah {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f82a;

    public C0018ah(DisplayCutout displayCutout) {
        this.f82a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0018ah.class != obj.getClass()) {
            return false;
        }
        return AbstractC0908xw.m2709a(this.f82a, ((C0018ah) obj).f82a);
    }

    public final int hashCode() {
        return this.f82a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f82a + "}";
    }
}
