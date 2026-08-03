package p345x8;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: x8.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5727t {

    /* JADX INFO: renamed from: a */
    public final String f23317a;

    /* JADX INFO: renamed from: b */
    public final String f23318b;

    /* JADX INFO: renamed from: c */
    public final String f23319c;

    /* JADX INFO: renamed from: d */
    public final String f23320d;

    /* JADX INFO: renamed from: e */
    public final String f23321e;

    /* JADX INFO: renamed from: f */
    public final String f23322f;

    /* JADX INFO: renamed from: g */
    public final String f23323g;

    /* JADX INFO: renamed from: h */
    public final String f23324h;

    /* JADX INFO: renamed from: i */
    public final boolean f23325i;

    /* JADX INFO: renamed from: j */
    public final boolean f23326j;

    /* JADX INFO: renamed from: k */
    public final String f23327k;

    /* JADX INFO: renamed from: l */
    public final boolean f23328l;

    /* JADX INFO: renamed from: m */
    public final String f23329m;

    /* JADX INFO: renamed from: n */
    public final String f23330n;

    /* JADX INFO: renamed from: o */
    public final int f23331o;

    /* JADX INFO: renamed from: p */
    public final int f23332p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5727t(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z9, boolean z10, String str9, boolean z11, String str10, String str11, int i9, int i10) {
        AbstractC2091b.m5170q(str, str2, str3, str4, str5);
        AbstractC2091b.m5170q(str6, str7, str8, str9, str10);
        str11.getClass();
        this.f23317a = str;
        this.f23318b = str2;
        this.f23319c = str3;
        this.f23320d = str4;
        this.f23321e = str5;
        this.f23322f = str6;
        this.f23323g = str7;
        this.f23324h = str8;
        this.f23325i = z9;
        this.f23326j = z10;
        this.f23327k = str9;
        this.f23328l = z11;
        this.f23329m = str10;
        this.f23330n = str11;
        this.f23331o = i9;
        this.f23332p = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5727t)) {
            return false;
        }
        C5727t c5727t = (C5727t) obj;
        return AbstractC1416l.m3825a(this.f23317a, c5727t.f23317a) && AbstractC1416l.m3825a(this.f23318b, c5727t.f23318b) && AbstractC1416l.m3825a(this.f23319c, c5727t.f23319c) && AbstractC1416l.m3825a(this.f23320d, c5727t.f23320d) && AbstractC1416l.m3825a(this.f23321e, c5727t.f23321e) && AbstractC1416l.m3825a(this.f23322f, c5727t.f23322f) && AbstractC1416l.m3825a(this.f23323g, c5727t.f23323g) && AbstractC1416l.m3825a(this.f23324h, c5727t.f23324h) && this.f23325i == c5727t.f23325i && this.f23326j == c5727t.f23326j && AbstractC1416l.m3825a(this.f23327k, c5727t.f23327k) && this.f23328l == c5727t.f23328l && AbstractC1416l.m3825a(this.f23329m, c5727t.f23329m) && AbstractC1416l.m3825a(this.f23330n, c5727t.f23330n) && this.f23331o == c5727t.f23331o && this.f23332p == c5727t.f23332p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f23332p) + AbstractC0921a.m2242e(this.f23331o, AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2245h(AbstractC0921a.m2244g(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f23317a.hashCode() * 31, 31, this.f23318b), 31, this.f23319c), 31, this.f23320d), 31, this.f23321e), 31, this.f23322f), 31, this.f23323g), 31, this.f23324h), 31, this.f23325i), 31, this.f23326j), 31, this.f23327k), 31, this.f23328l), 31, this.f23329m), 31, this.f23330n), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("AutoReplyXiaozhiConfig(serveUrl=", this.f23317a, ", otaUrl=", this.f23318b, ", consoleUrl=");
        AbstractC2091b.m5173t(sbM1027p, this.f23319c, ", consolePhone=", this.f23320d, ", consoleToken=");
        AbstractC2091b.m5173t(sbM1027p, this.f23321e, ", consoleAgentId=", this.f23322f, ", consoleModel=");
        AbstractC2091b.m5173t(sbM1027p, this.f23323g, ", voiceRole=", this.f23324h, ", musicMcpEnabled=");
        AbstractC3199a.m6851x(sbM1027p, this.f23325i, ", mcpBridgeEnabled=", this.f23326j, ", mcpEndpointUrl=");
        sbM1027p.append(this.f23327k);
        sbM1027p.append(", mcpKugouEnabled=");
        sbM1027p.append(this.f23328l);
        sbM1027p.append(", mcpKugouPluginId=");
        AbstractC2091b.m5173t(sbM1027p, this.f23329m, ", mcpKugouFunctionName=", this.f23330n, ", mcpReadySeconds=");
        sbM1027p.append(this.f23331o);
        sbM1027p.append(", mcpIdleSeconds=");
        sbM1027p.append(this.f23332p);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
