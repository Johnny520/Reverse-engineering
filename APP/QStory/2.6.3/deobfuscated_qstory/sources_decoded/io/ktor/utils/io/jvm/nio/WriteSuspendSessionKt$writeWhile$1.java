package io.ktor.utils.io.jvm.nio;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt", f = "WriteSuspendSession.kt", l = {59}, m = "writeWhile")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
final class WriteSuspendSessionKt$writeWhile$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public WriteSuspendSessionKt$writeWhile$1(InterfaceC4357<? super WriteSuspendSessionKt$writeWhile$1> interfaceC4357) {
        super(interfaceC4357);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009e -> B:6:0x0021). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            r10.result = r11
            int r0 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r10.label = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L23
            java.lang.Object r0 = r10.L$2
            kotlin.jvm.internal.Ref$BooleanRef r0 = (kotlin.jvm.internal.Ref$BooleanRef) r0
            java.lang.Object r4 = r10.L$1
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r4 = (p052.InterfaceC6558) r4
            java.lang.Object r5 = r10.L$0
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r5 = (io.ktor.utils.io.InterfaceC4247) r5
            kotlin.AbstractC5185.m10210(r11)
        L21:
            r11 = r5
            goto L34
        L23:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r10)
            return r2
        L29:
            kotlin.AbstractC5185.m10210(r11)
            kotlin.jvm.internal.Ref$BooleanRef r11 = new kotlin.jvm.internal.Ref$BooleanRef
            r11.<init>()
            r0 = r11
            r11 = r2
            r4 = r11
        L34:
            boolean r5 = r0.element
            if (r5 != 0) goto Lb1
            r5 = r11
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r5 = (io.ktor.utils.io.C4249) r5
            kotlinx.io.飘花落叶言子楪世苏哲兰 r11 = r5.m8702()
            r11.getClass()
            kotlinx.io.飘花落叶言子楪苏世兰哲 r6 = r11.m10612(r3)
            byte[] r7 = r6.f15150
            int r8 = r6.f15148
            int r9 = r7.length
            int r9 = r9 - r8
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7, r8, r9)
            r7.getClass()
            java.lang.Object r9 = r4.invoke(r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r9 = r9 ^ r3
            r0.element = r9
            int r7 = r7.position()
            int r7 = r7 - r8
            if (r7 != r3) goto L73
            int r8 = r6.f15148
            int r8 = r8 + r7
            r6.f15148 = r8
            long r8 = r11.f15142
            long r6 = (long) r7
            long r8 = r8 + r6
            r11.f15142 = r8
            goto L92
        L73:
            if (r7 < 0) goto La1
            int r8 = r6.m10638()
            if (r7 > r8) goto La1
            if (r7 == 0) goto L89
            int r8 = r6.f15148
            int r8 = r8 + r7
            r6.f15148 = r8
            long r8 = r11.f15142
            long r6 = (long) r7
            long r8 = r8 + r6
            r11.f15142 = r8
            goto L92
        L89:
            boolean r6 = kotlinx.io.AbstractC5478.m10628(r6)
            if (r6 == 0) goto L92
            r11.m10609()
        L92:
            r10.L$0 = r5
            r10.L$1 = r4
            r10.L$2 = r0
            r10.label = r3
            java.lang.Object r11 = r5.m8700(r10)
            if (r11 != r1) goto L21
            return r1
        La1:
            java.lang.String r10 = "Invalid number of bytes written: "
            java.lang.String r11 = ". Should be in 0.."
            java.lang.StringBuilder r10 = androidx.activity.AbstractC0053.m150(r7, r10, r11)
            int r11 = r6.m10638()
            io.ktor.util.C4211.m8608(r10, r11)
            return r2
        Lb1:
            kotlin.飘花落叶言子楪兰苏哲世 r10 = kotlin.C5176.f14739
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeWhile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
