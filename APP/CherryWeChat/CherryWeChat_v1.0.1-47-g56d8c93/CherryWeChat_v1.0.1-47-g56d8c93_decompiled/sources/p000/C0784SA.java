package p000;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: SA */
/* JADX INFO: loaded from: classes.dex */
public final class C0784SA implements InterfaceC0972Wk {

    /* JADX INFO: renamed from: a */
    public FrameLayout f2474a;

    /* JADX INFO: renamed from: b */
    public String f2475b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f2476c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f2477d;

    /* JADX INFO: renamed from: e */
    public TextView f2478e;

    /* JADX INFO: renamed from: f */
    public TextView f2479f;

    /* JADX INFO: renamed from: g */
    public TextView f2480g;

    /* JADX INFO: renamed from: h */
    public ProgressBar f2481h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f2482i;

    /* JADX INFO: renamed from: j */
    public NestedScrollView f2483j;

    /* JADX INFO: renamed from: a */
    public static final void m1603a(C0784SA c0784sa) {
        ProgressBar progressBar = c0784sa.f2481h;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        LinearLayout linearLayout = c0784sa.f2482i;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        NestedScrollView nestedScrollView = c0784sa.f2483j;
        if (nestedScrollView != null) {
            nestedScrollView.setAlpha(0.0f);
            nestedScrollView.setVisibility(0);
            nestedScrollView.animate().alpha(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator()).start();
        }
        LinearLayout linearLayout2 = c0784sa.f2477d;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(0.0f);
            linearLayout2.setVisibility(0);
            linearLayout2.animate().alpha(1.0f).setDuration(300L).setStartDelay(150L).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m1604e(C0784SA c0784sa) {
        ProgressBar progressBar = c0784sa.f2481h;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        LinearLayout linearLayout = c0784sa.f2482i;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        NestedScrollView nestedScrollView = c0784sa.f2483j;
        if (nestedScrollView != null) {
            nestedScrollView.setVisibility(8);
        }
        LinearLayout linearLayout2 = c0784sa.f2477d;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: f */
    public static GradientDrawable m1605f(Activity activity) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(activity.getColor(R.color.cardBackground));
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(20));
        gradientDrawable.setStroke(AbstractC0295Gu.m616i(1), activity.getColor(R.color.cardStroke));
        return gradientDrawable;
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        AbstractC0295Gu.m625r(-490184617490485L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity activity, int i, int i2, Intent intent) {
        AbstractC0295Gu.m625r(-490223272196149L);
        if (i == 10086 && i2 == -1) {
            Toast.makeText(activity, AbstractC0295Gu.m625r(-490261926901813L), 1).show();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity activity) {
        AbstractC0295Gu.m625r(-490635589056565L);
        this.f2475b = activity.getIntent().getStringExtra(AbstractC0295Gu.m625r(-491223999576117L));
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(activity.getColor(R.color.colorBackground));
        this.f2474a = frameLayout;
        ProgressBar progressBar = new ProgressBar(activity);
        progressBar.setLayoutParams(new FrameLayout.LayoutParams(AbstractC0295Gu.m616i(60), AbstractC0295Gu.m616i(60), 17));
        progressBar.setIndeterminate(true);
        this.f2481h = progressBar;
        FrameLayout frameLayout2 = this.f2474a;
        if (frameLayout2 != null) {
            frameLayout2.addView(progressBar);
        }
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        linearLayout.setVisibility(8);
        linearLayout.setPadding(AbstractC0295Gu.m616i(40), AbstractC0295Gu.m616i(40), AbstractC0295Gu.m616i(40), AbstractC0295Gu.m616i(40));
        TextView textView = new TextView(activity);
        textView.setText(AbstractC0295Gu.m625r(-491284129118261L));
        textView.setTextSize(48.0f);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = AbstractC0295Gu.m616i(16);
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(activity);
        textView2.setText(AbstractC0295Gu.m625r(-491297014020149L));
        textView2.setTextSize(18.0f);
        textView2.setGravity(17);
        textView2.setTextColor(activity.getColor(R.color.textTitle));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = AbstractC0295Gu.m616i(8);
        textView2.setLayoutParams(layoutParams2);
        linearLayout.addView(textView2);
        TextView textView3 = new TextView(activity);
        textView3.setText(AbstractC0295Gu.m625r(-491318488856629L));
        textView3.setTextSize(14.0f);
        textView3.setGravity(17);
        textView3.setTextColor(activity.getColor(R.color.buttonPrimary));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(AbstractC0295Gu.m616i(2), activity.getColor(R.color.buttonPrimary));
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(12));
        textView3.setBackground(gradientDrawable);
        textView3.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(12));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = AbstractC0295Gu.m616i(16);
        textView3.setLayoutParams(layoutParams3);
        textView3.setOnClickListener(new ViewOnClickListenerC2176l5(19, this, activity));
        linearLayout.addView(textView3);
        this.f2482i = linearLayout;
        FrameLayout frameLayout3 = this.f2474a;
        if (frameLayout3 != null) {
            frameLayout3.addView(linearLayout);
        }
        NestedScrollView nestedScrollView = new NestedScrollView(activity, null);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams4.bottomMargin = AbstractC0295Gu.m616i(120);
        nestedScrollView.setLayoutParams(layoutParams4);
        nestedScrollView.setOverScrollMode(2);
        nestedScrollView.setVisibility(8);
        this.f2483j = nestedScrollView;
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        NestedScrollView nestedScrollView2 = this.f2483j;
        if (nestedScrollView2 != null) {
            nestedScrollView2.addView(linearLayout2);
        }
        FrameLayout frameLayout4 = this.f2474a;
        if (frameLayout4 != null) {
            frameLayout4.addView(this.f2483j);
        }
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(1);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout3.setBackground(m1605f(activity));
        linearLayout3.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        TextView textView4 = new TextView(activity);
        textView4.setTextSize(24.0f);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView4.setTypeface(typeface);
        textView4.setTextColor(activity.getColor(R.color.textTitle));
        textView4.setMaxLines(2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        textView4.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f2478e = textView4;
        linearLayout3.addView(textView4);
        TextView textView5 = new TextView(activity);
        textView5.setTextSize(14.0f);
        textView5.setTextColor(activity.getColor(R.color.textSummary));
        textView5.setMaxLines(1);
        textView5.setEllipsize(truncateAt);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.topMargin = AbstractC0295Gu.m616i(8);
        textView5.setLayoutParams(layoutParams5);
        this.f2479f = textView5;
        linearLayout3.addView(textView5);
        linearLayout2.addView(linearLayout3);
        LinearLayout linearLayout4 = new LinearLayout(activity);
        linearLayout4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams6.topMargin = AbstractC0295Gu.m616i(24);
        linearLayout4.setLayoutParams(layoutParams6);
        linearLayout4.setBackground(m1605f(activity));
        linearLayout4.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        TextView textView6 = new TextView(activity);
        textView6.setText(AbstractC0295Gu.m625r(-491262654281781L));
        textView6.setTextSize(16.0f);
        textView6.setTypeface(typeface);
        textView6.setTextColor(activity.getColor(R.color.textTitle));
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams7.bottomMargin = AbstractC0295Gu.m616i(12);
        textView6.setLayoutParams(layoutParams7);
        linearLayout4.addView(textView6);
        RecyclerView recyclerView = new RecyclerView(activity);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setOverScrollMode(2);
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        recyclerView.setNestedScrollingEnabled(false);
        this.f2476c = recyclerView;
        linearLayout4.addView(recyclerView);
        linearLayout2.addView(linearLayout4);
        LinearLayout linearLayout5 = new LinearLayout(activity);
        linearLayout5.setOrientation(1);
        linearLayout5.setBackgroundResource(R.color.cardBackground);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams8.gravity = 80;
        linearLayout5.setLayoutParams(layoutParams8);
        linearLayout5.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24));
        linearLayout5.setVisibility(8);
        TextView textView7 = new TextView(activity);
        textView7.setText(AbstractC0295Gu.m625r(-491339963693109L));
        textView7.setTextSize(18.0f);
        textView7.setTypeface(typeface);
        textView7.setGravity(17);
        textView7.setTextColor(activity.getColor(R.color.buttonTextPrimary));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColors(new int[]{activity.getColor(R.color.buttonPrimary), Color.parseColor(AbstractC0295Gu.m625r(-491361438529589L))});
        gradientDrawable2.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable2.setCornerRadius(AbstractC0295Gu.m616i(16));
        textView7.setBackground(gradientDrawable2);
        textView7.setLayoutParams(new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(56)));
        this.f2480g = textView7;
        linearLayout5.addView(textView7);
        this.f2477d = linearLayout5;
        FrameLayout frameLayout5 = this.f2474a;
        if (frameLayout5 != null) {
            frameLayout5.addView(linearLayout5);
        }
        m1606g(activity);
    }

    /* JADX INFO: renamed from: g */
    public final void m1606g(Activity activity) {
        String str = this.f2475b;
        if (str == null) {
            return;
        }
        ProgressBar progressBar = this.f2481h;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        LinearLayout linearLayout = this.f2482i;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        NestedScrollView nestedScrollView = this.f2483j;
        if (nestedScrollView != null) {
            nestedScrollView.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f2477d;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        C1498hd c1498hd = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C1417fk(str, this, activity, null, 3), 3);
    }

    @Override // p000.InterfaceC0972Wk
    public final View getContentView() {
        return this.f2474a;
    }

    @Override // p000.InterfaceC0972Wk
    public final String getTitle() {
        return AbstractC0295Gu.m625r(-490330646378549L);
    }
}
