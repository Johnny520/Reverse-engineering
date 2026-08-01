package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.C4237;
import io.ktor.utils.io.InterfaceC4252;
import java.io.IOException;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5402;
import kotlinx.coroutines.C5451;
import kotlinx.coroutines.C5453;
import kotlinx.coroutines.InterfaceC5452;
import kotlinx.io.C5476;
import kotlinx.io.C5477;
import kotlinx.io.InterfaceC5481;

/* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4222 implements InterfaceC4252 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC4360 f12718;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5451 f12719;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5477 f12720 = new C5477();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C4237 f12721;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5476 f12722;

    public C4222(C5476 c5476, InterfaceC4360 interfaceC4360) {
        this.f12722 = c5476;
        C5451 c5451 = new C5451((InterfaceC5452) interfaceC4360.get(C5453.f15105));
        this.f12719 = c5451;
        this.f12718 = interfaceC4360.plus(c5451).plus(new C5402("RawSourceChannel"));
    }

    @Override // io.ktor.utils.io.InterfaceC4252
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo8641() {
        return this.f12721 != null && this.f12720.mo10604();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.InterfaceC4252
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8642(int r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$1 r0 = (io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$1 r0 = new io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2e
            int r6 = r0.I$0
            java.lang.Object r5 = r0.L$0
            io.ktor.utils.io.jvm.javaio.飘花落叶言子楪世哲苏兰 r5 = (io.ktor.utils.io.jvm.javaio.C4222) r5
            kotlin.AbstractC5185.m10210(r7)
            goto L52
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            return r3
        L34:
            kotlin.AbstractC5185.m10210(r7)
            io.ktor.utils.io.飘花落叶言子楪兰世哲苏 r7 = r5.f12721
            if (r7 == 0) goto L3e
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L3e:
            io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2 r7 = new io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2
            r7.<init>(r5, r6, r3)
            r0.L$0 = r5
            r0.I$0 = r6
            r0.label = r4
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r2 = r5.f12718
            java.lang.Object r7 = kotlinx.coroutines.AbstractC5399.m10470(r2, r7, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            kotlinx.io.飘花落叶言子楪世苏哲兰 r5 = r5.f12720
            long r0 = r5.f15142
            long r5 = (long) r6
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 < 0) goto L5c
            goto L5d
        L5c:
            r4 = 0
        L5d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.javaio.C4222.mo8642(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.InterfaceC4252
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5481 mo8643() {
        return this.f12720;
    }

    @Override // io.ktor.utils.io.InterfaceC4252
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Throwable mo8644() {
        C4237 c4237 = this.f12721;
        if (c4237 != null) {
            return c4237.m8652();
        }
        return null;
    }

    @Override // io.ktor.utils.io.InterfaceC4252
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo8645(Throwable th) {
        String message;
        String message2;
        if (this.f12721 != null) {
            return;
        }
        String str = "Channel was cancelled";
        if (th == null || (message = th.getMessage()) == null) {
            message = "Channel was cancelled";
        }
        AbstractC5399.m10508(message, th, this.f12719);
        this.f12722.close();
        if (th != null && (message2 = th.getMessage()) != null) {
            str = message2;
        }
        this.f12721 = new C4237(new IOException(str, th));
    }
}
