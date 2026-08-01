package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import com.p001mr.elaris.xposedcompat.XposedHelpers;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: r0 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0429r0 {

    /* JADX INFO: renamed from: a */
    public static final Map f772a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public static volatile XC_MethodHook.Unhook f773b;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f774c;

    /* JADX INFO: renamed from: d */
    public static volatile long f775d;

    /* JADX INFO: renamed from: e */
    public static volatile C0223g0 f776e;

    /* JADX INFO: renamed from: f */
    public static volatile Context f777f;

    /* JADX INFO: renamed from: g */
    public static volatile C0274j0 f778g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m821a(C0322m0 c0322m0, boolean z) {
        if (z) {
            ViewGroup viewGroup = (ViewGroup) c0322m0.f542a.get();
            Object obj = c0322m0.f544c.get();
            C0274j0 c0274j0 = f778g;
            if (viewGroup == null || obj == null || c0274j0 == null) {
                return;
            }
            try {
                Object obj2 = c0274j0.f440f.get(obj);
                if (!c0274j0.f436b.isInstance(obj2) || c0274j0.f437c.isInstance(obj2)) {
                    obj2 = null;
                }
                if (obj2 == null) {
                    m837q(viewGroup);
                    return;
                }
                Object obj3 = c0322m0.f545d.get();
                if (obj3 == null || obj3 != obj2) {
                    m835o(c0322m0, obj2, c0274j0);
                }
            } catch (Throwable th) {
                m837q(viewGroup);
                AbstractC0198e7.m343a("message-status-row", "validate-attached", th);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static Field m822b(Class cls, Class cls2) throws NoSuchFieldException {
        Field field = null;
        for (Field field2 : cls.getDeclaredFields()) {
            if (field2.getType() == cls2 && !Modifier.isStatic(field2.getModifiers())) {
                if (field != null) {
                    throw new NoSuchFieldException("multiple " + cls2.getName() + " fields in " + cls.getName());
                }
                field = field2;
            }
        }
        if (field != null) {
            field.setAccessible(true);
            return field;
        }
        throw new NoSuchFieldException(cls2.getName() + " field in " + cls.getName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m823c(TextView textView) {
        if (textView == null) {
            return;
        }
        Object tag = textView.getTag();
        C0413q0 c0413q0 = tag instanceof C0413q0 ? (C0413q0) tag : new C0413q0();
        Context context = textView.getContext();
        boolean z = context != null && (context.getResources().getConfiguration().uiMode & 48) == 32;
        if (c0413q0.f729b && c0413q0.f728a == z) {
            return;
        }
        c0413q0.f728a = z;
        c0413q0.f729b = true;
        textView.setTag(c0413q0);
        textView.setTextColor(z ? Color.rgb(32, 34, 38) : -1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(z ? Color.argb(224, 166, 170, 178) : Color.argb(230, 118, 122, 132));
        gradientDrawable.setCornerRadius(m826f(textView.getContext(), 9.0f));
        textView.setBackground(gradientDrawable);
        textView.setElevation(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m824d() {
        ArrayList arrayList = new ArrayList();
        Map map = f772a;
        synchronized (map) {
            arrayList.addAll(map.values());
        }
        synchronized (map) {
            map.clear();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C0322m0 c0322m0 = (C0322m0) arrayList.get(i);
            if (c0322m0 != null) {
                ViewGroup viewGroup = (ViewGroup) c0322m0.f542a.get();
                if (viewGroup != null) {
                    viewGroup.removeOnAttachStateChangeListener(c0322m0.f551j);
                }
                m828h(c0322m0);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m825e(C0397p0 c0397p0) {
        if (c0397p0 == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) c0397p0.f678c.get();
        ViewGroup viewGroup2 = (ViewGroup) c0397p0.f677b.get();
        if (viewGroup != null) {
            try {
                viewGroup.getOverlay().remove(c0397p0.f680e);
            } catch (Throwable th) {
                AbstractC0198e7.m343a("message-status-row", "remove-row-overlay", th);
                return;
            }
        }
        if (viewGroup2 != null) {
            viewGroup2.removeOnLayoutChangeListener(c0397p0.f683h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static int m826f(Context context, float f) {
        if (context != null) {
            f *= context.getResources().getDisplayMetrics().density;
        }
        return (int) (f + 0.5f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static Method m827g(Class cls, Class cls2) throws NoSuchMethodException {
        Method method = null;
        for (Method method2 : cls.getDeclaredMethods()) {
            Class<?>[] parameterTypes = method2.getParameterTypes();
            if ("handleUIState".equals(method2.getName()) && method2.getReturnType() == Void.TYPE && parameterTypes.length == 1 && parameterTypes[0] == cls2 && !Modifier.isStatic(method2.getModifiers())) {
                if (method != null) {
                    throw new NoSuchMethodException("multiple handleUIState(MviUIState) methods");
                }
                method = method2;
            }
        }
        if (method == null) {
            throw new NoSuchMethodException("handleUIState(MviUIState)");
        }
        method.setAccessible(true);
        return method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m828h(C0322m0 c0322m0) {
        if (c0322m0 == null) {
            return;
        }
        C0397p0 c0397p0 = c0322m0.f550i;
        c0322m0.f550i = null;
        if (c0397p0 != null) {
            m825e(c0397p0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static C0290k0 m829i(Object obj, C0274j0 c0274j0) throws IllegalAccessException, InvocationTargetException {
        String strValueOf;
        long j;
        if (obj == null) {
            return new C0290k0(0, "", 0L, 0L, 0L, "", 0L, 0L);
        }
        int iIntValue = ((Number) c0274j0.f443i.invoke(obj, null)).intValue();
        Object objInvoke = c0274j0.f444j.invoke(obj, null);
        String strValueOf2 = objInvoke == null ? "" : String.valueOf(objInvoke);
        long jLongValue = ((Number) c0274j0.f445k.invoke(obj, null)).longValue();
        long jLongValue2 = ((Number) c0274j0.f446l.invoke(obj, null)).longValue();
        long jLongValue3 = ((Number) c0274j0.f447m.invoke(obj, null)).longValue();
        Object objInvoke2 = c0274j0.f448n.invoke(obj, null);
        String strValueOf3 = objInvoke2 == null ? "" : String.valueOf(objInvoke2);
        if (strValueOf3.length() == 0) {
            Object objInvoke3 = c0274j0.f449o.invoke(obj, null);
            strValueOf = objInvoke3 != null ? String.valueOf(objInvoke3) : "";
        } else {
            strValueOf = strValueOf3;
        }
        long jLongValue4 = ((Number) c0274j0.f450p.invoke(obj, null)).longValue();
        Object objInvoke4 = c0274j0.f451q.invoke(obj, null);
        long j2 = 0;
        if (objInvoke4 instanceof Number) {
            long jLongValue5 = ((Number) objInvoke4).longValue();
            if (jLongValue5 < 1000000000000L || jLongValue5 > 4102444800000L) {
                if (jLongValue5 >= 1000000000 && jLongValue5 <= 4102444800L) {
                    j2 = 1000 * jLongValue5;
                }
                j = j2;
            } else {
                j = jLongValue5;
            }
        } else {
            j = j2;
        }
        return new C0290k0(iIntValue, strValueOf2, jLongValue, jLongValue2, jLongValue3, strValueOf, jLongValue4, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static synchronized void m830j(ClassLoader classLoader) {
        if (classLoader == null) {
            return;
        }
        if (f774c) {
            m842v();
            return;
        }
        try {
            C0274j0 c0274j0M702a = C0274j0.m702a(classLoader);
            Method methodM827g = m827g(m839s(classLoader, "com.tencent.mobileqq.aio.msglist.holder.AIOBubbleMsgItemVB"), m839s(classLoader, "com.tencent.mvi.base.mvi.MviUIState"));
            f773b = XposedBridge.hookMethod(methodM827g, new C0207f0(c0274j0M702a));
            f778g = c0274j0M702a;
            f774c = true;
            m842v();
            m841u();
            HookEntry.log("message status row hooked: ".concat(methodM827g.getDeclaringClass().getName() + "." + methodM827g.getName() + Arrays.toString(methodM827g.getParameterTypes())));
            HookEntry.log("message status row hooks installed count=1 path=qq93-direct");
        } catch (Throwable th) {
            f774c = false;
            f773b = null;
            f778g = null;
            AbstractC0198e7.m343a("message-status-row", "install-qq93-direct", th);
            HookEntry.log("message status row hook skipped reason=qq93 target missing");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static synchronized void m831k() {
        if (f776e != null) {
            return;
        }
        Context contextHostContext = HookEntry.hostContext();
        if (contextHostContext == null) {
            return;
        }
        Context applicationContext = contextHostContext.getApplicationContext();
        if (applicationContext != null) {
            contextHostContext = applicationContext;
        }
        C0223g0 c0223g0 = new C0223g0();
        try {
            IntentFilter intentFilter = new IntentFilter("com.mr.elaris.action.ANTI_RECALL_STATUS_CHANGED");
            if (Build.VERSION.SDK_INT >= 33) {
                contextHostContext.registerReceiver(c0223g0, intentFilter, 4);
            } else {
                contextHostContext.registerReceiver(c0223g0, intentFilter);
            }
            f777f = contextHostContext;
            f776e = c0223g0;
        } catch (Throwable th) {
            AbstractC0198e7.m343a("message-status-row", "register-status-receiver", th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m832l(C0322m0 c0322m0) {
        ViewGroup viewGroup;
        boolean z;
        C0415q2 c0415q2;
        C0415q2 c0415q22;
        C0397p0 c0397p0 = c0322m0.f550i;
        if (c0397p0 == null || c0322m0.f546e == null) {
            return;
        }
        WeakReference weakReference = c0397p0.f676a;
        TextView textView = c0397p0.f682g;
        TextView textView2 = c0397p0.f681f;
        boolean z2 = c0397p0.f679d;
        ViewGroup viewGroup2 = (ViewGroup) weakReference.get();
        ViewGroup viewGroup3 = (ViewGroup) c0397p0.f677b.get();
        View view = (ViewGroup) c0397p0.f678c.get();
        FrameLayout frameLayout = c0397p0.f680e;
        if (viewGroup2 == null || viewGroup3 == null || view == null || frameLayout.getVisibility() != 0) {
            return;
        }
        try {
            int iM826f = m826f(viewGroup3.getContext(), 2.0f);
            int width = z2 ? viewGroup3.getWidth() : viewGroup2.getWidth();
            int height = z2 ? viewGroup3.getHeight() : viewGroup2.getHeight();
            if (width > 0 && height > 0) {
                Map map = AbstractC0553yc.f1110a;
                boolean z3 = false;
                for (int i = 0; view != null && i < 10; i++) {
                    if (view.getScaleX() < 0.0f) {
                        z3 = !z3;
                    }
                    float rotationY = view.getRotationY() % 360.0f;
                    if (rotationY < 0.0f) {
                        rotationY += 360.0f;
                    }
                    if (rotationY > 90.0f && rotationY < 270.0f) {
                        z3 = !z3;
                    }
                    Object parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                }
                float f = z3 ? -1.0f : 1.0f;
                int top = viewGroup3.getTop();
                int right = viewGroup3.getRight();
                int bottom = viewGroup3.getBottom();
                if (!c0397p0.f684i && c0397p0.f685j == width && c0397p0.f686k == height && c0397p0.f687l == top && c0397p0.f688m == right && c0397p0.f689n == bottom && Float.compare(c0397p0.f690o, f) == 0) {
                    return;
                }
                frameLayout.setScaleX(f);
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
                frameLayout.layout(0, 0, width, height);
                if (textView2.getVisibility() == 0) {
                    textView2.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, width), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.max(0, height), Integer.MIN_VALUE));
                    int measuredWidth = textView2.getMeasuredWidth();
                    int measuredHeight = textView2.getMeasuredHeight();
                    if (z2) {
                        int iMax = Math.max(0, iM826f);
                        viewGroup = viewGroup2;
                        c0415q22 = new C0415q2(Math.max(iMax, (Math.max(0, width) - Math.max(0, measuredWidth)) - iMax), Math.max(iMax, (Math.max(0, height) - Math.max(0, measuredHeight)) - iMax));
                        z = z2;
                    } else {
                        viewGroup = viewGroup2;
                        int iMax2 = Math.max(0, iM826f);
                        int iMax3 = Math.max(0, width);
                        int iMax4 = Math.max(0, measuredWidth);
                        z = z2;
                        c0415q22 = new C0415q2(Math.max(iMax2, Math.min(Math.max(iMax2, (iMax3 - iMax4) - iMax2), (Math.max(0, right) - iMax4) - iMax2)), Math.max(Math.max(0, top) + iMax2, (Math.max(0, bottom) - Math.max(0, measuredHeight)) - iMax2));
                    }
                    int i2 = c0415q22.f732a;
                    int i3 = c0415q22.f733b;
                    textView2.layout(i2, i3, measuredWidth + i2, measuredHeight + i3);
                } else {
                    viewGroup = viewGroup2;
                    z = z2;
                }
                if (textView.getVisibility() == 0) {
                    int width2 = viewGroup.getWidth();
                    int iMax5 = Math.max(0, width);
                    if (z) {
                        iMax5 = Math.max(iMax5, Math.max(0, width2));
                    }
                    textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, iMax5), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.max(0, height), Integer.MIN_VALUE));
                    int measuredWidth2 = textView.getMeasuredWidth();
                    int measuredHeight2 = textView.getMeasuredHeight();
                    if (z) {
                        int iMax6 = Math.max(0, iM826f);
                        c0415q2 = new C0415q2(Math.max(iMax6, (Math.max(0, width) - Math.max(0, measuredWidth2)) - iMax6), iMax6);
                    } else {
                        int iMax7 = Math.max(0, iM826f);
                        int iMax8 = Math.max(0, width);
                        int iMax9 = Math.max(0, measuredWidth2);
                        c0415q2 = new C0415q2(Math.max(iMax7, Math.min(Math.max(iMax7, (iMax8 - iMax9) - iMax7), (Math.max(0, right) - iMax9) - iMax7)), Math.max(iMax7, top + iMax7));
                    }
                    int i4 = c0415q2.f732a;
                    int i5 = c0415q2.f733b;
                    textView.layout(i4, i5, measuredWidth2 + i4, measuredHeight2 + i5);
                }
                c0397p0.f685j = width;
                c0397p0.f686k = height;
                c0397p0.f687l = top;
                c0397p0.f688m = right;
                c0397p0.f689n = bottom;
                c0397p0.f690o = f;
                c0397p0.f684i = false;
            }
        } catch (Throwable th) {
            AbstractC0198e7.m343a("message-status-row", "layout-row-overlay", th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static C0322m0 m833m(Object obj, Object obj2, ViewGroup viewGroup, ViewGroup viewGroup2, C0290k0 c0290k0, C0338n0 c0338n0) {
        C0322m0 c0322m0;
        Map map = f772a;
        synchronized (map) {
            c0322m0 = (C0322m0) map.get(viewGroup);
        }
        if (c0322m0 == null) {
            C0322m0 c0322m02 = new C0322m0(obj, obj2, viewGroup, viewGroup2, c0290k0, c0338n0);
            viewGroup.addOnAttachStateChangeListener(c0322m02.f551j);
            synchronized (map) {
                map.put(viewGroup, c0322m02);
            }
            return c0322m02;
        }
        ViewGroup viewGroup3 = (ViewGroup) c0322m0.f543b.get();
        if (viewGroup3 == null || viewGroup3 != viewGroup2) {
            m828h(c0322m0);
        }
        c0322m0.f543b = new WeakReference(viewGroup2);
        c0322m0.f544c = new WeakReference(obj);
        c0322m0.f545d = new WeakReference(obj2);
        c0322m0.f546e = c0290k0;
        c0322m0.f547f = c0338n0.f584b;
        c0322m0.f548g = c0338n0.f583a;
        c0322m0.f549h = (String) c0338n0.f585c;
        return c0322m0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static void m834n(ClassLoader classLoader) {
        boolean z = HookEntry.runtimeBool(Prefs.KEY_CHAT_MESSAGE_CORNER_TIME) || HookEntry.runtimeBool(Prefs.KEY_MESSAGE_RECALL_GUARD);
        if (z && classLoader != null) {
            m830j(classLoader);
        }
        m842v();
        if (!z) {
            m824d();
        } else {
            m836p();
            m841u();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0094, code lost:
    
        if (r13.equals(r4) != false) goto L44;
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m835o(C0322m0 c0322m0, Object obj, C0274j0 c0274j0) throws IllegalAccessException, InvocationTargetException {
        C0290k0 c0290k0;
        C0290k0 c0290k0M829i = m829i(c0274j0.f442h.invoke(obj, null), c0274j0);
        ViewGroup viewGroup = (ViewGroup) c0322m0.f542a.get();
        if (c0290k0M829i.m735a() && (c0290k0 = c0322m0.f546e) != null) {
            int i = c0290k0M829i.f477a;
            String str = c0290k0M829i.f478b;
            long j = c0290k0M829i.f479c;
            long j2 = c0290k0M829i.f480d;
            long j3 = c0290k0M829i.f481e;
            String str2 = c0290k0M829i.f482f;
            int i2 = c0290k0.f477a;
            String str3 = c0290k0.f478b;
            long j4 = c0290k0.f479c;
            long j5 = c0290k0.f480d;
            long j6 = c0290k0.f481e;
            String str4 = c0290k0.f482f;
            if (i == i2 && str.equals(str3)) {
                if (j2 <= 0 || j5 <= 0 || j2 != j5) {
                    if (j > 0 && j == j4) {
                        if (j3 < 0 && j3 >= -2147483648L) {
                            j3 &= 4294967295L;
                        }
                        if (j6 < 0 && j6 >= -2147483648L) {
                            j6 &= 4294967295L;
                        }
                        if (j3 > 0) {
                            if (j6 <= 0 || j3 != j6) {
                            }
                        }
                        if (str2.length() > 0) {
                        }
                    }
                }
                C0338n0 c0338n0M840t = m840t(c0290k0M829i, HookEntry.runtimeBool(Prefs.KEY_MESSAGE_RECALL_GUARD));
                c0322m0.f545d = new WeakReference(obj);
                c0322m0.f546e = c0290k0M829i;
                c0322m0.f547f = c0338n0M840t.f584b;
                c0322m0.f548g = c0338n0M840t.f583a;
                c0322m0.f549h = (String) c0338n0M840t.f585c;
                m838r(c0322m0);
                return;
            }
        }
        if (viewGroup != null) {
            m837q(viewGroup);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m836p() {
        ArrayList arrayList = new ArrayList();
        Map map = f772a;
        synchronized (map) {
            arrayList.addAll(map.values());
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C0322m0 c0322m0 = (C0322m0) arrayList.get(i);
            if (c0322m0 != null) {
                ViewGroup viewGroup = (ViewGroup) c0322m0.f542a.get();
                Object obj = c0322m0.f544c.get();
                C0274j0 c0274j0 = f778g;
                if (viewGroup != null && obj != null && c0274j0 != null) {
                    try {
                        Object obj2 = c0274j0.f440f.get(obj);
                        if (!c0274j0.f436b.isInstance(obj2) || c0274j0.f437c.isInstance(obj2)) {
                            obj2 = null;
                        }
                        if (obj2 == null) {
                            m837q(viewGroup);
                        } else {
                            m835o(c0322m0, obj2, c0274j0);
                        }
                    } catch (Throwable th) {
                        m837q(viewGroup);
                        AbstractC0198e7.m343a("message-status-row", "refresh-bound", th);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static void m837q(ViewGroup viewGroup) {
        C0322m0 c0322m0;
        Map map = f772a;
        synchronized (map) {
            c0322m0 = (C0322m0) map.remove(viewGroup);
        }
        if (c0322m0 != null) {
            ViewGroup viewGroup2 = (ViewGroup) c0322m0.f542a.get();
            if (viewGroup2 != null) {
                viewGroup2.removeOnAttachStateChangeListener(c0322m0.f551j);
            }
            m828h(c0322m0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static void m838r(C0322m0 c0322m0) {
        boolean z;
        C0290k0 c0290k0 = c0322m0.f546e;
        if (c0290k0 == null) {
            return;
        }
        boolean z2 = HookEntry.runtimeBool(Prefs.KEY_CHAT_MESSAGE_CORNER_TIME) && c0290k0.f484h > 0;
        boolean z3 = HookEntry.runtimeBool(Prefs.KEY_MESSAGE_RECALL_GUARD) && c0322m0.f547f;
        char c = (c0290k0.m735a() && (z2 || z3)) ? (char) 3 : (char) 2;
        if (c != 3) {
            if (c == 2) {
                m828h(c0322m0);
                return;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) c0322m0.f542a.get();
        ViewGroup viewGroup2 = (ViewGroup) c0322m0.f543b.get();
        if (viewGroup == null || viewGroup2 == null) {
            return;
        }
        C0397p0 c0397p0 = c0322m0.f550i;
        boolean z4 = c0322m0.f545d.get() != null;
        if (c0397p0 == null || c0397p0.f676a.get() != viewGroup || c0397p0.f677b.get() != viewGroup2 || c0397p0.f679d != z4) {
            m828h(c0322m0);
            ViewGroup viewGroup3 = z4 ? viewGroup2 : viewGroup;
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setBackgroundColor(0);
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            frameLayout.setSaveEnabled(false);
            frameLayout.setImportantForAccessibility(2);
            Context context = viewGroup.getContext();
            TextView textView = new TextView(context);
            textView.setTextColor(AbstractC0224g1.m414a());
            textView.setTextSize(10.0f);
            Typeface typeface = Typeface.DEFAULT;
            textView.setTypeface(typeface, 0);
            textView.setIncludeFontPadding(false);
            textView.setSingleLine(true);
            int iM826f = m826f(context, 4.0f);
            int iM826f2 = m826f(context, 1.0f);
            textView.setPadding(iM826f, iM826f2, iM826f, iM826f2);
            textView.setBackgroundColor(0);
            textView.setClickable(false);
            textView.setFocusable(false);
            textView.setSaveEnabled(false);
            textView.setImportantForAccessibility(2);
            Context context2 = viewGroup.getContext();
            TextView textView2 = new TextView(context2);
            textView2.setTag(new C0413q0());
            textView2.setText(AbstractC0486u9.m1071x(1) == 2 ? "管理员撤回" : "已撤回");
            textView2.setTextSize(9.0f);
            textView2.setTypeface(typeface, 0);
            textView2.setIncludeFontPadding(false);
            textView2.setSingleLine(true);
            textView2.setGravity(17);
            textView2.setMinHeight(m826f(context2, 18.0f));
            textView2.setPadding(m826f(context2, 6.0f), m826f(context2, 1.5f), m826f(context2, 6.0f), m826f(context2, 1.5f));
            textView2.setClickable(false);
            textView2.setFocusable(false);
            textView2.setSaveEnabled(false);
            textView2.setImportantForAccessibility(1);
            m823c(textView2);
            frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2));
            frameLayout.addView(textView2, new FrameLayout.LayoutParams(-2, -2));
            C0397p0 c0397p02 = new C0397p0(c0322m0, viewGroup, viewGroup2, viewGroup3, z4, frameLayout, textView, textView2);
            try {
                viewGroup3.getOverlay().add(frameLayout);
                viewGroup2.addOnLayoutChangeListener(c0397p02.f683h);
                c0397p0 = c0397p02;
            } catch (Throwable th) {
                m825e(c0397p02);
                AbstractC0198e7.m343a("message-status-row", "create-row-overlay", th);
                c0397p0 = null;
            }
            if (c0397p0 == null) {
                return;
            } else {
                c0322m0.f550i = c0397p0;
            }
        }
        if (z2) {
            long j = c0322m0.f546e.f484h;
            int i = AbstractC0224g1.f286a;
            String strRuntimeString = HookEntry.runtimeString(Prefs.KEY_CHAT_MESSAGE_CORNER_TIME_FORMAT, "ah:mm");
            if (strRuntimeString == null) {
                strRuntimeString = "";
            }
            if (!strRuntimeString.equals(AbstractC0224g1.f289d)) {
                AbstractC0224g1.f290e = AbstractC0399p2.m779b(strRuntimeString);
                AbstractC0224g1.f289d = strRuntimeString;
            }
            String strM778a = AbstractC0399p2.m778a(j, AbstractC0224g1.f290e);
            if (!strM778a.contentEquals(c0397p0.f681f.getText())) {
                c0397p0.f681f.setText(strM778a);
                c0397p0.f684i = true;
            }
            int iM414a = AbstractC0224g1.m414a();
            if (c0397p0.f681f.getCurrentTextColor() != iM414a) {
                c0397p0.f681f.setTextColor(iM414a);
            }
        }
        if (c0397p0.f681f.getVisibility() != (z2 ? 0 : 8)) {
            c0397p0.f684i = true;
        }
        c0397p0.f681f.setVisibility(z2 ? 0 : 8);
        String str = AbstractC0486u9.m1071x(c0322m0.f548g) == 2 ? "管理员撤回" : "已撤回";
        if (str.contentEquals(c0397p0.f682g.getText())) {
            z = true;
        } else {
            c0397p0.f682g.setText(str);
            z = true;
            c0397p0.f684i = true;
        }
        m823c(c0397p0.f682g);
        if (c0397p0.f682g.getVisibility() != (z3 ? 0 : 8)) {
            c0397p0.f684i = z;
        }
        c0397p0.f682g.setVisibility(z3 ? 0 : 8);
        if (c0397p0.f680e.getVisibility() != 0) {
            c0397p0.f680e.setVisibility(0);
        }
        m832l(c0322m0);
        String str2 = c0322m0.f549h;
        if (HookEntry.runtimeBool(Prefs.KEY_DEBUG_LOG)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - f775d < 60000) {
                return;
            }
            f775d = jCurrentTimeMillis;
            HookEntry.log("message status row hit path=qq93-direct row=" + viewGroup.getClass().getName() + " bubble=" + viewGroup2.getClass().getName() + " time=" + z2 + " recall=" + z3 + " source=" + str2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static Class m839s(ClassLoader classLoader, String str) throws ClassNotFoundException {
        Class<?> clsFindClassIfExists = XposedHelpers.findClassIfExists(str, classLoader);
        if (clsFindClassIfExists != null) {
            return clsFindClassIfExists;
        }
        throw new ClassNotFoundException(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static C0338n0 m840t(C0290k0 c0290k0, boolean z) {
        if (!z) {
            return new C0338n0("none", 0);
        }
        int i = c0290k0.f477a;
        String str = c0290k0.f478b;
        long j = c0290k0.f479c;
        long j2 = c0290k0.f480d;
        long j3 = c0290k0.f481e;
        String str2 = c0290k0.f482f;
        String[] strArr = AbstractC0033c0.f71a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iM1040B = AbstractC0486u9.m1040B(AbstractC0033c0.f72b.m998d(i, str, j, j2, j3, str2, jCurrentTimeMillis), AbstractC0033c0.f73c.f211a.m998d(i, str, j, j2, j3, str2, jCurrentTimeMillis));
        return iM1040B != 0 ? new C0338n0("verified-event", iM1040B) : c0290k0.f483g > 0 ? new C0338n0("record", 1) : new C0338n0("none", 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static void m841u() {
        if (f774c && HookEntry.runtimeBool(Prefs.KEY_MESSAGE_RECALL_GUARD)) {
            AbstractC0361o7.m769a("Elaris-anti-recall-status-cache", new RunnableC0255i0(HookEntry.hotReloadGeneration(), 0));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static synchronized void m842v() {
        if (f774c && HookEntry.runtimeBool(Prefs.KEY_MESSAGE_RECALL_GUARD)) {
            m831k();
        }
    }
}
