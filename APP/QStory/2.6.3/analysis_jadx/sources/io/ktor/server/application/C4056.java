package io.ktor.server.application;

import io.ktor.server.request.C4130;
import io.ktor.server.response.C4135;
import io.ktor.util.pipeline.AbstractC4195;
import io.ktor.util.pipeline.C4192;

/* JADX INFO: renamed from: io.ktor.server.application.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C4056 extends AbstractC4195 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C4130 f12338;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C4135 f12339;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f12340;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC4055 f12341;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C4192 f12337 = new C4192("Setup");

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C4192 f12336 = new C4192("Monitoring");

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C4192 f12335 = new C4192("Plugins");

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C4192 f12334 = new C4192("Call");

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final C4192 f12333 = new C4192("Fallback");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4056(boolean z, InterfaceC4055 interfaceC4055) {
        super(f12337, f12336, f12335, f12334, f12333);
        interfaceC4055.getClass();
        this.f12340 = z;
        this.f12341 = interfaceC4055;
        this.f12338 = new C4130(z);
        this.f12339 = new C4135(z);
    }

    @Override // io.ktor.util.pipeline.AbstractC4195
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean mo8458() {
        return this.f12340;
    }
}
