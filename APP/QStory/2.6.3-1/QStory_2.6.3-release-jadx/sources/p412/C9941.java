package p412;

import com.bumptech.glide.AbstractC3888;
import com.google.gson.AbstractC4083;
import com.google.gson.C4085;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import kotlin.text.Regex;
import okio.ByteString;
import p020.C6921;
import p020.C6922;
import p023.AbstractC6962;
import p023.C6952;
import p023.C6973;
import p275.C9073;
import retrofit2.InterfaceC6619;

/* JADX INFO: renamed from: 飘花落叶言苏楪子兰世哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9941 implements InterfaceC6619 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C6973 f25882;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4083 f25883;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4085 f25884;

    static {
        Regex regex = C6973.f17204;
        f25882 = AbstractC3888.m7271("application/json; charset=UTF-8");
    }

    public C9941(C4085 c4085, AbstractC4083 abstractC4083) {
        this.f25884 = c4085;
        this.f25883 = abstractC4083;
    }

    @Override // retrofit2.InterfaceC6619
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Object mo4719(Object obj) throws IOException {
        C6921 c6921 = new C6921();
        C9073 c9073M7898 = this.f25884.m7898(new OutputStreamWriter(new C6922(c6921), StandardCharsets.UTF_8));
        this.f25883.mo7881(c9073M7898, obj);
        c9073M7898.close();
        ByteString byteStringMo12040 = c6921.mo12040(c6921.f16992);
        int i = AbstractC6962.f17134;
        byteStringMo12040.getClass();
        return new C6952(f25882, byteStringMo12040);
    }
}
