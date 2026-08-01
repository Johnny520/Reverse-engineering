package p025;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC7001 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f17316;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Drawable f17317;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17318;

    public /* synthetic */ RunnableC7001(View view, Drawable drawable, int i) {
        this.f17318 = i;
        this.f17316 = view;
        this.f17317 = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f17318;
        Drawable drawable = this.f17317;
        View view = this.f17316;
        switch (i) {
            case 0:
                view.animate().alpha(1.0f).setDuration(300L).withEndAction(new RunnableC7001(view, drawable, 2)).start();
                break;
            case 1:
                view.setBackground(drawable);
                break;
            case 2:
                view.setBackground(drawable);
                break;
            default:
                view.animate().alpha(1.0f).setDuration(300L).withEndAction(new RunnableC7001(view, drawable, 1)).start();
                break;
        }
    }
}
