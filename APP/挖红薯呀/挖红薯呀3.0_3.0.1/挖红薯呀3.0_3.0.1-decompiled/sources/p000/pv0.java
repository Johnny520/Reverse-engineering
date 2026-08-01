package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class pv0 extends AbstractC0945y implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public final Object[] f4972d;

    /* JADX INFO: renamed from: e */
    public final int f4973e;

    /* JADX INFO: renamed from: f */
    public int f4974f;

    /* JADX INFO: renamed from: g */
    public int f4975g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pv0(int i, Object[] objArr) {
        this.f4972d = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0748t1.m4154l("ring buffer filled size should not be negative but it is ", i).toString());
        }
        if (i <= objArr.length) {
            this.f4973e = objArr.length;
            this.f4975g = i;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + objArr.length).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0597p
    /* JADX INFO: renamed from: a */
    public final int mo6a() {
        return this.f4975g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m3160b() {
        if (5 > this.f4975g) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 5, size = " + this.f4975g).toString());
        }
        int i = this.f4974f;
        int i2 = this.f4973e;
        int i3 = (i + 5) % i2;
        Object[] objArr = this.f4972d;
        if (i > i3) {
            Arrays.fill(objArr, i, i2, (Object) null);
            Arrays.fill(objArr, 0, i3, (Object) null);
        } else {
            Arrays.fill(objArr, i, i3, (Object) null);
        }
        this.f4974f = i3;
        this.f4975g -= 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f4975g;
        if (i < 0 || i >= i2) {
            C0921xc.m5125f(AbstractC0748t1.m4153k(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.f4972d[(this.f4974f + i) % this.f4973e];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0945y, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new ov0(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0597p, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int length = objArr.length;
        int i = this.f4975g;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.f4975g;
        int i3 = this.f4974f;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.f4972d;
            if (i5 >= i2 || i3 >= this.f4973e) {
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

    @Override // p000.AbstractC0597p, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[mo6a()]);
    }
}
