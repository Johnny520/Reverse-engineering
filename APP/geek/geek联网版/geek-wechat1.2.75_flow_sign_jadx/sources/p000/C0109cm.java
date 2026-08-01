package p000;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: cm */
/* JADX INFO: loaded from: classes.dex */
public final class C0109cm extends ua0 {

    /* JADX INFO: renamed from: f */
    public final boolean f907f;

    /* JADX INFO: renamed from: c */
    public final HashMap f904c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f905d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final HashMap f906e = new HashMap();

    /* JADX INFO: renamed from: g */
    public boolean f908g = false;

    /* JADX INFO: renamed from: h */
    public boolean f909h = false;

    public C0109cm(boolean z) {
        this.f907f = z;
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: a */
    public final void mo651a() {
        if (C0023am.m55A(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f908g = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m652b(AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol) {
        if (this.f909h) {
            if (C0023am.m55A(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f904c.remove(abstractComponentCallbacksC0563ol.f3490e) == null || !C0023am.m55A(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0563ol);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0109cm.class == obj.getClass()) {
            C0109cm c0109cm = (C0109cm) obj;
            if (this.f904c.equals(c0109cm.f904c) && this.f905d.equals(c0109cm.f905d) && this.f906e.equals(c0109cm.f906e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f906e.hashCode() + ((this.f905d.hashCode() + (this.f904c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f904c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f905d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f906e.keySet().iterator();
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
