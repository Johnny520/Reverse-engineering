package p000;

import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC1158g;
import androidx.recyclerview.widget.AbstractC1166o;
import com.bumptech.glide.ComponentCallbacks2C1273a;
import io.github.cherrywechat.R;
import java.util.List;

/* JADX INFO: renamed from: JA */
/* JADX INFO: loaded from: classes.dex */
public final class C0398JA extends AbstractC1158g {

    /* JADX INFO: renamed from: a */
    public final List f1343a;

    /* JADX INFO: renamed from: b */
    public final int f1344b;

    /* JADX INFO: renamed from: c */
    public final int f1345c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0784SA f1346d;

    public C0398JA(C0784SA c0784sa, List list) {
        AbstractC0295Gu.m625r(-492035748395061L);
        this.f1346d = c0784sa;
        this.f1343a = list;
        this.f1344b = AbstractC0295Gu.m616i(130);
        this.f1345c = AbstractC0295Gu.m616i(300);
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final int getItemCount() {
        return this.f1343a.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final void onBindViewHolder(AbstractC1166o abstractC1166o, int i) {
        C0441KA c0441ka = (C0441KA) abstractC1166o;
        AbstractC0295Gu.m625r(-492087288002613L);
        String str = (String) this.f1343a.get(i);
        ImageView imageView = c0441ka.f1443b;
        ComponentCallbacks2C1273a.m2415d(imageView).m2833n(str).mo2301a(((C2252mw) ((C2252mw) new C2252mw().m5318m(C2457re.f8656b, new C2804zh(), true)).m5316k()).m5312f(R.drawable.ic_theme)).m2299B(new C1461gk(2, c0441ka)).m2298A(imageView);
        c0441ka.f1442a.setOnClickListener(new ViewOnClickListenerC0910V7(i, this, c0441ka, this.f1346d));
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final AbstractC1166o onCreateViewHolder(ViewGroup viewGroup, int i) {
        AbstractC0295Gu.m625r(-492057223231541L);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        C2431qv c2431qv = new C2431qv(this.f1344b, -2);
        ((ViewGroup.MarginLayoutParams) c2431qv).rightMargin = AbstractC0295Gu.m616i(12);
        frameLayout.setLayoutParams(c2431qv);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(viewGroup.getContext().getColor(R.color.colorBackground));
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(12));
        frameLayout.setBackground(gradientDrawable);
        frameLayout.setPadding(AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(4));
        ImageView imageView = new ImageView(viewGroup.getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        imageView.setMaxHeight(this.f1345c);
        imageView.setOutlineProvider(new C2122k(4));
        imageView.setClipToOutline(true);
        frameLayout.addView(imageView);
        return new C0441KA(frameLayout, imageView);
    }
}
