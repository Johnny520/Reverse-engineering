package io.ktor.http.content;

import io.ktor.util.cio.AbstractC4186;
import io.ktor.utils.io.InterfaceC4252;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import p018.AbstractC6253;
import p236.C8125;

/* JADX INFO: renamed from: io.ktor.http.content.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3982 extends AbstractC3994 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8125 f12231;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final URI f12232;

    public C3982(URL url, C8125 c8125) throws URISyntaxException {
        url.getClass();
        c8125.getClass();
        URI uri = url.toURI();
        uri.getClass();
        this.f12232 = uri;
        this.f12231 = c8125;
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8125 mo8283() {
        return this.f12231;
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Long mo8284() {
        return null;
    }

    @Override // io.ktor.http.content.AbstractC3994
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC4252 mo8286() throws IOException {
        InputStream inputStreamOpenStream = this.f12232.toURL().openStream();
        inputStreamOpenStream.getClass();
        return AbstractC6253.m11746(inputStreamOpenStream, AbstractC4186.f12654);
    }
}
