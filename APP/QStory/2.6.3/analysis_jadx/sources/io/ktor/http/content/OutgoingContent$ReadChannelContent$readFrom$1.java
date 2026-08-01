package io.ktor.http.content;

import io.ktor.utils.io.C4226;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p048.AbstractC6518;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1", f = "OutgoingContent.kt", l = {93, 95}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class OutgoingContent$ReadChannelContent$readFrom$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ AbstractC6518 $range;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AbstractC3994 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutgoingContent$ReadChannelContent$readFrom$1(AbstractC3994 abstractC3994, AbstractC6518 abstractC6518, InterfaceC4357<? super OutgoingContent$ReadChannelContent$readFrom$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = abstractC3994;
        this.$range = abstractC6518;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        OutgoingContent$ReadChannelContent$readFrom$1 outgoingContent$ReadChannelContent$readFrom$1 = new OutgoingContent$ReadChannelContent$readFrom$1(this.this$0, this.$range, interfaceC4357);
        outgoingContent$ReadChannelContent$readFrom$1.L$0 = obj;
        return outgoingContent$ReadChannelContent$readFrom$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C4226 c4226, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((OutgoingContent$ReadChannelContent$readFrom$1) create(c4226, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (io.ktor.utils.io.AbstractC4244.m8663(r1, r10, (0 - 0) + 1, r9) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 0
            r4 = 0
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L25
            if (r1 == r6) goto L19
            if (r1 != r5) goto L13
            kotlin.AbstractC5185.m10210(r10)
            goto L5d
        L13:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r9)
            return r4
        L19:
            java.lang.Object r1 = r9.L$1
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r1 = (io.ktor.utils.io.InterfaceC4252) r1
            java.lang.Object r6 = r9.L$0
            io.ktor.utils.io.飘花落叶言子世楪兰苏哲 r6 = (io.ktor.utils.io.C4226) r6
            kotlin.AbstractC5185.m10210(r10)
            goto L45
        L25:
            kotlin.AbstractC5185.m10210(r10)
            java.lang.Object r10 = r9.L$0
            io.ktor.utils.io.飘花落叶言子世楪兰苏哲 r10 = (io.ktor.utils.io.C4226) r10
            io.ktor.http.content.飘花落叶言子楪苏兰世哲 r1 = r9.this$0
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r1 = r1.mo8286()
            飘花落叶言世子兰楪苏哲.飘花落叶言子楪苏世兰哲 r7 = r9.$range
            r7.getClass()
            r9.L$0 = r10
            r9.L$1 = r1
            r9.label = r6
            java.lang.Object r6 = io.ktor.utils.io.AbstractC4244.m8681(r1, r2, r9)
            if (r6 != r0) goto L44
            goto L5c
        L44:
            r6 = r10
        L45:
            飘花落叶言世子兰楪苏哲.飘花落叶言子楪苏世兰哲 r10 = r9.$range
            r10.getClass()
            long r2 = r2 - r2
            r7 = 1
            long r2 = r2 + r7
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r10 = r6.f12726
            r9.L$0 = r4
            r9.L$1 = r4
            r9.label = r5
            java.lang.Object r9 = io.ktor.utils.io.AbstractC4244.m8663(r1, r10, r2, r9)
            if (r9 != r0) goto L5d
        L5c:
            return r0
        L5d:
            kotlin.飘花落叶言子楪兰苏哲世 r9 = kotlin.C5176.f14739
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
