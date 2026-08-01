package com.lihang;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bsh.C2632;
import com.bumptech.glide.C3061;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.bumptech.glide.load.engine.C3012;
import com.bumptech.glide.load.resource.bitmap.C3020;
import com.bumptech.glide.load.resource.bitmap.C3041;
import com.bumptech.glide.request.C3048;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.bottomappbar.ViewOnLayoutChangeListenerC3089;
import p007.AbstractC6136;
import p274.AbstractC8349;
import p274.C8345;
import p274.C8348;
import p274.C8350;
import p274.ViewOnLayoutChangeListenerC8343;
import p274.ViewOnLayoutChangeListenerC8344;
import p274.ViewOnLayoutChangeListenerC8346;
import p286.C8391;
import p286.InterfaceC8398;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class ShadowLayout extends FrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public int f11750;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int f11751;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final int f11752;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final int f11753;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final int f11754;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final int f11755;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final Drawable f11756;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final int f11757;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final int f11758;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f11759;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final Drawable f11760;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final GradientDrawable f11761;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final int f11762;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final boolean f11763;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean f11764;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final boolean f11765;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final boolean f11766;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final float f11767;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final boolean f11768;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public View f11769;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final RectF f11770;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final int f11771;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final int f11772;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final int f11773;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final float f11774;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final float f11775;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final float f11776;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final float f11777;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final float f11778;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final float f11779;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f11780;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final float f11781;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Paint f11782;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public int f11783;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public int f11784;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public TextView f11785;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final int f11786;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final int f11787;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final Drawable f11788;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final Path f11789;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final Paint f11790;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public View.OnClickListener f11791;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final String f11792;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public final String f11793;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final int f11794;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public float f11795;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final float f11796;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public boolean f11797;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final int f11798;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final float f11799;

    public ShadowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f11770 = new RectF();
        this.f11759 = true;
        this.f11753 = -101;
        this.f11799 = -1.0f;
        this.f11796 = -1.0f;
        this.f11787 = -101;
        this.f11786 = -1;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC8349.f23029);
        this.f11758 = typedArrayObtainStyledAttributes.getInt(46, 1);
        if (m8107()) {
            this.f11794 = typedArrayObtainStyledAttributes.getColor(48, -101);
            this.f11799 = typedArrayObtainStyledAttributes.getDimension(52, -1.0f);
            float dimension = typedArrayObtainStyledAttributes.getDimension(51, -1.0f);
            this.f11796 = dimension;
            if (this.f11794 == -101) {
                C5919.m11247("shapeMode为MODE_DASHLINE,需设置stroke_color值");
                throw null;
            }
            float f = this.f11799;
            if (f == -1.0f) {
                C5919.m11247("shapeMode为MODE_DASHLINE,需设置stroke_dashWidth值");
                throw null;
            }
            if ((f == -1.0f && dimension != -1.0f) || (f != -1.0f && dimension == -1.0f)) {
                C5919.m11247("使用了虚线边框,必须设置以下2个属性：ShadowLayout_hl_stroke_dashWidth，ShadowLayout_hl_stroke_dashGap");
                throw null;
            }
            Paint paint = new Paint();
            this.f11790 = paint;
            paint.setAntiAlias(true);
            this.f11790.setColor(this.f11794);
            this.f11790.setStyle(Paint.Style.STROKE);
            this.f11790.setPathEffect(new DashPathEffect(new float[]{this.f11799, this.f11796}, 0.0f));
            this.f11789 = new Path();
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f11759 = !typedArrayObtainStyledAttributes.getBoolean(37, false);
            this.f11766 = !typedArrayObtainStyledAttributes.getBoolean(39, false);
            this.f11765 = !typedArrayObtainStyledAttributes.getBoolean(40, false);
            this.f11763 = !typedArrayObtainStyledAttributes.getBoolean(38, false);
            this.f11764 = !typedArrayObtainStyledAttributes.getBoolean(41, false);
            this.f11778 = typedArrayObtainStyledAttributes.getDimension(27, getResources().getDimension(R.dimen.dp_0));
            this.f11779 = typedArrayObtainStyledAttributes.getDimension(29, -1.0f);
            this.f11777 = typedArrayObtainStyledAttributes.getDimension(28, -1.0f);
            this.f11776 = typedArrayObtainStyledAttributes.getDimension(31, -1.0f);
            this.f11767 = typedArrayObtainStyledAttributes.getDimension(30, -1.0f);
            float dimension2 = typedArrayObtainStyledAttributes.getDimension(42, 0.0f);
            this.f11781 = dimension2;
            if (dimension2 == 0.0f) {
                this.f11759 = false;
            }
            this.f11775 = typedArrayObtainStyledAttributes.getDimension(43, 0.0f);
            this.f11774 = typedArrayObtainStyledAttributes.getDimension(44, 0.0f);
            this.f11780 = typedArrayObtainStyledAttributes.getColor(36, getResources().getColor(R.color.default_shadow_color));
            this.f11768 = typedArrayObtainStyledAttributes.getBoolean(45, true);
            this.f11757 = getResources().getColor(R.color.default_shadowback_color);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(33);
            if (drawable != null) {
                if (drawable instanceof ColorDrawable) {
                    this.f11757 = ((ColorDrawable) drawable).getColor();
                } else {
                    this.f11760 = drawable;
                }
            }
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(35);
            if (drawable2 != null) {
                if (drawable2 instanceof ColorDrawable) {
                    this.f11753 = ((ColorDrawable) drawable2).getColor();
                } else {
                    this.f11756 = drawable2;
                }
            }
            if (this.f11753 != -101 && this.f11760 != null) {
                C5919.m11247("使用了ShadowLayout_hl_layoutBackground_true属性，必须先设置ShadowLayout_hl_layoutBackground属性。且设置颜色时，必须保持都为颜色");
                throw null;
            }
            if (this.f11760 == null && this.f11756 != null) {
                C5919.m11247("使用了ShadowLayout_hl_layoutBackground_true属性，必须先设置ShadowLayout_hl_layoutBackground属性。且设置图片时，必须保持都为图片");
                throw null;
            }
            this.f11794 = typedArrayObtainStyledAttributes.getColor(48, -101);
            int color = typedArrayObtainStyledAttributes.getColor(49, -101);
            this.f11798 = color;
            if (this.f11794 == -101 && color != -101) {
                C5919.m11247("使用了ShadowLayout_hl_strokeColor_true属性，必须先设置ShadowLayout_hl_strokeColor属性");
                throw null;
            }
            this.f11795 = typedArrayObtainStyledAttributes.getDimension(50, (int) ((1.0f * getContext().getResources().getDisplayMetrics().density) + 0.5f));
            this.f11799 = typedArrayObtainStyledAttributes.getDimension(52, -1.0f);
            float dimension3 = typedArrayObtainStyledAttributes.getDimension(51, -1.0f);
            this.f11796 = dimension3;
            float f2 = this.f11799;
            if ((f2 == -1.0f && dimension3 != -1.0f) || (f2 != -1.0f && dimension3 == -1.0f)) {
                C5919.m11247("使用了虚线边框,必须设置以下2个属性：ShadowLayout_hl_stroke_dashWidth，ShadowLayout_hl_stroke_dashGap");
                throw null;
            }
            Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(34);
            if (drawable3 != null) {
                if (drawable3 instanceof ColorDrawable) {
                    this.f11787 = ((ColorDrawable) drawable3).getColor();
                } else {
                    this.f11788 = drawable3;
                }
            }
            this.f11752 = typedArrayObtainStyledAttributes.getColor(47, -101);
            this.f11755 = typedArrayObtainStyledAttributes.getColor(26, -101);
            int color2 = typedArrayObtainStyledAttributes.getColor(32, -101);
            this.f11754 = color2;
            if (this.f11752 != -101 && color2 == -101) {
                C5919.m11247("使用了ShadowLayout_hl_startColor渐变起始色，必须搭配终止色ShadowLayout_hl_endColor");
                throw null;
            }
            int i = typedArrayObtainStyledAttributes.getInt(24, 0);
            this.f11750 = i;
            if (i % 45 != 0) {
                C5919.m11249("Linear gradient requires 'angle' attribute to be a multiple of 45");
                throw null;
            }
            if (this.f11758 == 3) {
                if (this.f11757 == -101 || this.f11753 == -101) {
                    C2632.m5298("使用了ShadowLayout的水波纹，必须设置使用了ShadowLayout_hl_layoutBackground和使用了ShadowLayout_hl_layoutBackground_true属性，且为颜色值");
                    throw null;
                }
                if (this.f11760 != null) {
                    this.f11758 = 1;
                }
            }
            this.f11786 = typedArrayObtainStyledAttributes.getResourceId(25, -1);
            this.f11784 = typedArrayObtainStyledAttributes.getColor(54, -101);
            this.f11783 = typedArrayObtainStyledAttributes.getColor(55, -101);
            this.f11792 = typedArrayObtainStyledAttributes.getString(53);
            this.f11793 = typedArrayObtainStyledAttributes.getString(56);
            boolean z = typedArrayObtainStyledAttributes.getBoolean(13, true);
            this.f11797 = z;
            setClickable(z);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (m8107()) {
            return;
        }
        Paint paint2 = new Paint();
        this.f11782 = paint2;
        paint2.setAntiAlias(true);
        this.f11782.setStyle(Paint.Style.FILL);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f11761 = gradientDrawable;
        int i2 = this.f11757;
        gradientDrawable.setColors(new int[]{i2, i2});
        int i3 = this.f11794;
        if (i3 != -101) {
            this.f11751 = i3;
        }
        if (this.f11759) {
            float f3 = this.f11781;
            if (f3 > 0.0f) {
                if (this.f11768) {
                    int iAbs = (int) (Math.abs(this.f11775) + f3);
                    int iAbs2 = (int) (Math.abs(this.f11774) + this.f11781);
                    if (this.f11766) {
                        this.f11762 = iAbs;
                    } else {
                        this.f11762 = 0;
                    }
                    if (this.f11764) {
                        this.f11773 = iAbs2;
                    } else {
                        this.f11773 = 0;
                    }
                    if (this.f11765) {
                        this.f11772 = iAbs;
                    } else {
                        this.f11772 = 0;
                    }
                    if (this.f11763) {
                        this.f11771 = iAbs2;
                    } else {
                        this.f11771 = 0;
                    }
                } else {
                    float fAbs = Math.abs(this.f11774);
                    float f4 = this.f11781;
                    if (fAbs > f4) {
                        if (this.f11774 > 0.0f) {
                            this.f11774 = f4;
                        } else {
                            this.f11774 = 0.0f - f4;
                        }
                    }
                    float fAbs2 = Math.abs(this.f11775);
                    float f5 = this.f11781;
                    if (fAbs2 > f5) {
                        if (this.f11775 > 0.0f) {
                            this.f11775 = f5;
                        } else {
                            this.f11775 = 0.0f - f5;
                        }
                    }
                    if (this.f11764) {
                        this.f11773 = (int) (f5 - this.f11774);
                    } else {
                        this.f11773 = 0;
                    }
                    if (this.f11763) {
                        this.f11771 = (int) (this.f11774 + f5);
                    } else {
                        this.f11771 = 0;
                    }
                    if (this.f11765) {
                        this.f11772 = (int) (f5 - this.f11775);
                    } else {
                        this.f11772 = 0;
                    }
                    if (this.f11766) {
                        this.f11762 = (int) (f5 + this.f11775);
                    } else {
                        this.f11762 = 0;
                    }
                }
                setPadding(this.f11762, this.f11773, this.f11772, this.f11771);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f11770;
        int i = (int) (rectF.bottom - rectF.top);
        if (getChildAt(0) != null) {
            if (this.f11779 == -1.0f && this.f11777 == -1.0f && this.f11776 == -1.0f && this.f11767 == -1.0f) {
                float f = i / 2;
                float f2 = this.f11778;
                if (f2 > f) {
                    Path path = new Path();
                    path.addRoundRect(rectF, f, f, Path.Direction.CW);
                    canvas.clipPath(path);
                } else {
                    Path path2 = new Path();
                    path2.addRoundRect(rectF, f2, f2, Path.Direction.CW);
                    canvas.clipPath(path2);
                }
            } else {
                float[] fArrM8109 = m8109(i);
                Path path3 = new Path();
                path3.addRoundRect(this.f11762, this.f11773, getWidth() - this.f11772, getHeight() - this.f11771, fArrM8109, Path.Direction.CW);
                canvas.clipPath(path3);
            }
        }
        super.dispatchDraw(canvas);
    }

    public float getCornerRadius() {
        return this.f11778;
    }

    public float getShadowLimit() {
        return this.f11781;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (m8107()) {
            int width = getWidth();
            int height = getHeight();
            Paint paint = this.f11790;
            Path path = this.f11789;
            if (width > height) {
                paint.setStrokeWidth(height);
                path.reset();
                float f = height / 2;
                path.moveTo(0.0f, f);
                path.lineTo(width, f);
            } else {
                paint.setStrokeWidth(width);
                path.reset();
                float f2 = width / 2;
                path.moveTo(f2, 0.0f);
                path.lineTo(f2, height);
            }
            canvas.drawPath(path, paint);
            return;
        }
        float f3 = this.f11762;
        RectF rectF = this.f11770;
        rectF.left = f3;
        rectF.top = this.f11773;
        rectF.right = getWidth() - this.f11772;
        rectF.bottom = getHeight() - this.f11771;
        int i = (int) (rectF.bottom - rectF.top);
        int i2 = this.f11794;
        if (i2 != -101) {
            float f4 = i / 2;
            if (this.f11795 > f4) {
                this.f11795 = f4;
            }
        }
        if (this.f11760 == null && this.f11756 == null) {
            float[] fArrM8109 = m8109(i);
            int i3 = this.f11758;
            float f5 = this.f11796;
            float f6 = this.f11799;
            GradientDrawable gradientDrawable = this.f11761;
            if (i3 != 3) {
                gradientDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                if (i2 != -101) {
                    float f7 = this.f11795;
                    if (f6 != -1.0f) {
                        gradientDrawable.setStroke(Math.round(f7), this.f11751, f6, f5);
                    } else {
                        gradientDrawable.setStroke(Math.round(f7), this.f11751);
                    }
                }
                gradientDrawable.setCornerRadii(fArrM8109);
                gradientDrawable.draw(canvas);
                return;
            }
            int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_focused}, new int[]{android.R.attr.state_activated}, new int[0]};
            int i4 = this.f11757;
            int i5 = this.f11753;
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{i5, i5, i5, i4});
            RoundRectShape roundRectShape = new RoundRectShape(fArrM8109, null, null);
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            shapeDrawable.setShape(roundRectShape);
            shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
            if (i2 != -101) {
                float f8 = this.f11795;
                if (f6 != -1.0f) {
                    gradientDrawable.setStroke(Math.round(f8), this.f11751, f6, f5);
                } else {
                    gradientDrawable.setStroke(Math.round(f8), this.f11751);
                }
            }
            gradientDrawable.setCornerRadii(fArrM8109);
            if (this.f11752 != -101) {
                m8108(gradientDrawable);
            }
            this.f11769.setBackground(new RippleDrawable(colorStateList, gradientDrawable, shapeDrawable));
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (m8107()) {
            if (getChildAt(0) == null) {
                return;
            }
            C5919.m11247("shapeMode为MODE_DASHLINE，不支持子view");
            return;
        }
        int i = this.f11786;
        if (i != -1) {
            TextView textView = (TextView) findViewById(i);
            this.f11785 = textView;
            if (textView == null) {
                C2632.m5298("ShadowLayout找不到hl_bindTextView，请确保绑定的资源id在ShadowLayout内");
                return;
            }
            if (this.f11784 == -101) {
                this.f11784 = textView.getCurrentTextColor();
            }
            if (this.f11783 == -101) {
                this.f11783 = this.f11785.getCurrentTextColor();
            }
            this.f11785.setTextColor(this.f11784);
            if (!TextUtils.isEmpty(this.f11792)) {
                this.f11785.setText(this.f11792);
            }
        }
        this.f11769 = getChildAt(0);
        if (this.f11760 != null && this.f11759 && this.f11781 > 0.0f && getChildAt(0) == null) {
            C5919.m11247("使用了图片又加上阴影的情况下，必须加上子view才会生效!~");
            return;
        }
        if (this.f11769 == null) {
            this.f11769 = this;
            this.f11759 = false;
        }
        if (this.f11769 != null) {
            if (this.f11758 == 2) {
                m8106(this.f11760, "onFinishInflate");
                return;
            }
            if (this.f11797) {
                m8106(this.f11760, "onFinishInflate");
                return;
            }
            m8106(this.f11788, "onFinishInflate");
            int i2 = this.f11787;
            if (i2 != -101) {
                this.f11761.setColors(new int[]{i2, i2});
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Bitmap bitmap;
        float fMax;
        float f;
        float f2;
        float fMax2;
        super.onSizeChanged(i, i2, i3, i4);
        if (m8107()) {
            setBackgroundColor(Color.parseColor("#00000000"));
            return;
        }
        if (i <= 0 || i2 <= 0) {
            return;
        }
        if (this.f11759) {
            int i5 = this.f11780;
            if (Color.alpha(i5) == 255) {
                String hexString = Integer.toHexString(Color.red(i5));
                String hexString2 = Integer.toHexString(Color.green(i5));
                String hexString3 = Integer.toHexString(Color.blue(i5));
                if (hexString.length() == 1) {
                    hexString = "0".concat(hexString);
                }
                if (hexString2.length() == 1) {
                    hexString2 = "0".concat(hexString2);
                }
                if (hexString3.length() == 1) {
                    hexString3 = "0".concat(hexString3);
                }
                String strM11548 = AbstractC6136.m11548("#2a", hexString, hexString2, hexString3);
                if (!strM11548.startsWith("#")) {
                    strM11548 = "#".concat(strM11548);
                }
                this.f11780 = Color.parseColor(strM11548);
            }
            int i6 = this.f11780;
            float f3 = this.f11775 / 4.0f;
            float f4 = this.f11774 / 4.0f;
            int i7 = i / 4;
            if (i7 == 0) {
                i7 = 1;
            }
            int i8 = i2 / 4;
            if (i8 == 0) {
                i8 = 1;
            }
            float f5 = this.f11778;
            float f6 = f5 / 4.0f;
            float f7 = this.f11781 / 4.0f;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            boolean z = this.f11766;
            float f8 = this.f11777;
            float f9 = this.f11779;
            float fMax3 = z ? f7 : Math.max(Math.max(Math.max(f6, f9), Math.max(f6, f8)), f7) / 2.0f;
            boolean z2 = this.f11764;
            float f10 = this.f11776;
            if (z2) {
                bitmap = bitmapCreateBitmap;
                fMax = f7;
            } else {
                bitmap = bitmapCreateBitmap;
                fMax = Math.max(Math.max(Math.max(f6, f9), Math.max(f6, f10)), f7) / 2.0f;
            }
            boolean z3 = this.f11765;
            float f11 = this.f11767;
            if (z3) {
                fMax2 = i7 - f7;
                f2 = f10;
                f = f9;
            } else {
                f = f9;
                f2 = f10;
                fMax2 = i7 - (Math.max(Math.max(Math.max(f6, f10), Math.max(f6, f11)), f7) / 2.0f);
            }
            RectF rectF = new RectF(fMax3, fMax, fMax2, this.f11763 ? i8 - f7 : i8 - (Math.max(Math.max(Math.max(f6, f8), Math.max(f6, f11)), f7) / 2.0f));
            if (this.f11768) {
                if (f4 > 0.0f) {
                    rectF.top += f4;
                    rectF.bottom -= f4;
                } else if (f4 < 0.0f) {
                    rectF.top = Math.abs(f4) + rectF.top;
                    rectF.bottom -= Math.abs(f4);
                }
                if (f3 > 0.0f) {
                    rectF.left += f3;
                    rectF.right -= f3;
                } else if (f3 < 0.0f) {
                    rectF.left = Math.abs(f3) + rectF.left;
                    rectF.right -= Math.abs(f3);
                }
            } else {
                rectF.top -= f4;
                rectF.bottom -= f4;
                rectF.right -= f3;
                rectF.left -= f3;
            }
            Paint paint = this.f11782;
            paint.setColor(0);
            if (!isInEditMode()) {
                paint.setShadowLayer(f7 / 2.0f, f3, f4, i6);
            }
            if (f8 == -1.0f && f == -1.0f && f2 == -1.0f && f11 == -1.0f) {
                canvas.drawRoundRect(rectF, f6, f6, paint);
            } else {
                float f12 = this.f11762;
                RectF rectF2 = this.f11770;
                rectF2.left = f12;
                rectF2.top = this.f11773;
                rectF2.right = getWidth() - this.f11772;
                rectF2.bottom = getHeight() - this.f11771;
                paint.setAntiAlias(true);
                int i9 = f == -1.0f ? ((int) f5) / 4 : ((int) f) / 4;
                int i10 = f8 == -1.0f ? ((int) f5) / 4 : ((int) f8) / 4;
                float f13 = i9;
                float f14 = f2 == -1.0f ? ((int) f5) / 4 : ((int) f2) / 4;
                float f15 = f11 == -1.0f ? ((int) f5) / 4 : ((int) f11) / 4;
                float f16 = i10;
                float[] fArr = {f13, f13, f14, f14, f15, f15, f16, f16};
                Path path = new Path();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
            setBackground(new BitmapDrawable(bitmap));
        } else if (getChildAt(0) != null || (drawable = this.f11760) == null) {
            setBackgroundColor(Color.parseColor("#00000000"));
        } else {
            this.f11769 = this;
            if (this.f11797) {
                m8106(drawable, "setBackgroundCompat");
            } else {
                m8110();
            }
        }
        if (this.f11752 != -101) {
            m8108(this.f11761);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TextView textView;
        int i = this.f11758;
        if (i == 3) {
            if (this.f11797) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    TextView textView2 = this.f11785;
                    if (textView2 != null) {
                        textView2.setTextColor(this.f11783);
                        if (!TextUtils.isEmpty(this.f11793)) {
                            this.f11785.setText(this.f11793);
                        }
                    }
                } else if ((action == 1 || action == 3) && (textView = this.f11785) != null) {
                    textView.setTextColor(this.f11784);
                    if (!TextUtils.isEmpty(this.f11792)) {
                        this.f11785.setText(this.f11792);
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        if ((this.f11753 != -101 || this.f11798 != -101 || this.f11756 != null) && this.f11797 && i == 1) {
            int action2 = motionEvent.getAction();
            if (action2 == 0) {
                int i2 = this.f11753;
                if (i2 != -101) {
                    this.f11761.setColors(new int[]{i2, i2});
                }
                int i3 = this.f11798;
                if (i3 != -101) {
                    this.f11751 = i3;
                }
                Drawable drawable = this.f11756;
                if (drawable != null) {
                    m8106(drawable, "onTouchEvent");
                }
                postInvalidate();
                TextView textView3 = this.f11785;
                if (textView3 != null) {
                    textView3.setTextColor(this.f11783);
                    if (!TextUtils.isEmpty(this.f11793)) {
                        this.f11785.setText(this.f11793);
                    }
                }
            } else if (action2 == 1 || action2 == 3) {
                int i4 = this.f11757;
                this.f11761.setColors(new int[]{i4, i4});
                if (this.f11752 != -101) {
                    m8108(this.f11761);
                }
                int i5 = this.f11794;
                if (i5 != -101) {
                    this.f11751 = i5;
                }
                Drawable drawable2 = this.f11760;
                if (drawable2 != null) {
                    m8106(drawable2, "onTouchEvent");
                }
                postInvalidate();
                TextView textView4 = this.f11785;
                if (textView4 != null) {
                    textView4.setTextColor(this.f11784);
                    if (!TextUtils.isEmpty(this.f11792)) {
                        this.f11785.setText(this.f11792);
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        if (m8107()) {
            C2632.m5294("shapeMode为MODE_DASHLINE,不允许设置此属性");
            return;
        }
        super.setClickable(z);
        this.f11797 = z;
        m8110();
        if (this.f11797) {
            super.setOnClickListener(this.f11791);
        }
        GradientDrawable gradientDrawable = this.f11761;
        if (gradientDrawable == null || this.f11752 == -101 || this.f11754 == -101) {
            return;
        }
        m8108(gradientDrawable);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f11791 = onClickListener;
        if (this.f11797) {
            super.setOnClickListener(onClickListener);
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        if (getWidth() == 0) {
            addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC3089(this, 3));
            return;
        }
        if (this.f11758 == 2) {
            GradientDrawable gradientDrawable = this.f11761;
            if (z) {
                int i = this.f11753;
                if (i != -101) {
                    gradientDrawable.setColors(new int[]{i, i});
                }
                int i2 = this.f11798;
                if (i2 != -101) {
                    this.f11751 = i2;
                }
                Drawable drawable = this.f11756;
                if (drawable != null) {
                    m8106(drawable, "setSelected");
                }
                TextView textView = this.f11785;
                if (textView != null) {
                    textView.setTextColor(this.f11783);
                    String str = this.f11793;
                    if (!TextUtils.isEmpty(str)) {
                        this.f11785.setText(str);
                    }
                }
            } else {
                int i3 = this.f11757;
                gradientDrawable.setColors(new int[]{i3, i3});
                if (this.f11752 != -101) {
                    m8108(gradientDrawable);
                }
                int i4 = this.f11794;
                if (i4 != -101) {
                    this.f11751 = i4;
                }
                Drawable drawable2 = this.f11760;
                if (drawable2 != null) {
                    m8106(drawable2, "setSelected");
                }
                TextView textView2 = this.f11785;
                if (textView2 != null) {
                    textView2.setTextColor(this.f11784);
                    String str2 = this.f11792;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f11785.setText(str2);
                    }
                }
            }
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8106(Drawable drawable, String str) {
        this.f11769.setTag(R.id.action_container, str);
        View view = this.f11769;
        if (view == null || drawable == null) {
            return;
        }
        float f = this.f11779;
        float f2 = this.f11767;
        float f3 = this.f11776;
        float f4 = this.f11777;
        float f5 = this.f11778;
        if (f == -1.0f && f4 == -1.0f && f3 == -1.0f && f2 == -1.0f) {
            if (f5 == 0.0f) {
                view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC8346(view, drawable, str, 0));
                if (view.getMeasuredWidth() == 0 && view.getMeasuredHeight() == 0) {
                    return;
                }
                C3061 c3061 = (C3061) ((C3061) ComponentCallbacks2C3057.m6719(view).m6755(Drawable.class).m6741(drawable).mo6559((C3048) new C3048().m6556(C3012.f9580)).m6552(new C3041(), true)).m6566(view.getMeasuredWidth(), view.getMeasuredHeight());
                c3061.m6743(new C8345(view, 0), c3061);
                return;
            }
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC8344(view, drawable, f5, str));
            if (view.getMeasuredWidth() == 0 && view.getMeasuredHeight() == 0) {
                return;
            }
            C3061 c3061M6753 = ComponentCallbacks2C3057.m6719(view).m6753(drawable);
            InterfaceC8398[] interfaceC8398Arr = {new C3041(), new C3020((int) f5)};
            c3061M6753.getClass();
            C3061 c30612 = (C3061) ((C3061) c3061M6753.m6552(new C8391(interfaceC8398Arr), true)).m6566(view.getMeasuredWidth(), view.getMeasuredHeight());
            c30612.m6743(new C8345(view, 1), c30612);
            return;
        }
        int i = f == -1.0f ? (int) f5 : (int) f;
        float f6 = i;
        float f7 = f4 == -1.0f ? (int) f5 : (int) f4;
        float f8 = f3 == -1.0f ? (int) f5 : (int) f3;
        float f9 = f2 == -1.0f ? (int) f5 : (int) f2;
        if (f6 == 0.0f && f7 == 0.0f && f8 == 0.0f && f9 == 0.0f) {
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC8346(view, drawable, str, 1));
            if (view.getMeasuredWidth() == 0 && view.getMeasuredHeight() == 0) {
                return;
            }
            C3061 c30613 = (C3061) ComponentCallbacks2C3057.m6719(view).m6753(drawable).m6566(view.getMeasuredWidth(), view.getMeasuredHeight());
            c30613.m6743(new C8345(view, 2), c30613);
            return;
        }
        Context context = view.getContext();
        C8348 c8348 = new C8348();
        c8348.f23028 = ComponentCallbacks2C3057.m6722(context).f9765;
        c8348.f23027 = f6;
        c8348.f23026 = f7;
        c8348.f23025 = f8;
        c8348.f23024 = f9;
        view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC8343(view, drawable, c8348, str));
        if (view.getMeasuredWidth() == 0 && view.getMeasuredHeight() == 0) {
            return;
        }
        C3061 c30614 = (C3061) ((C3061) ComponentCallbacks2C3057.m6719(view).m6753(drawable).m6552(c8348, true)).m6566(view.getMeasuredWidth(), view.getMeasuredHeight());
        c30614.m6743(new C8350(str, view), c30614);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m8107() {
        return this.f11758 == 4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m8108(GradientDrawable gradientDrawable) {
        if (this.f11797) {
            int i = this.f11754;
            int i2 = this.f11755;
            int i3 = this.f11752;
            gradientDrawable.setColors(i2 == -101 ? new int[]{i3, i} : new int[]{i3, i2, i});
            int i4 = this.f11750;
            if (i4 < 0) {
                this.f11750 = (i4 % 360) + 360;
            }
            switch ((this.f11750 % 360) / 45) {
                case 0:
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                    break;
                case 1:
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
                    break;
                case 2:
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
                    break;
                case 3:
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.BR_TL);
                    break;
                case 4:
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
                    break;
                case 5:
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.TR_BL);
                    break;
                case 6:
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                    break;
                case 7:
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float[] m8109(int i) {
        float f = this.f11779;
        float f2 = this.f11778;
        int i2 = f == -1.0f ? (int) f2 : (int) f;
        int i3 = i / 2;
        if (i2 > i3) {
            i2 = i3;
        }
        float f3 = this.f11776;
        int i4 = f3 == -1.0f ? (int) f2 : (int) f3;
        if (i4 > i3) {
            i4 = i3;
        }
        float f4 = this.f11767;
        int i5 = f4 == -1.0f ? (int) f2 : (int) f4;
        if (i5 > i3) {
            i5 = i3;
        }
        float f5 = this.f11777;
        int i6 = f5 == -1.0f ? (int) f2 : (int) f5;
        if (i6 <= i3) {
            i3 = i6;
        }
        float f6 = i2;
        float f7 = i4;
        float f8 = i5;
        float f9 = i3;
        return new float[]{f6, f6, f7, f7, f8, f8, f9, f9};
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8110() {
        View view;
        if (this.f11758 != 1 || (view = this.f11769) == null) {
            return;
        }
        if (this.f11797) {
            Drawable drawable = this.f11760;
            if (drawable != null) {
                m8106(drawable, "changeSwitchClickable");
            } else if (view.getBackground() != null) {
                this.f11769.getBackground().setAlpha(0);
            }
            int i = this.f11757;
            this.f11761.setColors(new int[]{i, i});
            postInvalidate();
            return;
        }
        if (this.f11787 != -101) {
            if (this.f11760 != null) {
                view.getBackground().setAlpha(0);
            }
            int i2 = this.f11787;
            this.f11761.setColors(new int[]{i2, i2});
            postInvalidate();
            return;
        }
        Drawable drawable2 = this.f11788;
        if (drawable2 != null) {
            m8106(drawable2, "changeSwitchClickable");
            this.f11761.setColors(new int[]{Color.parseColor("#00000000"), Color.parseColor("#00000000")});
            postInvalidate();
        }
    }
}
