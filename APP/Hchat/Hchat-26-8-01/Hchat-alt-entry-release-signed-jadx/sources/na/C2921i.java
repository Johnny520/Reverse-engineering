package na;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: na.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2921i {

    /* JADX INFO: renamed from: a */
    public final String f9493a;

    /* JADX INFO: renamed from: b */
    public final String f9494b;

    /* JADX INFO: renamed from: c */
    public final String f9495c;

    /* JADX INFO: renamed from: d */
    public final boolean f9496d;

    /* JADX INFO: renamed from: e */
    public final String f9497e;

    /* JADX INFO: renamed from: f */
    public final boolean f9498f;

    /* JADX INFO: renamed from: g */
    public final C2922j f9499g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2921i(String str, String str2, String str3, boolean z9, String str4, boolean z10, C2922j c2922j) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f9493a = str;
        this.f9494b = str2;
        this.f9495c = str3;
        this.f9496d = z9;
        this.f9497e = str4;
        this.f9498f = z10;
        this.f9499g = c2922j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C2921i m6338a(C2921i c2921i, String str, String str2, String str3, boolean z9, String str4, int i9) {
        if ((i9 & 1) != 0) {
            str = c2921i.f9493a;
        }
        String str5 = str;
        if ((i9 & 2) != 0) {
            str2 = c2921i.f9494b;
        }
        String str6 = str2;
        if ((i9 & 4) != 0) {
            str3 = c2921i.f9495c;
        }
        String str7 = str3;
        if ((i9 & 8) != 0) {
            z9 = c2921i.f9496d;
        }
        boolean z10 = z9;
        if ((i9 & 16) != 0) {
            str4 = c2921i.f9497e;
        }
        String str8 = str4;
        boolean z11 = (i9 & 32) != 0 ? c2921i.f9498f : false;
        C2922j c2922j = (i9 & 64) != 0 ? c2921i.f9499g : null;
        c2921i.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        return new C2921i(str5, str6, str7, z10, str8, z11, c2922j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2921i)) {
            return false;
        }
        C2921i c2921i = (C2921i) obj;
        return AbstractC1416l.m3825a(this.f9493a, c2921i.f9493a) && AbstractC1416l.m3825a(this.f9494b, c2921i.f9494b) && AbstractC1416l.m3825a(this.f9495c, c2921i.f9495c) && this.f9496d == c2921i.f9496d && AbstractC1416l.m3825a(this.f9497e, c2921i.f9497e) && this.f9498f == c2921i.f9498f && AbstractC1416l.m3825a(this.f9499g, c2921i.f9499g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2245h = AbstractC0921a.m2245h(AbstractC0921a.m2244g(AbstractC0921a.m2245h(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f9493a.hashCode() * 31, 31, this.f9494b), 31, this.f9495c), 31, this.f9496d), 31, this.f9497e), 31, this.f9498f);
        C2922j c2922j = this.f9499g;
        return iM2245h + (c2922j == null ? 0 : c2922j.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("RedPacketRuleBinding(id=", this.f9493a, ", targetId=", this.f9494b, ", label=");
        sbM1027p.append(this.f9495c);
        sbM1027p.append(", enabled=");
        sbM1027p.append(this.f9496d);
        sbM1027p.append(", templateId=");
        sbM1027p.append(this.f9497e);
        sbM1027p.append(", customRules=");
        sbM1027p.append(this.f9498f);
        sbM1027p.append(", overrideRule=");
        sbM1027p.append(this.f9499g);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
