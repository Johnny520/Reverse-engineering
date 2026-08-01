package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", l = {118}, m = "readFully")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ByteReadChannelOperations_jvmKt$readFully$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperations_jvmKt$readFully$1(InterfaceC4357<? super ByteReadChannelOperations_jvmKt$readFully$1> interfaceC4357) {
        super(interfaceC4357);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0032 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:17:0x0043). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.io.EOFException {
        /*
            r4 = this;
            r4.result = r5
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r4.label = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L24
            if (r0 != r3) goto L1e
            java.lang.Object r0 = r4.L$1
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.lang.Object r2 = r4.L$0
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r2 = (io.ktor.utils.io.InterfaceC4252) r2
            kotlin.AbstractC5185.m10210(r5)
            goto L43
        L1e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r4)
            return r2
        L24:
            kotlin.AbstractC5185.m10210(r5)
            r5 = r2
        L28:
            boolean r0 = r2.hasRemaining()
            if (r0 == 0) goto L4d
            int r0 = io.ktor.utils.io.AbstractC4244.m8683(r5)
            if (r0 != 0) goto L45
            r4.L$0 = r5
            r4.L$1 = r2
            r4.label = r3
            java.lang.Object r0 = r5.mo8642(r3, r4)
            if (r0 != r1) goto L41
            return r1
        L41:
            r0 = r2
            r2 = r5
        L43:
            r5 = r2
            r2 = r0
        L45:
            kotlinx.io.飘花落叶言子楪苏兰世哲 r0 = r5.mo8643()
            kotlinx.io.AbstractC5478.m10627(r0, r2)
            goto L28
        L4d:
            kotlin.飘花落叶言子楪兰苏哲世 r4 = kotlin.C5176.f14739
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readFully$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
