package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class na2 extends w2 implements RandomAccess {
    public final Object[] h;
    public final int i;
    public int j;
    public int k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public na2(int i, Object[] objArr) {
        this.h = objArr;
        if (i < 0) {
            s.c(vi0.g("ring buffer filled size should not be negative but it is ", i));
            throw null;
        }
        if (i <= objArr.length) {
            this.i = objArr.length;
            this.k = i;
        } else {
            StringBuilder sbN = vi0.n(i, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbN.append(objArr.length);
            throw new IllegalArgumentException(sbN.toString().toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k2
    public final int a() {
        return this.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i) {
        if (i < 0) {
            s.c(vi0.g("n shouldn't be negative but it is ", i));
            return;
        }
        if (i > this.k) {
            StringBuilder sbN = vi0.n(i, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            sbN.append(this.k);
            throw new IllegalArgumentException(sbN.toString().toString());
        }
        if (i > 0) {
            int i2 = this.j;
            int i3 = this.i;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.h;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.j = i4;
            this.k -= i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.k;
        if (i < 0 || i >= i2) {
            s.d(vi0.h("index: ", i, ", size: ", i2));
            return null;
        }
        return this.h[(this.j + i) % this.i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w2, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new ma2(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k2, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int length = objArr.length;
        int i = this.k;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.k;
        int i3 = this.j;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.h;
            if (i5 >= i2 || i3 >= this.i) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // defpackage.k2, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }
}
