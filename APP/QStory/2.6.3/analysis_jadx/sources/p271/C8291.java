package p271;

import com.google.gson.AbstractC3251;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p259.C8244;
import p259.C8245;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8291 extends AbstractC3251 {
    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7322(C8244 c8244, Object obj) throws IOException {
        Number numberValueOf = (Number) obj;
        if (numberValueOf == null) {
            c8244.m13778();
            return;
        }
        if (!(numberValueOf instanceof Float)) {
            numberValueOf = Float.valueOf(numberValueOf.floatValue());
        }
        c8244.m13768(numberValueOf);
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7323(C8245 c8245) {
        if (c8245.m13787() != JsonToken.NULL) {
            return Float.valueOf((float) c8245.m13799());
        }
        c8245.m13793();
        return null;
    }
}
