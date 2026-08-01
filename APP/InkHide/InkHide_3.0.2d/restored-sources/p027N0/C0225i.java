package p027N0;

import p022L.AbstractC0174d;
import p023L0.C0186a;
import p025M0.InterfaceC0204l;
import p036S0.InterfaceC0248a;
import p094v0.C1028c;

/* JADX INFO: renamed from: N0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0225i extends AbstractC0218b implements InterfaceC0204l, InterfaceC0248a {

    /* JADX INFO: renamed from: g */
    public final boolean f565g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0225i() {
        super(C0217a.f553a, C1028c.class, "mainBinding", "getMainBinding()Lcom/lu/wxmask/databinding/FragmentMainBinding;", false);
        this.f565g = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p027N0.AbstractC0218b
    /* JADX INFO: renamed from: a */
    public final InterfaceC0248a mo411a() {
        AbstractC0229m.f569a.getClass();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    public final Object mo8c(Object obj) {
        m424e();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final InterfaceC0248a m423d() {
        if (this.f565g) {
            return this;
        }
        InterfaceC0248a interfaceC0248a = this.f554a;
        if (interfaceC0248a != null) {
            return interfaceC0248a;
        }
        mo411a();
        this.f554a = this;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m424e() {
        if (this.f565g) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        InterfaceC0248a interfaceC0248aM423d = m423d();
        if (interfaceC0248aM423d == this) {
            throw new C0186a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((C0225i) interfaceC0248aM423d).m424e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0225i) {
            C0225i c0225i = (C0225i) obj;
            return m412b().equals(c0225i.m412b()) && this.f557d.equals(c0225i.f557d) && this.f558e.equals(c0225i.f558e) && AbstractC0223g.m414a(this.f555b, c0225i.f555b);
        }
        if (obj instanceof C0225i) {
            return obj.equals(m423d());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f558e.hashCode() + AbstractC0174d.m347c(this.f557d, m412b().hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        InterfaceC0248a interfaceC0248aM423d = m423d();
        return interfaceC0248aM423d != this ? interfaceC0248aM423d.toString() : AbstractC0174d.m356l(new StringBuilder("property "), this.f557d, " (Kotlin reflection is not available)");
    }
}
