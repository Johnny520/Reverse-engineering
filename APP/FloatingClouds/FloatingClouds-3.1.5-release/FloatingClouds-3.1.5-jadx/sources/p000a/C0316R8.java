package p000a;

import android.app.Activity;
import android.app.Dialog;
import android.app.Instrumentation;
import android.app.Notification;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.SoundPool;
import android.media.ToneGenerator;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000a.C0186K3;
import p000a.C0582fh;
import p000a.C0901wd;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.R8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0316R8 implements IPlugin {

    /* JADX INFO: renamed from: c */
    public static final String[] f1131c;

    /* JADX INFO: renamed from: d */
    public static final String[] f1132d;

    /* JADX INFO: renamed from: e */
    public static final String[] f1133e;

    /* JADX INFO: renamed from: f */
    public static final String[] f1134f;

    /* JADX INFO: renamed from: g */
    public static final List<Pattern> f1135g;

    /* JADX INFO: renamed from: a */
    public final Set<String> f1136a = C0726n9.m1681z("com.tencent.mm.plugin.voip.ui.VideoActivity", "com.tencent.mm.plugin.appbrand.wmpfvoip.notify.ui.WmpfVoipCallInProxyActivity");

    /* JADX INFO: renamed from: b */
    public volatile boolean f1137b;

    static {
        Pattern.compile("username=(.*?),");
        f1131c = new String[]{"com.tencent.mm.plugin.voip.widget.VoipForegroundService", "com.tencent.mm.plugin.voip.widget.VoipNewForegroundService", "com.tencent.mm.plugin.voip.widget.VoipSmallService"};
        f1132d = new String[]{"com.tencent.mm.plugin.voip.ui.VideoActivity", "com.tencent.mm.plugin.appbrand.wmpfvoip.notify.ui.WmpfVoipCallInProxyActivity", "com.tencent.mm.plugin.voip.ui.MMSuperAlert", "com.tencent.mm.plugin.voip.widget.InviteRemindDialog", "com.tencent.mm.plugin.voip.floatcard.VoipFloatCardPermissionDialog", "com.tencent.mm.plugin.voip.ui.VoipViewFragment"};
        f1133e = new String[]{"voip", "call", "incoming", "语音", "视频", "通话", "呼叫", "来电", "邀请你", "等待接听", "接听"};
        f1134f = new String[]{"com.tencent.mm.plugin.voip.widget.NewVideoTalkingSmallView", "com.tencent.mm.plugin.voip.widget.BaseSmallView", "com.tencent.mm.plugin.voip.video.MovableVideoView", "com.tencent.mm.plugin.voip.video.NewMovableVideoView", "com.tencent.mm.plugin.voip.video.VoIPRenderTextureView", "com.tencent.mm.plugin.voip.widget.VoipBigIconButton"};
        C0739o3.m1757d0(Pattern.compile("(voip_)?(is_?)?out_?call[=:](true|1|yes)", 2), Pattern.compile("outgoing[=:](true|1|yes)", 2), Pattern.compile("is_?caller[=:](true|1|yes)", 2), Pattern.compile("(is_?)?from_?me[=:](true|1|yes)", 2));
        f1135g = C0739o3.m1757d0(Pattern.compile("(is_?)?incoming[=:](true|1|yes)", 2), Pattern.compile("(voip_)?in_?call[=:](true|1|yes)", 2), Pattern.compile("invite[=:](true|1|yes)", 2), Pattern.compile("caller[=:](false|0|no)", 2), Pattern.compile("(is_?)?from_?me[=:](false|0|no)", 2), Pattern.compile("is_?ilink_?voip[=:](true|1|yes)", 2));
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m859a(Notification notification) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3 = notification.tickerText;
        String string = null;
        String string2 = charSequence3 != null ? charSequence3.toString() : null;
        Bundle bundle = notification.extras;
        String string3 = bundle != null ? bundle.getString("android.title") : null;
        Bundle bundle2 = notification.extras;
        String string4 = (bundle2 == null || (charSequence2 = bundle2.getCharSequence("android.text")) == null) ? null : charSequence2.toString();
        Bundle bundle3 = notification.extras;
        if (bundle3 != null && (charSequence = bundle3.getCharSequence("android.bigText")) != null) {
            string = charSequence.toString();
        }
        return C0238N1.m629c0(new String[]{string2, string3, string4, string});
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m860b(View view) {
        ArrayList arrayList = new ArrayList();
        try {
            m861c(view, arrayList);
            C0413Wf c0413Wf = C0413Wf.f1577a;
            return arrayList;
        } catch (Throwable th) {
            C0920xd.m2206a(th);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m861c(View view, ArrayList arrayList) {
        if (view == null) {
            return;
        }
        if (view instanceof TextView) {
            arrayList.add(((TextView) view).getText().toString());
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m861c(viewGroup.getChildAt(i), arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m862d(String str) {
        Matcher matcher = Pattern.compile("(wxid_[a-zA-Z0-9_-]+|gh_[a-zA-Z0-9]+|\\d+@chatroom|[a-zA-Z0-9_-]+@openim)").matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C0631i9.m1481d(lowerCase, "toLowerCase(...)");
        String[] strArr = {"filehelper", "weixin", "qmessage"};
        for (int i = 0; i < 3; i++) {
            String str2 = strArr[i];
            if (C0034Be.m94I(lowerCase, str2, false)) {
                return str2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static String m863e(Intent intent) {
        Object next;
        Iterator it = C0238N1.m629c0(new String[]{intent.getStringExtra("Voip_User"), intent.getStringExtra("username"), intent.getStringExtra("talker"), intent.getStringExtra("k_username")}).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C0943yh.m2221a((String) next)) {
                break;
            }
        }
        return (String) next;
    }

    /* JADX INFO: renamed from: f */
    public static Object m864f(XposedInterface.Chain chain) {
        String strM862d;
        C0186K3.f638a.getClass();
        if (!C0186K3.a.m511l()) {
            return chain.proceed();
        }
        List args = chain.getArgs();
        C0631i9.m1481d(args, "getArgs(...)");
        Object obj = args.isEmpty() ? null : args.get(args.size() - 1);
        Notification notification = obj instanceof Notification ? (Notification) obj : null;
        if (notification == null) {
            return chain.proceed();
        }
        ArrayList arrayListM859a = m859a(notification);
        Iterator it = arrayListM859a.iterator();
        while (true) {
            if (!it.hasNext()) {
                strM862d = null;
                break;
            }
            strM862d = m862d((String) it.next());
            if (strM862d != null) {
                break;
            }
        }
        if (strM862d != null) {
            ExecutorService executorService = C0582fh.f2149G;
            if (C0582fh.a.m1423a(strM862d)) {
                m873r("intercept notification for hidden user=".concat(strM862d));
                return null;
            }
        }
        C0186K3.f638a.getClass();
        if (!C0186K3.a.m508i().f2412D) {
            return chain.proceed();
        }
        boolean zM872q = m872q(notification);
        m873r("NotificationManager.notify active=" + C0506bh.m1251b() + " isVoip=" + zM872q + " texts=" + arrayListM859a + " wxidInText=" + strM862d);
        if (!C0506bh.m1251b() || !zM872q) {
            if (strM862d != null) {
                ExecutorService executorService2 = C0582fh.f2149G;
                if (C0582fh.a.m1423a(strM862d)) {
                    m873r("intercept notification containing blacklisted user=".concat(strM862d));
                    C0506bh.m1256g(strM862d);
                }
            }
            return chain.proceed();
        }
        m873r("suppress VoIP notification");
        C0506bh.m1254e();
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static Object m865g(XposedInterface.Chain chain) {
        Object next;
        C0186K3.f638a.getClass();
        if (!C0186K3.a.m511l() || !C0186K3.a.m508i().f2412D) {
            return chain.proceed();
        }
        List args = chain.getArgs();
        C0631i9.m1481d(args, "getArgs(...)");
        Iterator it = args.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof Intent) {
                break;
            }
        }
        Intent intent = next instanceof Intent ? (Intent) next : null;
        if (intent != null) {
            m874s("startActivity", intent);
            if (m875t(intent)) {
                m873r("intercept startActivity intent=" + intent.getComponent() + " extras=" + m876u(intent));
                return null;
            }
        }
        return chain.proceed();
    }

    /* JADX INFO: renamed from: h */
    public static Object m866h(XposedInterface.Chain chain) {
        Object next;
        C0186K3.f638a.getClass();
        if (!C0186K3.a.m511l() || !C0186K3.a.m508i().f2412D) {
            return chain.proceed();
        }
        List args = chain.getArgs();
        C0631i9.m1481d(args, "getArgs(...)");
        Iterator it = args.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof Intent) {
                break;
            }
        }
        Intent intent = next instanceof Intent ? (Intent) next : null;
        if (intent != null) {
            m874s("startService/startForegroundService/bindService", intent);
            if (m875t(intent)) {
                m873r("intercept startService/startForegroundService/bindService intent=" + intent.getComponent() + " extras=" + m876u(intent));
                return Boolean.FALSE;
            }
        }
        return chain.proceed();
    }

    /* JADX INFO: renamed from: j */
    public static Object m867j(XposedInterface.Chain chain) {
        boolean z;
        CharSequence title;
        String string;
        String string2;
        boolean z2 = true;
        C0186K3.f638a.getClass();
        if (!C0186K3.a.m511l() || !C0186K3.a.m508i().f2412D) {
            return chain.proceed();
        }
        List args = chain.getArgs();
        C0631i9.m1481d(args, "getArgs(...)");
        Object objM1951o0 = C0834t3.m1951o0(args, 0);
        View view = objM1951o0 instanceof View ? (View) objM1951o0 : null;
        if (view == null) {
            return chain.proceed();
        }
        List args2 = chain.getArgs();
        C0631i9.m1481d(args2, "getArgs(...)");
        Object objM1951o02 = C0834t3.m1951o0(args2, 1);
        WindowManager.LayoutParams layoutParams = objM1951o02 instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) objM1951o02 : null;
        if (layoutParams == null) {
            return chain.proceed();
        }
        String name = view.getClass().getName();
        String[] strArr = f1134f;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                String str = strArr[i];
                if (name.equals(str)) {
                    break;
                }
                if (C0015Ae.m49H(name, str + "$", false)) {
                    break;
                }
                i++;
            } else {
                if (C0015Ae.m49H(name, "com.tencent.mm.plugin.ball.view.", false) || C0034Be.m94I(name, "FloatBall", true) || C0034Be.m94I(name, "Voip", true) || C0034Be.m94I(name, "voip", true)) {
                    break;
                }
                z = false;
            }
        }
        z = true;
        CharSequence title2 = layoutParams.getTitle();
        boolean z3 = ((title2 == null || (string2 = title2.toString()) == null || !C0034Be.m94I(string2, "VoIP", true)) && ((title = layoutParams.getTitle()) == null || (string = title.toString()) == null || !C0034Be.m94I(string, "call", true))) ? false : true;
        int i2 = layoutParams.type;
        boolean z4 = i2 == 2038 || i2 == 2003 || i2 == 2006;
        if (!z && !z3 && !z4) {
            return chain.proceed();
        }
        String strM1952p0 = C0834t3.m1952p0(m860b(view), " ", null, 62);
        if (!z && !z3) {
            String[] strArr2 = f1133e;
            int length2 = strArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    z2 = false;
                    break;
                }
                if (C0034Be.m94I(strM1952p0, strArr2[i3], true)) {
                    break;
                }
                i3++;
            }
        }
        if (C0506bh.m1251b()) {
            CharSequence title3 = layoutParams.getTitle();
            m873r("WindowManager addView active title=" + ((Object) title3) + " type=" + layoutParams.type + " viewClass=" + view.getClass().getName() + " text=" + strM1952p0 + " isVoipView=" + z2);
        }
        if (!z2) {
            return chain.proceed();
        }
        CharSequence title4 = layoutParams.getTitle();
        m873r("WindowManager addView candidate title=" + ((Object) title4) + " type=" + layoutParams.type + " viewClass=" + view.getClass().getName() + " text=" + strM1952p0);
        String strM862d = m862d(strM1952p0);
        String strM1250a = C0506bh.m1250a();
        if (C0506bh.m1251b() && strM1250a != null) {
            m873r("WindowManager addView suppressed for active intercept user=" + strM1250a + " text=" + strM1952p0);
            return null;
        }
        if (strM862d != null) {
            ExecutorService executorService = C0582fh.f2149G;
            if (C0582fh.a.m1423a(strM862d)) {
                m873r("WindowManager addView suppressed for blacklisted user=" + strM862d + " text=" + strM1952p0);
                C0506bh.m1256g(strM862d);
                return null;
            }
        }
        return chain.proceed();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m868k() {
        C0186K3.f638a.getClass();
        if (C0186K3.a.m511l()) {
            return C0506bh.m1251b() || !C0186K3.a.m505f().isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m869n(Intent intent, String str, boolean z) {
        C0186K3.f638a.getClass();
        if (C0186K3.a.m511l() && C0186K3.a.m508i().f2412D) {
            String strM863e = m863e(intent);
            boolean zM870o = m870o(intent);
            StringBuilder sbM2229i = C0944z.m2229i("VoIP intent detected source=", str, " user=", strM863e, " incoming=");
            sbM2229i.append(zM870o);
            sbM2229i.append(" isActivity=");
            sbM2229i.append(z);
            m873r(sbM2229i.toString());
            if (strM863e != null) {
                ExecutorService executorService = C0582fh.f2149G;
                if (C0582fh.a.m1423a(strM863e)) {
                    if (z && !zM870o && !C0506bh.m1251b()) {
                        m873r("allow established/outgoing VoIP Activity for user=" + strM863e + " source=" + str);
                        return false;
                    }
                    m873r("intercept VoIP intent for user=" + strM863e + " source=" + str);
                    C0506bh.m1256g(strM863e);
                    return true;
                }
            }
            if (C0506bh.m1251b()) {
                String strM1250a = C0506bh.m1250a();
                if (strM1250a != null) {
                    ExecutorService executorService2 = C0582fh.f2149G;
                    if (C0582fh.a.m1423a(strM1250a)) {
                        m873r("intercept VoIP intent during active intercept source=" + str + " isActivity=" + z + " activeUser=" + strM1250a);
                        C0506bh.m1254e();
                        return true;
                    }
                }
                if (zM870o) {
                    m873r("intercept incoming VoIP intent during active intercept source=".concat(str));
                    return true;
                }
            }
            StringBuilder sbM2229i2 = C0944z.m2229i("allow VoIP intent source=", str, " user=", strM863e, " incoming=");
            sbM2229i2.append(zM870o);
            m873r(sbM2229i2.toString());
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m870o(Intent intent) {
        Set<String> setKeySet;
        String string;
        Object obj;
        Bundle extras = intent.getExtras();
        if (extras == null || (setKeySet = extras.keySet()) == null || setKeySet.isEmpty()) {
            return false;
        }
        for (String str : setKeySet) {
            Bundle extras2 = intent.getExtras();
            if (extras2 == null || (obj = extras2.get(str)) == null || (string = obj.toString()) == null) {
                string = "";
            }
            List<Pattern> list = f1135g;
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((Pattern) it.next()).matcher(str + "=" + string).find()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m871p(String str) {
        String[] strArr = f1132d;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                String str2 = strArr[i];
                if (str.equals(str2)) {
                    break;
                }
                if (C0015Ae.m49H(str, str2 + "$", false)) {
                    break;
                }
                i++;
            } else {
                String[] strArr2 = f1131c;
                int length2 = strArr2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        if (C0034Be.m94I(str, "voip", true) || C0034Be.m94I(str, "wmpfvoip", true)) {
                            break;
                        }
                        return false;
                    }
                    String str3 = strArr2[i2];
                    if (str.equals(str3)) {
                        break;
                    }
                    if (C0015Ae.m49H(str, str3 + "$", false)) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m872q(Notification notification) {
        String channelId = notification.getChannelId();
        if ((channelId == null || !C0034Be.m94I(channelId, "voip", true)) && !C0631i9.m1478a(notification.category, "call") && notification.fullScreenIntent == null) {
            ArrayList<String> arrayListM859a = m859a(notification);
            if (!arrayListM859a.isEmpty()) {
                for (String str : arrayListM859a) {
                    for (String str2 : f1133e) {
                        if (!C0034Be.m94I(str, str2, true)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public static void m873r(String str) {
        C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2231k("[IgnoreVoipCall] ", str)}, 1));
    }

    /* JADX INFO: renamed from: s */
    public static void m874s(String str, Intent intent) {
        String className;
        ComponentName component = intent.getComponent();
        if (component == null || (className = component.getClassName()) == null || !m871p(className)) {
            return;
        }
        String strM876u = m876u(intent);
        StringBuilder sbM2229i = C0944z.m2229i("VoIP intent candidate source=", str, " component=", className, " extras=");
        sbM2229i.append(strM876u);
        m873r(sbM2229i.toString());
    }

    /* JADX INFO: renamed from: t */
    public static boolean m875t(Intent intent) {
        ComponentName component = intent.getComponent();
        String className = component != null ? component.getClassName() : null;
        boolean z = true;
        if (className == null || !m871p(className)) {
            String action = intent.getAction();
            if (action == null || !(C0034Be.m94I(action, "voip", true) || C0034Be.m94I(action, "call", true))) {
                return false;
            }
            return m869n(intent, action, false);
        }
        String[] strArr = f1132d;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            String str = strArr[i];
            if (className.equals(str)) {
                break;
            }
            if (C0015Ae.m49H(className, str + "$", false)) {
                break;
            }
            i++;
        }
        return m869n(intent, className, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m876u(Intent intent) {
        Object objM2206a;
        Set<String> setKeySet;
        try {
            Bundle extras = intent.getExtras();
            if (extras == null || (setKeySet = extras.keySet()) == null) {
                objM2206a = "null";
            } else {
                objM2206a = C0834t3.m1952p0(setKeySet, ", ", new C0830t(6, intent), 30);
                if (objM2206a == null) {
                }
            }
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        if (objM2206a instanceof C0901wd.a) {
            objM2206a = "error";
        }
        return (String) objM2206a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e3 A[Catch: all -> 0x02eb, TryCatch #8 {all -> 0x02eb, blocks: (B:130:0x02db, B:132:0x02e3, B:136:0x02ed), top: B:310:0x02db }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ed A[Catch: all -> 0x02eb, TRY_LEAVE, TryCatch #8 {all -> 0x02eb, blocks: (B:130:0x02db, B:132:0x02e3, B:136:0x02ed), top: B:310:0x02db }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x034b A[Catch: all -> 0x0351, TryCatch #29 {all -> 0x0351, blocks: (B:140:0x0343, B:142:0x034b, B:145:0x0353), top: B:353:0x0343 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0353 A[Catch: all -> 0x0351, TRY_LEAVE, TryCatch #29 {all -> 0x0351, blocks: (B:140:0x0343, B:142:0x034b, B:145:0x0353), top: B:353:0x0343 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03af A[Catch: all -> 0x03b5, TryCatch #11 {all -> 0x03b5, blocks: (B:149:0x03a7, B:151:0x03af, B:154:0x03b7), top: B:316:0x03a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03b7 A[Catch: all -> 0x03b5, TRY_LEAVE, TryCatch #11 {all -> 0x03b5, blocks: (B:149:0x03a7, B:151:0x03af, B:154:0x03b7), top: B:316:0x03a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0415 A[Catch: all -> 0x041b, TryCatch #40 {all -> 0x041b, blocks: (B:157:0x0409, B:159:0x0415, B:162:0x041d, B:163:0x0421, B:165:0x0427), top: B:375:0x0409 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x041d A[Catch: all -> 0x041b, TryCatch #40 {all -> 0x041b, blocks: (B:157:0x0409, B:159:0x0415, B:162:0x041d, B:163:0x0421, B:165:0x0427), top: B:375:0x0409 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0623 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x024b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x05a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x01e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01dd  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleHook(C0173J8 c0173j8) {
        Class cls;
        String str;
        String str2;
        Class cls2;
        Class cls3;
        XposedInterface.HookHandle hookHandleM2206a;
        Throwable thM2189a;
        XposedInterface.HookHandle hookHandleM2206a2;
        Class<?> cls4;
        Class cls5;
        Class cls6;
        Class<?> cls7;
        Class cls8;
        String str3;
        Class cls9;
        XposedInterface.HookHandle hookHandleM2206a3;
        Throwable thM2189a2;
        String str4;
        String str5;
        XposedInterface.HookHandle hookHandleM2206a4;
        Throwable thM2189a3;
        XposedInterface.HookHandle hookHandleM2206a5;
        Throwable thM2189a4;
        XposedInterface.HookHandle hookHandleM2206a6;
        Object objM2206a;
        Throwable thM2189a5;
        String str6;
        XposedInterface.HookHandle hookHandleM2206a7;
        Throwable thM2189a6;
        XposedInterface.HookHandle hookHandleM2206a8;
        Throwable thM2189a7;
        XposedInterface.HookHandle hookHandleM2206a9;
        Throwable thM2189a8;
        XposedInterface.HookHandle hookHandleM2206a10;
        Throwable thM2189a9;
        Class<?> cls10;
        Method method;
        XposedInterface.HookHandle hookHandleM2206a11;
        List<Method> listM1184e;
        Method methodM1186g;
        Method methodM1187h;
        Method methodM1185f;
        Class cls11 = Integer.TYPE;
        C0631i9.m1482e(c0173j8, "session");
        m873r("handleHook started");
        try {
            str2 = "notify";
            try {
                cls = Notification.class;
                try {
                    str = ": ";
                    try {
                        C0173J8.m463a(c0173j8, Activity.class.getName(), "startActivity", new Class[]{Intent.class}, new C0263O8(this, 3));
                    } catch (Throwable th) {
                        th = th;
                        C0920xd.m2206a(th);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str = ": ";
                    C0920xd.m2206a(th);
                    C0173J8.m463a(c0173j8, Activity.class.getName(), "startActivity", new Class[]{Intent.class, Bundle.class}, new C0263O8(this, 4));
                    String name = Activity.class.getName();
                    C0631i9.m1479b(cls11);
                    C0173J8.m463a(c0173j8, name, "startActivityForResult", new Class[]{Intent.class, cls11}, new C0263O8(this, 5));
                    String name2 = Activity.class.getName();
                    C0631i9.m1479b(cls11);
                    C0173J8.m463a(c0173j8, name2, "startActivityForResult", new Class[]{Intent.class, cls11, Bundle.class}, new C0263O8(this, 6));
                    m873r("Activity start hooks installed");
                    cls2 = ContextWrapper.class;
                    try {
                        C0173J8.m463a(c0173j8, Context.class.getName(), "startActivity", new Class[]{Intent.class}, new C0263O8(this, 9));
                    } catch (Throwable th3) {
                        th = th3;
                        C0920xd.m2206a(th);
                    }
                    C0173J8.m463a(c0173j8, Context.class.getName(), "startActivity", new Class[]{Intent.class, Bundle.class}, new C0263O8(this, 10));
                    C0173J8.m463a(c0173j8, Context.class.getName(), "startService", new Class[]{Intent.class}, new C0263O8(this, 11));
                    C0173J8.m463a(c0173j8, Context.class.getName(), "startForegroundService", new Class[]{Intent.class}, new C0263O8(this, 12));
                    String name3 = Context.class.getName();
                    C0631i9.m1479b(cls11);
                    C0173J8.m463a(c0173j8, name3, "bindService", new Class[]{Intent.class, Service.class, cls11}, new C0687l8(this, 20));
                    C0173J8.m463a(c0173j8, cls2.getName(), "startActivity", new Class[]{Intent.class}, new C0687l8(this, 21));
                    C0173J8.m463a(c0173j8, cls2.getName(), "startService", new Class[]{Intent.class}, new C0687l8(this, 22));
                    C0173J8.m463a(c0173j8, cls2.getName(), "startForegroundService", new Class[]{Intent.class}, new C0687l8(this, 23));
                    m873r("Context/ContextWrapper start hooks installed (abstract method failures suppressed via runCatching)");
                    String name4 = Instrumentation.class.getName();
                    C0631i9.m1479b(cls11);
                    cls3 = cls11;
                    try {
                        hookHandleM2206a = C0173J8.m463a(c0173j8, name4, "execStartActivity", new Class[]{Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, cls3, Bundle.class}, new C0687l8(this, 27));
                    } catch (Throwable th4) {
                        th = th4;
                        hookHandleM2206a = C0920xd.m2206a(th);
                    }
                    thM2189a = C0901wd.m2189a(hookHandleM2206a);
                    if (thM2189a != null) {
                    }
                    m873r("Instrumentation hook installed");
                    if (C0002A1.m13b(c0173j8.f608a, "android.app.IActivityTaskManager$Stub$Proxy") != null) {
                    }
                    if (C0002A1.m13b(c0173j8.f608a, "android.app.IActivityManager$Stub$Proxy") != null) {
                    }
                    methodM1185f = C0487ah.m1185f(c0173j8.f608a);
                    if (methodM1185f != null) {
                    }
                    str3 = str;
                    methodM1187h = C0487ah.m1187h(c0173j8.f608a);
                    if (methodM1187h != null) {
                    }
                    methodM1186g = C0487ah.m1186g(c0173j8.f608a);
                    if (methodM1186g != null) {
                    }
                    listM1184e = C0487ah.m1184e(c0173j8.f608a);
                    if (listM1184e.isEmpty()) {
                    }
                    String name5 = Service.class.getName();
                    C0631i9.m1479b(cls6);
                    cls9 = cls;
                    hookHandleM2206a3 = C0173J8.m463a(c0173j8, name5, "startForeground", new Class[]{cls6, cls9}, new C0263O8(this, 8));
                    thM2189a2 = C0901wd.m2189a(hookHandleM2206a3);
                    if (thM2189a2 != null) {
                    }
                    m873r("Service.startForeground hook installed");
                    while (i < r7) {
                    }
                    C0631i9.m1479b(cls6);
                    str4 = "android.app.NotificationManager";
                    str5 = str2;
                    try {
                        hookHandleM2206a4 = C0173J8.m463a(c0173j8, str4, str5, new Class[]{String.class, cls6, cls9}, new C0687l8(this, 28));
                    } catch (Throwable th5) {
                        th = th5;
                        hookHandleM2206a4 = C0920xd.m2206a(th);
                    }
                    thM2189a3 = C0901wd.m2189a(hookHandleM2206a4);
                    if (thM2189a3 != null) {
                    }
                    C0631i9.m1479b(cls6);
                    hookHandleM2206a5 = C0173J8.m463a(c0173j8, str4, str5, new Class[]{cls6, cls9}, new C0687l8(this, 29));
                    thM2189a4 = C0901wd.m2189a(hookHandleM2206a5);
                    if (thM2189a4 != null) {
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                    }
                    C0173J8.m463a(c0173j8, TelecomManager.class.getName(), "addNewIncomingCall", new Class[]{PhoneAccountHandle.class, Bundle.class}, new C0263O8(this, 7));
                    m873r("TelecomManager hook installed");
                    objM2206a = C0413Wf.f1577a;
                    thM2189a5 = C0901wd.m2189a(objM2206a);
                    if (thM2189a5 != null) {
                    }
                    m879m(c0173j8);
                    int i = -1;
                    if (C0021B1.f64a == -1) {
                    }
                    C0578fd c0578fd = new C0578fd(C0021B1.f64a, c0173j8.f608a);
                    C0616hd.f2278a.getClass();
                    cls10 = C0616hd.m1467a("F017:flutterVoip", c0578fd).f2209b;
                    if (cls10 != null) {
                        m873r("hookFlutterGlobal hooking " + cls10.getName() + "#" + method.getName());
                        c0173j8.m470f(method).intercept(new C0877v8(this, 4));
                    }
                    str6 = "addView";
                    try {
                        hookHandleM2206a7 = C0173J8.m463a(c0173j8, "android.view.WindowManagerImpl", str6, new Class[]{View.class, ViewGroup.LayoutParams.class}, new C0687l8(this, 19));
                    } catch (Throwable th6) {
                        th = th6;
                        hookHandleM2206a7 = C0920xd.m2206a(th);
                    }
                    thM2189a6 = C0901wd.m2189a(hookHandleM2206a7);
                    if (thM2189a6 != null) {
                    }
                    m873r("WindowManagerImpl addView hook installed");
                    hookHandleM2206a8 = C0173J8.m463a(c0173j8, "android.view.WindowManagerGlobal", str6, new Class[]{View.class, ViewGroup.LayoutParams.class, Display.class, Window.class}, new C0245N8(this, 0));
                    thM2189a7 = C0901wd.m2189a(hookHandleM2206a8);
                    if (thM2189a7 != null) {
                    }
                    m873r("WindowManager addView hook installed");
                    hookHandleM2206a9 = C0173J8.m467e(c0173j8, Dialog.class.getName(), "show", new C0245N8(this, 11));
                    thM2189a8 = C0901wd.m2189a(hookHandleM2206a9);
                    if (thM2189a8 != null) {
                    }
                    String name6 = PopupWindow.class.getName();
                    Class cls12 = Integer.TYPE;
                    C0631i9.m1479b(cls12);
                    hookHandleM2206a10 = C0173J8.m463a(c0173j8, name6, "showAtLocation", new Class[]{View.class, cls12, cls12, cls12}, new C0245N8(this, 12));
                    thM2189a9 = C0901wd.m2189a(hookHandleM2206a10);
                    if (thM2189a9 != null) {
                    }
                    m873r("Dialog/PopupWindow hooks installed");
                    m878l(c0173j8);
                }
            } catch (Throwable th7) {
                th = th7;
                cls = Notification.class;
            }
        } catch (Throwable th8) {
            th = th8;
            cls = Notification.class;
            str = ": ";
            str2 = "notify";
        }
        try {
            C0173J8.m463a(c0173j8, Activity.class.getName(), "startActivity", new Class[]{Intent.class, Bundle.class}, new C0263O8(this, 4));
        } catch (Throwable th9) {
            C0920xd.m2206a(th9);
        }
        try {
            String name7 = Activity.class.getName();
            C0631i9.m1479b(cls11);
            C0173J8.m463a(c0173j8, name7, "startActivityForResult", new Class[]{Intent.class, cls11}, new C0263O8(this, 5));
        } catch (Throwable th10) {
            C0920xd.m2206a(th10);
        }
        try {
            String name22 = Activity.class.getName();
            C0631i9.m1479b(cls11);
            C0173J8.m463a(c0173j8, name22, "startActivityForResult", new Class[]{Intent.class, cls11, Bundle.class}, new C0263O8(this, 6));
        } catch (Throwable th11) {
            C0920xd.m2206a(th11);
        }
        m873r("Activity start hooks installed");
        try {
            cls2 = ContextWrapper.class;
            C0173J8.m463a(c0173j8, Context.class.getName(), "startActivity", new Class[]{Intent.class}, new C0263O8(this, 9));
        } catch (Throwable th12) {
            th = th12;
            cls2 = ContextWrapper.class;
        }
        try {
            C0173J8.m463a(c0173j8, Context.class.getName(), "startActivity", new Class[]{Intent.class, Bundle.class}, new C0263O8(this, 10));
        } catch (Throwable th13) {
            C0920xd.m2206a(th13);
        }
        try {
            C0173J8.m463a(c0173j8, Context.class.getName(), "startService", new Class[]{Intent.class}, new C0263O8(this, 11));
        } catch (Throwable th14) {
            C0920xd.m2206a(th14);
        }
        try {
            C0173J8.m463a(c0173j8, Context.class.getName(), "startForegroundService", new Class[]{Intent.class}, new C0263O8(this, 12));
        } catch (Throwable th15) {
            C0920xd.m2206a(th15);
        }
        try {
            String name32 = Context.class.getName();
            C0631i9.m1479b(cls11);
            C0173J8.m463a(c0173j8, name32, "bindService", new Class[]{Intent.class, Service.class, cls11}, new C0687l8(this, 20));
        } catch (Throwable th16) {
            C0920xd.m2206a(th16);
        }
        try {
            C0173J8.m463a(c0173j8, cls2.getName(), "startActivity", new Class[]{Intent.class}, new C0687l8(this, 21));
        } catch (Throwable th17) {
            C0920xd.m2206a(th17);
        }
        try {
            C0173J8.m463a(c0173j8, cls2.getName(), "startService", new Class[]{Intent.class}, new C0687l8(this, 22));
        } catch (Throwable th18) {
            C0920xd.m2206a(th18);
        }
        try {
            C0173J8.m463a(c0173j8, cls2.getName(), "startForegroundService", new Class[]{Intent.class}, new C0687l8(this, 23));
        } catch (Throwable th19) {
            C0920xd.m2206a(th19);
        }
        m873r("Context/ContextWrapper start hooks installed (abstract method failures suppressed via runCatching)");
        try {
            String name42 = Instrumentation.class.getName();
            C0631i9.m1479b(cls11);
            cls3 = cls11;
            hookHandleM2206a = C0173J8.m463a(c0173j8, name42, "execStartActivity", new Class[]{Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, cls3, Bundle.class}, new C0687l8(this, 27));
        } catch (Throwable th20) {
            th = th20;
            cls3 = cls11;
        }
        thM2189a = C0901wd.m2189a(hookHandleM2206a);
        if (thM2189a != null) {
            m873r("Instrumentation hook failed: " + thM2189a.getMessage());
        }
        m873r("Instrumentation hook installed");
        if (C0002A1.m13b(c0173j8.f608a, "android.app.IActivityTaskManager$Stub$Proxy") != null) {
            m873r("IActivityTaskManager proxy not found");
        } else {
            try {
                cls4 = Class.forName("android.app.IApplicationThread");
                cls5 = cls3;
            } catch (Throwable th21) {
                th = th21;
            }
            try {
                C0631i9.m1479b(cls5);
                cls3 = cls5;
                hookHandleM2206a2 = C0173J8.m463a(c0173j8, "android.app.IActivityTaskManager$Stub$Proxy", "startActivity", new Class[]{cls4, String.class, Intent.class, String.class, IBinder.class, String.class, cls5, cls5, Class.forName("android.app.ProfilingInfo"), Bundle.class}, new C0263O8(this, 2));
            } catch (Throwable th22) {
                th = th22;
                cls3 = cls5;
                hookHandleM2206a2 = C0920xd.m2206a(th);
            }
            Throwable thM2189a10 = C0901wd.m2189a(hookHandleM2206a2);
            if (thM2189a10 != null) {
                m873r("IActivityTaskManager hook failed: " + thM2189a10.getMessage());
            }
            m873r("IActivityTaskManager proxy hook installed");
        }
        if (C0002A1.m13b(c0173j8.f608a, "android.app.IActivityManager$Stub$Proxy") != null) {
            m873r("IActivityManager proxy not found");
            cls6 = cls3;
        } else {
            try {
                cls7 = Class.forName("android.app.IApplicationThread");
                cls8 = cls3;
            } catch (Throwable th23) {
                th = th23;
            }
            try {
                C0631i9.m1479b(cls8);
                cls3 = cls8;
                C0173J8.m463a(c0173j8, "android.app.IActivityManager$Stub$Proxy", "startActivity", new Class[]{cls7, String.class, Intent.class, String.class, IBinder.class, String.class, cls8, cls8, Class.forName("android.app.ProfilingInfo"), Bundle.class}, new C0687l8(this, 24));
            } catch (Throwable th24) {
                th = th24;
                cls3 = cls8;
                C0920xd.m2206a(th);
            }
            try {
                Class<?> cls13 = Class.forName("android.app.IApplicationThread");
                Class cls14 = Boolean.TYPE;
                C0631i9.m1479b(cls14);
                C0631i9.m1479b(cls3);
                C0173J8.m463a(c0173j8, "android.app.IActivityManager$Stub$Proxy", "startService", new Class[]{cls13, Intent.class, String.class, cls14, String.class, cls3}, new C0687l8(this, 25));
            } catch (Throwable th25) {
                C0920xd.m2206a(th25);
            }
            try {
                Class<?> cls15 = Class.forName("android.app.IApplicationThread");
                Class<?> cls16 = Class.forName("android.app.IServiceConnection");
                C0631i9.m1479b(cls3);
                cls6 = cls3;
                try {
                    C0173J8.m463a(c0173j8, "android.app.IActivityManager$Stub$Proxy", "bindService", new Class[]{cls15, IBinder.class, Intent.class, String.class, cls16, cls3, String.class, cls3}, new C0687l8(this, 26));
                } catch (Throwable th26) {
                    th = th26;
                    C0920xd.m2206a(th);
                }
            } catch (Throwable th27) {
                th = th27;
                cls6 = cls3;
            }
            m873r("IActivityManager proxy hooks installed");
        }
        try {
            methodM1185f = C0487ah.m1185f(c0173j8.f608a);
            if (methodM1185f != null) {
                m873r("incoming call handler method not resolved");
            } else {
                m873r("hookIncomingCallHandler hooking " + methodM1185f.getDeclaringClass().getName() + "#" + methodM1185f.getName());
                c0173j8.m470f(methodM1185f).intercept(new C0877v8(this, 1));
            }
            str3 = str;
        } catch (Throwable th28) {
            String name8 = th28.getClass().getName();
            String message = th28.getMessage();
            StringBuilder sb = new StringBuilder("hookIncomingCallHandler fail: ");
            sb.append(name8);
            str3 = str;
            sb.append(str3);
            sb.append(message);
            m873r(sb.toString());
        }
        try {
            methodM1187h = C0487ah.m1187h(c0173j8.f608a);
            if (methodM1187h != null) {
                m873r("incoming call UI method not resolved");
            } else {
                m873r("hookIncomingCallUi hooking " + methodM1187h.getDeclaringClass().getName() + "#" + methodM1187h.getName());
                c0173j8.m470f(methodM1187h).intercept(new C0877v8(this, 3));
            }
        } catch (Throwable th29) {
            m873r("hookIncomingCallUi fail: " + th29.getClass().getName() + str3 + th29.getMessage());
        }
        try {
            methodM1186g = C0487ah.m1186g(c0173j8.f608a);
            if (methodM1186g != null) {
                m873r("incoming call manager method not resolved");
            } else {
                m873r("hookIncomingCallManager hooking " + methodM1186g.getDeclaringClass().getName() + "#" + methodM1186g.getName());
                c0173j8.m470f(methodM1186g).intercept(new C0877v8(this, 5));
            }
        } catch (Throwable th30) {
            m873r("hookIncomingCallManager fail: " + th30.getClass().getName() + str3 + th30.getMessage());
        }
        try {
            listM1184e = C0487ah.m1184e(c0173j8.f608a);
            if (listM1184e.isEmpty()) {
                for (Method method2 : listM1184e) {
                    m873r("hookVoipMgrBind hooking " + method2.getDeclaringClass().getName() + "#" + method2.getName());
                    c0173j8.m470f(method2).intercept(new C0877v8(this, 2));
                }
            } else {
                m873r("voip mgr bind methods not resolved");
            }
        } catch (Throwable th31) {
            m873r("hookVoipMgrBind fail: " + th31.getClass().getName() + str3 + th31.getMessage());
        }
        try {
            String name52 = Service.class.getName();
            C0631i9.m1479b(cls6);
            cls9 = cls;
        } catch (Throwable th32) {
            th = th32;
            cls9 = cls;
        }
        try {
            hookHandleM2206a3 = C0173J8.m463a(c0173j8, name52, "startForeground", new Class[]{cls6, cls9}, new C0263O8(this, 8));
        } catch (Throwable th33) {
            th = th33;
            hookHandleM2206a3 = C0920xd.m2206a(th);
        }
        thM2189a2 = C0901wd.m2189a(hookHandleM2206a3);
        if (thM2189a2 != null) {
            m873r("Service.startForeground hook failed: " + thM2189a2.getMessage());
        }
        m873r("Service.startForeground hook installed");
        for (String str7 : f1131c) {
            if (C0002A1.m13b(c0173j8.f608a, str7) == null) {
                m873r("service class not found: ".concat(str7));
            } else {
                try {
                    C0631i9.m1479b(cls6);
                    hookHandleM2206a11 = C0173J8.m463a(c0173j8, str7, "onStartCommand", new Class[]{Intent.class, cls6, cls6}, new C0281P8(this, str7, 0));
                } catch (Throwable th34) {
                    hookHandleM2206a11 = C0920xd.m2206a(th34);
                }
                Throwable thM2189a11 = C0901wd.m2189a(hookHandleM2206a11);
                if (thM2189a11 != null) {
                    m873r("VoIP service onStartCommand hook failed: " + thM2189a11.getMessage());
                }
                try {
                    C0173J8.m467e(c0173j8, str7, "onDestroy", new C0281P8(this, str7, 1));
                } catch (Throwable th35) {
                    C0920xd.m2206a(th35);
                }
            }
        }
        try {
            C0631i9.m1479b(cls6);
            str4 = "android.app.NotificationManager";
            str5 = str2;
            hookHandleM2206a4 = C0173J8.m463a(c0173j8, str4, str5, new Class[]{String.class, cls6, cls9}, new C0687l8(this, 28));
        } catch (Throwable th36) {
            th = th36;
            str4 = "android.app.NotificationManager";
            str5 = str2;
        }
        thM2189a3 = C0901wd.m2189a(hookHandleM2206a4);
        if (thM2189a3 != null) {
            m873r("NotificationManager.notify(String) hook failed: " + thM2189a3.getMessage());
        }
        try {
            C0631i9.m1479b(cls6);
            hookHandleM2206a5 = C0173J8.m463a(c0173j8, str4, str5, new Class[]{cls6, cls9}, new C0687l8(this, 29));
        } catch (Throwable th37) {
            hookHandleM2206a5 = C0920xd.m2206a(th37);
        }
        thM2189a4 = C0901wd.m2189a(hookHandleM2206a5);
        if (thM2189a4 != null) {
            m873r("NotificationManager.notify(int) hook failed: " + thM2189a4.getMessage());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                C0631i9.m1479b(cls6);
                hookHandleM2206a6 = C0173J8.m463a(c0173j8, str4, "notifyAsPackage", new Class[]{String.class, String.class, cls6, cls9}, new C0263O8(this, 0));
            } catch (Throwable th38) {
                hookHandleM2206a6 = C0920xd.m2206a(th38);
            }
            Throwable thM2189a12 = C0901wd.m2189a(hookHandleM2206a6);
            if (thM2189a12 != null) {
                m873r("NotificationManager.notifyAsPackage hook failed: " + thM2189a12.getMessage());
            }
        }
        try {
            C0173J8.m463a(c0173j8, TelecomManager.class.getName(), "addNewIncomingCall", new Class[]{PhoneAccountHandle.class, Bundle.class}, new C0263O8(this, 7));
            m873r("TelecomManager hook installed");
            objM2206a = C0413Wf.f1577a;
        } catch (Throwable th39) {
            objM2206a = C0920xd.m2206a(th39);
        }
        thM2189a5 = C0901wd.m2189a(objM2206a);
        if (thM2189a5 != null) {
            m873r("TelecomManager hook failed: " + thM2189a5.getMessage());
        }
        m879m(c0173j8);
        try {
            int i2 = -1;
            if (C0021B1.f64a == -1) {
                try {
                    Context context = C0889w1.f3488p;
                    C0631i9.m1479b(context);
                    i2 = context.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionCode;
                } catch (Exception e) {
                    C0908x1.m2193a(Arrays.copyOf(new Object[]{e}, 1));
                }
                C0021B1.f64a = i2;
            }
            C0578fd c0578fd2 = new C0578fd(C0021B1.f64a, c0173j8.f608a);
            C0616hd.f2278a.getClass();
            cls10 = C0616hd.m1467a("F017:flutterVoip", c0578fd2).f2209b;
            if (cls10 != null && (method = (Method) C0238N1.m630d0(C0002A1.m17f(cls10, new C0263O8(1)))) != null) {
                m873r("hookFlutterGlobal hooking " + cls10.getName() + "#" + method.getName());
                c0173j8.m470f(method).intercept(new C0877v8(this, 4));
            }
        } catch (Throwable th40) {
            m873r("hookFlutterGlobal fail: " + th40.getClass().getName() + str3 + th40.getMessage());
        }
        try {
            str6 = "addView";
            hookHandleM2206a7 = C0173J8.m463a(c0173j8, "android.view.WindowManagerImpl", str6, new Class[]{View.class, ViewGroup.LayoutParams.class}, new C0687l8(this, 19));
        } catch (Throwable th41) {
            th = th41;
            str6 = "addView";
        }
        thM2189a6 = C0901wd.m2189a(hookHandleM2206a7);
        if (thM2189a6 != null) {
            m873r("WindowManagerImpl.addView hook failed: " + thM2189a6.getMessage());
        }
        m873r("WindowManagerImpl addView hook installed");
        try {
            hookHandleM2206a8 = C0173J8.m463a(c0173j8, "android.view.WindowManagerGlobal", str6, new Class[]{View.class, ViewGroup.LayoutParams.class, Display.class, Window.class}, new C0245N8(this, 0));
        } catch (Throwable th42) {
            hookHandleM2206a8 = C0920xd.m2206a(th42);
        }
        thM2189a7 = C0901wd.m2189a(hookHandleM2206a8);
        if (thM2189a7 != null) {
            m873r("WindowManagerGlobal.addView hook failed: " + thM2189a7.getMessage());
        }
        m873r("WindowManager addView hook installed");
        try {
            hookHandleM2206a9 = C0173J8.m467e(c0173j8, Dialog.class.getName(), "show", new C0245N8(this, 11));
        } catch (Throwable th43) {
            hookHandleM2206a9 = C0920xd.m2206a(th43);
        }
        thM2189a8 = C0901wd.m2189a(hookHandleM2206a9);
        if (thM2189a8 != null) {
            m873r("Dialog.show hook failed: " + thM2189a8.getMessage());
        }
        try {
            String name62 = PopupWindow.class.getName();
            Class cls122 = Integer.TYPE;
            C0631i9.m1479b(cls122);
            hookHandleM2206a10 = C0173J8.m463a(c0173j8, name62, "showAtLocation", new Class[]{View.class, cls122, cls122, cls122}, new C0245N8(this, 12));
        } catch (Throwable th44) {
            hookHandleM2206a10 = C0920xd.m2206a(th44);
        }
        thM2189a9 = C0901wd.m2189a(hookHandleM2206a10);
        if (thM2189a9 != null) {
            m873r("PopupWindow.showAtLocation hook failed: " + thM2189a9.getMessage());
        }
        m873r("Dialog/PopupWindow hooks installed");
        m878l(c0173j8);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m877i(XposedInterface.Chain chain, String str, String str2) {
        boolean z;
        C0186K3.f638a.getClass();
        if (!C0186K3.a.m511l() || !C0186K3.a.m508i().f2412D) {
            return chain.proceed();
        }
        Object thisObject = chain.getThisObject();
        Activity activity = thisObject instanceof Activity ? (Activity) thisObject : null;
        Intent intent = activity != null ? activity.getIntent() : null;
        String strM863e = intent != null ? m863e(intent) : null;
        boolean z2 = intent != null && m870o(intent);
        if (C0186K3.a.m511l() && C0186K3.a.m508i().f2412D) {
            String strM1250a = C0506bh.m1250a();
            if (strM1250a != null) {
                ExecutorService executorService = C0582fh.f2149G;
                if (C0582fh.a.m1423a(strM1250a)) {
                    z = true;
                } else if (strM863e != null) {
                    ExecutorService executorService2 = C0582fh.f2149G;
                    if (C0582fh.a.m1423a(strM863e)) {
                        z = z2;
                    }
                }
            }
        } else {
            z = false;
        }
        if (!z) {
            return chain.proceed();
        }
        String strM1250a2 = strM863e == null ? C0506bh.m1250a() : strM863e;
        StringBuilder sbM2229i = C0944z.m2229i("block VoIP activity ", str, " stage=", str2, " user=");
        sbM2229i.append(strM1250a2);
        sbM2229i.append(" incoming=");
        sbM2229i.append(z2);
        m873r(sbM2229i.toString());
        if (strM863e != null) {
            C0506bh.m1256g(strM863e);
        }
        if (!this.f1136a.contains(str)) {
            return chain.proceed();
        }
        Object objProceed = chain.proceed();
        if (((str2.equals("onCreate") && C0506bh.m1251b()) || this.f1137b) && activity != null) {
            activity.finish();
        }
        return objProceed;
    }

    /* JADX INFO: renamed from: l */
    public final void m878l(C0173J8 c0173j8) {
        Class cls = Integer.TYPE;
        try {
            C0173J8.m467e(c0173j8, MediaPlayer.class.getName(), "start", new C0245N8(this, 1));
        } catch (Throwable th) {
            C0920xd.m2206a(th);
        }
        try {
            String name = SoundPool.class.getName();
            C0631i9.m1479b(cls);
            Class cls2 = Float.TYPE;
            C0631i9.m1479b(cls2);
            C0173J8.m463a(c0173j8, name, "play", new Class[]{cls, cls2, cls2, cls, cls, cls2}, new C0245N8(this, 2));
        } catch (Throwable th2) {
            C0920xd.m2206a(th2);
        }
        try {
            C0173J8.m467e(c0173j8, Ringtone.class.getName(), "play", new C0245N8(this, 3));
        } catch (Throwable th3) {
            C0920xd.m2206a(th3);
        }
        try {
            C0173J8.m467e(c0173j8, AudioTrack.class.getName(), "play", new C0245N8(this, 4));
        } catch (Throwable th4) {
            C0920xd.m2206a(th4);
        }
        try {
            C0173J8.m467e(c0173j8, AudioTrack.class.getName(), "start", new C0245N8(this, 5));
        } catch (Throwable th5) {
            C0920xd.m2206a(th5);
        }
        try {
            String name2 = ToneGenerator.class.getName();
            C0631i9.m1479b(cls);
            C0173J8.m463a(c0173j8, name2, "startTone", new Class[]{cls}, new C0245N8(this, 6));
        } catch (Throwable th6) {
            C0920xd.m2206a(th6);
        }
        try {
            String name3 = ToneGenerator.class.getName();
            C0631i9.m1479b(cls);
            C0173J8.m463a(c0173j8, name3, "startTone", new Class[]{cls, cls}, new C0245N8(this, 7));
        } catch (Throwable th7) {
            C0920xd.m2206a(th7);
        }
        try {
            String name4 = Vibrator.class.getName();
            Class cls3 = Long.TYPE;
            C0631i9.m1479b(cls3);
            C0173J8.m463a(c0173j8, name4, "vibrate", new Class[]{cls3}, new C0245N8(this, 8));
        } catch (Throwable th8) {
            C0920xd.m2206a(th8);
        }
        try {
            String name5 = Vibrator.class.getName();
            C0631i9.m1479b(cls);
            C0173J8.m463a(c0173j8, name5, "vibrate", new Class[]{long[].class, cls}, new C0245N8(this, 9));
        } catch (Throwable th9) {
            C0920xd.m2206a(th9);
        }
        try {
            C0173J8.m463a(c0173j8, Vibrator.class.getName(), "vibrate", new Class[]{VibrationEffect.class}, new C0245N8(this, 10));
        } catch (Throwable th10) {
            C0920xd.m2206a(th10);
        }
        m873r("Audio/vibration hooks installed");
    }

    /* JADX INFO: renamed from: m */
    public final void m879m(C0173J8 c0173j8) {
        XposedInterface.HookHandle hookHandleM2206a;
        XposedInterface.HookHandle hookHandleM2206a2;
        XposedInterface.HookHandle hookHandleM2206a3;
        try {
            for (String str : f1132d) {
                if (C0002A1.m13b(c0173j8.f608a, str) != null) {
                    m873r("hookVoipActivities: hooking " + str);
                    try {
                        hookHandleM2206a = C0173J8.m463a(c0173j8, str, "onCreate", new Class[]{Bundle.class}, new C0281P8(this, str, 2));
                    } catch (Throwable th) {
                        hookHandleM2206a = C0920xd.m2206a(th);
                    }
                    Throwable thM2189a = C0901wd.m2189a(hookHandleM2206a);
                    if (thM2189a != null) {
                        m873r("hookVoipActivities onCreate fail " + str + ": " + thM2189a.getMessage());
                    }
                    try {
                        hookHandleM2206a2 = C0173J8.m467e(c0173j8, str, "onResume", new C0281P8(this, str, 3));
                    } catch (Throwable th2) {
                        hookHandleM2206a2 = C0920xd.m2206a(th2);
                    }
                    Throwable thM2189a2 = C0901wd.m2189a(hookHandleM2206a2);
                    if (thM2189a2 != null) {
                        m873r("hookVoipActivities onResume fail " + str + ": " + thM2189a2.getMessage());
                    }
                    try {
                        hookHandleM2206a3 = C0173J8.m463a(c0173j8, str, "onNewIntent", new Class[]{Intent.class}, new C0281P8(this, str, 4));
                    } catch (Throwable th3) {
                        hookHandleM2206a3 = C0920xd.m2206a(th3);
                    }
                    Throwable thM2189a3 = C0901wd.m2189a(hookHandleM2206a3);
                    if (thM2189a3 != null) {
                        m873r("hookVoipActivities onNewIntent fail " + str + ": " + thM2189a3.getMessage());
                    }
                }
            }
        } catch (Throwable th4) {
            m873r("hookVoipActivities fail: " + th4.getClass().getName() + ": " + th4.getMessage());
        }
    }
}
