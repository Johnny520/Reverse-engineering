package p086r0;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import p001A0.RunnableC0040m;
import p011F0.AbstractC0123k;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p054c0.AbstractC0509a;
import p062e0.InterfaceC0551a;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1140w;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.R0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0867R0 extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2985a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0881Y0 f2986b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0867R0(C0881Y0 c0881y0, int i2) {
        this.f2985a = i2;
        this.f2986b = c0881y0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        View decorView;
        switch (this.f2985a) {
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj = methodHookParam.thisObject;
                Activity activity = obj instanceof Activity ? (Activity) obj : null;
                if (activity != null) {
                    boolean z2 = AbstractC1126i.f3786a;
                    if (!C1124g.m2410A()) {
                        this.f2986b.f3049m = false;
                        break;
                    } else {
                        C0881Y0 c0881y0 = this.f2986b;
                        c0881y0.getClass();
                        c0881y0.f3049m = C0881Y0.m1789z(activity);
                        Object objM1803s = this.f2986b.m1803s(activity);
                        if (objM1803s != null) {
                            this.f2986b.m1806x(objM1803s.getClass());
                        }
                        if (this.f2986b.f3049m) {
                            C0881Y0 c0881y02 = this.f2986b;
                            c0881y02.getClass();
                            Window window = activity.getWindow();
                            if (window != null && (decorView = window.getDecorView()) != null) {
                                decorView.post(new RunnableC0040m((InterfaceC0551a) c0881y02, activity, 8));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    @Override // p054c0.AbstractC0509a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Activity activity;
        boolean zContains;
        List list;
        int i2 = 0;
        switch (this.f2985a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj = methodHookParam.thisObject;
                C0881Y0 c0881y0 = this.f2986b;
                c0881y0.getClass();
                if (obj != null) {
                    boolean z2 = AbstractC1126i.f3786a;
                    if (C1124g.m2410A()) {
                        Object objM1786r = C0881Y0.m1786r(obj, "d");
                        Activity activity2 = objM1786r instanceof Activity ? (Activity) objM1786r : null;
                        if (activity2 != null && C0881Y0.m1789z(activity2)) {
                            c0881y0.f3049m = true;
                        } else if (c0881y0.m1791B(obj)) {
                            if (!AbstractC0223g.m414a((Boolean) C0881Y0.m1786r(obj, "n"), Boolean.FALSE)) {
                                String str = (String) C0881Y0.m1786r(obj, "s");
                                String string = str != null ? AbstractC0299i.m507C0(str).toString() : null;
                                if (string != null && !AbstractC0307q.m534d0(string)) {
                                    Object objM1786r2 = C0881Y0.m1786r(obj, "d");
                                    activity = objM1786r2 instanceof Activity ? (Activity) objM1786r2 : null;
                                    if (activity != null) {
                                        zContains = C0881Y0.m1787t(activity).contains(string);
                                    }
                                }
                            }
                        }
                        zContains = true;
                    } else {
                        zContains = false;
                    }
                    if (zContains && (list = (List) C0881Y0.m1786r(obj, "e")) != null) {
                        for (int size = list.size() - 1; -1 < size; size--) {
                            Object objM269k0 = AbstractC0123k.m269k0(list, size);
                            if (objM269k0 != null) {
                                Set setM2519m = AbstractC1140w.m2519m(objM269k0);
                                if (!setM2519m.isEmpty()) {
                                    boolean z3 = AbstractC1126i.f3786a;
                                    if (C1124g.m2428d(setM2519m)) {
                                        list.remove(size);
                                        i2++;
                                    }
                                }
                            }
                        }
                        if (i2 > 0) {
                            Integer numValueOf = Integer.valueOf(list.size());
                            try {
                                Field fieldM1784n = C0881Y0.m1784n(obj.getClass(), "r");
                                if (fieldM1784n != null) {
                                    fieldM1784n.setAccessible(true);
                                    fieldM1784n.set(obj, numValueOf);
                                }
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                    }
                    break;
                }
                break;
            case 2:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj2 = methodHookParam.thisObject;
                activity = obj2 instanceof Activity ? (Activity) obj2 : null;
                if (activity != null && activity.getClass().getName().equals("com.tencent.mm.plugin.sns.ui.SnsUserUI")) {
                    this.f2986b.f3049m = false;
                }
                break;
            case 3:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj3 = methodHookParam.thisObject;
                activity = obj3 instanceof Activity ? (Activity) obj3 : null;
                if (activity != null) {
                }
                break;
        }
    }
}
