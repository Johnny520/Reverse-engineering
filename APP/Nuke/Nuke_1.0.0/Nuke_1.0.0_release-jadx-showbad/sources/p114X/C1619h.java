package p114X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1619h extends AbstractC1612a {

    /* JADX INFO: renamed from: f */
    public final Object[] f5572f;

    /* JADX INFO: renamed from: g */
    public final C1622k f5573g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1619h(Object[] objArr, Object[] objArr2, int i5, int i6, int i7) {
        super(i5, i6);
        this.f5572f = objArr2;
        int i8 = (i6 - 1) & (-32);
        this.f5573g = new C1622k(objArr, i5 > i8 ? i8 : i5, i8, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C1622k c1622k = this.f5573g;
        if (c1622k.hasNext()) {
            this.f5553d++;
            return c1622k.next();
        }
        int i5 = this.f5553d;
        this.f5553d = i5 + 1;
        return this.f5572f[i5 - c1622k.f5554e];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f5553d;
        C1622k c1622k = this.f5573g;
        int i6 = c1622k.f5554e;
        if (i5 <= i6) {
            this.f5553d = i5 - 1;
            return c1622k.previous();
        }
        int i7 = i5 - 1;
        this.f5553d = i7;
        return this.f5572f[i7 - i6];
    }
}
