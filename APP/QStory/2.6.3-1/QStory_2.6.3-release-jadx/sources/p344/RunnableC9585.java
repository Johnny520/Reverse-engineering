package p344;

import java.io.File;
import java.util.Arrays;
import java.util.Date;
import p026.AbstractC7014;
import p026.AbstractC7017;
import p303.AbstractC9234;
import p407.C9924;

/* JADX INFO: renamed from: 飘花落叶言苏世哲子楪兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC9585 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C9584 f25025;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25026;

    public /* synthetic */ RunnableC9585(C9584 c9584, int i) {
        this.f25026 = i;
        this.f25025 = c9584;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f25026;
        C9584 c9584 = this.f25025;
        switch (i) {
            case 0:
                String str = C9584.f25019;
                try {
                    try {
                        boolean z = c9584.f25024;
                        C9924 c9924 = c9584.f25023;
                        if (!z) {
                            c9584.f25024 = true;
                            String str2 = c9584.f25022.format(new Date());
                            AbstractC9234.m14531(1290);
                            str2.getClass();
                            String strM15237 = c9924.m15237(AbstractC9234.m14531(2277), "");
                            try {
                                C9584.m15003();
                                if (!str2.equals(strM15237)) {
                                    C9584.m15004();
                                    c9584.m15008();
                                    c9924.m15236(str2, AbstractC9234.m14531(2277));
                                }
                            } catch (Exception e) {
                                AbstractC7017.m12164(AbstractC9234.m14531(2270), AbstractC9234.m14531(2278), e, true);
                            }
                        }
                    } finally {
                        c9584.f25024 = false;
                    }
                    break;
                } catch (Exception e2) {
                    AbstractC7017.m12164(AbstractC9234.m14531(2270), AbstractC9234.m14531(2279), e2, true);
                }
                return;
            default:
                try {
                    C9584.m15003();
                    C9584.m15004();
                    File fileM15008 = c9584.m15008();
                    String str3 = String.format(AbstractC9234.m14531(2275), Arrays.copyOf(new Object[]{fileM15008.getName(), C9584.m15006(fileM15008.length())}, 2));
                    AbstractC9234.m14531(1290);
                    AbstractC7014.m12151(str3);
                    return;
                } catch (Exception e3) {
                    String str4 = AbstractC9234.m14531(2276) + e3.getMessage();
                    AbstractC7017.m12164(AbstractC9234.m14531(2270), str4, e3, true);
                    AbstractC7014.m12151(str4);
                    return;
                }
        }
    }
}
