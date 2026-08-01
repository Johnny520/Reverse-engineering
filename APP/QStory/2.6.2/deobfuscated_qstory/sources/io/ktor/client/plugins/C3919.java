package io.ktor.client.plugins;

import io.ktor.http.content.AbstractC3995;
import p236.AbstractC8108;
import p236.C8124;

/* JADX INFO: renamed from: io.ktor.client.plugins.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3919 extends AbstractC3995 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ Object f12127;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f12128;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8124 f12129;

    public C3919(C8124 c8124, Object obj) {
        this.f12127 = obj;
        if (c8124 == null) {
            C8124 c81242 = AbstractC8108.f22401;
            c8124 = AbstractC8108.f22397;
        }
        this.f12129 = c8124;
        this.f12128 = ((byte[]) obj).length;
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8124 mo8293() {
        return this.f12129;
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Long mo8294() {
        return Long.valueOf(this.f12128);
    }

    @Override // io.ktor.http.content.AbstractC3995
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final byte[] mo8297() {
        return (byte[]) this.f12127;
    }
}
