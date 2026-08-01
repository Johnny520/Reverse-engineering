package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.C1643;
import kotlin.jvm.internal.Ref$FloatRef;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0467 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Ref$FloatRef f1427;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1428;

    public /* synthetic */ C0467(Ref$FloatRef ref$FloatRef, int i) {
        this.f1428 = i;
        this.f1427 = ref$FloatRef;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1428;
        Ref$FloatRef ref$FloatRef = this.f1427;
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
