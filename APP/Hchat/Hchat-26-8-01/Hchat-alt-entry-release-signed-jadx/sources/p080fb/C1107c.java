package p080fb;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.util.List;
import java.util.UUID;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import tf.C4173t;

/* JADX INFO: renamed from: fb.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1107c {

    /* JADX INFO: renamed from: a */
    public final String f3584a;

    /* JADX INFO: renamed from: b */
    public final String f3585b;

    /* JADX INFO: renamed from: c */
    public final String f3586c;

    /* JADX INFO: renamed from: d */
    public final String f3587d;

    /* JADX INFO: renamed from: e */
    public final String f3588e;

    /* JADX INFO: renamed from: f */
    public final String f3589f;

    /* JADX INFO: renamed from: g */
    public final String f3590g;

    /* JADX INFO: renamed from: h */
    public final String f3591h;

    /* JADX INFO: renamed from: i */
    public final String f3592i;

    /* JADX INFO: renamed from: j */
    public final List f3593j;

    /* JADX INFO: renamed from: k */
    public final List f3594k;

    /* JADX INFO: renamed from: l */
    public final C1101a1 f3595l;

    /* JADX INFO: renamed from: m */
    public final long f3596m;

    /* JADX INFO: renamed from: n */
    public final String f3597n;

    /* JADX INFO: renamed from: o */
    public final C1192y f3598o;

    /* JADX INFO: renamed from: p */
    public final boolean f3599p;

    /* JADX INFO: renamed from: q */
    public final String f3600q;

    /* JADX INFO: renamed from: r */
    public final long f3601r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1107c(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, C1101a1 c1101a1, long j3, String str8, C1192y c1192y, boolean z9, String str9, long j4, int i9) {
        String str10;
        if ((i9 & 4) != 0) {
            String string = UUID.randomUUID().toString();
            string.getClass();
            str10 = string;
        } else {
            str10 = str3;
        }
        String str11 = (i9 & 8) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str4;
        String str12 = (i9 & 16) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str5;
        String str13 = (i9 & 32) != 0 ? str : str6;
        String str14 = (i9 & 64) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str7;
        int i10 = i9 & Opcodes.ACC_INTERFACE;
        C4173t c4173t = C4173t.f13710g;
        this(str, str2, str10, str11, str12, str13, str14, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, i10 != 0 ? c4173t : list, (i9 & 1024) != 0 ? c4173t : list2, (i9 & Opcodes.ACC_STRICT) != 0 ? null : c1101a1, (i9 & 4096) != 0 ? System.currentTimeMillis() : j3, (i9 & 8192) != 0 ? "complete" : str8, (i9 & 16384) != 0 ? null : c1192y, (32768 & i9) != 0 ? false : z9, (65536 & i9) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str9, (i9 & Opcodes.ACC_DEPRECATED) != 0 ? 0L : j4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1107c m2840a(C1107c c1107c, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, C1192y c1192y, boolean z9, String str10, long j3, int i9) {
        String str11 = c1107c.f3584a;
        String str12 = (i9 & 2) != 0 ? c1107c.f3585b : str;
        String str13 = (i9 & 4) != 0 ? c1107c.f3586c : str2;
        String str14 = (i9 & 8) != 0 ? c1107c.f3587d : str3;
        String str15 = (i9 & 16) != 0 ? c1107c.f3588e : str4;
        String str16 = (i9 & 32) != 0 ? c1107c.f3589f : str5;
        String str17 = (i9 & 64) != 0 ? c1107c.f3590g : str6;
        String str18 = (i9 & 128) != 0 ? c1107c.f3591h : str7;
        String str19 = (i9 & Opcodes.ACC_NATIVE) != 0 ? c1107c.f3592i : str8;
        List list2 = (i9 & Opcodes.ACC_INTERFACE) != 0 ? c1107c.f3593j : list;
        List list3 = c1107c.f3594k;
        List list4 = list2;
        C1101a1 c1101a1 = c1107c.f3595l;
        long j4 = c1107c.f3596m;
        String str20 = (i9 & 8192) != 0 ? c1107c.f3597n : str9;
        C1192y c1192y2 = (i9 & 16384) != 0 ? c1107c.f3598o : c1192y;
        boolean z10 = (i9 & 32768) != 0 ? c1107c.f3599p : z9;
        String str21 = (i9 & 65536) != 0 ? c1107c.f3600q : str10;
        C1192y c1192y3 = c1192y2;
        long j5 = (i9 & Opcodes.ACC_DEPRECATED) != 0 ? c1107c.f3601r : j3;
        c1107c.getClass();
        str11.getClass();
        str12.getClass();
        str13.getClass();
        str14.getClass();
        AbstractC2091b.m5170q(str15, str16, str17, str18, str19);
        list4.getClass();
        list3.getClass();
        str20.getClass();
        str21.getClass();
        return new C1107c(str11, str12, str13, str14, str15, str16, str17, str18, str19, list4, list3, c1101a1, j4, str20, c1192y3, z10, str21, j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m2841b() {
        return this.f3585b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m2842c() {
        return this.f3584a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final String m2843d() {
        return this.f3587d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1107c)) {
            return false;
        }
        C1107c c1107c = (C1107c) obj;
        return AbstractC1416l.m3825a(this.f3584a, c1107c.f3584a) && AbstractC1416l.m3825a(this.f3585b, c1107c.f3585b) && AbstractC1416l.m3825a(this.f3586c, c1107c.f3586c) && AbstractC1416l.m3825a(this.f3587d, c1107c.f3587d) && AbstractC1416l.m3825a(this.f3588e, c1107c.f3588e) && AbstractC1416l.m3825a(this.f3589f, c1107c.f3589f) && AbstractC1416l.m3825a(this.f3590g, c1107c.f3590g) && AbstractC1416l.m3825a(this.f3591h, c1107c.f3591h) && AbstractC1416l.m3825a(this.f3592i, c1107c.f3592i) && AbstractC1416l.m3825a(this.f3593j, c1107c.f3593j) && AbstractC1416l.m3825a(this.f3594k, c1107c.f3594k) && AbstractC1416l.m3825a(this.f3595l, c1107c.f3595l) && this.f3596m == c1107c.f3596m && AbstractC1416l.m3825a(this.f3597n, c1107c.f3597n) && AbstractC1416l.m3825a(this.f3598o, c1107c.f3598o) && this.f3599p == c1107c.f3599p && AbstractC1416l.m3825a(this.f3600q, c1107c.f3600q) && this.f3601r == c1107c.f3601r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM5158e = AbstractC2091b.m5158e(this.f3594k, AbstractC2091b.m5158e(this.f3593j, AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f3584a.hashCode() * 31, 31, this.f3585b), 31, this.f3586c), 31, this.f3587d), 31, this.f3588e), 31, this.f3589f), 31, this.f3590g), 31, this.f3591h), 31, this.f3592i), 31), 31);
        C1101a1 c1101a1 = this.f3595l;
        int iM2244g = AbstractC0921a.m2244g(AbstractC0921a.m2243f((iM5158e + (c1101a1 == null ? 0 : c1101a1.hashCode())) * 31, 31, this.f3596m), 31, this.f3597n);
        C1192y c1192y = this.f3598o;
        return Long.hashCode(this.f3601r) + AbstractC0921a.m2244g(AbstractC0921a.m2245h((iM2244g + (c1192y != null ? c1192y.hashCode() : 0)) * 31, 31, this.f3599p), 31, this.f3600q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ScriptPluginAgentChatMessage(role=", this.f3584a, ", content=", this.f3585b, ", id=");
        AbstractC2091b.m5173t(sbM1027p, this.f3586c, ", turnId=", this.f3587d, ", parentMessageId=");
        AbstractC2091b.m5173t(sbM1027p, this.f3588e, ", phase=", this.f3589f, ", progress=");
        AbstractC2091b.m5173t(sbM1027p, this.f3590g, ", reasoning=", this.f3591h, ", diff=");
        sbM1027p.append(this.f3592i);
        sbM1027p.append(", toolEvents=");
        sbM1027p.append(this.f3593j);
        sbM1027p.append(", attachments=");
        sbM1027p.append(this.f3594k);
        sbM1027p.append(", quotedMessage=");
        sbM1027p.append(this.f3595l);
        sbM1027p.append(", createdAt=");
        sbM1027p.append(this.f3596m);
        sbM1027p.append(", status=");
        sbM1027p.append(this.f3597n);
        sbM1027p.append(", draftSnapshot=");
        sbM1027p.append(this.f3598o);
        sbM1027p.append(", clearsDraft=");
        sbM1027p.append(this.f3599p);
        sbM1027p.append(", streamId=");
        sbM1027p.append(this.f3600q);
        sbM1027p.append(", completedAt=");
        return AbstractC0921a.m2253p(sbM1027p, this.f3601r, ")");
    }

    public C1107c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, List list2, C1101a1 c1101a1, long j3, String str10, C1192y c1192y, boolean z9, String str11, long j4) {
        AbstractC2091b.m5170q(str3, str4, str5, str6, str7);
        list.getClass();
        list2.getClass();
        str10.getClass();
        str11.getClass();
        this.f3584a = str;
        this.f3585b = str2;
        this.f3586c = str3;
        this.f3587d = str4;
        this.f3588e = str5;
        this.f3589f = str6;
        this.f3590g = str7;
        this.f3591h = str8;
        this.f3592i = str9;
        this.f3593j = list;
        this.f3594k = list2;
        this.f3595l = c1101a1;
        this.f3596m = j3;
        this.f3597n = str10;
        this.f3598o = c1192y;
        this.f3599p = z9;
        this.f3600q = str11;
        this.f3601r = j4;
    }
}
