package p010aa;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.util.Set;
import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: aa.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0034b {

    /* JADX INFO: renamed from: a */
    public final boolean f114a;

    /* JADX INFO: renamed from: b */
    public final String f115b;

    /* JADX INFO: renamed from: c */
    public final boolean f116c;

    /* JADX INFO: renamed from: d */
    public final boolean f117d;

    /* JADX INFO: renamed from: e */
    public final Set f118e;

    /* JADX INFO: renamed from: f */
    public final boolean f119f;

    /* JADX INFO: renamed from: g */
    public final boolean f120g;

    /* JADX INFO: renamed from: h */
    public final Set f121h;

    /* JADX INFO: renamed from: i */
    public final String f122i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0034b(boolean z9, String str, boolean z10, boolean z11, Set set, boolean z12, boolean z13, Set set2, String str2) {
        set.getClass();
        set2.getClass();
        this.f114a = z9;
        this.f115b = str;
        this.f116c = z10;
        this.f117d = z11;
        this.f118e = set;
        this.f119f = z12;
        this.f120g = z13;
        this.f121h = set2;
        this.f122i = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0034b m291a(C0034b c0034b, boolean z9, String str, boolean z10, boolean z11, Set set, boolean z12, boolean z13, Set set2, String str2, int i9) {
        if ((i9 & 1) != 0) {
            z9 = c0034b.f114a;
        }
        boolean z14 = z9;
        if ((i9 & 2) != 0) {
            str = c0034b.f115b;
        }
        String str3 = str;
        if ((i9 & 4) != 0) {
            z10 = c0034b.f116c;
        }
        boolean z15 = z10;
        if ((i9 & 8) != 0) {
            z11 = c0034b.f117d;
        }
        boolean z16 = z11;
        if ((i9 & 16) != 0) {
            set = c0034b.f118e;
        }
        Set set3 = set;
        boolean z17 = (i9 & 32) != 0 ? c0034b.f119f : z12;
        boolean z18 = (i9 & 64) != 0 ? c0034b.f120g : z13;
        Set set4 = (i9 & 128) != 0 ? c0034b.f121h : set2;
        String str4 = (i9 & Opcodes.ACC_NATIVE) != 0 ? c0034b.f122i : str2;
        c0034b.getClass();
        set3.getClass();
        set4.getClass();
        str4.getClass();
        return new C0034b(z14, str3, z15, z16, set3, z17, z18, set4, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0034b)) {
            return false;
        }
        C0034b c0034b = (C0034b) obj;
        return this.f114a == c0034b.f114a && this.f115b.equals(c0034b.f115b) && this.f116c == c0034b.f116c && this.f117d == c0034b.f117d && AbstractC1416l.m3825a(this.f118e, c0034b.f118e) && this.f119f == c0034b.f119f && this.f120g == c0034b.f120g && AbstractC1416l.m3825a(this.f121h, c0034b.f121h) && this.f122i.equals(c0034b.f122i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f122i.hashCode() + ((this.f121h.hashCode() + AbstractC0921a.m2245h(AbstractC0921a.m2245h((this.f118e.hashCode() + AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2244g(Boolean.hashCode(this.f114a) * 31, 31, this.f115b), 31, this.f116c), 31, this.f117d)) * 31, 31, this.f119f), 31, this.f120g)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessageBlockDefaultRule(group=");
        sb2.append(this.f114a);
        sb2.append(", label=");
        sb2.append(this.f115b);
        sb2.append(", official=");
        AbstractC3199a.m6851x(sb2, this.f116c, ", enabled=", this.f117d, ", templateIds=");
        sb2.append(this.f118e);
        sb2.append(", customRules=");
        sb2.append(this.f119f);
        sb2.append(", typeAll=");
        sb2.append(this.f120g);
        sb2.append(", types=");
        sb2.append(this.f121h);
        sb2.append(", textKeywords=");
        return AbstractC0921a.m2255r(sb2, this.f122i, ")");
    }
}
