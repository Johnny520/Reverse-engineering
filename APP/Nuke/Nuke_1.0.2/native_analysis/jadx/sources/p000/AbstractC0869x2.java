package p000;

import java.util.ListIterator;

/* JADX INFO: renamed from: x2 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0869x2 implements ListIterator, q41 {

    /* JADX INFO: renamed from: h */
    public int f12770h;

    /* JADX INFO: renamed from: i */
    public int f12771i;

    public AbstractC0869x2(int i, int i2) {
        this.f12770h = i;
        this.f12771i = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f12770h < this.f12771i;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12770h > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12770h;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12770h - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
