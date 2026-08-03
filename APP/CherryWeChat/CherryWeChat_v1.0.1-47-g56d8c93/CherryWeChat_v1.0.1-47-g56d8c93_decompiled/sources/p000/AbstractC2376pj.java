package p000;

import kotlin.Function;

/* JADX INFO: renamed from: pj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2376pj extends AbstractC0222F6 implements InterfaceC2325oj, InterfaceC0459Km, Function {

    /* JADX INFO: renamed from: g */
    public final int f8360g;

    /* JADX INFO: renamed from: h */
    public final int f8361h;

    public AbstractC2376pj(int i, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, false);
        this.f8360g = i;
        this.f8361h = 0;
    }

    @Override // p000.InterfaceC2325oj
    /* JADX INFO: renamed from: b */
    public final int mo122b() {
        return this.f8360g;
    }

    @Override // p000.AbstractC0222F6
    /* JADX INFO: renamed from: c */
    public final InterfaceC0459Km mo436c() {
        AbstractC0425Jv.f1405a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2376pj) {
            AbstractC2376pj abstractC2376pj = (AbstractC2376pj) obj;
            return this.f654d.equals(abstractC2376pj.f654d) && this.f655e.equals(abstractC2376pj.f655e) && this.f8361h == abstractC2376pj.f8361h && this.f8360g == abstractC2376pj.f8360g && AbstractC0585Nj.m1134a(this.f652b, abstractC2376pj.f652b) && m437e().equals(abstractC2376pj.m437e());
        }
        if (!(obj instanceof AbstractC2376pj)) {
            return false;
        }
        InterfaceC0459Km interfaceC0459Km = this.f651a;
        if (interfaceC0459Km == null) {
            mo436c();
            this.f651a = this;
            interfaceC0459Km = this;
        }
        return obj.equals(interfaceC0459Km);
    }

    public final int hashCode() {
        m437e();
        return this.f655e.hashCode() + AbstractC2374ph.m4810g(this.f654d, m437e().hashCode() * 31, 31);
    }

    public final String toString() {
        InterfaceC0459Km interfaceC0459Km = this.f651a;
        if (interfaceC0459Km == null) {
            mo436c();
            this.f651a = this;
            interfaceC0459Km = this;
        }
        if (interfaceC0459Km != this) {
            return interfaceC0459Km.toString();
        }
        String str = this.f654d;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : AbstractC2374ph.m4814k("function ", str, " (Kotlin reflection is not available)");
    }
}
