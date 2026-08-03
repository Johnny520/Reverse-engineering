package p009E0;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: E0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0173d extends C0172c implements ListIterator {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0175f f387d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0173d(AbstractC0175f abstractC0175f, int i2) {
        super(abstractC0175f);
        this.f387d = abstractC0175f;
        int iMo516a = abstractC0175f.mo516a();
        if (i2 < 0 || i2 > iMo516a) {
            throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", i2, ", size: ", iMo516a));
        }
        this.f385b = i2;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f385b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f385b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f385b - 1;
        this.f385b = i2;
        return this.f387d.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f385b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
