package p105V;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p117X2.AbstractC1664i;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1767b;
import p186k.AbstractC2413J;

/* JADX INFO: renamed from: V.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1481c implements List, InterfaceC1767b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5174d;

    /* JADX INFO: renamed from: e */
    public final Object f5175e;

    /* JADX INFO: renamed from: f */
    public final int f5176f;

    /* JADX INFO: renamed from: g */
    public int f5177g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1481c(List list, int i5, int i6, int i7) {
        this.f5174d = i7;
        this.f5175e = list;
        this.f5176f = i5;
        this.f5177g = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f5174d) {
            case 0:
                int i5 = this.f5177g;
                this.f5177g = i5 + 1;
                this.f5175e.add(i5, obj);
                break;
            default:
                int i6 = this.f5177g;
                this.f5177g = i6 + 1;
                this.f5175e.add(i6, obj);
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i5, Collection collection) {
        switch (this.f5174d) {
            case 0:
                this.f5175e.addAll(i5 + this.f5176f, collection);
                int size = collection.size();
                this.f5177g += size;
                if (size > 0) {
                }
                break;
            default:
                AbstractC1665j.m2985e(collection, "elements");
                this.f5175e.addAll(i5 + this.f5176f, collection);
                this.f5177g = collection.size() + this.f5177g;
                if (collection.size() > 0) {
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
        switch (this.f5174d) {
            case 0:
                int i5 = this.f5177g - 1;
                int i6 = this.f5176f;
                if (i6 <= i5) {
                    while (true) {
                        this.f5175e.remove(i5);
                        if (i5 != i6) {
                            i5--;
                        }
                    }
                }
                this.f5177g = i6;
                break;
            default:
                int i7 = this.f5177g - 1;
                int i8 = this.f5176f;
                if (i8 <= i7) {
                    while (true) {
                        this.f5175e.remove(i7);
                        if (i7 != i8) {
                            i7--;
                        }
                    }
                }
                this.f5177g = i8;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f5174d) {
            case 0:
                int i5 = this.f5177g;
                for (int i6 = this.f5176f; i6 < i5; i6++) {
                    if (AbstractC1665j.m2981a(this.f5175e.get(i6), obj)) {
                    }
                    break;
                }
                break;
            default:
                int i7 = this.f5177g;
                for (int i8 = this.f5176f; i8 < i7; i8++) {
                    if (AbstractC1665j.m2981a(this.f5175e.get(i8), obj)) {
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
        switch (this.f5174d) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                AbstractC1665j.m2985e(collection, "elements");
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
    public final Object get(int i5) {
        switch (this.f5174d) {
            case 0:
                AbstractC1484f.m2765a(i5, this);
                return this.f5175e.get(i5 + this.f5176f);
            default:
                AbstractC2413J.m4293a(i5, this);
                return this.f5175e.get(i5 + this.f5176f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f5174d) {
            case 0:
                int i5 = this.f5177g;
                int i6 = this.f5176f;
                for (int i7 = i6; i7 < i5; i7++) {
                    if (AbstractC1665j.m2981a(this.f5175e.get(i7), obj)) {
                        return i7 - i6;
                    }
                }
                return -1;
            default:
                int i8 = this.f5177g;
                int i9 = this.f5176f;
                for (int i10 = i9; i10 < i8; i10++) {
                    if (AbstractC1665j.m2981a(this.f5175e.get(i10), obj)) {
                        return i10 - i9;
                    }
                }
                return -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f5174d) {
            case 0:
                if (this.f5177g == this.f5176f) {
                }
                break;
            default:
                if (this.f5177g == this.f5176f) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f5174d) {
            case 0:
                return new C1482d(this, 0, 0);
            default:
                return new C1482d(this, 0, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.f5174d) {
            case 0:
                int i5 = this.f5177g - 1;
                int i6 = this.f5176f;
                if (i6 <= i5) {
                    while (!AbstractC1665j.m2981a(this.f5175e.get(i5), obj)) {
                        if (i5 != i6) {
                            i5--;
                        }
                    }
                    return i5 - i6;
                }
                return -1;
            default:
                int i7 = this.f5177g - 1;
                int i8 = this.f5176f;
                if (i8 <= i7) {
                    while (!AbstractC1665j.m2981a(this.f5175e.get(i7), obj)) {
                        if (i7 != i8) {
                            i7--;
                        }
                    }
                    return i7 - i8;
                }
                return -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f5174d) {
            case 0:
                return new C1482d(this, 0, 0);
            default:
                return new C1482d(this, 0, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f5174d) {
            case 0:
                int i5 = this.f5177g;
                for (int i6 = this.f5176f; i6 < i5; i6++) {
                    ?? r22 = this.f5175e;
                    if (AbstractC1665j.m2981a(r22.get(i6), obj)) {
                        r22.remove(i6);
                        this.f5177g--;
                    }
                    break;
                }
                break;
            default:
                int i7 = this.f5177g;
                for (int i8 = this.f5176f; i8 < i7; i8++) {
                    ?? r23 = this.f5175e;
                    if (AbstractC1665j.m2981a(r23.get(i8), obj)) {
                        r23.remove(i8);
                        this.f5177g--;
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
        switch (this.f5174d) {
            case 0:
                int i5 = this.f5177g;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                if (i5 != this.f5177g) {
                }
                break;
            default:
                AbstractC1665j.m2985e(collection, "elements");
                int i6 = this.f5177g;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                if (i6 != this.f5177g) {
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
        switch (this.f5174d) {
            case 0:
                int i5 = this.f5177g;
                int i6 = i5 - 1;
                int i7 = this.f5176f;
                if (i7 <= i6) {
                    while (true) {
                        ?? r32 = this.f5175e;
                        if (!collection.contains(r32.get(i6))) {
                            r32.remove(i6);
                            this.f5177g--;
                        }
                        if (i6 != i7) {
                            i6--;
                        }
                    }
                }
                if (i5 != this.f5177g) {
                }
                break;
            default:
                AbstractC1665j.m2985e(collection, "elements");
                int i8 = this.f5177g;
                int i9 = i8 - 1;
                int i10 = this.f5176f;
                if (i10 <= i9) {
                    while (true) {
                        ?? r33 = this.f5175e;
                        if (!collection.contains(r33.get(i9))) {
                            r33.remove(i9);
                            this.f5177g--;
                        }
                        if (i9 != i10) {
                            i9--;
                        }
                    }
                }
                if (i8 != this.f5177g) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i5, Object obj) {
        switch (this.f5174d) {
            case 0:
                AbstractC1484f.m2765a(i5, this);
                return this.f5175e.set(i5 + this.f5176f, obj);
            default:
                AbstractC2413J.m4293a(i5, this);
                return this.f5175e.set(i5 + this.f5176f, obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i5;
        int i6;
        switch (this.f5174d) {
            case 0:
                i5 = this.f5177g;
                i6 = this.f5176f;
                break;
            default:
                i5 = this.f5177g;
                i6 = this.f5176f;
                break;
        }
        return i5 - i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final List subList(int i5, int i6) {
        switch (this.f5174d) {
            case 0:
                AbstractC1484f.m2766b(this, i5, i6);
                return new C1481c(this, i5, i6, 0);
            default:
                AbstractC2413J.m4294b(this, i5, i6);
                return new C1481c(this, i5, i6, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f5174d) {
        }
        return AbstractC1664i.m2979a(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i5, Object obj) {
        switch (this.f5174d) {
            case 0:
                this.f5175e.add(i5 + this.f5176f, obj);
                this.f5177g++;
                break;
            default:
                this.f5175e.add(i5 + this.f5176f, obj);
                this.f5177g++;
                break;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i5) {
        switch (this.f5174d) {
            case 0:
                return new C1482d(this, i5, 0);
            default:
                return new C1482d(this, i5, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f5174d) {
            case 0:
                break;
            default:
                AbstractC1665j.m2985e(objArr, "array");
                break;
        }
        return AbstractC1664i.m2980b(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f5174d) {
            case 0:
                this.f5175e.addAll(this.f5177g, collection);
                int size = collection.size();
                this.f5177g += size;
                if (size > 0) {
                }
                break;
            default:
                AbstractC1665j.m2985e(collection, "elements");
                this.f5175e.addAll(this.f5177g, collection);
                this.f5177g = collection.size() + this.f5177g;
                if (collection.size() > 0) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i5) {
        switch (this.f5174d) {
            case 0:
                AbstractC1484f.m2765a(i5, this);
                this.f5177g--;
                return this.f5175e.remove(i5 + this.f5176f);
            default:
                AbstractC2413J.m4293a(i5, this);
                this.f5177g--;
                return this.f5175e.remove(i5 + this.f5176f);
        }
    }
}
