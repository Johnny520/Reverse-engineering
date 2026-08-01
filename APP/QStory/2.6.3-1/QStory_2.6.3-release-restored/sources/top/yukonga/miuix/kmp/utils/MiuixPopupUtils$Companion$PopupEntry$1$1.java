package top.yukonga.miuix.kmp.utils;

import androidx.compose.animation.core.C1148;
import androidx.compose.runtime.InterfaceC2230;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.utils.MiuixPopupUtils$Companion$PopupEntry$1$1", m556f = "MiuixPopupUtils.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class MiuixPopupUtils$Companion$PopupEntry$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC2230 $lastTarget$delegate;
    final /* synthetic */ InterfaceC2230 $pendingOpen$delegate;
    final /* synthetic */ AbstractC6904 $popupState;
    final /* synthetic */ C1148 $visibleState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiuixPopupUtils$Companion$PopupEntry$1$1(AbstractC6904 abstractC6904, C1148 c1148, InterfaceC2230 interfaceC2230, InterfaceC2230 interfaceC22302, InterfaceC5189<? super MiuixPopupUtils$Companion$PopupEntry$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$visibleState = c1148;
        this.$lastTarget$delegate = interfaceC2230;
        this.$pendingOpen$delegate = interfaceC22302;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new MiuixPopupUtils$Companion$PopupEntry$1$1(null, this.$visibleState, this.$lastTarget$delegate, this.$pendingOpen$delegate, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((MiuixPopupUtils$Companion$PopupEntry$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC6017.m10769(obj);
        throw null;
    }
}
