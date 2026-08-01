package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.C1643;
import kotlin.jvm.internal.Ref$FloatRef;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0467 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Ref$FloatRef f1428;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1429;

    public /* synthetic */ C0467(Ref$FloatRef ref$FloatRef, int i) {
        this.f1429 = i;
        this.f1428 = ref$FloatRef;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1429;
        Ref$FloatRef ref$FloatRef = this.f1428;
        C1643 c1643 = (C1643) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        switch (i) {
            case 0:
                return DragGestureDetectorKt$detectHorizontalDragGestures$5.invokeSuspend$lambda$0(ref$FloatRef, c1643, fFloatValue);
            default:
                return DragGestureDetectorKt$detectVerticalDragGestures$5.invokeSuspend$lambda$0(ref$FloatRef, c1643, fFloatValue);
        }
    }
}
