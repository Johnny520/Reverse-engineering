package p271;

import com.google.gson.AbstractC3251;
import com.google.gson.InterfaceC3247;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ToNumberPolicy;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p259.C8244;
import p259.C8245;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8318 extends AbstractC3251 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8320 f22943 = new C8320(new C8318(ToNumberPolicy.LAZILY_PARSED_NUMBER), 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3247 f22944;

    public C8318(InterfaceC3247 interfaceC3247) {
        this.f22944 = interfaceC3247;
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7322(C8244 c8244, Object obj) throws IOException {
        c8244.m13768((Number) obj);
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7323(C8245 c8245) throws IOException {
        JsonToken jsonTokenM13787 = c8245.m13787();
        int i = AbstractC8317.f22942[jsonTokenM13787.ordinal()];
        if (i == 1) {
            c8245.m13793();
            return null;
        }
        if (i == 2 || i == 3) {
            return this.f22944.readNumber(c8245);
        }
        StringBuilder sb = new StringBuilder("Expecting number, got: ");
        sb.append(jsonTokenM13787);
        String strM13807 = c8245.m13807(false);
        sb.append("; at path ");
        sb.append(strM13807);
        throw new JsonSyntaxException(sb.toString());
    }
}
