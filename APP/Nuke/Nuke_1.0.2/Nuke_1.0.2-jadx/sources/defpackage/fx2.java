package defpackage;

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
    public static volatile Object j;
    public static final fx2 d = new fx2(false);
    public static final int e = R.string.swipe_to_quote_message;
    public static final int f = R.string.swipe_to_quote_message_description;
    public static final wm0 g = wm0.i;
    public static final String h = "SwipeToQuoteMessage";
    public static final boolean i = true;
    public static final ConcurrentHashMap k = new ConcurrentHashMap();
    public static final hx2 l = new hx2(new hn1(25));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void q(View view) {
        view.cancelLongPress();
        view.setPressed(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                childAt.getClass();
                q(childAt);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static cx2 r(Object obj, Object obj2) {
        Object x92Var;
        Class cls;
        fx2 fx2Var;
        Object next;
        Class cls2;
        try {
            sg1 sg1VarV = op0.y(obj).v();
            sg1VarV.b();
            Class clsA = p40.A(d72.a(Boolean.class));
            if (clsA == null) {
                clsA = Boolean.class;
            }
            sg1VarV.C = clsA;
            sg1VarV.d(obj2.getClass());
            x92Var = ((zg1) du.o0(sg1VarV.c())).j;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Object obj3 = null;
        if (x92Var instanceof x92) {
            x92Var = null;
        }
        Method method = (Method) x92Var;
        if (method != null) {
            ig1.a(method);
            return new cx2(method, false);
        }
        pb1 pb1VarE = eu.E();
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            cls2 = Object.class;
            Class<Object> clsA2 = p40.A(d72.a(cls2));
            if (superclass.equals(clsA2 != null ? clsA2 : Object.class)) {
                break;
            }
            Method[] declaredMethods = superclass.getDeclaredMethods();
            declaredMethods.getClass();
            iu.h0(pb1VarE, declaredMethods);
        }
        pb1 pb1VarZ = eu.z(pb1VarE);
        ListIterator listIterator = pb1VarZ.listIterator(0);
        while (true) {
            vs0 vs0Var = (vs0) listIterator;
            boolean zHasNext = vs0Var.hasNext();
            cls = Boolean.TYPE;
            fx2Var = d;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = vs0Var.next();
            Method method2 = (Method) next;
            if (!Modifier.isStatic(method2.getModifiers())) {
                fx2Var.getClass();
                if (t11.l(method2.getReturnType(), cls) || t11.l(method2.getReturnType(), Boolean.class)) {
                    if (method2.getParameterCount() == 1 && method2.getParameterTypes()[0].isAssignableFrom(obj2.getClass())) {
                        break;
                    }
                }
            }
        }
        Method method3 = (Method) next;
        if (method3 != null) {
            ig1.a(method3);
            return new cx2(method3, false);
        }
        ListIterator listIterator2 = pb1VarZ.listIterator(0);
        while (true) {
            vs0 vs0Var2 = (vs0) listIterator2;
            if (!vs0Var2.hasNext()) {
                break;
            }
            Object next2 = vs0Var2.next();
            Method method4 = (Method) next2;
            if (!Modifier.isStatic(method4.getModifiers())) {
                fx2Var.getClass();
                if (t11.l(method4.getReturnType(), cls) || t11.l(method4.getReturnType(), Boolean.class)) {
                    if (method4.getParameterCount() == 2 && method4.getParameterTypes()[0].isAssignableFrom(obj2.getClass()) && !method4.getParameterTypes()[1].isPrimitive()) {
                        obj3 = next2;
                        break;
                    }
                }
            }
        }
        Method method5 = (Method) obj3;
        if (method5 != null) {
            ig1.a(method5);
            return new cx2(method5, true);
        }
        throw new IllegalStateException(("Quote method not found: footer=" + obj.getClass().getName() + ", message=" + obj2.getClass().getName()).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void s(View view, boolean z) {
        Object x92Var;
        Class<Boolean> cls = Boolean.class;
        try {
            hi0 hi0VarR = op0.y(view).r();
            Class<Boolean> clsA = p40.A(d72.a(cls));
            if (clsA != null) {
                cls = clsA;
            }
            hi0VarR.g = cls;
            pi0 pi0Var = (pi0) du.o0(hi0VarR.c());
            Boolean boolValueOf = Boolean.valueOf(z);
            pi0Var.R();
            pi0Var.j.set(pi0Var.i, boolValueOf);
            x92Var = a83.a;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Throwable thA = y92.a(x92Var);
        if (thA != null) {
            d.getClass();
            thA.getMessage();
            h.getClass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final boolean e() {
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void g() throws NoSuchMethodException {
        Class cls;
        Class cls2;
        js.d.getClass();
        Method method = (Method) js.f.getValue();
        method.getClass();
        XposedBridge.hookMethod(method, new kg3(this, null, new ml2(27))).getClass();
        Method method2 = (Method) js.h.getValue();
        method2.getClass();
        XposedBridge.hookMethod(method2, new kg3(this, new ml2(29), null)).getClass();
        Class cls3 = (Class) js.g.getValue();
        Constructor<?>[] declaredConstructors = cls3.getDeclaredConstructors();
        declaredConstructors.getClass();
        for (Constructor<?> constructor : declaredConstructors) {
            constructor.getClass();
            XposedBridge.hookMethod(constructor, new kg3(d, null, new ml2(28))).getClass();
        }
        cls = ViewGroup.class;
        Class<ViewGroup> clsA = p40.A(d72.a(cls));
        cls = clsA != null ? clsA : ViewGroup.class;
        cls2 = MotionEvent.class;
        Class<MotionEvent> clsA2 = p40.A(d72.a(cls2));
        Method declaredMethod = cls.getDeclaredMethod("dispatchTouchEvent", clsA2 != null ? clsA2 : MotionEvent.class);
        declaredMethod.getClass();
        XposedBridge.hookMethod(declaredMethod, new kg3(this, new q90(2, cls3), null)).getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final Integer k() {
        return Integer.valueOf(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final int m() {
        return e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final wm0 n() {
        return g;
    }
}
