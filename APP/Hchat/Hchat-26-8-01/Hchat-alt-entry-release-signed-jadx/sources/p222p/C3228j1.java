package p222p;

import gg.AbstractC1416l;
import p085fg.InterfaceC1231l;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: p.j1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C3228j1 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1231l f10306a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3228j1(InterfaceC1231l interfaceC1231l) {
        this.f10306a = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3228j1) {
            return this.f10306a == ((C3228j1) obj).f10306a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C3231k1 c3231k1 = new C3231k1(AbstractC3208d.f10248c);
        c3231k1.f10313x = this.f10306a;
        return c3231k1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C3231k1 c3231k1 = (C3231k1) abstractC5852n;
        InterfaceC1231l interfaceC1231l = c3231k1.f10313x;
        InterfaceC1231l interfaceC1231l2 = this.f10306a;
        if (interfaceC1231l != interfaceC1231l2) {
            c3231k1.f10313x = interfaceC1231l2;
            C3255s1 c3255s1 = c3231k1.f10314y;
            if (c3255s1 != null) {
                InterfaceC3252r1 interfaceC3252r1 = (InterfaceC3252r1) interfaceC1231l2.invoke(c3255s1);
                if (AbstractC1416l.m3825a(interfaceC3252r1, c3231k1.f10292w)) {
                    return;
                }
                c3231k1.f10292w = interfaceC3252r1;
                c3231k1.mo6895l1();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10306a.hashCode();
    }
}
