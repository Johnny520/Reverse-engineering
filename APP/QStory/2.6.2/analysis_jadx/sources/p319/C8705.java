package p319;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC2450;
import androidx.recyclerview.widget.AbstractC2484;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3061;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.bumptech.glide.load.resource.bitmap.C3036;
import com.bumptech.glide.load.resource.bitmap.C3041;
import com.davemorrissey.labs.subscaleview.R;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC4394;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5561;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8705 extends AbstractC2450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public String f24547;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8702 f24548;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f24549;

    public C8705(List list, String str, C8702 c8702) {
        AbstractC3056.m6668(-3937630037147387303L);
        list.getClass();
        AbstractC3056.m6668(-3937831123221218727L);
        str.getClass();
        AbstractC3056.m6668(-3937831041616840103L);
        this.f24549 = list;
        this.f24548 = c8702;
        this.f24547 = str;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo4784() {
        return this.f24549.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC2484 mo4788(int i, ViewGroup viewGroup) {
        AbstractC3056.m6668(-3937690699265476007L);
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cover_select, viewGroup, false);
        viewInflate.getClass();
        return new C8704(viewInflate);
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo4795(AbstractC2484 abstractC2484, int i) {
        C8704 c8704 = (C8704) abstractC2484;
        AbstractC3056.m6668(-3937690694970508711L);
        File file = (File) this.f24549.get(i);
        C3061 c3061M6754 = ComponentCallbacks2C3057.m6720(c8704.itemView.getContext()).m6754(file);
        c3061M6754.getClass();
        ((C3061) c3061M6754.m6563(C3036.f9665, new C3041())).m6744(c8704.f24546);
        c8704.f24545.setVisibility(AbstractC4394.m8917(file.getName(), this.f24547) ? 0 : 8);
        c8704.itemView.setOnClickListener(new ViewOnClickListenerC5561(this, 11, file));
    }
}
