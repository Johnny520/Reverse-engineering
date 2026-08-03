package p315v8;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.util.Set;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: v8.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4521a {

    /* JADX INFO: renamed from: a */
    public final String f14897a;

    /* JADX INFO: renamed from: b */
    public final String f14898b;

    /* JADX INFO: renamed from: c */
    public final boolean f14899c;

    /* JADX INFO: renamed from: d */
    public final boolean f14900d;

    /* JADX INFO: renamed from: e */
    public final Set f14901e;

    /* JADX INFO: renamed from: f */
    public final Set f14902f;

    /* JADX INFO: renamed from: g */
    public final Set f14903g;

    /* JADX INFO: renamed from: h */
    public final Set f14904h;

    /* JADX INFO: renamed from: i */
    public final boolean f14905i;

    /* JADX INFO: renamed from: j */
    public final long f14906j;

    /* JADX INFO: renamed from: k */
    public final boolean f14907k;

    /* JADX INFO: renamed from: l */
    public final String f14908l;

    /* JADX INFO: renamed from: m */
    public final boolean f14909m;

    /* JADX INFO: renamed from: n */
    public final String f14910n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4521a(String str, String str2, boolean z9, boolean z10, Set set, Set set2, Set set3, Set set4, boolean z11, long j3, boolean z12, String str3, boolean z13, String str4) {
        set.getClass();
        set2.getClass();
        set3.getClass();
        set4.getClass();
        this.f14897a = str;
        this.f14898b = str2;
        this.f14899c = z9;
        this.f14900d = z10;
        this.f14901e = set;
        this.f14902f = set2;
        this.f14903g = set3;
        this.f14904h = set4;
        this.f14905i = z11;
        this.f14906j = j3;
        this.f14907k = z12;
        this.f14908l = str3;
        this.f14909m = z13;
        this.f14910n = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C4521a m8946a(C4521a c4521a, String str, boolean z9, boolean z10, Set set, Set set2, Set set3, Set set4, boolean z11, long j3, boolean z12, String str2, boolean z13, String str3, int i9) {
        String str4 = c4521a.f14897a;
        String str5 = (i9 & 2) != 0 ? c4521a.f14898b : str;
        boolean z14 = (i9 & 4) != 0 ? c4521a.f14899c : z9;
        boolean z15 = (i9 & 8) != 0 ? c4521a.f14900d : z10;
        Set set5 = (i9 & 16) != 0 ? c4521a.f14901e : set;
        Set set6 = (i9 & 32) != 0 ? c4521a.f14902f : set2;
        Set set7 = (i9 & 64) != 0 ? c4521a.f14903g : set3;
        Set set8 = (i9 & 128) != 0 ? c4521a.f14904h : set4;
        boolean z16 = (i9 & Opcodes.ACC_NATIVE) != 0 ? c4521a.f14905i : z11;
        long j4 = (i9 & Opcodes.ACC_INTERFACE) != 0 ? c4521a.f14906j : j3;
        boolean z17 = (i9 & 1024) != 0 ? c4521a.f14907k : z12;
        String str6 = (i9 & Opcodes.ACC_STRICT) != 0 ? c4521a.f14908l : str2;
        boolean z18 = (i9 & 4096) != 0 ? c4521a.f14909m : z13;
        String str7 = (i9 & 8192) != 0 ? c4521a.f14910n : str3;
        c4521a.getClass();
        str5.getClass();
        set5.getClass();
        set6.getClass();
        set7.getClass();
        set8.getClass();
        str6.getClass();
        str7.getClass();
        return new C4521a(str4, str5, z14, z15, set5, set6, set7, set8, z16, j4, z17, str6, z18, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4521a)) {
            return false;
        }
        C4521a c4521a = (C4521a) obj;
        return this.f14897a.equals(c4521a.f14897a) && this.f14898b.equals(c4521a.f14898b) && this.f14899c == c4521a.f14899c && this.f14900d == c4521a.f14900d && AbstractC1416l.m3825a(this.f14901e, c4521a.f14901e) && AbstractC1416l.m3825a(this.f14902f, c4521a.f14902f) && AbstractC1416l.m3825a(this.f14903g, c4521a.f14903g) && AbstractC1416l.m3825a(this.f14904h, c4521a.f14904h) && this.f14905i == c4521a.f14905i && this.f14906j == c4521a.f14906j && this.f14907k == c4521a.f14907k && this.f14908l.equals(c4521a.f14908l) && this.f14909m == c4521a.f14909m && this.f14910n.equals(c4521a.f14910n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f14910n.hashCode() + AbstractC0921a.m2245h(AbstractC0921a.m2244g(AbstractC0921a.m2245h(AbstractC0921a.m2243f(AbstractC0921a.m2245h((this.f14904h.hashCode() + ((this.f14903g.hashCode() + ((this.f14902f.hashCode() + ((this.f14901e.hashCode() + AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2244g(this.f14897a.hashCode() * 31, 31, this.f14898b), 31, this.f14899c), 31, this.f14900d)) * 31)) * 31)) * 31)) * 31, 31, this.f14905i), 31, this.f14906j), 31, this.f14907k), 31, this.f14908l), 31, this.f14909m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("AutoMessageForwardRule(id=", this.f14897a, ", name=", this.f14898b, ", enabled=");
        AbstractC3199a.m6851x(sbM1027p, this.f14899c, ", forwardOwnMessages=", this.f14900d, ", sourceIds=");
        sbM1027p.append(this.f14901e);
        sbM1027p.append(", sourceMemberIds=");
        sbM1027p.append(this.f14902f);
        sbM1027p.append(", targetIds=");
        sbM1027p.append(this.f14903g);
        sbM1027p.append(", messageKinds=");
        sbM1027p.append(this.f14904h);
        sbM1027p.append(", delayEnabled=");
        sbM1027p.append(this.f14905i);
        sbM1027p.append(", delaySeconds=");
        sbM1027p.append(this.f14906j);
        sbM1027p.append(", includeKeywordsEnabled=");
        sbM1027p.append(this.f14907k);
        sbM1027p.append(", includeKeywords=");
        sbM1027p.append(this.f14908l);
        sbM1027p.append(", excludeKeywordsEnabled=");
        sbM1027p.append(this.f14909m);
        sbM1027p.append(", excludeKeywords=");
        sbM1027p.append(this.f14910n);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
