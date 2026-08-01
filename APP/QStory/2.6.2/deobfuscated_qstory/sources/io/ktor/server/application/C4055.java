package io.ktor.server.application;

import io.ktor.server.request.C4129;
import io.ktor.server.response.C4134;
import io.ktor.util.pipeline.AbstractC4194;
import io.ktor.util.pipeline.C4191;

/* JADX INFO: renamed from: io.ktor.server.application.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C4055 extends AbstractC4194 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C4129 f12334;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C4134 f12335;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f12336;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC4054 f12337;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C4191 f12333 = new C4191("Setup");

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C4191 f12332 = new C4191("Monitoring");

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C4191 f12331 = new C4191("Plugins");

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C4191 f12330 = new C4191("Call");

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final C4191 f12329 = new C4191("Fallback");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4055(boolean z, InterfaceC4054 interfaceC4054) {
        super(f12333, f12332, f12331, f12330, f12329);
        interfaceC4054.getClass();
        this.f12336 = z;
        this.f12337 = interfaceC4054;
        this.f12334 = new C4129(z);
        this.f12335 = new C4134(z);
    }

    @Override // io.ktor.util.pipeline.AbstractC4194
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean mo8468() {
        return this.f12336;
    }
}
