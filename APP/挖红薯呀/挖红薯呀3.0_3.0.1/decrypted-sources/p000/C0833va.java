package p000;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: va */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0833va {

    /* JADX INFO: renamed from: b */
    private static final String f6618b = "BottomNav";

    /* JADX INFO: renamed from: a */
    public static final C0833va f6617a = new C0833va();

    /* JADX INFO: renamed from: c */
    private static final List<String> f6619c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public static final int f6620d = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C0833va() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    private final Object m4424b(Object obj, String str) {
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, null);
                declaredMethod.setAccessible(true);
                return declaredMethod.invoke(obj, null);
            } catch (NoSuchMethodException unused) {
            } catch (Exception unused2) {
                return null;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    private final View m4425c(ViewGroup viewGroup) {
        View viewM4425c;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (k41.m1764V(childAt.getClass().getName(), "TabBarView", false)) {
                return childAt;
            }
            if ((childAt instanceof ViewGroup) && (viewM4425c = m4425c((ViewGroup) childAt)) != null) {
                return viewM4425c;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    private final void m4426e(Activity activity) {
        int iM2376g;
        View decorView = activity.getWindow().getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup == null) {
            lb0.f3404a.m2017e(f6618b, "decorView null for ".concat(activity.getClass().getSimpleName()));
            return;
        }
        View viewM4425c = m4425c(viewGroup);
        if (viewM4425c == null) {
            lb0.f3404a.m2017e(f6618b, "TabBarView not found in ".concat(activity.getClass().getSimpleName()));
            return;
        }
        try {
            iM2376g = m00.f3663S.m2376g(activity);
        } catch (Exception unused) {
            iM2376g = 31;
        }
        List listM2783w = o30.m2783w("getIndexHome", "getIndexStore", "getIndexPost", "getIndexMessage", "getIndexMe");
        int size = listM2783w.size();
        for (int i = 0; i < size; i++) {
            try {
                Object objM4424b = m4424b(viewM4425c, (String) listM2783w.get(i));
                View view = objM4424b instanceof View ? (View) objM4424b : null;
                if (view != null) {
                    view.setVisibility(((1 << i) & iM2376g) != 0 ? 0 : 8);
                }
            } catch (Exception unused2) {
            }
        }
        lb0.f3404a.m2017e(f6618b, "hideNativeTabs done, mask=" + iM2376g + ", cls=" + activity.getClass().getSimpleName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Object m4427g(XposedInterface.Chain chain) {
        chain.getClass();
        Object objProceed = chain.proceed();
        try {
            if (!kf1.f3100G.m1886a()) {
                Object thisObject = chain.getThisObject();
                thisObject.getClass();
                Activity activity = (Activity) thisObject;
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    C0833va c0833va = f6617a;
                    if (!c0833va.m4428h(activity) && m00.f3663S.m2375f0(activity)) {
                        c0833va.m4426e(activity);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return objProceed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    private final boolean m4428h(Activity activity) {
        String name = activity.getClass().getName();
        List<String> list = f6619c;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (name.equals((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4429d(Activity activity) {
        activity.getClass();
        try {
            if (!activity.isFinishing() && !activity.isDestroyed() && !m4428h(activity) && m00.f3663S.m2375f0(activity)) {
                m4426e(activity);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m4430f() {
        kf1 kf1VarM1887b = kf1.f3100G.m1887b();
        if (kf1VarM1887b == null) {
            lb0.f3404a.m2017e(f6618b, "XposedInit.instance is null");
            return;
        }
        try {
            kf1VarM1887b.hook(Activity.class.getDeclaredMethod("onResume", null)).intercept(new C0796ua(0));
            lb0.f3404a.m2017e(f6618b, "onResume hook registered OK");
        } catch (Exception e) {
            lb0.f3404a.m2014a(f6618b, "hook failed: " + e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }
}
