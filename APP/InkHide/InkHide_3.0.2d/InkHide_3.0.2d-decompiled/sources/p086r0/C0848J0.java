package p086r0;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Set;
import p001A0.RunnableC0040m;
import p011F0.AbstractC0120h;
import p027N0.AbstractC0223g;
import p027N0.AbstractC0231o;
import p040U0.AbstractC0307q;
import p054c0.AbstractC0509a;
import p062e0.InterfaceC0551a;

/* JADX INFO: renamed from: r0.J0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0848J0 extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2900a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0854L0 f2901b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0848J0(C0854L0 c0854l0, int i2) {
        this.f2900a = i2;
        this.f2901b = c0854l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object result;
        View decorView;
        switch (this.f2900a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                C0854L0 c0854l0 = this.f2901b;
                if (C0854L0.m1718d(c0854l0)) {
                    Set setM1750n = c0854l0.m1750n();
                    if (!setM1750n.isEmpty() && (result = methodHookParam.getResult()) != null) {
                        while (true) {
                            boolean z2 = false;
                            for (Field field : C0854L0.m1722h(result.getClass())) {
                                if (!Modifier.isStatic(field.getModifiers())) {
                                    try {
                                        field.setAccessible(true);
                                        Object obj = field.get(result);
                                        if (!AbstractC0231o.m426b(obj)) {
                                            continue;
                                        } else if (c0854l0.m1752v((List) obj, setM1750n) || z2) {
                                            z2 = true;
                                        }
                                    } catch (Throwable unused) {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr = methodHookParam.args;
                AbstractC0223g.m417d(objArr, "args");
                if (AbstractC0223g.m414a(AbstractC0120h.m258f0(0, objArr), Boolean.TRUE)) {
                    Object obj2 = methodHookParam.thisObject;
                    Activity activity = obj2 instanceof Activity ? (Activity) obj2 : null;
                    if (activity != null) {
                        C0854L0 c0854l02 = this.f2901b;
                        if (c0854l02.m1743L(activity)) {
                            C0854L0.m1720f(c0854l02);
                            C0854L0.m1715a(c0854l02, activity);
                            Window window = activity.getWindow();
                            if (window != null && (decorView = window.getDecorView()) != null) {
                                decorView.post(new RunnableC0040m((InterfaceC0551a) c0854l02, activity, 7));
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj3 = methodHookParam.thisObject;
                Activity activity2 = obj3 instanceof Activity ? (Activity) obj3 : null;
                if (activity2 != null) {
                    C0854L0 c0854l03 = this.f2901b;
                    if (c0854l03.m1743L(activity2)) {
                        C0854L0.m1715a(c0854l03, activity2);
                        break;
                    }
                }
                break;
            case 3:
                AbstractC0223g.m418e(methodHookParam, "param");
                C0854L0 c0854l04 = this.f2901b;
                Set setM1750n2 = c0854l04.m1750n();
                if (!setM1750n2.isEmpty()) {
                    C0854L0.m1717c(c0854l04, methodHookParam.thisObject, setM1750n2);
                    break;
                }
                break;
            case 4:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj4 = methodHookParam.thisObject;
                View view = obj4 instanceof View ? (View) obj4 : null;
                if (view != null) {
                    C0854L0 c0854l05 = this.f2901b;
                    if (c0854l05.m1745N(view)) {
                        new WeakReference(view);
                        c0854l05.getClass();
                    }
                    break;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f2900a) {
            case 2:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj = methodHookParam.thisObject;
                Activity activity = obj instanceof Activity ? (Activity) obj : null;
                if (activity != null) {
                    C0854L0 c0854l0 = this.f2901b;
                    if (c0854l0.m1743L(activity)) {
                        C0854L0.m1720f(c0854l0);
                        C0854L0.m1715a(c0854l0, activity);
                        break;
                    }
                }
                break;
            case 4:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj2 = methodHookParam.thisObject;
                View view = obj2 instanceof View ? (View) obj2 : null;
                if (view != null) {
                    C0854L0 c0854l02 = this.f2901b;
                    if (c0854l02.m1745N(view)) {
                        Object[] objArr = methodHookParam.args;
                        AbstractC0223g.m417d(objArr, "args");
                        Object objM258f0 = AbstractC0120h.m258f0(0, objArr);
                        if (objM258f0 != null) {
                            new WeakReference(view);
                            c0854l02.getClass();
                            Set setM1750n = c0854l02.m1750n();
                            if (!setM1750n.isEmpty()) {
                                c0854l02.m1754x(objM258f0, setM1750n);
                            }
                            break;
                        }
                    }
                }
                break;
            case 5:
                AbstractC0223g.m418e(methodHookParam, "param");
                C0854L0 c0854l03 = this.f2901b;
                c0854l03.getClass();
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                AbstractC0223g.m417d(stackTrace, "getStackTrace(...)");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    String className = stackTraceElement.getClassName();
                    if (!AbstractC0223g.m414a(className, "com.tencent.mm.ui.contact.item.q1")) {
                        AbstractC0223g.m415b(className);
                        if (!AbstractC0307q.m538h0(className, false, "com.tencent.mm.ui.mvvm.uic.conversation.recent.") && !AbstractC0307q.m538h0(className, false, "com.tencent.mm.ui.transmit.recent.")) {
                        }
                    }
                    Set setM1750n2 = c0854l03.m1750n();
                    if (!setM1750n2.isEmpty()) {
                        Object[] objArr2 = methodHookParam.args;
                        AbstractC0223g.m417d(objArr2, "args");
                        for (Object obj3 : objArr2) {
                            if (AbstractC0231o.m426b(obj3)) {
                                c0854l03.m1751u((List) obj3, setM1750n2);
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}
