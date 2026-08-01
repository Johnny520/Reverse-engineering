package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC3258;
import androidx.lifecycle.C3256;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3139 extends AbstractC3258 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C3143 f7102 = new C3143();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f7104;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashMap f7107 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f7106 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HashMap f7105 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f7103 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f7108 = false;

    public C3139(boolean z) {
        this.f7104 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3139.class == obj.getClass()) {
            C3139 c3139 = (C3139) obj;
            if (this.f7107.equals(c3139.f7107) && this.f7106.equals(c3139.f7106) && this.f7105.equals(c3139.f7105)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7105.hashCode() + ((this.f7106.hashCode() + (this.f7107.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f7107.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f7106.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f7105.keySet().iterator();
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
    public final void m4909(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        if (this.f7108) {
            if (AbstractC3146.m4922(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f7107.remove(abstractComponentCallbacksC3171.f7246) == null || !AbstractC3146.m4922(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC3171);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m4910(String str) {
        HashMap map = this.f7106;
        C3139 c3139 = (C3139) map.get(str);
        if (c3139 != null) {
            c3139.mo4045();
            map.remove(str);
        }
        HashMap map2 = this.f7105;
        C3256 c3256 = (C3256) map2.get(str);
        if (c3256 != null) {
            c3256.m5079();
            map2.remove(str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4911(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        if (AbstractC3146.m4922(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC3171);
        }
        m4910(abstractComponentCallbacksC3171.f7246);
    }

    @Override // androidx.lifecycle.AbstractC3258
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo4045() {
        if (AbstractC3146.m4922(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f7103 = true;
    }
}
