package p056f0;

import android.R;
import android.util.SparseArray;
import android.widget.BaseAdapter;
import de.robv.android.xposed.AbstractC0762d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0139e;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0188s;
import p009E0.C0172c;
import p009E0.C0180k;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p037U.AbstractC0358S;
import p040V0.AbstractC0407j;
import p040V0.C0401d;
import p040V0.C0402e;
import p040V0.C0406i;
import p049b0.C0565o;
import p049b0.C0566p;
import p050c0.C0591H;

/* JADX INFO: renamed from: f0.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0826f0 {

    /* JADX INFO: renamed from: a */
    public static final C0826f0 f2992a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2993b = null;

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f2994c = null;

    /* JADX INFO: renamed from: d */
    public static final Set f2995d = null;

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f2996e = null;

    /* JADX INFO: renamed from: f */
    public static volatile Field f2997f;

    static {
        f2992a = new C0826f0();
        f2993b = new AtomicBoolean(false);
        f2994c = new AtomicBoolean(false);
        f2995d = Collections.newSetFromMap(new WeakHashMap());
        f2996e = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static final void m2135a(Object r4) {
        Iterator r42 = C0566p.m1377b(r4).iterator();     // Catch: Throwable -> L8
        int r02 = 0;
    L4:
        if (r42.hasNext() == false) goto L14;
        Object r1 = ((C0139e) r42.next()).f329b;     // Catch: Throwable -> L8
        if (AbstractC0317q.m713b(r1) == false) goto L10;
        List r12 = (List) r1;     // Catch: Throwable -> L8
    L11:
        if (r12 == null) goto L4;
        int r2 = r12.size();     // Catch: Throwable -> L8
        AbstractC0188s.m562n0(r12, new C0591H());     // Catch: Throwable -> L8
        r02 = r02 + (r2 - r12.size());     // Catch: Throwable -> L8
        goto L4
    L10:
        r12 = null;
        goto L11
    L14:
        if (r02 <= 0) goto L16;
        m2146l("modern placeholders removed=" + r02);     // Catch: Throwable -> L8
    L16:
        Object r43 = C0146l.f339a;     // Catch: Throwable -> L8
    L19:
        Throwable r44 = AbstractC0141g.m465a(r43);
        if (r44 == null) goto L31;
        m2146l("modern cleanup fail: " + r44.getMessage());
        return;
    L31:
        return;
    L8:
        th = move-exception;
        r43 = AbstractC0040p.m116u(th);
        goto L19
    }

    /* JADX INFO: renamed from: b */
    public static final Object m2136b(Class r4, Object r5) {
        Field r42 = m2138d(r5.getClass(), new C0816a0(2, r4));     // Catch: Throwable -> L7
        if (r42 == null) goto L9;
        r42.setAccessible(true);     // Catch: Throwable -> L7
        Object r43 = r42.get(r5);     // Catch: Throwable -> L7
    L12:
        if ((r43 instanceof C0140f) == false) goto L15;
        return null;
    L15:
        return r43;
    L9:
        r43 = null;
    L7:
        th = move-exception;
        r43 = AbstractC0040p.m116u(th);
        goto L12
    }

    /* JADX INFO: renamed from: c */
    public static Object[] m2137c(Class[] r9) {
        ArrayList r02 = new ArrayList(r9.length);
        int r1 = r9.length;
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r3 >= r1) goto L28;
        Class r5 = r9[r3];
        int r6 = r4 + 1;
        if (r4 != 0) goto L8;
        Object r42 = 168566822;
    L26:
        r02.add(r42);
        r3 = r3 + 1;
        r4 = r6;
        goto L3
    L8:
        if (AbstractC0307g.m699a(r5, String.class) == false) goto L13;
        if (r4 != 1) goto L13;
        r42 = "OKK";
    L13:
        if (AbstractC0307g.m699a(r5, String.class) == false) goto L15;
        r42 = "";
        goto L26
    L15:
        Class r7 = Integer.TYPE;
        if (AbstractC0307g.m699a(r5, r7) == true) goto L22;
        if (AbstractC0307g.m699a(r5, r7) == true) goto L22;
        r42 = null;
    L22:
        if (r4 != 3) goto L24;
        int r43 = R.drawable.ic_menu_manage;
    L25:
        r42 = Integer.valueOf(r43);
        goto L26
    L24:
        r43 = 0;
        goto L25
    L28:
        return r02.toArray(new Object[0]);
    }

    /* JADX INFO: renamed from: d */
    public static Field m2138d(Class r6, InterfaceC0286l r7) {
        C0406i r62 = AbstractC0358S.m861K(new C0565o(r6, null));
    L4:
        if (r62.hasNext() == false) goto L14;
        Field[] r02 = ((Class) r62.next()).getDeclaredFields();
        AbstractC0307g.m702d(r02, "getDeclaredFields(...)");
        int r2 = r02.length;
        int r3 = 0;
    L6:
        if (r3 >= r2) goto L11;
        Field r4 = r02[r3];
        if (((Boolean) r7.invoke(r4)).booleanValue() == true) goto L12;
        r3 = r3 + 1;
    L12:
        if (r4 == null) goto L4;
        return r4;
    L11:
        r4 = null;
        goto L12
    L14:
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static SparseArray m2139e(Object r8) {
        C0406i r02 = AbstractC0358S.m861K(new C0565o(r8.getClass(), null));
    L4:
        if (r02.hasNext() == false) goto L40;
        C0172c r1 = AbstractC0317q.m714c(((Class) r02.next()).getDeclaredFields());
    L7:
        if (r1.hasNext() == false) goto L4;
        Field r3 = (Field) r1.next();
        if (SparseArray.class.isAssignableFrom(r3.getType()) == false) goto L7;
        r3.setAccessible(true);
        Object r32 = r3.get(r8);     // Catch: Throwable -> L15
        if ((r32 instanceof SparseArray) == false) goto L17;
        Object r33 = (SparseArray) r32;     // Catch: Throwable -> L15
    L20:
        if ((r33 instanceof C0140f) == false) goto L22;
        r33 = null;
    L22:
        SparseArray r34 = (SparseArray) r33;
        if (r34 == null) goto L7;
        if (r34.size() == 0) goto L7;
        int r4 = r34.size();
        int r6 = 0;
    L28:
        if (r6 >= r4) goto L33;
        if (r34.keyAt(r6) != r6) goto L7;
        r6 = r6 + 1;
        goto L28
    L33:
        Object r42 = r34.valueAt(0);
        if (r42 == null) goto L7;
        if (r42.getClass().isPrimitive() == true) goto L7;
        if (r42.getClass().equals(String.class) == true) goto L7;
        return r34;
    L17:
        r33 = null;
    L15:
        th = move-exception;
        r33 = AbstractC0040p.m116u(th);
        goto L20
    L40:
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static void m2140f(Object r13) {
        SparseArray r2 = m2143i(r13);     // Catch: Throwable -> L8
        int r4 = 0;
        if (r2 == null) goto L6;
        int r1 = r2.size();     // Catch: Throwable -> L8
        int r5 = 0;
    L12:
        if (r5 >= r1) goto L24;
        Object r6 = r2.valueAt(r5);     // Catch: Throwable -> L8
        if (r6 == null) goto L22;
        Object r62 = m2144j(r6);     // Catch: Throwable -> L8
        if (r62 == null) goto L22;
        if (m2145k(r62) != 168566822) goto L22;
        return;
    L22:
        r5 = r5 + 1;     // Catch: Throwable -> L8
        goto L12
    L24:
        if (r2.size() != 0) goto L27;
        m2146l("plus menu map empty, skip inject (retry on next rebuild)");     // Catch: Throwable -> L8
        return;
    L27:
        Object r12 = r2.valueAt(0);     // Catch: Throwable -> L8
        if (r12 != null) goto L30;
        return;
    L30:
        Object r52 = m2144j(r12);     // Catch: Throwable -> L8
        if (r52 != null) goto L33;
        return;
    L33:
        Class<?> r53 = r52.getClass();     // Catch: Throwable -> L8
        Class<?> r14 = r12.getClass();     // Catch: Throwable -> L8
        Constructor<?>[] r63 = r53.getConstructors();     // Catch: Throwable -> L8
        AbstractC0307g.m702d(r63, "getConstructors(...)");     // Catch: Throwable -> L8
        ArrayList r7 = new ArrayList();     // Catch: Throwable -> L8
        int r8 = r63.length;     // Catch: Throwable -> L8
        int r9 = 0;
    L34:
        if (r9 >= r8) goto L41;
        Constructor<?> r10 = r63[r9];     // Catch: Throwable -> L8
        int r11 = r10.getParameterTypes().length;     // Catch: Throwable -> L8
        if (4 > r11) goto L40;
        if (r11 >= 7) goto L40;
        r7.add(r10);     // Catch: Throwable -> L8
    L40:
        r9 = r9 + 1;     // Catch: Throwable -> L8
        goto L34
    L41:
        Iterator r64 = r7.iterator();     // Catch: Throwable -> L8
        Constructor<?> r82 = null;
        if (r64.hasNext() == true) goto L44;
        Object r72 = null;
    L53:
        Constructor r73 = (Constructor) r72;     // Catch: Throwable -> L8
        if (r73 != null) goto L57;
        m2146l("pg ctor not found on " + r53.getName());     // Catch: Throwable -> L8
        return;
    L57:
        r73.setAccessible(true);     // Catch: Throwable -> L8
        Class<?>[] r65 = r73.getParameterTypes();     // Catch: Throwable -> L8
        AbstractC0307g.m702d(r65, "getParameterTypes(...)");     // Catch: Throwable -> L8
        Object[] r66 = m2137c(r65);     // Catch: Throwable -> L8
        Object r67 = r73.newInstance(Arrays.copyOf(r66, r66.length));     // Catch: Throwable -> L8
        Constructor<?>[] r74 = r14.getConstructors();     // Catch: Throwable -> L8
        AbstractC0307g.m702d(r74, "getConstructors(...)");     // Catch: Throwable -> L8
        int r02 = r74.length;     // Catch: Throwable -> L8
        int r92 = 0;
    L58:
        if (r92 >= r02) goto L63;
        Constructor<?> r102 = r74[r92];     // Catch: Throwable -> L8
        if (r102.getParameterTypes().length == 1) goto L61;
        r92 = r92 + 1;     // Catch: Throwable -> L8
        goto L58
    L61:
        r82 = r102;
    L63:
        if (r82 != null) goto L66;
        m2146l("og ctor not found on " + r14.getName());     // Catch: Throwable -> L8
        return;
    L66:
        r82.setAccessible(true);     // Catch: Throwable -> L8
        Object r03 = r82.newInstance(new Object[]{r67});     // Catch: Throwable -> L8
    L68:
        if (r2.get(r4) == null) goto L70;
        r4 = r4 + 1;     // Catch: Throwable -> L8
        goto L68
    L70:
        r2.put(r4, r03);     // Catch: Throwable -> L8
        m2142h(r13);     // Catch: Throwable -> L8
        m2146l("plus menu item injected key=" + r4 + " size=" + r2.size() + " pg=" + r53.getName() + " og=" + r14.getName() + " holder=" + r13.getClass().getName());     // Catch: Throwable -> L8
        Object r132 = C0146l.f339a;     // Catch: Throwable -> L8
    L73:
        Throwable r133 = AbstractC0141g.m465a(r132);
        if (r133 == null) goto L93;
        m2146l("plus item inject fail: " + r133.getMessage());
        return;
    L93:
        return;
    L44:
        r72 = r64.next();     // Catch: Throwable -> L8
        if (r64.hasNext() == false) goto L53;
        int r93 = ((Constructor) r72).getParameterTypes().length;     // Catch: Throwable -> L8
    L48:
        Object r103 = r64.next();     // Catch: Throwable -> L8
        int r112 = ((Constructor) r103).getParameterTypes().length;     // Catch: Throwable -> L8
        if (r93 >= r112) goto L52;
        r72 = r103;
        r93 = r112;
    L52:
        if (r64.hasNext() == true) goto L48;
    L6:
        if (f2996e.compareAndSet(false, true) == false) goto L10;
        m2146l("plus menu map not found on " + r13.getClass().getName() + " (rg.s 未赋值且无数据管理器渲染 map)");     // Catch: Throwable -> L8
        return;
    L10:
        return;
    L8:
        th = move-exception;
        r132 = AbstractC0040p.m116u(th);
        goto L73
    }

    /* JADX INFO: renamed from: g */
    public static String m2141g(Object r4) {
        Object r02 = null;
        if (r4 == null) goto L27;
        Object r2 = C0566p.m1376a(r4, new String[]{"A6"});
        if ((r2 instanceof String) == false) goto L7;
        String r22 = (String) r2;
    L8:
        if (r22 != null) goto L24;
        Object r42 = AbstractC0358S.m887g(r4, "A6", new Object[0]);     // Catch: Throwable -> L14
        if ((r42 instanceof String) == false) goto L16;
        Object r43 = (String) r42;     // Catch: Throwable -> L14
    L19:
        if ((r43 instanceof C0140f) == true) goto L28;
        r02 = r43;
    L28:
        return (String) r02;
    L16:
        r43 = null;
    L14:
        th = move-exception;
        r43 = AbstractC0040p.m116u(th);
        goto L19
    L24:
        return r22;
    L7:
        r22 = null;
        goto L8
    L27:
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static void m2142h(Object r7) {
        Object r1 = null;
        Field r2 = m2138d(r7.getClass(), new C0813Y(13));     // Catch: Throwable -> L7
        if (r2 == null) goto L9;
        r2.setAccessible(true);     // Catch: Throwable -> L7
        Object r22 = r2.get(r7);     // Catch: Throwable -> L7
    L12:
        if ((r22 instanceof C0140f) == false) goto L14;
        r22 = null;
    L14:
        if (r22 == null) goto L48;
    L44:
        AbstractC0358S.m887g(r22, "notifyDataSetChanged", new Object[0]);     // Catch: Throwable -> L41
        return;
    L41:
        th = move-exception;
        AbstractC0040p.m116u(th);
        return;
    L48:
        C0401d r3 = new C0401d(AbstractC0407j.m994y0(new C0180k(4, new C0565o(r7.getClass(), null)), new C0813Y(14)));     // Catch: Throwable -> L23
    L17:
        if (r3.hasNext() == false) goto L25;
        Object r23 = r3.next();     // Catch: Throwable -> L23
        Method r4 = (Method) r23;     // Catch: Throwable -> L23
        Class<?>[] r5 = r4.getParameterTypes();     // Catch: Throwable -> L23
        AbstractC0307g.m702d(r5, "getParameterTypes(...)");     // Catch: Throwable -> L23
        if (r5.length != 0) goto L17;
        if (BaseAdapter.class.isAssignableFrom(r4.getReturnType()) == false) goto L17;
    L26:
        Method r24 = (Method) r23;     // Catch: Throwable -> L23
        if (r24 == null) goto L30;
        r24.setAccessible(true);     // Catch: Throwable -> L23
        Object r72 = r24.invoke(r7, null);     // Catch: Throwable -> L23
    L33:
        if ((r72 instanceof C0140f) == true) goto L36;
        r1 = r72;
    L36:
        if (r1 != null) goto L38;
        return;
    L38:
        r22 = r1;
        goto L44
    L30:
        r72 = null;
        goto L33
    L25:
        r23 = null;
    L23:
        th = move-exception;
        r72 = AbstractC0040p.m116u(th);
        goto L33
    L9:
        r22 = null;
    L7:
        th = move-exception;
        r22 = AbstractC0040p.m116u(th);
        goto L12
    }

    /* JADX INFO: renamed from: i */
    public static SparseArray m2143i(Object r10) {
        Field r1 = m2138d(r10.getClass(), new C0813Y(12));
        Object r3 = null;
        if (r1 != null) goto L55;
        SparseArray r12 = null;
    L17:
        if (r12 != null) goto L19;
    L57:
        C0406i r13 = AbstractC0358S.m861K(new C0565o(r10.getClass(), null));     // Catch: Throwable -> L44
    L22:
        if (r13.hasNext() == false) goto L47;
        C0172c r4 = AbstractC0317q.m714c(((Class) r13.next()).getDeclaredFields());     // Catch: Throwable -> L44
    L26:
        if (r4.hasNext() == false) goto L22;
        Field r5 = (Field) r4.next();     // Catch: Throwable -> L44
        if (r5.getType().isPrimitive() == true) goto L26;
        if (AbstractC0307g.m699a(r5.getType(), String.class) == true) goto L26;
        if (SparseArray.class.isAssignableFrom(r5.getType()) == true) goto L26;
        Field[] r6 = r5.getType().getDeclaredFields();     // Catch: Throwable -> L44
        AbstractC0307g.m702d(r6, "getDeclaredFields(...)");     // Catch: Throwable -> L44
        int r7 = r6.length;     // Catch: Throwable -> L44
        int r8 = 0;
    L35:
        if (r8 >= r7) goto L26;
        if (SparseArray.class.isAssignableFrom(r6[r8].getType()) == true) goto L38;
        r8 = r8 + 1;
        goto L35
    L38:
        r5.setAccessible(true);     // Catch: Throwable -> L44
        Object r52 = r5.get(r10);     // Catch: Throwable -> L44
        if (r52 == null) goto L26;
        Object r53 = m2139e(r52);     // Catch: Throwable -> L44
        if (r53 == null) goto L26;
    L50:
        if ((r53 instanceof C0140f) == true) goto L54;
        r3 = r53;
    L54:
        return (SparseArray) r3;
    L47:
        r53 = null;
    L44:
        th = move-exception;
        r53 = AbstractC0040p.m116u(th);
        goto L50
    L19:
        if (r12.size() <= 0) goto L57;
        return r12;
    L55:
        r1.setAccessible(true);     // Catch: Throwable -> L8
        Object r14 = r1.get(r10);     // Catch: Throwable -> L8
        if ((r14 instanceof SparseArray) == false) goto L10;
        Object r15 = (SparseArray) r14;     // Catch: Throwable -> L8
    L13:
        if ((r15 instanceof C0140f) == false) goto L15;
        r15 = null;
    L15:
        r12 = (SparseArray) r15;
        goto L17
    L10:
        r15 = null;
    L8:
        th = move-exception;
        r15 = AbstractC0040p.m116u(th);
        goto L13
    }

    /* JADX INFO: renamed from: j */
    public static Object m2144j(Object r3) {
        Field r02 = m2138d(r3.getClass(), new C0813Y(7));
        if (r02 != null) goto L14;
        return null;
    L14:
        r02.setAccessible(true);     // Catch: Throwable -> L7
        Object r32 = r02.get(r3);     // Catch: Throwable -> L7
    L10:
        if ((r32 instanceof C0140f) == false) goto L13;
        return null;
    L13:
        return r32;
    L7:
        th = move-exception;
        r32 = AbstractC0040p.m116u(th);
        goto L10
    }

    /* JADX INFO: renamed from: k */
    public static int m2145k(Object r12) {
        Class<?> r02 = r12.getClass();
        Field r1 = f2997f;
        if (r1 == null) goto L92;
        if (r1.getDeclaringClass().isAssignableFrom(r02) == false) goto L92;
    L63:
        if (r1 != null) goto L90;
    L68:
        C0401d r03 = new C0401d(new C0402e(AbstractC0407j.m994y0(new C0180k(4, new C0565o(r12.getClass(), null)), new C0813Y(10)), true, new C0813Y(11)));
    L70:
        if (r03.hasNext() == false) goto L86;
        Field r13 = (Field) r03.next();
        r13.setAccessible(true);     // Catch: Throwable -> L78
        if (r13.getInt(r12) != 168566822) goto L75;
        boolean r14 = true;
    L76:
        Object r15 = Boolean.valueOf(r14);     // Catch: Throwable -> L78
    L80:
        Object r5 = Boolean.FALSE;
        if ((r15 instanceof C0140f) == false) goto L84;
        r15 = r5;
    L84:
        if (((Boolean) r15).booleanValue() == false) goto L70;
        return 168566822;
    L75:
        r14 = false;
    L78:
        th = move-exception;
        r15 = AbstractC0040p.m116u(th);
        goto L80
    L86:
        return Integer.MIN_VALUE;
    L90:
        r1.setAccessible(true);     // Catch: Throwable -> L66
        return r1.getInt(r12);
    L66:
        th = move-exception;
        AbstractC0040p.m116u(th);
    L92:
        Constructor<?>[] r52 = r02.getConstructors();     // Catch: Throwable -> L15
        AbstractC0307g.m702d(r52, "getConstructors(...)");     // Catch: Throwable -> L15
        ArrayList r6 = new ArrayList();     // Catch: Throwable -> L15
        int r7 = r52.length;     // Catch: Throwable -> L15
        int r8 = 0;
    L9:
        if (r8 >= r7) goto L18;
        Constructor<?> r9 = r52[r8];     // Catch: Throwable -> L15
        int r10 = r9.getParameterTypes().length;     // Catch: Throwable -> L15
        if (4 > r10) goto L17;
        if (r10 >= 7) goto L17;
        r6.add(r9);     // Catch: Throwable -> L15
    L17:
        r8 = r8 + 1;     // Catch: Throwable -> L15
        goto L9
    L18:
        Iterator r53 = r6.iterator();     // Catch: Throwable -> L15
        if (r53.hasNext() == true) goto L21;
        Object r62 = null;
    L30:
        Constructor r63 = (Constructor) r62;     // Catch: Throwable -> L15
        if (r63 != null) goto L33;
    L32:
        r1 = null;
        goto L63
    L33:
        r63.setAccessible(true);     // Catch: Throwable -> L15
        Class<?>[] r54 = r63.getParameterTypes();     // Catch: Throwable -> L15
        AbstractC0307g.m702d(r54, "getParameterTypes(...)");     // Catch: Throwable -> L15
        Object[] r55 = m2137c(r54);     // Catch: Throwable -> L15
        r55[0] = 1513913873;     // Catch: Throwable -> L15
        Object r56 = r63.newInstance(Arrays.copyOf(r55, r55.length));     // Catch: Throwable -> L15
    L37:
        if ((r56 instanceof C0140f) == false) goto L39;
        r56 = null;
    L39:
        if (r56 == null) goto L32;
        C0401d r04 = new C0401d(new C0402e(AbstractC0407j.m994y0(new C0180k(4, new C0565o(r02, null)), new C0813Y(15)), true, new C0813Y(17)));
    L43:
        if (r04.hasNext() == false) goto L59;
        Object r64 = r04.next();
        Field r72 = (Field) r64;
        r72.setAccessible(true);     // Catch: Throwable -> L51
        if (r72.getInt(r56) != 1513913873) goto L48;
        boolean r73 = true;
    L49:
        Object r74 = Boolean.valueOf(r73);     // Catch: Throwable -> L51
    L53:
        Object r82 = Boolean.FALSE;
        if ((r74 instanceof C0140f) == false) goto L57;
        r74 = r82;
    L57:
        if (((Boolean) r74).booleanValue() == false) goto L43;
    L60:
        r1 = (Field) r64;
        if (r1 == null) goto L63;
        f2997f = r1;
        m2146l("pg id field resolved=" + r1.getDeclaringClass().getSimpleName() + "." + r1.getName());
        goto L63
    L48:
        r73 = false;
    L51:
        th = move-exception;
        r74 = AbstractC0040p.m116u(th);
        goto L53
    L59:
        r64 = null;
        goto L60
    L21:
        r62 = r53.next();     // Catch: Throwable -> L15
        if (r53.hasNext() == false) goto L30;
        int r75 = ((Constructor) r62).getParameterTypes().length;     // Catch: Throwable -> L15
    L25:
        Object r83 = r53.next();     // Catch: Throwable -> L15
        int r92 = ((Constructor) r83).getParameterTypes().length;     // Catch: Throwable -> L15
        if (r75 >= r92) goto L29;
        r62 = r83;
        r75 = r92;
    L29:
        if (r53.hasNext() == true) goto L25;
    L15:
        th = move-exception;
        r56 = AbstractC0040p.m116u(th);
        goto L37
    }

    /* JADX INFO: renamed from: l */
    public static void m2146l(String r2) {
        AbstractC0762d.m1954d("[OKK-SettingsEntry] " + r2);     // Catch: Throwable -> L5
        return;
    }
}
