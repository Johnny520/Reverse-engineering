package p160f3;

import p074O2.AbstractC1043a;
import p074O2.C1047e;
import p074O2.InterfaceC1048f;
import p074O2.InterfaceC1049g;
import p074O2.InterfaceC1050h;
import p074O2.InterfaceC1051i;
import p092S0.C1286x;
import p117X2.AbstractC1665j;
import p190k3.AbstractC2453a;
import p190k3.C2459g;

/* JADX INFO: renamed from: f3.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2153p extends AbstractC1043a implements InterfaceC1048f {

    /* JADX INFO: renamed from: e */
    public static final C2151o f7099e = new C2151o(C1047e.f3285d, new C1286x(25));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC2153p() {
        super(C1047e.f3285d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p074O2.AbstractC1043a, p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: C */
    public final InterfaceC1049g mo1166C(InterfaceC1050h interfaceC1050h) {
        InterfaceC1049g interfaceC1049g;
        AbstractC1665j.m2985e(interfaceC1050h, "key");
        if (interfaceC1050h instanceof C2151o) {
            C2151o c2151o = (C2151o) interfaceC1050h;
            InterfaceC1050h interfaceC1050h2 = this.f3281d;
            if ((interfaceC1050h2 == c2151o || c2151o.f7097e == interfaceC1050h2) && (interfaceC1049g = (InterfaceC1049g) c2151o.f7096d.mo1h(this)) != null) {
                return interfaceC1049g;
            }
        } else if (C1047e.f3285d == interfaceC1050h) {
            return this;
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public abstract void mo1207D(InterfaceC1051i interfaceC1051i, Runnable runnable);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public boolean mo3975E(InterfaceC1051i interfaceC1051i) {
        return !(this instanceof AbstractC2152o0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public AbstractC2153p mo3976F(int i5) {
        AbstractC2453a.m4373a(i5);
        return new C2459g(this, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (((p074O2.InterfaceC1049g) r3.f7096d.mo1h(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (p074O2.C1047e.f3285d == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        return p074O2.C1052j.f3286d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        return r2;
     */
    @Override // p074O2.AbstractC1043a, p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC1051i mo1167j(InterfaceC1050h interfaceC1050h) {
        AbstractC1665j.m2985e(interfaceC1050h, "key");
        if (interfaceC1050h instanceof C2151o) {
            C2151o c2151o = (C2151o) interfaceC1050h;
            InterfaceC1050h interfaceC1050h2 = this.f3281d;
            if (interfaceC1050h2 != c2151o) {
                if (c2151o.f7097e != interfaceC1050h2) {
                    return this;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC2162v.m3987i(this);
    }
}
