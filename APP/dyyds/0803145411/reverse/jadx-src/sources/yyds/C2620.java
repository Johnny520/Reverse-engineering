package yyds;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* JADX INFO: renamed from: yyds.ᲈᛳᛳᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2620 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final boolean f12885 = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C1572 f12886;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2794 f12887;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C1985 f12888;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C0644 f12889;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0596 f12890;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C1607 f12891;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0913 f12892;

    public C2620(C0596 c0596, C2014 c2014, ExecutorServiceC1555 executorServiceC1555, ExecutorServiceC1555 executorServiceC15552, ExecutorServiceC1555 executorServiceC15553, ExecutorServiceC1555 executorServiceC15554) throws Throwable {
        this.f12890 = c0596;
        C0716 c0716 = new C0716(c2014);
        C0644 c0644 = new C0644(2);
        this.f12889 = c0644;
        synchronized (this) {
            try {
                synchronized (c0644) {
                    try {
                        try {
                            c0644.f3101 = this;
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
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                this.f12888 = new C1985(14);
                this.f12887 = new C2794(2);
                this.f12892 = new C0913(executorServiceC1555, executorServiceC15552, executorServiceC15553, executorServiceC15554, this, this);
                this.f12891 = new C1607(c0716);
                C1572 c1572 = new C1572();
                c1572.f7970 = new Handler(Looper.getMainLooper(), new C0759());
                this.f12886 = c1572;
                c0596.f2820 = this;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static void m4726(InterfaceC2162 interfaceC2162) {
        if (interfaceC2162 instanceof C2061) {
            ((C2061) interfaceC2162).m3919();
        } else {
            C0188.m798("Cannot release anything but an EngineResource");
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static void m4727(String str, C2061 c2061) {
        if (Log.isLoggable("GlideMemoryTracking", 3)) {
            Object obj = c2061.f10205.get();
            Bitmap bitmap = obj instanceof Bitmap ? (Bitmap) obj : obj instanceof BitmapDrawable ? ((BitmapDrawable) obj).getBitmap() : null;
            if (bitmap == null) {
                return;
            }
            Log.d("GlideMemoryTracking", "Engine [Device: " + Build.DEVICE + "]: Loaded bitmap [ID: " + System.identityHashCode(bitmap) + "] from memory cache (" + str + "). Size: [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] (" + AbstractC0181.m756(bitmap) + " bytes)");
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static void m4728(String str, long j, C1876 c1876) {
        Log.v("Engine", str + " in " + AbstractC1382.m2794(j) + "ms, key: " + c1876);
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final C0644 m4729(C2572 c2572, Object obj, InterfaceC1410 interfaceC1410, int i, int i2, Class cls, Class cls2, EnumC0296 enumC0296, C2340 c2340, C0410 c0410, boolean z, boolean z2, C0822 c0822, boolean z3, boolean z4, C0397 c0397, Executor executor, C1876 c1876, long j) {
        C2028 c2028 = (C2028) this.f12887.f13658.get(c1876);
        if (c2028 != null) {
            c2028.m3905(c0397, executor);
            if (f12885) {
                m4728("Added to existing load", j, c1876);
            }
            return new C0644(this, c0397, c2028);
        }
        C2028 c20282 = (C2028) ((C0644) this.f12892.f4160).mo1548();
        synchronized (c20282) {
            c20282.f10120 = c1876;
            c20282.f10109 = z3;
            c20282.f10107 = z4;
        }
        C1607 c1607 = this.f12891;
        RunnableC1650 runnableC1650 = (RunnableC1650) ((C0644) c1607.f8180).mo1548();
        int i3 = c1607.f8178;
        c1607.f8178 = i3 + 1;
        C1008 c1008 = runnableC1650.f8427;
        C0716 c0716 = runnableC1650.f8430;
        c1008.f4594 = c2572;
        c1008.f4597 = obj;
        c1008.f4580 = interfaceC1410;
        c1008.f4584 = i;
        c1008.f4596 = i2;
        c1008.f4595 = c2340;
        c1008.f4590 = cls;
        c1008.f4581 = c0716;
        c1008.f4591 = cls2;
        c1008.f4586 = enumC0296;
        c1008.f4583 = c0822;
        c1008.f4593 = c0410;
        c1008.f4589 = z;
        c1008.f4587 = z2;
        runnableC1650.f8423 = c2572;
        runnableC1650.f8418 = interfaceC1410;
        runnableC1650.f8419 = enumC0296;
        runnableC1650.f8404 = c1876;
        runnableC1650.f8402 = i;
        runnableC1650.f8410 = i2;
        runnableC1650.f8429 = c2340;
        runnableC1650.f8414 = c0822;
        runnableC1650.f8411 = c20282;
        runnableC1650.f8426 = i3;
        runnableC1650.f8422 = 1;
        runnableC1650.f8417 = obj;
        runnableC1650.f8416 = c2572.f12666;
        runnableC1650.f8413 = (Supplier) c0822.m1891(RunnableC1650.f8400);
        C2794 c2794 = this.f12887;
        c2794.getClass();
        c2794.f13658.put(c1876, c20282);
        c20282.m3905(c0397, executor);
        synchronized (c20282) {
            c20282.f10118 = runnableC1650;
            int iM3364 = runnableC1650.m3364(1);
            ((iM3364 == 2 || iM3364 == 3) ? c20282.f10108 : c20282.f10107 ? c20282.f10121 : c20282.f10110).execute(runnableC1650);
        }
        if (f12885) {
            m4728("Started new load", j, c1876);
        }
        return new C0644(this, c0397, c20282);
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final synchronized void m4730(C2028 c2028, C1876 c1876, C2061 c2061) {
        if (c2061 != null) {
            try {
                if (c2061.f10207) {
                    this.f12889.m1551(c1876, c2061);
                }
            } finally {
            }
        }
        C2794 c2794 = this.f12887;
        c2794.getClass();
        c2028.getClass();
        HashMap map = c2794.f13658;
        if (c2028 == map.get(c1876)) {
            map.remove(c1876);
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0644 m4731(C2572 c2572, Object obj, InterfaceC1410 interfaceC1410, int i, int i2, Class cls, Class cls2, EnumC0296 enumC0296, C2340 c2340, C0410 c0410, boolean z, boolean z2, C0822 c0822, boolean z3, boolean z4, C0397 c0397, ExecutorC1267 executorC1267) {
        long jElapsedRealtimeNanos;
        if (f12885) {
            int i3 = AbstractC1382.f6429;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f12888.getClass();
        C1876 c1876 = new C1876(obj, interfaceC1410, i, i2, c0410, cls, cls2, c0822);
        synchronized (this) {
            try {
                C2061 c2061M4732 = m4732(c1876, z3, jElapsedRealtimeNanos);
                if (c2061M4732 == null) {
                    return m4729(c2572, obj, interfaceC1410, i, i2, cls, cls2, enumC0296, c2340, c0410, z, z2, c0822, z3, z4, c0397, executorC1267, c1876, jElapsedRealtimeNanos);
                }
                c0397.m1151(c2061M4732, 5);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C2061 m4732(C1876 c1876, boolean z, long j) {
        C2061 c2061;
        Object obj;
        C2620 c2620;
        C1876 c18762;
        C2061 c20612;
        if (z) {
            C0644 c0644 = this.f12889;
            synchronized (c0644) {
                C0501 c0501 = (C0501) ((HashMap) c0644.f3099).get(c1876);
                if (c0501 == null) {
                    c2061 = null;
                } else {
                    c2061 = (C2061) c0501.get();
                    if (c2061 == null) {
                        c0644.m1549(c0501);
                    }
                }
            }
            if (c2061 != null) {
                c2061.m3918();
            }
            if (c2061 != null) {
                if (f12885) {
                    m4728("Loaded resource from active resources", j, c1876);
                }
                if (Log.isLoggable("GlideMemoryTracking", 3)) {
                    m4727("active", c2061);
                }
                return c2061;
            }
            C0596 c0596 = this.f12890;
            synchronized (c0596) {
                C2689 c2689 = (C2689) c0596.f10639.remove(c1876);
                if (c2689 == null) {
                    obj = null;
                } else {
                    c0596.f10641 -= (long) c2689.f13223;
                    obj = c2689.f13222;
                }
            }
            InterfaceC2162 interfaceC2162 = (InterfaceC2162) obj;
            if (interfaceC2162 == null) {
                c2620 = this;
                c18762 = c1876;
                c20612 = null;
            } else if (interfaceC2162 instanceof C2061) {
                c20612 = (C2061) interfaceC2162;
                c2620 = this;
                c18762 = c1876;
            } else {
                c2620 = this;
                c18762 = c1876;
                c20612 = new C2061(interfaceC2162, true, true, c18762, c2620);
            }
            if (c20612 != null) {
                c20612.m3918();
                c2620.f12889.m1551(c18762, c20612);
            }
            if (c20612 != null) {
                if (f12885) {
                    m4728("Loaded resource from cache", j, c18762);
                }
                if (Log.isLoggable("GlideMemoryTracking", 3)) {
                    m4727("cache", c20612);
                }
                return c20612;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m4733(InterfaceC1410 interfaceC1410, C2061 c2061) {
        C0644 c0644 = this.f12889;
        synchronized (c0644) {
            C0501 c0501 = (C0501) ((HashMap) c0644.f3099).remove(interfaceC1410);
            if (c0501 != null) {
                c0501.f2441 = null;
                c0501.clear();
            }
        }
        if (c2061.f10207) {
        } else {
            this.f12886.m3215(c2061, false);
        }
    }
}
