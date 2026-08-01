package p361yc;

import java.util.List;
import p024b9.AbstractC1061t;
import p098g9.InterfaceC2549c;
import p098g9.InterfaceC2550d;
import p098g9.InterfaceC2560n;
import p372z8.AbstractC9886a;

/* JADX INFO: renamed from: yc.z0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9788z0 implements InterfaceC2560n {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2560n f33077a;

    public C9788z0(InterfaceC2560n interfaceC2560n) {
        interfaceC2560n.getClass();
        this.f33077a = interfaceC2560n;
    }

    @Override // p098g9.InterfaceC2560n
    /* JADX INFO: renamed from: a */
    public boolean mo3875a() {
        return this.f33077a.mo3875a();
    }

    @Override // p098g9.InterfaceC2560n
    /* JADX INFO: renamed from: c */
    public List mo3876c() {
        return this.f33077a.mo3876c();
    }

    @Override // p098g9.InterfaceC2560n
    /* JADX INFO: renamed from: e */
    public InterfaceC2550d mo3877e() {
        return this.f33077a.mo3877e();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        InterfaceC2560n interfaceC2560n = this.f33077a;
        C9788z0 c9788z0 = obj instanceof C9788z0 ? (C9788z0) obj : null;
        if (!AbstractC1061t.m3842c(interfaceC2560n, c9788z0 != null ? c9788z0.f33077a : null)) {
            return false;
        }
        InterfaceC2550d interfaceC2550dMo3877e = mo3877e();
        if (interfaceC2550dMo3877e instanceof InterfaceC2549c) {
            InterfaceC2560n interfaceC2560n2 = obj instanceof InterfaceC2560n ? (InterfaceC2560n) obj : null;
            InterfaceC2550d interfaceC2550dMo3877e2 = interfaceC2560n2 != null ? interfaceC2560n2.mo3877e() : null;
            if (interfaceC2550dMo3877e2 != null && (interfaceC2550dMo3877e2 instanceof InterfaceC2549c)) {
                return AbstractC1061t.m3842c(AbstractC9886a.m38367b((InterfaceC2549c) interfaceC2550dMo3877e), AbstractC9886a.m38367b((InterfaceC2549c) interfaceC2550dMo3877e2));
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f33077a.hashCode();
    }

    public String toString() {
        return "KTypeWrapper: " + this.f33077a;
    }
}
