package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.AbstractC1309;
import androidx.compose.foundation.gestures.AbstractC1344;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import com.google.protobuf.DescriptorProtos$Edition;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1", m556f = "SelectionManager.kt", m557l = {DescriptorProtos$Edition.EDITION_2024_VALUE, 1007}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class SelectionManager$onClearSelectionRequested$1$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7372 $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC1737 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$onClearSelectionRequested$1$1(AbstractC1737 abstractC1737, InterfaceC7372 interfaceC7372, InterfaceC5189<? super SelectionManager$onClearSelectionRequested$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$block = interfaceC7372;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        SelectionManager$onClearSelectionRequested$1$1 selectionManager$onClearSelectionRequested$1$1 = new SelectionManager$onClearSelectionRequested$1$1(null, this.$block, interfaceC5189);
        selectionManager$onClearSelectionRequested$1$1.L$0 = obj;
        return selectionManager$onClearSelectionRequested$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SelectionManager$onClearSelectionRequested$1$1) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r6 == r0) goto L15;
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
            InterfaceC7380 interfaceC7380 = AbstractC1344.f1845;
            obj = AbstractC1344.m1834(interfaceC2468, PointerEventPass.Main, this);
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
            if (((Boolean) obj).booleanValue()) {
                return C6008.f15084;
            }
            throw null;
        }
        interfaceC2468 = (InterfaceC2468) this.L$0;
        AbstractC6017.m10769(obj);
        PointerEventPass pointerEventPass = PointerEventPass.Initial;
        this.L$0 = null;
        this.label = 2;
        obj = AbstractC1309.m1800(interfaceC2468, (C2478) obj, pointerEventPass, this);
    }
}
