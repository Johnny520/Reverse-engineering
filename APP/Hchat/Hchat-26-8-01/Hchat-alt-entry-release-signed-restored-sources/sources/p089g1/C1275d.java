package p089g1;

import p116i.InterfaceC1796v;
import p117i0.InterfaceC1827f;
import p121i4.C1960b0;
import p125i8.C2005i;
import p183m8.InterfaceC2814b;

/* JADX INFO: renamed from: g1.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1275d implements InterfaceC1281j, InterfaceC1796v, InterfaceC1827f, InterfaceC2814b {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f4234h = 0;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4235g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [g1.r.<clinit>():void] */
    public /* synthetic */ C1275d(int i9) {
        this.f4235g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r1v0, (wrap:java.lang.Object:CAST), r2v0, (wrap:java.lang.Object:CAST) */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m3410d(Object obj, long j3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append((Object) " 超过 ");
        sb2.append(j3);
        sb2.append((Object) " KiB");
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: THROW 
  (wrap:i4.b0:0x0019: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT 
  ("expected type ")
  (r2v0 java.lang.Object)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (" but found "))
  (r3v0 java.lang.Object)
 A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:19))
  (null java.lang.Exception)
 A[MD:(java.lang.String, java.lang.Exception):void (m), WRAPPED] (LINE:26) call: i4.b0.<init>(java.lang.String, java.lang.Exception):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m3411e(Object obj, Object obj2) {
        throw new C1960b0("expected type " + obj + ((Object) " but found ") + obj2, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
  (wrap:java.lang.IllegalArgumentException:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r3v0 java.lang.String), (r2v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:11))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:15) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m3412f(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
  (wrap:java.lang.IllegalStateException:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r3v0 java.lang.String), (r2v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:11))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:15) call: java.lang.IllegalStateException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m3413g(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: THROW 
  (wrap:java.lang.IllegalStateException:0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:0x000c: INVOKE 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r1v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:9))
 VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:13))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:19) call: java.lang.IllegalStateException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m3414h(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p183m8.InterfaceC2814b
    /* JADX INFO: renamed from: a */
    public void mo3415a(String str) {
        C2005i.m4939f(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1796v
    /* JADX INFO: renamed from: b */
    public float mo3416b(float f3) {
        float f10;
        float f11;
        switch (this.f4235g) {
            case 12:
                if (f3 < 0.36363637f) {
                    return 7.5625f * f3 * f3;
                }
                if (f3 < 0.72727275f) {
                    float f12 = f3 - 0.54545456f;
                    f10 = 7.5625f * f12 * f12;
                    f11 = 0.75f;
                } else if (f3 < 0.90909094f) {
                    float f13 = f3 - 0.8181818f;
                    f10 = 7.5625f * f13 * f13;
                    f11 = 0.9375f;
                } else {
                    float f14 = f3 - 0.95454544f;
                    f10 = 7.5625f * f14 * f14;
                    f11 = 0.984375f;
                }
                return f10 + f11;
            default:
                return f3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089g1.InterfaceC1281j
    /* JADX INFO: renamed from: c */
    public double mo469c(double d10) {
        switch (this.f4235g) {
            case 0:
                float[] fArr = C1276e.f4236a;
                return C1276e.m3418b(C1276e.f4238c, d10);
            case 1:
                float[] fArr2 = C1276e.f4236a;
                return C1276e.m3417a(C1276e.f4238c, d10);
            case 2:
                float[] fArr3 = C1276e.f4236a;
                return C1276e.m3420d(C1276e.f4239d, d10);
            case 3:
                float[] fArr4 = C1276e.f4236a;
                return C1276e.m3419c(C1276e.f4239d, d10);
            default:
                return d10;
        }
    }

    @Override // p117i0.InterfaceC1827f
    public void cancel() {
    }
}
