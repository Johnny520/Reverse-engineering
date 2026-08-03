package p050c0;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import de.robv.android.xposed.AbstractC0762d;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0146l;
import p031Q0.AbstractC0307g;
import p031Q0.C0316p;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: c0.I0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0595I0 {

    /* JADX INFO: renamed from: a */
    public static final C0595I0 f1818a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f1819b = null;

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f1820c = null;

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f1821d = null;

    /* JADX INFO: renamed from: e */
    public static final C0691r1 f1822e = null;

    /* JADX INFO: renamed from: f */
    public static final Set f1823f = null;

    /* JADX INFO: renamed from: g */
    public static volatile Context f1824g;

    /* JADX INFO: renamed from: h */
    public static volatile View f1825h;

    static {
        f1818a = new C0595I0();
        f1819b = new AtomicBoolean(false);
        f1820c = new AtomicBoolean(false);
        f1821d = new AtomicBoolean(false);
        f1822e = new C0691r1();
        Set r02 = Collections.newSetFromMap(new WeakHashMap());
        AbstractC0307g.m702d(r02, "newSetFromMap(...)");
        f1823f = r02;
    }

    /* JADX INFO: renamed from: a */
    public static void m1473a(View r6) {
        String r1 = null;
        if ((r6 instanceof EditText) == false) goto L7;
        EditText r62 = (EditText) r6;     // Catch: Throwable -> L5
    L8:
        if (r62 != null) goto L11;
        return;
    L11:
        if (m1478f(r62) == true) goto L13;
        return;
    L13:
        Set r02 = f1823f;     // Catch: Throwable -> L5
        monitor-enter(r02);     // Catch: Throwable -> L5
        r02.add(r62);     // Catch: Throwable -> L42
        monitor-exit(r02);     // Catch: Throwable -> L5
        C0598J0 r03 = C0586F0.m1413a();     // Catch: Throwable -> L5
        if (r03.f1828a == false) goto L26;
        Context r2 = f1824g;     // Catch: Throwable -> L5
        if (r2 == null) goto L22;
        SharedPreferences r22 = r2.getSharedPreferences("abc_input_stats", 0);     // Catch: Throwable -> L5
    L23:
        if (r22 != null) goto L25;
        return;
    L25:
        String r4 = LocalDate.now().toString();     // Catch: Throwable -> L5
        AbstractC0307g.m702d(r4, "toString(...)");     // Catch: Throwable -> L5
        String r04 = AbstractC0358S.m914v(r03.f1830c, m1479g(r22, r4));     // Catch: Throwable -> L5
    L27:
        CharSequence r23 = r62.getHint();     // Catch: Throwable -> L5
        if (r23 == null) goto L31;
        r1 = r23.toString();     // Catch: Throwable -> L5
    L31:
        if (AbstractC0307g.m699a(r1, r04) == false) goto L33;
        return;
    L33:
        AtomicBoolean r12 = f1821d;
        if (r12.compareAndSet(false, true) == true) goto L48;
        return;
    L48:
        r62.setHint(r04);     // Catch: Throwable -> L39
        r12.set(false);     // Catch: Throwable -> L5
        Object r63 = C0146l.f339a;     // Catch: Throwable -> L5
    L46:
        AbstractC0141g.m465a(r63);
        return;
    L39:
        th = move-exception;
        r12.set(false);     // Catch: Throwable -> L5
        throw th;     // Catch: Throwable -> L5
    L22:
        r22 = null;
        goto L23
    L26:
        r04 = "";
        goto L27
    L42:
        th = move-exception;
        throw th;     // Catch: Throwable -> L5
    L7:
        r62 = null;
    L5:
        th = move-exception;
        r63 = AbstractC0040p.m116u(th);
        goto L46
    }

    /* JADX INFO: renamed from: b */
    public static void m1474b(View r4) {
        if ((r4 instanceof EditText) == false) goto L13;
        EditText r02 = (EditText) r4;
        Set r1 = f1823f;
        monitor-enter(r1);
        r1.add(r02);     // Catch: Throwable -> L9
        monitor-exit(r1);
    L9:
        th = move-exception;
        throw th;
    L13:
        if ((r4 instanceof ViewGroup) == false) goto L17;
        ViewGroup r42 = (ViewGroup) r4;
        int r03 = r42.getChildCount();
        int r12 = 0;
    L15:
        if (r12 >= r03) goto L21;
        View r2 = r42.getChildAt(r12);
        AbstractC0307g.m702d(r2, "getChildAt(...)");
        m1474b(r2);
        r12 = r12 + 1;
        goto L15
    L21:
        return;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1475c(ViewGroup r6, View r7) {
        if (r6 != r7) goto L5;
        return true;
    L5:
        int r1 = r6.getChildCount();
        int r3 = 0;
    L6:
        if (r3 >= r1) goto L16;
        View r4 = r6.getChildAt(r3);
        if (r4 == r7) goto L9;
        if ((r4 instanceof ViewGroup) == false) goto L15;
        if (m1475c((ViewGroup) r4, r7) == false) goto L15;
        return true;
    L15:
        r3 = r3 + 1;
        goto L6
    L9:
        return true;
    L16:
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static EditText m1476d(View r4) {
        if ((r4 instanceof EditText) == false) goto L7;
        return (EditText) r4;
    L7:
        if ((r4 instanceof ViewGroup) == false) goto L14;
        ViewGroup r42 = (ViewGroup) r4;
        int r02 = r42.getChildCount();
        int r1 = 0;
    L9:
        if (r1 >= r02) goto L18;
        View r2 = r42.getChildAt(r1);
        AbstractC0307g.m702d(r2, "getChildAt(...)");
        EditText r22 = m1476d(r2);
        if (r22 != null) goto L12;
        r1 = r1 + 1;
        goto L9
    L12:
        return r22;
    L18:
        return null;
    L14:
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static int m1477e(Class r4, String r5, Class... r6) {
        C0316p r02 = new C0316p(2);     // Catch: Throwable -> L4
        ArrayList r1 = r02.f597a;     // Catch: Throwable -> L4
        r02.m710b(r6);     // Catch: Throwable -> L4
        r02.m709a(new C0665j(25, false));     // Catch: Throwable -> L4
        AbstractC0358S.m904q(r4, r5, r1.toArray(new Object[r1.size()]));     // Catch: Throwable -> L4
        return 1;
    L4:
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m1478f(EditText r4) {
        if (r4.getClass().getName().equals("com.tencent.mm.ui.widget.cedit.api.MMFlexEditText") == false) goto L6;
        return true;
    L6:
        if (AbstractC0425j.m1005J0(r4.getClass().getName(), "MMFlexEditText", false) == false) goto L8;
        return true;
    L8:
        View r02 = f1825h;
        if ((r02 instanceof ViewGroup) == true) goto L11;
    L13:
        Object r42 = r4.getParent();
    L15:
        if ((r42 instanceof View) == false) goto L21;
        if (r42.getClass().getName().equals("com.tencent.mm.pluginsdk.ui.chat.ChatFooter") == true) goto L24;
        r42 = ((View) r42).getParent();
        goto L15
    L24:
        return true;
    L21:
        return false;
    L11:
        if (m1475c((ViewGroup) r02, r4) == false) goto L13;
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static C0601K0 m1479g(SharedPreferences r21, String r22) {
        String r1 = r21.getString("date", "");
        if (r1 != null) goto L5;
        String r11 = "";
    L6:
        String r2 = r11;
        C0601K0 r10 = new C0601K0(r2, r21.getInt("totalMsg", 0), r21.getInt("textMsg", 0), r21.getInt("textWord", 0), r21.getInt("emojiMsg", 0), r21.getInt("transferMsg", 0), r21.getInt("redBagMsg", 0), r21.getInt("fileMsg", 0));
        if (r11.equals(r22) == false) goto L9;
        C0601K0 r23 = r10;
    L11:
        if (r23.equals(r10) == true) goto L13;
        m1481i(r21, r23);
    L13:
        return r23;
    L9:
        r23 = new C0601K0(r22, 0, 0, 0, 0, 0, 0, 0);
        goto L11
    L5:
        r11 = r1;
        goto L6
    }

    /* JADX INFO: renamed from: h */
    public static String m1480h(ContentValues r8, int r9, String r10) {
        String r02 = r8.getAsString("talker");
        if (r02 != null) goto L11;
        r02 = r8.getAsString("field_talker");
        if (r02 != null) goto L11;
        r02 = r8.getAsString("username");
        if (r02 != null) goto L11;
        r02 = r8.getAsString("field_username");
        if (r02 != null) goto L11;
        r02 = "";
    L11:
        Long r1 = r8.getAsLong("createTime");
        long r2 = 0;
        if (r1 == null) goto L14;
    L13:
        long r4 = r1.longValue();
    L24:
        Long r12 = r8.getAsLong("msgId");
        if (r12 == null) goto L27;
    L26:
        long r6 = r12.longValue();
    L37:
        Long r13 = r8.getAsLong("msgSvrId");
        if (r13 == null) goto L40;
        r2 = r13.longValue();
    L44:
        return r02 + "|" + r4 + "|" + r6 + "|" + r2 + "|" + r9 + "|" + r10.hashCode();
    L40:
        Long r82 = r8.getAsLong("field_msgSvrId");
        if (r82 == null) goto L44;
        r2 = r82.longValue();
        goto L44
    L27:
        r12 = r8.getAsLong("field_msgId");
        if (r12 != null) goto L26;
        r12 = r8.getAsLong("rowid");
        if (r12 != null) goto L26;
        r12 = r8.getAsLong("field_rowid");
        if (r12 != null) goto L26;
        r6 = 0;
        goto L37
    L14:
        r1 = r8.getAsLong("field_createTime");
        if (r1 != null) goto L13;
        r1 = r8.getAsLong("msgCreateTime");
        if (r1 != null) goto L13;
        r1 = r8.getAsLong("field_msgCreateTime");
        if (r1 != null) goto L13;
        r4 = 0;
        goto L24
    }

    /* JADX INFO: renamed from: i */
    public static void m1481i(SharedPreferences r2, C0601K0 r3) {
        r2.edit().putString("date", r3.f1835a).putInt("totalMsg", r3.f1836b).putInt("textMsg", r3.f1837c).putInt("textWord", r3.f1838d).putInt("emojiMsg", r3.f1839e).putInt("transferMsg", r3.f1840f).putInt("redBagMsg", r3.f1841g).putInt("fileMsg", r3.f1842h).apply();
    }

    /* JADX INFO: renamed from: j */
    public static void m1482j(String r2) {
        AbstractC0762d.m1954d("[OKK-InputStats] " + r2);     // Catch: Throwable -> L5
        return;
    }
}
