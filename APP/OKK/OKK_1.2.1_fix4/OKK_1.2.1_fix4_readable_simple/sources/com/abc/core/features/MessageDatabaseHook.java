package com.abc.core.features;

import android.content.ContentValues;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.query.matchers.MethodMatcher;
import org.luckypray.dexkit.result.MethodData;
import p001A0.AbstractC0040p;
import p007D0.C0137c;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p031Q0.AbstractC0307g;
import p031Q0.C0316p;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0432q;
import p042W0.AbstractC0433r;
import p042W0.C0419d;
import p089x0.C1121e;

/* JADX INFO: renamed from: c0.n */
/* JADX INFO: loaded from: classes.dex */
public final class MessageDatabaseHook {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f2105a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2106b = null;

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f2107c = null;

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f2108d = null;

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f2109e = null;

    /* JADX INFO: renamed from: f */
    public static final ConcurrentHashMap f2110f = null;

    /* JADX INFO: renamed from: g */
    public static final ConcurrentHashMap f2111g = null;

    /* JADX INFO: renamed from: h */
    public static final ConcurrentHashMap f2112h = null;

    /* JADX INFO: renamed from: i */
    public static volatile Method f2113i;

    /* JADX INFO: renamed from: j */
    public static volatile Object f2114j;

    /* JADX INFO: renamed from: k */
    public static final boolean f2115k = false;

    static {
        f2105a = new AtomicBoolean(false);
        f2106b = new AtomicBoolean(false);
        f2107c = new AtomicBoolean(false);
        f2108d = new AtomicBoolean(false);
        f2109e = new AtomicBoolean(false);
        f2110f = new ConcurrentHashMap();
        f2111g = new ConcurrentHashMap();
        f2112h = new ConcurrentHashMap();
        f2115k = true;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m1692a(String r25, ContentValues r26, C0686q r27) {
        Integer r3 = r26.getAsInteger("type");
        if (r3 == null) goto L127;
        int r6 = r3.intValue();
        Long r32 = m1702k(r26, "msgId");
        if (r32 == null) goto L7;
    L6:
        long r14 = r32.longValue();
    L11:
        String r9 = r26.getAsString("content");
        String r10 = "";
        if (r9 != null) goto L15;
        r9 = "";
    L15:
        if (r6 == 10000) goto L17;
    L18:
        long r17 = 0;
        if (r14 > 0) goto L108;
        Long r1 = m1702k(r26, "msgSvrId");
        if (r1 == null) goto L104;
        long r12 = r1.longValue();
    L106:
        if (r12 > 0) goto L108;
        return false;
    L104:
        r12 = 0;
    L108:
        String r16 = r26.getAsString("talker");
        Long r13 = m1702k(r26, "msgSvrId");
        if (r13 == null) goto L111;
        long r15 = r13.longValue();
    L112:
        String r33 = AntiRevokeProcessor.m1740c(r9);
        if (r33 != null) goto L121;
        if (r16 != null) goto L116;
    L120:
        String r11 = null;
    L122:
        Long r02 = r26.getAsLong("createTime");
        if (r02 == null) goto L125;
        r17 = r02.longValue();
    L125:
        m1704m(new C0652e1(r6, r9, r16, r17, r11, r15), r14, r15, r16);
        return false;
    L116:
        if (AntiRevokeProcessor.m1745h(r16) == false) goto L120;
        if (AntiRevokeProcessor.m1744g(r16) == true) goto L120;
        r11 = r16;
        goto L122
    L121:
        r11 = r33;
        goto L122
    L111:
        r15 = 0;
        goto L112
    L17:
        if (AntiRevokeProcessor.m1749l(r9) == false) goto L18;
        if (AntiRevokeProcessor.m1746i(r9) == false) goto L25;
        if (r27.f2147c == true) goto L25;
        m1703l(r26, r14);
        m1708q("MARKED self revoke DB msgId=" + r14 + " (pass-through)");
        return false;
    L25:
        if (AntiRevokeProcessor.m1746i(r9) == false) goto L27;
        m1703l(r26, r14);
        m1708q("MARKED self revoke DB msgId=" + r14 + " (keep)");
    L27:
        String r112 = r26.getAsString("talker");
        if (r112 != null) goto L35;
        r112 = AntiRevokeProcessor.m1742e(r9, "session");
        if (r112 != null) goto L32;
    L34:
        r112 = null;
        goto L35
    L32:
        if ((!AbstractC0425j.m1013R0(r112)) == false) goto L34;
    L35:
        String r132 = AntiRevokeProcessor.m1742e(r9, "newmsgid");
        if (r132 == null) goto L42;
        Long r133 = AbstractC0432q.m1027B0(r132);
        if (r133 == null) goto L42;
        long r172 = r133.longValue();
        if (r172 <= 0) goto L42;
        long r7 = r172;
        long r173 = 0;
    L53:
        Long r134 = Long.valueOf(r7);
        if (r7 > r173) goto L57;
        r134 = null;
    L57:
        if (r134 == null) goto L59;
        long r72 = r134.longValue();
    L63:
        C0652e1 r5 = m1705n(r14, r72, r112);
        String r73 = AntiRevokeProcessor.m1752o(AntiRevokeProcessor.m1746i(r9), r5, r112, r9);
        String r8 = AbstractC0642b0.m1620g(r73, r9);
        if (r73 != null) goto L66;
    L84:
        AbstractC0358S r62 = AntiRevokeProcessor.m1738a(new C0700u1(r14, r6, r9), r5, r27.f2147c, r27.f2148d, r27.f2146b, r8);
        if (r62.equals(C0694s1.f2193z) == false) goto L88;
        return false;
    L88:
        if ((r62 instanceof C0697t1) == false) goto L98;
        if (r27.f2146b == true) goto L92;
        m1708q("BLOCKED DB revoke without notice msgId=" + r14);
        return true;
    L92:
        r26.put("type", 10000);
        String r18 = ((C0697t1) r62).f2198z;
        r26.put("content", r18);
        if (r5 == null) goto L95;
        Integer r135 = Integer.valueOf(r5.f2024a);
    L96:
        m1708q("KEPT DB recall notice via " + r25 + " msgId=" + r14 + " wxid=" + r73 + " name=" + r8 + " type=" + r135 + " snippet=" + AbstractC0425j.m1021Z0(r18, 48));
        return false;
    L95:
        r135 = null;
        goto L96
    L98:
        throw new C0137c();
    L66:
        if (AbstractC0425j.m1013R0(r73) == true) goto L84;
        if (r8.equals("对方") == true) goto L84;
        String r113 = AbstractC0425j.m1022a1(r73).toString();
        if (r113 == null) goto L74;
        r10 = r113;
    L74:
        String r114 = AntiRevokeProcessor.m1739b(r8);
        if (r114 == null) goto L84;
        if (r10.length() == 0) goto L84;
        if (AntiRevokeProcessor.m1744g(r10) == true) goto L84;
        AbstractC0642b0.f2001c.put(r10, r114);
        goto L84
    L59:
        Long r52 = m1702k(r26, "msgSvrId");
        if (r52 == null) goto L62;
        r72 = r52.longValue();
        goto L63
    L62:
        r72 = 0;
    L42:
        Pattern r74 = Pattern.compile("newmsgid[\"\\s:=]+(\\d+)", C1121e.m2635b(2));
        AbstractC0307g.m702d(r74, "compile(...)");
        Matcher r75 = r74.matcher(r9);
        AbstractC0307g.m702d(r75, "matcher(...)");
        C0419d r76 = AbstractC0358S.m875a(r75, 0, r9);
        if (r76 == null) goto L51;
        String r77 = (String) AbstractC0181l.m545q0(r76.m1002a(), 1);
        if (r77 == null) goto L51;
        Long r78 = AbstractC0432q.m1027B0(r77);
        if (r78 == null) goto L51;
        r7 = r78.longValue();
        r173 = 0;
        if (r7 > 0) goto L53;
    L52:
        r7 = r173;
    L51:
        r173 = 0;
        goto L52
    L7:
        r32 = m1702k(r26, "msgSvrId");
        if (r32 != null) goto L6;
        r14 = 0;
        goto L11
    L127:
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static Method m1693b(ClassLoader r13, String r14) {
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
        r8.append(m1707p(r12));
        r11 = r11 + 1;
        goto L12
    L14:
        r8.append(')');
        Class<?> r92 = r7.getReturnType();
        AbstractC0307g.m702d(r92, "getReturnType(...)");
        r8.append(m1707p(r92));
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
        throw new NoSuchMethodException(r14);
    L26:
        throw new IllegalArgumentException(r14.toString());
    }

    /* JADX INFO: renamed from: c */
    public static Object m1694c(Object r1, String r2) {
        Field r22 = m1695d(r1.getClass(), r2);
        if (r22 == null) goto L5;
        r22.setAccessible(true);
        return r22.get(r1);
    L5:
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static Field m1695d(Class r6, String r7) {
    L2:
        Field r02 = null;
        if (r6 == null) goto L13;
        Field[] r1 = r6.getDeclaredFields();
        AbstractC0307g.m702d(r1, "getDeclaredFields(...)");
        int r2 = r1.length;
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L10;
        Field r4 = r1[r3];
        if (AbstractC0307g.m699a(r4.getName(), r7) == true) goto L8;
        r3 = r3 + 1;
        goto L5
    L8:
        r02 = r4;
    L10:
        if (r02 != null) goto L11;
        r6 = r6.getSuperclass();
        goto L2
    L11:
        return r02;
    L13:
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static int m1696e(Class r3, String r4, Class... r5) {
        C0316p r02 = new C0316p(2);     // Catch: Throwable -> L4
        ArrayList r1 = r02.f597a;     // Catch: Throwable -> L4
        r02.m710b(r5);     // Catch: Throwable -> L4
        r02.m709a(new MessageActionDispatcher(0, r4));     // Catch: Throwable -> L4
        AbstractC0358S.m904q(r3, r4, r1.toArray(new Object[r1.size()]));     // Catch: Throwable -> L4
        return 1;
    L4:
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public static void m1697f(DexKitBridge r4, ClassLoader r5) {
        if (f2107c.get() == false) goto L5;
        return;
    L5:
        Object r02 = null;
        FindMethod r1 = new FindMethod();     // Catch: Throwable -> L10
        MethodMatcher r2 = new MethodMatcher();     // Catch: Throwable -> L10
        r2.usingEqStrings(new String[]{"doRevokeMsg xmlSrvMsgId=%d talker=%s isGet=%s"});     // Catch: Throwable -> L10
        r1.matcher(r2);     // Catch: Throwable -> L10
        MethodData r12 = r4.findMethod(r1).firstOrNull();     // Catch: Throwable -> L10
        if (r12 == null) goto L12;
        Object r13 = r12.getDescriptor();     // Catch: Throwable -> L10
    L15:
        if ((r13 instanceof C0140f) == false) goto L17;
        r13 = null;
    L17:
        String r14 = (String) r13;
        if (r14 == null) goto L55;
    L31:
        if (r14 != null) goto L33;
    L49:
        m1708q("DexKit did not find doRevokeMsg");
        return;
    L33:
        if (AbstractC0425j.m1013R0(r14) == true) goto L49;
        Object r42 = m1693b(r5, r14);     // Catch: Throwable -> L37
    L40:
        if ((r42 instanceof C0140f) == true) goto L43;
        r02 = r42;
    L43:
        Method r03 = (Method) r02;
        if (r03 != null) goto L47;
        m1708q("DexKit descriptor could not resolve: ".concat(r14));
        return;
    L47:
        m1699h("DexKit:".concat(r14), r03);
        return;
    L37:
        th = move-exception;
        r42 = AbstractC0040p.m116u(th);
        goto L40
    L55:
        FindMethod r15 = new FindMethod();     // Catch: Throwable -> L23
        MethodMatcher r22 = new MethodMatcher();     // Catch: Throwable -> L23
        r22.usingStrings(new String[]{"doRevokeMsg xmlSrvMsgId="});     // Catch: Throwable -> L23
        r15.matcher(r22);     // Catch: Throwable -> L23
        MethodData r43 = r4.findMethod(r15).firstOrNull();     // Catch: Throwable -> L23
        if (r43 == null) goto L25;
        Object r44 = r43.getDescriptor();     // Catch: Throwable -> L23
    L28:
        if ((r44 instanceof C0140f) == false) goto L30;
        r44 = null;
    L30:
        r14 = (String) r44;
        goto L31
    L25:
        r44 = null;
    L23:
        th = move-exception;
        r44 = AbstractC0040p.m116u(th);
        goto L28
    L12:
        r13 = null;
    L10:
        th = move-exception;
        r13 = AbstractC0040p.m116u(th);
        goto L15
    }

    /* JADX INFO: renamed from: g */
    public static void m1698g(DexKitBridge r4, ClassLoader r5) {
        if (f2113i == null) goto L5;
        return;
    L5:
        Object r02 = null;
        FindMethod r1 = new FindMethod();     // Catch: Throwable -> L10
        r1.searchPackages(new String[]{"com.tencent.mm.storage"});     // Catch: Throwable -> L10
        MethodMatcher r2 = new MethodMatcher();     // Catch: Throwable -> L10
        r2.returnType(Long.TYPE);     // Catch: Throwable -> L10
        r2.usingStrings(new String[]{"check table name from id:%d table:%s getTableNameByLocalId:%s"});     // Catch: Throwable -> L10
        r1.matcher(r2);     // Catch: Throwable -> L10
        MethodData r42 = r4.findMethod(r1).firstOrNull();     // Catch: Throwable -> L10
        if (r42 == null) goto L12;
        Object r43 = r42.getDescriptor();     // Catch: Throwable -> L10
    L15:
        if ((r43 instanceof C0140f) == false) goto L17;
        r43 = null;
    L17:
        String r44 = (String) r43;
        if (r44 != null) goto L20;
    L36:
        m1708q("DexKit did not find send-tip cache method");
        return;
    L20:
        if (AbstractC0425j.m1013R0(r44) == true) goto L36;
        Object r52 = m1693b(r5, r44);     // Catch: Throwable -> L24
    L27:
        if ((r52 instanceof C0140f) == true) goto L30;
        r02 = r52;
    L30:
        Method r03 = (Method) r02;
        if (r03 != null) goto L34;
        m1708q("send-tip descriptor could not resolve: ".concat(r44));
        return;
    L34:
        r03.setAccessible(true);
        f2113i = r03;
        AbstractC0762d.m1952b(r03, new InputStatsMessageHook(2, false));
        m1708q("hooked send-tip cache method: ".concat(r44));
        return;
    L24:
        th = move-exception;
        r52 = AbstractC0040p.m116u(th);
        goto L27
    L12:
        r43 = null;
    L10:
        th = move-exception;
        r43 = AbstractC0040p.m116u(th);
        goto L15
    }

    /* JADX INFO: renamed from: h */
    public static void m1699h(String r3, Method r4) {
        if (f2107c.compareAndSet(false, true) == true) goto L5;
        return;
    L5:
        r4.setAccessible(true);
        AbstractC0762d.m1952b(r4, new InputStatsMessageHook(3, false));
        m1708q("hooked source revoke via " + r3);
    }

    /* JADX INFO: renamed from: i */
    public static void m1700i(Context r7, String r8) {
        AtomicBoolean r1 = f2105a;
        if (r1.get() == false) goto L58;
        return;
    L58:
        System.loadLibrary("dexkit");     // Catch: Throwable -> L7
        Object r2 = C0146l.f339a;     // Catch: Throwable -> L7
    L10:
        if ((!(r2 instanceof C0140f)) == false) goto L13;
        C0146l r22 = (C0146l) r2;
        r1.set(true);
        m1708q("DexKit native loaded via library path");
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
        m1708q("DexKit native loaded from module apk");
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
        throw new IllegalStateException("lib/" + r24 + "/libdexkit.so not found in module apk");     // Catch: Throwable -> L33
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
        throw new IllegalStateException("module path unavailable for libdexkit.so");
    L7:
        th = move-exception;
        r2 = AbstractC0040p.m116u(th);
        goto L10
    }

    /* JADX INFO: renamed from: j */
    public static Long m1701j(Object r1, String r2) {
        Object r12 = m1694c(r1, r2);
        if ((r12 instanceof Number) == false) goto L5;
        Number r13 = (Number) r12;
    L6:
        if (r13 != null) goto L8;
        return null;
    L8:
        return Long.valueOf(r13.longValue());
    L5:
        r13 = null;
        goto L6
    }

    /* JADX INFO: renamed from: k */
    public static Long m1702k(ContentValues r02, String r1) {
        Object r03 = r02.getAsLong(r1);     // Catch: Throwable -> L4
    L7:
        if ((r03 instanceof C0140f) == false) goto L10;
        r03 = null;
    L10:
        return (Long) r03;
    L4:
        th = move-exception;
        r03 = AbstractC0040p.m116u(th);
        goto L7
    }

    /* JADX INFO: renamed from: l */
    public static void m1703l(ContentValues r7, long r8) {
        ConcurrentHashMap r02 = C0572A1.f1693a;
        Long r03 = m1702k(r7, "msgId");
        long r1 = 0;
        if (r03 == null) goto L5;
        long r3 = r03.longValue();
    L6:
        Long r04 = m1702k(r7, "msgSvrId");
        if (r04 == null) goto L9;
        long r5 = r04.longValue();
    L10:
        Long r72 = m1702k(r7, "newMsgId");
        if (r72 == null) goto L13;
        r1 = r72.longValue();
    L13:
        C0572A1.m1384a(new long[]{r8, r3, r5, r1});
        return;
    L9:
        r5 = 0;
        goto L10
    L5:
        r3 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: m */
    public static void m1704m(C0652e1 r4, long r5, long r7, String r9) {
        ConcurrentHashMap r3 = f2110f;
        if (r5 <= 0) goto L6;
        r3.put(Long.valueOf(r5), r4);
    L6:
        if (r7 > 0) goto L10;
        r7 = r4.f2029f;
    L10:
        if (r7 <= 0) goto L12;
        r3.put(Long.valueOf(r7), r4);
    L12:
        if (r9 != null) goto L15;
        r9 = r4.f2026c;
    L15:
        if (r9 == null) goto L27;
        if (AbstractC0425j.m1013R0(r9) == true) goto L27;
        if (r7 <= 0) goto L27;
        ConcurrentHashMap r52 = f2111g;
        r52.put(r9 + ":" + r7, r4);
        if (r52.size() <= 1200) goto L27;
        int r42 = r52.size() - 1000;
        Set r72 = r52.keySet();
        AbstractC0307g.m702d(r72, "<get-keys>(...)");
        Iterator r43 = AbstractC0181l.m549u0(r42, r72).iterator();
    L24:
        if (r43.hasNext() == false) goto L27;
        r52.remove((String) r43.next());
    L27:
        if (r3.size() <= 2400) goto L32;
        int r44 = r3.size() - 2000;
        Set r53 = r3.keySet();
        AbstractC0307g.m702d(r53, "<get-keys>(...)");
        Iterator r45 = AbstractC0181l.m549u0(r44, r53).iterator();
    L30:
        if (r45.hasNext() == false) goto L35;
        r3.remove((Long) r45.next());
        goto L30
    L35:
        return;
    }

    /* JADX INFO: renamed from: n */
    public static C0652e1 m1705n(long r4, long r6, String r8) {
        ConcurrentHashMap r3 = f2110f;
        if (r4 <= 0) goto L8;
        C0652e1 r42 = (C0652e1) r3.get(Long.valueOf(r4));
        if (r42 == null) goto L8;
        return r42;
    L8:
        if (r6 <= 0) goto L19;
        C0652e1 r43 = (C0652e1) r3.get(Long.valueOf(r6));
        if (r43 == null) goto L12;
        return r43;
    L12:
        if (r8 != null) goto L14;
        return null;
    L14:
        if (AbstractC0425j.m1013R0(r8) == true) goto L23;
        C0652e1 r44 = (C0652e1) f2111g.get(r8 + ":" + r6);
        if (r44 == null) goto L22;
        return r44;
    L22:
        return null;
    L23:
        return null;
    L19:
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static void m1706o(Object r1, Object r2, String r3) {
        Field r32 = m1695d(r1.getClass(), r3);
        if (r32 != null) goto L6;
        return;
    L6:
        if (Modifier.isFinal(r32.getModifiers()) == false) goto L8;
        return;
    L8:
        r32.setAccessible(true);
        r32.set(r1, r2);
    }

    /* JADX INFO: renamed from: p */
    public static String m1707p(Class r3) {
        if (r3.isPrimitive() == false) goto L35;
        if (r3.equals(Integer.TYPE) == false) goto L8;
        return "I";
    L8:
        if (r3.equals(Void.TYPE) == false) goto L11;
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
        if (r3.equals(Double.TYPE) == false) goto L33;
        return "D";
    L33:
        throw new IllegalStateException(("Unknown primitive " + r3).toString());
    L35:
        if (r3.isArray() == false) goto L39;
        return AbstractC0433r.m1032G0(r3.getName(), '.', '/');
    L39:
        return AbstractC0324d.m723f("L", AbstractC0433r.m1032G0(r3.getName(), '.', '/'), ";");
    }

    /* JADX INFO: renamed from: q */
    public static void m1708q(String r2) {
        AbstractC0762d.m1954d("[OKK-AntiRevoke] " + r2);     // Catch: Throwable -> L5
        return;
    }
}
