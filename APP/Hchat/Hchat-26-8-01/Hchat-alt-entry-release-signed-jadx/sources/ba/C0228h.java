package ba;

import android.view.View;
import gg.AbstractC1416l;

/* JADX INFO: renamed from: ba.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0228h {

    /* JADX INFO: renamed from: a */
    public final View f567a;

    /* JADX INFO: renamed from: b */
    public final Object f568b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0228h(View view, Object obj) {
        this.f567a = view;
        this.f568b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0228h)) {
            return false;
        }
        C0228h c0228h = (C0228h) obj;
        return AbstractC1416l.m3825a(this.f567a, c0228h.f567a) && AbstractC1416l.m3825a(this.f568b, c0228h.f568b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        View view = this.f567a;
        int iHashCode = (view == null ? 0 : view.hashCode()) * 31;
        Object obj = this.f568b;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BindState(root=" + this.f567a + ", nativeHolder=" + this.f568b + ")";
    }
}
