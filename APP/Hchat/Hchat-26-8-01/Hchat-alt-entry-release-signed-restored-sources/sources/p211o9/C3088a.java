package p211o9;

import android.content.Context;
import android.widget.TextView;
import java.lang.reflect.Method;
import ke.C2399h;
import na.C2915c;
import na.C2918f;
import p064ea.C0850b;
import p068eh.AbstractC0921a;
import p077f8.C1085e;
import p096g8.C1366g;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p108ha.C1651k0;
import p126ia.C2026t;
import p153k8.C2352p;
import p258r8.AbstractC3736a;
import p258r8.C3742g;
import p258r8.C3744i;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;

/* JADX INFO: renamed from: o9.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3088a extends AbstractC3736a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "group_leave_monitor";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C1651k0("group_leave_monitor", "进退群监控", "监听成员进群和退群，支持系统消息和自动回复", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        Object c3959f;
        Object c3959f2;
        Object c3959f3;
        c3742g.getClass();
        C3090c c3090c = C3090c.f9983a;
        C2026t c2026t = new C2026t(2, this, AbstractC0921a.m2246i(C3088a.class), "logError", "logError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 13);
        Context context = c3742g.f12143a;
        if (!C3090c.f9984b) {
            Method methodFindDeclaredMethod = KavaReflector.findDeclaredMethod(TextView.class, "setText", CharSequence.class, TextView.BufferType.class);
            if (methodFindDeclaredMethod == null) {
                c2026t.invoke("退群监控 wxid 高亮 Hook 未找到", null);
            } else {
                try {
                    C3744i.f12154b.m7763b(methodFindDeclaredMethod, new C0850b(context, 5, false));
                    C3090c.f9984b = true;
                    c3959f3 = Boolean.TRUE;
                } catch (Throwable th2) {
                    c3959f3 = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f3);
                if (thM8182b != null) {
                    c2026t.invoke("退群监控 wxid 高亮 Hook 安装失败", thM8182b);
                    c3959f3 = Boolean.FALSE;
                }
            }
        }
        c3090c.m6570b(c3742g, c2026t);
        C2026t c2026t2 = new C2026t(2, this, AbstractC0921a.m2246i(C3088a.class), "logError", "logError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 14);
        C3103p c3103p = new C3103p(c3742g, c2026t2);
        WeChatApis.contact().getClass();
        C1366g c1366gChatroomChanges = WeChatApis.chatroomChangeApi;
        if (c1366gChatroomChanges == null) {
            c1366gChatroomChanges = WeChatApis.chatroomChanges();
        }
        if (c1366gChatroomChanges != null) {
            m7753j(c1366gChatroomChanges.m3683a(new C2918f(c3103p, 1)));
        } else {
            c2026t2.invoke("群聊变更 API 未就绪", null);
        }
        try {
            c3959f = WeChatApis.messageObserve();
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        C2352p c2352p = (C2352p) (c3959f instanceof C3959f ? null : c3959f);
        if (c2352p != null && c2352p.m5638c()) {
            try {
                c2352p.m5637b();
                c3959f2 = C3967n.f12976a;
            } catch (Throwable th4) {
                c3959f2 = new C3959f(th4);
            }
            Throwable thM8182b2 = C3960g.m8182b(c3959f2);
            if (thM8182b2 != null) {
                c2026t2.invoke("邀请详情消息监听安装失败", thM8182b2);
            }
            m7753j(c2352p.m5640e(new C2915c(c3103p, 2)));
        }
        c3103p.m6607z();
        m7752i(C1085e.class, new C2399h(c3103p, 28));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "进退群监控";
    }
}
