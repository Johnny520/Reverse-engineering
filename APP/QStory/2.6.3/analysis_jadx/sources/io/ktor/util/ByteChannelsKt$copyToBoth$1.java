package io.ktor.util;

import io.ktor.utils.io.InterfaceC4247;
import io.ktor.utils.io.InterfaceC4252;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.util.ByteChannelsKt$copyToBoth$1", f = "ByteChannels.kt", l = {62, 64, 65, 79, 80, 79, 80, 79, 80}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class ByteChannelsKt$copyToBoth$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC4247 $first;
    final /* synthetic */ InterfaceC4247 $second;
    final /* synthetic */ InterfaceC4252 $this_copyToBoth;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelsKt$copyToBoth$1(InterfaceC4252 interfaceC4252, InterfaceC4247 interfaceC4247, InterfaceC4247 interfaceC42472, InterfaceC4357<? super ByteChannelsKt$copyToBoth$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_copyToBoth = interfaceC4252;
        this.$first = interfaceC4247;
        this.$second = interfaceC42472;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new ByteChannelsKt$copyToBoth$1(this.$this_copyToBoth, this.$first, this.$second, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ByteChannelsKt$copyToBoth$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x012c, code lost:
    
        if (((io.ktor.utils.io.C4249) r9).m8704(r8) != r0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015d, code lost:
    
        if (((io.ktor.utils.io.C4249) r9).m8704(r8) != r0) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a A[Catch: all -> 0x006c, TryCatch #5 {all -> 0x006c, blocks: (B:46:0x00f5, B:26:0x0072, B:28:0x007a, B:30:0x0084, B:32:0x008e, B:35:0x00a7, B:51:0x00fd, B:52:0x0100, B:53:0x0101, B:61:0x012f, B:21:0x0068, B:36:0x00b0, B:45:0x00ec, B:49:0x00fb), top: B:90:0x0068, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f A[Catch: all -> 0x006c, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x006c, blocks: (B:46:0x00f5, B:26:0x0072, B:28:0x007a, B:30:0x0084, B:32:0x008e, B:35:0x00a7, B:51:0x00fd, B:52:0x0100, B:53:0x0101, B:61:0x012f, B:21:0x0068, B:36:0x00b0, B:45:0x00ec, B:49:0x00fb), top: B:90:0x0068, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ea -> B:46:0x00f5). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.ByteChannelsKt$copyToBoth$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
