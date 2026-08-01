package okhttp3.internal.platform;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import net.bytebuddy.description.method.MethodDescription;
import p019.AbstractC6241;
import p019.InterfaceC6242;
import p133.InterfaceC7505;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "L飘花落叶言子兰世苏楪哲/飘花落叶言子楪世苏兰哲;", "L飘花落叶言世兰苏哲楪子/飘花落叶言子楪世兰苏哲;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlatformInitializer implements InterfaceC7505 {
    @Override // p133.InterfaceC7505
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo4314(Context context) {
        context.getClass();
        AbstractC6241 abstractC6241 = AbstractC6241.f17194;
        Object obj = AbstractC6241.f17194;
        InterfaceC6242 interfaceC6242 = obj != null ? (InterfaceC6242) obj : null;
        if (interfaceC6242 != null) {
            interfaceC6242.mo11725(context);
        }
        return AbstractC6241.f17194;
    }

    @Override // p133.InterfaceC7505
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo4315() {
        return EmptyList.INSTANCE;
    }
}
