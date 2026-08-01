package p271;

import com.google.gson.AbstractC3250;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.AbstractC3220;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.math.BigInteger;
import p007.AbstractC6136;
import p259.C8243;
import p259.C8244;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C8297 extends AbstractC3250 {
    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7335(C8243 c8243, Object obj) throws IOException {
        c8243.m13751((BigInteger) obj);
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7336(C8244 c8244) throws IOException {
        if (c8244.m13770() == JsonToken.NULL) {
            c8244.m13775();
            return null;
        }
        String strM13771 = c8244.m13771();
        try {
            AbstractC3220.m7323(strM13771);
            return new BigInteger(strM13771);
        } catch (NumberFormatException e) {
            StringBuilder sbM11550 = AbstractC6136.m11550("Failed parsing '", strM13771, "' as BigInteger; at path ");
            sbM11550.append(c8244.m13789(true));
            throw new JsonSyntaxException(sbM11550.toString(), e);
        }
    }
}
