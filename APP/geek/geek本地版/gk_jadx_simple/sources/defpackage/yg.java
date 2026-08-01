package defpackage;

import android.view.DisplayCutout;

/* JADX INFO: loaded from: classes.dex */
public final class yg {
    public final DisplayCutout a;

    public yg(DisplayCutout r1) {
        this.a = r1;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (yg.class == r3.getClass()) goto L10;
        return false;
    L10:
        return pw.a(this.a, ((yg) r3).a);
    }

    public final int hashCode() {
        return c0.c(this.a);
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
