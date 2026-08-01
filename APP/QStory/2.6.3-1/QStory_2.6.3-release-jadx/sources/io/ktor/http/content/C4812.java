package io.ktor.http.content;

import p252.C8926;
import p252.C8954;

/* JADX INFO: renamed from: io.ktor.http.content.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4812 extends AbstractC4828 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8926 f12572;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8954 f12573;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final byte[] f12574;

    public C4812(byte[] bArr, C8954 c8954, C8926 c8926) {
        bArr.getClass();
        this.f12574 = bArr;
        this.f12573 = c8954;
        this.f12572 = c8926;
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C8926 mo8839() {
        return this.f12572;
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8954 mo8842() {
        return this.f12573;
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Long mo8843() {
        return Long.valueOf(this.f12574.length);
    }

    @Override // io.ktor.http.content.AbstractC4828
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final byte[] mo8846() {
        return this.f12574;
    }
}
