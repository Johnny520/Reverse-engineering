package p361yc;

import p024b9.AbstractC1061t;
import p300uc.InterfaceC8647b;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;

/* JADX INFO: renamed from: yc.v1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9773v1 implements InterfaceC8647b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8647b f33056a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9218f f33057b;

    public C9773v1(InterfaceC8647b interfaceC8647b) {
        interfaceC8647b.getClass();
        this.f33056a = interfaceC8647b;
        this.f33057b = new C9764t2(interfaceC8647b.mo15953a());
    }

    @Override // p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: a */
    public InterfaceC9218f mo15953a() {
        return this.f33057b;
    }

    @Override // p300uc.InterfaceC8662p
    /* JADX INFO: renamed from: b */
    public void mo15954b(InterfaceC9488f interfaceC9488f, Object obj) {
        interfaceC9488f.getClass();
        if (obj == null) {
            interfaceC9488f.mo640f();
        } else {
            interfaceC9488f.mo741v();
            interfaceC9488f.mo632G(this.f33056a, obj);
        }
    }

    @Override // p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: d */
    public Object mo15956d(InterfaceC9487e interfaceC9487e) {
        interfaceC9487e.getClass();
        return interfaceC9487e.mo683p() ? interfaceC9487e.mo660D(this.f33056a) : interfaceC9487e.mo893j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C9773v1.class == obj.getClass() && AbstractC1061t.m3842c(this.f33056a, ((C9773v1) obj).f33056a);
    }

    public int hashCode() {
        return this.f33056a.hashCode();
    }
}
