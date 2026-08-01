package p271;

import androidx.activity.AbstractC0053;
import com.google.gson.AbstractC3250;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.BitSet;
import p259.C8243;
import p259.C8244;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C8279 extends AbstractC3250 {
    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7335(C8243 c8243, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        c8243.m13756();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            c8243.m13752(bitSet.get(i) ? 1L : 0L);
        }
        c8243.m13764();
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7336(C8244 c8244) throws IOException {
        BitSet bitSet = new BitSet();
        c8244.m13779();
        JsonToken jsonTokenM13770 = c8244.m13770();
        int i = 0;
        while (jsonTokenM13770 != JsonToken.END_ARRAY) {
            int i2 = AbstractC8330.f22992[jsonTokenM13770.ordinal()];
            boolean zM13783 = true;
            if (i2 == 1 || i2 == 2) {
                int iM13782 = c8244.m13782();
                if (iM13782 == 0) {
                    zM13783 = false;
                } else if (iM13782 != 1) {
                    StringBuilder sbM148 = AbstractC0053.m148(iM13782, "Invalid bitset value ", ", expected 0 or 1; at path ");
                    sbM148.append(c8244.m13789(true));
                    throw new JsonSyntaxException(sbM148.toString());
                }
            } else {
                if (i2 != 3) {
                    StringBuilder sb = new StringBuilder("Invalid bitset value type: ");
                    sb.append(jsonTokenM13770);
                    String strM13789 = c8244.m13789(false);
                    sb.append("; at path ");
                    sb.append(strM13789);
                    throw new JsonSyntaxException(sb.toString());
                }
                zM13783 = c8244.m13783();
            }
            if (zM13783) {
                bitSet.set(i);
            }
            i++;
            jsonTokenM13770 = c8244.m13770();
        }
        c8244.m13786();
        return bitSet;
    }
}
