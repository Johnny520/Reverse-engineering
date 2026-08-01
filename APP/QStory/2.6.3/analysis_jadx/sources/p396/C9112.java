package p396;

import com.bumptech.glide.AbstractC3056;
import com.google.gson.AbstractC3251;
import com.google.gson.C3253;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import kotlin.text.Regex;
import okio.ByteString;
import p004.C6092;
import p004.C6093;
import p007.AbstractC6133;
import p007.C6123;
import p007.C6144;
import p259.C8244;
import retrofit2.InterfaceC5789;

/* JADX INFO: renamed from: 飘花落叶言苏楪子兰世哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9112 implements InterfaceC5789 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C6144 f25537;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC3251 f25538;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3253 f25539;

    static {
        Regex regex = C6144.f16859;
        f25537 = AbstractC3056.m6711("application/json; charset=UTF-8");
    }

    public C9112(C3253 c3253, AbstractC3251 abstractC3251) {
        this.f25539 = c3253;
        this.f25538 = abstractC3251;
    }

    @Override // retrofit2.InterfaceC5789
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Object mo4159(Object obj) throws IOException {
        C6092 c6092 = new C6092();
        C8244 c8244M7339 = this.f25539.m7339(new OutputStreamWriter(new C6093(c6092), StandardCharsets.UTF_8));
        this.f25538.mo7322(c8244M7339, obj);
        c8244M7339.close();
        ByteString byteStringMo11481 = c6092.mo11481(c6092.f16647);
        int i = AbstractC6133.f16789;
        byteStringMo11481.getClass();
        return new C6123(f25537, byteStringMo11481);
    }
}
