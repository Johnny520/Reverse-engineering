package p241q7;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: q7.s0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6314s0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f19813a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final boolean m24968a() {
        return this.f19813a.isEmpty();
    }

    /* JADX INFO: renamed from: b */
    public final Object m24969b() {
        if (this.f19813a.isEmpty()) {
            throw new NoSuchElementException("Unable to peek an element into empty stack");
        }
        return AbstractC5081g0.m20587u0(this.f19813a);
    }

    /* JADX INFO: renamed from: c */
    public final Object m24970c() {
        if (this.f19813a.isEmpty()) {
            throw new NoSuchElementException("Unable to pop an element from empty stack");
        }
        ArrayList arrayList = this.f19813a;
        return arrayList.remove(AbstractC5114x.m20802q(arrayList));
    }

    /* JADX INFO: renamed from: d */
    public final void m24971d(Object obj) {
        this.f19813a.add(obj);
    }
}
