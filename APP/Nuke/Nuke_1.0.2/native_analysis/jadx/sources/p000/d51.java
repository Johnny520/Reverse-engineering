package p000;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d51 {

    /* JADX INFO: renamed from: a */
    public final KeyEvent f1868a;

    public final boolean equals(Object obj) {
        if (obj instanceof d51) {
            return t11.m5086l(this.f1868a, ((d51) obj).f1868a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1868a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f1868a + ')';
    }
}
