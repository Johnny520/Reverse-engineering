package p092z0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.abc.core.runtime.AbstractC0805P;
import java.lang.reflect.Field;
import org.luckypray.dexkit.C1031R;
import p003B0.AbstractC0059a;
import p006D.AbstractC0068E;
import p006D.AbstractC0070G;
import p006D.AbstractC0080Q;
import p058g0.AbstractC0942a;
import p081s0.AbstractC1077k;
import p087w.AbstractC1111a;
import p089x0.C1123g;
import p089x0.C1127k;

/* JADX INFO: renamed from: z0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1145c extends FrameLayout {

    /* JADX INFO: renamed from: i */
    public static final ViewOnTouchListenerC1144b f4404i = null;

    /* JADX INFO: renamed from: a */
    public final C1127k f4405a;

    /* JADX INFO: renamed from: b */
    public int f4406b;

    /* JADX INFO: renamed from: c */
    public final float f4407c;

    /* JADX INFO: renamed from: d */
    public final float f4408d;

    /* JADX INFO: renamed from: e */
    public final int f4409e;

    /* JADX INFO: renamed from: f */
    public final int f4410f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f4411g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f4412h;

    static {
        f4404i = new ViewOnTouchListenerC1144b();
    }

    public AbstractC1145c(Context r5, AttributeSet r6) {
        super(AbstractC0059a.m197a(r5, r6, 0, 0), r6);
        Context r52 = getContext();
        TypedArray r1 = r52.obtainStyledAttributes(r6, AbstractC0942a.f3346r);
        if (r1.hasValue(6) == false) goto L5;
        float r2 = r1.getDimensionPixelSize(6, 0);
        Field r3 = AbstractC0080Q.f219a;
        AbstractC0070G.m229s(this, r2);
    L5:
        this.f4406b = r1.getInt(2, 0);
        if (r1.hasValue(8) == false) goto L8;
    L9:
        this.f4405a = C1127k.m2657a(r52, r6, 0, 0).m2656a();
    L10:
        this.f4407c = r1.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC0805P.m2051r(r52, r1, 4));
        setBackgroundTintMode(AbstractC1077k.m2558f(r1.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f4408d = r1.getFloat(1, 1.0f);
        this.f4409e = r1.getDimensionPixelSize(0, -1);
        this.f4410f = r1.getDimensionPixelSize(7, -1);
        r1.recycle();
        setOnTouchListener(f4404i);
        setFocusable(true);
        if (getBackground() != null) goto L21;
        int r53 = AbstractC0805P.m2033I(AbstractC0805P.m2048o(this, C1031R.attr.colorSurface), AbstractC0805P.m2048o(this, C1031R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
        C1127k r62 = this.f4405a;
        if (r62 == null) goto L15;
        int r02 = AbstractC1146d.f4413a;
        C1123g r03 = new C1123g(r62);
        r03.m2651k(ColorStateList.valueOf(r53));
        Drawable r04 = r03;
    L16:
        ColorStateList r54 = this.f4411g;
        if (r54 == null) goto L19;
        AbstractC1111a.m2626h(r04, r54);
    L19:
        Field r55 = AbstractC0080Q.f219a;
        setBackground(r04);
        return;
    L15:
        Resources r63 = getResources();
        int r12 = AbstractC1146d.f4413a;
        float r64 = r63.getDimension(C1031R.dimen.mtrl_snackbar_background_corner_radius);
        GradientDrawable r13 = new GradientDrawable();
        r13.setShape(0);
        r13.setCornerRadius(r64);
        r13.setColor(r53);
        r04 = r13;
        goto L16
    L21:
        return;
    L8:
        if (r1.hasValue(9) == false) goto L10;
        goto L9
    }

    private void setBaseTransientBottomBar(AbstractC1146d r1) {
    }

    public float getActionTextColorAlpha() {
        return this.f4408d;
    }

    public int getAnimationMode() {
        return this.f4406b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f4407c;
    }

    public int getMaxInlineActionWidth() {
        return this.f4410f;
    }

    public int getMaxWidth() {
        return this.f4409e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Field r02 = AbstractC0080Q.f219a;
        AbstractC0068E.m210c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int r2, int r3) {
        super.onMeasure(r2, r3);
        int r22 = this.f4409e;
        if (r22 > 0) goto L5;
        return;
    L5:
        if (getMeasuredWidth() <= r22) goto L9;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(r22, 1073741824), r3);
        return;
    }

    public void setAnimationMode(int r1) {
        this.f4406b = r1;
    }

    @Override // android.view.View
    public void setBackground(Drawable r1) {
        setBackgroundDrawable(r1);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r2) {
        if (r2 != null) goto L4;
    L6:
        super.setBackgroundDrawable(r2);
        return;
    L4:
        if (this.f4411g == null) goto L6;
        r2 = r2.mutate();
        AbstractC1111a.m2626h(r2, this.f4411g);
        AbstractC1111a.m2627i(r2, this.f4412h);
        goto L6
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList r2) {
        this.f4411g = r2;
        if (getBackground() == null) goto L8;
        Drawable r02 = getBackground().mutate();
        AbstractC1111a.m2626h(r02, r2);
        AbstractC1111a.m2627i(r02, this.f4412h);
        if (r02 == getBackground()) goto L9;
        super.setBackgroundDrawable(r02);
        return;
    L9:
        return;
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode r2) {
        this.f4412h = r2;
        if (getBackground() == null) goto L8;
        Drawable r02 = getBackground().mutate();
        AbstractC1111a.m2627i(r02, r2);
        if (r02 == getBackground()) goto L9;
        super.setBackgroundDrawable(r02);
        return;
    L9:
        return;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams r5) {
        super.setLayoutParams(r5);
        if ((r5 instanceof ViewGroup.MarginLayoutParams) == false) goto L6;
        ViewGroup.MarginLayoutParams r52 = (ViewGroup.MarginLayoutParams) r5;
        new Rect(r52.leftMargin, r52.topMargin, r52.rightMargin, r52.bottomMargin);
        return;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener r2) {
        if (r2 == null) goto L4;
        ViewOnTouchListenerC1144b r02 = null;
    L5:
        setOnTouchListener(r02);
        super.setOnClickListener(r2);
        return;
    L4:
        r02 = f4404i;
        goto L5
    }
}
