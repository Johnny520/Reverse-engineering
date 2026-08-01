package io.modelcontextprotocol.kotlin.sdk.shared;

import kotlin.C5176;
import p052.InterfaceC6558;
import p056.C6745;
import p056.C6754;
import p088.AbstractC7159;
import p249.InterfaceC8160;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4301 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f12864;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12865;

    public /* synthetic */ C4301(Object obj, int i) {
        this.f12865 = i;
        this.f12864 = obj;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f12865;
        Object obj2 = this.f12864;
        switch (i) {
            case 0:
                C6754 c6754 = (C6754) obj;
                c6754.getClass();
                InterfaceC8160 interfaceC8160 = AbstractC4311.f12891;
                interfaceC8160.mo9047(new C4308(c6754, 1));
                int i2 = c6754.f18188;
                Double d = c6754.f18185;
                String str = c6754.f18184;
                InterfaceC6558 interfaceC6558 = (InterfaceC6558) ((AbstractC4307) obj2).f12878.get(c6754.f18187);
                if (interfaceC6558 == null) {
                    AbstractC7159 abstractC7159M8743 = AbstractC4311.m8743();
                    abstractC7159M8743.getClass();
                    interfaceC8160.mo9058(new C4308(new Error("Received a progress notification for an unknown token: ".concat(abstractC7159M8743.m12424(C6754.Companion.serializer(), c6754))), 2));
                } else {
                    interfaceC6558.invoke(new C6745(i2, d, str));
                }
                return AbstractC4311.f12888;
            default:
                AbstractC4310 abstractC4310 = (AbstractC4310) obj2;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    abstractC4310.f12876.invoke(th);
                } else {
                    abstractC4310.f12877.invoke();
                }
                return C5176.f14739;
        }
    }
}
