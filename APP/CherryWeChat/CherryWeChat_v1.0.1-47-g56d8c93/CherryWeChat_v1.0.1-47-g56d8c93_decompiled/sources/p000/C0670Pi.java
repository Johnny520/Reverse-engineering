package p000;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.cherrywechat.R;
import io.github.cherrywechat.network.model.ApiResponse;
import io.github.cherrywechat.network.model.FriendLinkData;
import io.github.cherrywechat.network.model.FriendLinkItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Pi */
/* JADX INFO: loaded from: classes.dex */
public final class C0670Pi extends LinearLayout implements InterfaceC0972Wk {

    /* JADX INFO: renamed from: a */
    public LinearLayout f2137a;

    static {
        AbstractC0295Gu.m625r(-77519864723509L);
    }

    /* JADX INFO: renamed from: a */
    public static final List m1335a(C0670Pi c0670Pi, String str) {
        Object objM4550a;
        List<FriendLinkItem> items;
        C0452Kf c0452Kf = C0452Kf.f1484a;
        try {
            try {
                C0029Am c0029Am = AbstractC2809zm.f9524a;
                c0029Am.getClass();
                objM4550a = c0029Am.m4550a(ApiResponse.Companion.serializer(FriendLinkData.Companion.serializer()), str);
            } catch (Exception e) {
                AbstractC0295Gu.m625r(-78748225370165L);
                AbstractC0425Jv.m881a(ApiResponse.class).m445b();
                AbstractC0295Gu.m625r(-78864189487157L);
                e.getMessage();
                objM4550a = null;
            }
            ApiResponse apiResponse = (ApiResponse) objM4550a;
            if (apiResponse == null) {
                return c0452Kf;
            }
            if (apiResponse.getCode() != 0) {
                AbstractC0295Gu.m625r(-78881369356341L);
                AbstractC0295Gu.m625r(-77262166685749L);
                apiResponse.getMessage();
                return c0452Kf;
            }
            FriendLinkData friendLinkData = (FriendLinkData) apiResponse.getData();
            if (friendLinkData == null || (items = friendLinkData.getItems()) == null) {
                return c0452Kf;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : items) {
                if (!AbstractC2564tz.m5059T(((FriendLinkItem) obj).getUrl())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-77305116358709L);
            AbstractC0295Gu.m625r(-77335181129781L);
            return c0452Kf;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m1336e(C0670Pi c0670Pi, List list) {
        LinearLayout linearLayout = c0670Pi.f2137a;
        if (linearLayout == null) {
            AbstractC0295Gu.m625r(-77373835835445L);
            linearLayout = null;
        }
        int childCount = linearLayout.getChildCount();
        if (childCount > 2) {
            LinearLayout linearLayout2 = c0670Pi.f2137a;
            if (linearLayout2 == null) {
                AbstractC0295Gu.m625r(-77433965377589L);
                linearLayout2 = null;
            }
            linearLayout2.removeViews(2, childCount - 2);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FriendLinkItem friendLinkItem = (FriendLinkItem) it.next();
            ViewGroup viewGroup = c0670Pi.f2137a;
            ViewGroup viewGroup2 = viewGroup;
            if (viewGroup == null) {
                AbstractC0295Gu.m625r(-77494094919733L);
                viewGroup2 = null;
            }
            LinearLayout linearLayout3 = new LinearLayout(c0670Pi.getContext());
            linearLayout3.setOrientation(0);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(linearLayout3.getContext().getColor(R.color.colorForeground));
            gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(16));
            linearLayout3.setBackground(gradientDrawable);
            linearLayout3.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = AbstractC0295Gu.m616i(16);
            linearLayout3.setLayoutParams(layoutParams);
            LinearLayout linearLayout4 = new LinearLayout(linearLayout3.getContext());
            linearLayout4.setGravity(17);
            linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(48), AbstractC0295Gu.m616i(48)));
            int color = friendLinkItem.getColor();
            int iM1639f = (color & 16777215) | (AbstractC0828TB.m1639f((int) ((Color.alpha(color) == 0 ? 255 : Color.alpha(color)) * 0.15f), 255) << 24);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(iM1639f);
            gradientDrawable2.setCornerRadius(AbstractC0295Gu.m616i(12));
            linearLayout4.setBackground(gradientDrawable2);
            TextView textView = new TextView(linearLayout4.getContext());
            textView.setText(friendLinkItem.getIcon());
            textView.setTextSize(24.0f);
            textView.setGravity(17);
            linearLayout4.addView(textView);
            linearLayout3.addView(linearLayout4);
            LinearLayout linearLayout5 = new LinearLayout(linearLayout3.getContext());
            linearLayout5.setOrientation(1);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams2.setMarginStart(AbstractC0295Gu.m616i(16));
            linearLayout5.setLayoutParams(layoutParams2);
            TextView textView2 = new TextView(linearLayout5.getContext());
            textView2.setText(friendLinkItem.getName());
            textView2.setTextSize(16.0f);
            textView2.setTextColor(textView2.getContext().getColor(R.color.textTitle));
            textView2.setTypeface(Typeface.DEFAULT_BOLD);
            linearLayout5.addView(textView2);
            TextView textView3 = new TextView(linearLayout5.getContext());
            textView3.setText(friendLinkItem.getDescription());
            textView3.setTextSize(14.0f);
            textView3.setTextColor(textView3.getContext().getColor(R.color.textSummary));
            textView3.setPadding(0, AbstractC0295Gu.m616i(4), 0, 0);
            linearLayout5.addView(textView3);
            linearLayout3.addView(linearLayout5);
            TextView textView4 = new TextView(linearLayout3.getContext());
            textView4.setText(AbstractC0295Gu.m625r(-77232101914677L));
            textView4.setTextSize(14.0f);
            int color2 = Color.alpha(friendLinkItem.getColor()) == 0 ? friendLinkItem.getColor() | (-16777216) : friendLinkItem.getColor();
            textView4.setTextColor(((double) 1) - (((((double) Color.blue(color2)) * 0.114d) + ((((double) Color.green(color2)) * 0.587d) + (((double) Color.red(color2)) * 0.299d))) / ((double) 255)) >= 0.5d ? -1 : -16777216);
            textView4.setGravity(17);
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(520093696);
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setColor(color2);
            gradientDrawable3.setCornerRadius(AbstractC0295Gu.m616i(16));
            textView4.setBackground(new RippleDrawable(colorStateListValueOf, gradientDrawable3, null));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 16;
            layoutParams3.setMarginStart(AbstractC0295Gu.m616i(16));
            textView4.setLayoutParams(layoutParams3);
            textView4.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
            textView4.setClickable(true);
            textView4.setFocusable(true);
            textView4.setOnClickListener(new ViewOnClickListenerC2176l5(9, textView4, friendLinkItem));
            linearLayout3.addView(textView4);
            linearLayout3.setBackground(new RippleDrawable(ColorStateList.valueOf(520093696), linearLayout3.getBackground(), null));
            linearLayout3.setClickable(true);
            linearLayout3.setFocusable(true);
            linearLayout3.setOnClickListener(new ViewOnClickListenerC2176l5(10, linearLayout3, friendLinkItem));
            viewGroup2.addView(linearLayout3);
        }
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        AbstractC0295Gu.m625r(-77833397336117L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity activity, int i, int i2, Intent intent) {
        AbstractC0295Gu.m625r(-77872052041781L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity activity) {
        AbstractC0295Gu.m625r(-77794742630453L);
    }

    @Override // p000.InterfaceC0972Wk
    public View getContentView() {
        return this;
    }

    @Override // p000.InterfaceC0972Wk
    public String getTitle() {
        return AbstractC0295Gu.m625r(-77910706747445L);
    }

    public int getViewId() {
        return 7;
    }
}
