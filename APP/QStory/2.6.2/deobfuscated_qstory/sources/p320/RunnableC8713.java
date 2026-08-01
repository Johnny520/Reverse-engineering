package p320;

import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.HashSet;
import lin.xposed.hook.util.qq.QQEnvTool;
import p007.AbstractC6136;
import p010.AbstractC6157;
import p346.C8849;
import p391.C9114;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲楪子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8713 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8712 f24576;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24577;

    public /* synthetic */ RunnableC8713(C8712 c8712, int i) {
        this.f24577 = i;
        this.f24576 = c8712;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f24577;
        C8712 c8712 = this.f24576;
        switch (i) {
            case 0:
                C9114 c9114 = c8712.f24575;
                ArrayList<String> arrayListM14643 = c9114.m14643(String.class, "TroopUinList");
                if (!arrayListM14643.isEmpty()) {
                    HashSet hashSet = new HashSet(c9114.m14643(String.class, "CheckedTroopsToday"));
                    ArrayList arrayList = new ArrayList(hashSet);
                    for (String str : arrayListM14643) {
                        if (!hashSet.contains(str)) {
                            C8849.m14483(str, QQEnvTool.getCurrentUin());
                            arrayList.add(str);
                        }
                    }
                    c9114.m14640(arrayList, "CheckedTroopsToday");
                    break;
                }
                break;
            default:
                C9114 c91142 = c8712.f24575;
                ArrayList<String> arrayListM146432 = c91142.m14643(String.class, "TroopUinList");
                if (!arrayListM146432.isEmpty()) {
                    c91142.m14640(new ArrayList(), "CheckedTroopsToday");
                    for (String str2 : arrayListM146432) {
                        int i2 = 0;
                        boolean z = false;
                        while (i2 < 5 && !z) {
                            try {
                                C8849.m14483(str2, QQEnvTool.getCurrentUin());
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
                                    AbstractC6157.m11574("AutoGroupCheckIn", AbstractC6136.m11557(-3937679575300179367L, new StringBuilder(), str2), e, true);
                                }
                            }
                        }
                    }
                    c91142.m14640(new ArrayList(arrayListM146432), "CheckedTroopsToday");
                    break;
                }
                break;
        }
    }
}
