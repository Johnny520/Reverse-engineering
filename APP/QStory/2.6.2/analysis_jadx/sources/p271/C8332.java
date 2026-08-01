package p271;

import androidx.activity.AbstractC0053;
import com.google.gson.AbstractC3250;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p259.C8243;
import p259.C8244;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C8332 extends AbstractC3250 {
    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7335(C8243 c8243, Object obj) throws IOException {
        if (((Number) obj) == null) {
            c8243.m13762();
        } else {
            c8243.m13752(r4.byteValue());
        }
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7336(C8244 c8244) throws IOException {
        if (c8244.m13770() == JsonToken.NULL) {
            c8244.m13775();
            return null;
        }
        try {
            int iM13782 = c8244.m13782();
            if (iM13782 <= 255 && iM13782 >= -128) {
                return Byte.valueOf((byte) iM13782);
            }
            StringBuilder sbM148 = AbstractC0053.m148(iM13782, "Lossy conversion from ", " to byte; at path ");
            sbM148.append(c8244.m13789(true));
            throw new JsonSyntaxException(sbM148.toString());
        } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }
}
