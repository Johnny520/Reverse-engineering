package p364y8;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p000a.AbstractC0000a;
import p099h.Hchat.utils.KavaReflector;
import p126ia.C2026t;
import p258r8.C3742g;
import p300ub.AbstractC4302b;

/* JADX INFO: renamed from: y8.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6004d {

    /* JADX INFO: renamed from: j */
    public static final List f24373j = AbstractC0000a.m101y0("cnb", "p1o");

    /* JADX INFO: renamed from: k */
    public static final long[] f24374k = {80, 160, 320, 640, 1000, 1500};

    /* JADX INFO: renamed from: a */
    public final C2026t f24375a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f24376b;

    /* JADX INFO: renamed from: c */
    public final Handler f24377c;

    /* JADX INFO: renamed from: d */
    public final WeakHashMap f24378d;

    /* JADX INFO: renamed from: e */
    public final WeakHashMap f24379e;

    /* JADX INFO: renamed from: f */
    public final WeakHashMap f24380f;

    /* JADX INFO: renamed from: g */
    public final LinkedHashSet f24381g;

    /* JADX INFO: renamed from: h */
    public boolean f24382h;

    /* JADX INFO: renamed from: i */
    public volatile boolean f24383i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6004d(C3742g c3742g, C2026t c2026t) {
        c3742g.getClass();
        this.f24375a = c2026t;
        this.f24376b = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_auto_view_original_config");
        this.f24377c = new Handler(Looper.getMainLooper());
        this.f24378d = new WeakHashMap();
        this.f24379e = new WeakHashMap();
        this.f24380f = new WeakHashMap();
        this.f24381g = new LinkedHashSet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m10755a(Method method) {
        return (method == null || Modifier.isStatic(method.getModifiers()) || Modifier.isAbstract(method.getModifiers())) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m10756b(Object obj, String str) {
        Object field;
        Class<?> superclass = obj.getClass();
        while (true) {
            Object obj2 = null;
            if (superclass == null || superclass.equals(Object.class)) {
                break;
            }
            Iterator<T> it = KavaReflector.declaredFields(superclass).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Field field2 = (Field) next;
                if (!Modifier.isStatic(field2.getModifiers()) && field2.getType().getName().equals(str)) {
                    obj2 = next;
                    break;
                }
            }
            Field field3 = (Field) obj2;
            if (field3 != null && (field = KavaReflector.readField(field3, obj)) != null) {
                return field;
            }
            superclass = superclass.getSuperclass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m10757c(Activity activity, int i9, long j3) {
        WeakHashMap weakHashMap = this.f24378d;
        Runnable runnable = (Runnable) weakHashMap.remove(activity);
        Handler handler = this.f24377c;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        this.f24379e.put(activity, Integer.valueOf(i9));
        if (this.f24376b.getBoolean("auto_view_original_enable", false)) {
            Set set = (Set) this.f24380f.get(activity);
            if (set == null || !set.contains(Integer.valueOf(i9))) {
                RunnableC6003c runnableC6003c = new RunnableC6003c(this, activity, i9);
                weakHashMap.put(activity, runnableC6003c);
                if (j3 > 0) {
                    handler.postDelayed(runnableC6003c, j3);
                } else {
                    handler.post(runnableC6003c);
                }
            }
        }
    }
}
