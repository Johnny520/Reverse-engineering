package io.ktor.http.content;

import p236.C8096;
import p236.C8124;

/* JADX INFO: renamed from: io.ktor.http.content.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3979 extends AbstractC3995 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8096 f12223;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8124 f12224;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final byte[] f12225;

    public C3979(byte[] bArr, C8124 c8124, C8096 c8096) {
        bArr.getClass();
        this.f12225 = bArr;
        this.f12224 = c8124;
        this.f12223 = c8096;
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C8096 mo8290() {
        return this.f12223;
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8124 mo8293() {
        return this.f12224;
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Long mo8294() {
        return Long.valueOf(this.f12225.length);
    }

    @Override // io.ktor.http.content.AbstractC3995
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final byte[] mo8297() {
        return this.f12225;
    }
}
