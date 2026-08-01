package p287;

import com.google.gson.AbstractC4083;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.AbstractC4053;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.math.BigInteger;
import p025.AbstractC7012;
import p275.C9073;
import p275.C9074;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C9127 extends AbstractC4083 {
    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7881(C9073 c9073, Object obj) throws IOException {
        c9073.m14327((BigInteger) obj);
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7882(C9074 c9074) throws IOException {
        if (c9074.m14346() == JsonToken.NULL) {
            c9074.m14352();
            return null;
        }
        String strM14348 = c9074.m14348();
        try {
            AbstractC4053.m7869(strM14348);
            return new BigInteger(strM14348);
        } catch (NumberFormatException e) {
            StringBuilder sbM12144 = AbstractC7012.m12144("Failed parsing '", strM14348, "' as BigInteger; at path ");
            sbM12144.append(c9074.m14366(true));
            throw new JsonSyntaxException(sbM12144.toString(), e);
        }
    }
}
