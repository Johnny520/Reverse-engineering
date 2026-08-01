package io.ktor.server.application;

import androidx.activity.AbstractC0900;
import androidx.window.area.C3391;
import io.ktor.server.routing.C4986;
import io.ktor.server.websocket.C5014;
import io.ktor.server.websocket.C5015;
import io.ktor.util.C5036;
import io.ktor.util.C5041;
import io.ktor.util.pipeline.AbstractC5027;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import p068.InterfaceC7387;
import p075.C7686;

/* JADX INFO: renamed from: io.ktor.server.application.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4886 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5041 f12677;

    static {
        InterfaceC5919 interfaceC5919M9471;
        InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C5036.class);
        try {
            interfaceC5919M9471 = AbstractC5228.m9471(C5036.class);
        } catch (Throwable unused) {
            interfaceC5919M9471 = null;
        }
        f12677 = new C5041("ApplicationPluginRegistry", new C7686(interfaceC5925Mo9476, interfaceC5919M9471));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Object m9013(AbstractC5027 abstractC5027, InterfaceC4895 interfaceC4895) {
        abstractC5027.getClass();
        interfaceC4895.getClass();
        return m9016(abstractC5027).m9146(interfaceC4895.getKey());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object m9014(C4890 c4890) {
        C5015 c5015 = C5014.f12991;
        c4890.getClass();
        Object objM9013 = m9013(c4890, c5015);
        if (objM9013 != null) {
            return objM9013;
        }
        throw new MissingApplicationPluginException(C5014.f12992);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object m9015(AbstractC5027 abstractC5027, InterfaceC4885 interfaceC4885, InterfaceC7387 interfaceC7387) throws DuplicatePluginException {
        abstractC5027.getClass();
        if ((abstractC5027 instanceof C4986) && (interfaceC4885 instanceof InterfaceC4900)) {
            m9016((C4986) abstractC5027).m9146(null);
            throw null;
        }
        C5036 c5036M9016 = m9016(abstractC5027);
        Object objM9146 = c5036M9016.m9146(interfaceC4885.getKey());
        if (objM9146 == null) {
            Object objMo9026 = interfaceC4885.mo9026(abstractC5027, interfaceC7387);
            c5036M9016.m9145(interfaceC4885.getKey(), objMo9026);
            return objMo9026;
        }
        if (objM9146.equals(interfaceC4885)) {
            return objM9146;
        }
        throw new DuplicatePluginException(AbstractC0900.m708(new StringBuilder("Please make sure that you use unique name for the plugin and don't install it twice. Conflicting application plugin is already installed with the same key as `"), interfaceC4885.getKey().f13044, '`'));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5036 m9016(AbstractC5027 abstractC5027) {
        abstractC5027.getClass();
        return (C5036) abstractC5027.f13014.m9149(f12677, new C3391(3));
    }
}
