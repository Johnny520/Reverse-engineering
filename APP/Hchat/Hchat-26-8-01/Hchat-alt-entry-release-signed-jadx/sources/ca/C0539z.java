package ca;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: ca.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0539z {

    /* JADX INFO: renamed from: a */
    public final int f1702a;

    /* JADX INFO: renamed from: b */
    public final String f1703b;

    /* JADX INFO: renamed from: c */
    public final String f1704c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0539z(int i9, String str, String str2) {
        str.getClass();
        this.f1702a = i9;
        this.f1703b = str;
        this.f1704c = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0539z)) {
            return false;
        }
        C0539z c0539z = (C0539z) obj;
        return this.f1702a == c0539z.f1702a && AbstractC1416l.m3825a(this.f1703b, c0539z.f1703b) && AbstractC1416l.m3825a(this.f1704c, c0539z.f1704c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2244g = AbstractC0921a.m2244g(Integer.hashCode(this.f1702a) * 31, 31, this.f1703b);
        String str = this.f1704c;
        return iM2244g + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FavoriteShareData(type=");
        sb2.append(this.f1702a);
        sb2.append(", text=");
        sb2.append(this.f1703b);
        sb2.append(", path=");
        return AbstractC0921a.m2255r(sb2, this.f1704c, ")");
    }
}
