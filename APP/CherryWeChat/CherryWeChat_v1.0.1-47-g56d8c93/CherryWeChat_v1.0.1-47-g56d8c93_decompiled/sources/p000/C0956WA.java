package p000;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.github.cherrywechat.R;
import io.github.cherrywechat.network.model.ApiResponse;
import io.github.cherrywechat.network.model.ThemeStoreData;
import io.github.cherrywechat.network.model.ThemeStoreItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: WA */
/* JADX INFO: loaded from: classes.dex */
public final class C0956WA implements InterfaceC0972Wk {

    /* JADX INFO: renamed from: a */
    public FrameLayout f2989a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f2990b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f2991c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f2992d;

    /* JADX INFO: renamed from: e */
    public C0913VA f2993e;

    /* JADX INFO: renamed from: a */
    public static final List m1825a(C0956WA c0956wa, String str) {
        Object objM4550a;
        ThemeStoreData themeStoreData;
        List<ThemeStoreItem> items;
        try {
            C0029Am c0029Am = AbstractC2809zm.f9524a;
            c0029Am.getClass();
            objM4550a = c0029Am.m4550a(ApiResponse.Companion.serializer(ThemeStoreData.Companion.serializer()), str);
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-489213954881589L);
            AbstractC0425Jv.m881a(ApiResponse.class).m445b();
            AbstractC0295Gu.m625r(-488780163184693L);
            e.getMessage();
            objM4550a = null;
        }
        ApiResponse apiResponse = (ApiResponse) objM4550a;
        C0452Kf c0452Kf = C0452Kf.f1484a;
        return (apiResponse == null || apiResponse.getCode() != 0 || (themeStoreData = (ThemeStoreData) apiResponse.getData()) == null || (items = themeStoreData.getItems()) == null) ? c0452Kf : items;
    }

    /* JADX INFO: renamed from: e */
    public static final void m1826e(C0956WA c0956wa, List list) {
        LinearLayout linearLayout = c0956wa.f2991c;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        if (list.isEmpty()) {
            RecyclerView recyclerView = c0956wa.f2990b;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            LinearLayout linearLayout2 = c0956wa.f2992d;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
                return;
            }
            return;
        }
        LinearLayout linearLayout3 = c0956wa.f2992d;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
        RecyclerView recyclerView2 = c0956wa.f2990b;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
        }
        C0913VA c0913va = c0956wa.f2993e;
        if (c0913va != null) {
            AbstractC0295Gu.m625r(-489020681353269L);
            c0913va.f2842a = new ArrayList(list);
            c0913va.notifyDataSetChanged();
        }
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        AbstractC0295Gu.m625r(-488797343053877L);
        this.f2989a = null;
        this.f2990b = null;
        this.f2991c = null;
        this.f2992d = null;
        this.f2993e = null;
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity activity, int i, int i2, Intent intent) {
        AbstractC0295Gu.m625r(-488835997759541L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity activity) {
        AbstractC0295Gu.m625r(-489059336058933L);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackgroundColor(frameLayout.getContext().getColor(R.color.colorBackground));
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f2989a = frameLayout;
        RecyclerView recyclerView = new RecyclerView(activity);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        recyclerView.setLayoutManager(new GridLayoutManager());
        recyclerView.setOverScrollMode(2);
        recyclerView.setPadding(AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8));
        recyclerView.setVisibility(8);
        this.f2990b = recyclerView;
        FrameLayout frameLayout2 = this.f2989a;
        if (frameLayout2 != null) {
            frameLayout2.addView(recyclerView);
        }
        RecyclerView recyclerView2 = this.f2990b;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(new C1320da(2));
        }
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ProgressBar progressBar = new ProgressBar(activity);
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(48), AbstractC0295Gu.m616i(48)));
        linearLayout.addView(progressBar);
        TextView textView = new TextView(activity);
        textView.setText(AbstractC0295Gu.m625r(-489097990764597L));
        textView.setGravity(17);
        textView.setTextSize(14.0f);
        textView.setTextColor(textView.getContext().getColor(R.color.textSummary));
        textView.setPadding(0, AbstractC0295Gu.m616i(16), 0, 0);
        linearLayout.addView(textView);
        this.f2991c = linearLayout;
        FrameLayout frameLayout3 = this.f2989a;
        if (frameLayout3 != null) {
            frameLayout3.addView(linearLayout);
        }
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(17);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        linearLayout2.setVisibility(8);
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.ic_cloud);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(64), AbstractC0295Gu.m616i(64)));
        imageView.setColorFilter(imageView.getContext().getColor(R.color.textSummary));
        linearLayout2.addView(imageView);
        TextView textView2 = new TextView(activity);
        textView2.setText(AbstractC0295Gu.m625r(-489149530372149L));
        textView2.setGravity(17);
        textView2.setTextSize(16.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setTextColor(textView2.getContext().getColor(R.color.textTitle));
        textView2.setPadding(0, AbstractC0295Gu.m616i(16), 0, 0);
        linearLayout2.addView(textView2);
        TextView textView3 = new TextView(activity);
        textView3.setText(AbstractC0295Gu.m625r(-489179595143221L));
        textView3.setTextSize(14.0f);
        textView3.setGravity(17);
        textView3.setTextColor(textView3.getContext().getColor(R.color.textSummary));
        textView3.setPadding(0, AbstractC0295Gu.m616i(8), 0, 0);
        linearLayout2.addView(textView3);
        this.f2992d = linearLayout2;
        FrameLayout frameLayout4 = this.f2989a;
        if (frameLayout4 != null) {
            frameLayout4.addView(linearLayout2);
        }
        ArrayList arrayList = new ArrayList();
        AbstractC0295Gu.m625r(-488316306716725L);
        C0913VA c0913va = new C0913VA();
        c0913va.f2842a = arrayList;
        this.f2993e = c0913va;
        RecyclerView recyclerView3 = this.f2990b;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(c0913va);
        }
        C1498hd c1498hd = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C2170l(this, null, 6), 3);
    }

    @Override // p000.InterfaceC0972Wk
    public final View getContentView() {
        return this.f2989a;
    }

    @Override // p000.InterfaceC0972Wk
    public final String getTitle() {
        return AbstractC0295Gu.m625r(-488874652465205L);
    }
}
