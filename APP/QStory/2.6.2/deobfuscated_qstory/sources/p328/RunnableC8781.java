package p328;

import com.bumptech.glide.AbstractC3056;
import java.util.concurrent.TimeUnit;
import p010.AbstractC6157;
import p041.AbstractC6436;
import p041.AbstractC6438;
import p041.AbstractC6440;

/* JADX INFO: renamed from: 飘花落叶言苏世哲子楪兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC8781 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Integer f24725;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ String f24726;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ String f24727;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ C8784 f24728;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ long f24729;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ String f24730;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ String f24731;

    public RunnableC8781(C8784 c8784, String str, long j, String str2, String str3, Integer num, String str4) {
        this.f24728 = c8784;
        this.f24731 = str;
        this.f24729 = j;
        this.f24730 = str2;
        this.f24726 = str3;
        this.f24725 = num;
        this.f24727 = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(Long.parseLong(String.valueOf(this.f24728.f24734.m11812(0, "delay"))));
        } catch (InterruptedException unused) {
        }
        String strValueOf = String.valueOf(this.f24729);
        int iIntValue = this.f24725.intValue();
        String str = this.f24727;
        String str2 = this.f24731;
        String str3 = this.f24730;
        String str4 = this.f24726;
        try {
            if (iIntValue == 1) {
                AbstractC6438.m11937(str3, String.valueOf(iIntValue), str4, str2, strValueOf);
            } else if (iIntValue == 32) {
                AbstractC6436.m11935(str3, String.valueOf(iIntValue), str4, str, str2);
            } else if (iIntValue == 65536 || iIntValue != 1024) {
            } else {
                AbstractC6440.m11938(str3, String.valueOf(iIntValue), str4, str2, strValueOf);
            }
        } catch (Exception e) {
            String strM6668 = "hb";
            String str5 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
        }
    }
}
