package p291;

import com.alibaba.fastjson2.AbstractC2896;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Optional;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰哲楪苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8458 extends AbstractC8459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8458 f23398 = new C8458(null, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Locale f23399;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f23400;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f23401;

    public C8458(Type type) {
        this.f23401 = type;
        this.f23400 = null;
        this.f23399 = null;
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2896.mo5922();
            return;
        }
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            abstractC2896.mo5922();
        } else {
            Object obj3 = optional.get();
            abstractC2896.m6031(obj3.getClass()).mo5633(abstractC2896, obj3, obj2, null, j);
        }
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2896.mo5922();
            return;
        }
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            abstractC2896.mo5922();
            return;
        }
        Object obj3 = optional.get();
        Class<?> cls = obj3.getClass();
        String str = this.f23400;
        InterfaceC8531 interfaceC8531M14057 = str != null ? AbstractC8502.m14057(null, null, str, this.f23399, cls) : null;
        if (interfaceC8531M14057 == null) {
            interfaceC8531M14057 = abstractC2896.m6031(cls);
        }
        interfaceC8531M14057.mo5634(abstractC2896, obj3, obj2, this.f23401, 0L);
    }

    public C8458(String str, Locale locale) {
        this.f23400 = str;
        this.f23399 = locale;
    }
}
