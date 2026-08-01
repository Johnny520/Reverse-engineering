package p287;

import androidx.activity.AbstractC0900;
import com.google.gson.AbstractC4083;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.BitSet;
import p275.C9073;
import p275.C9074;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C9109 extends AbstractC4083 {
    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7881(C9073 c9073, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        c9073.m14332();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            c9073.m14328(bitSet.get(i) ? 1L : 0L);
        }
        c9073.m14340();
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7882(C9074 c9074) throws IOException {
        BitSet bitSet = new BitSet();
        c9074.m14356();
        JsonToken jsonTokenM14346 = c9074.m14346();
        int i = 0;
        while (jsonTokenM14346 != JsonToken.END_ARRAY) {
            int i2 = AbstractC9160.f23336[jsonTokenM14346.ordinal()];
            boolean zM14357 = true;
            if (i2 == 1 || i2 == 2) {
                int iM14359 = c9074.m14359();
                if (iM14359 == 0) {
                    zM14357 = false;
                } else if (iM14359 != 1) {
                    StringBuilder sbM710 = AbstractC0900.m710(iM14359, "Invalid bitset value ", ", expected 0 or 1; at path ");
                    sbM710.append(c9074.m14366(true));
                    throw new JsonSyntaxException(sbM710.toString());
                }
            } else {
                if (i2 != 3) {
                    StringBuilder sb = new StringBuilder("Invalid bitset value type: ");
                    sb.append(jsonTokenM14346);
                    String strM14366 = c9074.m14366(false);
                    sb.append("; at path ");
                    sb.append(strM14366);
                    throw new JsonSyntaxException(sb.toString());
                }
                zM14357 = c9074.m14357();
            }
            if (zM14357) {
                bitSet.set(i);
            }
            i++;
            jsonTokenM14346 = c9074.m14346();
        }
        c9074.m14363();
        return bitSet;
    }
}
