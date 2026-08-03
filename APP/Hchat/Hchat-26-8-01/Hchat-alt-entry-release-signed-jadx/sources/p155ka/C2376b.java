package p155ka;

import android.os.Handler;
import p036c9.C0434f;
import p065eb.C0881m0;
import p065eb.C0892s;
import p068eh.AbstractC0921a;
import p077f8.C1085e;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p108ha.C1651k0;
import p126ia.C2026t;
import p153k8.C2345i;
import p153k8.C2349m;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import p258r8.EnumC3738c;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;

/* JADX INFO: renamed from: ka.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2376b extends AbstractC3736a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "qq_music_order";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C1651k0("qq_music_order", "QQ点歌", "搜索 QQ 音乐并发送音乐卡片或歌曲语音，可同时发送", "entertainment"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        Object c3959f;
        c3742g.getClass();
        Handler handler = C3740e.f12138a;
        C3740e.m7759f(8, new C0434f(c3742g, 5), "shared:send_button", "聊天发送按钮", EnumC3738c.WARMUP);
        m7752i(C1085e.class, new C0892s(this, c3742g, 1));
        C2380f c2380f = new C2380f(c3742g.f12143a, new C2026t(2, this, AbstractC0921a.m2246i(C2376b.class), "logError", "logError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 8));
        WeChatApis.message().getClass();
        C2345i c2345i = WeChatApis.messageChangeApi;
        if (c2345i != null) {
            try {
                c2345i.m5606a();
                c3959f = C3967n.f12976a;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                c2380f.f7821a.invoke("QQ点歌数据库监听安装失败", thM8182b);
            }
            m7753j(c2345i.m5608e(new C2349m(c2380f, 1)));
        }
        C0881m0 c0881m0 = C0881m0.f2707a;
        m7753j(C0881m0.m2200j("qq_music_order", new C2379e(c2380f)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "QQ点歌";
    }
}
