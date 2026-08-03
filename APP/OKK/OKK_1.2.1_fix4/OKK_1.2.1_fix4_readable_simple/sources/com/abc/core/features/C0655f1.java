package com.abc.core.features;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import de.robv.android.xposed.AbstractC0762d;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0182m;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0655f1 {

    /* JADX INFO: renamed from: a */
    public static final C0655f1 f2038a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2039b = null;

    static {
        f2038a = new C0655f1();
        f2039b = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1637b() {
        ConfigStore r02 = ConfigStore.f2048a;     // Catch: Throwable -> L4
        Object r03 = Boolean.valueOf(ConfigStore.m1661c("profile_id", false));     // Catch: Throwable -> L4
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

    /* JADX INFO: renamed from: c */
    public static String m1638c(Activity r8) {
        Intent r82 = r8.getIntent();
        if (r82 != null) goto L5;
        return "";
    L5:
        Iterator r1 = AbstractC0182m.m556h0(new String[]{"Contact_User", "Contact_UserName", "User", "userName", "Chat_User", "Contact_Alias", "kintent_talker"}).iterator();
    L7:
        if (r1.hasNext() == false) goto L17;
        String r2 = r82.getStringExtra((String) r1.next());
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
        Bundle r83 = r82.getExtras();
        if (r83 == null) goto L37;
        Iterator<String> r12 = r83.keySet().iterator();
    L21:
        if (r12.hasNext() == false) goto L37;
        String r23 = r12.next();
        Object r3 = r83.get(r23);
        if ((r3 instanceof String) == false) goto L21;
        String r4 = (String) r3;
        if (AbstractC0433r.m1033H0(r4, "wxid_", false) == true) goto L30;
        if (AbstractC0433r.m1028C0(r4, "@chatroom") == true) goto L30;
        CharSequence r32 = (CharSequence) r3;
        Pattern r5 = Pattern.compile("[a-zA-Z][\\w\\-]{5,}");
        AbstractC0307g.m702d(r5, "compile(...)");
        AbstractC0307g.m703e(r32, "input");
        if (r5.matcher(r32).matches() == false) goto L21;
    L30:
        AbstractC0307g.m700b(r23);
        if (AbstractC0425j.m1005J0(r23, "User", true) == true) goto L36;
        if (AbstractC0425j.m1005J0(r23, "talker", true) == true) goto L36;
        if (AbstractC0425j.m1005J0(r23, "username", true) == false) goto L21;
    L36:
        return r4;
    L37:
        return "";
    }

    /* JADX INFO: renamed from: d */
    public static void m1639d(String r2) {
        AbstractC0762d.m1954d("[OKK-ProfileId] " + r2);     // Catch: Throwable -> L5
        return;
    }

    /* JADX INFO: renamed from: a */
    public final void m1640a(ClassLoader r8, String r9) {
        Object r02 = C0146l.f339a;
        Object r2 = AbstractC0358S.m906r(r8, r9);     // Catch: Throwable -> L5
    L8:
        if ((r2 instanceof C0140f) == false) goto L10;
        r2 = null;
    L10:
        Class r22 = (Class) r2;
        if (r22 != null) goto L29;
        m1639d("class miss: ".concat(r9));
        return;
    L29:
        AbstractC0358S.m904q(r22, "initView", new Object[]{new C0653f(this, r8, 3)});     // Catch: Throwable -> L16
        m1639d("hooked " + r9 + ".initView");     // Catch: Throwable -> L16
        Object r3 = r02;
    L18:
        Throwable r32 = AbstractC0141g.m465a(r3);
        if (r32 == null) goto L33;
        m1639d(r9 + ".initView fail: " + r32.getMessage());
    L33:
        AbstractC0358S.m904q(r22, "onPreferenceTreeClick", new Object[]{AbstractC0358S.m906r(r8, "com.tencent.mm.ui.base.preference.r"), AbstractC0358S.m906r(r8, "com.tencent.mm.ui.base.preference.Preference"), new MessageActionDispatcher(4, this)});     // Catch: Throwable -> L23
        m1639d("hooked " + r9 + ".onPreferenceTreeClick");     // Catch: Throwable -> L23
    L25:
        Throwable r82 = AbstractC0141g.m465a(r02);
        if (r82 == null) goto L35;
        m1639d(r9 + ".click fail: " + r82.getMessage());
        return;
    L35:
        return;
    L23:
        th = move-exception;
        r02 = AbstractC0040p.m116u(th);
    L16:
        th = move-exception;
        r3 = AbstractC0040p.m116u(th);
    L5:
        th = move-exception;
        r2 = AbstractC0040p.m116u(th);
        goto L8
    }
}
