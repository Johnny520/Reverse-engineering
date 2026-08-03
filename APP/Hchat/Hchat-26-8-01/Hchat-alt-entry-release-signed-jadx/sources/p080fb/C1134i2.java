package p080fb;

import gg.AbstractC1416l;
import java.util.LinkedHashMap;
import java.util.List;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: fb.i2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1134i2 {

    /* JADX INFO: renamed from: a */
    public final String f3711a;

    /* JADX INFO: renamed from: b */
    public final String f3712b;

    /* JADX INFO: renamed from: c */
    public final String f3713c;

    /* JADX INFO: renamed from: d */
    public final boolean f3714d;

    /* JADX INFO: renamed from: e */
    public final String f3715e;

    /* JADX INFO: renamed from: f */
    public final List f3716f;

    /* JADX INFO: renamed from: g */
    public final List f3717g;

    /* JADX INFO: renamed from: h */
    public final List f3718h;

    /* JADX INFO: renamed from: i */
    public final String f3719i;

    /* JADX INFO: renamed from: j */
    public final C1192y f3720j;

    /* JADX INFO: renamed from: k */
    public final LinkedHashMap f3721k;

    /* JADX INFO: renamed from: l */
    public final boolean f3722l;

    /* JADX INFO: renamed from: m */
    public final Object f3723m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1134i2(String str, String str2, String str3, boolean z9, String str4, List list, List list2, List list3, String str5, C1192y c1192y, LinkedHashMap linkedHashMap, boolean z10, List list4) {
        str2.getClass();
        this.f3711a = str;
        this.f3712b = str2;
        this.f3713c = str3;
        this.f3714d = z9;
        this.f3715e = str4;
        this.f3716f = list;
        this.f3717g = list2;
        this.f3718h = list3;
        this.f3719i = str5;
        this.f3720j = c1192y;
        this.f3721k = linkedHashMap;
        this.f3722l = z10;
        this.f3723m = list4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m2893a() {
        return this.f3722l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m2894b() {
        return this.f3711a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m2895c() {
        return this.f3713c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1134i2)) {
            return false;
        }
        C1134i2 c1134i2 = (C1134i2) obj;
        return this.f3711a.equals(c1134i2.f3711a) && AbstractC1416l.m3825a(this.f3712b, c1134i2.f3712b) && this.f3713c.equals(c1134i2.f3713c) && this.f3714d == c1134i2.f3714d && this.f3715e.equals(c1134i2.f3715e) && this.f3716f.equals(c1134i2.f3716f) && this.f3717g.equals(c1134i2.f3717g) && this.f3718h.equals(c1134i2.f3718h) && this.f3719i.equals(c1134i2.f3719i) && AbstractC1416l.m3825a(this.f3720j, c1134i2.f3720j) && this.f3721k.equals(c1134i2.f3721k) && this.f3722l == c1134i2.f3722l && this.f3723m.equals(c1134i2.f3723m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2244g = AbstractC0921a.m2244g(AbstractC2091b.m5158e(this.f3718h, AbstractC2091b.m5158e(this.f3717g, AbstractC2091b.m5158e(this.f3716f, AbstractC0921a.m2244g(AbstractC0921a.m2245h(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f3711a.hashCode() * 31, 31, this.f3712b), 31, this.f3713c), 31, this.f3714d), 31, this.f3715e), 31), 31), 31), 31, this.f3719i);
        C1192y c1192y = this.f3720j;
        return this.f3723m.hashCode() + AbstractC0921a.m2245h((this.f3721k.hashCode() + ((iM2244g + (c1192y == null ? 0 : c1192y.hashCode())) * 31)) * 31, 31, this.f3722l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ScriptPluginAgentWorkspaceChange(pluginId=", this.f3711a, ", pluginName=", this.f3712b, ", stagingPath=");
        sbM1027p.append(this.f3713c);
        sbM1027p.append(", existed=");
        sbM1027p.append(this.f3714d);
        sbM1027p.append(", baseFingerprint=");
        sbM1027p.append(this.f3715e);
        sbM1027p.append(", createdPaths=");
        sbM1027p.append(this.f3716f);
        sbM1027p.append(", modifiedPaths=");
        sbM1027p.append(this.f3717g);
        sbM1027p.append(", deletedPaths=");
        sbM1027p.append(this.f3718h);
        sbM1027p.append(", diff=");
        sbM1027p.append(this.f3719i);
        sbM1027p.append(", draft=");
        sbM1027p.append(this.f3720j);
        sbM1027p.append(", basePathStates=");
        sbM1027p.append(this.f3721k);
        sbM1027p.append(", deletePlugin=");
        sbM1027p.append(this.f3722l);
        sbM1027p.append(", warnings=");
        sbM1027p.append(this.f3723m);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
