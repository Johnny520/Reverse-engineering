package io.ktor.server.request;

import io.ktor.util.pipeline.AbstractC5027;
import io.ktor.util.pipeline.C5024;

/* JADX INFO: renamed from: io.ktor.server.request.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4962 extends AbstractC5027 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f12870;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C5024 f12869 = new C5024("Before");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C5024 f12867 = new C5024("Transform");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C5024 f12868 = new C5024("After");

    public C4962(boolean z) {
        super(f12869, f12867, f12868);
        this.f12870 = z;
    }

    @Override // io.ktor.util.pipeline.AbstractC5027
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo9017() {
        return this.f12870;
    }
}
