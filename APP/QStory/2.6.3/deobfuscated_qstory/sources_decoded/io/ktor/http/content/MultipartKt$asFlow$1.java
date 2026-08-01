package io.ktor.http.content;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC5318;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.http.content.MultipartKt$asFlow$1", f = "Multipart.kt", l = {112, 113}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "Lio/ktor/http/content/飘花落叶言子楪哲兰苏世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;)V"}, k = 3, mv = {2, 0, 0})
final class MultipartKt$asFlow$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC3977 $this_asFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipartKt$asFlow$1(InterfaceC3977 interfaceC3977, InterfaceC4357<? super MultipartKt$asFlow$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_asFlow = interfaceC3977;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        MultipartKt$asFlow$1 multipartKt$asFlow$1 = new MultipartKt$asFlow$1(this.$this_asFlow, interfaceC4357);
        multipartKt$asFlow$1.L$0 = obj;
        return multipartKt$asFlow$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5318 interfaceC5318, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((MultipartKt$asFlow$1) create(interfaceC5318, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x004c -> B:7:0x0013). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L15
            java.lang.Object r1 = r5.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r1 = (kotlinx.coroutines.flow.InterfaceC5318) r1
            kotlin.AbstractC5185.m10210(r6)
        L13:
            r6 = r1
            goto L2b
        L15:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            r5 = 0
            return r5
        L1c:
            java.lang.Object r1 = r5.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r1 = (kotlinx.coroutines.flow.InterfaceC5318) r1
            kotlin.AbstractC5185.m10210(r6)
            goto L3d
        L24:
            kotlin.AbstractC5185.m10210(r6)
            java.lang.Object r6 = r5.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r6 = (kotlinx.coroutines.flow.InterfaceC5318) r6
        L2b:
            io.ktor.http.content.飘花落叶言子楪世兰苏哲 r1 = r5.$this_asFlow
            r5.L$0 = r6
            r5.label = r3
            io.ktor.http.cio.飘花落叶言子楪世哲兰苏 r1 = (io.ktor.http.cio.C3959) r1
            java.lang.Object r1 = r1.m8349(r5)
            if (r1 != r0) goto L3a
            goto L4e
        L3a:
            r4 = r1
            r1 = r6
            r6 = r4
        L3d:
            io.ktor.http.content.飘花落叶言子楪哲兰苏世 r6 = (io.ktor.http.content.AbstractC3989) r6
            if (r6 != 0) goto L44
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5176.f14739
            return r5
        L44:
            r5.L$0 = r1
            r5.label = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L13
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.content.MultipartKt$asFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
