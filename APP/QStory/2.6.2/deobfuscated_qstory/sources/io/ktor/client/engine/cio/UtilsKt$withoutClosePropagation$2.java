package io.ktor.client.engine.cio;

import io.ktor.utils.io.C4228;
import io.ktor.utils.io.InterfaceC4246;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.engine.cio.UtilsKt$withoutClosePropagation$2", f = "utils.kt", l = {290, 291}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪苏兰哲;)V"}, k = 3, mv = {2, 0, 0})
final class UtilsKt$withoutClosePropagation$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC4246 $this_withoutClosePropagation;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$withoutClosePropagation$2(InterfaceC4246 interfaceC4246, InterfaceC4356<? super UtilsKt$withoutClosePropagation$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_withoutClosePropagation = interfaceC4246;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        UtilsKt$withoutClosePropagation$2 utilsKt$withoutClosePropagation$2 = new UtilsKt$withoutClosePropagation$2(this.$this_withoutClosePropagation, interfaceC4356);
        utilsKt$withoutClosePropagation$2.L$0 = obj;
        return utilsKt$withoutClosePropagation$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C4228 c4228, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((UtilsKt$withoutClosePropagation$2) create(c4228, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (((io.ktor.utils.io.C4248) r6).m8710(r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            kotlin.AbstractC5184.m10206(r6)
            goto L41
        L10:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            r5 = 0
            return r5
        L17:
            kotlin.AbstractC5184.m10206(r6)
            goto L34
        L1b:
            kotlin.AbstractC5184.m10206(r6)
            java.lang.Object r6 = r5.L$0
            io.ktor.utils.io.飘花落叶言子世楪苏兰哲 r6 = (io.ktor.utils.io.C4228) r6
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r6 = r6.f12727
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r1 = r5.$this_withoutClosePropagation
            r5.label = r3
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r6 = io.ktor.utils.io.AbstractC4243.m8673(r6, r1, r3, r5)
            if (r6 != r0) goto L34
            goto L40
        L34:
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r6 = r5.$this_withoutClosePropagation
            r5.label = r2
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r6 = (io.ktor.utils.io.C4248) r6
            java.lang.Object r5 = r6.m8710(r5)
            if (r5 != r0) goto L41
        L40:
            return r0
        L41:
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5175.f14739
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.UtilsKt$withoutClosePropagation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
