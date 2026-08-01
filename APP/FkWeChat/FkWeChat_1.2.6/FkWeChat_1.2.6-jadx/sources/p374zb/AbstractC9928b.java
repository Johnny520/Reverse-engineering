package p374zb;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p185m8.AbstractC5078f;
import p360yb.InterfaceC9660c;
import p360yb.InterfaceC9663f;

/* JADX INFO: renamed from: zb.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9928b extends AbstractC5078f implements InterfaceC9663f {
    @Override // p185m8.AbstractC5066b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p185m8.AbstractC5066b, java.util.Collection, java.util.List
    public boolean containsAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
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

    @Override // p185m8.AbstractC5078f, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceC9660c subList(int i10, int i11) {
        return InterfaceC9663f.a.m37783a(this, i10, i11);
    }

    @Override // p185m8.AbstractC5078f, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }
}
