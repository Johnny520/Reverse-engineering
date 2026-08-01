package p335;

import java.util.ArrayList;
import java.util.HashSet;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p026.AbstractC7017;
import p362.C9665;
import p407.C9924;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC9509 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C9508 f24831;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24832;

    public /* synthetic */ RunnableC9509(C9508 c9508, int i) {
        this.f24832 = i;
        this.f24831 = c9508;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f24832;
        C9508 c9508 = this.f24831;
        switch (i) {
            case 0:
                C9924 c9924 = c9508.f24830;
                ArrayList<String> arrayListM15239 = c9924.m15239(String.class, "TroopUinList");
                if (!arrayListM15239.isEmpty()) {
                    HashSet hashSet = new HashSet(c9924.m15239(String.class, "CheckedTroopsToday"));
                    ArrayList arrayList = new ArrayList(hashSet);
                    for (String str : arrayListM15239) {
                        if (!hashSet.contains(str)) {
                            C9665.m15057(str, QQEnvTool.getCurrentUin());
                            arrayList.add(str);
                        }
                    }
                    c9924.m15236(arrayList, "CheckedTroopsToday");
                    break;
                }
                break;
            default:
                C9924 c99242 = c9508.f24830;
                ArrayList<String> arrayListM152392 = c99242.m15239(String.class, "TroopUinList");
                if (!arrayListM152392.isEmpty()) {
                    c99242.m15236(new ArrayList(), "CheckedTroopsToday");
                    for (String str2 : arrayListM152392) {
                        int i2 = 0;
                        boolean z = false;
                        while (i2 < 5 && !z) {
                            try {
                                C9665.m15057(str2, QQEnvTool.getCurrentUin());
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
                                    AbstractC7017.m12164("AutoGroupCheckIn", "群打卡失败: " + str2, e, true);
                                }
                            }
                        }
                    }
                    c99242.m15236(new ArrayList(arrayListM152392), "CheckedTroopsToday");
                    break;
                }
                break;
        }
    }
}
