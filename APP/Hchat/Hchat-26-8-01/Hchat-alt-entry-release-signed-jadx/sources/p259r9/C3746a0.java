package p259r9;

import android.view.ViewTreeObserver;
import gg.AbstractC1416l;

/* JADX INFO: renamed from: r9.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3746a0 {

    /* JADX INFO: renamed from: a */
    public final ViewTreeObserver f12157a;

    /* JADX INFO: renamed from: b */
    public final ViewTreeObserver.OnPreDrawListener f12158b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3746a0(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        onPreDrawListener.getClass();
        this.f12157a = viewTreeObserver;
        this.f12158b = onPreDrawListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3746a0)) {
            return false;
        }
        C3746a0 c3746a0 = (C3746a0) obj;
        return this.f12157a.equals(c3746a0.f12157a) && AbstractC1416l.m3825a(this.f12158b, c3746a0.f12158b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f12158b.hashCode() + (this.f12157a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PendingPreDraw(observer=" + this.f12157a + ", listener=" + this.f12158b + ")";
    }
}
