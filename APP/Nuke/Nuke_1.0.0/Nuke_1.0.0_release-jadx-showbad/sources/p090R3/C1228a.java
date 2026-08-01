package p090R3;

import p117X2.AbstractC1665j;
import p237s4.AbstractC3202a;
import p245u0.C3309f;

/* JADX INFO: renamed from: R3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1228a {

    /* JADX INFO: renamed from: a */
    public final int f4095a;

    /* JADX INFO: renamed from: b */
    public final C3309f f4096b;

    /* JADX INFO: renamed from: c */
    public final String f4097c;

    /* JADX INFO: renamed from: d */
    public final String f4098d;

    /* JADX INFO: renamed from: e */
    public final boolean f4099e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1228a(int i5, C3309f c3309f, String str, String str2, boolean z5) {
        this.f4095a = i5;
        this.f4096b = c3309f;
        this.f4097c = str;
        this.f4098d = str2;
        this.f4099e = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1228a)) {
            return false;
        }
        C1228a c1228a = (C1228a) obj;
        return this.f4095a == c1228a.f4095a && AbstractC1665j.m2981a(this.f4096b, c1228a.f4096b) && AbstractC1665j.m2981a(this.f4097c, c1228a.f4097c) && AbstractC1665j.m2981a(this.f4098d, c1228a.f4098d) && this.f4099e == c1228a.f4099e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f4096b.hashCode() + (Integer.hashCode(this.f4095a) * 31)) * 31;
        String str = this.f4097c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f4098d;
        return Boolean.hashCode(this.f4099e) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsPreference(titleRes=");
        sb.append(this.f4095a);
        sb.append(", icon=");
        sb.append(this.f4096b);
        sb.append(", route=");
        AbstractC3202a.m5468c(sb, this.f4097c, ", badge=", this.f4098d, ", badgeWarning=");
        sb.append(this.f4099e);
        sb.append(")");
        return sb.toString();
    }
}
