package io.ktor.http.content;

import java.nio.charset.Charset;
import kotlin.text.AbstractC5964;
import kotlin.text.AbstractC5976;
import p034.AbstractC7082;
import p074.AbstractC7684;
import p252.C8926;
import p252.C8954;

/* JADX INFO: renamed from: io.ktor.http.content.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4815 extends AbstractC4828 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final byte[] f12578;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8926 f12579;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8954 f12580;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f12581;

    public C4815(String str, C8954 c8954, C8926 c8926) {
        str.getClass();
        c8954.getClass();
        this.f12581 = str;
        this.f12580 = c8954;
        this.f12579 = c8926;
        Charset charsetM12300 = AbstractC7082.m12300(c8954);
        this.f12578 = AbstractC7684.m12643(str, charsetM12300 == null ? AbstractC5964.f15033 : charsetM12300);
    }

    public final String toString() {
        return "TextContent[" + this.f12580 + "] \"" + AbstractC5976.m10712(30, this.f12581) + '\"';
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C8926 mo8839() {
        return this.f12579;
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8954 mo8842() {
        return this.f12580;
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Long mo8843() {
        return Long.valueOf(this.f12578.length);
    }

    @Override // io.ktor.http.content.AbstractC4828
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final byte[] mo8846() {
        return this.f12578;
    }
}
