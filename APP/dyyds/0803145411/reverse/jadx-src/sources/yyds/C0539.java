package yyds;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.p000ss.android.ugc.aweme.yyds.R;
import com.p000ss.android.ugc.awemes.MainActivity;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛳᛲᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0539 extends FrameLayout {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final TextView f2574;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final View f2575;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final TextView f2576;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final C0096 f2577;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final FrameLayout f2578;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public C1780 f2579;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final TextView f2580;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final TextView f2581;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final C2227 f2582;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final ImageView f2583;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final /* synthetic */ MainActivity f2584;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public ValueAnimator f2585;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final View f2586;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final TextView f2587;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final LinearLayout f2588;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final TextView f2589;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final View f2590;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final TextView f2591;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final View f2592;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final View f2593;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0539(MainActivity mainActivity, Context context) {
        super(context);
        AbstractC2328.m4341(-1341326449345390L);
        this.f2584 = mainActivity;
        setClipChildren(false);
        setClipToPadding(false);
        setOutlineProvider(new C1802());
        View view = new View(context);
        List list = MainActivity.f451;
        view.setBackground(MainActivity.m303(mainActivity.m316(R.color.status_success), mainActivity.m311(24), null, 0));
        view.setAlpha(0.12f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.leftMargin = mainActivity.m315(10);
        layoutParams.rightMargin = mainActivity.m315(10);
        layoutParams.bottomMargin = mainActivity.m315(26);
        view.setLayoutParams(layoutParams);
        this.f2590 = view;
        View view2 = new View(context);
        view2.setBackground(MainActivity.m303(mainActivity.m316(R.color.douyin_secondary), mainActivity.m311(24), null, 0));
        view2.setAlpha(0.17f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.leftMargin = mainActivity.m315(5);
        layoutParams2.rightMargin = mainActivity.m315(5);
        layoutParams2.bottomMargin = mainActivity.m315(20);
        view2.setLayoutParams(layoutParams2);
        this.f2593 = view2;
        addView(view);
        addView(view2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setCameraDistance(mainActivity.getResources().getDisplayMetrics().density * 5600.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.bottomMargin = mainActivity.m315(24);
        frameLayout.setLayoutParams(layoutParams3);
        this.f2578 = frameLayout;
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams4.leftMargin = mainActivity.m315(1);
        layoutParams4.topMargin = mainActivity.m315(1);
        layoutParams4.rightMargin = mainActivity.m315(1);
        layoutParams4.bottomMargin = mainActivity.m315(1);
        View view3 = new View(context);
        this.f2575 = view3;
        frameLayout.addView(view3, new FrameLayout.LayoutParams(layoutParams4));
        C0096 c0096 = new C0096(context);
        c0096.setClipToOutline(true);
        c0096.setOutlineProvider(new C2645(mainActivity, 2));
        this.f2577 = c0096;
        frameLayout.addView(c0096, new FrameLayout.LayoutParams(layoutParams4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(mainActivity.m315(16), mainActivity.m315(14), mainActivity.m315(16), mainActivity.m315(12));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(layoutParams4));
        ScrollView scrollView = new ScrollView(context);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setOverScrollMode(2);
        linearLayout.addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        scrollView.addView(linearLayout2, new FrameLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        linearLayout4.setGravity(16);
        linearLayout4.setPadding(mainActivity.m315(9), mainActivity.m315(4), mainActivity.m315(10), mainActivity.m315(4));
        this.f2588 = linearLayout4;
        View view4 = new View(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(mainActivity.m315(6), mainActivity.m315(6));
        layoutParams5.rightMargin = mainActivity.m315(5);
        view4.setLayoutParams(layoutParams5);
        this.f2586 = view4;
        linearLayout4.addView(view4);
        TextView textView = new TextView(context);
        textView.setTextSize(11.0f);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        this.f2587 = textView;
        linearLayout4.addView(textView);
        linearLayout3.addView(linearLayout4);
        linearLayout3.addView(new View(context), new LinearLayout.LayoutParams(0, 1, 1.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(0);
        linearLayout5.setGravity(80);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(20.0f);
        Typeface typeface2 = Typeface.MONOSPACE;
        textView2.setTypeface(Typeface.create(typeface2, 1));
        textView2.setTextColor(mainActivity.m316(R.color.primary_text));
        textView2.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.f2576 = textView2;
        linearLayout5.addView(textView2);
        TextView textView3 = new TextView(context);
        textView3.setTextSize(11.0f);
        textView3.setTypeface(typeface2);
        textView3.setTextColor(mainActivity.m316(R.color.secondary_text));
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setPadding(mainActivity.m315(2), 0, 0, mainActivity.m315(2));
        this.f2574 = textView3;
        linearLayout5.addView(textView3);
        linearLayout3.addView(linearLayout5);
        linearLayout2.addView(linearLayout3);
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(16);
        linearLayout6.setPadding(0, mainActivity.m315(14), 0, 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(mainActivity.m315(60), mainActivity.m315(60)));
        View view5 = new View(context);
        view5.setAlpha(0.9f);
        view5.setLayoutParams(new FrameLayout.LayoutParams(mainActivity.m315(60), mainActivity.m315(60)));
        this.f2592 = view5;
        frameLayout2.addView(view5);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(mainActivity.m315(44), mainActivity.m315(44), 17));
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(new C2645(mainActivity, 1));
        imageView.setElevation(mainActivity.m311(5));
        imageView.setClickable(true);
        imageView.setFocusable(true);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue, true);
        imageView.setForeground(context.getDrawable(typedValue.resourceId));
        imageView.setOnClickListener(new ViewOnClickListenerC0573(mainActivity, imageView, 2));
        this.f2583 = imageView;
        frameLayout2.addView(imageView);
        linearLayout6.addView(frameLayout2);
        LinearLayout linearLayout7 = new LinearLayout(context);
        linearLayout7.setOrientation(1);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams6.leftMargin = mainActivity.m315(12);
        linearLayout7.setLayoutParams(layoutParams6);
        TextView textView4 = new TextView(context);
        textView4.setTextSize(18.0f);
        textView4.setTypeface(typeface);
        textView4.setTextColor(mainActivity.m316(R.color.primary_text));
        textView4.setMaxLines(1);
        textView4.setEllipsize(truncateAt);
        this.f2580 = textView4;
        linearLayout7.addView(textView4);
        TextView textView5 = new TextView(context);
        textView5.setTextSize(10.5f);
        textView5.setTextColor(mainActivity.m316(R.color.secondary_text));
        textView5.setMaxLines(1);
        textView5.setEllipsize(truncateAt);
        textView5.setPadding(0, mainActivity.m315(2), 0, 0);
        this.f2591 = textView5;
        linearLayout7.addView(textView5);
        linearLayout6.addView(linearLayout7);
        linearLayout2.addView(linearLayout6);
        TextView textView6 = new TextView(context);
        textView6.setText(AbstractC2328.m4341(-1341360809083758L));
        textView6.setTextSize(10.0f);
        textView6.setTypeface(typeface);
        textView6.setLetterSpacing(0.14f);
        textView6.setTextColor(mainActivity.m316(R.color.secondary_text));
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams7.topMargin = mainActivity.m315(16);
        linearLayout2.addView(textView6, layoutParams7);
        C2227 c2227 = new C2227(context);
        c2227.setPadding(0, mainActivity.m315(6), 0, 0);
        this.f2582 = c2227;
        linearLayout2.addView(c2227, new LinearLayout.LayoutParams(-1, -2));
        TextView textView7 = new TextView(context);
        textView7.setText(AbstractC2328.m4341(-1341399463789422L));
        textView7.setTextSize(13.0f);
        textView7.setTypeface(typeface);
        textView7.setGravity(17);
        textView7.setPadding(0, mainActivity.m315(10), 0, mainActivity.m315(10));
        textView7.setMinimumHeight(mainActivity.m315(44));
        textView7.setVisibility(8);
        this.f2581 = textView7;
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams8.topMargin = mainActivity.m315(8);
        linearLayout.addView(textView7, layoutParams8);
        m1378(textView7, mainActivity.m311(999));
        TextView textView8 = new TextView(context);
        textView8.setText(AbstractC2328.m4341(-1341425233593198L));
        textView8.setTextSize(13.5f);
        textView8.setTypeface(typeface);
        textView8.setGravity(17);
        textView8.setTextColor(MainActivity.m304(mainActivity));
        textView8.setPadding(0, mainActivity.m315(10), 0, mainActivity.m315(10));
        textView8.setMinimumHeight(mainActivity.m315(46));
        this.f2589 = textView8;
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams9.topMargin = mainActivity.m315(8);
        linearLayout.addView(textView8, layoutParams9);
        m1378(textView8, mainActivity.m311(999));
        m1378(frameLayout, mainActivity.m311(24));
        frameLayout.setOnClickListener(new ViewOnClickListenerC1374(mainActivity, 15, this));
        addView(frameLayout);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0096 c0096 = this.f2577;
        ValueAnimator valueAnimator = c0096.f712;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c0096.f712 = null;
        ValueAnimator valueAnimator2 = this.f2585;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f2585 = null;
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m1378(View view, float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(f);
        List list = MainActivity.f451;
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(MainActivity.m308(this.f2584.m338(true), -1, 0.3f)), null, gradientDrawable);
        if (view.getForeground() == null) {
            view.setForeground(rippleDrawable);
        }
        final C0172 c0172 = new C0172();
        C0846 c0846 = new C0846(f);
        view.getOverlay().add(c0846);
        c0172.f997 = c0846;
        view.setOnTouchListener(new View.OnTouchListener() { // from class: yyds.ᲇᛸᛴᛳ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1 && action != 3) {
                        return false;
                    }
                    view2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                    return false;
                }
                view2.animate().scaleX(0.97f).scaleY(0.97f).setDuration(120L).start();
                C0846 c08462 = (C0846) c0172.f997;
                if (c08462 == null) {
                    return false;
                }
                int width = view2.getWidth();
                int height = view2.getHeight();
                if (width <= 0 || height <= 0) {
                    return false;
                }
                c08462.f3883 = 0.0f;
                c08462.f3887 = true;
                c08462.scheduleSelf(new RunnableC1334(c08462, System.currentTimeMillis()), 0L);
                c08462.invalidateSelf();
                return false;
            }
        });
    }
}
