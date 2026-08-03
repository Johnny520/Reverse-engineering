package p080fb;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.util.List;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: fb.b1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1105b1 {

    /* JADX INFO: renamed from: a */
    public final C1195z f3558a;

    /* JADX INFO: renamed from: b */
    public final List f3559b;

    /* JADX INFO: renamed from: c */
    public final C1192y f3560c;

    /* JADX INFO: renamed from: d */
    public final String f3561d;

    /* JADX INFO: renamed from: e */
    public final String f3562e;

    /* JADX INFO: renamed from: f */
    public final String f3563f;

    /* JADX INFO: renamed from: g */
    public final String f3564g;

    /* JADX INFO: renamed from: h */
    public final String f3565h;

    /* JADX INFO: renamed from: i */
    public final int f3566i;

    /* JADX INFO: renamed from: j */
    public final String f3567j;

    /* JADX INFO: renamed from: k */
    public final List f3568k;

    /* JADX INFO: renamed from: l */
    public final String f3569l;

    /* JADX INFO: renamed from: m */
    public final String f3570m;

    /* JADX INFO: renamed from: n */
    public final String f3571n;

    /* JADX INFO: renamed from: o */
    public final String f3572o;

    /* JADX INFO: renamed from: p */
    public final List f3573p;

    /* JADX INFO: renamed from: q */
    public final String f3574q;

    /* JADX INFO: renamed from: r */
    public final String f3575r;

    /* JADX INFO: renamed from: s */
    public final C1138j2 f3576s;

    /* JADX INFO: renamed from: t */
    public final String f3577t;

    /* JADX INFO: renamed from: u */
    public final String f3578u;

    /* JADX INFO: renamed from: v */
    public final boolean f3579v;

    /* JADX INFO: renamed from: w */
    public final String f3580w;

    /* JADX INFO: renamed from: x */
    public final String f3581x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1105b1(C1195z c1195z, List list, C1192y c1192y, String str, String str2, String str3, String str4, String str5, int i9, String str6, List list2, String str7, String str8, String str9, String str10, List list3, String str11, String str12, C1138j2 c1138j2, String str13, String str14, boolean z9, String str15, String str16) {
        str5.getClass();
        list2.getClass();
        list3.getClass();
        str14.getClass();
        str15.getClass();
        this.f3558a = c1195z;
        this.f3559b = list;
        this.f3560c = c1192y;
        this.f3561d = str;
        this.f3562e = str2;
        this.f3563f = str3;
        this.f3564g = str4;
        this.f3565h = str5;
        this.f3566i = i9;
        this.f3567j = str6;
        this.f3568k = list2;
        this.f3569l = str7;
        this.f3570m = str8;
        this.f3571n = str9;
        this.f3572o = str10;
        this.f3573p = list3;
        this.f3574q = str11;
        this.f3575r = str12;
        this.f3576s = c1138j2;
        this.f3577t = str13;
        this.f3578u = str14;
        this.f3579v = z9;
        this.f3580w = str15;
        this.f3581x = str16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1105b1 m2829a(C1105b1 c1105b1, C1195z c1195z, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, String str8, String str9, String str10, String str11, C1138j2 c1138j2, String str12, String str13, int i9) {
        C1195z c1195z2 = (i9 & 1) != 0 ? c1105b1.f3558a : c1195z;
        List list2 = c1105b1.f3559b;
        C1192y c1192y = c1105b1.f3560c;
        String str14 = (i9 & 8) != 0 ? c1105b1.f3561d : str;
        String str15 = (i9 & 16) != 0 ? c1105b1.f3562e : str2;
        String str16 = (i9 & 32) != 0 ? c1105b1.f3563f : str3;
        String str17 = (i9 & 64) != 0 ? c1105b1.f3564g : str4;
        String str18 = c1105b1.f3565h;
        int i10 = c1105b1.f3566i;
        String str19 = (i9 & Opcodes.ACC_INTERFACE) != 0 ? c1105b1.f3567j : str5;
        List list3 = (i9 & 1024) != 0 ? c1105b1.f3568k : list;
        String str20 = (i9 & Opcodes.ACC_STRICT) != 0 ? c1105b1.f3569l : str6;
        String str21 = (i9 & 4096) != 0 ? c1105b1.f3570m : str7;
        String str22 = (i9 & 8192) != 0 ? c1105b1.f3571n : str8;
        String str23 = (i9 & 16384) != 0 ? c1105b1.f3572o : str9;
        List list4 = c1105b1.f3573p;
        String str24 = (65536 & i9) != 0 ? c1105b1.f3574q : str10;
        String str25 = (131072 & i9) != 0 ? c1105b1.f3575r : str11;
        C1138j2 c1138j22 = (262144 & i9) != 0 ? c1105b1.f3576s : c1138j2;
        String str26 = (524288 & i9) != 0 ? c1105b1.f3577t : str12;
        String str27 = (1048576 & i9) != 0 ? c1105b1.f3578u : str13;
        boolean z9 = (i9 & 2097152) != 0 ? c1105b1.f3579v : true;
        String str28 = c1105b1.f3580w;
        String str29 = c1105b1.f3581x;
        c1105b1.getClass();
        str14.getClass();
        str15.getClass();
        str18.getClass();
        list3.getClass();
        str21.getClass();
        str23.getClass();
        list4.getClass();
        str24.getClass();
        str25.getClass();
        str26.getClass();
        str27.getClass();
        str28.getClass();
        return new C1105b1(c1195z2, list2, c1192y, str14, str15, str16, str17, str18, i10, str19, list3, str20, str21, str22, str23, list4, str24, str25, c1138j22, str26, str27, z9, str28, str29);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m2830b() {
        return this.f3575r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final List m2831c() {
        return this.f3573p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m2832d() {
        return this.f3566i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final String m2833e() {
        return this.f3565h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1105b1)) {
            return false;
        }
        C1105b1 c1105b1 = (C1105b1) obj;
        return AbstractC1416l.m3825a(this.f3558a, c1105b1.f3558a) && this.f3559b.equals(c1105b1.f3559b) && AbstractC1416l.m3825a(this.f3560c, c1105b1.f3560c) && this.f3561d.equals(c1105b1.f3561d) && this.f3562e.equals(c1105b1.f3562e) && this.f3563f.equals(c1105b1.f3563f) && this.f3564g.equals(c1105b1.f3564g) && AbstractC1416l.m3825a(this.f3565h, c1105b1.f3565h) && this.f3566i == c1105b1.f3566i && this.f3567j.equals(c1105b1.f3567j) && AbstractC1416l.m3825a(this.f3568k, c1105b1.f3568k) && this.f3569l.equals(c1105b1.f3569l) && this.f3570m.equals(c1105b1.f3570m) && this.f3571n.equals(c1105b1.f3571n) && this.f3572o.equals(c1105b1.f3572o) && AbstractC1416l.m3825a(this.f3573p, c1105b1.f3573p) && this.f3574q.equals(c1105b1.f3574q) && this.f3575r.equals(c1105b1.f3575r) && AbstractC1416l.m3825a(this.f3576s, c1105b1.f3576s) && this.f3577t.equals(c1105b1.f3577t) && AbstractC1416l.m3825a(this.f3578u, c1105b1.f3578u) && this.f3579v == c1105b1.f3579v && AbstractC1416l.m3825a(this.f3580w, c1105b1.f3580w) && this.f3581x.equals(c1105b1.f3581x);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final String m2834f() {
        return this.f3574q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final String m2835g() {
        return this.f3577t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final String m2836h() {
        return this.f3578u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C1195z c1195z = this.f3558a;
        int iM5158e = AbstractC2091b.m5158e(this.f3559b, (c1195z == null ? 0 : c1195z.hashCode()) * 31, 31);
        C1192y c1192y = this.f3560c;
        int iM2244g = AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC2091b.m5158e(this.f3573p, AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC2091b.m5158e(this.f3568k, AbstractC0921a.m2244g(AbstractC0921a.m2242e(this.f3566i, AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g((iM5158e + (c1192y == null ? 0 : c1192y.hashCode())) * 31, 31, this.f3561d), 31, this.f3562e), 31, this.f3563f), 31, this.f3564g), 31, this.f3565h), 31), 31, this.f3567j), 31), 31, this.f3569l), 31, this.f3570m), 31, this.f3571n), 31, this.f3572o), 31), 31, this.f3574q), 31, this.f3575r);
        C1138j2 c1138j2 = this.f3576s;
        return this.f3581x.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2245h(AbstractC0921a.m2244g(AbstractC0921a.m2244g((iM2244g + (c1138j2 != null ? c1138j2.hashCode() : 0)) * 31, 31, this.f3577t), 31, this.f3578u), 31, this.f3579v), 31, this.f3580w);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final String m2837i() {
        return this.f3562e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final String m2838j() {
        return this.f3581x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final String m2839k() {
        return this.f3571n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScriptPluginAgentRequest(existing=");
        sb2.append(this.f3558a);
        sb2.append(", messages=");
        sb2.append(this.f3559b);
        sb2.append(", currentDraft=");
        sb2.append(this.f3560c);
        sb2.append(", targetPluginId=");
        sb2.append(this.f3561d);
        sb2.append(", searchContext=");
        AbstractC2091b.m5173t(sb2, this.f3562e, ", mcpToolsContext=", this.f3563f, ", mcpResultContext=");
        AbstractC2091b.m5173t(sb2, this.f3564g, ", conversationSummary=", this.f3565h, ", compactedMessageCount=");
        sb2.append(this.f3566i);
        sb2.append(", localFileContext=");
        sb2.append(this.f3567j);
        sb2.append(", localImagePaths=");
        sb2.append(this.f3568k);
        sb2.append(", localToolsContext=");
        sb2.append(this.f3569l);
        sb2.append(", localToolResultContext=");
        AbstractC2091b.m5173t(sb2, this.f3570m, ", workspaceToolsContext=", this.f3571n, ", workspaceToolResultContext=");
        sb2.append(this.f3572o);
        sb2.append(", allowedLocalPaths=");
        sb2.append(this.f3573p);
        sb2.append(", lockedTaskGoal=");
        AbstractC2091b.m5173t(sb2, this.f3574q, ", agentWorkContext=", this.f3575r, ", workspaceCheckpoint=");
        sb2.append(this.f3576s);
        sb2.append(", nativeToolHistory=");
        sb2.append(this.f3577t);
        sb2.append(", protocolTranscript=");
        sb2.append(this.f3578u);
        sb2.append(", nativeToolHistoryAfterCurrentUser=");
        sb2.append(this.f3579v);
        sb2.append(", sessionId=");
        return AbstractC2091b.m5164k(sb2, this.f3580w, ", turnId=", this.f3581x, ")");
    }
}
