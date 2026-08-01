package p342;

import android.view.View;
import androidx.viewpager2.widget.C2549;
import com.bumptech.glide.load.engine.C3005;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: 飘花落叶言苏哲世子兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC8816 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f24815;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f24816;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24817;

    public /* synthetic */ ViewOnClickListenerC8816(Object obj, int i, int i2) {
        this.f24817 = i2;
        this.f24816 = obj;
        this.f24815 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f24817;
        int i2 = this.f24815;
        C3005 c3005 = (C3005) this.f24816;
        switch (i) {
            case 0:
                C2549 c2549 = (C2549) c3005.f9535;
                if (c2549 != null) {
                    c2549.setCurrentItem(i2);
                    return;
                } else {
                    AbstractC4395.m8908("viewPager");
                    throw null;
                }
            default:
                C2549 c25492 = (C2549) c3005.f9535;
                if (c25492 != null) {
                    c25492.setCurrentItem(i2);
                    return;
                } else {
                    AbstractC4395.m8908("viewPager");
                    throw null;
                }
        }
    }
}
