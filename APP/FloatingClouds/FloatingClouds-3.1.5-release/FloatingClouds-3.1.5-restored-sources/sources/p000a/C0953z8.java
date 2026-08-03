package p000a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import p000a.C0186K3;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.z8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0953z8 implements IPlugin {
    /* JADX INFO: renamed from: a */
    public static TextView m2241a(View view) {
        String string;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            CharSequence text = textView.getText();
            if (text == null || (string = text.toString()) == null) {
                string = "";
            }
            if (string.equals("缓存") || C0015Ae.m49H(string, "缓存", false)) {
                return textView;
            }
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            C0631i9.m1481d(childAt, "getChildAt(...)");
            TextView textViewM2241a = m2241a(childAt);
            if (textViewM2241a != null) {
                return textViewM2241a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2242c() {
        C0186K3.f638a.getClass();
        return C0186K3.a.m511l() && C0186K3.a.m508i().f2435e;
    }

    /* JADX INFO: renamed from: b */
    public final void m2243b(Activity activity, int i) {
        View decorView;
        View decorView2;
        if (i >= 3) {
            return;
        }
        Window window = activity.getWindow();
        if (window != null && (decorView2 = window.getDecorView()) != null) {
            TextView textViewM2241a = m2241a(decorView2);
            if (textViewM2241a == null) {
                C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideStorageCache: '缓存' label not found"}, 1));
            } else {
                Object parent = textViewM2241a.getParent();
                View view = null;
                View view2 = parent instanceof View ? (View) parent : null;
                if (view2 != null) {
                    for (int i2 = 0; view2.getParent() != null && i2 < 3; i2++) {
                        if (view2.getBackground() != null && view2.getHeight() < 600) {
                            view = view2;
                            break;
                        }
                        Object parent2 = view2.getParent();
                        view2 = parent2 instanceof View ? (View) parent2 : null;
                        if (view2 == null) {
                            break;
                        }
                    }
                    Object parent3 = textViewM2241a.getParent();
                    View view3 = parent3 instanceof View ? (View) parent3 : null;
                    Object parent4 = view3 != null ? view3.getParent() : null;
                    View view4 = parent4 instanceof View ? (View) parent4 : null;
                    if (view4 == null) {
                        Object parent5 = textViewM2241a.getParent();
                        if (parent5 instanceof View) {
                            view = (View) parent5;
                        }
                    } else {
                        view = view4;
                    }
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    C0726n9.m1670m(C0944z.m2227g("HideStorageCache: cache section hidden (card=", view.getClass().getSimpleName(), ")"));
                    return;
                }
            }
        }
        List listM1757d0 = C0739o3.m1757d0(300L, 800L, 1500L);
        Window window2 = activity.getWindow();
        if (window2 == null || (decorView = window2.getDecorView()) == null) {
            return;
        }
        decorView.postDelayed(new RunnableC0660k0(this, activity, i, 3), ((Number) ((i < 0 || i >= listM1757d0.size()) ? 1500L : listM1757d0.get(i))).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0192 A[ORIG_RETURN, RETURN] */
    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleHook(C0173J8 c0173j8) {
        Class<?> cls;
        boolean z;
        Object objM2206a;
        Throwable thM2189a;
        Method method;
        final int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        C0631i9.m1482e(c0173j8, "session");
        C0692ld.f2564a.m1555a();
        int i4 = -1;
        if (C0021B1.f64a == -1) {
            try {
                Context context = C0889w1.f3488p;
                C0631i9.m1479b(context);
                i4 = context.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionCode;
            } catch (Exception e) {
                C0908x1.m2193a(Arrays.copyOf(new Object[]{e}, 1));
            }
            C0021B1.f64a = i4;
        }
        C0578fd c0578fd = new C0578fd(C0021B1.f64a, c0173j8.f608a);
        C0616hd.f2278a.getClass();
        C0597gd c0597gdM1467a = C0616hd.m1467a("F019_clean_new_ui", c0578fd);
        if (!c0597gdM1467a.f2208a || (cls = c0597gdM1467a.f2209b) == null) {
            C0908x1.m2197e("HideStorageCache: CleanNewUI not resolved");
            return;
        }
        C0908x1.m2194b("HideStorageCache: CleanNewUI → ".concat(cls.getName()));
        C0173J8.m466d(c0173j8, "F020", cls.getName(), "onCreate", new Class[]{Bundle.class}, new InterfaceC0064D7(this) { // from class: a.y8

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0953z8 f3545b;

            {
                this.f3545b = this;
            }

            @Override // p000a.InterfaceC0064D7
            /* JADX INFO: renamed from: f */
            public final Object mo53f(Object obj) {
                XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                switch (i2) {
                    case 0:
                        C0631i9.m1482e(chain, "chain");
                        Object objProceed = chain.proceed();
                        C0953z8 c0953z8 = this.f3545b;
                        if (C0953z8.m2242c()) {
                            Object thisObject = chain.getThisObject();
                            Activity activity = thisObject instanceof Activity ? (Activity) thisObject : null;
                            if (activity != null) {
                                c0953z8.m2243b(activity, 0);
                            }
                        }
                        return objProceed;
                    case 1:
                        C0631i9.m1482e(chain, "chain");
                        Object objProceed2 = chain.proceed();
                        C0953z8 c0953z82 = this.f3545b;
                        if (C0953z8.m2242c()) {
                            Object thisObject2 = chain.getThisObject();
                            Activity activity2 = thisObject2 instanceof Activity ? (Activity) thisObject2 : null;
                            if (activity2 != null) {
                                c0953z82.m2243b(activity2, 0);
                            }
                        }
                        return objProceed2;
                    default:
                        C0631i9.m1482e(chain, "chain");
                        Object objProceed3 = chain.proceed();
                        C0953z8 c0953z83 = this.f3545b;
                        if (C0953z8.m2242c()) {
                            Object thisObject3 = chain.getThisObject();
                            Activity activity3 = thisObject3 instanceof Activity ? (Activity) thisObject3 : null;
                            if (activity3 != null) {
                                c0953z83.m2243b(activity3, 0);
                            }
                        }
                        return objProceed3;
                }
            }
        });
        try {
            Method method2 = C0052Cd.f184a.m139b(new C0785qb("F020_update_cache_root", "void", C0739o3.m1757d0("J", "J"), "", "F019_clean_new_ui", false), c0578fd).f2213f;
            if (method2 != null) {
                C0173J8.m469h(c0173j8, "F020", method2, new InterfaceC0064D7(this) { // from class: a.y8

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C0953z8 f3545b;

                    {
                        this.f3545b = this;
                    }

                    @Override // p000a.InterfaceC0064D7
                    /* JADX INFO: renamed from: f */
                    public final Object mo53f(Object obj) {
                        XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                        switch (i3) {
                            case 0:
                                C0631i9.m1482e(chain, "chain");
                                Object objProceed = chain.proceed();
                                C0953z8 c0953z8 = this.f3545b;
                                if (C0953z8.m2242c()) {
                                    Object thisObject = chain.getThisObject();
                                    Activity activity = thisObject instanceof Activity ? (Activity) thisObject : null;
                                    if (activity != null) {
                                        c0953z8.m2243b(activity, 0);
                                    }
                                }
                                return objProceed;
                            case 1:
                                C0631i9.m1482e(chain, "chain");
                                Object objProceed2 = chain.proceed();
                                C0953z8 c0953z82 = this.f3545b;
                                if (C0953z8.m2242c()) {
                                    Object thisObject2 = chain.getThisObject();
                                    Activity activity2 = thisObject2 instanceof Activity ? (Activity) thisObject2 : null;
                                    if (activity2 != null) {
                                        c0953z82.m2243b(activity2, 0);
                                    }
                                }
                                return objProceed2;
                            default:
                                C0631i9.m1482e(chain, "chain");
                                Object objProceed3 = chain.proceed();
                                C0953z8 c0953z83 = this.f3545b;
                                if (C0953z8.m2242c()) {
                                    Object thisObject3 = chain.getThisObject();
                                    Activity activity3 = thisObject3 instanceof Activity ? (Activity) thisObject3 : null;
                                    if (activity3 != null) {
                                        c0953z83.m2243b(activity3, 0);
                                    }
                                }
                                return objProceed3;
                        }
                    }
                });
                try {
                    String name = method2.getName();
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                    C0908x1.m2194b("HideStorageCache: hooked refresh method via rule: " + name + "(" + C0238N1.m631e0(parameterTypes, null, new C0687l8(14), 31) + ")");
                    z = true;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    objM2206a = C0920xd.m2206a(th);
                    thM2189a = C0901wd.m2189a(objM2206a);
                    if (thM2189a != null) {
                    }
                    if (z) {
                    }
                }
            } else {
                z = false;
            }
            try {
                objM2206a = C0413Wf.f1577a;
            } catch (Throwable th2) {
                th = th2;
                objM2206a = C0920xd.m2206a(th);
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
        thM2189a = C0901wd.m2189a(objM2206a);
        if (thM2189a != null) {
            C0908x1.m2197e("HideStorageCache: rule-based updateCacheRoot hook failed", thM2189a);
        }
        if (z) {
            for (String str : C0739o3.m1757d0("updateCacheRoot", "U6")) {
                try {
                    Method[] declaredMethods = cls.getDeclaredMethods();
                    C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
                    int length = declaredMethods.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            method = null;
                            break;
                        }
                        method = declaredMethods[i5];
                        if (C0631i9.m1478a(method.getName(), str)) {
                            break;
                        }
                        if (method.getParameterTypes().length == 2) {
                            Class<?> cls2 = method.getParameterTypes()[0];
                            Class cls3 = Long.TYPE;
                            if (C0631i9.m1478a(cls2, cls3) && C0631i9.m1478a(method.getParameterTypes()[1], cls3)) {
                                break;
                            }
                        }
                        i5++;
                    }
                    if (method != null) {
                        C0173J8.m469h(c0173j8, "F020", method, new InterfaceC0064D7(this) { // from class: a.y8

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ C0953z8 f3545b;

                            {
                                this.f3545b = this;
                            }

                            @Override // p000a.InterfaceC0064D7
                            /* JADX INFO: renamed from: f */
                            public final Object mo53f(Object obj) {
                                XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                                switch (i) {
                                    case 0:
                                        C0631i9.m1482e(chain, "chain");
                                        Object objProceed = chain.proceed();
                                        C0953z8 c0953z8 = this.f3545b;
                                        if (C0953z8.m2242c()) {
                                            Object thisObject = chain.getThisObject();
                                            Activity activity = thisObject instanceof Activity ? (Activity) thisObject : null;
                                            if (activity != null) {
                                                c0953z8.m2243b(activity, 0);
                                            }
                                        }
                                        return objProceed;
                                    case 1:
                                        C0631i9.m1482e(chain, "chain");
                                        Object objProceed2 = chain.proceed();
                                        C0953z8 c0953z82 = this.f3545b;
                                        if (C0953z8.m2242c()) {
                                            Object thisObject2 = chain.getThisObject();
                                            Activity activity2 = thisObject2 instanceof Activity ? (Activity) thisObject2 : null;
                                            if (activity2 != null) {
                                                c0953z82.m2243b(activity2, 0);
                                            }
                                        }
                                        return objProceed2;
                                    default:
                                        C0631i9.m1482e(chain, "chain");
                                        Object objProceed3 = chain.proceed();
                                        C0953z8 c0953z83 = this.f3545b;
                                        if (C0953z8.m2242c()) {
                                            Object thisObject3 = chain.getThisObject();
                                            Activity activity3 = thisObject3 instanceof Activity ? (Activity) thisObject3 : null;
                                            if (activity3 != null) {
                                                c0953z83.m2243b(activity3, 0);
                                            }
                                        }
                                        return objProceed3;
                                }
                            }
                        });
                        C0908x1.m2194b("HideStorageCache: hooked refresh method: " + method.getName());
                    }
                    C0413Wf c0413Wf = C0413Wf.f1577a;
                } catch (Throwable th4) {
                    C0920xd.m2206a(th4);
                }
            }
        }
    }
}
