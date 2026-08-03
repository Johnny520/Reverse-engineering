package p000;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: renamed from: ie */
/* JADX INFO: loaded from: classes.dex */
public final class C1543ie {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f5442a;

    public C1543ie(DisplayCutout r1) {
        this.f5442a = r1;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (C1543ie.class == r3.getClass()) goto L10;
        return false;
    L10:
        return Objects.equals(this.f5442a, ((C1543ie) r3).f5442a);
    }

    public final int hashCode() {
        DisplayCutout r0 = this.f5442a;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f5442a + "}";
    }
}
