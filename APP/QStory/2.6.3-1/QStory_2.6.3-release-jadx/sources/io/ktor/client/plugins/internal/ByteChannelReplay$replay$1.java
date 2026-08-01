package io.ktor.client.plugins.internal;

import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5058;
import io.ktor.utils.p007io.C5077;
import io.ktor.utils.p007io.InterfaceC5079;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$ObjectRef;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.internal.ByteChannelReplay$replay$1", m556f = "ByteChannelReplay.kt", m557l = {33, 34}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class ByteChannelReplay$replay$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ Ref$ObjectRef<AbstractC4731> $copyTask;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelReplay$replay$1(Ref$ObjectRef<AbstractC4731> ref$ObjectRef, InterfaceC5189<? super ByteChannelReplay$replay$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$copyTask = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ByteChannelReplay$replay$1 byteChannelReplay$replay$1 = new ByteChannelReplay$replay$1(this.$copyTask, interfaceC5189);
        byteChannelReplay$replay$1.L$0 = obj;
        return byteChannelReplay$replay$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C5058 c5058, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ByteChannelReplay$replay$1) create(c5058, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C5058 c5058 = (C5058) this.L$0;
            this.$copyTask.element.getClass();
            this.L$0 = c5058;
            this.label = 1;
            AbstractC5227.m9467("writerJob");
            throw null;
        }
        if (i == 1) {
            C5058 c50582 = (C5058) this.L$0;
            AbstractC6017.m10769(obj);
            byte[] bArr = (byte[]) obj;
            InterfaceC5079 interfaceC5079 = c50582.f13071;
            this.L$0 = null;
            this.label = 2;
            C5077 c5077 = AbstractC5078.f13099;
            if (AbstractC5078.m9248(interfaceC5079, bArr, 0, bArr.length, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
