package p050c0;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.widget.TextView;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p007D0.C0143i;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p009E0.C0172c;
import p011F0.C0199c;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.N0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0610N0 {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f1874a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f1875b = null;

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f1876c = null;

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f1877d = null;

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap f1878e = null;

    /* JADX INFO: renamed from: f */
    public static volatile Method f1879f;

    /* JADX INFO: renamed from: g */
    public static volatile Method f1880g;

    /* JADX INFO: renamed from: h */
    public static volatile Object f1881h;

    /* JADX INFO: renamed from: i */
    public static volatile ClassLoader f1882i;

    static {
        f1874a = new AtomicBoolean(false);
        f1875b = new AtomicBoolean(false);
        f1876c = new AtomicBoolean(false);
        f1877d = ThreadLocal.withInitial(new C0681o0(1));
        f1878e = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static void m1496a(TextView r18, int r19) {
        ThreadLocal r2 = f1877d;
        if (AbstractC0307g.m699a(r2.get(), Boolean.TRUE) == false) goto L6;
        return;
    L6:
        if (r19 != 1) goto L8;
        C0661h1 r12 = C0661h1.f2048a;
        C0143i r11 = new C0143i(C0661h1.m1662d("member_title_owner", "群主"), "#FFC107", "#FFFFFF");
    L12:
        String r9 = (String) r11.f334a;
        String r122 = (String) r11.f335b;
        String r112 = (String) r11.f336c;
        CharSequence r13 = r18.getText();
        if (r13 != null) goto L16;
        return;
    L16:
        if (r13.length() != 0) goto L19;
        return;
    L19:
        if (r13.length() <= 120) goto L21;
        return;
    L21:
        boolean r14 = r13 instanceof Spanned;
        if (r14 == false) goto L30;
        C0607M0[] r02 = (C0607M0[]) ((Spanned) r13).getSpans(0, r13.length(), C0607M0.class);
        AbstractC0307g.m700b(r02);
        if (r02.length != 0) goto L26;
        boolean r16 = true;
    L28:
        if ((!r16) == false) goto L30;
        return;
    L26:
        r16 = false;
    L30:
        String r03 = r13.toString();
        if (AbstractC0433r.m1033H0(r03, r9 + " ", false) == false) goto L33;
    L36:
        if (r14 == true) goto L37;
    L35:
        ThreadLocal r17 = r2;
    L44:
        C0661h1 r04 = C0661h1.f2048a;
        Iterator r05 = AbstractC0182m.m556h0(new String[]{C0661h1.m1662d("member_title_owner", "群主"), C0661h1.m1662d("member_title_admin", "管理员"), C0661h1.m1662d("member_title_member", "成员")}).iterator();
    L46:
        if (r05.hasNext() == false) goto L53;
        String r1 = AbstractC0324d.m722e((String) r05.next(), " ");
        if (AbstractC0433r.m1033H0(r13.toString(), r1, false) == false) goto L46;
        if (r14 == false) goto L52;
        CharSequence r06 = new SpannableStringBuilder(r13, r1.length(), r13.length());
    L51:
        r13 = r06;
        goto L53
    L52:
        r06 = r13.toString().substring(r1.length());
        AbstractC0307g.m702d(r06, "substring(...)");
    L53:
        SpannableStringBuilder r07 = new SpannableStringBuilder();
        r07.append(r9);
        r07.append(" ");
        r07.append(r13);
        r07.setSpan(new C0607M0(m1503h(r122), m1503h(r112)), 0, r9.length(), 33);
        ThreadLocal r22 = r17;
        r22.set(Boolean.TRUE);
    L57:
        th = move-exception;
        r22.set(Boolean.FALSE);
        throw th;
    L55:
        if (r18.getVisibility() == 0) goto L59;
        TextView r15 = r18;
        r15.setVisibility(0);     // Catch: Throwable -> L57
    L60:
        r15.setTag(2114584578, Integer.valueOf(r19));     // Catch: Throwable -> L57
        r15.setText(r07, TextView.BufferType.SPANNABLE);     // Catch: Throwable -> L57
        r22.set(Boolean.FALSE);
        return;
    L59:
        r15 = r18;
        goto L60
    L37:
        r17 = r2;
        Object[] r08 = ((Spanned) r13).getSpans(0, Math.min(r9.length() + 1, r13.length()), ReplacementSpan.class);
        AbstractC0307g.m702d(r08, "getSpans(...)");
        if (r08.length != 0) goto L40;
        boolean r09 = true;
    L42:
        if ((!r09) == false) goto L44;
        return;
    L40:
        r09 = false;
        goto L42
    L33:
        if (AbstractC0433r.m1033H0(r03, r9, false) == false) goto L35;
    L8:
        if (r19 == 2) goto L10;
        C0661h1 r123 = C0661h1.f2048a;
        r11 = new C0143i(C0661h1.m1662d("member_title_member", "成员"), "#9E9E9E", "#FFFFFF");
        goto L12
    L10:
        C0661h1 r124 = C0661h1.f2048a;
        r11 = new C0143i(C0661h1.m1662d("member_title_admin", "管理员"), "#2196F3", "#FFFFFF");
        goto L12
    }

    /* JADX INFO: renamed from: b */
    public static Method m1497b(ClassLoader r11, String r12) {
        int r02 = AbstractC0425j.m1011P0(r12, "->", 0, false, 6);
        int r2 = AbstractC0425j.m1010O0(r12, '(', r02, false, 4);
        String r3 = r12.substring(1, r02 - 1);
        AbstractC0307g.m702d(r3, "substring(...)");
        String r32 = AbstractC0433r.m1032G0(r3, '/', '.');
        String r03 = r12.substring(r02 + 2, r2);
        AbstractC0307g.m702d(r03, "substring(...)");
        String r22 = r12.substring(r2);
        AbstractC0307g.m702d(r22, "substring(...)");
        Class<?> r112 = r11.loadClass(r32);
    L3:
        if (r112 == null) goto L22;
        Method[] r33 = r112.getDeclaredMethods();
        AbstractC0307g.m702d(r33, "getDeclaredMethods(...)");
        int r5 = r33.length;
        int r6 = 0;
    L5:
        if (r6 >= r5) goto L16;
        Method r7 = r33[r6];
        if (AbstractC0307g.m699a(r7.getName(), r03) == false) goto L15;
        StringBuilder r8 = new StringBuilder("(");
        C0172c r9 = AbstractC0317q.m714c(r7.getParameterTypes());
    L10:
        if (r9.hasNext() == false) goto L12;
        Class r10 = (Class) r9.next();
        AbstractC0307g.m700b(r10);
        r8.append(m1505j(r10));
        goto L10
    L12:
        r8.append(')');
        Class<?> r92 = r7.getReturnType();
        AbstractC0307g.m702d(r92, "getReturnType(...)");
        r8.append(m1505j(r92));
        String r82 = r8.toString();
        AbstractC0307g.m702d(r82, "toString(...)");
        if (r82.equals(r22) == false) goto L15;
    L17:
        if (r7 != null) goto L18;
        r112 = r112.getSuperclass();
        goto L3
    L18:
        r7.setAccessible(true);
        return r7;
    L15:
        r6 = r6 + 1;
        goto L5
    L16:
        r7 = null;
        goto L17
    L22:
        throw new NoSuchMethodException(r12);
    }

    /* JADX INFO: renamed from: c */
    public static Integer m1498c(Object r6) {
        Class<?> r02 = r6.getClass();
    L4:
        if (r02 == null) goto L21;
        if (r02.equals(Object.class) == true) goto L21;
        C0172c r2 = AbstractC0317q.m714c(r02.getDeclaredFields());
    L9:
        if (r2.hasNext() == false) goto L20;
        Field r3 = (Field) r2.next();
        if (AbstractC0307g.m699a(r3.getType(), Integer.TYPE) == true) goto L15;
        if (AbstractC0307g.m699a(r3.getType(), Integer.class) == false) goto L9;
    L15:
        if (Modifier.isStatic(r3.getModifiers()) == true) goto L9;
        r3.setAccessible(true);
        Object r62 = r3.get(r6);
        if ((r62 instanceof Integer) == true) goto L19;
        return null;
    L19:
        return (Integer) r62;
    L20:
        r02 = r02.getSuperclass();
    L21:
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1499d(Class r5) {
    L2:
        int r02 = 0;
        if (r5 == null) goto L14;
        if (r5.equals(Object.class) == true) goto L14;
        Field[] r1 = r5.getDeclaredFields();
        AbstractC0307g.m702d(r1, "getDeclaredFields(...)");
        int r2 = r1.length;
    L7:
        if (r02 >= r2) goto L13;
        if (AbstractC0307g.m699a(r1[r02].getName(), "field_roomowner") == true) goto L10;
        r02 = r02 + 1;
        goto L7
    L10:
        return true;
    L13:
        r5 = r5.getSuperclass();
    L14:
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1500e() {
        C0661h1 r02 = C0661h1.f2048a;     // Catch: Throwable -> L4
        Object r03 = Boolean.valueOf(C0661h1.m1661c("member_title", false));     // Catch: Throwable -> L4
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

    /* JADX INFO: renamed from: f */
    public static void m1501f(Context r7, String r8) {
        AtomicBoolean r1 = f1875b;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static void m1502g(Object r17, View r18, Object r19) {
        int r2 = 1;
        if (m1500e() == true) goto L5;
        return;
    L5:
        C0621R0 r02 = C0621R0.f1913a;
        C0613O0 r3 = C0621R0.m1524f(r19);
        if (r3 != null) goto L9;
        return;
    L9:
        if (r3.f1893c == true) goto L11;
        return;
    L11:
        Integer r4 = null;
        Integer r42 = null;
        Class<?> r6 = r19.getClass();     // Catch: Throwable -> L29
    L13:
        if (r6 == null) goto L31;
        if (r6.equals(Object.class) == true) goto L31;
        Field r03 = r6.getDeclaredField("field_isSend");     // Catch: Throwable -> L21
        r03.setAccessible(true);     // Catch: Throwable -> L21
        Object r04 = r03.get(r19);     // Catch: Throwable -> L21
        if ((r04 instanceof Number) == false) goto L24;
        if (((Number) r04).intValue() != 1) goto L60;
    L20:
        boolean r05 = true;
    L61:
        if (r05 == false) goto L63;
        return;
    L63:
        TextView r62 = C0621R0.f1913a.m1525d(r18, r17);
        if (r62 == null) goto L66;
        String r1 = r3.f1891a;
        String r7 = r3.f1892b;
        String r8 = r1 + "|" + r7;
        Integer r06 = (Integer) f1878e.get(r8);
        if (r06 == null) goto L75;
        int r07 = r06.intValue();
    L72:
        int r22 = r07;
    L73:
        int r12 = 3;
    L280:
        if (r22 == r12) goto L295;
    L291:
        r62.setTag(2114584578, Integer.valueOf(r22));
        r62.setTag(2114584579, r3.f1892b);
        m1496a(r62, r22);
        r62.post(new RunnableC0714z0(r62, r22, 1));
        if (f1876c.compareAndSet(false, true) == false) goto L345;
        m1506k("bound room=" + r3.f1891a + " sender=" + r3.f1892b + " role=" + r22 + " nick=" + r62.getText() + " vis=" + r62.getVisibility());
        return;
    L345:
        return;
    L295:
        C0661h1 r08 = C0661h1.f2048a;     // Catch: Throwable -> L283
        Object r09 = Boolean.valueOf(C0661h1.m1661c("member_title_show_member", true));     // Catch: Throwable -> L283
    L285:
        Boolean r13 = Boolean.TRUE;
        boolean r43 = r09 instanceof C0140f;
        Object r010 = r09;
        if (r43 == false) goto L289;
        r010 = r13;
    L289:
        if (((Boolean) r010).booleanValue() == true) goto L291;
        return;
    L283:
        th = move-exception;
        r09 = AbstractC0040p.m116u(th);
        goto L285
    L75:
        if (f1881h != null) goto L95;
        ClassLoader r11 = f1882i;
        if (r11 == null) goto L95;
        Method r011 = f1880g;
        if (r011 == null) goto L303;
        Class<?> r012 = r011.getDeclaringClass();
        if (r012 == null) goto L303;
    L94:
        m1504i(r11, r012);
    L303:
        Object r013 = r11.loadClass("com.tencent.mm.storage.u2");     // Catch: Throwable -> L86
    L88:
        boolean r122 = r013 instanceof C0140f;
        Object r014 = r013;
        if (r122 == false) goto L91;
        r014 = null;
    L91:
        r012 = (Class) r014;
        if (r012 != null) goto L94;
    L86:
        th = move-exception;
        r013 = AbstractC0040p.m116u(th);
    L95:
        Method r015 = f1880g;
        Object r112 = f1881h;
        Object r123 = C0146l.f339a;
        if (r015 == null) goto L122;
        if (r112 == null) goto L122;
        r015.setAccessible(true);     // Catch: Throwable -> L115
        Object r14 = r015.invoke(r112, new Object[]{r1});     // Catch: Throwable -> L115
        if (r14 != null) goto L101;
    L117:
        Object r016 = r123;
    L119:
        Throwable r017 = AbstractC0141g.m465a(r016);
        if (r017 == null) goto L122;
        m1506k("getGroup invoke: " + r017.getMessage());
        goto L122
    L101:
        if (m1499d(r14.getClass()) == false) goto L117;
        Object r018 = AbstractC0358S.m920y(r14, "field_roomowner");     // Catch: Throwable -> L106
        if ((r018 instanceof String) == false) goto L108;
        Object r019 = (String) r018;     // Catch: Throwable -> L106
    L110:
        boolean r15 = r019 instanceof C0140f;     // Catch: Throwable -> L115
        Object r020 = r019;
        if (r15 == false) goto L113;
        r020 = null;
    L113:
        String r021 = (String) r020;     // Catch: Throwable -> L115
        Object r142 = r14;
    L191:
        r22 = 2;
        if (r142 != null) goto L314;
        CopyOnWriteArrayList r022 = AbstractC0642b0.f1999a;
        AbstractC0307g.m703e(r1, "room");
        AbstractC0307g.m703e(r7, "sender");
        if (AbstractC0680o.m1744g(r1) == true) goto L233;
    L277:
        if (r42 == null) goto L279;
        r07 = r42.intValue();
        f1878e.put(r8, Integer.valueOf(r07));
        goto L72
    L279:
        r12 = 3;
        f1878e.put(r8, 3);
        r22 = 3;
        goto L280
    L233:
        if (AbstractC0425j.m1013R0(r7) == true) goto L277;
        C0199c r023 = new C0199c(10);
        Object r5 = AbstractC0642b0.f2000b.get();
        if (r5 == null) goto L238;
        r023.add(r5);
    L238:
        r023.addAll(AbstractC0642b0.f1999a);
        Iterator r024 = AbstractC0181l.m543o0(AbstractC0040p.m103f(r023)).iterator();
    L240:
        if (r024.hasNext() == false) goto L277;
        Object r52 = r024.next();
        AbstractC0307g.m700b(r52);
        Object r53 = AbstractC0642b0.m1623j(r52, "SELECT roomowner, roomdata FROM chatroom WHERE chatroomname=? LIMIT 1", new String[]{r1});
        if (r53 != null) goto L299;
    L243:
        Integer r10 = r42;
    L273:
        if (r10 == null) goto L240;
        r42 = Integer.valueOf(r10.intValue());
        goto L277
    L299:
        if (AbstractC0642b0.m1617d(r53) == true) goto L247;
        AbstractC0642b0.m1616c(r53);
        goto L243
    L247:
        String r9 = AbstractC0642b0.m1618e(r53, "roomowner");     // Catch: Throwable -> L250
        if (r9 != null) goto L252;
        r9 = AbstractC0642b0.m1619f(0, r53);     // Catch: Throwable -> L250
    L252:
        if (r9 == null) goto L254;
        Object r92 = AbstractC0425j.m1022a1(r9).toString();     // Catch: Throwable -> L250
    L256:
        if (AbstractC0307g.m699a(r92, r7) == false) goto L260;
        r10 = 1;
    L258:
        AbstractC0642b0.m1616c(r53);
        goto L273
    L260:
        byte[] r102 = AbstractC0642b0.m1614a(r53);     // Catch: Throwable -> L250
        if (r102 != null) goto L263;
        r102 = AbstractC0642b0.m1615b(1, r53);     // Catch: Throwable -> L250
    L263:
        if (r102 == null) goto L265;
        Integer r93 = AbstractC0642b0.m1621h(r102, r7);     // Catch: Throwable -> L250
    L266:
        if (r93 != null) goto L268;
    L270:
        int r94 = 3;
    L271:
        r10 = Integer.valueOf(r94);     // Catch: Throwable -> L250
        goto L258
    L268:
        if ((r93.intValue() & 2048) == 0) goto L270;
        r94 = 2;
        goto L271
    L265:
        r93 = r42;
        goto L266
    L254:
        r92 = r42;
    L250:
        th = move-exception;
        AbstractC0642b0.m1616c(r53);
        throw th;
    L314:
        Object r025 = AbstractC0358S.m920y(r142, "field_roomowner");     // Catch: Throwable -> L197
        if ((r025 instanceof String) == false) goto L199;
        Object r026 = (String) r025;     // Catch: Throwable -> L197
    L201:
        boolean r16 = r026 instanceof C0140f;
        Object r027 = r026;
        if (r16 == false) goto L204;
        r027 = r42;
    L204:
        String r028 = (String) r027;
        String r44 = r42;
        if (r028 == null) goto L207;
        r44 = AbstractC0425j.m1022a1(r028).toString();
    L207:
        if (r44 != 0) goto L209;
    L214:
        Method r029 = f1879f;
        if (r029 != null) goto L301;
    L229:
        f1878e.put(r8, 3);
        r12 = 3;
        r22 = 3;
        goto L280
    L301:
        Object r030 = r029.invoke(r142, new Object[]{r7});     // Catch: Throwable -> L224
        if (r030 == null) goto L226;
        Integer r031 = m1498c(r030);     // Catch: Throwable -> L224
        if (r031 == null) goto L226;
        if ((r031.intValue() & 2048) == 0) goto L226;
        f1878e.put(r8, 2);     // Catch: Throwable -> L224
    L226:
        Throwable r032 = AbstractC0141g.m465a(r123);
        if (r032 == null) goto L229;
        m1506k("getChatroomData invoke: " + r032.getMessage());
    L224:
        th = move-exception;
        r123 = AbstractC0040p.m116u(th);
        goto L226
    L209:
        if (r44.length() == 0) goto L214;
        if (r44.equals(r7) == false) goto L214;
        f1878e.put(r8, 1);
        r12 = 3;
        r22 = 1;
        goto L280
    L199:
        r026 = r42;
    L197:
        th = move-exception;
        r026 = AbstractC0040p.m116u(th);
        goto L201
    L108:
        r019 = null;
    L106:
        th = move-exception;
        r019 = AbstractC0040p.m116u(th);     // Catch: Throwable -> L115
    L115:
        th = move-exception;
        r016 = AbstractC0040p.m116u(th);
    L122:
        ClassLoader r143 = f1882i;
        if (r143 != null) goto L125;
    L124:
        r142 = r4;
        r42 = r4;
        goto L191
    L125:
        Method r033 = f1879f;
        if (r033 == null) goto L128;
        Class<?> r152 = r033.getDeclaringClass();
    L129:
        Iterator r45 = AbstractC0182m.m556h0(new String[]{"com.tencent.mm.storage.u2", "com.tencent.mm.storage.t2", "com.tencent.mm.model.z", "com.tencent.mm.model.s"}).iterator();
    L131:
        if (r45.hasNext() == false) goto L190;
        Object r034 = r143.loadClass((String) r45.next());     // Catch: Throwable -> L135
    L138:
        if ((r034 instanceof C0140f) == false) goto L140;
        r034 = null;
    L140:
        Class r95 = (Class) r034;
        if (r95 == null) goto L131;
        C0172c r103 = AbstractC0317q.m714c(r95.getDeclaredMethods());
    L145:
        if (r103.hasNext() == false) goto L131;
        Method r035 = (Method) r103.next();
        if (r035.getParameterTypes().length != r2) goto L145;
        if (AbstractC0307g.m699a(r035.getParameterTypes()[0], String.class) == true) goto L152;
    L150:
        r2 = 1;
        goto L145
    L152:
        Iterator r182 = r45;
        if (AbstractC0307g.m699a(r035.getReturnType(), Void.TYPE) == false) goto L155;
    L156:
        r45 = r182;
        goto L150
    L155:
        if (AbstractC0307g.m699a(r035.getReturnType(), String.class) == true) goto L156;
        if (r152 == null) goto L312;
        if (r152.isAssignableFrom(r035.getReturnType()) == true) goto L312;
        if (AbstractC0307g.m699a(r035.getReturnType(), r152) == true) goto L312;
        Class<?> r23 = r035.getReturnType();
        AbstractC0307g.m702d(r23, "getReturnType(...)");
        if (m1499d(r23) == false) goto L156;
    L312:
        r035.setAccessible(true);     // Catch: Throwable -> L172
        if (Modifier.isStatic(r035.getModifiers()) == true) goto L168;
        Integer r46 = null;
        r46 = null;
        if (r112 != null) goto L177;
    L180:
        Object r036 = null;
    L182:
        boolean r24 = r036 instanceof C0140f;
        Object r037 = r036;
        if (r24 == false) goto L185;
        r037 = r46;
    L185:
        if (r037 == null) goto L156;
        if (m1499d(r037.getClass()) == false) goto L156;
        r142 = r037;
        r42 = r46;
        goto L191
    L177:
        if (r95.isInstance(r112) == false) goto L180;
        r036 = r035.invoke(r112, new Object[]{r1});     // Catch: Throwable -> L170
        goto L182
    L168:
        Integer r47 = null;
        r46 = null;
        r036 = r035.invoke(null, new Object[]{r1});     // Catch: Throwable -> L170
    L170:
        th = th;
    L181:
        r036 = AbstractC0040p.m116u(th);
        r46 = r47;
    L172:
        th = th;
        r47 = null;
    L135:
        th = move-exception;
        r034 = AbstractC0040p.m116u(th);
        goto L138
    L190:
        r4 = null;
        goto L124
    L128:
        r152 = null;
        goto L129
    L66:
        if (f1876c.compareAndSet(false, true) == false) goto L344;
        m1506k("nickname missing holder=".concat(r17.getClass().getName()));
        return;
    L344:
        return;
    L60:
        r05 = false;
        goto L61
    L24:
        if ((r04 instanceof Boolean) == false) goto L60;
        r05 = ((Boolean) r04).booleanValue();     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        AbstractC0040p.m116u(th);     // Catch: Throwable -> L29
        r6 = r6.getSuperclass();     // Catch: Throwable -> L29
    L31:
        Iterator r63 = AbstractC0182m.m556h0(new String[]{"getIsSend", "isSend"}).iterator();
    L33:
        if (r63.hasNext() == false) goto L60;
        String r038 = (String) r63.next();
        Method[] r72 = r19.getClass().getMethods();
        AbstractC0307g.m702d(r72, "getMethods(...)");
        int r82 = r72.length;
        int r96 = 0;
    L35:
        if (r96 >= r82) goto L42;
        Method r104 = r72[r96];
        if (AbstractC0307g.m699a(r104.getName(), r038) == false) goto L41;
        Class<?>[] r113 = r104.getParameterTypes();
        AbstractC0307g.m702d(r113, "getParameterTypes(...)");
        if (r113.length != 0) goto L41;
    L43:
        if (r104 == null) goto L33;
        r104.setAccessible(true);     // Catch: Throwable -> L47
        Object r039 = r104.invoke(r19, null);     // Catch: Throwable -> L47
    L50:
        if ((r039 instanceof C0140f) == false) goto L53;
        r039 = null;
    L53:
        if ((r039 instanceof Number) == true) goto L55;
        if ((r039 instanceof Boolean) == false) goto L33;
        r05 = ((Boolean) r039).booleanValue();
        goto L61
    L55:
        if (((Number) r039).intValue() != 1) goto L60;
    L47:
        th = move-exception;
        r039 = AbstractC0040p.m116u(th);
    L41:
        r96 = r96 + 1;
        goto L35
    L42:
        r104 = null;
    L29:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L31
    }

    /* JADX INFO: renamed from: h */
    public static int m1503h(String r2) {
        Object r22 = Integer.valueOf(Color.parseColor(r2));     // Catch: Throwable -> L4
    L7:
        if ((r22 instanceof C0140f) == false) goto L10;
        r22 = -7829368;
    L10:
        return ((Number) r22).intValue();
    L4:
        th = move-exception;
        r22 = AbstractC0040p.m116u(th);
        goto L7
    }

    /* JADX INFO: renamed from: i */
    public static void m1504i(ClassLoader r17, Class r18) {
        Object r3 = C0146l.f339a;
        char r10 = 0;
        Class<?> r02 = r17.loadClass("rk0.k1");     // Catch: Throwable -> L12
        Class<?> r12 = r17.loadClass("gt1.f");     // Catch: Throwable -> L12
        Method[] r03 = r02.getDeclaredMethods();     // Catch: Throwable -> L12
        AbstractC0307g.m702d(r03, "getDeclaredMethods(...)");     // Catch: Throwable -> L12
        int r13 = r03.length;     // Catch: Throwable -> L12
        int r14 = 0;
    L4:
        if (r14 >= r13) goto L15;
        Method r15 = r03[r14];     // Catch: Throwable -> L12
        if (Modifier.isStatic(r15.getModifiers()) == false) goto L14;
        if (r15.getParameterTypes().length != 1) goto L14;
        if (AbstractC0307g.m699a(r15.getParameterTypes()[r10], Class.class) == false) goto L14;
    L16:
        if (r15 == null) goto L65;
        r15.setAccessible(true);     // Catch: Throwable -> L12
        Object r04 = r15.invoke(null, new Object[]{r12});     // Catch: Throwable -> L12
        if (r04 == null) goto L65;
        Method[] r102 = r04.getClass().getMethods();     // Catch: Throwable -> L12
        AbstractC0307g.m702d(r102, "getMethods(...)");     // Catch: Throwable -> L12
        int r11 = r102.length;     // Catch: Throwable -> L12
        int r122 = 0;
    L22:
        if (r122 >= r11) goto L31;
        Method r132 = r102[r122];     // Catch: Throwable -> L12
        Class<?>[] r142 = r132.getParameterTypes();     // Catch: Throwable -> L12
        AbstractC0307g.m702d(r142, "getParameterTypes(...)");     // Catch: Throwable -> L12
        if (r142.length != 0) goto L30;
        if (Modifier.isStatic(r132.getModifiers()) == true) goto L30;
        if (r18.isAssignableFrom(r132.getReturnType()) == false) goto L30;
    L32:
        if (r132 != null) goto L42;
        Method[] r103 = r04.getClass().getMethods();     // Catch: Throwable -> L12
        AbstractC0307g.m702d(r103, "getMethods(...)");     // Catch: Throwable -> L12
        int r112 = r103.length;     // Catch: Throwable -> L12
        int r123 = 0;
    L34:
        if (r123 >= r112) goto L41;
        r132 = r103[r123];     // Catch: Throwable -> L12
        if (AbstractC0307g.m699a(r132.getName(), "a") == false) goto L40;
        Class<?>[] r143 = r132.getParameterTypes();     // Catch: Throwable -> L12
        AbstractC0307g.m702d(r143, "getParameterTypes(...)");     // Catch: Throwable -> L12
        if (r143.length == 0) goto L42;
    L40:
        r123 = r123 + 1;     // Catch: Throwable -> L12
        goto L34
    L41:
        r132 = null;
    L42:
        if (r132 == null) goto L49;
        r132.setAccessible(true);     // Catch: Throwable -> L12
        Object r113 = r132.invoke(r04, null);     // Catch: Throwable -> L12
        if (r113 == null) goto L49;
        if (r18.isInstance(r113) == false) goto L49;
        f1881h = r113;     // Catch: Throwable -> L12
        m1506k("chatroomStorage via rk0.k1.s(gt1.f)." + r132.getName() + "()");     // Catch: Throwable -> L12
        return;
    L49:
        Class<?> r104 = r04.getClass();     // Catch: Throwable -> L12
    L50:
        if (r104 == null) goto L65;
        if (r104.equals(Object.class) == true) goto L65;
        C0172c r114 = AbstractC0317q.m714c(r104.getDeclaredFields());     // Catch: Throwable -> L12
    L55:
        if (r114.hasNext() == false) goto L63;
        Field r124 = (Field) r114.next();     // Catch: Throwable -> L12
        if (r18.isAssignableFrom(r124.getType()) == false) goto L55;
        r124.setAccessible(true);     // Catch: Throwable -> L12
        Object r133 = r124.get(r04);     // Catch: Throwable -> L12
        if (r133 == null) goto L55;
        f1881h = r133;     // Catch: Throwable -> L12
        m1506k("chatroomStorage field " + r104.getName() + "#" + r124.getName());     // Catch: Throwable -> L12
        return;
    L63:
        r104 = r104.getSuperclass();     // Catch: Throwable -> L12
    L30:
        r122 = r122 + 1;     // Catch: Throwable -> L12
        goto L22
    L31:
        r132 = null;
    L65:
        Object r05 = r3;
    L67:
        Throwable r06 = AbstractC0141g.m465a(r05);
        if (r06 == null) goto L160;
        m1506k("rk0.k1.s path: " + r06.getMessage());
    L160:
        Method[] r07 = r17.loadClass("iy0.c9").getDeclaredMethods();     // Catch: Throwable -> L79
        AbstractC0307g.m702d(r07, "getDeclaredMethods(...)");     // Catch: Throwable -> L79
        int r5 = r07.length;     // Catch: Throwable -> L79
        int r105 = 0;
    L71:
        if (r105 >= r5) goto L82;
        Method r115 = r07[r105];     // Catch: Throwable -> L79
        if (Modifier.isStatic(r115.getModifiers()) == false) goto L81;
        if (AbstractC0307g.m699a(r115.getName(), "b") == false) goto L81;
        Class<?>[] r125 = r115.getParameterTypes();     // Catch: Throwable -> L79
        AbstractC0307g.m702d(r125, "getParameterTypes(...)");     // Catch: Throwable -> L79
        if (r125.length != 0) goto L81;
    L83:
        if (r115 == null) goto L106;
        r115.setAccessible(true);     // Catch: Throwable -> L79
        Object r08 = r115.invoke(null, null);     // Catch: Throwable -> L79
        if (r08 == null) goto L106;
        Method[] r52 = r08.getClass().getMethods();     // Catch: Throwable -> L79
        AbstractC0307g.m702d(r52, "getMethods(...)");     // Catch: Throwable -> L79
        int r7 = r52.length;     // Catch: Throwable -> L79
        int r106 = 0;
    L89:
        if (r106 >= r7) goto L98;
        Method r116 = r52[r106];     // Catch: Throwable -> L79
        if (AbstractC0307g.m699a(r116.getName(), "m") == false) goto L97;
        Class<?>[] r126 = r116.getParameterTypes();     // Catch: Throwable -> L79
        AbstractC0307g.m702d(r126, "getParameterTypes(...)");     // Catch: Throwable -> L79
        if (r126.length != 0) goto L97;
        if (r18.isAssignableFrom(r116.getReturnType()) == false) goto L97;
    L99:
        if (r116 == null) goto L106;
        r116.setAccessible(true);     // Catch: Throwable -> L79
        Object r09 = r116.invoke(r08, null);     // Catch: Throwable -> L79
        if (r09 == null) goto L106;
        f1881h = r09;     // Catch: Throwable -> L79
        m1506k("chatroomStorage via iy0.c9.b().m()");     // Catch: Throwable -> L79
        return;
    L97:
        r106 = r106 + 1;     // Catch: Throwable -> L79
        goto L89
    L98:
        r116 = null;
    L106:
        Throwable r010 = AbstractC0141g.m465a(r3);
        if (r010 == null) goto L109;
        m1506k("iy0.c9 path: " + r010.getMessage());
    L109:
        Iterator r32 = AbstractC0182m.m556h0(new String[]{"com.tencent.mm.model.z", "com.tencent.mm.model.s", "rk0.k1"}).iterator();
    L111:
        if (r32.hasNext() == false) goto L153;
        String r53 = (String) r32.next();
        Object r011 = r17.loadClass(r53);     // Catch: Throwable -> L115
    L114:
        Object r107 = r011;
        if ((r107 instanceof C0140f) == false) goto L120;
        r107 = null;
    L120:
        Class r108 = (Class) r107;
        if (r108 == null) goto L111;
        C0172c r6 = AbstractC0317q.m714c(r108.getDeclaredMethods());
    L125:
        if (r6.hasNext() == false) goto L111;
        Method r72 = (Method) r6.next();
        if (Modifier.isStatic(r72.getModifiers()) == false) goto L125;
        Class<?>[] r012 = r72.getParameterTypes();
        AbstractC0307g.m702d(r012, "getParameterTypes(...)");
        if (r012.length != 0) goto L131;
        boolean r013 = true;
    L133:
        if ((!r013) == true) goto L125;
        if (r18.isAssignableFrom(r72.getReturnType()) == false) goto L125;
        r72.setAccessible(true);     // Catch: Throwable -> L143
        Object r109 = null;
        Object r014 = r72.invoke(null, null);     // Catch: Throwable -> L141
    L147:
        if ((r014 instanceof C0140f) == false) goto L149;
        r014 = r109;
    L149:
        if (r014 == null) goto L125;
        f1881h = r014;
        m1506k("chatroomStorage via " + r53 + "#" + r72.getName());
        return;
    L141:
        th = th;
    L145:
        r014 = AbstractC0040p.m116u(th);
    L143:
        th = th;
        r109 = null;
        goto L145
    L131:
        r013 = false;
    L115:
        th = move-exception;
        r011 = AbstractC0040p.m116u(th);
        goto L114
    L153:
        m1506k("chatroomStorage unresolved — will use DB / class static");
        return;
    L81:
        r105 = r105 + 1;     // Catch: Throwable -> L79
        goto L71
    L82:
        r115 = null;
    L79:
        th = move-exception;
        r3 = AbstractC0040p.m116u(th);
    L14:
        r14 = r14 + 1;     // Catch: Throwable -> L12
        r10 = 0;
        goto L4
    L15:
        r15 = null;
    L12:
        th = move-exception;
        r05 = AbstractC0040p.m116u(th);
        goto L67
    }

    /* JADX INFO: renamed from: j */
    public static String m1505j(Class r2) {
        if (r2.isPrimitive() == false) goto L31;
        if (r2.equals(Boolean.TYPE) == false) goto L8;
        return "Z";
    L8:
        if (r2.equals(Byte.TYPE) == false) goto L11;
        return "B";
    L11:
        if (r2.equals(Character.TYPE) == false) goto L14;
        return "C";
    L14:
        if (r2.equals(Short.TYPE) == false) goto L17;
        return "S";
    L17:
        if (r2.equals(Integer.TYPE) == false) goto L20;
        return "I";
    L20:
        if (r2.equals(Long.TYPE) == false) goto L23;
        return "J";
    L23:
        if (r2.equals(Float.TYPE) == false) goto L26;
        return "F";
    L26:
        if (r2.equals(Double.TYPE) == false) goto L28;
        return "D";
    L28:
        r2.equals(Void.TYPE);
        return "V";
    L31:
        if (r2.isArray() == false) goto L35;
        Class<?> r22 = r2.getComponentType();
        AbstractC0307g.m700b(r22);
        return AbstractC0324d.m725h("[", m1505j(r22));
    L35:
        return AbstractC0324d.m723f("L", AbstractC0433r.m1032G0(r2.getName(), '.', '/'), ";");
    }

    /* JADX INFO: renamed from: k */
    public static void m1506k(String r2) {
        AbstractC0762d.m1954d("[OKK-MemberTitle] " + r2);     // Catch: Throwable -> L5
        return;
    }
}
