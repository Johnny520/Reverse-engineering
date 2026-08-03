package gg;

import mg.InterfaceC2839a;
import mg.InterfaceC2842d;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: gg.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1420p extends AbstractC1408d implements InterfaceC2842d {

    /* JADX INFO: renamed from: m */
    public final boolean f4733m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1420p(Object obj, Class cls, String str, String str2, int i9) {
        super(obj, cls, str, str2, (i9 & 1) == 1);
        this.f4733m = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1420p) {
            AbstractC1420p abstractC1420p = (AbstractC1420p) obj;
            return m3817f().equals(abstractC1420p.m3817f()) && this.f4725j.equals(abstractC1420p.f4725j) && this.f4726k.equals(abstractC1420p.f4726k) && AbstractC1416l.m3825a(this.f4723h, abstractC1420p.f4723h);
        }
        if (obj instanceof InterfaceC2842d) {
            return obj.equals(m3833g());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final InterfaceC2839a m3833g() {
        if (this.f4733m) {
            return this;
        }
        InterfaceC2839a interfaceC2839a = this.f4722g;
        if (interfaceC2839a != null) {
            return interfaceC2839a;
        }
        InterfaceC2839a interfaceC2839aMo3816e = mo3816e();
        this.f4722g = interfaceC2839aMo3816e;
        return interfaceC2839aMo3816e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4726k.hashCode() + AbstractC0921a.m2244g(m3817f().hashCode() * 31, 31, this.f4725j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        InterfaceC2839a interfaceC2839aM3833g = m3833g();
        return interfaceC2839aM3833g != this ? interfaceC2839aM3833g.toString() : AbstractC0921a.m2255r(new StringBuilder("property "), this.f4725j, " (Kotlin reflection is not available)");
    }
}
