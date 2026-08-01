package p007;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲楪苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6146 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f16758;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Drawable f16759;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16760;

    public /* synthetic */ RunnableC6146(View view, Drawable drawable, int i) {
        this.f16760 = i;
        this.f16758 = view;
        this.f16759 = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f16760;
        Drawable drawable = this.f16759;
        View view = this.f16758;
        switch (i) {
            case 0:
                view.animate().alpha(1.0f).setDuration(300L).withEndAction(new RunnableC6146(view, drawable, 2)).start();
                break;
            case 1:
                view.animate().alpha(1.0f).setDuration(300L).withEndAction(new RunnableC6146(view, drawable, 3)).start();
                break;
            case 2:
                view.setBackground(drawable);
                break;
            default:
                view.setBackground(drawable);
                break;
        }
    }
}
