package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements np, sa0, gs1 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ci0.i(java.lang.String, in0, boolean, px, int):void, gf1.f(x13, in0, px, int):void, gf1.i(java.util.List, java.lang.String, in0, px, int):void, sz0.D(j63, boolean):gs1, te.c(java.util.List, px, int):void, te.h(java.util.List, px, int):void] */
    public /* synthetic */ s(int i) {
        this.h = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW (wrap:pv:0x0002: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:3) call: pv.<init>():void type: CONSTRUCTOR) (LINE:42) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void b() {
        throw new pv();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: THROW 
  (wrap:java.lang.IllegalArgumentException:0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:0x0002: INVOKE (r1v0 java.lang.Object) VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:3))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:7) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:51) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void c(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.lang.IndexOutOfBoundsException:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c), WRAPPED] (LINE:3) call: java.lang.IndexOutOfBoundsException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:51) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void d(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: THROW 
  (wrap:java.lang.IllegalArgumentException:0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:0x000e: INVOKE 
  (wrap:java.lang.String:STR_CONCAT (r1v0 java.lang.String), (r2v0 long) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:9))
 VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:15))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:19) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:92) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void f(String str, long j) {
        throw new IllegalArgumentException((str + j).toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
  (wrap:java.lang.IllegalArgumentException:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r3v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:11))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:15) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:92) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void g(String str, Object obj) {
        throw new IllegalArgumentException(str + obj);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: THROW 
  (wrap:java.lang.IllegalStateException:0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:0x0011: INVOKE 
  (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r3v0 java.lang.Object), (r4v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:14))
 VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:18))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:22) call: java.lang.IllegalStateException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:199) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void h(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.lang.AssertionError:0x0002: CONSTRUCTOR (r1v0 java.lang.Object) A[MD:(java.lang.Object):void (c), WRAPPED] (LINE:3) call: java.lang.AssertionError.<init>(java.lang.Object):void type: CONSTRUCTOR)
 (LINE:51) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void i(Object obj) {
        throw new AssertionError(obj);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.lang.IllegalArgumentException:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c), WRAPPED] (LINE:3) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:51) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void j(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: THROW 
  (wrap:java.lang.IllegalStateException:0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:0x000c: INVOKE 
  (wrap:java.lang.String:STR_CONCAT (r1v0 java.lang.String), (r2v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:9))
 VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:13))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:19) call: java.lang.IllegalStateException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:92) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void k(String str, Object obj) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
  (wrap:java.lang.IllegalStateException:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c), WRAPPED] (LINE:3) call: java.lang.IllegalStateException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:51) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void l(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: THROW 
  (wrap:t31:0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT 
  (r2v0 java.lang.String)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (wrap:java.lang.String:0x0007: INVOKE (r3v0 java.lang.Object) VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:8)))
 A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:15))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:19) call: t31.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:92) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void m(String str, Object obj) {
        throw new t31(str + ((Object) obj.toString()));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
  (wrap:java.lang.IllegalStateException:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT (r1v0 java.lang.String), (r2v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:9))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:15) call: java.lang.IllegalStateException.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:92) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void n(String str, Object obj) {
        throw new IllegalStateException(str + obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gs1
    public Object a() {
        switch (this.h) {
            case 19:
                return new mb1(true);
            case AIChatConfig.MaxContextRounds /* 20 */:
                return new LinkedHashMap();
            case 21:
                return new TreeMap();
            case 22:
                return new ConcurrentHashMap();
            case 23:
                return new ConcurrentSkipListMap();
            case 24:
                return new ArrayList();
            case 25:
                return new LinkedHashSet();
            case 26:
                return new TreeSet();
            default:
                return new ArrayDeque();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sa0
    public double e(double d) {
        switch (this.h) {
            case 11:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 12:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 13:
                float[] fArr = uu.a;
                return uu.b(uu.c, d);
            case 14:
                float[] fArr2 = uu.a;
                return uu.a(uu.c, d);
            case 15:
                float[] fArr3 = uu.a;
                return uu.d(uu.d, d);
            default:
                float[] fArr4 = uu.a;
                return uu.c(uu.d, d);
        }
    }

    @Override // defpackage.np
    public void cancel() {
    }
}
