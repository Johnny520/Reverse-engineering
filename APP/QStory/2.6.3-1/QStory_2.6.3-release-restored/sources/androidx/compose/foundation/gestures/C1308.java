package androidx.compose.foundation.gestures;

import androidx.compose.p001ui.input.pointer.C2478;
import kotlin.jvm.internal.Ref$FloatRef;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1308 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Ref$FloatRef f1773;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1774;

    public /* synthetic */ C1308(Ref$FloatRef ref$FloatRef, int i) {
        this.f1774 = i;
        this.f1773 = ref$FloatRef;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1774;
        Ref$FloatRef ref$FloatRef = this.f1773;
        C2478 c2478 = (C2478) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        switch (i) {
            case 0:
                return DragGestureDetectorKt$detectHorizontalDragGestures$5.invokeSuspend$lambda$0(ref$FloatRef, c2478, fFloatValue);
            default:
                return DragGestureDetectorKt$detectVerticalDragGestures$5.invokeSuspend$lambda$0(ref$FloatRef, c2478, fFloatValue);
        }
    }
}
