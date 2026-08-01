package io.ktor.client.plugins;

import io.ktor.http.content.AbstractC4828;
import p252.AbstractC8938;
import p252.C8954;

/* JADX INFO: renamed from: io.ktor.client.plugins.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4752 extends AbstractC4828 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ Object f12477;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f12478;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8954 f12479;

    public C4752(C8954 c8954, Object obj) {
        this.f12477 = obj;
        if (c8954 == null) {
            C8954 c89542 = AbstractC8938.f22744;
            c8954 = AbstractC8938.f22740;
        }
        this.f12479 = c8954;
        this.f12478 = ((byte[]) obj).length;
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8954 mo8842() {
        return this.f12479;
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Long mo8843() {
        return Long.valueOf(this.f12478);
    }

    @Override // io.ktor.http.content.AbstractC4828
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final byte[] mo8846() {
        return (byte[]) this.f12477;
    }
}
