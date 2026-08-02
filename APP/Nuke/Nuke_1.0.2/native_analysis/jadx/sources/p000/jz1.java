package p000;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jz1 extends AbstractC0447m3 implements zx0, Collection, q41 {

    /* JADX INFO: renamed from: k */
    public static final jz1 f5285k;

    /* JADX INFO: renamed from: h */
    public final Object f5286h;

    /* JADX INFO: renamed from: i */
    public final Object f5287i;

    /* JADX INFO: renamed from: j */
    public final zy1 f5288j;

    static {
        gd3 gd3Var = gd3.f3444v;
        f5285k = new jz1(gd3Var, gd3Var, zy1.f14149j);
    }

    public jz1(Object obj, Object obj2, zy1 zy1Var) {
        this.f5286h = obj;
        this.f5287i = obj2;
        this.f5288j = zy1Var;
    }

    @Override // p000.AbstractC0372k2
    /* JADX INFO: renamed from: a */
    public final int mo529a() {
        return this.f5288j.f14151i;
    }

    @Override // p000.AbstractC0372k2, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f5288j.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ro0(this.f5286h, this.f5288j);
    }
}
