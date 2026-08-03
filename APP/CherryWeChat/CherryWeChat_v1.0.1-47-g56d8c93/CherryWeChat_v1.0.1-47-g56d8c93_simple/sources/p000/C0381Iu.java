package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: Iu */
/* JADX INFO: loaded from: classes.dex */
public final class C0381Iu extends AbstractC0172E implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final C0381Iu f1312d = null;

    /* JADX INFO: renamed from: b */
    public Object[] f1313b;

    /* JADX INFO: renamed from: c */
    public int f1314c;

    static {
        C0381Iu r0 = new C0381Iu(new Object[0], 0);
        f1312d = r0;
        r0.f453a = false;
    }

    public C0381Iu(Object[] r1, int r2) {
        this.f1313b = r1;
        this.f1314c = r2;
    }

    @Override // p000.AbstractC0172E, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object r5) {
        m325a();
        int r0 = this.f1314c;
        Object[] r1 = this.f1313b;
        if (r0 != r1.length) goto L5;
        this.f1313b = Arrays.copyOf(r1, ((r0 * 3) / 2) + 1);
    L5:
        Object[] r02 = this.f1313b;
        int r12 = this.f1314c;
        this.f1314c = r12 + 1;
        r02[r12] = r5;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m821b(int r4) {
        if (r4 >= 0) goto L4;
    L6:
        StringBuilder r42 = AbstractC2374ph.m4816m(r4, "Index:", ", Size:");
        r42.append(this.f1314c);
        throw new IndexOutOfBoundsException(r42.toString());
    L4:
        if (r4 >= this.f1314c) goto L6;
    }

    @Override // p000.InterfaceC0458Kl
    /* JADX INFO: renamed from: f */
    public final InterfaceC0458Kl mo716f(int r3) {
        if (r3 < this.f1314c) goto L7;
        return new C0381Iu(Arrays.copyOf(this.f1313b, r3), this.f1314c);
    L7:
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int r2) {
        m821b(r2);
        return this.f1313b[r2];
    }

    @Override // p000.AbstractC0172E, java.util.AbstractList, java.util.List
    public final Object remove(int r5) {
        m325a();
        m821b(r5);
        Object[] r0 = this.f1313b;
        Object r1 = r0[r5];
        if (r5 >= (this.f1314c - 1)) goto L5;
        System.arraycopy(r0, r5 + 1, r0, r5, (r2 - r5) - 1);
    L5:
        this.f1314c--;
        ((AbstractList) this).modCount++;
        return r1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int r3, Object r4) {
        m325a();
        m821b(r3);
        Object[] r0 = this.f1313b;
        Object r1 = r0[r3];
        r0[r3] = r4;
        ((AbstractList) this).modCount++;
        return r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1314c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r5, Object r6) {
        m325a();
        if (r5 < 0) goto L12;
        int r0 = this.f1314c;
        if (r5 > r0) goto L12;
        Object[] r1 = this.f1313b;
        if (r0 >= r1.length) goto L9;
        System.arraycopy(r1, r5, r1, r5 + 1, r0 - r5);
    L10:
        this.f1313b[r5] = r6;
        this.f1314c++;
        ((AbstractList) this).modCount++;
        return;
    L9:
        Object[] r02 = new Object[((r0 * 3) / 2) + 1];
        System.arraycopy(r1, 0, r02, 0, r5);
        System.arraycopy(this.f1313b, r5, r02, r5 + 1, this.f1314c - r5);
        this.f1313b = r02;
    L12:
        StringBuilder r52 = AbstractC2374ph.m4816m(r5, "Index:", ", Size:");
        r52.append(this.f1314c);
        throw new IndexOutOfBoundsException(r52.toString());
    }
}
