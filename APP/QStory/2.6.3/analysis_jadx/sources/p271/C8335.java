package p271;

import com.google.gson.AbstractC3251;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p259.C8244;
import p259.C8245;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8335 extends AbstractC3251 {
    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7322(C8244 c8244, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            c8244.m13778();
            return;
        }
        c8244.m13767();
        c8244.m13774();
        c8244.f22796.write(bool.booleanValue() ? "true" : "false");
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7323(C8245 c8245) throws IOException {
        JsonToken jsonTokenM13787 = c8245.m13787();
        if (jsonTokenM13787 != JsonToken.NULL) {
            return jsonTokenM13787 == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(c8245.m13789())) : Boolean.valueOf(c8245.m13798());
        }
        c8245.m13793();
        return null;
    }
}
