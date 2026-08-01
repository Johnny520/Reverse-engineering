package p336;

import java.util.concurrent.TimeUnit;
import p010.AbstractC6188;
import p042.AbstractC6446;
import p042.AbstractC6448;
import p042.AbstractC6450;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰哲子.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC8801 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Integer f24768;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ String f24769;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ String f24770;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ C8802 f24771;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ long f24772;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ String f24773;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ String f24774;

    public RunnableC8801(C8802 c8802, String str, long j, String str2, String str3, Integer num, String str4) {
        this.f24771 = c8802;
        this.f24774 = str;
        this.f24772 = j;
        this.f24773 = str2;
        this.f24769 = str3;
        this.f24768 = num;
        this.f24770 = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(Long.parseLong(String.valueOf(this.f24771.f24775.m11840(0, AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵")))));
        } catch (InterruptedException unused) {
        }
        String strValueOf = String.valueOf(this.f24772);
        int iIntValue = this.f24768.intValue();
        String str = this.f24770;
        String str2 = this.f24774;
        String str3 = this.f24773;
        String str4 = this.f24769;
        try {
            if (iIntValue == 1) {
                AbstractC6448.m11981(str3, String.valueOf(iIntValue), str4, str2, strValueOf);
            } else if (iIntValue == 32) {
                AbstractC6446.m11979(str3, String.valueOf(iIntValue), str4, str, str2);
            } else if (iIntValue == 65536 || iIntValue != 1024) {
            } else {
                AbstractC6450.m11982(str3, String.valueOf(iIntValue), str4, str2, strValueOf);
            }
        } catch (Exception e) {
            String strM13973 = AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜喵呜呜呜");
            String str5 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13973, e.toString(), e, true);
        }
    }
}
