package p114hd;

import cd.C1517b;
import java.lang.reflect.Method;
import md.InterfaceC5154i;
import md.InterfaceC5156k;
import me.yun.fkwechat.loader.api.HookEngine;
import p068ed.AbstractC2212a;

/* JADX INFO: renamed from: hd.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3011i extends AbstractC2212a {

    /* JADX INFO: renamed from: e */
    public Method f7982e;

    public C3011i() {
        this.f6040c = "MoneyMockHook";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m11110o(InterfaceC5154i interfaceC5154i) {
        if (m7973i()) {
            interfaceC5154i.setArg(0, m11111n());
        }
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: h */
    public boolean mo7972h() {
        Method method = C1517b.findMethod().inClass("com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView").params("java.lang.String", "boolean", "boolean", "boolean").returnType("void").get();
        this.f7982e = method;
        return method != null;
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: j */
    public void mo7974j() {
        HookEngine.hookBefore(this.f7982e, new InterfaceC5156k() { // from class: hd.h
            @Override // md.InterfaceC5156k
            /* JADX INFO: renamed from: a */
            public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                this.f7981a.m11110o(interfaceC5154i);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final String m11111n() {
        return m7970f("PayMoney_Balance", "9999.99");
    }
}
