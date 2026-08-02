package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class na2 extends AbstractC0832w2 implements RandomAccess {

    /* JADX INFO: renamed from: h */
    public final Object[] f7086h;

    /* JADX INFO: renamed from: i */
    public final int f7087i;

    /* JADX INFO: renamed from: j */
    public int f7088j;

    /* JADX INFO: renamed from: k */
    public int f7089k;

    public na2(int i, Object[] objArr) {
        this.f7086h = objArr;
        if (i < 0) {
            C0676s.m4645c(vi0.m5688g("ring buffer filled size should not be negative but it is ", i));
            throw null;
        }
        if (i <= objArr.length) {
            this.f7087i = objArr.length;
            this.f7089k = i;
        } else {
            StringBuilder sbM5695n = vi0.m5695n(i, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbM5695n.append(objArr.length);
            throw new IllegalArgumentException(sbM5695n.toString().toString());
        }
    }

    @Override // p000.AbstractC0372k2
    /* JADX INFO: renamed from: a */
    public final int mo529a() {
        return this.f7089k;
    }

    /* JADX INFO: renamed from: b */
    public final void m3264b(int i) {
        if (i < 0) {
            C0676s.m4645c(vi0.m5688g("n shouldn't be negative but it is ", i));
            return;
        }
        if (i > this.f7089k) {
            StringBuilder sbM5695n = vi0.m5695n(i, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            sbM5695n.append(this.f7089k);
            throw new IllegalArgumentException(sbM5695n.toString().toString());
        }
        if (i > 0) {
            int i2 = this.f7088j;
            int i3 = this.f7087i;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.f7086h;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.f7088j = i4;
            this.f7089k -= i;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f7089k;
        if (i < 0 || i >= i2) {
            C0676s.m4646d(vi0.m5689h("index: ", i, ", size: ", i2));
            return null;
        }
        return this.f7086h[(this.f7088j + i) % this.f7087i];
    }

    @Override // p000.AbstractC0832w2, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new ma2(this);
    }

    @Override // p000.AbstractC0372k2, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int length = objArr.length;
        int i = this.f7089k;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.f7089k;
        int i3 = this.f7088j;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.f7086h;
            if (i5 >= i2 || i3 >= this.f7087i) {
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

    @Override // p000.AbstractC0372k2, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[mo529a()]);
    }
}
