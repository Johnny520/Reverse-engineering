package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.C4236;
import io.ktor.utils.io.InterfaceC4251;
import java.io.IOException;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5401;
import kotlinx.coroutines.C5450;
import kotlinx.coroutines.C5452;
import kotlinx.coroutines.InterfaceC5451;
import kotlinx.io.C5475;
import kotlinx.io.C5476;
import kotlinx.io.InterfaceC5480;

/* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4221 implements InterfaceC4251 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC4359 f12714;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5450 f12715;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5476 f12716 = new C5476();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C4236 f12717;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5475 f12718;

    public C4221(C5475 c5475, InterfaceC4359 interfaceC4359) {
        this.f12718 = c5475;
        C5450 c5450 = new C5450((InterfaceC5451) interfaceC4359.get(C5452.f15105));
        this.f12715 = c5450;
        this.f12714 = interfaceC4359.plus(c5450).plus(new C5401("RawSourceChannel"));
    }

    @Override // io.ktor.utils.io.InterfaceC4251
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo8651() {
        return this.f12717 != null && this.f12716.mo10601();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.InterfaceC4251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8652(int r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
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
            io.ktor.utils.io.jvm.javaio.飘花落叶言子楪世哲苏兰 r5 = (io.ktor.utils.io.jvm.javaio.C4221) r5
            kotlin.AbstractC5184.m10206(r7)
            goto L52
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r3
        L34:
            kotlin.AbstractC5184.m10206(r7)
            io.ktor.utils.io.飘花落叶言子楪兰世哲苏 r7 = r5.f12717
            if (r7 == 0) goto L3e
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L3e:
            io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2 r7 = new io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2
            r7.<init>(r5, r6, r3)
            r0.L$0 = r5
            r0.I$0 = r6
            r0.label = r4
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r2 = r5.f12714
            java.lang.Object r7 = kotlinx.coroutines.AbstractC5398.m10466(r2, r7, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            kotlinx.io.飘花落叶言子楪世苏哲兰 r5 = r5.f12716
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
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.javaio.C4221.mo8652(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.InterfaceC4251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5480 mo8653() {
        return this.f12716;
    }

    @Override // io.ktor.utils.io.InterfaceC4251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Throwable mo8654() {
        C4236 c4236 = this.f12717;
        if (c4236 != null) {
            return c4236.m8662();
        }
        return null;
    }

    @Override // io.ktor.utils.io.InterfaceC4251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo8655(Throwable th) {
        String message;
        String message2;
        if (this.f12717 != null) {
            return;
        }
        String str = "Channel was cancelled";
        if (th == null || (message = th.getMessage()) == null) {
            message = "Channel was cancelled";
        }
        AbstractC5398.m10504(message, th, this.f12715);
        this.f12718.close();
        if (th != null && (message2 = th.getMessage()) != null) {
            str = message2;
        }
        this.f12717 = new C4236(new IOException(str, th));
    }
}
