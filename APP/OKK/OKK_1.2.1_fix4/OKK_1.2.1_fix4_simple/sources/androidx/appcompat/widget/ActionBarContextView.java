package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0080Q;
import p037U.AbstractC0358S;
import p048b.AbstractC0550a;
import p057g.AbstractC0881Q0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public int f1101a;

    /* JADX INFO: renamed from: b */
    public boolean f1102b;

    /* JADX INFO: renamed from: c */
    public boolean f1103c;

    /* JADX INFO: renamed from: d */
    public CharSequence f1104d;

    /* JADX INFO: renamed from: e */
    public CharSequence f1105e;

    /* JADX INFO: renamed from: f */
    public View f1106f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f1107g;

    /* JADX INFO: renamed from: h */
    public TextView f1108h;

    /* JADX INFO: renamed from: i */
    public TextView f1109i;

    /* JADX INFO: renamed from: j */
    public final int f1110j;

    /* JADX INFO: renamed from: k */
    public final int f1111k;

    /* JADX INFO: renamed from: l */
    public boolean f1112l;

    public ActionBarContextView(Context r6, AttributeSet r7) {
        super(r6, r7, C1031R.attr.actionModeStyle);
        TypedValue r1 = new TypedValue();
        if (r6.getTheme().resolveAttribute(C1031R.attr.actionBarPopupTheme, r1, true) == true) goto L5;
    L7:
        TypedArray r72 = r6.obtainStyledAttributes(r7, AbstractC0550a.f1619d, C1031R.attr.actionModeStyle, 0);
        if (r72.hasValue(0) == false) goto L12;
        int r02 = r72.getResourceId(0, 0);
        if (r02 == 0) goto L12;
        Drawable r62 = AbstractC0358S.m916w(r6, r02);
    L13:
        setBackground(r62);
        this.f1110j = r72.getResourceId(5, 0);
        this.f1111k = r72.getResourceId(4, 0);
        this.f1101a = r72.getLayoutDimension(3, 0);
        r72.getResourceId(2, C1031R.layout.abc_action_mode_close_item_material);
        r72.recycle();
        return;
    L12:
        r62 = r72.getDrawable(0);
        goto L13
    L5:
        if (r1.resourceId == 0) goto L7;
        new ContextThemeWrapper(r6, r1.resourceId);
        goto L7
    }

    /* JADX INFO: renamed from: b */
    public static int m1117b(View r2, int r3, int r4, int r5, boolean r6) {
        int r02 = r2.getMeasuredWidth();
        int r1 = r2.getMeasuredHeight();
        int r52 = ((r5 - r1) / 2) + r4;
        if (r6 == false) goto L5;
        r2.layout(r3 - r02, r52, r3, r1 + r52);
    L6:
        if (r6 == true) goto L8;
        return r02;
    L8:
        return -r02;
    L5:
        r2.layout(r3, r52, r3 + r02, r1 + r52);
        goto L6
    }

    /* JADX INFO: renamed from: a */
    public final void m1118a() {
        if (this.f1107g != null) goto L10;
        LayoutInflater.from(getContext()).inflate(C1031R.layout.abc_action_bar_title_item, this);
        LinearLayout r02 = (LinearLayout) getChildAt(getChildCount() - 1);
        this.f1107g = r02;
        this.f1108h = (TextView) r02.findViewById(C1031R.id.action_bar_title);
        this.f1109i = (TextView) this.f1107g.findViewById(C1031R.id.action_bar_subtitle);
        int r03 = this.f1110j;
        if (r03 == 0) goto L7;
        this.f1108h.setTextAppearance(getContext(), r03);
    L7:
        int r04 = this.f1111k;
        if (r04 == 0) goto L10;
        this.f1109i.setTextAppearance(getContext(), r04);
    L10:
        this.f1108h.setText(this.f1104d);
        this.f1109i.setText(this.f1105e);
        boolean r05 = !TextUtils.isEmpty(this.f1104d);
        boolean r1 = !TextUtils.isEmpty(this.f1105e);
        TextView r2 = this.f1109i;
        int r3 = 8;
        if (r1 == false) goto L13;
        int r5 = 0;
    L14:
        r2.setVisibility(r5);
        LinearLayout r22 = this.f1107g;
        if (r05 == true) goto L17;
        if (r1 == true) goto L17;
    L18:
        r22.setVisibility(r3);
        if (this.f1107g.getParent() != null) goto L22;
        addView(this.f1107g);
        return;
    L22:
        return;
    L17:
        r3 = 0;
        goto L18
    L13:
        r5 = 8;
        goto L14
    }

    /* JADX INFO: renamed from: c */
    public final void m1119c(int r2) {
        if (r2 == getVisibility()) goto L6;
        super.setVisibility(r2);
        return;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet r3) {
        return new ViewGroup.MarginLayoutParams(getContext(), r3);
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1101a;
    }

    public CharSequence getSubtitle() {
        return this.f1105e;
    }

    public CharSequence getTitle() {
        return this.f1104d;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration r5) {
        super.onConfigurationChanged(r5);
        TypedArray r52 = getContext().obtainStyledAttributes(null, AbstractC0550a.f1616a, C1031R.attr.actionBarStyle, 0);
        setContentHeight(r52.getLayoutDimension(13, 0));
        r52.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent r6) {
        int r02 = r6.getActionMasked();
        if (r02 != 9) goto L6;
        this.f1103c = false;
    L6:
        if (this.f1103c == true) goto L12;
        boolean r62 = super.onHoverEvent(r6);
        if (r02 != 9) goto L12;
        if (r62 == true) goto L12;
        this.f1103c = true;
    L12:
        if (r02 != 10) goto L14;
    L15:
        this.f1103c = false;
    L16:
        return true;
    L14:
        if (r02 != 3) goto L16;
        goto L15
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
        boolean r22 = AbstractC0881Q0.f3149a;
        boolean r02 = true;
        if (getLayoutDirection() == 1) goto L6;
        r02 = false;
    L6:
        if (r02 == false) goto L8;
        int r52 = (r5 - r3) - getPaddingRight();
    L9:
        int r23 = getPaddingTop();
        int r62 = ((r6 - r4) - getPaddingTop()) - getPaddingBottom();
        LinearLayout r32 = this.f1107g;
        if (r32 != null) goto L12;
    L16:
        View r33 = this.f1106f;
        if (r33 == null) goto L19;
        m1117b(r33, r52, r23, r62, r02);
    L19:
        if (r02 == false) goto L21;
        getPaddingLeft();
        return;
    L21:
        getPaddingRight();
        return;
    L12:
        if (this.f1106f != null) goto L16;
        if (r32.getVisibility() == 8) goto L16;
        r52 = r52 + m1117b(this.f1107g, r52, r23, r62, r02);
        goto L16
    L8:
        r52 = getPaddingLeft();
        goto L9
    }

    @Override // android.view.View
    public final void onMeasure(int r11, int r12) {
        int r1 = 1073741824;
        if (View.MeasureSpec.getMode(r11) != 1073741824) goto L57;
        if (View.MeasureSpec.getMode(r12) == 0) goto L55;
        int r112 = View.MeasureSpec.getSize(r11);
        int r02 = this.f1101a;
        if (r02 > 0) goto L10;
        r02 = View.MeasureSpec.getSize(r12);
    L10:
        int r2 = getPaddingBottom() + getPaddingTop();
        int r122 = (r112 - getPaddingLeft()) - getPaddingRight();
        int r3 = r02 - r2;
        int r5 = View.MeasureSpec.makeMeasureSpec(r3, Integer.MIN_VALUE);
        LinearLayout r6 = this.f1107g;
        int r7 = 0;
        if (r6 != null) goto L13;
    L28:
        View r52 = this.f1106f;
        if (r52 == null) goto L44;
        ViewGroup.LayoutParams r53 = r52.getLayoutParams();
        int r62 = r53.width;
        if (r62 == (-2)) goto L33;
        int r9 = 1073741824;
    L34:
        if (r62 < 0) goto L36;
        r122 = Math.min(r62, r122);
    L36:
        int r54 = r53.height;
        if (r54 != (-2)) goto L40;
        r1 = Integer.MIN_VALUE;
    L40:
        if (r54 < 0) goto L42;
        r3 = Math.min(r54, r3);
    L42:
        this.f1106f.measure(View.MeasureSpec.makeMeasureSpec(r122, r9), View.MeasureSpec.makeMeasureSpec(r3, r1));
        goto L44
    L33:
        r9 = Integer.MIN_VALUE;
    L44:
        if (this.f1101a > 0) goto L52;
        int r123 = getChildCount();
        int r03 = 0;
    L46:
        if (r7 >= r123) goto L51;
        int r13 = getChildAt(r7).getMeasuredHeight() + r2;
        if (r13 <= r03) goto L50;
        r03 = r13;
    L50:
        r7 = r7 + 1;
        goto L46
    L51:
        setMeasuredDimension(r112, r03);
        return;
    L52:
        setMeasuredDimension(r112, r02);
        return;
    L13:
        if (this.f1106f != null) goto L28;
        if (this.f1112l == false) goto L27;
        this.f1107g.measure(View.MeasureSpec.makeMeasureSpec(0, 0), r5);
        int r55 = this.f1107g.getMeasuredWidth();
        if (r55 > r122) goto L19;
        boolean r63 = true;
    L20:
        if (r63 == false) goto L22;
        r122 = r122 - r55;
    L22:
        LinearLayout r56 = this.f1107g;
        if (r63 == false) goto L25;
        int r64 = 0;
    L26:
        r56.setVisibility(r64);
        goto L28
    L25:
        r64 = 8;
        goto L26
    L19:
        r63 = false;
        goto L20
    L27:
        r6.measure(View.MeasureSpec.makeMeasureSpec(r122, Integer.MIN_VALUE), r5);
        r122 = Math.max(0, r122 - r6.getMeasuredWidth());
        goto L28
    L55:
        throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
    L57:
        throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent r5) {
        int r02 = r5.getActionMasked();
        if (r02 != 0) goto L6;
        this.f1102b = false;
    L6:
        if (this.f1102b == true) goto L11;
        boolean r52 = super.onTouchEvent(r5);
        if (r02 != 0) goto L11;
        if (r52 == true) goto L11;
        this.f1102b = true;
    L11:
        if (r02 != 1) goto L13;
    L14:
        this.f1102b = false;
    L15:
        return true;
    L13:
        if (r02 != 3) goto L15;
        goto L14
    }

    public void setContentHeight(int r1) {
        this.f1101a = r1;
    }

    public void setCustomView(View r2) {
        View r02 = this.f1106f;
        if (r02 == null) goto L5;
        removeView(r02);
    L5:
        this.f1106f = r2;
        if (r2 == null) goto L10;
        LinearLayout r03 = this.f1107g;
        if (r03 == null) goto L10;
        removeView(r03);
        this.f1107g = null;
    L10:
        if (r2 == null) goto L12;
        addView(r2);
    L12:
        requestLayout();
    }

    public void setSubtitle(CharSequence r1) {
        this.f1105e = r1;
        m1118a();
    }

    public void setTitle(CharSequence r1) {
        this.f1104d = r1;
        m1118a();
        AbstractC0080Q.m292k(this, r1);
    }

    public void setTitleOptional(boolean r2) {
        if (r2 == this.f1112l) goto L5;
        requestLayout();
    L5:
        this.f1112l = r2;
    }

    @Override // android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int r1) {
        m1119c(r1);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
