package p167;

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
public final class C8415 extends View {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8414 f20899;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f20900;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8415(C8414 c8414, Context context, ViewGroup viewGroup) {
        super(context);
        this.f20899 = c8414;
        this.f20900 = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        C8414 c8414 = this.f20899;
        ArrayList arrayList = c8414.f20897;
        Drawable background = this.f20900.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (c8414.f20894 != color) {
            c8414.f20894 = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C8416) arrayList.get(size)).m13376(color);
            }
        }
    }
}
