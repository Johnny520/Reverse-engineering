package io.ktor.server.request;

import io.ktor.util.pipeline.AbstractC4194;
import io.ktor.util.pipeline.C4191;

/* JADX INFO: renamed from: io.ktor.server.request.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4129 extends AbstractC4194 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f12521;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C4191 f12520 = new C4191("Before");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C4191 f12518 = new C4191("Transform");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C4191 f12519 = new C4191("After");

    public C4129(boolean z) {
        super(f12520, f12518, f12519);
        this.f12521 = z;
    }

    @Override // io.ktor.util.pipeline.AbstractC4194
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo8468() {
        return this.f12521;
    }
}
