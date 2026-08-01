package p114X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1615d extends AbstractC1612a {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f5557f = 1;

    /* JADX INFO: renamed from: g */
    public final Object f5558g;

    public C1615d(Object[] objArr, int i5, int i6) {
        super(i5, i6);
        this.f5558g = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f5557f) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f5558g;
                int i5 = this.f5553d;
                this.f5553d = i5 + 1;
                return objArr[i5];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f5553d++;
                return this.f5558g;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f5557f) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f5558g;
                int i5 = this.f5553d - 1;
                this.f5553d = i5;
                return objArr[i5];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f5553d--;
                return this.f5558g;
        }
    }

    public C1615d(int i5, Object obj) {
        super(i5, 1);
        this.f5558g = obj;
    }
}
