package p024b9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import p254r5.C6502h0;

/* JADX INFO: renamed from: b9.s0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1060s0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f3214a;

    public C1060s0(int i10) {
        this.f3214a = new ArrayList(i10);
    }

    /* JADX INFO: renamed from: a */
    public void m3836a(Object obj) {
        this.f3214a.add(obj);
    }

    /* JADX INFO: renamed from: b */
    public void m3837b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList arrayList = this.f3214a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f3214a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f3214a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f3214a.add(it.next());
            }
            return;
        }
        if (!(obj instanceof Iterator)) {
            C6502h0.m25770a("Don't know how to spread ", obj.getClass());
            return;
        }
        Iterator it2 = (Iterator) obj;
        while (it2.hasNext()) {
            this.f3214a.add(it2.next());
        }
    }

    /* JADX INFO: renamed from: c */
    public int m3838c() {
        return this.f3214a.size();
    }

    /* JADX INFO: renamed from: d */
    public Object[] m3839d(Object[] objArr) {
        return this.f3214a.toArray(objArr);
    }
}
