package p027E4;

import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p117X2.AbstractC1665j;
import p118X3.InterfaceC1694d;

/* JADX INFO: renamed from: E4.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0332s extends AbstractC0333t {

    /* JADX INFO: renamed from: d */
    public final InterfaceC0320g f1052d;

    /* JADX INFO: renamed from: e */
    public final boolean f1053e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0332s(C0305T c0305t, InterfaceC1694d interfaceC1694d, InterfaceC0327n interfaceC0327n, InterfaceC0320g interfaceC0320g, boolean z5) {
        super(c0305t, interfaceC1694d, interfaceC0327n);
        this.f1052d = interfaceC0320g;
        this.f1053e = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p027E4.AbstractC0333t
    /* JADX INFO: renamed from: a */
    public final Object mo552a(C0289C c0289c, Object[] objArr) {
        InterfaceC0318e interfaceC0318e = (InterfaceC0318e) this.f1052d.mo38g(c0289c);
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) objArr[objArr.length - 1];
        try {
            if (!this.f1053e) {
                return AbstractC0315b0.m531b(interfaceC0318e, interfaceC1046d);
            }
            AbstractC1665j.m2983c(interfaceC0318e, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
            return AbstractC0315b0.m532c(interfaceC0318e, interfaceC1046d);
        } catch (LinkageError e5) {
            throw e5;
        } catch (ThreadDeath e6) {
            throw e6;
        } catch (VirtualMachineError e7) {
            throw e7;
        } catch (Throwable th) {
            AbstractC0315b0.m546q(th, interfaceC1046d);
            return EnumC1152a.f3788d;
        }
    }
}
