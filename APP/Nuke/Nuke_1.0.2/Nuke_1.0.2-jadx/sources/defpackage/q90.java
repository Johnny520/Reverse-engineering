package defpackage;

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
    public final /* synthetic */ int h;
    public final /* synthetic */ Class i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ q90(Class cls, wp2 wp2Var) {
        this.h = 1;
        this.i = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0187  */
    @Override // defpackage.in0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object x92Var;
        Method[] declaredMethods;
        Object x92Var2;
        Object x92Var3;
        Object objPutIfAbsent;
        int i = this.h;
        boolean z = true;
        boolean z2 = false;
        Method method = null;
        method = null;
        method = null;
        Class cls = this.i;
        jg3 jg3Var = (jg3) obj;
        switch (i) {
            case 0:
                r90 r90Var = r90.d;
                a83 a83Var = a83.a;
                jg3Var.getClass();
                Object obj2 = jg3Var.a.thisObject;
                if (obj2 != null) {
                    try {
                        r90Var.getClass();
                        r90.r(obj2, cls);
                        x92Var = a83Var;
                    } catch (Throwable th) {
                        x92Var = new x92(th);
                    }
                    Throwable thA = y92.a(x92Var);
                    if (thA != null) {
                        r90Var.getClass();
                        hg3.d(r90.h, "Unable to inject contact ID entry: ".concat(fg1.Q(thA)));
                    }
                }
                return a83Var;
            case 1:
                jg3Var.getClass();
                XC_MethodHook.MethodHookParam methodHookParam = jg3Var.a;
                if (pv2.h0(tp0.y(), "com.tencent.mm.plugin.setting.ui.setting.SettingsUI.onCreate", false)) {
                    Object obj3 = methodHookParam.thisObject;
                    if (obj3 != null) {
                        hi0 hi0VarR = op0.y(obj3).r();
                        hi0VarR.g = LinkedList.class;
                        hi0VarR.b();
                        pi0 pi0Var = (pi0) du.o0(hi0VarR.c());
                        Object objG0 = pi0Var != null ? pi0Var.g0() : null;
                        LinkedList linkedList = objG0 instanceof LinkedList ? (LinkedList) objG0 : null;
                        if (linkedList != null && linkedList.size() != 1) {
                            Activity activity = up0.k;
                            if (activity == null) {
                                t11.S("hostAct");
                                throw null;
                            }
                            Object objNewInstance = cls.getDeclaredConstructor(Context.class).newInstance(activity);
                            sg1 sg1VarV = op0.y(objNewInstance).v();
                            sg1VarV.C = Void.TYPE;
                            sg1VarV.d(String.class);
                            sg1VarV.b();
                            ((zg1) du.o0(sg1VarV.c())).g0("nuke_entry");
                            r91.d.getClass();
                            ((Method) r91.f.getValue()).invoke(objNewInstance, "Nuke");
                            Object obj4 = methodHookParam.thisObject;
                            if (obj4 != null && (declaredMethods = obj4.getClass().getDeclaredMethods()) != null) {
                                int length = declaredMethods.length;
                                int i2 = 0;
                                while (true) {
                                    if (i2 < length) {
                                        Method method2 = declaredMethods[i2];
                                        Class<?>[] parameterTypes = method2.getParameterTypes();
                                        if (parameterTypes.length == 2 && t11.l(parameterTypes[0], cls) && t11.l(parameterTypes[1], Integer.TYPE)) {
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
                                wp2.m("旧版设置入口添加成功");
                            } else {
                                wp2.m("找不到旧版 Preference 添加方法");
                            }
                        }
                    }
                }
                return a83.a;
            default:
                jg3Var.getClass();
                if (cls.isInstance(jg3Var.a.thisObject)) {
                    Object obj5 = jg3Var.a.thisObject;
                    obj5.getClass();
                    View view = (View) obj5;
                    Object objN0 = mg.n0(0, jg3Var.a());
                    MotionEvent motionEvent = objN0 instanceof MotionEvent ? (MotionEvent) objN0 : null;
                    if (motionEvent != null) {
                        fx2.d.getClass();
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
                                hi0 hi0VarR2 = op0.y(view).r();
                                Class<Boolean> clsA = p40.A(d72.a(cls2));
                                if (clsA != null) {
                                    cls2 = clsA;
                                }
                                hi0VarR2.g = cls2;
                                Object objG02 = ((pi0) du.o0(hi0VarR2.c())).g0();
                                x92Var2 = objG02 instanceof Boolean ? (Boolean) objG02 : null;
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
                                Boolean bool = ex2Var.d;
                                if (bool != null) {
                                    fx2.s(view, bool.booleanValue());
                                }
                                if (view.getTranslationX() != 0.0f) {
                                    view.animate().translationX(0.0f).setDuration(200L).setInterpolator(new DecelerateInterpolator()).start();
                                }
                                z2 = ex2Var.e;
                            }
                            if (z2) {
                                jg3Var.b(Boolean.TRUE);
                            }
                        } else {
                            if (actionMasked != 2) {
                                if (actionMasked == 3) {
                                }
                            } else if (ex2Var != null) {
                                float rawX2 = motionEvent.getRawX() - ex2Var.a;
                                float rawY2 = motionEvent.getRawY() - ex2Var.b;
                                if (!ex2Var.e && rawX2 < 0.0f && Math.abs(rawX2) > ex2Var.c && Math.abs(rawX2) > Math.abs(rawY2)) {
                                    ex2Var.e = true;
                                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                                    motionEventObtain.setAction(3);
                                    try {
                                        ig3.b(jg3Var, motionEventObtain);
                                        motionEventObtain.recycle();
                                        ViewParent parent2 = view.getParent();
                                        if (parent2 != null) {
                                            parent2.requestDisallowInterceptTouchEvent(true);
                                        }
                                        fx2.s(view, true);
                                        fx2.q(view);
                                    } catch (Throwable th3) {
                                        motionEventObtain.recycle();
                                        throw th3;
                                    }
                                }
                                if (ex2Var.e) {
                                    float f = view.getResources().getDisplayMetrics().density * 40.0f;
                                    if (!ex2Var.f) {
                                        float f2 = -f;
                                        float fC = ci0.C(rawX2, 1.5f * f2, 0.0f);
                                        view.setTranslationX(fC);
                                        if (Math.abs(fC) >= f) {
                                            ex2Var.f = true;
                                            view.setTranslationX(f2);
                                            view.performHapticFeedback(0);
                                            fx2.q(view);
                                            Object tag2 = view.getTag(R.id.swipe_to_quote_message_info);
                                            if (tag2 == null) {
                                                hg3.d(fx2.h, "Unable to quote message: bound MsgInfo is missing");
                                            } else {
                                                Object obj6 = fx2.j;
                                                if (obj6 == null) {
                                                    hg3.d(fx2.h, "Unable to quote message: ChatFooter is not ready");
                                                } else {
                                                    dx2 dx2Var = new dx2(obj6.getClass(), tag2.getClass());
                                                    try {
                                                        ConcurrentHashMap concurrentHashMap = fx2.k;
                                                        Object objR = concurrentHashMap.get(dx2Var);
                                                        if (objR == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(dx2Var, (objR = fx2.r(obj6, tag2)))) != null) {
                                                            objR = objPutIfAbsent;
                                                        }
                                                        cx2 cx2Var = (cx2) objR;
                                                        boolean z3 = cx2Var.b;
                                                        Method method3 = cx2Var.a;
                                                        x92Var3 = z3 ? method3.invoke(obj6, tag2, null) : method3.invoke(obj6, tag2);
                                                    } catch (Throwable th4) {
                                                        x92Var3 = new x92(th4);
                                                    }
                                                    if (!(x92Var3 instanceof x92)) {
                                                        fx2.d.getClass();
                                                        hg3.f(fx2.h, "Quoted message: type=".concat(tag2.getClass().getName()));
                                                    }
                                                    Throwable thA2 = y92.a(x92Var3);
                                                    if (thA2 != null) {
                                                        fx2.d.getClass();
                                                        hg3.d(fx2.h, "Unable to quote message: ".concat(fg1.Q(thA2)));
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
                return a83.a;
        }
    }

    public /* synthetic */ q90(int i, Class cls) {
        this.h = i;
        this.i = cls;
    }
}
