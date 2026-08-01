package io.ktor.server.request;

import io.ktor.util.C4209;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import p059.C6857;

/* JADX INFO: renamed from: io.ktor.server.request.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4131 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4209 f12526;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4209 f12527;

    static {
        InterfaceC5087 interfaceC5087M8912;
        InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(Long.class);
        InterfaceC5087 interfaceC5087M89122 = null;
        try {
            interfaceC5087M8912 = AbstractC4396.m8912(Long.TYPE);
        } catch (Throwable unused) {
            interfaceC5087M8912 = null;
        }
        f12527 = new C4209("FormFieldLimit", new C6857(interfaceC5093Mo8917, interfaceC5087M8912));
        InterfaceC5093 interfaceC5093Mo89172 = AbstractC4396.f12975.mo8917(C4128.class);
        try {
            interfaceC5087M89122 = AbstractC4396.m8912(C4128.class);
        } catch (Throwable unused2) {
        }
        f12526 = new C4209("DoubleReceivePreventionToken", new C6857(interfaceC5093Mo89172, interfaceC5087M89122));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8526(kotlin.coroutines.jvm.internal.ContinuationImpl r4) {
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
            kotlin.AbstractC5185.m10210(r4)
            r4.getClass()
            return r4
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r4)
            return r1
        L31:
            kotlin.AbstractC5185.m10210(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.request.AbstractC4131.m8526(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
