package p000;

import android.view.DisplayCutout;

/* JADX INFO: renamed from: yg */
/* JADX INFO: loaded from: classes.dex */
public final class C0929yg {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f5340a;

    public C0929yg(DisplayCutout displayCutout) {
        this.f5340a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0929yg.class != obj.getClass()) {
            return false;
        }
        return AbstractC0612pw.m2131a(this.f5340a, ((C0929yg) obj).f5340a);
    }

    public final int hashCode() {
        return this.f5340a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f5340a + "}";
    }
}
