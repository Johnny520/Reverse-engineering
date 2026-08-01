package p271;

import com.google.gson.AbstractC3251;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.UUID;
import p009.AbstractC6183;
import p259.C8244;
import p259.C8245;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8282 extends AbstractC3251 {
    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7322(C8244 c8244, Object obj) throws IOException {
        UUID uuid = (UUID) obj;
        c8244.m13771(uuid == null ? null : uuid.toString());
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7323(C8245 c8245) throws IOException {
        if (c8245.m13787() == JsonToken.NULL) {
            c8245.m13793();
            return null;
        }
        String strM13789 = c8245.m13789();
        try {
            return UUID.fromString(strM13789);
        } catch (IllegalArgumentException e) {
            StringBuilder sbM11585 = AbstractC6183.m11585("Failed parsing '", strM13789, "' as UUID; at path ");
            sbM11585.append(c8245.m13807(true));
            throw new JsonSyntaxException(sbM11585.toString(), e);
        }
    }
}
