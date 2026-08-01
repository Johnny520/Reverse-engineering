package io.ktor.server.cio;

import androidx.appcompat.app.C0076;
import io.ktor.http.cio.AbstractC3956;
import io.ktor.server.engine.AbstractC4107;
import io.ktor.utils.io.C4229;
import io.ktor.utils.io.C4248;
import io.ktor.utils.io.InterfaceC4246;
import io.ktor.utils.io.InterfaceC4251;
import kotlin.coroutines.InterfaceC4359;
import kotlin.jvm.internal.AbstractC4394;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.InterfaceC5440;
import p236.AbstractC8114;
import p236.C8096;
import p236.C8115;

/* JADX INFO: renamed from: io.ktor.server.cio.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4084 extends AbstractC4107 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int f12404 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C5416 f12405;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C4248 f12406;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C8115 f12407;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public C8096 f12408;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC5440 f12409;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC4359 f12410;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C0076 f12411;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC4246 f12412;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final InterfaceC4251 f12413;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4084(C4082 c4082, InterfaceC4246 interfaceC4246, InterfaceC4251 interfaceC4251, InterfaceC4359 interfaceC4359, InterfaceC4359 interfaceC43592, InterfaceC5440 interfaceC5440) {
        super(c4082);
        interfaceC4246.getClass();
        interfaceC4251.getClass();
        interfaceC4359.getClass();
        interfaceC43592.getClass();
        this.f12412 = interfaceC4246;
        this.f12413 = interfaceC4251;
        this.f12410 = interfaceC4359;
        this.f12409 = interfaceC5440;
        this.f12408 = C8096.f22353;
        this.f12407 = new C8115(2);
        this.f12411 = new C0076(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (kotlinx.coroutines.AbstractC5398.m10466(r8, r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.server.engine.AbstractC4107
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8493(byte[] r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
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
            kotlin.AbstractC5184.m10206(r8)
            goto L66
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r4
        L31:
            java.lang.Object r6 = r0.L$1
            r7 = r6
            byte[] r7 = (byte[]) r7
            java.lang.Object r6 = r0.L$0
            io.ktor.server.cio.飘花落叶言子楪苏世哲兰 r6 = (io.ktor.server.cio.C4084) r6
            kotlin.AbstractC5184.m10206(r8)
            goto L4e
        L3e:
            kotlin.AbstractC5184.m10206(r8)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r5
            java.lang.Object r8 = r6.m8496(r5, r0)
            if (r8 != r1) goto L4e
            goto L65
        L4e:
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r6 = r6.m8495()
            kotlinx.coroutines.飘花落叶言子哲世苏楪兰 r8 = kotlinx.coroutines.AbstractC5394.f15029
            io.ktor.server.cio.CIOApplicationResponse$respondFromBytes$2 r2 = new io.ktor.server.cio.CIOApplicationResponse$respondFromBytes$2
            r2.<init>(r6, r7, r4)
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.AbstractC5398.m10466(r8, r2, r0)
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.cio.C4084.mo8493(byte[], kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.server.response.InterfaceC4135
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C0076 mo382() {
        return this.f12411;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00aa, code lost:
    
        if (((io.ktor.utils.io.C4248) r11).m8714(r0) != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
    
        if (((io.ktor.utils.io.C4248) r12).m8714(r0) != r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e A[PHI: r10
  0x009e: PHI (r10v5 'this' io.ktor.server.cio.飘花落叶言子楪苏世哲兰) = (r10v4 'this' io.ktor.server.cio.飘花落叶言子楪苏世哲兰), (r10v15 'this' io.ktor.server.cio.飘花落叶言子楪苏世哲兰) binds: [B:35:0x009b, B:20:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.server.engine.AbstractC4107
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8494(io.ktor.server.websocket.C4175 r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.cio.C4084.mo8494(io.ktor.server.websocket.飘花落叶言子楪世兰哲苏, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4246 m8495() {
        String[] strArr = AbstractC8114.f22415;
        boolean zM8917 = AbstractC4394.m8917(this.f12411.m260("Transfer-Encoding"), "chunked");
        InterfaceC4246 interfaceC4246 = this.f12412;
        if (!zM8917) {
            return interfaceC4246;
        }
        C4229 c4229M8353 = AbstractC3956.m8353(interfaceC4246, AbstractC5394.f15029);
        C4248 c4248 = c4229M8353.f12729;
        this.f12406 = c4248;
        this.f12405 = c4229M8353.f12728;
        return c4248;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ba, code lost:
    
        if (((io.ktor.utils.io.C4248) r11).m8710(r1) == r2) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8496(boolean r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.cio.C4084.m8496(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.server.engine.AbstractC4107
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8497(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
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
            io.ktor.server.cio.飘花落叶言子楪苏世哲兰 r4 = (io.ktor.server.cio.C4084) r4
            kotlin.AbstractC5184.m10206(r5)
            goto L41
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r4)
            r4 = 0
            return r4
        L32:
            kotlin.AbstractC5184.m10206(r5)
            r0.L$0 = r4
            r0.label = r3
            r5 = 0
            java.lang.Object r5 = r4.m8496(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r4 = r4.m8495()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.cio.C4084.mo8497(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (((io.ktor.utils.io.C4248) r6).m8714(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.server.engine.AbstractC4107
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8498(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
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
            kotlin.AbstractC5184.m10206(r7)
            goto L56
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r3
        L31:
            java.lang.Object r6 = r0.L$0
            io.ktor.server.cio.飘花落叶言子楪苏世哲兰 r6 = (io.ktor.server.cio.C4084) r6
            kotlin.AbstractC5184.m10206(r7)
            goto L47
        L39:
            kotlin.AbstractC5184.m10206(r7)
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.m8496(r5, r0)
            if (r7 != r1) goto L47
            goto L55
        L47:
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r6 = r6.f12412
            r0.L$0 = r3
            r0.label = r4
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r6 = (io.ktor.utils.io.C4248) r6
            java.lang.Object r6 = r6.m8714(r0)
            if (r6 != r1) goto L56
        L55:
            return r1
        L56:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.cio.C4084.mo8498(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[PHI: r8
  0x0082: PHI (r8v3 'this' io.ktor.server.cio.飘花落叶言子楪苏世哲兰) = 
  (r8v2 'this' io.ktor.server.cio.飘花落叶言子楪苏世哲兰)
  (r8v2 'this' io.ktor.server.cio.飘花落叶言子楪苏世哲兰)
  (r8v9 'this' io.ktor.server.cio.飘花落叶言子楪苏世哲兰)
 binds: [B:31:0x0075, B:33:0x007f, B:17:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.server.engine.AbstractC4107
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8499(io.ktor.http.content.AbstractC3986 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
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
            kotlin.飘花落叶言子楪兰苏哲世 r4 = kotlin.C5175.f14739
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L46
            if (r2 == r7) goto L3e
            if (r2 == r6) goto L36
            if (r2 != r5) goto L30
            kotlin.AbstractC5184.m10206(r10)
            return r4
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r8)
            return r3
        L36:
            java.lang.Object r8 = r0.L$0
            io.ktor.server.cio.飘花落叶言子楪苏世哲兰 r8 = (io.ktor.server.cio.C4084) r8
            kotlin.AbstractC5184.m10206(r10)
            goto L82
        L3e:
            java.lang.Object r8 = r0.L$0
            io.ktor.server.cio.飘花落叶言子楪苏世哲兰 r8 = (io.ktor.server.cio.C4084) r8
            kotlin.AbstractC5184.m10206(r10)
            goto L73
        L46:
            kotlin.AbstractC5184.m10206(r10)
            boolean r10 = r9 instanceof io.ktor.server.websocket.C4175
            kotlinx.coroutines.飘花落叶言子楪哲苏兰世 r2 = r8.f12409
            if (r10 == 0) goto L5f
            if (r2 == 0) goto L59
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            kotlinx.coroutines.飘花落叶言子楪哲兰世苏 r2 = (kotlinx.coroutines.C5437) r2
            r2.m10585(r10)
            goto L68
        L59:
            java.lang.String r8 = "Unable to perform upgrade as it is not requested by the client: request should have Upgrade and Connection headers filled properly"
            top.suzhelan.qstory.hook.item.C5919.m11250(r8)
            return r3
        L5f:
            if (r2 == 0) goto L68
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            kotlinx.coroutines.飘花落叶言子楪哲兰世苏 r2 = (kotlinx.coroutines.C5437) r2
            r2.m10585(r10)
        L68:
            r0.L$0 = r8
            r0.label = r7
            java.lang.Object r9 = io.ktor.server.engine.AbstractC4107.m8520(r8, r9, r0)
            if (r9 != r1) goto L73
            goto L90
        L73:
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r9 = r8.f12406
            if (r9 == 0) goto L82
            r0.L$0 = r8
            r0.label = r6
            java.lang.Object r9 = r9.m8714(r0)
            if (r9 != r1) goto L82
            goto L90
        L82:
            kotlinx.coroutines.飘花落叶言子哲楪世兰苏 r8 = r8.f12405
            if (r8 == 0) goto L91
            r0.L$0 = r3
            r0.label = r5
            java.lang.Object r8 = r8.mo10558(r0)
            if (r8 != r1) goto L91
        L90:
            return r1
        L91:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.cio.C4084.mo8499(io.ktor.http.content.飘花落叶言子楪哲世苏兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
