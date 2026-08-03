package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: Iu */
/* JADX INFO: loaded from: classes.dex */
public final class C0381Iu extends AbstractC0172E implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final C0381Iu f1312d;

    /* JADX INFO: renamed from: b */
    public Object[] f1313b;

    /* JADX INFO: renamed from: c */
    public int f1314c;

    static {
        C0381Iu c0381Iu = new C0381Iu(new Object[0], 0);
        f1312d = c0381Iu;
        c0381Iu.f453a = false;
    }

    public C0381Iu(Object[] objArr, int i) {
        this.f1313b = objArr;
        this.f1314c = i;
    }

    @Override // p000.AbstractC0172E, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m325a();
        int i = this.f1314c;
        Object[] objArr = this.f1313b;
        if (i == objArr.length) {
            this.f1313b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f1313b;
        int i2 = this.f1314c;
        this.f1314c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m821b(int i) {
        if (i < 0 || i >= this.f1314c) {
            StringBuilder sbM4816m = AbstractC2374ph.m4816m(i, "Index:", ", Size:");
            sbM4816m.append(this.f1314c);
            throw new IndexOutOfBoundsException(sbM4816m.toString());
        }
    }

    @Override // p000.InterfaceC0458Kl
    /* JADX INFO: renamed from: f */
    public final InterfaceC0458Kl mo716f(int i) {
        if (i >= this.f1314c) {
            return new C0381Iu(Arrays.copyOf(this.f1313b, i), this.f1314c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m821b(i);
        return this.f1313b[i];
    }

    @Override // p000.AbstractC0172E, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m325a();
        m821b(i);
        Object[] objArr = this.f1313b;
        Object obj = objArr[i];
        if (i < this.f1314c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f1314c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m325a();
        m821b(i);
        Object[] objArr = this.f1313b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1314c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m325a();
        if (i >= 0 && i <= (i2 = this.f1314c)) {
            Object[] objArr = this.f1313b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f1313b, i, objArr2, i + 1, this.f1314c - i);
                this.f1313b = objArr2;
            }
            this.f1313b[i] = obj;
            this.f1314c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbM4816m = AbstractC2374ph.m4816m(i, "Index:", ", Size:");
        sbM4816m.append(this.f1314c);
        throw new IndexOutOfBoundsException(sbM4816m.toString());
    }
}
