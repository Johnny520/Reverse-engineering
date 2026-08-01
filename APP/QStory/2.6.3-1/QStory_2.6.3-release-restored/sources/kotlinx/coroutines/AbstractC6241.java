package kotlinx.coroutines;

import kotlinx.coroutines.internal.AbstractC6191;
import kotlinx.coroutines.internal.AbstractC6197;
import p109.C8030;
import p111.C8036;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6241 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC6238 f15393;

    static {
        String property;
        InterfaceC6238 interfaceC6238;
        int i = AbstractC6191.f15286;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C8036 c8036 = AbstractC6227.f15375;
            C8030 c8030 = AbstractC6197.f15305;
            C8030 c80302 = c8030.f19558;
            interfaceC6238 = c8030;
            if (c8030 == null) {
                interfaceC6238 = RunnableC6242.f15395;
            }
        } else {
            interfaceC6238 = RunnableC6242.f15395;
        }
        f15393 = interfaceC6238;
    }
}
