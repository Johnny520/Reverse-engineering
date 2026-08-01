package p086r0;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.p055lu.wxmask.bean.MaskItemBean;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p009E0.C0106f;
import p009E0.C0109i;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0129q;
import p011F0.AbstractC0135w;
import p011F0.C0131s;
import p022L.AbstractC0174d;
import p025M0.InterfaceC0193a;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p040U0.C0297g;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0514f;
import p062e0.InterfaceC0551a;
import p070i0.AbstractC0731a;
import p077m0.C0764b;
import p077m0.C0767e;
import p084q0.C0808h;
import p102z0.AbstractC1122e;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.t1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0943t1 implements InterfaceC0551a {

    /* JADX INFO: renamed from: a */
    public String f3363a;

    /* JADX INFO: renamed from: b */
    public long f3364b;

    /* JADX INFO: renamed from: c */
    public long f3365c;

    /* JADX INFO: renamed from: d */
    public String f3366d;

    /* JADX INFO: renamed from: e */
    public long f3367e;

    /* JADX INFO: renamed from: f */
    public XC_MethodHook.Unhook f3368f;

    /* JADX INFO: renamed from: g */
    public boolean f3369g;

    /* JADX INFO: renamed from: h */
    public boolean f3370h;

    /* JADX INFO: renamed from: i */
    public boolean f3371i;

    /* JADX INFO: renamed from: j */
    public boolean f3372j;

    /* JADX INFO: renamed from: k */
    public boolean f3373k;

    /* JADX INFO: renamed from: l */
    public boolean f3374l;

    /* JADX INFO: renamed from: m */
    public boolean f3375m;

    /* JADX INFO: renamed from: n */
    public boolean f3376n;

    /* JADX INFO: renamed from: o */
    public boolean f3377o;

    /* JADX INFO: renamed from: p */
    public boolean f3378p;

    /* JADX INFO: renamed from: q */
    public WeakReference f3379q;

    /* JADX INFO: renamed from: r */
    public String f3380r;

    /* JADX INFO: renamed from: s */
    public long f3381s;

    /* JADX INFO: renamed from: t */
    public final ThreadLocal f3382t = new ThreadLocal();

    /* JADX INFO: renamed from: u */
    public final HashSet f3383u = new HashSet();

    /* JADX INFO: renamed from: v */
    public final ArrayList f3384v = new ArrayList();

    /* JADX INFO: renamed from: w */
    public final Set f3385w = AbstractC0135w.m302a0("com.tencent.mm.plugin.voip.ui.VideoActivity", "com.tencent.mm.plugin.appbrand.wmpfvoip.notify.ui.WmpfVoipCallInProxyActivity", "com.tencent.mm.plugin.voip.ui.MMSuperAlert", "com.tencent.mm.plugin.voip.widget.InviteRemindDialog", "com.tencent.mm.plugin.voip.floatcard.VoipFloatCardPermissionDialog");

    /* JADX INFO: renamed from: x */
    public static final long[] f3360x = {0, 200, 300};

    /* JADX INFO: renamed from: y */
    public static final List f3361y = AbstractC0120h.m252Z(new C0297g[]{new C0297g("(voip_)?(is_?)?out_?call[=:](true|1|yes)"), new C0297g("outgoing[=:](true|1|yes)"), new C0297g("is_?caller[=:](true|1|yes)"), new C0297g("(is_?)?from_?me[=:](true|1|yes)")});

    /* JADX INFO: renamed from: z */
    public static final List f3362z = AbstractC0120h.m252Z(new C0297g[]{new C0297g("(is_?)?incoming[=:](true|1|yes)"), new C0297g("(voip_)?in_?call[=:](true|1|yes)"), new C0297g("invite[=:](true|1|yes)"), new C0297g("caller[=:](false|0|no)"), new C0297g("(is_?)?from_?me[=:](false|0|no)")});

    /* JADX INFO: renamed from: A */
    public static final C0106f f3359A = new C0106f(new C0863P(29));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static boolean m2052A() {
        boolean z2 = AbstractC1126i.f3786a;
        return C1124g.m2443s() && C1124g.m2435k().getHideVoipCall();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[LOOP:0: B:9:0x0019->B:83:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m2053B(Bundle bundle) {
        Object c0104d;
        Set<String> setKeySet;
        Object c0104d2;
        boolean zM2059I;
        boolean z2 = false;
        if (bundle == null) {
            return false;
        }
        try {
            setKeySet = bundle.keySet();
            AbstractC0223g.m417d(setKeySet, "keySet(...)");
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (!setKeySet.isEmpty()) {
            Iterator<T> it = setKeySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                try {
                    c0104d2 = bundle.get(str);
                } catch (Throwable th2) {
                    c0104d2 = new C0104d(th2);
                }
                if (c0104d2 instanceof C0104d) {
                    c0104d2 = null;
                }
                AbstractC0223g.m415b(str);
                String lowerCase = str.toLowerCase(Locale.ROOT);
                AbstractC0223g.m417d(lowerCase, "toLowerCase(...)");
                if ((AbstractC0299i.m511i0(lowerCase, "incoming", false) || AbstractC0299i.m511i0(lowerCase, "in_call", false) || AbstractC0299i.m511i0(lowerCase, "incall", false) || AbstractC0299i.m511i0(lowerCase, "voip_in", false) || AbstractC0299i.m511i0(lowerCase, "invite", false)) && m2058G(c0104d2)) {
                    zM2059I = true;
                    break;
                    if (!zM2059I) {
                        z2 = true;
                        break;
                    }
                } else {
                    if (c0104d2 instanceof Bundle) {
                        zM2059I = m2053B((Bundle) c0104d2);
                    } else if (c0104d2 instanceof Intent) {
                        zM2059I = m2054C((Intent) c0104d2);
                    } else if (c0104d2 instanceof Object[]) {
                        for (Object obj : (Object[]) c0104d2) {
                            if (m2059I(String.valueOf(obj))) {
                                zM2059I = true;
                                break;
                            }
                        }
                        zM2059I = false;
                    } else if (c0104d2 instanceof Iterable) {
                        Iterable iterable = (Iterable) c0104d2;
                        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                            Iterator it2 = iterable.iterator();
                            while (it2.hasNext()) {
                                if (m2059I(String.valueOf(it2.next()))) {
                                    zM2059I = true;
                                    break;
                                    break;
                                }
                            }
                        }
                        zM2059I = false;
                    } else {
                        zM2059I = m2059I(str + "=" + c0104d2);
                    }
                    if (!zM2059I) {
                    }
                }
                Object obj2 = Boolean.FALSE;
                if (c0104d instanceof C0104d) {
                    c0104d = obj2;
                }
                return ((Boolean) c0104d).booleanValue();
            }
        }
        c0104d = Boolean.valueOf(z2);
        Object obj22 = Boolean.FALSE;
        if (c0104d instanceof C0104d) {
        }
        return ((Boolean) c0104d).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static boolean m2054C(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (m2053B(intent.getExtras())) {
            return true;
        }
        String action = intent.getAction();
        if (action == null) {
            action = "";
        }
        if (m2059I(action)) {
            return true;
        }
        String dataString = intent.getDataString();
        if (m2059I(dataString != null ? dataString : "")) {
            return true;
        }
        String string = intent.toString();
        AbstractC0223g.m417d(string, "toString(...)");
        return m2059I(string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[LOOP:0: B:9:0x0019->B:75:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m2055D(Bundle bundle) {
        Object c0104d;
        Set<String> setKeySet;
        Object c0104d2;
        boolean zM2060J;
        boolean z2 = false;
        if (bundle == null) {
            return false;
        }
        try {
            setKeySet = bundle.keySet();
            AbstractC0223g.m417d(setKeySet, "keySet(...)");
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (!setKeySet.isEmpty()) {
            Iterator<T> it = setKeySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                try {
                    c0104d2 = bundle.get(str);
                } catch (Throwable th2) {
                    c0104d2 = new C0104d(th2);
                }
                if (c0104d2 instanceof C0104d) {
                    c0104d2 = null;
                }
                AbstractC0223g.m415b(str);
                if (!m2057F(str) || !m2058G(c0104d2)) {
                    if (c0104d2 instanceof Bundle) {
                        zM2060J = m2055D((Bundle) c0104d2);
                    } else if (c0104d2 instanceof Intent) {
                        zM2060J = m2056E((Intent) c0104d2);
                    } else if (c0104d2 instanceof Object[]) {
                        for (Object obj : (Object[]) c0104d2) {
                            if (m2060J(String.valueOf(obj))) {
                                zM2060J = true;
                                break;
                            }
                        }
                        zM2060J = false;
                    } else if (c0104d2 instanceof Iterable) {
                        Iterable iterable = (Iterable) c0104d2;
                        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                            Iterator it2 = iterable.iterator();
                            while (it2.hasNext()) {
                                if (m2060J(String.valueOf(it2.next()))) {
                                    zM2060J = true;
                                    break;
                                    break;
                                }
                            }
                        }
                        zM2060J = false;
                    } else {
                        zM2060J = m2060J(str + "=" + c0104d2);
                    }
                    if (!zM2060J) {
                        z2 = true;
                        break;
                    }
                } else {
                    zM2060J = true;
                    break;
                    if (!zM2060J) {
                    }
                }
                Object obj2 = Boolean.FALSE;
                if (c0104d instanceof C0104d) {
                    c0104d = obj2;
                }
                return ((Boolean) c0104d).booleanValue();
            }
        }
        c0104d = Boolean.valueOf(z2);
        Object obj22 = Boolean.FALSE;
        if (c0104d instanceof C0104d) {
        }
        return ((Boolean) c0104d).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static boolean m2056E(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (m2055D(intent.getExtras())) {
            return true;
        }
        String action = intent.getAction();
        if (action == null) {
            action = "";
        }
        if (m2060J(action)) {
            return true;
        }
        String dataString = intent.getDataString();
        if (m2060J(dataString != null ? dataString : "")) {
            return true;
        }
        String string = intent.toString();
        AbstractC0223g.m417d(string, "toString(...)");
        return m2060J(string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static boolean m2057F(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC0223g.m417d(lowerCase, "toLowerCase(...)");
        return AbstractC0299i.m511i0(lowerCase, "outcall", false) || AbstractC0299i.m511i0(lowerCase, "out_call", false) || AbstractC0299i.m511i0(lowerCase, "outgoing", false) || AbstractC0299i.m511i0(lowerCase, "isoutcall", false) || AbstractC0299i.m511i0(lowerCase, "is_out_call", false) || AbstractC0299i.m511i0(lowerCase, "iscaller", false) || AbstractC0299i.m511i0(lowerCase, "is_caller", false) || AbstractC0299i.m511i0(lowerCase, "fromme", false) || AbstractC0299i.m511i0(lowerCase, "from_me", false) || AbstractC0299i.m511i0(lowerCase, "voip_out", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static boolean m2058G(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Number) {
            if (((Number) obj).intValue() != 1) {
                return false;
            }
        } else {
            if (!(obj instanceof String)) {
                return false;
            }
            String lowerCase = AbstractC0299i.m507C0((String) obj).toString().toLowerCase(Locale.ROOT);
            AbstractC0223g.m417d(lowerCase, "toLowerCase(...)");
            if (!lowerCase.equals("true") && !lowerCase.equals("1") && !lowerCase.equals("yes") && !lowerCase.equals("outgoing") && !lowerCase.equals("out")) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static boolean m2059I(String str) {
        if (!AbstractC0307q.m534d0(str)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC0223g.m417d(lowerCase, "toLowerCase(...)");
            Pattern patternCompile = Pattern.compile("\\s+");
            AbstractC0223g.m417d(patternCompile, "compile(...)");
            String strReplaceAll = patternCompile.matcher(lowerCase).replaceAll("");
            AbstractC0223g.m417d(strReplaceAll, "replaceAll(...)");
            List list = f3362z;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((C0297g) it.next()).m502a(strReplaceAll)) {
                        return true;
                    }
                }
            }
            if (AbstractC0299i.m511i0(str, "来电", false) || AbstractC0299i.m511i0(str, "邀请你", false) || AbstractC0299i.m511i0(str, "邀请您", false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static boolean m2060J(String str) {
        if (AbstractC0307q.m534d0(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC0223g.m417d(lowerCase, "toLowerCase(...)");
        Pattern patternCompile = Pattern.compile("\\s+");
        AbstractC0223g.m417d(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(lowerCase).replaceAll("");
        AbstractC0223g.m417d(strReplaceAll, "replaceAll(...)");
        List list = f3361y;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C0297g) it.next()).m502a(strReplaceAll)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static boolean m2061M(String str) {
        return !AbstractC0307q.m534d0(str) && (AbstractC0299i.m511i0(str, "Voip_User", false) || AbstractC0299i.m511i0(str, "Voip_", false) || AbstractC0299i.m511i0(str, "plugin.voip", true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static boolean m2062N(String str) {
        return !AbstractC0307q.m534d0(str) && (AbstractC0299i.m511i0(str, "voip", true) || AbstractC0299i.m511i0(str, "Voip_User", false) || AbstractC0299i.m511i0(str, "语音通话", false) || AbstractC0299i.m511i0(str, "视频通话", false) || AbstractC0299i.m511i0(str, "通话", false) || AbstractC0299i.m511i0(str, "来电", false) || AbstractC0299i.m511i0(str, "voice call", true) || AbstractC0299i.m511i0(str, "video call", true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static String m2063P(Method method) {
        String name = method.getDeclaringClass().getName();
        String name2 = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
        return name + "#" + name2 + "(" + AbstractC0120h.m260h0(parameterTypes, ",", new C0925n1(0), 30) + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static String m2064W(Intent intent) {
        if (intent == null) {
            return null;
        }
        String strM2080o = m2080o(intent.getExtras());
        if (strM2080o == null) {
            String dataString = intent.getDataString();
            if (dataString == null) {
                dataString = "";
            }
            strM2080o = m2081p(dataString);
            if (strM2080o == null) {
                String string = intent.toString();
                AbstractC0223g.m417d(string, "toString(...)");
                return m2081p(string);
            }
        }
        return strM2080o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static String m2065X(Object obj) {
        String string;
        if (obj == null || (string = obj.toString()) == null) {
            string = "null";
        }
        if (string.length() <= 1000) {
            return string;
        }
        String strSubstring = string.substring(0, 1000);
        AbstractC0223g.m417d(strSubstring, "substring(...)");
        return strSubstring + "...(" + string.length() + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m2066a(C0943t1 c0943t1, Activity activity, String str) {
        c0943t1.getClass();
        if (AbstractC0299i.m511i0(activity.getClass().getName(), "com.tencent.mm.ui.LauncherUI", true)) {
            AbstractC0731a.m1384a("keep voip suppression on launcher resume", str, activity.getClass().getName());
            return;
        }
        String name = activity.getClass().getName();
        if (AbstractC0299i.m511i0(name, "com.tencent.mm.ui.chatting.ChattingUI", true) || AbstractC0299i.m511i0(name, "com.tencent.mm.plugin.profile.ui.ContactInfoUI", true) || AbstractC0299i.m511i0(name, "com.tencent.mm.ui.LauncherUI", true)) {
            c0943t1.m2097j(str + ":" + activity.getClass().getName());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073 A[Catch: all -> 0x0023, TryCatch #1 {all -> 0x0023, blocks: (B:2:0x0000, B:9:0x0018, B:11:0x001c, B:34:0x0073, B:36:0x007e, B:14:0x0025, B:21:0x0042, B:26:0x004a), top: B:55:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2067a0(Object obj) {
        Object c0104d;
        Throwable thM246a;
        try {
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (obj instanceof MediaPlayer) {
            try {
                ((MediaPlayer) obj).setVolume(0.0f, 0.0f);
            } catch (Throwable unused) {
            }
            try {
                ((MediaPlayer) obj).pause();
            } catch (Throwable unused2) {
            }
            ((MediaPlayer) obj).stop();
        } else {
            if (obj instanceof Ringtone) {
                ((Ringtone) obj).stop();
                AbstractC0731a.m1384a("stop voip audio", obj == null ? obj.getClass().getName() : "null");
                c0104d = C0109i.f404a;
                thM246a = AbstractC0105e.m246a(c0104d);
                if (thM246a == null) {
                    AbstractC0731a.m1387d("stop voip audio fail", obj != null ? obj.getClass().getName() : null, thM246a);
                    return;
                }
                return;
            }
            if (obj instanceof AudioTrack) {
                try {
                    ((AudioTrack) obj).setVolume(0.0f);
                } catch (Throwable unused3) {
                }
                try {
                    ((AudioTrack) obj).pause();
                } catch (Throwable unused4) {
                }
                try {
                    ((AudioTrack) obj).stop();
                } catch (Throwable unused5) {
                }
                ((AudioTrack) obj).flush();
            } else {
                if ((obj instanceof Vibrator) || obj == null || AbstractC0299i.m511i0(obj.getClass().getName(), "vibrator", true)) {
                    return;
                }
                try {
                    AbstractC0514f.f1622b.mo1012c(obj, "cancel", new Object[0]);
                } catch (Throwable unused6) {
                }
                AbstractC0514f.f1622b.mo1012c(obj, "stop", new Object[0]);
            }
        }
        AbstractC0731a.m1384a("stop voip audio", obj == null ? obj.getClass().getName() : "null");
        c0104d = C0109i.f404a;
        thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final List m2068b(C0943t1 c0943t1, Object[] objArr) {
        c0943t1.getClass();
        if (objArr == null) {
            return C0131s.f426a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj instanceof Intent) {
                arrayList.add(obj);
            } else if (obj instanceof Object[]) {
                for (Object obj2 : (Object[]) obj) {
                    if (obj2 instanceof Intent) {
                        arrayList.add(obj2);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m2069c(C0943t1 c0943t1, Activity activity) {
        Class clsM1427a;
        Class clsM1427a2;
        if (c0943t1.m2084H(activity)) {
            String name = activity.getClass().getName();
            Intent intent = activity.getIntent();
            AbstractC0731a.m1384a("voip activity created", name, intent != null ? intent.getExtras() : null);
            if (c0943t1.f3368f == null) {
                WeakReference weakReference = new WeakReference(activity);
                Class clsM1427a3 = C0764b.m1427a("io.flutter.plugin.common.BasicMessageChannel$IncomingMessageHandler");
                if (clsM1427a3 != null && (clsM1427a = C0764b.m1427a("java.nio.ByteBuffer")) != null && (clsM1427a2 = C0764b.m1427a("io.flutter.plugin.common.BinaryMessenger$BinaryReply")) != null) {
                    c0943t1.f3368f = AbstractC0514f.f1622b.mo1017h(clsM1427a3, "onMessage", clsM1427a, clsM1427a2, new C0767e(c0943t1, weakReference));
                }
            }
            c0943t1.m2101t(activity);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static boolean m2070c0(View view, String str) {
        for (Class<?> superclass = view.getClass(); superclass != null && !superclass.equals(View.class); superclass = superclass.getSuperclass()) {
            if (AbstractC0299i.m511i0(superclass.getName(), str, true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final boolean m2071d(C0943t1 c0943t1, XC_MethodHook.MethodHookParam methodHookParam, Method method, Intent intent) {
        c0943t1.getClass();
        String strM2063P = m2063P(method);
        if (!c0943t1.m2085K(intent)) {
            c0943t1.m2098k(intent, "intent-start:" + strM2063P);
            return false;
        }
        String strM2064W = m2064W(intent);
        if (strM2064W == null) {
            strM2064W = c0943t1.m2090S();
        }
        String str = strM2064W;
        String strM355k = AbstractC0174d.m355k("enabled=", m2052A());
        String strM352h = AbstractC0174d.m352h("masked=", str);
        ComponentName component = intent.getComponent();
        String className = component != null ? component.getClassName() : null;
        Object extras = intent.getExtras();
        if (extras == null) {
            extras = intent;
        }
        AbstractC0731a.m1384a("voip intent start", strM2063P, strM355k, strM352h, className, m2065X(extras));
        if (str != null) {
            Object extras2 = intent.getExtras();
            if (extras2 == null) {
                extras2 = intent;
            }
            if (c0943t1.m2094Y(str, intent, m2065X(extras2), strM2063P)) {
                c0943t1.m2092U(str, strM2063P);
                AbstractC0731a.m1384a("block voip intent start", strM2063P, str);
                c0943t1.m2087O(strM2063P, str);
                m2075g(methodHookParam, method, null);
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public static String m2072d0() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        AbstractC0223g.m417d(stackTrace, "getStackTrace(...)");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            AbstractC0223g.m417d(className, "getClassName(...)");
            if (AbstractC0299i.m511i0(className, ".plugin.voip.", true) || AbstractC0299i.m511i0(className, ".plugin.voip$", true) || AbstractC0299i.m511i0(className, "voip", true)) {
                arrayList.add(stackTraceElement);
            }
        }
        return AbstractC0123k.m271m0(AbstractC0123k.m277s0(arrayList, 6), " <- ", null, null, new C0925n1(3), 30);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final String m2073e(C0943t1 c0943t1, Notification notification) {
        Object c0104d;
        Object obj;
        c0943t1.getClass();
        Bundle bundle = notification.extras;
        String[] strArr = {"android.title", "android.text", "android.subText", "android.bigText", "android.title", "android.text", "android.subText", "android.bigText"};
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 8; i2++) {
            String str = strArr[i2];
            if (bundle != null) {
                try {
                    obj = bundle.get(str);
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
            } else {
                obj = null;
            }
            c0104d = obj;
            Object obj2 = c0104d instanceof C0104d ? null : c0104d;
            if (obj2 != null) {
                sb.append(obj2);
                sb.append(' ');
            }
        }
        sb.append(bundle);
        String string = sb.toString();
        AbstractC0223g.m417d(string, "toString(...)");
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static ArrayList m2074f(Class cls) {
        Method[] methods = cls.getMethods();
        AbstractC0223g.m417d(methods, "getMethods(...)");
        List listM262j0 = AbstractC0120h.m262j0(methods);
        Method[] declaredMethods = cls.getDeclaredMethods();
        AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayListM273o0 = AbstractC0123k.m273o0(listM262j0, AbstractC0120h.m262j0(declaredMethods));
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM273o0) {
            Method method = (Method) obj;
            AbstractC0223g.m415b(method);
            if (hashSet.add(m2063P(method))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m2075g(XC_MethodHook.MethodHookParam methodHookParam, Method method, Integer num) {
        Object objValueOf = num;
        if (num == null) {
            Class<?> returnType = method.getReturnType();
            AbstractC0223g.m417d(returnType, "getReturnType(...)");
            objValueOf = returnType.equals(Boolean.TYPE) ? Boolean.FALSE : returnType.equals(Byte.TYPE) ? (byte) 0 : returnType.equals(Short.TYPE) ? (short) 0 : returnType.equals(Integer.TYPE) ? 0 : returnType.equals(Long.TYPE) ? 0L : returnType.equals(Float.TYPE) ? Float.valueOf(0.0f) : returnType.equals(Double.TYPE) ? Double.valueOf(0.0d) : returnType.equals(Character.TYPE) ? (char) 0 : null;
        }
        methodHookParam.setResult(objValueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m2076h(C0943t1 c0943t1, XC_MethodHook.MethodHookParam methodHookParam, Method method) {
        c0943t1.getClass();
        m2075g(methodHookParam, method, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static Class m2077i(String str) {
        Object c0104d;
        try {
            c0104d = Class.forName(str);
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Throwable thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a != null) {
            AbstractC0731a.m1387d("voip class not found", str, thM246a);
        }
        if (c0104d instanceof C0104d) {
            c0104d = null;
        }
        return (Class) c0104d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m2078l(View view, int i2, StringBuilder sb) {
        String string;
        String string2;
        String string3;
        if (view == null || i2 < 0 || sb.length() > 1500) {
            return;
        }
        sb.append(" view=");
        sb.append(view.getClass().getName());
        CharSequence contentDescription = view.getContentDescription();
        if (contentDescription != null && (string3 = contentDescription.toString()) != null) {
            if (AbstractC0307q.m534d0(string3)) {
                string3 = null;
            }
            if (string3 != null) {
                sb.append(" cd=");
                sb.append(string3);
            }
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            CharSequence text = textView.getText();
            if (text != null && (string2 = text.toString()) != null) {
                if (AbstractC0307q.m534d0(string2)) {
                    string2 = null;
                }
                if (string2 != null) {
                    sb.append(" text=");
                    sb.append(string2);
                }
            }
            CharSequence hint = textView.getHint();
            if (hint != null && (string = hint.toString()) != null) {
                String str = AbstractC0307q.m534d0(string) ? null : string;
                if (str != null) {
                    sb.append(" hint=");
                    sb.append(str);
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int iMin = Math.min(viewGroup.getChildCount(), 12);
            for (int i3 = 0; i3 < iMin; i3++) {
                m2078l(viewGroup.getChildAt(i3), i2 - 1, sb);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static boolean m2079n() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        AbstractC0223g.m417d(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            AbstractC0223g.m417d(className, "getClassName(...)");
            if (AbstractC0299i.m511i0(className, ".plugin.voip.", true) || AbstractC0299i.m511i0(className, ".plugin.voip$", true) || AbstractC0299i.m511i0(className, "voip", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static String m2080o(Bundle bundle) {
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
                String strM2081p = m2081p(str + "=" + c0104d2);
                if (strM2081p != null) {
                    return strM2081p;
                }
                if (c0104d2 instanceof Bundle) {
                    String strM2080o = m2080o((Bundle) c0104d2);
                    if (strM2080o != null) {
                        return strM2080o;
                    }
                } else if (c0104d2 instanceof Intent) {
                    String strM2064W = m2064W((Intent) c0104d2);
                    if (strM2064W != null) {
                        return strM2064W;
                    }
                } else if (c0104d2 instanceof Object[]) {
                    for (Object obj : (Object[]) c0104d2) {
                        String strM2081p2 = m2081p(String.valueOf(obj));
                        if (strM2081p2 != null) {
                            return strM2081p2;
                        }
                    }
                } else if (c0104d2 instanceof Iterable) {
                    Iterator it = ((Iterable) c0104d2).iterator();
                    while (it.hasNext()) {
                        String strM2081p3 = m2081p(String.valueOf(it.next()));
                        if (strM2081p3 != null) {
                            return strM2081p3;
                        }
                    }
                } else {
                    continue;
                }
            }
            String string = bundle.toString();
            AbstractC0223g.m417d(string, "toString(...)");
            c0104d = m2081p(string);
        } catch (Throwable th2) {
            c0104d = new C0104d(th2);
        }
        return (String) (c0104d instanceof C0104d ? null : c0104d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static String m2081p(String str) {
        Object next;
        Object next2;
        if (!AbstractC0307q.m534d0(str)) {
            ((C0808h) AbstractC0503h.m988u(C0808h.class)).m1474c();
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
            boolean z3 = AbstractC1126i.f3786a;
            Iterator it2 = C1124g.m2433i().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                MaskItemBean maskItemBean = (MaskItemBean) next2;
                if (!AbstractC0307q.m534d0(maskItemBean.getTagName()) && AbstractC0299i.m511i0(str, maskItemBean.getTagName(), false)) {
                    break;
                }
            }
            MaskItemBean maskItemBean2 = (MaskItemBean) next2;
            if (maskItemBean2 != null) {
                return maskItemBean2.getMaskId();
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static boolean m2082q(Method method) {
        Class<?> componentType;
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
        for (Class<?> cls : parameterTypes) {
            if (Intent.class.isAssignableFrom(cls) || (cls.isArray() && (componentType = cls.getComponentType()) != null && Intent.class.isAssignableFrom(componentType))) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static boolean m2083r(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
        for (Class<?> cls : parameterTypes) {
            if (Notification.class.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final boolean m2084H(Activity activity) {
        String name = activity.getClass().getName();
        return this.f3385w.contains(name) || AbstractC0299i.m511i0(name, "voip", true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final boolean m2085K(Intent intent) {
        ComponentName component = intent.getComponent();
        String className = component != null ? component.getClassName() : null;
        if (className == null) {
            className = "";
        }
        if (!this.f3385w.contains(className) && !AbstractC0299i.m511i0(className, "voip", true) && !m2086L(intent.getExtras())) {
            String action = intent.getAction();
            if (action == null) {
                action = "";
            }
            if (!m2061M(action)) {
                String dataString = intent.getDataString();
                if (!m2061M(dataString != null ? dataString : "")) {
                    String string = intent.toString();
                    AbstractC0223g.m417d(string, "toString(...)");
                    if (!m2061M(string)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[LOOP:0: B:9:0x0019->B:63:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2086L(Bundle bundle) {
        Object c0104d;
        Set<String> setKeySet;
        boolean z2;
        Object c0104d2;
        boolean zM2085K;
        boolean z3 = false;
        if (bundle == null) {
            return false;
        }
        try {
            setKeySet = bundle.keySet();
            AbstractC0223g.m417d(setKeySet, "keySet(...)");
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (!setKeySet.isEmpty()) {
            Iterator<T> it = setKeySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                if (AbstractC0223g.m414a(str, "block_contact")) {
                    z2 = false;
                    if (z2) {
                        z3 = true;
                        break;
                    }
                } else {
                    AbstractC0223g.m415b(str);
                    if (!AbstractC0299i.m511i0(str, "Voip", false) && !str.equals("is_ilink_voip")) {
                        try {
                            c0104d2 = bundle.get(str);
                        } catch (Throwable th2) {
                            c0104d2 = new C0104d(th2);
                        }
                        if (c0104d2 instanceof C0104d) {
                            c0104d2 = null;
                        }
                        if (c0104d2 instanceof Bundle) {
                            zM2085K = m2086L((Bundle) c0104d2);
                        } else if (c0104d2 instanceof Intent) {
                            zM2085K = m2085K((Intent) c0104d2);
                        } else if (AbstractC0307q.m538h0(str, false, "Voip_")) {
                            String string = c0104d2 != null ? c0104d2.toString() : null;
                            if (string == null) {
                                string = "";
                            }
                            if (m2061M(string)) {
                                zM2085K = true;
                            }
                        } else {
                            zM2085K = false;
                        }
                        if (zM2085K) {
                        }
                        if (z2) {
                        }
                    }
                    z2 = true;
                    if (z2) {
                    }
                }
                Object obj = Boolean.FALSE;
                if (c0104d instanceof C0104d) {
                    c0104d = obj;
                }
                return ((Boolean) c0104d).booleanValue();
            }
        }
        c0104d = Boolean.valueOf(z3);
        Object obj2 = Boolean.FALSE;
        if (c0104d instanceof C0104d) {
        }
        return ((Boolean) c0104d).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public final void m2087O(String str, String str2) {
        String strM2088Q;
        Object c0104d;
        Context context;
        if (m2052A()) {
            this.f3365c = System.currentTimeMillis();
            if (str2 != null && !AbstractC0307q.m534d0(str2) && !str2.equals(this.f3363a)) {
                m2092U(str2, "suppressed:" + str);
            }
            String str3 = "unknown";
            if (str2 == null) {
                strM2088Q = m2088Q();
                if (strM2088Q == null) {
                    strM2088Q = "unknown";
                }
            } else {
                strM2088Q = str2;
            }
            AbstractC0731a.m1384a("voip suppressed", str, strM2088Q);
            if (str2 == null) {
                str2 = m2088Q();
            }
            ThreadLocal threadLocal = this.f3382t;
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str4 = str2 == null ? str : str2;
            if ((!AbstractC0223g.m414a(str4, this.f3380r) || jCurrentTimeMillis - this.f3381s >= 12000) && jCurrentTimeMillis - this.f3381s >= 1000) {
                WeakReference weakReference = this.f3379q;
                Object systemService = (weakReference == null || (context = (Context) weakReference.get()) == null) ? null : context.getSystemService("vibrator");
                Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
                if (vibrator != null) {
                    this.f3380r = str4;
                    this.f3381s = jCurrentTimeMillis;
                    try {
                        threadLocal.set(Boolean.TRUE);
                        try {
                            long[] jArr = f3360x;
                            Object objM247a = f3359A.m247a();
                            AbstractC0223g.m417d(objM247a, "getValue(...)");
                            vibrator.vibrate(jArr, -1, (AudioAttributes) objM247a);
                            threadLocal.remove();
                            if (str2 != null) {
                                str3 = str2;
                            }
                            AbstractC0731a.m1384a("hidden voip vibrate", str, str3);
                            c0104d = C0109i.f404a;
                        } catch (Throwable th) {
                            threadLocal.remove();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        c0104d = new C0104d(th2);
                    }
                    Throwable thM246a = AbstractC0105e.m246a(c0104d);
                    if (thM246a != null) {
                        threadLocal.remove();
                        AbstractC0731a.m1387d("hidden voip vibrate fail", str, thM246a);
                    }
                }
            }
            m2096b0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public final String m2088Q() {
        String str = this.f3363a;
        if (str != null && System.currentTimeMillis() - this.f3364b <= 30000) {
            return str;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public final boolean m2089R(String str) {
        if (System.currentTimeMillis() - this.f3367e > 1800000) {
            return false;
        }
        String str2 = this.f3366d;
        return str == null || AbstractC0307q.m534d0(str) || str2 == null || AbstractC0307q.m534d0(str2) || AbstractC0223g.m414a(str2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public final String m2090S() {
        if (m2091T()) {
            return m2088Q();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public final boolean m2091T() {
        return System.currentTimeMillis() - this.f3365c <= 12000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public final void m2092U(String str, String str2) {
        this.f3363a = str;
        this.f3364b = System.currentTimeMillis();
        AbstractC0731a.m1384a("voip masked user", str2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public final void m2093V(String str, String str2) {
        this.f3366d = str;
        this.f3367e = System.currentTimeMillis();
        if (this.f3365c != 0 || this.f3363a != null) {
            this.f3365c = 0L;
            this.f3363a = null;
            this.f3364b = 0L;
            m2096b0();
        }
        if (str == null) {
            str = "unknown";
        }
        AbstractC0731a.m1384a("voip outgoing", str2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public final boolean m2094Y(String str, Intent intent, String str2, String str3) {
        if (m2056E(intent) || m2060J(str2)) {
            m2093V(str, str3);
            return false;
        }
        if (str == null || AbstractC0307q.m534d0(str) || !m2052A()) {
            return false;
        }
        boolean z2 = AbstractC1126i.f3786a;
        if (C1124g.m2429e(str)) {
            AbstractC0731a.m1384a("skip voip hide for temporary unhide", str3, str);
            return false;
        }
        String str4 = AbstractC1122e.f3783a;
        String string = AbstractC0299i.m507C0(str).toString();
        Set set = AbstractC1122e.f3785c;
        if ((AbstractC0307q.m534d0(string) || set.isEmpty()) ? false : set.contains(string)) {
            AbstractC0731a.m1384a("skip voip hide for manager opened chat", str3, str);
            return false;
        }
        if (!m2089R(str)) {
            return true;
        }
        AbstractC0731a.m1384a("skip voip hide for outgoing", str3, str);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public final boolean m2095Z(String str, Intent intent, String str2, String str3) {
        if (!m2094Y(str, intent, str2, str3)) {
            return false;
        }
        if (m2091T() || AbstractC0307q.m538h0(str3, false, "activity-current:") || AbstractC0307q.m538h0(str3, false, "activity-guard:") || m2054C(intent) || m2059I(str2)) {
            return true;
        }
        AbstractC0731a.m1384a("skip voip surface hide without incoming evidence", str3, str);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public final void m2096b0() {
        ArrayList arrayList;
        synchronized (this.f3384v) {
            try {
                ArrayList arrayList2 = this.f3384v;
                arrayList = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Object obj = ((WeakReference) it.next()).get();
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                }
                this.f3384v.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m2067a0(it2.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v4, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p062e0.InterfaceC0551a
    public final void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        int i2;
        int i3 = 3;
        int i4 = 4;
        int i5 = 0;
        int i6 = 1;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f3379q = new WeakReference(applicationContext);
        String name = context.getClass().getName();
        String str = loadPackageParam.processName;
        String strM355k = AbstractC0174d.m355k("enabled=", m2052A());
        boolean z2 = AbstractC1126i.f3786a;
        AbstractC0731a.m1384a("voip hook init", name, str, strM355k, AbstractC0174d.m351g(C1124g.m2433i().size(), "maskCount="));
        if (!this.f3369g) {
            this.f3369g = true;
            AbstractC0514f.m1025b(Activity.class, "onCreate", Bundle.class, new C0934q1(this, i5));
            AbstractC0514f.m1025b(Activity.class, "onResume", new C0934q1(this, i6));
            AbstractC0514f.m1025b(Activity.class, "onNewIntent", Intent.class, new C0934q1(this, 2));
            AbstractC0514f.m1025b(Activity.class, "onKeyDown", Integer.TYPE, KeyEvent.class, new C0934q1(this, i3));
        }
        if (!this.f3370h) {
            this.f3370h = true;
            m2103v(Activity.class, "startActivity", "startActivities", "startActivityForResult");
            m2103v(ContextWrapper.class, "startActivity", "startActivities", "startService", "startForegroundService", "bindService");
            m2103v(Instrumentation.class, "execStartActivity");
            m2104w(m2077i("android.app.ContextImpl"), "startActivity", "startActivities", "startService", "startForegroundService", "bindService");
            m2104w(m2077i("android.app.IActivityTaskManager$Stub$Proxy"), "startActivity");
            m2104w(m2077i("android.app.IActivityManager$Stub$Proxy"), "startActivity", "startService", "bindService");
        }
        if (!this.f3376n) {
            this.f3376n = true;
            for (String str2 : this.f3385w) {
                ClassLoader classLoader = AbstractC0503h.m991x().getClassLoader();
                AbstractC0223g.m418e(str2, "clazz");
                AbstractC0223g.m418e(classLoader, "classLoader");
                Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader, str2);
                if (clsMo1021l == null) {
                    i2 = i5;
                } else {
                    Method[] declaredMethods = clsMo1021l.getDeclaredMethods();
                    AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                    ArrayList arrayList = new ArrayList();
                    int length = declaredMethods.length;
                    int i7 = i5;
                    while (i7 < length) {
                        Method method = declaredMethods[i7];
                        int i8 = i5;
                        if (AbstractC0223g.m414a(method.getName(), "onCreate") && method.getParameterTypes().length == 1 && Bundle.class.isAssignableFrom(method.getParameterTypes()[i8])) {
                            arrayList.add(method);
                        }
                        i7++;
                        i5 = i8;
                    }
                    i2 = i5;
                    HashSet hashSet = new HashSet();
                    ArrayList<Method> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        Method method2 = (Method) obj;
                        AbstractC0223g.m415b(method2);
                        if (hashSet.add(m2063P(method2))) {
                            arrayList2.add(obj);
                        }
                    }
                    for (Method method3 : arrayList2) {
                        AbstractC0223g.m415b(method3);
                        m2105x(method3, "voip hook activity guard fail", new C0931p1(this));
                    }
                }
                i5 = i2;
            }
        }
        int i9 = i5;
        ClassLoader classLoader2 = AbstractC0503h.m991x().getClassLoader();
        AbstractC0223g.m418e(classLoader2, "classLoader");
        Class clsMo1021l2 = AbstractC0514f.f1622b.mo1021l(classLoader2, "com.tencent.mm.plugin.voip.ui.t0$$b");
        if (clsMo1021l2 != null) {
            Method[] declaredMethods2 = clsMo1021l2.getDeclaredMethods();
            AbstractC0223g.m417d(declaredMethods2, "getDeclaredMethods(...)");
            ArrayList arrayList3 = new ArrayList();
            int length2 = declaredMethods2.length;
            for (int i10 = i9; i10 < length2; i10++) {
                Method method4 = declaredMethods2[i10];
                if (AbstractC0223g.m414a(method4.getName(), "invoke") && method4.getParameterTypes().length == 1) {
                    arrayList3.add(method4);
                }
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                XposedBridge.hookMethod((Method) it.next(), new C0934q1(this, i4));
            }
        }
        if (!this.f3373k) {
            this.f3373k = true;
            m2106y(Service.class, "android.app.Service");
            m2107z("com.tencent.mm.plugin.voip.widget.VoipNewForegroundService");
            m2107z("com.tencent.mm.plugin.voip.widget.VoipForegroundService");
            if (!this.f3374l) {
                this.f3374l = true;
                for (String str3 : AbstractC0120h.m252Z(new String[]{"com.tencent.mm.plugin.voip.widget.VoipSmallService", "com.tencent.mm.plugin.voip.widget.VoipNewForegroundService", "com.tencent.mm.plugin.voip.widget.VoipForegroundService"})) {
                    ClassLoader classLoader3 = AbstractC0503h.m991x().getClassLoader();
                    AbstractC0223g.m418e(str3, "clazz");
                    AbstractC0223g.m418e(classLoader3, "classLoader");
                    Class clsMo1021l3 = AbstractC0514f.f1622b.mo1021l(classLoader3, str3);
                    if (clsMo1021l3 != null) {
                        Method[] declaredMethods3 = clsMo1021l3.getDeclaredMethods();
                        AbstractC0223g.m417d(declaredMethods3, "getDeclaredMethods(...)");
                        ArrayList arrayList4 = new ArrayList();
                        int length3 = declaredMethods3.length;
                        for (int i11 = i9; i11 < length3; i11++) {
                            Method method5 = declaredMethods3[i11];
                            if (AbstractC0223g.m414a(method5.getName(), "onBind") && m2082q(method5)) {
                                arrayList4.add(method5);
                            }
                        }
                        HashSet hashSet2 = new HashSet();
                        ArrayList<Method> arrayList5 = new ArrayList();
                        for (Object obj2 : arrayList4) {
                            Method method6 = (Method) obj2;
                            AbstractC0223g.m415b(method6);
                            if (hashSet2.add(m2063P(method6))) {
                                arrayList5.add(obj2);
                            }
                        }
                        for (Method method7 : arrayList5) {
                            AbstractC0223g.m415b(method7);
                            m2105x(method7, "voip hook service bind fail", new C0922m1(this, method7, i3));
                        }
                    }
                }
            }
            if (!this.f3375m) {
                this.f3375m = true;
                ArrayList arrayListM2074f = m2074f(Service.class);
                ArrayList arrayList6 = new ArrayList();
                for (Object obj3 : arrayListM2074f) {
                    Method method8 = (Method) obj3;
                    if (AbstractC0223g.m414a(method8.getName(), "startForeground") && m2083r(method8)) {
                        arrayList6.add(obj3);
                    }
                }
                HashSet hashSet3 = new HashSet();
                ArrayList<Method> arrayList7 = new ArrayList();
                for (Object obj4 : arrayList6) {
                    if (hashSet3.add(m2063P((Method) obj4))) {
                        arrayList7.add(obj4);
                    }
                }
                for (Method method9 : arrayList7) {
                    m2105x(method9, "voip hook startForeground fail", new C0922m1(this, method9, i4));
                }
            }
        }
        if (!this.f3377o) {
            this.f3377o = true;
            Iterator it2 = AbstractC0120h.m252Z(new String[]{"android.view.WindowManagerImpl", "android.view.WindowManagerGlobal"}).iterator();
            while (it2.hasNext()) {
                Class clsM2077i = m2077i((String) it2.next());
                if (clsM2077i != null) {
                    Method[] declaredMethods4 = clsM2077i.getDeclaredMethods();
                    AbstractC0223g.m417d(declaredMethods4, "getDeclaredMethods(...)");
                    ArrayList arrayList8 = new ArrayList();
                    int length4 = declaredMethods4.length;
                    for (int i12 = i9; i12 < length4; i12++) {
                        Method method10 = declaredMethods4[i12];
                        if (AbstractC0223g.m414a(method10.getName(), "addView")) {
                            Class<?>[] parameterTypes = method10.getParameterTypes();
                            AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                            int length5 = parameterTypes.length;
                            int i13 = i9;
                            while (true) {
                                if (i13 >= length5) {
                                    break;
                                }
                                if (View.class.isAssignableFrom(parameterTypes[i13])) {
                                    Class<?>[] parameterTypes2 = method10.getParameterTypes();
                                    AbstractC0223g.m417d(parameterTypes2, "getParameterTypes(...)");
                                    int length6 = parameterTypes2.length;
                                    int i14 = i9;
                                    while (true) {
                                        if (i14 >= length6) {
                                            break;
                                        }
                                        if (ViewGroup.LayoutParams.class.isAssignableFrom(parameterTypes2[i14])) {
                                            arrayList8.add(method10);
                                            break;
                                        }
                                        i14++;
                                    }
                                } else {
                                    i13++;
                                }
                            }
                        }
                    }
                    HashSet hashSet4 = new HashSet();
                    ArrayList<Method> arrayList9 = new ArrayList();
                    for (Object obj5 : arrayList8) {
                        Method method11 = (Method) obj5;
                        AbstractC0223g.m415b(method11);
                        if (hashSet4.add(m2063P(method11))) {
                            arrayList9.add(obj5);
                        }
                    }
                    for (Method method12 : arrayList9) {
                        AbstractC0223g.m415b(method12);
                        m2105x(method12, "voip hook floating window fail", new C0922m1(this, method12, i6));
                    }
                }
            }
        }
        if (!this.f3378p) {
            this.f3378p = true;
            m2102u(MediaPlayer.class, "mediaPlayer", "start");
            m2102u(SoundPool.class, "soundPool", "play");
            m2102u(Ringtone.class, "ringtone", "play");
            m2102u(AudioTrack.class, "audioTrack", "play");
            m2102u(Vibrator.class, "vibrator", "vibrate");
            m2102u(m2077i("android.os.SystemVibrator"), "systemVibrator", "vibrate");
            m2102u(m2077i("android.os.VibratorManager"), "vibratorManager", "vibrate");
        }
        if (!this.f3372j) {
            this.f3372j = true;
            ArrayList arrayListM2074f2 = m2074f(NotificationManager.class);
            ArrayList arrayList10 = new ArrayList();
            for (Object obj6 : arrayListM2074f2) {
                Method method13 = (Method) obj6;
                String name2 = method13.getName();
                AbstractC0223g.m417d(name2, "getName(...)");
                if (AbstractC0307q.m538h0(name2, i9, "notify") && m2083r(method13)) {
                    arrayList10.add(obj6);
                }
                i9 = 0;
            }
            HashSet hashSet5 = new HashSet();
            ArrayList<Method> arrayList11 = new ArrayList();
            for (Object obj7 : arrayList10) {
                if (hashSet5.add(m2063P((Method) obj7))) {
                    arrayList11.add(obj7);
                }
            }
            for (Method method14 : arrayList11) {
                m2105x(method14, "voip hook notification fail", new C0922m1(this, method14, 0));
            }
        }
        if (this.f3371i) {
            return;
        }
        Context applicationContext2 = context.getApplicationContext();
        Application application = applicationContext2 instanceof Application ? (Application) applicationContext2 : null;
        if (application == null) {
            return;
        }
        this.f3371i = true;
        application.registerActivityLifecycleCallbacks(new C0911j(this, i4));
        AbstractC0731a.m1384a("voip activity callbacks registered");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m2097j(String str) {
        if (this.f3365c == 0 && this.f3363a == null && this.f3367e == 0 && this.f3366d == null) {
            return;
        }
        this.f3365c = 0L;
        this.f3363a = null;
        this.f3364b = 0L;
        this.f3366d = null;
        this.f3367e = 0L;
        m2096b0();
        AbstractC0731a.m1384a("voip suppression cleared", str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m2098k(Intent intent, String str) {
        ComponentName component = intent.getComponent();
        String className = component != null ? component.getClassName() : null;
        if (className == null) {
            className = "";
        }
        if (AbstractC0299i.m511i0(className, "com.tencent.mm.ui.LauncherUI", true)) {
            AbstractC0731a.m1384a("keep voip suppression on launcher intent", str, className);
            return;
        }
        if (AbstractC0299i.m511i0(className, "com.tencent.mm.ui.chatting.ChattingUI", true) || AbstractC0299i.m511i0(className, "com.tencent.mm.plugin.profile.ui.ContactInfoUI", true) || AbstractC0299i.m511i0(className, "com.tencent.mm.ui.LauncherUI", true)) {
            m2097j(str + ":" + className);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final String m2099m(Activity activity) {
        String strM2064W = m2064W(activity.getIntent());
        return strM2064W != null ? strM2064W : m2090S();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final void m2100s(Activity activity, String str) {
        Object c0104d;
        View decorView;
        if (activity == null) {
            return;
        }
        m2087O("activity:".concat(activity.getClass().getName()), str);
        try {
            Window window = activity.getWindow();
            if (window != null) {
                window.clearFlags(2621440);
            }
            View viewFindViewById = activity.findViewById(R.id.content);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(4);
            }
            Window window2 = activity.getWindow();
            if (window2 != null && (decorView = window2.getDecorView()) != null) {
                decorView.setVisibility(4);
            }
            activity.finish();
            c0104d = Boolean.valueOf(activity.moveTaskToBack(true));
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Throwable thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a != null) {
            AbstractC0731a.m1387d("hide voip activity fail", thM246a);
        }
        AbstractC0731a.m1384a("hide voip activity", activity.getClass().getName(), str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m2101t(Activity activity) {
        Object intent;
        String strM2099m = m2099m(activity);
        if (strM2099m == null) {
            return;
        }
        Intent intent2 = activity.getIntent();
        Intent intent3 = activity.getIntent();
        if (intent3 == null || (intent = intent3.getExtras()) == null) {
            intent = activity.getIntent();
        }
        if (m2095Z(strM2099m, intent2, m2065X(intent), "activity-current:".concat(activity.getClass().getName()))) {
            m2100s(activity, strM2099m);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final void m2102u(Class cls, String str, String... strArr) {
        if (cls == null) {
            return;
        }
        ArrayList arrayListM2074f = m2074f(cls);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM2074f) {
            Method method = (Method) obj;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (AbstractC0223g.m414a(method.getName(), strArr[i2])) {
                        arrayList.add(obj);
                        break;
                    }
                    i2++;
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<Method> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(m2063P((Method) obj2))) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            AbstractC0731a.m1387d("voip audio method not found", cls.getName(), AbstractC0120h.m260h0(strArr, "|", null, 62));
        }
        for (Method method2 : arrayList2) {
            m2105x(method2, "voip hook audio side effect fail", new C0928o1(this, method2, str));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final void m2103v(Class cls, String... strArr) {
        ArrayList arrayListM2074f = m2074f(cls);
        for (String str : strArr) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListM2074f) {
                Method method = (Method) obj;
                if (AbstractC0223g.m414a(method.getName(), str) && m2082q(method)) {
                    arrayList.add(obj);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList<Method> arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (hashSet.add(m2063P((Method) obj2))) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.isEmpty()) {
                AbstractC0731a.m1387d("voip intent starter not found", cls.getName(), str);
            }
            for (Method method2 : arrayList2) {
                m2105x(method2, "voip hook intent starter fail", new C0922m1(this, method2, 2));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final void m2104w(Class cls, String... strArr) {
        if (cls == null) {
            return;
        }
        ArrayList arrayListM2074f = m2074f(cls);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM2074f) {
            Method method = (Method) obj;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    String str = strArr[i2];
                    String name = method.getName();
                    AbstractC0223g.m417d(name, "getName(...)");
                    if (!AbstractC0307q.m538h0(name, false, str)) {
                        i2++;
                    } else if (m2082q(method)) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<Method> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(m2063P((Method) obj2))) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            AbstractC0731a.m1387d("voip system intent starter not found", cls.getName(), AbstractC0120h.m260h0(strArr, "|", null, 62));
        }
        for (Method method2 : arrayList2) {
            m2105x(method2, "voip hook system intent starter fail", new C0922m1(this, method2, 5));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final void m2105x(Method method, String str, InterfaceC0193a interfaceC0193a) {
        Object c0104d;
        if (Modifier.isAbstract(method.getModifiers())) {
            return;
        }
        String strM2063P = m2063P(method);
        HashSet hashSet = this.f3383u;
        if (hashSet.add(strM2063P)) {
            try {
                method.setAccessible(true);
                XposedBridge.hookMethod(method, (XC_MethodHook) interfaceC0193a.mo7b());
                c0104d = C0109i.f404a;
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a != null) {
                hashSet.remove(strM2063P);
                AbstractC0731a.m1387d(str, strM2063P, thM246a);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final void m2106y(Class cls, String str) {
        ArrayList arrayList = new ArrayList();
        for (Class superclass = cls; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            Method[] declaredMethods = superclass.getDeclaredMethods();
            AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
            AbstractC0129q.m292f0(arrayList, declaredMethods);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(m2063P((Method) obj))) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            Method method = (Method) obj2;
            if (AbstractC0223g.m414a(method.getName(), "onStartCommand") && m2082q(method)) {
                arrayList3.add(obj2);
            }
        }
        HashSet hashSet2 = new HashSet();
        ArrayList<Method> arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            if (hashSet2.add(m2063P((Method) obj3))) {
                arrayList4.add(obj3);
            }
        }
        if (arrayList4.isEmpty()) {
            Method[] declaredMethods2 = cls.getDeclaredMethods();
            AbstractC0223g.m417d(declaredMethods2, "getDeclaredMethods(...)");
            AbstractC0731a.m1387d("voip service onStartCommand not found", str, AbstractC0120h.m260h0(declaredMethods2, ",", new C0931p1(this), 30));
        } else {
            for (Method method2 : arrayList4) {
                m2105x(method2, "voip hook service start fail", new C0928o1(this, str, method2));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final void m2107z(String str) {
        ClassLoader classLoader = AbstractC0503h.m991x().getClassLoader();
        AbstractC0223g.m418e(classLoader, "classLoader");
        Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader, str);
        if (clsMo1021l == null) {
            return;
        }
        m2106y(clsMo1021l, str);
    }
}
