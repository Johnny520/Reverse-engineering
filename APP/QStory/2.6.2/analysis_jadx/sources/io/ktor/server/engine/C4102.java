package io.ktor.server.engine;

import io.ktor.server.request.C4129;
import io.ktor.server.response.C4134;
import io.ktor.util.pipeline.AbstractC4194;
import io.ktor.util.pipeline.C4191;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4102 extends AbstractC4194 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C4134 f12465;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f12466;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C4129 f12467;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C4191 f12464 = new C4191("before");

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C4191 f12463 = new C4191("call");

    public C4102(boolean z) {
        super(f12464, f12463);
        this.f12466 = z;
        this.f12467 = new C4129(z);
        this.f12465 = new C4134(z);
    }

    @Override // io.ktor.util.pipeline.AbstractC4194
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo8468() {
        return this.f12466;
    }
}
