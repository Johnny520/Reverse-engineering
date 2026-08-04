package yyds;

/* JADX INFO: renamed from: yyds.ᲀᛴᛷᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1991 extends AbstractC0227 implements InterfaceC1989 {

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final boolean f9998;

    public AbstractC1991(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f9998 = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1991) {
            AbstractC1991 abstractC1991 = (AbstractC1991) obj;
            return m883().equals(abstractC1991.m883()) && this.f1247.equals(abstractC1991.f1247) && this.f1245.equals(abstractC1991.f1245) && AbstractC1544.m3188(this.f1248, abstractC1991.f1248);
        }
        if (obj instanceof InterfaceC1989) {
            return obj.equals(m3875());
        }
        return false;
    }

    public final int hashCode() {
        return this.f1245.hashCode() + AbstractC0897.m1997(this.f1247, m883().hashCode() * 31, 31);
    }

    public final String toString() {
        InterfaceC2418 interfaceC2418M3875 = m3875();
        return interfaceC2418M3875 != this ? interfaceC2418M3875.toString() : AbstractC2104.m4015(new StringBuilder("property "), this.f1247, " (Kotlin reflection is not available)");
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final InterfaceC2418 m3875() {
        if (this.f9998) {
            return this;
        }
        InterfaceC2418 interfaceC2418 = this.f1246;
        if (interfaceC2418 != null) {
            return interfaceC2418;
        }
        InterfaceC2418 interfaceC2418Mo880 = mo880();
        this.f1246 = interfaceC2418Mo880;
        return interfaceC2418Mo880;
    }
}
