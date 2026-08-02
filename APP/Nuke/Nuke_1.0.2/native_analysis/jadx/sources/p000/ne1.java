package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ne1 implements Iterator, q41 {

    /* JADX INFO: renamed from: h */
    public final pe1 f7117h;

    /* JADX INFO: renamed from: i */
    public int f7118i;

    /* JADX INFO: renamed from: j */
    public int f7119j;

    /* JADX INFO: renamed from: k */
    public int f7120k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f7121l;

    public ne1(pe1 pe1Var, int i) {
        this.f7121l = i;
        pe1Var.getClass();
        this.f7117h = pe1Var;
        this.f7119j = -1;
        this.f7120k = pe1Var.f8278o;
        m3291b();
    }

    /* JADX INFO: renamed from: a */
    public final void m3290a() {
        if (this.f7117h.f8278o != this.f7120k) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3291b() {
        while (true) {
            int i = this.f7118i;
            pe1 pe1Var = this.f7117h;
            if (i >= pe1Var.f8276m || pe1Var.f8273j[i] >= 0) {
                return;
            } else {
                this.f7118i = i + 1;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7118i < this.f7117h.f8276m;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f7121l;
        pe1 pe1Var = this.f7117h;
        switch (i) {
            case 0:
                m3290a();
                int i2 = this.f7118i;
                if (i2 >= pe1Var.f8276m) {
                    um2.m5513b();
                } else {
                    this.f7118i = i2 + 1;
                    this.f7119j = i2;
                    oe1 oe1Var = new oe1(pe1Var, i2);
                    m3291b();
                }
                break;
            case 1:
                m3290a();
                int i3 = this.f7118i;
                if (i3 >= pe1Var.f8276m) {
                    um2.m5513b();
                } else {
                    this.f7118i = i3 + 1;
                    this.f7119j = i3;
                    Object obj = pe1Var.f8271h[i3];
                    m3291b();
                }
                break;
            default:
                m3290a();
                int i4 = this.f7118i;
                if (i4 >= pe1Var.f8276m) {
                    um2.m5513b();
                } else {
                    this.f7118i = i4 + 1;
                    this.f7119j = i4;
                    Object[] objArr = pe1Var.f8272i;
                    objArr.getClass();
                    Object obj2 = objArr[this.f7119j];
                    m3291b();
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        m3290a();
        if (this.f7119j == -1) {
            C0676s.m4653l("Call next() before removing element from the iterator.");
            return;
        }
        pe1 pe1Var = this.f7117h;
        pe1Var.m3853c();
        pe1Var.m3861k(this.f7119j);
        this.f7119j = -1;
        this.f7120k = pe1Var.f8278o;
    }
}
