package p396;

import androidx.appcompat.widget.C0131;
import com.google.gson.C3253;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p230.C8053;
import p260.C8246;
import retrofit2.AbstractC5790;
import retrofit2.InterfaceC5789;

/* JADX INFO: renamed from: 飘花落叶言苏楪子兰世哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9113 extends AbstractC5790 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3253 f25540;

    public C9113(C3253 c3253) {
        this.f25540 = c3253;
    }

    @Override // retrofit2.AbstractC5790
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC5789 mo11171(Type type, Annotation[] annotationArr, C0131 c0131) {
        C8246 c8246 = new C8246(type);
        C3253 c3253 = this.f25540;
        return new C8053(c3253, c3253.m7340(c8246));
    }

    @Override // retrofit2.AbstractC5790
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5789 mo11172(Type type) {
        C8246 c8246 = new C8246(type);
        C3253 c3253 = this.f25540;
        return new C9112(c3253, c3253.m7340(c8246));
    }
}
