package defpackage;

import android.view.ViewGroup;
import android.view.WindowId;

/* JADX INFO: loaded from: classes.dex */
public final class zb0 {
    public final WindowId a;

    public zb0(ViewGroup r1) {
        this.a = r1.getWindowId();
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof zb0) == true) goto L5;
        return false;
    L5:
        if (((zb0) r2).a.equals(this.a) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
