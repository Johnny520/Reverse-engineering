package p009;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.compose.C0002;
import androidx.recyclerview.widget.AbstractC2450;
import androidx.recyclerview.widget.AbstractC2484;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.util.C4211;
import java.util.List;
import lin.xposed.hook.view.main.SearchHelper$MatchType;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5562;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6169 extends AbstractC2450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0002 f16963;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f16964;

    public C6169(List list, C0002 c0002) {
        AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵~喵喵喵呜喵喵呜喵");
        AbstractC8405.m13972(1331);
        this.f16964 = list;
        this.f16963 = c0002;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo4794() {
        return this.f16964.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC2484 mo4798(int i, ViewGroup viewGroup) {
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵呜呜喵喵喵");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_search_result, viewGroup, false);
        viewInflate.getClass();
        return new C6171(viewInflate);
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo4805(AbstractC2484 abstractC2484, int i) {
        String strM13973;
        int i2;
        C6171 c6171 = (C6171) abstractC2484;
        AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        TextView textView = c6171.f16968;
        C6174 c6174 = (C6174) this.f16964.get(i);
        TextView textView2 = c6171.f16970;
        String str = c6174.f16983;
        SearchHelper$MatchType searchHelper$MatchType = c6174.f16979;
        textView2.setText(str);
        TextView textView3 = c6171.f16969;
        String str2 = c6174.f16982;
        textView3.setText(str2);
        textView3.setVisibility(str2 != null ? 0 : 8);
        int[] iArr = AbstractC6168.f16962;
        int i3 = iArr[searchHelper$MatchType.ordinal()];
        if (i3 == 1) {
            strM13973 = AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜呜呜~呜呜呜喵喵呜喵呜~呜喵喵喵喵喵喵喵~呜呜呜喵喵呜呜喵~呜呜喵呜喵喵喵呜");
        } else if (i3 == 2) {
            strM13973 = AbstractC8405.m13973("呜喵喵呜喵呜喵喵~呜呜呜喵呜呜呜喵~呜呜喵呜喵呜喵喵~呜喵喵喵呜呜喵呜~呜呜喵呜呜喵喵喵~呜呜呜呜呜喵喵呜");
        } else {
            if (i3 != 3) {
                C4211.m8611();
                return;
            }
            strM13973 = AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜喵呜~呜呜呜呜呜呜喵喵~呜喵喵喵呜呜呜呜~呜呜喵呜呜呜呜喵~呜呜呜喵呜喵喵喵");
        }
        textView.setText(strM13973);
        int i4 = iArr[searchHelper$MatchType.ordinal()];
        if (i4 == 1) {
            i2 = R.drawable.bg_tag_function;
        } else if (i4 == 2) {
            i2 = R.drawable.bg_tag_directory;
        } else {
            if (i4 != 3) {
                C4211.m8611();
                return;
            }
            i2 = R.drawable.bg_tag_group;
        }
        textView.setBackgroundResource(i2);
        c6171.itemView.setOnClickListener(new ViewOnClickListenerC5562(this, 1, c6174));
    }
}
