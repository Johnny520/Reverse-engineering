package p151;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7586 extends View {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C7585 f20554;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f20555;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7586(C7585 c7585, Context context, ViewGroup viewGroup) {
        super(context);
        this.f20554 = c7585;
        this.f20555 = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        C7585 c7585 = this.f20554;
        ArrayList arrayList = c7585.f20552;
        Drawable background = this.f20555.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (c7585.f20549 != color) {
            c7585.f20549 = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C7587) arrayList.get(size)).m12817(color);
            }
        }
    }
}
