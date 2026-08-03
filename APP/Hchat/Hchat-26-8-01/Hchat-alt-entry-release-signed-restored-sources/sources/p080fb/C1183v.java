package p080fb;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: fb.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1183v {

    /* JADX INFO: renamed from: a */
    public final String f3976a;

    /* JADX INFO: renamed from: b */
    public final String f3977b;

    /* JADX INFO: renamed from: c */
    public final String f3978c;

    /* JADX INFO: renamed from: d */
    public final String f3979d;

    /* JADX INFO: renamed from: e */
    public final List f3980e;

    /* JADX INFO: renamed from: f */
    public final boolean f3981f;

    /* JADX INFO: renamed from: g */
    public final int f3982g;

    /* JADX INFO: renamed from: h */
    public final boolean f3983h;

    /* JADX INFO: renamed from: i */
    public final String f3984i;

    /* JADX INFO: renamed from: j */
    public final String f3985j;

    /* JADX INFO: renamed from: k */
    public final String f3986k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1183v(String str, String str2, String str3, String str4, List list, boolean z9, int i9, boolean z10, String str5, String str6, String str7) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        this.f3976a = str;
        this.f3977b = str2;
        this.f3978c = str3;
        this.f3979d = str4;
        this.f3980e = list;
        this.f3981f = z9;
        this.f3982g = i9;
        this.f3983h = z10;
        this.f3984i = str5;
        this.f3985j = str6;
        this.f3986k = str7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1183v m3168a(C1183v c1183v, String str, String str2, String str3, ArrayList arrayList, int i9, boolean z9, String str4, String str5, String str6, int i10) {
        String str7 = (i10 & 1) != 0 ? c1183v.f3976a : str;
        String str8 = (i10 & 2) != 0 ? c1183v.f3977b : HttpUrl.FRAGMENT_ENCODE_SET;
        String str9 = (i10 & 4) != 0 ? c1183v.f3978c : str2;
        String str10 = (i10 & 8) != 0 ? c1183v.f3979d : str3;
        List list = (i10 & 16) != 0 ? c1183v.f3980e : arrayList;
        boolean z10 = c1183v.f3981f;
        int i11 = (i10 & 64) != 0 ? c1183v.f3982g : i9;
        boolean z11 = (i10 & 128) != 0 ? c1183v.f3983h : z9;
        String str11 = (i10 & Opcodes.ACC_NATIVE) != 0 ? c1183v.f3984i : str4;
        String str12 = (i10 & Opcodes.ACC_INTERFACE) != 0 ? c1183v.f3985j : str5;
        String str13 = (i10 & 1024) != 0 ? c1183v.f3986k : str6;
        str7.getClass();
        str9.getClass();
        str10.getClass();
        list.getClass();
        str11.getClass();
        str12.getClass();
        str13.getClass();
        return new C1183v(str7, str8, str9, str10, list, z10, i11, z11, str11, str12, str13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m3169b() {
        return this.f3978c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m3170c() {
        return this.f3981f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m3171d() {
        return this.f3982g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final String m3172e() {
        return this.f3986k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1183v)) {
            return false;
        }
        C1183v c1183v = (C1183v) obj;
        return AbstractC1416l.m3825a(this.f3976a, c1183v.f3976a) && this.f3977b.equals(c1183v.f3977b) && AbstractC1416l.m3825a(this.f3978c, c1183v.f3978c) && AbstractC1416l.m3825a(this.f3979d, c1183v.f3979d) && AbstractC1416l.m3825a(this.f3980e, c1183v.f3980e) && this.f3981f == c1183v.f3981f && this.f3982g == c1183v.f3982g && this.f3983h == c1183v.f3983h && AbstractC1416l.m3825a(this.f3984i, c1183v.f3984i) && AbstractC1416l.m3825a(this.f3985j, c1183v.f3985j) && AbstractC1416l.m3825a(this.f3986k, c1183v.f3986k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final String m3173f() {
        return this.f3985j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3986k.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2245h(AbstractC0921a.m2242e(this.f3982g, AbstractC0921a.m2245h(AbstractC2091b.m5158e(this.f3980e, AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f3976a.hashCode() * 31, 31, this.f3977b), 31, this.f3978c), 31, this.f3979d), 31), 31, this.f3981f), 31), 31, this.f3983h), 31, this.f3984i), 31, this.f3985j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ScriptPluginAgentConfig(apiBaseUrl=", this.f3976a, ", apiPath=", this.f3977b, ", apiKey=");
        AbstractC2091b.m5173t(sbM1027p, this.f3978c, ", model=", this.f3979d, ", mcpServers=");
        sbM1027p.append(this.f3980e);
        sbM1027p.append(", autoCompactEnabled=");
        sbM1027p.append(this.f3981f);
        sbM1027p.append(", compactTokenThreshold=");
        sbM1027p.append(this.f3982g);
        sbM1027p.append(", webSearchEnabled=");
        sbM1027p.append(this.f3983h);
        sbM1027p.append(", workspaceWriteApprovalMode=");
        AbstractC2091b.m5173t(sbM1027p, this.f3984i, ", promptCacheMode=", this.f3985j, ", endpointMode=");
        return AbstractC0921a.m2255r(sbM1027p, this.f3986k, ")");
    }
}
