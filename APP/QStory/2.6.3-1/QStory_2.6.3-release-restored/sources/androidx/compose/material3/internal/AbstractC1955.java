package androidx.compose.material3.internal;

import androidx.compose.p001ui.text.C2889;
import androidx.compose.p001ui.text.C2893;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7383;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.material3.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1955 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2893 f3612 = new C2893(new C2889());

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final StackTraceElement[] f3611 = new StackTraceElement[0];

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2574(C1954 c1954, InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) {
        AnchoredDraggableKt$restartable$1 anchoredDraggableKt$restartable$1;
        if (continuationImpl instanceof AnchoredDraggableKt$restartable$1) {
            anchoredDraggableKt$restartable$1 = (AnchoredDraggableKt$restartable$1) continuationImpl;
            int i = anchoredDraggableKt$restartable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anchoredDraggableKt$restartable$1.label = i - Integer.MIN_VALUE;
            } else {
                anchoredDraggableKt$restartable$1 = new AnchoredDraggableKt$restartable$1(continuationImpl);
            }
        }
        Object obj = anchoredDraggableKt$restartable$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anchoredDraggableKt$restartable$1.label;
        try {
            if (i2 == 0) {
                AbstractC6017.m10769(obj);
                AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(c1954, interfaceC7383, null);
                anchoredDraggableKt$restartable$1.label = 1;
                if (AbstractC6231.m11066(anchoredDraggableKt$restartable$2, anchoredDraggableKt$restartable$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
            }
        } catch (AnchoredDragFinishedSignal unused) {
        }
        return C6008.f15084;
    }
}
