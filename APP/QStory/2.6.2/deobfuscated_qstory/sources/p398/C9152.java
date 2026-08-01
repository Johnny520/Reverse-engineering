package p398;

import androidx.appcompat.widget.C0131;
import com.google.gson.C3252;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p230.C8052;
import p260.C8245;
import retrofit2.AbstractC5789;
import retrofit2.InterfaceC5788;

/* JADX INFO: renamed from: 飘花落叶言苏楪子兰哲世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9152 extends AbstractC5789 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3252 f25555;

    public C9152(C3252 c3252) {
        this.f25555 = c3252;
    }

    @Override // retrofit2.AbstractC5789
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC5788 mo11114(Type type, Annotation[] annotationArr, C0131 c0131) {
        C8245 c8245 = new C8245(type);
        C3252 c3252 = this.f25555;
        return new C8052(c3252, c3252.m7353(c8245));
    }

    @Override // retrofit2.AbstractC5789
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5788 mo11115(Type type) {
        C8245 c8245 = new C8245(type);
        C3252 c3252 = this.f25555;
        return new C9151(c3252, c3252.m7353(c8245));
    }
}
