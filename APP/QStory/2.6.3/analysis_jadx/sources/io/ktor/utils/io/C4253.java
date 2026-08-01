package io.ktor.utils.io;

import kotlin.C5176;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4253 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C4249 f12770;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12771;

    public /* synthetic */ C4253(C4249 c4249, int i) {
        this.f12771 = i;
        this.f12770 = c4249;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f12771;
        C5176 c5176 = C5176.f14739;
        C4249 c4249 = this.f12770;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                if (th != null) {
                    c4249.mo8645(th);
                }
                break;
            case 1:
                if (th != null && !c4249.mo8641()) {
                    c4249.mo8645(th);
                }
                break;
            default:
                if (th != null && !c4249.m8703()) {
                    c4249.mo8645(th);
                }
                break;
        }
        return c5176;
    }
}
