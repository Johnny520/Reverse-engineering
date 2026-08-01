package androidx.window.layout;

import androidx.core.util.InterfaceC2188;
import kotlinx.coroutines.channels.InterfaceC5196;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2596 implements InterfaceC2188 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5196 f7777;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7778;

    public /* synthetic */ C2596(InterfaceC5196 interfaceC5196, int i) {
        this.f7778 = i;
        this.f7777 = interfaceC5196;
    }

    @Override // androidx.core.util.InterfaceC2188
    public final void accept(Object obj) {
        int i = this.f7778;
        InterfaceC5196 interfaceC5196 = this.f7777;
        C2598 c2598 = (C2598) obj;
        switch (i) {
            case 0:
                WindowInfoTrackerImpl$windowLayoutInfo$1.invokeSuspend$lambda$0(interfaceC5196, c2598);
                break;
            default:
                WindowInfoTrackerImpl$windowLayoutInfo$2.invokeSuspend$lambda$0(interfaceC5196, c2598);
                break;
        }
    }
}
