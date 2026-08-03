package p010aa;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.util.Set;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import tf.C4175v;

/* JADX INFO: renamed from: aa.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0033a {

    /* JADX INFO: renamed from: a */
    public final String f103a;

    /* JADX INFO: renamed from: b */
    public final String f104b;

    /* JADX INFO: renamed from: c */
    public final String f105c;

    /* JADX INFO: renamed from: d */
    public final String f106d;

    /* JADX INFO: renamed from: e */
    public final boolean f107e;

    /* JADX INFO: renamed from: f */
    public final String f108f;

    /* JADX INFO: renamed from: g */
    public final Set f109g;

    /* JADX INFO: renamed from: h */
    public final boolean f110h;

    /* JADX INFO: renamed from: i */
    public final boolean f111i;

    /* JADX INFO: renamed from: j */
    public final Set f112j;

    /* JADX INFO: renamed from: k */
    public final String f113k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0033a(String str, String str2, String str3, String str4, boolean z9, String str5, Set set, boolean z10, boolean z11, Set set2, String str6) {
        str3.getClass();
        str4.getClass();
        this.f103a = str;
        this.f104b = str2;
        this.f105c = str3;
        this.f106d = str4;
        this.f107e = z9;
        this.f108f = str5;
        this.f109g = set;
        this.f110h = z10;
        this.f111i = z11;
        this.f112j = set2;
        this.f113k = str6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0033a m290a(C0033a c0033a, String str, String str2, String str3, boolean z9, String str4, Set set, boolean z10, boolean z11, Set set2, String str5, int i9) {
        if ((i9 & 1) != 0) {
            str = c0033a.f103a;
        }
        String str6 = str;
        String str7 = (i9 & 2) != 0 ? c0033a.f104b : str2;
        String str8 = (i9 & 4) != 0 ? c0033a.f105c : str3;
        String str9 = c0033a.f106d;
        boolean z12 = (i9 & 16) != 0 ? c0033a.f107e : z9;
        String str10 = (i9 & 32) != 0 ? c0033a.f108f : str4;
        boolean z13 = (i9 & 128) != 0 ? c0033a.f110h : z10;
        boolean z14 = (i9 & Opcodes.ACC_NATIVE) != 0 ? c0033a.f111i : z11;
        Set set3 = (i9 & Opcodes.ACC_INTERFACE) != 0 ? c0033a.f112j : set2;
        String str11 = (i9 & 1024) != 0 ? c0033a.f113k : str5;
        c0033a.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        str10.getClass();
        set.getClass();
        set3.getClass();
        str11.getClass();
        return new C0033a(str6, str7, str8, str9, z12, str10, set, z13, z14, set3, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0033a)) {
            return false;
        }
        C0033a c0033a = (C0033a) obj;
        return AbstractC1416l.m3825a(this.f103a, c0033a.f103a) && AbstractC1416l.m3825a(this.f104b, c0033a.f104b) && AbstractC1416l.m3825a(this.f105c, c0033a.f105c) && AbstractC1416l.m3825a(this.f106d, c0033a.f106d) && this.f107e == c0033a.f107e && AbstractC1416l.m3825a(this.f108f, c0033a.f108f) && AbstractC1416l.m3825a(this.f109g, c0033a.f109g) && this.f110h == c0033a.f110h && this.f111i == c0033a.f111i && AbstractC1416l.m3825a(this.f112j, c0033a.f112j) && AbstractC1416l.m3825a(this.f113k, c0033a.f113k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f113k.hashCode() + ((this.f112j.hashCode() + AbstractC0921a.m2245h(AbstractC0921a.m2245h((this.f109g.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2245h(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f103a.hashCode() * 31, 31, this.f104b), 31, this.f105c), 31, this.f106d), 31, this.f107e), 31, this.f108f)) * 31, 31, this.f110h), 31, this.f111i)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("MessageBlockBinding(id=", this.f103a, ", targetType=", this.f104b, ", targetId=");
        AbstractC2091b.m5173t(sbM1027p, this.f105c, ", label=", this.f106d, ", enabled=");
        sbM1027p.append(this.f107e);
        sbM1027p.append(", action=");
        sbM1027p.append(this.f108f);
        sbM1027p.append(", templateIds=");
        sbM1027p.append(this.f109g);
        sbM1027p.append(", customRules=");
        sbM1027p.append(this.f110h);
        sbM1027p.append(", typeAll=");
        sbM1027p.append(this.f111i);
        sbM1027p.append(", types=");
        sbM1027p.append(this.f112j);
        sbM1027p.append(", textKeywords=");
        return AbstractC0921a.m2255r(sbM1027p, this.f113k, ")");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 boolean)
  (r18v0 java.lang.String)
  (r19v0 java.util.Set)
  false
  false
  (wrap:tf.v:0x0000: SGET  A[WRAPPED] (LINE:33) tf.v.g tf.v)
  (wrap:java.lang.String:SGET  A[WRAPPED] okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.util.Set, boolean, boolean, java.util.Set, java.lang.String):void (m)] (LINE:35) call: aa.a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.util.Set, boolean, boolean, java.util.Set, java.lang.String):void type: THIS */
    public /* synthetic */ C0033a(String str, String str2, String str3, String str4, boolean z9, String str5, Set set) {
        this(str, str2, str3, str4, z9, str5, set, false, false, C4175v.f13712g, HttpUrl.FRAGMENT_ENCODE_SET);
    }
}
