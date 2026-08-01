package p271;

import com.google.gson.AbstractC3251;
import com.google.gson.C3253;
import com.google.gson.InterfaceC3249;
import com.google.gson.internal.AbstractC3221;
import java.util.concurrent.ConcurrentHashMap;
import p019.C6263;
import p232.C8065;
import p260.C8246;
import p267.InterfaceC8266;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8324 implements InterfaceC3249 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C8323 f22956;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ConcurrentHashMap f22957 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8065 f22958;

    static {
        int i = 0;
        f22956 = new C8323(i);
        new C8323(i);
    }

    public C8324(C8065 c8065) {
        this.f22958 = c8065;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC3251 m13851(C8065 c8065, C3253 c3253, C8246 c8246, InterfaceC8266 interfaceC8266, boolean z) {
        AbstractC3251 abstractC3251Mo7321;
        Object objMo4482 = c8065.m13549(new C8246(interfaceC8266.value()), true).mo4482();
        boolean zNullSafe = interfaceC8266.nullSafe();
        if (objMo4482 instanceof AbstractC3251) {
            abstractC3251Mo7321 = (AbstractC3251) objMo4482;
        } else {
            if (!(objMo4482 instanceof InterfaceC3249)) {
                C6263.m11775("Invalid attempt to bind an instance of ", objMo4482.getClass().getName(), " as a @JsonAdapter for ", AbstractC3221.m7316(c8246.f22814), ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                return null;
            }
            InterfaceC3249 interfaceC3249 = (InterfaceC3249) objMo4482;
            if (z) {
                InterfaceC3249 interfaceC32492 = (InterfaceC3249) this.f22957.putIfAbsent(c8246.f22815, interfaceC3249);
                if (interfaceC32492 != null) {
                    interfaceC3249 = interfaceC32492;
                }
            }
            abstractC3251Mo7321 = interfaceC3249.mo7321(c3253, c8246);
        }
        return (abstractC3251Mo7321 == null || !zNullSafe) ? abstractC3251Mo7321 : abstractC3251Mo7321.m7333();
    }

    @Override // com.google.gson.InterfaceC3249
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC3251 mo7321(C3253 c3253, C8246 c8246) {
        InterfaceC8266 interfaceC8266 = (InterfaceC8266) c8246.f22815.getAnnotation(InterfaceC8266.class);
        if (interfaceC8266 == null) {
            return null;
        }
        return m13851(this.f22958, c3253, c8246, interfaceC8266, true);
    }
}
