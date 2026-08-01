package io.ktor.server.application;

import io.ktor.http.content.C3992;
import io.ktor.server.response.AbstractC4132;
import io.ktor.server.response.C4135;
import io.ktor.server.response.InterfaceC4134;
import io.ktor.server.routing.AbstractC4144;
import io.ktor.server.routing.C4145;
import io.ktor.server.routing.C4154;
import io.ktor.util.C4209;
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p059.C6857;
import p240.C8135;

/* JADX INFO: renamed from: io.ktor.server.application.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4060 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8135 f12358 = new C8135();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8135 f12357 = new C8135();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8135 f12356 = new C8135();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8135 f12355 = new C8135();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8135 f12354 = new C8135();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C8135 f12353 = new C8135();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Object m8464(InterfaceC4065 interfaceC4065, Object obj, C6857 c6857, InterfaceC4357 interfaceC4357) {
        InterfaceC4134 interfaceC4134Mo8461 = interfaceC4065.mo8461();
        C4209 c4209 = AbstractC4132.f12528;
        interfaceC4134Mo8461.getClass();
        interfaceC4134Mo8461.mo381().getAttributes().m8586(c4209, c6857);
        C4135 c4135Mo380 = interfaceC4065.mo8461().mo380();
        if (obj == null) {
            obj = C3992.f12247;
        }
        Object objM8574 = c4135Mo380.m8574(interfaceC4065, obj, interfaceC4357);
        return objM8574 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM8574 : C5176.f14739;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m8465(io.ktor.server.application.InterfaceC4065 r7, p059.C6857 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws io.ktor.server.plugins.CannotTransformContentToTypeException {
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
            io.ktor.server.request.飘花落叶言子楪世哲兰苏 r4 = io.ktor.server.request.C4128.f12521
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 != r5) goto L2f
            java.lang.Object r7 = r0.L$0
            r8 = r7
            飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰 r8 = (p059.C6857) r8
            kotlin.AbstractC5185.m10210(r9)
            goto L78
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            return r3
        L35:
            kotlin.AbstractC5185.m10210(r9)
            io.ktor.util.飘花落叶言子楪世兰哲苏 r9 = r7.getAttributes()
            io.ktor.util.飘花落叶言子楪世苏哲兰 r2 = io.ktor.server.request.AbstractC4131.f12526
            java.lang.Object r9 = r9.m8587(r2)
            io.ktor.server.request.飘花落叶言子楪世哲兰苏 r9 = (io.ktor.server.request.C4128) r9
            if (r9 != 0) goto L4d
            io.ktor.util.飘花落叶言子楪世兰哲苏 r6 = r7.getAttributes()
            r6.m8586(r2, r4)
        L4d:
            io.ktor.util.飘花落叶言子楪世苏哲兰 r2 = io.ktor.server.application.AbstractC4066.f12361
            r8.getClass()
            io.ktor.util.飘花落叶言子楪世兰哲苏 r2 = r7.getAttributes()
            io.ktor.util.飘花落叶言子楪世苏哲兰 r6 = io.ktor.server.application.AbstractC4066.f12361
            r2.m8586(r6, r8)
            if (r9 != 0) goto L65
            io.ktor.server.request.飘花落叶言子楪世兰苏哲 r9 = r7.mo8459()
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r9 = r9.mo396()
        L65:
            io.ktor.server.request.飘花落叶言子楪世兰苏哲 r2 = r7.mo8459()
            io.ktor.server.request.飘花落叶言子楪世苏兰哲 r2 = r2.mo379()
            r0.L$0 = r8
            r0.label = r5
            java.lang.Object r9 = r2.m8574(r7, r9, r0)
            if (r9 != r1) goto L78
            return r1
        L78:
            io.ktor.http.content.飘花落叶言子楪苏世兰哲 r7 = io.ktor.http.content.C3992.f12247
            boolean r7 = kotlin.jvm.internal.AbstractC4395.m8907(r9, r7)
            if (r7 == 0) goto L81
            return r3
        L81:
            if (r9 == r4) goto L97
            kotlin.reflect.飘花落叶言子楪世哲兰苏 r7 = r8.f18298
            boolean r7 = r7.isInstance(r9)
            if (r7 == 0) goto L8c
            return r9
        L8c:
            io.ktor.server.plugins.CannotTransformContentToTypeException r7 = new io.ktor.server.plugins.CannotTransformContentToTypeException
            kotlin.reflect.飘花落叶言子世楪苏兰哲 r8 = r8.f18297
            r8.getClass()
            r7.<init>(r8)
            throw r7
        L97:
            io.ktor.server.request.RequestAlreadyConsumedException r7 = new io.ktor.server.request.RequestAlreadyConsumedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.application.AbstractC4060.m8465(io.ktor.server.application.飘花落叶言子楪哲苏世兰, 飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object m8466(C4154 c4154, InterfaceC4063 interfaceC4063) {
        c4154.getClass();
        interfaceC4063.getClass();
        C4154 c41542 = c4154;
        while (true) {
            Object objM8454 = AbstractC4054.m8454(c41542, interfaceC4063);
            if (objM8454 != null) {
                return objM8454;
            }
            C4154 c41543 = c41542.f12578;
            if (c41543 == null) {
                if (c41542 instanceof C4145) {
                    return AbstractC4054.m8454(AbstractC4144.m8532(c4154), interfaceC4063);
                }
                return null;
            }
            c41543.getClass();
            c41542 = c41543;
        }
    }
}
