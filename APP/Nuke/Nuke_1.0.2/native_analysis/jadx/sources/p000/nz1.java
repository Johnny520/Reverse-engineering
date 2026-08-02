package p000;

import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nz1 extends AbstractC0869x2 {

    /* JADX INFO: renamed from: j */
    public final lz1 f7373j;

    /* JADX INFO: renamed from: k */
    public int f7374k;

    /* JADX INFO: renamed from: l */
    public g43 f7375l;

    /* JADX INFO: renamed from: m */
    public int f7376m;

    public nz1(lz1 lz1Var, int i) {
        super(i, lz1Var.f6413o);
        this.f7373j = lz1Var;
        this.f7374k = lz1Var.m2998e();
        this.f7376m = -1;
        m3462b();
    }

    /* JADX INFO: renamed from: a */
    public final void m3461a() {
        if (this.f7374k != this.f7373j.m2998e()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // p000.AbstractC0869x2, java.util.ListIterator
    public final void add(Object obj) {
        m3461a();
        int i = this.f12770h;
        lz1 lz1Var = this.f7373j;
        lz1Var.add(i, obj);
        this.f12770h++;
        this.f12771i = lz1Var.mo152a();
        this.f7374k = lz1Var.m2998e();
        this.f7376m = -1;
        m3462b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: b */
    public final void m3462b() {
        lz1 lz1Var = this.f7373j;
        Object[] objArr = lz1Var.f6411m;
        if (objArr == null) {
            this.f7375l = null;
            return;
        }
        int i = (lz1Var.f6413o - 1) & (-32);
        int i2 = this.f12770h;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (lz1Var.f6409k / 5) + 1;
        g43 g43Var = this.f7375l;
        if (g43Var == null) {
            this.f7375l = new g43(objArr, i2, i, i3);
            return;
        }
        g43Var.f12770h = i2;
        g43Var.f12771i = i;
        g43Var.f3308j = i3;
        if (g43Var.f3309k.length < i3) {
            g43Var.f3309k = new Object[i3];
        }
        g43Var.f3309k[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        g43Var.f3310l = r0;
        g43Var.m1804b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m3461a();
        if (!hasNext()) {
            um2.m5513b();
            return null;
        }
        int i = this.f12770h;
        this.f7376m = i;
        g43 g43Var = this.f7375l;
        lz1 lz1Var = this.f7373j;
        if (g43Var == null) {
            Object[] objArr = lz1Var.f6412n;
            this.f12770h = i + 1;
            return objArr[i];
        }
        if (g43Var.hasNext()) {
            this.f12770h++;
            return g43Var.next();
        }
        Object[] objArr2 = lz1Var.f6412n;
        int i2 = this.f12770h;
        this.f12770h = i2 + 1;
        return objArr2[i2 - g43Var.f12771i];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m3461a();
        if (!hasPrevious()) {
            um2.m5513b();
            return null;
        }
        int i = this.f12770h;
        this.f7376m = i - 1;
        g43 g43Var = this.f7375l;
        lz1 lz1Var = this.f7373j;
        if (g43Var == null) {
            Object[] objArr = lz1Var.f6412n;
            int i2 = i - 1;
            this.f12770h = i2;
            return objArr[i2];
        }
        int i3 = g43Var.f12771i;
        if (i <= i3) {
            this.f12770h = i - 1;
            return g43Var.previous();
        }
        Object[] objArr2 = lz1Var.f6412n;
        int i4 = i - 1;
        this.f12770h = i4;
        return objArr2[i4 - i3];
    }

    @Override // p000.AbstractC0869x2, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m3461a();
        int i = this.f7376m;
        if (i == -1) {
            throw new IllegalStateException();
        }
        lz1 lz1Var = this.f7373j;
        lz1Var.mo153b(i);
        int i2 = this.f7376m;
        if (i2 < this.f12770h) {
            this.f12770h = i2;
        }
        this.f12771i = lz1Var.mo152a();
        this.f7374k = lz1Var.m2998e();
        this.f7376m = -1;
        m3462b();
    }

    @Override // p000.AbstractC0869x2, java.util.ListIterator
    public final void set(Object obj) {
        m3461a();
        int i = this.f7376m;
        if (i == -1) {
            throw new IllegalStateException();
        }
        lz1 lz1Var = this.f7373j;
        lz1Var.set(i, obj);
        this.f7374k = lz1Var.m2998e();
        m3462b();
    }
}
