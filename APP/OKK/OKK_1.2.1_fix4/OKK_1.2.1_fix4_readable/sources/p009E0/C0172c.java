package p009E0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p031Q0.AbstractC0307g;
import p033R0.InterfaceC0319a;
import p040V0.C0412o;

/* JADX INFO: renamed from: E0.c */
/* JADX INFO: loaded from: classes.dex */
public class C0172c implements Iterator, InterfaceC0319a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f384a = 0;

    /* JADX INFO: renamed from: b */
    public int f385b;

    /* JADX INFO: renamed from: c */
    public final Object f386c;

    public C0172c(long[] jArr) {
        AbstractC0307g.m703e(jArr, "array");
        this.f386c = jArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f384a) {
            case 0:
                if (this.f385b < ((AbstractC0175f) this.f386c).mo516a()) {
                }
                break;
            case 1:
                if (this.f385b < ((Object[]) this.f386c).length) {
                }
                break;
            case 2:
                if (this.f385b < ((long[]) this.f386c).length) {
                }
                break;
            default:
                if (this.f385b <= 0 || !((Iterator) this.f386c).hasNext()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f384a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.f385b;
                this.f385b = i2 + 1;
                return ((AbstractC0175f) this.f386c).get(i2);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f386c;
                    int i3 = this.f385b;
                    this.f385b = i3 + 1;
                    return objArr[i3];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f385b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
            case 2:
                try {
                    long[] jArr = (long[]) this.f386c;
                    int i4 = this.f385b;
                    this.f385b = i4 + 1;
                    return Long.valueOf(jArr[i4]);
                } catch (ArrayIndexOutOfBoundsException e3) {
                    this.f385b--;
                    throw new NoSuchElementException(e3.getMessage());
                }
            default:
                int i5 = this.f385b;
                if (i5 == 0) {
                    throw new NoSuchElementException();
                }
                this.f385b = i5 - 1;
                return ((Iterator) this.f386c).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f384a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0172c(Object[] objArr) {
        AbstractC0307g.m703e(objArr, "array");
        this.f386c = objArr;
    }

    public C0172c(AbstractC0175f abstractC0175f) {
        this.f386c = abstractC0175f;
    }

    public C0172c(C0412o c0412o) {
        this.f385b = c0412o.f913b;
        this.f386c = c0412o.f912a.iterator();
    }
}
