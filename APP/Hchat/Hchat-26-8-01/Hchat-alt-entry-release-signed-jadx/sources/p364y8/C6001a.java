package p364y8;

import java.lang.reflect.Method;
import p068eh.AbstractC0921a;
import p099h.Hchat.utils.KavaReflector;
import p126ia.C2026t;
import p258r8.AbstractC3736a;
import p258r8.C3742g;
import p258r8.C3744i;
import p274s8.C3944d;
import p276sf.C3959f;
import p276sf.C3960g;

/* JADX INFO: renamed from: y8.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6001a extends AbstractC3736a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "auto_view_original";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C3944d("auto_view_original", "自动查看原图", "打开聊天图片或视频时自动查看原图或原视频", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        Object c3959f;
        c3742g.getClass();
        C2026t c2026t = new C2026t(2, this, AbstractC0921a.m2246i(C6001a.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 29);
        C6004d c6004d = new C6004d(c3742g, c2026t);
        synchronized (c6004d) {
            if (c6004d.f24383i) {
                return;
            }
            Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.ui.chatting.gallery.ImageGalleryUI", c3742g.f12145c);
            if (clsLoadClass == null) {
                c2026t.invoke("未找到聊天媒体查看页面: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI", null);
                return;
            }
            Method methodFindDeclaredMethod = KavaReflector.findDeclaredMethod(clsLoadClass, "onResume", new Class[0]);
            Method methodFindDeclaredMethod2 = KavaReflector.findDeclaredMethod(clsLoadClass, "onDestroy", new Class[0]);
            if (!C6004d.m10755a(methodFindDeclaredMethod) || !C6004d.m10755a(methodFindDeclaredMethod2)) {
                c2026t.invoke("聊天媒体查看页面生命周期入口不完整", null);
                return;
            }
            try {
                C3744i c3744i = C3744i.f12154b;
                methodFindDeclaredMethod.getClass();
                c3744i.m7763b(methodFindDeclaredMethod, new C6002b(c6004d, 1));
                methodFindDeclaredMethod2.getClass();
                c3744i.m7763b(methodFindDeclaredMethod2, new C6002b(c6004d, 2));
                c6004d.f24383i = true;
                c3959f = Boolean.TRUE;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                c6004d.f24375a.invoke("安装聊天媒体查看页面 Hook 失败", thM8182b);
                c3959f = Boolean.FALSE;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "自动查看原图";
    }
}
