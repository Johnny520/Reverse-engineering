package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import com.bumptech.glide.ComponentCallbacks2C1273a;
import com.youth.banner.config.BannerConfig;
import io.github.cherrywechat.R;
import io.github.cherrywechat.network.model.AboutData;
import io.github.cherrywechat.network.model.ApiResponse;
import io.github.cherrywechat.network.model.AppInfo;
import io.github.cherrywechat.network.model.Feature;
import io.github.cherrywechat.network.model.Link;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: m */
/* JADX INFO: loaded from: classes.dex */
public final class C2213m extends LinearLayout implements InterfaceC0972Wk {

    /* JADX INFO: renamed from: a */
    public final int f7701a;

    /* JADX INFO: renamed from: b */
    public final int f7702b;

    /* JADX INFO: renamed from: c */
    public final LinearLayout f7703c;

    /* JADX INFO: renamed from: d */
    public List f7704d;

    /* JADX INFO: renamed from: e */
    public List f7705e;

    static {
        AbstractC0295Gu.m625r(-814248489908277L);
        AbstractC0295Gu.m625r(-814278554679349L);
        AbstractC0295Gu.m625r(-814308619450421L);
        AbstractC0295Gu.m625r(-814334389254197L);
        AbstractC0295Gu.m625r(-814347274156085L);
        AbstractC0295Gu.m625r(-814368748992565L);
        AbstractC0295Gu.m625r(-814390223829045L);
        AbstractC0295Gu.m625r(-814415993632821L);
        AbstractC0295Gu.m625r(-814437468469301L);
        AbstractC0295Gu.m625r(-814458943305781L);
        AbstractC0295Gu.m625r(-812831150700597L);
        AbstractC0295Gu.m625r(-812852625537077L);
        AbstractC0295Gu.m625r(-812869805406261L);
        AbstractC0295Gu.m625r(-812912755079221L);
        AbstractC0295Gu.m625r(-812942819850293L);
        AbstractC0295Gu.m625r(-812968589654069L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2213m(Context context) {
        super(context);
        AbstractC0295Gu.m625r(-817718823483445L);
        this.f7701a = AbstractC0295Gu.m616i(Integer.valueOf(BannerConfig.SCROLL_TIME));
        this.f7702b = AbstractC0295Gu.m616i(16);
        setOrientation(1);
        setBackgroundColor(context.getColor(R.color.colorBackground));
        ScrollView scrollView = new ScrollView(context);
        scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        int i = 0;
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setOverScrollMode(2);
        addView(scrollView);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setPadding(0, 0, 0, AbstractC0295Gu.m616i(32));
        this.f7703c = linearLayout;
        scrollView.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(17);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View space = new Space(linearLayout2.getContext());
        space.setLayoutParams(new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(20)));
        linearLayout2.addView(space);
        LinearLayout linearLayout3 = new LinearLayout(linearLayout2.getContext());
        linearLayout3.setOrientation(1);
        linearLayout3.setGravity(17);
        linearLayout3.setPadding(0, AbstractC0295Gu.m616i(48), 0, AbstractC0295Gu.m616i(48));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(linearLayout3.getContext().getColor(R.color.colorForeground));
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(12));
        linearLayout3.setBackground(gradientDrawable);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        FrameLayout frameLayout = new FrameLayout(linearLayout3.getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(100), AbstractC0295Gu.m616i(100)));
        View imageView = new ImageView(frameLayout.getContext());
        imageView.setId(View.generateViewId());
        imageView.setTag(AbstractC0295Gu.m625r(-817753183221813L));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView.setOutlineProvider(new C2122k(0));
        imageView.setClipToOutline(true);
        frameLayout.addView(imageView);
        linearLayout3.addView(frameLayout);
        TextView textView = new TextView(linearLayout3.getContext());
        textView.setId(View.generateViewId());
        textView.setTag(AbstractC0295Gu.m625r(-816142570485813L));
        textView.setTextSize(26.0f);
        textView.setTextColor(textView.getContext().getColor(R.color.textTitle));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setPadding(0, AbstractC0295Gu.m616i(24), 0, AbstractC0295Gu.m616i(8));
        textView.setGravity(17);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout3.addView(textView);
        TextView textView2 = new TextView(linearLayout3.getContext());
        textView2.setId(View.generateViewId());
        textView2.setTag(AbstractC0295Gu.m625r(-816181225191477L));
        textView2.setTextSize(16.0f);
        textView2.setTextColor(textView2.getContext().getColor(R.color.textSummary));
        textView2.setLetterSpacing(0.02f);
        textView2.setGravity(17);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout3.addView(textView2);
        linearLayout2.addView(linearLayout3);
        m4452i(linearLayout2);
        m4451h(AbstractC0295Gu.m625r(-816237059766325L), AbstractC2496sa.m4977b0(new C2078j(AbstractC0295Gu.m625r(-816258534602805L), AbstractC0295Gu.m625r(-816280009439285L), new C1345e(this, i)), new C2078j(AbstractC0295Gu.m625r(-815846217742389L), AbstractC1450gG.f5068b, new C1345e(this, 1)), new C2078j(AbstractC0295Gu.m625r(-815867692578869L), AbstractC0295Gu.m625r(-815889167415349L), new C1345e(this, 2))));
        C1498hd c1498hd = AbstractC1499he.f5282a;
        C2283nk c2283nk = AbstractC1106Zp.f3500a;
        C1419fm c1419fm = new C1419fm();
        c2283nk.getClass();
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1406fG.m2700Z(c2283nk, c1419fm)), new C2170l(this, null, i), 3);
        C0452Kf c0452Kf = C0452Kf.f1484a;
        this.f7704d = c0452Kf;
        this.f7705e = c0452Kf;
    }

    /* JADX INFO: renamed from: a */
    public static final AboutData m4445a(C2213m c2213m, String str) {
        Object objM4550a;
        try {
            try {
                C0029Am c0029Am = AbstractC2809zm.f9524a;
                c0029Am.getClass();
                objM4550a = c0029Am.m4550a(ApiResponse.Companion.serializer(AboutData.Companion.serializer()), str);
            } catch (Exception e) {
                AbstractC0295Gu.m625r(-813724503898165L);
                AbstractC0425Jv.m881a(ApiResponse.class).m445b();
                AbstractC0295Gu.m625r(-813840468015157L);
                e.getMessage();
                objM4550a = null;
            }
            ApiResponse apiResponse = (ApiResponse) objM4550a;
            if (apiResponse != null && apiResponse.getCode() == 0) {
                return (AboutData) apiResponse.getData();
            }
            return null;
        } catch (Exception e2) {
            AbstractC0295Gu.m625r(-813857647884341L);
            e2.getMessage();
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m4446e(C2213m c2213m, AppInfo appInfo) {
        TextView textView = (TextView) c2213m.findViewWithTag(AbstractC0295Gu.m625r(-814141115725877L));
        if (textView != null) {
            textView.setText(appInfo.getAppName());
        }
        TextView textView2 = (TextView) c2213m.findViewWithTag(AbstractC0295Gu.m625r(-814179770431541L));
        if (textView2 != null) {
            textView2.setText(appInfo.getAppSubtitle());
        }
        ImageView imageView = (ImageView) c2213m.findViewWithTag(AbstractC0295Gu.m625r(-813685849192501L));
        if (imageView == null || appInfo.getLogoUrl().length() <= 0) {
            return;
        }
        ((C1193aw) ((C1193aw) ComponentCallbacks2C1273a.m2414c(c2213m.getContext()).m2833n(appInfo.getLogoUrl()).m5324s(new C2446r9(), true)).m5312f(android.R.drawable.ic_menu_compass)).m2298A(imageView);
    }

    /* JADX INFO: renamed from: f */
    public static final void m4447f(C2213m c2213m, List list) {
        C0253Fv c0253Fv = new C0253Fv();
        LinearLayout linearLayout = new LinearLayout(c2213m.getContext());
        linearLayout.setOrientation(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(linearLayout.getContext().getColor(R.color.colorForeground));
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(12));
        linearLayout.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = AbstractC0295Gu.m616i(16);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        linearLayout.setClipToOutline(true);
        TextView textView = new TextView(c2213m.getContext());
        textView.setText(AbstractC0295Gu.m625r(-814119640889397L));
        textView.setTextSize(15.0f);
        textView.setTextColor(textView.getContext().getColor(R.color.textSummary));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setPadding(0, AbstractC0295Gu.m616i(24), 0, AbstractC0295Gu.m616i(12));
        c2213m.m4452i(textView);
        m4450l(linearLayout, c0253Fv, list, c2213m);
        c2213m.m4452i(linearLayout);
    }

    /* JADX INFO: renamed from: g */
    public static final void m4448g(C2213m c2213m, List list) {
        String strM625r = AbstractC0295Gu.m625r(-813913482459189L);
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(AbstractC2539ta.m5019d0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Link link = (Link) it.next();
            arrayList2.add(new C2078j(link.getTitle(), link.getDescription(), new C1389f(0, c2213m, link)));
        }
        Object[] array = arrayList2.toArray(new C2078j[0]);
        if (array != null && array.length > 0) {
            arrayList.ensureCapacity(arrayList.size() + array.length);
            Collections.addAll(arrayList, array);
        }
        arrayList.add(new C2078j(AbstractC0295Gu.m625r(-814489008076853L), AbstractC0295Gu.m625r(-814506187946037L), new C1345e(c2213m, 3)));
        c2213m.m4451h(strM625r, AbstractC2496sa.m4977b0(arrayList.toArray(new C2078j[arrayList.size()])));
    }

    /* JADX INFO: renamed from: k */
    public static void m4449k(AlertDialog alertDialog) {
        TextView textView = (TextView) alertDialog.findViewById(android.R.id.title);
        if (textView != null) {
            textView.setTextSize(18.0f);
            textView.setTextColor(textView.getContext().getColor(R.color.textTitle));
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setPadding(0, AbstractC0295Gu.m616i(24), 0, AbstractC0295Gu.m616i(16));
        }
        TextView textView2 = (TextView) alertDialog.findViewById(android.R.id.message);
        if (textView2 != null) {
            textView2.setTextSize(15.0f);
            textView2.setTextColor(textView2.getContext().getColor(R.color.textSummary));
            textView2.setLineSpacing(8.0f, 1.0f);
            textView2.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24));
        }
        Button button = alertDialog.getButton(-1);
        if (button != null) {
            button.setTextColor(button.getContext().getColor(R.color.colorPrimary));
            button.setTextSize(16.0f);
            button.setAllCaps(false);
            button.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(8));
        }
        Window window = alertDialog.getWindow();
        if (window != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(window.getContext().getColor(R.color.colorForeground));
            gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(16));
            window.setBackgroundDrawable(gradientDrawable);
            window.setWindowAnimations(android.R.style.Animation.Dialog);
            window.setDimAmount(0.5f);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m4450l(LinearLayout linearLayout, C0253Fv c0253Fv, List list, C2213m c2213m) {
        List list2;
        List listM4905o0;
        int i;
        int i2 = 16;
        linearLayout.removeAllViews();
        int i3 = 4;
        if (c0253Fv.f825a) {
            list2 = list;
            listM4905o0 = list2;
        } else {
            list2 = list;
            listM4905o0 = AbstractC2453ra.m4905o0(4, list2);
        }
        int i4 = 0;
        for (Object obj : listM4905o0) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                AbstractC2496sa.m4978c0();
                throw null;
            }
            Feature feature = (Feature) obj;
            if (i4 > 0) {
                i = i3;
                View view = new View(c2213m.getContext());
                view.setBackgroundColor(view.getContext().getColor(R.color.dividerColor));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(1));
                layoutParams.setMarginStart(AbstractC0295Gu.m616i(16));
                view.setLayoutParams(layoutParams);
                linearLayout.addView(view);
            } else {
                i = i3;
            }
            LinearLayout linearLayout2 = new LinearLayout(c2213m.getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(i2);
            linearLayout2.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(16));
            LinearLayout linearLayout3 = new LinearLayout(linearLayout2.getContext());
            linearLayout3.setOrientation(1);
            linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            TextView textView = new TextView(linearLayout3.getContext());
            textView.setText(feature.getTitle());
            textView.setTextSize(16.0f);
            textView.setTextColor(textView.getContext().getColor(R.color.textTitle));
            linearLayout3.addView(textView);
            TextView textView2 = new TextView(linearLayout3.getContext());
            textView2.setText(feature.getDescription());
            textView2.setTextSize(14.0f);
            textView2.setTextColor(textView2.getContext().getColor(R.color.textSummary));
            textView2.setPadding(0, AbstractC0295Gu.m616i(Integer.valueOf(i)), 0, 0);
            linearLayout3.addView(textView2);
            linearLayout2.addView(linearLayout3);
            linearLayout.addView(linearLayout2);
            i4 = i5;
            i3 = i;
            i2 = 16;
        }
        if (list2.size() > i3) {
            View view2 = new View(c2213m.getContext());
            view2.setBackgroundColor(view2.getContext().getColor(R.color.dividerColor));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(1));
            layoutParams2.setMarginStart(AbstractC0295Gu.m616i(16));
            view2.setLayoutParams(layoutParams2);
            linearLayout.addView(view2);
            TextView textView3 = new TextView(c2213m.getContext());
            textView3.setText(AbstractC0295Gu.m625r(c0253Fv.f825a ? -814205540235317L : -814218425137205L));
            textView3.setTextSize(15.0f);
            textView3.setTextColor(textView3.getContext().getColor(R.color.colorPrimary));
            textView3.setGravity(17);
            textView3.setPadding(0, AbstractC0295Gu.m616i(12), 0, AbstractC0295Gu.m616i(12));
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, new ColorDrawable(textView3.getContext().getColor(R.color.pressedStateColor)));
            stateListDrawable.addState(new int[0], new ColorDrawable(textView3.getContext().getColor(R.color.colorForeground)));
            textView3.setBackground(stateListDrawable);
            textView3.setClickable(true);
            textView3.setOnClickListener(new ViewOnClickListenerC1433g(c0253Fv, linearLayout, list2, c2213m, 0));
            linearLayout.addView(textView3);
        }
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        AbstractC0295Gu.m625r(-814587792324661L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity activity, int i, int i2, Intent intent) {
        AbstractC0295Gu.m625r(-814626447030325L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity activity) {
        AbstractC0295Gu.m625r(-814549137618997L);
    }

    @Override // p000.InterfaceC0972Wk
    public View getContentView() {
        return this;
    }

    @Override // p000.InterfaceC0972Wk
    public String getTitle() {
        return AbstractC0295Gu.m625r(-814665101735989L);
    }

    public int getViewId() {
        return 2;
    }

    /* JADX INFO: renamed from: h */
    public final void m4451h(String str, List list) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        float f = 15.0f;
        textView.setTextSize(15.0f);
        textView.setTextColor(textView.getContext().getColor(R.color.textSummary));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setPadding(0, AbstractC0295Gu.m616i(24), 0, AbstractC0295Gu.m616i(12));
        m4452i(textView);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(linearLayout.getContext().getColor(R.color.colorForeground));
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(12));
        linearLayout.setBackground(gradientDrawable);
        int i = -1;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i2 = 16;
        layoutParams.bottomMargin = AbstractC0295Gu.m616i(16);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        linearLayout.setClipToOutline(true);
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC2496sa.m4978c0();
                throw null;
            }
            C2078j c2078j = (C2078j) obj;
            if (i3 > 0) {
                View view = new View(linearLayout.getContext());
                view.setBackgroundColor(view.getContext().getColor(R.color.dividerColor));
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, AbstractC0295Gu.m616i(1));
                layoutParams2.setMarginStart(AbstractC0295Gu.m616i(16));
                view.setLayoutParams(layoutParams2);
                linearLayout.addView(view);
            }
            LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(i2);
            linearLayout2.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(16));
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, new ColorDrawable(linearLayout2.getContext().getColor(R.color.pressedStateColor)));
            stateListDrawable.addState(new int[0], new ColorDrawable(linearLayout2.getContext().getColor(R.color.colorForeground)));
            linearLayout2.setBackground(stateListDrawable);
            linearLayout2.setClickable(true);
            linearLayout2.setFocusable(true);
            TextView textView2 = new TextView(linearLayout2.getContext());
            textView2.setText(c2078j.f7335a);
            textView2.setTextSize(16.0f);
            textView2.setTextColor(textView2.getContext().getColor(R.color.textTitle));
            linearLayout2.addView(textView2);
            TextView textView3 = new TextView(linearLayout2.getContext());
            textView3.setText(c2078j.f7336b);
            textView3.setTextSize(f);
            textView3.setTextColor(textView3.getContext().getColor(R.color.textSummary));
            textView3.setGravity(8388613);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
            layoutParams3.weight = 1.0f;
            layoutParams3.setMarginStart(AbstractC0295Gu.m616i(16));
            textView3.setLayoutParams(layoutParams3);
            linearLayout2.addView(textView3);
            if (c2078j.f7337c != null) {
                linearLayout2.setOnClickListener(new ViewOnClickListenerC1477h(0, c2078j));
            }
            linearLayout.addView(linearLayout2);
            i3 = i4;
            f = 15.0f;
            i = -1;
            i2 = 16;
        }
        m4452i(linearLayout);
    }

    /* JADX INFO: renamed from: i */
    public final void m4452i(View view) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int i = this.f7702b;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(i);
        layoutParams.width = Math.min(this.f7701a, frameLayout.getContext().getResources().getDisplayMetrics().widthPixels - (i * 2));
        layoutParams.gravity = 1;
        frameLayout.addView(view, layoutParams);
        this.f7703c.addView(frameLayout);
    }

    /* JADX INFO: renamed from: j */
    public final void m4453j(String str) {
        if (str.length() <= 0 || !(str.startsWith(AbstractC0295Gu.m625r(-813939252262965L)) || str.startsWith(AbstractC0295Gu.m625r(-813973612001333L)))) {
            AbstractC0295Gu.m625r(-814080986183733L);
            return;
        }
        Context context = getContext();
        AbstractC0295Gu.m625r(-814012266706997L);
        C1456gf.m2803U(context, str);
    }
}
