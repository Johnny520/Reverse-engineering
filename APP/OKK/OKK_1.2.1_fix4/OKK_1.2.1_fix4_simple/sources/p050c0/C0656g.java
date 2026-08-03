package p050c0;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Process;
import de.robv.android.xposed.AbstractC0762d;
import de.robv.android.xposed.C0760b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.query.matchers.MethodMatcher;
import org.luckypray.dexkit.result.MethodData;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0182m;
import p009E0.AbstractC0188s;
import p009E0.C0172c;
import p009E0.C0190u;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0656g {

    /* JADX INFO: renamed from: a */
    public static final C0656g f2040a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2041b = null;

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f2042c = null;

    static {
        f2040a = new C0656g();
        f2041b = new AtomicBoolean(false);
        f2042c = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static final void m1641a(C0656g r10, C0760b r11, boolean r12) {
        r10.getClass();
        Object[] r102 = r11.f2670c;
        AbstractC0307g.m702d(r102, "args");
        Object r103 = AbstractC0179j.m537n0(0, r102);
        if ((r103 instanceof Number) == false) goto L5;
        Number r104 = (Number) r103;
    L6:
        if (r104 == null) goto L96;
        long r4 = r104.longValue();
        if (r12 == false) goto L15;
        Object[] r122 = r11.f2670c;
        AbstractC0307g.m702d(r122, "args");
        Object r123 = AbstractC0179j.m537n0(1, r122);
        if ((r123 instanceof Number) == false) goto L12;
        Number r124 = (Number) r123;
    L13:
        if (r124 == null) goto L131;
        String[] r125 = {String.valueOf(r4), String.valueOf(r124.longValue())};
        String r02 = "snsID = ? AND commentSvrID = ?";
    L16:
        Object r112 = r11.f2669b;
        AbstractC0307g.m702d(r112, "thisObject");
        Class<?> r42 = r112.getClass();
        ArrayList r5 = new ArrayList();
    L17:
        if (r42 == null) goto L21;
        if (r42.equals(Object.class) == true) goto L21;
        Field[] r6 = r42.getDeclaredFields();
        AbstractC0307g.m702d(r6, "getDeclaredFields(...)");
        AbstractC0188s.m561m0(r5, r6);
        r42 = r42.getSuperclass();
    L21:
        Iterator r43 = r5.iterator();
    L23:
        if (r43.hasNext() == false) goto L46;
        Field r52 = (Field) r43.next();
        if (Modifier.isStatic(r52.getModifiers()) == true) goto L23;
        Class<?> r62 = r52.getType();
        if (r62.isPrimitive() == true) goto L23;
        if (r62.equals(String.class) == true) goto L23;
        if (AbstractC0433r.m1033H0(r62.getName(), "java.", false) == true) goto L23;
        r52.setAccessible(true);
        Object r53 = r52.get(r112);     // Catch: Throwable -> L36
    L39:
        if ((r53 instanceof C0140f) == false) goto L41;
        r53 = null;
    L41:
        if (r53 == null) goto L23;
        if (m1646f(r53) == null) goto L23;
    L47:
        if (r53 != null) goto L49;
        m1657r("markAndBlockDelete: no db handle");
        return;
    L49:
        String r113 = "SELECT rowid, curActionBuf, commentflag FROM SnsComment WHERE ".concat(r02);
        Method r03 = m1646f(r53);
        if (r03 != null) goto L103;
        Cursor r114 = null;
    L64:
        if (r114 == null) goto L134;
    L101:
        if (r114.moveToNext() == false) goto L91;
        long r63 = r114.getLong(0);     // Catch: Throwable -> L89
        Object r126 = r114.getBlob(1);     // Catch: Throwable -> L71
    L74:
        if ((r126 instanceof C0140f) == false) goto L76;
        r126 = null;
    L76:
        byte[] r127 = (byte[]) r126;     // Catch: Throwable -> L89
        Object r04 = Integer.valueOf(r114.getInt(2));     // Catch: Throwable -> L79
    L82:
        if ((r04 instanceof C0140f) == false) goto L84;
        r04 = 0;
    L84:
        int r05 = ((Number) r04).intValue();     // Catch: Throwable -> L89
        if ((r05 & 256) != 0) goto L101;
        int r44 = (r05 & (-2)) | 256;     // Catch: Throwable -> L89
        byte[] r128 = AbstractC0358S.m854D(r127);     // Catch: Throwable -> L89
        ContentValues r8 = new ContentValues();     // Catch: Throwable -> L89
        r8.put("curActionBuf", r128);     // Catch: Throwable -> L89
        r8.put("commentflag", Integer.valueOf(r44));     // Catch: Throwable -> L89
        m1656q(r53, r8, new String[]{String.valueOf(r63)});     // Catch: Throwable -> L89
        m1657r("marked rowid=" + r63 + " flag=" + r05 + "->" + r44);     // Catch: Throwable -> L89
    L79:
        th = move-exception;
        r04 = AbstractC0040p.m116u(th);     // Catch: Throwable -> L89
    L71:
        th = move-exception;
        r126 = AbstractC0040p.m116u(th);     // Catch: Throwable -> L89
        goto L74
    L91:
        AbstractC0040p.m108m(r114, null);
        return;
    L89:
        th = move-exception;
        throw th;     // Catch: Throwable -> L93
    L93:
        th = move-exception;
        AbstractC0040p.m108m(r114, th);
        throw th;
    L134:
        return;
    L103:
        Object r115 = r03.invoke(r53, new Object[]{r113, r125});     // Catch: Throwable -> L56
        if ((r115 instanceof Cursor) == false) goto L58;
        Object r116 = (Cursor) r115;     // Catch: Throwable -> L56
    L61:
        if ((r116 instanceof C0140f) == false) goto L63;
        r116 = null;
    L63:
        r114 = (Cursor) r116;
        goto L64
    L58:
        r116 = null;
    L56:
        th = move-exception;
        r116 = AbstractC0040p.m116u(th);
    L36:
        th = move-exception;
        r53 = AbstractC0040p.m116u(th);
        goto L39
    L46:
        r53 = null;
        goto L47
    L131:
        return;
    L12:
        r124 = null;
        goto L13
    L15:
        r125 = new String[]{String.valueOf(r4)};
        r02 = "snsID = ?";
        goto L16
    L96:
        return;
    L5:
        r104 = null;
        goto L6
    }

    /* JADX INFO: renamed from: b */
    public static final void m1642b(Object r5) {
        Field r02 = m1647g(r5.getClass(), "field_commentflag");
        if (r02 == null) goto L20;
        r02.setAccessible(true);
        Object r2 = r02.get(r5);
        byte[] r4 = null;
        if ((r2 instanceof Number) == false) goto L8;
        Number r22 = (Number) r2;
    L9:
        if (r22 == null) goto L11;
        int r23 = r22.intValue();
    L12:
        r02.set(r5, Integer.valueOf((r23 & (-2)) | 256));
        Field r03 = m1647g(r5.getClass(), "field_curActionBuf");
        if (r03 == null) goto L21;
        r03.setAccessible(true);
        Object r1 = r03.get(r5);
        if ((r1 instanceof byte[]) == false) goto L18;
        r4 = (byte[]) r1;
    L18:
        r03.set(r5, AbstractC0358S.m854D(r4));
        return;
    L21:
        return;
    L11:
        r23 = 0;
        goto L12
    L8:
        r22 = null;
        goto L9
    }

    /* JADX INFO: renamed from: c */
    public static void m1643c(Object r4) {
        Iterator r02 = AbstractC0182m.m556h0(new String[]{"f233756s", "s", "DeleteFlag", "deleteFlag"}).iterator();
    L4:
        if (r02.hasNext() == false) goto L28;
        String r1 = (String) r02.next();
        Field r12 = m1647g(r4.getClass(), r1);
        if (r12 == null) goto L4;
        if (AbstractC0307g.m699a(r12.getType(), Integer.TYPE) == true) goto L12;
        if (AbstractC0307g.m699a(r12.getType(), Integer.class) == false) goto L4;
    L12:
        r12.setAccessible(true);
        r12.set(r4, 0);     // Catch: Throwable -> L15
        return;
    L15:
        th = move-exception;
        AbstractC0040p.m116u(th);
        return;
    }

    /* JADX INFO: renamed from: d */
    public static String m1644d(Object r8) {
        Iterator r02 = AbstractC0182m.m556h0(new String[]{"f233744d", "d", "Username", "username", "UserName"}).iterator();
    L3:
        Integer r3 = null;
        if (r02.hasNext() == false) goto L18;
        Field r1 = m1647g(r8.getClass(), (String) r02.next());
        if (r1 == null) goto L3;
        if (AbstractC0307g.m699a(r1.getType(), String.class) == false) goto L3;
        r1.setAccessible(true);
        Object r12 = r1.get(r8);
        if ((r12 instanceof String) == false) goto L13;
        String r13 = (String) r12;
    L14:
        if (r13 == null) goto L3;
        if (r13.length() == 0) goto L3;
    L19:
        if (r13 != null) goto L21;
        return null;
    L21:
        Iterator r03 = AbstractC0182m.m556h0(new String[]{"f233750m", "m", "CommentId", "commentId", "i"}).iterator();
    L23:
        if (r03.hasNext() == false) goto L39;
        Field r4 = m1647g(r8.getClass(), (String) r03.next());
        if (r4 == null) goto L23;
        r4.setAccessible(true);
        Object r42 = r4.get(r8);
        if (r42 == null) goto L23;
        if ((r42 instanceof Integer) == true) goto L32;
        if ((r42 instanceof Long) == true) goto L35;
        if ((r42 instanceof Number) == false) goto L23;
        r3 = Integer.valueOf(((Number) r42).intValue());
        goto L39
    L35:
        r3 = Integer.valueOf((int) ((Number) r42).longValue());
        goto L39
    L32:
        r3 = (Integer) r42;
    L39:
        if (r3 == null) goto L41;
        int r82 = r3.intValue();
    L43:
        return r13 + "#" + r82;
    L41:
        r82 = 0;
        goto L43
    L13:
        r13 = null;
        goto L14
    L18:
        r13 = null;
        goto L19
    }

    /* JADX INFO: renamed from: e */
    public static Method m1645e(ClassLoader r12, String r13) {
        int r02 = AbstractC0425j.m1011P0(r13, "->", 0, false, 6);
        int r2 = AbstractC0425j.m1010O0(r13, '(', r02, false, 4);
        String r3 = r13.substring(1, r02 - 1);
        AbstractC0307g.m702d(r3, "substring(...)");
        String r32 = AbstractC0433r.m1032G0(r3, '/', '.');
        String r03 = r13.substring(r02 + 2, r2);
        AbstractC0307g.m702d(r03, "substring(...)");
        String r22 = r13.substring(r2);
        AbstractC0307g.m702d(r22, "substring(...)");
        Class<?> r122 = r12.loadClass(r32);
    L3:
        if (r122 == null) goto L20;
        Method[] r33 = r122.getDeclaredMethods();
        AbstractC0307g.m702d(r33, "getDeclaredMethods(...)");
        int r4 = r33.length;
        int r5 = 0;
    L5:
        if (r5 >= r4) goto L15;
        Method r6 = r33[r5];
        if (AbstractC0307g.m699a(r6.getName(), r03) == false) goto L14;
        StringBuilder r7 = new StringBuilder("(");
        Class<?>[] r8 = r6.getParameterTypes();
        AbstractC0307g.m702d(r8, "getParameterTypes(...)");
        int r9 = r8.length;
        int r10 = 0;
    L9:
        if (r10 >= r9) goto L11;
        Class<?> r11 = r8[r10];
        AbstractC0307g.m700b(r11);
        r7.append(m1655p(r11));
        r10 = r10 + 1;
        goto L9
    L11:
        r7.append(')');
        Class<?> r82 = r6.getReturnType();
        AbstractC0307g.m702d(r82, "getReturnType(...)");
        r7.append(m1655p(r82));
        String r72 = r7.toString();
        AbstractC0307g.m702d(r72, "toString(...)");
        if (r72.equals(r22) == false) goto L14;
    L16:
        if (r6 != null) goto L17;
        r122 = r122.getSuperclass();
        goto L3
    L17:
        return r6;
    L14:
        r5 = r5 + 1;
        goto L5
    L15:
        r6 = null;
        goto L16
    L20:
        throw new IllegalStateException("method not found ".concat(r13).toString());
    }

    /* JADX INFO: renamed from: f */
    public static Method m1646f(Object r6) {
        Class<?> r62 = r6.getClass();
    L3:
        if (r62 == null) goto L20;
        C0172c r02 = AbstractC0317q.m714c(r62.getDeclaredMethods());
    L6:
        if (r02.hasNext() == false) goto L19;
        Method r1 = (Method) r02.next();
        Class<?>[] r2 = r1.getParameterTypes();
        if (r2.length != 2) goto L6;
        if (AbstractC0307g.m699a(r2[0], String.class) == false) goto L6;
        if (AbstractC0307g.m699a(r2[1], String[].class) == true) goto L16;
        if (r2[1].getName().equals("[Ljava.lang.String;") == false) goto L6;
    L16:
        if (Cursor.class.isAssignableFrom(r1.getReturnType()) == false) goto L6;
        r1.setAccessible(true);
        return r1;
    L19:
        r62 = r62.getSuperclass();
        goto L3
    L20:
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static Field m1647g(Class r1, String r2) {
    L2:
        if (r1 == null) goto L9;
        if (r1.equals(Object.class) == true) goto L16;
        return r1.getDeclaredField(r2);
    L7:
        th = move-exception;
        AbstractC0040p.m116u(th);
        r1 = r1.getSuperclass();
        goto L2
    L16:
        return null;
    L9:
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static int m1648h(DexKitBridge r4, ClassLoader r5, List r6, String r7, InterfaceC0286l r8) {
        int r02 = 0;
        FindMethod r1 = new FindMethod();     // Catch: Throwable -> L5
        MethodMatcher r2 = new MethodMatcher();     // Catch: Throwable -> L5
        String[] r62 = (String[]) r6.toArray(new String[0]);     // Catch: Throwable -> L5
        r2.usingStrings((String[]) Arrays.copyOf(r62, r62.length));     // Catch: Throwable -> L5
        r1.matcher(r2);     // Catch: Throwable -> L5
        Object r42 = r4.findMethod(r1);     // Catch: Throwable -> L5
    L8:
        if ((r42 instanceof C0140f) == false) goto L10;
        r42 = null;
    L10:
        List r43 = (List) r42;
        if (r43 != null) goto L14;
        r43 = C0190u.f401a;
    L14:
        if (r43.isEmpty() == false) goto L17;
        m1657r("DexKit miss ".concat(r7));
        return 0;
    L17:
        Iterator r44 = r43.iterator();
    L19:
        if (r44.hasNext() == false) goto L33;
        MethodData r63 = (MethodData) r44.next();
        Object r22 = m1645e(r5, r63.getDescriptor());     // Catch: Throwable -> L23
    L26:
        if ((r22 instanceof C0140f) == false) goto L28;
        r22 = null;
    L28:
        Method r23 = (Method) r22;
        if (r23 == null) goto L19;
        if (((Boolean) r8.invoke(r23)).booleanValue() == false) goto L19;
        r02 = r02 + 1;
        m1657r("hooked " + r7 + " -> " + r63.getDescriptor());
    L23:
        th = move-exception;
        r22 = AbstractC0040p.m116u(th);
        goto L26
    L33:
        return r02;
    L5:
        th = move-exception;
        r42 = AbstractC0040p.m116u(th);
        goto L8
    }

    /* JADX INFO: renamed from: j */
    public static boolean m1649j() {
        C0661h1 r02 = C0661h1.f2048a;     // Catch: Throwable -> L4
        Object r03 = Boolean.valueOf(C0661h1.m1661c("anti_moments_comment_revoke", true));     // Catch: Throwable -> L4
    L6:
        Object r1 = Boolean.TRUE;
        if ((r03 instanceof C0140f) == false) goto L10;
        r03 = r1;
    L10:
        return ((Boolean) r03).booleanValue();
    L4:
        th = move-exception;
        r03 = AbstractC0040p.m116u(th);
        goto L6
    }

    /* JADX INFO: renamed from: k */
    public static void m1650k(Context r7, String r8) {
        AtomicBoolean r1 = f2042c;
        if (r1.get() == false) goto L54;
        return;
    L54:
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
        File r4 = new File(r7.getCacheDir(), AbstractC0324d.m723f("abc_cmt_", r32, "_libdexkit.so"));
        ZipFile r72 = new ZipFile(r8);
        ZipEntry r82 = r72.getEntry("lib/" + r32 + "/libdexkit.so");     // Catch: Throwable -> L33
        if (r82 != null) goto L26;
        AbstractC0040p.m108m(r72, null);
        return;
    L26:
        InputStream r83 = r72.getInputStream(r82);     // Catch: Throwable -> L33
        FileOutputStream r33 = new FileOutputStream(r4);     // Catch: Throwable -> L35
        AbstractC0307g.m700b(r83);     // Catch: Throwable -> L37
        AbstractC0040p.m115t(r83, r33, 8192);     // Catch: Throwable -> L37
        AbstractC0040p.m108m(r33, null);     // Catch: Throwable -> L35
        AbstractC0040p.m108m(r83, null);     // Catch: Throwable -> L33
        AbstractC0040p.m108m(r72, null);
        System.load(r4.getAbsolutePath());
        r1.set(true);
        return;
    L37:
        th = move-exception;
        throw th;     // Catch: Throwable -> L39
    L39:
        th = move-exception;
        AbstractC0040p.m108m(r33, th);     // Catch: Throwable -> L35
        throw th;     // Catch: Throwable -> L35
    L35:
        th = move-exception;
        throw th;     // Catch: Throwable -> L43
    L43:
        th = move-exception;
        AbstractC0040p.m108m(r83, th);     // Catch: Throwable -> L33
        throw th;     // Catch: Throwable -> L33
    L33:
        th = move-exception;
        throw th;     // Catch: Throwable -> L47
    L47:
        th = move-exception;
        AbstractC0040p.m108m(r72, th);
        throw th;
    L17:
        String[] r34 = Build.SUPPORTED_32_BIT_ABIS;
        AbstractC0307g.m702d(r34, "SUPPORTED_32_BIT_ABIS");
        r32 = (String) AbstractC0179j.m536m0(r34);
        if (r32 != null) goto L20;
        r32 = "armeabi-v7a";
        goto L20
    }

    /* JADX INFO: renamed from: l */
    public static void m1651l(Object r12) {
        Iterator r02 = AbstractC0182m.m556h0(new String[]{"f233748h", "h", "m", "Content", "content", "Desc"}).iterator();
    L3:
        String r6 = "[已删除]";
        String r8 = null;
        if (r02.hasNext() == false) goto L33;
        String r1 = (String) r02.next();
        Field r9 = m1647g(r12.getClass(), r1);
        if (r9 == null) goto L3;
        if (AbstractC0307g.m699a(r9.getType(), String.class) == false) goto L3;
        r9.setAccessible(true);
        Object r4 = r9.get(r12);
        if ((r4 instanceof String) == false) goto L13;
        r8 = (String) r4;
    L13:
        if (r8 != null) goto L18;
        if (AbstractC0425j.m1005J0(r1, "h", true) == true) goto L18;
        if (r1.equals("f233748h") == false) goto L3;
    L18:
        if (r8 != null) goto L21;
        r8 = "";
    L21:
        if (AbstractC0433r.m1033H0(r8, "[已删除]", false) == false) goto L24;
    L31:
        r9.set(r12, r8);
        return;
    L24:
        if (AbstractC0433r.m1033H0(r8, "(已删除)", false) == false) goto L27;
        r8 = "[已删除]".concat(AbstractC0425j.m1016U0(r8, "(已删除)"));
        goto L31
    L27:
        if (r8.length() == 0) goto L30;
        r6 = "[已删除] ".concat(r8);
    L30:
        r8 = r6;
        goto L31
    L33:
        Class<?> r03 = r12.getClass();
    L34:
        if (r03 == null) goto L71;
        if (r03.equals(Object.class) == true) goto L96;
        C0172c r13 = AbstractC0317q.m714c(r03.getDeclaredFields());
    L39:
        if (r13.hasNext() == false) goto L70;
        Field r92 = (Field) r13.next();
        if (AbstractC0307g.m699a(r92.getType(), String.class) == false) goto L39;
        r92.setAccessible(true);
        Object r10 = r92.get(r12);
        if ((r10 instanceof String) == false) goto L45;
        String r102 = (String) r10;
    L46:
        if (r102 == null) goto L39;
        if (AbstractC0425j.m1005J0(r102, "@", false) == true) goto L39;
        if (AbstractC0433r.m1033H0(r102, "wxid_", false) == true) goto L39;
        if (AbstractC0433r.m1033H0(r102, "[已删除]", false) == false) goto L56;
        return;
    L56:
        if (AbstractC0433r.m1033H0(r102, "(已删除)", false) == false) goto L58;
        return;
    L58:
        if (AbstractC0433r.m1033H0(r102, "[已删除]", false) == false) goto L61;
    L68:
        r92.set(r12, r102);
        return;
    L61:
        if (AbstractC0433r.m1033H0(r102, "(已删除)", false) == false) goto L64;
        r102 = "[已删除]".concat(AbstractC0425j.m1016U0(r102, "(已删除)"));
        goto L68
    L64:
        if (r102.length() == 0) goto L67;
        r6 = "[已删除] ".concat(r102);
    L67:
        r102 = r6;
        goto L68
    L45:
        r102 = null;
        goto L46
    L70:
        r03 = r03.getSuperclass();
        goto L34
    L96:
        return;
    }

    /* JADX INFO: renamed from: m */
    public static Object m1652m(Class r11, byte[] r12) {
        Object r02 = r11.newInstance();
        Method[] r1 = r11.getMethods();
        AbstractC0307g.m702d(r1, "getMethods(...)");
        int r2 = r1.length;
        int r4 = 0;
    L4:
        if (r4 >= r2) goto L13;
        Method r9 = r1[r4];
        if (AbstractC0307g.m699a(r9.getName(), "parseFrom") == false) goto L12;
        if (r9.getParameterTypes().length != 1) goto L12;
        if (AbstractC0307g.m699a(r9.getParameterTypes()[0], byte[].class) == false) goto L12;
    L14:
        if (r9 != null) goto L26;
        Method[] r112 = r11.getDeclaredMethods();
        AbstractC0307g.m702d(r112, "getDeclaredMethods(...)");
        int r13 = r112.length;
        int r22 = 0;
    L16:
        if (r22 >= r13) goto L25;
        Method r42 = r112[r22];
        if (AbstractC0307g.m699a(r42.getName(), "parseFrom") == false) goto L24;
        if (r42.getParameterTypes().length != 1) goto L24;
        if (AbstractC0307g.m699a(r42.getParameterTypes()[0], byte[].class) == false) goto L24;
        r9 = r42;
    L24:
        r22 = r22 + 1;
        goto L16
    L25:
        r9 = null;
    L26:
        if (r9 != null) goto L28;
        return null;
    L28:
        r9.setAccessible(true);
        Object r113 = r9.invoke(r02, new Object[]{r12});
        if (r113 != null) goto L32;
        return r02;
    L32:
        return r113;
    L12:
        r4 = r4 + 1;
        goto L4
    L13:
        r9 = null;
        goto L14
    }

    /* JADX INFO: renamed from: n */
    public static List m1653n(Object r2) {
        Object r22 = AbstractC0358S.m920y(r2, "CommentUserList");     // Catch: Throwable -> L4
    L7:
        if ((r22 instanceof C0140f) == false) goto L10;
        r22 = null;
    L10:
        if (AbstractC0317q.m713b(r22) == true) goto L12;
        return null;
    L12:
        return (List) r22;
    L4:
        th = move-exception;
        r22 = AbstractC0040p.m116u(th);
        goto L7
    }

    /* JADX INFO: renamed from: o */
    public static byte[] m1654o(Object r7) {
        Method[] r02 = r7.getClass().getMethods();
        AbstractC0307g.m702d(r02, "getMethods(...)");
        int r1 = r02.length;
        int r2 = 0;
    L4:
        if (r2 >= r1) goto L11;
        Method r4 = r02[r2];
        if (AbstractC0307g.m699a(r4.getName(), "toByteArray") == false) goto L10;
        Class<?>[] r5 = r4.getParameterTypes();
        AbstractC0307g.m702d(r5, "getParameterTypes(...)");
        if (r5.length != 0) goto L10;
    L12:
        if (r4 != null) goto L14;
        return null;
    L14:
        r4.setAccessible(true);
        Object r72 = r4.invoke(r7, null);
        if ((r72 instanceof byte[]) == true) goto L17;
        return null;
    L17:
        return (byte[]) r72;
    L10:
        r2 = r2 + 1;
        goto L4
    L11:
        r4 = null;
        goto L12
    }

    /* JADX INFO: renamed from: p */
    public static String m1655p(Class r2) {
        if (r2.isPrimitive() == false) goto L33;
        if (r2.equals(Void.TYPE) == false) goto L8;
        return "V";
    L8:
        if (r2.equals(Boolean.TYPE) == false) goto L11;
        return "Z";
    L11:
        if (r2.equals(Byte.TYPE) == false) goto L14;
        return "B";
    L14:
        if (r2.equals(Character.TYPE) == false) goto L17;
        return "C";
    L17:
        if (r2.equals(Short.TYPE) == false) goto L20;
        return "S";
    L20:
        if (r2.equals(Integer.TYPE) == false) goto L23;
        return "I";
    L23:
        if (r2.equals(Long.TYPE) == false) goto L26;
        return "J";
    L26:
        if (r2.equals(Float.TYPE) == false) goto L29;
        return "F";
    L29:
        if (r2.equals(Double.TYPE) == false) goto L45;
        return "D";
    L45:
        return "V";
    L33:
        if (r2.isArray() == false) goto L37;
        Class<?> r22 = r2.getComponentType();
        AbstractC0307g.m700b(r22);
        return AbstractC0324d.m725h("[", m1655p(r22));
    L37:
        return AbstractC0324d.m723f("L", AbstractC0433r.m1032G0(r2.getName(), '.', '/'), ";");
    }

    /* JADX INFO: renamed from: q */
    public static void m1656q(Object r11, ContentValues r12, String[] r13) {
        Class<?> r2 = r11.getClass();
    L3:
        Number r3 = null;
        if (r2 == null) goto L22;
        C0172c r4 = AbstractC0317q.m714c(r2.getDeclaredMethods());
    L7:
        if (r4.hasNext() == false) goto L21;
        Method r5 = (Method) r4.next();
        Class<?>[] r6 = r5.getParameterTypes();
        if (r6.length != 4) goto L7;
        if (AbstractC0307g.m699a(r6[0], String.class) == false) goto L7;
        if (AbstractC0307g.m699a(r6[1], ContentValues.class) == false) goto L7;
        if (AbstractC0307g.m699a(r6[2], String.class) == false) goto L7;
        if (AbstractC0307g.m699a(r6[3], String[].class) == true) goto L20;
        if (r6[3].getName().equals("[Ljava.lang.String;") == false) goto L7;
    L20:
        r5.setAccessible(true);
    L23:
        if (r5 != null) goto L42;
        return;
    L42:
        Object r112 = r5.invoke(r11, new Object[]{"SnsComment", r12, "rowid = ?", r13});     // Catch: Throwable -> L29
        if ((r112 instanceof Number) == false) goto L31;
        r3 = (Number) r112;     // Catch: Throwable -> L29
    L31:
        if (r3 == null) goto L33;
        int r113 = r3.intValue();     // Catch: Throwable -> L29
    L34:
        Object r114 = Integer.valueOf(r113);     // Catch: Throwable -> L29
    L38:
        if ((r114 instanceof C0140f) == false) goto L40;
        r114 = -1;
    L40:
        ((Number) r114).intValue();
        return;
    L33:
        r113 = -1;
    L29:
        th = move-exception;
        r114 = AbstractC0040p.m116u(th);
        goto L38
    L21:
        r2 = r2.getSuperclass();
        goto L3
    L22:
        r5 = null;
        goto L23
    }

    /* JADX INFO: renamed from: r */
    public static void m1657r(String r2) {
        AbstractC0762d.m1954d("[OKK-MomentsCmt] " + r2);     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1658i(Method r2, boolean r3, String r4) {
        r2.setAccessible(true);     // Catch: Throwable -> L5
        AbstractC0762d.m1952b(r2, new C0650e(this, r4, r3));     // Catch: Throwable -> L5
        Object r22 = Boolean.TRUE;     // Catch: Throwable -> L5
    L7:
        Object r32 = Boolean.FALSE;
        if ((r22 instanceof C0140f) == false) goto L11;
        r22 = r32;
    L11:
        return ((Boolean) r22).booleanValue();
    L5:
        th = move-exception;
        r22 = AbstractC0040p.m116u(th);
        goto L7
    }
}
