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
    public final void onBindViewHolder(AbstractC1166o r7, int r8) {
        AbstractC0295Gu.m625r(-488440860768309L);
        C0827TA r72 = ((C0870UA) r7).f2753a;
        ThemeStoreItem r82 = (ThemeStoreItem) this.f2842a.get(r8);
        ImageView r0 = r72.f2605a;
        AbstractC0295Gu.m625r(-488191752665141L);
        r72.f2606b.setText(r82.getName());
        r72.f2607c.setText(r82.getAuthor());
        TextView r1 = r72.f2608d;
        if (r82.getPrice() <= 0.0d) goto L5;
        String r2 = "¥" + r82.getPrice();
    L6:
        r1.setText(r2);
        ((C1193aw) ((C1193aw) ((C1193aw) ComponentCallbacks2C1273a.m2415d(r0).m2833n(r82.getCoverImage()).m5309b()).m5316k()).m5312f(R.drawable.ic_theme)).m2298A(r0);
        r72.setOnClickListener(new ViewOnClickListenerC2176l5(20, r72, r82));
        return;
    L5:
        r2 = AbstractC0295Gu.m625r(-488213227501621L);
        goto L6
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final AbstractC1166o onCreateViewHolder(ViewGroup r4, int r5) {
        AbstractC0295Gu.m625r(-488342076520501L);
        Context r42 = r4.getContext();
        AbstractC0295Gu.m625r(-488372141291573L);
        return new C0870UA(new C0827TA(r42));
    }
}
