package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.AbstractC1344;
import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import io.ktor.client.plugins.api.C4718;
import java.util.List;
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
@InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2", m556f = "PressDownGesture.kt", m557l = {31, 37}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class PressDownGestureKt$detectPressDownGesture$2 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC1685 $onDown;
    final /* synthetic */ InterfaceC7372 $onUp;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressDownGestureKt$detectPressDownGesture$2(InterfaceC1685 interfaceC1685, InterfaceC7372 interfaceC7372, InterfaceC5189<? super PressDownGestureKt$detectPressDownGesture$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$onDown = interfaceC1685;
        this.$onUp = interfaceC7372;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        PressDownGestureKt$detectPressDownGesture$2 pressDownGestureKt$detectPressDownGesture$2 = new PressDownGestureKt$detectPressDownGesture$2(this.$onDown, this.$onUp, interfaceC5189);
        pressDownGestureKt$detectPressDownGesture$2.L$0 = obj;
        return pressDownGestureKt$detectPressDownGesture$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((PressDownGestureKt$detectPressDownGesture$2) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r12 == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                InterfaceC1685 interfaceC1685 = this.$onDown;
                long j = ((C2478) obj).f5152;
                ((C4718) interfaceC1685).getClass();
                throw null;
            }
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C2478 c2478 = (C2478) this.L$1;
            InterfaceC2468 interfaceC2468 = (InterfaceC2468) this.L$0;
            AbstractC6017.m10769(obj);
            do {
                List list = ((C2487) obj).f5197;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C2478 c24782 = (C2478) list.get(i2);
                    if (AbstractC2481.m3586(c24782.f5154, c2478.f5154) && c24782.f5151) {
                        this.L$0 = interfaceC2468;
                        this.L$1 = c2478;
                        this.label = 2;
                        obj = ((C2456) interfaceC2468).m3559(PointerEventPass.Main, this);
                    }
                }
                this.$onUp.invoke();
                return C6008.f15084;
            } while (obj != coroutineSingletons);
            return coroutineSingletons;
        }
        AbstractC6017.m10769(obj);
        InterfaceC2468 interfaceC24682 = (InterfaceC2468) this.L$0;
        this.L$0 = interfaceC24682;
        this.label = 1;
        obj = AbstractC1344.m1835(interfaceC24682, null, this, 2);
    }
}
