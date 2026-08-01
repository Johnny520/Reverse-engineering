package io.ktor.server.routing;

import com.materialkolor.dynamiccolor.C3806;
import io.ktor.server.application.C4057;
import io.ktor.util.C4208;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5092;
import p059.C6856;
import p240.C8134;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4144 extends C4153 implements InterfaceC4167 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final C4208 f12561;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final ArrayList f12563;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C4057 f12564;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final C4145 f12560 = new C4145();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final C8134 f12559 = new C8134();

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final C8134 f12562 = new C8134();

    static {
        InterfaceC5086 interfaceC5086M8922;
        InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(C4144.class);
        try {
            interfaceC5086M8922 = AbstractC4395.m8922(C4144.class);
        } catch (Throwable unused) {
            interfaceC5086M8922 = null;
        }
        f12561 = new C4208("Routing", new C6856(interfaceC5092Mo8927, interfaceC5086M8922));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4144(C4057 c4057) {
        super(null, new C4170(c4057.f12338), c4057.f12336, c4057.f12337);
        c4057.getClass();
        this.f12564 = c4057;
        ArrayList arrayList = new ArrayList();
        this.f12563 = arrayList;
        arrayList.add(new C3806(26));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8543(io.ktor.util.pipeline.AbstractC4193 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
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
            kotlin.飘花落叶言子楪兰苏哲世 r3 = kotlin.C5175.f14739
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L40
            if (r2 == r6) goto L33
            if (r2 != r5) goto L2d
            kotlin.AbstractC5184.m10206(r10)
            return r3
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r8)
            return r4
        L33:
            java.lang.Object r8 = r0.L$1
            r9 = r8
            io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏 r9 = (io.ktor.util.pipeline.AbstractC4193) r9
            java.lang.Object r8 = r0.L$0
            io.ktor.server.routing.飘花落叶言子世苏哲楪兰 r8 = (io.ktor.server.routing.C4144) r8
            kotlin.AbstractC5184.m10206(r10)
            goto L5b
        L40:
            kotlin.AbstractC5184.m10206(r10)
            io.ktor.server.routing.飘花落叶言子世楪苏哲兰 r10 = new io.ktor.server.routing.飘花落叶言子世楪苏哲兰
            java.lang.Object r2 = r9.f12660
            io.ktor.server.application.飘花落叶言子楪哲苏世兰 r2 = (io.ktor.server.application.InterfaceC4064) r2
            java.util.ArrayList r7 = r8.f12563
            r10.<init>(r8, r2, r7)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r6
            java.lang.Object r10 = r10.m8539(r0)
            if (r10 != r1) goto L5b
            goto L73
        L5b:
            io.ktor.server.routing.飘花落叶言子世楪哲兰苏 r10 = (io.ktor.server.routing.AbstractC4138) r10
            boolean r2 = r10 instanceof io.ktor.server.routing.C4139
            if (r2 == 0) goto L75
            io.ktor.server.routing.飘花落叶言子楪兰世哲苏 r2 = r10.f12542
            io.ktor.server.routing.飘花落叶言子世楪哲苏兰 r10 = (io.ktor.server.routing.C4139) r10
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪兰苏哲 r10 = r10.f12544
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r5
            java.lang.Object r8 = r8.m8544(r9, r2, r10, r0)
            if (r8 != r1) goto L74
        L73:
            return r1
        L74:
            return r3
        L75:
            boolean r8 = r10 instanceof io.ktor.server.routing.C4140
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r9.f12660
            io.ktor.server.application.飘花落叶言子楪哲苏世兰 r8 = (io.ktor.server.application.InterfaceC4064) r8
            io.ktor.util.飘花落叶言子楪世兰哲苏 r8 = r8.getAttributes()
            io.ktor.util.飘花落叶言子楪世苏哲兰 r9 = io.ktor.server.routing.AbstractC4143.f12558
            io.ktor.server.routing.飘花落叶言子世楪苏兰哲 r10 = (io.ktor.server.routing.C4140) r10
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰 r10 = r10.f12545
            r8.m8596(r9, r10)
            return r3
        L8b:
            io.ktor.util.C4210.m8621()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.routing.C4144.m8543(io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8544(io.ktor.util.pipeline.AbstractC4193 r17, io.ktor.server.routing.C4153 r18, p236.InterfaceC8094 r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.routing.C4144.m8544(io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏, io.ktor.server.routing.飘花落叶言子楪兰世哲苏, 飘花落叶言楪兰世哲子苏.飘花落叶言子世楪兰苏哲, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
