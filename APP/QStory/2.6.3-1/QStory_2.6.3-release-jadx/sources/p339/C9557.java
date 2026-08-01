package p339;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC3283;
import androidx.recyclerview.widget.AbstractC3317;
import com.bumptech.glide.C3894;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.bumptech.glide.load.resource.bitmap.C3869;
import com.bumptech.glide.load.resource.bitmap.C3874;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC5227;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC6392;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9557 extends AbstractC3283 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public String f24942;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C9554 f24943;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f24944;

    public C9557(List list, String str, C9554 c9554) {
        AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜呜");
        list.getClass();
        AbstractC9234.m14531(2727);
        str.getClass();
        AbstractC9234.m14531(2728);
        this.f24944 = list;
        this.f24943 = c9554;
        this.f24942 = str;
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo5354() {
        return this.f24944.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC3317 mo5358(int i, ViewGroup viewGroup) {
        AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵呜呜喵喵喵");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0328R.layout.item_cover_select, viewGroup, false);
        viewInflate.getClass();
        return new C9556(viewInflate);
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo5365(AbstractC3317 abstractC3317, int i) {
        C9556 c9556 = (C9556) abstractC3317;
        AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        File file = (File) this.f24944.get(i);
        C3894 c3894M7359 = ComponentCallbacks2C3890.m7325(c9556.itemView.getContext()).m7359(file);
        c3894M7359.getClass();
        ((C3894) c3894M7359.m7183(C3869.f10012, new C3874())).m7349(c9556.f24941);
        c9556.f24940.setVisibility(AbstractC5227.m9466(file.getName(), this.f24942) ? 0 : 8);
        c9556.itemView.setOnClickListener(new ViewOnClickListenerC6392(this, 11, file));
    }
}
