package p271;

import androidx.activity.AbstractC0053;
import com.google.gson.AbstractC3251;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p259.C8244;
import p259.C8245;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8334 extends AbstractC3251 {
    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7322(C8244 c8244, Object obj) throws IOException {
        if (((Number) obj) == null) {
            c8244.m13778();
        } else {
            c8244.m13769(r4.shortValue());
        }
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7323(C8245 c8245) throws IOException {
        if (c8245.m13787() == JsonToken.NULL) {
            c8245.m13793();
            return null;
        }
        try {
            int iM13800 = c8245.m13800();
            if (iM13800 <= 65535 && iM13800 >= -32768) {
                return Short.valueOf((short) iM13800);
            }
            StringBuilder sbM150 = AbstractC0053.m150(iM13800, "Lossy conversion from ", " to short; at path ");
            sbM150.append(c8245.m13807(true));
            throw new JsonSyntaxException(sbM150.toString());
        } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }
}
