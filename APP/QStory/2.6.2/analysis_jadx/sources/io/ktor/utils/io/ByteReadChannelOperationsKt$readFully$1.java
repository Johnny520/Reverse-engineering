package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {468}, m = "readFully")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ByteReadChannelOperationsKt$readFully$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperationsKt$readFully$1(InterfaceC4356<? super ByteReadChannelOperationsKt$readFully$1> interfaceC4356) {
        super(interfaceC4356);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005a -> B:24:0x006f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006d -> B:23:0x006e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.io.EOFException {
        /*
            r9 = this;
            r9.result = r10
            int r10 = r9.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r10 | r0
            r9.label = r10
            boolean r10 = r9 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1
            if (r10 == 0) goto L17
            int r10 = r9.label
            r1 = r10 & r0
            if (r1 == 0) goto L17
            int r10 = r10 - r0
            r9.label = r10
            goto L1d
        L17:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1 r10 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1
            r10.<init>(r9)
            r9 = r10
        L1d:
            java.lang.Object r10 = r9.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 0
            java.lang.String r3 = "Channel is already closed"
            r4 = 1
            if (r1 == 0) goto L42
            if (r1 != r4) goto L3b
            int r1 = r9.I$1
            int r2 = r9.I$0
            java.lang.Object r5 = r9.L$1
            byte[] r5 = (byte[]) r5
            java.lang.Object r6 = r9.L$0
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r6 = (io.ktor.utils.io.InterfaceC4251) r6
            kotlin.AbstractC5184.m10206(r10)
            goto L6e
        L3b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r9)
            r0 = r2
            goto L96
        L42:
            kotlin.AbstractC5184.m10206(r10)
            boolean r10 = r2.mo8651()
            if (r10 != 0) goto L97
            r10 = 0
            r1 = r10
            r5 = r2
            r2 = r1
            r10 = r5
        L50:
            if (r1 >= r2) goto L94
            kotlinx.io.飘花落叶言子楪苏兰世哲 r6 = r10.mo8653()
            boolean r6 = r6.mo10601()
            if (r6 == 0) goto L6f
            r9.L$0 = r10
            r9.L$1 = r5
            r9.I$0 = r2
            r9.I$1 = r1
            r9.label = r4
            java.lang.Object r6 = r10.mo8652(r4, r9)
            if (r6 != r0) goto L6d
            goto L96
        L6d:
            r6 = r10
        L6e:
            r10 = r6
        L6f:
            boolean r6 = r10.mo8651()
            if (r6 != 0) goto L8e
            int r6 = r2 - r1
            kotlinx.io.飘花落叶言子楪苏兰世哲 r7 = r10.mo8653()
            long r7 = p058.AbstractC6854.m12051(r7)
            int r7 = (int) r7
            int r6 = java.lang.Math.min(r6, r7)
            kotlinx.io.飘花落叶言子楪苏兰世哲 r7 = r10.mo8653()
            int r6 = r6 + r1
            kotlinx.io.AbstractC5477.m10619(r7, r5, r1, r6)
            r1 = r6
            goto L50
        L8e:
            java.io.EOFException r9 = new java.io.EOFException
            r9.<init>(r3)
            throw r9
        L94:
            kotlin.飘花落叶言子楪兰苏哲世 r0 = kotlin.C5175.f14739
        L96:
            return r0
        L97:
            java.io.EOFException r9 = new java.io.EOFException
            r9.<init>(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
