package p340;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC3317;
import com.bumptech.glide.C3894;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.io.File;
import p052.AbstractC7187;
import p233.AbstractC8798;
import p331.C9492;
import p337.C9523;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪子哲.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9568 extends AbstractC8798 {
    @Override // p233.AbstractC8798
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC3317 mo14014(Context context, ViewGroup viewGroup, int i) {
        "context";
        "parent";
        View viewInflate = LayoutInflater.from(context).inflate(C0328R.layout.item_sticker_image, viewGroup, false);
        "inflate(...)";
        viewInflate.getClass();
        return new C9492(viewInflate);
    }

    @Override // p233.AbstractC8798
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo14016(AbstractC3317 abstractC3317, int i, Object obj) {
        C9492 c9492 = (C9492) abstractC3317;
        C9523 c9523 = (C9523) obj;
        "holder";
        if (c9523 == null) {
            return;
        }
        ((C3894) ComponentCallbacks2C3890.m7325(AbstractC7187.f17852).m7359(new File(c9523.f24861)).m7174()).m7349((ImageView) c9492.m14919(C0328R.id.iv_sticker_img));
    }
}
