package com.google.android.material.focus;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import androidx.appcompat.widget.C1035;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p069.AbstractC7390;
import p321.C9452;
import p321.C9457;
import p321.C9465;
import p321.C9467;
import p321.C9469;
import p321.C9472;
import p321.InterfaceC9464;
import p325.C9481;
import p325.C9482;
import p330.AbstractC9490;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class FocusRingDrawable extends DrawableWrapper {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C9481 f10740;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f10741;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f10742;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f10743;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public float f10744;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public ObjectAnimator f10745;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Path f10746;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Path f10747;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public WeakReference f10748;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public float f10749;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Matrix f10750;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C9467 f10751;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final RectF f10752;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Rect f10753;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Paint f10754;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final ColorDrawable f10739 = new ColorDrawable(0);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final int[] f10738 = {R.attr.state_focused, R.attr.state_window_focused};

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final OvershootInterpolator f10737 = new OvershootInterpolator(4.0f);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final C9482 f10736 = new C9482("interpolation");

    private FocusRingDrawable(C9481 c9481, Resources resources) {
        super(null);
        Paint paint = new Paint(1);
        this.f10754 = paint;
        this.f10752 = new RectF();
        this.f10753 = new Rect();
        this.f10747 = new Path();
        this.f10746 = new Path();
        this.f10750 = new Matrix();
        this.f10751 = C9467.m14874();
        this.f10749 = -1.0f;
        this.f10744 = 1.0f;
        this.f10742 = false;
        this.f10741 = false;
        C9481 c94812 = new C9481(c9481);
        this.f10740 = c94812;
        Drawable.ConstantState constantState = c94812.f24703;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.f10740.f24721)) {
            return;
        }
        paint.setStrokeWidth(this.f10740.f24721);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static float m7707(float f, Resources.Theme theme, int i, TypedArray typedArray, int i2, int i3) {
        if (!Float.isNaN(f)) {
            return f;
        }
        Resources resources = theme.getResources();
        if (i != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i2, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i3 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static FocusRingDrawable m7708(Context context, LayerDrawable layerDrawable, C9472 c9472) {
        if (!AbstractC7390.m12627(context.getTheme(), C0328R.attr.focusRingsEnabled, false)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, f10739);
        if (c9472 != null) {
            focusRingDrawable.f10748 = new WeakReference(c9472);
        }
        layerDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(layerDrawable);
        return focusRingDrawable;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m7709(TypedArray typedArray, int i) {
        if (typedArray.getType(i) != 2) {
            return Integer.MIN_VALUE;
        }
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        m7710(theme);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float fMax;
        int radius;
        super.draw(canvas);
        C9481 c9481 = this.f10740;
        if (c9481.f24701 && this.f10742) {
            float f = c9481.f24715;
            float f2 = c9481.f24721 / 2.0f;
            float f3 = this.f10744;
            float f4 = (f2 * f3) + f;
            float f5 = ((c9481.f24719 / 2.0f) * f3) + f + c9481.f24713;
            Path path = this.f10746;
            if (path.isEmpty()) {
                WeakReference weakReference = this.f10748;
                if (weakReference == null || weakReference.get() == null) {
                    path = null;
                } else {
                    path = ((C9472) this.f10748.get()).f24666;
                    if (path.isEmpty()) {
                    }
                }
            }
            Path path2 = path;
            C9481 c94812 = this.f10740;
            if (path2 != null) {
                m7711(canvas, path2, f5, c94812.f24719, c94812.f24716);
                C9481 c94813 = this.f10740;
                m7711(canvas, path2, f4, c94813.f24721, c94813.f24698);
                return;
            }
            if (Float.isNaN(c94812.f24710)) {
                fMax = this.f10749;
                if (fMax < 0.0f) {
                    WeakReference weakReference2 = this.f10748;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        Drawable drawable = getDrawable();
                        fMax = (!(drawable instanceof RippleDrawable) || (radius = ((RippleDrawable) drawable).getRadius()) < 0) ? 0.0f : radius;
                    } else {
                        C9472 c9472 = (C9472) this.f10748.get();
                        float fM14889 = c9472.m14889(c9472.m14904(), c9472.f24669.f24628.mo14851(), c9472.f24643);
                        if (fM14889 >= 0.0f) {
                            fM14889 *= c9472.f24669.f24637;
                        }
                        if (fM14889 >= 0.0f) {
                            fMax = Math.max(0.0f, fM14889 - (this.f10740.f24721 / 2.0f));
                        }
                    }
                }
            } else {
                fMax = this.f10740.f24710;
            }
            float fMax2 = Math.max(0.0f, fMax - (this.f10740.f24721 / 2.0f));
            C9481 c94814 = this.f10740;
            float f6 = c94814.f24719;
            int i = c94814.f24716;
            RectF rectF = this.f10752;
            m7712(rectF);
            rectF.inset(f5, f5);
            float f7 = f6 * this.f10744;
            Paint paint = this.f10754;
            paint.setStrokeWidth(f7);
            paint.setColor(i);
            canvas.drawRoundRect(rectF, fMax2, fMax2, paint);
            C9481 c94815 = this.f10740;
            float f8 = c94815.f24721;
            int i2 = c94815.f24698;
            m7712(rectF);
            rectF.inset(f4, f4);
            paint.setStrokeWidth(f8 * this.f10744);
            paint.setColor(i2);
            canvas.drawRoundRect(rectF, fMax, fMax, paint);
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        C9481 c9481 = this.f10740;
        if (c9481.f24703 == null) {
            return null;
        }
        c9481.f24702 = getChangingConfigurations();
        return this.f10740;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            if (super.hasFocusStateSpecified()) {
                return true;
            }
            return this.f10740.f24701;
        } catch (NoSuchMethodError unused) {
            return this.f10740.f24701;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = AbstractC9490.f24791;
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.f10740.f24700 = m7709(typedArrayObtainStyledAttributes, 0);
        if (this.f10740.f24700 == Integer.MIN_VALUE && typedArrayObtainStyledAttributes.hasValue(0)) {
            C9481 c9481 = this.f10740;
            c9481.f24701 = typedArrayObtainStyledAttributes.getBoolean(0, c9481.f24701);
            this.f10740.f24699 = true;
        }
        this.f10740.f24717 = m7709(typedArrayObtainStyledAttributes, 5);
        C9481 c94812 = this.f10740;
        if (c94812.f24717 == Integer.MIN_VALUE) {
            c94812.f24698 = typedArrayObtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.f10740.f24720 = m7709(typedArrayObtainStyledAttributes, 1);
        C9481 c94813 = this.f10740;
        if (c94813.f24720 == Integer.MIN_VALUE) {
            c94813.f24716 = typedArrayObtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.f10740.f24718 = m7709(typedArrayObtainStyledAttributes, 6);
        C9481 c94814 = this.f10740;
        if (c94814.f24718 == Integer.MIN_VALUE) {
            c94814.f24721 = typedArrayObtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.f10740.f24711 = m7709(typedArrayObtainStyledAttributes, 3);
        C9481 c94815 = this.f10740;
        if (c94815.f24711 == Integer.MIN_VALUE) {
            c94815.f24719 = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.f10740.f24711 = m7709(typedArrayObtainStyledAttributes, 3);
        C9481 c94816 = this.f10740;
        if (c94816.f24711 == Integer.MIN_VALUE) {
            c94816.f24719 = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.f10740.f24714 = m7709(typedArrayObtainStyledAttributes, 7);
        C9481 c94817 = this.f10740;
        if (c94817.f24714 == Integer.MIN_VALUE) {
            c94817.f24710 = typedArrayObtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.f10740.f24712 = m7709(typedArrayObtainStyledAttributes, 4);
        C9481 c94818 = this.f10740;
        if (c94818.f24712 == Integer.MIN_VALUE) {
            c94818.f24715 = typedArrayObtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.f10740.f24705 = m7709(typedArrayObtainStyledAttributes, 2);
        C9481 c94819 = this.f10740;
        if (c94819.f24705 == Integer.MIN_VALUE) {
            c94819.f24713 = typedArrayObtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.f10740.f24709 = m7709(typedArrayObtainStyledAttributes, 8);
        this.f10740.f24708 = typedArrayObtainStyledAttributes.getType(8) == 1 ? typedArrayObtainStyledAttributes.getResourceId(8, Integer.MIN_VALUE) : Integer.MIN_VALUE;
        typedArrayObtainStyledAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        Drawable drawableCreateFromXmlInner = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                drawableCreateFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawableCreateFromXmlInner != null) {
            setDrawable(drawableCreateFromXmlInner);
            this.f10740.f24703 = drawableCreateFromXmlInner.getConstantState();
        } else {
            ColorDrawable colorDrawable = f10739;
            setDrawable(colorDrawable);
            this.f10740.f24703 = colorDrawable.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.isProjected();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.f10740.f24701;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.f10745;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.f10745 = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f10741 && super.mutate() == this) {
            this.f10740 = new C9481(this.f10740);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.f10740.f24703 = drawable.getConstantState();
            }
            this.f10741 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float[] cornerRadii;
        float cornerRadius;
        C9469 c9469;
        super.onBoundsChange(rect);
        C9481 c9481 = this.f10740;
        if (c9481.f24701) {
            InterfaceC9464 interfaceC9464 = c9481.f24704;
            if (interfaceC9464 != null) {
                m7713(interfaceC9464);
                return;
            }
            Drawable drawable = getDrawable();
            int i = 0;
            InterfaceC9464 interfaceC94642 = null;
            if (drawable instanceof ShapeDrawable) {
                Outline outline = new Outline();
                ((ShapeDrawable) drawable).getOutline(outline);
                if (outline.getRadius() > 0.0f) {
                    C9465 c9465 = new C9465();
                    C9465 c94652 = new C9465();
                    C9465 c94653 = new C9465();
                    C9465 c94654 = new C9465();
                    C9452 c9452 = new C9452(i);
                    C9452 c94522 = new C9452(i);
                    C9452 c94523 = new C9452(i);
                    C9452 c94524 = new C9452(i);
                    float radius = outline.getRadius();
                    C9457 c9457 = new C9457(radius);
                    C9457 c94572 = new C9457(radius);
                    C9457 c94573 = new C9457(radius);
                    C9457 c94574 = new C9457(radius);
                    c9469 = new C9469();
                    c9469.f24616 = c9465;
                    c9469.f24615 = c94652;
                    c9469.f24614 = c94653;
                    c9469.f24613 = c94654;
                    c9469.f24612 = c9457;
                    c9469.f24611 = c94572;
                    c9469.f24618 = c94573;
                    c9469.f24617 = c94574;
                    c9469.f24621 = c9452;
                    c9469.f24622 = c94522;
                    c9469.f24619 = c94523;
                    c9469.f24620 = c94524;
                    interfaceC94642 = c9469;
                }
            } else if (drawable instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                try {
                    cornerRadii = gradientDrawable.getCornerRadii();
                } catch (NullPointerException unused) {
                    cornerRadii = null;
                }
                if (cornerRadii != null) {
                    C9465 c94655 = new C9465();
                    C9465 c94656 = new C9465();
                    C9465 c94657 = new C9465();
                    C9465 c94658 = new C9465();
                    C9452 c94525 = new C9452(i);
                    C9452 c94526 = new C9452(i);
                    C9452 c94527 = new C9452(i);
                    C9452 c94528 = new C9452(i);
                    C9457 c94575 = new C9457(Math.min(cornerRadii[0], cornerRadii[1]));
                    C9457 c94576 = new C9457(Math.min(cornerRadii[2], cornerRadii[3]));
                    C9457 c94577 = new C9457(Math.min(cornerRadii[4], cornerRadii[5]));
                    C9457 c94578 = new C9457(Math.min(cornerRadii[6], cornerRadii[7]));
                    c9469 = new C9469();
                    c9469.f24616 = c94655;
                    c9469.f24615 = c94656;
                    c9469.f24614 = c94657;
                    c9469.f24613 = c94658;
                    c9469.f24612 = c94575;
                    c9469.f24611 = c94576;
                    c9469.f24618 = c94577;
                    c9469.f24617 = c94578;
                    c9469.f24621 = c94525;
                    c9469.f24622 = c94526;
                    c9469.f24619 = c94527;
                    c9469.f24620 = c94528;
                    interfaceC94642 = c9469;
                } else {
                    try {
                        cornerRadius = gradientDrawable.getCornerRadius();
                    } catch (NullPointerException unused2) {
                        cornerRadius = -1.0f;
                    }
                    if (cornerRadius > 0.0f) {
                        C9465 c94659 = new C9465();
                        C9465 c946510 = new C9465();
                        C9465 c946511 = new C9465();
                        C9465 c946512 = new C9465();
                        C9452 c94529 = new C9452(i);
                        C9452 c945210 = new C9452(i);
                        C9452 c945211 = new C9452(i);
                        C9452 c945212 = new C9452(i);
                        C9457 c94579 = new C9457(cornerRadius);
                        C9457 c945710 = new C9457(cornerRadius);
                        C9457 c945711 = new C9457(cornerRadius);
                        C9457 c945712 = new C9457(cornerRadius);
                        C9469 c94692 = new C9469();
                        c94692.f24616 = c94659;
                        c94692.f24615 = c946510;
                        c94692.f24614 = c946511;
                        c94692.f24613 = c946512;
                        c94692.f24612 = c94579;
                        c94692.f24611 = c945710;
                        c94692.f24618 = c945711;
                        c94692.f24617 = c945712;
                        c94692.f24621 = c94529;
                        c94692.f24622 = c945210;
                        c94692.f24619 = c945211;
                        c94692.f24620 = c945212;
                        interfaceC94642 = c94692;
                    }
                }
            }
            if (interfaceC94642 != null) {
                m7713(interfaceC94642);
            } else {
                this.f10749 = -1.0f;
                this.f10746.reset();
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        C9481 c9481 = this.f10740;
        if (!c9481.f24701) {
            this.f10742 = false;
            return super.onStateChange(iArr);
        }
        boolean zStateSetMatches = StateSet.stateSetMatches(c9481.f24707, iArr);
        boolean z = this.f10742 != zStateSetMatches;
        this.f10742 = zStateSetMatches;
        if (z && iArr.length > 0 && !this.f10743) {
            ObjectAnimator objectAnimator = this.f10745;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.f10745 = null;
            }
            if (zStateSetMatches) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f10736, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(f10737);
                objectAnimatorOfFloat.addListener(new C1035(this, 5));
                this.f10745 = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
            } else {
                this.f10744 = 1.0f;
            }
        }
        this.f10743 = iArr.length == 0;
        return super.onStateChange(iArr) || z;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7710(Resources.Theme theme) {
        TypedValue typedValueM12599;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(AbstractC9490.f24791);
        int i = this.f10740.f24700;
        if (i != Integer.MIN_VALUE && (typedValueM12599 = AbstractC7390.m12599(theme, i)) != null) {
            C9481 c9481 = this.f10740;
            c9481.f24701 = typedValueM12599.data != 0;
            c9481.f24699 = true;
        }
        C9481 c94812 = this.f10740;
        if (!c94812.f24699) {
            c94812.f24701 = AbstractC7390.m12627(theme, C0328R.attr.focusRingsEnabled, c94812.f24701);
        }
        C9481 c94813 = this.f10740;
        if (c94813.f24701) {
            int color = c94813.f24698;
            int i2 = c94813.f24717;
            if (color == Integer.MIN_VALUE) {
                if (i2 != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    color = theme.resolveAttribute(i2, typedValue, true) ? typedValue.data : typedArrayObtainStyledAttributes.getColor(5, -16777216);
                }
            }
            c94813.f24698 = color;
            C9481 c94814 = this.f10740;
            int color2 = c94814.f24716;
            int i3 = c94814.f24720;
            if (color2 == Integer.MIN_VALUE) {
                if (i3 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    color2 = theme.resolveAttribute(i3, typedValue2, true) ? typedValue2.data : typedArrayObtainStyledAttributes.getColor(1, -1);
                }
            }
            c94814.f24716 = color2;
            C9481 c94815 = this.f10740;
            c94815.f24721 = m7707(c94815.f24721, theme, c94815.f24718, typedArrayObtainStyledAttributes, 6, C0328R.dimen.mtrl_focus_ring_outer_stroke_width);
            C9481 c94816 = this.f10740;
            c94816.f24719 = m7707(c94816.f24719, theme, c94816.f24711, typedArrayObtainStyledAttributes, 3, C0328R.dimen.mtrl_focus_ring_inner_stroke_width);
            C9481 c94817 = this.f10740;
            c94817.f24710 = m7707(c94817.f24710, theme, c94817.f24714, typedArrayObtainStyledAttributes, 7, 0);
            C9481 c94818 = this.f10740;
            c94818.f24715 = m7707(c94818.f24715, theme, c94818.f24712, typedArrayObtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.f10740.f24715)) {
                this.f10740.f24715 = 0.0f;
            }
            C9481 c94819 = this.f10740;
            c94819.f24713 = m7707(c94819.f24713, theme, c94819.f24705, typedArrayObtainStyledAttributes, 2, C0328R.dimen.mtrl_focus_ring_inner_stroke_inset);
            C9481 c948110 = this.f10740;
            int i4 = c948110.f24708;
            int[] iArr = AbstractC9490.f24756;
            if (i4 != Integer.MIN_VALUE) {
                c948110.f24704 = C9469.m14879(theme.obtainStyledAttributes(i4, iArr), new C9457(0.0f)).m14878();
            } else {
                int i5 = c948110.f24709;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = C0328R.attr.focusRingsShapeAppearance;
                }
                TypedValue typedValueM125992 = AbstractC7390.m12599(theme, i5);
                if (typedValueM125992 != null) {
                    this.f10740.f24704 = C9469.m14879(theme.obtainStyledAttributes(typedValueM125992.resourceId, iArr), new C9457(0.0f)).m14878();
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f10754;
        paint.setStyle(style);
        if (Float.isNaN(this.f10740.f24721)) {
            return;
        }
        paint.setStrokeWidth(this.f10740.f24721);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7711(Canvas canvas, Path path, float f, float f2, int i) {
        RectF rectF = this.f10752;
        m7712(rectF);
        float f3 = f * 2.0f;
        float fWidth = 1.0f - (f3 / rectF.width());
        float fHeight = 1.0f - (f3 / rectF.height());
        Matrix matrix = this.f10750;
        matrix.reset();
        matrix.postScale(fWidth, fHeight, rectF.centerX(), rectF.centerY());
        Path path2 = this.f10747;
        path.transform(matrix, path2);
        float f4 = f2 * this.f10744;
        Paint paint = this.f10754;
        paint.setStrokeWidth(f4);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7712(RectF rectF) {
        Rect rect = this.f10740.f24706;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        WeakReference weakReference = this.f10748;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((C9472) this.f10748.get()).getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        Rect rect2 = this.f10753;
        rippleDrawable.getHotspotBounds(rect2);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect2.inset(Math.max(0, (rect2.width() / 2) - radius), Math.max(0, (rect2.height() / 2) - radius));
        }
        rectF.set(rect2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m7713(InterfaceC9464 interfaceC9464) {
        RectF rectF = this.f10752;
        m7712(rectF);
        C9469 c9469Mo14853 = interfaceC9464.mo14853(f10738);
        boolean zM14883 = c9469Mo14853.m14883(rectF);
        Path path = this.f10746;
        if (!zM14883) {
            this.f10751.m14876(c9469Mo14853, null, 1.0f, rectF, null, path);
            this.f10749 = -1.0f;
            return;
        }
        C9481 c9481 = this.f10740;
        float f = ((c9481.f24721 / 2.0f) * this.f10744) + c9481.f24715;
        rectF.inset(f, f);
        this.f10749 = c9469Mo14853.f24612.mo14871(rectF);
        path.reset();
    }

    public FocusRingDrawable() {
        super(null);
        this.f10754 = new Paint(1);
        this.f10752 = new RectF();
        this.f10753 = new Rect();
        this.f10747 = new Path();
        this.f10746 = new Path();
        this.f10750 = new Matrix();
        this.f10751 = C9467.m14874();
        this.f10749 = -1.0f;
        this.f10744 = 1.0f;
        this.f10742 = false;
        this.f10741 = false;
        this.f10740 = new C9481(null);
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.f10754 = new Paint(1);
        this.f10752 = new RectF();
        this.f10753 = new Rect();
        this.f10747 = new Path();
        this.f10746 = new Path();
        this.f10750 = new Matrix();
        this.f10751 = C9467.m14874();
        this.f10749 = -1.0f;
        this.f10744 = 1.0f;
        this.f10742 = false;
        this.f10741 = false;
        C9481 c9481 = new C9481(null);
        this.f10740 = c9481;
        if (drawable != null) {
            c9481.f24703 = drawable.getConstantState();
        }
        m7710(context.getTheme());
    }

    public /* synthetic */ FocusRingDrawable(C9481 c9481, Resources resources, C9482 c9482) {
        this(c9481, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
