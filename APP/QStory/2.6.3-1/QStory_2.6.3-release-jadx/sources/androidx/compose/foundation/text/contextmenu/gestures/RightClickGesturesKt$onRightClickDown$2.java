package androidx.compose.foundation.text.contextmenu.gestures;

import androidx.compose.foundation.gestures.AbstractC1344;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$onRightClickDown$2", m556f = "RightClickGestures.kt", m557l = {32, 35}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class RightClickGesturesKt$onRightClickDown$2 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7387 $onDown;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RightClickGesturesKt$onRightClickDown$2(InterfaceC7387 interfaceC7387, InterfaceC5189<? super RightClickGesturesKt$onRightClickDown$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$onDown = interfaceC7387;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        RightClickGesturesKt$onRightClickDown$2 rightClickGesturesKt$onRightClickDown$2 = new RightClickGesturesKt$onRightClickDown$2(this.$onDown, interfaceC5189);
        rightClickGesturesKt$onRightClickDown$2.L$0 = obj;
        return rightClickGesturesKt$onRightClickDown$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((RightClickGesturesKt$onRightClickDown$2) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r8 == r0) goto L15;
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
            this.L$0 = interfaceC2468;
            this.label = 1;
            obj = AbstractC1625.m2150(interfaceC2468, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            C2478 c2478 = (C2478) obj;
            if (c2478 != null) {
                c2478.m3584();
            }
            return C6008.f15084;
        }
        interfaceC2468 = (InterfaceC2468) this.L$0;
        AbstractC6017.m10769(obj);
        C2478 c24782 = (C2478) obj;
        c24782.m3584();
        this.$onDown.invoke(new C8158(c24782.f5152));
        this.L$0 = null;
        this.label = 2;
        InterfaceC7380 interfaceC7380 = AbstractC1344.f1845;
        obj = AbstractC1344.m1839(interfaceC2468, PointerEventPass.Main, this);
    }
}
