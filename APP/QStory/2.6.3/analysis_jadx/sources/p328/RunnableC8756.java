package p328;

import java.io.File;
import java.util.Arrays;
import java.util.Date;
import p010.AbstractC6185;
import p010.AbstractC6188;
import p287.AbstractC8405;
import p391.C9095;

/* JADX INFO: renamed from: 飘花落叶言苏世哲子楪兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8756 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8755 f24680;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24681;

    public /* synthetic */ RunnableC8756(C8755 c8755, int i) {
        this.f24681 = i;
        this.f24680 = c8755;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f24681;
        C8755 c8755 = this.f24680;
        switch (i) {
            case 0:
                String str = C8755.f24674;
                try {
                    try {
                        boolean z = c8755.f24679;
                        C9095 c9095 = c8755.f24678;
                        if (!z) {
                            c8755.f24679 = true;
                            String str2 = c8755.f24677.format(new Date());
                            AbstractC8405.m13972(1290);
                            str2.getClass();
                            String strM14678 = c9095.m14678(AbstractC8405.m13972(2277), "");
                            try {
                                C8755.m14444();
                                if (!str2.equals(strM14678)) {
                                    C8755.m14445();
                                    c8755.m14449();
                                    c9095.m14677(str2, AbstractC8405.m13972(2277));
                                }
                            } catch (Exception e) {
                                AbstractC6188.m11605(AbstractC8405.m13972(2270), AbstractC8405.m13972(2278), e, true);
                            }
                        }
                    } finally {
                        c8755.f24679 = false;
                    }
                    break;
                } catch (Exception e2) {
                    AbstractC6188.m11605(AbstractC8405.m13972(2270), AbstractC8405.m13972(2279), e2, true);
                }
                return;
            default:
                try {
                    C8755.m14444();
                    C8755.m14445();
                    File fileM14449 = c8755.m14449();
                    String str3 = String.format(AbstractC8405.m13972(2275), Arrays.copyOf(new Object[]{fileM14449.getName(), C8755.m14447(fileM14449.length())}, 2));
                    AbstractC8405.m13972(1290);
                    AbstractC6185.m11592(str3);
                    return;
                } catch (Exception e3) {
                    String str4 = AbstractC8405.m13972(2276) + e3.getMessage();
                    AbstractC6188.m11605(AbstractC8405.m13972(2270), str4, e3, true);
                    AbstractC6185.m11592(str4);
                    return;
                }
        }
    }
}
