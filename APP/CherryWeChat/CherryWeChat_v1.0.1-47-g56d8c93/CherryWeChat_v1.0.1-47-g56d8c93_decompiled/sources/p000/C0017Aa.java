package p000;

import java.io.Serializable;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Aa */
/* JADX INFO: loaded from: classes.dex */
public final class C0017Aa implements InterfaceC1137ac, Serializable {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1137ac f32a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1049Yb f33b;

    public C0017Aa(InterfaceC1137ac interfaceC1137ac, InterfaceC1049Yb interfaceC1049Yb) {
        this.f32a = interfaceC1137ac;
        this.f33b = interfaceC1049Yb;
    }

    public final boolean equals(Object obj) {
        boolean zM1134a;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0017Aa) {
            C0017Aa c0017Aa = (C0017Aa) obj;
            int i = 2;
            C0017Aa c0017Aa2 = c0017Aa;
            int i2 = 2;
            while (true) {
                InterfaceC1137ac interfaceC1137ac = c0017Aa2.f32a;
                c0017Aa2 = interfaceC1137ac instanceof C0017Aa ? (C0017Aa) interfaceC1137ac : null;
                if (c0017Aa2 == null) {
                    break;
                }
                i2++;
            }
            C0017Aa c0017Aa3 = this;
            while (true) {
                InterfaceC1137ac interfaceC1137ac2 = c0017Aa3.f32a;
                c0017Aa3 = interfaceC1137ac2 instanceof C0017Aa ? (C0017Aa) interfaceC1137ac2 : null;
                if (c0017Aa3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                C0017Aa c0017Aa4 = this;
                while (true) {
                    InterfaceC1049Yb interfaceC1049Yb = c0017Aa4.f33b;
                    if (!AbstractC0585Nj.m1134a(c0017Aa.mo24m(interfaceC1049Yb.getKey()), interfaceC1049Yb)) {
                        zM1134a = false;
                        break;
                    }
                    InterfaceC1137ac interfaceC1137ac3 = c0017Aa4.f32a;
                    if (!(interfaceC1137ac3 instanceof C0017Aa)) {
                        InterfaceC1049Yb interfaceC1049Yb2 = (InterfaceC1049Yb) interfaceC1137ac3;
                        zM1134a = AbstractC0585Nj.m1134a(c0017Aa.mo24m(interfaceC1049Yb2.getKey()), interfaceC1049Yb2);
                        break;
                    }
                    c0017Aa4 = (C0017Aa) interfaceC1137ac3;
                }
                if (zM1134a) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f33b.hashCode() + this.f32a.hashCode();
    }

    @Override // p000.InterfaceC1137ac
    /* JADX INFO: renamed from: l */
    public final InterfaceC1137ac mo23l(InterfaceC1137ac interfaceC1137ac) {
        return AbstractC1406fG.m2700Z(this, interfaceC1137ac);
    }

    @Override // p000.InterfaceC1137ac
    /* JADX INFO: renamed from: m */
    public final InterfaceC1049Yb mo24m(InterfaceC1092Zb interfaceC1092Zb) {
        C0017Aa c0017Aa = this;
        while (true) {
            InterfaceC1049Yb interfaceC1049YbMo24m = c0017Aa.f33b.mo24m(interfaceC1092Zb);
            if (interfaceC1049YbMo24m != null) {
                return interfaceC1049YbMo24m;
            }
            InterfaceC1137ac interfaceC1137ac = c0017Aa.f32a;
            if (!(interfaceC1137ac instanceof C0017Aa)) {
                return interfaceC1137ac.mo24m(interfaceC1092Zb);
            }
            c0017Aa = (C0017Aa) interfaceC1137ac;
        }
    }

    @Override // p000.InterfaceC1137ac
    /* JADX INFO: renamed from: q */
    public final Object mo25q(Object obj, Function2 function2) {
        return function2.mo446d(this.f32a.mo25q(obj, function2), this.f33b);
    }

    @Override // p000.InterfaceC1137ac
    /* JADX INFO: renamed from: s */
    public final InterfaceC1137ac mo26s(InterfaceC1092Zb interfaceC1092Zb) {
        InterfaceC1049Yb interfaceC1049Yb = this.f33b;
        InterfaceC1049Yb interfaceC1049YbMo24m = interfaceC1049Yb.mo24m(interfaceC1092Zb);
        InterfaceC1137ac interfaceC1137ac = this.f32a;
        if (interfaceC1049YbMo24m != null) {
            return interfaceC1137ac;
        }
        InterfaceC1137ac interfaceC1137acMo26s = interfaceC1137ac.mo26s(interfaceC1092Zb);
        return interfaceC1137acMo26s == interfaceC1137ac ? this : interfaceC1137acMo26s == C0366If.f1247a ? interfaceC1049Yb : new C0017Aa(interfaceC1137acMo26s, interfaceC1049Yb);
    }

    public final String toString() {
        return AbstractC2374ph.m4815l(new StringBuilder("["), (String) mo25q("", new C0309H7(5)), ']');
    }
}
