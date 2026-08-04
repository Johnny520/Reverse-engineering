package yyds;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᲇᛴᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2438 extends AbstractC0517 implements Iterable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ArrayList f11998 = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C2438) && ((C2438) obj).f11998.equals(this.f11998);
        }
        return true;
    }

    public final int hashCode() {
        return this.f11998.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f11998.iterator();
    }

    @Override // yyds.AbstractC0517
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final String mo1363() {
        ArrayList arrayList = this.f11998;
        int size = arrayList.size();
        if (size == 1) {
            return ((AbstractC0517) arrayList.get(0)).mo1363();
        }
        C0188.m800(AbstractC0897.m1989(size, "Array must have size 1, but has size "));
        return null;
    }
}
