package io.ktor.http.content;

import p236.C8097;
import p236.C8125;

/* JADX INFO: renamed from: io.ktor.http.content.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3980 extends AbstractC3996 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8097 f12227;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8125 f12228;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final byte[] f12229;

    public C3980(byte[] bArr, C8125 c8125, C8097 c8097) {
        bArr.getClass();
        this.f12229 = bArr;
        this.f12228 = c8125;
        this.f12227 = c8097;
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C8097 mo8280() {
        return this.f12227;
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8125 mo8283() {
        return this.f12228;
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Long mo8284() {
        return Long.valueOf(this.f12229.length);
    }

    @Override // io.ktor.http.content.AbstractC3996
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final byte[] mo8287() {
        return this.f12229;
    }
}
