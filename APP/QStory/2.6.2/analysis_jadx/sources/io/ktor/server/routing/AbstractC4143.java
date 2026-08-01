package io.ktor.server.routing;

import io.ktor.server.application.C4057;
import io.ktor.util.C4208;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5092;
import p059.C6856;
import p236.C8096;
import p400.AbstractC9154;
import p400.InterfaceC9156;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4143 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC9156 f12557;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4208 f12558;

    static {
        InterfaceC5086 interfaceC5086M8922;
        InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(C8096.class);
        try {
            interfaceC5086M8922 = AbstractC4395.m8922(C8096.class);
        } catch (Throwable unused) {
            interfaceC5086M8922 = null;
        }
        f12558 = new C4208("RoutingFailureStatusCode", new C6856(interfaceC5092Mo8927, interfaceC5086M8922));
        InterfaceC9156 interfaceC9156M14712 = AbstractC9154.m14712("io.ktor.server.routing.Routing");
        interfaceC9156M14712.getClass();
        f12557 = interfaceC9156M14712;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4057 m8542(InterfaceC4167 interfaceC4167) {
        C4057 c4057M8542;
        interfaceC4167.getClass();
        if (interfaceC4167 instanceof C4144) {
            return ((C4144) interfaceC4167).f12564;
        }
        C4153 c4153 = ((C4153) interfaceC4167).f12574;
        if (c4153 != null && (c4057M8542 = m8542(c4153)) != null) {
            return c4057M8542;
        }
        C5919.m11247("Cannot retrieve application from unattached routing entry");
        return null;
    }
}
