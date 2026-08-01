package p027N0;

import p022L.AbstractC0174d;
import p036S0.InterfaceC0248a;

/* JADX INFO: renamed from: N0.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0222f extends AbstractC0218b implements InterfaceC0248a {

    /* JADX INFO: renamed from: g */
    public final int f562g;

    /* JADX INFO: renamed from: h */
    public final int f563h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0222f(Class cls, String str, String str2, int i2) {
        this(C0217a.f553a, cls, str, str2, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p027N0.AbstractC0218b
    /* JADX INFO: renamed from: a */
    public final InterfaceC0248a mo411a() {
        AbstractC0229m.f569a.getClass();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0222f) {
            AbstractC0222f abstractC0222f = (AbstractC0222f) obj;
            return this.f557d.equals(abstractC0222f.f557d) && this.f558e.equals(abstractC0222f.f558e) && this.f563h == abstractC0222f.f563h && this.f562g == abstractC0222f.f562g && AbstractC0223g.m414a(this.f555b, abstractC0222f.f555b) && m412b().equals(abstractC0222f.m412b());
        }
        if (!(obj instanceof AbstractC0222f)) {
            return false;
        }
        InterfaceC0248a interfaceC0248a = this.f554a;
        if (interfaceC0248a == null) {
            mo411a();
            this.f554a = this;
            interfaceC0248a = this;
        }
        return obj.equals(interfaceC0248a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        m412b();
        return this.f558e.hashCode() + AbstractC0174d.m347c(this.f557d, m412b().hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        InterfaceC0248a interfaceC0248a = this.f554a;
        if (interfaceC0248a == null) {
            mo411a();
            this.f554a = this;
            interfaceC0248a = this;
        }
        if (interfaceC0248a != this) {
            return interfaceC0248a.toString();
        }
        String str = this.f557d;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : AbstractC0174d.m353i("function ", str, " (Kotlin reflection is not available)");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC0222f(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f562g = 1;
        this.f563h = 0;
    }
}
