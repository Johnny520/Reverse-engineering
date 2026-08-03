package p006D;

import android.view.DisplayCutout;
import java.util.Objects;
import p002B.AbstractC0053c;

/* JADX INFO: renamed from: D.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0109k {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f293a;

    public C0109k(DisplayCutout r1) {
        this.f293a = r1;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (C0109k.class == r3.getClass()) goto L10;
        return false;
    L10:
        return Objects.equals(this.f293a, ((C0109k) r3).f293a);
    }

    public final int hashCode() {
        DisplayCutout r02 = this.f293a;
        if (r02 != null) goto L6;
        return 0;
    L6:
        return AbstractC0053c.m172c(r02);
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f293a + "}";
    }
}
