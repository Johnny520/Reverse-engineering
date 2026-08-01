package p086r0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p009E0.C0104d;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0134v;
import p011F0.C0131s;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p062e0.InterfaceC0551a;
import p070i0.AbstractC0731a;
import p084q0.C0808h;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0914k implements InterfaceC0551a {

    /* JADX INFO: renamed from: b */
    public static final List f3240b;

    /* JADX INFO: renamed from: a */
    public boolean f3241a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0134v.m294Y(12));
        AbstractC0120h.m261i0(new String[]{"Contact_User", "Contact_Username", "Contact_UserName", "username", "user_name", "talker", "talkerUsername", "Chat_User", "fromUser", "toUser", "kintent_talker", "detail_username"}, linkedHashSet);
        f3240b = AbstractC0123k.m281w0(linkedHashSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m1994a(C0914k c0914k, Activity activity, String str) {
        String strM1997d;
        c0914k.getClass();
        boolean z2 = AbstractC1126i.f3786a;
        if (C1124g.m2448x()) {
            String name = activity.getClass().getName();
            if ((!AbstractC0299i.m511i0(name, "com.tencent.mm.plugin.profile.ui.ContactInfoUI", true) && !AbstractC0299i.m511i0(name, "com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI", true) && !AbstractC0299i.m511i0(name, "ContactInfoUI", true) && !AbstractC0299i.m511i0(name, "ContactMoreInfoUI", true)) || (strM1997d = m1997d(activity.getIntent())) == null || C1124g.m2429e(strM1997d)) {
                return;
            }
            C0808h c0808h = (C0808h) AbstractC0503h.m988u(C0808h.class);
            boolean zContains = false;
            if (C1124g.m2443s()) {
                if (AbstractC0307q.m534d0(strM1997d)) {
                    AbstractC0731a.m1387d("chatUser is null or blank");
                } else {
                    zContains = c0808h.f2685b.contains(strM1997d);
                }
            }
            if (zContains && !activity.isFinishing()) {
                activity.finish();
                AbstractC0731a.m1384a("block close friend profile", str, activity.getClass().getName(), strM1997d);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m1995b(Bundle bundle) {
        Object c0104d;
        Object c0104d2;
        if (bundle == null) {
            return null;
        }
        try {
            Set<String> setKeySet = bundle.keySet();
            AbstractC0223g.m417d(setKeySet, "keySet(...)");
            for (String str : setKeySet) {
                try {
                    c0104d2 = bundle.get(str);
                } catch (Throwable th) {
                    c0104d2 = new C0104d(th);
                }
                if (c0104d2 instanceof C0104d) {
                    c0104d2 = null;
                }
                String strM1996c = m1996c(str + "=" + c0104d2);
                if (strM1996c != null) {
                    return strM1996c;
                }
                if (c0104d2 instanceof Bundle) {
                    String strM1995b = m1995b((Bundle) c0104d2);
                    if (strM1995b != null) {
                        return strM1995b;
                    }
                } else if (c0104d2 instanceof Intent) {
                    String strM1997d = m1997d((Intent) c0104d2);
                    if (strM1997d != null) {
                        return strM1997d;
                    }
                } else if (c0104d2 instanceof Object[]) {
                    for (Object obj : (Object[]) c0104d2) {
                        String strM1996c2 = m1996c(String.valueOf(obj));
                        if (strM1996c2 != null) {
                            return strM1996c2;
                        }
                    }
                } else if (c0104d2 instanceof Iterable) {
                    Iterator it = ((Iterable) c0104d2).iterator();
                    while (it.hasNext()) {
                        String strM1996c3 = m1996c(String.valueOf(it.next()));
                        if (strM1996c3 != null) {
                            return strM1996c3;
                        }
                    }
                } else {
                    continue;
                }
            }
            String string = bundle.toString();
            AbstractC0223g.m417d(string, "toString(...)");
            c0104d = m1996c(string);
        } catch (Throwable th2) {
            c0104d = new C0104d(th2);
        }
        return (String) (c0104d instanceof C0104d ? null : c0104d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m1996c(String str) {
        Object next;
        if (!AbstractC0307q.m534d0(str)) {
            boolean z2 = AbstractC1126i.f3786a;
            ArrayList arrayListM266h0 = AbstractC0123k.m266h0(!C1124g.m2443s() ? C0131s.f426a : new ArrayList(((C0808h) AbstractC0503h.m988u(C0808h.class)).f2684a));
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListM266h0) {
                if (!AbstractC0307q.m534d0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC0299i.m511i0(str, (String) next, false)) {
                    break;
                }
            }
            String str2 = (String) next;
            if (str2 != null) {
                return str2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m1997d(Intent intent) {
        String string;
        if (intent == null) {
            return null;
        }
        Iterator it = f3240b.iterator();
        while (it.hasNext()) {
            String stringExtra = intent.getStringExtra((String) it.next());
            if (stringExtra != null && (string = AbstractC0299i.m507C0(stringExtra).toString()) != null) {
                if (AbstractC0307q.m534d0(string)) {
                    string = null;
                }
                if (string != null) {
                    return string;
                }
            }
        }
        String strM1995b = m1995b(intent.getExtras());
        if (strM1995b == null) {
            String dataString = intent.getDataString();
            if (dataString == null) {
                dataString = "";
            }
            strM1995b = m1996c(dataString);
            if (strM1995b == null) {
                String string2 = intent.toString();
                AbstractC0223g.m417d(string2, "toString(...)");
                return m1996c(string2);
            }
        }
        return strM1995b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p062e0.InterfaceC0551a
    public final void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        if (AbstractC0223g.m414a(loadPackageParam.packageName, loadPackageParam.processName) && !this.f3241a) {
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application == null) {
                Application application2 = context instanceof Application ? (Application) context : null;
                if (application2 == null) {
                    return;
                } else {
                    application = application2;
                }
            }
            application.registerActivityLifecycleCallbacks(new C0911j(this, 0));
            this.f3241a = true;
        }
    }
}
