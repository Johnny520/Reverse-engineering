package androidx.compose.foundation.gestures;

import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", m556f = "DragGestureDetector.kt", m557l = {384, 385, 390}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $onDrag;
    final /* synthetic */ InterfaceC7372 $onDragCancel;
    final /* synthetic */ InterfaceC7372 $onDragEnd;
    final /* synthetic */ InterfaceC7387 $onDragStart;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(InterfaceC7387 interfaceC7387, InterfaceC7372 interfaceC7372, InterfaceC7372 interfaceC73722, InterfaceC7383 interfaceC7383, InterfaceC5189<? super DragGestureDetectorKt$detectDragGesturesAfterLongPress$5> interfaceC5189) {
        super(2, interfaceC5189);
        this.$onDragStart = interfaceC7387;
        this.$onDragEnd = interfaceC7372;
        this.$onDragCancel = interfaceC73722;
        this.$onDrag = interfaceC7383;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0(InterfaceC7383 interfaceC7383, C2478 c2478) {
        interfaceC7383.invoke(c2478, new C8158(AbstractC2481.m3591(c2478, false)));
        c2478.m3584();
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$onDrag, interfaceC5189);
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGesturesAfterLongPress$5;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0058 A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x0079, B:35:0x0081, B:37:0x008f, B:39:0x009b, B:40:0x009e, B:41:0x00a1, B:42:0x00a7, B:15:0x0026, B:27:0x0054, B:29:0x0058, B:18:0x002e, B:24:0x0045, B:21:0x003a), top: B:47:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081 A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x0079, B:35:0x0081, B:37:0x008f, B:39:0x009b, B:40:0x009e, B:41:0x00a1, B:42:0x00a7, B:15:0x0026, B:27:0x0054, B:29:0x0058, B:18:0x002e, B:24:0x0045, B:21:0x003a), top: B:47:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7 A[Catch: CancellationException -> 0x0019, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x0079, B:35:0x0081, B:37:0x008f, B:39:0x009b, B:40:0x009e, B:41:0x00a1, B:42:0x00a7, B:15:0x0026, B:27:0x0054, B:29:0x0058, B:18:0x002e, B:24:0x0045, B:21:0x003a), top: B:47:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2468 interfaceC2468;
        C2478 c2478;
        InterfaceC2468 interfaceC24682;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 0;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                interfaceC2468 = (InterfaceC2468) this.L$0;
                this.L$0 = interfaceC2468;
                this.label = 1;
                obj = AbstractC1344.m1835(interfaceC2468, null, this, 2);
                if (obj == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i == 2) {
                    interfaceC2468 = (InterfaceC2468) this.L$0;
                    AbstractC6017.m10769(obj);
                    c2478 = (C2478) obj;
                    if (c2478 != null) {
                        this.$onDragStart.invoke(new C8158(c2478.f5152));
                        long j = c2478.f5154;
                        C1312 c1312 = new C1312(i2, this.$onDrag);
                        this.L$0 = interfaceC2468;
                        this.label = 3;
                        obj = AbstractC1309.m1802(interfaceC2468, j, c1312, this);
                        if (obj != coroutineSingletons) {
                            interfaceC24682 = interfaceC2468;
                            if (((Boolean) obj).booleanValue()) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    return C6008.f15084;
                }
                if (i != 3) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC24682 = (InterfaceC2468) this.L$0;
                AbstractC6017.m10769(obj);
                if (((Boolean) obj).booleanValue()) {
                    this.$onDragCancel.invoke();
                } else {
                    List list = ((C2456) interfaceC24682).f5086.f5102.f5197;
                    int size = list.size();
                    while (i2 < size) {
                        C2478 c24782 = (C2478) list.get(i2);
                        if (AbstractC2481.m3588(c24782)) {
                            c24782.m3584();
                        }
                        i2++;
                    }
                    this.$onDragEnd.invoke();
                }
                return C6008.f15084;
            }
            interfaceC2468 = (InterfaceC2468) this.L$0;
            AbstractC6017.m10769(obj);
            long j2 = ((C2478) obj).f5154;
            this.L$0 = interfaceC2468;
            this.label = 2;
            obj = AbstractC1309.m1797(interfaceC2468, j2, this);
            if (obj != coroutineSingletons) {
                c2478 = (C2478) obj;
                if (c2478 != null) {
                }
                return C6008.f15084;
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            this.$onDragCancel.invoke();
            throw e;
        }
    }
}
