package io.ktor.http.content;

import io.ktor.util.cio.AbstractC4185;
import io.ktor.utils.io.InterfaceC4251;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import p175.AbstractC7738;
import p236.C8124;

/* JADX INFO: renamed from: io.ktor.http.content.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3981 extends AbstractC3993 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8124 f12227;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final URI f12228;

    public C3981(URL url, C8124 c8124) throws URISyntaxException {
        url.getClass();
        c8124.getClass();
        URI uri = url.toURI();
        uri.getClass();
        this.f12228 = uri;
        this.f12227 = c8124;
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8124 mo8293() {
        return this.f12227;
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Long mo8294() {
        return null;
    }

    @Override // io.ktor.http.content.AbstractC3993
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC4251 mo8296() throws IOException {
        InputStream inputStreamOpenStream = this.f12228.toURL().openStream();
        inputStreamOpenStream.getClass();
        return AbstractC7738.m13019(inputStreamOpenStream, AbstractC4185.f12650);
    }
}
