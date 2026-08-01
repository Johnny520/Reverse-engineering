package p011F0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p027N0.AbstractC0223g;
import p029O0.InterfaceC0233a;
import p038T0.C0280e;
import p038T0.C0287l;

/* JADX INFO: renamed from: F0.c */
/* JADX INFO: loaded from: classes.dex */
public class C0115c implements Iterator, InterfaceC0233a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f412a = 0;

    /* JADX INFO: renamed from: b */
    public int f413b;

    /* JADX INFO: renamed from: c */
    public final Object f414c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0115c(Object[] objArr) {
        AbstractC0223g.m418e(objArr, "array");
        this.f414c = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f412a) {
            case 0:
                if (this.f413b < ((AbstractC0118f) this.f414c).mo250a()) {
                }
                break;
            case 1:
                if (this.f413b < ((Object[]) this.f414c).length) {
                }
                break;
            default:
                if (this.f413b <= 0 || !((Iterator) this.f414c).hasNext()) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f412a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.f413b;
                this.f413b = i2 + 1;
                return ((AbstractC0118f) this.f414c).get(i2);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f414c;
                    int i3 = this.f413b;
                    this.f413b = i3 + 1;
                    return objArr[i3];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f413b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
            default:
                int i4 = this.f413b;
                if (i4 == 0) {
                    throw new NoSuchElementException();
                }
                this.f413b = i4 - 1;
                return ((Iterator) this.f414c).next();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f412a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0115c(AbstractC0118f abstractC0118f) {
        this.f414c = abstractC0118f;
    }

    public C0115c(C0287l c0287l) {
        c0287l.getClass();
        this.f413b = 32;
        this.f414c = new C0280e(c0287l.f660a);
    }
}
