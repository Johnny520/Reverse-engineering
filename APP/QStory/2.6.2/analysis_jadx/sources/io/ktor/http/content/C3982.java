package io.ktor.http.content;

import java.nio.charset.Charset;
import kotlin.reflect.jvm.internal.AbstractC5061;
import kotlin.text.AbstractC5131;
import kotlin.text.AbstractC5143;
import p058.AbstractC6854;
import p236.C8096;
import p236.C8124;

/* JADX INFO: renamed from: io.ktor.http.content.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3982 extends AbstractC3995 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final byte[] f12229;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8096 f12230;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8124 f12231;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f12232;

    public C3982(String str, C8124 c8124, C8096 c8096) {
        str.getClass();
        c8124.getClass();
        this.f12232 = str;
        this.f12231 = c8124;
        this.f12230 = c8096;
        Charset charsetM10050 = AbstractC5061.m10050(c8124);
        this.f12229 = AbstractC6854.m12056(str, charsetM10050 == null ? AbstractC5131.f14688 : charsetM10050);
    }

    public final String toString() {
        return "TextContent[" + this.f12231 + "] \"" + AbstractC5143.m10149(30, this.f12232) + '\"';
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C8096 mo8290() {
        return this.f12230;
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8124 mo8293() {
        return this.f12231;
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Long mo8294() {
        return Long.valueOf(this.f12229.length);
    }

    @Override // io.ktor.http.content.AbstractC3995
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final byte[] mo8297() {
        return this.f12229;
    }
}
