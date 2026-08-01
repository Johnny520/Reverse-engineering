package p117X2;

import p011B4.AbstractC0231b;
import p137b3.InterfaceC1853a;
import p137b3.InterfaceC1855c;

/* JADX INFO: renamed from: X2.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1670o extends AbstractC1658c implements InterfaceC1855c {

    /* JADX INFO: renamed from: j */
    public final boolean f5704j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1670o(Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, (i5 & 1) == 1);
        this.f5704j = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final InterfaceC1853a m2993e() {
        if (this.f5704j) {
            return this;
        }
        InterfaceC1853a interfaceC1853a = this.f5692d;
        if (interfaceC1853a != null) {
            return interfaceC1853a;
        }
        InterfaceC1853a interfaceC1853aMo2975c = mo2975c();
        this.f5692d = interfaceC1853aMo2975c;
        return interfaceC1853aMo2975c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1670o) {
            AbstractC1670o abstractC1670o = (AbstractC1670o) obj;
            return m2976d().equals(abstractC1670o.m2976d()) && this.f5695g.equals(abstractC1670o.f5695g) && this.f5696h.equals(abstractC1670o.f5696h) && AbstractC1665j.m2981a(this.f5693e, abstractC1670o.f5693e);
        }
        if (obj instanceof InterfaceC1855c) {
            return obj.equals(m2993e());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5696h.hashCode() + AbstractC0231b.m394e(m2976d().hashCode() * 31, 31, this.f5695g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        InterfaceC1853a interfaceC1853aM2993e = m2993e();
        return interfaceC1853aM2993e != this ? interfaceC1853aM2993e.toString() : AbstractC0231b.m403n(new StringBuilder("property "), this.f5695g, " (Kotlin reflection is not available)");
    }
}
