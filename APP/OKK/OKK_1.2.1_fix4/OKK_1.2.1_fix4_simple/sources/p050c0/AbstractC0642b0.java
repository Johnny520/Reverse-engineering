package p050c0;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import p001A0.AbstractC0040p;
import p007D0.C0139e;
import p007D0.C0140f;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p011F0.C0199c;
import p031Q0.AbstractC0307g;
import p031Q0.C0316p;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;
import p042W0.AbstractC0416a;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0642b0 {

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArrayList f1999a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicReference f2000b = null;

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f2001c = null;

    static {
        f1999a = new CopyOnWriteArrayList();
        f2000b = new AtomicReference(null);
        f2001c = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m1614a(Object r9) {
        Method[] r2 = r9.getClass().getMethods();     // Catch: Throwable -> L11
        AbstractC0307g.m702d(r2, "getMethods(...)");     // Catch: Throwable -> L11
        int r3 = r2.length;     // Catch: Throwable -> L11
        int r4 = 0;
    L4:
        Number r5 = null;
        if (r4 >= r3) goto L14;
        Method r6 = r2[r4];     // Catch: Throwable -> L11
        if (AbstractC0307g.m699a(r6.getName(), "getColumnIndex") == false) goto L13;
        if (r6.getParameterTypes().length != 1) goto L13;
    L15:
        if (r6 != null) goto L17;
        return null;
    L17:
        Object r02 = r6.invoke(r9, new Object[]{"roomdata"});     // Catch: Throwable -> L11
        if ((r02 instanceof Number) == false) goto L20;
        r5 = (Number) r02;     // Catch: Throwable -> L11
    L20:
        if (r5 == null) goto L22;
        int r03 = r5.intValue();     // Catch: Throwable -> L11
    L23:
        Object r04 = Integer.valueOf(r03);     // Catch: Throwable -> L11
    L27:
        if ((r04 instanceof C0140f) == false) goto L30;
        r04 = -1;
    L30:
        return m1615b(((Number) r04).intValue(), r9);
    L22:
        r03 = -1;
    L13:
        r4 = r4 + 1;     // Catch: Throwable -> L11
        goto L4
    L14:
        r6 = null;
    L11:
        th = move-exception;
        r04 = AbstractC0040p.m116u(th);
        goto L27
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m1615b(int r9, Object r10) {
        byte[] r02 = null;
        if (r9 >= 0) goto L5;
        return null;
    L5:
        int r1 = 0;
        Method[] r2 = r10.getClass().getMethods();     // Catch: Throwable -> L14
        AbstractC0307g.m702d(r2, "getMethods(...)");     // Catch: Throwable -> L14
        int r3 = r2.length;     // Catch: Throwable -> L14
        int r4 = 0;
    L8:
        if (r4 >= r3) goto L17;
        Method r6 = r2[r4];     // Catch: Throwable -> L14
        if (AbstractC0307g.m699a(r6.getName(), "getBlob") == false) goto L16;
        if (r6.getParameterTypes().length != 1) goto L16;
    L18:
        if (r6 != null) goto L20;
    L19:
        Object r22 = null;
    L26:
        if ((r22 instanceof C0140f) == false) goto L28;
        r22 = null;
    L28:
        byte[] r23 = (byte[]) r22;
        if (r23 == null) goto L31;
        return r23;
    L31:
        String r92 = m1619f(r9, r10);
        if (r92 == null) goto L34;
        String r93 = AbstractC0425j.m1022a1(r92).toString();
    L36:
        if (r93 != null) goto L38;
        r93 = "";
    L38:
        String r94 = AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(AbstractC0425j.m1016U0(r93, "hex->"), " ", "", false), "\n", "", false), "\r", "", false);
        if (r94.length() >= 2) goto L41;
    L48:
        return r02;
    L41:
        if ((r94.length() % 2) != 0) goto L48;
        Pattern r102 = Pattern.compile("[0-9a-fA-F]+");
        AbstractC0307g.m702d(r102, "compile(...)");
        if (r102.matcher(r94).matches() == false) goto L48;
        int r103 = r94.length() / 2;
        r02 = new byte[r103];
    L46:
        if (r1 >= r103) goto L48;
        int r24 = r1 * 2;
        String r25 = r94.substring(r24, r24 + 2);
        AbstractC0307g.m702d(r25, "substring(...)");
        AbstractC0358S.m890i(16);
        r02[r1] = (byte) Integer.parseInt(r25, 16);
        r1 = r1 + 1;
        goto L46
    L34:
        r93 = null;
        goto L36
    L20:
        r6.setAccessible(true);     // Catch: Throwable -> L14
        Object r26 = r6.invoke(r10, new Object[]{Integer.valueOf(r9)});     // Catch: Throwable -> L14
        if ((r26 instanceof byte[]) == false) goto L19;
        r22 = (byte[]) r26;     // Catch: Throwable -> L14
    L16:
        r4 = r4 + 1;     // Catch: Throwable -> L14
        goto L8
    L17:
        r6 = null;
    L14:
        th = move-exception;
        r22 = AbstractC0040p.m116u(th);
        goto L26
    }

    /* JADX INFO: renamed from: c */
    public static void m1616c(Object r7) {
        Method[] r02 = r7.getClass().getMethods();     // Catch: Throwable -> L10
        AbstractC0307g.m702d(r02, "getMethods(...)");     // Catch: Throwable -> L10
        int r1 = r02.length;     // Catch: Throwable -> L10
        int r2 = 0;
    L4:
        if (r2 >= r1) goto L13;
        Method r4 = r02[r2];     // Catch: Throwable -> L10
        if (AbstractC0307g.m699a(r4.getName(), "close") == false) goto L12;
        Class<?>[] r5 = r4.getParameterTypes();     // Catch: Throwable -> L10
        AbstractC0307g.m702d(r5, "getParameterTypes(...)");     // Catch: Throwable -> L10
        if (r5.length != 0) goto L12;
    L14:
        if (r4 != null) goto L16;
        return;
    L16:
        r4.setAccessible(true);     // Catch: Throwable -> L10
        r4.invoke(r7, null);     // Catch: Throwable -> L10
        return;
    L12:
        r2 = r2 + 1;     // Catch: Throwable -> L10
        goto L4
    L13:
        r4 = null;
    L10:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1617d(Object r8) {
        Method[] r02 = r8.getClass().getMethods();     // Catch: Throwable -> L10
        AbstractC0307g.m702d(r02, "getMethods(...)");     // Catch: Throwable -> L10
        int r1 = r02.length;     // Catch: Throwable -> L10
        boolean r2 = false;
        int r3 = 0;
    L3:
        Boolean r4 = null;
        if (r3 >= r1) goto L13;
        Method r5 = r02[r3];     // Catch: Throwable -> L10
        if (AbstractC0307g.m699a(r5.getName(), "moveToFirst") == false) goto L12;
        Class<?>[] r6 = r5.getParameterTypes();     // Catch: Throwable -> L10
        AbstractC0307g.m702d(r6, "getParameterTypes(...)");     // Catch: Throwable -> L10
        if (r6.length != 0) goto L12;
    L14:
        if (r5 != null) goto L16;
        return false;
    L16:
        r5.setAccessible(true);     // Catch: Throwable -> L10
        Object r82 = r5.invoke(r8, null);     // Catch: Throwable -> L10
        if ((r82 instanceof Boolean) == false) goto L19;
        r4 = (Boolean) r82;     // Catch: Throwable -> L10
    L19:
        if (r4 == null) goto L21;
        r2 = r4.booleanValue();     // Catch: Throwable -> L10
    L21:
        Object r83 = Boolean.valueOf(r2);     // Catch: Throwable -> L10
    L24:
        Object r03 = Boolean.FALSE;
        if ((r83 instanceof C0140f) == false) goto L28;
        r83 = r03;
    L28:
        return ((Boolean) r83).booleanValue();
    L12:
        r3 = r3 + 1;     // Catch: Throwable -> L10
        goto L3
    L13:
        r5 = null;
    L10:
        th = move-exception;
        r83 = AbstractC0040p.m116u(th);
        goto L24
    }

    /* JADX INFO: renamed from: e */
    public static String m1618e(Object r8, String r9) {
        Object r02 = null;
        Method[] r1 = r8.getClass().getMethods();     // Catch: Throwable -> L11
        AbstractC0307g.m702d(r1, "getMethods(...)");     // Catch: Throwable -> L11
        int r2 = r1.length;     // Catch: Throwable -> L11
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L14;
        Method r5 = r1[r3];     // Catch: Throwable -> L11
        if (AbstractC0307g.m699a(r5.getName(), "getColumnIndex") == false) goto L13;
        if (r5.getParameterTypes().length != 1) goto L13;
    L15:
        if (r5 != null) goto L17;
        return null;
    L17:
        r5.setAccessible(true);     // Catch: Throwable -> L11
        Object r12 = r5.invoke(r8, new Object[]{r9});     // Catch: Throwable -> L11
        if ((r12 instanceof Number) == false) goto L20;
        Number r13 = (Number) r12;     // Catch: Throwable -> L11
    L21:
        if (r13 == null) goto L23;
        int r14 = r13.intValue();     // Catch: Throwable -> L11
    L24:
        if (r14 >= 0) goto L26;
        r14 = m1622i(r8, r9);     // Catch: Throwable -> L11
    L26:
        if (r14 >= 0) goto L28;
        return null;
    L28:
        Object r82 = m1619f(r14, r8);     // Catch: Throwable -> L11
    L32:
        if ((r82 instanceof C0140f) == true) goto L36;
        r02 = r82;
    L36:
        return (String) r02;
    L23:
        r14 = -1;
        goto L24
    L20:
        r13 = null;
    L13:
        r3 = r3 + 1;     // Catch: Throwable -> L11
        goto L5
    L14:
        r5 = null;
    L11:
        th = move-exception;
        r82 = AbstractC0040p.m116u(th);
        goto L32
    }

    /* JADX INFO: renamed from: f */
    public static String m1619f(int r8, Object r9) {
        Object r02 = null;
        if (r8 >= 0) goto L31;
        return null;
    L31:
        Method[] r1 = r9.getClass().getMethods();     // Catch: Throwable -> L13
        AbstractC0307g.m702d(r1, "getMethods(...)");     // Catch: Throwable -> L13
        int r2 = r1.length;     // Catch: Throwable -> L13
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L16;
        Method r5 = r1[r3];     // Catch: Throwable -> L13
        if (AbstractC0307g.m699a(r5.getName(), "getString") == false) goto L15;
        if (r5.getParameterTypes().length != 1) goto L15;
    L17:
        if (r5 != null) goto L19;
        return null;
    L19:
        r5.setAccessible(true);     // Catch: Throwable -> L13
        Object r82 = r5.invoke(r9, new Object[]{Integer.valueOf(r8)});     // Catch: Throwable -> L13
        if ((r82 instanceof String) == false) goto L23;
        Object r83 = (String) r82;     // Catch: Throwable -> L13
    L26:
        if ((r83 instanceof C0140f) == true) goto L30;
        r02 = r83;
    L30:
        return (String) r02;
    L23:
        r83 = null;
    L15:
        r3 = r3 + 1;     // Catch: Throwable -> L13
        goto L7
    L16:
        r5 = null;
    L13:
        th = move-exception;
        r83 = AbstractC0040p.m116u(th);
        goto L26
    }

    /* JADX INFO: renamed from: g */
    public static String m1620g(String r9, String r10) {
        String r02 = null;
        if (r9 == null) goto L5;
        String r92 = AbstractC0425j.m1022a1(r9).toString();
    L6:
        if (r92 != null) goto L8;
        r92 = "";
    L8:
        String r102 = AbstractC0680o.m1741d(r10);
        ConcurrentHashMap r1 = f2001c;
        if (r102 == null) goto L15;
        if (r92.length() <= 0) goto L13;
        r1.put(r92, r102);
    L13:
        return r102;
    L15:
        if (r92.length() <= 0) goto L20;
        String r103 = (String) r1.get(r92);
        if (r103 == null) goto L20;
        return r103;
    L20:
        if (r92.length() > 0) goto L22;
        return "对方";
    L22:
        if (AbstractC0680o.m1744g(r92) == true) goto L66;
        C0199c r104 = new C0199c(10);
        Object r2 = f2000b.get();
        if (r2 == null) goto L26;
        r104.add(r2);
    L26:
        r104.addAll(f1999a);
        Iterator r105 = AbstractC0181l.m543o0(AbstractC0040p.m103f(r104)).iterator();
    L28:
        if (r105.hasNext() == false) goto L46;
        Object r22 = r105.next();
        AbstractC0307g.m700b(r22);
        Iterator r3 = AbstractC0182m.m556h0(new C0139e[]{new C0139e("SELECT conRemark, nickname, alias FROM rcontact WHERE username=? LIMIT 1", new String[]{r92}), new C0139e("SELECT conRemark, nickname, alias FROM rcontact WHERE username=? OR encryptUsername=? LIMIT 1", new String[]{r92, r92}), new C0139e(AbstractC0324d.m723f("SELECT conRemark, nickname, alias FROM rcontact WHERE username='", AbstractC0433r.m1031F0(r92, "'", "''", false), "' LIMIT 1"), new String[0])}).iterator();
    L31:
        if (r3.hasNext() == false) goto L43;
        C0139e r4 = (C0139e) r3.next();
        Object r42 = m1624k(r22, (String) r4.f328a, (String[]) r4.f329b);     // Catch: Throwable -> L35
    L38:
        if ((r42 instanceof C0140f) == false) goto L40;
        r42 = null;
    L40:
        String r43 = (String) r42;
        if (r43 == null) goto L31;
    L44:
        if (r43 == null) goto L28;
        r02 = r43;
    L35:
        th = move-exception;
        r42 = AbstractC0040p.m116u(th);
        goto L38
    L43:
        r43 = null;
    L46:
        if (r02 == null) goto L67;
        r1.put(r92, r02);
        if (r1.size() <= 800) goto L53;
        Set r93 = r1.keySet();
        AbstractC0307g.m702d(r93, "<get-keys>(...)");
        Iterator r94 = AbstractC0181l.m549u0(200, r93).iterator();
    L51:
        if (r94.hasNext() == false) goto L53;
        r1.remove((String) r94.next());
    L53:
        return r02;
    L67:
        return "对方";
    L66:
        return "对方";
    L5:
        r92 = null;
        goto L6
    }

    /* JADX INFO: renamed from: h */
    public static Integer m1621h(byte[] r16, String r17) {
        int r2 = 0;
    L3:
        C0139e r4 = null;
        if (r2 >= r16.length) goto L55;
        C0139e r22 = m1625l(r16, r2);
        if (r22 == null) goto L7;
        int r3 = ((Number) r22.f329b).intValue();
        Number r23 = (Number) r22.f328a;
        int r5 = (int) (r23.longValue() >>> 3);
        int r24 = (int) (r23.longValue() & 7);
        if (r5 != 1) goto L52;
        if (r24 != 2) goto L52;
        C0139e r25 = m1625l(r16, r3);
        if (r25 == null) goto L14;
        int r32 = ((Number) r25.f329b).intValue();
        r2 = ((int) ((Number) r25.f328a).longValue()) + r32;
        int r8 = r16.length;
        if (r2 <= r8) goto L18;
        r2 = r8;
    L18:
        if (r2 < r32) goto L19;
        int r9 = 0;
        String r82 = null;
    L21:
        if (r32 >= r2) goto L44;
        C0139e r33 = m1625l(r16, r32);
        if (r33 == null) goto L46;
        int r12 = ((Number) r33.f329b).intValue();
        Number r34 = (Number) r33.f328a;
        int r13 = (int) (r34.longValue() >>> 3);
        int r35 = (int) (r34.longValue() & 7);
        if (r13 != 1) goto L35;
        if (r35 != 2) goto L35;
        C0139e r36 = m1625l(r16, r12);
        if (r36 == null) goto L46;
        int r83 = ((Number) r36.f329b).intValue();
        r32 = ((int) ((Number) r36.f328a).longValue()) + r83;
        if (r32 <= r2) goto L34;
        r32 = r2;
    L34:
        AbstractC0040p.m114s(r32, r16.length);
        byte[] r84 = Arrays.copyOfRange(r16, r83, r32);
        AbstractC0307g.m702d(r84, "copyOfRange(...)");
        r82 = AbstractC0425j.m1022a1(new String(r84, AbstractC0416a.f921a)).toString();
    L35:
        if (r13 != 3) goto L41;
        if (r35 != 0) goto L41;
        C0139e r37 = m1625l(r16, r12);
        if (r37 == null) goto L46;
        r9 = (int) ((Number) r37.f328a).longValue();
        r32 = ((Number) r37.f329b).intValue();
    L41:
        Integer r38 = m1627n(r16, r12, r35, r2);
        if (r38 == null) goto L46;
        r32 = r38.intValue();
    L46:
        if (r4 == null) goto L3;
        String r39 = (String) r4.f328a;
        int r42 = ((Number) r4.f329b).intValue();
        if (AbstractC0307g.m699a(r39, r17) == false) goto L3;
        return Integer.valueOf(r42);
    L44:
        if (r82 == null) goto L46;
        r4 = new C0139e(r82, Integer.valueOf(r9));
        goto L46
    L19:
        return null;
    L14:
        return null;
    L52:
        Integer r26 = m1627n(r16, r3, r24, r16.length);
        if (r26 == null) goto L55;
        r2 = r26.intValue();
        goto L3
    L7:
        return null;
    L55:
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static int m1622i(Object r11, String r12) {
        Method[] r2 = r11.getClass().getMethods();     // Catch: Throwable -> L11
        AbstractC0307g.m702d(r2, "getMethods(...)");     // Catch: Throwable -> L11
        int r3 = r2.length;     // Catch: Throwable -> L11
        int r4 = 0;
        int r5 = 0;
    L5:
        if (r5 >= r3) goto L14;
        Method r7 = r2[r5];     // Catch: Throwable -> L11
        if (AbstractC0307g.m699a(r7.getName(), "getColumnCount") == false) goto L13;
        Class<?>[] r8 = r7.getParameterTypes();     // Catch: Throwable -> L11
        AbstractC0307g.m702d(r8, "getParameterTypes(...)");     // Catch: Throwable -> L11
        if (r8.length != 0) goto L13;
    L15:
        if (r7 != null) goto L17;
        return -1;
    L17:
        r7.setAccessible(true);     // Catch: Throwable -> L11
        Object r32 = r7.invoke(r11, null);     // Catch: Throwable -> L11
        if ((r32 instanceof Number) == false) goto L20;
        Number r33 = (Number) r32;     // Catch: Throwable -> L11
    L21:
        if (r33 == null) goto L47;
        int r34 = r33.intValue();     // Catch: Throwable -> L11
        Method[] r52 = r11.getClass().getMethods();     // Catch: Throwable -> L11
        AbstractC0307g.m702d(r52, "getMethods(...)");     // Catch: Throwable -> L11
        int r02 = r52.length;     // Catch: Throwable -> L11
        int r72 = 0;
    L23:
        if (r72 >= r02) goto L30;
        Method r82 = r52[r72];     // Catch: Throwable -> L11
        if (AbstractC0307g.m699a(r82.getName(), "getColumnName") == false) goto L29;
        if (r82.getParameterTypes().length != 1) goto L29;
    L31:
        if (r82 != null) goto L33;
        return -1;
    L33:
        r82.setAccessible(true);     // Catch: Throwable -> L11
    L34:
        if (r4 >= r34) goto L45;
        Object r03 = r82.invoke(r11, new Object[]{Integer.valueOf(r4)});     // Catch: Throwable -> L11
        if ((r03 instanceof String) == false) goto L38;
        String r04 = (String) r03;     // Catch: Throwable -> L11
    L39:
        if (r04 != null) goto L42;
    L44:
        r4 = r4 + 1;     // Catch: Throwable -> L11
        goto L34
    L42:
        if (r04.equalsIgnoreCase(r12) == false) goto L44;
        return r4;
    L38:
        r04 = null;
        goto L39
    L45:
        Object r112 = -1;     // Catch: Throwable -> L11
    L50:
        if ((r112 instanceof C0140f) == false) goto L53;
        r112 = -1;
    L53:
        return ((Number) r112).intValue();
    L29:
        r72 = r72 + 1;     // Catch: Throwable -> L11
        goto L23
    L30:
        r82 = null;
        goto L31
    L47:
        return -1;
    L20:
        r33 = null;
    L13:
        r5 = r5 + 1;     // Catch: Throwable -> L11
        goto L5
    L14:
        r7 = null;
    L11:
        th = move-exception;
        r112 = AbstractC0040p.m116u(th);
        goto L50
    }

    /* JADX INFO: renamed from: j */
    public static Object m1623j(Object r9, String r10, String[] r11) {
        Method[] r02 = r9.getClass().getMethods();
        AbstractC0307g.m702d(r02, "getMethods(...)");
        ArrayList r1 = new ArrayList();
        int r2 = r02.length;
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L8;
        Method r5 = r02[r4];
        if (AbstractC0307g.m699a(r5.getName(), "rawQuery") == false) goto L7;
        r1.add(r5);
    L7:
        r4 = r4 + 1;
        goto L3
    L8:
        Iterator r03 = AbstractC0181l.m548t0(r1, new C0692s(3)).iterator();
    L9:
        Object r22 = null;
        if (r03.hasNext() == false) goto L42;
        Method r12 = (Method) r03.next();
        AbstractC0307g.m700b(r12);
        r12.setAccessible(true);     // Catch: Throwable -> L18
        Class<?>[] r52 = r12.getParameterTypes();     // Catch: Throwable -> L18
        if (r52.length != 1) goto L21;
        if (AbstractC0307g.m699a(r52[0], String.class) == false) goto L21;
        Object r13 = r12.invoke(r9, new Object[]{r10});     // Catch: Throwable -> L18
    L38:
        if ((r13 instanceof C0140f) == true) goto L41;
        r22 = r13;
    L41:
        if (r22 == null) goto L9;
    L21:
        if (r52.length >= 2) goto L23;
    L35:
        r13 = null;
        goto L38
    L23:
        if (AbstractC0307g.m699a(r52[0], String.class) == false) goto L35;
        if (AbstractC0307g.m699a(r52[1], String[].class) == true) goto L28;
        r52[1].getName().equals("[Ljava.lang.String;");     // Catch: Throwable -> L18
    L28:
        if (r52.length != 2) goto L30;
        r13 = r12.invoke(r9, new Object[]{r10, r11});     // Catch: Throwable -> L18
        goto L38
    L30:
        int r42 = r52.length - 2;     // Catch: Throwable -> L18
        Object[] r53 = new Object[r42];     // Catch: Throwable -> L18
        int r6 = 0;
    L31:
        if (r6 >= r42) goto L33;
        r53[r6] = null;     // Catch: Throwable -> L18
        r6 = r6 + 1;     // Catch: Throwable -> L18
        goto L31
    L33:
        C0316p r43 = new C0316p(3);     // Catch: Throwable -> L18
        ArrayList r62 = r43.f597a;     // Catch: Throwable -> L18
        r43.m709a(r10);     // Catch: Throwable -> L18
        r43.m709a(r11);     // Catch: Throwable -> L18
        r43.m710b(r53);     // Catch: Throwable -> L18
        r13 = r12.invoke(r9, r62.toArray(new Object[r62.size()]));     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        r13 = AbstractC0040p.m116u(th);
    L42:
        return r22;
    }

    /* JADX INFO: renamed from: k */
    public static String m1624k(Object r1, String r2, String[] r3) {
        Object r12 = m1623j(r1, r2, r3);
        if (r12 != null) goto L29;
        return null;
    L29:
    L12:
        th = move-exception;
        m1616c(r12);
        throw th;
    L6:
        if (m1617d(r12) == true) goto L9;
        m1616c(r12);
        return null;
    L9:
        String r22 = m1618e(r12, "conRemark");     // Catch: Throwable -> L12
        if (r22 != null) goto L14;
        r22 = m1619f(0, r12);     // Catch: Throwable -> L12
    L14:
        String r32 = m1618e(r12, "nickname");     // Catch: Throwable -> L12
        if (r32 != null) goto L17;
        r32 = m1619f(1, r12);     // Catch: Throwable -> L12
    L17:
        String r02 = m1618e(r12, "alias");     // Catch: Throwable -> L12
        if (r02 != null) goto L20;
        r02 = m1619f(2, r12);     // Catch: Throwable -> L12
    L20:
        String r23 = AbstractC0680o.m1739b(r22);     // Catch: Throwable -> L12
        if (r23 != null) goto L25;
        r23 = AbstractC0680o.m1739b(r32);     // Catch: Throwable -> L12
        if (r23 != null) goto L25;
        r23 = AbstractC0680o.m1739b(r02);     // Catch: Throwable -> L12
    L25:
        m1616c(r12);
        return r23;
    }

    /* JADX INFO: renamed from: l */
    public static C0139e m1625l(byte[] r6, int r7) {
        long r02 = 0;
        int r2 = 0;
    L4:
        if (r7 >= r6.length) goto L12;
        if (r2 >= 64) goto L17;
        int r3 = r7 + 1;
        byte r72 = r6[r7];
        r02 = r02 | (((long) (r72 & 127)) << r2);
        if ((r72 & 128) == 0) goto L10;
        r2 = r2 + 7;
        r7 = r3;
        goto L4
    L10:
        return new C0139e(Long.valueOf(r02), Integer.valueOf(r3));
    L17:
        return null;
    L12:
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static void m1626m(Object r7) {
        if (r7 != null) goto L4;
        return;
    L4:
        Method[] r02 = r7.getClass().getMethods();
        AbstractC0307g.m702d(r02, "getMethods(...)");
        int r1 = r02.length;
        int r3 = 0;
    L5:
        if (r3 >= r1) goto L31;
        Method r4 = r02[r3];
        if (AbstractC0307g.m699a(r4.getName(), "rawQuery") == false) goto L30;
        Class<?>[] r42 = r4.getParameterTypes();
        AbstractC0307g.m702d(r42, "getParameterTypes(...)");
        if (r42.length != 0) goto L11;
        boolean r43 = true;
    L13:
        if ((!r43) == false) goto L30;
        f2000b.set(r7);
        CopyOnWriteArrayList r03 = f1999a;
        if ((r03 instanceof Collection) == true) goto L17;
    L19:
        Iterator r12 = r03.iterator();
    L21:
        if (r12.hasNext() == false) goto L25;
        if (r12.next() != r7) goto L21;
        return;
    L25:
        r03.add(r7);
    L27:
        if (r03.size() <= 8) goto L29;
        r03.remove(0);
        goto L27
    L29:
        return;
    L17:
        if (r03.isEmpty() == false) goto L19;
    L11:
        r43 = false;
    L30:
        r3 = r3 + 1;
        goto L5
    }

    /* JADX INFO: renamed from: n */
    public static Integer m1627n(byte[] r3, int r4, int r5, int r6) {
        if (r5 != 0) goto L5;
        C0139e r32 = m1625l(r3, r4);
        if (r32 != null) goto L26;
        return null;
    L26:
        return (Integer) r32.f329b;
    L5:
        if (r5 != 1) goto L7;
        int r42 = r4 + 8;
        Integer r33 = Integer.valueOf(r42);
        if (r42 <= r6) goto L28;
        return null;
    L28:
        return r33;
    L7:
        if (r5 != 2) goto L9;
        C0139e r34 = m1625l(r3, r4);
        if (r34 != null) goto L17;
        return null;
    L17:
        int r43 = ((Number) r34.f329b).intValue() + ((int) ((Number) r34.f328a).longValue());
        r33 = Integer.valueOf(r43);
        if (r43 <= r6) goto L28;
        return null;
    L9:
        if (r5 != 5) goto L32;
        int r44 = r4 + 4;
        r33 = Integer.valueOf(r44);
        if (r44 <= r6) goto L28;
        return null;
    L32:
        return null;
    }
}
