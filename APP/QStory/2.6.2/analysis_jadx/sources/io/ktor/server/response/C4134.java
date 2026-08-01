package io.ktor.server.response;

import io.ktor.util.pipeline.AbstractC4194;
import io.ktor.util.pipeline.C4191;

/* JADX INFO: renamed from: io.ktor.server.response.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4134 extends AbstractC4194 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f12532;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C4191 f12531 = new C4191("Before");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C4191 f12529 = new C4191("Transform");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C4191 f12530 = new C4191("Render");

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C4191 f12528 = new C4191("ContentEncoding");

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C4191 f12527 = new C4191("TransferEncoding");

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C4191 f12526 = new C4191("After");

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C4191 f12525 = new C4191("Engine");

    public C4134(boolean z) {
        super(f12531, f12529, f12530, f12528, f12527, f12526, f12525);
        this.f12532 = z;
    }

    @Override // io.ktor.util.pipeline.AbstractC4194
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo8468() {
        return this.f12532;
    }
}
