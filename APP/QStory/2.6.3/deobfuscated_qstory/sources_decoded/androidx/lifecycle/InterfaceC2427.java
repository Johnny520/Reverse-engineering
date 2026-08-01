package androidx.lifecycle;

import com.bumptech.glide.AbstractC3057;
import kotlin.reflect.InterfaceC5093;
import p160.C7635;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2427 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    default AbstractC2425 mo4521(Class cls, C7635 c7635) {
        return mo4357(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    default AbstractC2425 mo4517(InterfaceC5093 interfaceC5093, C7635 c7635) {
        interfaceC5093.getClass();
        return mo4521(AbstractC3057.m6756(interfaceC5093), c7635);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    default AbstractC2425 mo4357(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
