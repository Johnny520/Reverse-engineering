package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.AbstractC4245;
import io.ktor.utils.io.InterfaceC4246;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.utils.io.jvm.javaio.BlockingKt$toOutputStream$1$write$2", f = "Blocking.kt", l = {59}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class BlockingKt$toOutputStream$1$write$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ byte[] $b;
    final /* synthetic */ int $len;
    final /* synthetic */ int $off;
    final /* synthetic */ InterfaceC4246 $this_toOutputStream;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockingKt$toOutputStream$1$write$2(InterfaceC4246 interfaceC4246, byte[] bArr, int i, int i2, InterfaceC4356<? super BlockingKt$toOutputStream$1$write$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_toOutputStream = interfaceC4246;
        this.$b = bArr;
        this.$off = i;
        this.$len = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new BlockingKt$toOutputStream$1$write$2(this.$this_toOutputStream, this.$b, this.$off, this.$len, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((BlockingKt$toOutputStream$1$write$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC4246 interfaceC4246 = this.$this_toOutputStream;
            byte[] bArr = this.$b;
            int i2 = this.$off;
            int i3 = this.$len + i2;
            this.label = 1;
            if (AbstractC4245.m8699(interfaceC4246, bArr, i2, i3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
