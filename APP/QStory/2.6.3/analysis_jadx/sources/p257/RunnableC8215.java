package p257;

import androidx.recyclerview.widget.C2492;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8215 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8212 f22666;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22667;

    public /* synthetic */ RunnableC8215(C8212 c8212, int i) {
        this.f22667 = i;
        this.f22666 = c8212;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f22667;
        C8212 c8212 = this.f22666;
        switch (i) {
            case 0:
                C2492 c2492 = c8212.f22653;
                if (c2492 != null) {
                    c2492.m4936();
                }
                break;
            default:
                C2492 c24922 = c8212.f22653;
                if (c24922 != null) {
                    c24922.m4933(null);
                    break;
                }
                break;
        }
    }
}
