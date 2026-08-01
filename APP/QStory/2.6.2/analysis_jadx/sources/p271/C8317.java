package p271;

import com.google.gson.AbstractC3250;
import com.google.gson.InterfaceC3246;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ToNumberPolicy;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p259.C8243;
import p259.C8244;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8317 extends AbstractC3250 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8319 f22944 = new C8319(new C8317(ToNumberPolicy.LAZILY_PARSED_NUMBER), 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3246 f22945;

    public C8317(InterfaceC3246 interfaceC3246) {
        this.f22945 = interfaceC3246;
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7335(C8243 c8243, Object obj) throws IOException {
        c8243.m13751((Number) obj);
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7336(C8244 c8244) throws IOException {
        JsonToken jsonTokenM13770 = c8244.m13770();
        int i = AbstractC8316.f22943[jsonTokenM13770.ordinal()];
        if (i == 1) {
            c8244.m13775();
            return null;
        }
        if (i == 2 || i == 3) {
            return this.f22945.readNumber(c8244);
        }
        StringBuilder sb = new StringBuilder("Expecting number, got: ");
        sb.append(jsonTokenM13770);
        String strM13789 = c8244.m13789(false);
        sb.append("; at path ");
        sb.append(strM13789);
        throw new JsonSyntaxException(sb.toString());
    }
}
