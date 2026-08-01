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
import androidx.appcompat.widget.C0188;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p053.AbstractC6561;
import p305.C8623;
import p305.C8628;
import p305.C8636;
import p305.C8638;
import p305.C8640;
import p305.C8643;
import p305.InterfaceC8635;
import p309.C8652;
import p309.C8653;
import p314.AbstractC8661;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class FocusRingDrawable extends DrawableWrapper {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C8652 f10395;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f10396;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f10397;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f10398;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public float f10399;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public ObjectAnimator f10400;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Path f10401;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Path f10402;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public WeakReference f10403;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public float f10404;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Matrix f10405;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C8638 f10406;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final RectF f10407;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Rect f10408;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Paint f10409;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final ColorDrawable f10394 = new ColorDrawable(0);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final int[] f10393 = {R.attr.state_focused, R.attr.state_window_focused};

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final OvershootInterpolator f10392 = new OvershootInterpolator(4.0f);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final C8653 f10391 = new C8653("interpolation");

    private FocusRingDrawable(C8652 c8652, Resources resources) {
        super(null);
        Paint paint = new Paint(1);
        this.f10409 = paint;
        this.f10407 = new RectF();
        this.f10408 = new Rect();
        this.f10402 = new Path();
        this.f10401 = new Path();
        this.f10405 = new Matrix();
        this.f10406 = C8638.m14315();
        this.f10404 = -1.0f;
        this.f10399 = 1.0f;
        this.f10397 = false;
        this.f10396 = false;
        C8652 c86522 = new C8652(c8652);
        this.f10395 = c86522;
        Drawable.ConstantState constantState = c86522.f24358;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.f10395.f24376)) {
            return;
        }
        paint.setStrokeWidth(this.f10395.f24376);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static float m7148(float f, Resources.Theme theme, int i, TypedArray typedArray, int i2, int i3) {
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
    public static FocusRingDrawable m7149(Context context, LayerDrawable layerDrawable, C8643 c8643) {
        if (!AbstractC6561.m12068(context.getTheme(), com.davemorrissey.labs.subscaleview.R.attr.focusRingsEnabled, false)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, f10394);
        if (c8643 != null) {
            focusRingDrawable.f10403 = new WeakReference(c8643);
        }
        layerDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(layerDrawable);
        return focusRingDrawable;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m7150(TypedArray typedArray, int i) {
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
        m7151(theme);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.focus.FocusRingDrawable.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        C8652 c8652 = this.f10395;
        if (c8652.f24358 == null) {
            return null;
        }
        c8652.f24357 = getChangingConfigurations();
        return this.f10395;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            if (super.hasFocusStateSpecified()) {
                return true;
            }
            return this.f10395.f24356;
        } catch (NoSuchMethodError unused) {
            return this.f10395.f24356;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = AbstractC8661.f24446;
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.f10395.f24355 = m7150(typedArrayObtainStyledAttributes, 0);
        if (this.f10395.f24355 == Integer.MIN_VALUE && typedArrayObtainStyledAttributes.hasValue(0)) {
            C8652 c8652 = this.f10395;
            c8652.f24356 = typedArrayObtainStyledAttributes.getBoolean(0, c8652.f24356);
            this.f10395.f24354 = true;
        }
        this.f10395.f24372 = m7150(typedArrayObtainStyledAttributes, 5);
        C8652 c86522 = this.f10395;
        if (c86522.f24372 == Integer.MIN_VALUE) {
            c86522.f24353 = typedArrayObtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.f10395.f24375 = m7150(typedArrayObtainStyledAttributes, 1);
        C8652 c86523 = this.f10395;
        if (c86523.f24375 == Integer.MIN_VALUE) {
            c86523.f24371 = typedArrayObtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.f10395.f24373 = m7150(typedArrayObtainStyledAttributes, 6);
        C8652 c86524 = this.f10395;
        if (c86524.f24373 == Integer.MIN_VALUE) {
            c86524.f24376 = typedArrayObtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.f10395.f24366 = m7150(typedArrayObtainStyledAttributes, 3);
        C8652 c86525 = this.f10395;
        if (c86525.f24366 == Integer.MIN_VALUE) {
            c86525.f24374 = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.f10395.f24366 = m7150(typedArrayObtainStyledAttributes, 3);
        C8652 c86526 = this.f10395;
        if (c86526.f24366 == Integer.MIN_VALUE) {
            c86526.f24374 = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.f10395.f24369 = m7150(typedArrayObtainStyledAttributes, 7);
        C8652 c86527 = this.f10395;
        if (c86527.f24369 == Integer.MIN_VALUE) {
            c86527.f24365 = typedArrayObtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.f10395.f24367 = m7150(typedArrayObtainStyledAttributes, 4);
        C8652 c86528 = this.f10395;
        if (c86528.f24367 == Integer.MIN_VALUE) {
            c86528.f24370 = typedArrayObtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.f10395.f24360 = m7150(typedArrayObtainStyledAttributes, 2);
        C8652 c86529 = this.f10395;
        if (c86529.f24360 == Integer.MIN_VALUE) {
            c86529.f24368 = typedArrayObtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.f10395.f24364 = m7150(typedArrayObtainStyledAttributes, 8);
        this.f10395.f24363 = typedArrayObtainStyledAttributes.getType(8) == 1 ? typedArrayObtainStyledAttributes.getResourceId(8, Integer.MIN_VALUE) : Integer.MIN_VALUE;
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
            this.f10395.f24358 = drawableCreateFromXmlInner.getConstantState();
        } else {
            ColorDrawable colorDrawable = f10394;
            setDrawable(colorDrawable);
            this.f10395.f24358 = colorDrawable.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.isProjected();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.f10395.f24356;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.f10400;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.f10400 = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f10396 && super.mutate() == this) {
            this.f10395 = new C8652(this.f10395);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.f10395.f24358 = drawable.getConstantState();
            }
            this.f10396 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float[] cornerRadii;
        float cornerRadius;
        C8640 c8640;
        super.onBoundsChange(rect);
        C8652 c8652 = this.f10395;
        if (c8652.f24356) {
            InterfaceC8635 interfaceC8635 = c8652.f24359;
            if (interfaceC8635 != null) {
                m7154(interfaceC8635);
                return;
            }
            Drawable drawable = getDrawable();
            int i = 0;
            InterfaceC8635 interfaceC86352 = null;
            if (drawable instanceof ShapeDrawable) {
                Outline outline = new Outline();
                ((ShapeDrawable) drawable).getOutline(outline);
                if (outline.getRadius() > 0.0f) {
                    C8636 c8636 = new C8636();
                    C8636 c86362 = new C8636();
                    C8636 c86363 = new C8636();
                    C8636 c86364 = new C8636();
                    C8623 c8623 = new C8623(i);
                    C8623 c86232 = new C8623(i);
                    C8623 c86233 = new C8623(i);
                    C8623 c86234 = new C8623(i);
                    float radius = outline.getRadius();
                    C8628 c8628 = new C8628(radius);
                    C8628 c86282 = new C8628(radius);
                    C8628 c86283 = new C8628(radius);
                    C8628 c86284 = new C8628(radius);
                    c8640 = new C8640();
                    c8640.f24271 = c8636;
                    c8640.f24270 = c86362;
                    c8640.f24269 = c86363;
                    c8640.f24268 = c86364;
                    c8640.f24267 = c8628;
                    c8640.f24266 = c86282;
                    c8640.f24273 = c86283;
                    c8640.f24272 = c86284;
                    c8640.f24276 = c8623;
                    c8640.f24277 = c86232;
                    c8640.f24274 = c86233;
                    c8640.f24275 = c86234;
                    interfaceC86352 = c8640;
                }
            } else if (drawable instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                try {
                    cornerRadii = gradientDrawable.getCornerRadii();
                } catch (NullPointerException unused) {
                    cornerRadii = null;
                }
                if (cornerRadii != null) {
                    C8636 c86365 = new C8636();
                    C8636 c86366 = new C8636();
                    C8636 c86367 = new C8636();
                    C8636 c86368 = new C8636();
                    C8623 c86235 = new C8623(i);
                    C8623 c86236 = new C8623(i);
                    C8623 c86237 = new C8623(i);
                    C8623 c86238 = new C8623(i);
                    C8628 c86285 = new C8628(Math.min(cornerRadii[0], cornerRadii[1]));
                    C8628 c86286 = new C8628(Math.min(cornerRadii[2], cornerRadii[3]));
                    C8628 c86287 = new C8628(Math.min(cornerRadii[4], cornerRadii[5]));
                    C8628 c86288 = new C8628(Math.min(cornerRadii[6], cornerRadii[7]));
                    c8640 = new C8640();
                    c8640.f24271 = c86365;
                    c8640.f24270 = c86366;
                    c8640.f24269 = c86367;
                    c8640.f24268 = c86368;
                    c8640.f24267 = c86285;
                    c8640.f24266 = c86286;
                    c8640.f24273 = c86287;
                    c8640.f24272 = c86288;
                    c8640.f24276 = c86235;
                    c8640.f24277 = c86236;
                    c8640.f24274 = c86237;
                    c8640.f24275 = c86238;
                    interfaceC86352 = c8640;
                } else {
                    try {
                        cornerRadius = gradientDrawable.getCornerRadius();
                    } catch (NullPointerException unused2) {
                        cornerRadius = -1.0f;
                    }
                    if (cornerRadius > 0.0f) {
                        C8636 c86369 = new C8636();
                        C8636 c863610 = new C8636();
                        C8636 c863611 = new C8636();
                        C8636 c863612 = new C8636();
                        C8623 c86239 = new C8623(i);
                        C8623 c862310 = new C8623(i);
                        C8623 c862311 = new C8623(i);
                        C8623 c862312 = new C8623(i);
                        C8628 c86289 = new C8628(cornerRadius);
                        C8628 c862810 = new C8628(cornerRadius);
                        C8628 c862811 = new C8628(cornerRadius);
                        C8628 c862812 = new C8628(cornerRadius);
                        C8640 c86402 = new C8640();
                        c86402.f24271 = c86369;
                        c86402.f24270 = c863610;
                        c86402.f24269 = c863611;
                        c86402.f24268 = c863612;
                        c86402.f24267 = c86289;
                        c86402.f24266 = c862810;
                        c86402.f24273 = c862811;
                        c86402.f24272 = c862812;
                        c86402.f24276 = c86239;
                        c86402.f24277 = c862310;
                        c86402.f24274 = c862311;
                        c86402.f24275 = c862312;
                        interfaceC86352 = c86402;
                    }
                }
            }
            if (interfaceC86352 != null) {
                m7154(interfaceC86352);
            } else {
                this.f10404 = -1.0f;
                this.f10401.reset();
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        C8652 c8652 = this.f10395;
        if (!c8652.f24356) {
            this.f10397 = false;
            return super.onStateChange(iArr);
        }
        boolean zStateSetMatches = StateSet.stateSetMatches(c8652.f24362, iArr);
        boolean z = this.f10397 != zStateSetMatches;
        this.f10397 = zStateSetMatches;
        if (z && iArr.length > 0 && !this.f10398) {
            ObjectAnimator objectAnimator = this.f10400;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.f10400 = null;
            }
            if (zStateSetMatches) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f10391, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(f10392);
                objectAnimatorOfFloat.addListener(new C0188(this, 5));
                this.f10400 = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
            } else {
                this.f10399 = 1.0f;
            }
        }
        this.f10398 = iArr.length == 0;
        return super.onStateChange(iArr) || z;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7151(android.content.res.Resources.Theme r9) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.focus.FocusRingDrawable.m7151(android.content.res.Resources$Theme):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7152(Canvas canvas, Path path, float f, float f2, int i) {
        RectF rectF = this.f10407;
        m7153(rectF);
        float f3 = f * 2.0f;
        float fWidth = 1.0f - (f3 / rectF.width());
        float fHeight = 1.0f - (f3 / rectF.height());
        Matrix matrix = this.f10405;
        matrix.reset();
        matrix.postScale(fWidth, fHeight, rectF.centerX(), rectF.centerY());
        Path path2 = this.f10402;
        path.transform(matrix, path2);
        float f4 = f2 * this.f10399;
        Paint paint = this.f10409;
        paint.setStrokeWidth(f4);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7153(RectF rectF) {
        Rect rect = this.f10395.f24361;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        WeakReference weakReference = this.f10403;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((C8643) this.f10403.get()).getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        Rect rect2 = this.f10408;
        rippleDrawable.getHotspotBounds(rect2);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect2.inset(Math.max(0, (rect2.width() / 2) - radius), Math.max(0, (rect2.height() / 2) - radius));
        }
        rectF.set(rect2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m7154(InterfaceC8635 interfaceC8635) {
        RectF rectF = this.f10407;
        m7153(rectF);
        C8640 c8640Mo14294 = interfaceC8635.mo14294(f10393);
        boolean zM14324 = c8640Mo14294.m14324(rectF);
        Path path = this.f10401;
        if (!zM14324) {
            this.f10406.m14317(c8640Mo14294, null, 1.0f, rectF, null, path);
            this.f10404 = -1.0f;
            return;
        }
        C8652 c8652 = this.f10395;
        float f = ((c8652.f24376 / 2.0f) * this.f10399) + c8652.f24370;
        rectF.inset(f, f);
        this.f10404 = c8640Mo14294.f24267.mo14312(rectF);
        path.reset();
    }

    public FocusRingDrawable() {
        super(null);
        this.f10409 = new Paint(1);
        this.f10407 = new RectF();
        this.f10408 = new Rect();
        this.f10402 = new Path();
        this.f10401 = new Path();
        this.f10405 = new Matrix();
        this.f10406 = C8638.m14315();
        this.f10404 = -1.0f;
        this.f10399 = 1.0f;
        this.f10397 = false;
        this.f10396 = false;
        this.f10395 = new C8652(null);
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.f10409 = new Paint(1);
        this.f10407 = new RectF();
        this.f10408 = new Rect();
        this.f10402 = new Path();
        this.f10401 = new Path();
        this.f10405 = new Matrix();
        this.f10406 = C8638.m14315();
        this.f10404 = -1.0f;
        this.f10399 = 1.0f;
        this.f10397 = false;
        this.f10396 = false;
        C8652 c8652 = new C8652(null);
        this.f10395 = c8652;
        if (drawable != null) {
            c8652.f24358 = drawable.getConstantState();
        }
        m7151(context.getTheme());
    }

    public /* synthetic */ FocusRingDrawable(C8652 c8652, Resources resources, C8653 c8653) {
        this(c8652, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
