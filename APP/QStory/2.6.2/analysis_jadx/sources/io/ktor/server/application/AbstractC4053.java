package io.ktor.server.application;

import androidx.activity.AbstractC0053;
import androidx.window.area.C2558;
import io.ktor.server.routing.C4153;
import io.ktor.server.websocket.C4181;
import io.ktor.server.websocket.C4182;
import io.ktor.util.C4203;
import io.ktor.util.C4208;
import io.ktor.util.pipeline.AbstractC4194;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5092;
import p052.InterfaceC6557;
import p059.C6856;

/* JADX INFO: renamed from: io.ktor.server.application.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4053 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4208 f12328;

    static {
        InterfaceC5086 interfaceC5086M8922;
        InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(C4203.class);
        try {
            interfaceC5086M8922 = AbstractC4395.m8922(C4203.class);
        } catch (Throwable unused) {
            interfaceC5086M8922 = null;
        }
        f12328 = new C4208("ApplicationPluginRegistry", new C6856(interfaceC5092Mo8927, interfaceC5086M8922));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Object m8464(AbstractC4194 abstractC4194, InterfaceC4062 interfaceC4062) {
        abstractC4194.getClass();
        interfaceC4062.getClass();
        return m8467(abstractC4194).m8597(interfaceC4062.getKey());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object m8465(C4057 c4057) {
        C4182 c4182 = C4181.f12642;
        c4057.getClass();
        Object objM8464 = m8464(c4057, c4182);
        if (objM8464 != null) {
            return objM8464;
        }
        throw new MissingApplicationPluginException(C4181.f12643);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object m8466(AbstractC4194 abstractC4194, InterfaceC4052 interfaceC4052, InterfaceC6557 interfaceC6557) throws DuplicatePluginException {
        abstractC4194.getClass();
        if ((abstractC4194 instanceof C4153) && (interfaceC4052 instanceof InterfaceC4067)) {
            m8467((C4153) abstractC4194).m8597(null);
            throw null;
        }
        C4203 c4203M8467 = m8467(abstractC4194);
        Object objM8597 = c4203M8467.m8597(interfaceC4052.getKey());
        if (objM8597 == null) {
            Object objMo8477 = interfaceC4052.mo8477(abstractC4194, interfaceC6557);
            c4203M8467.m8596(interfaceC4052.getKey(), objMo8477);
            return objMo8477;
        }
        if (objM8597.equals(interfaceC4052)) {
            return objM8597;
        }
        throw new DuplicatePluginException(AbstractC0053.m155(new StringBuilder("Please make sure that you use unique name for the plugin and don't install it twice. Conflicting application plugin is already installed with the same key as `"), interfaceC4052.getKey().f12695, '`'));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4203 m8467(AbstractC4194 abstractC4194) {
        abstractC4194.getClass();
        return (C4203) abstractC4194.f12665.m8600(f12328, new C2558(3));
    }
}
