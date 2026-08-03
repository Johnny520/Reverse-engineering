package p000;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: cD */
/* JADX INFO: loaded from: classes.dex */
public final class C1254cD extends AbstractList implements InterfaceC0374In, RandomAccess {

    /* JADX INFO: renamed from: a */
    public final C0331Hn f4255a;

    public C1254cD(C0331Hn r1) {
        this.f4255a = r1;
    }

    @Override // p000.InterfaceC0374In
    /* JADX INFO: renamed from: d */
    public final void mo715d(AbstractC2744y6 r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int r2) {
        return (String) this.f4255a.get(r2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C1211bD r0 = new C1211bD();
        r0.f4142a = this.f4255a.iterator();
        return r0;
    }

    @Override // p000.InterfaceC0374In
    /* JADX INFO: renamed from: l */
    public final InterfaceC0374In mo717l() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int r3) {
        C1131aD r0 = new C1131aD();
        r0.f3581a = this.f4255a.listIterator(r3);
        return r0;
    }

    @Override // p000.InterfaceC0374In
    /* JADX INFO: renamed from: m */
    public final Object mo718m(int r2) {
        return this.f4255a.f1133b.get(r2);
    }

    @Override // p000.InterfaceC0374In
    /* JADX INFO: renamed from: o */
    public final List mo719o() {
        return Collections.unmodifiableList(this.f4255a.f1133b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4255a.size();
    }
}
