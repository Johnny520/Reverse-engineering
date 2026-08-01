package p287;

import com.google.gson.AbstractC4083;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p275.C9073;
import p275.C9074;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C9131 extends AbstractC4083 {
    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7881(C9073 c9073, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            c9073.m14337();
        } else {
            c9073.m14336(number.doubleValue());
        }
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7882(C9074 c9074) {
        if (c9074.m14346() != JsonToken.NULL) {
            return Double.valueOf(c9074.m14358());
        }
        c9074.m14352();
        return null;
    }
}
