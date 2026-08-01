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
import p251.AbstractC8174;
import p305.C8631;
import p305.C8636;
import p305.C8644;
import p305.C8646;
import p305.C8648;
import p305.C8651;
import p305.InterfaceC8643;
import p309.C8660;
import p309.C8661;
import p314.AbstractC8669;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class FocusRingDrawable extends DrawableWrapper {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C8660 f10390;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f10391;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f10392;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f10393;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public float f10394;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public ObjectAnimator f10395;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Path f10396;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Path f10397;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public WeakReference f10398;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public float f10399;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Matrix f10400;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C8646 f10401;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final RectF f10402;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Rect f10403;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Paint f10404;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final ColorDrawable f10389 = new ColorDrawable(0);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final int[] f10388 = {R.attr.state_focused, R.attr.state_window_focused};

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final OvershootInterpolator f10387 = new OvershootInterpolator(4.0f);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final C8661 f10386 = new C8661("interpolation");

    private FocusRingDrawable(C8660 c8660, Resources resources) {
        super(null);
        Paint paint = new Paint(1);
        this.f10404 = paint;
        this.f10402 = new RectF();
        this.f10403 = new Rect();
        this.f10397 = new Path();
        this.f10396 = new Path();
        this.f10400 = new Matrix();
        this.f10401 = C8646.m14297();
        this.f10399 = -1.0f;
        this.f10394 = 1.0f;
        this.f10392 = false;
        this.f10391 = false;
        C8660 c86602 = new C8660(c8660);
        this.f10390 = c86602;
        Drawable.ConstantState constantState = c86602.f24367;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.f10390.f24385)) {
            return;
        }
        paint.setStrokeWidth(this.f10390.f24385);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static float m7161(float f, Resources.Theme theme, int i, TypedArray typedArray, int i2, int i3) {
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
    public static FocusRingDrawable m7162(Context context, LayerDrawable layerDrawable, C8651 c8651) {
        if (!AbstractC8174.m13596(context.getTheme(), com.davemorrissey.labs.subscaleview.R.attr.focusRingsEnabled, false)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, f10389);
        if (c8651 != null) {
            focusRingDrawable.f10398 = new WeakReference(c8651);
        }
        layerDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(layerDrawable);
        return focusRingDrawable;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m7163(TypedArray typedArray, int i) {
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
        m7164(theme);
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
        C8660 c8660 = this.f10390;
        if (c8660.f24367 == null) {
            return null;
        }
        c8660.f24366 = getChangingConfigurations();
        return this.f10390;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            if (super.hasFocusStateSpecified()) {
                return true;
            }
            return this.f10390.f24365;
        } catch (NoSuchMethodError unused) {
            return this.f10390.f24365;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = AbstractC8669.f24455;
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.f10390.f24364 = m7163(typedArrayObtainStyledAttributes, 0);
        if (this.f10390.f24364 == Integer.MIN_VALUE && typedArrayObtainStyledAttributes.hasValue(0)) {
            C8660 c8660 = this.f10390;
            c8660.f24365 = typedArrayObtainStyledAttributes.getBoolean(0, c8660.f24365);
            this.f10390.f24363 = true;
        }
        this.f10390.f24381 = m7163(typedArrayObtainStyledAttributes, 5);
        C8660 c86602 = this.f10390;
        if (c86602.f24381 == Integer.MIN_VALUE) {
            c86602.f24362 = typedArrayObtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.f10390.f24384 = m7163(typedArrayObtainStyledAttributes, 1);
        C8660 c86603 = this.f10390;
        if (c86603.f24384 == Integer.MIN_VALUE) {
            c86603.f24380 = typedArrayObtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.f10390.f24382 = m7163(typedArrayObtainStyledAttributes, 6);
        C8660 c86604 = this.f10390;
        if (c86604.f24382 == Integer.MIN_VALUE) {
            c86604.f24385 = typedArrayObtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.f10390.f24375 = m7163(typedArrayObtainStyledAttributes, 3);
        C8660 c86605 = this.f10390;
        if (c86605.f24375 == Integer.MIN_VALUE) {
            c86605.f24383 = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.f10390.f24375 = m7163(typedArrayObtainStyledAttributes, 3);
        C8660 c86606 = this.f10390;
        if (c86606.f24375 == Integer.MIN_VALUE) {
            c86606.f24383 = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.f10390.f24378 = m7163(typedArrayObtainStyledAttributes, 7);
        C8660 c86607 = this.f10390;
        if (c86607.f24378 == Integer.MIN_VALUE) {
            c86607.f24374 = typedArrayObtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.f10390.f24376 = m7163(typedArrayObtainStyledAttributes, 4);
        C8660 c86608 = this.f10390;
        if (c86608.f24376 == Integer.MIN_VALUE) {
            c86608.f24379 = typedArrayObtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.f10390.f24369 = m7163(typedArrayObtainStyledAttributes, 2);
        C8660 c86609 = this.f10390;
        if (c86609.f24369 == Integer.MIN_VALUE) {
            c86609.f24377 = typedArrayObtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.f10390.f24373 = m7163(typedArrayObtainStyledAttributes, 8);
        this.f10390.f24372 = typedArrayObtainStyledAttributes.getType(8) == 1 ? typedArrayObtainStyledAttributes.getResourceId(8, Integer.MIN_VALUE) : Integer.MIN_VALUE;
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
            this.f10390.f24367 = drawableCreateFromXmlInner.getConstantState();
        } else {
            ColorDrawable colorDrawable = f10389;
            setDrawable(colorDrawable);
            this.f10390.f24367 = colorDrawable.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.isProjected();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.f10390.f24365;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.f10395;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.f10395 = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f10391 && super.mutate() == this) {
            this.f10390 = new C8660(this.f10390);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.f10390.f24367 = drawable.getConstantState();
            }
            this.f10391 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float[] cornerRadii;
        float cornerRadius;
        C8648 c8648;
        super.onBoundsChange(rect);
        C8660 c8660 = this.f10390;
        if (c8660.f24365) {
            InterfaceC8643 interfaceC8643 = c8660.f24368;
            if (interfaceC8643 != null) {
                m7167(interfaceC8643);
                return;
            }
            Drawable drawable = getDrawable();
            int i = 0;
            InterfaceC8643 interfaceC86432 = null;
            if (drawable instanceof ShapeDrawable) {
                Outline outline = new Outline();
                ((ShapeDrawable) drawable).getOutline(outline);
                if (outline.getRadius() > 0.0f) {
                    C8644 c8644 = new C8644();
                    C8644 c86442 = new C8644();
                    C8644 c86443 = new C8644();
                    C8644 c86444 = new C8644();
                    C8631 c8631 = new C8631(i);
                    C8631 c86312 = new C8631(i);
                    C8631 c86313 = new C8631(i);
                    C8631 c86314 = new C8631(i);
                    float radius = outline.getRadius();
                    C8636 c8636 = new C8636(radius);
                    C8636 c86362 = new C8636(radius);
                    C8636 c86363 = new C8636(radius);
                    C8636 c86364 = new C8636(radius);
                    c8648 = new C8648();
                    c8648.f24280 = c8644;
                    c8648.f24279 = c86442;
                    c8648.f24278 = c86443;
                    c8648.f24277 = c86444;
                    c8648.f24276 = c8636;
                    c8648.f24275 = c86362;
                    c8648.f24282 = c86363;
                    c8648.f24281 = c86364;
                    c8648.f24285 = c8631;
                    c8648.f24286 = c86312;
                    c8648.f24283 = c86313;
                    c8648.f24284 = c86314;
                    interfaceC86432 = c8648;
                }
            } else if (drawable instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                try {
                    cornerRadii = gradientDrawable.getCornerRadii();
                } catch (NullPointerException unused) {
                    cornerRadii = null;
                }
                if (cornerRadii != null) {
                    C8644 c86445 = new C8644();
                    C8644 c86446 = new C8644();
                    C8644 c86447 = new C8644();
                    C8644 c86448 = new C8644();
                    C8631 c86315 = new C8631(i);
                    C8631 c86316 = new C8631(i);
                    C8631 c86317 = new C8631(i);
                    C8631 c86318 = new C8631(i);
                    C8636 c86365 = new C8636(Math.min(cornerRadii[0], cornerRadii[1]));
                    C8636 c86366 = new C8636(Math.min(cornerRadii[2], cornerRadii[3]));
                    C8636 c86367 = new C8636(Math.min(cornerRadii[4], cornerRadii[5]));
                    C8636 c86368 = new C8636(Math.min(cornerRadii[6], cornerRadii[7]));
                    c8648 = new C8648();
                    c8648.f24280 = c86445;
                    c8648.f24279 = c86446;
                    c8648.f24278 = c86447;
                    c8648.f24277 = c86448;
                    c8648.f24276 = c86365;
                    c8648.f24275 = c86366;
                    c8648.f24282 = c86367;
                    c8648.f24281 = c86368;
                    c8648.f24285 = c86315;
                    c8648.f24286 = c86316;
                    c8648.f24283 = c86317;
                    c8648.f24284 = c86318;
                    interfaceC86432 = c8648;
                } else {
                    try {
                        cornerRadius = gradientDrawable.getCornerRadius();
                    } catch (NullPointerException unused2) {
                        cornerRadius = -1.0f;
                    }
                    if (cornerRadius > 0.0f) {
                        C8644 c86449 = new C8644();
                        C8644 c864410 = new C8644();
                        C8644 c864411 = new C8644();
                        C8644 c864412 = new C8644();
                        C8631 c86319 = new C8631(i);
                        C8631 c863110 = new C8631(i);
                        C8631 c863111 = new C8631(i);
                        C8631 c863112 = new C8631(i);
                        C8636 c86369 = new C8636(cornerRadius);
                        C8636 c863610 = new C8636(cornerRadius);
                        C8636 c863611 = new C8636(cornerRadius);
                        C8636 c863612 = new C8636(cornerRadius);
                        C8648 c86482 = new C8648();
                        c86482.f24280 = c86449;
                        c86482.f24279 = c864410;
                        c86482.f24278 = c864411;
                        c86482.f24277 = c864412;
                        c86482.f24276 = c86369;
                        c86482.f24275 = c863610;
                        c86482.f24282 = c863611;
                        c86482.f24281 = c863612;
                        c86482.f24285 = c86319;
                        c86482.f24286 = c863110;
                        c86482.f24283 = c863111;
                        c86482.f24284 = c863112;
                        interfaceC86432 = c86482;
                    }
                }
            }
            if (interfaceC86432 != null) {
                m7167(interfaceC86432);
            } else {
                this.f10399 = -1.0f;
                this.f10396.reset();
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        C8660 c8660 = this.f10390;
        if (!c8660.f24365) {
            this.f10392 = false;
            return super.onStateChange(iArr);
        }
        boolean zStateSetMatches = StateSet.stateSetMatches(c8660.f24371, iArr);
        boolean z = this.f10392 != zStateSetMatches;
        this.f10392 = zStateSetMatches;
        if (z && iArr.length > 0 && !this.f10393) {
            ObjectAnimator objectAnimator = this.f10395;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.f10395 = null;
            }
            if (zStateSetMatches) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f10386, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(f10387);
                objectAnimatorOfFloat.addListener(new C0188(this, 5));
                this.f10395 = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
            } else {
                this.f10394 = 1.0f;
            }
        }
        this.f10393 = iArr.length == 0;
        return super.onStateChange(iArr) || z;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7164(android.content.res.Resources.Theme r9) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.focus.FocusRingDrawable.m7164(android.content.res.Resources$Theme):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7165(Canvas canvas, Path path, float f, float f2, int i) {
        RectF rectF = this.f10402;
        m7166(rectF);
        float f3 = f * 2.0f;
        float fWidth = 1.0f - (f3 / rectF.width());
        float fHeight = 1.0f - (f3 / rectF.height());
        Matrix matrix = this.f10400;
        matrix.reset();
        matrix.postScale(fWidth, fHeight, rectF.centerX(), rectF.centerY());
        Path path2 = this.f10397;
        path.transform(matrix, path2);
        float f4 = f2 * this.f10394;
        Paint paint = this.f10404;
        paint.setStrokeWidth(f4);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7166(RectF rectF) {
        Rect rect = this.f10390.f24370;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        WeakReference weakReference = this.f10398;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((C8651) this.f10398.get()).getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        Rect rect2 = this.f10403;
        rippleDrawable.getHotspotBounds(rect2);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect2.inset(Math.max(0, (rect2.width() / 2) - radius), Math.max(0, (rect2.height() / 2) - radius));
        }
        rectF.set(rect2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m7167(InterfaceC8643 interfaceC8643) {
        RectF rectF = this.f10402;
        m7166(rectF);
        C8648 c8648Mo14275 = interfaceC8643.mo14275(f10388);
        boolean zM14306 = c8648Mo14275.m14306(rectF);
        Path path = this.f10396;
        if (!zM14306) {
            this.f10401.m14299(c8648Mo14275, null, 1.0f, rectF, null, path);
            this.f10399 = -1.0f;
            return;
        }
        C8660 c8660 = this.f10390;
        float f = ((c8660.f24385 / 2.0f) * this.f10394) + c8660.f24379;
        rectF.inset(f, f);
        this.f10399 = c8648Mo14275.f24276.mo14294(rectF);
        path.reset();
    }

    public FocusRingDrawable() {
        super(null);
        this.f10404 = new Paint(1);
        this.f10402 = new RectF();
        this.f10403 = new Rect();
        this.f10397 = new Path();
        this.f10396 = new Path();
        this.f10400 = new Matrix();
        this.f10401 = C8646.m14297();
        this.f10399 = -1.0f;
        this.f10394 = 1.0f;
        this.f10392 = false;
        this.f10391 = false;
        this.f10390 = new C8660(null);
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.f10404 = new Paint(1);
        this.f10402 = new RectF();
        this.f10403 = new Rect();
        this.f10397 = new Path();
        this.f10396 = new Path();
        this.f10400 = new Matrix();
        this.f10401 = C8646.m14297();
        this.f10399 = -1.0f;
        this.f10394 = 1.0f;
        this.f10392 = false;
        this.f10391 = false;
        C8660 c8660 = new C8660(null);
        this.f10390 = c8660;
        if (drawable != null) {
            c8660.f24367 = drawable.getConstantState();
        }
        m7164(context.getTheme());
    }

    public /* synthetic */ FocusRingDrawable(C8660 c8660, Resources resources, C8661 c8661) {
        this(c8660, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
