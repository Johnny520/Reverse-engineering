package p001;

import java.util.NoSuchElementException;
import p001.AbstractC0255i8;

/* JADX INFO: renamed from: ۟.wb */
/* JADX INFO: loaded from: classes.dex */
public final class C0446wb {

    /* JADX INFO: renamed from: ۥ */
    public final boolean f1180;

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean f1181;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final String f1857;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final int f1858;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final String f1859;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final String f1860;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final String f1861;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final String f1862;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final int f1863;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final Boolean f1864;

    public C0446wb(boolean z, boolean z2, String str, int i, String str2, String str3, String str4, String str5, int i2, Boolean bool) {
        C0341oa.m915(new byte[]{-93, 45}, new byte[]{-43, 67, -35, 95, -25, -97});
        C0341oa.m915(new byte[]{-30, -29}, new byte[]{-122, -106, -57, -103, 39, -117});
        C0341oa.m915(new byte[]{-100, 56}, new byte[]{-8, 76, -42, -33, 40, -7});
        C0341oa.m915(new byte[]{73, 0, -36, -96, -18}, new byte[]{61, 105, -88, -52, -117, 98});
        C0341oa.m915(new byte[]{25, 99, -46, 2, 92}, new byte[]{112, 13, -90, 112, 51, 89});
        this.f1180 = z;
        this.f1181 = z2;
        this.f1857 = str;
        this.f1858 = i;
        this.f1859 = str2;
        this.f1860 = str3;
        this.f1861 = str4;
        this.f1862 = str5;
        this.f1863 = i2;
        this.f1864 = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0446wb)) {
            return false;
        }
        C0446wb c0446wb = (C0446wb) obj;
        return this.f1180 == c0446wb.f1180 && this.f1181 == c0446wb.f1181 && C0237h4.m864(this.f1857, c0446wb.f1857) && this.f1858 == c0446wb.f1858 && C0237h4.m864(this.f1859, c0446wb.f1859) && C0237h4.m864(this.f1860, c0446wb.f1860) && C0237h4.m864(this.f1861, c0446wb.f1861) && C0237h4.m864(this.f1862, c0446wb.f1862) && this.f1863 == c0446wb.f1863 && C0237h4.m864(this.f1864, c0446wb.f1864);
    }

    public final int hashCode() {
        int iHashCode = (Integer.hashCode(this.f1863) + ((this.f1862.hashCode() + ((this.f1861.hashCode() + ((this.f1860.hashCode() + ((this.f1859.hashCode() + ((Integer.hashCode(this.f1858) + ((this.f1857.hashCode() + ((Boolean.hashCode(this.f1181) + (Boolean.hashCode(this.f1180) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Boolean bool = this.f1864;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return super.toString();
    }

    /* JADX INFO: renamed from: ۥ */
    public final boolean m959(boolean z) {
        if (32 < this.f1858 && C0237h4.m864(this.f1864, Boolean.TRUE)) {
            C0223g4 c0223g4 = new C0223g4(0, 99);
            AbstractC0255i8.a aVar = AbstractC0255i8.f860;
            C0237h4.m1090("random", aVar);
            try {
                if (C0272jb.m876(aVar, c0223g4) < 50) {
                    return z;
                }
            } catch (IllegalArgumentException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }
        return false;
    }
}
