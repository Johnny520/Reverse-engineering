package p050c0;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import de.robv.android.xposed.AbstractC0762d;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.luckypray.dexkit.C1031R;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.C0172c;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: c0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0704w {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f2213a = null;

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap.KeySetView f2214b = null;

    static {
        f2213a = new AtomicBoolean(false);
        f2214b = ConcurrentHashMap.newKeySet();
    }

    /* JADX INFO: renamed from: a */
    public static final void m1793a(Activity r11, String r12) {
        if (r11.isFinishing() == true) goto L144;
        Window r02 = r11.getWindow();
        if (r02 == null) goto L140;
        View r03 = r02.getDecorView();
        if (r03 != null) goto L11;
        return;
    L11:
        if (AbstractC0307g.m699a(r03.getTag(C1031R.id.abc_tag_auto_login_clicked), Boolean.TRUE) == true) goto L146;
        Class<?> r2 = r11.getClass();
        int r4 = 0;
    L14:
        Button r6 = null;
        Object r62 = null;
        r6 = null;
        if (r2 == null) goto L40;
        if (r4 >= 6) goto L40;
        C0172c r7 = AbstractC0317q.m714c(r2.getDeclaredFields());
    L20:
        if (r7.hasNext() == false) goto L39;
        Field r8 = (Field) r7.next();
        if (Button.class.isAssignableFrom(r8.getType()) == false) goto L20;
        r8.setAccessible(true);     // Catch: Throwable -> L27
        Object r82 = r8.get(r11);     // Catch: Throwable -> L27
        if ((r82 instanceof Button) == false) goto L29;
        Object r83 = (Button) r82;     // Catch: Throwable -> L27
    L31:
        boolean r9 = r83 instanceof C0140f;
        Object r84 = r83;
        if (r9 == false) goto L34;
        r84 = null;
    L34:
        Button r85 = (Button) r84;
        if (r85 == null) goto L20;
        if (r85.getVisibility() != 0) goto L20;
    L41:
        if (r85 == null) goto L43;
        r6 = r85;
    L98:
        if (r6 != null) goto L101;
        m1796d("login button not found (" + r12 + ")");
        return;
    L101:
        if (r6.isEnabled() == true) goto L103;
    L112:
        m1796d("login button not clickable enabled=" + r6.isEnabled() + " vis=" + r6.getVisibility() + " (" + r12 + ")");
        return;
    L103:
        if (r6.getVisibility() != 0) goto L112;
        r6.performClick();     // Catch: Throwable -> L107
        r03.setTag(C1031R.id.abc_tag_auto_login_clicked, Boolean.TRUE);     // Catch: Throwable -> L107
        m1796d("performClick ok via " + r12 + " text=" + r6.getText());     // Catch: Throwable -> L107
        Object r112 = C0146l.f339a;     // Catch: Throwable -> L107
    L109:
        Throwable r113 = AbstractC0141g.m465a(r112);
        if (r113 == null) goto L142;
        m1796d("performClick failed: " + r113.getMessage());
        return;
    L142:
        return;
    L107:
        th = move-exception;
        r112 = AbstractC0040p.m116u(th);
        goto L109
    L43:
        Window r114 = r11.getWindow();
        if (r114 == null) goto L46;
        View r115 = r114.getDecorView();
    L48:
        if ((r115 instanceof ViewGroup) == false) goto L50;
        ViewGroup r116 = (ViewGroup) r115;
    L51:
        if (r116 == null) goto L98;
        ArrayList r22 = new ArrayList();
        m1794b(r116, r22);
        if (r22.isEmpty() == true) goto L98;
        Iterator r117 = r22.iterator();
    L58:
        if (r117.hasNext() == false) goto L76;
        Object r42 = r117.next();
        CharSequence r72 = ((Button) r42).getText();
        if (r72 == null) goto L62;
        String r73 = r72.toString();
    L63:
        if (r73 != null) goto L66;
        r73 = "";
    L66:
        if (AbstractC0425j.m1005J0(r73, "登录", false) == true) goto L77;
        if (AbstractC0425j.m1005J0(r73, "登入", false) == true) goto L77;
        if (AbstractC0425j.m1005J0(r73, "Login", true) == true) goto L77;
        if (AbstractC0425j.m1005J0(r73, "確認", false) == true) goto L77;
        if (AbstractC0425j.m1005J0(r73, "确认", false) == false) goto L58;
    L77:
        Button r43 = (Button) r42;
        if (r43 == null) goto L80;
        r6 = r43;
        goto L98
    L80:
        ListIterator r118 = r22.listIterator(r22.size());
    L82:
        if (r118.hasPrevious() == false) goto L88;
        Object r3 = r118.previous();
        Button r44 = (Button) r3;
        if (r44.isEnabled() == false) goto L82;
        if (r44.getVisibility() != 0) goto L82;
    L89:
        Button r32 = (Button) r3;
        if (r32 == null) goto L92;
        r6 = r32;
        goto L98
    L92:
        if (r22.isEmpty() == true) goto L95;
        r62 = r22.get(r22.size() - 1);
    L95:
        r6 = (Button) r62;
        goto L98
    L88:
        r3 = null;
        goto L89
    L62:
        r73 = null;
        goto L63
    L76:
        r42 = null;
        goto L77
    L50:
        r116 = null;
        goto L51
    L46:
        r115 = null;
        goto L48
    L29:
        r83 = null;
    L27:
        th = move-exception;
        r83 = AbstractC0040p.m116u(th);
        goto L31
    L39:
        r2 = r2.getSuperclass();
        r4 = r4 + 1;
    L40:
        r85 = null;
        goto L41
    L146:
        return;
    L140:
        return;
    }

    /* JADX INFO: renamed from: b */
    public static void m1794b(View r4, ArrayList r5) {
        if ((r4 instanceof Button) == false) goto L6;
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
        m1794b(r2, r5);
        r1 = r1 + 1;
        goto L8
    L12:
        return;
    }

    /* JADX INFO: renamed from: c */
    public static String m1795c(Method r3) {
        String r02 = r3.getDeclaringClass().getName();
        String r1 = r3.getName();
        String r32 = Arrays.toString(r3.getParameterTypes());
        AbstractC0307g.m702d(r32, "toString(...)");
        return r02 + "#" + r1 + r32;
    }

    /* JADX INFO: renamed from: d */
    public static void m1796d(String r2) {
        AbstractC0762d.m1954d("[OKK-AutoLogin] " + r2);     // Catch: Throwable -> L5
        return;
    }
}
