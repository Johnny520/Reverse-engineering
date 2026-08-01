package p024b9;

import p098g9.InterfaceC2548b;
import p098g9.InterfaceC2552f;

/* JADX INFO: renamed from: b9.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1053p extends AbstractC1033f implements InterfaceC1051o, InterfaceC2552f {

    /* JADX INFO: renamed from: x */
    public final int f3211x;

    public AbstractC1053p(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.f3211x = i10;
    }

    @Override // p098g9.InterfaceC2552f
    /* JADX INFO: renamed from: A */
    public boolean mo3818A() {
        return mo3785v().mo3818A();
    }

    @Override // p024b9.AbstractC1033f
    /* JADX INFO: renamed from: c */
    public InterfaceC2548b mo3771c() {
        return AbstractC1052o0.m3806a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1053p) {
            AbstractC1053p abstractC1053p = (AbstractC1053p) obj;
            return getName().equals(abstractC1053p.getName()) && m3786w().equals(abstractC1053p.m3786w()) && AbstractC1061t.m3842c(m3780g(), abstractC1053p.m3780g()) && AbstractC1061t.m3842c(m3782l(), abstractC1053p.m3782l());
        }
        if (obj instanceof InterfaceC2552f) {
            return obj.equals(mo3777a());
        }
        return false;
    }

    @Override // p024b9.InterfaceC1051o
    public int getArity() {
        return this.f3211x;
    }

    public int hashCode() {
        return (((m3782l() == null ? 0 : m3782l().hashCode() * 31) + getName().hashCode()) * 31) + m3786w().hashCode();
    }

    @Override // p098g9.InterfaceC2552f
    /* JADX INFO: renamed from: k */
    public boolean mo3819k() {
        return mo3785v().mo3819k();
    }

    @Override // p024b9.AbstractC1033f, p098g9.InterfaceC2548b
    /* JADX INFO: renamed from: n */
    public boolean mo3783n() {
        return mo3785v().mo3783n();
    }

    public String toString() {
        InterfaceC2548b interfaceC2548bMo3777a = mo3777a();
        if (interfaceC2548bMo3777a != this) {
            return interfaceC2548bMo3777a.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // p098g9.InterfaceC2552f
    /* JADX INFO: renamed from: u */
    public boolean mo3820u() {
        return mo3785v().mo3820u();
    }

    @Override // p024b9.AbstractC1033f
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public InterfaceC2552f mo3785v() {
        return (InterfaceC2552f) super.mo3785v();
    }
}
