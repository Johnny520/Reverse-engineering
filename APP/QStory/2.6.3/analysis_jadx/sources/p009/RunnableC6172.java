package p009;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6172 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f16971;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Drawable f16972;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16973;

    public /* synthetic */ RunnableC6172(View view, Drawable drawable, int i) {
        this.f16973 = i;
        this.f16971 = view;
        this.f16972 = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f16973;
        Drawable drawable = this.f16972;
        View view = this.f16971;
        switch (i) {
            case 0:
                view.animate().alpha(1.0f).setDuration(300L).withEndAction(new RunnableC6172(view, drawable, 2)).start();
                break;
            case 1:
                view.setBackground(drawable);
                break;
            case 2:
                view.setBackground(drawable);
                break;
            default:
                view.animate().alpha(1.0f).setDuration(300L).withEndAction(new RunnableC6172(view, drawable, 1)).start();
                break;
        }
    }
}
