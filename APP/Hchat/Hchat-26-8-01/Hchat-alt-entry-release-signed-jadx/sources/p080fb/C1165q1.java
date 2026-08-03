package p080fb;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: fb.q1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1165q1 {

    /* JADX INFO: renamed from: a */
    public final String f3874a;

    /* JADX INFO: renamed from: b */
    public final String f3875b;

    /* JADX INFO: renamed from: c */
    public final String f3876c;

    /* JADX INFO: renamed from: d */
    public final String f3877d;

    /* JADX INFO: renamed from: e */
    public final String f3878e;

    /* JADX INFO: renamed from: f */
    public final String f3879f;

    /* JADX INFO: renamed from: g */
    public final String f3880g;

    /* JADX INFO: renamed from: h */
    public final long f3881h;

    /* JADX INFO: renamed from: i */
    public final long f3882i;

    /* JADX INFO: renamed from: j */
    public final String f3883j;

    /* JADX INFO: renamed from: k */
    public final String f3884k;

    /* JADX INFO: renamed from: l */
    public final String f3885l;

    /* JADX INFO: renamed from: m */
    public final String f3886m;

    /* JADX INFO: renamed from: n */
    public final String f3887n;

    /* JADX INFO: renamed from: o */
    public final String f3888o;

    /* JADX INFO: renamed from: p */
    public final String f3889p;

    /* JADX INFO: renamed from: q */
    public final int f3890q;

    /* JADX INFO: renamed from: r */
    public final boolean f3891r;

    /* JADX INFO: renamed from: s */
    public final int f3892s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1165q1(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j3, long j4, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i9, boolean z9, int i10) {
        AbstractC2091b.m5170q(str2, str3, str10, str11, str12);
        str13.getClass();
        this.f3874a = str;
        this.f3875b = str2;
        this.f3876c = str3;
        this.f3877d = str4;
        this.f3878e = str5;
        this.f3879f = str6;
        this.f3880g = str7;
        this.f3881h = j3;
        this.f3882i = j4;
        this.f3883j = str8;
        this.f3884k = str9;
        this.f3885l = str10;
        this.f3886m = str11;
        this.f3887n = str12;
        this.f3888o = str13;
        this.f3889p = str14;
        this.f3890q = i9;
        this.f3891r = z9;
        this.f3892s = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1165q1 m2980a(C1165q1 c1165q1, String str, String str2, String str3, long j3, long j4, String str4, String str5, int i9, boolean z9, int i10, int i11) {
        String str6;
        String str7;
        String str8 = c1165q1.f3874a;
        String str9 = c1165q1.f3875b;
        String str10 = c1165q1.f3876c;
        String str11 = c1165q1.f3877d;
        String str12 = (i11 & 16) != 0 ? c1165q1.f3878e : str;
        String str13 = (i11 & 32) != 0 ? c1165q1.f3879f : str2;
        String str14 = (i11 & 64) != 0 ? c1165q1.f3880g : str3;
        long j5 = (i11 & 128) != 0 ? c1165q1.f3881h : j3;
        long j10 = (i11 & Opcodes.ACC_NATIVE) != 0 ? c1165q1.f3882i : j4;
        String str15 = (i11 & Opcodes.ACC_INTERFACE) != 0 ? c1165q1.f3883j : str4;
        String str16 = c1165q1.f3884k;
        String str17 = str12;
        String str18 = str13;
        String str19 = str14;
        long j11 = j5;
        long j12 = j10;
        String str20 = str15;
        String str21 = c1165q1.f3885l;
        String str22 = c1165q1.f3886m;
        String str23 = c1165q1.f3887n;
        String str24 = c1165q1.f3888o;
        if ((i11 & 32768) != 0) {
            str6 = str24;
            str7 = c1165q1.f3889p;
        } else {
            str6 = str24;
            str7 = str5;
        }
        int i12 = (i11 & 65536) != 0 ? c1165q1.f3890q : i9;
        boolean z10 = (i11 & Opcodes.ACC_DEPRECATED) != 0 ? c1165q1.f3891r : z9;
        int i13 = (i11 & Opcodes.ASM4) != 0 ? c1165q1.f3892s : i10;
        c1165q1.getClass();
        str9.getClass();
        str10.getClass();
        str17.getClass();
        str20.getClass();
        str21.getClass();
        str22.getClass();
        str23.getClass();
        str6.getClass();
        return new C1165q1(str8, str9, str10, str11, str17, str18, str19, j11, j12, str20, str16, str21, str22, str23, str6, str7, i12, z10, i13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1165q1)) {
            return false;
        }
        C1165q1 c1165q1 = (C1165q1) obj;
        return this.f3874a.equals(c1165q1.f3874a) && AbstractC1416l.m3825a(this.f3875b, c1165q1.f3875b) && AbstractC1416l.m3825a(this.f3876c, c1165q1.f3876c) && this.f3877d.equals(c1165q1.f3877d) && this.f3878e.equals(c1165q1.f3878e) && this.f3879f.equals(c1165q1.f3879f) && this.f3880g.equals(c1165q1.f3880g) && this.f3881h == c1165q1.f3881h && this.f3882i == c1165q1.f3882i && this.f3883j.equals(c1165q1.f3883j) && this.f3884k.equals(c1165q1.f3884k) && AbstractC1416l.m3825a(this.f3885l, c1165q1.f3885l) && AbstractC1416l.m3825a(this.f3886m, c1165q1.f3886m) && AbstractC1416l.m3825a(this.f3887n, c1165q1.f3887n) && AbstractC1416l.m3825a(this.f3888o, c1165q1.f3888o) && this.f3889p.equals(c1165q1.f3889p) && this.f3890q == c1165q1.f3890q && this.f3891r == c1165q1.f3891r && this.f3892s == c1165q1.f3892s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f3892s) + AbstractC0921a.m2245h(AbstractC0921a.m2242e(this.f3890q, AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f3874a.hashCode() * 31, 31, this.f3875b), 31, this.f3876c), 31, this.f3877d), 31, this.f3878e), 31, this.f3879f), 31, this.f3880g), 31, this.f3881h), 31, this.f3882i), 31, this.f3883j), 31, this.f3884k), 31, this.f3885l), 31, this.f3886m), 31, this.f3887n), 31, this.f3888o), 31, this.f3889p), 31), 31, this.f3891r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ScriptPluginAgentToolEvent(id=", this.f3874a, ", kind=", this.f3875b, ", name=");
        AbstractC2091b.m5173t(sbM1027p, this.f3876c, ", arguments=", this.f3877d, ", result=");
        AbstractC2091b.m5173t(sbM1027p, this.f3878e, ", diff=", this.f3879f, ", status=");
        sbM1027p.append(this.f3880g);
        sbM1027p.append(", startedAt=");
        sbM1027p.append(this.f3881h);
        AbstractC2091b.m5172s(sbM1027p, ", finishedAt=", this.f3882i, ", progress=");
        AbstractC2091b.m5173t(sbM1027p, this.f3883j, ", turnId=", this.f3884k, ", toolCallId=");
        AbstractC2091b.m5173t(sbM1027p, this.f3885l, ", protocolName=", this.f3886m, ", providerMetadata=");
        AbstractC2091b.m5173t(sbM1027p, this.f3887n, ", parentAssistantMessageId=", this.f3888o, ", resultHandle=");
        sbM1027p.append(this.f3889p);
        sbM1027p.append(", resultLength=");
        sbM1027p.append(this.f3890q);
        sbM1027p.append(", truncated=");
        sbM1027p.append(this.f3891r);
        sbM1027p.append(", nextOffset=");
        sbM1027p.append(this.f3892s);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
