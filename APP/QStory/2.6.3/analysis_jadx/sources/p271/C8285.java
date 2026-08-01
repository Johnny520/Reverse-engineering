package p271;

import com.google.gson.AbstractC3251;
import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import p259.C8244;
import p259.C8245;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8285 extends AbstractC3251 {
    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7322(C8244 c8244, Object obj) throws IOException {
        URI uri = (URI) obj;
        c8244.m13771(uri == null ? null : uri.toASCIIString());
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7323(C8245 c8245) throws IOException {
        if (c8245.m13787() == JsonToken.NULL) {
            c8245.m13793();
            return null;
        }
        try {
            String strM13789 = c8245.m13789();
            if (strM13789.equals("null")) {
                return null;
            }
            return new URI(strM13789);
        } catch (URISyntaxException e) {
            throw new JsonIOException(e);
        }
    }
}
