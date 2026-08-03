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
    public static final List m1825a(C0956WA r2, String r3) {
        C0029Am r22 = AbstractC2809zm.f9524a;     // Catch: Exception -> L4
        r22.getClass();     // Catch: Exception -> L4
        Object r23 = r22.m4550a(ApiResponse.Companion.serializer(ThemeStoreData.Companion.serializer()), r3);     // Catch: Exception -> L4
    L6:
        ApiResponse r24 = (ApiResponse) r23;
        C0452Kf r32 = C0452Kf.f1484a;
        if (r24 != null) goto L10;
        return r32;
    L10:
        if (r24.getCode() != 0) goto L23;
        ThemeStoreData r25 = (ThemeStoreData) r24.getData();
        if (r25 == null) goto L21;
        List<ThemeStoreItem> r26 = r25.getItems();
        if (r26 != null) goto L18;
        return r32;
    L18:
        return r26;
    L21:
        return r32;
    L23:
        return r32;
    L4:
        e = move-exception;
        AbstractC0295Gu.m625r(-489213954881589L);
        AbstractC0425Jv.m881a(ApiResponse.class).m445b();
        AbstractC0295Gu.m625r(-488780163184693L);
        e.getMessage();
        r23 = null;
        goto L6
    }

    /* JADX INFO: renamed from: e */
    public static final void m1826e(C0956WA r3, List r4) {
        LinearLayout r0 = r3.f2991c;
        if (r0 == null) goto L6;
        r0.setVisibility(8);
    L6:
        if (r4.isEmpty() == false) goto L14;
        RecyclerView r42 = r3.f2990b;
        if (r42 == null) goto L10;
        r42.setVisibility(8);
    L10:
        LinearLayout r32 = r3.f2992d;
        if (r32 == null) goto L24;
        r32.setVisibility(0);
        return;
    L24:
        return;
    L14:
        LinearLayout r02 = r3.f2992d;
        if (r02 == null) goto L17;
        r02.setVisibility(8);
    L17:
        RecyclerView r03 = r3.f2990b;
        if (r03 == null) goto L20;
        r03.setVisibility(0);
    L20:
        C0913VA r33 = r3.f2993e;
        if (r33 == null) goto L25;
        AbstractC0295Gu.m625r(-489020681353269L);
        r33.f2842a = new ArrayList(r4);
        r33.notifyDataSetChanged();
        return;
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
    public final void mo1338c(Activity r1, int r2, int r3, Intent r4) {
        AbstractC0295Gu.m625r(-488835997759541L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity r14) {
        AbstractC0295Gu.m625r(-489059336058933L);
        FrameLayout r3 = new FrameLayout(r14);
        r3.setBackgroundColor(r3.getContext().getColor(R.color.colorBackground));
        r3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f2989a = r3;
        RecyclerView r32 = new RecyclerView(r14);
        r32.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        r32.setLayoutManager(new GridLayoutManager());
        r32.setOverScrollMode(2);
        r32.setPadding(AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8));
        r32.setVisibility(8);
        this.f2990b = r32;
        FrameLayout r8 = this.f2989a;
        if (r8 == null) goto L5;
        r8.addView(r32);
    L5:
        RecyclerView r33 = this.f2990b;
        if (r33 == null) goto L8;
        r33.addItemDecoration(new C1320da(2));
    L8:
        LinearLayout r34 = new LinearLayout(r14);
        r34.setOrientation(1);
        r34.setGravity(17);
        r34.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ProgressBar r9 = new ProgressBar(r14);
        r9.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(48), AbstractC0295Gu.m616i(48)));
        r34.addView(r9);
        TextView r2 = new TextView(r14);
        r2.setText(AbstractC0295Gu.m625r(-489097990764597L));
        r2.setGravity(17);
        r2.setTextSize(14.0f);
        r2.setTextColor(r2.getContext().getColor(R.color.textSummary));
        r2.setPadding(0, AbstractC0295Gu.m616i(16), 0, 0);
        r34.addView(r2);
        this.f2991c = r34;
        FrameLayout r22 = this.f2989a;
        if (r22 == null) goto L11;
        r22.addView(r34);
    L11:
        LinearLayout r23 = new LinearLayout(r14);
        r23.setOrientation(1);
        r23.setGravity(17);
        r23.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        r23.setVisibility(8);
        ImageView r35 = new ImageView(r14);
        r35.setImageResource(R.drawable.ic_cloud);
        r35.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(64), AbstractC0295Gu.m616i(64)));
        r35.setColorFilter(r35.getContext().getColor(R.color.textSummary));
        r23.addView(r35);
        TextView r0 = new TextView(r14);
        r0.setText(AbstractC0295Gu.m625r(-489149530372149L));
        r0.setGravity(17);
        r0.setTextSize(16.0f);
        r0.setTypeface(Typeface.DEFAULT_BOLD);
        r0.setTextColor(r0.getContext().getColor(R.color.textTitle));
        r0.setPadding(0, AbstractC0295Gu.m616i(16), 0, 0);
        r23.addView(r0);
        TextView r02 = new TextView(r14);
        r02.setText(AbstractC0295Gu.m625r(-489179595143221L));
        r02.setTextSize(14.0f);
        r02.setGravity(17);
        r02.setTextColor(r02.getContext().getColor(R.color.textSummary));
        r02.setPadding(0, AbstractC0295Gu.m616i(8), 0, 0);
        r23.addView(r02);
        this.f2992d = r23;
        FrameLayout r142 = this.f2989a;
        if (r142 == null) goto L14;
        r142.addView(r23);
    L14:
        ArrayList r03 = new ArrayList();
        AbstractC0295Gu.m625r(-488316306716725L);
        C0913VA r143 = new C0913VA();
        r143.f2842a = r03;
        this.f2993e = r143;
        RecyclerView r04 = this.f2990b;
        if (r04 == null) goto L17;
        r04.setAdapter(r143);
    L17:
        C1498hd r144 = AbstractC1499he.f5282a;
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
