package io.ktor.server.engine;

import io.ktor.server.request.C4130;
import io.ktor.server.response.C4135;
import io.ktor.util.pipeline.AbstractC4195;
import io.ktor.util.pipeline.C4192;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4103 extends AbstractC4195 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C4135 f12469;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f12470;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C4130 f12471;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C4192 f12468 = new C4192("before");

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C4192 f12467 = new C4192("call");

    public C4103(boolean z) {
        super(f12468, f12467);
        this.f12470 = z;
        this.f12471 = new C4130(z);
        this.f12469 = new C4135(z);
    }

    @Override // io.ktor.util.pipeline.AbstractC4195
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo8458() {
        return this.f12470;
    }
}
