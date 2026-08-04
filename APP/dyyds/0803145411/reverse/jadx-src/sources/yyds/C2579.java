package yyds;

import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᲈᛱᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2579 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int f12712;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean f12713;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f12714;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final boolean f12715;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f12716;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final ArrayList f12717;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f12718;

    public C2579(boolean z, int i, int i2, int i3, int i4, ArrayList arrayList, boolean z2) {
        AbstractC2328.m4341(-1725545633710958L);
        this.f12713 = z;
        this.f12714 = i;
        this.f12716 = i2;
        this.f12718 = i3;
        this.f12712 = i4;
        this.f12717 = arrayList;
        this.f12715 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2579)) {
            return false;
        }
        C2579 c2579 = (C2579) obj;
        return this.f12713 == c2579.f12713 && this.f12714 == c2579.f12714 && this.f12716 == c2579.f12716 && this.f12718 == c2579.f12718 && this.f12712 == c2579.f12712 && this.f12717.equals(c2579.f12717) && this.f12715 == c2579.f12715;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12715) + ((this.f12717.hashCode() + AbstractC2104.m4018(this.f12712, AbstractC2104.m4018(this.f12718, AbstractC2104.m4018(this.f12716, AbstractC2104.m4018(this.f12714, Boolean.hashCode(this.f12713) * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1725605763253102L));
        AbstractC2104.m4017(sb, this.f12713, -1725695957566318L);
        AbstractC2104.m4007(sb, this.f12714, -1725760382075758L);
        AbstractC2104.m4007(sb, this.f12716, -1725829101552494L);
        AbstractC2104.m4007(sb, this.f12718, -1725884936127342L);
        AbstractC2104.m4007(sb, this.f12712, -1725966540505966L);
        sb.append(this.f12717);
        sb.append(AbstractC2328.m4341(-1726009490178926L));
        return AbstractC0897.m1986(sb, this.f12715, ')');
    }
}
