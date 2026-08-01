package ba;

import ca.C1411b1;
import java.util.Map;
import p081fa.InterfaceC2397y;
import p081fa.InterfaceC2398z;
import p082fb.InterfaceC2406h;
import p229p9.InterfaceC6018l1;
import p229p9.InterfaceC6019m;
import p244qb.AbstractC6370a;

/* JADX INFO: renamed from: ba.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1085m implements InterfaceC1088p {

    /* JADX INFO: renamed from: a */
    public final C1083k f3270a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6019m f3271b;

    /* JADX INFO: renamed from: c */
    public final int f3272c;

    /* JADX INFO: renamed from: d */
    public final Map f3273d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2406h f3274e;

    public C1085m(C1083k c1083k, InterfaceC6019m interfaceC6019m, InterfaceC2398z interfaceC2398z, int i10) {
        c1083k.getClass();
        interfaceC6019m.getClass();
        interfaceC2398z.getClass();
        this.f3270a = c1083k;
        this.f3271b = interfaceC6019m;
        this.f3272c = i10;
        this.f3273d = AbstractC6370a.m25342d(interfaceC2398z.getTypeParameters());
        this.f3274e = c1083k.m3941e().mo8665h(new C1084l(this));
    }

    /* JADX INFO: renamed from: c */
    public static final C1411b1 m3945c(C1085m c1085m, InterfaceC2397y interfaceC2397y) {
        interfaceC2397y.getClass();
        Integer num = (Integer) c1085m.f3273d.get(interfaceC2397y);
        if (num == null) {
            return null;
        }
        return new C1411b1(AbstractC1075c.m3893k(AbstractC1075c.m3885c(c1085m.f3270a, c1085m), c1085m.f3271b.getAnnotations()), interfaceC2397y, c1085m.f3272c + num.intValue(), c1085m.f3271b);
    }

    @Override // ba.InterfaceC1088p
    /* JADX INFO: renamed from: a */
    public InterfaceC6018l1 mo3946a(InterfaceC2397y interfaceC2397y) {
        interfaceC2397y.getClass();
        C1411b1 c1411b1 = (C1411b1) this.f3274e.mo27m(interfaceC2397y);
        return c1411b1 != null ? c1411b1 : this.f3270a.m3942f().mo3946a(interfaceC2397y);
    }
}
