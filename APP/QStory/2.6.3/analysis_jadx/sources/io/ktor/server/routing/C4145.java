package io.ktor.server.routing;

import com.materialkolor.dynamiccolor.C3807;
import io.ktor.server.application.C4058;
import io.ktor.util.C4209;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import p059.C6857;
import p240.C8135;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4145 extends C4154 implements InterfaceC4168 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final C4209 f12565;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final ArrayList f12567;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C4058 f12568;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final C4146 f12564 = new C4146();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final C8135 f12563 = new C8135();

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final C8135 f12566 = new C8135();

    static {
        InterfaceC5087 interfaceC5087M8912;
        InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(C4145.class);
        try {
            interfaceC5087M8912 = AbstractC4396.m8912(C4145.class);
        } catch (Throwable unused) {
            interfaceC5087M8912 = null;
        }
        f12565 = new C4209("Routing", new C6857(interfaceC5093Mo8917, interfaceC5087M8912));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4145(C4058 c4058) {
        super(null, new C4171(c4058.f12342), c4058.f12340, c4058.f12341);
        c4058.getClass();
        this.f12568 = c4058;
        ArrayList arrayList = new ArrayList();
        this.f12567 = arrayList;
        arrayList.add(new C3807(26));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8533(io.ktor.util.pipeline.AbstractC4194 r17, io.ktor.server.routing.C4154 r18, p236.InterfaceC8095 r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.routing.C4145.m8533(io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏, io.ktor.server.routing.飘花落叶言子楪兰世哲苏, 飘花落叶言楪兰世哲子苏.飘花落叶言子世楪兰苏哲, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8534(io.ktor.util.pipeline.AbstractC4194 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.ktor.server.routing.RoutingRoot$interceptor$1
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.server.routing.RoutingRoot$interceptor$1 r0 = (io.ktor.server.routing.RoutingRoot$interceptor$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.server.routing.RoutingRoot$interceptor$1 r0 = new io.ktor.server.routing.RoutingRoot$interceptor$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            kotlin.飘花落叶言子楪兰苏哲世 r3 = kotlin.C5176.f14739
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L40
            if (r2 == r6) goto L33
            if (r2 != r5) goto L2d
            kotlin.AbstractC5185.m10210(r10)
            return r3
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r8)
            return r4
        L33:
            java.lang.Object r8 = r0.L$1
            r9 = r8
            io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏 r9 = (io.ktor.util.pipeline.AbstractC4194) r9
            java.lang.Object r8 = r0.L$0
            io.ktor.server.routing.飘花落叶言子世苏哲楪兰 r8 = (io.ktor.server.routing.C4145) r8
            kotlin.AbstractC5185.m10210(r10)
            goto L5b
        L40:
            kotlin.AbstractC5185.m10210(r10)
            io.ktor.server.routing.飘花落叶言子世楪苏哲兰 r10 = new io.ktor.server.routing.飘花落叶言子世楪苏哲兰
            java.lang.Object r2 = r9.f12664
            io.ktor.server.application.飘花落叶言子楪哲苏世兰 r2 = (io.ktor.server.application.InterfaceC4065) r2
            java.util.ArrayList r7 = r8.f12567
            r10.<init>(r8, r2, r7)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r6
            java.lang.Object r10 = r10.m8529(r0)
            if (r10 != r1) goto L5b
            goto L73
        L5b:
            io.ktor.server.routing.飘花落叶言子世楪哲兰苏 r10 = (io.ktor.server.routing.AbstractC4139) r10
            boolean r2 = r10 instanceof io.ktor.server.routing.C4140
            if (r2 == 0) goto L75
            io.ktor.server.routing.飘花落叶言子楪兰世哲苏 r2 = r10.f12546
            io.ktor.server.routing.飘花落叶言子世楪哲苏兰 r10 = (io.ktor.server.routing.C4140) r10
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪兰苏哲 r10 = r10.f12548
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r5
            java.lang.Object r8 = r8.m8533(r9, r2, r10, r0)
            if (r8 != r1) goto L74
        L73:
            return r1
        L74:
            return r3
        L75:
            boolean r8 = r10 instanceof io.ktor.server.routing.C4141
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r9.f12664
            io.ktor.server.application.飘花落叶言子楪哲苏世兰 r8 = (io.ktor.server.application.InterfaceC4065) r8
            io.ktor.util.飘花落叶言子楪世兰哲苏 r8 = r8.getAttributes()
            io.ktor.util.飘花落叶言子楪世苏哲兰 r9 = io.ktor.server.routing.AbstractC4144.f12562
            io.ktor.server.routing.飘花落叶言子世楪苏兰哲 r10 = (io.ktor.server.routing.C4141) r10
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰 r10 = r10.f12549
            r8.m8586(r9, r10)
            return r3
        L8b:
            io.ktor.util.C4211.m8611()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.routing.C4145.m8534(io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
