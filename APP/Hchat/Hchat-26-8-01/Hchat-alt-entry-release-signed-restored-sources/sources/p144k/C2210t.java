package p144k;

import gg.AbstractC1416l;
import p028c1.C0373c;
import p071f1.C1030t0;
import p293u2.C4236f;
import p306v.C4359d;
import p339x1.AbstractC5618k;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: k.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2210t extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final float f7324a;

    /* JADX INFO: renamed from: b */
    public final C1030t0 f7325b;

    /* JADX INFO: renamed from: c */
    public final C4359d f7326c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2210t(float f3, C1030t0 c1030t0, C4359d c4359d) {
        this.f7324a = f3;
        this.f7325b = c1030t0;
        this.f7326c = c4359d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2210t)) {
            return false;
        }
        C2210t c2210t = (C2210t) obj;
        return C4236f.m8520b(this.f7324a, c2210t.f7324a) && this.f7325b.equals(c2210t.f7325b) && this.f7326c.equals(c2210t.f7326c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        return new C2207s(this.f7324a, this.f7325b, this.f7326c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C2207s c2207s = (C2207s) abstractC5852n;
        float f3 = c2207s.f7317x;
        C0373c c0373c = c2207s.f7315A;
        float f10 = this.f7324a;
        if (!C4236f.m8520b(f3, f10)) {
            c2207s.f7317x = f10;
            c0373c.m1331k1();
        }
        C1030t0 c1030t0 = c2207s.f7318y;
        C1030t0 c1030t02 = this.f7325b;
        if (!AbstractC1416l.m3825a(c1030t0, c1030t02)) {
            c2207s.f7318y = c1030t02;
            c0373c.m1331k1();
        }
        C4359d c4359d = c2207s.f7319z;
        C4359d c4359d2 = this.f7326c;
        if (AbstractC1416l.m3825a(c4359d, c4359d2)) {
            return;
        }
        c2207s.f7319z = c4359d2;
        c0373c.m1331k1();
        AbstractC5618k.m10158n(c2207s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f7326c.hashCode() + ((this.f7325b.hashCode() + (Float.hashCode(this.f7324a) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) C4236f.m8521c(this.f7324a)) + ", brush=" + this.f7325b + ", shape=" + this.f7326c + ')';
    }
}
