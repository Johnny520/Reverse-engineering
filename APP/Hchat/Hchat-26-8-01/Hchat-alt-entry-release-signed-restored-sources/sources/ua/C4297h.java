package ua;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: ua.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4297h {

    /* JADX INFO: renamed from: a */
    public final String f14288a;

    /* JADX INFO: renamed from: b */
    public final String f14289b;

    /* JADX INFO: renamed from: c */
    public final String f14290c;

    /* JADX INFO: renamed from: d */
    public final boolean f14291d;

    /* JADX INFO: renamed from: e */
    public final String f14292e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4297h(String str, String str2, String str3, String str4, boolean z9) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f14288a = str;
        this.f14289b = str2;
        this.f14290c = str3;
        this.f14291d = z9;
        this.f14292e = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C4297h m8632a(C4297h c4297h, String str, String str2, String str3, boolean z9, String str4, int i9) {
        if ((i9 & 1) != 0) {
            str = c4297h.f14288a;
        }
        String str5 = str;
        if ((i9 & 2) != 0) {
            str2 = c4297h.f14289b;
        }
        String str6 = str2;
        if ((i9 & 4) != 0) {
            str3 = c4297h.f14290c;
        }
        String str7 = str3;
        if ((i9 & 8) != 0) {
            z9 = c4297h.f14291d;
        }
        boolean z10 = z9;
        if ((i9 & 16) != 0) {
            str4 = c4297h.f14292e;
        }
        String str8 = str4;
        c4297h.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        return new C4297h(str5, str6, str7, str8, z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4297h)) {
            return false;
        }
        C4297h c4297h = (C4297h) obj;
        return AbstractC1416l.m3825a(this.f14288a, c4297h.f14288a) && AbstractC1416l.m3825a(this.f14289b, c4297h.f14289b) && AbstractC1416l.m3825a(this.f14290c, c4297h.f14290c) && this.f14291d == c4297h.f14291d && AbstractC1416l.m3825a(this.f14292e, c4297h.f14292e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f14292e.hashCode() + AbstractC0921a.m2245h(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f14288a.hashCode() * 31, 31, this.f14289b), 31, this.f14290c), 31, this.f14291d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("TransferRuleBinding(id=", this.f14288a, ", targetId=", this.f14289b, ", label=");
        sbM1027p.append(this.f14290c);
        sbM1027p.append(", enabled=");
        sbM1027p.append(this.f14291d);
        sbM1027p.append(", templateId=");
        return AbstractC0921a.m2255r(sbM1027p, this.f14292e, ")");
    }
}
