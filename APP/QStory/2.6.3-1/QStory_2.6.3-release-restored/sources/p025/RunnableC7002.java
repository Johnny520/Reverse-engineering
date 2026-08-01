package p025;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC7002 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Drawable f17319;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f17320;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ ColorDrawable f17321;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17322;

    public /* synthetic */ RunnableC7002(View view, ColorDrawable colorDrawable, Drawable drawable, int i) {
        this.f17322 = i;
        this.f17320 = view;
        this.f17321 = colorDrawable;
        this.f17319 = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f17322;
        int i2 = 0;
        Drawable drawable = this.f17319;
        ColorDrawable colorDrawable = this.f17321;
        View view = this.f17320;
        switch (i) {
            case 0:
                view.setBackground(colorDrawable);
                view.setAlpha(0.6f);
                view.postDelayed(new RunnableC7001(view, drawable, 0), 200L);
                break;
            default:
                view.setBackground(colorDrawable);
                view.setAlpha(0.6f);
                view.postDelayed(new RunnableC7001(view, drawable, 3), 200L);
                view.postDelayed(new RunnableC7002(view, colorDrawable, drawable, i2), 600L);
                break;
        }
    }
}
