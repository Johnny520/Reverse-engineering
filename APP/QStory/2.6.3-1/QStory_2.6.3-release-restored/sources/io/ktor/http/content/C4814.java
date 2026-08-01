package io.ktor.http.content;

import io.ktor.util.cio.AbstractC5018;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import p034.AbstractC7082;
import p252.C8954;

/* JADX INFO: renamed from: io.ktor.http.content.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4814 extends AbstractC4826 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8954 f12576;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final URI f12577;

    public C4814(URL url, C8954 c8954) throws URISyntaxException {
        url.getClass();
        c8954.getClass();
        URI uri = url.toURI();
        uri.getClass();
        this.f12577 = uri;
        this.f12576 = c8954;
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8954 mo8842() {
        return this.f12576;
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Long mo8843() {
        return null;
    }

    @Override // io.ktor.http.content.AbstractC4826
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC5084 mo8845() throws IOException {
        InputStream inputStreamOpenStream = this.f12577.toURL().openStream();
        inputStreamOpenStream.getClass();
        return AbstractC7082.m12305(inputStreamOpenStream, AbstractC5018.f12999);
    }
}
