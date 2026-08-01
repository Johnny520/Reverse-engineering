package kotlinx.coroutines;

import kotlinx.coroutines.internal.AbstractC5359;
import kotlinx.coroutines.internal.AbstractC5365;
import p093.C7201;
import p095.C7207;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5409 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC5406 f15048;

    static {
        String property;
        InterfaceC5406 interfaceC5406;
        int i = AbstractC5359.f14941;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C7207 c7207 = AbstractC5395.f15030;
            C7201 c7201 = AbstractC5365.f14960;
            C7201 c72012 = c7201.f19213;
            interfaceC5406 = c7201;
            if (c7201 == null) {
                interfaceC5406 = RunnableC5410.f15050;
            }
        } else {
            interfaceC5406 = RunnableC5410.f15050;
        }
        f15048 = interfaceC5406;
    }
}
