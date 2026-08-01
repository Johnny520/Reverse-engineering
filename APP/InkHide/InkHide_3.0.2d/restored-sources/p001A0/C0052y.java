package p001A0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.Window;
import com.p055lu.wxmask.MainHook;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p009E0.C0104d;
import p027N0.AbstractC0223g;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0514f;
import p070i0.AbstractC0731a;
import p102z0.AbstractC1135r;

/* JADX INFO: renamed from: A0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0052y {

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArrayList f291a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f292b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f293c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f294d = new AtomicBoolean(false);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m96a(Activity activity, Context context, String str) {
        Object c0104d;
        Window window;
        View decorView;
        AtomicBoolean atomicBoolean = f294d;
        if (atomicBoolean.get()) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = f291a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : copyOnWriteArrayList) {
            C0048u c0048u = (C0048u) obj;
            if (((Boolean) c0048u.f284c.mo7b()).booleanValue() && !((Boolean) c0048u.f285d.mo7b()).booleanValue()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        SharedPreferences sharedPreferences = AbstractC0503h.m991x().getSharedPreferences("hook_point_cache", 0);
        AbstractC0223g.m417d(sharedPreferences, "getSharedPreferences(...)");
        String string = sharedPreferences.getString("unified_dexkit_scan_status_v16", null);
        if (string != null) {
            try {
                c0104d = new JSONObject(string);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            JSONObject jSONObject = (JSONObject) (c0104d instanceof C0104d ? null : c0104d);
            if (jSONObject != null) {
                int iOptInt = jSONObject.optInt("versionCode", -1);
                String strOptString = jSONObject.optString("versionName");
                if (jSONObject.optBoolean("shown", false) && iOptInt == AbstractC1135r.m2494p() && AbstractC0223g.m414a(strOptString, AbstractC1135r.m2495q()) && AbstractC0223g.m414a(jSONObject.optString("packageFingerprint"), AbstractC1135r.m2491m())) {
                    AbstractC0731a.m1384a("统一扫描提示已跳过，已显示过", str);
                    return;
                }
            }
        }
        if (!atomicBoolean.compareAndSet(false, true) || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.post(new RunnableC0040m(activity, arrayList, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static int m97b(Context context, int i2) {
        return (int) ((i2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m98c(Context context, C0048u c0048u) {
        AbstractC0223g.m418e(context, "context");
        CopyOnWriteArrayList copyOnWriteArrayList = f291a;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (AbstractC0223g.m414a(((C0048u) it.next()).f282a, c0048u.f282a)) {
                    break;
                }
            }
            copyOnWriteArrayList.add(c0048u);
        } else {
            copyOnWriteArrayList.add(c0048u);
        }
        if (!MainHook.uniqueMetaStore.contains("unified-dexkit-scan-prompt")) {
            ClassLoader classLoader = context.getClassLoader();
            AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
            Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader, "com.tencent.mm.ui.LauncherUI");
            if (clsMo1021l == null) {
                AbstractC0731a.m1387d("unified dexkit launcher class missing", context.getClassLoader());
            } else if (f292b.compareAndSet(false, true)) {
                AbstractC0514f.m1025b(clsMo1021l, "onResume", new C0051x(0));
                MainHook.uniqueMetaStore.add("unified-dexkit-scan-prompt");
            }
        }
        if (MainHook.uniqueMetaStore.contains("unified-dexkit-scan-lifecycle-prompt")) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null && f293c.compareAndSet(false, true)) {
            application.registerActivityLifecycleCallbacks(new C0050w());
            MainHook.uniqueMetaStore.add("unified-dexkit-scan-lifecycle-prompt");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static GradientDrawable m99d(int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadius(i3);
        return gradientDrawable;
    }
}
