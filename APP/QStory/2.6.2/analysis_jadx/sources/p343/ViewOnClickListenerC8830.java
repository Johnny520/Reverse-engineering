package p343;

import android.view.View;
import androidx.viewpager2.widget.C2549;
import com.bumptech.glide.load.engine.C3004;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: 飘花落叶言苏哲世楪子兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC8830 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f24834;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f24835;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24836;

    public /* synthetic */ ViewOnClickListenerC8830(Object obj, int i, int i2) {
        this.f24836 = i2;
        this.f24835 = obj;
        this.f24834 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f24836;
        int i2 = this.f24834;
        C3004 c3004 = (C3004) this.f24835;
        switch (i) {
            case 0:
                C2549 c2549 = (C2549) c3004.f9533;
                if (c2549 != null) {
                    c2549.setCurrentItem(i2);
                    return;
                } else {
                    AbstractC4394.m8918("viewPager");
                    throw null;
                }
            default:
                C2549 c25492 = (C2549) c3004.f9533;
                if (c25492 != null) {
                    c25492.setCurrentItem(i2);
                    return;
                } else {
                    AbstractC4394.m8918("viewPager");
                    throw null;
                }
        }
    }
}
