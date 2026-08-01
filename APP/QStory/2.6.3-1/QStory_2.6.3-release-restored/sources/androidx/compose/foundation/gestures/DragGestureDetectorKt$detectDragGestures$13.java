package androidx.compose.foundation.gestures;

import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$13", m556f = "DragGestureDetector.kt", m557l = {248, 249}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class DragGestureDetectorKt$detectDragGestures$13 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $onDrag;
    final /* synthetic */ InterfaceC7372 $onDragCancel;
    final /* synthetic */ InterfaceC7387 $onDragEnd;
    final /* synthetic */ InterfaceC7380 $onDragStart;
    final /* synthetic */ Orientation $orientationLock;
    final /* synthetic */ InterfaceC7372 $shouldAwaitTouchSlop;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGestures$13(InterfaceC7372 interfaceC7372, Orientation orientation, InterfaceC7380 interfaceC7380, InterfaceC7383 interfaceC7383, InterfaceC7372 interfaceC73722, InterfaceC7387 interfaceC7387, InterfaceC5189<? super DragGestureDetectorKt$detectDragGestures$13> interfaceC5189) {
        super(2, interfaceC5189);
        this.$shouldAwaitTouchSlop = interfaceC7372;
        this.$orientationLock = orientation;
        this.$onDragStart = interfaceC7380;
        this.$onDrag = interfaceC7383;
        this.$onDragCancel = interfaceC73722;
        this.$onDragEnd = interfaceC7387;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        DragGestureDetectorKt$detectDragGestures$13 dragGestureDetectorKt$detectDragGestures$13 = new DragGestureDetectorKt$detectDragGestures$13(this.$shouldAwaitTouchSlop, this.$orientationLock, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, interfaceC5189);
        dragGestureDetectorKt$detectDragGestures$13.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$13;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DragGestureDetectorKt$detectDragGestures$13) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (androidx.compose.foundation.gestures.AbstractC1309.m1805(r4, (androidx.compose.p001ui.input.pointer.C2478) r14, r6, r7, r8, r9, r10, r11, r13) == r0) goto L16;
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
            obj = AbstractC1344.m1836(interfaceC2468, false, pointerEventPass, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        interfaceC2468 = (InterfaceC2468) this.L$0;
        AbstractC6017.m10769(obj);
        InterfaceC2468 interfaceC24682 = interfaceC2468;
        InterfaceC7372 interfaceC7372 = this.$shouldAwaitTouchSlop;
        Orientation orientation = this.$orientationLock;
        InterfaceC7380 interfaceC7380 = this.$onDragStart;
        InterfaceC7383 interfaceC7383 = this.$onDrag;
        InterfaceC7372 interfaceC73722 = this.$onDragCancel;
        InterfaceC7387 interfaceC7387 = this.$onDragEnd;
        this.L$0 = null;
        this.label = 2;
    }
}
