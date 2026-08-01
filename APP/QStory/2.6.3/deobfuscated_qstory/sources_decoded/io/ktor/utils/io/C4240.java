package io.ktor.utils.io;

import com.bumptech.glide.AbstractC3065;
import java.nio.ByteBuffer;
import kotlinx.io.AbstractC5478;
import kotlinx.io.C5472;
import kotlinx.io.InterfaceC5481;
import p058.AbstractC6855;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4240 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC4252 f12744;

    public C4240(InterfaceC4252 interfaceC4252) {
        interfaceC4252.getClass();
        this.f12744 = interfaceC4252;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ByteBuffer m8653(int i, int i2) throws Exception {
        InterfaceC4252 interfaceC4252 = this.f12744;
        if (AbstractC6855.m12079(interfaceC4252.mo8643()) < i2 + i) {
            return null;
        }
        InterfaceC5481 interfaceC5481Mo8643 = interfaceC4252.mo8643();
        interfaceC5481Mo8643.getClass();
        C5472 c5472Peek = interfaceC5481Mo8643.mo10603().peek();
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(AbstractC5478.m10629(c5472Peek, -1));
            AbstractC3065.m6836(c5472Peek, null);
            if (i > 0) {
                byteBufferWrap.position(byteBufferWrap.position() + i);
            }
            return byteBufferWrap;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8654(int r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.LookAheadSuspendSession$awaitAtLeast$1
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.LookAheadSuspendSession$awaitAtLeast$1 r0 = (io.ktor.utils.io.LookAheadSuspendSession$awaitAtLeast$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.LookAheadSuspendSession$awaitAtLeast$1 r0 = new io.ktor.utils.io.LookAheadSuspendSession$awaitAtLeast$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            int r9 = r0.I$0
            java.lang.Object r8 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪兰哲苏世 r8 = (io.ktor.utils.io.C4240) r8
            kotlin.AbstractC5185.m10210(r10)
            goto L56
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r8)
            r8 = 0
            return r8
        L34:
            kotlin.AbstractC5185.m10210(r10)
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r10 = r8.f12744
            kotlinx.io.飘花落叶言子楪苏兰世哲 r2 = r10.mo8643()
            long r4 = p058.AbstractC6855.m12079(r2)
            long r6 = (long) r9
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L49
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        L49:
            r0.L$0 = r8
            r0.I$0 = r9
            r0.label = r3
            java.lang.Object r10 = r10.mo8642(r9, r0)
            if (r10 != r1) goto L56
            return r1
        L56:
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r8 = r8.f12744
            kotlinx.io.飘花落叶言子楪苏兰世哲 r8 = r8.mo8643()
            long r0 = p058.AbstractC6855.m12079(r8)
            long r8 = (long) r9
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 < 0) goto L66
            goto L67
        L66:
            r3 = 0
        L67:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C4240.m8654(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
