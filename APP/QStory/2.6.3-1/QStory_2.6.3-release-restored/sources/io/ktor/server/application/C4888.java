package io.ktor.server.application;

import io.ktor.server.request.C4962;
import io.ktor.server.response.C4967;
import io.ktor.util.pipeline.AbstractC5027;
import io.ktor.util.pipeline.C5024;

/* JADX INFO: renamed from: io.ktor.server.application.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C4888 extends AbstractC5027 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C4962 f12683;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C4967 f12684;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f12685;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC4887 f12686;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C5024 f12682 = new C5024("Setup");

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C5024 f12681 = new C5024("Monitoring");

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C5024 f12680 = new C5024("Plugins");

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C5024 f12679 = new C5024("Call");

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final C5024 f12678 = new C5024("Fallback");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4888(boolean z, InterfaceC4887 interfaceC4887) {
        super(f12682, f12681, f12680, f12679, f12678);
        interfaceC4887.getClass();
        this.f12685 = z;
        this.f12686 = interfaceC4887;
        this.f12683 = new C4962(z);
        this.f12684 = new C4967(z);
    }

    @Override // io.ktor.util.pipeline.AbstractC5027
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean mo9017() {
        return this.f12685;
    }
}
