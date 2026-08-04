package yyds;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᛲᛷᲁᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0404 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int f2126;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f2127;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ArrayList f2128;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final Boolean f2129;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f2130;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final byte[] f2131;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f2132;

    public C0404(int i, ArrayList arrayList, int i2, int i3, int i4, byte[] bArr, Boolean bool) {
        AbstractC2328.m4341(-1728384607093614L);
        AbstractC2328.m4341(-1728418966831982L);
        this.f2127 = i;
        this.f2128 = arrayList;
        this.f2130 = i2;
        this.f2132 = i3;
        this.f2126 = i4;
        this.f2131 = bArr;
        this.f2129 = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0404)) {
            return false;
        }
        C0404 c0404 = (C0404) obj;
        return this.f2127 == c0404.f2127 && this.f2128.equals(c0404.f2128) && this.f2130 == c0404.f2130 && this.f2132 == c0404.f2132 && this.f2126 == c0404.f2126 && AbstractC1544.m3188(this.f2131, c0404.f2131) && AbstractC1544.m3188(this.f2129, c0404.f2129);
    }

    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f2131) + AbstractC2104.m4018(this.f2126, AbstractC2104.m4018(this.f2132, AbstractC2104.m4018(this.f2130, (this.f2128.hashCode() + (Integer.hashCode(this.f2127) * 31)) * 31, 31), 31), 31)) * 31;
        Boolean bool = this.f2129;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1728607945393006L));
        AbstractC2104.m4007(sb, this.f2127, -1728741089379182L);
        sb.append(this.f2128);
        sb.append(AbstractC2328.m4341(-1728788334019438L));
        AbstractC2104.m4007(sb, this.f2130, -1728826988725102L);
        AbstractC2104.m4007(sb, this.f2132, -1728869938398062L);
        AbstractC2104.m4007(sb, this.f2126, -1728942952842094L);
        sb.append(Arrays.toString(this.f2131));
        sb.append(AbstractC2328.m4341(-1729033147155310L));
        sb.append(this.f2129);
        sb.append(')');
        return sb.toString();
    }
}
