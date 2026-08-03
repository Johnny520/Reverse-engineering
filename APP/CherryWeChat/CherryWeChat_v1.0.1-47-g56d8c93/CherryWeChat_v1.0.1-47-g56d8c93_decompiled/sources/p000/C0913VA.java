package p000;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1158g;
import androidx.recyclerview.widget.AbstractC1166o;
import com.bumptech.glide.ComponentCallbacks2C1273a;
import io.github.cherrywechat.R;
import io.github.cherrywechat.network.model.ThemeStoreItem;
import java.util.ArrayList;

/* JADX INFO: renamed from: VA */
/* JADX INFO: loaded from: classes.dex */
public final class C0913VA extends AbstractC1158g {

    /* JADX INFO: renamed from: a */
    public ArrayList f2842a;

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final int getItemCount() {
        return this.f2842a.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final void onBindViewHolder(AbstractC1166o abstractC1166o, int i) {
        String strM625r;
        AbstractC0295Gu.m625r(-488440860768309L);
        C0827TA c0827ta = ((C0870UA) abstractC1166o).f2753a;
        ThemeStoreItem themeStoreItem = (ThemeStoreItem) this.f2842a.get(i);
        ImageView imageView = c0827ta.f2605a;
        AbstractC0295Gu.m625r(-488191752665141L);
        c0827ta.f2606b.setText(themeStoreItem.getName());
        c0827ta.f2607c.setText(themeStoreItem.getAuthor());
        TextView textView = c0827ta.f2608d;
        if (themeStoreItem.getPrice() > 0.0d) {
            strM625r = "¥" + themeStoreItem.getPrice();
        } else {
            strM625r = AbstractC0295Gu.m625r(-488213227501621L);
        }
        textView.setText(strM625r);
        ((C1193aw) ((C1193aw) ((C1193aw) ComponentCallbacks2C1273a.m2415d(imageView).m2833n(themeStoreItem.getCoverImage()).m5309b()).m5316k()).m5312f(R.drawable.ic_theme)).m2298A(imageView);
        c0827ta.setOnClickListener(new ViewOnClickListenerC2176l5(20, c0827ta, themeStoreItem));
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final AbstractC1166o onCreateViewHolder(ViewGroup viewGroup, int i) {
        AbstractC0295Gu.m625r(-488342076520501L);
        Context context = viewGroup.getContext();
        AbstractC0295Gu.m625r(-488372141291573L);
        return new C0870UA(new C0827TA(context));
    }
}
