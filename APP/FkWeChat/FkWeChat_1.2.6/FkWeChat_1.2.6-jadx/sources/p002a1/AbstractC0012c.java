package p002a1;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p010a9.InterfaceC0184l;
import p185m8.AbstractC5078f;
import p364z0.InterfaceC9825c;
import p364z0.InterfaceC9827e;

/* JADX INFO: renamed from: a1.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0012c extends AbstractC5078f implements InterfaceC9827e {
    /* JADX INFO: renamed from: e */
    public static boolean m28e(Collection collection, Object obj) {
        return collection.contains(obj);
    }

    @Override // java.util.Collection, java.util.List, p364z0.InterfaceC9827e
    public InterfaceC9827e addAll(Collection collection) {
        InterfaceC9827e.a aVarBuilder = builder();
        aVarBuilder.addAll(collection);
        return aVarBuilder.build();
    }

    @Override // p185m8.AbstractC5066b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p185m8.AbstractC5066b, java.util.Collection, java.util.List
    public boolean containsAll(Collection collection) {
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

    @Override // p185m8.AbstractC5078f, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, p364z0.InterfaceC9827e
    public InterfaceC9827e remove(Object obj) {
        int iIndexOf = indexOf(obj);
        return iIndexOf != -1 ? mo33k(iIndexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, p364z0.InterfaceC9827e
    public InterfaceC9827e removeAll(final Collection collection) {
        return mo32f(new InterfaceC0184l() { // from class: a1.b
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(AbstractC0012c.m28e(collection, obj));
            }
        });
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    public InterfaceC9825c subList(int i10, int i11) {
        return super.subList(i10, i11);
    }
}
