package io.ktor.client.plugins;

import io.ktor.http.content.AbstractC3996;
import p236.AbstractC8109;
import p236.C8125;

/* JADX INFO: renamed from: io.ktor.client.plugins.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3920 extends AbstractC3996 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ Object f12132;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f12133;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8125 f12134;

    public C3920(C8125 c8125, Object obj) {
        this.f12132 = obj;
        if (c8125 == null) {
            C8125 c81252 = AbstractC8109.f22399;
            c8125 = AbstractC8109.f22395;
        }
        this.f12134 = c8125;
        this.f12133 = ((byte[]) obj).length;
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8125 mo8283() {
        return this.f12134;
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Long mo8284() {
        return Long.valueOf(this.f12133);
    }

    @Override // io.ktor.http.content.AbstractC3996
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final byte[] mo8287() {
        return (byte[]) this.f12132;
    }
}
