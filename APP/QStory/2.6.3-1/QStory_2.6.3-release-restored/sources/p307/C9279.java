package p307;

import com.alibaba.fastjson2.AbstractC3730;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Optional;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰哲楪苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9279 extends AbstractC9280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C9279 f23734 = new C9279(null, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Locale f23735;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f23736;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f23737;

    public C9279(Type type) {
        this.f23737 = type;
        this.f23736 = null;
        this.f23735 = null;
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC3730.mo6527();
            return;
        }
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            abstractC3730.mo6527();
        } else {
            Object obj3 = optional.get();
            abstractC3730.m6637(obj3.getClass()).mo6238(abstractC3730, obj3, obj2, null, j);
        }
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC3730.mo6527();
            return;
        }
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            abstractC3730.mo6527();
            return;
        }
        Object obj3 = optional.get();
        Class<?> cls = obj3.getClass();
        String str = this.f23736;
        InterfaceC9352 interfaceC9352M14635 = str != null ? AbstractC9323.m14635(null, null, str, this.f23735, cls) : null;
        if (interfaceC9352M14635 == null) {
            interfaceC9352M14635 = abstractC3730.m6637(cls);
        }
        interfaceC9352M14635.mo6239(abstractC3730, obj3, obj2, this.f23737, 0L);
    }

    public C9279(String str, Locale locale) {
        this.f23736 = str;
        this.f23735 = locale;
    }
}
