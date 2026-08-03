package p080fb;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import tf.C4173t;

/* JADX INFO: renamed from: fb.t1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1177t1 {

    /* JADX INFO: renamed from: a */
    public final String f3939a;

    /* JADX INFO: renamed from: b */
    public final String f3940b;

    /* JADX INFO: renamed from: c */
    public final C1192y f3941c;

    /* JADX INFO: renamed from: d */
    public final String f3942d;

    /* JADX INFO: renamed from: e */
    public final String f3943e;

    /* JADX INFO: renamed from: f */
    public final String f3944f;

    /* JADX INFO: renamed from: g */
    public final String f3945g;

    /* JADX INFO: renamed from: h */
    public final String f3946h;

    /* JADX INFO: renamed from: i */
    public final String f3947i;

    /* JADX INFO: renamed from: j */
    public final String f3948j;

    /* JADX INFO: renamed from: k */
    public final String f3949k;

    /* JADX INFO: renamed from: l */
    public final String f3950l;

    /* JADX INFO: renamed from: m */
    public final String f3951m;

    /* JADX INFO: renamed from: n */
    public final String f3952n;

    /* JADX INFO: renamed from: o */
    public final List f3953o;

    /* JADX INFO: renamed from: p */
    public final String f3954p;

    /* JADX INFO: renamed from: q */
    public final String f3955q;

    /* JADX INFO: renamed from: r */
    public final String f3956r;

    /* JADX INFO: renamed from: s */
    public final String f3957s;

    /* JADX INFO: renamed from: t */
    public final String f3958t;

    /* JADX INFO: renamed from: u */
    public final List f3959u;

    /* JADX INFO: renamed from: v */
    public final C1134i2 f3960v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1177t1(String str, String str2, C1192y c1192y, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, String str14, String str15, ArrayList arrayList, C1134i2 c1134i2, int i9) {
        String str16 = (i9 & 8) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
        String str17 = (i9 & 16) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str4;
        String str18 = (i9 & 32) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str5;
        String str19 = (i9 & 64) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str6;
        String str20 = (i9 & 128) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str7;
        String str21 = (i9 & Opcodes.ACC_NATIVE) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str8;
        String str22 = (i9 & Opcodes.ACC_INTERFACE) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str9;
        String str23 = (i9 & 1024) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str10;
        String str24 = (i9 & Opcodes.ACC_STRICT) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str11;
        String str25 = (i9 & 4096) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str12;
        String str26 = (i9 & 8192) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str13;
        int i10 = i9 & 16384;
        C4173t c4173t = C4173t.f13710g;
        this(str, str2, c1192y, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, i10 != 0 ? c4173t : list, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, (262144 & i9) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str14, (524288 & i9) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str15, (1048576 & i9) != 0 ? c4173t : arrayList, (i9 & 2097152) != 0 ? null : c1134i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1177t1 m3025a(C1177t1 c1177t1, String str, String str2, C1192y c1192y, String str3, String str4, String str5, String str6, List list, String str7, String str8, C1134i2 c1134i2, int i9) {
        String str9 = (i9 & 1) != 0 ? c1177t1.f3939a : str;
        String str10 = (i9 & 2) != 0 ? c1177t1.f3940b : str2;
        C1192y c1192y2 = (i9 & 4) != 0 ? c1177t1.f3941c : c1192y;
        String str11 = (i9 & 8) != 0 ? c1177t1.f3942d : str3;
        String str12 = (i9 & 16) != 0 ? c1177t1.f3943e : str4;
        String str13 = (i9 & 32) != 0 ? c1177t1.f3944f : str5;
        String str14 = c1177t1.f3945g;
        String str15 = c1177t1.f3946h;
        String str16 = c1177t1.f3947i;
        String str17 = c1177t1.f3948j;
        String str18 = c1177t1.f3949k;
        String str19 = c1177t1.f3950l;
        String str20 = c1177t1.f3951m;
        String str21 = (i9 & 8192) != 0 ? c1177t1.f3952n : str6;
        List list2 = (i9 & 16384) != 0 ? c1177t1.f3953o : list;
        String str22 = c1177t1.f3954p;
        String str23 = c1177t1.f3955q;
        String str24 = c1177t1.f3956r;
        String str25 = (i9 & Opcodes.ASM4) != 0 ? c1177t1.f3957s : str7;
        String str26 = (i9 & 524288) != 0 ? c1177t1.f3958t : str8;
        List list3 = c1177t1.f3959u;
        C1134i2 c1134i22 = (i9 & 2097152) != 0 ? c1177t1.f3960v : c1134i2;
        AbstractC2091b.m5170q(str9, str10, str11, str12, str13);
        AbstractC2091b.m5170q(str14, str15, str16, str17, str18);
        str19.getClass();
        str20.getClass();
        str21.getClass();
        list2.getClass();
        str22.getClass();
        str23.getClass();
        str24.getClass();
        str25.getClass();
        str26.getClass();
        list3.getClass();
        return new C1177t1(str9, str10, c1192y2, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, list2, str22, str23, str24, str25, str26, list3, c1134i22);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m3026b() {
        return this.f3951m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m3027c() {
        return this.f3950l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final String m3028d() {
        return this.f3948j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final String m3029e() {
        return this.f3947i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1177t1)) {
            return false;
        }
        C1177t1 c1177t1 = (C1177t1) obj;
        return AbstractC1416l.m3825a(this.f3939a, c1177t1.f3939a) && AbstractC1416l.m3825a(this.f3940b, c1177t1.f3940b) && AbstractC1416l.m3825a(this.f3941c, c1177t1.f3941c) && AbstractC1416l.m3825a(this.f3942d, c1177t1.f3942d) && AbstractC1416l.m3825a(this.f3943e, c1177t1.f3943e) && AbstractC1416l.m3825a(this.f3944f, c1177t1.f3944f) && AbstractC1416l.m3825a(this.f3945g, c1177t1.f3945g) && AbstractC1416l.m3825a(this.f3946h, c1177t1.f3946h) && AbstractC1416l.m3825a(this.f3947i, c1177t1.f3947i) && AbstractC1416l.m3825a(this.f3948j, c1177t1.f3948j) && AbstractC1416l.m3825a(this.f3949k, c1177t1.f3949k) && AbstractC1416l.m3825a(this.f3950l, c1177t1.f3950l) && AbstractC1416l.m3825a(this.f3951m, c1177t1.f3951m) && AbstractC1416l.m3825a(this.f3952n, c1177t1.f3952n) && AbstractC1416l.m3825a(this.f3953o, c1177t1.f3953o) && AbstractC1416l.m3825a(this.f3954p, c1177t1.f3954p) && AbstractC1416l.m3825a(this.f3955q, c1177t1.f3955q) && AbstractC1416l.m3825a(this.f3956r, c1177t1.f3956r) && AbstractC1416l.m3825a(this.f3957s, c1177t1.f3957s) && AbstractC1416l.m3825a(this.f3958t, c1177t1.f3958t) && AbstractC1416l.m3825a(this.f3959u, c1177t1.f3959u) && AbstractC1416l.m3825a(this.f3960v, c1177t1.f3960v);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final List m3030f() {
        return this.f3959u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final String m3031g() {
        return this.f3942d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final String m3032h() {
        return this.f3940b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2244g = AbstractC0921a.m2244g(this.f3939a.hashCode() * 31, 31, this.f3940b);
        C1192y c1192y = this.f3941c;
        int iM5158e = AbstractC2091b.m5158e(this.f3959u, AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC2091b.m5158e(this.f3953o, AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g((iM2244g + (c1192y == null ? 0 : c1192y.hashCode())) * 31, 31, this.f3942d), 31, this.f3943e), 31, this.f3944f), 31, this.f3945g), 31, this.f3946h), 31, this.f3947i), 31, this.f3948j), 31, this.f3949k), 31, this.f3950l), 31, this.f3951m), 31, this.f3952n), 31), 31, this.f3954p), 31, this.f3955q), 31, this.f3956r), 31, this.f3957s), 31, this.f3958t), 31);
        C1134i2 c1134i2 = this.f3960v;
        return iM5158e + (c1134i2 != null ? c1134i2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final String m3033i() {
        return this.f3946h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final String m3034j() {
        return this.f3939a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ScriptPluginAgentTurn(status=", this.f3939a, ", reply=", this.f3940b, ", draft=");
        sbM1027p.append(this.f3941c);
        sbM1027p.append(", progress=");
        sbM1027p.append(this.f3942d);
        sbM1027p.append(", diff=");
        AbstractC2091b.m5173t(sbM1027p, this.f3943e, ", targetPluginId=", this.f3944f, ", title=");
        AbstractC2091b.m5173t(sbM1027p, this.f3945g, ", searchQuery=", this.f3946h, ", mcpToolName=");
        AbstractC2091b.m5173t(sbM1027p, this.f3947i, ", mcpArguments=", this.f3948j, ", localToolName=");
        AbstractC2091b.m5173t(sbM1027p, this.f3949k, ", localToolArguments=", this.f3950l, ", filePath=");
        AbstractC2091b.m5173t(sbM1027p, this.f3951m, ", taskGoal=", this.f3952n, ", toolEvents=");
        sbM1027p.append(this.f3953o);
        sbM1027p.append(", nativeToolCallId=");
        sbM1027p.append(this.f3954p);
        sbM1027p.append(", nativeToolCallName=");
        AbstractC2091b.m5173t(sbM1027p, this.f3955q, ", nativeToolCallArguments=", this.f3956r, ", nativeToolHistory=");
        AbstractC2091b.m5173t(sbM1027p, this.f3957s, ", protocolTranscript=", this.f3958t, ", nativeToolCalls=");
        sbM1027p.append(this.f3959u);
        sbM1027p.append(", workspaceChange=");
        sbM1027p.append(this.f3960v);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }

    public C1177t1(String str, String str2, C1192y c1192y, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, String str14, String str15, String str16, String str17, String str18, List list2, C1134i2 c1134i2) {
        AbstractC2091b.m5170q(str3, str4, str5, str6, str7);
        AbstractC2091b.m5170q(str8, str9, str10, str11, str12);
        str13.getClass();
        list.getClass();
        str17.getClass();
        str18.getClass();
        list2.getClass();
        this.f3939a = str;
        this.f3940b = str2;
        this.f3941c = c1192y;
        this.f3942d = str3;
        this.f3943e = str4;
        this.f3944f = str5;
        this.f3945g = str6;
        this.f3946h = str7;
        this.f3947i = str8;
        this.f3948j = str9;
        this.f3949k = str10;
        this.f3950l = str11;
        this.f3951m = str12;
        this.f3952n = str13;
        this.f3953o = list;
        this.f3954p = str14;
        this.f3955q = str15;
        this.f3956r = str16;
        this.f3957s = str17;
        this.f3958t = str18;
        this.f3959u = list2;
        this.f3960v = c1134i2;
    }
}
