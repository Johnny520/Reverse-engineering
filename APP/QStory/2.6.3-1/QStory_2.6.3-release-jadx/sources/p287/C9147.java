package p287;

import com.google.gson.AbstractC4083;
import com.google.gson.InterfaceC4079;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ToNumberPolicy;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p275.C9073;
import p275.C9074;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9147 extends AbstractC4083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C9149 f23288 = new C9149(new C9147(ToNumberPolicy.LAZILY_PARSED_NUMBER), 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC4079 f23289;

    public C9147(InterfaceC4079 interfaceC4079) {
        this.f23289 = interfaceC4079;
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7881(C9073 c9073, Object obj) throws IOException {
        c9073.m14327((Number) obj);
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7882(C9074 c9074) throws IOException {
        JsonToken jsonTokenM14346 = c9074.m14346();
        int i = AbstractC9146.f23287[jsonTokenM14346.ordinal()];
        if (i == 1) {
            c9074.m14352();
            return null;
        }
        if (i == 2 || i == 3) {
            return this.f23289.readNumber(c9074);
        }
        StringBuilder sb = new StringBuilder("Expecting number, got: ");
        sb.append(jsonTokenM14346);
        String strM14366 = c9074.m14366(false);
        sb.append("; at path ");
        sb.append(strM14366);
        throw new JsonSyntaxException(sb.toString());
    }
}
