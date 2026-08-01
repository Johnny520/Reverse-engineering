package io.ktor.server.application;

import androidx.activity.AbstractC0053;
import androidx.window.area.C2558;
import io.ktor.server.routing.C4154;
import io.ktor.server.websocket.C4182;
import io.ktor.server.websocket.C4183;
import io.ktor.util.C4204;
import io.ktor.util.C4209;
import io.ktor.util.pipeline.AbstractC4195;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import p052.InterfaceC6558;
import p059.C6857;

/* JADX INFO: renamed from: io.ktor.server.application.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4054 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4209 f12332;

    static {
        InterfaceC5087 interfaceC5087M8912;
        InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(C4204.class);
        try {
            interfaceC5087M8912 = AbstractC4396.m8912(C4204.class);
        } catch (Throwable unused) {
            interfaceC5087M8912 = null;
        }
        f12332 = new C4209("ApplicationPluginRegistry", new C6857(interfaceC5093Mo8917, interfaceC5087M8912));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Object m8454(AbstractC4195 abstractC4195, InterfaceC4063 interfaceC4063) {
        abstractC4195.getClass();
        interfaceC4063.getClass();
        return m8457(abstractC4195).m8587(interfaceC4063.getKey());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object m8455(C4058 c4058) {
        C4183 c4183 = C4182.f12646;
        c4058.getClass();
        Object objM8454 = m8454(c4058, c4183);
        if (objM8454 != null) {
            return objM8454;
        }
        throw new MissingApplicationPluginException(C4182.f12647);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object m8456(AbstractC4195 abstractC4195, InterfaceC4053 interfaceC4053, InterfaceC6558 interfaceC6558) throws DuplicatePluginException {
        abstractC4195.getClass();
        if ((abstractC4195 instanceof C4154) && (interfaceC4053 instanceof InterfaceC4068)) {
            m8457((C4154) abstractC4195).m8587(null);
            throw null;
        }
        C4204 c4204M8457 = m8457(abstractC4195);
        Object objM8587 = c4204M8457.m8587(interfaceC4053.getKey());
        if (objM8587 == null) {
            Object objMo8467 = interfaceC4053.mo8467(abstractC4195, interfaceC6558);
            c4204M8457.m8586(interfaceC4053.getKey(), objMo8467);
            return objMo8467;
        }
        if (objM8587.equals(interfaceC4053)) {
            return objM8587;
        }
        throw new DuplicatePluginException(AbstractC0053.m148(new StringBuilder("Please make sure that you use unique name for the plugin and don't install it twice. Conflicting application plugin is already installed with the same key as `"), interfaceC4053.getKey().f12699, '`'));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4204 m8457(AbstractC4195 abstractC4195) {
        abstractC4195.getClass();
        return (C4204) abstractC4195.f12669.m8590(f12332, new C2558(3));
    }
}
