package p323;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC2450;
import androidx.recyclerview.widget.AbstractC2484;
import com.bumptech.glide.C3062;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.bumptech.glide.load.resource.bitmap.C3037;
import com.bumptech.glide.load.resource.bitmap.C3042;
import com.davemorrissey.labs.subscaleview.R;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC4395;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5562;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8728 extends AbstractC2450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public String f24597;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8725 f24598;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f24599;

    public C8728(List list, String str, C8725 c8725) {
        AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜呜");
        list.getClass();
        AbstractC8405.m13972(2727);
        str.getClass();
        AbstractC8405.m13972(2728);
        this.f24599 = list;
        this.f24598 = c8725;
        this.f24597 = str;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo4794() {
        return this.f24599.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC2484 mo4798(int i, ViewGroup viewGroup) {
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵呜呜喵喵喵");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cover_select, viewGroup, false);
        viewInflate.getClass();
        return new C8727(viewInflate);
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo4805(AbstractC2484 abstractC2484, int i) {
        C8727 c8727 = (C8727) abstractC2484;
        AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        File file = (File) this.f24599.get(i);
        C3062 c3062M6799 = ComponentCallbacks2C3058.m6765(c8727.itemView.getContext()).m6799(file);
        c3062M6799.getClass();
        ((C3062) c3062M6799.m6623(C3037.f9667, new C3042())).m6789(c8727.f24596);
        c8727.f24595.setVisibility(AbstractC4395.m8907(file.getName(), this.f24597) ? 0 : 8);
        c8727.itemView.setOnClickListener(new ViewOnClickListenerC5562(this, 11, file));
    }
}
