package va;

import android.content.Context;
import p080fb.AbstractC1184v0;
import p080fb.C1121f1;
import p099h.Hchat.utils.KavaReflector;
import p258r8.AbstractC3736a;
import p258r8.C3742g;
import p274s8.C3944d;
import p304uf.C4330d;

/* JADX INFO: renamed from: va.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4543c extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public static final C4330d f14994e = new C4330d(3);

    /* JADX INFO: renamed from: f */
    public static final String[] f14995f = {"expand_room_member", "see_room_member", "room_name"};

    /* JADX INFO: renamed from: g */
    public static volatile boolean f14996g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "profile_id";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C3944d("profile_id", "资料页显示ID", "在好友和群聊资料页显示可复制的微信 ID", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        C4330d c4330d = f14994e;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        if (classLoader == null || f14996g) {
            return;
        }
        synchronized (c4330d) {
            if (f14996g) {
                return;
            }
            Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.plugin.profile.ui.ContactInfoUI", classLoader);
            if (clsLoadClass == null) {
                AbstractC1184v0.m3203m("[Hchat:ProfileId] 未找到好友资料页类");
            } else {
                C4330d.m8768r(clsLoadClass, new Class[0], new C1121f1(context, 1));
            }
            C4330d.m8769s(context, classLoader);
            f14996g = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "资料页显示ID";
    }
}
