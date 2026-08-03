package p174m;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1236q;
import p119i2.C1955z;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: m.q0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2643q0 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: d */
    public static final C1955z f8631d = new C1955z(23);

    /* JADX INFO: renamed from: a */
    public final C2630n f8632a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1236q f8633b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1236q f8634c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2643q0(C2630n c2630n, InterfaceC1236q interfaceC1236q, InterfaceC1236q interfaceC1236q2) {
        this.f8632a = c2630n;
        this.f8633b = interfaceC1236q;
        this.f8634c = interfaceC1236q2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2643q0.class != obj.getClass()) {
            return false;
        }
        C2643q0 c2643q0 = (C2643q0) obj;
        return AbstractC1416l.m3825a(this.f8632a, c2643q0.f8632a) && AbstractC1416l.m3825a(this.f8633b, c2643q0.f8633b) && AbstractC1416l.m3825a(this.f8634c, c2643q0.f8634c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C1955z c1955z = f8631d;
        EnumC2640p1 enumC2640p1 = EnumC2640p1.f8623h;
        C2655t0 c2655t0 = new C2655t0(c1955z, true, null, enumC2640p1);
        c2655t0.f8664P = this.f8632a;
        c2655t0.f8665Q = enumC2640p1;
        c2655t0.f8666R = this.f8633b;
        c2655t0.f8667S = this.f8634c;
        return c2655t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        boolean z9;
        boolean z10;
        C2655t0 c2655t0 = (C2655t0) abstractC5852n;
        C2630n c2630n = c2655t0.f8664P;
        C2630n c2630n2 = this.f8632a;
        if (AbstractC1416l.m3825a(c2630n, c2630n2)) {
            z9 = false;
        } else {
            c2655t0.f8664P = c2630n2;
            z9 = true;
        }
        EnumC2640p1 enumC2640p1 = c2655t0.f8665Q;
        EnumC2640p1 enumC2640p12 = EnumC2640p1.f8623h;
        if (enumC2640p1 != enumC2640p12) {
            c2655t0.f8665Q = enumC2640p12;
            z10 = true;
        } else {
            z10 = z9;
        }
        c2655t0.f8666R = this.f8633b;
        c2655t0.f8667S = this.f8634c;
        c2655t0.m6104E1(f8631d, true, null, enumC2640p12, z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f8634c.hashCode() + ((this.f8633b.hashCode() + AbstractC0921a.m2245h(AbstractC0921a.m2245h((EnumC2640p1.f8623h.hashCode() + (this.f8632a.hashCode() * 31)) * 31, 961, true), 31, false)) * 31)) * 31);
    }
}
