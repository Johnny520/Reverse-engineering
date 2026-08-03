package p000;

/* JADX INFO: renamed from: Eu */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0209Eu extends AbstractC0222F6 implements InterfaceC0674Pm {

    /* JADX INFO: renamed from: g */
    public final boolean f615g;

    public AbstractC0209Eu(int i, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f615g = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0209Eu) {
            AbstractC0209Eu abstractC0209Eu = (AbstractC0209Eu) obj;
            return m437e().equals(abstractC0209Eu.m437e()) && this.f654d.equals(abstractC0209Eu.f654d) && this.f655e.equals(abstractC0209Eu.f655e) && AbstractC0585Nj.m1134a(this.f652b, abstractC0209Eu.f652b);
        }
        if (obj instanceof InterfaceC0674Pm) {
            return obj.equals(m402f());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC0459Km m402f() {
        if (this.f615g) {
            return this;
        }
        InterfaceC0459Km interfaceC0459Km = this.f651a;
        if (interfaceC0459Km != null) {
            return interfaceC0459Km;
        }
        InterfaceC0459Km interfaceC0459KmMo436c = mo436c();
        this.f651a = interfaceC0459KmMo436c;
        return interfaceC0459KmMo436c;
    }

    public final int hashCode() {
        return this.f655e.hashCode() + AbstractC2374ph.m4810g(this.f654d, m437e().hashCode() * 31, 31);
    }

    public final String toString() {
        InterfaceC0459Km interfaceC0459KmM402f = m402f();
        return interfaceC0459KmM402f != this ? interfaceC0459KmM402f.toString() : AbstractC0213Ey.m410h(new StringBuilder("property "), this.f654d, " (Kotlin reflection is not available)");
    }
}
