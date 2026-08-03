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
    public static final C0655f1 f2038a = new C0655f1();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2039b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public static boolean m1637b() {
        Object objM116u;
        try {
            ConfigStore configStore = ConfigStore.f2048a;
            objM116u = Boolean.valueOf(ConfigStore.m1661c("profile_id", false));
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Object obj = Boolean.FALSE;
        if (objM116u instanceof C0140f) {
            objM116u = obj;
        }
        return ((Boolean) objM116u).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static String m1638c(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return "";
        }
        Iterator it = AbstractC0182m.m556h0("Contact_User", "Contact_UserName", "User", "userName", "Chat_User", "Contact_Alias", "kintent_talker").iterator();
        while (it.hasNext()) {
            String stringExtra = intent.getStringExtra((String) it.next());
            String string = stringExtra != null ? AbstractC0425j.m1022a1(stringExtra).toString() : null;
            if (string == null) {
                string = "";
            }
            if (string.length() > 0) {
                return string;
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                Object obj = extras.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!AbstractC0433r.m1033H0(str2, "wxid_", false) && !AbstractC0433r.m1028C0(str2, "@chatroom")) {
                        CharSequence charSequence = (CharSequence) obj;
                        Pattern patternCompile = Pattern.compile("[a-zA-Z][\\w\\-]{5,}");
                        AbstractC0307g.m702d(patternCompile, "compile(...)");
                        AbstractC0307g.m703e(charSequence, "input");
                        if (!patternCompile.matcher(charSequence).matches()) {
                            continue;
                        }
                    }
                    AbstractC0307g.m700b(str);
                    if (AbstractC0425j.m1005J0(str, "User", true) || AbstractC0425j.m1005J0(str, "talker", true) || AbstractC0425j.m1005J0(str, "username", true)) {
                        return str2;
                    }
                }
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: d */
    public static void m1639d(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-ProfileId] " + str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1640a(ClassLoader classLoader, String str) {
        Object objM116u;
        Object objM116u2;
        Object objM116u3 = C0146l.f339a;
        try {
            objM116u = AbstractC0358S.m906r(classLoader, str);
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        Class cls = (Class) objM116u;
        if (cls == null) {
            m1639d("class miss: ".concat(str));
            return;
        }
        try {
            AbstractC0358S.m904q(cls, "initView", new C0653f(this, classLoader, 3));
            m1639d("hooked " + str + ".initView");
            objM116u2 = objM116u3;
        } catch (Throwable th2) {
            objM116u2 = AbstractC0040p.m116u(th2);
        }
        Throwable thM465a = AbstractC0141g.m465a(objM116u2);
        if (thM465a != null) {
            m1639d(str + ".initView fail: " + thM465a.getMessage());
        }
        try {
            AbstractC0358S.m904q(cls, "onPreferenceTreeClick", AbstractC0358S.m906r(classLoader, "com.tencent.mm.ui.base.preference.r"), AbstractC0358S.m906r(classLoader, "com.tencent.mm.ui.base.preference.Preference"), new MessageActionDispatcher(4, this));
            m1639d("hooked " + str + ".onPreferenceTreeClick");
        } catch (Throwable th3) {
            objM116u3 = AbstractC0040p.m116u(th3);
        }
        Throwable thM465a2 = AbstractC0141g.m465a(objM116u3);
        if (thM465a2 != null) {
            m1639d(str + ".click fail: " + thM465a2.getMessage());
        }
    }
}
