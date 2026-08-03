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

    public C0398JA(C0784SA r3, List r4) {
        AbstractC0295Gu.m625r(-492035748395061L);
        this.f1346d = r3;
        this.f1343a = r4;
        this.f1344b = AbstractC0295Gu.m616i(130);
        this.f1345c = AbstractC0295Gu.m616i(300);
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final int getItemCount() {
        return this.f1343a.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final void onBindViewHolder(AbstractC1166o r7, int r8) {
        C0441KA r72 = (C0441KA) r7;
        AbstractC0295Gu.m625r(-492087288002613L);
        String r0 = (String) this.f1343a.get(r8);
        ImageView r1 = r72.f1443b;
        ComponentCallbacks2C1273a.m2415d(r1).m2833n(r0).m2304w(((C2252mw) ((C2252mw) new C2252mw().m5318m(C2457re.f8656b, new C2804zh(), true)).m5316k()).m5312f(R.drawable.ic_theme)).m2299B(new C1461gk(2, r72)).m2298A(r1);
        r72.f1442a.setOnClickListener(new ViewOnClickListenerC0910V7(r8, this, r72, this.f1346d));
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final AbstractC1166o onCreateViewHolder(ViewGroup r6, int r7) {
        AbstractC0295Gu.m625r(-492057223231541L);
        FrameLayout r72 = new FrameLayout(r6.getContext());
        C2431qv r0 = new C2431qv(this.f1344b, -2);
        ((ViewGroup.MarginLayoutParams) r0).rightMargin = AbstractC0295Gu.m616i(12);
        r72.setLayoutParams(r0);
        GradientDrawable r02 = new GradientDrawable();
        r02.setColor(r6.getContext().getColor(R.color.colorBackground));
        r02.setCornerRadius(AbstractC0295Gu.m616i(12));
        r72.setBackground(r02);
        r72.setPadding(AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(4));
        ImageView r03 = new ImageView(r6.getContext());
        r03.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        r03.setScaleType(ImageView.ScaleType.FIT_CENTER);
        r03.setAdjustViewBounds(true);
        r03.setMaxHeight(this.f1345c);
        r03.setOutlineProvider(new C2122k(4));
        r03.setClipToOutline(true);
        r72.addView(r03);
        return new C0441KA(r72, r03);
    }
}
