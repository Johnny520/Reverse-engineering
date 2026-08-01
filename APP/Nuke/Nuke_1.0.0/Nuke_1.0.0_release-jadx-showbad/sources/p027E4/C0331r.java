package p027E4;

import com.bumptech.glide.AbstractC1923e;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p118X3.InterfaceC1694d;
import p160f3.C2135g;

/* JADX INFO: renamed from: E4.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0331r extends AbstractC0333t {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1050d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0320g f1051e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0331r(C0305T c0305t, InterfaceC1694d interfaceC1694d, InterfaceC0327n interfaceC0327n, InterfaceC0320g interfaceC0320g, int i5) {
        super(c0305t, interfaceC1694d, interfaceC0327n);
        this.f1050d = i5;
        this.f1051e = interfaceC0320g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p027E4.AbstractC0333t
    /* JADX INFO: renamed from: a */
    public final Object mo552a(C0289C c0289c, Object[] objArr) {
        switch (this.f1050d) {
            case 0:
                return this.f1051e.mo38g(c0289c);
            default:
                InterfaceC0318e interfaceC0318e = (InterfaceC0318e) this.f1051e.mo38g(c0289c);
                InterfaceC1046d interfaceC1046d = (InterfaceC1046d) objArr[objArr.length - 1];
                try {
                    C2135g c2135g = new C2135g(1, AbstractC1923e.m3448G(interfaceC1046d));
                    c2135g.m3968t();
                    c2135g.m3970w(new C0335v(interfaceC0318e, 2));
                    interfaceC0318e.mo510c(new C0336w(c2135g, 2));
                    return c2135g.m3967r();
                } catch (Exception e5) {
                    AbstractC0315b0.m546q(e5, interfaceC1046d);
                    return EnumC1152a.f3788d;
                }
        }
    }
}
