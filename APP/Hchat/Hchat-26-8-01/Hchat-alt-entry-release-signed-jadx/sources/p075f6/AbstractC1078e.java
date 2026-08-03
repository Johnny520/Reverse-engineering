package p075f6;

import bsh.C0353j;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;
import okio.C3193a;
import p068eh.AbstractC0921a;
import p150k5.C2246b0;
import p207o5.AbstractC3065t;
import p219oh.AbstractC3165h;

/* JADX INFO: renamed from: f6.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1078e extends AbstractC1074a implements List, RandomAccess {

    /* JADX INFO: renamed from: h */
    public static final C1076c f3468h = new C1076c(C1079f.f3469k, 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static C1079f m2710f(Object... objArr) {
        int length = objArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (objArr[i9] == null) {
                C0353j.m1305c(AbstractC0921a.m2249l(i9, "at index "));
                return null;
            }
        }
        int length2 = objArr.length;
        return length2 == 0 ? C1079f.f3469k : new C1079f(length2, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static AbstractC1078e m2711g(List list) {
        if (!(list instanceof AbstractC1074a)) {
            return m2710f(list.toArray());
        }
        AbstractC1078e abstractC1078e = (AbstractC1078e) ((AbstractC1074a) list);
        if (!abstractC1078e.mo2706e()) {
            return abstractC1078e;
        }
        Object[] array = abstractC1078e.toArray(AbstractC1074a.f3457g);
        int length = array.length;
        return length == 0 ? C1079f.f3469k : new C1079f(length, array);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: k5.b0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static AbstractC1078e m2712h(C2246b0 c2246b0) {
        if (c2246b0 instanceof Collection) {
            return m2711g((List) ((Collection) c2246b0));
        }
        AbstractC3065t abstractC3065t = (AbstractC3065t) c2246b0.iterator();
        if (!abstractC3065t.hasNext()) {
            return C1079f.f3469k;
        }
        Object next = abstractC3065t.next();
        if (!abstractC3065t.hasNext()) {
            return m2710f(next);
        }
        C1075b c1075b = new C1075b();
        c1075b.f3461d = new Object[4];
        c1075b.f3460c = 0;
        c1075b.m2707a(next);
        while (abstractC3065t.hasNext()) {
            c1075b.m2707a(abstractC3065t.next());
        }
        c1075b.f3459b = true;
        Object[] objArr = (Object[]) c1075b.f3461d;
        int i9 = c1075b.f3460c;
        return i9 == 0 ? C1079f.f3469k : new C1079f(i9, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p075f6.AbstractC1074a
    /* JADX INFO: renamed from: a */
    public int mo2702a(Object[] objArr) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            objArr[i9] = get(i9);
        }
        return size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final void add(int i9, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final boolean addAll(int i9, Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && Objects.equals(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i9 = 0; i9 < size; i9++) {
                        if (Objects.equals(get(i9), list.get(i9))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i9 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i9 = ~(~(get(i10).hashCode() + (i9 * 31)));
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: listIterator(I)Ljava/util/ListIterator; */
    @Override // java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final C1076c listIterator(int i9) {
        int size = size();
        if (i9 >= 0 && i9 <= size) {
            return isEmpty() ? f3468h : new C1076c(this, i9);
        }
        C3193a.m6820i(AbstractC3165h.m6781h(i9, size, "index"));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (obj.equals(get(i9))) {
                return i9;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: subList(II)Ljava/util/List; */
    @Override // java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC1078e subList(int i9, int i10) {
        AbstractC3165h.m6789p(i9, i10, size());
        int i11 = i10 - i9;
        return i11 == size() ? this : i11 == 0 ? C1079f.f3469k : new C1077d(this, i9, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object remove(int i9) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object set(int i9, Object obj) {
        throw new UnsupportedOperationException();
    }
}
