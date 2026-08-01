package io.ktor.server.routing;

import io.ktor.server.application.AbstractC4059;
import io.ktor.util.C4208;
import kotlin.C5175;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5092;
import kotlin.text.AbstractC5143;
import p059.C6856;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4208 f12572;

    static {
        InterfaceC5086 interfaceC5086M8922;
        InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(C5175.class);
        try {
            interfaceC5086M8922 = AbstractC4395.m8922(C5175.class);
        } catch (Throwable unused) {
            interfaceC5086M8922 = null;
        }
        f12572 = new C4208("IgnoreTrailingSlashAttributeKey", new C6856(interfaceC5092Mo8927, interfaceC5086M8922));
        AbstractC4395.f12971.mo8927(AbstractC4059.class);
        try {
            AbstractC4395.m8922(AbstractC4059.class);
        } catch (Throwable unused2) {
        }
        if (AbstractC5143.m10164("IgnoreTrailingSlash")) {
            C5919.m11249("Name can't be blank");
        }
    }
}
