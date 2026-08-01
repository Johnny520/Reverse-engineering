package p034;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6351 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C6350 f17496;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f17497;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17498;

    public /* synthetic */ RunnableC6351(C6350 c6350, int i, int i2) {
        this.f17498 = i2;
        this.f17496 = c6350;
        this.f17497 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f17498;
        int i2 = this.f17497;
        C6350 c6350 = this.f17496;
        switch (i) {
            case 0:
                new Handler(Looper.getMainLooper()).post(new RunnableC6351(c6350, i2, 1));
                break;
            default:
                HorizontalScrollView horizontalScrollView = c6350.f17489;
                ArrayList arrayList = c6350.f17495;
                horizontalScrollView.scrollTo(((View) arrayList.get(i2)).getLeft(), 0);
                ((View) arrayList.get(i2)).setBackground(c6350.getResources().getDrawable(R.drawable.menu_item_base, null));
                break;
        }
    }
}
