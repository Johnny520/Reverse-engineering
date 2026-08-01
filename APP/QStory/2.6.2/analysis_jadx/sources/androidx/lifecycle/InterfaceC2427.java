package androidx.lifecycle;

import kotlin.reflect.InterfaceC5092;
import p053.AbstractC6560;
import p160.C7634;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2427 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    default AbstractC2425 mo4511(Class cls, C7634 c7634) {
        return mo4347(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    default AbstractC2425 mo4507(InterfaceC5092 interfaceC5092, C7634 c7634) {
        interfaceC5092.getClass();
        return mo4511(AbstractC6560.m12029(interfaceC5092), c7634);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    default AbstractC2425 mo4347(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
