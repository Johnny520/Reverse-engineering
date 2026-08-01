package io.ktor.http.cio;

import io.ktor.utils.io.C4239;
import java.nio.ByteBuffer;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.http.cio.MultipartKt$trySkipDelimiterSuspend$2", f = "Multipart.kt", l = {414, 414}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子楪兰哲苏世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子楪兰哲苏世;)V"}, k = 3, mv = {2, 0, 0})
final class MultipartKt$trySkipDelimiterSuspend$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ ByteBuffer $delimiter;
    final /* synthetic */ Ref$BooleanRef $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipartKt$trySkipDelimiterSuspend$2(ByteBuffer byteBuffer, Ref$BooleanRef ref$BooleanRef, InterfaceC4356<? super MultipartKt$trySkipDelimiterSuspend$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$delimiter = byteBuffer;
        this.$result = ref$BooleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        MultipartKt$trySkipDelimiterSuspend$2 multipartKt$trySkipDelimiterSuspend$2 = new MultipartKt$trySkipDelimiterSuspend$2(this.$delimiter, this.$result, interfaceC4356);
        multipartKt$trySkipDelimiterSuspend$2.L$0 = obj;
        return multipartKt$trySkipDelimiterSuspend$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C4239 c4239, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((MultipartKt$trySkipDelimiterSuspend$2) create(c4239, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.io.IOException {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 0
            kotlin.飘花落叶言子楪兰苏哲世 r3 = kotlin.C5175.f14739
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L17
            java.lang.Object r0 = r7.L$0
            io.ktor.utils.io.飘花落叶言子楪兰哲苏世 r0 = (io.ktor.utils.io.C4239) r0
            kotlin.AbstractC5184.m10206(r8)
            goto L54
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r7)
            return r2
        L1d:
            java.lang.Object r1 = r7.L$0
            io.ktor.utils.io.飘花落叶言子楪兰哲苏世 r1 = (io.ktor.utils.io.C4239) r1
            kotlin.AbstractC5184.m10206(r8)
            goto L40
        L25:
            kotlin.AbstractC5184.m10206(r8)
            java.lang.Object r8 = r7.L$0
            io.ktor.utils.io.飘花落叶言子楪兰哲苏世 r8 = (io.ktor.utils.io.C4239) r8
            java.nio.ByteBuffer r1 = r7.$delimiter
            int r1 = r1.remaining()
            r7.L$0 = r8
            r7.label = r5
            java.lang.Object r1 = r8.m8664(r1, r7)
            if (r1 != r0) goto L3d
            goto L52
        L3d:
            r6 = r1
            r1 = r8
            r8 = r6
        L40:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L63
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = r1.m8664(r5, r7)
            if (r8 != r0) goto L53
        L52:
            return r0
        L53:
            r0 = r1
        L54:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L62
            kotlin.jvm.internal.Ref$BooleanRef r7 = r7.$result
            r8 = 0
            r7.element = r8
            return r3
        L62:
            r1 = r0
        L63:
            java.nio.ByteBuffer r8 = r7.$delimiter
            int r8 = io.ktor.http.cio.AbstractC3968.m8373(r1, r8)
            java.nio.ByteBuffer r7 = r7.$delimiter
            int r7 = r7.remaining()
            if (r8 != r7) goto L72
            return r3
        L72:
            java.lang.String r7 = "Broken delimiter occurred"
            top.suzhelan.qstory.hook.item.C5919.m11246(r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.MultipartKt$trySkipDelimiterSuspend$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
