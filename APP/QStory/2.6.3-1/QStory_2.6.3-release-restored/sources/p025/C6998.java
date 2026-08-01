package p025;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.compose.C0849;
import androidx.recyclerview.widget.AbstractC3283;
import androidx.recyclerview.widget.AbstractC3317;
import com.davemorrissey.labs.subscaleview.C0328R;
import io.ktor.util.C5043;
import java.util.List;
import lin.xposed.hook.view.main.SearchHelper$MatchType;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC6392;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6998 extends AbstractC3283 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0849 f17308;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f17309;

    public C6998(List list, C0849 c0849) {
        "results";
        "onItemClick";
        this.f17309 = list;
        this.f17308 = c0849;
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo5354() {
        return this.f17309.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC3317 mo5358(int i, ViewGroup viewGroup) {
        "parent";
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0328R.layout.item_search_result, viewGroup, false);
        viewInflate.getClass();
        return new C7000(viewInflate);
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo5365(AbstractC3317 abstractC3317, int i) {
        String strM14532;
        int i2;
        C7000 c7000 = (C7000) abstractC3317;
        "holder";
        TextView textView = c7000.f17313;
        C7003 c7003 = (C7003) this.f17309.get(i);
        TextView textView2 = c7000.f17315;
        String str = c7003.f17328;
        SearchHelper$MatchType searchHelper$MatchType = c7003.f17324;
        textView2.setText(str);
        TextView textView3 = c7000.f17314;
        String str2 = c7003.f17327;
        textView3.setText(str2);
        textView3.setVisibility(str2 != null ? 0 : 8);
        int[] iArr = AbstractC6997.f17307;
        int i3 = iArr[searchHelper$MatchType.ordinal()];
        if (i3 == 1) {
            strM14532 = "功能";
        } else if (i3 == 2) {
            strM14532 = "目录";
        } else {
            if (i3 != 3) {
                C5043.m9170();
                return;
            }
            strM14532 = "分组";
        }
        textView.setText(strM14532);
        int i4 = iArr[searchHelper$MatchType.ordinal()];
        if (i4 == 1) {
            i2 = C0328R.drawable.bg_tag_function;
        } else if (i4 == 2) {
            i2 = C0328R.drawable.bg_tag_directory;
        } else {
            if (i4 != 3) {
                C5043.m9170();
                return;
            }
            i2 = C0328R.drawable.bg_tag_group;
        }
        textView.setBackgroundResource(i2);
        c7000.itemView.setOnClickListener(new ViewOnClickListenerC6392(this, 1, c7003));
    }
}
