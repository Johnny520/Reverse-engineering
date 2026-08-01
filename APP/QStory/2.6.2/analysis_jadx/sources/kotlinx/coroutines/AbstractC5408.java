package kotlinx.coroutines;

import kotlinx.coroutines.internal.AbstractC5358;
import kotlinx.coroutines.internal.AbstractC5364;
import p093.C7200;
import p095.C7206;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5408 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC5405 f15048;

    static {
        String property;
        InterfaceC5405 interfaceC5405;
        int i = AbstractC5358.f14941;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C7206 c7206 = AbstractC5394.f15030;
            C7200 c7200 = AbstractC5364.f14960;
            C7200 c72002 = c7200.f19218;
            interfaceC5405 = c7200;
            if (c7200 == null) {
                interfaceC5405 = RunnableC5409.f15050;
            }
        } else {
            interfaceC5405 = RunnableC5409.f15050;
        }
        f15048 = interfaceC5405;
    }
}
