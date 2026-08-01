package io.ktor.client.plugins.internal;

import io.ktor.utils.io.C4226;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.internal.ByteChannelReplay$CopyFromSourceTask$receiveBody$1", f = "ByteChannelReplay.kt", l = {59, 60, 64, 65}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class ByteChannelReplay$CopyFromSourceTask$receiveBody$1 extends SuspendLambda implements InterfaceC6554 {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AbstractC3898 this$0;
    final /* synthetic */ AbstractC3899 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelReplay$CopyFromSourceTask$receiveBody$1(AbstractC3898 abstractC3898, AbstractC3899 abstractC3899, InterfaceC4357<? super ByteChannelReplay$CopyFromSourceTask$receiveBody$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = abstractC3898;
        this.this$1 = abstractC3899;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ByteChannelReplay$CopyFromSourceTask$receiveBody$1 byteChannelReplay$CopyFromSourceTask$receiveBody$1 = new ByteChannelReplay$CopyFromSourceTask$receiveBody$1(this.this$0, this.this$1, interfaceC4357);
        byteChannelReplay$CopyFromSourceTask$receiveBody$1.L$0 = obj;
        return byteChannelReplay$CopyFromSourceTask$receiveBody$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C4226 c4226, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ByteChannelReplay$CopyFromSourceTask$receiveBody$1) create(c4226, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (((io.ktor.utils.io.C4249) r4).m8700(r8) == r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 0
            if (r1 == 0) goto L92
            r3 = 1
            if (r1 == r3) goto L85
            r3 = 4
            r4 = 3
            r5 = 2
            if (r1 == r5) goto L40
            if (r1 == r4) goto L29
            if (r1 == r3) goto L19
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r8)
            return r2
        L19:
            java.lang.Object r0 = r8.L$2
            kotlinx.io.飘花落叶言子楪苏兰世哲 r0 = (kotlinx.io.InterfaceC5481) r0
            java.lang.Object r1 = r8.L$1
            kotlinx.io.飘花落叶言子楪苏哲兰世 r1 = (kotlinx.io.InterfaceC5484) r1
            java.lang.Object r3 = r8.L$0
            io.ktor.utils.io.飘花落叶言子世楪兰苏哲 r3 = (io.ktor.utils.io.C4226) r3
            kotlin.AbstractC5185.m10210(r9)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La0
            goto L80
        L29:
            java.lang.Object r1 = r8.L$2
            kotlinx.io.飘花落叶言子楪苏兰世哲 r1 = (kotlinx.io.InterfaceC5481) r1
            java.lang.Object r4 = r8.L$1
            kotlinx.io.飘花落叶言子楪苏哲兰世 r4 = (kotlinx.io.InterfaceC5484) r4
            java.lang.Object r5 = r8.L$0
            io.ktor.utils.io.飘花落叶言子世楪兰苏哲 r5 = (io.ktor.utils.io.C4226) r5
            kotlin.AbstractC5185.m10210(r9)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            r9 = r1
            r1 = r4
            goto L6c
        L3b:
            r1 = r4
            goto La0
        L3d:
            r0 = r1
            r1 = r4
            goto L80
        L40:
            java.lang.Object r1 = r8.L$1
            kotlinx.io.飘花落叶言子楪苏哲兰世 r1 = (kotlinx.io.InterfaceC5484) r1
            java.lang.Object r5 = r8.L$0
            io.ktor.utils.io.飘花落叶言子世楪兰苏哲 r5 = (io.ktor.utils.io.C4226) r5
            kotlin.AbstractC5185.m10210(r9)     // Catch: java.lang.Throwable -> La0
            kotlinx.io.飘花落叶言子楪苏兰世哲 r9 = (kotlinx.io.InterfaceC5481) r9     // Catch: java.lang.Throwable -> La0
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r6 = r5.f12726     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> La0
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r6 = (io.ktor.utils.io.C4249) r6     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> La0
            boolean r6 = r6.m8703()     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> La0
            if (r6 != 0) goto L81
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r6 = r5.f12726     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> La0
            kotlinx.io.飘花落叶言子楪世兰哲苏 r7 = r9.peek()     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> La0
            r8.L$0 = r5     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> La0
            r8.L$1 = r1     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> La0
            r8.L$2 = r9     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> La0
            r8.label = r4     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> La0
            java.lang.Object r4 = io.ktor.utils.io.AbstractC4246.m8687(r6, r7, r8)     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> La0
            if (r4 != r0) goto L6c
            goto L7e
        L6c:
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r4 = r5.f12726     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> La0
            r8.L$0 = r5     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> La0
            r8.L$1 = r1     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> La0
            r8.L$2 = r9     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> La0
            r8.label = r3     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> La0
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r4 = (io.ktor.utils.io.C4249) r4     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> La0
            java.lang.Object r3 = r4.m8700(r8)     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> La0
            if (r3 != r0) goto L7f
        L7e:
            return r0
        L7f:
            r0 = r9
        L80:
            r9 = r0
        L81:
            p058.AbstractC6855.m12085(r1, r9)     // Catch: java.lang.Throwable -> La0
            goto L9f
        L85:
            java.lang.Object r0 = r8.L$1
            r1 = r0
            kotlinx.io.飘花落叶言子楪苏哲兰世 r1 = (kotlinx.io.InterfaceC5484) r1
            java.lang.Object r0 = r8.L$0
            io.ktor.utils.io.飘花落叶言子世楪兰苏哲 r0 = (io.ktor.utils.io.C4226) r0
            kotlin.AbstractC5185.m10210(r9)     // Catch: java.lang.Throwable -> La0
            throw r2     // Catch: java.lang.Throwable -> La0
        L92:
            kotlin.AbstractC5185.m10210(r9)
            java.lang.Object r9 = r8.L$0
            io.ktor.utils.io.飘花落叶言子世楪兰苏哲 r9 = (io.ktor.utils.io.C4226) r9
            kotlinx.io.飘花落叶言子楪世苏哲兰 r9 = new kotlinx.io.飘花落叶言子楪世苏哲兰
            r9.<init>()
            r1 = r9
        L9f:
            throw r2     // Catch: java.lang.Throwable -> La0
        La0:
            r1.getClass()
            io.ktor.client.plugins.internal.飘花落叶言子楪世苏哲兰 r8 = r8.this$1
            r8.getClass()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.internal.ByteChannelReplay$CopyFromSourceTask$receiveBody$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
