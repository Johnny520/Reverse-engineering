package p114hd;

import cd.C1517b;
import java.lang.reflect.Method;
import md.InterfaceC5154i;
import md.InterfaceC5156k;
import me.yun.fkwechat.loader.api.HookEngine;
import p068ed.AbstractC2212a;

/* JADX INFO: renamed from: hd.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3006d extends AbstractC2212a {

    /* JADX INFO: renamed from: e */
    public long f7976e;

    /* JADX INFO: renamed from: f */
    public Method f7977f;

    public C3006d() {
        this.f6040c = "DoublePatHook";
        this.f7976e = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m11100n(InterfaceC5154i interfaceC5154i) {
        if (m7973i()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f7976e < 290) {
                interfaceC5154i.setResult(null);
            }
            this.f7976e = jCurrentTimeMillis;
        }
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: h */
    public boolean mo7972h() {
        this.f7977f = C1517b.findMethod().usingStrings("com/tencent/mm/plugin/patmsg/ui/PatHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V").get();
        return true;
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: j */
    public void mo7974j() {
        HookEngine.hookBefore(this.f7977f, new InterfaceC5156k() { // from class: hd.c
            @Override // md.InterfaceC5156k
            /* JADX INFO: renamed from: a */
            public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                this.f7975a.m11100n(interfaceC5154i);
            }
        });
    }
}
