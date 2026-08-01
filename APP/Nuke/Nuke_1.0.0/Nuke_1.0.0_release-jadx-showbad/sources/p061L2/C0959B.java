package p061L2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: L2.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0959B extends AbstractC0965e implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public final Object[] f3018d;

    /* JADX INFO: renamed from: e */
    public final int f3019e;

    /* JADX INFO: renamed from: f */
    public int f3020f;

    /* JADX INFO: renamed from: g */
    public int f3021g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0959B(int i5, Object[] objArr) {
        this.f3018d = objArr;
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC0231b.m398i("ring buffer filled size should not be negative but it is ", i5).toString());
        }
        if (i5 <= objArr.length) {
            this.f3019e = objArr.length;
            this.f3021g = i5;
        } else {
            StringBuilder sbM404o = AbstractC0231b.m404o(i5, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbM404o.append(objArr.length);
            throw new IllegalArgumentException(sbM404o.toString().toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061L2.AbstractC0961a
    /* JADX INFO: renamed from: a */
    public final int mo1974a() {
        return this.f3021g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1975b(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC0231b.m398i("n shouldn't be negative but it is ", i5).toString());
        }
        if (i5 > this.f3021g) {
            StringBuilder sbM404o = AbstractC0231b.m404o(i5, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            sbM404o.append(this.f3021g);
            throw new IllegalArgumentException(sbM404o.toString().toString());
        }
        if (i5 > 0) {
            int i6 = this.f3020f;
            int i7 = this.f3019e;
            int i8 = (i6 + i5) % i7;
            Object[] objArr = this.f3018d;
            if (i6 > i8) {
                AbstractC0972l.m1998V(objArr, i6, i7);
                AbstractC0972l.m1998V(objArr, 0, i8);
            } else {
                AbstractC0972l.m1998V(objArr, i6, i8);
            }
            this.f3020f = i8;
            this.f3021g -= i5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i5) {
        int iMo1974a = mo1974a();
        if (i5 < 0 || i5 >= iMo1974a) {
            throw new IndexOutOfBoundsException(AbstractC0231b.m399j("index: ", i5, ", size: ", iMo1974a));
        }
        return this.f3018d[(this.f3020f + i5) % this.f3019e];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061L2.AbstractC0965e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C0958A(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061L2.AbstractC0961a, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo1974a()]);
    }

    @Override // p061L2.AbstractC0961a, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        AbstractC1665j.m2985e(objArr, "array");
        int length = objArr.length;
        int i5 = this.f3021g;
        if (length < i5) {
            objArr = Arrays.copyOf(objArr, i5);
            AbstractC1665j.m2984d(objArr, "copyOf(...)");
        }
        int i6 = this.f3021g;
        int i7 = this.f3020f;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            objArr2 = this.f3018d;
            if (i9 >= i6 || i7 >= this.f3019e) {
                break;
            }
            objArr[i9] = objArr2[i7];
            i9++;
            i7++;
        }
        while (i9 < i6) {
            objArr[i9] = objArr2[i8];
            i9++;
            i8++;
        }
        if (i6 < objArr.length) {
            objArr[i6] = null;
        }
        return objArr;
    }
}
