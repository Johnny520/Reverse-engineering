package com.abc.internal.probe;

import android.content.Context;
import de.robv.android.xposed.AbstractC0762d;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: b0.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0567q {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f1676a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicReference f1677b = null;

    /* JADX INFO: renamed from: c */
    public static final AtomicReference f1678c = null;

    static {
        f1676a = new AtomicReference("");
        f1677b = new AtomicReference("");
        f1678c = new AtomicReference(null);
    }

    /* JADX INFO: renamed from: a */
    public static Class m1378a(Context r4, ClassLoader r5, String r6) {
        AtomicReference r02 = f1678c;
        Class r1 = (Class) r02.get();
        if (r1 == null) goto L5;
        return r1;
    L5:
        AbstractC0307g.m703e(r5, "cl");
        Object r12 = Class.forName("iy0.z1", false, r5);     // Catch: Throwable -> L8
    L11:
        if ((r12 instanceof C0140f) == false) goto L13;
        r12 = null;
    L13:
        Class r13 = (Class) r12;
        if (r13 == null) goto L17;
        r02.set(r13);
        m1382e("config class fallback iy0.z1");
        return r13;
    L17:
        if (r4 == null) goto L24;
        Class r2 = DexKitManager.m1362a(r4, r5, r6, new String[]{"MicroMsg.ConfigStorageLogic", "get userinfo fail"});
        if (r2 != null) goto L21;
        r2 = DexKitManager.m1362a(r4, r5, r6, new String[]{"MicroMsg.ConfigStorageLogic"});
    L21:
        if (r2 == null) goto L24;
        r02.set(r2);
        m1382e("config class DexKit ".concat(r2.getName()));
        return r2;
    L24:
        return null;
    L8:
        th = move-exception;
        r12 = AbstractC0040p.m116u(th);
        goto L11
    }

    /* JADX INFO: renamed from: b */
    public static String m1379b(Method r3) {
        Object r32 = r3.invoke(null, null);     // Catch: Throwable -> L9
        if (r32 == null) goto L11;
        String r33 = r32.toString();     // Catch: Throwable -> L9
        if (r33 == null) goto L11;
        Object r34 = AbstractC0425j.m1022a1(r33).toString();     // Catch: Throwable -> L9
    L14:
        if ((r34 instanceof C0140f) == false) goto L16;
        r34 = null;
    L16:
        String r35 = (String) r34;
        if (r35 != null) goto L20;
        r35 = "";
    L20:
        if (r35.length() != 0) goto L23;
    L24:
        return null;
    L23:
        if (r35.equals("null") == true) goto L24;
        if (AbstractC0433r.m1033H0(r35, "wxid_", false) == false) goto L28;
        return r35;
    L28:
        int r1 = r35.length();
        if (5 <= r1) goto L31;
    L37:
        return null;
    L31:
        if (r1 >= 65) goto L37;
        if (AbstractC0425j.m1006K0(r35, ' ') == true) goto L37;
        if (AbstractC0425j.m1006K0(r35, '\n') == true) goto L37;
        return r35;
    L11:
        r34 = null;
    L9:
        th = move-exception;
        r34 = AbstractC0040p.m116u(th);
        goto L14
    }

    /* JADX INFO: renamed from: c */
    public static String m1380c(Context r5, ClassLoader r6, String r7) {
        Class r52 = m1378a(r5, r6, r7);
        if (r52 != null) goto L5;
        return "";
    L5:
        Method[] r53 = r52.getDeclaredMethods();
        AbstractC0307g.m702d(r53, "getDeclaredMethods(...)");
        ArrayList r72 = new ArrayList();
        int r02 = r53.length;
        int r1 = 0;
    L6:
        if (r1 >= r02) goto L15;
        Method r2 = r53[r1];
        if (Modifier.isStatic(r2.getModifiers()) == false) goto L14;
        Class<?>[] r3 = r2.getParameterTypes();
        AbstractC0307g.m702d(r3, "getParameterTypes(...)");
        if (r3.length != 0) goto L14;
        if (AbstractC0307g.m699a(r2.getReturnType(), String.class) == false) goto L14;
        r72.add(r2);
    L14:
        r1 = r1 + 1;
        goto L6
    L15:
        Iterator r54 = r72.iterator();
    L17:
        if (r54.hasNext() == false) goto L19;
        ((Method) r54.next()).setAccessible(true);
        goto L17
    L19:
        Iterator r55 = AbstractC0182m.m556h0(new String[]{"r", "s", "t", "u", "getUsernameFromUserInfo"}).iterator();
    L21:
        if (r55.hasNext() == false) goto L36;
        String r03 = (String) r55.next();
        Iterator r12 = r72.iterator();
    L24:
        if (r12.hasNext() == false) goto L28;
        Object r22 = r12.next();
        if (AbstractC0307g.m699a(((Method) r22).getName(), r03) == false) goto L24;
    L29:
        Method r23 = (Method) r22;
        if (r23 == null) goto L21;
        String r04 = m1379b(r23);
        if (r04 == null) goto L21;
        return r04;
    L28:
        r22 = null;
        goto L29
    L36:
        Iterator r56 = r72.iterator();
    L38:
        if (r56.hasNext() == false) goto L43;
        Method r73 = (Method) r56.next();
        AbstractC0307g.m700b(r73);
        String r74 = m1379b(r73);
        if (r74 == null) goto L38;
        return r74;
    L43:
        return "";
    }

    /* JADX INFO: renamed from: d */
    public static String m1381d(Context r15, ClassLoader r16, String r17) {
        AbstractC0307g.m703e(r16, "classLoader");
        AtomicReference r2 = f1677b;
        Object r02 = r2.get();
        AbstractC0307g.m700b((String) r02);
        Object r5 = null;
        if ((!AbstractC0425j.m1013R0(r3)) == true) goto L6;
        r02 = null;
    L6:
        String r03 = (String) r02;
        if (r03 == null) goto L9;
        return r03;
    L9:
        Class r04 = m1378a(r15, r16, r17);
        if (r04 != null) goto L12;
        return "";
    L12:
        Method[] r05 = r04.getDeclaredMethods();
        AbstractC0307g.m702d(r05, "getDeclaredMethods(...)");
        ArrayList r6 = new ArrayList();
        int r7 = r05.length;
        int r9 = 0;
    L13:
        if (r9 >= r7) goto L22;
        Method r10 = r05[r9];
        if (Modifier.isStatic(r10.getModifiers()) == false) goto L21;
        Class<?>[] r11 = r10.getParameterTypes();
        AbstractC0307g.m702d(r11, "getParameterTypes(...)");
        if (r11.length != 0) goto L21;
        if (AbstractC0307g.m699a(r10.getReturnType(), String.class) == false) goto L21;
        r6.add(r10);
    L21:
        r9 = r9 + 1;
        goto L13
    L22:
        Iterator r06 = r6.iterator();
    L24:
        if (r06.hasNext() == false) goto L26;
        ((Method) r06.next()).setAccessible(true);
        goto L24
    L26:
        String r1 = m1380c(r15, r16, r17);
        ArrayList r72 = new ArrayList();
        Iterator r62 = r6.iterator();
    L28:
        if (r62.hasNext() == false) goto L57;
        Object r07 = ((Method) r62.next()).invoke(null, null);     // Catch: Throwable -> L36
        if (r07 == null) goto L38;
        String r08 = r07.toString();     // Catch: Throwable -> L36
        if (r08 == null) goto L38;
        Object r09 = AbstractC0425j.m1022a1(r08).toString();     // Catch: Throwable -> L36
    L41:
        if ((r09 instanceof C0140f) == false) goto L43;
        r09 = null;
    L43:
        String r010 = (String) r09;
        if (r010 != null) goto L46;
    L54:
        r010 = null;
    L55:
        if (r010 == null) goto L28;
        r72.add(r010);
        goto L28
    L46:
        if ((!AbstractC0425j.m1013R0(r010)) == false) goto L54;
        if (r010.equals("null") == true) goto L54;
        if (r010.equals(r1) == true) goto L54;
        if (r010.equals("") == true) goto L54;
    L38:
        r09 = null;
    L36:
        th = move-exception;
        r09 = AbstractC0040p.m116u(th);
        goto L41
    L57:
        List r92 = AbstractC0181l.m543o0(r72);
        if (r92.isEmpty() == false) goto L61;
        m1382e("nickname candidates empty");
        return "";
    L61:
        ArrayList r011 = new ArrayList();
        Iterator r12 = r92.iterator();
    L63:
        if (r12.hasNext() == false) goto L129;
        Object r63 = r12.next();
        String r102 = (String) r63;
        if (AbstractC0433r.m1033H0(r102, "wxid_", false) == true) goto L63;
        int r112 = 0;
    L69:
        if (r112 >= r102.length()) goto L74;
        if (r102.charAt(r112) > 127) goto L128;
        r112 = r112 + 1;
    L128:
        r011.add(r63);
        goto L63
    L74:
        int r73 = 0;
    L76:
        if (r73 >= r102.length()) goto L84;
        char r113 = r102.charAt(r73);
        if (Character.isLetterOrDigit(r113) == true) goto L83;
        if (r113 == '_') goto L83;
        if (r113 != '-') goto L128;
    L83:
        r73 = r73 + 1;
        goto L76
    L84:
        int r74 = 0;
    L86:
        if (r74 >= r102.length()) goto L91;
        if (Character.isUpperCase(r102.charAt(r74)) == true) goto L89;
        r74 = r74 + 1;
        goto L86
    L89:
        boolean r75 = true;
    L92:
        int r114 = 0;
    L94:
        if (r114 >= r102.length()) goto L99;
        if (Character.isLowerCase(r102.charAt(r114)) == true) goto L97;
        r114 = r114 + 1;
        goto L94
    L97:
        boolean r115 = true;
    L100:
        int r122 = 0;
    L102:
        if (r122 >= r102.length()) goto L107;
        if (Character.isDigit(r102.charAt(r122)) == true) goto L105;
        r122 = r122 + 1;
        goto L102
    L105:
        boolean r123 = true;
    L108:
        if (r75 == false) goto L111;
        if (r115 == true) goto L128;
    L111:
        if (r123 == false) goto L115;
        if (r75 == true) goto L115;
        if (r115 == false) goto L63;
    L115:
        if (r123 == false) goto L119;
        if (r75 == false) goto L119;
        if (r115 == false) goto L63;
    L119:
        if (r123 == false) goto L123;
        if (r115 == false) goto L123;
        if (r75 == false) goto L63;
    L123:
        if (r115 == true) goto L128;
        if (r75 == false) goto L128;
        if (r102.length() < 6) goto L128;
    L107:
        r123 = false;
        goto L108
    L99:
        r115 = false;
        goto L100
    L91:
        r75 = false;
        goto L92
    L129:
        m1382e("nickname candidates=".concat(AbstractC0181l.m546r0(r92, "|", null, null, new C0555e(24), 30)));
        Iterator r13 = r011.iterator();
    L131:
        if (r13.hasNext() == false) goto L139;
        Object r4 = r13.next();
        String r64 = (String) r4;
        int r93 = 0;
    L134:
        if (r93 >= r64.length()) goto L131;
        if (r64.charAt(r93) > 127) goto L140;
        r93 = r93 + 1;
    L140:
        String r42 = (String) r4;
        if (r42 != null) goto L161;
        Iterator r14 = r011.iterator();
    L144:
        if (r14.hasNext() == false) goto L158;
        Object r43 = r14.next();
        String r65 = (String) r43;
        int r76 = 0;
    L147:
        if (r76 >= r65.length()) goto L144;
        if (Character.isUpperCase(r65.charAt(r76)) == true) goto L150;
        r76 = r76 + 1;
        goto L147
    L150:
        int r77 = 0;
    L152:
        if (r77 >= r65.length()) goto L144;
        if (Character.isLowerCase(r65.charAt(r77)) == true) goto L155;
        r77 = r77 + 1;
        goto L152
    L155:
        r5 = r43;
    L158:
        r42 = (String) r5;
        if (r42 != null) goto L161;
        r42 = (String) AbstractC0181l.m544p0(r011);
    L161:
        if (r42 == null) goto L164;
        r2.set(r42);
        m1382e("resolved nickname=".concat(r42));
        return r42;
    L164:
        return "";
    L139:
        r4 = null;
        goto L140
    }

    /* JADX INFO: renamed from: e */
    public static void m1382e(String r2) {
        AbstractC0762d.m1954d("[OKK-SelfUser] " + r2);     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }
}
