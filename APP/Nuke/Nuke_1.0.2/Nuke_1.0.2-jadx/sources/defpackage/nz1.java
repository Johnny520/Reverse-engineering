package defpackage;

import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nz1 extends x2 {
    public final lz1 j;
    public int k;
    public g43 l;
    public int m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public nz1(lz1 lz1Var, int i) {
        super(i, lz1Var.o);
        this.j = lz1Var;
        this.k = lz1Var.e();
        this.m = -1;
        b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        if (this.k != this.j.e()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x2, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.h;
        lz1 lz1Var = this.j;
        lz1Var.add(i, obj);
        this.h++;
        this.i = lz1Var.a();
        this.k = lz1Var.e();
        this.m = -1;
        b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        lz1 lz1Var = this.j;
        Object[] objArr = lz1Var.m;
        if (objArr == null) {
            this.l = null;
            return;
        }
        int i = (lz1Var.o - 1) & (-32);
        int i2 = this.h;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (lz1Var.k / 5) + 1;
        g43 g43Var = this.l;
        if (g43Var == null) {
            this.l = new g43(objArr, i2, i, i3);
            return;
        }
        g43Var.h = i2;
        g43Var.i = i;
        g43Var.j = i3;
        if (g43Var.k.length < i3) {
            g43Var.k = new Object[i3];
        }
        g43Var.k[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        g43Var.l = r0;
        g43Var.b(i2 - r0, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            um2.b();
            return null;
        }
        int i = this.h;
        this.m = i;
        g43 g43Var = this.l;
        lz1 lz1Var = this.j;
        if (g43Var == null) {
            Object[] objArr = lz1Var.n;
            this.h = i + 1;
            return objArr[i];
        }
        if (g43Var.hasNext()) {
            this.h++;
            return g43Var.next();
        }
        Object[] objArr2 = lz1Var.n;
        int i2 = this.h;
        this.h = i2 + 1;
        return objArr2[i2 - g43Var.i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            um2.b();
            return null;
        }
        int i = this.h;
        this.m = i - 1;
        g43 g43Var = this.l;
        lz1 lz1Var = this.j;
        if (g43Var == null) {
            Object[] objArr = lz1Var.n;
            int i2 = i - 1;
            this.h = i2;
            return objArr[i2];
        }
        int i3 = g43Var.i;
        if (i <= i3) {
            this.h = i - 1;
            return g43Var.previous();
        }
        Object[] objArr2 = lz1Var.n;
        int i4 = i - 1;
        this.h = i4;
        return objArr2[i4 - i3];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x2, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.m;
        if (i == -1) {
            throw new IllegalStateException();
        }
        lz1 lz1Var = this.j;
        lz1Var.b(i);
        int i2 = this.m;
        if (i2 < this.h) {
            this.h = i2;
        }
        this.i = lz1Var.a();
        this.k = lz1Var.e();
        this.m = -1;
        b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x2, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.m;
        if (i == -1) {
            throw new IllegalStateException();
        }
        lz1 lz1Var = this.j;
        lz1Var.set(i, obj);
        this.k = lz1Var.e();
        b();
    }
}
