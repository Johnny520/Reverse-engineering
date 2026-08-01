package p050;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC7180 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C7179 f17841;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f17842;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17843;

    public /* synthetic */ RunnableC7180(C7179 c7179, int i, int i2) {
        this.f17843 = i2;
        this.f17841 = c7179;
        this.f17842 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f17843;
        int i2 = this.f17842;
        C7179 c7179 = this.f17841;
        switch (i) {
            case 0:
                new Handler(Looper.getMainLooper()).post(new RunnableC7180(c7179, i2, 1));
                break;
            default:
                HorizontalScrollView horizontalScrollView = c7179.f17834;
                ArrayList arrayList = c7179.f17840;
                horizontalScrollView.scrollTo(((View) arrayList.get(i2)).getLeft(), 0);
                ((View) arrayList.get(i2)).setBackground(c7179.getResources().getDrawable(C0328R.drawable.menu_item_base, null));
                break;
        }
    }
}
