package p050c0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import de.robv.android.xposed.AbstractC0762d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p009E0.C0172c;
import p009E0.C0178i;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0687q0 {

    /* JADX INFO: renamed from: a */
    public static final C0687q0 f2154a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2155b = null;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f2156c;

    /* JADX INFO: renamed from: d */
    public static volatile long f2157d;

    /* JADX INFO: renamed from: e */
    public static final Set f2158e = null;

    /* JADX INFO: renamed from: f */
    public static volatile WeakReference f2159f;

    /* JADX INFO: renamed from: g */
    public static volatile String f2160g;

    /* JADX INFO: renamed from: h */
    public static volatile String f2161h;

    /* JADX INFO: renamed from: i */
    public static final ThreadLocal f2162i = null;

    static {
        f2154a = new C0687q0();
        f2155b = new AtomicBoolean(false);
        f2156c = true;
        Set r02 = Collections.newSetFromMap(new WeakHashMap());
        AbstractC0307g.m702d(r02, "newSetFromMap(...)");
        f2158e = r02;
        f2162i = ThreadLocal.withInitial(new C0681o0(0));
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m1754a(View r5) {
        Set r02 = f2158e;
        if (r02.contains(r5) == false) goto L6;
        return true;
    L6:
        if (m1760g(r5) == false) goto L8;
        m1762i(r5);
        return true;
    L8:
        int r3 = 0;
    L9:
        if (r5 == null) goto L24;
        if (r3 >= 6) goto L24;
        if (r02.contains(r5) == true) goto L22;
        if (m1760g(r5) == true) goto L22;
        Object r52 = r5.getParent();
        if ((r52 instanceof View) == false) goto L20;
        r5 = (View) r52;
    L21:
        r3 = r3 + 1;
        goto L9
    L20:
        r5 = null;
    L22:
        m1762i(r5);
        return true;
    L24:
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final void m1755b() {
        long r02 = System.currentTimeMillis();
        if ((r02 - f2157d) < 3000) goto L7;
        f2157d = r02;
        m1763j(false);
        return;
    }

    /* JADX INFO: renamed from: c */
    public static final void m1756c(Object r1) {
        if (r1 == null) goto L29;
        WeakReference r02 = f2159f;
        if (r02 == null) goto L9;
        View r03 = (View) r02.get();
        if (r03 == null) goto L9;
        m1762i(r03);
        m1759f(r03);
    L9:
        Object r04 = m1757d(r1);
        if (r04 != null) goto L12;
        View r05 = null;
    L13:
        if (r05 == null) goto L25;
        m1762i(r05);
        m1759f(r05);
    L25:
        Object r12 = m1757d(r1);     // Catch: Throwable -> L22
        if (r12 == null) goto L27;
        View r13 = m1761h(r12);     // Catch: Throwable -> L22
        if (r13 == null) goto L28;
        m1762i(r13);     // Catch: Throwable -> L22
        m1759f(r13);     // Catch: Throwable -> L22
        return;
    L28:
        return;
    L27:
        return;
    L22:
        th = move-exception;
        AbstractC0040p.m116u(th);
        return;
    L12:
        r05 = m1761h(r04);
        goto L13
    }

    /* JADX INFO: renamed from: d */
    public static Object m1757d(Object r11) {
        String r02 = f2161h;
        if (r02 != null) goto L58;
    L8:
        C0172c r03 = AbstractC0317q.m714c(r11.getClass().getDeclaredFields());
    L9:
        Object r4 = null;
        if (r03.hasNext() == false) goto L29;
        Field r1 = (Field) r03.next();
        String r5 = r1.getType().getName();
        if (r5.equals("com.tencent.mm.ui.conversation.l5") == true) goto L17;
        if (AbstractC0433r.m1028C0(r5, ".l5") == true) goto L17;
        if (AbstractC0425j.m1005J0(r5, "FolderHelper", false) == false) goto L9;
    L17:
        r1.setAccessible(true);
        Object r2 = r1.get(r11);     // Catch: Throwable -> L20
    L23:
        if ((r2 instanceof C0140f) == true) goto L26;
        r4 = r2;
    L26:
        if (r4 == null) goto L9;
        f2161h = r1.getName();
        return r4;
    L20:
        th = move-exception;
        r2 = AbstractC0040p.m116u(th);
        goto L23
    L29:
        C0172c r04 = AbstractC0317q.m714c(r11.getClass().getDeclaredFields());
    L31:
        if (r04.hasNext() == false) goto L53;
        Field r12 = (Field) r04.next();
        r12.setAccessible(true);
        Object r52 = r12.get(r11);     // Catch: Throwable -> L35
    L38:
        if ((r52 instanceof C0140f) == false) goto L40;
        r52 = null;
    L40:
        if (r52 == null) goto L31;
        if (AbstractC0433r.m1033H0(r52.getClass().getName(), "com.tencent.mm.ui.conversation.", false) == false) goto L31;
        if ((r52 instanceof AbsListView) == true) goto L31;
        Field[] r6 = r52.getClass().getDeclaredFields();
        AbstractC0307g.m702d(r6, "getDeclaredFields(...)");
        int r7 = r6.length;
        int r8 = 0;
    L47:
        if (r8 >= r7) goto L31;
        if (LinearLayout.class.isAssignableFrom(r6[r8].getType()) == true) goto L50;
        r8 = r8 + 1;
        goto L47
    L50:
        f2161h = r12.getName();
        return r52;
    L35:
        th = move-exception;
        r52 = AbstractC0040p.m116u(th);
        goto L38
    L53:
        return null;
    L58:
        return AbstractC0358S.m920y(r11, r02);
    L6:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L8
    }

    /* JADX INFO: renamed from: e */
    public static View m1758e(ViewGroup r6) {
        C0178i r02 = new C0178i();
        r02.addLast(r6);
        int r1 = 0;
    L4:
        if ((!r02.isEmpty()) == false) goto L18;
        if (r1 >= 800) goto L29;
        r1 = r1 + 1;
        View r2 = (View) r02.removeFirst();
        if (AbstractC0307g.m699a(m1764k(r2), "lt5") == true) goto L9;
        if ((r2 instanceof ViewGroup) == false) goto L4;
        ViewGroup r22 = (ViewGroup) r2;
        int r3 = r22.getChildCount();
        int r4 = 0;
    L13:
        if (r4 >= r3) goto L4;
        View r5 = r22.getChildAt(r4);
        if (r5 == null) goto L17;
        r02.addLast(r5);
    L17:
        r4 = r4 + 1;
        goto L13
    L9:
        return r2;
    L29:
        return null;
    L18:
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static void m1759f(View r7) {
        ThreadLocal r02 = f2162i;
        Object r1 = r02.get();
        Boolean r2 = Boolean.TRUE;
        if (AbstractC0307g.m699a(r1, r2) == false) goto L5;
        return;
    L5:
        r02.set(r2);
    L9:
        th = move-exception;
        r02.set(Boolean.FALSE);
        throw th;
    L7:
        if (r7.getVisibility() == 8) goto L12;
        r7.setVisibility(8);     // Catch: Throwable -> L9
    L12:
        if (r7.getTranslationY() == 0.0f) goto L16;
        r7.setTranslationY(0.0f);     // Catch: Throwable -> L9
    L16:
        if (r7.getAlpha() == 0.0f) goto L19;
        r7.setAlpha(0.0f);     // Catch: Throwable -> L9
    L19:
        ViewGroup.LayoutParams r12 = r7.getLayoutParams();     // Catch: Throwable -> L9
        int r4 = 0;
        if (r12 == null) goto L25;
        if (r12.height == 0) goto L25;
        r12.height = 0;     // Catch: Throwable -> L9
        r7.setLayoutParams(r12);     // Catch: Throwable -> L9
    L25:
        if ((r7 instanceof ViewGroup) == false) goto L39;
        int r13 = ((ViewGroup) r7).getChildCount();     // Catch: Throwable -> L9
    L27:
        if (r4 >= r13) goto L39;
        View r5 = ((ViewGroup) r7).getChildAt(r4);     // Catch: Throwable -> L9
        if (r5 != null) goto L32;
    L38:
        r4 = r4 + 1;
        goto L27
    L32:
        if (r5.getVisibility() == 8) goto L35;
        r5.setVisibility(8);     // Catch: Throwable -> L9
    L35:
        if (r5.getAlpha() == 0.0f) goto L38;
        r5.setAlpha(0.0f);     // Catch: Throwable -> L9
    L39:
        r02.set(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1760g(View r4) {
        String r02 = m1764k(r4);
        if (r02 != null) goto L6;
        return false;
    L6:
        if (r02.equals("lt5") == false) goto L9;
        return true;
    L9:
        if (AbstractC0425j.m1005J0(r02, "fold", true) == true) goto L11;
    L15:
        return false;
    L11:
        if ((r4 instanceof LinearLayout) == false) goto L13;
    L14:
        return true;
    L13:
        if ((r4 instanceof ViewGroup) == false) goto L15;
        goto L14
    }

    /* JADX INFO: renamed from: h */
    public static View m1761h(Object r15) {
        Class<?> r02 = r15.getClass();
        Object r2 = null;
        if (f2160g != null) goto L58;
        Iterator r4 = AbstractC0182m.m556h0(new String[]{"f200744h", "h", "foldBanner", "banner"}).iterator();
    L7:
        if (r4.hasNext() == false) goto L24;
        Object r6 = r02.getDeclaredField((String) r4.next());     // Catch: Throwable -> L11
    L14:
        if ((r6 instanceof C0140f) == false) goto L16;
        r6 = null;
    L16:
        Field r62 = (Field) r6;
        if (r62 == null) goto L7;
        if (View.class.isAssignableFrom(r62.getType()) == true) goto L23;
        if (LinearLayout.class.isAssignableFrom(r62.getType()) == false) goto L7;
    L23:
        r62.setAccessible(true);
        f2160g = r62.getName();
        m1765l("banner field=" + r62.getName());
    L11:
        th = move-exception;
        r6 = AbstractC0040p.m116u(th);
        goto L14
    L24:
        Field[] r03 = r02.getDeclaredFields();
        AbstractC0307g.m702d(r03, "getDeclaredFields(...)");
        ArrayList r42 = new ArrayList();
        int r63 = r03.length;
        int r12 = 0;
    L25:
        if (r12 >= r63) goto L32;
        Field r13 = r03[r12];
        if (LinearLayout.class.isAssignableFrom(r13.getType()) == false) goto L29;
    L30:
        r42.add(r13);
    L31:
        r12 = r12 + 1;
        goto L25
    L29:
        if (View.class.isAssignableFrom(r13.getType()) == false) goto L31;
    L32:
        Iterator r04 = r42.iterator();
    L34:
        if (r04.hasNext() == false) goto L46;
        Object r64 = r04.next();
        String r9 = ((Field) r64).getName();
        AbstractC0307g.m702d(r9, "getName(...)");
        String r92 = r9.toLowerCase(Locale.ROOT);
        AbstractC0307g.m702d(r92, "toLowerCase(...)");
        if (AbstractC0425j.m1005J0(r92, "banner", false) == true) goto L47;
        if (r92.equals("h") == true) goto L47;
        if (AbstractC0433r.m1028C0(r92, "h") == true) goto L47;
        if (AbstractC0425j.m1005J0(r92, "fold", false) == true) goto L47;
        if (r92.equals("f200744h") == false) goto L34;
    L47:
        Field r65 = (Field) r64;
        if (r65 == null) goto L50;
    L56:
        if (r65 == null) goto L58;
        r65.setAccessible(true);
        f2160g = r65.getName();
        m1765l("banner field=" + r65.getName());
        goto L58
    L50:
        if (r42.size() != 1) goto L52;
        Object r05 = r42.get(0);
    L53:
        r65 = (Field) r05;
        if (r65 != null) goto L56;
        r65 = (Field) AbstractC0181l.m544p0(r42);
        goto L56
    L52:
        r05 = null;
        goto L53
    L46:
        r64 = null;
    L58:
        String r06 = f2160g;
        if (r06 != null) goto L77;
        return null;
    L77:
        Object r152 = AbstractC0358S.m920y(r15, r06);     // Catch: Throwable -> L65
        if ((r152 instanceof View) == false) goto L67;
        Object r153 = (View) r152;     // Catch: Throwable -> L65
    L70:
        if ((r153 instanceof C0140f) == true) goto L74;
        r2 = r153;
    L74:
        return (View) r2;
    L67:
        r153 = null;
    L65:
        th = move-exception;
        r153 = AbstractC0040p.m116u(th);
        goto L70
    }

    /* JADX INFO: renamed from: i */
    public static void m1762i(View r4) {
        f2159f = new WeakReference(r4);
        f2158e.add(r4);
        if ((r4 instanceof ViewGroup) == false) goto L10;
        ViewGroup r42 = (ViewGroup) r4;
        int r02 = r42.getChildCount();
        int r1 = 0;
    L5:
        if (r1 >= r02) goto L14;
        View r2 = r42.getChildAt(r1);
        if (r2 == null) goto L9;
        f2158e.add(r2);
    L9:
        r1 = r1 + 1;
        goto L5
    L14:
        return;
    }

    /* JADX INFO: renamed from: j */
    public static void m1763j(boolean r1) {
        if (r1 == false) goto L4;
    L5:
        f2156c = true;
        m1765l("enabled=true (always on)");
        WeakReference r12 = f2159f;
        if (r12 == null) goto L10;
        View r13 = (View) r12.get();
        if (r13 == null) goto L10;
        m1759f(r13);
    L10:
        Iterator r14 = f2158e.iterator();
    L12:
        if (r14.hasNext() == false) goto L16;
        m1759f((View) r14.next());
        goto L12
    L16:
        return;
    L4:
        if (f2156c == false) goto L5;
    }

    /* JADX INFO: renamed from: k */
    public static String m1764k(View r3) {
        Object r02 = null;
    L8:
        th = move-exception;
        Object r32 = AbstractC0040p.m116u(th);
    L11:
        if ((r32 instanceof C0140f) == true) goto L15;
        r02 = r32;
    L15:
        return (String) r02;
    L4:
        if (r3.getId() != (-1)) goto L6;
        r32 = null;
        goto L11
    L6:
        r32 = r3.getResources().getResourceEntryName(r3.getId());     // Catch: Throwable -> L8
        goto L11
    }

    /* JADX INFO: renamed from: l */
    public static void m1765l(String r2) {
        AbstractC0762d.m1954d("OKK-FoldBanner: " + r2);     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }
}
