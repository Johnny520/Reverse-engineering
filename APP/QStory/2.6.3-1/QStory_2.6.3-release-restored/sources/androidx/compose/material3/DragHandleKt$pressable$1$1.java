package androidx.compose.material3;

import androidx.compose.foundation.gestures.AbstractC1344;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.DragHandleKt$pressable$1$1", m556f = "DragHandle.kt", m557l = {341, 343}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class DragHandleKt$pressable$1$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7372 $onPressed;
    final /* synthetic */ InterfaceC7372 $onReleasedOrCancelled;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragHandleKt$pressable$1$1(InterfaceC7372 interfaceC7372, InterfaceC7372 interfaceC73722, InterfaceC5189<? super DragHandleKt$pressable$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$onPressed = interfaceC7372;
        this.$onReleasedOrCancelled = interfaceC73722;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        DragHandleKt$pressable$1$1 dragHandleKt$pressable$1$1 = new DragHandleKt$pressable$1$1(this.$onPressed, this.$onReleasedOrCancelled, interfaceC5189);
        dragHandleKt$pressable$1$1.L$0 = obj;
        return dragHandleKt$pressable$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DragHandleKt$pressable$1$1) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (androidx.compose.foundation.gestures.AbstractC1344.m1839(r1, r6, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2468 interfaceC2468;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            interfaceC2468 = (InterfaceC2468) this.L$0;
            PointerEventPass pointerEventPass = PointerEventPass.Initial;
            this.L$0 = interfaceC2468;
            this.label = 1;
            if (AbstractC1344.m1835(interfaceC2468, pointerEventPass, this, 1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            this.$onReleasedOrCancelled.invoke();
            return C6008.f15084;
        }
        interfaceC2468 = (InterfaceC2468) this.L$0;
        AbstractC6017.m10769(obj);
        this.$onPressed.invoke();
        PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
        this.L$0 = null;
        this.label = 2;
    }
}
