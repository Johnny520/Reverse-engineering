package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yx0 extends AbstractC0832w2 {

    /* JADX INFO: renamed from: h */
    public final AbstractC0077c3 f13659h;

    /* JADX INFO: renamed from: i */
    public final int f13660i;

    /* JADX INFO: renamed from: j */
    public final int f13661j;

    public yx0(AbstractC0077c3 abstractC0077c3, int i, int i2) {
        this.f13659h = abstractC0077c3;
        this.f13660i = i;
        up0.m5549n(i, i2, abstractC0077c3.mo529a());
        this.f13661j = i2 - i;
    }

    @Override // p000.AbstractC0372k2
    /* JADX INFO: renamed from: a */
    public final int mo529a() {
        return this.f13661j;
    }

    @Override // java.util.List
    public final Object get(int i) {
        up0.m5546k(i, this.f13661j);
        return this.f13659h.get(this.f13660i + i);
    }

    @Override // p000.AbstractC0832w2, java.util.List
    public final List subList(int i, int i2) {
        up0.m5549n(i, i2, this.f13661j);
        int i3 = this.f13660i;
        return new yx0(this.f13659h, i + i3, i3 + i2);
    }
}
