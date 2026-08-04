package yyds;

import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᲇᛴᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2443 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Boolean f12020;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f12021;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f12022;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f12023;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final byte[] f12024;

    public C2443(int i, int i2, int i3, byte[] bArr, Boolean bool) {
        AbstractC2328.m4341(-1727577153241966L);
        this.f12021 = i;
        this.f12022 = i2;
        this.f12023 = i3;
        this.f12024 = bArr;
        this.f12020 = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2443)) {
            return false;
        }
        C2443 c2443 = (C2443) obj;
        return this.f12021 == c2443.f12021 && this.f12022 == c2443.f12022 && this.f12023 == c2443.f12023 && AbstractC1544.m3188(this.f12024, c2443.f12024) && AbstractC1544.m3188(this.f12020, c2443.f12020);
    }

    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f12024) + AbstractC2104.m4018(this.f12023, AbstractC2104.m4018(this.f12022, Integer.hashCode(this.f12021) * 31, 31), 31)) * 31;
        Boolean bool = this.f12020;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1727731772064622L));
        AbstractC2104.m4007(sb, this.f12021, -1727847736181614L);
        AbstractC2104.m4007(sb, this.f12022, -1727890685854574L);
        AbstractC2104.m4007(sb, this.f12023, -1727963700298606L);
        sb.append(Arrays.toString(this.f12024));
        sb.append(AbstractC2328.m4341(-1728053894611822L));
        sb.append(this.f12020);
        sb.append(')');
        return sb.toString();
    }
}
