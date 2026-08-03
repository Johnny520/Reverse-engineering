package com.abc.core.features;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.luckypray.dexkit.C1031R;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p031Q0.AbstractC0307g;
import p031Q0.C0316p;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;
import p040V0.C0406i;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;
import p089x0.C1121e;

/* JADX INFO: renamed from: c0.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class MessageEditHook {

    /* JADX INFO: renamed from: a */
    public static final MessageEditHook f2116a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2117b = null;

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f2118c = null;

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f2119d = null;

    /* JADX INFO: renamed from: e */
    public static final AtomicInteger f2120e = null;

    /* JADX INFO: renamed from: f */
    public static final ConcurrentHashMap f2121f = null;

    /* JADX INFO: renamed from: g */
    public static final ConcurrentHashMap f2122g = null;

    /* JADX INFO: renamed from: h */
    public static final ConcurrentHashMap f2123h = null;

    /* JADX INFO: renamed from: i */
    public static final ConcurrentHashMap f2124i = null;

    /* JADX INFO: renamed from: j */
    public static final CopyOnWriteArrayList f2125j = null;

    /* JADX INFO: renamed from: k */
    public static final ConcurrentHashMap f2126k = null;

    /* JADX INFO: renamed from: l */
    public static final Set f2127l = null;

    /* JADX INFO: renamed from: m */
    public static volatile boolean f2128m;

    /* JADX INFO: renamed from: n */
    public static volatile boolean f2129n;

    /* JADX INFO: renamed from: o */
    public static volatile C0666j0 f2130o;

    /* JADX INFO: renamed from: p */
    public static volatile WeakReference f2131p;

    /* JADX INFO: renamed from: q */
    public static volatile String f2132q;

    /* JADX INFO: renamed from: r */
    public static volatile long f2133r;

    /* JADX INFO: renamed from: s */
    public static volatile boolean f2134s;

    /* JADX INFO: renamed from: t */
    public static volatile boolean f2135t;

    static {
        f2116a = new MessageEditHook();
        f2117b = new AtomicBoolean(false);
        f2118c = new AtomicBoolean(false);
        f2119d = new AtomicBoolean(false);
        f2120e = new AtomicInteger(0);
        f2121f = new ConcurrentHashMap();
        f2122g = new ConcurrentHashMap();
        f2123h = new ConcurrentHashMap();
        f2124i = new ConcurrentHashMap();
        f2125j = new CopyOnWriteArrayList();
        f2126k = new ConcurrentHashMap();
        f2127l = Collections.newSetFromMap(new IdentityHashMap());
    }

    /* JADX INFO: renamed from: A */
    public static void m1709A(final TextView r11) {
        final C0666j0 r2 = f2130o;
        if (m1724o(r2) == false) goto L26;
        AbstractC0307g.m700b(r2);
        if (m1725p() == true) goto L8;
        return;
    L8:
        if (f2135t == true) goto L31;
        final Context r7 = r11.getContext();
        if (r7 == null) goto L32;
        final String r3 = r2.f2068b;
        String r02 = (String) f2122g.get(Long.valueOf(r2.f2067a));
        if (r02 != null) goto L16;
        r02 = r3;
    L16:
        final EditText r1 = new EditText(r7);
        r1.setText(r02);
        r1.setInputType(131073);
        Editable r03 = r1.getText();
        if (r03 == null) goto L19;
        int r04 = r03.length();
    L20:
        r1.setSelection(r04);
        r1.setMinLines(3);
        r1.setMaxLines(8);
        r1.setPadding(m1719h(r7, 14), m1719h(r7, 10), m1719h(r7, 14), m1719h(r7, 10));
        AlertDialog r112 = new AlertDialog.Builder(r7).setTitle("修改消息").setView(r1).setPositiveButton("确定", new DialogInterfaceOnClickListenerC0654f0(r1, r2, r3, r11, r7)).setNegativeButton("取消", null).create();     // Catch: Throwable -> L23
        r112.setOnDismissListener(new DialogInterfaceOnDismissListenerC0657g0());     // Catch: Throwable -> L23
        f2135t = true;     // Catch: Throwable -> L23
        r112.show();     // Catch: Throwable -> L23
        return;
    L23:
        th = move-exception;
        f2135t = false;
        Toast.makeText(r7, "无法弹出编辑框", 0).show();
        m1711C("dialog fail: " + th.getMessage());
        return;
    L19:
        r04 = 0;
        goto L20
    L32:
        return;
    L31:
        return;
    L26:
        Toast.makeText(r11.getContext(), "当前消息不可修改", 0).show();
        m1711C("edit blocked: no active message ref");
    }

    /* JADX INFO: renamed from: B */
    public static String m1710B(Class r3) {
        if (r3.isPrimitive() == false) goto L33;
        if (r3.equals(Integer.TYPE) == false) goto L8;
        return "I";
    L8:
        if (r3.equals(Void.TYPE) == false) goto L11;
    L39:
        return "V";
    L11:
        if (r3.equals(Boolean.TYPE) == false) goto L14;
        return "Z";
    L14:
        if (r3.equals(Character.TYPE) == false) goto L17;
        return "C";
    L17:
        if (r3.equals(Byte.TYPE) == false) goto L20;
        return "B";
    L20:
        if (r3.equals(Short.TYPE) == false) goto L23;
        return "S";
    L23:
        if (r3.equals(Float.TYPE) == false) goto L26;
        return "F";
    L26:
        if (r3.equals(Long.TYPE) == false) goto L29;
        return "J";
    L29:
        if (r3.equals(Double.TYPE) == false) goto L39;
        return "D";
    L33:
        if (r3.isArray() == false) goto L37;
        return AbstractC0433r.m1032G0(r3.getName(), '.', '/');
    L37:
        return AbstractC0324d.m723f("L", AbstractC0433r.m1032G0(r3.getName(), '.', '/'), ";");
    }

    /* JADX INFO: renamed from: C */
    public static void m1711C(String r2) {
        AbstractC0762d.m1954d("[OKK-EditMsg] " + r2);     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }

    /* JADX INFO: renamed from: a */
    public static final TextView m1712a(MessageEditHook r12, View r13) {
        r12.getClass();
        if ((r13 instanceof TextView) == false) goto L7;
        TextView r122 = (TextView) r13;
        if (m1726q(r122) == false) goto L7;
        return r122;
    L7:
        int r3 = 0;
        View r4 = r13;
        int r2 = Integer.MIN_VALUE;
        TextView r1 = null;
    L9:
        if (r3 >= 8) goto L75;
        if (r4 == null) goto L12;
        Object r5 = r4.getParent();
    L14:
        if ((r5 instanceof View) == false) goto L16;
        View r52 = (View) r5;
    L17:
        if (r52 == null) goto L74;
        if ((r52 instanceof ViewGroup) == false) goto L73;
        ArrayList r42 = new ArrayList();
        m1717f(r52, r42);
        Iterator r43 = r42.iterator();
    L23:
        if (r43.hasNext() == false) goto L71;
        TextView r6 = (TextView) r43.next();
        if (m1726q(r6) == false) goto L23;
        CharSequence r7 = r6.getText();
        if (r7 == null) goto L31;
        String r72 = r7.toString();
        if (r72 == null) goto L31;
        String r73 = AbstractC0425j.m1022a1(r72).toString();
    L32:
        if (r73 != null) goto L34;
        r73 = "";
    L34:
        float r8 = r6.getTextSize() / r6.getResources().getDisplayMetrics().scaledDensity;
        int r9 = r73.length();
        if (r9 <= 120) goto L37;
        r9 = 120;
    L37:
        if (r6 != r13) goto L40;
        r9 = r9 + 90;
    L40:
        if (r8 < 15.0f) goto L42;
        int r92 = r9 + 45;
    L44:
        if (r73.length() > 2) goto L49;
        if (r8 >= 16.0f) goto L49;
        r92 = r92 - 30;
    L49:
        if (r6.getWidth() > 0) goto L51;
    L56:
        int r82 = 0;
    L58:
        if (r82 >= r73.length()) goto L68;
        char r10 = r73.charAt(r82);
        if (Character.isLetterOrDigit(r10) == true) goto L67;
        if (19968 > r10) goto L66;
        if (r10 < 40960) goto L67;
    L66:
        r82 = r82 + 1;
    L67:
        r92 = r92 + 15;
    L68:
        if (r92 <= r2) goto L23;
        r1 = r6;
        r2 = r92;
        goto L23
    L51:
        if (r6.getHeight() <= 0) goto L56;
        int r102 = (r6.getHeight() * r6.getWidth()) / 1200;
        if (r102 <= 80) goto L55;
        r102 = 80;
    L55:
        r92 = r92 + r102;
        goto L56
    L42:
        r92 = r9 - 35;
    L31:
        r73 = null;
        goto L32
    L71:
        if (r2 >= 60) goto L75;
    L73:
        r4 = r52;
    L74:
        r3 = r3 + 1;
        goto L9
    L16:
        r52 = null;
        goto L17
    L12:
        r5 = null;
    L75:
        return r1;
    }

    /* JADX INFO: renamed from: b */
    public static final void m1713b(MessageEditHook r10, Menu r11) {
        r10.getClass();
        final C0666j0 r1 = f2130o;
        Object r2 = null;
        if (r1 == null) goto L8;
        WeakReference r3 = r1.f2072f;
        if (r3 == null) goto L8;
        final TextView r32 = (TextView) r3.get();
        if (r32 == null) goto L8;
    L15:
        if (m1723n(r32) == true) goto L17;
        return;
    L17:
        if (m1724o(r1) == true) goto L19;
        return;
    L19:
        if (f2134s == true) goto L93;
        f2134s = true;
        MenuItem r7 = r11.findItem(1212368196);     // Catch: Throwable -> L26
        if (r7 != null) goto L28;
        MenuItem r5 = r11.add(0, 1212368196, 0, "修改");     // Catch: Throwable -> L26
    L29:
        r5.setTitle("修改");     // Catch: Throwable -> L26
        Object r8 = r32.getContext();     // Catch: Throwable -> L32
    L35:
        if ((r8 instanceof C0140f) == false) goto L37;
        r8 = null;
    L37:
        Context r82 = (Context) r8;     // Catch: Throwable -> L26
        if (r82 == null) goto L80;
    L52:
        Integer r112 = m1720i(r82);     // Catch: Throwable -> L26
        if (r112 == null) goto L88;
        int r113 = r112.intValue();     // Catch: Throwable -> L26
        Object r22 = r5.setIcon(r113);     // Catch: Throwable -> L57
    L60:
        if ((true ^ (r22 instanceof C0140f)) == false) goto L88;
        MenuItem r23 = (MenuItem) r22;     // Catch: Throwable -> L26
        m1711C("edit menu icon=native:" + r113);     // Catch: Throwable -> L26
    L57:
        th = move-exception;
        r22 = AbstractC0040p.m116u(th);     // Catch: Throwable -> L26
    L88:
        r5.setShowAsAction(0);     // Catch: Throwable -> L64
    L66:
        r5.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC0660h0(r32, r1));     // Catch: Throwable -> L26
        if (r7 != null) goto L69;
        String r114 = "edit menu added";
    L70:
        m1711C(r114);     // Catch: Throwable -> L26
    L71:
        f2134s = false;
        return;
    L69:
        r114 = "edit menu rebound";
        goto L70
    L64:
        th = move-exception;
        AbstractC0040p.m116u(th);     // Catch: Throwable -> L26
        goto L66
    L80:
        Field r83 = r11.getClass().getDeclaredField("mContext");     // Catch: Throwable -> L43
        r83.setAccessible(true);     // Catch: Throwable -> L43
        Object r115 = r83.get(r11);     // Catch: Throwable -> L43
        if ((r115 instanceof Context) == false) goto L45;
        Object r116 = (Context) r115;     // Catch: Throwable -> L43
    L48:
        if ((r116 instanceof C0140f) == true) goto L51;
        r2 = r116;
    L51:
        r82 = (Context) r2;     // Catch: Throwable -> L26
        goto L52
    L45:
        r116 = null;
    L43:
        th = move-exception;
        r116 = AbstractC0040p.m116u(th);     // Catch: Throwable -> L26
    L32:
        th = move-exception;
        r8 = AbstractC0040p.m116u(th);     // Catch: Throwable -> L26
        goto L35
    L28:
        r5 = r7;
    L26:
        th = move-exception;
        m1711C("edit menu add fail: " + th.getMessage());     // Catch: Throwable -> L74
    L74:
        th = move-exception;
        f2134s = false;
        throw th;
    L93:
        return;
    L8:
        WeakReference r33 = f2131p;
        if (r33 == null) goto L11;
        r32 = (TextView) r33.get();
    L12:
        if (r32 != null) goto L15;
        return;
    L11:
        r32 = null;
        goto L12
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m1714c(View r7) {
        int r1 = 0;
        Object r72 = r7;
    L4:
        if (r1 >= 16) goto L29;
        boolean r2 = r72 instanceof View;
        ViewParent r3 = null;
        if (r2 == false) goto L8;
        View r4 = (View) r72;
    L9:
        if (r4 == null) goto L22;
        String r42 = r4.getClass().getName();
        if (AbstractC0425j.m1005J0(r42, "ChatFooter", false) == true) goto L30;
        if (AbstractC0425j.m1005J0(r42, "chatting", true) == true) goto L23;
        if (r2 == false) goto L18;
        View r73 = (View) r72;
    L19:
        if (r73 == null) goto L21;
        r3 = r73.getParent();
    L21:
        r72 = r3;
        goto L22
    L18:
        r73 = null;
        goto L19
    L23:
        return true;
    L30:
        return false;
    L22:
        r1 = r1 + 1;
        r72 = r72;
        goto L4
    L8:
        r4 = null;
        goto L9
    L29:
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static int m1715d(C0666j0 r5, TextView r6, String r7, String r8) {
        LinkedHashSet r02 = new LinkedHashSet();
        r02.add(r6);
        TextView r1 = (TextView) r5.f2072f.get();
        if (r1 == null) goto L5;
        r02.add(r1);
    L5:
        View r12 = (View) r5.f2071e.get();
        if (r12 == null) goto L29;
        ArrayList r2 = new ArrayList();
        m1717f(r12, r2);
        Iterator r13 = r2.iterator();
    L9:
        if (r13.hasNext() == false) goto L29;
        TextView r22 = (TextView) r13.next();
        CharSequence r3 = r22.getText();
        if (r3 == null) goto L13;
        String r32 = r3.toString();
    L14:
        if (r32 != null) goto L16;
        r32 = "";
    L16:
        if (r22 == r6) goto L24;
        if (r22 == r5.f2072f.get()) goto L24;
        if (r32.equals(r7) == true) goto L24;
        if (AbstractC0307g.m699a(f2121f.get(r32), r8) == false) goto L9;
    L24:
        if (m1726q(r22) == true) goto L28;
        if (r22 == r6) goto L28;
        if (r22 != r5.f2072f.get()) goto L9;
    L28:
        r02.add(r22);
        goto L9
    L13:
        r32 = null;
    L29:
        Iterator r62 = r02.iterator();
    L31:
        if (r62.hasNext() == false) goto L46;
        TextView r72 = (TextView) r62.next();
        f2129n = true;
        r72.setText(r8);     // Catch: Throwable -> L35
        Object r23 = C0146l.f339a;     // Catch: Throwable -> L35
    L37:
        if (AbstractC0141g.m465a(r23) != null) goto L51;
    L42:
        r72.invalidate();     // Catch: Throwable -> L40
        r72.requestLayout();     // Catch: Throwable -> L40
        f2129n = false;
        goto L31
    L51:
        r72.setText(r8);     // Catch: Throwable -> L40
        goto L42
    L35:
        th = move-exception;
        r23 = AbstractC0040p.m116u(th);     // Catch: Throwable -> L40
    L40:
        th = move-exception;
        f2129n = false;
        throw th;
    L46:
        View r52 = (View) r5.f2071e.get();
        if (r52 == null) goto L50;
        r52.invalidate();
        r52.requestLayout();
    L50:
        return r02.size();
    }

    /* JADX INFO: renamed from: e */
    public static Class m1716e(Class r1) {
        if (r1.equals(Integer.TYPE) == false) goto L6;
        return Integer.class;
    L6:
        if (r1.equals(Long.TYPE) == false) goto L9;
        return Long.class;
    L9:
        if (r1.equals(Short.TYPE) == false) goto L12;
        return Short.class;
    L12:
        if (r1.equals(Byte.TYPE) == false) goto L15;
        return Byte.class;
    L15:
        if (r1.equals(Float.TYPE) == false) goto L18;
        return Float.class;
    L18:
        if (r1.equals(Double.TYPE) == false) goto L26;
        return Double.class;
    L26:
        return r1;
    }

    /* JADX INFO: renamed from: f */
    public static void m1717f(View r4, ArrayList r5) {
        if ((r4 instanceof TextView) == false) goto L6;
        r5.add(r4);
    L6:
        if ((r4 instanceof ViewGroup) == false) goto L10;
        ViewGroup r42 = (ViewGroup) r4;
        int r02 = r42.getChildCount();
        int r1 = 0;
    L8:
        if (r1 >= r02) goto L12;
        View r2 = r42.getChildAt(r1);
        AbstractC0307g.m702d(r2, "getChildAt(...)");
        m1717f(r2, r5);
        r1 = r1 + 1;
        goto L8
    L12:
        return;
    }

    /* JADX INFO: renamed from: g */
    public static Method m1718g(ClassLoader r13, String r14) {
        int r02 = AbstractC0425j.m1011P0(r14, "->", 0, false, 6);
        int r2 = AbstractC0425j.m1010O0(r14, '(', r02, false, 4);
        if (r02 <= 1) goto L26;
        if (r2 <= r02) goto L26;
        String r4 = r14.substring(1, r02 - 1);
        AbstractC0307g.m702d(r4, "substring(...)");
        String r42 = AbstractC0433r.m1032G0(r4, '/', '.');
        String r03 = r14.substring(r02 + 2, r2);
        AbstractC0307g.m702d(r03, "substring(...)");
        String r22 = r14.substring(r2);
        AbstractC0307g.m702d(r22, "substring(...)");
        Class<?> r132 = r13.loadClass(r42);
    L6:
        if (r132 == null) goto L24;
        Method[] r43 = r132.getDeclaredMethods();
        AbstractC0307g.m702d(r43, "getDeclaredMethods(...)");
        int r5 = r43.length;
        int r6 = 0;
    L8:
        if (r6 >= r5) goto L18;
        Method r7 = r43[r6];
        if (AbstractC0307g.m699a(r7.getName(), r03) == false) goto L17;
        StringBuilder r8 = new StringBuilder("(");
        Class<?>[] r9 = r7.getParameterTypes();
        AbstractC0307g.m702d(r9, "getParameterTypes(...)");
        int r10 = r9.length;
        int r11 = 0;
    L12:
        if (r11 >= r10) goto L14;
        Class<?> r12 = r9[r11];
        AbstractC0307g.m700b(r12);
        r8.append(m1710B(r12));
        r11 = r11 + 1;
        goto L12
    L14:
        r8.append(')');
        Class<?> r92 = r7.getReturnType();
        AbstractC0307g.m702d(r92, "getReturnType(...)");
        r8.append(m1710B(r92));
        String r82 = r8.toString();
        AbstractC0307g.m702d(r82, "toString(...)");
        if (r82.equals(r22) == false) goto L17;
    L19:
        if (r7 != null) goto L20;
        r132 = r132.getSuperclass();
        goto L6
    L20:
        r7.setAccessible(true);
        return r7;
    L17:
        r6 = r6 + 1;
        goto L8
    L18:
        r7 = null;
        goto L19
    L24:
        throw new IllegalStateException("method not found: ".concat(r14).toString());
    L26:
        throw new IllegalArgumentException(r14.toString());
    }

    /* JADX INFO: renamed from: h */
    public static int m1719h(Context r02, int r1) {
        return (int) ((r1 * r02.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: i */
    public static Integer m1720i(Context r5) {
        if (r5 != null) goto L5;
        return null;
    L5:
        Resources r1 = r5.getResources();
        String r52 = r5.getPackageName();
        Iterator r2 = AbstractC0182m.m556h0(new String[]{"raw", "drawable"}).iterator();
    L7:
        if (r2.hasNext() == false) goto L15;
        String r3 = (String) r2.next();
        AbstractC0307g.m703e(r3, "type");
        Integer r32 = Integer.valueOf(r1.getIdentifier("icons_filled_edit_photo_pencil", r3, r52));
        if (r32.intValue() == 0) goto L7;
        return r32;
    L15:
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static Object m1721j(Object r6, int r7, Set r8) {
        if (r6 != null) goto L5;
    L62:
        return null;
    L5:
        if (r7 > 5) goto L62;
        if (r8.add(r6) == false) goto L62;
        Object r1 = m1729t(r6);
        if (r1 == null) goto L13;
        return r1;
    L13:
        if ((r6 instanceof View) == false) goto L17;
        Object r12 = m1729t(((View) r6).getTag());
        if (r12 == null) goto L17;
        return r12;
    L17:
        int r3 = 0;
        if ((r6 instanceof Object[]) == false) goto L27;
        Object[] r62 = (Object[]) r6;
        int r13 = r62.length;
    L20:
        if (r3 >= r13) goto L25;
        Object r4 = m1721j(r62[r3], r7 + 1, r8);
        if (r4 != null) goto L23;
        r3 = r3 + 1;
        goto L20
    L23:
        return r4;
    L25:
        return null;
    L27:
        if ((r6 instanceof Iterable) == false) goto L35;
        Iterator r63 = ((Iterable) r6).iterator();
    L30:
        if (r63.hasNext() == false) goto L34;
        Object r14 = m1721j(r63.next(), r7 + 1, r8);
        if (r14 == null) goto L30;
        return r14;
    L34:
        return null;
    L35:
        String r15 = r6.getClass().getName();
        if (AbstractC0433r.m1033H0(r15, "java.", false) == true) goto L62;
        if (AbstractC0433r.m1033H0(r15, "android.", false) == true) goto L62;
        if (AbstractC0433r.m1033H0(r15, "kotlin.", false) == true) goto L62;
        C0406i r16 = AbstractC0358S.m861K(new C0669k0(r6.getClass(), null));
    L44:
        if (r16.hasNext() == false) goto L62;
        Field r32 = (Field) r16.next();
        if (r32.getType().isPrimitive() == true) goto L44;
        if (r32.getType().isArray() == true) goto L44;
        if (AbstractC0307g.m699a(r32.getType(), String.class) == true) goto L44;
        r32.setAccessible(true);     // Catch: Throwable -> L54
        Object r33 = r32.get(r6);     // Catch: Throwable -> L54
    L57:
        if ((r33 instanceof C0140f) == false) goto L59;
        r33 = null;
    L59:
        Object r34 = m1721j(r33, r7 + 1, r8);
        if (r34 == null) goto L44;
        return r34;
    L54:
        th = move-exception;
        r33 = AbstractC0040p.m116u(th);
        goto L57
    }

    /* JADX INFO: renamed from: m */
    public static int m1722m(Object r11, String r12, String r13, String[] r14) {
        ContentValues r02 = new ContentValues();
        r02.put("content", r12);
        Method[] r122 = r11.getClass().getMethods();
        AbstractC0307g.m702d(r122, "getMethods(...)");
        ArrayList r1 = new ArrayList();
        int r2 = r122.length;
        int r4 = 0;
    L4:
        if (r4 >= r2) goto L15;
        Method r7 = r122[r4];
        if (AbstractC0040p.m92W(new String[]{"update", "updateWithOnConflict"}).contains(r7.getName()) == false) goto L14;
        if (r7.getParameterTypes().length < 4) goto L14;
        if (AbstractC0307g.m699a(r7.getParameterTypes()[0], String.class) == false) goto L14;
        if (ContentValues.class.isAssignableFrom(r7.getParameterTypes()[1]) == false) goto L14;
        r1.add(r7);
    L14:
        r4 = r4 + 1;
        goto L4
    L15:
        Iterator r123 = AbstractC0181l.m548t0(r1, new C0692s(4)).iterator();
    L17:
        if (r123.hasNext() == false) goto L48;
        Method r15 = (Method) r123.next();
        Number r22 = null;
        r15.setAccessible(true);     // Catch: Throwable -> L23
        Class<?>[] r42 = r15.getParameterTypes();     // Catch: Throwable -> L23
        if (r42.length != 4) goto L26;
        Object r43 = r15.invoke(r11, new Object[]{"message", r02, r13, r14});     // Catch: Throwable -> L23
    L34:
        Throwable r72 = AbstractC0141g.m465a(r43);
        if (r72 == null) goto L38;
        m1711C("db update fail " + r11.getClass().getName() + "." + r15.getName() + ": " + r72.getMessage());
    L38:
        if ((r43 instanceof C0140f) == false) goto L41;
        r43 = null;
    L41:
        if ((r43 instanceof Number) == false) goto L43;
        r22 = (Number) r43;
    L43:
        if (r22 == null) goto L45;
        int r16 = r22.intValue();
    L46:
        if (r16 <= 0) goto L17;
        return r16;
    L45:
        r16 = 0;
        goto L46
    L26:
        if (r42.length != 5) goto L28;
        r43 = r15.invoke(r11, new Object[]{"message", r02, r13, r14, 0});     // Catch: Throwable -> L23
        goto L34
    L28:
        int r44 = r42.length - 4;     // Catch: Throwable -> L23
        Object[] r73 = new Object[r44];     // Catch: Throwable -> L23
        int r10 = 0;
    L29:
        if (r10 >= r44) goto L31;
        r73[r10] = null;     // Catch: Throwable -> L23
        r10 = r10 + 1;     // Catch: Throwable -> L23
        goto L29
    L31:
        C0316p r45 = new C0316p(5);     // Catch: Throwable -> L23
        ArrayList r9 = r45.f597a;     // Catch: Throwable -> L23
        r45.m709a("message");     // Catch: Throwable -> L23
        r45.m709a(r02);     // Catch: Throwable -> L23
        r45.m709a(r13);     // Catch: Throwable -> L23
        r45.m709a(r14);     // Catch: Throwable -> L23
        r45.m710b(r73);     // Catch: Throwable -> L23
        r43 = r15.invoke(r11, r9.toArray(new Object[r9.size()]));     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        r43 = AbstractC0040p.m116u(th);
        goto L34
    L48:
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m1723n(TextView r4) {
        WeakReference r02 = f2131p;
        if (r02 == null) goto L5;
        TextView r03 = (TextView) r02.get();
    L6:
        if (r03 == r4) goto L8;
    L10:
        return false;
    L8:
        if ((System.currentTimeMillis() - f2133r) >= 8000) goto L10;
        return true;
    L5:
        r03 = null;
        goto L6
    }

    /* JADX INFO: renamed from: o */
    public static boolean m1724o(C0666j0 r4) {
        if (r4 != null) goto L4;
    L8:
        return false;
    L4:
        if (f2130o != r4) goto L8;
        if ((System.currentTimeMillis() - f2133r) >= 8000) goto L8;
        return true;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m1725p() {
        ConfigStore r02 = ConfigStore.f2048a;     // Catch: Throwable -> L4
        Object r03 = Boolean.valueOf(ConfigStore.m1661c("edit_message", false));     // Catch: Throwable -> L4
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

    /* JADX INFO: renamed from: q */
    public static boolean m1726q(TextView r3) {
        if (AbstractC0307g.m699a(r3.getTag(C1031R.id.abc_tag_custom_time), Boolean.TRUE) == false) goto L6;
        return false;
    L6:
        if (r3.getVisibility() == 0) goto L8;
    L33:
        return false;
    L8:
        if (r3.getAlpha() <= 0.0f) goto L33;
        CharSequence r32 = r3.getText();
        if (r32 == null) goto L15;
        String r33 = r32.toString();
        if (r33 == null) goto L15;
        String r34 = AbstractC0425j.m1022a1(r33).toString();
    L16:
        if (r34 != null) goto L19;
        r34 = "";
    L19:
        if (AbstractC0425j.m1013R0(r34) == true) goto L33;
        if (r34.length() > 4000) goto L33;
        if (r34.equals("修改") == true) goto L33;
        if (AbstractC0433r.m1033H0(r34, "✎", false) == true) goto L33;
        if (m1728s(r34) == false) goto L31;
        return false;
    L31:
        return true;
    L15:
        r34 = null;
        goto L16
    }

    /* JADX INFO: renamed from: r */
    public static void m1727r(Context r7, String r8) {
        AtomicBoolean r1 = f2119d;
        if (r1.get() == false) goto L55;
        return;
    L55:
        System.loadLibrary("dexkit");     // Catch: Throwable -> L7
        Object r2 = C0146l.f339a;     // Catch: Throwable -> L7
    L10:
        if ((!(r2 instanceof C0140f)) == false) goto L13;
        C0146l r22 = (C0146l) r2;
        r1.set(true);
        return;
    L13:
        if (r8 == null) goto L53;
        if (Process.is64Bit() == false) goto L19;
        String[] r23 = Build.SUPPORTED_64_BIT_ABIS;
        AbstractC0307g.m702d(r23, "SUPPORTED_64_BIT_ABIS");
        String r24 = (String) AbstractC0179j.m536m0(r23);
        if (r24 != null) goto L22;
        r24 = "arm64-v8a";
    L22:
        File r3 = new File(r7.getCacheDir(), AbstractC0324d.m723f("abc_", r24, "_libdexkit.so"));
        ZipFile r72 = new ZipFile(r8);
        ZipEntry r82 = r72.getEntry("lib/" + r24 + "/libdexkit.so");     // Catch: Throwable -> L33
        if (r82 == null) goto L47;
        InputStream r83 = r72.getInputStream(r82);     // Catch: Throwable -> L33
        FileOutputStream r02 = new FileOutputStream(r3);     // Catch: Throwable -> L35
        AbstractC0307g.m700b(r83);     // Catch: Throwable -> L37
        AbstractC0040p.m115t(r83, r02, 8192);     // Catch: Throwable -> L37
    L29:
        AbstractC0040p.m108m(r02, null);     // Catch: Throwable -> L35
        AbstractC0040p.m108m(r83, null);     // Catch: Throwable -> L33
        AbstractC0040p.m108m(r72, null);
        System.load(r3.getAbsolutePath());
        r1.set(true);
        return;
    L37:
        th = move-exception;
        throw th;     // Catch: Throwable -> L39
    L39:
        th = move-exception;
        AbstractC0040p.m108m(r02, th);     // Catch: Throwable -> L35
        throw th;     // Catch: Throwable -> L35
    L35:
        th = move-exception;
        throw th;     // Catch: Throwable -> L43
    L43:
        th = move-exception;
        AbstractC0040p.m108m(r83, th);     // Catch: Throwable -> L33
        throw th;     // Catch: Throwable -> L33
    L47:
        throw new IllegalStateException(("lib/" + r24 + "/libdexkit.so not found").toString());     // Catch: Throwable -> L33
    L33:
        th = move-exception;
        throw th;     // Catch: Throwable -> L49
    L49:
        th = move-exception;
        AbstractC0040p.m108m(r72, th);
        throw th;
    L19:
        String[] r25 = Build.SUPPORTED_32_BIT_ABIS;
        AbstractC0307g.m702d(r25, "SUPPORTED_32_BIT_ABIS");
        r24 = (String) AbstractC0179j.m536m0(r25);
        if (r24 != null) goto L22;
        r24 = "armeabi-v7a";
        goto L22
    L53:
        throw new IllegalStateException("module path unavailable for libdexkit.so".toString());
    L7:
        th = move-exception;
        r2 = AbstractC0040p.m116u(th);
        goto L10
    }

    /* JADX INFO: renamed from: s */
    public static boolean m1728s(String r6) {
        String r62 = AbstractC0425j.m1022a1(r6).toString();
        Pattern r02 = Pattern.compile("\\d{1,2}:\\d{2}(:\\d{2})?");
        AbstractC0307g.m702d(r02, "compile(...)");
        AbstractC0307g.m703e(r62, "input");
        if (r02.matcher(r62).matches() == false) goto L5;
        return true;
    L5:
        Pattern r03 = Pattern.compile("\\d{1,2}月\\d{1,2}日\\s+\\d{1,2}:\\d{2}");
        AbstractC0307g.m702d(r03, "compile(...)");
        if (r03.matcher(r62).matches() == false) goto L8;
        return true;
    L8:
        Pattern r04 = Pattern.compile("\\d{1,2}[-/]\\d{1,2}\\s+周.\\s+.*");
        AbstractC0307g.m702d(r04, "compile(...)");
        if (r04.matcher(r62).matches() == false) goto L12;
        return true;
    L12:
        if (AbstractC0425j.m1005J0(r62, "分钟前", false) == false) goto L14;
    L19:
        int r05 = 0;
    L21:
        if (r05 >= r62.length()) goto L28;
        if (Character.isDigit(r62.charAt(r05)) == true) goto L25;
        r05 = r05 + 1;
        goto L21
    L25:
        if (r62.length() > 40) goto L28;
        return true;
    L28:
        Pattern r06 = Pattern.compile(".*\\b(KB|MB|GB)\\b.*", C1121e.m2635b(2));
        AbstractC0307g.m702d(r06, "compile(...)");
        if (r06.matcher(r62).matches() == false) goto L32;
        return true;
    L32:
        if (AbstractC0040p.m92W(new String[]{"未下载", "转文字", "微信网页版", "个人名片"}).contains(r62) == false) goto L34;
        return true;
    L34:
        return false;
    L14:
        if (AbstractC0425j.m1005J0(r62, "小时前", false) == true) goto L19;
        if (AbstractC0425j.m1005J0(r62, "昨天", false) == true) goto L19;
        if (AbstractC0425j.m1005J0(r62, "前天", false) == false) goto L28;
        goto L19
    }

    /* JADX INFO: renamed from: t */
    public static Object m1729t(Object r8) {
        if (r8 != null) goto L6;
        return null;
    L6:
        if (AbstractC0433r.m1033H0(r8.getClass().getName(), "com.tencent.mm.storage.", false) == true) goto L8;
    L10:
        Method r1 = (Method) f2123h.computeIfAbsent(r8.getClass(), new C0612O(new C0570A(8), 4));
        if (r1 != null) goto L39;
        Object r12 = null;
    L18:
        if ((r12 instanceof C0140f) == false) goto L20;
        r12 = null;
    L20:
        if (r12 != null) goto L22;
    L24:
        Field r13 = (Field) f2124i.computeIfAbsent(r8.getClass(), new C0612O(new C0570A(6), 2));
        if (r13 != null) goto L41;
        Object r82 = null;
    L32:
        if ((r82 instanceof C0140f) == false) goto L34;
        r82 = null;
    L34:
        if (r82 != null) goto L36;
        return null;
    L36:
        if (m1732w(r82) > 0) goto L38;
        return null;
    L38:
        return r82;
    L41:
        r82 = r13.get(r8);     // Catch: Throwable -> L28
    L28:
        th = move-exception;
        r82 = AbstractC0040p.m116u(th);
        goto L32
    L22:
        if (m1732w(r12) <= 0) goto L24;
        return r12;
    L39:
        r12 = r1.invoke(r8, null);     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        r12 = AbstractC0040p.m116u(th);
        goto L18
    L8:
        if (m1732w(r8) <= 0) goto L10;
        return r8;
    }

    /* JADX INFO: renamed from: u */
    public static C0666j0 m1730u(View r14, TextView r15) {
        Object r02 = m1729t(r14.getTag());
        if (r02 != null) goto L6;
        Set r03 = Collections.newSetFromMap(new IdentityHashMap());
        AbstractC0307g.m702d(r03, "newSetFromMap(...)");
        r02 = m1721j(r14, 0, r03);
    L6:
        if (r02 == null) goto L8;
        long r7 = m1732w(r02);
    L10:
        if (r02 != null) goto L12;
    L71:
        return null;
    L12:
        if (r7 <= 0) goto L71;
        Number r2 = m1733x(r02, new String[]{"getType", "field_type", "type"});
        if (r2 == null) goto L17;
        Integer r22 = Integer.valueOf(r2.intValue());
    L18:
        String r3 = m1731v(r02);
        CharSequence r5 = "";
        if (r3 != null) goto L22;
        r3 = "";
    L22:
        if (r22 == null) goto L27;
        if (r22.intValue() != 1) goto L71;
    L27:
        if (AbstractC0425j.m1013R0(r3) == true) goto L71;
        if (r3.length() > 4000) goto L71;
        int r23 = r3.length();
        int r9 = 0;
    L32:
        if (r9 >= r23) goto L38;
        if (AbstractC0358S.m860J(r3.charAt(r9)) == false) goto L35;
        r9 = r9 + 1;
        goto L32
    L35:
        r5 = r3.subSequence(r9, r3.length());
    L38:
        if (AbstractC0433r.m1033H0(r5.toString(), "<", false) == true) goto L71;
        if (m1728s(r3) == true) goto L71;
        String r24 = m1731v(r02);
        if (r24 == null) goto L71;
        if ((!AbstractC0425j.m1013R0(r24)) == false) goto L48;
        String r10 = r24;
    L49:
        if (r10 == null) goto L71;
        Integer r25 = m1735z(r10);
        if (r25 == null) goto L62;
        int r26 = r25.intValue();
        int r32 = r26 - 3;
        if (AbstractC0433r.m1034I0(r10, r32) == true) goto L57;
        r32 = r26 - 2;
    L57:
        String r33 = r10.substring(0, r32);
        AbstractC0307g.m702d(r33, "substring(...)");
        if (AbstractC0433r.m1033H0(r33, "wxid_", false) == true) goto L61;
        Pattern r1 = Pattern.compile("[a-zA-Z][\\w@.\\-]{4,80}");
        AbstractC0307g.m702d(r1, "compile(...)");
        if (r1.matcher(r33).matches() == false) goto L62;
    L61:
        String r12 = r10.substring(r26);
        AbstractC0307g.m702d(r12, "substring(...)");
    L64:
        if ((!AbstractC0425j.m1013R0(r12)) == false) goto L66;
        String r92 = r12;
    L67:
        if (r92 != null) goto L70;
        return null;
    L70:
        return new C0666j0(r7, r92, r10, new WeakReference(r02), new WeakReference(r14), new WeakReference(r15));
    L66:
        r92 = null;
    L62:
        r12 = r10;
        goto L64
    L48:
        r10 = null;
        goto L49
    L17:
        r22 = null;
        goto L18
    L8:
        r7 = 0;
        goto L10
    }

    /* JADX INFO: renamed from: v */
    public static String m1731v(Object r10) {
        String[] r02 = {"getContent", "field_content", "content"};
        int r1 = 0;
    L3:
        String r3 = null;
        if (r1 >= 3) goto L92;
        String r2 = r02[r1];
        C0406i r4 = AbstractC0358S.m861K(new C0672l0(r10.getClass(), null));
    L7:
        if (r4.hasNext() == false) goto L15;
        Object r5 = r4.next();
        Method r7 = (Method) r5;
        if (AbstractC0307g.m699a(r7.getName(), r2) == false) goto L7;
        Class<?>[] r8 = r7.getParameterTypes();
        AbstractC0307g.m702d(r8, "getParameterTypes(...)");
        if (r8.length != 0) goto L7;
        if (AbstractC0307g.m699a(r7.getReturnType(), String.class) == false) goto L7;
    L16:
        Method r52 = (Method) r5;
        if (r52 != null) goto L68;
    L37:
        C0406i r53 = AbstractC0358S.m861K(new C0669k0(r10.getClass(), null));
    L39:
        if (r53.hasNext() == false) goto L45;
        Object r72 = r53.next();
        Field r82 = (Field) r72;
        if (AbstractC0307g.m699a(r82.getName(), r2) == false) goto L39;
        if (AbstractC0307g.m699a(r82.getType(), String.class) == false) goto L39;
    L46:
        Field r73 = (Field) r72;
        if (r73 == null) goto L66;
        r73.setAccessible(true);     // Catch: Throwable -> L52
        Object r22 = r73.get(r10);     // Catch: Throwable -> L52
        if ((r22 instanceof String) == false) goto L54;
        Object r23 = (String) r22;     // Catch: Throwable -> L52
    L57:
        if ((r23 instanceof C0140f) == false) goto L59;
        r23 = null;
    L59:
        String r24 = (String) r23;
        if (r24 == null) goto L66;
        if ((true ^ AbstractC0425j.m1013R0(r24)) == false) goto L64;
        r3 = r24;
    L64:
        if (r3 == null) goto L66;
        return r3;
    L54:
        r23 = null;
    L52:
        th = move-exception;
        r23 = AbstractC0040p.m116u(th);
    L66:
        r1 = r1 + 1;
        goto L3
    L45:
        r72 = null;
        goto L46
    L68:
        r52.setAccessible(true);     // Catch: Throwable -> L22
        Object r54 = r52.invoke(r10, null);     // Catch: Throwable -> L22
        if ((r54 instanceof String) == false) goto L24;
        Object r55 = (String) r54;     // Catch: Throwable -> L22
    L27:
        if ((r55 instanceof C0140f) == false) goto L29;
        r55 = null;
    L29:
        String r56 = (String) r55;
        if (r56 == null) goto L37;
        if ((!AbstractC0425j.m1013R0(r56)) == true) goto L35;
        r56 = null;
    L35:
        if (r56 == null) goto L37;
        return r56;
    L24:
        r55 = null;
    L22:
        th = move-exception;
        r55 = AbstractC0040p.m116u(th);
        goto L27
    L15:
        r5 = null;
        goto L16
    L92:
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static long m1732w(Object r6) {
        Number r62 = m1733x(r6, new String[]{"getMsgId", "getMsgID", "field_msgId", "msgId", "msgID", "id"});
        if (r62 != null) goto L7;
        return 0;
    L7:
        return r62.longValue();
    }

    /* JADX INFO: renamed from: x */
    public static Number m1733x(Object r10, String... r11) {
        int r02 = r11.length;
        int r1 = 0;
    L3:
        Object r2 = null;
        if (r1 >= r02) goto L59;
        String r3 = r11[r1];
        C0406i r4 = AbstractC0358S.m861K(new C0672l0(r10.getClass(), null));
    L7:
        if (r4.hasNext() == false) goto L15;
        Object r5 = r4.next();
        Method r7 = (Method) r5;
        if (AbstractC0307g.m699a(r7.getName(), r3) == false) goto L7;
        Class<?>[] r8 = r7.getParameterTypes();
        AbstractC0307g.m702d(r8, "getParameterTypes(...)");
        if (r8.length != 0) goto L7;
        Class<?> r72 = r7.getReturnType();
        AbstractC0307g.m702d(r72, "getReturnType(...)");
        if (Number.class.isAssignableFrom(m1716e(r72)) == false) goto L7;
    L16:
        Method r52 = (Method) r5;
        if (r52 != null) goto L60;
    L32:
        C0406i r53 = AbstractC0358S.m861K(new C0669k0(r10.getClass(), null));
    L34:
        if (r53.hasNext() == false) goto L40;
        Object r73 = r53.next();
        Field r82 = (Field) r73;
        if (AbstractC0307g.m699a(r82.getName(), r3) == false) goto L34;
        Class<?> r83 = r82.getType();
        AbstractC0307g.m702d(r83, "getType(...)");
        if (Number.class.isAssignableFrom(m1716e(r83)) == false) goto L34;
    L41:
        Field r74 = (Field) r73;
        if (r74 == null) goto L58;
        r74.setAccessible(true);     // Catch: Throwable -> L47
        Object r32 = r74.get(r10);     // Catch: Throwable -> L47
        if ((r32 instanceof Number) == false) goto L49;
        Object r33 = (Number) r32;     // Catch: Throwable -> L47
    L52:
        if ((r33 instanceof C0140f) == true) goto L55;
        r2 = r33;
    L55:
        Number r22 = (Number) r2;
        if (r22 == null) goto L58;
        return r22;
    L49:
        r33 = null;
    L47:
        th = move-exception;
        r33 = AbstractC0040p.m116u(th);
    L58:
        r1 = r1 + 1;
        goto L3
    L40:
        r73 = null;
        goto L41
    L60:
        r52.setAccessible(true);     // Catch: Throwable -> L22
        Object r54 = r52.invoke(r10, null);     // Catch: Throwable -> L22
        if ((r54 instanceof Number) == false) goto L24;
        Object r55 = (Number) r54;     // Catch: Throwable -> L22
    L27:
        if ((r55 instanceof C0140f) == false) goto L29;
        r55 = null;
    L29:
        Number r56 = (Number) r55;
        if (r56 == null) goto L32;
        return r56;
    L24:
        r55 = null;
    L22:
        th = move-exception;
        r55 = AbstractC0040p.m116u(th);
        goto L27
    L15:
        r5 = null;
        goto L16
    L59:
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static String m1734y(TextView r2) {
        String r02 = f2132q;
        CharSequence r22 = r2.getText();
        if (r22 == null) goto L5;
        String r23 = r22.toString();
    L6:
        if (r23 != null) goto L8;
        r23 = "";
    L8:
        if (r02 == null) goto L16;
        if (AbstractC0425j.m1013R0(r02) == true) goto L16;
        if (AbstractC0307g.m699a(f2121f.get(r02), r23) == false) goto L16;
        return r02;
    L16:
        return r23;
    L5:
        r23 = null;
        goto L6
    }

    /* JADX INFO: renamed from: z */
    public static Integer m1735z(String r7) {
        int r02 = AbstractC0425j.m1011P0(r7, ":\r\n", 0, false, 6);
        Integer r3 = Integer.valueOf(r02);
        Integer r5 = null;
        if (1 > r02) goto L6;
        if (r02 >= 81) goto L6;
    L7:
        if (r3 == null) goto L9;
        Integer r03 = Integer.valueOf(r3.intValue() + 3);
    L10:
        int r72 = AbstractC0425j.m1011P0(r7, ":\n", 0, false, 6);
        Integer r1 = Integer.valueOf(r72);
        if (1 > r72) goto L14;
        if (r72 >= 81) goto L14;
    L15:
        if (r1 == null) goto L18;
        r5 = Integer.valueOf(r1.intValue() + 2);
    L18:
        return (Integer) AbstractC0181l.m547s0(AbstractC0179j.m535l0(new Integer[]{r03, r5}));
    L14:
        r1 = null;
        goto L15
    L9:
        r03 = null;
    L6:
        r3 = null;
        goto L7
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1736k(Method r9) {
        Class<?>[] r02 = r9.getParameterTypes();
        AbstractC0307g.m702d(r02, "getParameterTypes(...)");
        int r2 = r02.length;
        int r4 = 0;
    L4:
        if (r4 >= r2) goto L9;
        if (Menu.class.isAssignableFrom(r02[r4]) == true) goto L7;
        r4 = r4 + 1;
        goto L4
    L7:
        boolean r03 = true;
    L10:
        Class<?>[] r22 = r9.getParameterTypes();
        AbstractC0307g.m702d(r22, "getParameterTypes(...)");
        int r1 = r22.length;
        int r42 = 0;
    L11:
        if (r42 >= r1) goto L16;
        if (View.class.isAssignableFrom(r22[r42]) == true) goto L14;
        r42 = r42 + 1;
        goto L11
    L14:
        boolean r12 = true;
    L17:
        if (r03 == false) goto L31;
        if (r12 == false) goto L31;
        String r04 = r9.toGenericString();
        r9.setAccessible(true);     // Catch: Throwable -> L23
        AbstractC0762d.m1952b(r9, new C0653f(this, r04, 2));     // Catch: Throwable -> L23
        Object r05 = Boolean.TRUE;     // Catch: Throwable -> L23
    L25:
        Throwable r13 = AbstractC0141g.m465a(r05);
        if (r13 == null) goto L30;
        m1711C("create menu hook fail " + r9.getDeclaringClass().getName() + ": " + r13.getMessage());
        r05 = Boolean.FALSE;
    L30:
        return ((Boolean) r05).booleanValue();
    L23:
        th = move-exception;
        r05 = AbstractC0040p.m116u(th);
    L31:
        return false;
    L16:
        r12 = false;
        goto L17
    L9:
        r03 = false;
        goto L10
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1737l(Method r5) {
        if (r5.getParameterTypes().length == 2) goto L5;
    L22:
        return false;
    L5:
        if (AbstractC0307g.m699a(r5.getParameterTypes()[0], MenuItem.class) == false) goto L22;
        if (AbstractC0307g.m699a(r5.getParameterTypes()[1], Integer.TYPE) == false) goto L22;
        if (AbstractC0307g.m699a(r5.getReturnType(), Void.TYPE) == false) goto L22;
        String r02 = r5.toGenericString();
        r5.setAccessible(true);     // Catch: Throwable -> L14
        AbstractC0762d.m1952b(r5, new C0647d(this, r5, r02));     // Catch: Throwable -> L14
        f2120e.incrementAndGet();     // Catch: Throwable -> L14
        Object r03 = Boolean.TRUE;     // Catch: Throwable -> L14
    L16:
        Throwable r1 = AbstractC0141g.m465a(r03);
        if (r1 == null) goto L21;
        m1711C("selection hook fail " + r5.getDeclaringClass().getName() + ": " + r1.getMessage());
        r03 = Boolean.FALSE;
    L21:
        return ((Boolean) r03).booleanValue();
    L14:
        th = move-exception;
        r03 = AbstractC0040p.m116u(th);
        goto L16
    }
}
