package p273;

import androidx.recyclerview.widget.C3325;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9044 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C9041 f23011;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f23012;

    public /* synthetic */ RunnableC9044(C9041 c9041, int i) {
        this.f23012 = i;
        this.f23011 = c9041;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f23012;
        C9041 c9041 = this.f23011;
        switch (i) {
            case 0:
                C3325 c3325 = c9041.f22998;
                if (c3325 != null) {
                    c3325.m5496();
                }
                break;
            default:
                C3325 c33252 = c9041.f22998;
                if (c33252 != null) {
                    c33252.m5493(null);
                    break;
                }
                break;
        }
    }
}
