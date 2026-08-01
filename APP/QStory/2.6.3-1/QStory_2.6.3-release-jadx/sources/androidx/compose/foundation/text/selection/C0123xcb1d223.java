package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.AbstractC1309;
import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", m556f = "SelectionGestures.kt", m557l = {195}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Landroidx/compose/foundation/text/selection/DownResolution;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)Landroidx/compose/foundation/text/selection/DownResolution;"}, m152k = 3, m153mv = {2, 1, 0})
final class C0123xcb1d223 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ Ref$LongRef $overSlop;
    final /* synthetic */ long $pointerId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0123xcb1d223(long j, Ref$LongRef ref$LongRef, InterfaceC5189<? super C0123xcb1d223> interfaceC5189) {
        super(2, interfaceC5189);
        this.$pointerId = j;
        this.$overSlop = ref$LongRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0(Ref$LongRef ref$LongRef, C2478 c2478, C8158 c8158) {
        c2478.m3584();
        ref$LongRef.element = c8158.f19886;
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        C0123xcb1d223 c0123xcb1d223 = new C0123xcb1d223(this.$pointerId, this.$overSlop, interfaceC5189);
        c0123xcb1d223.L$0 = obj;
        return c0123xcb1d223;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super DownResolution> interfaceC5189) {
        return ((C0123xcb1d223) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.foundation.text.selection.飘花落叶言子世楪苏兰哲] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC2468 interfaceC2468;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC2468 interfaceC24682 = (InterfaceC2468) this.L$0;
            long j = this.$pointerId;
            final Ref$LongRef ref$LongRef = this.$overSlop;
            ?? r5 = new InterfaceC7383() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子世楪苏兰哲
                @Override // p068.InterfaceC7383
                public final Object invoke(Object obj2, Object obj3) {
                    return C0123xcb1d223.invokeSuspend$lambda$0(ref$LongRef, (C2478) obj2, (C8158) obj3);
                }
            };
            this.L$0 = interfaceC24682;
            this.label = 1;
            Object objM1796 = AbstractC1309.m1796(interfaceC24682, j, r5, this);
            if (objM1796 == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC2468 = interfaceC24682;
            obj = objM1796;
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC2468 = (InterfaceC2468) this.L$0;
            AbstractC6017.m10769(obj);
        }
        if (((C2478) obj) != null && (this.$overSlop.element & 9223372034707292159L) != 9205357640488583168L) {
            return DownResolution.Drag;
        }
        C2478 c2478 = (C2478) AbstractC5176.m9379(((C2456) interfaceC2468).f5086.f5102.f5197);
        if (!AbstractC2481.m3587(c2478)) {
            return DownResolution.Cancel;
        }
        c2478.m3584();
        return DownResolution.f10Up;
    }
}
