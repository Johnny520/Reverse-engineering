package p000;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q90 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8833h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Class f8834i;

    public /* synthetic */ q90(Class cls, wp2 wp2Var) {
        this.f8833h = 1;
        this.f8834i = cls;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0187  */
    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5j(Object obj) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object x92Var;
        Method[] declaredMethods;
        Object x92Var2;
        Object x92Var3;
        Object objPutIfAbsent;
        int i = this.f8833h;
        boolean z = true;
        boolean z2 = false;
        Method method = null;
        method = null;
        method = null;
        Class cls = this.f8834i;
        jg3 jg3Var = (jg3) obj;
        switch (i) {
            case 0:
                r90 r90Var = r90.f9443d;
                a83 a83Var = a83.f116a;
                jg3Var.getClass();
                Object obj2 = jg3Var.f5028a.thisObject;
                if (obj2 != null) {
                    try {
                        r90Var.getClass();
                        r90.m4415r(obj2, cls);
                        x92Var = a83Var;
                    } catch (Throwable th) {
                        x92Var = new x92(th);
                    }
                    Throwable thM6237a = y92.m6237a(x92Var);
                    if (thM6237a != null) {
                        r90Var.getClass();
                        hg3.m2166d(r90.f9447h, "Unable to inject contact ID entry: ".concat(fg1.m1624Q(thM6237a)));
                    }
                }
                return a83Var;
            case 1:
                jg3Var.getClass();
                XC_MethodHook.MethodHookParam methodHookParam = jg3Var.f5028a;
                if (pv2.m3995h0(tp0.m5374y(), "com.tencent.mm.plugin.setting.ui.setting.SettingsUI.onCreate", false)) {
                    Object obj3 = methodHookParam.thisObject;
                    if (obj3 != null) {
                        hi0 hi0VarM3241r = op0.m3602y(obj3).m3241r();
                        hi0VarM3241r.f4030g = LinkedList.class;
                        hi0VarM3241r.m6411b();
                        pi0 pi0Var = (pi0) AbstractC0142du.m1159o0(hi0VarM3241r.m2194c());
                        Object objM3867g0 = pi0Var != null ? pi0Var.m3867g0() : null;
                        LinkedList linkedList = objM3867g0 instanceof LinkedList ? (LinkedList) objM3867g0 : null;
                        if (linkedList != null && linkedList.size() != 1) {
                            Activity activity = up0.f11403k;
                            if (activity == null) {
                                t11.m5067S("hostAct");
                                throw null;
                            }
                            Object objNewInstance = cls.getDeclaredConstructor(Context.class).newInstance(activity);
                            sg1 sg1VarM3244v = op0.m3602y(objNewInstance).m3244v();
                            sg1VarM3244v.f10113C = Void.TYPE;
                            sg1VarM3244v.m4864d(String.class);
                            sg1VarM3244v.m6411b();
                            ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v.m4863c())).m6415g0("nuke_entry");
                            r91.f9453d.getClass();
                            ((Method) r91.f9455f.getValue()).invoke(objNewInstance, "Nuke");
                            Object obj4 = methodHookParam.thisObject;
                            if (obj4 != null && (declaredMethods = obj4.getClass().getDeclaredMethods()) != null) {
                                int length = declaredMethods.length;
                                int i2 = 0;
                                while (true) {
                                    if (i2 < length) {
                                        Method method2 = declaredMethods[i2];
                                        Class<?>[] parameterTypes = method2.getParameterTypes();
                                        if (parameterTypes.length == 2 && t11.m5086l(parameterTypes[0], cls) && t11.m5086l(parameterTypes[1], Integer.TYPE)) {
                                            method = method2;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                            }
                            if (method != null) {
                                method.setAccessible(true);
                                method.invoke(methodHookParam.thisObject, objNewInstance, 0);
                                wp2.m5952m("旧版设置入口添加成功");
                            } else {
                                wp2.m5952m("找不到旧版 Preference 添加方法");
                            }
                        }
                    }
                }
                return a83.f116a;
            default:
                jg3Var.getClass();
                if (cls.isInstance(jg3Var.f5028a.thisObject)) {
                    Object obj5 = jg3Var.f5028a.thisObject;
                    obj5.getClass();
                    View view = (View) obj5;
                    Object objM3099n0 = AbstractC0460mg.m3099n0(0, jg3Var.m2496a());
                    MotionEvent motionEvent = objM3099n0 instanceof MotionEvent ? (MotionEvent) objM3099n0 : null;
                    if (motionEvent != null) {
                        fx2.f3163d.getClass();
                        Object tag = view.getTag(R.id.swipe_to_quote_message_state);
                        ex2 ex2Var = tag instanceof ex2 ? (ex2) tag : null;
                        int actionMasked = motionEvent.getActionMasked();
                        if (actionMasked == 0) {
                            view.animate().cancel();
                            view.setTranslationX(0.0f);
                            float rawX = motionEvent.getRawX();
                            float rawY = motionEvent.getRawY();
                            int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
                            Class<Boolean> cls2 = Boolean.class;
                            try {
                                hi0 hi0VarM3241r2 = op0.m3602y(view).m3241r();
                                Class<Boolean> clsM3691A = p40.m3691A(d72.m967a(cls2));
                                if (clsM3691A != null) {
                                    cls2 = clsM3691A;
                                }
                                hi0VarM3241r2.f4030g = cls2;
                                Object objM3867g02 = ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r2.m2194c())).m3867g0();
                                x92Var2 = objM3867g02 instanceof Boolean ? (Boolean) objM3867g02 : null;
                            } catch (Throwable th2) {
                                x92Var2 = new x92(th2);
                            }
                            view.setTag(R.id.swipe_to_quote_message_state, new ex2(rawX, rawY, scaledTouchSlop, (Boolean) (x92Var2 instanceof x92 ? null : x92Var2)));
                            z = false;
                            break;
                        } else if (actionMasked == 1) {
                            if (ex2Var != null) {
                                view.setTag(R.id.swipe_to_quote_message_state, null);
                                ViewParent parent = view.getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(false);
                                }
                                Boolean bool = ex2Var.f2671d;
                                if (bool != null) {
                                    fx2.m1728s(view, bool.booleanValue());
                                }
                                if (view.getTranslationX() != 0.0f) {
                                    view.animate().translationX(0.0f).setDuration(200L).setInterpolator(new DecelerateInterpolator()).start();
                                }
                                z2 = ex2Var.f2672e;
                            }
                            if (z2) {
                                jg3Var.m2497b(Boolean.TRUE);
                            }
                        } else {
                            if (actionMasked != 2) {
                                if (actionMasked == 3) {
                                }
                            } else if (ex2Var != null) {
                                float rawX2 = motionEvent.getRawX() - ex2Var.f2668a;
                                float rawY2 = motionEvent.getRawY() - ex2Var.f2669b;
                                if (!ex2Var.f2672e && rawX2 < 0.0f && Math.abs(rawX2) > ex2Var.f2670c && Math.abs(rawX2) > Math.abs(rawY2)) {
                                    ex2Var.f2672e = true;
                                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                                    motionEventObtain.setAction(3);
                                    try {
                                        ig3.m2347b(jg3Var, motionEventObtain);
                                        motionEventObtain.recycle();
                                        ViewParent parent2 = view.getParent();
                                        if (parent2 != null) {
                                            parent2.requestDisallowInterceptTouchEvent(true);
                                        }
                                        fx2.m1728s(view, true);
                                        fx2.m1726q(view);
                                    } catch (Throwable th3) {
                                        motionEventObtain.recycle();
                                        throw th3;
                                    }
                                }
                                if (ex2Var.f2672e) {
                                    float f = view.getResources().getDisplayMetrics().density * 40.0f;
                                    if (!ex2Var.f2673f) {
                                        float f2 = -f;
                                        float fM778C = ci0.m778C(rawX2, 1.5f * f2, 0.0f);
                                        view.setTranslationX(fM778C);
                                        if (Math.abs(fM778C) >= f) {
                                            ex2Var.f2673f = true;
                                            view.setTranslationX(f2);
                                            view.performHapticFeedback(0);
                                            fx2.m1726q(view);
                                            Object tag2 = view.getTag(R.id.swipe_to_quote_message_info);
                                            if (tag2 == null) {
                                                hg3.m2166d(fx2.f3167h, "Unable to quote message: bound MsgInfo is missing");
                                            } else {
                                                Object obj6 = fx2.f3169j;
                                                if (obj6 == null) {
                                                    hg3.m2166d(fx2.f3167h, "Unable to quote message: ChatFooter is not ready");
                                                } else {
                                                    dx2 dx2Var = new dx2(obj6.getClass(), tag2.getClass());
                                                    try {
                                                        ConcurrentHashMap concurrentHashMap = fx2.f3170k;
                                                        Object objM1727r = concurrentHashMap.get(dx2Var);
                                                        if (objM1727r == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(dx2Var, (objM1727r = fx2.m1727r(obj6, tag2)))) != null) {
                                                            objM1727r = objPutIfAbsent;
                                                        }
                                                        cx2 cx2Var = (cx2) objM1727r;
                                                        boolean z3 = cx2Var.f1772b;
                                                        Method method3 = cx2Var.f1771a;
                                                        x92Var3 = z3 ? method3.invoke(obj6, tag2, null) : method3.invoke(obj6, tag2);
                                                    } catch (Throwable th4) {
                                                        x92Var3 = new x92(th4);
                                                    }
                                                    if (!(x92Var3 instanceof x92)) {
                                                        fx2.f3163d.getClass();
                                                        hg3.m2168f(fx2.f3167h, "Quoted message: type=".concat(tag2.getClass().getName()));
                                                    }
                                                    Throwable thM6237a2 = y92.m6237a(x92Var3);
                                                    if (thM6237a2 != null) {
                                                        fx2.f3163d.getClass();
                                                        hg3.m2166d(fx2.f3167h, "Unable to quote message: ".concat(fg1.m1624Q(thM6237a2)));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (z2) {
                            }
                        }
                        z2 = z;
                        if (z2) {
                        }
                    }
                }
                return a83.f116a;
        }
    }

    public /* synthetic */ q90(int i, Class cls) {
        this.f8833h = i;
        this.f8834i = cls;
    }
}
