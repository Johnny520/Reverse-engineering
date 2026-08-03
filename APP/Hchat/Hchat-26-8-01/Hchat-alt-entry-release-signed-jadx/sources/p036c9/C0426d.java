package p036c9;

import ac.RunnableC0059l;
import android.app.Activity;
import java.lang.ref.WeakReference;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: c9.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0426d {

    /* JADX INFO: renamed from: a */
    public final WeakReference f1223a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0473o2 f1224b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1231l f1225c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0426d(WeakReference weakReference, AbstractC0473o2 abstractC0473o2, InterfaceC1231l interfaceC1231l) {
        this.f1223a = weakReference;
        this.f1224b = abstractC0473o2;
        this.f1225c = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1415a(C0477p2 c0477p2) {
        Activity activity = (Activity) this.f1223a.get();
        if (activity != null) {
            activity.runOnUiThread(new RunnableC0059l(activity, this, c0477p2, 2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0426d)) {
            return false;
        }
        C0426d c0426d = (C0426d) obj;
        return this.f1223a.equals(c0426d.f1223a) && this.f1224b.equals(c0426d.f1224b) && this.f1225c.equals(c0426d.f1225c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1225c.hashCode() + ((this.f1224b.hashCode() + (this.f1223a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Pending(activity=" + this.f1223a + ", operation=" + this.f1224b + ", callback=" + this.f1225c + ")";
    }
}
