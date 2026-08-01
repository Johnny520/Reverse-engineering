package p347;

import androidx.appcompat.widget.C0131;
import com.alibaba.fastjson2.AbstractC2907;
import com.bumptech.glide.AbstractC3056;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.text.Regex;
import p007.C6144;
import p287.AbstractC8405;
import p336.C8791;
import p336.C8800;
import retrofit2.AbstractC5790;
import retrofit2.InterfaceC5789;

/* JADX INFO: renamed from: 飘花落叶言苏哲子兰世楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8839 extends AbstractC5790 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6144 f24944;

    static {
        String strM13972 = AbstractC8405.m13972(1233);
        Regex regex = C6144.f16859;
        f24944 = AbstractC3056.m6711(strM13972);
    }

    @Override // retrofit2.AbstractC5790
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC5789 mo11171(Type type, Annotation[] annotationArr, C0131 c0131) {
        return new C8800(AbstractC2907.m6352(type));
    }

    @Override // retrofit2.AbstractC5790
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5789 mo11172(Type type) {
        return new C8791(2);
    }
}
