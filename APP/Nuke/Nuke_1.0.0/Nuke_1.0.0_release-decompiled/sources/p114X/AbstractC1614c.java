package p114X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p061L2.AbstractC0965e;
import p109W.C1574a;
import p122Y2.InterfaceC1766a;

/* JADX INFO: renamed from: X.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1614c extends AbstractC0965e implements List, Collection, InterfaceC1766a {
    /* JADX INFO: renamed from: b */
    public abstract AbstractC1614c mo2877b(int i5, Object obj);

    /* JADX INFO: renamed from: c */
    public abstract AbstractC1614c mo2878c(Object obj);

    @Override // p061L2.AbstractC0961a, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p061L2.AbstractC0961a, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC1614c mo2879d(Collection collection) {
        C1618g c1618gMo2880e = mo2880e();
        c1618gMo2880e.addAll(collection);
        return c1618gMo2880e.m2899c();
    }

    /* JADX INFO: renamed from: e */
    public abstract C1618g mo2880e();

    /* JADX INFO: renamed from: f */
    public abstract AbstractC1614c mo2881f(C1613b c1613b);

    /* JADX INFO: renamed from: g */
    public abstract AbstractC1614c mo2882g(int i5);

    /* JADX INFO: renamed from: h */
    public abstract AbstractC1614c mo2883h(int i5, Object obj);

    @Override // p061L2.AbstractC0965e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p061L2.AbstractC0965e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p061L2.AbstractC0965e, java.util.List
    public final List subList(int i5, int i6) {
        return new C1574a(this, i5, i6);
    }
}
