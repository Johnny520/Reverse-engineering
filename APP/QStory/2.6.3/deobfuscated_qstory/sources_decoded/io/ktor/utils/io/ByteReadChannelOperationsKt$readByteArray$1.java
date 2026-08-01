package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {189}, m = "readByteArray")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ByteReadChannelOperationsKt$readByteArray$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperationsKt$readByteArray$1(InterfaceC4357<? super ByteReadChannelOperationsKt$readByteArray$1> interfaceC4357) {
        super(interfaceC4357);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0051 -> B:15:0x0054). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            r8.result = r9
            int r0 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r8.label = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L2a
            if (r0 != r3) goto L24
            int r0 = r8.I$0
            java.lang.Object r2 = r8.L$2
            kotlinx.io.飘花落叶言子楪苏哲兰世 r2 = (kotlinx.io.InterfaceC5484) r2
            java.lang.Object r4 = r8.L$1
            kotlinx.io.飘花落叶言子楪世苏哲兰 r4 = (kotlinx.io.C5477) r4
            java.lang.Object r5 = r8.L$0
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r5 = (io.ktor.utils.io.InterfaceC4252) r5
            kotlin.AbstractC5185.m10210(r9)
            goto L54
        L24:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r8)
            return r2
        L2a:
            kotlin.AbstractC5185.m10210(r9)
            kotlinx.io.飘花落叶言子楪世苏哲兰 r9 = new kotlinx.io.飘花落叶言子楪世苏哲兰
            r9.<init>()
            r0 = 0
            r4 = r9
            r9 = r2
            r2 = r4
        L36:
            r5 = r2
            kotlinx.io.飘花落叶言子楪世苏哲兰 r5 = (kotlinx.io.C5477) r5
            long r5 = r5.f15142
            int r5 = (int) r5
            if (r5 >= r0) goto L5b
            int r5 = r0 - r5
            r8.L$0 = r9
            r8.L$1 = r4
            r8.L$2 = r2
            r8.I$0 = r0
            r8.label = r3
            java.lang.Object r5 = io.ktor.utils.io.AbstractC4244.m8670(r9, r5, r8)
            if (r5 != r1) goto L51
            return r1
        L51:
            r7 = r5
            r5 = r9
            r9 = r7
        L54:
            kotlinx.io.飘花落叶言子楪苏兰世哲 r9 = (kotlinx.io.InterfaceC5481) r9
            p058.AbstractC6855.m12085(r2, r9)
            r9 = r5
            goto L36
        L5b:
            byte[] r8 = kotlinx.io.AbstractC5478.m10631(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt$readByteArray$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
