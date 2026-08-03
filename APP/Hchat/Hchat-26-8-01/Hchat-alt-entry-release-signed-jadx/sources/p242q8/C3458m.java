package p242q8;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.HttpUrl;
import p089g1.C1275d;
import p096g8.C1368i;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.utils.KavaReflector;
import p125i8.C2005i;
import p154k9.C2358b;
import p154k9.C2373q;
import p154k9.C2374r;
import p258r8.C3744i;

/* JADX INFO: renamed from: q8.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3458m {

    /* JADX INFO: renamed from: a */
    public final DexFinder f11211a;

    /* JADX INFO: renamed from: b */
    public final C3460o f11212b;

    /* JADX INFO: renamed from: c */
    public final C3462q f11213c;

    /* JADX INFO: renamed from: d */
    public final C3454i f11214d;

    /* JADX INFO: renamed from: e */
    public final C1368i f11215e;

    /* JADX INFO: renamed from: f */
    public final C1275d f11216f;

    /* JADX INFO: renamed from: h */
    public volatile boolean f11218h;

    /* JADX INFO: renamed from: i */
    public volatile int f11219i;

    /* JADX INFO: renamed from: l */
    public volatile long f11222l;

    /* JADX INFO: renamed from: g */
    public final CopyOnWriteArrayList f11217g = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j */
    public volatile String f11220j = HttpUrl.FRAGMENT_ENCODE_SET;

    /* JADX INFO: renamed from: k */
    public volatile String f11221k = HttpUrl.FRAGMENT_ENCODE_SET;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3458m(DexFinder dexFinder, C3460o c3460o, C3462q c3462q, C3454i c3454i, C1368i c1368i, C1275d c1275d) {
        this.f11211a = dexFinder;
        this.f11212b = c3460o;
        this.f11213c = c3462q;
        this.f11214d = c3454i;
        this.f11215e = c1368i;
        this.f11216f = c1275d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static String m7256f(Method method) {
        if (method == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return method.getDeclaringClass().getName() + "#" + method.getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m7257g(Intent intent) {
        if (intent == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            String stringExtra = intent.getStringExtra("Chat_User");
            return stringExtra != null ? stringExtra.trim() : HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (Throwable unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m7258a() {
        String strM7257g;
        C3460o c3460o = this.f11212b;
        Activity activityM7263a = c3460o != null ? c3460o.m7263a() : null;
        if (activityM7263a != null) {
            String name = activityM7263a.getClass().getName();
            if ("com.tencent.mm.ui.chatting.ChattingUI".equals(name) || name.contains(".ui.chatting.")) {
                if (activityM7263a == null) {
                    strM7257g = HttpUrl.FRAGMENT_ENCODE_SET;
                    if (!TextUtils.isEmpty(strM7257g)) {
                        this.f11220j = strM7257g;
                        return strM7257g;
                    }
                } else {
                    try {
                        strM7257g = m7257g(activityM7263a.getIntent());
                    } catch (Throwable unused) {
                        strM7257g = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    if (!TextUtils.isEmpty(strM7257g)) {
                    }
                }
            }
        }
        return this.f11220j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m7259b(String str, String str2) {
        String string;
        if (!TextUtils.isEmpty(str2)) {
            C1368i c1368i = this.f11215e;
            TextUtils.isEmpty(c1368i != null ? c1368i.m3729r(str2) : HttpUrl.FRAGMENT_ENCODE_SET);
        }
        if (this.f11215e != null) {
            C1368i.m3686I(str2);
        }
        Iterator it = this.f11217g.iterator();
        while (it.hasNext()) {
            try {
                ((C2358b) it.next()).getClass();
                C2374r c2374r = C2374r.f7799a;
                boolean zEquals = "enter".equals(str);
                C2374r.f7804f = zEquals;
                if (C2374r.f7803e) {
                    SharedPreferences sharedPreferences = C2374r.f7801c;
                    if (sharedPreferences == null || (string = sharedPreferences.getString("scope", "home")) == null) {
                        string = "home";
                    }
                    if (string.equals("home")) {
                        C2374r.m5687p(new C2373q(1, zEquals));
                    }
                }
            } catch (Throwable th2) {
                m7262e("聊天页回调失败: " + th2.getMessage());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m7260c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!str.equals(this.f11220j) || jCurrentTimeMillis - this.f11222l >= 500) {
            this.f11220j = str;
            this.f11222l = jCurrentTimeMillis;
            m7259b("enter", str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m7261d() {
        int i9;
        int i10;
        int i11 = 0;
        DexFinder dexFinder = this.f11211a;
        if (dexFinder == null) {
            return 0;
        }
        try {
            dexFinder.resolveChatPageApi();
        } catch (Throwable th2) {
            m7262e("聊天页Dex解析失败: " + th2.getMessage());
        }
        Method method = dexFinder.chatPageStartMethod;
        if (method == null) {
            i9 = 0;
        } else {
            try {
                KavaReflector.accessible(method);
                C3744i.f12154b.m7763b(method, new C3457l(this, method, 0));
                m7262e("聊天页启动方法Hook: ".concat(m7256f(method)));
                i9 = 1;
            } catch (Throwable th3) {
                m7262e("聊天页启动方法Hook失败: " + m7256f(method) + " " + th3.getMessage());
                i9 = 0;
            }
        }
        Method method2 = dexFinder.chatPageFragmentEnterMethod;
        if (method2 == null) {
            i10 = 0;
        } else {
            try {
                KavaReflector.accessible(method2);
                C3744i.f12154b.m7763b(method2, new C3457l(this, method2, 1));
                m7262e("聊天页Fragment进入方法Hook: ".concat(m7256f(method2)));
                i10 = 1;
            } catch (Throwable th4) {
                m7262e("聊天页Fragment进入方法Hook失败: " + m7256f(method2) + " " + th4.getMessage());
                i10 = 0;
            }
        }
        int i12 = i9 + i10;
        Method method3 = dexFinder.chatPageFragmentExitMethod;
        if (method3 != null) {
            try {
                KavaReflector.accessible(method3);
                C3744i.f12154b.m7763b(method3, new C3457l(this, method3, 2));
                m7262e("聊天页Fragment退出方法Hook: ".concat(m7256f(method3)));
                i11 = 1;
            } catch (Throwable th5) {
                m7262e("聊天页Fragment退出方法Hook失败: " + m7256f(method3) + " " + th5.getMessage());
            }
        }
        return i12 + i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m7262e(String str) {
        if (this.f11216f != null) {
            C2005i.m4939f("[WeChatChatPageApi] ".concat(str));
        }
    }
}
