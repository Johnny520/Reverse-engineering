package top.yukonga.miuix.kmp.utils;

import androidx.compose.animation.core.C0302;
import androidx.compose.foundation.layout.InterfaceC0608;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.platform.InterfaceC1871;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p205.InterfaceC7895;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.utils.MiuixPopupUtils$Companion$DialogEntry$1$1", f = "MiuixPopupUtils.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class MiuixPopupUtils$Companion$DialogEntry$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC7895 $density;
    final /* synthetic */ AbstractC6065 $dialogState;
    final /* synthetic */ InterfaceC0608 $imeInsets;
    final /* synthetic */ InterfaceC1871 $keyboardController;
    final /* synthetic */ InterfaceC1395 $lastTarget$delegate;
    final /* synthetic */ InterfaceC1395 $pendingOpen$delegate;
    final /* synthetic */ C0302 $visibleState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiuixPopupUtils$Companion$DialogEntry$1$1(AbstractC6065 abstractC6065, C0302 c0302, InterfaceC0608 interfaceC0608, InterfaceC7895 interfaceC7895, InterfaceC1871 interfaceC1871, InterfaceC1395 interfaceC1395, InterfaceC1395 interfaceC13952, InterfaceC4356<? super MiuixPopupUtils$Companion$DialogEntry$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$visibleState = c0302;
        this.$imeInsets = interfaceC0608;
        this.$density = interfaceC7895;
        this.$keyboardController = interfaceC1871;
        this.$lastTarget$delegate = interfaceC1395;
        this.$pendingOpen$delegate = interfaceC13952;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new MiuixPopupUtils$Companion$DialogEntry$1$1(null, this.$visibleState, this.$imeInsets, this.$density, this.$keyboardController, this.$lastTarget$delegate, this.$pendingOpen$delegate, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((MiuixPopupUtils$Companion$DialogEntry$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5184.m10206(obj);
        throw null;
    }
}
