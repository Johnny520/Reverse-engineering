package p165l1;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p165l1.InterfaceC4507m;
import p166l2.InterfaceC4534e0;
import p172l8.C4700i0;

/* JADX INFO: renamed from: l1.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4516v extends InterfaceC4507m.c implements InterfaceC4534e0 {

    /* JADX INFO: renamed from: F */
    public float f13163F;

    /* JADX INFO: renamed from: l1.v$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ AbstractC3545l1 f13164r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C4516v f13165s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC3545l1 abstractC3545l1, C4516v c4516v) {
            super(1);
            this.f13164r = abstractC3545l1;
            this.f13165s = c4516v;
        }

        /* JADX INFO: renamed from: a */
        public final void m17489a(AbstractC3545l1.a aVar) {
            aVar.m13292v(this.f13164r, 0, 0, this.f13165s.m17487G2());
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m17489a((AbstractC3545l1.a) obj);
            return C4700i0.f13910a;
        }
    }

    public C4516v(float f10) {
        this.f13163F = f10;
    }

    /* JADX INFO: renamed from: G2 */
    public final float m17487G2() {
        return this.f13163F;
    }

    /* JADX INFO: renamed from: H2 */
    public final void m17488H2(float f10) {
        this.f13163F = f10;
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: d */
    public InterfaceC3558p0 mo1288d(InterfaceC3561q0 interfaceC3561q0, InterfaceC3552n0 interfaceC3552n0, long j10) {
        AbstractC3545l1 abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(j10);
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, abstractC3545l1Mo13148X.m13264M0(), abstractC3545l1Mo13148X.m13259G0(), null, new a(abstractC3545l1Mo13148X, this), 4, null);
    }

    public String toString() {
        return "ZIndexModifier(zIndex=" + this.f13163F + ')';
    }
}
