package top.yukonga.miuix.kmp.utils;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.utils.MiuixPopupUtils$Companion$MiuixPopupHost$1$1", f = "MiuixPopupUtils.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class MiuixPopupUtils$Companion$MiuixPopupHost$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ SnapshotStateList<AbstractC6071> $dialogStates;
    final /* synthetic */ SnapshotStateList<AbstractC6075> $popupStates;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiuixPopupUtils$Companion$MiuixPopupHost$1$1(SnapshotStateList<AbstractC6071> snapshotStateList, SnapshotStateList<AbstractC6075> snapshotStateList2, InterfaceC4357<? super MiuixPopupUtils$Companion$MiuixPopupHost$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$dialogStates = snapshotStateList;
        this.$popupStates = snapshotStateList2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new MiuixPopupUtils$Companion$MiuixPopupHost$1$1(this.$dialogStates, this.$popupStates, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((MiuixPopupUtils$Companion$MiuixPopupHost$1$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        if (this.$dialogStates.isEmpty() && this.$popupStates.isEmpty()) {
            C6072 c6072 = AbstractC6076.f16609;
        }
        return C5176.f14739;
    }
}
