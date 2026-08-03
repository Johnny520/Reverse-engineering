package p236q1;

import android.view.KeyEvent;
import gg.AbstractC1416l;

/* JADX INFO: renamed from: q1.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3422b {

    /* JADX INFO: renamed from: a */
    public final KeyEvent f11091a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C3422b) {
            return AbstractC1416l.m3825a(this.f11091a, ((C3422b) obj).f11091a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11091a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f11091a + ')';
    }
}
