package p114hd;

import cd.C1517b;
import java.lang.reflect.Method;
import md.InterfaceC5154i;
import md.InterfaceC5156k;
import me.yun.fkwechat.loader.api.HookEngine;
import okhttp3.internal.url._UrlKt;
import p068ed.AbstractC2212a;

/* JADX INFO: renamed from: hd.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3004b extends AbstractC2212a {

    /* JADX INFO: renamed from: e */
    public Method f7974e;

    public C3004b() {
        this.f6040c = "AtCleanerHook";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m11098n(InterfaceC5154i interfaceC5154i) {
        String str;
        if (m7973i() && (str = (String) interfaceC5154i.getArgs()[0]) != null) {
            int iIndexOf = str.indexOf("\u2005");
            if (iIndexOf > 0) {
                str = str.substring(0, iIndexOf).replaceAll("[\\n\\r\\s]+", _UrlKt.FRAGMENT_ENCODE_SET) + str.substring(iIndexOf);
            }
            interfaceC5154i.setArg(0, str.replaceAll("@[\\n\\r\\s]+", "@"));
        }
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: h */
    public boolean mo7972h() {
        Method method = C1517b.findMethod().inClass("com.tencent.mm.pluginsdk.ui.chat.ChatFooter").params("java.lang.String", "int", "boolean").usingStrings("MicroMsg.ChatFooter", "setLastText() isBackFromGroupSolitatire").get();
        this.f7974e = method;
        return method != null;
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: j */
    public void mo7974j() {
        HookEngine.hookBefore(this.f7974e, new InterfaceC5156k() { // from class: hd.a
            @Override // md.InterfaceC5156k
            /* JADX INFO: renamed from: a */
            public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                this.f7973a.m11098n(interfaceC5154i);
            }
        });
    }
}
