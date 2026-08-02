package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class t2 implements Iterator, q41 {
    public final /* synthetic */ int h;
    public int i;
    public final Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t2(wf0 wf0Var) {
        this.h = 2;
        this.j = wf0Var;
        this.i = wf0Var.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.h;
        Object obj = this.j;
        switch (i) {
            case 0:
                if (this.i < ((w2) obj).a()) {
                }
                break;
            case 1:
                if (this.i < ((Object[]) obj).length) {
                }
                break;
            case 2:
                if (this.i > 0) {
                }
                break;
            case 3:
                if (this.i < ((byte[]) obj).length) {
                }
                break;
            case 4:
                if (this.i < ((int[]) obj).length) {
                }
                break;
            case 5:
                if (this.i < ((long[]) obj).length) {
                }
                break;
            default:
                if (this.i < ((short[]) obj).length) {
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.h;
        Object obj = this.j;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    um2.b();
                } else {
                    int i2 = this.i;
                    this.i = i2 + 1;
                }
                break;
            case 1:
                try {
                    int i3 = this.i;
                    this.i = i3 + 1;
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.i--;
                    um2.i(e.getMessage());
                    return null;
                }
                break;
            case 2:
                wf0 wf0Var = (wf0) obj;
                int i4 = wf0Var.c;
                int i5 = this.i;
                this.i = i5 - 1;
                break;
            case 3:
                int i6 = this.i;
                byte[] bArr = (byte[]) obj;
                if (i6 >= bArr.length) {
                    um2.i(String.valueOf(i6));
                } else {
                    this.i = i6 + 1;
                }
                break;
            case 4:
                int i7 = this.i;
                int[] iArr = (int[]) obj;
                if (i7 >= iArr.length) {
                    um2.i(String.valueOf(i7));
                } else {
                    this.i = i7 + 1;
                }
                break;
            case 5:
                int i8 = this.i;
                long[] jArr = (long[]) obj;
                if (i8 >= jArr.length) {
                    um2.i(String.valueOf(i8));
                } else {
                    this.i = i8 + 1;
                }
                break;
            default:
                int i9 = this.i;
                short[] sArr = (short[]) obj;
                if (i9 >= sArr.length) {
                    um2.i(String.valueOf(i9));
                } else {
                    this.i = i9 + 1;
                }
                break;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.h) {
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
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public t2(Object[] objArr) {
        this.h = 1;
        objArr.getClass();
        this.j = objArr;
    }

    public /* synthetic */ t2(int i, Object obj) {
        this.h = i;
        this.j = obj;
    }
}
