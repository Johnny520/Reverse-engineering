package p287;

import com.google.gson.AbstractC4083;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p275.C9073;
import p275.C9074;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C9129 extends AbstractC4083 {
    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7881(C9073 c9073, Object obj) throws IOException {
        c9073.m14330((String) obj);
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7882(C9074 c9074) throws IOException {
        JsonToken jsonTokenM14346 = c9074.m14346();
        if (jsonTokenM14346 != JsonToken.NULL) {
            return jsonTokenM14346 == JsonToken.BOOLEAN ? Boolean.toString(c9074.m14357()) : c9074.m14348();
        }
        c9074.m14352();
        return null;
    }
}
