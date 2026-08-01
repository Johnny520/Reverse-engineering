package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC0460L;
import java.util.HashMap;
import java.util.Iterator;
import p012G.C0140d;

/* JADX INFO: renamed from: androidx.fragment.app.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0411B extends AbstractC0460L {

    /* JADX INFO: renamed from: j */
    public static final C0140d f1230j = new C0140d(23);

    /* JADX INFO: renamed from: g */
    public final boolean f1234g;

    /* JADX INFO: renamed from: d */
    public final HashMap f1231d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final HashMap f1232e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final HashMap f1233f = new HashMap();

    /* JADX INFO: renamed from: h */
    public boolean f1235h = false;

    /* JADX INFO: renamed from: i */
    public boolean f1236i = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0411B(boolean z2) {
        this.f1234g = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.AbstractC0460L
    /* JADX INFO: renamed from: b */
    public final void mo339b() {
        if (C0448z.m856E(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1235h = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m784c(AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l) {
        if (this.f1236i) {
            if (C0448z.m856E(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f1231d.remove(abstractComponentCallbacksC0434l.f1369f) == null || !C0448z.m856E(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0434l);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0411B.class == obj.getClass()) {
            C0411B c0411b = (C0411B) obj;
            if (this.f1231d.equals(c0411b.f1231d) && this.f1232e.equals(c0411b.f1232e) && this.f1233f.equals(c0411b.f1233f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1233f.hashCode() + ((this.f1232e.hashCode() + (this.f1231d.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f1231d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f1232e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f1233f.keySet().iterator();
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
