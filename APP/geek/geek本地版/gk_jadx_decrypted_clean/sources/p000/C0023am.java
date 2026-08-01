package p000;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: am */
/* JADX INFO: loaded from: classes.dex */
public final class C0023am extends pa0 {

    /* JADX INFO: renamed from: f */
    public final boolean f154f;

    /* JADX INFO: renamed from: c */
    public final HashMap f151c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f152d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final HashMap f153e = new HashMap();

    /* JADX INFO: renamed from: g */
    public boolean f155g = false;

    /* JADX INFO: renamed from: h */
    public boolean f156h = false;

    public C0023am(boolean z) {
        this.f154f = z;
    }

    @Override // p000.pa0
    /* JADX INFO: renamed from: a */
    public final void mo113a() {
        if (C0934yl.m2689A(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f155g = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m114b(AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml) {
        if (this.f156h) {
            if (C0934yl.m2689A(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f151c.remove(abstractComponentCallbacksC0489ml.f3245e) == null || !C0934yl.m2689A(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0489ml);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0023am.class == obj.getClass()) {
            C0023am c0023am = (C0023am) obj;
            if (this.f151c.equals(c0023am.f151c) && this.f152d.equals(c0023am.f152d) && this.f153e.equals(c0023am.f153e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f153e.hashCode() + ((this.f152d.hashCode() + (this.f151c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f151c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f152d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f153e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
