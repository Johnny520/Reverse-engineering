package androidx.compose.foundation.text.selection;

import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", m556f = "SelectionGestures.kt", m557l = {94}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class SelectionGesturesKt$updateSelectionTouchMode$1$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7387 $updateTouchMode;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$updateSelectionTouchMode$1$1(InterfaceC7387 interfaceC7387, InterfaceC5189<? super SelectionGesturesKt$updateSelectionTouchMode$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$updateTouchMode = interfaceC7387;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        SelectionGesturesKt$updateSelectionTouchMode$1$1 selectionGesturesKt$updateSelectionTouchMode$1$1 = new SelectionGesturesKt$updateSelectionTouchMode$1$1(this.$updateTouchMode, interfaceC5189);
        selectionGesturesKt$updateSelectionTouchMode$1$1.L$0 = obj;
        return selectionGesturesKt$updateSelectionTouchMode$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SelectionGesturesKt$updateSelectionTouchMode$1$1) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002e -> B:13:0x0031). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2468 interfaceC2468;
        Object objM3559;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            interfaceC2468 = (InterfaceC2468) this.L$0;
            PointerEventPass pointerEventPass = PointerEventPass.Initial;
            this.L$0 = interfaceC2468;
            this.label = 1;
            C2456 c2456 = (C2456) interfaceC2468;
            objM3559 = c2456.m3559(pointerEventPass, this);
            if (objM3559 == coroutineSingletons) {
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            InterfaceC2468 interfaceC24682 = (InterfaceC2468) this.L$0;
            AbstractC6017.m10769(obj);
            this.$updateTouchMode.invoke(Boolean.valueOf(!AbstractC1732.m2360((C2487) obj)));
            interfaceC2468 = interfaceC24682;
            PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
            this.L$0 = interfaceC2468;
            this.label = 1;
            C2456 c24562 = (C2456) interfaceC2468;
            objM3559 = c24562.m3559(pointerEventPass2, this);
            if (objM3559 == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC24682 = c24562;
            obj = objM3559;
            this.$updateTouchMode.invoke(Boolean.valueOf(!AbstractC1732.m2360((C2487) obj)));
            interfaceC2468 = interfaceC24682;
            PointerEventPass pointerEventPass22 = PointerEventPass.Initial;
            this.L$0 = interfaceC2468;
            this.label = 1;
            C2456 c245622 = (C2456) interfaceC2468;
            objM3559 = c245622.m3559(pointerEventPass22, this);
            if (objM3559 == coroutineSingletons) {
            }
        }
    }
}
