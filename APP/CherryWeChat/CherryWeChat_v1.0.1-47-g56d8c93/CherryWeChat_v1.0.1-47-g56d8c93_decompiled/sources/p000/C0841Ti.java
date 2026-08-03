package p000;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Ti */
/* JADX INFO: loaded from: classes.dex */
public final class C0841Ti implements InterfaceC0972Wk {

    /* JADX INFO: renamed from: a */
    public LinearLayout f2673a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f2674b;

    /* JADX INFO: renamed from: c */
    public Activity f2675c;

    /* JADX INFO: renamed from: d */
    public final List f2676d = AbstractC2496sa.m4977b0(new C0755Ri(R.color.colorPrimary, AbstractC0295Gu.m625r(-76072460744757L), AbstractC0295Gu.m625r(-76085345646645L)), new C0755Ri(R.color.colorPrimary, AbstractC0295Gu.m625r(-76089640613941L), AbstractC0295Gu.m625r(-76102525515829L)), new C0755Ri(R.color.colorSuccess, AbstractC0295Gu.m625r(-76124000352309L), AbstractC0295Gu.m625r(-76136885254197L)), new C0755Ri(R.color.colorInfo, AbstractC0295Gu.m625r(-76708115904565L), AbstractC0295Gu.m625r(-76721000806453L)), new C0755Ri(R.color.colorWarning, AbstractC0295Gu.m625r(-76742475642933L), AbstractC0295Gu.m625r(-76755360544821L)), new C0755Ri(R.color.colorError, AbstractC0295Gu.m625r(-76776835381301L), AbstractC0295Gu.m625r(-76789720283189L)));

    /* JADX INFO: renamed from: e */
    public Object f2677e;

    /* JADX INFO: renamed from: f */
    public Object f2678f;

    /* JADX INFO: renamed from: g */
    public String f2679g;

    /* JADX INFO: renamed from: h */
    public String f2680h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f2681i;

    public C0841Ti() {
        C0452Kf c0452Kf = C0452Kf.f1484a;
        this.f2677e = c0452Kf;
        this.f2678f = c0452Kf;
        this.f2679g = AbstractC0295Gu.m625r(-76815490086965L);
        this.f2680h = AbstractC0295Gu.m625r(-76819785054261L);
        this.f2681i = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final void m1663a() {
        ?? r0 = this.f2677e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : r0) {
            C0798Si c0798Si = (C0798Si) obj;
            boolean z = this.f2679g.length() == 0 || AbstractC0585Nj.m1134a(c0798Si.f2501b, this.f2679g);
            boolean z2 = this.f2680h.length() == 0 || AbstractC2564tz.m5051L(c0798Si.f2500a.f3491a.f3521d, this.f2680h, true);
            if (z && z2) {
                arrayList.add(obj);
            }
        }
        this.f2678f = arrayList;
        m1664e();
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        AbstractC0295Gu.m625r(-75582834473013L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity activity, int i, int i2, Intent intent) {
        AbstractC0295Gu.m625r(-73972221737013L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity activity) {
        List<C0755Ri> list;
        ViewGroup viewGroup;
        Object obj;
        String strM625r;
        Integer num = 8;
        AbstractC0295Gu.m625r(-76824080021557L);
        this.f2675c = activity;
        ArrayList arrayListM1499u = AbstractC0714Qj.m1499u();
        ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(arrayListM1499u, 10));
        Iterator it = arrayListM1499u.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            list = this.f2676d;
            if (!zHasNext) {
                break;
            }
            AbstractC1101Zk abstractC1101Zk = (AbstractC1101Zk) it.next();
            String str = abstractC1101Zk.f3491a.f3518a;
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                Object next = it2.next();
                if (AbstractC0585Nj.m1134a(((C0755Ri) next).f2393b, str)) {
                    obj = next;
                    break;
                }
            }
            C0755Ri c0755Ri = (C0755Ri) obj;
            if (c0755Ri == null || (strM625r = c0755Ri.f2392a) == null) {
                strM625r = AbstractC0295Gu.m625r(-76862734727221L);
            }
            arrayList.add(new C0798Si(abstractC1101Zk, str, strM625r));
        }
        this.f2677e = arrayList;
        this.f2678f = arrayList;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(activity.getColor(R.color.colorBackground));
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f2673a = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(6));
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(activity.getColor(R.color.cardBackground));
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(12));
        gradientDrawable.setStroke(AbstractC0295Gu.m616i(1), activity.getColor(R.color.cardStroke));
        linearLayout3.setBackground(gradientDrawable);
        linearLayout3.setPadding(AbstractC0295Gu.m616i(14), AbstractC0295Gu.m616i(10), AbstractC0295Gu.m616i(14), AbstractC0295Gu.m616i(10));
        ImageView imageView = new ImageView(activity);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        layoutParams.setMarginEnd(AbstractC0295Gu.m616i(10));
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(R.drawable.ic_search);
        imageView.setColorFilter(activity.getColor(R.color.textSummary));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        linearLayout3.addView(imageView);
        EditText editText = new EditText(activity);
        editText.setHint(AbstractC0295Gu.m625r(-76489072572469L));
        editText.setTextSize(15.0f);
        editText.setTextColor(activity.getColor(R.color.textTitle));
        editText.setHintTextColor(activity.getColor(R.color.textSummary));
        editText.setBackground(null);
        editText.setSingleLine(true);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        editText.setLayoutParams(layoutParams2);
        editText.addTextChangedListener(new C1351e5(2, this));
        linearLayout3.addView(editText);
        linearLayout2.addView(linearLayout3);
        linearLayout.addView(linearLayout2);
        ViewGroup viewGroup2 = this.f2673a;
        ViewGroup viewGroup3 = viewGroup2;
        if (viewGroup2 == null) {
            AbstractC0295Gu.m625r(-76909979367477L);
            viewGroup3 = null;
        }
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(activity);
        horizontalScrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setOverScrollMode(2);
        LinearLayout linearLayout4 = new LinearLayout(activity);
        linearLayout4.setOrientation(0);
        linearLayout4.setGravity(16);
        linearLayout4.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(6));
        ArrayList arrayList2 = this.f2681i;
        arrayList2.clear();
        for (C0755Ri c0755Ri2 : list) {
            TextView textView = new TextView(activity);
            textView.setText(c0755Ri2.f2392a);
            textView.setTextSize(13.0f);
            textView.setGravity(17);
            Integer num2 = num;
            textView.setPadding(AbstractC0295Gu.m616i(14), AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(14), AbstractC0295Gu.m616i(6));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.setMarginEnd(AbstractC0295Gu.m616i(num2));
            textView.setLayoutParams(layoutParams3);
            textView.setClickable(true);
            textView.setFocusable(true);
            textView.setTag(c0755Ri2.f2393b);
            textView.setOnClickListener(new ViewOnClickListenerC2176l5(11, this, c0755Ri2));
            arrayList2.add(textView);
            linearLayout4.addView(textView);
            num = num2;
        }
        Integer num3 = num;
        horizontalScrollView.addView(linearLayout4);
        m1665f();
        viewGroup3.addView(horizontalScrollView);
        ScrollView scrollView = new ScrollView(activity);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams4.weight = 1.0f;
        scrollView.setLayoutParams(layoutParams4);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setOverScrollMode(2);
        LinearLayout linearLayout5 = new LinearLayout(activity);
        linearLayout5.setOrientation(1);
        linearLayout5.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout5.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(num3), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        this.f2674b = linearLayout5;
        scrollView.addView(linearLayout5);
        LinearLayout linearLayout6 = this.f2673a;
        if (linearLayout6 == null) {
            AbstractC0295Gu.m625r(-76454712834101L);
            viewGroup = null;
        } else {
            viewGroup = linearLayout6;
        }
        viewGroup.addView(scrollView);
        m1664e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: e */
    public final void m1664e() {
        int i;
        Activity activity;
        ?? r6 = 1;
        LinearLayout linearLayout = this.f2674b;
        if (linearLayout == null) {
            AbstractC0295Gu.m625r(-75247827023925L);
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        if (this.f2678f.isEmpty()) {
            LinearLayout linearLayout2 = this.f2674b;
            if (linearLayout2 == null) {
                AbstractC0295Gu.m625r(-75307956566069L);
                linearLayout2 = null;
            }
            Activity activity2 = this.f2675c;
            if (activity2 == null) {
                AbstractC0295Gu.m625r(-74818330294325L);
                activity2 = null;
            }
            TextView textView = new TextView(activity2);
            textView.setText(AbstractC0295Gu.m625r(this.f2680h.length() > 0 ? -74856984999989L : -74895639705653L));
            textView.setTextSize(15.0f);
            Activity activity3 = this.f2675c;
            if (activity3 == null) {
                AbstractC0295Gu.m625r(-74925704476725L);
                activity = null;
            } else {
                activity = activity3;
            }
            textView.setTextColor(activity.getColor(R.color.textSummary));
            textView.setGravity(17);
            textView.setPadding(0, AbstractC0295Gu.m616i(40), 0, AbstractC0295Gu.m616i(40));
            linearLayout2.addView(textView);
            return;
        }
        LinearLayout linearLayout3 = this.f2674b;
        if (linearLayout3 == null) {
            AbstractC0295Gu.m625r(-74964359182389L);
            linearLayout3 = null;
        }
        Activity activity4 = this.f2675c;
        if (activity4 == null) {
            AbstractC0295Gu.m625r(-75024488724533L);
            activity4 = null;
        }
        TextView textView2 = new TextView(activity4);
        textView2.setText(AbstractC0295Gu.m625r(-75612899244085L) + this.f2678f.size() + AbstractC0295Gu.m625r(-75625784145973L));
        textView2.setTextSize(13.0f);
        Activity activity5 = this.f2675c;
        if (activity5 == null) {
            AbstractC0295Gu.m625r(-75647258982453L);
            activity5 = null;
        }
        textView2.setTextColor(activity5.getColor(R.color.textSummary));
        int i2 = -1;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = AbstractC0295Gu.m616i(8);
        textView2.setLayoutParams(layoutParams);
        linearLayout3.addView(textView2);
        for (C0798Si c0798Si : this.f2678f) {
            AbstractC1101Zk abstractC1101Zk = c0798Si.f2500a;
            Activity activity6 = this.f2675c;
            if (activity6 == null) {
                AbstractC0295Gu.m625r(-75685913688117L);
                activity6 = null;
            }
            ArrayList<View> arrayListMo1096d = abstractC1101Zk.mo1096d(activity6);
            if (arrayListMo1096d.isEmpty()) {
                i = i2;
            } else {
                Activity activity7 = this.f2675c;
                if (activity7 == null) {
                    AbstractC0295Gu.m625r(-75724568393781L);
                    activity7 = null;
                }
                LinearLayout linearLayout4 = new LinearLayout(activity7);
                linearLayout4.setOrientation(r6);
                GradientDrawable gradientDrawable = new GradientDrawable();
                Activity activity8 = this.f2675c;
                if (activity8 == null) {
                    AbstractC0295Gu.m625r(-75505525061685L);
                    activity8 = null;
                }
                gradientDrawable.setColor(activity8.getColor(R.color.cardBackground));
                gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(12));
                int iM616i = AbstractC0295Gu.m616i(1);
                Activity activity9 = this.f2675c;
                if (activity9 == null) {
                    AbstractC0295Gu.m625r(-75544179767349L);
                    activity9 = null;
                }
                gradientDrawable.setStroke(iM616i, activity9.getColor(R.color.cardStroke));
                linearLayout4.setBackground(gradientDrawable);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i2, -2);
                layoutParams2.bottomMargin = AbstractC0295Gu.m616i(8);
                linearLayout4.setLayoutParams(layoutParams2);
                linearLayout4.setClipToOutline(r6);
                Activity activity10 = this.f2675c;
                if (activity10 == null) {
                    AbstractC0295Gu.m625r(-75763223099445L);
                    activity10 = null;
                }
                LinearLayout linearLayout5 = new LinearLayout(activity10);
                linearLayout5.setOrientation(0);
                linearLayout5.setGravity(16);
                linearLayout5.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(10), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(4));
                Activity activity11 = this.f2675c;
                if (activity11 == null) {
                    AbstractC0295Gu.m625r(-75801877805109L);
                    activity11 = null;
                }
                TextView textView3 = new TextView(activity11);
                textView3.setText(c0798Si.f2500a.f3491a.f3521d);
                textView3.setTextSize(13.0f);
                Activity activity12 = this.f2675c;
                if (activity12 == null) {
                    AbstractC0295Gu.m625r(-75840532510773L);
                    activity12 = null;
                }
                textView3.setTextColor(activity12.getColor(R.color.colorPrimary));
                textView3.setTypeface(Typeface.DEFAULT_BOLD);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
                layoutParams3.weight = 1.0f;
                textView3.setLayoutParams(layoutParams3);
                linearLayout5.addView(textView3);
                Activity activity13 = this.f2675c;
                if (activity13 == null) {
                    AbstractC0295Gu.m625r(-75329431402549L);
                    activity13 = null;
                }
                TextView textView4 = new TextView(activity13);
                textView4.setText(c0798Si.f2502c);
                textView4.setTextSize(10.0f);
                Activity activity14 = this.f2675c;
                if (activity14 == null) {
                    AbstractC0295Gu.m625r(-75368086108213L);
                    activity14 = null;
                }
                textView4.setTextColor(activity14.getColor(R.color.textSummary));
                textView4.setPadding(AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(1), AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(1));
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                Activity activity15 = this.f2675c;
                if (activity15 == null) {
                    AbstractC0295Gu.m625r(-75406740813877L);
                    activity15 = null;
                }
                int color = activity15.getColor(R.color.colorPrimary);
                gradientDrawable2.setColor(Color.argb((int) (255 * 0.08f), Color.red(color), Color.green(color), Color.blue(color)));
                gradientDrawable2.setCornerRadius(AbstractC0295Gu.m616i(6));
                textView4.setBackground(gradientDrawable2);
                linearLayout5.addView(textView4);
                linearLayout4.addView(linearLayout5);
                for (View view : arrayListMo1096d) {
                    view.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
                    view.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    linearLayout4.addView(view);
                }
                i = -1;
                ViewGroup viewGroup = this.f2674b;
                ViewGroup viewGroup2 = viewGroup;
                if (viewGroup == null) {
                    AbstractC0295Gu.m625r(-75445395519541L);
                    viewGroup2 = null;
                }
                viewGroup2.addView(linearLayout4);
            }
            i2 = i;
            r6 = 1;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1665f() {
        for (TextView textView : this.f2681i) {
            Object tag = textView.getTag();
            AbstractC0295Gu.m625r(-76523432310837L);
            Activity activity = null;
            if (AbstractC0585Nj.m1134a((String) tag, this.f2679g)) {
                textView.setTextColor(-1);
                textView.setTypeface(Typeface.DEFAULT_BOLD);
                GradientDrawable gradientDrawable = new GradientDrawable();
                Activity activity2 = this.f2675c;
                if (activity2 == null) {
                    AbstractC0295Gu.m625r(-75093208201269L);
                } else {
                    activity = activity2;
                }
                gradientDrawable.setColor(activity.getColor(R.color.colorPrimary));
                gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(20));
                textView.setBackground(gradientDrawable);
            } else {
                Activity activity3 = this.f2675c;
                if (activity3 == null) {
                    AbstractC0295Gu.m625r(-75131862906933L);
                    activity3 = null;
                }
                textView.setTextColor(activity3.getColor(R.color.textSummary));
                textView.setTypeface(Typeface.DEFAULT);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                Activity activity4 = this.f2675c;
                if (activity4 == null) {
                    AbstractC0295Gu.m625r(-75170517612597L);
                    activity4 = null;
                }
                gradientDrawable2.setColor(activity4.getColor(R.color.cardBackground));
                gradientDrawable2.setCornerRadius(AbstractC0295Gu.m616i(20));
                int iM616i = AbstractC0295Gu.m616i(1);
                Activity activity5 = this.f2675c;
                if (activity5 == null) {
                    AbstractC0295Gu.m625r(-75209172318261L);
                } else {
                    activity = activity5;
                }
                gradientDrawable2.setStroke(iM616i, activity.getColor(R.color.dividerColor));
                textView.setBackground(gradientDrawable2);
            }
        }
    }

    @Override // p000.InterfaceC0972Wk
    public final View getContentView() {
        LinearLayout linearLayout = this.f2673a;
        if (linearLayout != null) {
            return linearLayout;
        }
        AbstractC0295Gu.m625r(-74010876442677L);
        return null;
    }

    @Override // p000.InterfaceC0972Wk
    public final String getTitle() {
        return AbstractC0295Gu.m625r(-74045236181045L);
    }
}
