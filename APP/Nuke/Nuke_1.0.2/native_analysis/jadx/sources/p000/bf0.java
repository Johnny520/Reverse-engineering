package p000;

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

    /* JADX INFO: renamed from: h */
    public static final boolean f829h = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a */
    public final l40 f830a;

    /* JADX INFO: renamed from: b */
    public final C0160eb f831b;

    /* JADX INFO: renamed from: c */
    public final yd1 f832c;

    /* JADX INFO: renamed from: d */
    public final ze0 f833d;

    /* JADX INFO: renamed from: e */
    public final C0559ox f834e;

    /* JADX INFO: renamed from: f */
    public final C0158e9 f835f;

    /* JADX INFO: renamed from: g */
    public final C0043b5 f836g;

    public bf0(yd1 yd1Var, C0485n4 c0485n4, aq0 aq0Var, aq0 aq0Var2, aq0 aq0Var3, aq0 aq0Var4) throws Throwable {
        this.f832c = yd1Var;
        af0 af0Var = new af0(c0485n4);
        C0043b5 c0043b5 = new C0043b5(0);
        this.f836g = c0043b5;
        synchronized (this) {
            try {
                try {
                    synchronized (c0043b5) {
                        try {
                            c0043b5.f564k = this;
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
                    this.f831b = new C0160eb(19);
                    this.f830a = new l40(2);
                    this.f833d = new ze0(aq0Var, aq0Var2, aq0Var3, aq0Var4, this, this);
                    this.f835f = new C0158e9(af0Var);
                    this.f834e = new C0559ox();
                    yd1Var.f13422k = this;
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

    /* JADX INFO: renamed from: c */
    public static void m521c(String str, hf0 hf0Var) {
        if (Log.isLoggable("GlideMemoryTracking", 3)) {
            Object obj = hf0Var.f3987j.get();
            Bitmap bitmap = obj instanceof Bitmap ? (Bitmap) obj : obj instanceof BitmapDrawable ? ((BitmapDrawable) obj).getBitmap() : null;
            if (bitmap == null) {
                return;
            }
            Log.d("GlideMemoryTracking", "Engine [Device: " + Build.DEVICE + "]: Loaded bitmap [ID: " + System.identityHashCode(bitmap) + "] from memory cache (" + str + "). Size: [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] (" + b93.m496c(bitmap) + " bytes)");
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m522d(String str, long j, gf0 gf0Var) {
        Log.v("Engine", str + " in " + tc1.m5161a(j) + "ms, key: " + gf0Var);
    }

    /* JADX INFO: renamed from: g */
    public static void m523g(d92 d92Var) {
        if (d92Var instanceof hf0) {
            ((hf0) d92Var).m2154c();
        } else {
            C0676s.m4651j("Cannot release anything but an EngineResource");
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0043b5 m524a(vp0 vp0Var, Object obj, a51 a51Var, int i, int i2, Class cls, Class cls2, i32 i32Var, b90 b90Var, C0663ro c0663ro, boolean z, boolean z2, ov1 ov1Var, boolean z3, boolean z4, yq2 yq2Var, dh0 dh0Var) {
        long jElapsedRealtimeNanos;
        if (f829h) {
            int i3 = tc1.f10678b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f831b.getClass();
        gf0 gf0Var = new gf0(obj, a51Var, i, i2, c0663ro, cls, cls2, ov1Var);
        synchronized (this) {
            try {
                hf0 hf0VarM525b = m525b(gf0Var, z3, jElapsedRealtimeNanos);
                if (hf0VarM525b == null) {
                    return m528h(vp0Var, obj, a51Var, i, i2, cls, cls2, i32Var, b90Var, c0663ro, z, z2, ov1Var, z3, z4, yq2Var, dh0Var, gf0Var, jElapsedRealtimeNanos);
                }
                yq2Var.m6309g(hf0VarM525b, 5);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final hf0 m525b(gf0 gf0Var, boolean z, long j) {
        hf0 hf0Var;
        Object obj;
        bf0 bf0Var;
        gf0 gf0Var2;
        hf0 hf0Var2;
        if (z) {
            C0043b5 c0043b5 = this.f836g;
            synchronized (c0043b5) {
                C0006a5 c0006a5 = (C0006a5) ((HashMap) c0043b5.f562i).get(gf0Var);
                if (c0006a5 == null) {
                    hf0Var = null;
                } else {
                    hf0Var = (hf0) c0006a5.get();
                    if (hf0Var == null) {
                        c0043b5.m424k(c0006a5);
                    }
                }
            }
            if (hf0Var != null) {
                hf0Var.m2153a();
            }
            if (hf0Var != null) {
                if (f829h) {
                    m522d("Loaded resource from active resources", j, gf0Var);
                }
                if (Log.isLoggable("GlideMemoryTracking", 3)) {
                    m521c("active", hf0Var);
                }
                return hf0Var;
            }
            yd1 yd1Var = this.f832c;
            synchronized (yd1Var) {
                vd1 vd1Var = (vd1) ((LinkedHashMap) yd1Var.f12468j).remove(gf0Var);
                if (vd1Var == null) {
                    obj = null;
                } else {
                    yd1Var.f12467i -= (long) vd1Var.f11910b;
                    obj = vd1Var.f11909a;
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
                hf0Var2.m2153a();
                bf0Var.f836g.m421h(gf0Var2, hf0Var2);
            }
            if (hf0Var2 != null) {
                if (f829h) {
                    m522d("Loaded resource from cache", j, gf0Var2);
                }
                if (Log.isLoggable("GlideMemoryTracking", 3)) {
                    m521c("cache", hf0Var2);
                }
                return hf0Var2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m526e(ff0 ff0Var, gf0 gf0Var, hf0 hf0Var) {
        if (hf0Var != null) {
            try {
                if (hf0Var.f3985h) {
                    this.f836g.m421h(gf0Var, hf0Var);
                }
            } finally {
            }
        }
        l40 l40Var = this.f830a;
        l40Var.getClass();
        ff0Var.getClass();
        HashMap map = l40Var.f5918a;
        if (ff0Var == map.get(gf0Var)) {
            map.remove(gf0Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m527f(a51 a51Var, hf0 hf0Var) {
        C0043b5 c0043b5 = this.f836g;
        synchronized (c0043b5) {
            C0006a5 c0006a5 = (C0006a5) ((HashMap) c0043b5.f562i).remove(a51Var);
            if (c0006a5 != null) {
                c0006a5.f61c = null;
                c0006a5.clear();
            }
        }
        if (hf0Var.f3985h) {
        } else {
            this.f834e.m3656j(hf0Var, false);
        }
    }

    /* JADX INFO: renamed from: h */
    public final C0043b5 m528h(vp0 vp0Var, Object obj, a51 a51Var, int i, int i2, Class cls, Class cls2, i32 i32Var, b90 b90Var, Map map, boolean z, boolean z2, ov1 ov1Var, boolean z3, boolean z4, yq2 yq2Var, Executor executor, gf0 gf0Var, long j) {
        ff0 ff0Var = (ff0) this.f830a.f5918a.get(gf0Var);
        if (ff0Var != null) {
            ff0Var.m1600a(yq2Var, executor);
            if (f829h) {
                m522d("Added to existing load", j, gf0Var);
            }
            return new C0043b5(this, yq2Var, ff0Var);
        }
        ff0 ff0Var2 = (ff0) this.f833d.f13858g.mo19c();
        synchronized (ff0Var2) {
            ff0Var2.f2941r = gf0Var;
            ff0Var2.f2942s = z3;
            ff0Var2.f2943t = z4;
        }
        C0158e9 c0158e9 = this.f835f;
        w40 w40Var = (w40) ((C0043b5) c0158e9.f2354k).mo19c();
        int i3 = c0158e9.f2352i;
        c0158e9.f2352i = i3 + 1;
        t40 t40Var = w40Var.f12328h;
        af0 af0Var = w40Var.f12331k;
        t40Var.f10539c = vp0Var;
        t40Var.f10540d = obj;
        t40Var.f10550n = a51Var;
        t40Var.f10541e = i;
        t40Var.f10542f = i2;
        t40Var.f10552p = b90Var;
        t40Var.f10543g = cls;
        t40Var.f10544h = af0Var;
        t40Var.f10547k = cls2;
        t40Var.f10551o = i32Var;
        t40Var.f10545i = ov1Var;
        t40Var.f10546j = map;
        t40Var.f10553q = z;
        t40Var.f10554r = z2;
        w40Var.f12335o = vp0Var;
        w40Var.f12336p = a51Var;
        w40Var.f12337q = i32Var;
        w40Var.f12338r = gf0Var;
        w40Var.f12339s = i;
        w40Var.f12340t = i2;
        w40Var.f12341u = b90Var;
        w40Var.f12342v = ov1Var;
        w40Var.f12343w = ff0Var2;
        w40Var.f12344x = i3;
        w40Var.f12326M = 1;
        w40Var.f12346z = obj;
        w40Var.f12314A = vp0Var.f12106h;
        w40Var.f12315B = (Supplier) ov1Var.m3643c(w40.f12313O);
        l40 l40Var = this.f830a;
        l40Var.getClass();
        l40Var.f5918a.put(gf0Var, ff0Var2);
        ff0Var2.m1600a(yq2Var, executor);
        synchronized (ff0Var2) {
            ff0Var2.f2929A = w40Var;
            int iM5841h = w40Var.m5841h(1);
            ((iM5841h == 2 || iM5841h == 3) ? ff0Var2.f2937n : ff0Var2.f2943t ? ff0Var2.f2939p : ff0Var2.f2938o).execute(w40Var);
        }
        if (f829h) {
            m522d("Started new load", j, gf0Var);
        }
        return new C0043b5(this, yq2Var, ff0Var2);
    }
}
