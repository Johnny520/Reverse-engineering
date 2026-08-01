package androidx.compose.foundation.gestures;

import androidx.compose.p001ui.input.pointer.C2478;
import p068.InterfaceC7383;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1312 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7383 f1778;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1779;

    public /* synthetic */ C1312(int i, InterfaceC7383 interfaceC7383) {
        this.f1779 = i;
        this.f1778 = interfaceC7383;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f1779;
        InterfaceC7383 interfaceC7383 = this.f1778;
        C2478 c2478 = (C2478) obj;
        switch (i) {
            case 0:
                return DragGestureDetectorKt$detectDragGesturesAfterLongPress$5.invokeSuspend$lambda$0(interfaceC7383, c2478);
            case 1:
                return DragGestureDetectorKt$detectHorizontalDragGestures$5.invokeSuspend$lambda$1(interfaceC7383, c2478);
            default:
                return DragGestureDetectorKt$detectVerticalDragGestures$5.invokeSuspend$lambda$1(interfaceC7383, c2478);
        }
    }
}
