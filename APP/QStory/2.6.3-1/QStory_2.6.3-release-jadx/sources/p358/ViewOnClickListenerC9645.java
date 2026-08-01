package p358;

import android.view.View;
import androidx.viewpager2.widget.C3382;
import com.bumptech.glide.load.engine.C3837;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: 飘花落叶言苏哲世子兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC9645 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f25160;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f25161;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25162;

    public /* synthetic */ ViewOnClickListenerC9645(Object obj, int i, int i2) {
        this.f25162 = i2;
        this.f25161 = obj;
        this.f25160 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f25162;
        int i2 = this.f25160;
        C3837 c3837 = (C3837) this.f25161;
        switch (i) {
            case 0:
                C3382 c3382 = (C3382) c3837.f9880;
                if (c3382 != null) {
                    c3382.setCurrentItem(i2);
                    return;
                } else {
                    AbstractC5227.m9467("viewPager");
                    throw null;
                }
            default:
                C3382 c33822 = (C3382) c3837.f9880;
                if (c33822 != null) {
                    c33822.setCurrentItem(i2);
                    return;
                } else {
                    AbstractC5227.m9467("viewPager");
                    throw null;
                }
        }
    }
}
