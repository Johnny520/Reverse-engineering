package p398;

import com.google.gson.AbstractC3250;
import com.google.gson.C3252;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import kotlin.text.Regex;
import okio.ByteString;
import p005.C6101;
import p005.C6102;
import p015.AbstractC6206;
import p015.C6196;
import p015.C6217;
import p253.AbstractC8189;
import p259.C8243;
import retrofit2.InterfaceC5788;

/* JADX INFO: renamed from: 飘花落叶言苏楪子兰哲世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9151 implements InterfaceC5788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C6217 f25552;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC3250 f25553;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3252 f25554;

    static {
        Regex regex = C6217.f17098;
        f25552 = AbstractC8189.m13679("application/json; charset=UTF-8");
    }

    public C9151(C3252 c3252, AbstractC3250 abstractC3250) {
        this.f25554 = c3252;
        this.f25553 = abstractC3250;
    }

    @Override // retrofit2.InterfaceC5788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Object mo4149(Object obj) throws IOException {
        C6101 c6101 = new C6101();
        C8243 c8243M7352 = this.f25554.m7352(new OutputStreamWriter(new C6102(c6101), StandardCharsets.UTF_8));
        this.f25553.mo7335(c8243M7352, obj);
        c8243M7352.close();
        ByteString byteStringMo11487 = c6101.mo11487(c6101.f16657);
        int i = AbstractC6206.f17028;
        byteStringMo11487.getClass();
        return new C6196(f25552, byteStringMo11487);
    }
}
