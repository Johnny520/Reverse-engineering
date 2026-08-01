package p363;

import androidx.appcompat.widget.C0978;
import com.alibaba.fastjson2.AbstractC3740;
import com.bumptech.glide.AbstractC3888;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.text.Regex;
import p023.C6973;
import p352.C9620;
import p352.C9629;
import retrofit2.AbstractC6620;
import retrofit2.InterfaceC6619;

/* JADX INFO: renamed from: 飘花落叶言苏哲子兰世楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9668 extends AbstractC6620 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6973 f25289;

    static {
        String strM14531 = "application/json; charset=UTF-8";
        Regex regex = C6973.f17204;
        f25289 = AbstractC3888.m7271(strM14531);
    }

    @Override // retrofit2.AbstractC6620
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC6619 mo11730(Type type, Annotation[] annotationArr, C0978 c0978) {
        return new C9629(AbstractC3740.m6912(type));
    }

    @Override // retrofit2.AbstractC6620
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC6619 mo11731(Type type) {
        return new C9620(2);
    }
}
