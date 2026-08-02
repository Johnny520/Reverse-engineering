package p000;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: v2 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0795v2 extends AbstractC0832w2 implements RandomAccess {

    /* JADX INFO: renamed from: h */
    public final AbstractC0832w2 f11609h;

    /* JADX INFO: renamed from: i */
    public final int f11610i;

    /* JADX INFO: renamed from: j */
    public final int f11611j;

    public C0795v2(AbstractC0832w2 abstractC0832w2, int i, int i2) {
        this.f11609h = abstractC0832w2;
        this.f11610i = i;
        sp0.m4963u(i, i2, abstractC0832w2.mo529a());
        this.f11611j = i2 - i;
    }

    @Override // p000.AbstractC0372k2
    /* JADX INFO: renamed from: a */
    public final int mo529a() {
        return this.f11611j;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f11611j;
        if (i < 0 || i >= i2) {
            C0676s.m4646d(vi0.m5689h("index: ", i, ", size: ", i2));
            return null;
        }
        return this.f11609h.get(this.f11610i + i);
    }

    @Override // p000.AbstractC0832w2, java.util.List
    public final List subList(int i, int i2) {
        sp0.m4963u(i, i2, this.f11611j);
        int i3 = this.f11610i;
        return new C0795v2(this.f11609h, i + i3, i3 + i2);
    }
}
