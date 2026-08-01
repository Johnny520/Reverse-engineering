package io.ktor.server.engine;

import io.ktor.server.application.InterfaceC4885;
import io.ktor.util.C5041;
import io.ktor.util.pipeline.AbstractC5027;
import io.ktor.util.pipeline.InvalidPhaseException;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import p068.InterfaceC7387;
import p075.C7686;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4932 implements InterfaceC4885 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5041 f12792;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4932 f12793 = new C4932();

    static {
        InterfaceC5919 interfaceC5919M9471;
        InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C4929.class);
        try {
            interfaceC5919M9471 = AbstractC5228.m9471(C4929.class);
        } catch (Throwable unused) {
            interfaceC5919M9471 = null;
        }
        f12792 = new C5041("shutdown.url", new C7686(interfaceC5925Mo9476, interfaceC5919M9471));
    }

    @Override // io.ktor.server.application.InterfaceC4895
    public final C5041 getKey() {
        return f12792;
    }

    @Override // io.ktor.server.application.InterfaceC4895
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo9026(AbstractC5027 abstractC5027, InterfaceC7387 interfaceC7387) throws InvalidPhaseException {
        C4935 c4935 = (C4935) abstractC5027;
        c4935.getClass();
        C4931 c4931 = new C4931();
        interfaceC7387.invoke(c4931);
        C4929 c4929 = new C4929(c4931.f12791, c4931.f12790);
        c4935.m9138(C4935.f12813, new ShutDownUrl$EnginePlugin$install$1(c4929, null));
        return c4929;
    }
}
