package io.ktor.server.engine;

import io.ktor.server.request.C4962;
import io.ktor.server.response.C4967;
import io.ktor.util.pipeline.AbstractC5027;
import io.ktor.util.pipeline.C5024;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4935 extends AbstractC5027 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C4967 f12814;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f12815;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C4962 f12816;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C5024 f12813 = new C5024("before");

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C5024 f12812 = new C5024("call");

    public C4935(boolean z) {
        super(f12813, f12812);
        this.f12815 = z;
        this.f12816 = new C4962(z);
        this.f12814 = new C4967(z);
    }

    @Override // io.ktor.util.pipeline.AbstractC5027
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo9017() {
        return this.f12815;
    }
}
