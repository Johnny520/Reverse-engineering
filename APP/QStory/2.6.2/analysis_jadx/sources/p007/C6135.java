package p007;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.compose.C0002;
import androidx.recyclerview.widget.AbstractC2450;
import androidx.recyclerview.widget.AbstractC2484;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.util.C4210;
import java.util.List;
import lin.xposed.hook.view.main.SearchHelper$MatchType;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5561;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲楪苏.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6135 extends AbstractC2450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0002 f16724;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f16725;

    public C6135(List list, C0002 c0002) {
        AbstractC3056.m6668(-3937687679903466919L);
        AbstractC3056.m6668(-3937687714263205287L);
        this.f16725 = list;
        this.f16724 = c0002;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo4784() {
        return this.f16725.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC2484 mo4788(int i, ViewGroup viewGroup) {
        AbstractC3056.m6668(-3937690699265476007L);
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_search_result, viewGroup, false);
        viewInflate.getClass();
        return new C6137(viewInflate);
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo4795(AbstractC2484 abstractC2484, int i) {
        String strM6668;
        int i2;
        C6137 c6137 = (C6137) abstractC2484;
        AbstractC3056.m6668(-3937690694970508711L);
        TextView textView = c6137.f16726;
        C6143 c6143 = (C6143) this.f16725.get(i);
        TextView textView2 = c6137.f16728;
        String str = c6143.f16743;
        SearchHelper$MatchType searchHelper$MatchType = c6143.f16739;
        textView2.setText(str);
        TextView textView3 = c6137.f16727;
        String str2 = c6143.f16742;
        textView3.setText(str2);
        textView3.setVisibility(str2 != null ? 0 : 8);
        int[] iArr = AbstractC6134.f16723;
        int i3 = iArr[searchHelper$MatchType.ordinal()];
        if (i3 == 1) {
            strM6668 = AbstractC3056.m6668(-3937687594004120999L);
        } else if (i3 == 2) {
            strM6668 = AbstractC3056.m6668(-3937688044975687079L);
        } else {
            if (i3 != 3) {
                C4210.m8621();
                return;
            }
            strM6668 = AbstractC3056.m6668(-3937687641248761255L);
        }
        textView.setText(strM6668);
        int i4 = iArr[searchHelper$MatchType.ordinal()];
        if (i4 == 1) {
            i2 = R.drawable.bg_tag_function;
        } else if (i4 == 2) {
            i2 = R.drawable.bg_tag_directory;
        } else {
            if (i4 != 3) {
                C4210.m8621();
                return;
            }
            i2 = R.drawable.bg_tag_group;
        }
        textView.setBackgroundResource(i2);
        c6137.itemView.setOnClickListener(new ViewOnClickListenerC5561(this, 1, c6143));
    }
}
