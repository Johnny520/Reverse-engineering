package p000;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p000.m00;

/* JADX INFO: renamed from: ae */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0015ae {

    /* JADX INFO: renamed from: c */
    private static boolean f113c = false;

    /* JADX INFO: renamed from: e */
    private static volatile Object f115e = null;

    /* JADX INFO: renamed from: g */
    private static final String f117g = "\u001e";

    /* JADX INFO: renamed from: a */
    public static final C0015ae f111a = new C0015ae();

    /* JADX INFO: renamed from: b */
    private static final Set<String> f112b = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    private static boolean f114d = true;

    /* JADX INFO: renamed from: f */
    private static final u60 f116f = new x51(new C0003a2(11));

    /* JADX INFO: renamed from: h */
    private static final u60 f118h = new x51(new C0003a2(17));

    /* JADX INFO: renamed from: i */
    private static final u60 f119i = new x51(new C0003a2(18));

    /* JADX INFO: renamed from: j */
    private static final u60 f120j = new x51(new C0003a2(4));

    /* JADX INFO: renamed from: k */
    private static final u60 f121k = new x51(new C0003a2(5));

    /* JADX INFO: renamed from: l */
    private static final u60 f122l = new x51(new C0003a2(6));

    /* JADX INFO: renamed from: m */
    private static final u60 f123m = new x51(new C0003a2(7));

    /* JADX INFO: renamed from: n */
    private static final u60 f124n = new x51(new C0003a2(8));

    /* JADX INFO: renamed from: o */
    private static final u60 f125o = new x51(new C0003a2(9));

    /* JADX INFO: renamed from: p */
    private static final u60 f126p = new x51(new C0003a2(10));

    /* JADX INFO: renamed from: q */
    private static final u60 f127q = new x51(new C0003a2(12));

    /* JADX INFO: renamed from: r */
    private static final u60 f128r = new x51(new C0003a2(13));

    /* JADX INFO: renamed from: s */
    private static final u60 f129s = new x51(new C0003a2(14));

    /* JADX INFO: renamed from: t */
    private static final u60 f130t = new x51(new C0003a2(15));

    /* JADX INFO: renamed from: u */
    private static final u60 f131u = new x51(new C0003a2(16));

    /* JADX INFO: renamed from: v */
    public static final int f132v = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C0015ae() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final String m67A() {
        return "b";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final String m68B() {
        return "currentApplication";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final String m69C() {
        return "getItems";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final String m70D() {
        return "M1";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final String m71E() {
        return "notifyDataSetChanged";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final String m72F() {
        return "onBindViewHolder";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    private final Object m73G(Object obj, String str, Object... objArr) {
        Object objInvoke = null;
        if (obj == null) {
            return null;
        }
        try {
            Method[] methods = obj.getClass().getMethods();
            methods.getClass();
            ArrayList arrayList = new ArrayList();
            for (Method method : methods) {
                if (p30.m3002l(method.getName(), str) && method.getParameterTypes().length == objArr.length) {
                    arrayList.add(method);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    objInvoke = ((Method) it.next()).invoke(obj, Arrays.copyOf(objArr, objArr.length));
                    break;
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
        return objInvoke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    private final View m74H(View view) {
        try {
            LinearLayout linearLayout = view instanceof LinearLayout ? (LinearLayout) view : null;
            if (linearLayout == null) {
                return null;
            }
            View childAt = linearLayout.getChildAt(2);
            FrameLayout frameLayout = childAt instanceof FrameLayout ? (FrameLayout) childAt : null;
            if (frameLayout == null) {
                return null;
            }
            return frameLayout.getChildAt(0);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    private final Handler m75I() {
        return (Handler) f116f.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    private final String m76J(Object obj) {
        try {
            Object objM73G = m73G(obj, m89W(), new Object[0]);
            String str = objM73G instanceof String ? (String) objM73G : null;
            if (str != null) {
                if (str.length() != 0) {
                    return str;
                }
            }
        } catch (Exception unused) {
        }
        try {
            Field declaredField = obj.getClass().getDeclaredField(m85S());
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 != null) {
                if (str2.length() != 0) {
                    return str2;
                }
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    private final Object m77K(Object obj) {
        try {
            Class<?> cls = obj.getClass();
            try {
                Field declaredField = cls.getDeclaredField(m83Q());
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (obj2 != null) {
                    if (obj2.getClass().getName().equals(m82P())) {
                        return obj2;
                    }
                }
            } catch (Exception unused) {
            }
            C0822v c0822vM1933s = AbstractC0398kl.m1933s(cls.getDeclaredFields());
            while (c0822vM1933s.hasNext()) {
                Field field = (Field) c0822vM1933s.next();
                field.setAccessible(true);
                Object obj3 = field.get(obj);
                if (obj3 != null && obj3.getClass().getName().equals(m82P())) {
                    return obj3;
                }
            }
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    private final String m78L() {
        return (String) f122l.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    private final String m79M() {
        return (String) f119i.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    private final String m80N() {
        return (String) f118h.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    private final String m81O() {
        return (String) f121k.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    private final String m82P() {
        return (String) f120j.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    private final String m83Q() {
        return (String) f129s.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    private final String m84R() {
        return (String) f131u.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    private final String m85S() {
        return (String) f130t.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    private final String m86T() {
        return (String) f123m.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    private final String m87U() {
        return (String) f127q.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    private final String m88V() {
        return (String) f125o.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    private final String m89W() {
        return (String) f128r.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    private final String m90X() {
        return (String) f126p.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    private final String m91Y() {
        return (String) f124n.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    private final void m93a0(ClassLoader classLoader) throws NoSuchMethodException {
        XposedInterface.HookBuilder hookBuilderHook;
        Method declaredMethod = classLoader.loadClass(m79M()).getDeclaredMethod(m91Y(), classLoader.loadClass(m81O()), Integer.TYPE, List.class);
        kf1 kf1VarM1887b = kf1.f3100G.m1887b();
        if (kf1VarM1887b == null || (hookBuilderHook = kf1VarM1887b.hook(declaredMethod)) == null) {
            return;
        }
        hookBuilderHook.intercept(new C0796ua(1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final Object m95b0(XposedInterface.Chain chain) {
        Object obj;
        Object objM77K;
        String strM76J;
        chain.getClass();
        Object objProceed = chain.proceed();
        try {
            f115e = chain.getThisObject();
            Set<String> set = f112b;
            if (!set.isEmpty()) {
                Object thisObject = chain.getThisObject();
                C0015ae c0015ae = f111a;
                Object objM73G = c0015ae.m73G(thisObject, c0015ae.m88V(), new Object[0]);
                List list = objM73G instanceof List ? (List) objM73G : null;
                if (list != null) {
                    Object obj2 = chain.getArgs().get(1);
                    obj2.getClass();
                    int iIntValue = ((Integer) obj2).intValue();
                    if (iIntValue >= 0 && iIntValue < list.size() && (obj = list.get(iIntValue)) != null && (objM77K = c0015ae.m77K(obj)) != null && (strM76J = c0015ae.m76J(objM77K)) != null) {
                        Object obj3 = chain.getArgs().get(0);
                        Object obj4 = obj3.getClass().getField(c0015ae.m84R()).get(obj3);
                        obj4.getClass();
                        View viewM74H = c0015ae.m74H((View) obj4);
                        if (viewM74H != null) {
                            if (set.contains(strM76J)) {
                                viewM74H.setBackgroundColor(Color.argb(80, 255, 68, 68));
                                return objProceed;
                            }
                            viewM74H.setBackgroundColor(0);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return objProceed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    private final void m97c0(ClassLoader classLoader) throws NoSuchMethodException {
        XposedInterface.HookBuilder hookBuilderHook;
        Method declaredMethod = classLoader.loadClass(m80N()).getDeclaredMethod(m86T(), null);
        kf1 kf1VarM1887b = kf1.f3100G.m1887b();
        if (kf1VarM1887b == null || (hookBuilderHook = kf1VarM1887b.hook(declaredMethod)) == null) {
            return;
        }
        hookBuilderHook.intercept(new C0796ua(2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final Object m99d0(XposedInterface.Chain chain) {
        chain.getClass();
        Object objProceed = chain.proceed();
        try {
            String str = objProceed instanceof String ? (String) objProceed : null;
            if (str != null && str.length() != 0) {
                Set<String> set = f112b;
                if (set.contains(str)) {
                    return "";
                }
                if (f114d) {
                    set.add(str);
                    C0015ae c0015ae = f111a;
                    c0015ae.m104g0();
                    c0015ae.m108i0();
                    return "";
                }
            }
        } catch (Exception unused) {
        }
        return objProceed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final Handler m102f0() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    private final void m104g0() {
        try {
            Object objInvoke = Class.forName(m78L()).getMethod(m87U(), null).invoke(null, null);
            Context context = objInvoke instanceof Context ? (Context) objInvoke : null;
            if (context == null) {
                return;
            }
            m00.C0452a c0452a = m00.f3663S;
            context.getSharedPreferences(c0452a.m2362Y(), 0).edit().putString(c0452a.m2350M(), AbstractC0960ye.m5245O(f112b, f117g, null, null, null, 62)).apply();
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    private final boolean m106h0() {
        try {
            Object objInvoke = Class.forName(m78L()).getMethod(m87U(), null).invoke(null, null);
            Context context = objInvoke instanceof Context ? (Context) objInvoke : null;
            if (context == null) {
                return true;
            }
            m00.C0452a c0452a = m00.f3663S;
            return context.getSharedPreferences(c0452a.m2362Y(), 0).getBoolean(c0452a.m2351N(), false);
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    private final void m108i0() {
        Object obj = f115e;
        if (obj == null) {
            return;
        }
        m75I().postDelayed(new RunnableC1000zd(0, obj), 300L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final void m110j0(Object obj) {
        try {
            C0015ae c0015ae = f111a;
            c0015ae.m73G(obj, c0015ae.m90X(), new Object[0]);
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final String m119s() {
        return "android.app.ActivityThread";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final String m120t() {
        return "com.xingin.im.ui.adapter.multi.adapter.ChatPageMultiAdapter";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final String m121u() {
        return "com.xingin.chatbase.bean.MsgRevokeBaseBean";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final String m122v() {
        return "androidx.recyclerview.widget.RecyclerView$ViewHolder";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final String m123w() {
        return "com.xingin.chatbase.bean.MsgUIData";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final String m124x() {
        return "d";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final String m125y() {
        return "itemView";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final String m126z() {
        return "msgId";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public final void m127Z(ClassLoader classLoader) {
        classLoader.getClass();
        f114d = m106h0();
        try {
            m97c0(classLoader);
        } catch (Exception unused) {
        }
        try {
            m93a0(classLoader);
        } catch (Exception unused2) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public final void m128e0(Context context) {
        context.getClass();
        if (f113c) {
            return;
        }
        f113c = true;
        try {
            m00.C0452a c0452a = m00.f3663S;
            String string = context.getSharedPreferences(c0452a.m2362Y(), 0).getString(c0452a.m2350M(), null);
            if (string != null && string.length() != 0) {
                Set<String> set = f112b;
                List listM1773e0 = k41.m1773e0(string, new String[]{f117g}, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM1773e0) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                set.addAll(arrayList);
            }
        } catch (Exception unused) {
        }
    }
}
