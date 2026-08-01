package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.AbstractC1344;
import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", m556f = "LongPressTextDragObserver.kt", m557l = {77, 81}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC1851 $observer;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(InterfaceC1851 interfaceC1851, InterfaceC5189<? super LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$observer = interfaceC1851;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(this.$observer, interfaceC5189);
        longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.L$0 = obj;
        return longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r12 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r12 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004f -> B:17:0x0052). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2468 interfaceC2468;
        InterfaceC2468 interfaceC24682;
        C2478 c2478;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            interfaceC2468 = (InterfaceC2468) this.L$0;
            this.L$0 = interfaceC2468;
            this.label = 1;
            obj = AbstractC1344.m1835(interfaceC2468, null, this, 2);
        } else {
            if (i != 1) {
                if (i != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c2478 = (C2478) this.L$1;
                interfaceC24682 = (InterfaceC2468) this.L$0;
                AbstractC6017.m10769(obj);
                List list = ((C2487) obj).f5197;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C2478 c24782 = (C2478) list.get(i2);
                    if (AbstractC2481.m3586(c24782.f5154, c2478.f5154) && c24782.f5151) {
                        this.L$0 = interfaceC24682;
                        this.L$1 = c2478;
                        this.label = 2;
                        obj = ((C2456) interfaceC24682).m3559(PointerEventPass.Main, this);
                    }
                }
                this.$observer.mo2306();
                return C6008.f15084;
            }
            interfaceC2468 = (InterfaceC2468) this.L$0;
            AbstractC6017.m10769(obj);
        }
        C2478 c24783 = (C2478) obj;
        InterfaceC1851 interfaceC1851 = this.$observer;
        long j = c24783.f5152;
        interfaceC1851.mo2305();
        interfaceC24682 = interfaceC2468;
        c2478 = c24783;
        this.L$0 = interfaceC24682;
        this.L$1 = c2478;
        this.label = 2;
        obj = ((C2456) interfaceC24682).m3559(PointerEventPass.Main, this);
    }
}
