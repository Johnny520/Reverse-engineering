package p000;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import io.github.cherrywechat.R;
import io.github.cherrywechat.network.model.Change;
import io.github.cherrywechat.network.model.UpdateItem;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: kD */
/* JADX INFO: loaded from: classes.dex */
public final class C2136kD implements InterfaceC0972Wk {

    /* JADX INFO: renamed from: a */
    public LinearLayout f7479a;

    /* JADX INFO: renamed from: b */
    public ScrollView f7480b;

    /* JADX INFO: renamed from: c */
    public Activity f7481c;

    /* JADX INFO: renamed from: a */
    public static final void m4317a(C2136kD c2136kD, List list) {
        LinearLayout linearLayout = c2136kD.f7479a;
        if (linearLayout == null) {
            AbstractC0295Gu.m625r(-821292236273717L);
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        if (list.isEmpty()) {
            c2136kD.m4318e(AbstractC0295Gu.m625r(-821326596012085L));
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UpdateItem updateItem = (UpdateItem) it.next();
            Activity activity = c2136kD.f7481c;
            if (activity == null) {
                AbstractC0295Gu.m625r(-820806904969269L);
                activity = null;
            }
            LinearLayout linearLayout2 = new LinearLayout(activity);
            linearLayout2.setOrientation(1);
            GradientDrawable gradientDrawable = new GradientDrawable();
            Activity activity2 = c2136kD.f7481c;
            if (activity2 == null) {
                AbstractC0295Gu.m625r(-820845559674933L);
                activity2 = null;
            }
            gradientDrawable.setColor(activity2.getColor(R.color.colorForeground));
            gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(12));
            linearLayout2.setBackground(gradientDrawable);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, 0, 0, AbstractC0295Gu.m616i(16));
            linearLayout2.setLayoutParams(layoutParams);
            linearLayout2.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
            Activity activity3 = c2136kD.f7481c;
            if (activity3 == null) {
                AbstractC0295Gu.m625r(-820884214380597L);
                activity3 = null;
            }
            LinearLayout linearLayout3 = new LinearLayout(activity3);
            linearLayout3.setOrientation(0);
            linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            Activity activity4 = c2136kD.f7481c;
            if (activity4 == null) {
                AbstractC0295Gu.m625r(-820922869086261L);
                activity4 = null;
            }
            TextView textView = new TextView(activity4);
            textView.setText("v" + updateItem.getVersion());
            textView.setTextSize(18.0f);
            Activity activity5 = c2136kD.f7481c;
            if (activity5 == null) {
                AbstractC0295Gu.m625r(-820961523791925L);
                activity5 = null;
            }
            textView.setTextColor(activity5.getColor(R.color.textTitle));
            textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout3.addView(textView);
            Activity activity6 = c2136kD.f7481c;
            if (activity6 == null) {
                AbstractC0295Gu.m625r(-821000178497589L);
                activity6 = null;
            }
            TextView textView2 = new TextView(activity6);
            textView2.setText(updateItem.getType().getLabel());
            textView2.setTextSize(12.0f);
            Activity activity7 = c2136kD.f7481c;
            if (activity7 == null) {
                AbstractC0295Gu.m625r(-821038833203253L);
                activity7 = null;
            }
            textView2.setTextColor(activity7.getColor(R.color.white));
            textView2.setPadding(AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(4));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(Color.parseColor(AbstractC0085Bz.m133K(updateItem.getType().getColor(), AbstractC0295Gu.m625r(-819428220467253L), AbstractC0295Gu.m625r(-819441105369141L))));
            gradientDrawable2.setCornerRadius(AbstractC0295Gu.m616i(4));
            textView2.setBackground(gradientDrawable2);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.setMarginStart(AbstractC0295Gu.m616i(8));
            layoutParams2.gravity = 16;
            textView2.setLayoutParams(layoutParams2);
            linearLayout3.addView(textView2);
            Activity activity8 = c2136kD.f7481c;
            if (activity8 == null) {
                AbstractC0295Gu.m625r(-819449695303733L);
                activity8 = null;
            }
            View view = new View(activity8);
            view.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            linearLayout3.addView(view);
            Activity activity9 = c2136kD.f7481c;
            if (activity9 == null) {
                AbstractC0295Gu.m625r(-819488350009397L);
                activity9 = null;
            }
            TextView textView3 = new TextView(activity9);
            textView3.setText(updateItem.getDate());
            textView3.setTextSize(12.0f);
            Activity activity10 = c2136kD.f7481c;
            if (activity10 == null) {
                AbstractC0295Gu.m625r(-819527004715061L);
                activity10 = null;
            }
            textView3.setTextColor(activity10.getColor(R.color.textSecondary));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 16;
            textView3.setLayoutParams(layoutParams3);
            linearLayout3.addView(textView3);
            linearLayout2.addView(linearLayout3);
            for (Change change : updateItem.getChanges()) {
                Activity activity11 = c2136kD.f7481c;
                if (activity11 == null) {
                    AbstractC0295Gu.m625r(-819565659420725L);
                    activity11 = null;
                }
                LinearLayout linearLayout4 = new LinearLayout(activity11);
                linearLayout4.setOrientation(0);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams4.setMargins(0, AbstractC0295Gu.m616i(8), 0, 0);
                linearLayout4.setLayoutParams(layoutParams4);
                Activity activity12 = c2136kD.f7481c;
                if (activity12 == null) {
                    AbstractC0295Gu.m625r(-819604314126389L);
                    activity12 = null;
                }
                TextView textView4 = new TextView(activity12);
                textView4.setText(change.getType().getIcon());
                textView4.setTextSize(16.0f);
                Activity activity13 = c2136kD.f7481c;
                if (activity13 == null) {
                    AbstractC0295Gu.m625r(-819642968832053L);
                    activity13 = null;
                }
                textView4.setTextColor(activity13.getColor(R.color.textTitle));
                textView4.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                linearLayout4.addView(textView4);
                Activity activity14 = c2136kD.f7481c;
                if (activity14 == null) {
                    AbstractC0295Gu.m625r(-819681623537717L);
                    activity14 = null;
                }
                TextView textView5 = new TextView(activity14);
                textView5.setText(change.getDescription());
                textView5.setTextSize(14.0f);
                Activity activity15 = c2136kD.f7481c;
                if (activity15 == null) {
                    AbstractC0295Gu.m625r(-819170522429493L);
                    activity15 = null;
                }
                textView5.setTextColor(activity15.getColor(R.color.textTitle));
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams5.setMarginStart(AbstractC0295Gu.m616i(8));
                textView5.setLayoutParams(layoutParams5);
                linearLayout4.addView(textView5);
                linearLayout2.addView(linearLayout4);
            }
            ViewGroup viewGroup = c2136kD.f7479a;
            if (viewGroup == null) {
                AbstractC0295Gu.m625r(-819209177135157L);
                viewGroup = null;
            }
            viewGroup.addView(linearLayout2);
        }
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        AbstractC0295Gu.m625r(-819389565761589L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity activity, int i, int i2, Intent intent) {
        AbstractC0295Gu.m625r(-819977976281141L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity activity) {
        AbstractC0295Gu.m625r(-821171977189429L);
        this.f7481c = activity;
        ScrollView scrollView = new ScrollView(activity);
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        scrollView.setBackgroundColor(activity.getColor(R.color.colorBackground));
        this.f7480b = scrollView;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        linearLayout.setLayoutParams(layoutParams);
        this.f7479a = linearLayout;
        ScrollView scrollView2 = this.f7480b;
        InterfaceC0190Eb interfaceC0190Eb = null;
        if (scrollView2 == null) {
            AbstractC0295Gu.m625r(-821210631895093L);
            scrollView2 = null;
        }
        LinearLayout linearLayout2 = this.f7479a;
        if (linearLayout2 == null) {
            AbstractC0295Gu.m625r(-821257876535349L);
            linearLayout2 = null;
        }
        scrollView2.addView(linearLayout2);
        C1498hd c1498hd = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C2170l(this, interfaceC0190Eb, 7), 3);
    }

    /* JADX INFO: renamed from: e */
    public final void m4318e(String str) {
        LinearLayout linearLayout = this.f7479a;
        ViewGroup viewGroup = null;
        if (linearLayout == null) {
            AbstractC0295Gu.m625r(-819243536873525L);
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        Activity activity = this.f7481c;
        if (activity == null) {
            AbstractC0295Gu.m625r(-819277896611893L);
            activity = null;
        }
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextSize(14.0f);
        Activity activity2 = this.f7481c;
        if (activity2 == null) {
            AbstractC0295Gu.m625r(-819316551317557L);
            activity2 = null;
        }
        textView.setTextColor(activity2.getColor(R.color.textSecondary));
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, AbstractC0295Gu.m616i(32), 0, 0);
        textView.setLayoutParams(layoutParams);
        LinearLayout linearLayout2 = this.f7479a;
        if (linearLayout2 == null) {
            AbstractC0295Gu.m625r(-819355206023221L);
        } else {
            viewGroup = linearLayout2;
        }
        viewGroup.addView(textView);
    }

    @Override // p000.InterfaceC0972Wk
    public final View getContentView() {
        ScrollView scrollView = this.f7480b;
        if (scrollView != null) {
            return scrollView;
        }
        AbstractC0295Gu.m625r(-820016630986805L);
        return null;
    }

    @Override // p000.InterfaceC0972Wk
    public final String getTitle() {
        return AbstractC0295Gu.m625r(-820063875627061L);
    }
}
