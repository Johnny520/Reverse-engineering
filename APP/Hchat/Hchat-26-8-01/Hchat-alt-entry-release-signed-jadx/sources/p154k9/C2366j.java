package p154k9;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: k9.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2366j {

    /* JADX INFO: renamed from: a */
    public final String f7772a;

    /* JADX INFO: renamed from: b */
    public final String f7773b;

    /* JADX INFO: renamed from: c */
    public final String f7774c;

    /* JADX INFO: renamed from: d */
    public final String f7775d;

    /* JADX INFO: renamed from: e */
    public final String f7776e;

    /* JADX INFO: renamed from: f */
    public final String f7777f;

    /* JADX INFO: renamed from: g */
    public final boolean f7778g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2366j(String str, String str2, String str3, String str4, String str5, String str6, boolean z9) {
        AbstractC2091b.m5170q(str, str2, str3, str4, str5);
        str6.getClass();
        this.f7772a = str;
        this.f7773b = str2;
        this.f7774c = str3;
        this.f7775d = str4;
        this.f7776e = str5;
        this.f7777f = str6;
        this.f7778g = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C2366j m5671a(C2366j c2366j, String str, String str2, String str3, String str4, String str5, boolean z9, int i9) {
        String str6 = str;
        String str7 = c2366j.f7772a;
        if ((i9 & 2) != 0) {
            str6 = c2366j.f7773b;
        }
        if ((i9 & 4) != 0) {
            str2 = c2366j.f7774c;
        }
        if ((i9 & 8) != 0) {
            str3 = c2366j.f7775d;
        }
        if ((i9 & 16) != 0) {
            str4 = c2366j.f7776e;
        }
        if ((i9 & 32) != 0) {
            str5 = c2366j.f7777f;
        }
        if ((i9 & 64) != 0) {
            z9 = c2366j.f7778g;
        }
        boolean z10 = z9;
        c2366j.getClass();
        str7.getClass();
        str6.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        String str8 = str5;
        String str9 = str4;
        String str10 = str3;
        return new C2366j(str7, str6, str2, str10, str9, str8, z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2366j)) {
            return false;
        }
        C2366j c2366j = (C2366j) obj;
        return AbstractC1416l.m3825a(this.f7772a, c2366j.f7772a) && AbstractC1416l.m3825a(this.f7773b, c2366j.f7773b) && AbstractC1416l.m3825a(this.f7774c, c2366j.f7774c) && AbstractC1416l.m3825a(this.f7775d, c2366j.f7775d) && AbstractC1416l.m3825a(this.f7776e, c2366j.f7776e) && AbstractC1416l.m3825a(this.f7777f, c2366j.f7777f) && this.f7778g == c2366j.f7778g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f7778g) + AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f7772a.hashCode() * 31, 31, this.f7773b), 31, this.f7774c), 31, this.f7775d), 31, this.f7776e), 31, this.f7777f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("FloatingShortcutItem(id=", this.f7772a, ", title=", this.f7773b, ", actionType=");
        AbstractC2091b.m5173t(sbM1027p, this.f7774c, ", target=", this.f7775d, ", iconPath=");
        AbstractC2091b.m5173t(sbM1027p, this.f7776e, ", darkIconPath=", this.f7777f, ", enabled=");
        return AbstractC3199a.m6840m(")", sbM1027p, this.f7778g);
    }
}
