package yyds;

import java.lang.ref.WeakReference;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᛸᛵᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1783 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public boolean f8980;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public boolean f8981;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f8982;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2219 f8983;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f8984;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f8985;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public long f8986;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final WeakReference f8987;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f8988;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Set f8989;

    public C1783(C2219 c2219, String str, WeakReference weakReference) {
        AbstractC2328.m4341(-574120736228206L);
        AbstractC2328.m4341(-574185160737646L);
        AbstractC2328.m4341(-574215225508718L);
        AbstractC2328.m4341(-574258175181678L);
        this.f8983 = c2219;
        this.f8984 = str;
        this.f8987 = weakReference;
        this.f8989 = C1422.f6715;
        this.f8982 = false;
        this.f8988 = 3;
        this.f8985 = false;
        this.f8980 = false;
        this.f8981 = false;
        this.f8986 = 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1783)) {
            return false;
        }
        C1783 c1783 = (C1783) obj;
        return this.f8983.equals(c1783.f8983) && this.f8984.equals(c1783.f8984) && this.f8987.equals(c1783.f8987) && this.f8989.equals(c1783.f8989) && this.f8982 == c1783.f8982 && this.f8988 == c1783.f8988 && this.f8985 == c1783.f8985 && this.f8980 == c1783.f8980 && this.f8981 == c1783.f8981 && this.f8986 == c1783.f8986;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8986) + AbstractC2104.m4021(AbstractC2104.m4021(AbstractC2104.m4021(AbstractC2104.m4018(this.f8988, AbstractC2104.m4021((this.f8989.hashCode() + ((this.f8987.hashCode() + AbstractC0897.m1997(this.f8984, this.f8983.hashCode() * 31, 31)) * 31)) * 31, 31, this.f8982), 31), 31, this.f8985), 31, this.f8980), 31, this.f8981);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-574524463154030L));
        sb.append(this.f8983);
        sb.append(AbstractC2328.m4341(-574657607140206L));
        AbstractC0897.m2002(sb, this.f8984, -574700556813166L);
        sb.append(this.f8987);
        sb.append(AbstractC2328.m4341(-574756391388014L));
        sb.append(this.f8989);
        sb.append(AbstractC2328.m4341(-574816520930158L));
        AbstractC2104.m4017(sb, this.f8982, -574872355505006L);
        AbstractC2104.m4007(sb, this.f8988, -574928190079854L);
        AbstractC2104.m4017(sb, this.f8985, -574971139752814L);
        AbstractC2104.m4017(sb, this.f8980, -575022679360366L);
        AbstractC2104.m4017(sb, this.f8981, -575078513935214L);
        sb.append(this.f8986);
        sb.append(')');
        return sb.toString();
    }
}
