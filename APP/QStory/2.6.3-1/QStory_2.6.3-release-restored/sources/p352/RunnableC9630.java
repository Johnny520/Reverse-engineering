package p352;

import java.util.concurrent.TimeUnit;
import p026.AbstractC7017;
import p058.AbstractC7275;
import p058.AbstractC7277;
import p058.AbstractC7279;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰哲子.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC9630 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Integer f25113;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ String f25114;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ String f25115;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ C9631 f25116;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ long f25117;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ String f25118;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ String f25119;

    public RunnableC9630(C9631 c9631, String str, long j, String str2, String str3, Integer num, String str4) {
        this.f25116 = c9631;
        this.f25119 = str;
        this.f25117 = j;
        this.f25118 = str2;
        this.f25114 = str3;
        this.f25113 = num;
        this.f25115 = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(Long.parseLong(String.valueOf(this.f25116.f25120.m12399(0, "delay"))));
        } catch (InterruptedException unused) {
        }
        String strValueOf = String.valueOf(this.f25117);
        int iIntValue = this.f25113.intValue();
        String str = this.f25115;
        String str2 = this.f25119;
        String str3 = this.f25118;
        String str4 = this.f25114;
        try {
            if (iIntValue == 1) {
                AbstractC7277.m12540(str3, String.valueOf(iIntValue), str4, str2, strValueOf);
            } else if (iIntValue == 32) {
                AbstractC7275.m12538(str3, String.valueOf(iIntValue), str4, str, str2);
            } else if (iIntValue == 65536 || iIntValue != 1024) {
            } else {
                AbstractC7279.m12541(str3, String.valueOf(iIntValue), str4, str2, strValueOf);
            }
        } catch (Exception e) {
            String strM14532 = "hb";
            String str5 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14532, e.toString(), e, true);
        }
    }
}
