package p063e9;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: e9.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0832c {

    /* JADX INFO: renamed from: a */
    public final String f2510a;

    /* JADX INFO: renamed from: b */
    public final String f2511b;

    /* JADX INFO: renamed from: c */
    public final String f2512c;

    /* JADX INFO: renamed from: d */
    public final boolean f2513d;

    /* JADX INFO: renamed from: e */
    public final boolean f2514e;

    /* JADX INFO: renamed from: f */
    public final boolean f2515f;

    /* JADX INFO: renamed from: g */
    public final int f2516g;

    /* JADX INFO: renamed from: h */
    public final boolean f2517h;

    /* JADX INFO: renamed from: i */
    public final boolean f2518i;

    /* JADX INFO: renamed from: j */
    public final boolean f2519j;

    /* JADX INFO: renamed from: k */
    public final boolean f2520k;

    /* JADX INFO: renamed from: l */
    public final boolean f2521l;

    /* JADX INFO: renamed from: m */
    public final boolean f2522m;

    /* JADX INFO: renamed from: n */
    public final boolean f2523n;

    /* JADX INFO: renamed from: o */
    public final boolean f2524o;

    /* JADX INFO: renamed from: p */
    public final boolean f2525p;

    /* JADX INFO: renamed from: q */
    public final String f2526q;

    /* JADX INFO: renamed from: r */
    public final String f2527r;

    /* JADX INFO: renamed from: s */
    public final String f2528s;

    /* JADX INFO: renamed from: t */
    public final boolean f2529t;

    /* JADX INFO: renamed from: u */
    public final boolean f2530u;

    /* JADX INFO: renamed from: v */
    public final String f2531v;

    /* JADX INFO: renamed from: w */
    public final String f2532w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0832c(String str, String str2, String str3, boolean z9, boolean z10, boolean z11, int i9, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, String str4, String str5, String str6, boolean z21, boolean z22, String str7, String str8) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f2510a = str;
        this.f2511b = str2;
        this.f2512c = str3;
        this.f2513d = z9;
        this.f2514e = z10;
        this.f2515f = z11;
        this.f2516g = i9;
        this.f2517h = z12;
        this.f2518i = z13;
        this.f2519j = z14;
        this.f2520k = z15;
        this.f2521l = z16;
        this.f2522m = z17;
        this.f2523n = z18;
        this.f2524o = z19;
        this.f2525p = z20;
        this.f2526q = str4;
        this.f2527r = str5;
        this.f2528s = str6;
        this.f2529t = z21;
        this.f2530u = z22;
        this.f2531v = str7;
        this.f2532w = str8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0832c m2114a(C0832c c0832c, String str, String str2, String str3, boolean z9, boolean z10, boolean z11, int i9, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, String str4, String str5, String str6, boolean z21, boolean z22, String str7, String str8, int i10) {
        String str9 = (i10 & 1) != 0 ? c0832c.f2510a : str;
        String str10 = (i10 & 2) != 0 ? c0832c.f2511b : str2;
        String str11 = (i10 & 4) != 0 ? c0832c.f2512c : str3;
        boolean z23 = (i10 & 8) != 0 ? c0832c.f2513d : z9;
        boolean z24 = (i10 & 16) != 0 ? c0832c.f2514e : z10;
        boolean z25 = (i10 & 32) != 0 ? c0832c.f2515f : z11;
        int i11 = (i10 & 64) != 0 ? c0832c.f2516g : i9;
        boolean z26 = (i10 & 128) != 0 ? c0832c.f2517h : z12;
        boolean z27 = (i10 & Opcodes.ACC_NATIVE) != 0 ? c0832c.f2518i : z13;
        boolean z28 = (i10 & Opcodes.ACC_INTERFACE) != 0 ? c0832c.f2519j : z14;
        boolean z29 = (i10 & 1024) != 0 ? c0832c.f2520k : z15;
        boolean z30 = (i10 & Opcodes.ACC_STRICT) != 0 ? c0832c.f2521l : z16;
        boolean z31 = (i10 & 4096) != 0 ? c0832c.f2522m : z17;
        boolean z32 = (i10 & 8192) != 0 ? c0832c.f2523n : z18;
        String str12 = str9;
        boolean z33 = (i10 & 16384) != 0 ? c0832c.f2524o : z19;
        boolean z34 = (i10 & 32768) != 0 ? c0832c.f2525p : z20;
        String str13 = (i10 & 65536) != 0 ? c0832c.f2526q : str4;
        String str14 = (i10 & Opcodes.ACC_DEPRECATED) != 0 ? c0832c.f2527r : str5;
        String str15 = (i10 & Opcodes.ASM4) != 0 ? c0832c.f2528s : str6;
        boolean z35 = (i10 & 524288) != 0 ? c0832c.f2529t : z21;
        boolean z36 = (i10 & 1048576) != 0 ? c0832c.f2530u : z22;
        String str16 = (i10 & 2097152) != 0 ? c0832c.f2531v : str7;
        String str17 = (i10 & 4194304) != 0 ? c0832c.f2532w : str8;
        c0832c.getClass();
        str12.getClass();
        str10.getClass();
        str11.getClass();
        str13.getClass();
        str14.getClass();
        str15.getClass();
        str16.getClass();
        str17.getClass();
        return new C0832c(str12, str10, str11, z23, z24, z25, i11, z26, z27, z28, z29, z30, z31, z32, z33, z34, str13, str14, str15, z35, z36, str16, str17);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0832c)) {
            return false;
        }
        C0832c c0832c = (C0832c) obj;
        return AbstractC1416l.m3825a(this.f2510a, c0832c.f2510a) && AbstractC1416l.m3825a(this.f2511b, c0832c.f2511b) && AbstractC1416l.m3825a(this.f2512c, c0832c.f2512c) && this.f2513d == c0832c.f2513d && this.f2514e == c0832c.f2514e && this.f2515f == c0832c.f2515f && this.f2516g == c0832c.f2516g && this.f2517h == c0832c.f2517h && this.f2518i == c0832c.f2518i && this.f2519j == c0832c.f2519j && this.f2520k == c0832c.f2520k && this.f2521l == c0832c.f2521l && this.f2522m == c0832c.f2522m && this.f2523n == c0832c.f2523n && this.f2524o == c0832c.f2524o && this.f2525p == c0832c.f2525p && AbstractC1416l.m3825a(this.f2526q, c0832c.f2526q) && AbstractC1416l.m3825a(this.f2527r, c0832c.f2527r) && AbstractC1416l.m3825a(this.f2528s, c0832c.f2528s) && this.f2529t == c0832c.f2529t && this.f2530u == c0832c.f2530u && AbstractC1416l.m3825a(this.f2531v, c0832c.f2531v) && AbstractC1416l.m3825a(this.f2532w, c0832c.f2532w);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2532w.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2242e(this.f2516g, AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f2510a.hashCode() * 31, 31, this.f2511b), 31, this.f2512c), 31, this.f2513d), 31, this.f2514e), 31, this.f2515f), 31), 31, this.f2517h), 31, this.f2518i), 31, this.f2519j), 31, this.f2520k), 31, this.f2521l), 31, this.f2522m), 31, this.f2523n), 31, this.f2524o), 31, this.f2525p), 31, this.f2526q), 31, this.f2527r), 31, this.f2528s), 31, this.f2529t), 31, this.f2530u), 31, this.f2531v);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("CustomNotificationRule(id=", this.f2510a, ", talker=", this.f2511b, ", label=");
        sbM1027p.append(this.f2512c);
        sbM1027p.append(", group=");
        sbM1027p.append(this.f2513d);
        sbM1027p.append(", official=");
        AbstractC3199a.m6851x(sbM1027p, this.f2514e, ", enabled=", this.f2515f, ", mode=");
        sbM1027p.append(this.f2516g);
        sbM1027p.append(", vibrate=");
        sbM1027p.append(this.f2517h);
        sbM1027p.append(", sound=");
        AbstractC3199a.m6851x(sbM1027p, this.f2518i, ", markRead=", this.f2519j, ", quickReply=");
        AbstractC3199a.m6851x(sbM1027p, this.f2520k, ", quoteQuickReply=", this.f2521l, ", mergeByTalker=");
        AbstractC3199a.m6851x(sbM1027p, this.f2522m, ", showDetail=", this.f2523n, ", ignoreWechatDnd=");
        AbstractC3199a.m6851x(sbM1027p, this.f2524o, ", muteEnable=", this.f2525p, ", muteStart=");
        AbstractC2091b.m5173t(sbM1027p, this.f2526q, ", muteEnd=", this.f2527r, ", ringtone=");
        sbM1027p.append(this.f2528s);
        sbM1027p.append(", blockAtAll=");
        sbM1027p.append(this.f2529t);
        sbM1027p.append(", blockAtMe=");
        sbM1027p.append(this.f2530u);
        sbM1027p.append(", onlyMembers=");
        sbM1027p.append(this.f2531v);
        sbM1027p.append(", blockMembers=");
        return AbstractC0921a.m2255r(sbM1027p, this.f2532w, ")");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 boolean)
  (r30v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : false)
  (1 int)
  true
  true
  true
  false
  false
  false
  true
  false
  false
  ("23:00:00")
  ("07:00:00")
  (wrap:java.lang.String:SGET  A[WRAPPED] okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String)
  false
  false
  (wrap:java.lang.String:SGET  A[WRAPPED] okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String)
  (wrap:java.lang.String:SGET  A[WRAPPED] okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String):void (m)] (LINE:76) call: e9.c.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C0832c(String str, String str2, String str3, boolean z9, boolean z10, int i9) {
        this(str, str2, str3, z9, z10, (i9 & 32) != 0, 1, true, true, true, false, false, false, true, false, false, "23:00:00", "07:00:00", HttpUrl.FRAGMENT_ENCODE_SET, false, false, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
    }
}
