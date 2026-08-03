package p009E0;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import p001A0.AbstractC0040p;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: E0.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0168B extends AbstractC0175f implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final Object[] f366a;

    /* JADX INFO: renamed from: b */
    public final int f367b;

    /* JADX INFO: renamed from: c */
    public int f368c;

    /* JADX INFO: renamed from: d */
    public int f369d;

    public C0168B(int i2, Object[] objArr) {
        this.f366a = objArr;
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0324d.m720c("ring buffer filled size should not be negative but it is ", i2).toString());
        }
        if (i2 <= objArr.length) {
            this.f367b = objArr.length;
            this.f369d = i2;
        } else {
            throw new IllegalArgumentException(("ring buffer filled size: " + i2 + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
    }

    @Override // p009E0.AbstractC0175f
    /* JADX INFO: renamed from: a */
    public final int mo516a() {
        return this.f369d;
    }

    /* JADX INFO: renamed from: b */
    public final void m517b(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0324d.m720c("n shouldn't be negative but it is ", i2).toString());
        }
        if (i2 > this.f369d) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i2 + ", size = " + this.f369d).toString());
        }
        if (i2 > 0) {
            int i3 = this.f368c;
            int i4 = this.f367b;
            int i5 = (i3 + i2) % i4;
            Object[] objArr = this.f366a;
            if (i3 > i5) {
                AbstractC0179j.m534k0(objArr, i3, i4);
                AbstractC0179j.m534k0(objArr, 0, i5);
            } else {
                AbstractC0179j.m534k0(objArr, i3, i5);
            }
            this.f368c = i5;
            this.f369d -= i2;
        }
    }

    @Override // java.util.List
    public final Object get(int i2) {
        int iMo516a = mo516a();
        if (i2 < 0 || i2 >= iMo516a) {
            throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", i2, ", size: ", iMo516a));
        }
        return this.f366a[(this.f368c + i2) % this.f367b];
    }

    @Override // p009E0.AbstractC0175f, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0167A(this);
    }

    @Override // p009E0.AbstractC0175f, java.util.List, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[mo516a()]);
    }

    @Override // p009E0.AbstractC0175f, java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        AbstractC0307g.m703e(objArr, "array");
        int length = objArr.length;
        int i2 = this.f369d;
        if (length < i2) {
            objArr = Arrays.copyOf(objArr, i2);
            AbstractC0307g.m702d(objArr, "copyOf(...)");
        }
        int i3 = this.f369d;
        int i4 = this.f368c;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            objArr2 = this.f366a;
            if (i6 >= i3 || i4 >= this.f367b) {
                break;
            }
            objArr[i6] = objArr2[i4];
            i6++;
            i4++;
        }
        while (i6 < i3) {
            objArr[i6] = objArr2[i5];
            i6++;
            i5++;
        }
        AbstractC0040p.m95a0(i3, objArr);
        return objArr;
    }
}
