package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jb1 implements Iterator {

    /* JADX INFO: renamed from: h */
    public lb1 f4951h;

    /* JADX INFO: renamed from: i */
    public lb1 f4952i = null;

    /* JADX INFO: renamed from: j */
    public int f4953j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ mb1 f4954k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f4955l;

    public jb1(mb1 mb1Var, int i) {
        this.f4955l = i;
        this.f4954k = mb1Var;
        this.f4951h = mb1Var.f6548m.f6024k;
        this.f4953j = mb1Var.f6547l;
    }

    /* JADX INFO: renamed from: a */
    public final Object m2475a() {
        return m2476b();
    }

    /* JADX INFO: renamed from: b */
    public final lb1 m2476b() {
        lb1 lb1Var = this.f4951h;
        mb1 mb1Var = this.f4954k;
        if (lb1Var == mb1Var.f6548m) {
            um2.m5513b();
            return null;
        }
        if (mb1Var.f6547l != this.f4953j) {
            throw new ConcurrentModificationException();
        }
        this.f4951h = lb1Var.f6024k;
        this.f4952i = lb1Var;
        return lb1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4951h != this.f4954k.f6548m;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f4955l) {
            case 1:
                return m2476b().f6026m;
            default:
                return m2475a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        lb1 lb1Var = this.f4952i;
        if (lb1Var == null) {
            throw new IllegalStateException();
        }
        mb1 mb1Var = this.f4954k;
        mb1Var.m3053c(lb1Var, true);
        this.f4952i = null;
        this.f4953j = mb1Var.f6547l;
    }
}
