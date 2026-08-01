package io.ktor.server.cio;

import androidx.appcompat.app.C0076;
import io.ktor.http.cio.AbstractC3957;
import io.ktor.server.engine.AbstractC4108;
import io.ktor.utils.io.C4230;
import io.ktor.utils.io.C4249;
import io.ktor.utils.io.InterfaceC4247;
import io.ktor.utils.io.InterfaceC4252;
import kotlin.coroutines.InterfaceC4360;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.InterfaceC5441;
import p236.AbstractC8115;
import p236.C8097;
import p236.C8116;

/* JADX INFO: renamed from: io.ktor.server.cio.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4085 extends AbstractC4108 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int f12408 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C5417 f12409;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C4249 f12410;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C8116 f12411;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public C8097 f12412;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC5441 f12413;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC4360 f12414;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C0076 f12415;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC4247 f12416;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final InterfaceC4252 f12417;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4085(C4083 c4083, InterfaceC4247 interfaceC4247, InterfaceC4252 interfaceC4252, InterfaceC4360 interfaceC4360, InterfaceC4360 interfaceC43602, InterfaceC5441 interfaceC5441) {
        super(c4083);
        interfaceC4247.getClass();
        interfaceC4252.getClass();
        interfaceC4360.getClass();
        interfaceC43602.getClass();
        this.f12416 = interfaceC4247;
        this.f12417 = interfaceC4252;
        this.f12414 = interfaceC4360;
        this.f12413 = interfaceC5441;
        this.f12412 = C8097.f22351;
        this.f12411 = new C8116(2);
        this.f12415 = new C0076(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (kotlinx.coroutines.AbstractC5399.m10470(r8, r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.server.engine.AbstractC4108
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8483(byte[] r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.ktor.server.cio.CIOApplicationResponse$respondFromBytes$1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.server.cio.CIOApplicationResponse$respondFromBytes$1 r0 = (io.ktor.server.cio.CIOApplicationResponse$respondFromBytes$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.server.cio.CIOApplicationResponse$respondFromBytes$1 r0 = new io.ktor.server.cio.CIOApplicationResponse$respondFromBytes$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L31
            if (r2 != r3) goto L2b
            kotlin.AbstractC5185.m10210(r8)
            goto L66
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            return r4
        L31:
            java.lang.Object r6 = r0.L$1
            r7 = r6
            byte[] r7 = (byte[]) r7
            java.lang.Object r6 = r0.L$0
            io.ktor.server.cio.飘花落叶言子楪苏世哲兰 r6 = (io.ktor.server.cio.C4085) r6
            kotlin.AbstractC5185.m10210(r8)
            goto L4e
        L3e:
            kotlin.AbstractC5185.m10210(r8)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r5
            java.lang.Object r8 = r6.m8486(r5, r0)
            if (r8 != r1) goto L4e
            goto L65
        L4e:
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r6 = r6.m8485()
            kotlinx.coroutines.飘花落叶言子哲世苏楪兰 r8 = kotlinx.coroutines.AbstractC5395.f15029
            io.ktor.server.cio.CIOApplicationResponse$respondFromBytes$2 r2 = new io.ktor.server.cio.CIOApplicationResponse$respondFromBytes$2
            r2.<init>(r6, r7, r4)
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.AbstractC5399.m10470(r8, r2, r0)
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.cio.C4085.mo8483(byte[], kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.server.response.InterfaceC4136
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C0076 mo383() {
        return this.f12415;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00aa, code lost:
    
        if (((io.ktor.utils.io.C4249) r11).m8704(r0) != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
    
        if (((io.ktor.utils.io.C4249) r12).m8704(r0) != r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e A[PHI: r10
  0x009e: PHI (r10v5 'this' io.ktor.server.cio.飘花落叶言子楪苏世哲兰) = (r10v4 'this' io.ktor.server.cio.飘花落叶言子楪苏世哲兰), (r10v15 'this' io.ktor.server.cio.飘花落叶言子楪苏世哲兰) binds: [B:35:0x009b, B:20:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.server.engine.AbstractC4108
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8484(io.ktor.server.websocket.C4176 r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.cio.C4085.mo8484(io.ktor.server.websocket.飘花落叶言子楪世兰哲苏, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4247 m8485() {
        String[] strArr = AbstractC8115.f22413;
        boolean zM8907 = AbstractC4395.m8907(this.f12415.m261("Transfer-Encoding"), "chunked");
        InterfaceC4247 interfaceC4247 = this.f12416;
        if (!zM8907) {
            return interfaceC4247;
        }
        C4230 c4230M8343 = AbstractC3957.m8343(interfaceC4247, AbstractC5395.f15029);
        C4249 c4249 = c4230M8343.f12733;
        this.f12410 = c4249;
        this.f12409 = c4230M8343.f12732;
        return c4249;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ba, code lost:
    
        if (((io.ktor.utils.io.C4249) r11).m8700(r1) == r2) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8486(boolean r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.cio.C4085.m8486(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.server.engine.AbstractC4108
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8487(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.ktor.server.cio.CIOApplicationResponse$responseChannel$1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.server.cio.CIOApplicationResponse$responseChannel$1 r0 = (io.ktor.server.cio.CIOApplicationResponse$responseChannel$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.server.cio.CIOApplicationResponse$responseChannel$1 r0 = new io.ktor.server.cio.CIOApplicationResponse$responseChannel$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            io.ktor.server.cio.飘花落叶言子楪苏世哲兰 r4 = (io.ktor.server.cio.C4085) r4
            kotlin.AbstractC5185.m10210(r5)
            goto L41
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r4)
            r4 = 0
            return r4
        L32:
            kotlin.AbstractC5185.m10210(r5)
            r0.L$0 = r4
            r0.label = r3
            r5 = 0
            java.lang.Object r5 = r4.m8486(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r4 = r4.m8485()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.cio.C4085.mo8487(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (((io.ktor.utils.io.C4249) r6).m8704(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.server.engine.AbstractC4108
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8488(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof io.ktor.server.cio.CIOApplicationResponse$respondNoContent$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.server.cio.CIOApplicationResponse$respondNoContent$1 r0 = (io.ktor.server.cio.CIOApplicationResponse$respondNoContent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.server.cio.CIOApplicationResponse$respondNoContent$1 r0 = new io.ktor.server.cio.CIOApplicationResponse$respondNoContent$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            kotlin.AbstractC5185.m10210(r7)
            goto L56
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            return r3
        L31:
            java.lang.Object r6 = r0.L$0
            io.ktor.server.cio.飘花落叶言子楪苏世哲兰 r6 = (io.ktor.server.cio.C4085) r6
            kotlin.AbstractC5185.m10210(r7)
            goto L47
        L39:
            kotlin.AbstractC5185.m10210(r7)
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.m8486(r5, r0)
            if (r7 != r1) goto L47
            goto L55
        L47:
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r6 = r6.f12416
            r0.L$0 = r3
            r0.label = r4
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r6 = (io.ktor.utils.io.C4249) r6
            java.lang.Object r6 = r6.m8704(r0)
            if (r6 != r1) goto L56
        L55:
            return r1
        L56:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.cio.C4085.mo8488(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[PHI: r8
  0x0082: PHI (r8v3 'this' io.ktor.server.cio.飘花落叶言子楪苏世哲兰) = 
  (r8v2 'this' io.ktor.server.cio.飘花落叶言子楪苏世哲兰)
  (r8v2 'this' io.ktor.server.cio.飘花落叶言子楪苏世哲兰)
  (r8v9 'this' io.ktor.server.cio.飘花落叶言子楪苏世哲兰)
 binds: [B:31:0x0075, B:33:0x007f, B:17:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.server.engine.AbstractC4108
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8489(io.ktor.http.content.AbstractC3987 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.ktor.server.cio.CIOApplicationResponse$respondOutgoingContent$1
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.server.cio.CIOApplicationResponse$respondOutgoingContent$1 r0 = (io.ktor.server.cio.CIOApplicationResponse$respondOutgoingContent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.server.cio.CIOApplicationResponse$respondOutgoingContent$1 r0 = new io.ktor.server.cio.CIOApplicationResponse$respondOutgoingContent$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            kotlin.飘花落叶言子楪兰苏哲世 r4 = kotlin.C5176.f14739
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L46
            if (r2 == r7) goto L3e
            if (r2 == r6) goto L36
            if (r2 != r5) goto L30
            kotlin.AbstractC5185.m10210(r10)
            return r4
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r8)
            return r3
        L36:
            java.lang.Object r8 = r0.L$0
            io.ktor.server.cio.飘花落叶言子楪苏世哲兰 r8 = (io.ktor.server.cio.C4085) r8
            kotlin.AbstractC5185.m10210(r10)
            goto L82
        L3e:
            java.lang.Object r8 = r0.L$0
            io.ktor.server.cio.飘花落叶言子楪苏世哲兰 r8 = (io.ktor.server.cio.C4085) r8
            kotlin.AbstractC5185.m10210(r10)
            goto L73
        L46:
            kotlin.AbstractC5185.m10210(r10)
            boolean r10 = r9 instanceof io.ktor.server.websocket.C4176
            kotlinx.coroutines.飘花落叶言子楪哲苏兰世 r2 = r8.f12413
            if (r10 == 0) goto L5f
            if (r2 == 0) goto L59
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            kotlinx.coroutines.飘花落叶言子楪哲兰世苏 r2 = (kotlinx.coroutines.C5438) r2
            r2.m10588(r10)
            goto L68
        L59:
            java.lang.String r8 = "Unable to perform upgrade as it is not requested by the client: request should have Upgrade and Connection headers filled properly"
            top.suzhelan.qstory.hook.item.C5925.m11311(r8)
            return r3
        L5f:
            if (r2 == 0) goto L68
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            kotlinx.coroutines.飘花落叶言子楪哲兰世苏 r2 = (kotlinx.coroutines.C5438) r2
            r2.m10588(r10)
        L68:
            r0.L$0 = r8
            r0.label = r7
            java.lang.Object r9 = io.ktor.server.engine.AbstractC4108.m8511(r8, r9, r0)
            if (r9 != r1) goto L73
            goto L90
        L73:
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r9 = r8.f12410
            if (r9 == 0) goto L82
            r0.L$0 = r8
            r0.label = r6
            java.lang.Object r9 = r9.m8704(r0)
            if (r9 != r1) goto L82
            goto L90
        L82:
            kotlinx.coroutines.飘花落叶言子哲楪世兰苏 r8 = r8.f12409
            if (r8 == 0) goto L91
            r0.L$0 = r3
            r0.label = r5
            java.lang.Object r8 = r8.mo10564(r0)
            if (r8 != r1) goto L91
        L90:
            return r1
        L91:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.cio.C4085.mo8489(io.ktor.http.content.飘花落叶言子楪哲世苏兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
