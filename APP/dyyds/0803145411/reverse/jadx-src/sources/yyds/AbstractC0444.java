package yyds;

/* JADX INFO: renamed from: yyds.ᛲᲀᲇᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0444 extends AbstractC0227 implements InterfaceC0890, InterfaceC2418, InterfaceC0557 {

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final int f2265;

    public AbstractC0444(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f2265 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    public final boolean equals(Object obj) {
        ?? r2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0444) {
            AbstractC0444 abstractC0444 = (AbstractC0444) obj;
            return this.f1247.equals(abstractC0444.f1247) && this.f1245.equals(abstractC0444.f1245) && AbstractC1544.m3188(this.f1248, abstractC0444.f1248) && m883().equals(abstractC0444.m883());
        }
        if (!(obj instanceof AbstractC0444)) {
            return false;
        }
        InterfaceC2418 interfaceC2418 = this.f1246;
        if (interfaceC2418 == null) {
            mo880();
            this.f1246 = this;
            this = this;
        } else {
            r2 = interfaceC2418;
        }
        return obj.equals(r2);
    }

    public final int hashCode() {
        m883();
        return this.f1245.hashCode() + AbstractC0897.m1997(this.f1247, m883().hashCode() * 31, 31);
    }

    public final String toString() {
        InterfaceC2418 interfaceC2418 = this.f1246;
        if (interfaceC2418 == null) {
            mo880();
            this.f1246 = this;
            interfaceC2418 = this;
        }
        if (interfaceC2418 != this) {
            return interfaceC2418.toString();
        }
        String str = this.f1247;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : AbstractC2104.m4014("function ", str, " (Kotlin reflection is not available)");
    }

    @Override // yyds.AbstractC0227
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final InterfaceC2418 mo880() {
        AbstractC1700.f8634.getClass();
        return this;
    }

    @Override // yyds.InterfaceC0890
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final int mo483() {
        return this.f2265;
    }

    public AbstractC0444(int i, Class cls, String str, String str2, int i2) {
        this(i, i2, cls, C1502.f7081, str, str2);
    }
}
