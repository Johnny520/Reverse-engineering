package p150k5;

import ac.C0058k;
import bsh.C0353j;
import java.util.AbstractSequentialList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p046d6.C0704a;
import p207o5.C3062q;

/* JADX INFO: renamed from: k5.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2273x extends AbstractSequentialList {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List f7564g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2275z f7565h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2273x(C2275z c2275z, List list) {
        this.f7565h = c2275z;
        this.f7564g = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C3062q m5526a(int i9) {
        if (i9 < 0) {
            C0353j.m1307e();
            return null;
        }
        Iterator it = iterator();
        for (int i10 = 0; i10 < i9; i10++) {
            ((C3062q) it).next();
        }
        return (C3062q) it;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C2275z c2275z = this.f7565h;
        C2270u c2270u = c2275z.f7570j;
        int i9 = c2275z.f7574n;
        List c2274y = i9 > 0 ? new C2274y(c2270u, i9, c2270u.f7532b.m583N(i9), 3) : Collections.EMPTY_LIST;
        C0058k c0058kM5527i1 = c2275z.m5527i1();
        return new C3062q(this.f7564g, c2274y, c0058kM5527i1 != null ? c0058kM5527i1.m363n().mo6494a() : Collections.emptyIterator());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i9) {
        try {
            return new C0704a(this, i9, m5526a(i9));
        } catch (NoSuchElementException unused) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7564g.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }
}
