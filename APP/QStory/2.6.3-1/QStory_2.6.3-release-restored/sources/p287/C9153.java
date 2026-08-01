package p287;

import com.google.gson.AbstractC4083;
import com.google.gson.C4085;
import com.google.gson.InterfaceC4081;
import com.google.gson.internal.AbstractC4053;
import java.util.concurrent.ConcurrentHashMap;
import p035.C7092;
import p248.C8894;
import p276.C9075;
import p283.InterfaceC9095;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9153 implements InterfaceC4081 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C9152 f23301;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ConcurrentHashMap f23302 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8894 f23303;

    static {
        int i = 0;
        f23301 = new C9152(i);
        new C9152(i);
    }

    public C9153(C8894 c8894) {
        this.f23303 = c8894;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC4083 m14410(C8894 c8894, C4085 c4085, C9075 c9075, InterfaceC9095 interfaceC9095, boolean z) {
        AbstractC4083 abstractC4083Mo7880;
        Object objMo5042 = c8894.m14108(new C9075(interfaceC9095.value()), true).mo5042();
        boolean zNullSafe = interfaceC9095.nullSafe();
        if (objMo5042 instanceof AbstractC4083) {
            abstractC4083Mo7880 = (AbstractC4083) objMo5042;
        } else {
            if (!(objMo5042 instanceof InterfaceC4081)) {
                C7092.m12334("Invalid attempt to bind an instance of ", objMo5042.getClass().getName(), " as a @JsonAdapter for ", AbstractC4053.m7875(c9075.f23159), ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                return null;
            }
            InterfaceC4081 interfaceC4081 = (InterfaceC4081) objMo5042;
            if (z) {
                InterfaceC4081 interfaceC40812 = (InterfaceC4081) this.f23302.putIfAbsent(c9075.f23160, interfaceC4081);
                if (interfaceC40812 != null) {
                    interfaceC4081 = interfaceC40812;
                }
            }
            abstractC4083Mo7880 = interfaceC4081.mo7880(c4085, c9075);
        }
        return (abstractC4083Mo7880 == null || !zNullSafe) ? abstractC4083Mo7880 : abstractC4083Mo7880.m7892();
    }

    @Override // com.google.gson.InterfaceC4081
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC4083 mo7880(C4085 c4085, C9075 c9075) {
        InterfaceC9095 interfaceC9095 = (InterfaceC9095) c9075.f23160.getAnnotation(InterfaceC9095.class);
        if (interfaceC9095 == null) {
            return null;
        }
        return m14410(this.f23303, c4085, c9075, interfaceC9095, true);
    }
}
