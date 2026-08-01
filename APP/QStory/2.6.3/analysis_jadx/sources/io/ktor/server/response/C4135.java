package io.ktor.server.response;

import io.ktor.util.pipeline.AbstractC4195;
import io.ktor.util.pipeline.C4192;

/* JADX INFO: renamed from: io.ktor.server.response.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4135 extends AbstractC4195 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f12536;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C4192 f12535 = new C4192("Before");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C4192 f12533 = new C4192("Transform");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C4192 f12534 = new C4192("Render");

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C4192 f12532 = new C4192("ContentEncoding");

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C4192 f12531 = new C4192("TransferEncoding");

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C4192 f12530 = new C4192("After");

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C4192 f12529 = new C4192("Engine");

    public C4135(boolean z) {
        super(f12535, f12533, f12534, f12532, f12531, f12530, f12529);
        this.f12536 = z;
    }

    @Override // io.ktor.util.pipeline.AbstractC4195
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo8458() {
        return this.f12536;
    }
}
