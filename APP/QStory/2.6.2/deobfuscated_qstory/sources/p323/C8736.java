package p323;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC2484;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3061;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.davemorrissey.labs.subscaleview.R;
import java.io.File;
import p035.AbstractC6340;
import p217.AbstractC7968;
import p315.C8671;
import p324.C8744;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8736 extends AbstractC7968 {
    @Override // p217.AbstractC7968
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC2484 mo13427(Context context, ViewGroup viewGroup, int i) {
        "context";
        "parent";
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_sticker_image, viewGroup, false);
        "inflate(...)";
        viewInflate.getClass();
        return new C8671(viewInflate);
    }

    @Override // p217.AbstractC7968
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo13429(AbstractC2484 abstractC2484, int i, Object obj) {
        C8671 c8671 = (C8671) abstractC2484;
        C8744 c8744 = (C8744) obj;
        "holder";
        if (c8744 == null) {
            return;
        }
        ((C3061) ComponentCallbacks2C3057.m6720(AbstractC6340.f17460).m6754(new File(c8744.f24649)).m6554()).m6744((ImageView) c8671.m14342(R.id.iv_sticker_img));
    }
}
