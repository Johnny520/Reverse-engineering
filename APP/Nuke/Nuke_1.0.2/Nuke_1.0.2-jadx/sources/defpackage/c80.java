package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c80 implements gd0, bq0, sq2, sa0, rh2, qi2, uk2, vm2 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [gd3.<clinit>():void, ka2.<clinit>():void, se.<clinit>():void, sn.<clinit>():void] */
    public /* synthetic */ c80(int i) {
        this.h = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
  (wrap:java.lang.RuntimeException:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r3v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:11))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:15) call: java.lang.RuntimeException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:92) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void A(String str, Object obj) {
        throw new RuntimeException(str + obj);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.lang.ClassCastException:0x0002: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:3) call: java.lang.ClassCastException.<init>():void type: CONSTRUCTOR)
 (LINE:42) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void g() {
        throw new ClassCastException();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: THROW 
  (wrap:java.lang.IllegalStateException:0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:0x0002: INVOKE (r1v0 java.lang.Object) VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:3))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:7) call: java.lang.IllegalStateException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:51) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void h(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: THROW 
  (wrap:java.lang.IllegalStateException:0x0017: CONSTRUCTOR 
  (wrap:java.lang.String:0x0013: INVOKE 
  (wrap:java.lang.String:STR_CONCAT ("network interceptor "), (r2v0 java.lang.Object), (r3v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:14))
 VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:20))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:24) call: java.lang.IllegalStateException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:92) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void i(Object obj, Object obj2) {
        throw new IllegalStateException(("network interceptor " + obj + obj2).toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.lang.RuntimeException:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c), WRAPPED] (LINE:3) call: java.lang.RuntimeException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:51) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void j(String str) {
        throw new RuntimeException(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: THROW 
  (wrap:java.lang.IllegalStateException:0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:0x000e: INVOKE 
  (wrap:java.lang.String:STR_CONCAT (r1v0 java.lang.String), (r2v0 int) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:9))
 VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:15))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:19) call: java.lang.IllegalStateException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:92) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void k(String str, int i) {
        throw new IllegalStateException((str + i).toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
  (wrap:java.lang.IllegalStateException:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r3v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:11))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:15) call: java.lang.IllegalStateException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:92) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void m(String str, Object obj) {
        throw new IllegalStateException(str + obj);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: THROW 
  (wrap:java.lang.IllegalArgumentException:0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:0x0011: INVOKE 
  (wrap:java.lang.String:STR_CONCAT (r1v0 java.lang.String), (r2v0 java.lang.Object), (r3v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:12))
 VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:18))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:22) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:199) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void n(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
  (wrap:java.lang.RuntimeException:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r3v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:11))
  (r4v0 java.lang.Throwable)
 A[MD:(java.lang.String, java.lang.Throwable):void (c), WRAPPED] (LINE:15) call: java.lang.RuntimeException.<init>(java.lang.String, java.lang.Throwable):void type: CONSTRUCTOR)
 (LINE:199) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void o(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: THROW 
  (wrap:sd2:0x0008: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 int)
  (r10v0 java.util.Map)
  (r11v0 java.lang.Throwable)
  (r12v0 int)
 A[MD:(java.lang.String, java.lang.String, boolean, java.util.Map, java.lang.Throwable, int):void (m), WRAPPED] (LINE:9) call: sd2.<init>(java.lang.String, java.lang.String, boolean, java.util.Map, java.lang.Throwable, int):void type: CONSTRUCTOR)
 (LINE:988) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void p(String str, String str2, int i, Map map, Throwable th, int i2) {
        throw new sd2(str, str2, i, map, th, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void q(StringBuilder sb, int i) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void r(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW (wrap:pv:0x0002: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:3) call: pv.<init>():void type: CONSTRUCTOR) (LINE:42) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void s() {
        throw new pv();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.lang.UnsupportedOperationException:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c), WRAPPED] (LINE:3) call: java.lang.UnsupportedOperationException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:51) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void t(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: THROW 
  (wrap:java.lang.IllegalStateException:0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:0x000e: INVOKE 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r3v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:11))
 VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:15))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:19) call: java.lang.IllegalStateException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:92) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void u(String str, Object obj) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.io.IOException:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c), WRAPPED] (LINE:3) call: java.io.IOException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:51) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void v(String str) throws IOException {
        throw new IOException(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
  (wrap:java.io.IOException:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r1v0 java.lang.String), (r2v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:9))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:15) call: java.io.IOException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:92) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void w(String str, Object obj) throws IOException {
        throw new IOException(str + obj);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.lang.SecurityException:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c), WRAPPED] (LINE:3) call: java.lang.SecurityException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:51) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void x(String str) {
        throw new SecurityException(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: THROW 
  (wrap:java.lang.IllegalStateException:0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:0x000e: INVOKE 
  (wrap:java.lang.String:STR_CONCAT (r1v0 java.lang.String), (r2v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:9))
 VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:15))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:19) call: java.lang.IllegalStateException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:92) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void y(String str, Object obj) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: THROW 
  (wrap:java.lang.IllegalArgumentException:0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:0x000e: INVOKE 
  (wrap:java.lang.String:STR_CONCAT (r1v0 java.lang.String), (r2v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:9))
 VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:15))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:19) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:92) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void z(String str, Object obj) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sq2
    public boolean a() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vm2
    public tm2 c(er2 er2Var) {
        switch (this.h) {
            case 27:
                bo0 bo0Var = (bo0) er2Var.k;
                return new tm2(bo0Var.a(bo0Var.b), bo0Var.a(bo0Var.c), er2Var.b() == u20.h);
            case 28:
                return tl.c(er2Var, sn.S);
            default:
                return tl.c(er2Var, gd3.G);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.uk2
    public vk2 d(th2 th2Var) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bq0
    public Object get() {
        if (Build.VERSION.SDK_INT == 34) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
            Bitmap bitmapCopy = bitmapCreateBitmap.copy(Bitmap.Config.HARDWARE, false);
            bitmapCreateBitmap.recycle();
            z = bitmapCopy == null;
            if (Log.isLoggable("GainmapWorkaroundCalc", 2)) {
                Log.v("GainmapWorkaroundCalc", "calculateNeedsGainmapDecodeWorkaround=" + z);
            }
            if (bitmapCopy != null) {
                bitmapCopy.recycle();
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qi2
    public pi2 l(th2 th2Var) {
        return new pi2(fe0.h, false, false, false, false, false);
    }

    @Override // defpackage.gd0
    public float b(float f) {
        return f;
    }

    @Override // defpackage.sa0
    public double e(double d) {
        return d;
    }

    @Override // defpackage.rh2
    public void f(qh2 qh2Var) {
    }
}
