package androidx.appcompat.widget;

import Yue.C3084;
import Yue.C3314;
import Yue.C3327;
import Yue.C3343;
import Yue.C6898;
import Yue.C7837;
import Yue.C7939;
import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC1583;
import androidx.appcompat.widget.C8754;

/* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C8756 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final String f26386 = "ScrollingTabContainerView";

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final Interpolator f26387 = new DecelerateInterpolator();

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f26388 = 200;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Runnable f26389;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public ViewOnClickListenerC8757 f26390;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public C8754 f26391;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public Spinner f26392;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f26393;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int f26394;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f26395;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f26396;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public int f26397;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public ViewPropertyAnimator f26398;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final C8759 f26399;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟۟$ۥ */
    public class RunnableC1633 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ View f26400;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public RunnableC1633(View view) {
            this.f26400 = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8756.this.smoothScrollTo(this.f26400.getLeft() - ((C8756.this.getWidth() - this.f26400.getWidth()) / 2), 0);
            C8756.this.f26389 = null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟ */
    public class C1634 extends BaseAdapter {
        public C1634() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return C8756.this.f26391.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((C8758) C8756.this.f26391.getChildAt(i)).m4700();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C8756.this.m29235((AbstractC1583.AbstractC8643) getItem(i), true);
            }
            ((C8758) view).m4699((AbstractC1583.AbstractC8643) getItem(i));
            return view;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟, reason: contains not printable characters */
    public class ViewOnClickListenerC8757 implements View.OnClickListener {
        public ViewOnClickListenerC8757() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((C8758) view).m4700().mo28768();
            int childCount = C8756.this.f26391.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C8756.this.f26391.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟۟, reason: contains not printable characters */
    public class C8758 extends LinearLayout {

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static final String f26404 = "androidx.appcompat.app.ActionBar$Tab";

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final int[] f26405;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public AbstractC1583.AbstractC8643 f26406;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public TextView f26407;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public ImageView f26408;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public View f26409;

        public C8758(Context context, AbstractC1583.AbstractC8643 abstractC8643, boolean z) {
            super(context, null, C6898.C1110.f18357);
            int[] iArr = {R.attr.background};
            this.f26405 = iArr;
            this.f26406 = abstractC8643;
            C7837 c7837M24869 = C7837.m24869(context, null, iArr, C6898.C1110.f18357, 0);
            if (c7837M24869.m24896(0)) {
                setBackgroundDrawable(c7837M24869.m24875(0));
            }
            c7837M24869.m24899();
            if (z) {
                setGravity(8388627);
            }
            m29242();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(f26404);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(f26404);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C8756.this.f26394 > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = C8756.this.f26394;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4699(AbstractC1583.AbstractC8643 abstractC8643) {
            this.f26406 = abstractC8643;
            m29242();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public AbstractC1583.AbstractC8643 m4700() {
            return this.f26406;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m29242() {
            AbstractC1583.AbstractC8643 abstractC8643 = this.f26406;
            View viewMo4599 = abstractC8643.mo4599();
            if (viewMo4599 != null) {
                ViewParent parent = viewMo4599.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewMo4599);
                    }
                    addView(viewMo4599);
                }
                this.f26409 = viewMo4599;
                TextView textView = this.f26407;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f26408;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f26408.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f26409;
            if (view != null) {
                removeView(view);
                this.f26409 = null;
            }
            Drawable drawableMo28764 = abstractC8643.mo28764();
            CharSequence charSequenceMo28767 = abstractC8643.mo28767();
            if (drawableMo28764 != null) {
                if (this.f26408 == null) {
                    C3314 c3314 = new C3314(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    c3314.setLayoutParams(layoutParams);
                    addView(c3314, 0);
                    this.f26408 = c3314;
                }
                this.f26408.setImageDrawable(drawableMo28764);
                this.f26408.setVisibility(0);
            } else {
                ImageView imageView2 = this.f26408;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f26408.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequenceMo28767);
            if (z) {
                if (this.f26407 == null) {
                    C3343 c3343 = new C3343(getContext(), null, C6898.C1110.f18358);
                    c3343.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    c3343.setLayoutParams(layoutParams2);
                    addView(c3343);
                    this.f26407 = c3343;
                }
                this.f26407.setText(charSequenceMo28767);
                this.f26407.setVisibility(0);
            } else {
                TextView textView2 = this.f26407;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f26407.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f26408;
            if (imageView3 != null) {
                imageView3.setContentDescription(abstractC8643.mo4598());
            }
            C7939.m3953(this, z ? null : abstractC8643.mo4598());
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C8759 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: ۥ */
        public boolean f3674 = false;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3675;

        public C8759() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3674 = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f3674) {
                return;
            }
            C8756 c8756 = C8756.this;
            c8756.f26398 = null;
            c8756.setVisibility(this.f3675);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C8756.this.setVisibility(0);
            this.f3674 = false;
        }

        /* JADX INFO: renamed from: ۥ */
        public C8759 m4701(ViewPropertyAnimator viewPropertyAnimator, int i) {
            this.f3675 = i;
            C8756.this.f26398 = viewPropertyAnimator;
            return this;
        }
    }

    public C8756(@InterfaceC6391 Context context) {
        super(context);
        this.f26399 = new C8759();
        setHorizontalScrollBarEnabled(false);
        C3084 c3084M170 = C3084.m170(context);
        setContentHeight(c3084M170.m6260());
        this.f26395 = c3084M170.m6259();
        C8754 c8754M29234 = m29234();
        this.f26391 = c8754M29234;
        addView(c8754M29234, new ViewGroup.LayoutParams(-2, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f26389;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C3084 c3084M170 = C3084.m170(getContext());
        setContentHeight(c3084M170.m6260());
        this.f26395 = c3084M170.m6259();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f26389;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C8758) view).m4700().mo28768();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f26391.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f26394 = -1;
        } else {
            if (childCount > 2) {
                this.f26394 = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f26394 = View.MeasureSpec.getSize(i) / 2;
            }
            this.f26394 = Math.min(this.f26394, this.f26395);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f26396, 1073741824);
        if (z || !this.f26393) {
            m29238();
        } else {
            this.f26391.measure(0, iMakeMeasureSpec);
            if (this.f26391.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m29237();
            } else {
                m29238();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f26397);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f26393 = z;
    }

    public void setContentHeight(int i) {
        this.f26396 = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f26397 = i;
        int childCount = this.f26391.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f26391.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                m29231(i);
            }
            i2++;
        }
        Spinner spinner = this.f26392;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }

    /* JADX INFO: renamed from: ۥ */
    public void m4697(AbstractC1583.AbstractC8643 abstractC8643, int i, boolean z) {
        C8758 c8758M29235 = m29235(abstractC8643, false);
        this.f26391.addView(c8758M29235, i, new C8754.C1632(0, -1, 1.0f));
        Spinner spinner = this.f26392;
        if (spinner != null) {
            ((C1634) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            c8758M29235.setSelected(true);
        }
        if (this.f26393) {
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m4698(AbstractC1583.AbstractC8643 abstractC8643, boolean z) {
        C8758 c8758M29235 = m29235(abstractC8643, false);
        this.f26391.addView(c8758M29235, new C8754.C1632(0, -1, 1.0f));
        Spinner spinner = this.f26392;
        if (spinner != null) {
            ((C1634) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            c8758M29235.setSelected(true);
        }
        if (this.f26393) {
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m29231(int i) {
        View childAt = this.f26391.getChildAt(i);
        Runnable runnable = this.f26389;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        RunnableC1633 runnableC1633 = new RunnableC1633(childAt);
        this.f26389 = runnableC1633;
        post(runnableC1633);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m29232(int i) {
        ViewPropertyAnimator viewPropertyAnimator = this.f26398;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (i != 0) {
            ViewPropertyAnimator viewPropertyAnimatorAlpha = animate().alpha(0.0f);
            viewPropertyAnimatorAlpha.setDuration(200L);
            viewPropertyAnimatorAlpha.setInterpolator(f26387);
            viewPropertyAnimatorAlpha.setListener(this.f26399.m4701(viewPropertyAnimatorAlpha, i));
            viewPropertyAnimatorAlpha.start();
            return;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAlpha2 = animate().alpha(1.0f);
        viewPropertyAnimatorAlpha2.setDuration(200L);
        viewPropertyAnimatorAlpha2.setInterpolator(f26387);
        viewPropertyAnimatorAlpha2.setListener(this.f26399.m4701(viewPropertyAnimatorAlpha2, i));
        viewPropertyAnimatorAlpha2.start();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Spinner m29233() {
        C3327 c3327 = new C3327(getContext(), null, C6898.C1110.f18362);
        c3327.setLayoutParams(new C8754.C1632(-2, -1));
        c3327.setOnItemSelectedListener(this);
        return c3327;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final C8754 m29234() {
        C8754 c8754 = new C8754(getContext(), null, C6898.C1110.f18356);
        c8754.setMeasureWithLargestChildEnabled(true);
        c8754.setGravity(17);
        c8754.setLayoutParams(new C8754.C1632(-2, -1));
        return c8754;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public C8758 m29235(AbstractC1583.AbstractC8643 abstractC8643, boolean z) {
        C8758 c8758 = new C8758(getContext(), abstractC8643, z);
        if (z) {
            c8758.setBackgroundDrawable(null);
            c8758.setLayoutParams(new AbsListView.LayoutParams(-1, this.f26396));
        } else {
            c8758.setFocusable(true);
            if (this.f26390 == null) {
                this.f26390 = new ViewOnClickListenerC8757();
            }
            c8758.setOnClickListener(this.f26390);
        }
        return c8758;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m29236() {
        Spinner spinner = this.f26392;
        return spinner != null && spinner.getParent() == this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m29237() {
        if (m29236()) {
            return;
        }
        if (this.f26392 == null) {
            this.f26392 = m29233();
        }
        removeView(this.f26391);
        addView(this.f26392, new ViewGroup.LayoutParams(-2, -1));
        if (this.f26392.getAdapter() == null) {
            this.f26392.setAdapter((SpinnerAdapter) new C1634());
        }
        Runnable runnable = this.f26389;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f26389 = null;
        }
        this.f26392.setSelection(this.f26397);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m29238() {
        if (!m29236()) {
            return false;
        }
        removeView(this.f26392);
        addView(this.f26391, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f26392.getSelectedItemPosition());
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m29239() {
        this.f26391.removeAllViews();
        Spinner spinner = this.f26392;
        if (spinner != null) {
            ((C1634) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f26393) {
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m29240(int i) {
        this.f26391.removeViewAt(i);
        Spinner spinner = this.f26392;
        if (spinner != null) {
            ((C1634) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f26393) {
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m29241(int i) {
        ((C8758) this.f26391.getChildAt(i)).m29242();
        Spinner spinner = this.f26392;
        if (spinner != null) {
            ((C1634) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f26393) {
            requestLayout();
        }
    }
}
