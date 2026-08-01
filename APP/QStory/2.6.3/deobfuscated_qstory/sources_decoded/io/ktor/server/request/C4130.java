package io.ktor.server.request;

import io.ktor.util.pipeline.AbstractC4195;
import io.ktor.util.pipeline.C4192;

/* JADX INFO: renamed from: io.ktor.server.request.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4130 extends AbstractC4195 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f12525;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C4192 f12524 = new C4192("Before");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C4192 f12522 = new C4192("Transform");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C4192 f12523 = new C4192("After");

    public C4130(boolean z) {
        super(f12524, f12522, f12523);
        this.f12525 = z;
    }

    @Override // io.ktor.util.pipeline.AbstractC4195
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo8458() {
        return this.f12525;
    }
}
