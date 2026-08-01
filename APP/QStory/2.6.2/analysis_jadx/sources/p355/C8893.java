package p355;

import androidx.appcompat.widget.C0131;
import com.alibaba.fastjson2.AbstractC2906;
import com.bumptech.glide.AbstractC3056;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.text.Regex;
import p015.C6217;
import p253.AbstractC8189;
import p330.C8791;
import p330.C8796;
import retrofit2.AbstractC5789;
import retrofit2.InterfaceC5788;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8893 extends AbstractC5789 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6217 f25057;

    static {
        String strM6668 = AbstractC3056.m6668(-3937677797183718823L);
        Regex regex = C6217.f17098;
        f25057 = AbstractC8189.m13679(strM6668);
    }

    @Override // retrofit2.AbstractC5789
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC5788 mo11114(Type type, Annotation[] annotationArr, C0131 c0131) {
        return new C8791(AbstractC2906.m6294(type));
    }

    @Override // retrofit2.AbstractC5789
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5788 mo11115(Type type) {
        return new C8796(2);
    }
}
