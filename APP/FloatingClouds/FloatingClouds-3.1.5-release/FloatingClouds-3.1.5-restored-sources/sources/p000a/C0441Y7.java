package p000a;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import io.github.libxposed.api.XposedInterface;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.Y7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0441Y7 implements IPlugin {

    /* JADX INFO: renamed from: c */
    public static volatile C0441Y7 f1647c;

    /* JADX INFO: renamed from: a */
    public volatile Activity f1648a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap<String, List<InterfaceC0064D7<Activity, C0413Wf>>> f1649b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public static void m1099a(ViewGroup viewGroup, C0387V7 c0387v7) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            C0631i9.m1479b(childAt);
            c0387v7.mo53f(childAt);
            if (childAt instanceof ViewGroup) {
                m1099a((ViewGroup) childAt, c0387v7);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1100b(Activity activity) {
        String name = activity.getClass().getName();
        if (C0034Be.m94I(name, "Sns", false)) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"[GlobalLifecycle] Activity: ".concat(name)}, 1));
        }
        List<InterfaceC0064D7<Activity, C0413Wf>> list = this.f1649b.get(name);
        if (list == null) {
            return;
        }
        Iterator<InterfaceC0064D7<Activity, C0413Wf>> it = list.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo53f(activity);
                C0413Wf c0413Wf = C0413Wf.f1577a;
            } catch (Throwable th) {
                C0920xd.m2206a(th);
            }
        }
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        C0631i9.m1482e(c0173j8, "session");
        f1647c = this;
        final int i = 0;
        C0173J8.m463a(c0173j8, "android.app.Activity", "onCreate", new Class[]{Bundle.class}, new InterfaceC0064D7(this) { // from class: a.U7

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0441Y7 f1384b;

            {
                this.f1384b = this;
            }

            @Override // p000a.InterfaceC0064D7
            /* JADX INFO: renamed from: f */
            public final Object mo53f(Object obj) {
                switch (i) {
                    case 0:
                        C0441Y7 c0441y7 = this.f1384b;
                        XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain, "chain");
                        Object objProceed = chain.proceed();
                        Object thisObject = chain.getThisObject();
                        Activity activity = thisObject instanceof Activity ? (Activity) thisObject : null;
                        if (activity != null) {
                            c0441y7.f1648a = activity;
                            c0441y7.m1100b(activity);
                        }
                        return objProceed;
                    case 1:
                        C0441Y7 c0441y72 = this.f1384b;
                        XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain2, "chain");
                        Object objProceed2 = chain2.proceed();
                        Object thisObject2 = chain2.getThisObject();
                        Activity activity2 = thisObject2 instanceof Activity ? (Activity) thisObject2 : null;
                        if (activity2 != null) {
                            c0441y72.f1648a = activity2;
                            c0441y72.m1100b(activity2);
                            if (activity2.getClass().getName().endsWith("SettingsCareModeIntro")) {
                                try {
                                    ViewGroup viewGroup = (ViewGroup) activity2.findViewById(R.id.content);
                                    if (viewGroup != null) {
                                        C0320Rc c0320Rc = new C0320Rc();
                                        C0441Y7.m1099a(viewGroup, new C0387V7(c0320Rc, activity2, 0));
                                        Log.e("FC_DEBUG", "SettingsCare onResume: injected " + c0320Rc.f1153a + " long-click views");
                                    }
                                } catch (Exception e) {
                                    Log.e("FC_DEBUG", "SettingsCare injection err", e);
                                }
                            }
                            break;
                        }
                        return objProceed2;
                    default:
                        C0441Y7 c0441y73 = this.f1384b;
                        XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain3, "chain");
                        Object objProceed3 = chain3.proceed();
                        Object thisObject3 = chain3.getThisObject();
                        Activity activity3 = thisObject3 instanceof Activity ? (Activity) thisObject3 : null;
                        if (activity3 != null && c0441y73.f1648a == activity3) {
                            c0441y73.f1648a = null;
                        }
                        return objProceed3;
                }
            }
        });
        final int i2 = 1;
        C0173J8.m463a(c0173j8, "android.app.Activity", "onResume", new Class[0], new InterfaceC0064D7(this) { // from class: a.U7

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0441Y7 f1384b;

            {
                this.f1384b = this;
            }

            @Override // p000a.InterfaceC0064D7
            /* JADX INFO: renamed from: f */
            public final Object mo53f(Object obj) {
                switch (i2) {
                    case 0:
                        C0441Y7 c0441y7 = this.f1384b;
                        XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain, "chain");
                        Object objProceed = chain.proceed();
                        Object thisObject = chain.getThisObject();
                        Activity activity = thisObject instanceof Activity ? (Activity) thisObject : null;
                        if (activity != null) {
                            c0441y7.f1648a = activity;
                            c0441y7.m1100b(activity);
                        }
                        return objProceed;
                    case 1:
                        C0441Y7 c0441y72 = this.f1384b;
                        XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain2, "chain");
                        Object objProceed2 = chain2.proceed();
                        Object thisObject2 = chain2.getThisObject();
                        Activity activity2 = thisObject2 instanceof Activity ? (Activity) thisObject2 : null;
                        if (activity2 != null) {
                            c0441y72.f1648a = activity2;
                            c0441y72.m1100b(activity2);
                            if (activity2.getClass().getName().endsWith("SettingsCareModeIntro")) {
                                try {
                                    ViewGroup viewGroup = (ViewGroup) activity2.findViewById(R.id.content);
                                    if (viewGroup != null) {
                                        C0320Rc c0320Rc = new C0320Rc();
                                        C0441Y7.m1099a(viewGroup, new C0387V7(c0320Rc, activity2, 0));
                                        Log.e("FC_DEBUG", "SettingsCare onResume: injected " + c0320Rc.f1153a + " long-click views");
                                    }
                                } catch (Exception e) {
                                    Log.e("FC_DEBUG", "SettingsCare injection err", e);
                                }
                            }
                            break;
                        }
                        return objProceed2;
                    default:
                        C0441Y7 c0441y73 = this.f1384b;
                        XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain3, "chain");
                        Object objProceed3 = chain3.proceed();
                        Object thisObject3 = chain3.getThisObject();
                        Activity activity3 = thisObject3 instanceof Activity ? (Activity) thisObject3 : null;
                        if (activity3 != null && c0441y73.f1648a == activity3) {
                            c0441y73.f1648a = null;
                        }
                        return objProceed3;
                }
            }
        });
        final int i3 = 2;
        C0173J8.m463a(c0173j8, "android.app.Activity", "onDestroy", new Class[0], new InterfaceC0064D7(this) { // from class: a.U7

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0441Y7 f1384b;

            {
                this.f1384b = this;
            }

            @Override // p000a.InterfaceC0064D7
            /* JADX INFO: renamed from: f */
            public final Object mo53f(Object obj) {
                switch (i3) {
                    case 0:
                        C0441Y7 c0441y7 = this.f1384b;
                        XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain, "chain");
                        Object objProceed = chain.proceed();
                        Object thisObject = chain.getThisObject();
                        Activity activity = thisObject instanceof Activity ? (Activity) thisObject : null;
                        if (activity != null) {
                            c0441y7.f1648a = activity;
                            c0441y7.m1100b(activity);
                        }
                        return objProceed;
                    case 1:
                        C0441Y7 c0441y72 = this.f1384b;
                        XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain2, "chain");
                        Object objProceed2 = chain2.proceed();
                        Object thisObject2 = chain2.getThisObject();
                        Activity activity2 = thisObject2 instanceof Activity ? (Activity) thisObject2 : null;
                        if (activity2 != null) {
                            c0441y72.f1648a = activity2;
                            c0441y72.m1100b(activity2);
                            if (activity2.getClass().getName().endsWith("SettingsCareModeIntro")) {
                                try {
                                    ViewGroup viewGroup = (ViewGroup) activity2.findViewById(R.id.content);
                                    if (viewGroup != null) {
                                        C0320Rc c0320Rc = new C0320Rc();
                                        C0441Y7.m1099a(viewGroup, new C0387V7(c0320Rc, activity2, 0));
                                        Log.e("FC_DEBUG", "SettingsCare onResume: injected " + c0320Rc.f1153a + " long-click views");
                                    }
                                } catch (Exception e) {
                                    Log.e("FC_DEBUG", "SettingsCare injection err", e);
                                }
                            }
                            break;
                        }
                        return objProceed2;
                    default:
                        C0441Y7 c0441y73 = this.f1384b;
                        XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain3, "chain");
                        Object objProceed3 = chain3.proceed();
                        Object thisObject3 = chain3.getThisObject();
                        Activity activity3 = thisObject3 instanceof Activity ? (Activity) thisObject3 : null;
                        if (activity3 != null && c0441y73.f1648a == activity3) {
                            c0441y73.f1648a = null;
                        }
                        return objProceed3;
                }
            }
        });
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[GlobalLifecycle] hooked Activity lifecycle"}, 1));
    }
}
