package p000;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: Di */
/* JADX INFO: loaded from: classes.dex */
public final class C0154Di extends AbstractC2580uE {

    /* JADX INFO: renamed from: j */
    public static final C0111Ci f412j = null;

    /* JADX INFO: renamed from: d */
    public final HashMap f413d;

    /* JADX INFO: renamed from: e */
    public final HashMap f414e;

    /* JADX INFO: renamed from: f */
    public final HashMap f415f;

    /* JADX INFO: renamed from: g */
    public final boolean f416g;

    /* JADX INFO: renamed from: h */
    public boolean f417h;

    /* JADX INFO: renamed from: i */
    public boolean f418i;

    static {
        f412j = new C0111Ci(0);
    }

    public C0154Di(boolean r2) {
        this.f413d = new HashMap();
        this.f414e = new HashMap();
        this.f415f = new HashMap();
        this.f417h = false;
        this.f418i = false;
        this.f416g = r2;
    }

    @Override // p000.AbstractC2580uE
    /* JADX INFO: renamed from: b */
    public final void mo297b() {
        if (AbstractC2805zi.m5374G(3) == false) goto L5;
        toString();
    L5:
        this.f417h = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m298c(String r3) {
        HashMap r0 = this.f414e;
        C0154Di r1 = (C0154Di) r0.get(r3);
        if (r1 == null) goto L5;
        r1.mo297b();
        r0.remove(r3);
    L5:
        HashMap r02 = this.f415f;
        C2709xE r12 = (C2709xE) r02.get(r3);
        if (r12 == null) goto L9;
        r12.m5282a();
        r02.remove(r3);
        return;
    }

    /* JADX INFO: renamed from: d */
    public final void m299d(AbstractComponentCallbacksC1503hi r3) {
        if (this.f418i == false) goto L6;
        return;
    L6:
        if (this.f413d.remove(r3.f5314e) != null) goto L8;
        return;
    L8:
        if (AbstractC2805zi.m5374G(2) == false) goto L12;
        r3.toString();
        return;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L17:
        return false;
    L8:
        if (C0154Di.class != r5.getClass()) goto L17;
        C0154Di r52 = (C0154Di) r5;
        if (this.f413d.equals(r52.f413d) == false) goto L17;
        if (this.f414e.equals(r52.f414e) == false) goto L17;
        if (this.f415f.equals(r52.f415f) == false) goto L17;
        return true;
    }

    public final int hashCode() {
        int r0 = this.f413d.hashCode() * 31;
        int r1 = (this.f414e.hashCode() + r0) * 31;
        return this.f415f.hashCode() + r1;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("FragmentManagerViewModel{");
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append("} Fragments (");
        Iterator r1 = this.f413d.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        r0.append(r1.next());
        if (r1.hasNext() == false) goto L4;
        r0.append(", ");
        goto L4
    L8:
        r0.append(") Child Non Config (");
        Iterator r12 = this.f414e.keySet().iterator();
    L10:
        if (r12.hasNext() == false) goto L14;
        r0.append((String) r12.next());
        if (r12.hasNext() == false) goto L10;
        r0.append(", ");
        goto L10
    L14:
        r0.append(") ViewModelStores (");
        Iterator r13 = this.f415f.keySet().iterator();
    L16:
        if (r13.hasNext() == false) goto L20;
        r0.append((String) r13.next());
        if (r13.hasNext() == false) goto L16;
        r0.append(", ");
        goto L16
    L20:
        r0.append(')');
        return r0.toString();
    }
}
