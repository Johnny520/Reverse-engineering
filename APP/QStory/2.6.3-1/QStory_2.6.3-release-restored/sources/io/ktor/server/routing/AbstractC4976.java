package io.ktor.server.routing;

import io.ktor.server.application.C4890;
import io.ktor.util.C5041;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import p075.C7686;
import p252.C8926;
import p414.AbstractC9968;
import p414.InterfaceC9970;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4976 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC9970 f12906;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5041 f12907;

    static {
        InterfaceC5919 interfaceC5919M9471;
        InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C8926.class);
        try {
            interfaceC5919M9471 = AbstractC5228.m9471(C8926.class);
        } catch (Throwable unused) {
            interfaceC5919M9471 = null;
        }
        f12907 = new C5041("RoutingFailureStatusCode", new C7686(interfaceC5925Mo9476, interfaceC5919M9471));
        InterfaceC9970 interfaceC9970M15262 = AbstractC9968.m15262("io.ktor.server.routing.Routing");
        interfaceC9970M15262.getClass();
        f12906 = interfaceC9970M15262;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4890 m9091(InterfaceC5000 interfaceC5000) {
        C4890 c4890M9091;
        interfaceC5000.getClass();
        if (interfaceC5000 instanceof C4977) {
            return ((C4977) interfaceC5000).f12913;
        }
        C4986 c4986 = ((C4986) interfaceC5000).f12923;
        if (c4986 != null && (c4890M9091 = m9091(c4986)) != null) {
            return c4890M9091;
        }
        C6755.m11867("Cannot retrieve application from unattached routing entry");
        return null;
    }
}
