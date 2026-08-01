package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class am extends pa0 {
    public final HashMap c;
    public final HashMap d;
    public final HashMap e;
    public final boolean f;
    public boolean g;
    public boolean h;

    public am(boolean r2) {
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
        this.g = false;
        this.h = false;
        this.f = r2;
    }

    @Override // defpackage.pa0
    public final void a() {
        if (yl.A(3) == false) goto L5;
        Log.d("FragmentManager", "onCleared called for " + this);
    L5:
        this.g = true;
    }

    public final void b(ml r5) {
        if (this.h == false) goto L9;
        if (yl.A(2) == false) goto L14;
        Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        return;
    L14:
        return;
    L9:
        if (this.c.remove(r5.e) != null) goto L11;
        return;
    L11:
        if (yl.A(2) == false) goto L16;
        Log.v("FragmentManager", "Updating retained Fragments: Removed " + r5);
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
        if (am.class != r5.getClass()) goto L17;
        am r52 = (am) r5;
        if (this.c.equals(r52.c) == false) goto L17;
        if (this.d.equals(r52.d) == false) goto L17;
        if (this.e.equals(r52.e) == false) goto L17;
        return true;
    }

    public final int hashCode() {
        int r0 = this.c.hashCode() * 31;
        int r1 = (this.d.hashCode() + r0) * 31;
        return this.e.hashCode() + r1;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("FragmentManagerViewModel{");
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append("} Fragments (");
        Iterator r1 = this.c.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        r0.append(r1.next());
        if (r1.hasNext() == false) goto L4;
        r0.append(", ");
        goto L4
    L8:
        r0.append(") Child Non Config (");
        Iterator r12 = this.d.keySet().iterator();
    L10:
        if (r12.hasNext() == false) goto L14;
        r0.append((String) r12.next());
        if (r12.hasNext() == false) goto L10;
        r0.append(", ");
        goto L10
    L14:
        r0.append(") ViewModelStores (");
        Iterator r13 = this.e.keySet().iterator();
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

    static {
    }
}
