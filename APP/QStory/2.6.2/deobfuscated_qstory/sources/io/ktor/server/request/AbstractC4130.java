package io.ktor.server.request;

import io.ktor.util.C4208;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5092;
import p059.C6856;

/* JADX INFO: renamed from: io.ktor.server.request.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4130 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4208 f12522;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4208 f12523;

    static {
        InterfaceC5086 interfaceC5086M8922;
        InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(Long.class);
        InterfaceC5086 interfaceC5086M89222 = null;
        try {
            interfaceC5086M8922 = AbstractC4395.m8922(Long.TYPE);
        } catch (Throwable unused) {
            interfaceC5086M8922 = null;
        }
        f12523 = new C4208("FormFieldLimit", new C6856(interfaceC5092Mo8927, interfaceC5086M8922));
        InterfaceC5092 interfaceC5092Mo89272 = AbstractC4395.f12971.mo8927(C4127.class);
        try {
            interfaceC5086M89222 = AbstractC4395.m8922(C4127.class);
        } catch (Throwable unused2) {
        }
        f12522 = new C4208("DoubleReceivePreventionToken", new C6856(interfaceC5092Mo89272, interfaceC5086M89222));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8536(kotlin.coroutines.jvm.internal.ContinuationImpl r4) {
        /*
            boolean r0 = r4 instanceof io.ktor.server.request.ApplicationReceiveFunctionsKt$receive$2
            if (r0 == 0) goto L13
            r0 = r4
            io.ktor.server.request.ApplicationReceiveFunctionsKt$receive$2 r0 = (io.ktor.server.request.ApplicationReceiveFunctionsKt$receive$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.server.request.ApplicationReceiveFunctionsKt$receive$2 r0 = new io.ktor.server.request.ApplicationReceiveFunctionsKt$receive$2
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r0.label
            r1 = 0
            if (r0 == 0) goto L31
            r2 = 1
            if (r0 != r2) goto L2b
            kotlin.AbstractC5184.m10206(r4)
            r4.getClass()
            return r4
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r4)
            return r1
        L31:
            kotlin.AbstractC5184.m10206(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.request.AbstractC4130.m8536(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
