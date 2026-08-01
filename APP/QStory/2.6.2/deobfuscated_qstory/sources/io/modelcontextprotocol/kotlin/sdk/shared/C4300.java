package io.modelcontextprotocol.kotlin.sdk.shared;

import kotlin.C5175;
import p052.InterfaceC6557;
import p056.C6744;
import p056.C6753;
import p088.AbstractC7158;
import p249.InterfaceC8159;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4300 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f12860;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12861;

    public /* synthetic */ C4300(Object obj, int i) {
        this.f12861 = i;
        this.f12860 = obj;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f12861;
        Object obj2 = this.f12860;
        switch (i) {
            case 0:
                C6753 c6753 = (C6753) obj;
                c6753.getClass();
                InterfaceC8159 interfaceC8159 = AbstractC4310.f12887;
                interfaceC8159.mo9057(new C4307(c6753, 1));
                int i2 = c6753.f18193;
                Double d = c6753.f18190;
                String str = c6753.f18189;
                InterfaceC6557 interfaceC6557 = (InterfaceC6557) ((AbstractC4306) obj2).f12874.get(c6753.f18192);
                if (interfaceC6557 == null) {
                    AbstractC7158 abstractC7158M8753 = AbstractC4310.m8753();
                    abstractC7158M8753.getClass();
                    interfaceC8159.mo9068(new C4307(new Error("Received a progress notification for an unknown token: ".concat(abstractC7158M8753.m12397(C6753.Companion.serializer(), c6753))), 2));
                } else {
                    interfaceC6557.invoke(new C6744(i2, d, str));
                }
                return AbstractC4310.f12884;
            default:
                AbstractC4309 abstractC4309 = (AbstractC4309) obj2;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    abstractC4309.f12872.invoke(th);
                } else {
                    abstractC4309.f12873.invoke();
                }
                return C5175.f14739;
        }
    }
}
