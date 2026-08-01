package p007;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲楪苏.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6147 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Drawable f16761;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f16762;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ ColorDrawable f16763;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16764;

    public /* synthetic */ RunnableC6147(View view, ColorDrawable colorDrawable, Drawable drawable, int i) {
        this.f16764 = i;
        this.f16762 = view;
        this.f16763 = colorDrawable;
        this.f16761 = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f16764;
        Drawable drawable = this.f16761;
        ColorDrawable colorDrawable = this.f16763;
        View view = this.f16762;
        switch (i) {
            case 0:
                view.setBackground(colorDrawable);
                view.setAlpha(0.6f);
                view.postDelayed(new RunnableC6146(view, drawable, 1), 200L);
                break;
            default:
                view.setBackground(colorDrawable);
                view.setAlpha(0.6f);
                view.postDelayed(new RunnableC6146(view, drawable, 0), 200L);
                view.postDelayed(new RunnableC6147(view, colorDrawable, drawable, 0), 600L);
                break;
        }
    }
}
