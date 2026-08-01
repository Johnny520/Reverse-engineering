package io.ktor.server.response;

import io.ktor.util.pipeline.AbstractC5027;
import io.ktor.util.pipeline.C5024;

/* JADX INFO: renamed from: io.ktor.server.response.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4967 extends AbstractC5027 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f12881;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C5024 f12880 = new C5024("Before");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C5024 f12878 = new C5024("Transform");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C5024 f12879 = new C5024("Render");

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C5024 f12877 = new C5024("ContentEncoding");

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C5024 f12876 = new C5024("TransferEncoding");

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C5024 f12875 = new C5024("After");

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C5024 f12874 = new C5024("Engine");

    public C4967(boolean z) {
        super(f12880, f12878, f12879, f12877, f12876, f12875, f12874);
        this.f12881 = z;
    }

    @Override // io.ktor.util.pipeline.AbstractC5027
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo9017() {
        return this.f12881;
    }
}
