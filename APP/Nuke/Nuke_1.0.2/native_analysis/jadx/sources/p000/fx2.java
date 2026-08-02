package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fx2 extends gx2 {

    /* JADX INFO: renamed from: j */
    public static volatile Object f3169j;

    /* JADX INFO: renamed from: d */
    public static final fx2 f3163d = new fx2(false);

    /* JADX INFO: renamed from: e */
    public static final int f3164e = R.string.swipe_to_quote_message;

    /* JADX INFO: renamed from: f */
    public static final int f3165f = R.string.swipe_to_quote_message_description;

    /* JADX INFO: renamed from: g */
    public static final wm0 f3166g = wm0.f12575i;

    /* JADX INFO: renamed from: h */
    public static final String f3167h = "SwipeToQuoteMessage";

    /* JADX INFO: renamed from: i */
    public static final boolean f3168i = true;

    /* JADX INFO: renamed from: k */
    public static final ConcurrentHashMap f3170k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: l */
    public static final hx2 f3171l = new hx2(new hn1(25));

    /* JADX INFO: renamed from: q */
    public static void m1726q(View view) {
        view.cancelLongPress();
        view.setPressed(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.getClass();
                m1726q(childAt);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static cx2 m1727r(Object obj, Object obj2) {
        Object x92Var;
        Class cls;
        fx2 fx2Var;
        Object next;
        Class cls2;
        try {
            sg1 sg1VarM3244v = op0.m3602y(obj).m3244v();
            sg1VarM3244v.m6411b();
            Class clsM3691A = p40.m3691A(d72.m967a(Boolean.class));
            if (clsM3691A == null) {
                clsM3691A = Boolean.class;
            }
            sg1VarM3244v.f10113C = clsM3691A;
            sg1VarM3244v.m4864d(obj2.getClass());
            x92Var = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v.m4863c())).f13895j;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Object obj3 = null;
        if (x92Var instanceof x92) {
            x92Var = null;
        }
        Method method = (Method) x92Var;
        if (method != null) {
            ig1.m2344a(method);
            return new cx2(method, false);
        }
        pb1 pb1VarM1424E = AbstractC0179eu.m1424E();
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            cls2 = Object.class;
            Class<Object> clsM3691A2 = p40.m3691A(d72.m967a(cls2));
            if (superclass.equals(clsM3691A2 != null ? clsM3691A2 : Object.class)) {
                break;
            }
            Method[] declaredMethods = superclass.getDeclaredMethods();
            declaredMethods.getClass();
            AbstractC0325iu.m2394h0(pb1VarM1424E, declaredMethods);
        }
        pb1 pb1VarM1476z = AbstractC0179eu.m1476z(pb1VarM1424E);
        ListIterator listIterator = pb1VarM1476z.listIterator(0);
        while (true) {
            vs0 vs0Var = (vs0) listIterator;
            boolean zHasNext = vs0Var.hasNext();
            cls = Boolean.TYPE;
            fx2Var = f3163d;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = vs0Var.next();
            Method method2 = (Method) next;
            if (!Modifier.isStatic(method2.getModifiers())) {
                fx2Var.getClass();
                if (t11.m5086l(method2.getReturnType(), cls) || t11.m5086l(method2.getReturnType(), Boolean.class)) {
                    if (method2.getParameterCount() == 1 && method2.getParameterTypes()[0].isAssignableFrom(obj2.getClass())) {
                        break;
                    }
                }
            }
        }
        Method method3 = (Method) next;
        if (method3 != null) {
            ig1.m2344a(method3);
            return new cx2(method3, false);
        }
        ListIterator listIterator2 = pb1VarM1476z.listIterator(0);
        while (true) {
            vs0 vs0Var2 = (vs0) listIterator2;
            if (!vs0Var2.hasNext()) {
                break;
            }
            Object next2 = vs0Var2.next();
            Method method4 = (Method) next2;
            if (!Modifier.isStatic(method4.getModifiers())) {
                fx2Var.getClass();
                if (t11.m5086l(method4.getReturnType(), cls) || t11.m5086l(method4.getReturnType(), Boolean.class)) {
                    if (method4.getParameterCount() == 2 && method4.getParameterTypes()[0].isAssignableFrom(obj2.getClass()) && !method4.getParameterTypes()[1].isPrimitive()) {
                        obj3 = next2;
                        break;
                    }
                }
            }
        }
        Method method5 = (Method) obj3;
        if (method5 != null) {
            ig1.m2344a(method5);
            return new cx2(method5, true);
        }
        throw new IllegalStateException(("Quote method not found: footer=" + obj.getClass().getName() + ", message=" + obj2.getClass().getName()).toString());
    }

    /* JADX INFO: renamed from: s */
    public static void m1728s(View view, boolean z) {
        Object x92Var;
        Class<Boolean> cls = Boolean.class;
        try {
            hi0 hi0VarM3241r = op0.m3602y(view).m3241r();
            Class<Boolean> clsM3691A = p40.m3691A(d72.m967a(cls));
            if (clsM3691A != null) {
                cls = clsM3691A;
            }
            hi0VarM3241r.f4030g = cls;
            pi0 pi0Var = (pi0) AbstractC0142du.m1159o0(hi0VarM3241r.m2194c());
            Boolean boolValueOf = Boolean.valueOf(z);
            pi0Var.m5328R();
            pi0Var.f8357j.set(pi0Var.f5866i, boolValueOf);
            x92Var = a83.f116a;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Throwable thM6237a = y92.m6237a(x92Var);
        if (thM6237a != null) {
            f3163d.getClass();
            thM6237a.getMessage();
            f3167h.getClass();
        }
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f3167h;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: e */
    public final boolean mo139e() {
        return f3168i;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() throws NoSuchMethodException {
        Class cls;
        Class cls2;
        C0361js.f5188d.getClass();
        Method method = (Method) C0361js.f5190f.getValue();
        method.getClass();
        XposedBridge.hookMethod(method, new kg3(this, null, new ml2(27))).getClass();
        Method method2 = (Method) C0361js.f5192h.getValue();
        method2.getClass();
        XposedBridge.hookMethod(method2, new kg3(this, new ml2(29), null)).getClass();
        Class cls3 = (Class) C0361js.f5191g.getValue();
        Constructor<?>[] declaredConstructors = cls3.getDeclaredConstructors();
        declaredConstructors.getClass();
        for (Constructor<?> constructor : declaredConstructors) {
            constructor.getClass();
            XposedBridge.hookMethod(constructor, new kg3(f3163d, null, new ml2(28))).getClass();
        }
        cls = ViewGroup.class;
        Class<ViewGroup> clsM3691A = p40.m3691A(d72.m967a(cls));
        cls = clsM3691A != null ? clsM3691A : ViewGroup.class;
        cls2 = MotionEvent.class;
        Class<MotionEvent> clsM3691A2 = p40.m3691A(d72.m967a(cls2));
        Method declaredMethod = cls.getDeclaredMethod("dispatchTouchEvent", clsM3691A2 != null ? clsM3691A2 : MotionEvent.class);
        declaredMethod.getClass();
        XposedBridge.hookMethod(declaredMethod, new kg3(this, new q90(2, cls3), null)).getClass();
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: k */
    public final Integer mo141k() {
        return Integer.valueOf(f3165f);
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: m */
    public final int mo142m() {
        return f3164e;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: n */
    public final wm0 mo143n() {
        return f3166g;
    }
}
