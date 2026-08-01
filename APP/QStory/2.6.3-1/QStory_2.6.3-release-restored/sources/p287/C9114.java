package p287;

import com.google.gson.AbstractC4083;
import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import p275.C9073;
import p275.C9074;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C9114 extends AbstractC4083 {
    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7881(C9073 c9073, Object obj) throws IOException {
        URI uri = (URI) obj;
        c9073.m14330(uri == null ? null : uri.toASCIIString());
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7882(C9074 c9074) throws IOException {
        if (c9074.m14346() == JsonToken.NULL) {
            c9074.m14352();
            return null;
        }
        try {
            String strM14348 = c9074.m14348();
            if (strM14348.equals("null")) {
                return null;
            }
            return new URI(strM14348);
        } catch (URISyntaxException e) {
            throw new JsonIOException(e);
        }
    }
}
