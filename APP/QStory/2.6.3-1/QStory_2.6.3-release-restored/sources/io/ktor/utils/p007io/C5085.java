package io.ktor.utils.p007io;

import kotlin.C6008;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5085 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C5081 f13115;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13116;

    public /* synthetic */ C5085(C5081 c5081, int i) {
        this.f13116 = i;
        this.f13115 = c5081;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f13116;
        C6008 c6008 = C6008.f15084;
        C5081 c5081 = this.f13115;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                if (th != null) {
                    c5081.mo9204(th);
                }
                break;
            case 1:
                if (th != null && !c5081.mo9200()) {
                    c5081.mo9204(th);
                }
                break;
            default:
                if (th != null && !c5081.m9262()) {
                    c5081.mo9204(th);
                }
                break;
        }
        return c6008;
    }
}
