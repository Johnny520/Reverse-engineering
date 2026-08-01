package p412;

import androidx.appcompat.widget.C0978;
import com.google.gson.C4085;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p246.C8882;
import p276.C9075;
import retrofit2.AbstractC6620;
import retrofit2.InterfaceC6619;

/* JADX INFO: renamed from: 飘花落叶言苏楪子兰世哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9942 extends AbstractC6620 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4085 f25885;

    public C9942(C4085 c4085) {
        this.f25885 = c4085;
    }

    @Override // retrofit2.AbstractC6620
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC6619 mo11730(Type type, Annotation[] annotationArr, C0978 c0978) {
        C9075 c9075 = new C9075(type);
        C4085 c4085 = this.f25885;
        return new C8882(c4085, c4085.m7899(c9075));
    }

    @Override // retrofit2.AbstractC6620
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC6619 mo11731(Type type) {
        C9075 c9075 = new C9075(type);
        C4085 c4085 = this.f25885;
        return new C9941(c4085, c4085.m7899(c9075));
    }
}
