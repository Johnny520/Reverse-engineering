package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.C1643;
import p052.InterfaceC6553;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0471 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6553 f1432;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1433;

    public /* synthetic */ C0471(int i, InterfaceC6553 interfaceC6553) {
        this.f1433 = i;
        this.f1432 = interfaceC6553;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f1433;
        InterfaceC6553 interfaceC6553 = this.f1432;
        C1643 c1643 = (C1643) obj;
        switch (i) {
            case 0:
                return DragGestureDetectorKt$detectDragGesturesAfterLongPress$5.invokeSuspend$lambda$0(interfaceC6553, c1643);
            case 1:
                return DragGestureDetectorKt$detectHorizontalDragGestures$5.invokeSuspend$lambda$1(interfaceC6553, c1643);
            default:
                return DragGestureDetectorKt$detectVerticalDragGestures$5.invokeSuspend$lambda$1(interfaceC6553, c1643);
        }
    }
}
