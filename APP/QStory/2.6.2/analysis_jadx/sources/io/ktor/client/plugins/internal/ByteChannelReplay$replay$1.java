package io.ktor.client.plugins.internal;

import io.ktor.utils.io.AbstractC4245;
import io.ktor.utils.io.C4225;
import io.ktor.utils.io.C4244;
import io.ktor.utils.io.InterfaceC4246;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.internal.ByteChannelReplay$replay$1", f = "ByteChannelReplay.kt", l = {33, 34}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class ByteChannelReplay$replay$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ Ref$ObjectRef<AbstractC3898> $copyTask;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelReplay$replay$1(Ref$ObjectRef<AbstractC3898> ref$ObjectRef, InterfaceC4356<? super ByteChannelReplay$replay$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$copyTask = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        ByteChannelReplay$replay$1 byteChannelReplay$replay$1 = new ByteChannelReplay$replay$1(this.$copyTask, interfaceC4356);
        byteChannelReplay$replay$1.L$0 = obj;
        return byteChannelReplay$replay$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C4225 c4225, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ByteChannelReplay$replay$1) create(c4225, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C4225 c4225 = (C4225) this.L$0;
            this.$copyTask.element.getClass();
            this.L$0 = c4225;
            this.label = 1;
            AbstractC4394.m8918("writerJob");
            throw null;
        }
        if (i == 1) {
            C4225 c42252 = (C4225) this.L$0;
            AbstractC5184.m10206(obj);
            byte[] bArr = (byte[]) obj;
            InterfaceC4246 interfaceC4246 = c42252.f12722;
            this.L$0 = null;
            this.label = 2;
            C4244 c4244 = AbstractC4245.f12750;
            if (AbstractC4245.m8699(interfaceC4246, bArr, 0, bArr.length, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 2) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
