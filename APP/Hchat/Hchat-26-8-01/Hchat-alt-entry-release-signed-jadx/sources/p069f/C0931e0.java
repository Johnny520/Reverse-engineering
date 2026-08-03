package p069f;

import gg.AbstractC1415k;
import gg.AbstractC1416l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p114hg.InterfaceC1713c;
import p131j0.AbstractC2047c;

/* JADX INFO: renamed from: f.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0931e0 implements List, InterfaceC1713c {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2916g;

    /* JADX INFO: renamed from: h */
    public final Object f2917h;

    /* JADX INFO: renamed from: i */
    public final int f2918i;

    /* JADX INFO: renamed from: j */
    public int f2919j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0931e0(List list, int i9, int i10, int i11) {
        this.f2916g = i11;
        this.f2917h = list;
        this.f2918i = i9;
        this.f2919j = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i9, Object obj) {
        switch (this.f2916g) {
            case 0:
                this.f2917h.add(i9 + this.f2918i, obj);
                this.f2919j++;
                break;
            default:
                this.f2917h.add(i9 + this.f2918i, obj);
                this.f2919j++;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i9, Collection collection) {
        switch (this.f2916g) {
            case 0:
                collection.getClass();
                this.f2917h.addAll(i9 + this.f2918i, collection);
                this.f2919j = collection.size() + this.f2919j;
                if (collection.size() > 0) {
                }
                break;
            default:
                this.f2917h.addAll(i9 + this.f2918i, collection);
                int size = collection.size();
                this.f2919j += size;
                if (size > 0) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.f2916g) {
            case 0:
                int i9 = this.f2919j - 1;
                int i10 = this.f2918i;
                if (i10 <= i9) {
                    while (true) {
                        this.f2917h.remove(i9);
                        if (i9 != i10) {
                            i9--;
                        }
                    }
                }
                this.f2919j = i10;
                break;
            default:
                int i11 = this.f2919j - 1;
                int i12 = this.f2918i;
                if (i12 <= i11) {
                    while (true) {
                        this.f2917h.remove(i11);
                        if (i11 != i12) {
                            i11--;
                        }
                    }
                }
                this.f2919j = i12;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f2916g) {
            case 0:
                int i9 = this.f2919j;
                for (int i10 = this.f2918i; i10 < i9; i10++) {
                    if (AbstractC1416l.m3825a(this.f2917h.get(i10), obj)) {
                    }
                    break;
                }
                break;
            default:
                int i11 = this.f2919j;
                for (int i12 = this.f2918i; i12 < i11; i12++) {
                    if (AbstractC1416l.m3825a(this.f2917h.get(i12), obj)) {
                    }
                    break;
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f2916g) {
            case 0:
                collection.getClass();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i9) {
        switch (this.f2916g) {
            case 0:
                AbstractC0953p0.m2347a(i9, this);
                return this.f2917h.get(i9 + this.f2918i);
            default:
                AbstractC2047c.m5068a(i9, this);
                return this.f2917h.get(i9 + this.f2918i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f2916g) {
            case 0:
                int i9 = this.f2919j;
                int i10 = this.f2918i;
                for (int i11 = i10; i11 < i9; i11++) {
                    if (AbstractC1416l.m3825a(this.f2917h.get(i11), obj)) {
                        return i11 - i10;
                    }
                }
                return -1;
            default:
                int i12 = this.f2919j;
                int i13 = this.f2918i;
                for (int i14 = i13; i14 < i12; i14++) {
                    if (AbstractC1416l.m3825a(this.f2917h.get(i14), obj)) {
                        return i14 - i13;
                    }
                }
                return -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f2916g) {
            case 0:
                if (this.f2919j == this.f2918i) {
                }
                break;
            default:
                if (this.f2919j == this.f2918i) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2916g) {
            case 0:
                return new C0927c0(this, 0, 0);
            default:
                return new C0927c0(this, 0, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.f2916g) {
            case 0:
                int i9 = this.f2919j - 1;
                int i10 = this.f2918i;
                if (i10 <= i9) {
                    while (!AbstractC1416l.m3825a(this.f2917h.get(i9), obj)) {
                        if (i9 != i10) {
                            i9--;
                        }
                    }
                    return i9 - i10;
                }
                return -1;
            default:
                int i11 = this.f2919j - 1;
                int i12 = this.f2918i;
                if (i12 <= i11) {
                    while (!AbstractC1416l.m3825a(this.f2917h.get(i11), obj)) {
                        if (i11 != i12) {
                            i11--;
                        }
                    }
                    return i11 - i12;
                }
                return -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f2916g) {
            case 0:
                return new C0927c0(this, 0, 0);
            default:
                return new C0927c0(this, 0, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f2916g) {
            case 0:
                int i9 = this.f2919j;
                for (int i10 = this.f2918i; i10 < i9; i10++) {
                    ?? r2 = this.f2917h;
                    if (AbstractC1416l.m3825a(r2.get(i10), obj)) {
                        r2.remove(i10);
                        this.f2919j--;
                    }
                    break;
                }
                break;
            default:
                int i11 = this.f2919j;
                for (int i12 = this.f2918i; i12 < i11; i12++) {
                    ?? r22 = this.f2917h;
                    if (AbstractC1416l.m3825a(r22.get(i12), obj)) {
                        r22.remove(i12);
                        this.f2919j--;
                    }
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f2916g) {
            case 0:
                collection.getClass();
                int i9 = this.f2919j;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                if (i9 != this.f2919j) {
                }
                break;
            default:
                int i10 = this.f2919j;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                if (i10 != this.f2919j) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f2916g) {
            case 0:
                collection.getClass();
                int i9 = this.f2919j;
                int i10 = i9 - 1;
                int i11 = this.f2918i;
                if (i11 <= i10) {
                    while (true) {
                        ?? r32 = this.f2917h;
                        if (!collection.contains(r32.get(i10))) {
                            r32.remove(i10);
                            this.f2919j--;
                        }
                        if (i10 != i11) {
                            i10--;
                        }
                    }
                }
                if (i9 != this.f2919j) {
                }
                break;
            default:
                int i12 = this.f2919j;
                int i13 = i12 - 1;
                int i14 = this.f2918i;
                if (i14 <= i13) {
                    while (true) {
                        ?? r33 = this.f2917h;
                        if (!collection.contains(r33.get(i13))) {
                            r33.remove(i13);
                            this.f2919j--;
                        }
                        if (i13 != i14) {
                            i13--;
                        }
                    }
                }
                if (i12 != this.f2919j) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i9, Object obj) {
        switch (this.f2916g) {
            case 0:
                AbstractC0953p0.m2347a(i9, this);
                return this.f2917h.set(i9 + this.f2918i, obj);
            default:
                AbstractC2047c.m5068a(i9, this);
                return this.f2917h.set(i9 + this.f2918i, obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i9;
        int i10;
        switch (this.f2916g) {
            case 0:
                i9 = this.f2919j;
                i10 = this.f2918i;
                break;
            default:
                i9 = this.f2919j;
                i10 = this.f2918i;
                break;
        }
        return i9 - i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final List subList(int i9, int i10) {
        switch (this.f2916g) {
            case 0:
                AbstractC0953p0.m2348b(this, i9, i10);
                return new C0931e0(this, i9, i10, 0);
            default:
                AbstractC2047c.m5069b(this, i9, i10);
                return new C0931e0(this, i9, i10, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f2916g) {
            case 0:
                objArr.getClass();
                break;
        }
        return AbstractC1415k.m3824b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f2916g) {
        }
        return AbstractC1415k.m3823a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i9) {
        switch (this.f2916g) {
            case 0:
                return new C0927c0(this, i9, 0);
            default:
                return new C0927c0(this, i9, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f2916g) {
            case 0:
                int i9 = this.f2919j;
                this.f2919j = i9 + 1;
                this.f2917h.add(i9, obj);
                break;
            default:
                int i10 = this.f2919j;
                this.f2919j = i10 + 1;
                this.f2917h.add(i10, obj);
                break;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f2916g) {
            case 0:
                collection.getClass();
                this.f2917h.addAll(this.f2919j, collection);
                this.f2919j = collection.size() + this.f2919j;
                if (collection.size() > 0) {
                }
                break;
            default:
                this.f2917h.addAll(this.f2919j, collection);
                int size = collection.size();
                this.f2919j += size;
                if (size > 0) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i9) {
        switch (this.f2916g) {
            case 0:
                AbstractC0953p0.m2347a(i9, this);
                this.f2919j--;
                return this.f2917h.remove(i9 + this.f2918i);
            default:
                AbstractC2047c.m5068a(i9, this);
                this.f2919j--;
                return this.f2917h.remove(i9 + this.f2918i);
        }
    }
}
