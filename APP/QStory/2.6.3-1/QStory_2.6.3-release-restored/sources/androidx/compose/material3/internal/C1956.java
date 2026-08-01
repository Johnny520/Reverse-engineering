package androidx.compose.material3.internal;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.flow.InterfaceC6150;
import p068.InterfaceC7383;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.material3.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1956 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6233 f3613;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7383 f3614;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f3615;

    public C1956(Ref$ObjectRef ref$ObjectRef, InterfaceC6233 interfaceC6233, InterfaceC7383 interfaceC7383) {
        this.f3615 = ref$ObjectRef;
        this.f3613 = interfaceC6233;
        this.f3614 = interfaceC7383;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, kotlinx.coroutines.飘花落叶言子哲楪世兰苏] */
    @Override // kotlinx.coroutines.flow.InterfaceC6150
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        AnchoredDraggableKt$restartable$2$1$emit$1 anchoredDraggableKt$restartable$2$1$emit$1;
        if (interfaceC5189 instanceof AnchoredDraggableKt$restartable$2$1$emit$1) {
            anchoredDraggableKt$restartable$2$1$emit$1 = (AnchoredDraggableKt$restartable$2$1$emit$1) interfaceC5189;
            int i = anchoredDraggableKt$restartable$2$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anchoredDraggableKt$restartable$2$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                anchoredDraggableKt$restartable$2$1$emit$1 = new AnchoredDraggableKt$restartable$2$1$emit$1(this, interfaceC5189);
            }
        }
        Object obj2 = anchoredDraggableKt$restartable$2$1$emit$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anchoredDraggableKt$restartable$2$1$emit$1.label;
        Ref$ObjectRef ref$ObjectRef = this.f3615;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            InterfaceC6284 interfaceC6284 = (InterfaceC6284) ref$ObjectRef.element;
            if (interfaceC6284 != null) {
                interfaceC6284.mo10815(new AnchoredDragFinishedSignal());
                anchoredDraggableKt$restartable$2$1$emit$1.L$0 = obj;
                anchoredDraggableKt$restartable$2$1$emit$1.L$1 = interfaceC6284;
                anchoredDraggableKt$restartable$2$1$emit$1.label = 1;
                if (interfaceC6284.mo11123(anchoredDraggableKt$restartable$2$1$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = anchoredDraggableKt$restartable$2$1$emit$1.L$0;
            AbstractC6017.m10769(obj2);
        }
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        InterfaceC7383 interfaceC7383 = this.f3614;
        InterfaceC6233 interfaceC6233 = this.f3613;
        ref$ObjectRef.element = AbstractC6231.m11036(interfaceC6233, null, coroutineStart, new AnchoredDraggableKt$restartable$2$1$2(interfaceC7383, obj, interfaceC6233, null), 1);
        return C6008.f15084;
    }
}
