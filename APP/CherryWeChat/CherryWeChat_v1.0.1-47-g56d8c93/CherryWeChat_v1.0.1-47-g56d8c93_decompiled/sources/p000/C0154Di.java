package p000;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: Di */
/* JADX INFO: loaded from: classes.dex */
public final class C0154Di extends AbstractC2580uE {

    /* JADX INFO: renamed from: j */
    public static final C0111Ci f412j = new C0111Ci(0);

    /* JADX INFO: renamed from: g */
    public final boolean f416g;

    /* JADX INFO: renamed from: d */
    public final HashMap f413d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final HashMap f414e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final HashMap f415f = new HashMap();

    /* JADX INFO: renamed from: h */
    public boolean f417h = false;

    /* JADX INFO: renamed from: i */
    public boolean f418i = false;

    public C0154Di(boolean z) {
        this.f416g = z;
    }

    @Override // p000.AbstractC2580uE
    /* JADX INFO: renamed from: b */
    public final void mo297b() {
        if (AbstractC2805zi.m5374G(3)) {
            toString();
        }
        this.f417h = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m298c(String str) {
        HashMap map = this.f414e;
        C0154Di c0154Di = (C0154Di) map.get(str);
        if (c0154Di != null) {
            c0154Di.mo297b();
            map.remove(str);
        }
        HashMap map2 = this.f415f;
        C2709xE c2709xE = (C2709xE) map2.get(str);
        if (c2709xE != null) {
            c2709xE.m5282a();
            map2.remove(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m299d(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
        if (this.f418i || this.f413d.remove(abstractComponentCallbacksC1503hi.f5314e) == null || !AbstractC2805zi.m5374G(2)) {
            return;
        }
        abstractComponentCallbacksC1503hi.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0154Di.class == obj.getClass()) {
            C0154Di c0154Di = (C0154Di) obj;
            if (this.f413d.equals(c0154Di.f413d) && this.f414e.equals(c0154Di.f414e) && this.f415f.equals(c0154Di.f415f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f415f.hashCode() + ((this.f414e.hashCode() + (this.f413d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f413d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f414e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f415f.keySet().iterator();
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
