package p009;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6173 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Drawable f16974;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f16975;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ ColorDrawable f16976;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16977;

    public /* synthetic */ RunnableC6173(View view, ColorDrawable colorDrawable, Drawable drawable, int i) {
        this.f16977 = i;
        this.f16975 = view;
        this.f16976 = colorDrawable;
        this.f16974 = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f16977;
        int i2 = 0;
        Drawable drawable = this.f16974;
        ColorDrawable colorDrawable = this.f16976;
        View view = this.f16975;
        switch (i) {
            case 0:
                view.setBackground(colorDrawable);
                view.setAlpha(0.6f);
                view.postDelayed(new RunnableC6172(view, drawable, 0), 200L);
                break;
            default:
                view.setBackground(colorDrawable);
                view.setAlpha(0.6f);
                view.postDelayed(new RunnableC6172(view, drawable, 3), 200L);
                view.postDelayed(new RunnableC6173(view, colorDrawable, drawable, i2), 600L);
                break;
        }
    }
}
