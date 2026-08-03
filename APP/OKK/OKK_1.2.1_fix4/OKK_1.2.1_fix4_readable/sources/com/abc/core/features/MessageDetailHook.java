package com.abc.core.features;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Process;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.luckypray.dexkit.C1031R;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.query.matchers.ClassMatcher;
import org.luckypray.dexkit.query.matchers.MethodMatcher;
import org.luckypray.dexkit.result.MethodData;
import p001A0.AbstractC0040p;
import p001A0.ViewOnClickListenerC0025a;
import p006D.RunnableC0129u;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0188s;
import p009E0.C0180k;
import p026N0.C0268i;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p031Q0.C0312l;
import p034S.AbstractC0324d;
import p036T0.C0340c;
import p037U.AbstractC0358S;
import p040V0.AbstractC0407j;
import p040V0.C0402e;
import p040V0.C0403f;
import p040V0.C0412o;
import p040V0.InterfaceC0399b;
import p040V0.InterfaceC0405h;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0431p;
import p042W0.AbstractC0432q;
import p042W0.AbstractC0433r;
import p042W0.C0422g;

/* JADX INFO: renamed from: c0.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class MessageDetailHook {

    /* JADX INFO: renamed from: A */
    public static volatile Object f1961A;

    /* JADX INFO: renamed from: B */
    public static volatile Object f1962B;

    /* JADX INFO: renamed from: C */
    public static volatile Method f1963C;

    /* JADX INFO: renamed from: D */
    public static volatile Class f1964D;

    /* JADX INFO: renamed from: E */
    public static volatile String f1965E;

    /* JADX INFO: renamed from: F */
    public static volatile int f1966F;

    /* JADX INFO: renamed from: a */
    public static final MessageDetailHook f1967a = new MessageDetailHook();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f1968b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f1969c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f1970d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f1971e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public static final AtomicBoolean f1972f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    public static final AtomicBoolean f1973g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h */
    public static final AtomicBoolean f1974h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i */
    public static final AtomicBoolean f1975i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j */
    public static final AtomicBoolean f1976j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k */
    public static final AtomicBoolean f1977k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l */
    public static final AtomicBoolean f1978l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m */
    public static final AtomicBoolean f1979m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n */
    public static final AtomicBoolean f1980n = new AtomicBoolean(false);

    /* JADX INFO: renamed from: o */
    public static final AtomicBoolean f1981o;

    /* JADX INFO: renamed from: p */
    public static final AtomicBoolean f1982p;

    /* JADX INFO: renamed from: q */
    public static final AtomicBoolean f1983q;

    /* JADX INFO: renamed from: r */
    public static final AtomicBoolean f1984r;

    /* JADX INFO: renamed from: s */
    public static final AtomicBoolean f1985s;

    /* JADX INFO: renamed from: t */
    public static final AtomicBoolean f1986t;

    /* JADX INFO: renamed from: u */
    public static final AtomicBoolean f1987u;

    /* JADX INFO: renamed from: v */
    public static final ConcurrentHashMap.KeySetView f1988v;

    /* JADX INFO: renamed from: w */
    public static final ConcurrentHashMap f1989w;

    /* JADX INFO: renamed from: x */
    public static final ConcurrentHashMap f1990x;

    /* JADX INFO: renamed from: y */
    public static final ConcurrentHashMap f1991y;

    /* JADX INFO: renamed from: z */
    public static final ConcurrentHashMap f1992z;

    static {
        new AtomicBoolean(false);
        f1981o = new AtomicBoolean(false);
        f1982p = new AtomicBoolean(false);
        f1983q = new AtomicBoolean(false);
        f1984r = new AtomicBoolean(false);
        new AtomicBoolean(false);
        f1985s = new AtomicBoolean(false);
        new AtomicBoolean(false);
        f1986t = new AtomicBoolean(false);
        f1987u = new AtomicBoolean(false);
        f1988v = ConcurrentHashMap.newKeySet();
        f1989w = new ConcurrentHashMap();
        f1990x = new ConcurrentHashMap();
        f1991y = new ConcurrentHashMap();
        f1992z = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: A */
    public static void m1545A(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        Object objM116u;
        Object objM116u2;
        try {
            FindMethod findMethod = new FindMethod();
            findMethod.searchPackages("com.tencent.mm.ui.chatting.adapter");
            MethodMatcher methodMatcher = new MethodMatcher();
            methodMatcher.usingStrings("_onBindViewHolder[", "MicroMsg.ChattingDataAdapterV3");
            findMethod.matcher(methodMatcher);
            MethodData methodDataFirstOrNull = dexKitBridge.findMethod(findMethod).firstOrNull();
            objM116u = methodDataFirstOrNull != null ? methodDataFirstOrNull.getDescriptor() : null;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        String str = (String) objM116u;
        if (str == null || AbstractC0425j.m1013R0(str)) {
            m1601p0("DexKit did not find adapter bind method");
            return;
        }
        try {
            objM116u2 = m1606t(classLoader, str);
        } catch (Throwable th2) {
            objM116u2 = AbstractC0040p.m116u(th2);
        }
        Method method = (Method) (objM116u2 instanceof C0140f ? null : objM116u2);
        if (method == null) {
            m1601p0("adapter descriptor could not resolve: ".concat(str));
        } else {
            m1558O("DexKit:".concat(str), method);
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m1546B(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        Object objM116u;
        Object objM116u2;
        try {
            FindMethod findMethod = new FindMethod();
            findMethod.searchPackages("com.tencent.mm.ui.chatting.component");
            MethodMatcher methodMatcher = new MethodMatcher();
            methodMatcher.usingStrings("clear video generate callback");
            findMethod.matcher(methodMatcher);
            MethodData methodDataFirstOrNull = dexKitBridge.findMethod(findMethod).firstOrNull();
            objM116u = methodDataFirstOrNull != null ? methodDataFirstOrNull.getDescriptor() : null;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        String str = (String) objM116u;
        if (str == null || AbstractC0425j.m1013R0(str)) {
            m1601p0("DexKit did not find quote component");
            return;
        }
        try {
            objM116u2 = m1606t(classLoader, str);
        } catch (Throwable th2) {
            objM116u2 = AbstractC0040p.m116u(th2);
        }
        Method method = (Method) (objM116u2 instanceof C0140f ? null : objM116u2);
        if (method == null) {
            m1601p0("component descriptor could not resolve: ".concat(str));
            return;
        }
        Class<?> declaringClass = method.getDeclaringClass();
        AbstractC0307g.m702d(declaringClass, "getDeclaringClass(...)");
        m1559P(declaringClass, "DexKit:".concat(str));
    }

    /* JADX INFO: renamed from: C */
    public static View m1547C(View view, ClassLoader classLoader) {
        int iM1560Q;
        View viewFindViewById;
        if ("c3g".equals("c3g")) {
            iM1560Q = f1966F;
            if (iM1560Q == 0) {
                iM1560Q = m1560Q(classLoader, "c3g");
                f1966F = iM1560Q;
            }
        } else {
            iM1560Q = m1560Q(classLoader, "c3g");
        }
        if (iM1560Q != 0 && (viewFindViewById = view.findViewById(iM1560Q)) != null) {
            C0422g c0422g = AbstractC0600K.f1833a;
            if (!AbstractC0425j.m1005J0(viewFindViewById.getClass().getName(), "MMNeat7extView", false)) {
                viewFindViewById = null;
            }
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return m1551G(view, new C0570A(4));
    }

    /* JADX INFO: renamed from: D */
    public static View m1548D(ViewGroup viewGroup, View view) {
        View childAt;
        ClassLoader classLoader = view.getContext().getClassLoader();
        AbstractC0307g.m702d(classLoader, "getClassLoader(...)");
        View viewM1550F = m1550F(view, classLoader);
        if (viewM1550F != null) {
            return viewM1550F;
        }
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                for (int childCount2 = viewGroup.getChildCount() - 1; -1 < childCount2; childCount2--) {
                    View childAt2 = viewGroup.getChildAt(childCount2);
                    if (childAt2.getVisibility() != 8 && !AbstractC0307g.m699a(childAt2.getTag(C1031R.id.abc_tag_custom_time), Boolean.TRUE) && childAt2.getTag(C1031R.id.abc_tag_message_object) == null) {
                        return childAt2;
                    }
                }
                return null;
            }
            childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() != 8 && !AbstractC0307g.m699a(childAt.getTag(C1031R.id.abc_tag_custom_time), Boolean.TRUE) && childAt.getTag(C1031R.id.abc_tag_message_object) == null && (!(childAt instanceof ViewGroup) || ((ViewGroup) childAt).getChildCount() <= 0)) {
                break;
            }
        }
        return childAt;
    }

    /* JADX INFO: renamed from: E */
    public static TextView m1549E(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (AbstractC0307g.m699a(childAt.getTag(C1031R.id.abc_tag_custom_time), Boolean.TRUE) && (childAt instanceof TextView)) {
                return (TextView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: F */
    public static View m1550F(View view, ClassLoader classLoader) {
        int iM1560Q;
        View viewFindViewById;
        if ("c3h".equals("c3g")) {
            iM1560Q = f1966F;
            if (iM1560Q == 0) {
                iM1560Q = m1560Q(classLoader, "c3h");
                f1966F = iM1560Q;
            }
        } else {
            iM1560Q = m1560Q(classLoader, "c3h");
        }
        return (iM1560Q == 0 || (viewFindViewById = view.findViewById(iM1560Q)) == null) ? m1551G(view, new C0570A(5)) : viewFindViewById;
    }

    /* JADX INFO: renamed from: G */
    public static View m1551G(View view, InterfaceC0286l interfaceC0286l) {
        if (((Boolean) interfaceC0286l.invoke(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            AbstractC0307g.m702d(childAt, "getChildAt(...)");
            View viewM1551G = m1551G(childAt, interfaceC0286l);
            if (viewM1551G != null) {
                return viewM1551G;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: H */
    public static void m1552H(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        Object objM116u;
        Object objM116u2;
        try {
            FindMethod findMethod = new FindMethod();
            findMethod.searchPackages("com.tencent.mm.ui.chatting.viewitems");
            MethodMatcher methodMatcher = new MethodMatcher();
            methodMatcher.usingEqStrings("ItemDataTag", "getCurrentMsg2 err");
            findMethod.matcher(methodMatcher);
            MethodData methodDataFirstOrNull = dexKitBridge.findMethod(findMethod).firstOrNull();
            objM116u = methodDataFirstOrNull != null ? methodDataFirstOrNull.getDescriptor() : null;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        String str = (String) objM116u;
        if (str == null || AbstractC0425j.m1013R0(str)) {
            m1601p0("DexKit did not find getCurrentMsg2");
            return;
        }
        try {
            objM116u2 = m1606t(classLoader, str);
        } catch (Throwable th2) {
            objM116u2 = AbstractC0040p.m116u(th2);
        }
        Method method = (Method) (objM116u2 instanceof C0140f ? null : objM116u2);
        if (method == null) {
            m1601p0("getCurrentMsg2 descriptor could not resolve: ".concat(str));
            return;
        }
        method.setAccessible(true);
        f1963C = method;
        m1601p0("found getCurrentMsg2 via DexKit:".concat(str));
    }

    /* JADX INFO: renamed from: I */
    public static View m1553I(Object obj) {
        Object objM116u;
        View view;
        Object objM1611y = m1611y(obj, "itemView");
        View view2 = objM1611y instanceof View ? (View) objM1611y : null;
        if (view2 != null) {
            return view2;
        }
        for (Field field : m1586i(obj.getClass())) {
            if (View.class.isAssignableFrom(field.getType())) {
                try {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    objM116u = obj2 instanceof View ? (View) obj2 : null;
                } catch (Throwable th) {
                    objM116u = AbstractC0040p.m116u(th);
                }
                if (objM116u instanceof C0140f) {
                    objM116u = null;
                }
                view = (View) objM116u;
            } else {
                view = null;
            }
            if (view != null) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public static final void m1554J(View view, ArrayList arrayList) {
        if (view.getVisibility() != 0 || AbstractC0307g.m699a(view.getTag(C1031R.id.abc_tag_custom_time), Boolean.TRUE)) {
            return;
        }
        if (view instanceof ImageView) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            String name = view.getClass().getName();
            if (AbstractC0425j.m1005J0(name, "Video", false) || AbstractC0425j.m1005J0(name, "Media", false) || AbstractC0425j.m1005J0(name, "Thumb", false)) {
                arrayList.add(view);
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0307g.m702d(childAt, "getChildAt(...)");
                m1554J(childAt, arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public static C0634Y m1555L(View view) {
        ViewParent parent = view.getParent();
        for (int i2 = 0; (parent instanceof View) && i2 < 8; i2++) {
            if (parent instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) parent;
                if (linearLayout.getOrientation() == 1) {
                    return new C0634Y(linearLayout, view);
                }
            }
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    public static LinearLayout m1556M(ViewGroup viewGroup) {
        LinearLayout linearLayoutM1556M;
        for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) childAt;
                if (linearLayout.getOrientation() == 1) {
                    return linearLayout;
                }
            }
            if ((childAt instanceof ViewGroup) && (linearLayoutM1556M = m1556M((ViewGroup) childAt)) != null) {
                return linearLayoutM1556M;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: N */
    public static long m1557N(View view) {
        int iMax = Math.max(view.getWidth(), view.getMeasuredWidth());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iMax2 = Math.max(iMax, layoutParams != null ? layoutParams.width : 0);
        int iMax3 = Math.max(view.getHeight(), view.getMeasuredHeight());
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iMax4 = Math.max(iMax3, layoutParams2 != null ? layoutParams2.height : 0);
        if (iMax2 <= 0 || iMax4 <= 0) {
            return 0L;
        }
        return ((long) iMax2) * ((long) iMax4);
    }

    /* JADX INFO: renamed from: O */
    public static void m1558O(String str, Method method) {
        String name = method.getDeclaringClass().getName();
        String name2 = method.getName();
        String string = Arrays.toString(method.getParameterTypes());
        AbstractC0307g.m702d(string, "toString(...)");
        if (f1988v.add(name + "#" + name2 + string)) {
            method.setAccessible(true);
            AbstractC0762d.m1952b(method, new C0698u(method, 2, false));
            m1601p0("hooked adapter bind via " + str);
        }
    }

    /* JADX INFO: renamed from: P */
    public static void m1559P(Class cls, String str) {
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        AbstractC0307g.m702d(declaredConstructors, "getDeclaredConstructors(...)");
        for (Constructor<?> constructor : declaredConstructors) {
            String name = constructor.getDeclaringClass().getName();
            String string = Arrays.toString(constructor.getParameterTypes());
            AbstractC0307g.m702d(string, "toString(...)");
            if (f1988v.add(name + "#<init>" + string)) {
                AbstractC0762d.m1952b(constructor, new InputStatsMessageHook(18, false));
            }
        }
        m1601p0("hooked quote component constructors via " + str);
    }

    /* JADX INFO: renamed from: Q */
    public static int m1560Q(ClassLoader classLoader, String str) {
        Object objM116u;
        try {
            objM116u = Integer.valueOf(AbstractC0358S.m906r(classLoader, "com.tencent.mm.R$id").getField(str).getInt(null));
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = 0;
        }
        return ((Number) objM116u).intValue();
    }

    /* JADX INFO: renamed from: R */
    public static boolean m1561R(Object obj) {
        Object objM116u;
        boolean z2;
        Object obj2 = f1962B;
        if (obj2 == null) {
            return false;
        }
        for (C0630W c0630w : m1568Y(obj2, obj)) {
            try {
                c0630w.f1941a.setAccessible(true);
                Method method = c0630w.f1941a;
                Object[] objArr = c0630w.f1942b;
                if (AbstractC0307g.m699a(method.invoke(obj2, Arrays.copyOf(objArr, objArr.length)), Boolean.FALSE)) {
                    m1601p0("component quote returned false: " + c0630w.f1941a.getName() + "/" + c0630w.f1942b.length);
                    z2 = false;
                } else {
                    m1601p0("triggered quote via " + obj2.getClass().getName() + "." + c0630w.f1941a.getName() + "/" + c0630w.f1942b.length);
                    z2 = true;
                }
                objM116u = Boolean.valueOf(z2);
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            Throwable thM465a = AbstractC0141g.m465a(objM116u);
            if (thM465a != null) {
                m1601p0("component quote failed: " + thM465a.getMessage());
                objM116u = Boolean.FALSE;
            }
            if (((Boolean) objM116u).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public static boolean m1562S(Object obj) {
        Object objM116u;
        boolean z2;
        Object obj2 = f1961A;
        if (obj2 == null) {
            return false;
        }
        for (C0630W c0630w : m1568Y(obj2, obj)) {
            try {
                c0630w.f1941a.setAccessible(true);
                Method method = c0630w.f1941a;
                Object[] objArr = c0630w.f1942b;
                if (AbstractC0307g.m699a(method.invoke(obj2, Arrays.copyOf(objArr, objArr.length)), Boolean.FALSE)) {
                    m1601p0("ChatFooter quote returned false: " + c0630w.f1941a.getName() + "/" + c0630w.f1942b.length);
                    z2 = false;
                } else {
                    m1601p0("triggered quote via ChatFooter." + c0630w.f1941a.getName() + "/" + c0630w.f1942b.length);
                    z2 = true;
                }
                objM116u = Boolean.valueOf(z2);
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            Throwable thM465a = AbstractC0141g.m465a(objM116u);
            if (thM465a != null) {
                m1601p0("ChatFooter quote failed: " + thM465a.getMessage());
                objM116u = Boolean.FALSE;
            }
            if (((Boolean) objM116u).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: T */
    public static boolean m1563T(Object obj, Object obj2, String str) {
        Object objM116u;
        if (obj == null) {
            return false;
        }
        InterfaceC0405h c0268i = new C0268i(new C0402e(new C0180k(2, m1588j(obj.getClass())), true, new C0606M(0, obj2)), new C0692s(1));
        for (Method method : AbstractC0407j.m993A0(c0268i instanceof InterfaceC0399b ? ((InterfaceC0399b) c0268i).mo986a() : new C0412o(c0268i))) {
            try {
                method.setAccessible(true);
                Object[] objArr = method.getParameterTypes().length == 1 ? new Object[]{obj2} : new Object[]{obj2, null};
                method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
                m1601p0("triggered repeat via " + str + "." + method.getName());
                objM116u = Boolean.TRUE;
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            Object obj3 = Boolean.FALSE;
            if (objM116u instanceof C0140f) {
                objM116u = obj3;
            }
            if (((Boolean) objM116u).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: U */
    public static boolean m1564U(Method method) {
        return AbstractC0307g.m699a(method.getReturnType(), Boolean.TYPE) || AbstractC0307g.m699a(method.getReturnType(), Boolean.class);
    }

    /* JADX INFO: renamed from: V */
    public static boolean m1565V(String str) {
        if (AbstractC0425j.m1005J0(str, "conversation", true) || AbstractC0425j.m1005J0(str, "ConversationListView", false)) {
            return false;
        }
        if (AbstractC0425j.m1005J0(str, "chatting", true) || AbstractC0425j.m1005J0(str, "Chatting", false) || AbstractC0425j.m1005J0(str, "MxRecyclerView", false)) {
            return true;
        }
        return AbstractC0425j.m1005J0(str, "RecyclerView", false) && AbstractC0425j.m1005J0(str, "mm.ui", true);
    }

    /* JADX INFO: renamed from: W */
    public static void m1566W(Context context, String str) throws IllegalAccessException, IOException, InvocationTargetException {
        Object objM116u;
        String str2;
        AtomicBoolean atomicBoolean = f1969c;
        if (atomicBoolean.get()) {
            return;
        }
        try {
            System.loadLibrary("dexkit");
            objM116u = C0146l.f339a;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (!(objM116u instanceof C0140f)) {
            atomicBoolean.set(true);
            m1601p0("DexKit native loaded via library path");
            return;
        }
        if (str == null) {
            throw new IllegalStateException("module path unavailable for libdexkit.so");
        }
        if (Process.is64Bit()) {
            String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
            AbstractC0307g.m702d(strArr, "SUPPORTED_64_BIT_ABIS");
            str2 = (String) AbstractC0179j.m536m0(strArr);
            if (str2 == null) {
                str2 = "arm64-v8a";
            }
        } else {
            String[] strArr2 = Build.SUPPORTED_32_BIT_ABIS;
            AbstractC0307g.m702d(strArr2, "SUPPORTED_32_BIT_ABIS");
            str2 = (String) AbstractC0179j.m536m0(strArr2);
            if (str2 == null) {
                str2 = "armeabi-v7a";
            }
        }
        File file = new File(context.getCacheDir(), AbstractC0324d.m723f("abc_chat_", str2, "_libdexkit.so"));
        ZipFile zipFile = new ZipFile(str);
        try {
            ZipEntry entry = zipFile.getEntry("lib/" + str2 + "/libdexkit.so");
            if (entry == null) {
                throw new IllegalStateException("lib/" + str2 + "/libdexkit.so not found in module apk");
            }
            InputStream inputStream = zipFile.getInputStream(entry);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    AbstractC0307g.m700b(inputStream);
                    AbstractC0040p.m115t(inputStream, fileOutputStream, 8192);
                    AbstractC0040p.m108m(fileOutputStream, null);
                    AbstractC0040p.m108m(inputStream, null);
                    AbstractC0040p.m108m(zipFile, null);
                    System.load(file.getAbsolutePath());
                    atomicBoolean.set(true);
                    m1601p0("DexKit native loaded from module apk");
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036 A[PHI: r10
  0x0036: PHI (r10v3 int) = (r10v1 int), (r10v0 int) binds: [B:23:0x004c, B:12:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[PHI: r9
  0x0040: PHI (r9v2 int) = (r9v1 int), (r9v1 int), (r9v0 int) binds: [B:15:0x003e, B:23:0x004c, B:12:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1567X(LinearLayout linearLayout, View view, String str, long j2, boolean z2, C0625T0 c0625t0) {
        LinearLayout.LayoutParams layoutParams;
        Context context = linearLayout.getContext();
        int iIndexOfChild = linearLayout.indexOfChild(view);
        if (iIndexOfChild < 0) {
            m1582g(linearLayout, str, j2, z2, c0625t0);
            return;
        }
        TextView textViewM1549E = m1549E(linearLayout);
        int i2 = -1;
        int iIndexOfChild2 = textViewM1549E != null ? linearLayout.indexOfChild(textViewM1549E) : -1;
        int childCount = linearLayout.getChildCount();
        int i3 = 0;
        if (iIndexOfChild < 0) {
            i2 = childCount < 0 ? i3 : childCount;
        } else {
            childCount = AbstractC0040p.m111p(iIndexOfChild + 1, 0, childCount);
            if (iIndexOfChild2 >= 0) {
                if (iIndexOfChild2 != childCount && (iIndexOfChild2 != childCount - 1 || iIndexOfChild2 <= iIndexOfChild)) {
                    if (iIndexOfChild2 < childCount) {
                    }
                }
            }
        }
        float f2 = c0625t0.f1928d;
        if (textViewM1549E != null && i2 >= 0) {
            linearLayout.removeView(textViewM1549E);
            int iIndexOfChild3 = linearLayout.indexOfChild(view);
            int iMin = iIndexOfChild3 >= 0 ? Math.min(linearLayout.getChildCount(), iIndexOfChild3 + 1) : linearLayout.getChildCount();
            ViewGroup.LayoutParams layoutParams2 = textViewM1549E.getLayoutParams();
            layoutParams = layoutParams2 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams2 : null;
            if (layoutParams == null) {
                layoutParams = new LinearLayout.LayoutParams(-2, -2);
            }
            layoutParams.width = -2;
            AbstractC0307g.m700b(context);
            layoutParams.topMargin = m1607u(context, 4);
            layoutParams.gravity = z2 ? 8388613 : 8388611;
            layoutParams.leftMargin = m1607u(context, c0625t0.m1527b(z2));
            layoutParams.rightMargin = m1607u(context, c0625t0.m1526a(z2));
            textViewM1549E.setText(str);
            textViewM1549E.setTag(C1031R.id.abc_tag_custom_time_msg_id, Long.valueOf(j2));
            textViewM1549E.setGravity(z2 ? 8388613 : 8388611);
            textViewM1549E.setTextSize(f2);
            m1592l(textViewM1549E, c0625t0);
            m1590k(textViewM1549E, c0625t0);
            linearLayout.addView(textViewM1549E, iMin, layoutParams);
            return;
        }
        if (textViewM1549E == null) {
            AbstractC0307g.m700b(context);
            View viewM1604r = m1604r(context, str, j2, c0625t0);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.topMargin = m1607u(context, 4);
            layoutParams3.gravity = z2 ? 8388613 : 8388611;
            layoutParams3.leftMargin = m1607u(context, c0625t0.m1527b(z2));
            layoutParams3.rightMargin = m1607u(context, c0625t0.m1526a(z2));
            linearLayout.addView(viewM1604r, Math.min(linearLayout.getChildCount(), iIndexOfChild + 1), layoutParams3);
            return;
        }
        textViewM1549E.setText(str);
        textViewM1549E.setTag(C1031R.id.abc_tag_custom_time_msg_id, Long.valueOf(j2));
        textViewM1549E.setGravity(z2 ? 8388613 : 8388611);
        textViewM1549E.setTextSize(f2);
        m1592l(textViewM1549E, c0625t0);
        m1590k(textViewM1549E, c0625t0);
        ViewGroup.LayoutParams layoutParams4 = textViewM1549E.getLayoutParams();
        layoutParams = layoutParams4 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams4 : null;
        if (layoutParams != null) {
            layoutParams.width = -2;
            layoutParams.gravity = z2 ? 8388613 : 8388611;
            AbstractC0307g.m700b(context);
            layoutParams.leftMargin = m1607u(context, c0625t0.m1527b(z2));
            layoutParams.rightMargin = m1607u(context, c0625t0.m1526a(z2));
        }
    }

    /* JADX INFO: renamed from: Y */
    public static List m1568Y(Object obj, Object obj2) {
        return AbstractC0407j.m993A0(new C0403f(new C0268i(new C0402e(new C0180k(2, m1588j(obj.getClass())), true, new C0606M(1, obj2)), new C0695t(3, new C0695t(2, new C0692s(2)))), new C0606M(2, obj2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /* JADX INFO: renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Integer m1569Z(Object obj, String str) {
        Object objM116u;
        try {
            Method methodM1603q0 = m1603q0(obj.getClass(), str);
            if (methodM1603q0 != null) {
                Object objInvoke = methodM1603q0.invoke(obj, null);
                Number number = objInvoke instanceof Number ? (Number) objInvoke : null;
                objM116u = number != null ? Integer.valueOf(number.intValue()) : null;
            }
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        Integer num = (Integer) objM116u;
        if (num != null) {
            return num;
        }
        Object objM1611y = m1611y(obj, "field_isSend");
        Number number2 = objM1611y instanceof Number ? (Number) objM1611y : null;
        if (number2 != null) {
            return Integer.valueOf(number2.intValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static final void m1570a(View view) {
        m1600p(view);
        m1598o(view);
        ViewParent parent = view.getParent();
        for (int i2 = 0; (parent instanceof ViewGroup) && i2 < 8; i2++) {
            View view2 = (View) parent;
            m1600p(view2);
            m1598o(view2);
            if (m1565V(parent.getClass().getName())) {
                break;
            }
            parent = ((ViewGroup) parent).getParent();
        }
        view.post(new RunnableC0129u(view, 1));
        view.postDelayed(new RunnableC0129u(view, 2), 120L);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX INFO: renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Integer m1571a0(Object obj) {
        Object objM116u;
        Object objM1611y = m1611y(obj, "field_type");
        Number number = objM1611y instanceof Number ? (Number) objM1611y : null;
        Integer numValueOf = number != null ? Integer.valueOf(number.intValue()) : null;
        if (numValueOf != null) {
            return numValueOf;
        }
        try {
            Method methodM1603q0 = m1603q0(obj.getClass(), "getType");
            if (methodM1603q0 != null) {
                Object objInvoke = methodM1603q0.invoke(obj, null);
                Number number2 = objInvoke instanceof Number ? (Number) objInvoke : null;
                objM116u = number2 != null ? Integer.valueOf(number2.intValue()) : null;
            }
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        return (Integer) (objM116u instanceof C0140f ? null : objM116u);
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0aea  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1572b(Object obj, Object obj2, int i2, ClassLoader classLoader) {
        Object objM116u;
        String str;
        Object objM116u2;
        boolean z2;
        View view;
        int i3;
        String string;
        C0625T0 c0625t0;
        int i4;
        View view2;
        String str2;
        View view3;
        boolean z3;
        C0625T0 c0625t02;
        String str3;
        String str4;
        View view4;
        int i5;
        Object next;
        View view5;
        ViewGroup viewGroup;
        Object next2;
        Object objM116u3;
        C0634Y c0634yM1555L;
        if (f1971e.compareAndSet(false, true)) {
            m1601p0("adapter bind entered: adapter=" + (obj != null ? obj.getClass().getName() : "static") + " holder=" + obj2.getClass().getName());
        }
        View viewM1553I = m1553I(obj2);
        if (viewM1553I == null) {
            if (f1978l.compareAndSet(false, true)) {
                m1601p0("message row skipped: itemView not found in ".concat(obj2.getClass().getName()));
                return;
            }
            return;
        }
        Object objM1537c = AbstractC0637Z0.m1537c(i2, obj);
        if (objM1537c == null) {
            if (f1979m.compareAndSet(false, true)) {
                m1601p0("message row skipped: message object not found at position=" + i2 + " adapter=" + (obj != null ? obj.getClass().getName() : "static"));
                return;
            }
            return;
        }
        viewM1553I.setTag(C1031R.id.abc_tag_message_object, objM1537c);
        viewM1553I.setTag(C1031R.id.abc_tag_message_holder, obj2);
        if (obj != null) {
            viewM1553I.setTag(C1031R.id.abc_tag_message_adapter, obj);
        }
        Integer numM1571a0 = m1571a0(objM1537c);
        int iIntValue = numM1571a0 != null ? numM1571a0.intValue() : 0;
        int i6 = iIntValue & 65535;
        if (i6 != 43 && i6 != 62) {
            viewM1553I.setTranslationX(0.0f);
        } else if (f1984r.compareAndSet(false, true)) {
            String name = obj2.getClass().getName();
            String name2 = viewM1553I.getClass().getName();
            boolean zM1573b0 = m1573b0(objM1537c);
            float translationX = viewM1553I.getTranslationX();
            ViewGroup.LayoutParams layoutParams = viewM1553I.getLayoutParams();
            m1601p0("video bind holder=" + name + " row=" + name2 + " type=" + iIntValue + " raw=" + i6 + " isSend=" + zM1573b0 + " tx=" + translationX + " lp=" + (layoutParams != null ? layoutParams.getClass().getName() : null));
        }
        C0146l c0146l = C0146l.f339a;
        Long lM1575c0 = m1575c0(objM1537c, "getCreateTime", "field_createTime");
        if (lM1575c0 == null) {
            if (f1976j.compareAndSet(false, true)) {
                m1601p0("enhance abort: createTime null, msg=".concat(objM1537c.getClass().getName()));
                return;
            }
            return;
        }
        if (lM1575c0.longValue() <= 0) {
            return;
        }
        Long lM1575c02 = m1575c0(objM1537c, "getMsgId", "field_msgId");
        long jLongValue = lM1575c02 != null ? lM1575c02.longValue() : 0L;
        Long lM1575c03 = m1575c0(objM1537c, "getMsgSvrId", "field_msgSvrId");
        long jLongValue2 = lM1575c03 != null ? lM1575c03.longValue() : 0L;
        Long lM1575c04 = m1575c0(objM1537c, "getNewMsgId", "field_newMsgId");
        long jLongValue3 = lM1575c04 != null ? lM1575c04.longValue() : 0L;
        boolean zM1573b02 = m1573b0(objM1537c);
        Integer numM1571a02 = m1571a0(objM1537c);
        int iIntValue2 = numM1571a02 != null ? numM1571a02.intValue() : 0;
        String strM1577d0 = m1577d0(objM1537c);
        String str5 = strM1577d0 == null ? "" : strM1577d0;
        try {
            GroupMemberTitleHook.m1502g(obj2, viewM1553I, objM1537c);
            objM116u = c0146l;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Throwable thM465a = AbstractC0141g.m465a(objM116u);
        if (thM465a != null) {
            str = "";
            if (f1972f.compareAndSet(false, true)) {
                m1601p0("MemberTitle err: " + thM465a.getClass().getSimpleName() + ": " + thM465a.getMessage());
            }
        } else {
            str = "";
        }
        try {
            RealNameTailHook.f2163a.m1784k(obj2, viewM1553I, objM1537c);
            objM116u2 = c0146l;
        } catch (Throwable th2) {
            objM116u2 = AbstractC0040p.m116u(th2);
        }
        Throwable thM465a2 = AbstractC0141g.m465a(objM116u2);
        if (thM465a2 != null && f1973g.compareAndSet(false, true)) {
            m1601p0("RealNameTail err: " + thM465a2.getClass().getSimpleName() + ": " + thM465a2.getMessage());
        }
        StringBuilder sb = new StringBuilder();
        m1602q(sb, viewM1553I);
        String string2 = sb.toString();
        AbstractC0307g.m702d(string2, "toString(...)");
        Object tag = viewM1553I.getTag(C1031R.id.abc_tag_enhanced_msg_id);
        Long l2 = tag instanceof Long ? (Long) tag : null;
        Object tag2 = viewM1553I.getTag(C1031R.id.abc_tag_enhanced_is_send);
        Boolean bool = tag2 instanceof Boolean ? (Boolean) tag2 : null;
        if (l2 == null || l2.longValue() != jLongValue || !AbstractC0307g.m699a(bool, Boolean.valueOf(zM1573b02))) {
            m1583g0(viewM1553I);
            viewM1553I.setTag(C1031R.id.abc_tag_enhanced_msg_id, Long.valueOf(jLongValue));
            viewM1553I.setTag(C1031R.id.abc_tag_enhanced_is_send, Boolean.valueOf(zM1573b02));
        }
        ConcurrentHashMap concurrentHashMap = C0572A1.f1693a;
        long j2 = jLongValue2;
        long j3 = jLongValue3;
        long[] jArr = {jLongValue, j2, j3};
        String str6 = str5;
        C0572A1.f1693a.entrySet().removeIf(new C0715z1(new C0712y1(System.currentTimeMillis())));
        for (int i7 = 0; i7 < 3; i7++) {
            long j4 = jArr[i7];
            if (j4 > 0 && C0572A1.f1693a.containsKey(Long.valueOf(j4))) {
                m1581f0(viewM1553I);
                if (f1981o.compareAndSet(false, true)) {
                    m1601p0("self recalled message detail time skipped msgId=" + jLongValue + " msgSvrId=" + j2 + " newMsgId=" + j3);
                    return;
                }
                return;
            }
        }
        if (f1975i.compareAndSet(false, true)) {
            String name3 = objM1537c.getClass().getName();
            StringBuilder sb2 = new StringBuilder("enhance entered msg=");
            sb2.append(name3);
            sb2.append(" type=");
            sb2.append(iIntValue2);
            sb2.append(" isSend=");
            z2 = zM1573b02;
            sb2.append(z2);
            sb2.append(" createTime=");
            sb2.append(lM1575c0);
            m1601p0(sb2.toString());
        } else {
            z2 = zM1573b02;
        }
        if (!AbstractC0358S.m897m0(iIntValue2, str6, string2)) {
            if (f1977k.compareAndSet(false, true)) {
                m1601p0("enhance abort: time policy reject type=" + iIntValue2 + " content=" + AbstractC0425j.m1021Z0(str6, 80));
            }
            m1600p(viewM1553I);
            m1598o(viewM1553I);
            m1581f0(viewM1553I);
            return;
        }
        View viewM1547C = m1547C(viewM1553I, classLoader);
        if (viewM1547C != null) {
            C0422g c0422g = AbstractC0600K.f1833a;
            view = (!(((iIntValue2 != 49 && (iIntValue2 & 65535) != 49) ? iIntValue2 : 49) == 49) || AbstractC0600K.m1486a(str6, iIntValue2)) ? viewM1547C : null;
        }
        View viewM1550F = view == null ? m1550F(viewM1553I, classLoader) : null;
        View view6 = view == null ? viewM1550F : view;
        if (view6 != null) {
            m1591k0(viewM1553I, objM1537c, classLoader);
            m1609w(viewM1553I, viewM1553I);
            m1609w(view6, viewM1553I);
            if (view != null) {
                C0634Y c0634yM1555L2 = m1555L(view);
                if (c0634yM1555L2 != null) {
                    LinearLayout linearLayout = c0634yM1555L2.f1949a;
                    int i8 = C1031R.id.abc_tag_message_object;
                    linearLayout.setTag(C1031R.id.abc_tag_message_object, objM1537c);
                    m1609w(linearLayout, viewM1553I);
                    View view7 = c0634yM1555L2.f1950b;
                    view7.setTag(C1031R.id.abc_tag_message_object, objM1537c);
                    m1609w(view7, viewM1553I);
                    if (view7 instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) view7;
                        int childCount = viewGroup2.getChildCount();
                        int i9 = 0;
                        while (i9 < childCount) {
                            int i10 = childCount;
                            View childAt = viewGroup2.getChildAt(i9);
                            childAt.setTag(i8, objM1537c);
                            m1609w(childAt, viewM1553I);
                            i9++;
                            childCount = i10;
                            i8 = C1031R.id.abc_tag_message_object;
                        }
                    }
                }
                m1610x(view, viewM1553I, objM1537c);
                m1593l0(viewM1553I, view, objM1537c);
                m1579e0(view, z2, iIntValue2, str6, jLongValue, true);
                m1584h(view, z2);
            } else {
                m1610x(view6, viewM1553I, objM1537c);
                m1593l0(viewM1553I, view6, objM1537c);
                view6.setTag(C1031R.id.abc_tag_message_object, objM1537c);
                view6.setTag(C1031R.id.abc_tag_swipe_target_row, viewM1553I);
            }
        } else if (f1980n.compareAndSet(false, true)) {
            m1601p0("bubble not found for non-text message type=" + iIntValue2);
        }
        if (iIntValue2 == 43 || iIntValue2 == 62 || (i3 = 65535 & iIntValue2) == 43 || i3 == 62) {
            return;
        }
        C0625T0 c0625t03 = AbstractC0623S0.f1922b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - AbstractC0623S0.f1921a < 5000) {
            c0625t0 = AbstractC0623S0.f1922b;
            string = str;
        } else {
            AbstractC0623S0.f1921a = jCurrentTimeMillis;
            ConfigStore configStore = ConfigStore.f2048a;
            Integer numM1026A0 = AbstractC0432q.m1026A0(ConfigStore.m1662d("detail_horizontal_margin", "0"));
            int iIntValue3 = numM1026A0 != null ? numM1026A0.intValue() : 0;
            Integer numM1026A02 = AbstractC0432q.m1026A0(ConfigStore.m1662d("detail_left_margin", String.valueOf(iIntValue3)));
            int iIntValue4 = numM1026A02 != null ? numM1026A02.intValue() : iIntValue3;
            Integer numM1026A03 = AbstractC0432q.m1026A0(ConfigStore.m1662d("detail_right_margin", String.valueOf(iIntValue3)));
            int iIntValue5 = numM1026A03 != null ? numM1026A03.intValue() : iIntValue3;
            string = str;
            int iM873Y = AbstractC0358S.m873Y(ConfigStore.m1662d("detail_text_color_light", string), AbstractC0358S.m873Y(ConfigStore.m1662d("detail_text_color", "#E6000000"), -436207616));
            int iM873Y2 = AbstractC0358S.m873Y(ConfigStore.m1662d("detail_text_color_dark", string), AbstractC0358S.m873Y(ConfigStore.m1662d("detail_text_color", "#CCFFFFFF"), -855638017));
            boolean zM1661c = ConfigStore.m1661c("detail_enabled", true);
            String strM1662d = ConfigStore.m1662d("detail_template", "${time} ${relativeTime}");
            String strM1662d2 = ConfigStore.m1662d("detail_time_pattern", "MM-dd HH:mm:ss");
            Float fM1025z0 = AbstractC0431p.m1025z0(ConfigStore.m1662d("detail_text_size", "12"));
            AbstractC0623S0.f1922b = new C0625T0(zM1661c, strM1662d, strM1662d2, fM1025z0 != null ? fM1025z0.floatValue() : 12.0f, iIntValue3, iIntValue4, iIntValue5, iM873Y, iM873Y, iM873Y2, ConfigStore.m1661c("detail_click_show", false));
            c0625t0 = AbstractC0623S0.f1922b;
        }
        long jLongValue4 = lM1575c0.longValue();
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        AbstractC0307g.m703e(c0625t0, "options");
        AbstractC0307g.m703e(zoneIdSystemDefault, "zoneId");
        if (c0625t0.f1925a) {
            if (1 <= jLongValue4 && jLongValue4 < 10000000000L) {
                jLongValue4 *= 1000;
            }
            ZonedDateTime zonedDateTimeAtZone = Instant.ofEpochMilli(jLongValue4).atZone(zoneIdSystemDefault);
            AbstractC0307g.m700b(zonedDateTimeAtZone);
            i4 = i3;
            switch (zonedDateTimeAtZone.getDayOfWeek().getValue()) {
                case 1:
                    view2 = viewM1553I;
                    str2 = "周一";
                    break;
                case 2:
                    str2 = "周二";
                    view2 = viewM1553I;
                    break;
                case 3:
                    str2 = "周三";
                    view2 = viewM1553I;
                    break;
                case 4:
                    str2 = "周四";
                    view2 = viewM1553I;
                    break;
                case 5:
                    str2 = "周五";
                    view2 = viewM1553I;
                    break;
                case 6:
                    str2 = "周六";
                    view2 = viewM1553I;
                    break;
                default:
                    str2 = "周日";
                    view2 = viewM1553I;
                    break;
            }
            String strM1031F0 = c0625t0.f1927c;
            view3 = viewM1550F;
            z3 = z2;
            if (AbstractC0425j.m1005J0(strM1031F0, "周", false)) {
                strM1031F0 = AbstractC0433r.m1031F0(strM1031F0, "周一", AbstractC0324d.m723f("'", str2, "'"), false);
            }
            String str7 = zonedDateTimeAtZone.format(DateTimeFormatter.ofPattern(strM1031F0));
            AbstractC0307g.m702d(str7, "format(...)");
            String strM1031F02 = AbstractC0433r.m1031F0(c0625t0.f1926b, "${time}", str7, false);
            ZoneId zoneIdSystemDefault2 = ZoneId.systemDefault();
            ZonedDateTime zonedDateTimeAtZone2 = Instant.ofEpochMilli(jLongValue4).atZone(zoneIdSystemDefault2);
            ZonedDateTime zonedDateTimeAtZone3 = Instant.ofEpochMilli(jCurrentTimeMillis2).atZone(zoneIdSystemDefault2);
            long j5 = jCurrentTimeMillis2 - jLongValue4;
            String strConcat = "刚刚";
            if (j5 >= 0 && j5 >= 60000) {
                long j6 = j5 / 60000;
                if (j6 < 60) {
                    strConcat = j6 + "分钟前";
                    c0625t02 = c0625t0;
                    str3 = string;
                    string = AbstractC0425j.m1022a1(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(strM1031F02, "${relativeTime}", strConcat, false), "${type}", String.valueOf(iIntValue2), false), "${msgId}", String.valueOf(jLongValue), false), "${msgSvrId}", String.valueOf(j2), false), "${atUserList}", str3, false)).toString();
                } else {
                    c0625t02 = c0625t0;
                    str3 = string;
                    long jBetween = ChronoUnit.DAYS.between(zonedDateTimeAtZone2.toLocalDate(), zonedDateTimeAtZone3.toLocalDate());
                    if (jBetween == 0) {
                        long j7 = j6 / 60;
                        str4 = j7 < 1 ? j6 + "分钟前" : j7 + "小时前";
                    } else {
                        if (jBetween == 1) {
                            String str8 = zonedDateTimeAtZone2.format(DateTimeFormatter.ofPattern("HH:mm"));
                            AbstractC0307g.m702d(str8, "format(...)");
                            strConcat = "昨天 ".concat(str8);
                        } else if (jBetween == 2) {
                            String str9 = zonedDateTimeAtZone2.format(DateTimeFormatter.ofPattern("HH:mm"));
                            AbstractC0307g.m702d(str9, "format(...)");
                            strConcat = "前天 ".concat(str9);
                        } else if (jBetween < 30) {
                            strConcat = jBetween + "天前";
                        } else if (jBetween < 365) {
                            long j8 = jBetween / 30;
                            str4 = j8 <= 1 ? "1个月前" : j8 + "个月前";
                        } else {
                            long j9 = jBetween / 365;
                            str4 = j9 <= 1 ? "1年前" : j9 + "年前";
                        }
                        string = AbstractC0425j.m1022a1(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(strM1031F02, "${relativeTime}", strConcat, false), "${type}", String.valueOf(iIntValue2), false), "${msgId}", String.valueOf(jLongValue), false), "${msgSvrId}", String.valueOf(j2), false), "${atUserList}", str3, false)).toString();
                    }
                    strConcat = str4;
                    string = AbstractC0425j.m1022a1(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(strM1031F02, "${relativeTime}", strConcat, false), "${type}", String.valueOf(iIntValue2), false), "${msgId}", String.valueOf(jLongValue), false), "${msgSvrId}", String.valueOf(j2), false), "${atUserList}", str3, false)).toString();
                }
            } else {
                c0625t02 = c0625t0;
                str3 = string;
                string = AbstractC0425j.m1022a1(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(strM1031F02, "${relativeTime}", strConcat, false), "${type}", String.valueOf(iIntValue2), false), "${msgId}", String.valueOf(jLongValue), false), "${msgSvrId}", String.valueOf(j2), false), "${atUserList}", str3, false)).toString();
            }
        } else {
            view3 = viewM1550F;
            c0625t02 = c0625t0;
            z3 = z2;
            view2 = viewM1553I;
            i4 = i3;
        }
        if (AbstractC0425j.m1013R0(string)) {
            view4 = view;
        } else {
            if (view != null) {
                if (!AbstractC0425j.m1013R0(string) && (c0634yM1555L = m1555L(view)) != null) {
                    m1567X(c0634yM1555L.f1949a, c0634yM1555L.f1950b, string, jLongValue, z3, c0625t02);
                }
                m1608v(view, c0625t02);
            } else {
                C0625T0 c0625t04 = c0625t02;
                if (view3 != null) {
                    m1576d(view3, string, jLongValue, z3, c0625t04);
                    if (c0625t04.f1935k) {
                        m1608v(view3, c0625t04);
                    }
                } else {
                    View view8 = view2;
                    if (view8 instanceof ViewGroup) {
                        C0422g c0422g2 = AbstractC0600K.f1833a;
                        if (iIntValue2 == 49) {
                            i5 = i4;
                        } else {
                            i5 = i4;
                            if (i5 == 49) {
                            }
                            if (!(iIntValue2 != 49)) {
                                ArrayList arrayList = new ArrayList();
                                for (Field field : m1586i(obj2.getClass())) {
                                    if (View.class.isAssignableFrom(field.getType())) {
                                        String name4 = field.getName();
                                        AbstractC0307g.m702d(name4, "getName(...)");
                                        String lowerCase = name4.toLowerCase(Locale.ROOT);
                                        AbstractC0307g.m702d(lowerCase, "toLowerCase(...)");
                                        if (!lowerCase.equals("timetv") && !lowerCase.equals("avatariv") && !lowerCase.equals("usertv") && !AbstractC0425j.m1005J0(lowerCase, "time", false) && !AbstractC0425j.m1005J0(lowerCase, "avatar", false) && !AbstractC0425j.m1005J0(lowerCase, "history", false) && !AbstractC0425j.m1005J0(lowerCase, "nomore", false) && !AbstractC0425j.m1005J0(lowerCase, "mask", false) && !AbstractC0425j.m1005J0(lowerCase, "checkbox", false) && !AbstractC0425j.m1005J0(lowerCase, "check", false)) {
                                            try {
                                                field.setAccessible(true);
                                                try {
                                                    Object obj3 = field.get(obj2);
                                                    objM116u3 = obj3 instanceof View ? (View) obj3 : null;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    objM116u3 = AbstractC0040p.m116u(th);
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                            }
                                            if (objM116u3 instanceof C0140f) {
                                                objM116u3 = null;
                                            }
                                            View view9 = (View) objM116u3;
                                            if (view9 != null && view9.isShown() && !AbstractC0307g.m699a(view9.getTag(C1031R.id.abc_tag_custom_time), Boolean.TRUE)) {
                                                Object parent = view9;
                                                int i11 = 0;
                                                while (true) {
                                                    if (!(parent instanceof View) || i11 >= 16) {
                                                        break;
                                                    }
                                                    if (parent == view8) {
                                                        ViewParent parent2 = view9.getParent();
                                                        if ((parent2 instanceof LinearLayout) || (parent2 instanceof RelativeLayout)) {
                                                            if (m1557N(view9) > 0) {
                                                                arrayList.add(view9);
                                                            }
                                                        }
                                                    } else {
                                                        parent = ((View) parent).getParent();
                                                        i11++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                Iterator it = arrayList.iterator();
                                if (it.hasNext()) {
                                    next2 = it.next();
                                    if (it.hasNext()) {
                                        long jM1557N = m1557N((View) next2);
                                        do {
                                            Object next3 = it.next();
                                            long jM1557N2 = m1557N((View) next3);
                                            if (jM1557N < jM1557N2) {
                                                next2 = next3;
                                                jM1557N = jM1557N2;
                                            }
                                        } while (it.hasNext());
                                    }
                                } else {
                                    next2 = null;
                                }
                                View view10 = (View) next2;
                                if (view10 == null) {
                                    ViewGroup viewGroup3 = (ViewGroup) view8;
                                    ClassLoader classLoader2 = viewGroup3.getContext().getClassLoader();
                                    AbstractC0307g.m702d(classLoader2, "getClassLoader(...)");
                                    View viewM1550F2 = m1550F(view8, classLoader2);
                                    if (viewM1550F2 != null) {
                                        m1576d(viewM1550F2, string, jLongValue, z3, c0625t04);
                                        view4 = view;
                                        if (c0625t04.f1935k) {
                                        }
                                    } else {
                                        if (AbstractC0040p.m92W(3, 43, 48, 62, 47).contains(Integer.valueOf(i5))) {
                                            ArrayList arrayList2 = new ArrayList();
                                            m1554J(viewGroup3, arrayList2);
                                            Context context = viewGroup3.getContext();
                                            AbstractC0307g.m702d(context, "getContext(...)");
                                            int iM1607u = m1607u(context, 64);
                                            ArrayList arrayList3 = new ArrayList();
                                            for (Object obj4 : arrayList2) {
                                                View view11 = (View) obj4;
                                                int width = view11.getWidth();
                                                ViewGroup.LayoutParams layoutParams2 = view11.getLayoutParams();
                                                if (Math.max(width, layoutParams2 != null ? layoutParams2.width : 0) >= iM1607u) {
                                                    int height = view11.getHeight();
                                                    ViewGroup.LayoutParams layoutParams3 = view11.getLayoutParams();
                                                    if (Math.max(height, layoutParams3 != null ? layoutParams3.height : 0) >= iM1607u) {
                                                        arrayList3.add(obj4);
                                                    }
                                                }
                                            }
                                            Iterator it2 = arrayList3.iterator();
                                            if (it2.hasNext()) {
                                                next = it2.next();
                                                if (it2.hasNext()) {
                                                    View view12 = (View) next;
                                                    int width2 = view12.getWidth();
                                                    ViewGroup.LayoutParams layoutParams4 = view12.getLayoutParams();
                                                    long jMax = Math.max(width2, layoutParams4 != null ? layoutParams4.width : 0);
                                                    int height2 = view12.getHeight();
                                                    ViewGroup.LayoutParams layoutParams5 = view12.getLayoutParams();
                                                    long jMax2 = jMax * ((long) Math.max(height2, layoutParams5 != null ? layoutParams5.height : 0));
                                                    while (true) {
                                                        Object next4 = it2.next();
                                                        View view13 = (View) next4;
                                                        int width3 = view13.getWidth();
                                                        ViewGroup.LayoutParams layoutParams6 = view13.getLayoutParams();
                                                        long jMax3 = Math.max(width3, layoutParams6 != null ? layoutParams6.width : 0);
                                                        int height3 = view13.getHeight();
                                                        ViewGroup.LayoutParams layoutParams7 = view13.getLayoutParams();
                                                        view4 = view;
                                                        long jMax4 = jMax3 * ((long) Math.max(height3, layoutParams7 != null ? layoutParams7.height : 0));
                                                        if (jMax2 < jMax4) {
                                                            next = next4;
                                                            jMax2 = jMax4;
                                                        }
                                                        if (it2.hasNext()) {
                                                            view = view4;
                                                        }
                                                    }
                                                } else {
                                                    view4 = view;
                                                }
                                            } else {
                                                view4 = view;
                                                next = null;
                                            }
                                            view5 = (View) next;
                                        } else {
                                            view4 = view;
                                            view5 = null;
                                        }
                                        if (view5 != null) {
                                            m1576d(view5, string, jLongValue, z3, c0625t04);
                                        } else {
                                            int childCount2 = viewGroup3.getChildCount() - 1;
                                            while (true) {
                                                if (-1 < childCount2) {
                                                    View childAt2 = viewGroup3.getChildAt(childCount2);
                                                    if (childAt2 instanceof ViewGroup) {
                                                        viewGroup = (ViewGroup) childAt2;
                                                        if (viewGroup.getChildCount() >= 2) {
                                                        }
                                                    }
                                                    childCount2--;
                                                } else {
                                                    viewGroup = null;
                                                }
                                            }
                                            if (viewGroup != null) {
                                                if ((viewGroup instanceof LinearLayout) && ((LinearLayout) viewGroup).getOrientation() == 1) {
                                                    View viewM1548D = m1548D(viewGroup, view8);
                                                    if (viewM1548D != null) {
                                                        m1576d(viewM1548D, string, jLongValue, z3, c0625t04);
                                                    } else {
                                                        m1582g(viewGroup, string, jLongValue, z3, c0625t04);
                                                    }
                                                } else {
                                                    int i12 = 1;
                                                    int childCount3 = viewGroup.getChildCount() - 1;
                                                    int i13 = -1;
                                                    while (true) {
                                                        if (i13 < childCount3) {
                                                            View childAt3 = viewGroup.getChildAt(childCount3);
                                                            if ((childAt3 instanceof LinearLayout) && ((LinearLayout) childAt3).getOrientation() == i12) {
                                                                ViewGroup viewGroup4 = (ViewGroup) childAt3;
                                                                View viewM1548D2 = m1548D(viewGroup4, view8);
                                                                if (viewM1548D2 != null) {
                                                                    m1576d(viewM1548D2, string, jLongValue, z3, c0625t04);
                                                                } else {
                                                                    m1582g(viewGroup4, string, jLongValue, z3, c0625t04);
                                                                }
                                                            } else {
                                                                i13 = -1;
                                                                childCount3--;
                                                                i12 = 1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (c0625t04.f1935k) {
                                        }
                                    }
                                } else {
                                    ViewParent parent3 = view10.getParent();
                                    ViewGroup viewGroup5 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
                                    if (viewGroup5 != null) {
                                        if (viewGroup5 instanceof LinearLayout) {
                                            LinearLayout linearLayout2 = (LinearLayout) viewGroup5;
                                            if (linearLayout2.getOrientation() == 1) {
                                                m1567X(linearLayout2, view10, string, jLongValue, z3, c0625t04);
                                            }
                                            view4 = view;
                                            if (c0625t04.f1935k) {
                                            }
                                        } else {
                                            if (viewGroup5 instanceof RelativeLayout) {
                                                m1578e((RelativeLayout) viewGroup5, view10, string, jLongValue, z3, c0625t04);
                                            }
                                            view4 = view;
                                            if (c0625t04.f1935k) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        iIntValue2 = 49;
                        if (!(iIntValue2 != 49)) {
                        }
                    } else {
                        view4 = view;
                        if (c0625t04.f1935k) {
                            m1608v(view8, c0625t04);
                        }
                    }
                }
            }
            view4 = view;
        }
        if (f1970d.compareAndSet(false, true)) {
            m1601p0("first message row enhanced: isSend=" + z3 + " hasBubble=" + (view4 != null));
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m1573b0(Object obj) {
        int iIntValue;
        Object objM1611y = m1611y(obj, "field_isSend");
        Number number = objM1611y instanceof Number ? (Number) objM1611y : null;
        Integer numValueOf = number != null ? Integer.valueOf(number.intValue()) : null;
        if (numValueOf != null) {
            return numValueOf.intValue() == 1;
        }
        Integer numM1569Z = m1569Z(obj, "isSend");
        if (numM1569Z != null) {
            iIntValue = numM1569Z.intValue();
        } else {
            Integer numM1569Z2 = m1569Z(obj, "E0");
            iIntValue = numM1569Z2 != null ? numM1569Z2.intValue() : 0;
        }
        return iIntValue == 1;
    }

    /* JADX INFO: renamed from: c */
    public static final void m1574c(String str, String str2) {
        if (f1983q.compareAndSet(false, true)) {
            m1601p0("cleaned system notice via " + str + ": " + str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /* JADX INFO: renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Long m1575c0(Object obj, String str, String str2) {
        Object objM116u;
        try {
            Method methodM1603q0 = m1603q0(obj.getClass(), str);
            if (methodM1603q0 != null) {
                Object objInvoke = methodM1603q0.invoke(obj, null);
                Number number = objInvoke instanceof Number ? (Number) objInvoke : null;
                objM116u = number != null ? Long.valueOf(number.longValue()) : null;
            }
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        Long l2 = (Long) objM116u;
        if (l2 != null) {
            return l2;
        }
        Object objM1611y = m1611y(obj, str2);
        Number number2 = objM1611y instanceof Number ? (Number) objM1611y : null;
        if (number2 != null) {
            return Long.valueOf(number2.longValue());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b A[PHI: r0
  0x003b: PHI (r0v9 android.view.ViewGroup) = 
  (r0v4 android.view.ViewGroup)
  (r0v7 android.view.ViewGroup)
  (r0v7 android.view.ViewGroup)
  (r0v4 android.view.ViewGroup)
 binds: [B:22:0x0040, B:56:0x0097, B:53:0x0092, B:19:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ca  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1576d(View view, String str, long j2, boolean z2, C0625T0 c0625t0) {
        ViewGroup viewGroupM1556M;
        View childAt;
        if (AbstractC0425j.m1013R0(str)) {
            return;
        }
        C0634Y c0634yM1555L = m1555L(view);
        if (c0634yM1555L != null) {
            m1567X(c0634yM1555L.f1949a, c0634yM1555L.f1950b, str, j2, z2, c0625t0);
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            if ((!(viewGroup instanceof LinearLayout) || ((LinearLayout) viewGroup).getOrientation() != 1) && !(viewGroup instanceof RelativeLayout)) {
                if (viewGroup instanceof FrameLayout) {
                    ViewParent parent2 = ((FrameLayout) viewGroup).getParent();
                    viewGroupM1556M = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                    if ((!(viewGroupM1556M instanceof LinearLayout) || ((LinearLayout) viewGroupM1556M).getOrientation() != 1) && !(viewGroupM1556M instanceof RelativeLayout)) {
                        viewGroupM1556M = viewGroupM1556M != null ? m1556M(viewGroupM1556M) : null;
                        if (viewGroupM1556M == null) {
                            viewGroupM1556M = m1556M(viewGroup);
                            if (viewGroupM1556M == null) {
                                ViewParent parent3 = viewGroup.getParent();
                                viewGroup = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
                                viewGroupM1556M = (((viewGroup instanceof LinearLayout) && ((LinearLayout) viewGroup).getOrientation() == 1) || (viewGroup instanceof RelativeLayout)) ? viewGroup : null;
                            }
                        }
                    }
                }
            }
        }
        if (viewGroupM1556M == null) {
            return;
        }
        if (viewGroupM1556M instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) viewGroupM1556M;
            if (linearLayout.getOrientation() != 1) {
                m1582g(viewGroupM1556M, str, j2, z2, c0625t0);
                return;
            }
            ViewParent parent4 = view.getParent();
            View view2 = parent4 instanceof View ? (View) parent4 : null;
            if (view2 == null) {
                View view3 = AbstractC0307g.m699a(view.getParent(), viewGroupM1556M) ? view : null;
                if (view3 == null) {
                    int childCount = linearLayout.getChildCount() - 1;
                    childAt = viewGroupM1556M.getChildAt(childCount >= 0 ? childCount : 0);
                } else {
                    childAt = view3;
                }
            } else {
                if (!AbstractC0307g.m699a(view2.getParent(), viewGroupM1556M)) {
                    view2 = null;
                }
                if (view2 != null) {
                    childAt = view2;
                }
            }
            if (childAt == null || AbstractC0307g.m699a(childAt.getTag(C1031R.id.abc_tag_custom_time), Boolean.TRUE)) {
                m1582g(viewGroupM1556M, str, j2, z2, c0625t0);
                return;
            } else {
                m1567X(linearLayout, childAt, str, j2, z2, c0625t0);
                return;
            }
        }
        if (viewGroupM1556M instanceof RelativeLayout) {
            m1578e((RelativeLayout) viewGroupM1556M, view, str, j2, z2, c0625t0);
            return;
        }
        if (!(viewGroupM1556M instanceof FrameLayout)) {
            m1582g(viewGroupM1556M, str, j2, z2, c0625t0);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) viewGroupM1556M;
        ViewParent parent5 = frameLayout.getParent();
        ViewGroup viewGroup2 = parent5 instanceof ViewGroup ? (ViewGroup) parent5 : null;
        if (viewGroup2 instanceof LinearLayout) {
            LinearLayout linearLayout2 = (LinearLayout) viewGroup2;
            if (linearLayout2.getOrientation() == 1) {
                m1567X(linearLayout2, viewGroupM1556M, str, j2, z2, c0625t0);
                return;
            }
        }
        if (AbstractC0425j.m1013R0(str)) {
            return;
        }
        Context context = frameLayout.getContext();
        int i2 = (z2 ? 8388613 : 8388611) | 80;
        TextView textViewM1549E = m1549E(frameLayout);
        if (textViewM1549E == null) {
            AbstractC0307g.m700b(context);
            View viewM1604r = m1604r(context, str, j2, c0625t0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = i2;
            layoutParams.bottomMargin = m1607u(context, 2);
            layoutParams.leftMargin = m1607u(context, c0625t0.m1527b(z2));
            layoutParams.rightMargin = m1607u(context, c0625t0.m1526a(z2));
            frameLayout.addView(viewM1604r, layoutParams);
            return;
        }
        textViewM1549E.setText(str);
        textViewM1549E.setTag(C1031R.id.abc_tag_custom_time_msg_id, Long.valueOf(j2));
        textViewM1549E.setTextSize(c0625t0.f1928d);
        m1592l(textViewM1549E, c0625t0);
        m1590k(textViewM1549E, c0625t0);
        ViewGroup.LayoutParams layoutParams2 = textViewM1549E.getLayoutParams();
        FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 != null) {
            layoutParams3.gravity = i2;
            layoutParams3.topMargin = 0;
            AbstractC0307g.m700b(context);
            layoutParams3.bottomMargin = m1607u(context, 2);
            layoutParams3.leftMargin = m1607u(context, c0625t0.m1527b(z2));
            layoutParams3.rightMargin = m1607u(context, c0625t0.m1526a(z2));
            textViewM1549E.setLayoutParams(layoutParams3);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static String m1577d0(Object obj) {
        Object objM116u;
        Object objInvoke;
        try {
            Method methodM1603q0 = m1603q0(obj.getClass(), "getContent");
            objM116u = (methodM1603q0 == null || (objInvoke = methodM1603q0.invoke(obj, null)) == null) ? null : objInvoke.toString();
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        String str = (String) objM116u;
        if (str != null) {
            return str;
        }
        Object objM1611y = m1611y(obj, "field_content");
        if (objM1611y != null) {
            return objM1611y.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static void m1578e(RelativeLayout relativeLayout, View view, String str, long j2, boolean z2, C0625T0 c0625t0) {
        if (AbstractC0425j.m1013R0(str)) {
            return;
        }
        C0312l c0312l = new C0312l();
        int id = view.getId();
        c0312l.f594a = id;
        if (id == -1) {
            int iGenerateViewId = View.generateViewId();
            c0312l.f594a = iGenerateViewId;
            view.setId(iGenerateViewId);
        }
        Context context = relativeLayout.getContext();
        TextView textViewM1549E = m1549E(relativeLayout);
        if (textViewM1549E == null) {
            AbstractC0307g.m700b(context);
            TextView textViewM1604r = m1604r(context, str, j2, c0625t0);
            textViewM1604r.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            m1580f(c0312l, z2, context, c0625t0, textViewM1604r);
            relativeLayout.addView(textViewM1604r);
            return;
        }
        textViewM1549E.setText(str);
        textViewM1549E.setTag(C1031R.id.abc_tag_custom_time_msg_id, Long.valueOf(j2));
        textViewM1549E.setTextSize(c0625t0.f1928d);
        m1592l(textViewM1549E, c0625t0);
        m1590k(textViewM1549E, c0625t0);
        m1580f(c0312l, z2, context, c0625t0, textViewM1549E);
    }

    /* JADX INFO: renamed from: e0 */
    public static void m1579e0(final View view, final boolean z2, final int i2, final String str, final long j2, boolean z3) {
        if (!C0683p.m1753a().f2152h) {
            view.setTag(C1031R.id.abc_tag_bubble_source, null);
            return;
        }
        boolean zM1486a = AbstractC0600K.m1486a(str, i2);
        view.setTag(C1031R.id.abc_tag_bubble_supports_custom, Boolean.valueOf(zM1486a));
        view.setTag(C1031R.id.abc_tag_bubble_msg_id, Long.valueOf(j2));
        if (!AbstractC0425j.m1005J0(view.getClass().getName(), "MMNeat7extView", false) || !zM1486a) {
            view.setTag(C1031R.id.abc_tag_bubble_source, null);
            return;
        }
        ConcurrentHashMap concurrentHashMap = AbstractC0626U.f1936a;
        String strM1534g = AbstractC0626U.m1534g(f1965E, z2);
        Context context = view.getContext();
        AbstractC0307g.m702d(context, "getContext(...)");
        C0618Q c0618qM1532e = AbstractC0626U.m1532e(context, f1965E, z2);
        if (c0618qM1532e == null) {
            return;
        }
        view.setBackground(c0618qM1532e.f1908a);
        view.setTag(C1031R.id.abc_tag_bubble_source, strM1534g);
        if (z3) {
            if ((((i2 != 49 && (65535 & i2) != 49) ? i2 : 49) == 49) && AbstractC0600K.m1486a(str, i2)) {
                Runnable runnable = new Runnable() { // from class: c0.N
                    @Override // java.lang.Runnable
                    public final void run() {
                        View view2 = view;
                        AbstractC0307g.m703e(view2, "$bubble");
                        String str2 = str;
                        AbstractC0307g.m703e(str2, "$messageContent");
                        Object tag = view2.getTag(C1031R.id.abc_tag_bubble_msg_id);
                        Long l2 = tag instanceof Long ? (Long) tag : null;
                        if (l2 == null) {
                            return;
                        }
                        long jLongValue = l2.longValue();
                        long j3 = j2;
                        if (jLongValue != j3) {
                            return;
                        }
                        Object tag2 = view2.getTag(C1031R.id.abc_tag_bubble_msg_type);
                        Integer num = tag2 instanceof Integer ? (Integer) tag2 : null;
                        if (num == null) {
                            return;
                        }
                        int iIntValue = num.intValue();
                        int i3 = i2;
                        if (iIntValue != i3) {
                            return;
                        }
                        Object tag3 = view2.getTag(C1031R.id.abc_tag_bubble_is_send);
                        Boolean bool = tag3 instanceof Boolean ? (Boolean) tag3 : null;
                        boolean z4 = z2;
                        if (AbstractC0307g.m699a(bool, Boolean.valueOf(z4))) {
                            MessageDetailHook messageDetailHook = MessageDetailHook.f1967a;
                            MessageDetailHook.m1579e0(view2, z4, i3, str2, j3, false);
                            MessageDetailHook.m1584h(view2, z4);
                        }
                    }
                };
                view.post(runnable);
                view.postDelayed(runnable, 96L);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m1580f(C0312l c0312l, boolean z2, Context context, C0625T0 c0625t0, TextView textView) {
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams2.addRule(3, c0312l.f594a);
        layoutParams2.addRule(11, 0);
        layoutParams2.addRule(9, 0);
        if (z2) {
            layoutParams2.addRule(11);
        } else {
            layoutParams2.addRule(9);
        }
        AbstractC0307g.m700b(context);
        layoutParams2.topMargin = m1607u(context, 4);
        layoutParams2.leftMargin = m1607u(context, c0625t0.m1527b(z2));
        layoutParams2.rightMargin = m1607u(context, c0625t0.m1526a(z2));
        textView.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m1581f0(View view) {
        m1585h0(view);
        View view2 = view;
        for (int i2 = 0; i2 < 8; i2++) {
            String name = view2.getClass().getName();
            if (view2.getTag(C1031R.id.abc_tag_message_object) != null || AbstractC0425j.m1005J0(name, ".viewitems.", false)) {
                break;
            }
            Object parent = view2.getParent();
            if (!(parent instanceof View) || m1565V(parent.getClass().getName())) {
                break;
            }
            view2 = (View) parent;
        }
        ViewParent parent2 = view2.getParent();
        ViewGroup viewGroup = null;
        ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup2 != null) {
            int iIndexOfChild = viewGroup2.indexOfChild(view2);
            for (int i3 = -2; i3 < 3; i3++) {
                int i4 = iIndexOfChild + i3;
                if (i4 >= 0 && i4 < viewGroup2.getChildCount()) {
                    View childAt = viewGroup2.getChildAt(i4);
                    AbstractC0307g.m702d(childAt, "getChildAt(...)");
                    m1583g0(childAt);
                }
            }
        }
        ViewParent parent3 = view.getParent();
        int i5 = 0;
        while (true) {
            if (!(parent3 instanceof ViewGroup) || i5 >= 10) {
                break;
            }
            if (m1565V(parent3.getClass().getName())) {
                viewGroup = (ViewGroup) parent3;
                break;
            } else {
                parent3 = ((ViewGroup) parent3).getParent();
                i5++;
            }
        }
        if (viewGroup == null) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int height = (view.getHeight() / 2) + iArr[1];
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = viewGroup.getChildAt(i6);
            if (childAt2 != null && childAt2.isShown() && childAt2.getHeight() > 0) {
                int[] iArr2 = new int[2];
                childAt2.getLocationOnScreen(iArr2);
                if (Math.abs(((childAt2.getHeight() / 2) + iArr2[1]) - height) <= childAt2.getHeight() * 3) {
                    m1583g0(childAt2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m1582g(ViewGroup viewGroup, String str, long j2, boolean z2, C0625T0 c0625t0) {
        ViewGroup.LayoutParams layoutParams;
        if (AbstractC0425j.m1013R0(str)) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textViewM1549E = m1549E(viewGroup);
        if (textViewM1549E != null) {
            textViewM1549E.setText(str);
            textViewM1549E.setTag(C1031R.id.abc_tag_custom_time_msg_id, Long.valueOf(j2));
            textViewM1549E.setGravity(z2 ? 8388613 : 8388611);
            textViewM1549E.setTextSize(c0625t0.f1928d);
            m1592l(textViewM1549E, c0625t0);
            m1590k(textViewM1549E, c0625t0);
            return;
        }
        AbstractC0307g.m700b(context);
        View viewM1604r = m1604r(context, str, j2, c0625t0);
        if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            if (z2) {
                layoutParams2.addRule(11);
            } else {
                layoutParams2.addRule(9);
            }
            layoutParams2.topMargin = m1607u(context, 4);
            layoutParams2.leftMargin = m1607u(context, c0625t0.m1527b(z2));
            layoutParams2.rightMargin = m1607u(context, c0625t0.m1526a(z2));
            layoutParams = layoutParams2;
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = (z2 ? 8388613 : 8388611) | 80;
            layoutParams3.topMargin = m1607u(context, 4);
            layoutParams3.leftMargin = m1607u(context, c0625t0.m1527b(z2));
            layoutParams3.rightMargin = m1607u(context, c0625t0.m1526a(z2));
            layoutParams = layoutParams3;
        } else {
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.topMargin = m1607u(context, 4);
            layoutParams4.gravity = z2 ? 8388613 : 8388611;
            layoutParams4.leftMargin = m1607u(context, c0625t0.m1527b(z2));
            layoutParams4.rightMargin = m1607u(context, c0625t0.m1526a(z2));
            layoutParams = layoutParams4;
        }
        viewGroup.addView(viewM1604r, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX INFO: renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1583g0(View view) {
        boolean zFind;
        CharSequence text;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                AbstractC0307g.m700b(childAt);
                if (AbstractC0307g.m699a(childAt.getTag(C1031R.id.abc_tag_custom_time), Boolean.TRUE)) {
                    zFind = true;
                } else {
                    String string = null;
                    TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
                    if (textView != null && (text = textView.getText()) != null) {
                        string = text.toString();
                    }
                    if (string == null) {
                        string = "";
                    }
                    zFind = false;
                    if (!AbstractC0425j.m1013R0(string)) {
                        String string2 = AbstractC0425j.m1022a1(string).toString();
                        if (!AbstractC0425j.m1005J0(string2, "刚刚", false)) {
                            Pattern patternCompile = Pattern.compile("\\d{1,3}分钟前");
                            AbstractC0307g.m702d(patternCompile, "compile(...)");
                            if (!patternCompile.matcher(string2).find()) {
                                Pattern patternCompile2 = Pattern.compile("\\d{1,3}小时前");
                                AbstractC0307g.m702d(patternCompile2, "compile(...)");
                                if (!patternCompile2.matcher(string2).find() && !AbstractC0425j.m1005J0(string2, "昨天", false) && !AbstractC0425j.m1005J0(string2, "前天", false)) {
                                    Pattern patternCompile3 = Pattern.compile("\\d{2}-\\d{2}\\s+\\d{1,2}:\\d{2}");
                                    AbstractC0307g.m702d(patternCompile3, "compile(...)");
                                    zFind = patternCompile3.matcher(string2).find();
                                }
                            }
                        }
                    }
                }
                if (zFind) {
                    viewGroup.removeViewAt(childCount);
                } else {
                    m1583g0(childAt);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m1584h(View view, boolean z2) {
        int i2 = z2 ? 8388613 : 8388611;
        C0634Y c0634yM1555L = m1555L(view);
        if (c0634yM1555L != null) {
            LinearLayout linearLayout = c0634yM1555L.f1949a;
            linearLayout.setGravity(i2);
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null && layoutParams2.gravity != i2) {
                layoutParams2.gravity = i2;
                linearLayout.setLayoutParams(layoutParams2);
            }
            View view2 = c0634yM1555L.f1950b;
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null && layoutParams4.gravity != i2) {
                layoutParams4.gravity = i2;
                view2.setLayoutParams(layoutParams4);
            }
        }
        ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
        LinearLayout.LayoutParams layoutParams6 = layoutParams5 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams5 : null;
        if (layoutParams6 == null || layoutParams6.gravity == i2) {
            return;
        }
        layoutParams6.gravity = i2;
        view.setLayoutParams(layoutParams6);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m1585h0(View view) {
        m1583g0(view);
        Object parent = view.getParent();
        ViewGroup viewGroup = null;
        for (int i2 = 0; (parent instanceof ViewGroup) && i2 < 8; i2++) {
            String name = parent.getClass().getName();
            if (m1565V(name)) {
                break;
            }
            viewGroup = (ViewGroup) parent;
            if (viewGroup.getTag(C1031R.id.abc_tag_message_object) != null || AbstractC0425j.m1005J0(name, ".viewitems.", false)) {
                m1583g0((View) parent);
                return;
            }
            parent = viewGroup.getParent();
        }
        if (viewGroup != null) {
            m1583g0(viewGroup);
        }
    }

    /* JADX INFO: renamed from: i */
    public static List m1586i(Class cls) {
        ConcurrentHashMap concurrentHashMap = f1989w;
        Object obj = concurrentHashMap.get(cls);
        Object obj2 = obj;
        if (obj == null) {
            ArrayList arrayList = new ArrayList();
            for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                Field[] declaredFields = superclass.getDeclaredFields();
                AbstractC0307g.m702d(declaredFields, "getDeclaredFields(...)");
                AbstractC0188s.m561m0(arrayList, declaredFields);
            }
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, arrayList);
            obj2 = arrayList;
            if (objPutIfAbsent != null) {
                obj2 = objPutIfAbsent;
            }
        }
        return (List) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX INFO: renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m1587i0(View view, Object obj) {
        Object objM116u;
        Method method = f1963C;
        if (method == null) {
            return obj;
        }
        ArrayList arrayListM1594m = m1594m(C1031R.id.abc_tag_message_holder, view, obj);
        ArrayList arrayListM1594m2 = m1594m(C1031R.id.abc_tag_message_adapter, view, null);
        for (Object obj2 : arrayListM1594m) {
            for (Object obj3 : arrayListM1594m2) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                try {
                    method.setAccessible(true);
                    int length = parameterTypes.length;
                    if (length != 1) {
                        if (length == 2 && obj2 != null && obj3 != null) {
                            Class<?> cls = parameterTypes[0];
                            AbstractC0307g.m702d(cls, "get(...)");
                            if (m1599o0(cls).isInstance(obj2)) {
                                Class<?> cls2 = parameterTypes[1];
                                AbstractC0307g.m702d(cls2, "get(...)");
                                objM116u = !m1599o0(cls2).isInstance(obj3) ? null : method.invoke(null, obj2, obj3);
                            }
                        }
                    } else if (obj2 != null) {
                        Class<?> cls3 = parameterTypes[0];
                        AbstractC0307g.m702d(cls3, "get(...)");
                        if (m1599o0(cls3).isInstance(obj2)) {
                            objM116u = method.invoke(null, obj2);
                        }
                    }
                } catch (Throwable th) {
                    objM116u = AbstractC0040p.m116u(th);
                }
                if (objM116u instanceof C0140f) {
                    objM116u = null;
                }
                if (objM116u != null) {
                    m1601p0("resolved current quote msg via " + method.getName() + ": " + objM116u.getClass().getName());
                    return objM116u;
                }
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: j */
    public static List m1588j(Class cls) {
        ConcurrentHashMap concurrentHashMap = f1990x;
        Object obj = concurrentHashMap.get(cls);
        Object obj2 = obj;
        if (obj == null) {
            ArrayList arrayList = new ArrayList();
            for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                Method[] declaredMethods = superclass.getDeclaredMethods();
                AbstractC0307g.m702d(declaredMethods, "getDeclaredMethods(...)");
                AbstractC0188s.m561m0(arrayList, declaredMethods);
            }
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, arrayList);
            obj2 = arrayList;
            if (objPutIfAbsent != null) {
                obj2 = objPutIfAbsent;
            }
        }
        return (List) obj2;
    }

    /* JADX INFO: renamed from: j0 */
    public static void m1589j0(Activity activity, boolean z2) {
        Object objM116u;
        AbstractC0307g.m703e(activity, "activity");
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        intent.addCategory("android.intent.category.OPENABLE");
        int i2 = z2 ? 658453 : 658452;
        try {
            activity.startActivityForResult(Intent.createChooser(intent, "选择 .9.png 气泡皮肤"), i2);
            objM116u = C0146l.f339a;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (AbstractC0141g.m465a(objM116u) != null) {
            try {
                activity.startActivityForResult(intent, i2);
            } catch (Throwable th2) {
                AbstractC0040p.m116u(th2);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m1590k(TextView textView, C0625T0 c0625t0) {
        if (!c0625t0.f1935k) {
            textView.setVisibility(0);
            textView.setTag(C1031R.id.abc_tag_custom_time_hidden, Boolean.FALSE);
        } else {
            if (AbstractC0307g.m699a(textView.getTag(C1031R.id.abc_tag_custom_time_hidden), Boolean.FALSE)) {
                return;
            }
            textView.setVisibility(8);
            textView.setTag(C1031R.id.abc_tag_custom_time_hidden, Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static View m1591k0(View view, Object obj, ClassLoader classLoader) {
        boolean zM1573b0 = m1573b0(obj);
        Integer numM1571a0 = m1571a0(obj);
        int iIntValue = numM1571a0 != null ? numM1571a0.intValue() : 0;
        String strM1577d0 = m1577d0(obj);
        if (strM1577d0 == null) {
            strM1577d0 = "";
        }
        Long lM1575c0 = m1575c0(obj, "getMsgId", "field_msgId");
        long jLongValue = lM1575c0 != null ? lM1575c0.longValue() : 0L;
        view.setTag(C1031R.id.abc_tag_message_object, obj);
        StringBuilder sb = new StringBuilder();
        m1602q(sb, view);
        String string = sb.toString();
        AbstractC0307g.m702d(string, "toString(...)");
        if (!AbstractC0358S.m897m0(iIntValue, strM1577d0, string)) {
            m1600p(view);
            m1598o(view);
            m1585h0(view);
            return null;
        }
        View viewM1547C = m1547C(view, classLoader);
        if (viewM1547C == null) {
            return null;
        }
        boolean zM1486a = AbstractC0600K.m1486a(strM1577d0, iIntValue);
        viewM1547C.setTag(C1031R.id.abc_tag_message_object, obj);
        viewM1547C.setTag(C1031R.id.abc_tag_swipe_target_row, view);
        viewM1547C.setTag(C1031R.id.abc_tag_bubble_is_send, Boolean.valueOf(zM1573b0));
        viewM1547C.setTag(C1031R.id.abc_tag_bubble_msg_type, Integer.valueOf(iIntValue));
        viewM1547C.setTag(C1031R.id.abc_tag_bubble_msg_id, Long.valueOf(jLongValue));
        viewM1547C.setTag(C1031R.id.abc_tag_bubble_supports_custom, Boolean.valueOf(zM1486a));
        return viewM1547C;
    }

    /* JADX INFO: renamed from: l */
    public static void m1592l(TextView textView, C0625T0 c0625t0) {
        boolean z2 = (textView.getResources().getConfiguration().uiMode & 48) == 32;
        int iArgb = z2 ? c0625t0.f1934j : c0625t0.f1933i;
        if (!z2 && Color.alpha(iArgb) < 230) {
            iArgb = Color.argb(230, Color.red(iArgb), Color.green(iArgb), Color.blue(iArgb));
        }
        if (!z2) {
            if ((Color.blue(iArgb) * 0.114f) + (Color.green(iArgb) * 0.587f) + (Color.red(iArgb) * 0.299f) < 120.0f) {
                iArgb = Color.argb(242, 245, 245, 245);
            }
        }
        textView.setTextColor(iArgb);
        textView.setAlpha(1.0f);
        textView.setLetterSpacing(0.0f);
        if (z2) {
            textView.setTypeface(Typeface.create("sans-serif", 0));
            textView.setShadowLayer(1.2f, 0.0f, 0.5f, Color.parseColor("#44000000"));
        } else {
            textView.setTypeface(Typeface.create("sans-serif-medium", 0));
            textView.setShadowLayer(1.15f, 0.0f, 0.45f, Color.parseColor("#66000000"));
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static void m1593l0(View view, View view2, Object obj) {
        Class cls = f1964D;
        if (cls == null) {
            return;
        }
        View viewM1612z = m1612z(view, cls);
        View view3 = viewM1612z;
        if (viewM1612z == null) {
            View viewM1612z2 = m1612z(view2, cls);
            view3 = viewM1612z2;
            if (viewM1612z2 == null) {
                return;
            }
        }
        view3.setTag(C1031R.id.abc_tag_message_object, obj);
        view3.setTag(C1031R.id.abc_tag_message_holder, view.getTag(C1031R.id.abc_tag_message_holder));
        view3.setTag(C1031R.id.abc_tag_message_adapter, view.getTag(C1031R.id.abc_tag_message_adapter));
        view3.setTag(C1031R.id.abc_tag_swipe_target_row, view3);
    }

    /* JADX INFO: renamed from: m */
    public static ArrayList m1594m(int i2, View view, Object obj) {
        ArrayList arrayList = new ArrayList();
        m1596n(arrayList, view.getTag(i2));
        for (int i3 = 0; view != null && i3 < 5; i3++) {
            m1596n(arrayList, view.getTag(i2));
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        m1596n(arrayList, obj);
        m1596n(arrayList, null);
        return arrayList;
    }

    /* JADX INFO: renamed from: m0 */
    public static final void m1595m0(View view) {
        if (AbstractC0307g.m699a(view.getTag(C1031R.id.abc_tag_custom_time), Boolean.TRUE)) {
            boolean z2 = view.getVisibility() != 0;
            view.setVisibility(z2 ? 0 : 8);
            view.setTag(C1031R.id.abc_tag_custom_time_hidden, Boolean.valueOf(!z2));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0307g.m702d(childAt, "getChildAt(...)");
                m1595m0(childAt);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m1596n(ArrayList arrayList, Object obj) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next() == obj) {
                    return;
                }
            }
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: n0 */
    public static String m1597n0(Class cls) {
        if (!cls.isPrimitive()) {
            return cls.isArray() ? AbstractC0433r.m1032G0(cls.getName(), '.', '/') : AbstractC0324d.m723f("L", AbstractC0433r.m1032G0(cls.getName(), '.', '/'), ";");
        }
        if (cls.equals(Integer.TYPE)) {
            return "I";
        }
        if (cls.equals(Void.TYPE)) {
            return "V";
        }
        if (cls.equals(Boolean.TYPE)) {
            return "Z";
        }
        if (cls.equals(Character.TYPE)) {
            return "C";
        }
        if (cls.equals(Byte.TYPE)) {
            return "B";
        }
        if (cls.equals(Short.TYPE)) {
            return "S";
        }
        if (cls.equals(Float.TYPE)) {
            return "F";
        }
        if (cls.equals(Long.TYPE)) {
            return "J";
        }
        if (cls.equals(Double.TYPE)) {
            return "D";
        }
        throw new IllegalStateException(("Unknown primitive " + cls).toString());
    }

    /* JADX INFO: renamed from: o */
    public static void m1598o(View view) {
        view.setTag(C1031R.id.abc_tag_bubble_source, null);
        view.setTag(C1031R.id.abc_tag_bubble_is_send, null);
        view.setTag(C1031R.id.abc_tag_bubble_msg_type, null);
        view.setTag(C1031R.id.abc_tag_bubble_msg_id, null);
        view.setTag(C1031R.id.abc_tag_bubble_supports_custom, null);
        view.setTag(C1031R.id.abc_tag_bubble_original_background, null);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0307g.m702d(childAt, "getChildAt(...)");
                m1598o(childAt);
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static Class m1599o0(Class cls) {
        return cls.equals(Boolean.TYPE) ? Boolean.class : cls.equals(Byte.TYPE) ? Byte.class : cls.equals(Short.TYPE) ? Short.class : cls.equals(Integer.TYPE) ? Integer.class : cls.equals(Long.TYPE) ? Long.class : cls.equals(Float.TYPE) ? Float.class : cls.equals(Double.TYPE) ? Double.class : cls.equals(Character.TYPE) ? Character.class : cls;
    }

    /* JADX INFO: renamed from: p */
    public static void m1600p(View view) {
        view.setTag(C1031R.id.abc_tag_message_object, null);
        view.setTag(C1031R.id.abc_tag_swipe_target_row, null);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0307g.m702d(childAt, "getChildAt(...)");
                m1600p(childAt);
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static void m1601p0(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-ChatEnhance] " + str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m1602q(StringBuilder sb, View view) {
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            String string = text != null ? text.toString() : null;
            if (string == null) {
                string = "";
            }
            if (!AbstractC0425j.m1013R0(string)) {
                sb.append(string);
                sb.append(' ');
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0307g.m702d(childAt, "getChildAt(...)");
                m1602q(sb, childAt);
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static Method m1603q0(Class cls, String str) {
        Method method;
        Object next;
        String str2 = cls.getName() + "#" + str;
        ConcurrentHashMap concurrentHashMap = f1991y;
        Object obj = concurrentHashMap.get(str2);
        if (obj == null) {
            Iterator it = m1588j(cls).iterator();
            while (true) {
                method = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Method method2 = (Method) next;
                if (AbstractC0307g.m699a(method2.getName(), str)) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0) {
                        break;
                    }
                }
            }
            Method method3 = (Method) next;
            if (method3 != null) {
                method3.setAccessible(true);
                method = method3;
            }
            C0628V c0628v = new C0628V(method);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(str2, c0628v);
            obj = objPutIfAbsent == null ? c0628v : objPutIfAbsent;
        }
        return (Method) ((C0628V) obj).f1939a;
    }

    /* JADX INFO: renamed from: r */
    public static TextView m1604r(Context context, String str, long j2, C0625T0 c0625t0) {
        TextView textView = new TextView(context);
        textView.setTag(C1031R.id.abc_tag_custom_time, Boolean.TRUE);
        textView.setTag(C1031R.id.abc_tag_custom_time_msg_id, Long.valueOf(j2));
        textView.setText(str);
        textView.setTextSize(c0625t0.f1928d);
        textView.setIncludeFontPadding(false);
        textView.setGravity(8388611);
        m1592l(textView, c0625t0);
        m1590k(textView, c0625t0);
        return textView;
    }

    /* JADX INFO: renamed from: s */
    public static String m1605s(String str) {
        int iM1011P0 = AbstractC0425j.m1011P0(str, "->", 0, false, 6);
        if (iM1011P0 <= 1) {
            throw new IllegalArgumentException(str.toString());
        }
        String strSubstring = str.substring(1, iM1011P0 - 1);
        AbstractC0307g.m702d(strSubstring, "substring(...)");
        return AbstractC0433r.m1032G0(strSubstring, '/', '.');
    }

    /* JADX INFO: renamed from: t */
    public static Method m1606t(ClassLoader classLoader, String str) throws NoSuchMethodException, ClassNotFoundException {
        Method method;
        int iM1011P0 = AbstractC0425j.m1011P0(str, "->", 0, false, 6);
        int iM1010O0 = AbstractC0425j.m1010O0(str, '(', iM1011P0, false, 4);
        if (iM1011P0 <= 1 || iM1010O0 <= iM1011P0) {
            throw new IllegalArgumentException(str.toString());
        }
        String strM1605s = m1605s(str);
        String strSubstring = str.substring(iM1011P0 + 2, iM1010O0);
        AbstractC0307g.m702d(strSubstring, "substring(...)");
        String strSubstring2 = str.substring(iM1010O0);
        AbstractC0307g.m702d(strSubstring2, "substring(...)");
        for (Class<?> clsLoadClass = classLoader.loadClass(strM1605s); clsLoadClass != null; clsLoadClass = clsLoadClass.getSuperclass()) {
            Method[] declaredMethods = clsLoadClass.getDeclaredMethods();
            AbstractC0307g.m702d(declaredMethods, "getDeclaredMethods(...)");
            int length = declaredMethods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i2];
                if (AbstractC0307g.m699a(method.getName(), strSubstring)) {
                    StringBuilder sb = new StringBuilder("(");
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                    for (Class<?> cls : parameterTypes) {
                        AbstractC0307g.m700b(cls);
                        sb.append(m1597n0(cls));
                    }
                    sb.append(')');
                    Class<?> returnType = method.getReturnType();
                    AbstractC0307g.m702d(returnType, "getReturnType(...)");
                    sb.append(m1597n0(returnType));
                    String string = sb.toString();
                    AbstractC0307g.m702d(string, "toString(...)");
                    if (string.equals(strSubstring2)) {
                        break;
                    }
                }
                i2++;
            }
            if (method != null) {
                method.setAccessible(true);
                return method;
            }
        }
        throw new NoSuchMethodException(str);
    }

    /* JADX INFO: renamed from: u */
    public static int m1607u(Context context, int i2) {
        return (int) ((i2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: v */
    public static void m1608v(View view, C0625T0 c0625t0) {
        if (c0625t0.f1935k) {
            Object tag = view.getTag(C1031R.id.abc_tag_detail_click_listener);
            Boolean bool = Boolean.TRUE;
            if (AbstractC0307g.m699a(tag, bool)) {
                return;
            }
            view.setTag(C1031R.id.abc_tag_detail_click_listener, bool);
            view.setOnClickListener(new ViewOnClickListenerC0025a(3, view));
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m1609w(View view, View view2) {
        view.setTag(C1031R.id.abc_tag_swipe_target_row, view2);
        view.setTag(C1031R.id.abc_tag_swipe_listener, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: x */
    public static void m1610x(View view, View view2, Object obj) {
        ViewParent parent = view.getParent();
        int iMax = Math.max(view2.getWidth(), view2.getMeasuredWidth());
        View view3 = view2;
        for (int i2 = 0; (parent instanceof ViewGroup) && i2 < 6 && !m1565V(parent.getClass().getName()); i2++) {
            View view4 = (View) parent;
            int iMax2 = Math.max(view4.getWidth(), view4.getMeasuredWidth());
            if (iMax2 >= iMax) {
                view3 = view4;
                iMax = iMax2;
            }
            parent = ((ViewGroup) parent).getParent();
        }
        if (view3 == null) {
            return;
        }
        view3.setTag(C1031R.id.abc_tag_message_object, obj);
        m1609w(view3, view2);
        if (f1982p.compareAndSet(false, true)) {
            m1601p0("swipe hot zone=" + view3.getClass().getName() + " width=" + Math.max(view3.getWidth(), view3.getMeasuredWidth()) + " target=" + view2.getClass().getName() + " targetWidth=" + Math.max(view2.getWidth(), view2.getMeasuredWidth()) + " bubbleWidth=" + Math.max(view.getWidth(), view.getMeasuredWidth()));
        }
    }

    /* JADX INFO: renamed from: y */
    public static Object m1611y(Object obj, String str) {
        Object objM116u;
        Object next;
        Class<?> cls = obj.getClass();
        String str2 = cls.getName() + "#" + str;
        ConcurrentHashMap concurrentHashMap = f1992z;
        Object obj2 = concurrentHashMap.get(str2);
        if (obj2 == null) {
            Iterator it = m1586i(cls).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC0307g.m699a(((Field) next).getName(), str)) {
                    break;
                }
            }
            Field field = (Field) next;
            if (field != null) {
                field.setAccessible(true);
            } else {
                field = null;
            }
            C0628V c0628v = new C0628V(field);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(str2, c0628v);
            obj2 = objPutIfAbsent == null ? c0628v : objPutIfAbsent;
        }
        Field field2 = (Field) ((C0628V) obj2).f1939a;
        if (field2 == null) {
            return null;
        }
        try {
            objM116u = field2.get(obj);
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            return null;
        }
        return objM116u;
    }

    /* JADX INFO: renamed from: z */
    public static View m1612z(View view, Class cls) {
        for (int i2 = 0; i2 < 8; i2++) {
            if (cls.isInstance(view)) {
                return view;
            }
            Object parent = view.getParent();
            if (!(parent instanceof View) || m1565V(parent.getClass().getName())) {
                return null;
            }
            view = (View) parent;
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final void m1613K(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        Object objM116u;
        Object objM116u2;
        Object objM116u3;
        Object objM116u4;
        try {
            FindMethod findMethod = new FindMethod();
            findMethod.searchPackages("com.tencent.mm.ui.chatting");
            MethodMatcher methodMatcher = new MethodMatcher();
            ClassMatcher classMatcher = new ClassMatcher();
            classMatcher.usingStrings("x2c.X2CCheckBox");
            classMatcher.methodCount(new C0340c(1, 3, 1));
            methodMatcher.declaredClass(classMatcher);
            findMethod.matcher(methodMatcher);
            MethodData methodDataFirstOrNull = dexKitBridge.findMethod(findMethod).firstOrNull();
            objM116u = methodDataFirstOrNull != null ? methodDataFirstOrNull.getDescriptor() : null;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        String str = (String) objM116u;
        if (str == null || AbstractC0425j.m1013R0(str)) {
            m1601p0("DexKit did not find swipe row container");
            return;
        }
        try {
            objM116u2 = m1606t(classLoader, str).getDeclaringClass();
        } catch (Throwable th2) {
            objM116u2 = AbstractC0040p.m116u(th2);
        }
        if (AbstractC0141g.m465a(objM116u2) != null) {
            try {
                objM116u3 = classLoader.loadClass(m1605s(str));
                AbstractC0307g.m702d(objM116u3, "loadClass(...)");
            } catch (Throwable th3) {
                objM116u3 = AbstractC0040p.m116u(th3);
            }
            objM116u2 = (Class) (objM116u3 instanceof C0140f ? null : objM116u3);
        }
        Class cls = (Class) objM116u2;
        if (cls == null) {
            m1601p0("swipe row container descriptor could not resolve: ".concat(str));
            return;
        }
        f1964D = cls;
        m1601p0("found swipe row container via DexKit:" + str + " class=" + cls.getName());
        String strConcat = "DexKit:".concat(str);
        String strConcat2 = cls.getName().concat("#dispatchTouchEvent(MotionEvent)");
        ConcurrentHashMap.KeySetView keySetView = f1988v;
        if (keySetView.add(strConcat2)) {
            try {
                AbstractC0358S.m904q(cls, "dispatchTouchEvent", MotionEvent.class, new CustomBubbleHook(this));
                m1601p0("hooked swipe row dispatch via " + strConcat);
                objM116u4 = C0146l.f339a;
            } catch (Throwable th4) {
                objM116u4 = AbstractC0040p.m116u(th4);
            }
            Throwable thM465a = AbstractC0141g.m465a(objM116u4);
            if (thM465a != null) {
                keySetView.remove(strConcat2);
                m1601p0("swipe row dispatch hook failed via " + strConcat + ": " + thM465a.getMessage());
            }
        }
    }
}
