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

    public AbstractC2153p() {
        super(C1047e.f3285d);
    }

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

    /* JADX INFO: renamed from: E */
    public boolean mo3975E(InterfaceC1051i interfaceC1051i) {
        return !(this instanceof AbstractC2152o0);
    }

    /* JADX INFO: renamed from: F */
    public AbstractC2153p mo3976F(int i5) {
        AbstractC2453a.m4373a(i5);
        return new C2459g(this, i5);
    }

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
        To view partially-correct add '--show-bad-code' argument
    */
    public final p074O2.InterfaceC1051i mo1167j(p074O2.InterfaceC1050h r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            p117X2.AbstractC1665j.m2985e(r3, r0)
            boolean r0 = r3 instanceof p160f3.C2151o
            if (r0 == 0) goto L20
            f3.o r3 = (p160f3.C2151o) r3
            O2.h r0 = r2.f3281d
            if (r0 == r3) goto L15
            O2.h r1 = r3.f7097e
            if (r1 != r0) goto L14
            goto L15
        L14:
            return r2
        L15:
            W2.c r3 = r3.f7096d
            java.lang.Object r3 = r3.mo1h(r2)
            O2.g r3 = (p074O2.InterfaceC1049g) r3
            if (r3 == 0) goto L27
            goto L24
        L20:
            O2.e r0 = p074O2.C1047e.f3285d
            if (r0 != r3) goto L27
        L24:
            O2.j r3 = p074O2.C1052j.f3286d
            return r3
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p160f3.AbstractC2153p.mo1167j(O2.h):O2.i");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC2162v.m3987i(this);
    }
}
