package p319;

import java.util.ArrayList;
import java.util.HashSet;
import lin.xposed.hook.util.qq.QQEnvTool;
import p010.AbstractC6188;
import p287.AbstractC8405;
import p346.C8836;
import p391.C9095;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8680 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8679 f24486;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24487;

    public /* synthetic */ RunnableC8680(C8679 c8679, int i) {
        this.f24487 = i;
        this.f24486 = c8679;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f24487;
        C8679 c8679 = this.f24486;
        switch (i) {
            case 0:
                C9095 c9095 = c8679.f24485;
                ArrayList<String> arrayListM14680 = c9095.m14680(String.class, AbstractC8405.m13972(1207));
                if (!arrayListM14680.isEmpty()) {
                    HashSet hashSet = new HashSet(c9095.m14680(String.class, AbstractC8405.m13972(1212)));
                    ArrayList arrayList = new ArrayList(hashSet);
                    for (String str : arrayListM14680) {
                        if (!hashSet.contains(str)) {
                            C8836.m14498(str, QQEnvTool.getCurrentUin());
                            arrayList.add(str);
                        }
                    }
                    c9095.m14677(arrayList, AbstractC8405.m13972(1212));
                    break;
                }
                break;
            default:
                C9095 c90952 = c8679.f24485;
                ArrayList<String> arrayListM146802 = c90952.m14680(String.class, AbstractC8405.m13972(1207));
                if (!arrayListM146802.isEmpty()) {
                    c90952.m14677(new ArrayList(), AbstractC8405.m13972(1212));
                    for (String str2 : arrayListM146802) {
                        int i2 = 0;
                        boolean z = false;
                        while (i2 < 5 && !z) {
                            try {
                                C8836.m14498(str2, QQEnvTool.getCurrentUin());
                                z = true;
                            } catch (Exception e) {
                                i2++;
                                if (i2 < 5) {
                                    try {
                                        Thread.sleep((long) (Math.pow(2.0d, i2) * 1000.0d));
                                    } catch (InterruptedException unused) {
                                        Thread.currentThread().interrupt();
                                    }
                                } else {
                                    AbstractC6188.m11605(AbstractC8405.m13972(1205), AbstractC8405.m13972(1210) + str2, e, true);
                                }
                            }
                        }
                    }
                    c90952.m14677(new ArrayList(arrayListM146802), AbstractC8405.m13972(1212));
                    break;
                }
                break;
        }
    }
}
