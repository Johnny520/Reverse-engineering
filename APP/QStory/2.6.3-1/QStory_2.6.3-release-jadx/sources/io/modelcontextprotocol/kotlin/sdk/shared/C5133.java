package io.modelcontextprotocol.kotlin.sdk.shared;

import kotlin.C6008;
import p068.InterfaceC7387;
import p072.C7574;
import p072.C7583;
import p104.AbstractC7988;
import p265.InterfaceC8989;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5133 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f13209;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13210;

    public /* synthetic */ C5133(Object obj, int i) {
        this.f13210 = i;
        this.f13209 = obj;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f13210;
        Object obj2 = this.f13209;
        switch (i) {
            case 0:
                C7583 c7583 = (C7583) obj;
                c7583.getClass();
                InterfaceC8989 interfaceC8989 = AbstractC5143.f13236;
                interfaceC8989.mo9606(new C5140(c7583, 1));
                int i2 = c7583.f18533;
                Double d = c7583.f18530;
                String str = c7583.f18529;
                InterfaceC7387 interfaceC7387 = (InterfaceC7387) ((AbstractC5139) obj2).f13223.get(c7583.f18532);
                if (interfaceC7387 == null) {
                    AbstractC7988 abstractC7988M9302 = AbstractC5143.m9302();
                    abstractC7988M9302.getClass();
                    interfaceC8989.mo9617(new C5140(new Error("Received a progress notification for an unknown token: ".concat(abstractC7988M9302.m12983(C7583.Companion.serializer(), c7583))), 2));
                } else {
                    interfaceC7387.invoke(new C7574(i2, d, str));
                }
                return AbstractC5143.f13233;
            default:
                AbstractC5142 abstractC5142 = (AbstractC5142) obj2;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    abstractC5142.f13221.invoke(th);
                } else {
                    abstractC5142.f13222.invoke();
                }
                return C6008.f15084;
        }
    }
}
