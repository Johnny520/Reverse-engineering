package io.ktor.utils.io;

import kotlin.C5175;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4252 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C4248 f12766;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12767;

    public /* synthetic */ C4252(C4248 c4248, int i) {
        this.f12767 = i;
        this.f12766 = c4248;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f12767;
        C5175 c5175 = C5175.f14739;
        C4248 c4248 = this.f12766;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                if (th != null) {
                    c4248.mo8655(th);
                }
                break;
            case 1:
                if (th != null && !c4248.mo8651()) {
                    c4248.mo8655(th);
                }
                break;
            default:
                if (th != null && !c4248.m8713()) {
                    c4248.mo8655(th);
                }
                break;
        }
        return c5175;
    }
}
