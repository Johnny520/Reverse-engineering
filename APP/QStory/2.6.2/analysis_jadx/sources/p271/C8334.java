package p271;

import com.google.gson.AbstractC3250;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p259.C8243;
import p259.C8244;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C8334 extends AbstractC3250 {
    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7335(C8243 c8243, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            c8243.m13762();
            return;
        }
        c8243.m13750();
        c8243.m13757();
        c8243.f22797.write(bool.booleanValue() ? "true" : "false");
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7336(C8244 c8244) throws IOException {
        JsonToken jsonTokenM13770 = c8244.m13770();
        if (jsonTokenM13770 != JsonToken.NULL) {
            return jsonTokenM13770 == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(c8244.m13771())) : Boolean.valueOf(c8244.m13783());
        }
        c8244.m13775();
        return null;
    }
}
