package androidx.window.layout;

import androidx.core.util.InterfaceC3021;
import kotlinx.coroutines.channels.InterfaceC6028;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3429 implements InterfaceC3021 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6028 f8122;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8123;

    public /* synthetic */ C3429(InterfaceC6028 interfaceC6028, int i) {
        this.f8123 = i;
        this.f8122 = interfaceC6028;
    }

    @Override // androidx.core.util.InterfaceC3021
    public final void accept(Object obj) {
        int i = this.f8123;
        InterfaceC6028 interfaceC6028 = this.f8122;
        C3431 c3431 = (C3431) obj;
        switch (i) {
            case 0:
                WindowInfoTrackerImpl$windowLayoutInfo$1.invokeSuspend$lambda$0(interfaceC6028, c3431);
                break;
            default:
                WindowInfoTrackerImpl$windowLayoutInfo$2.invokeSuspend$lambda$0(interfaceC6028, c3431);
                break;
        }
    }
}
