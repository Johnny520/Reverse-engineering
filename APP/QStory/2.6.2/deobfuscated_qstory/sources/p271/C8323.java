package p271;

import com.google.gson.AbstractC3250;
import com.google.gson.C3252;
import com.google.gson.InterfaceC3248;
import com.google.gson.internal.AbstractC3220;
import java.util.concurrent.ConcurrentHashMap;
import p022.C6267;
import p232.C8064;
import p260.C8245;
import p267.InterfaceC8265;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8323 implements InterfaceC3248 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C8322 f22957;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ConcurrentHashMap f22958 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8064 f22959;

    static {
        int i = 0;
        f22957 = new C8322(i);
        new C8322(i);
    }

    public C8323(C8064 c8064) {
        this.f22959 = c8064;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC3250 m13834(C8064 c8064, C3252 c3252, C8245 c8245, InterfaceC8265 interfaceC8265, boolean z) {
        AbstractC3250 abstractC3250Mo7334;
        Object objMo4472 = c8064.m13520(new C8245(interfaceC8265.value()), true).mo4472();
        boolean zNullSafe = interfaceC8265.nullSafe();
        if (objMo4472 instanceof AbstractC3250) {
            abstractC3250Mo7334 = (AbstractC3250) objMo4472;
        } else {
            if (!(objMo4472 instanceof InterfaceC3248)) {
                C6267.m11758("Invalid attempt to bind an instance of ", objMo4472.getClass().getName(), " as a @JsonAdapter for ", AbstractC3220.m7329(c8245.f22815), ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                return null;
            }
            InterfaceC3248 interfaceC3248 = (InterfaceC3248) objMo4472;
            if (z) {
                InterfaceC3248 interfaceC32482 = (InterfaceC3248) this.f22958.putIfAbsent(c8245.f22816, interfaceC3248);
                if (interfaceC32482 != null) {
                    interfaceC3248 = interfaceC32482;
                }
            }
            abstractC3250Mo7334 = interfaceC3248.mo7334(c3252, c8245);
        }
        return (abstractC3250Mo7334 == null || !zNullSafe) ? abstractC3250Mo7334 : abstractC3250Mo7334.m7346();
    }

    @Override // com.google.gson.InterfaceC3248
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC3250 mo7334(C3252 c3252, C8245 c8245) {
        InterfaceC8265 interfaceC8265 = (InterfaceC8265) c8245.f22816.getAnnotation(InterfaceC8265.class);
        if (interfaceC8265 == null) {
            return null;
        }
        return m13834(this.f22959, c3252, c8245, interfaceC8265, true);
    }
}
