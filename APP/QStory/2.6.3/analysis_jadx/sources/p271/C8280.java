package p271;

import androidx.activity.AbstractC0053;
import com.google.gson.AbstractC3251;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.BitSet;
import p259.C8244;
import p259.C8245;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8280 extends AbstractC3251 {
    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7322(C8244 c8244, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        c8244.m13773();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            c8244.m13769(bitSet.get(i) ? 1L : 0L);
        }
        c8244.m13781();
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7323(C8245 c8245) throws IOException {
        BitSet bitSet = new BitSet();
        c8245.m13797();
        JsonToken jsonTokenM13787 = c8245.m13787();
        int i = 0;
        while (jsonTokenM13787 != JsonToken.END_ARRAY) {
            int i2 = AbstractC8331.f22991[jsonTokenM13787.ordinal()];
            boolean zM13798 = true;
            if (i2 == 1 || i2 == 2) {
                int iM13800 = c8245.m13800();
                if (iM13800 == 0) {
                    zM13798 = false;
                } else if (iM13800 != 1) {
                    StringBuilder sbM150 = AbstractC0053.m150(iM13800, "Invalid bitset value ", ", expected 0 or 1; at path ");
                    sbM150.append(c8245.m13807(true));
                    throw new JsonSyntaxException(sbM150.toString());
                }
            } else {
                if (i2 != 3) {
                    StringBuilder sb = new StringBuilder("Invalid bitset value type: ");
                    sb.append(jsonTokenM13787);
                    String strM13807 = c8245.m13807(false);
                    sb.append("; at path ");
                    sb.append(strM13807);
                    throw new JsonSyntaxException(sb.toString());
                }
                zM13798 = c8245.m13798();
            }
            if (zM13798) {
                bitSet.set(i);
            }
            i++;
            jsonTokenM13787 = c8245.m13787();
        }
        c8245.m13804();
        return bitSet;
    }
}
