package p050c0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.emoji2.text.RunnableC0486k;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0139e;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p009E0.AbstractC0188s;
import p009E0.C0172c;
import p026N0.AbstractC0270k;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;
import p042W0.AbstractC0416a;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.q1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0688q1 {

    /* JADX INFO: renamed from: a */
    public static final C0688q1 f2163a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2164b = null;

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f2165c = null;

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f2166d = null;

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f2167e = null;

    /* JADX INFO: renamed from: f */
    public static final ThreadLocal f2168f = null;

    /* JADX INFO: renamed from: g */
    public static final Handler f2169g = null;

    /* JADX INFO: renamed from: h */
    public static final ConcurrentHashMap f2170h = null;

    /* JADX INFO: renamed from: i */
    public static final ConcurrentHashMap.KeySetView f2171i = null;

    /* JADX INFO: renamed from: j */
    public static final ConcurrentHashMap f2172j = null;

    /* JADX INFO: renamed from: k */
    public static final ConcurrentHashMap f2173k = null;

    /* JADX INFO: renamed from: l */
    public static final ConcurrentHashMap f2174l = null;

    /* JADX INFO: renamed from: m */
    public static volatile Constructor f2175m;

    /* JADX INFO: renamed from: n */
    public static volatile Method f2176n;

    /* JADX INFO: renamed from: o */
    public static volatile Object f2177o;

    /* JADX INFO: renamed from: p */
    public static volatile ClassLoader f2178p;

    static {
        f2163a = new C0688q1();
        f2164b = new AtomicBoolean(false);
        f2165c = new AtomicBoolean(false);
        f2166d = new AtomicBoolean(false);
        f2167e = new AtomicBoolean(false);
        f2168f = ThreadLocal.withInitial(new C0681o0(3));
        f2169g = new Handler(Looper.getMainLooper());
        f2170h = new ConcurrentHashMap();
        f2171i = ConcurrentHashMap.newKeySet();
        f2172j = new ConcurrentHashMap();
        f2173k = new ConcurrentHashMap();
        f2174l = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static void m1766a(TextView r11, String r12, String r13) {
        ThreadLocal r1 = f2168f;
        if (AbstractC0307g.m699a(r1.get(), Boolean.TRUE) == false) goto L6;
        return;
    L6:
        if (AbstractC0307g.m699a(r11.getTag(2113929217), r12) == true) goto L8;
        return;
    L8:
        CharSequence r2 = r11.getText();
        if (r2 != null) goto L12;
        return;
    L12:
        if (r2.length() != 0) goto L14;
        return;
    L14:
        String r3 = r2.toString();
        if ((6 & 2) == 0) goto L17;
        int r4 = AbstractC0425j.m1007L0(r3);
    L18:
        AbstractC0307g.m703e(r3, "<this>");
        AbstractC0307g.m703e(" (", "string");
        int r42 = r3.lastIndexOf(" (", r4);
        if (r42 >= 0) goto L21;
    L23:
        boolean r7 = false;
    L24:
        if (r7 == false) goto L26;
        int r8 = r42;
    L27:
        if (r8 > 0) goto L29;
        return;
    L29:
        String r9 = m1767b(r13);
        if (r9.length() != 0) goto L33;
        m1782s("apply skip empty masked=" + r13 + " sender=" + r12);
        return;
    L33:
        String r122 = AbstractC0324d.m723f(" (", r9, ")");
        if (r7 == false) goto L38;
        String r132 = r3.substring(r42);
        AbstractC0307g.m702d(r132, "substring(...)");
        if (r132.equals(r122) == false) goto L38;
        return;
    L38:
        if (r7 == false) goto L40;
    L62:
        C0661h1 r133 = C0661h1.f2048a;     // Catch: Throwable -> L44
        Object r134 = Integer.valueOf(Color.parseColor(C0661h1.m1662d("real_name_tail_color", "#9E9E9E")));     // Catch: Throwable -> L44
    L47:
        if ((r134 instanceof C0140f) == false) goto L49;
        r134 = -6381922;
    L49:
        int r135 = ((Number) r134).intValue();
        SpannableStringBuilder r32 = new SpannableStringBuilder(r2, 0, r8);
        r32.append(r122);
        r32.setSpan(new ForegroundColorSpan(r135), r8, r32.length(), 33);
        r1.set(Boolean.TRUE);
    L53:
        th = move-exception;
        r1.set(Boolean.FALSE);
        throw th;
    L51:
        if (r11.getVisibility() == 0) goto L55;
        r11.setVisibility(0);     // Catch: Throwable -> L53
    L55:
        r11.setText(r32, TextView.BufferType.SPANNABLE);     // Catch: Throwable -> L53
        r1.set(Boolean.FALSE);
        return;
    L44:
        th = move-exception;
        r134 = AbstractC0040p.m116u(th);
        goto L47
    L40:
        if (AbstractC0433r.m1028C0(r3, r122) == false) goto L62;
        return;
    L26:
        r8 = r3.length();
        goto L27
    L21:
        if (AbstractC0433r.m1028C0(r3, ")") == false) goto L23;
        r7 = true;
        goto L24
    L17:
        r4 = 0;
        goto L18
    }

    /* JADX INFO: renamed from: b */
    public static String m1767b(String r4) {
        String r42 = AbstractC0425j.m1017V0(AbstractC0425j.m1016U0(AbstractC0425j.m1017V0(AbstractC0425j.m1016U0(AbstractC0425j.m1022a1(r4).toString(), "("), ")"), "（"), "）");
        StringBuilder r02 = new StringBuilder();
        int r1 = 0;
    L4:
        if (r1 >= r42.length()) goto L9;
        char r2 = r42.charAt(r1);
        if (AbstractC0358S.m860J(r2) == true) goto L8;
        r02.append(r2);
    L8:
        r1 = r1 + 1;
        goto L4
    L9:
        String r43 = r02.toString();
        AbstractC0307g.m702d(r43, "toString(...)");
        if (r43.length() != 0) goto L13;
    L14:
        return "";
    L13:
        if (r43.length() > 16) goto L14;
        return r43;
    }

    /* JADX INFO: renamed from: d */
    public static Method m1768d(Class r9) {
        Class r02 = r9;
    L4:
        if (r02 == null) goto L19;
        if (r02.equals(Object.class) == true) goto L19;
        C0172c r3 = AbstractC0317q.m714c(r02.getDeclaredMethods());
    L9:
        if (r3.hasNext() == false) goto L18;
        Method r5 = (Method) r3.next();
        Class<?>[] r6 = r5.getParameterTypes();
        if (r6.length != 2) goto L9;
        Class<?> r62 = r6[1];
        AbstractC0307g.m702d(r62, "get(...)");
        if (m1772h(r62) == false) goto L9;
        if (AbstractC0040p.m92W(new String[]{"h", "g", "a"}).contains(r5.getName()) == false) goto L9;
        r5.setAccessible(true);
        return r5;
    L18:
        r02 = r02.getSuperclass();
    L19:
        if (r9 == null) goto L34;
        if (r9.equals(Object.class) == true) goto L57;
        C0172c r03 = AbstractC0317q.m714c(r9.getDeclaredMethods());
    L24:
        if (r03.hasNext() == false) goto L33;
        Method r52 = (Method) r03.next();
        if (Modifier.isStatic(r52.getModifiers()) == true) goto L24;
        if (r52.getParameterTypes().length != 1) goto L24;
        if (AbstractC0040p.m92W(new String[]{"g", "a", "doscene", "doScene"}).contains(r52.getName()) == false) goto L24;
        r52.setAccessible(true);
        return r52;
    L33:
        r9 = r9.getSuperclass();
        goto L19
    L57:
        return null;
    L34:
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static void m1769e(Class r14) {
        C0665j r1 = new C0665j(27, false);
        C0172c r2 = AbstractC0317q.m714c(r14.getDeclaredMethods());
        int r4 = 0;
    L4:
        if (r2.hasNext() == false) goto L21;
        Method r5 = (Method) r2.next();
        if (Modifier.isStatic(r5.getModifiers()) == true) goto L4;
        if (Modifier.isAbstract(r5.getModifiers()) == true) goto L4;
        Class<?>[] r10 = r5.getParameterTypes();
        if (r10.length < 4) goto L4;
        Class<?> r8 = r10[0];
        AbstractC0307g.m702d(r8, "get(...)");
        if (m1772h(r8) == false) goto L4;
        Class<?> r82 = r10[1];
        AbstractC0307g.m702d(r82, "get(...)");
        if (m1772h(r82) == false) goto L4;
        Class<?> r7 = r10[2];
        AbstractC0307g.m702d(r7, "get(...)");
        if (m1772h(r7) == false) goto L4;
        if (AbstractC0307g.m699a(r10[3], String.class) == false) goto L4;
        r5.setAccessible(true);
        AbstractC0762d.m1952b(r5, r1);
        r4 = r4 + 1;
        m1782s("hooked scene#" + r5.getName() + " params=" + r10.length);
        goto L4
    L21:
        Class r142 = r14.getSuperclass();
    L22:
        if (r142 == null) goto L53;
        if (r142.equals(Object.class) == true) goto L53;
        C0172c r22 = AbstractC0317q.m714c(r142.getDeclaredMethods());
    L27:
        if (r22.hasNext() == false) goto L52;
        Method r52 = (Method) r22.next();
        if (Modifier.isStatic(r52.getModifiers()) == true) goto L27;
        if (Modifier.isAbstract(r52.getModifiers()) == true) goto L27;
        if (AbstractC0307g.m699a(r52.getName(), "onGYNetEnd") == true) goto L37;
        if (AbstractC0307g.m699a(r52.getName(), "I") == false) goto L27;
    L37:
        Class<?>[] r102 = r52.getParameterTypes();
        if (r102.length < 4) goto L27;
        Class<?> r11 = r102[0];
        AbstractC0307g.m702d(r11, "get(...)");
        if (m1772h(r11) == false) goto L27;
        Class<?> r112 = r102[1];
        AbstractC0307g.m702d(r112, "get(...)");
        if (m1772h(r112) == false) goto L27;
        Class<?> r103 = r102[2];
        AbstractC0307g.m702d(r103, "get(...)");
        if (m1772h(r103) == false) goto L27;
        r52.setAccessible(true);     // Catch: Throwable -> L47
        AbstractC0762d.m1952b(r52, r1);     // Catch: Throwable -> L47
        r4 = r4 + 1;     // Catch: Throwable -> L47
        m1782s("hooked " + r142.getName() + "#" + r52.getName());     // Catch: Throwable -> L47
        Object r104 = C0146l.f339a;     // Catch: Throwable -> L47
    L49:
        Throwable r105 = AbstractC0141g.m465a(r104);
        if (r105 == null) goto L27;
        m1782s("skip hook " + r142.getName() + "#" + r52.getName() + ": " + r105.getMessage());
    L47:
        th = move-exception;
        r104 = AbstractC0040p.m116u(th);
        goto L49
    L52:
        r142 = r142.getSuperclass();
    L53:
        m1782s("scene callback hooks=" + r4);
    }

    /* JADX INFO: renamed from: f */
    public static void m1770f(Activity r9, ClassLoader r10) {
        String r2 = m1778o(r9);     // Catch: Throwable -> L28
        if (r2 != null) goto L6;
        return;
    L6:
        if (AbstractC0425j.m1013R0(r2) == false) goto L9;
        return;
    L9:
        if (AbstractC0433r.m1028C0(r2, "@chatroom") == false) goto L11;
        return;
    L11:
        if (AbstractC0433r.m1028C0(r2, "@im.chatroom") == false) goto L59;
        return;
    L59:
        Object r4 = AbstractC0358S.m887g(r9, "getPreferenceScreen", new Object[0]);     // Catch: Throwable -> L16
    L18:
        Object r6 = null;
        if ((r4 instanceof C0140f) == false) goto L21;
        r4 = null;
    L21:
        if (r4 != null) goto L23;
        return;
    L23:
        String r22 = (String) f2170h.get(r2);     // Catch: Throwable -> L28
        if (r22 == null) goto L30;
        String r1 = "实名: ".concat(r22);     // Catch: Throwable -> L28
        if (r1 == null) goto L30;
    L56:
        Object r23 = AbstractC0358S.m887g(r4, "i", new Object[]{"achat_real_name_tail"});     // Catch: Throwable -> L33
    L36:
        if ((r23 instanceof C0140f) == true) goto L40;
        r6 = r23;
    L40:
        if (r6 != null) goto L54;
        Object r92 = AbstractC0358S.m906r(r10, "com.tencent.mm.ui.base.preference.Preference").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{r9});     // Catch: Throwable -> L28
        AbstractC0358S.m887g(r92, "C", new Object[]{"achat_real_name_tail"});     // Catch: Throwable -> L28
        AbstractC0358S.m887g(r92, "K", new Object[]{"获取实名尾字"});     // Catch: Throwable -> L28
        AbstractC0358S.m887g(r92, "H", new Object[]{r1});     // Catch: Throwable -> L28
        AbstractC0358S.m887g(r4, "d", new Object[]{r92, 1});     // Catch: Throwable -> L28
        Object r93 = AbstractC0358S.m887g(r4, "notifyDataSetChanged", new Object[0]);     // Catch: Throwable -> L28
    L50:
        Throwable r94 = AbstractC0141g.m465a(r93);
        if (r94 == null) goto L65;
        m1782s("inject profile: " + r94.getMessage());
        return;
    L65:
        return;
    L54:
        AbstractC0358S.m887g(r6, "K", new Object[]{"获取实名尾字"});     // Catch: Throwable -> L43
        AbstractC0358S.m887g(r6, "H", new Object[]{r1});     // Catch: Throwable -> L43
        AbstractC0358S.m887g(r4, "notifyDataSetChanged", new Object[0]);     // Catch: Throwable -> L43
    L61:
        return;
    L43:
        th = move-exception;
        AbstractC0040p.m116u(th);     // Catch: Throwable -> L28
        return;
    L33:
        th = move-exception;
        r23 = AbstractC0040p.m116u(th);     // Catch: Throwable -> L28
    L30:
        r1 = "点击获取";
        goto L56
    L16:
        th = move-exception;
        r4 = AbstractC0040p.m116u(th);     // Catch: Throwable -> L28
    L28:
        th = move-exception;
        r93 = AbstractC0040p.m116u(th);
        goto L50
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1771g() {
        C0661h1 r02 = C0661h1.f2048a;     // Catch: Throwable -> L4
        Object r03 = Boolean.valueOf(C0661h1.m1661c("real_name_tail", false));     // Catch: Throwable -> L4
    L6:
        Object r1 = Boolean.FALSE;
        if ((r03 instanceof C0140f) == false) goto L10;
        r03 = r1;
    L10:
        return ((Boolean) r03).booleanValue();
    L4:
        th = move-exception;
        r03 = AbstractC0040p.m116u(th);
        goto L6
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1772h(Class r1) {
        if (r1.equals(Integer.TYPE) == false) goto L5;
    L8:
        return true;
    L5:
        if (r1.equals(Integer.class) == true) goto L8;
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static void m1773i(Context r7, String r8) {
        AtomicBoolean r1 = f2165c;
        if (r1.get() == false) goto L62;
        return;
    L62:
        System.loadLibrary("dexkit");     // Catch: Throwable -> L8
        r1.set(true);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        AbstractC0040p.m116u(th);
        if (r8 != null) goto L13;
        return;
    L13:
        if (Process.is64Bit() == false) goto L17;
        String[] r3 = Build.SUPPORTED_64_BIT_ABIS;
        AbstractC0307g.m702d(r3, "SUPPORTED_64_BIT_ABIS");
        String r32 = (String) AbstractC0179j.m536m0(r3);
        if (r32 != null) goto L20;
        r32 = "arm64-v8a";
    L20:
        File r4 = new File(r7.getCacheDir(), AbstractC0324d.m723f("abc_", r32, "_libdexkit.so"));
        ZipFile r72 = new ZipFile(r8);     // Catch: Throwable -> L27
        ZipEntry r82 = r72.getEntry("lib/" + r32 + "/libdexkit.so");     // Catch: Throwable -> L36
        if (r82 != null) goto L29;
        AbstractC0040p.m108m(r72, null);     // Catch: Throwable -> L27
        return;
    L29:
        InputStream r83 = r72.getInputStream(r82);     // Catch: Throwable -> L36
        FileOutputStream r33 = new FileOutputStream(r4);     // Catch: Throwable -> L38
        AbstractC0307g.m700b(r83);     // Catch: Throwable -> L40
        AbstractC0040p.m115t(r83, r33, 8192);     // Catch: Throwable -> L40
        AbstractC0040p.m108m(r33, null);     // Catch: Throwable -> L38
        AbstractC0040p.m108m(r83, null);     // Catch: Throwable -> L36
        AbstractC0040p.m108m(r72, null);     // Catch: Throwable -> L27
        System.load(r4.getAbsolutePath());     // Catch: Throwable -> L27
        r1.set(true);     // Catch: Throwable -> L27
        return;
    L40:
        th = move-exception;
        throw th;     // Catch: Throwable -> L42
    L42:
        th = move-exception;
        AbstractC0040p.m108m(r33, th);     // Catch: Throwable -> L38
        throw th;     // Catch: Throwable -> L38
    L38:
        th = move-exception;
        throw th;     // Catch: Throwable -> L46
    L46:
        th = move-exception;
        AbstractC0040p.m108m(r83, th);     // Catch: Throwable -> L36
        throw th;     // Catch: Throwable -> L36
    L36:
        th = move-exception;
        throw th;     // Catch: Throwable -> L50
    L50:
        th = move-exception;
        AbstractC0040p.m108m(r72, th);     // Catch: Throwable -> L27
        throw th;     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        AbstractC0040p.m116u(th);
        return;
    L17:
        String[] r34 = Build.SUPPORTED_32_BIT_ABIS;
        AbstractC0307g.m702d(r34, "SUPPORTED_32_BIT_ABIS");
        r32 = (String) AbstractC0179j.m536m0(r34);
        if (r32 != null) goto L20;
        r32 = "armeabi-v7a";
        goto L20
    }

    /* JADX INFO: renamed from: j */
    public static boolean m1774j(String r4) {
        String r42 = AbstractC0425j.m1022a1(r4).toString();
        if (r42.length() != 0) goto L6;
    L7:
        return false;
    L6:
        if (r42.length() > 16) goto L7;
        if (AbstractC0425j.m1005J0(r42, "*", false) == false) goto L11;
    L17:
        return true;
    L11:
        if (AbstractC0425j.m1005J0(r42, "＊", false) == true) goto L17;
        Pattern r02 = Pattern.compile("[\\u4e00-\\u9fff·]{1,4}");
        AbstractC0307g.m702d(r02, "compile(...)");
        if (r02.matcher(r42).matches() == false) goto L16;
        return true;
    L16:
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static String m1775l(Object r7) {
        ArrayList r02 = new ArrayList();
        Class<?> r1 = r7.getClass();
    L3:
        Object r2 = null;
        if (r1 == null) goto L25;
        if (r1.equals(Object.class) == true) goto L25;
        C0172c r3 = AbstractC0317q.m714c(r1.getDeclaredFields());
    L9:
        if (r3.hasNext() == false) goto L24;
        Field r4 = (Field) r3.next();
        if (AbstractC0307g.m699a(r4.getType(), String.class) == false) goto L9;
        r4.setAccessible(true);
        Object r42 = r4.get(r7);
        if ((r42 instanceof String) == false) goto L15;
        String r43 = (String) r42;
    L16:
        if (r43 == null) goto L18;
        String r44 = AbstractC0425j.m1022a1(r43).toString();
    L19:
        if (r44 != null) goto L22;
        r44 = "";
    L22:
        if (m1774j(r44) == false) goto L9;
        r02.add(r44);
        goto L9
    L18:
        r44 = null;
        goto L19
    L15:
        r43 = null;
        goto L16
    L24:
        r1 = r1.getSuperclass();
    L25:
        Iterator r72 = r02.iterator();
    L27:
        if (r72.hasNext() == false) goto L33;
        Object r12 = r72.next();
        String r32 = (String) r12;
        if (AbstractC0425j.m1005J0(r32, "*", false) == true) goto L32;
        if (AbstractC0425j.m1005J0(r32, "＊", false) == false) goto L27;
    L32:
        r2 = r12;
    L33:
        String r22 = (String) r2;
        if (r22 == null) goto L36;
        return r22;
    L36:
        return (String) AbstractC0181l.m544p0(r02);
    }

    /* JADX INFO: renamed from: m */
    public static Object m1776m(Object r4, String r5) {
        Class<?> r1 = r4.getClass();     // Catch: Throwable -> L12
    L4:
        if (r1 == null) goto L14;
        if (r1.equals(Object.class) == true) goto L14;
        Field r2 = r1.getDeclaredField(r5);     // Catch: Throwable -> L9
        r2.setAccessible(true);     // Catch: Throwable -> L9
    L8:
        return r2.get(r4);
    L9:
        th = move-exception;
        AbstractC0040p.m116u(th);     // Catch: Throwable -> L12
        r1 = r1.getSuperclass();     // Catch: Throwable -> L12
    L14:
        C0140f r42 = null;
    L17:
        if ((r42 instanceof C0140f) == false) goto L20;
        return null;
    L20:
        return r42;
    L12:
        th = move-exception;
        r42 = AbstractC0040p.m116u(th);
        goto L17
    }

    /* JADX INFO: renamed from: n */
    public static String m1777n(Object r1, String r2) {
        Object r12 = m1776m(r1, r2);
        if ((r12 instanceof String) == false) goto L5;
        String r13 = (String) r12;
    L6:
        if (r13 == null) goto L13;
        String r14 = AbstractC0425j.m1022a1(r13).toString();
        if (r14 != null) goto L10;
        return null;
    L10:
        if (r14.length() > 0) goto L12;
        return null;
    L12:
        return r14;
    L13:
        return null;
    L5:
        r13 = null;
        goto L6
    }

    /* JADX INFO: renamed from: o */
    public static String m1778o(Activity r7) {
        Intent r72 = r7.getIntent();
        if (r72 != null) goto L5;
        return null;
    L5:
        Iterator r1 = AbstractC0182m.m556h0(new String[]{"Contact_User", "Contact_UserName", "User", "userName", "Chat_User", "Contact_Alias"}).iterator();
    L7:
        if (r1.hasNext() == false) goto L17;
        String r2 = r72.getStringExtra((String) r1.next());
        if (r2 == null) goto L11;
        String r22 = AbstractC0425j.m1022a1(r2).toString();
    L12:
        if (r22 != null) goto L15;
        r22 = "";
    L15:
        if (r22.length() <= 0) goto L7;
        return r22;
    L11:
        r22 = null;
        goto L12
    L17:
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static void m1779p(ClassLoader r12) {
        Class<?> r5 = r12.loadClass("rk0.k1");     // Catch: Throwable -> L12
        Method[] r6 = r5.getDeclaredMethods();     // Catch: Throwable -> L12
        AbstractC0307g.m702d(r6, "getDeclaredMethods(...)");     // Catch: Throwable -> L12
        int r7 = r6.length;     // Catch: Throwable -> L12
        int r8 = 0;
    L4:
        if (r8 >= r7) goto L15;
        Method r9 = r6[r8];     // Catch: Throwable -> L12
        if (Modifier.isStatic(r9.getModifiers()) == false) goto L14;
        if (AbstractC0307g.m699a(r9.getName(), "i") == false) goto L14;
        Class<?>[] r10 = r9.getParameterTypes();     // Catch: Throwable -> L12
        AbstractC0307g.m702d(r10, "getParameterTypes(...)");     // Catch: Throwable -> L12
        if (r10.length != 0) goto L14;
    L16:
        if (r9 == null) goto L18;
        r9.setAccessible(true);     // Catch: Throwable -> L12
        r9.invoke(null, null);     // Catch: Throwable -> L12
    L18:
        Method[] r52 = r5.getDeclaredMethods();     // Catch: Throwable -> L12
        AbstractC0307g.m702d(r52, "getDeclaredMethods(...)");     // Catch: Throwable -> L12
        int r02 = r52.length;     // Catch: Throwable -> L12
        int r62 = 0;
    L19:
        if (r62 >= r02) goto L28;
        Method r72 = r52[r62];     // Catch: Throwable -> L12
        if (Modifier.isStatic(r72.getModifiers()) == false) goto L27;
        if (AbstractC0307g.m699a(r72.getName(), "n") == false) goto L27;
        Class<?>[] r82 = r72.getParameterTypes();     // Catch: Throwable -> L12
        AbstractC0307g.m702d(r82, "getParameterTypes(...)");     // Catch: Throwable -> L12
        if (r82.length != 0) goto L27;
    L29:
        if (r72 == null) goto L49;
        r72.setAccessible(true);     // Catch: Throwable -> L12
        Object r03 = r72.invoke(null, null);     // Catch: Throwable -> L12
        if (r03 == null) goto L49;
        Field[] r53 = r03.getClass().getDeclaredFields();     // Catch: Throwable -> L12
        AbstractC0307g.m702d(r53, "getDeclaredFields(...)");     // Catch: Throwable -> L12
        int r63 = r53.length;     // Catch: Throwable -> L12
        int r73 = 0;
    L33:
        if (r73 >= r63) goto L41;
        Field r83 = r53[r73];     // Catch: Throwable -> L12
        r83.setAccessible(true);     // Catch: Throwable -> L12
        Object r84 = r83.get(r03);     // Catch: Throwable -> L12
        if (r84 != null) goto L38;
    L36:
        r84 = null;
    L39:
        if (r84 != null) goto L42;
        r73 = r73 + 1;     // Catch: Throwable -> L12
    L42:
        if (r84 == null) goto L49;
        Method r04 = m1768d(r84.getClass());     // Catch: Throwable -> L12
        if (r04 == null) goto L49;
        f2177o = r84;     // Catch: Throwable -> L12
        f2176n = r04;     // Catch: Throwable -> L12
        m1782s("net queue=" + r84.getClass().getName() + "#" + r04.getName());     // Catch: Throwable -> L12
        return;
    L38:
        if (m1768d(r84.getClass()) == null) goto L36;
    L41:
        r84 = null;
    L49:
        Object r05 = C0146l.f339a;     // Catch: Throwable -> L12
    L52:
        Throwable r06 = AbstractC0141g.m465a(r05);
        if (r06 == null) goto L55;
        m1782s("rk0.k1 queue: " + r06.getMessage());
    L55:
        Iterator r07 = AbstractC0182m.m556h0(new String[]{"com.tencent.mm.modelbase.s1", "com.tencent.mm.modelbase.n1", "com.tencent.mm.kernel.h", "com.tencent.mm.model.bh"}).iterator();
    L57:
        if (r07.hasNext() == false) goto L95;
        String r54 = (String) r07.next();
        Object r64 = r12.loadClass(r54);     // Catch: Throwable -> L61
    L64:
        if ((r64 instanceof C0140f) == false) goto L66;
        r64 = null;
    L66:
        Class r65 = (Class) r64;
        if (r65 == null) goto L57;
        C0172c r66 = AbstractC0317q.m714c(r65.getDeclaredMethods());
    L71:
        if (r66.hasNext() == false) goto L57;
        Method r74 = (Method) r66.next();
        if (Modifier.isStatic(r74.getModifiers()) == false) goto L71;
        Class<?>[] r85 = r74.getParameterTypes();
        AbstractC0307g.m702d(r85, "getParameterTypes(...)");
        if (r85.length != 0) goto L77;
        boolean r86 = true;
    L79:
        if ((!r86) == true) goto L71;
        r74.setAccessible(true);     // Catch: Throwable -> L83
        Object r75 = r74.invoke(null, null);     // Catch: Throwable -> L83
    L86:
        if ((r75 instanceof C0140f) == false) goto L88;
        r75 = null;
    L88:
        if (r75 == null) goto L71;
        Method r87 = m1768d(r75.getClass());
        if (r87 == null) goto L71;
        f2177o = r75;
        f2176n = r87;
        m1782s("net queue via " + r54);
        return;
    L83:
        th = move-exception;
        r75 = AbstractC0040p.m116u(th);
        goto L86
    L77:
        r86 = false;
    L61:
        th = move-exception;
        r64 = AbstractC0040p.m116u(th);
        goto L64
    L95:
        m1782s("net queue unresolved");
        return;
    L27:
        r62 = r62 + 1;     // Catch: Throwable -> L12
        goto L19
    L28:
        r72 = null;
    L14:
        r8 = r8 + 1;     // Catch: Throwable -> L12
        goto L4
    L15:
        r9 = null;
    L12:
        th = move-exception;
        r05 = AbstractC0040p.m116u(th);
        goto L52
    }

    /* JADX INFO: renamed from: q */
    public static void m1780q() {
        Set r1 = f2170h.entrySet();
        AbstractC0307g.m702d(r1, "<get-entries>(...)");
        String r02 = AbstractC0181l.m546r0(r1, ",", "{", "}", new C0570A(23), 24);
        Iterator r12 = AbstractC0040p.m82F("/storage/emulated/0/Android/media/com.tencent.mm/OKK/real_names.json").iterator();
    L4:
        if (r12.hasNext() == false) goto L14;
        File r3 = new File((String) r12.next());     // Catch: Throwable -> L9
        File r2 = r3.getParentFile();     // Catch: Throwable -> L9
        if (r2 == null) goto L11;
        r2.mkdirs();     // Catch: Throwable -> L9
    L11:
        AbstractC0270k.m693j0(r3, r02, AbstractC0416a.f921a);     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L4
    }

    /* JADX INFO: renamed from: r */
    public static boolean m1781r(Class r8) {
        C0172c r02 = AbstractC0317q.m714c(r8.getDeclaredConstructors());
    L4:
        if (r02.hasNext() == false) goto L13;
        Constructor r1 = (Constructor) r02.next();
        Class<?>[] r5 = r1.getParameterTypes();
        if (r5.length != 2) goto L4;
        if (AbstractC0307g.m699a(r5[0], String.class) == false) goto L4;
        if (AbstractC0307g.m699a(r5[1], String.class) == false) goto L4;
        r1.setAccessible(true);
        f2175m = r1;
        return true;
    L13:
        C0172c r82 = AbstractC0317q.m714c(r8.getDeclaredConstructors());
    L15:
        if (r82.hasNext() == false) goto L22;
        Constructor r03 = (Constructor) r82.next();
        Class<?>[] r12 = r03.getParameterTypes();
        if (r12.length != 1) goto L15;
        if (AbstractC0307g.m699a(r12[0], String.class) == false) goto L15;
        r03.setAccessible(true);
        f2175m = r03;
        return true;
    L22:
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static void m1782s(String r2) {
        AbstractC0762d.m1954d("[OKK-RealNameTail] " + r2);     // Catch: Throwable -> L5
        return;
    }

    /* JADX INFO: renamed from: c */
    public final void m1783c(String r9, String r10, InterfaceC0286l r11) {
        if (AbstractC0425j.m1013R0(r9) == false) goto L5;
        return;
    L5:
        if (AbstractC0433r.m1028C0(r9, "@chatroom") == true) goto L63;
        String r02 = (String) f2170h.get(r9);
        if (r02 == null) goto L13;
        if (r11 == null) goto L57;
        r11.invoke(r02);
        return;
    L57:
        return;
    L13:
        if (f2171i.add(r9) == true) goto L15;
        return;
    L15:
        C0641b r03 = new C0641b(r9, r11, 2);
        Constructor r1 = f2175m;
        if (r1 != null) goto L56;
        r03.invoke(new C0676m1("scene not resolved"));
        return;
    L56:
        int r2 = r1.getParameterTypes().length;     // Catch: Throwable -> L22
        if (r2 == 1) goto L28;
        if (r2 == 2) goto L24;
        r03.invoke(new C0676m1("bad ctor"));     // Catch: Throwable -> L22
        return;
    L24:
        if (r10 != null) goto L26;
        String r22 = "";
    L27:
        Object r12 = r1.newInstance(new Object[]{r9, r22});     // Catch: Throwable -> L22
    L29:
        ConcurrentHashMap r23 = f2173k;     // Catch: Throwable -> L22
        r23.put(r12, new C0139e(r9, r10));     // Catch: Throwable -> L22
        ConcurrentHashMap r5 = f2174l;     // Catch: Throwable -> L22
        r5.put(r12, r03);     // Catch: Throwable -> L22
        Object r6 = f2177o;     // Catch: Throwable -> L22
        Method r7 = f2176n;     // Catch: Throwable -> L22
        if (r6 == null) goto L32;
        if (r7 == null) goto L32;
    L36:
        if (r6 == null) goto L46;
        if (r7 == null) goto L46;
        r7.setAccessible(true);     // Catch: Throwable -> L22
        int r24 = r7.getParameterTypes().length;     // Catch: Throwable -> L22
        if (r24 == 1) goto L44;
        if (r24 == 2) goto L43;
        r03.invoke(new C0676m1("bad doScene"));     // Catch: Throwable -> L22
        return;
    L43:
        Object r25 = r7.invoke(r6, new Object[]{r12, 0});     // Catch: Throwable -> L22
    L45:
        m1782s("sent beforetransfer " + r9 + " room=" + r10 + " doSceneRet=" + r25 + " queue=" + r6.getClass().getSimpleName() + "#" + r7.getName());     // Catch: Throwable -> L22
        Object r102 = Boolean.valueOf(f2169g.postDelayed(new RunnableC0573B(r12, r9, this, r03), 15000));     // Catch: Throwable -> L22
    L49:
        Throwable r103 = AbstractC0141g.m465a(r102);
        if (r103 == null) goto L62;
        f2171i.remove(r9);
        String r104 = r103.getMessage();
        if (r104 != null) goto L54;
        r104 = "send err";
    L54:
        r03.invoke(new C0676m1(r104));
        return;
    L62:
        return;
    L44:
        r25 = r7.invoke(r6, new Object[]{r12});     // Catch: Throwable -> L22
    L46:
        r23.remove(r12);     // Catch: Throwable -> L22
        r5.remove(r12);     // Catch: Throwable -> L22
        r03.invoke(new C0676m1("no net queue"));     // Catch: Throwable -> L22
        return;
    L32:
        ClassLoader r62 = f2178p;     // Catch: Throwable -> L22
        if (r62 == null) goto L35;
        m1779p(r62);     // Catch: Throwable -> L22
    L35:
        r6 = f2177o;     // Catch: Throwable -> L22
        r7 = f2176n;     // Catch: Throwable -> L22
        goto L36
    L26:
        r22 = r10;
        goto L27
    L28:
        r12 = r1.newInstance(new Object[]{r9});     // Catch: Throwable -> L22
    L22:
        th = move-exception;
        r102 = AbstractC0040p.m116u(th);
        goto L49
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.lang.reflect.Method[]] */
    /* JADX WARN: Type inference failed for: r13v0, types: [D0.f] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX INFO: renamed from: k */
    public final void m1784k(Object r17, View r18, Object r19) {
        int r3 = 3;
        if (m1771g() == true) goto L5;
        return;
    L5:
        C0621R0 r02 = C0621R0.f1913a;
        C0613O0 r5 = C0621R0.m1524f(r19);
        AtomicBoolean r6 = f2167e;
        if (r5 != null) goto L12;
        if (r6.compareAndSet(false, true) == false) goto L124;
        m1782s("skip: identity null msg=".concat(r19.getClass().getName()));
        return;
    L124:
        return;
    L12:
        if (r5.f1893c == true) goto L106;
        return;
    L106:
        Class<?> r9 = r19.getClass();     // Catch: Throwable -> L32
    L16:
        if (r9 == null) goto L34;
        if (r9.equals(Object.class) == true) goto L34;
        Field r03 = r9.getDeclaredField("field_isSend");     // Catch: Throwable -> L24
        r03.setAccessible(true);     // Catch: Throwable -> L24
        Object r04 = r03.get(r19);     // Catch: Throwable -> L24
        if ((r04 instanceof Number) == false) goto L27;
        if (((Number) r04).intValue() != 1) goto L71;
    L23:
        boolean r05 = true;
    L72:
        String r92 = r5.f1891a;
        String r10 = r5.f1892b;
        if (r05 == true) goto L75;
        TextView r06 = C0621R0.f1913a.m1525d(r18, r17);
        if (r06 != null) goto L82;
        m1782s("nickname missing room=" + r92 + " sender=" + r10 + " holder=" + r17.getClass().getName());
        m1783c(r10, r92, null);
        return;
    L82:
        r06.setTag(2113929217, r10);
        Object r62 = f2172j.computeIfAbsent(r10, new C0612O(new C0570A(24), 7));
        AbstractC0307g.m702d(r62, "computeIfAbsent(...)");
        CopyOnWriteArrayList r63 = (CopyOnWriteArrayList) r62;
        if (r63.isEmpty() == true) goto L91;
        Iterator r8 = r63.iterator();
    L87:
        if (r8.hasNext() == false) goto L91;
        if (((WeakReference) r8.next()).get() != r06) goto L87;
    L93:
        if (r63.size() <= 32) goto L95;
        AbstractC0188s.m562n0(r63, new C0570A(22));
    L95:
        boolean r4 = f2166d.compareAndSet(false, true);
        ConcurrentHashMap r64 = f2170h;
        if (r4 == false) goto L98;
        m1782s("bound room=" + r92 + " sender=" + r10 + " nick=" + r06.getText() + " vis=" + r06.getVisibility() + " cache=" + r64.get(r10));
    L98:
        String r2 = (String) r64.get(r10);
        if (r2 == null) goto L101;
        m1766a(r06, r10, r2);
        r06.post(new RunnableC0486k(r06, r5, r2, r3));
        return;
    L101:
        m1783c(r10, r92, new C0591H(r3, r5));
        return;
    L91:
        r63.add(new WeakReference(r06));
        goto L93
    L75:
        if (r6.compareAndSet(false, true) == false) goto L125;
        m1782s("skip self room=" + r92 + " sender=" + r10);
        return;
    L125:
        return;
    L71:
        r05 = false;
        goto L72
    L27:
        if ((r04 instanceof Boolean) == false) goto L71;
        r05 = ((Boolean) r04).booleanValue();     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        AbstractC0040p.m116u(th);     // Catch: Throwable -> L32
        r9 = r9.getSuperclass();     // Catch: Throwable -> L32
    L34:
        Iterator r93 = AbstractC0182m.m556h0(new String[]{"getIsSend", "isSend"}).iterator();
    L36:
        if (r93.hasNext() == false) goto L71;
        String r07 = (String) r93.next();
        ?? r102 = r19.getClass().getMethods();     // Catch: Throwable -> L45
        AbstractC0307g.m702d(r102, "getMethods(...)");     // Catch: Throwable -> L45
        int r11 = r102.length;     // Catch: Throwable -> L45
        int r12 = 0;
    L39:
        if (r12 >= r11) goto L48;
        ?? r13 = r102[r12];     // Catch: Throwable -> L45
        if (AbstractC0307g.m699a(r13.getName(), r07) == false) goto L47;
        Class<?>[] r14 = r13.getParameterTypes();     // Catch: Throwable -> L45
        AbstractC0307g.m702d(r14, "getParameterTypes(...)");     // Catch: Throwable -> L45
        if (r14.length != 0) goto L47;
    L50:
        boolean r08 = r13 instanceof C0140f;
        ?? r132 = r13;
        if (r08 == false) goto L53;
        r132 = 0;
    L53:
        Method r133 = (Method) r132;
        if (r133 == null) goto L36;
        r133.setAccessible(true);     // Catch: Throwable -> L58
        Object r09 = r133.invoke(r19, null);     // Catch: Throwable -> L58
    L61:
        if ((r09 instanceof C0140f) == false) goto L64;
        r09 = null;
    L64:
        if ((r09 instanceof Number) == true) goto L66;
        if ((r09 instanceof Boolean) == false) goto L36;
        r05 = ((Boolean) r09).booleanValue();
        goto L72
    L66:
        if (((Number) r09).intValue() != 1) goto L71;
    L58:
        th = move-exception;
        r09 = AbstractC0040p.m116u(th);
    L47:
        r12 = r12 + 1;
        goto L39
    L48:
        r13 = 0;
    L45:
        th = move-exception;
        r13 = AbstractC0040p.m116u(th);
    L32:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L34
    }
}
