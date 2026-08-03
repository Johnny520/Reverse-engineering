package p222p;

import p068eh.AbstractC0921a;
import p085fg.InterfaceC1235p;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: p.t1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C3258t1 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final EnumC3269y f10385a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1235p f10386b;

    /* JADX INFO: renamed from: c */
    public final Object f10387c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3258t1(EnumC3269y enumC3269y, InterfaceC1235p interfaceC1235p, Object obj) {
        this.f10385a = enumC3269y;
        this.f10386b = interfaceC1235p;
        this.f10387c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3258t1.class != obj.getClass()) {
            return false;
        }
        C3258t1 c3258t1 = (C3258t1) obj;
        return this.f10385a == c3258t1.f10385a && this.f10387c.equals(c3258t1.f10387c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C3264v1 c3264v1 = new C3264v1();
        c3264v1.f10401u = this.f10385a;
        c3264v1.f10402v = this.f10386b;
        return c3264v1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C3264v1 c3264v1 = (C3264v1) abstractC5852n;
        c3264v1.f10401u = this.f10385a;
        c3264v1.f10402v = this.f10386b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10387c.hashCode() + AbstractC0921a.m2245h(this.f10385a.hashCode() * 31, 31, false);
    }
}
