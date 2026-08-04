package yyds;

/* JADX INFO: renamed from: yyds.ᛱᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0175 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f1000;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f1001;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2683 f1002;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final ViewOnLayoutChangeListenerC2008 f1003;

    public C0175(String str, String str2, C2683 c2683, ViewOnLayoutChangeListenerC2008 viewOnLayoutChangeListenerC2008) {
        AbstractC2328.m4341(-585665608319854L);
        AbstractC2328.m4341(-585704263025518L);
        AbstractC2328.m4341(-585738622763886L);
        AbstractC2328.m4341(-585777277469550L);
        this.f1000 = str;
        this.f1001 = str2;
        this.f1002 = c2683;
        this.f1003 = viewOnLayoutChangeListenerC2008;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0175) {
            C0175 c0175 = (C0175) obj;
            return this.f1000.equals(c0175.f1000) && this.f1001.equals(c0175.f1001) && this.f1002 == c0175.f1002 && this.f1003 == c0175.f1003;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1003.hashCode() + ((this.f1002.hashCode() + AbstractC0897.m1997(this.f1001, this.f1000.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-586090810082158L));
        AbstractC0897.m2002(sb, this.f1000, -586228249035630L);
        AbstractC0897.m2002(sb, this.f1001, -586275493675886L);
        sb.append(this.f1002);
        sb.append(AbstractC2328.m4341(-586327033283438L));
        sb.append(this.f1003);
        sb.append(')');
        return sb.toString();
    }
}
