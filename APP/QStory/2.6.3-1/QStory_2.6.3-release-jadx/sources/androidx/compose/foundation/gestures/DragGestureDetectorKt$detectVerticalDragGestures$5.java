package androidx.compose.foundation.gestures;

import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5", m556f = "DragGestureDetector.kt", m557l = {558, 561, 569}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class DragGestureDetectorKt$detectVerticalDragGestures$5 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7372 $onDragCancel;
    final /* synthetic */ InterfaceC7372 $onDragEnd;
    final /* synthetic */ InterfaceC7387 $onDragStart;
    final /* synthetic */ InterfaceC7383 $onVerticalDrag;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectVerticalDragGestures$5(InterfaceC7387 interfaceC7387, InterfaceC7383 interfaceC7383, InterfaceC7372 interfaceC7372, InterfaceC7372 interfaceC73722, InterfaceC5189<? super DragGestureDetectorKt$detectVerticalDragGestures$5> interfaceC5189) {
        super(2, interfaceC5189);
        this.$onDragStart = interfaceC7387;
        this.$onVerticalDrag = interfaceC7383;
        this.$onDragEnd = interfaceC7372;
        this.$onDragCancel = interfaceC73722;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0(Ref$FloatRef ref$FloatRef, C2478 c2478, float f) {
        c2478.m3584();
        ref$FloatRef.element = f;
        return C6008.f15084;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$1(InterfaceC7383 interfaceC7383, C2478 c2478) {
        interfaceC7383.invoke(c2478, Float.valueOf(Float.intBitsToFloat((int) (AbstractC2481.m3591(c2478, false) & 4294967295L))));
        c2478.m3584();
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        DragGestureDetectorKt$detectVerticalDragGestures$5 dragGestureDetectorKt$detectVerticalDragGestures$5 = new DragGestureDetectorKt$detectVerticalDragGestures$5(this.$onDragStart, this.$onVerticalDrag, this.$onDragEnd, this.$onDragCancel, interfaceC5189);
        dragGestureDetectorKt$detectVerticalDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectVerticalDragGestures$5;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DragGestureDetectorKt$detectVerticalDragGestures$5) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (r13 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2468 interfaceC2468;
        Ref$FloatRef ref$FloatRef;
        DragGestureDetectorKt$detectVerticalDragGestures$5 dragGestureDetectorKt$detectVerticalDragGestures$5;
        InterfaceC2468 interfaceC24682;
        C2478 c2478;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            interfaceC2468 = (InterfaceC2468) this.L$0;
            this.L$0 = interfaceC2468;
            this.label = 1;
            obj = AbstractC1344.m1835(interfaceC2468, null, this, 2);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
                dragGestureDetectorKt$detectVerticalDragGestures$5 = this;
                if (((Boolean) obj).booleanValue()) {
                    dragGestureDetectorKt$detectVerticalDragGestures$5.$onDragEnd.invoke();
                } else {
                    dragGestureDetectorKt$detectVerticalDragGestures$5.$onDragCancel.invoke();
                }
                return C6008.f15084;
            }
            ref$FloatRef = (Ref$FloatRef) this.L$1;
            interfaceC24682 = (InterfaceC2468) this.L$0;
            AbstractC6017.m10769(obj);
            dragGestureDetectorKt$detectVerticalDragGestures$5 = this;
            c2478 = (C2478) obj;
            if (c2478 != null) {
                dragGestureDetectorKt$detectVerticalDragGestures$5.$onDragStart.invoke(new C8158(c2478.f5152));
                dragGestureDetectorKt$detectVerticalDragGestures$5.$onVerticalDrag.invoke(c2478, new Float(ref$FloatRef.element));
                long j = c2478.f5154;
                C1312 c1312 = new C1312(i2, dragGestureDetectorKt$detectVerticalDragGestures$5.$onVerticalDrag);
                dragGestureDetectorKt$detectVerticalDragGestures$5.L$0 = null;
                dragGestureDetectorKt$detectVerticalDragGestures$5.L$1 = null;
                dragGestureDetectorKt$detectVerticalDragGestures$5.label = 3;
                obj = AbstractC1309.m1801(interfaceC24682, j, c1312, dragGestureDetectorKt$detectVerticalDragGestures$5);
            }
            return C6008.f15084;
        }
        interfaceC2468 = (InterfaceC2468) this.L$0;
        AbstractC6017.m10769(obj);
        InterfaceC2468 interfaceC24683 = interfaceC2468;
        C2478 c24782 = (C2478) obj;
        ref$FloatRef = new Ref$FloatRef();
        long j2 = c24782.f5154;
        int i4 = c24782.f5164;
        C1308 c1308 = new C1308(ref$FloatRef, i3);
        this.L$0 = interfaceC24683;
        this.L$1 = ref$FloatRef;
        this.label = 2;
        dragGestureDetectorKt$detectVerticalDragGestures$5 = this;
        obj = AbstractC1309.m1795(interfaceC24683, j2, i4, c1308, dragGestureDetectorKt$detectVerticalDragGestures$5);
        if (obj != coroutineSingletons) {
            interfaceC24682 = interfaceC24683;
            c2478 = (C2478) obj;
            if (c2478 != null) {
            }
            return C6008.f15084;
        }
        return coroutineSingletons;
    }
}
