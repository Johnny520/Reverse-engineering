package p050c0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p009E0.AbstractC0183n;
import p009E0.C0172c;
import p009E0.C0180k;
import p011F0.C0197a;
import p011F0.C0199c;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p037U.AbstractC0358S;
import p040V0.C0401d;
import p040V0.C0402e;
import p040V0.C0406i;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;
import p042W0.C0422g;

/* JADX INFO: renamed from: c0.R0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0621R0 {

    /* JADX INFO: renamed from: a */
    public static final C0621R0 f1913a = null;

    /* JADX INFO: renamed from: b */
    public static final C0422g f1914b = null;

    /* JADX INFO: renamed from: c */
    public static final C0422g f1915c = null;

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f1916d = null;

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap f1917e = null;

    static {
        f1913a = new C0621R0();
        f1914b = new C0422g(".*\\d+(?:\\.\\d+)?\\s*(?:B|KB|MB|GB|TB).*");
        f1915c = new C0422g(".*\\.(?:docx?|xlsx?|pptx?|pdf|zip|rar|7z|txt|apk|jpg|jpeg|png|gif|mp4|mp3|m4a|wav)(?:\\s|$).*", 0);
        f1916d = new ConcurrentHashMap();
        f1917e = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static void m1520a(View r4, ArrayList r5) {
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
        m1520a(r2, r5);
        r1 = r1 + 1;
        goto L8
    L12:
        return;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1521b(String r1) {
        if (AbstractC0433r.m1028C0(r1, "@chatroom") == false) goto L5;
    L8:
        return true;
    L5:
        if (AbstractC0433r.m1028C0(r1, "@im.chatroom") == true) goto L8;
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1522c(String r3) {
        if (r3 == null) goto L4;
        String r32 = AbstractC0425j.m1022a1(r3).toString();
    L5:
        if (r32 != null) goto L8;
        r32 = "";
    L8:
        if (r32.length() != 0) goto L11;
    L12:
        return false;
    L11:
        if (m1521b(r32) == true) goto L12;
        if (AbstractC0433r.m1033H0(r32, "wxid_", false) == true) goto L21;
        int r02 = r32.length();
        if (6 <= r02) goto L18;
        return false;
    L18:
        if (r02 >= 81) goto L24;
        Pattern r03 = Pattern.compile("[a-zA-Z][\\w@.\\-]+");
        AbstractC0307g.m702d(r03, "compile(...)");
        if (r03.matcher(r32).matches() == true) goto L21;
        return false;
    L24:
        return false;
    L21:
        return true;
    L4:
        r32 = null;
        goto L5
    }

    /* JADX INFO: renamed from: e */
    public static String m1523e(Object r9, String... r10) {
        int r02 = r10.length;
        int r1 = 0;
    L4:
        if (r1 >= r02) goto L62;
        String r3 = r10[r1];
        C0406i r4 = AbstractC0358S.m861K(new C0616P0(r9.getClass(), null));
    L7:
        if (r4.hasNext() == false) goto L15;
        Object r5 = r4.next();
        Method r6 = (Method) r5;
        if (AbstractC0307g.m699a(r6.getName(), r3) == false) goto L7;
        Class<?>[] r7 = r6.getParameterTypes();
        AbstractC0307g.m702d(r7, "getParameterTypes(...)");
        if (r7.length != 0) goto L7;
        if (AbstractC0307g.m699a(r6.getReturnType(), String.class) == false) goto L7;
    L16:
        Method r52 = (Method) r5;
        if (r52 != null) goto L65;
    L37:
        Class<?> r53 = r9.getClass();
    L38:
        if (r53 == null) goto L61;
        if (r53.equals(Object.class) == true) goto L61;
        Field r62 = r53.getDeclaredField(r3);     // Catch: Throwable -> L45
        r62.setAccessible(true);     // Catch: Throwable -> L45
        Object r63 = r62.get(r9);     // Catch: Throwable -> L45
        if ((r63 instanceof String) == false) goto L47;
        Object r64 = (String) r63;     // Catch: Throwable -> L45
    L50:
        if ((r64 instanceof C0140f) == false) goto L52;
        r64 = null;
    L52:
        String r65 = (String) r64;
        if (r65 == null) goto L60;
        if ((!AbstractC0425j.m1013R0(r65)) == true) goto L58;
        r65 = null;
    L58:
        if (r65 == null) goto L60;
        return r65;
    L60:
        r53 = r53.getSuperclass();
        goto L38
    L47:
        r64 = null;
    L45:
        th = move-exception;
        r64 = AbstractC0040p.m116u(th);
    L61:
        r1 = r1 + 1;
        goto L4
    L65:
        r52.setAccessible(true);     // Catch: Throwable -> L22
        Object r54 = r52.invoke(r9, null);     // Catch: Throwable -> L22
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
    L62:
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static C0613O0 m1524f(Object r9) {
        String r02 = m1523e(r9, new String[]{"getTalker", "field_talker", "talker"});
        if (r02 == null) goto L74;
        String r03 = AbstractC0425j.m1022a1(r02).toString();
        if (r03 == null) goto L74;
        if (m1521b(r03) == false) goto L10;
        Method r2 = (Method) f1917e.computeIfAbsent(r9.getClass(), new C0612O(new C0570A(10), 5));
        if (r2 != null) goto L75;
        Object r22 = null;
    L23:
        if ((r22 instanceof String) == false) goto L26;
        Object r23 = (String) r22;     // Catch: Throwable -> L19
    L29:
        if ((r23 instanceof C0140f) == false) goto L31;
        r23 = null;
    L31:
        String r24 = (String) r23;
        if (m1522c(r24) == false) goto L34;
        AbstractC0307g.m700b(r24);
        String r25 = AbstractC0425j.m1022a1(r24).toString();
    L43:
        if (r25 != null) goto L70;
        String r92 = m1523e(r9, new String[]{"getContent", "field_content", "content"});
        if (r92 != null) goto L47;
        r92 = "";
    L47:
        List r26 = AbstractC0182m.m556h0(new String[]{":\r\n", ":\n"});
        ArrayList r5 = new ArrayList(AbstractC0183n.m559k0(r26, 10));
        Iterator r27 = r26.iterator();
    L49:
        if (r27.hasNext() == false) goto L51;
        r5.add(Integer.valueOf(AbstractC0425j.m1011P0(r92, (String) r27.next(), 0, false, 6)));
        goto L49
    L51:
        ArrayList r28 = new ArrayList();
        Iterator r52 = r5.iterator();
    L53:
        if (r52.hasNext() == false) goto L59;
        Object r6 = r52.next();
        int r7 = ((Number) r6).intValue();
        if (1 > r7) goto L53;
        if (r7 >= 81) goto L53;
        r28.add(r6);
        goto L53
    L59:
        Integer r29 = (Integer) AbstractC0181l.m547s0(r28);
        if (r29 == null) goto L66;
        String r93 = r92.substring(0, r29.intValue());
        AbstractC0307g.m702d(r93, "substring(...)");
        String r94 = AbstractC0425j.m1022a1(r93).toString();
        if (m1522c(r94) == true) goto L65;
        r94 = null;
    L65:
        r25 = r94;
    L67:
        if (r25 != null) goto L70;
        return null;
    L66:
        r25 = null;
    L70:
        if (m1521b(r25) == false) goto L73;
        return null;
    L73:
        return new C0613O0(r03, r25, true);
    L34:
        String r210 = m1523e(r9, new String[]{"getSender", "field_sender", "field_sendTalker", "sender"});
        if (r210 == null) goto L41;
        r25 = AbstractC0425j.m1022a1(r210).toString();
        if (r25 == null) goto L41;
        if (m1522c(r25) == true) goto L43;
    L41:
        r25 = null;
    L19:
        th = move-exception;
        r23 = AbstractC0040p.m116u(th);
        goto L29
    L26:
        r23 = null;
        goto L29
    L75:
        r22 = r2.invoke(r9, null);     // Catch: Throwable -> L19
        goto L23
    L10:
        if (m1522c(r03) == false) goto L12;
        String r95 = r03;
    L13:
        if (r95 != null) goto L15;
        return null;
    L15:
        return new C0613O0(r03, r03, false);
    L12:
        r95 = null;
    L74:
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final TextView m1525d(View r16, Object r17) {
        C0199c r1 = new C0199c(10);
        r1.add(r17);
        Object r2 = r16.getTag();
        if (r2 == null) goto L5;
        r1.add(r2);
    L5:
        Object r3 = null;
        Class<?> r4 = r17.getClass();     // Catch: Throwable -> L18
    L7:
        if (r4 == null) goto L29;
        if (r4.equals(Object.class) == true) goto L29;
        C0172c r5 = AbstractC0317q.m714c(r4.getDeclaredFields());     // Catch: Throwable -> L18
    L12:
        if (r5.hasNext() == false) goto L26;
        Field r6 = (Field) r5.next();     // Catch: Throwable -> L18
        if (View.class.isAssignableFrom(r6.getType()) == false) goto L12;
        r6.setAccessible(true);     // Catch: Throwable -> L18
        Object r62 = r6.get(r17);     // Catch: Throwable -> L18
        if ((r62 instanceof View) == false) goto L20;
        View r63 = (View) r62;     // Catch: Throwable -> L18
    L21:
        if (r63 == null) goto L12;
        Object r64 = r63.getTag();     // Catch: Throwable -> L18
        if (r64 == null) goto L12;
        r1.add(r64);     // Catch: Throwable -> L18
        goto L12
    L20:
        r63 = null;
        goto L21
    L26:
        r4 = r4.getSuperclass();     // Catch: Throwable -> L18
    L29:
        ListIterator r42 = AbstractC0040p.m103f(r1).listIterator(0);
    L30:
        C0197a r02 = (C0197a) r42;
        if (r02.hasNext() == false) goto L49;
        Object r03 = r02.next();
        Field r52 = (Field) f1916d.computeIfAbsent(r03.getClass(), new C0612O(new C0619Q0(1, this, C0621R0.class, "findNicknameField", "findNicknameField(Ljava/lang/Class;)Ljava/lang/reflect/Field;", 1), 6));
        if (r52 == null) goto L30;
        r52.setAccessible(true);     // Catch: Throwable -> L39
        Object r04 = r52.get(r03);     // Catch: Throwable -> L39
        if ((r04 instanceof TextView) == false) goto L41;
        Object r05 = (TextView) r04;     // Catch: Throwable -> L39
    L44:
        if ((r05 instanceof C0140f) == false) goto L46;
        r05 = null;
    L46:
        TextView r06 = (TextView) r05;
        if (r06 == null) goto L30;
        return r06;
    L41:
        r05 = null;
    L39:
        th = move-exception;
        r05 = AbstractC0040p.m116u(th);
        goto L44
    L49:
        ArrayList r07 = new ArrayList();
        m1520a(r16, r07);
        C0401d r08 = new C0401d(new C0402e(new C0402e(new C0402e(new C0402e(new C0180k(2, r07), true, new C0619Q0(1, this, C0621R0.class, "isLikelyNickname", "isLikelyNickname(Landroid/widget/TextView;)Z", 0)), false, new C0570A(11)), false, new C0570A(12)), true, new C0570A(13)));
        if (r08.hasNext() == false) goto L62;
        r3 = r08.next();
        if (r08.hasNext() == false) goto L62;
        int r12 = ((TextView) r3).getTop();
    L56:
        Object r22 = r08.next();
        int r43 = ((TextView) r22).getTop();
        if (r12 <= r43) goto L60;
        r3 = r22;
        r12 = r43;
    L60:
        if (r08.hasNext() == true) goto L56;
    L62:
        return (TextView) r3;
    L18:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L29
    }
}
