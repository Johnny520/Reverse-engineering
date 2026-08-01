package p291;

import com.alibaba.fastjson2.AbstractC2897;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Optional;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰哲楪苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8450 extends AbstractC8451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8450 f23389 = new C8450(null, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Locale f23390;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f23391;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f23392;

    public C8450(Type type) {
        this.f23392 = type;
        this.f23391 = null;
        this.f23390 = null;
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.mo5967();
            return;
        }
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            abstractC2897.mo5967();
        } else {
            Object obj3 = optional.get();
            abstractC2897.m6077(obj3.getClass()).mo5678(abstractC2897, obj3, obj2, null, j);
        }
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.mo5967();
            return;
        }
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            abstractC2897.mo5967();
            return;
        }
        Object obj3 = optional.get();
        Class<?> cls = obj3.getClass();
        String str = this.f23391;
        InterfaceC8523 interfaceC8523M14076 = str != null ? AbstractC8494.m14076(null, null, str, this.f23390, cls) : null;
        if (interfaceC8523M14076 == null) {
            interfaceC8523M14076 = abstractC2897.m6077(cls);
        }
        interfaceC8523M14076.mo5679(abstractC2897, obj3, obj2, this.f23392, 0L);
    }

    public C8450(String str, Locale locale) {
        this.f23391 = str;
        this.f23390 = locale;
    }
}
