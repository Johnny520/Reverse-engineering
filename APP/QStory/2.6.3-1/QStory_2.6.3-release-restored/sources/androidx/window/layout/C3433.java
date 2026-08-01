package androidx.window.layout;

import androidx.core.util.InterfaceC3021;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3433 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C3434 f8128;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3021 f8129;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8130;

    public /* synthetic */ C3433(C3434 c3434, InterfaceC3021 interfaceC3021, int i) {
        this.f8130 = i;
        this.f8128 = c3434;
        this.f8129 = interfaceC3021;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f8130;
        InterfaceC3021 interfaceC3021 = this.f8129;
        C3434 c3434 = this.f8128;
        C3429 c3429 = (C3429) interfaceC3021;
        switch (i) {
            case 0:
                return WindowInfoTrackerImpl$windowLayoutInfo$1.invokeSuspend$lambda$1(c3434, c3429);
            default:
                return WindowInfoTrackerImpl$windowLayoutInfo$2.invokeSuspend$lambda$1(c3434, c3429);
        }
    }
}
