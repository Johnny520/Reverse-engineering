package androidx.window.layout;

import androidx.core.util.InterfaceC2188;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2599 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C2600 f7781;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2188 f7782;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7783;

    public /* synthetic */ C2599(C2600 c2600, InterfaceC2188 interfaceC2188, int i) {
        this.f7783 = i;
        this.f7781 = c2600;
        this.f7782 = interfaceC2188;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f7783;
        InterfaceC2188 interfaceC2188 = this.f7782;
        C2600 c2600 = this.f7781;
        C2595 c2595 = (C2595) interfaceC2188;
        switch (i) {
            case 0:
                return WindowInfoTrackerImpl$windowLayoutInfo$1.invokeSuspend$lambda$1(c2600, c2595);
            default:
                return WindowInfoTrackerImpl$windowLayoutInfo$2.invokeSuspend$lambda$1(c2600, c2595);
        }
    }
}
