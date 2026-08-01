package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.C1643;
import p052.InterfaceC6554;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0471 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6554 f1433;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1434;

    public /* synthetic */ C0471(int i, InterfaceC6554 interfaceC6554) {
        this.f1434 = i;
        this.f1433 = interfaceC6554;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f1434;
        InterfaceC6554 interfaceC6554 = this.f1433;
        C1643 c1643 = (C1643) obj;
        switch (i) {
            case 0:
                return DragGestureDetectorKt$detectDragGesturesAfterLongPress$5.invokeSuspend$lambda$0(interfaceC6554, c1643);
            case 1:
                return DragGestureDetectorKt$detectHorizontalDragGestures$5.invokeSuspend$lambda$1(interfaceC6554, c1643);
            default:
                return DragGestureDetectorKt$detectVerticalDragGestures$5.invokeSuspend$lambda$1(interfaceC6554, c1643);
        }
    }
}
