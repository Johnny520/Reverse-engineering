package io.ktor.server.application;

import io.ktor.http.content.C3991;
import io.ktor.server.response.AbstractC4131;
import io.ktor.server.response.C4134;
import io.ktor.server.response.InterfaceC4133;
import io.ktor.server.routing.AbstractC4143;
import io.ktor.server.routing.C4144;
import io.ktor.server.routing.C4153;
import io.ktor.util.C4208;
import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p059.C6856;
import p240.C8134;

/* JADX INFO: renamed from: io.ktor.server.application.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4059 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8134 f12354 = new C8134();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8134 f12353 = new C8134();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8134 f12352 = new C8134();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8134 f12351 = new C8134();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8134 f12350 = new C8134();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C8134 f12349 = new C8134();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Object m8474(InterfaceC4064 interfaceC4064, Object obj, C6856 c6856, InterfaceC4356 interfaceC4356) {
        InterfaceC4133 interfaceC4133Mo8471 = interfaceC4064.mo8471();
        C4208 c4208 = AbstractC4131.f12524;
        interfaceC4133Mo8471.getClass();
        interfaceC4133Mo8471.mo380().getAttributes().m8596(c4208, c6856);
        C4134 c4134Mo379 = interfaceC4064.mo8471().mo379();
        if (obj == null) {
            obj = C3991.f12243;
        }
        Object objM8584 = c4134Mo379.m8584(interfaceC4064, obj, interfaceC4356);
        return objM8584 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM8584 : C5175.f14739;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m8475(io.ktor.server.application.InterfaceC4064 r7, p059.C6856 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws io.ktor.server.plugins.CannotTransformContentToTypeException {
        /*
            boolean r0 = r9 instanceof io.ktor.server.application.PipelineCall$receiveNullable$1
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.server.application.PipelineCall$receiveNullable$1 r0 = (io.ktor.server.application.PipelineCall$receiveNullable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.server.application.PipelineCall$receiveNullable$1 r0 = new io.ktor.server.application.PipelineCall$receiveNullable$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            io.ktor.server.request.飘花落叶言子楪世哲兰苏 r4 = io.ktor.server.request.C4127.f12517
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 != r5) goto L2f
            java.lang.Object r7 = r0.L$0
            r8 = r7
            飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰 r8 = (p059.C6856) r8
            kotlin.AbstractC5184.m10206(r9)
            goto L78
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r7)
            return r3
        L35:
            kotlin.AbstractC5184.m10206(r9)
            io.ktor.util.飘花落叶言子楪世兰哲苏 r9 = r7.getAttributes()
            io.ktor.util.飘花落叶言子楪世苏哲兰 r2 = io.ktor.server.request.AbstractC4130.f12522
            java.lang.Object r9 = r9.m8597(r2)
            io.ktor.server.request.飘花落叶言子楪世哲兰苏 r9 = (io.ktor.server.request.C4127) r9
            if (r9 != 0) goto L4d
            io.ktor.util.飘花落叶言子楪世兰哲苏 r6 = r7.getAttributes()
            r6.m8596(r2, r4)
        L4d:
            io.ktor.util.飘花落叶言子楪世苏哲兰 r2 = io.ktor.server.application.AbstractC4065.f12357
            r8.getClass()
            io.ktor.util.飘花落叶言子楪世兰哲苏 r2 = r7.getAttributes()
            io.ktor.util.飘花落叶言子楪世苏哲兰 r6 = io.ktor.server.application.AbstractC4065.f12357
            r2.m8596(r6, r8)
            if (r9 != 0) goto L65
            io.ktor.server.request.飘花落叶言子楪世兰苏哲 r9 = r7.mo8469()
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r9 = r9.mo394()
        L65:
            io.ktor.server.request.飘花落叶言子楪世兰苏哲 r2 = r7.mo8469()
            io.ktor.server.request.飘花落叶言子楪世苏兰哲 r2 = r2.mo378()
            r0.L$0 = r8
            r0.label = r5
            java.lang.Object r9 = r2.m8584(r7, r9, r0)
            if (r9 != r1) goto L78
            return r1
        L78:
            io.ktor.http.content.飘花落叶言子楪苏世兰哲 r7 = io.ktor.http.content.C3991.f12243
            boolean r7 = kotlin.jvm.internal.AbstractC4394.m8917(r9, r7)
            if (r7 == 0) goto L81
            return r3
        L81:
            if (r9 == r4) goto L97
            kotlin.reflect.飘花落叶言子楪世哲兰苏 r7 = r8.f18303
            boolean r7 = r7.isInstance(r9)
            if (r7 == 0) goto L8c
            return r9
        L8c:
            io.ktor.server.plugins.CannotTransformContentToTypeException r7 = new io.ktor.server.plugins.CannotTransformContentToTypeException
            kotlin.reflect.飘花落叶言子世楪苏兰哲 r8 = r8.f18302
            r8.getClass()
            r7.<init>(r8)
            throw r7
        L97:
            io.ktor.server.request.RequestAlreadyConsumedException r7 = new io.ktor.server.request.RequestAlreadyConsumedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.application.AbstractC4059.m8475(io.ktor.server.application.飘花落叶言子楪哲苏世兰, 飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object m8476(C4153 c4153, InterfaceC4062 interfaceC4062) {
        c4153.getClass();
        interfaceC4062.getClass();
        C4153 c41532 = c4153;
        while (true) {
            Object objM8464 = AbstractC4053.m8464(c41532, interfaceC4062);
            if (objM8464 != null) {
                return objM8464;
            }
            C4153 c41533 = c41532.f12574;
            if (c41533 == null) {
                if (c41532 instanceof C4144) {
                    return AbstractC4053.m8464(AbstractC4143.m8542(c4153), interfaceC4062);
                }
                return null;
            }
            c41533.getClass();
            c41532 = c41533;
        }
    }
}
