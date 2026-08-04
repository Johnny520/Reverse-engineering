package yyds;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: yyds.ᛳᛵᲇᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0603 extends AbstractC1311 implements RandomAccess {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f2863;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object[] f2864;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f2865;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f2866;

    public C0603(int i, Object[] objArr) {
        this.f2864 = objArr;
        if (i < 0) {
            C0188.m806(AbstractC0897.m1989(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i > objArr.length) {
            C0188.m790("ring buffer filled size: ", i, " cannot be larger than the buffer size: ", objArr.length);
            throw null;
        }
        this.f2866 = objArr.length;
        this.f2865 = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f2865;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0897.m1987(i, i2, "index: ", ", size: "));
        }
        return this.f2864[(this.f2863 + i) % this.f2866];
    }

    @Override // yyds.AbstractC1311, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C0123(this);
    }

    @Override // yyds.AbstractC0280, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        int length = objArr.length;
        int i = this.f2865;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.f2865;
        int i3 = this.f2863;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.f2864;
            if (i5 >= i2 || i3 >= this.f2866) {
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

    @Override // yyds.AbstractC0280
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final int mo927() {
        return this.f2865;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m1491() {
        if (2 > this.f2865) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 2, size = " + this.f2865).toString());
        }
        int i = this.f2863;
        int i2 = this.f2866;
        int i3 = (i + 2) % i2;
        Object[] objArr = this.f2864;
        if (i > i3) {
            Arrays.fill(objArr, i, i2, (Object) null);
            Arrays.fill(objArr, 0, i3, (Object) null);
        } else {
            Arrays.fill(objArr, i, i3, (Object) null);
        }
        this.f2863 = i3;
        this.f2865 -= 2;
    }

    @Override // yyds.AbstractC0280, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[mo927()]);
    }
}
