package io.ktor.server.engine;

import io.ktor.server.application.InterfaceC4053;
import io.ktor.util.C4209;
import io.ktor.util.pipeline.AbstractC4195;
import io.ktor.util.pipeline.InvalidPhaseException;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import p052.InterfaceC6558;
import p059.C6857;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4100 implements InterfaceC4053 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4209 f12447;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4100 f12448 = new C4100();

    static {
        InterfaceC5087 interfaceC5087M8912;
        InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(C4097.class);
        try {
            interfaceC5087M8912 = AbstractC4396.m8912(C4097.class);
        } catch (Throwable unused) {
            interfaceC5087M8912 = null;
        }
        f12447 = new C4209("shutdown.url", new C6857(interfaceC5093Mo8917, interfaceC5087M8912));
    }

    @Override // io.ktor.server.application.InterfaceC4063
    public final C4209 getKey() {
        return f12447;
    }

    @Override // io.ktor.server.application.InterfaceC4063
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo8467(AbstractC4195 abstractC4195, InterfaceC6558 interfaceC6558) throws InvalidPhaseException {
        C4103 c4103 = (C4103) abstractC4195;
        c4103.getClass();
        C4099 c4099 = new C4099();
        interfaceC6558.invoke(c4099);
        C4097 c4097 = new C4097(c4099.f12446, c4099.f12445);
        c4103.m8579(C4103.f12468, new ShutDownUrl$EnginePlugin$install$1(c4097, null));
        return c4097;
    }
}
