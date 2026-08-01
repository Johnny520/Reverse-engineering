package io.ktor.utils.io.jvm.nio;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt", f = "WriteSuspendSession.kt", l = {43, 45, 45}, m = "writeSuspendSession")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class WriteSuspendSessionKt$writeSuspendSession$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public WriteSuspendSessionKt$writeSuspendSession$1(InterfaceC4357<? super WriteSuspendSessionKt$writeSuspendSession$1> interfaceC4357) {
        super(interfaceC4357);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (((io.ktor.utils.io.C4249) r1).m8700(r6) == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            r6.result = r7
            int r7 = r6.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 | r0
            r6.label = r7
            r1 = r7 & r0
            if (r1 == 0) goto L11
            int r7 = r7 - r0
            r6.label = r7
            goto L17
        L11:
            io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeSuspendSession$1 r7 = new io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeSuspendSession$1
            r7.<init>(r6)
            r6 = r7
        L17:
            java.lang.Object r7 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 0
            r3 = 3
            if (r1 == 0) goto L55
            r4 = 2
            r5 = 1
            if (r1 == r5) goto L3b
            if (r1 == r4) goto L37
            if (r1 == r3) goto L2f
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            return r2
        L2f:
            java.lang.Object r6 = r6.L$0
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.AbstractC5185.m10210(r7)
            goto L70
        L37:
            kotlin.AbstractC5185.m10210(r7)
            goto L4f
        L3b:
            java.lang.Object r1 = r6.L$0
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r1 = (io.ktor.utils.io.InterfaceC4247) r1
            kotlin.AbstractC5185.m10210(r7)     // Catch: java.lang.Throwable -> L52
            r6.L$0 = r2
            r6.label = r4
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r1 = (io.ktor.utils.io.C4249) r1
            java.lang.Object r6 = r1.m8700(r6)
            if (r6 != r0) goto L4f
            goto L6e
        L4f:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
            return r6
        L52:
            r7 = move-exception
            r2 = r1
            goto L62
        L55:
            kotlin.AbstractC5185.m10210(r7)
            r2.getClass()     // Catch: java.lang.Throwable -> L61
            r7 = 8192(0x2000, float:1.148E-41)
            java.nio.ByteBuffer.allocate(r7)     // Catch: java.lang.Throwable -> L61
            throw r2     // Catch: java.lang.Throwable -> L61
        L61:
            r7 = move-exception
        L62:
            r6.L$0 = r7
            r6.label = r3
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r2 = (io.ktor.utils.io.C4249) r2
            java.lang.Object r6 = r2.m8700(r6)
            if (r6 != r0) goto L6f
        L6e:
            return r0
        L6f:
            r6 = r7
        L70:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeSuspendSession$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
