package p174m;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: m.v1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C2664v1 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2613i2 f8704a;

    /* JADX INFO: renamed from: b */
    public final EnumC2640p1 f8705b;

    /* JADX INFO: renamed from: c */
    public final boolean f8706c;

    /* JADX INFO: renamed from: d */
    public final boolean f8707d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2664v1(InterfaceC2613i2 interfaceC2613i2, EnumC2640p1 enumC2640p1, boolean z9, boolean z10) {
        this.f8704a = interfaceC2613i2;
        this.f8705b = enumC2640p1;
        this.f8706c = z9;
        this.f8707d = z10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2664v1)) {
            return false;
        }
        C2664v1 c2664v1 = (C2664v1) obj;
        return AbstractC1416l.m3825a(this.f8704a, c2664v1.f8704a) && this.f8705b == c2664v1.f8705b && this.f8706c == c2664v1.f8706c && this.f8707d == c2664v1.f8707d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        return new C2609h2(null, null, this.f8705b, this.f8704a, null, this.f8706c, this.f8707d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        ((C2609h2) abstractC5852n).m6060F1(null, null, this.f8705b, this.f8704a, null, this.f8706c, this.f8707d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return AbstractC0921a.m2245h(AbstractC0921a.m2245h((this.f8705b.hashCode() + (this.f8704a.hashCode() * 31)) * 961, 31, this.f8706c), 29791, this.f8707d);
    }
}
