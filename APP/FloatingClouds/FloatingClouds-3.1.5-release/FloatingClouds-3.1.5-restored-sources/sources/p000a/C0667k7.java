package p000a;

import android.util.Log;
import androidx.fragment.app.ComponentCallbacksC1100b;
import androidx.lifecycle.C1133q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: a.k7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0667k7 extends AbstractC0073Dg {

    /* JADX INFO: renamed from: j */
    public static final a f2488j = new a();

    /* JADX INFO: renamed from: g */
    public final boolean f2492g;

    /* JADX INFO: renamed from: d */
    public final HashMap<String, ComponentCallbacksC1100b> f2489d = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public final HashMap<String, C0667k7> f2490e = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public final HashMap<String, C0109Fg> f2491f = new HashMap<>();

    /* JADX INFO: renamed from: h */
    public boolean f2493h = false;

    /* JADX INFO: renamed from: i */
    public boolean f2494i = false;

    /* JADX INFO: renamed from: a.k7$a */
    public class a implements C1133q.b {
        @Override // androidx.lifecycle.C1133q.b
        /* JADX INFO: renamed from: a */
        public final <T extends AbstractC0073Dg> T mo438a(Class<T> cls) {
            return new C0667k7(true);
        }
    }

    public C0667k7(boolean z) {
        this.f2492g = z;
    }

    @Override // p000a.AbstractC0073Dg
    /* JADX INFO: renamed from: b */
    public final void mo174b() {
        if (AbstractC0553e7.m1330J(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2493h = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m1538c(ComponentCallbacksC1100b componentCallbacksC1100b, boolean z) {
        if (AbstractC0553e7.m1330J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + componentCallbacksC1100b);
        }
        m1540e(componentCallbacksC1100b.f4561e, z);
    }

    /* JADX INFO: renamed from: d */
    public final void m1539d(String str, boolean z) {
        if (AbstractC0553e7.m1330J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        m1540e(str, z);
    }

    /* JADX INFO: renamed from: e */
    public final void m1540e(String str, boolean z) {
        HashMap<String, C0667k7> map = this.f2490e;
        C0667k7 c0667k7 = map.get(str);
        if (c0667k7 != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c0667k7.f2490e.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c0667k7.m1539d((String) it.next(), true);
                }
            }
            c0667k7.mo174b();
            map.remove(str);
        }
        HashMap<String, C0109Fg> map2 = this.f2491f;
        C0109Fg c0109Fg = map2.get(str);
        if (c0109Fg != null) {
            c0109Fg.m292a();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0667k7.class == obj.getClass()) {
            C0667k7 c0667k7 = (C0667k7) obj;
            if (this.f2489d.equals(c0667k7.f2489d) && this.f2490e.equals(c0667k7.f2490e) && this.f2491f.equals(c0667k7.f2491f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m1541f(ComponentCallbacksC1100b componentCallbacksC1100b) {
        if (this.f2494i) {
            if (AbstractC0553e7.m1330J(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f2489d.remove(componentCallbacksC1100b.f4561e) == null || !AbstractC0553e7.m1330J(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + componentCallbacksC1100b);
        }
    }

    public final int hashCode() {
        return this.f2491f.hashCode() + ((this.f2490e.hashCode() + (this.f2489d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<ComponentCallbacksC1100b> it = this.f2489d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f2490e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f2491f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
