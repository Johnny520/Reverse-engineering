package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bf0 {
    public static final boolean h = Log.isLoggable("Engine", 2);
    public final l40 a;
    public final eb b;
    public final yd1 c;
    public final ze0 d;
    public final ox e;
    public final e9 f;
    public final b5 g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bf0(yd1 yd1Var, n4 n4Var, aq0 aq0Var, aq0 aq0Var2, aq0 aq0Var3, aq0 aq0Var4) throws Throwable {
        this.c = yd1Var;
        af0 af0Var = new af0(n4Var);
        b5 b5Var = new b5(0);
        this.g = b5Var;
        synchronized (this) {
            try {
                try {
                    synchronized (b5Var) {
                        try {
                            b5Var.k = this;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    }
                    this.b = new eb(19);
                    this.a = new l40(2);
                    this.d = new ze0(aq0Var, aq0Var2, aq0Var3, aq0Var4, this, this);
                    this.f = new e9(af0Var);
                    this.e = new ox();
                    yd1Var.k = this;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(String str, hf0 hf0Var) {
        if (Log.isLoggable("GlideMemoryTracking", 3)) {
            Object obj = hf0Var.j.get();
            Bitmap bitmap = obj instanceof Bitmap ? (Bitmap) obj : obj instanceof BitmapDrawable ? ((BitmapDrawable) obj).getBitmap() : null;
            if (bitmap == null) {
                return;
            }
            Log.d("GlideMemoryTracking", "Engine [Device: " + Build.DEVICE + "]: Loaded bitmap [ID: " + System.identityHashCode(bitmap) + "] from memory cache (" + str + "). Size: [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] (" + b93.c(bitmap) + " bytes)");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(String str, long j, gf0 gf0Var) {
        Log.v("Engine", str + " in " + tc1.a(j) + "ms, key: " + gf0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void g(d92 d92Var) {
        if (d92Var instanceof hf0) {
            ((hf0) d92Var).c();
        } else {
            s.j("Cannot release anything but an EngineResource");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final b5 a(vp0 vp0Var, Object obj, a51 a51Var, int i, int i2, Class cls, Class cls2, i32 i32Var, b90 b90Var, ro roVar, boolean z, boolean z2, ov1 ov1Var, boolean z3, boolean z4, yq2 yq2Var, dh0 dh0Var) {
        long jElapsedRealtimeNanos;
        if (h) {
            int i3 = tc1.b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.b.getClass();
        gf0 gf0Var = new gf0(obj, a51Var, i, i2, roVar, cls, cls2, ov1Var);
        synchronized (this) {
            try {
                hf0 hf0VarB = b(gf0Var, z3, jElapsedRealtimeNanos);
                if (hf0VarB == null) {
                    return h(vp0Var, obj, a51Var, i, i2, cls, cls2, i32Var, b90Var, roVar, z, z2, ov1Var, z3, z4, yq2Var, dh0Var, gf0Var, jElapsedRealtimeNanos);
                }
                yq2Var.g(hf0VarB, 5);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final hf0 b(gf0 gf0Var, boolean z, long j) {
        hf0 hf0Var;
        Object obj;
        bf0 bf0Var;
        gf0 gf0Var2;
        hf0 hf0Var2;
        if (z) {
            b5 b5Var = this.g;
            synchronized (b5Var) {
                a5 a5Var = (a5) ((HashMap) b5Var.i).get(gf0Var);
                if (a5Var == null) {
                    hf0Var = null;
                } else {
                    hf0Var = (hf0) a5Var.get();
                    if (hf0Var == null) {
                        b5Var.k(a5Var);
                    }
                }
            }
            if (hf0Var != null) {
                hf0Var.a();
            }
            if (hf0Var != null) {
                if (h) {
                    d("Loaded resource from active resources", j, gf0Var);
                }
                if (Log.isLoggable("GlideMemoryTracking", 3)) {
                    c("active", hf0Var);
                }
                return hf0Var;
            }
            yd1 yd1Var = this.c;
            synchronized (yd1Var) {
                vd1 vd1Var = (vd1) ((LinkedHashMap) yd1Var.j).remove(gf0Var);
                if (vd1Var == null) {
                    obj = null;
                } else {
                    yd1Var.i -= (long) vd1Var.b;
                    obj = vd1Var.a;
                }
            }
            d92 d92Var = (d92) obj;
            if (d92Var == null) {
                bf0Var = this;
                gf0Var2 = gf0Var;
                hf0Var2 = null;
            } else if (d92Var instanceof hf0) {
                hf0Var2 = (hf0) d92Var;
                bf0Var = this;
                gf0Var2 = gf0Var;
            } else {
                bf0Var = this;
                gf0Var2 = gf0Var;
                hf0Var2 = new hf0(d92Var, true, true, gf0Var2, bf0Var);
            }
            if (hf0Var2 != null) {
                hf0Var2.a();
                bf0Var.g.h(gf0Var2, hf0Var2);
            }
            if (hf0Var2 != null) {
                if (h) {
                    d("Loaded resource from cache", j, gf0Var2);
                }
                if (Log.isLoggable("GlideMemoryTracking", 3)) {
                    c("cache", hf0Var2);
                }
                return hf0Var2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void e(ff0 ff0Var, gf0 gf0Var, hf0 hf0Var) {
        if (hf0Var != null) {
            try {
                if (hf0Var.h) {
                    this.g.h(gf0Var, hf0Var);
                }
            } finally {
            }
        }
        l40 l40Var = this.a;
        l40Var.getClass();
        ff0Var.getClass();
        HashMap map = l40Var.a;
        if (ff0Var == map.get(gf0Var)) {
            map.remove(gf0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(a51 a51Var, hf0 hf0Var) {
        b5 b5Var = this.g;
        synchronized (b5Var) {
            a5 a5Var = (a5) ((HashMap) b5Var.i).remove(a51Var);
            if (a5Var != null) {
                a5Var.c = null;
                a5Var.clear();
            }
        }
        if (hf0Var.h) {
        } else {
            this.e.j(hf0Var, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final b5 h(vp0 vp0Var, Object obj, a51 a51Var, int i, int i2, Class cls, Class cls2, i32 i32Var, b90 b90Var, Map map, boolean z, boolean z2, ov1 ov1Var, boolean z3, boolean z4, yq2 yq2Var, Executor executor, gf0 gf0Var, long j) {
        ff0 ff0Var = (ff0) this.a.a.get(gf0Var);
        if (ff0Var != null) {
            ff0Var.a(yq2Var, executor);
            if (h) {
                d("Added to existing load", j, gf0Var);
            }
            return new b5(this, yq2Var, ff0Var);
        }
        ff0 ff0Var2 = (ff0) this.d.g.c();
        synchronized (ff0Var2) {
            ff0Var2.r = gf0Var;
            ff0Var2.s = z3;
            ff0Var2.t = z4;
        }
        e9 e9Var = this.f;
        w40 w40Var = (w40) ((b5) e9Var.k).c();
        int i3 = e9Var.i;
        e9Var.i = i3 + 1;
        t40 t40Var = w40Var.h;
        af0 af0Var = w40Var.k;
        t40Var.c = vp0Var;
        t40Var.d = obj;
        t40Var.n = a51Var;
        t40Var.e = i;
        t40Var.f = i2;
        t40Var.p = b90Var;
        t40Var.g = cls;
        t40Var.h = af0Var;
        t40Var.k = cls2;
        t40Var.o = i32Var;
        t40Var.i = ov1Var;
        t40Var.j = map;
        t40Var.q = z;
        t40Var.r = z2;
        w40Var.o = vp0Var;
        w40Var.p = a51Var;
        w40Var.q = i32Var;
        w40Var.r = gf0Var;
        w40Var.s = i;
        w40Var.t = i2;
        w40Var.u = b90Var;
        w40Var.v = ov1Var;
        w40Var.w = ff0Var2;
        w40Var.x = i3;
        w40Var.M = 1;
        w40Var.z = obj;
        w40Var.A = vp0Var.h;
        w40Var.B = (Supplier) ov1Var.c(w40.O);
        l40 l40Var = this.a;
        l40Var.getClass();
        l40Var.a.put(gf0Var, ff0Var2);
        ff0Var2.a(yq2Var, executor);
        synchronized (ff0Var2) {
            ff0Var2.A = w40Var;
            int iH = w40Var.h(1);
            ((iH == 2 || iH == 3) ? ff0Var2.n : ff0Var2.t ? ff0Var2.p : ff0Var2.o).execute(w40Var);
        }
        if (h) {
            d("Started new load", j, gf0Var);
        }
        return new b5(this, yq2Var, ff0Var2);
    }
}
