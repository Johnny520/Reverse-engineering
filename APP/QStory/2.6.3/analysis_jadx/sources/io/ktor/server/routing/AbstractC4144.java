package io.ktor.server.routing;

import io.ktor.server.application.C4058;
import io.ktor.util.C4209;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import p059.C6857;
import p236.C8097;
import p398.AbstractC9139;
import p398.InterfaceC9141;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4144 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC9141 f12561;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4209 f12562;

    static {
        InterfaceC5087 interfaceC5087M8912;
        InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(C8097.class);
        try {
            interfaceC5087M8912 = AbstractC4396.m8912(C8097.class);
        } catch (Throwable unused) {
            interfaceC5087M8912 = null;
        }
        f12562 = new C4209("RoutingFailureStatusCode", new C6857(interfaceC5093Mo8917, interfaceC5087M8912));
        InterfaceC9141 interfaceC9141M14703 = AbstractC9139.m14703("io.ktor.server.routing.Routing");
        interfaceC9141M14703.getClass();
        f12561 = interfaceC9141M14703;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4058 m8532(InterfaceC4168 interfaceC4168) {
        C4058 c4058M8532;
        interfaceC4168.getClass();
        if (interfaceC4168 instanceof C4145) {
            return ((C4145) interfaceC4168).f12568;
        }
        C4154 c4154 = ((C4154) interfaceC4168).f12578;
        if (c4154 != null && (c4058M8532 = m8532(c4154)) != null) {
            return c4058M8532;
        }
        C5925.m11308("Cannot retrieve application from unattached routing entry");
        return null;
    }
}
