package p184j3;

import java.util.ArrayList;
import p011B4.AbstractC0231b;
import p034G.C0466k;
import p056K2.C0891q;
import p061L2.AbstractC0973m;
import p074O2.C1047e;
import p074O2.C1052j;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;
import p092S0.C1287y;
import p117X2.AbstractC1665j;
import p160f3.AbstractC2162v;
import p172h3.EnumC2241a;
import p178i3.C2327h;
import p178i3.InterfaceC2323d;
import p178i3.InterfaceC2324e;
import p190k3.AbstractC2453a;

/* JADX INFO: renamed from: j3.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2387f implements InterfaceC2394m {

    /* JADX INFO: renamed from: d */
    public final InterfaceC1051i f7735d;

    /* JADX INFO: renamed from: e */
    public final int f7736e;

    /* JADX INFO: renamed from: f */
    public final EnumC2241a f7737f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2323d f7738g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC2387f(InterfaceC2323d interfaceC2323d, InterfaceC1051i interfaceC1051i, int i5, EnumC2241a enumC2241a) {
        this.f7735d = interfaceC1051i;
        this.f7736e = i5;
        this.f7737f = enumC2241a;
        this.f7738g = interfaceC2323d;
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC2387f mo4237a(InterfaceC1051i interfaceC1051i, int i5, EnumC2241a enumC2241a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public InterfaceC2323d mo4238b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public abstract Object mo4239c(InterfaceC2324e interfaceC2324e, AbstractC1178c abstractC1178c);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final String m4240d() {
        ArrayList arrayList = new ArrayList(4);
        C1052j c1052j = C1052j.f3286d;
        InterfaceC1051i interfaceC1051i = this.f7735d;
        if (interfaceC1051i != c1052j) {
            arrayList.add("context=" + interfaceC1051i);
        }
        int i5 = this.f7736e;
        if (i5 != -3) {
            arrayList.add("capacity=" + i5);
        }
        EnumC2241a enumC2241a = EnumC2241a.f7351d;
        EnumC2241a enumC2241a2 = this.f7737f;
        if (enumC2241a2 != enumC2241a) {
            arrayList.add("onBufferOverflow=" + enumC2241a2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return AbstractC0231b.m402m(sb, AbstractC0973m.m2016W(arrayList, ", ", null, null, null, 62), ']');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    @Override // p178i3.InterfaceC2323d
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo3119i(InterfaceC2324e interfaceC2324e, InterfaceC1046d interfaceC1046d) {
        int i5 = this.f7736e;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        InterfaceC1046d interfaceC1046d2 = null;
        C0891q c0891q = C0891q.f2780a;
        if (i5 == -3) {
            InterfaceC1051i interfaceC1051iMo275e = interfaceC1046d.mo275e();
            Boolean bool = Boolean.FALSE;
            C1287y c1287y = new C1287y((byte) 0, 18);
            InterfaceC1051i interfaceC1051i = this.f7735d;
            InterfaceC1051i interfaceC1051iMo1168m = !((Boolean) interfaceC1051i.mo1165A(c1287y, bool)).booleanValue() ? interfaceC1051iMo275e.mo1168m(interfaceC1051i) : AbstractC2162v.m3985g(interfaceC1051iMo275e, interfaceC1051i, false);
            if (AbstractC1665j.m2981a(interfaceC1051iMo1168m, interfaceC1051iMo275e)) {
                Object objMo4239c = mo4239c(interfaceC2324e, (AbstractC1178c) interfaceC1046d);
                if (objMo4239c == enumC1152a) {
                    return objMo4239c;
                }
            } else {
                C1047e c1047e = C1047e.f3285d;
                if (AbstractC1665j.m2981a(interfaceC1051iMo1168m.mo1166C(c1047e), interfaceC1051iMo275e.mo1166C(c1047e))) {
                    InterfaceC1051i interfaceC1051iMo275e2 = interfaceC1046d.mo275e();
                    if (!(interfaceC2324e instanceof C2400s) && !(interfaceC2324e instanceof C2396o)) {
                        interfaceC2324e = new C2327h(interfaceC2324e, interfaceC1051iMo275e2);
                    }
                    Object objM4236a = AbstractC2384c.m4236a(interfaceC1051iMo1168m, interfaceC2324e, AbstractC2453a.m4383k(interfaceC1051iMo1168m), new C2386e(this, interfaceC1046d2, 1), interfaceC1046d);
                    if (objM4236a == enumC1152a) {
                        return objM4236a;
                    }
                } else {
                    Object objM3982d = AbstractC2162v.m3982d(new C0466k(interfaceC2324e, this, interfaceC1046d2, 6), interfaceC1046d);
                    if (objM3982d != enumC1152a) {
                        objM3982d = c0891q;
                    }
                    if (objM3982d == enumC1152a) {
                        return objM3982d;
                    }
                }
            }
        }
        return c0891q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // p184j3.InterfaceC2394m
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC2323d mo4148n(InterfaceC1051i interfaceC1051i, int i5, EnumC2241a enumC2241a) {
        InterfaceC1051i interfaceC1051i2 = this.f7735d;
        InterfaceC1051i interfaceC1051iMo1168m = interfaceC1051i.mo1168m(interfaceC1051i2);
        EnumC2241a enumC2241a2 = EnumC2241a.f7351d;
        EnumC2241a enumC2241a3 = this.f7737f;
        int i6 = this.f7736e;
        if (enumC2241a == enumC2241a2) {
            if (i6 != -3) {
                if (i5 != -3) {
                    if (i6 != -2) {
                        if (i5 == -2) {
                            i5 = i6;
                        } else {
                            i5 += i6;
                            if (i5 < 0) {
                                i5 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
            }
            enumC2241a = enumC2241a3;
        }
        return (AbstractC1665j.m2981a(interfaceC1051iMo1168m, interfaceC1051i2) && i5 == i6 && enumC2241a == enumC2241a3) ? this : mo4237a(interfaceC1051iMo1168m, i5, enumC2241a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f7738g + " -> " + m4240d();
    }
}
