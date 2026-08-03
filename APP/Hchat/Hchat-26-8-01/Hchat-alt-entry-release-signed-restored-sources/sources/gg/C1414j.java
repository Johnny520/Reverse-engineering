package gg;

import mg.InterfaceC2839a;
import p068eh.AbstractC0921a;
import p276sf.InterfaceC3955b;

/* JADX INFO: renamed from: gg.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C1414j extends AbstractC1408d implements InterfaceC1413i, InterfaceC2839a, InterfaceC3955b {

    /* JADX INFO: renamed from: m */
    public final int f4730m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1414j(int i9, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f4730m = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // gg.AbstractC1408d
    /* JADX INFO: renamed from: e */
    public final InterfaceC2839a mo3816e() {
        AbstractC1426v.f4739a.getClass();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1414j) {
            C1414j c1414j = (C1414j) obj;
            return this.f4725j.equals(c1414j.f4725j) && this.f4726k.equals(c1414j.f4726k) && AbstractC1416l.m3825a(this.f4723h, c1414j.f4723h) && m3817f().equals(c1414j.m3817f());
        }
        if (!(obj instanceof C1414j)) {
            return false;
        }
        InterfaceC2839a interfaceC2839a = this.f4722g;
        if (interfaceC2839a == null) {
            mo3816e();
            this.f4722g = this;
            interfaceC2839a = this;
        }
        return obj.equals(interfaceC2839a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // gg.InterfaceC1413i
    public final int getArity() {
        return this.f4730m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        m3817f();
        return this.f4726k.hashCode() + AbstractC0921a.m2244g(m3817f().hashCode() * 31, 31, this.f4725j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        InterfaceC2839a interfaceC2839a = this.f4722g;
        if (interfaceC2839a == null) {
            mo3816e();
            this.f4722g = this;
            interfaceC2839a = this;
        }
        if (interfaceC2839a != this) {
            return interfaceC2839a.toString();
        }
        String str = this.f4725j;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : AbstractC0921a.m2251n("function ", str, " (Kotlin reflection is not available)");
    }

    public C1414j(int i9, Class cls, String str, String str2, int i10) {
        this(i9, C1407c.f4721g, cls, str, str2, i10, 0);
    }
}
