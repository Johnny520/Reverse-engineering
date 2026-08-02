package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class a31 extends k31 implements Iterable {

    /* JADX INFO: renamed from: h */
    public final ArrayList f43h = new ArrayList();

    @Override // p000.k31
    /* JADX INFO: renamed from: a */
    public final String mo25a() {
        ArrayList arrayList = this.f43h;
        int size = arrayList.size();
        if (size == 1) {
            return ((k31) arrayList.get(0)).mo25a();
        }
        C0676s.m4653l(vi0.m5688g("Array must have size 1, but has size ", size));
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof a31) && ((a31) obj).f43h.equals(this.f43h);
        }
        return true;
    }

    public final int hashCode() {
        return this.f43h.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f43h.iterator();
    }
}
