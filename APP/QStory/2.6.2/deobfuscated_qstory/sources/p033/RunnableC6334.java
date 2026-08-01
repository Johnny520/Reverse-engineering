package p033;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6334 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C6327 f17449;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f17450;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17451;

    public /* synthetic */ RunnableC6334(C6327 c6327, int i, int i2) {
        this.f17451 = i2;
        this.f17449 = c6327;
        this.f17450 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f17451;
        int i2 = this.f17450;
        C6327 c6327 = this.f17449;
        switch (i) {
            case 0:
                new Handler(Looper.getMainLooper()).post(new RunnableC6334(c6327, i2, 1));
                break;
            default:
                HorizontalScrollView horizontalScrollView = c6327.f17433;
                ArrayList arrayList = c6327.f17439;
                horizontalScrollView.scrollTo(((View) arrayList.get(i2)).getLeft(), 0);
                ((View) arrayList.get(i2)).setBackground(c6327.getResources().getDrawable(R.drawable.menu_item_base, null));
                break;
        }
    }
}
