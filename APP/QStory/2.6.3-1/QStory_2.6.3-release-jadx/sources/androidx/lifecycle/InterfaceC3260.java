package androidx.lifecycle;

import com.bumptech.glide.AbstractC3889;
import kotlin.reflect.InterfaceC5925;
import p176.C8464;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3260 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    default AbstractC3258 mo5081(Class cls, C8464 c8464) {
        return mo4917(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    default AbstractC3258 mo5077(InterfaceC5925 interfaceC5925, C8464 c8464) {
        interfaceC5925.getClass();
        return mo5081(AbstractC3889.m7316(interfaceC5925), c8464);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    default AbstractC3258 mo4917(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
