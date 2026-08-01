package io.ktor.http.content;

import java.nio.charset.Charset;
import kotlin.text.AbstractC5132;
import kotlin.text.AbstractC5144;
import p018.AbstractC6253;
import p058.AbstractC6855;
import p236.C8097;
import p236.C8125;

/* JADX INFO: renamed from: io.ktor.http.content.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3983 extends AbstractC3996 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final byte[] f12233;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8097 f12234;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8125 f12235;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f12236;

    public C3983(String str, C8125 c8125, C8097 c8097) {
        str.getClass();
        c8125.getClass();
        this.f12236 = str;
        this.f12235 = c8125;
        this.f12234 = c8097;
        Charset charsetM11741 = AbstractC6253.m11741(c8125);
        this.f12233 = AbstractC6855.m12084(str, charsetM11741 == null ? AbstractC5132.f14688 : charsetM11741);
    }

    public final String toString() {
        return "TextContent[" + this.f12235 + "] \"" + AbstractC5144.m10153(30, this.f12236) + '\"';
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C8097 mo8280() {
        return this.f12234;
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8125 mo8283() {
        return this.f12235;
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Long mo8284() {
        return Long.valueOf(this.f12233.length);
    }

    @Override // io.ktor.http.content.AbstractC3996
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final byte[] mo8287() {
        return this.f12233;
    }
}
