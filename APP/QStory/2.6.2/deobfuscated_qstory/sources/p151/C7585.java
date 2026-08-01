package p151;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7585 extends View {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C7584 f20559;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f20560;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7585(C7584 c7584, Context context, ViewGroup viewGroup) {
        super(context);
        this.f20559 = c7584;
        this.f20560 = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        C7584 c7584 = this.f20559;
        ArrayList arrayList = c7584.f20557;
        Drawable background = this.f20560.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (c7584.f20554 != color) {
            c7584.f20554 = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C7586) arrayList.get(size)).m12788(color);
            }
        }
    }
}
