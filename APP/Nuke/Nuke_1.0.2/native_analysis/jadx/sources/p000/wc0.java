package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wc0 implements uo2, xc0 {

    /* JADX INFO: renamed from: a */
    public final uo2 f12457a;

    /* JADX INFO: renamed from: b */
    public final int f12458b;

    public wc0(uo2 uo2Var, int i) {
        uo2Var.getClass();
        this.f12457a = uo2Var;
        this.f12458b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // p000.xc0
    /* JADX INFO: renamed from: a */
    public final uo2 mo1343a(int i) {
        int i2 = this.f12458b + i;
        return i2 < 0 ? new wc0(this, i) : new wc0(this.f12457a, i2);
    }

    @Override // p000.uo2
    public final Iterator iterator() {
        return new vc0(this);
    }
}
