package yyds;

import android.graphics.drawable.Drawable;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛱᛷᲁᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0178 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final boolean f1005;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final String f1006;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f1007;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f1008;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final List f1009;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f1010;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final Drawable f1011;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f1012;

    public C0178(String str, String str2, String str3, String str4, String str5, Drawable drawable, List list, boolean z) {
        AbstractC2328.m4341(-1442996915176302L);
        AbstractC2328.m4341(-1443022684980078L);
        AbstractC2328.m4341(-1443074224587630L);
        AbstractC2328.m4341(-1443125764195182L);
        AbstractC2328.m4341(-1443177303802734L);
        AbstractC2328.m4341(-1443254613214062L);
        AbstractC2328.m4341(-1443276088050542L);
        this.f1007 = str;
        this.f1008 = str2;
        this.f1010 = str3;
        this.f1012 = str4;
        this.f1006 = str5;
        this.f1011 = drawable;
        this.f1009 = list;
        this.f1005 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0178)) {
            return false;
        }
        C0178 c0178 = (C0178) obj;
        return AbstractC1544.m3188(this.f1007, c0178.f1007) && this.f1008.equals(c0178.f1008) && this.f1010.equals(c0178.f1010) && this.f1012.equals(c0178.f1012) && this.f1006.equals(c0178.f1006) && this.f1011.equals(c0178.f1011) && this.f1009.equals(c0178.f1009) && this.f1005 == c0178.f1005;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1005) + ((this.f1009.hashCode() + ((this.f1011.hashCode() + AbstractC0897.m1997(this.f1006, AbstractC0897.m1997(this.f1012, AbstractC0897.m1997(this.f1010, AbstractC0897.m1997(this.f1008, this.f1007.hashCode() * 31, 31), 31), 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1443778599224174L));
        AbstractC0897.m2002(sb, this.f1007, -1443894563341166L);
        AbstractC0897.m2002(sb, this.f1008, -1443958987850606L);
        AbstractC0897.m2002(sb, this.f1010, -1444023412360046L);
        AbstractC0897.m2002(sb, this.f1012, -1444087836869486L);
        AbstractC0897.m2002(sb, this.f1006, -1444178031182702L);
        sb.append(this.f1011);
        sb.append(AbstractC2328.m4341(-1444212390921070L));
        sb.append(this.f1009);
        sb.append(AbstractC2328.m4341(-1444336944972654L));
        return AbstractC0897.m1986(sb, this.f1005, ')');
    }
}
