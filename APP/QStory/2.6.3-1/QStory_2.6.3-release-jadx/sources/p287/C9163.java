package p287;

import androidx.activity.AbstractC0900;
import com.google.gson.AbstractC4083;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p275.C9073;
import p275.C9074;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C9163 extends AbstractC4083 {
    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7881(C9073 c9073, Object obj) throws IOException {
        if (((Number) obj) == null) {
            c9073.m14337();
        } else {
            c9073.m14328(r4.shortValue());
        }
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7882(C9074 c9074) throws IOException {
        if (c9074.m14346() == JsonToken.NULL) {
            c9074.m14352();
            return null;
        }
        try {
            int iM14359 = c9074.m14359();
            if (iM14359 <= 65535 && iM14359 >= -32768) {
                return Short.valueOf((short) iM14359);
            }
            StringBuilder sbM710 = AbstractC0900.m710(iM14359, "Lossy conversion from ", " to short; at path ");
            sbM710.append(c9074.m14366(true));
            throw new JsonSyntaxException(sbM710.toString());
        } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }
}
