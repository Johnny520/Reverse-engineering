package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.AbstractC0468;
import androidx.compose.ui.input.pointer.AbstractC1646;
import androidx.compose.ui.input.pointer.C1621;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.InterfaceC1633;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.collections.AbstractC4344;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p112.C7329;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", f = "SelectionGestures.kt", l = {195}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Landroidx/compose/foundation/text/selection/DownResolution;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)Landroidx/compose/foundation/text/selection/DownResolution;"}, k = 3, mv = {2, 1, 0})
final class SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    final /* synthetic */ Ref$LongRef $overSlop;
    final /* synthetic */ long $pointerId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(long j, Ref$LongRef ref$LongRef, InterfaceC4357<? super SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$pointerId = j;
        this.$overSlop = ref$LongRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$0(Ref$LongRef ref$LongRef, C1643 c1643, C7329 c7329) {
        c1643.m3024();
        ref$LongRef.element = c7329.f19541;
        return C5176.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(this.$pointerId, this.$overSlop, interfaceC4357);
        selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1.L$0 = obj;
        return selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4357<? super DownResolution> interfaceC4357) {
        return ((SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1) create(interfaceC1633, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.foundation.text.selection.飘花落叶言子世楪苏兰哲] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC1633 interfaceC1633;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC1633 interfaceC16332 = (InterfaceC1633) this.L$0;
            long j = this.$pointerId;
            final Ref$LongRef ref$LongRef = this.$overSlop;
            ?? r5 = new InterfaceC6554() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子世楪苏兰哲
                @Override // p052.InterfaceC6554
                public final Object invoke(Object obj2, Object obj3) {
                    return SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1.invokeSuspend$lambda$0(ref$LongRef, (C1643) obj2, (C7329) obj3);
                }
            };
            this.L$0 = interfaceC16332;
            this.label = 1;
            Object objM1236 = AbstractC0468.m1236(interfaceC16332, j, r5, this);
            if (objM1236 == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC1633 = interfaceC16332;
            obj = objM1236;
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC1633 = (InterfaceC1633) this.L$0;
            AbstractC5185.m10210(obj);
        }
        if (((C1643) obj) != null && (this.$overSlop.element & 9223372034707292159L) != 9205357640488583168L) {
            return DownResolution.Drag;
        }
        C1643 c1643 = (C1643) AbstractC4344.m8820(((C1621) interfaceC1633).f4741.f4757.f4852);
        if (!AbstractC1646.m3027(c1643)) {
            return DownResolution.Cancel;
        }
        c1643.m3024();
        return DownResolution.Up;
    }
}
