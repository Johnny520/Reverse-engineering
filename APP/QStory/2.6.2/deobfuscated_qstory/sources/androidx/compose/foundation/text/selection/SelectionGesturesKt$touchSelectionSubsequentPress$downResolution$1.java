package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.AbstractC0468;
import androidx.compose.ui.input.pointer.AbstractC1646;
import androidx.compose.ui.input.pointer.C1621;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.InterfaceC1633;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.collections.AbstractC4343;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p112.C7328;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", f = "SelectionGestures.kt", l = {195}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Landroidx/compose/foundation/text/selection/DownResolution;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)Landroidx/compose/foundation/text/selection/DownResolution;"}, k = 3, mv = {2, 1, 0})
final class SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 extends RestrictedSuspendLambda implements InterfaceC6553 {
    final /* synthetic */ Ref$LongRef $overSlop;
    final /* synthetic */ long $pointerId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(long j, Ref$LongRef ref$LongRef, InterfaceC4356<? super SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$pointerId = j;
        this.$overSlop = ref$LongRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$0(Ref$LongRef ref$LongRef, C1643 c1643, C7328 c7328) {
        c1643.m3014();
        ref$LongRef.element = c7328.f19546;
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(this.$pointerId, this.$overSlop, interfaceC4356);
        selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1.L$0 = obj;
        return selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4356<? super DownResolution> interfaceC4356) {
        return ((SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1) create(interfaceC1633, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.foundation.text.selection.飘花落叶言子世楪苏兰哲] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC1633 interfaceC1633;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC1633 interfaceC16332 = (InterfaceC1633) this.L$0;
            long j = this.$pointerId;
            final Ref$LongRef ref$LongRef = this.$overSlop;
            ?? r5 = new InterfaceC6553() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子世楪苏兰哲
                @Override // p052.InterfaceC6553
                public final Object invoke(Object obj2, Object obj3) {
                    return SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1.invokeSuspend$lambda$0(ref$LongRef, (C1643) obj2, (C7328) obj3);
                }
            };
            this.L$0 = interfaceC16332;
            this.label = 1;
            Object objM1226 = AbstractC0468.m1226(interfaceC16332, j, r5, this);
            if (objM1226 == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC1633 = interfaceC16332;
            obj = objM1226;
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC1633 = (InterfaceC1633) this.L$0;
            AbstractC5184.m10206(obj);
        }
        if (((C1643) obj) != null && (this.$overSlop.element & 9223372034707292159L) != 9205357640488583168L) {
            return DownResolution.Drag;
        }
        C1643 c1643 = (C1643) AbstractC4343.m8827(((C1621) interfaceC1633).f4740.f4756.f4851);
        if (!AbstractC1646.m3017(c1643)) {
            return DownResolution.Cancel;
        }
        c1643.m3014();
        return DownResolution.Up;
    }
}
