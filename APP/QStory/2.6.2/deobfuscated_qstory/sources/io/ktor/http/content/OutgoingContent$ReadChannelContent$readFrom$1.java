package io.ktor.http.content;

import io.ktor.utils.io.C4225;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p048.AbstractC6517;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1", f = "OutgoingContent.kt", l = {93, 95}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class OutgoingContent$ReadChannelContent$readFrom$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ AbstractC6517 $range;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AbstractC3993 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutgoingContent$ReadChannelContent$readFrom$1(AbstractC3993 abstractC3993, AbstractC6517 abstractC6517, InterfaceC4356<? super OutgoingContent$ReadChannelContent$readFrom$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = abstractC3993;
        this.$range = abstractC6517;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        OutgoingContent$ReadChannelContent$readFrom$1 outgoingContent$ReadChannelContent$readFrom$1 = new OutgoingContent$ReadChannelContent$readFrom$1(this.this$0, this.$range, interfaceC4356);
        outgoingContent$ReadChannelContent$readFrom$1.L$0 = obj;
        return outgoingContent$ReadChannelContent$readFrom$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C4225 c4225, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((OutgoingContent$ReadChannelContent$readFrom$1) create(c4225, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (io.ktor.utils.io.AbstractC4243.m8673(r1, r10, (0 - 0) + 1, r9) == r0) goto L16;
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
            kotlin.AbstractC5184.m10206(r10)
            goto L5d
        L13:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r9)
            return r4
        L19:
            java.lang.Object r1 = r9.L$1
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r1 = (io.ktor.utils.io.InterfaceC4251) r1
            java.lang.Object r6 = r9.L$0
            io.ktor.utils.io.飘花落叶言子世楪兰苏哲 r6 = (io.ktor.utils.io.C4225) r6
            kotlin.AbstractC5184.m10206(r10)
            goto L45
        L25:
            kotlin.AbstractC5184.m10206(r10)
            java.lang.Object r10 = r9.L$0
            io.ktor.utils.io.飘花落叶言子世楪兰苏哲 r10 = (io.ktor.utils.io.C4225) r10
            io.ktor.http.content.飘花落叶言子楪苏兰世哲 r1 = r9.this$0
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r1 = r1.mo8296()
            飘花落叶言世子兰楪苏哲.飘花落叶言子楪苏世兰哲 r7 = r9.$range
            r7.getClass()
            r9.L$0 = r10
            r9.L$1 = r1
            r9.label = r6
            java.lang.Object r6 = io.ktor.utils.io.AbstractC4243.m8691(r1, r2, r9)
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
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r10 = r6.f12722
            r9.L$0 = r4
            r9.L$1 = r4
            r9.label = r5
            java.lang.Object r9 = io.ktor.utils.io.AbstractC4243.m8673(r1, r10, r2, r9)
            if (r9 != r0) goto L5d
        L5c:
            return r0
        L5d:
            kotlin.飘花落叶言子楪兰苏哲世 r9 = kotlin.C5175.f14739
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
