package p049d9;

import android.app.NotificationManager;
import java.lang.reflect.Method;
import ke.C2399h;
import ng.C3010h;
import ng.C3011i;
import p010aa.C0039g;
import p011ab.C0041a;
import p011ab.C0042b;
import p019b4.C0178b;
import p068eh.AbstractC0921a;
import p077f8.C1085e;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: d9.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0743d extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public C0752m f2211e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "custom_friend_avatar";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C0039g("custom_friend_avatar", "自定义好友头像", "为指定好友设置仅本地显示的头像", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        C0752m c0752m = new C0752m(c3742g, new C0042b(2, this, AbstractC0921a.m2246i(C0743d.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 8));
        Method[] declaredMethods = NotificationManager.class.getDeclaredMethods();
        declaredMethods.getClass();
        C3010h c3010h = new C3010h(new C3011i(AbstractC4165l.m8376k0(declaredMethods), true, new C0178b(17)));
        while (c3010h.hasNext()) {
            Method method = (Method) c3010h.next();
            method.getClass();
            c0752m.m1942e(method, new C0751l(c0752m, 6));
        }
        this.f2211e = c0752m;
        C3740e.m7759f(12, new C0041a(this, 12), "custom_friend_avatar", "自定义好友头像", null);
        m7752i(C1085e.class, new C2399h(this, 7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "自定义好友头像";
    }
}
