package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC2425;
import androidx.lifecycle.C2423;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2306 extends AbstractC2425 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C2310 f6757 = new C2310();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f6759;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashMap f6762 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f6761 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HashMap f6760 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f6758 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f6763 = false;

    public C2306(boolean z) {
        this.f6759 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2306.class == obj.getClass()) {
            C2306 c2306 = (C2306) obj;
            if (this.f6762.equals(c2306.f6762) && this.f6761.equals(c2306.f6761) && this.f6760.equals(c2306.f6760)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6760.hashCode() + ((this.f6761.hashCode() + (this.f6762.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f6762.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f6761.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f6760.keySet().iterator();
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
    public final void m4349(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (this.f6763) {
            if (AbstractC2313.m4362(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f6762.remove(abstractComponentCallbacksC2338.f6901) == null || !AbstractC2313.m4362(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC2338);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m4350(String str) {
        HashMap map = this.f6761;
        C2306 c2306 = (C2306) map.get(str);
        if (c2306 != null) {
            c2306.mo3485();
            map.remove(str);
        }
        HashMap map2 = this.f6760;
        C2423 c2423 = (C2423) map2.get(str);
        if (c2423 != null) {
            c2423.m4519();
            map2.remove(str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4351(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (AbstractC2313.m4362(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC2338);
        }
        m4350(abstractComponentCallbacksC2338.f6901);
    }

    @Override // androidx.lifecycle.AbstractC2425
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo3485() {
        if (AbstractC2313.m4362(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f6758 = true;
    }
}
