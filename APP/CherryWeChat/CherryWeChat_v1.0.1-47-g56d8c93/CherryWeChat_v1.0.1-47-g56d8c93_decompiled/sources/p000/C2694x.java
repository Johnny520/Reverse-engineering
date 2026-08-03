package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: x */
/* JADX INFO: loaded from: classes.dex */
public class C2694x implements Iterator, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9267a;

    /* JADX INFO: renamed from: b */
    public int f9268b;

    /* JADX INFO: renamed from: c */
    public final Object f9269c;

    public /* synthetic */ C2694x(int i, Object obj) {
        this.f9267a = i;
        this.f9269c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9267a) {
            case 0:
                return this.f9268b < ((AbstractC0000A) this.f9269c).mo0a();
            case 1:
                return this.f9268b < ((Object[]) this.f9269c).length;
            case 2:
                return ((Iterator) this.f9269c).hasNext();
            case 3:
                return this.f9268b < ((byte[]) this.f9269c).length;
            case 4:
                return this.f9268b < ((int[]) this.f9269c).length;
            case 5:
                return this.f9268b < ((long[]) this.f9269c).length;
            case 6:
                return this.f9268b < ((short[]) this.f9269c).length;
            default:
                return this.f9268b < ((ViewGroup) this.f9269c).getChildCount();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9267a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                AbstractC0000A abstractC0000A = (AbstractC0000A) this.f9269c;
                int i = this.f9268b;
                this.f9268b = i + 1;
                return abstractC0000A.get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f9269c;
                    int i2 = this.f9268b;
                    this.f9268b = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f9268b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 2:
                int i3 = this.f9268b;
                this.f9268b = i3 + 1;
                if (i3 >= 0) {
                    return new C1549il(i3, ((Iterator) this.f9269c).next());
                }
                AbstractC2496sa.m4978c0();
                throw null;
            case 3:
                int i4 = this.f9268b;
                byte[] bArr = (byte[]) this.f9269c;
                if (i4 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f9268b));
                }
                this.f9268b = i4 + 1;
                return new C1130aC(bArr[i4]);
            case 4:
                int i5 = this.f9268b;
                int[] iArr = (int[]) this.f9269c;
                if (i5 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f9268b));
                }
                this.f9268b = i5 + 1;
                return new C1402fC(iArr[i5]);
            case 5:
                int i6 = this.f9268b;
                long[] jArr = (long[]) this.f9269c;
                if (i6 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f9268b));
                }
                this.f9268b = i6 + 1;
                return new C2135kC(jArr[i6]);
            case 6:
                int i7 = this.f9268b;
                short[] sArr = (short[]) this.f9269c;
                if (i7 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f9268b));
                }
                this.f9268b = i7 + 1;
                return new C2355pC(sArr[i7]);
            default:
                ViewGroup viewGroup = (ViewGroup) this.f9269c;
                int i8 = this.f9268b;
                this.f9268b = i8 + 1;
                View childAt = viewGroup.getChildAt(i8);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9267a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.f9269c;
                int i = this.f9268b - 1;
                this.f9268b = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }
}
