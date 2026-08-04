package yyds;

import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᛲᲇᛵᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0471 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f2364;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f2365;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final byte[] f2366;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f2367;

    public C0471(int i, int i2, int i3, byte[] bArr) {
        AbstractC2328.m4341(-1737137750442862L);
        this.f2364 = i;
        this.f2365 = i2;
        this.f2366 = bArr;
        this.f2367 = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0471)) {
            return false;
        }
        C0471 c0471 = (C0471) obj;
        return this.f2364 == c0471.f2364 && this.f2365 == c0471.f2365 && this.f2366.equals(c0471.f2366) && this.f2367 == c0471.f2367;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2367) + ((Arrays.hashCode(this.f2366) + AbstractC2104.m4018(this.f2365, Integer.hashCode(this.f2364) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1737206469919598L));
        AbstractC2104.m4007(sb, this.f2364, -1737283779330926L);
        AbstractC2104.m4007(sb, this.f2365, -1737326729003886L);
        sb.append(Arrays.toString(this.f2366));
        sb.append(AbstractC2328.m4341(-1737373973644142L));
        return AbstractC0897.m1999(sb, this.f2367, ')');
    }
}
