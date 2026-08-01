package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC2425;
import androidx.lifecycle.C2423;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2306 extends AbstractC2425 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C2310 f6756 = new C2310();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f6758;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashMap f6761 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f6760 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HashMap f6759 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f6757 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f6762 = false;

    public C2306(boolean z) {
        this.f6758 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2306.class == obj.getClass()) {
            C2306 c2306 = (C2306) obj;
            if (this.f6761.equals(c2306.f6761) && this.f6760.equals(c2306.f6760) && this.f6759.equals(c2306.f6759)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6759.hashCode() + ((this.f6760.hashCode() + (this.f6761.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f6761.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f6760.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f6759.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m4339(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (this.f6762) {
            if (AbstractC2313.m4352(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f6761.remove(abstractComponentCallbacksC2338.f6900) == null || !AbstractC2313.m4352(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC2338);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m4340(String str) {
        HashMap map = this.f6760;
        C2306 c2306 = (C2306) map.get(str);
        if (c2306 != null) {
            c2306.mo3475();
            map.remove(str);
        }
        HashMap map2 = this.f6759;
        C2423 c2423 = (C2423) map2.get(str);
        if (c2423 != null) {
            c2423.m4509();
            map2.remove(str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4341(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (AbstractC2313.m4352(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC2338);
        }
        m4340(abstractComponentCallbacksC2338.f6900);
    }

    @Override // androidx.lifecycle.AbstractC2425
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo3475() {
        if (AbstractC2313.m4352(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f6757 = true;
    }
}
