package p299u9;

import android.content.Context;
import gg.AbstractC1426v;
import java.util.Map;
import p036c9.C0434f;
import p077f8.C1085e;
import p116i.C1746e0;
import p126ia.C2026t;
import p222p.AbstractC3199a;
import p243q9.C3465a;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import p274s8.C3944d;

/* JADX INFO: renamed from: u9.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4284c extends AbstractC3736a {

    /* JADX INFO: renamed from: f */
    public static final C4283b f14204f = new C4283b();

    /* JADX INFO: renamed from: g */
    public static final Map f14205g = AbstractC3199a.m6843p();

    /* JADX INFO: renamed from: e */
    public C4289h f14206e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final void m8605k(Context context, ClassLoader classLoader) {
        C4289h c4289h;
        C4283b c4283b = f14204f;
        if (classLoader == null) {
            return;
        }
        Map map = f14205g;
        map.getClass();
        synchronized (map) {
            c4289h = (C4289h) map.get(classLoader);
            if (c4289h == null) {
                Class clsMo3818a = AbstractC1426v.m3834a(C4283b.class).mo3818a();
                clsMo3818a.getClass();
                C4289h c4289h2 = new C4289h(context, classLoader, null, new C2026t(2, c4283b, clsMo3818a, "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 23));
                map.put(classLoader, c4289h2);
                c4289h = c4289h2;
            }
        }
        c4289h.m8612f(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "hide_wechat_bottom_bar";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C3944d("hide_wechat_bottom_bar", "隐藏微信底栏", "隐藏微信首页底部的微信、通讯录、发现和我", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        C4289h c4289h;
        c3742g.getClass();
        C4283b c4283b = f14204f;
        ClassLoader classLoader = c3742g.f12145c;
        Map map = f14205g;
        map.getClass();
        synchronized (map) {
            c4289h = (C4289h) map.remove(classLoader);
            if (c4289h != null) {
                c4289h.f14219c = new C0434f(c3742g, 8);
            } else {
                Class clsMo3818a = AbstractC1426v.m3834a(C4283b.class).mo3818a();
                clsMo3818a.getClass();
                c4289h = new C4289h(c3742g.f12143a, c3742g.f12145c, new C0434f(c3742g, 7), new C2026t(2, c4283b, clsMo3818a, "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 24));
            }
        }
        this.f14206e = c4289h;
        if (!c4289h.m8612f(false)) {
            C3740e.m7759f(12, new C1746e0(this, 29), "hide_wechat_bottom_bar", "隐藏微信底栏", null);
        }
        m7752i(C1085e.class, new C3465a(this, 9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "隐藏微信底栏";
    }
}
