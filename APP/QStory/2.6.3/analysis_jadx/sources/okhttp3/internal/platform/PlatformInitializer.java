package okhttp3.internal.platform;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import net.bytebuddy.description.method.MethodDescription;
import p017.AbstractC6238;
import p017.InterfaceC6239;
import p133.InterfaceC7506;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "L飘花落叶言子兰世苏楪哲/飘花落叶言子楪世苏兰哲;", "L飘花落叶言世兰苏哲子楪/飘花落叶言子楪世兰苏哲;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlatformInitializer implements InterfaceC7506 {
    @Override // p133.InterfaceC7506
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo4324(Context context) {
        context.getClass();
        AbstractC6238 abstractC6238 = AbstractC6238.f17198;
        Object obj = AbstractC6238.f17198;
        InterfaceC6239 interfaceC6239 = obj != null ? (InterfaceC6239) obj : null;
        if (interfaceC6239 != null) {
            interfaceC6239.mo11727(context);
        }
        return AbstractC6238.f17198;
    }

    @Override // p133.InterfaceC7506
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo4325() {
        return EmptyList.INSTANCE;
    }
}
