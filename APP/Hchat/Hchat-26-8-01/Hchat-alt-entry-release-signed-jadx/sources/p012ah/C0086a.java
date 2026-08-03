package p012ah;

import af.C0084g;
import be.C0277e;
import com.alibaba.fastjson2.JSONException;
import p065eb.C0876k;
import p077f8.C1087g;
import p077f8.InterfaceC1084d;
import p089g1.InterfaceC1281j;
import p099h.Hchat.ModuleEntry;
import p099h.Hchat.hooks.items.script.ScriptMessageBean;
import p136j8.InterfaceC2102m;
import p199nd.AbstractC2963b0;

/* JADX INFO: renamed from: ah.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0086a implements InterfaceC2102m, InterfaceC1084d, InterfaceC1281j {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f252g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [h.Hchat.ModuleEntry.handleLoadPackage(de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam):void] */
    public /* synthetic */ C0086a(int i9) {
        this.f252g = i9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.lang.ClassCastException:0x0002: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:3) call: java.lang.ClassCastException.<init>():void type: CONSTRUCTOR)
 (LINE:27) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m445d() {
        throw new ClassCastException();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: THROW 
  (wrap:com.alibaba.fastjson2.JSONException:0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT 
  (r3v0 java.lang.String)
  (r1v0 int)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (", char "))
  (wrap:char:?: CAST (char) (r2v0 int))
 A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:17))
 A[MD:(java.lang.String):void (m), WRAPPED] (LINE:23) call: com.alibaba.fastjson2.JSONException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:109) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m446e(int i9, int i10, String str) {
        throw new JSONException(str + i9 + ((Object) ", char ") + ((char) i10));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: THROW 
  (wrap:com.alibaba.fastjson2.JSONException:0x0014: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r4v0 java.lang.String), (r2v0 java.lang.Object), (r3v0 java.lang.Object), (r1v0 int) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:15))
 A[MD:(java.lang.String):void (m), WRAPPED] (LINE:21) call: com.alibaba.fastjson2.JSONException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:174) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m447f(int i9, Object obj, Object obj2, String str) {
        throw new JSONException(str + obj + obj2 + i9);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
  (wrap:com.alibaba.fastjson2.JSONException:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r3v0 java.lang.String), (wrap:char:?: CAST (char) (r2v0 int)) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:11))
 A[MD:(java.lang.String):void (m), WRAPPED] (LINE:15) call: com.alibaba.fastjson2.JSONException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m448g(int i9, String str) {
        throw new JSONException(str + ((char) i9));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: THROW 
  (wrap:java.lang.IllegalStateException:0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:0x0002: INVOKE (r1v0 java.lang.Object) VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:3))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:7) call: java.lang.IllegalStateException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:35) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m449h(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
  (wrap:com.alibaba.fastjson2.JSONException:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r1v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:9))
 A[MD:(java.lang.String):void (m), WRAPPED] (LINE:15) call: com.alibaba.fastjson2.JSONException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m450i(Object obj, String str) {
        throw new JSONException(str + obj);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: THROW 
  (wrap:java.lang.IllegalArgumentException:0x0017: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT 
  (r3v0 java.lang.String)
  (r2v0 java.lang.Object)
  (r4v0 java.lang.Object)
  (r5v0 java.lang.Object)
  (wrap:char:?: CAST (char) (r6v0 int))
 A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:20))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:24) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:260) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m451j(Object obj, String str, Object obj2, Object obj3, int i9) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i9));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:af.g:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c), WRAPPED] (LINE:3) call: af.g.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:35) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m452k(String str) {
        throw new C0084g(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0021: THROW 
  (wrap:com.alibaba.fastjson2.JSONException:0x001e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT 
  (r1v0 java.lang.String)
  (r4v0 java.lang.Object)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (", offset "))
  (r2v0 int)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) ("/"))
  (r3v0 int)
 A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:25))
 A[MD:(java.lang.String):void (m), WRAPPED] (LINE:31) call: com.alibaba.fastjson2.JSONException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:174) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m453l(String str, int i9, int i10, Object obj) {
        throw new JSONException(str + obj + ((Object) ", offset ") + i9 + ((Object) "/") + i10);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: THROW 
  (wrap:com.alibaba.fastjson2.JSONException:0x0014: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r1v0 java.lang.String), (r2v0 java.lang.Object), (r3v0 java.lang.Object), (r4v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:15))
 A[MD:(java.lang.String):void (m), WRAPPED] (LINE:21) call: com.alibaba.fastjson2.JSONException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:174) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m454m(String str, Object obj, Object obj2, Object obj3) {
        throw new JSONException(str + obj + obj2 + obj3);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: THROW 
  (wrap:com.alibaba.fastjson2.JSONException:0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r3v0 java.lang.Object), (r4v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:14))
  (r5v0 java.lang.Throwable)
 A[MD:(java.lang.String, java.lang.Throwable):void (m), WRAPPED] (LINE:18) call: com.alibaba.fastjson2.JSONException.<init>(java.lang.String, java.lang.Throwable):void type: CONSTRUCTOR)
 (LINE:174) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m455n(String str, Object obj, Object obj2, Throwable th2) {
        throw new JSONException(str + obj + obj2, th2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
  (wrap:com.alibaba.fastjson2.JSONException:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r1v0 java.lang.String), (r2v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:9))
  (r3v0 java.lang.Throwable)
 A[MD:(java.lang.String, java.lang.Throwable):void (m), WRAPPED] (LINE:15) call: com.alibaba.fastjson2.JSONException.<init>(java.lang.String, java.lang.Throwable):void type: CONSTRUCTOR)
 (LINE:109) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m456o(String str, Object obj, Throwable th2) {
        throw new JSONException(str + obj, th2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.lang.RuntimeException:0x0002: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.Throwable) A[MD:(java.lang.String, java.lang.Throwable):void (c), WRAPPED] (LINE:3) call: java.lang.RuntimeException.<init>(java.lang.String, java.lang.Throwable):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m457p(String str, Throwable th2) {
        throw new RuntimeException(str, th2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: THROW 
  (wrap:java.lang.IllegalArgumentException:0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:0x0000: INVOKE (r0v0 java.lang.String), (r1v0 java.lang.Object[]) STATIC call: java.lang.String.format(java.lang.String, java.lang.Object[]):java.lang.String A[MD:(java.lang.String, java.lang.Object[]):java.lang.String VARARG (c), VARARG_CALL, WRAPPED] (LINE:1))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:7) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m458q(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m459r(StringBuilder sb2, Object obj) {
        sb2.append(obj);
        throw new JSONException(sb2.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m460s(StringBuilder sb2, Object obj, Object obj2) {
        sb2.append(obj);
        sb2.append(obj2);
        throw new JSONException(sb2.toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
  (wrap:com.alibaba.fastjson2.JSONException:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (wrap:char:?: CAST (char) (r1v0 int)) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:9))
 A[MD:(java.lang.String):void (m), WRAPPED] (LINE:15) call: com.alibaba.fastjson2.JSONException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m461t(int i9, String str) {
        throw new JSONException(str + ((char) i9));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: THROW 
  (wrap:java.lang.NumberFormatException:0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT ("For input string: ""), (r2v0 java.lang.Object), (wrap:java.lang.Object:?: CAST (java.lang.Object) (""")) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:16))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:22) call: java.lang.NumberFormatException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:35) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m462u(Object obj) {
        throw new NumberFormatException("For input string: \"" + obj + ((Object) "\""));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
  (wrap:com.alibaba.fastjson2.JSONException:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r3v0 java.lang.String), (r2v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:11))
 A[MD:(java.lang.String):void (m), WRAPPED] (LINE:15) call: com.alibaba.fastjson2.JSONException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m463v(Object obj, String str) {
        throw new JSONException(str + obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m464w(String str) {
        throw new JSONException(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m465x(String str, Throwable th2) {
        throw new JSONException(str, th2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
  (wrap:com.alibaba.fastjson2.JSONException:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r1v0 int) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:9))
 A[MD:(java.lang.String):void (m), WRAPPED] (LINE:15) call: com.alibaba.fastjson2.JSONException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m466y(int i9, String str) {
        throw new JSONException(str + i9);
    }

    /* JADX DEBUG: Class process forced to load method for inline: h.Hchat.ModuleEntry.b(java.lang.String):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p136j8.InterfaceC2102m
    /* JADX INFO: renamed from: a */
    public void mo467a(String str) {
        ModuleEntry.lambda$handleLoadPackage$0(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p077f8.InterfaceC1084d
    /* JADX INFO: renamed from: b */
    public void mo468b(Object obj) {
        C1087g c1087g = (C1087g) obj;
        C0876k c0876k = C0876k.f2687a;
        c1087g.getClass();
        C0876k.m2183i(new ScriptMessageBean(c1087g));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089g1.InterfaceC1281j
    /* JADX INFO: renamed from: c */
    public double mo469c(double d10) {
        double d11;
        switch (this.f252g) {
            case 28:
                double dPow = d10 < 0.0d ? -d10 : d10;
                if (dPow >= 0.0031308049535603718d) {
                    dPow = Math.pow(dPow, 0.4166666666666667d) - 0.05213270142180095d;
                    d11 = 0.9478672985781991d;
                } else {
                    d11 = 0.07739938080495357d;
                }
                return Math.copySign(dPow / d11, d10);
            default:
                double d12 = d10 < 0.0d ? -d10 : d10;
                return Math.copySign(d12 >= 0.04045d ? Math.pow((0.9478672985781991d * d12) + 0.05213270142180095d, 2.4d) : d12 * 0.07739938080495357d, d10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public void m470z(AbstractC2963b0 abstractC2963b0, int i9) {
        switch (this.f252g) {
            case 25:
                C0277e.m1118i(abstractC2963b0, i9);
                break;
            case 26:
                C0277e.m1118i(abstractC2963b0, i9);
                break;
            default:
                C0277e.m1118i(abstractC2963b0, i9);
                break;
        }
    }
}
