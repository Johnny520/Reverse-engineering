package top.yukonga.miuix.kmp.extra;

import androidx.compose.runtime.InterfaceC2232;
import androidx.compose.runtime.InterfaceC2233;
import androidx.navigationevent.compose.AbstractC3270;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.InterfaceC6039;
import p068.InterfaceC7383;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$BottomSheetContentLayout$4$3$1", m556f = "BottomSheetContentLayout.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class BottomSheetContentLayoutKt$BottomSheetContentLayout$4$3$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ boolean $allowDismiss;
    final /* synthetic */ InterfaceC2232 $dimAlpha;
    final /* synthetic */ InterfaceC6039 $dragSnapChannel;
    final /* synthetic */ AbstractC3270 $navigationEventState;
    final /* synthetic */ InterfaceC2233 $sheetHeightPx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetContentLayoutKt$BottomSheetContentLayout$4$3$1(AbstractC3270 abstractC3270, InterfaceC2233 interfaceC2233, boolean z, InterfaceC6039 interfaceC6039, InterfaceC2232 interfaceC2232, InterfaceC5189<? super BottomSheetContentLayoutKt$BottomSheetContentLayout$4$3$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$navigationEventState = abstractC3270;
        this.$sheetHeightPx = interfaceC2233;
        this.$allowDismiss = z;
        this.$dragSnapChannel = interfaceC6039;
        this.$dimAlpha = interfaceC2232;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new BottomSheetContentLayoutKt$BottomSheetContentLayout$4$3$1(this.$navigationEventState, this.$sheetHeightPx, this.$allowDismiss, this.$dragSnapChannel, this.$dimAlpha, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((BottomSheetContentLayoutKt$BottomSheetContentLayout$4$3$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC6017.m10769(obj);
        this.$navigationEventState.getClass();
        throw null;
    }
}
