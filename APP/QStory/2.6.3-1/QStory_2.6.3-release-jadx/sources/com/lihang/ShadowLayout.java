package com.lihang;

import android.R;
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
import bsh.C3466;
import com.bumptech.glide.C3894;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.bumptech.glide.load.engine.C3845;
import com.bumptech.glide.load.resource.bitmap.C3853;
import com.bumptech.glide.load.resource.bitmap.C3874;
import com.bumptech.glide.request.C3881;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.bottomappbar.ViewOnLayoutChangeListenerC3922;
import p025.AbstractC7012;
import p290.AbstractC9179;
import p290.C9175;
import p290.C9178;
import p290.C9180;
import p290.ViewOnLayoutChangeListenerC9173;
import p290.ViewOnLayoutChangeListenerC9174;
import p290.ViewOnLayoutChangeListenerC9176;
import p302.C9221;
import p302.InterfaceC9228;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ShadowLayout extends FrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public int f12100;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int f12101;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final int f12102;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final int f12103;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final int f12104;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final int f12105;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final Drawable f12106;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final int f12107;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final int f12108;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f12109;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final Drawable f12110;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final GradientDrawable f12111;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final int f12112;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final boolean f12113;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean f12114;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final boolean f12115;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final boolean f12116;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final float f12117;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final boolean f12118;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public View f12119;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final RectF f12120;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final int f12121;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final int f12122;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final int f12123;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final float f12124;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final float f12125;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final float f12126;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final float f12127;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final float f12128;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final float f12129;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f12130;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final float f12131;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Paint f12132;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public int f12133;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public int f12134;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public TextView f12135;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final int f12136;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final int f12137;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final Drawable f12138;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final Path f12139;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final Paint f12140;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public View.OnClickListener f12141;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final String f12142;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public final String f12143;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final int f12144;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public float f12145;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final float f12146;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public boolean f12147;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final int f12148;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final float f12149;

    public ShadowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f12120 = new RectF();
        this.f12109 = true;
        this.f12103 = -101;
        this.f12149 = -1.0f;
        this.f12146 = -1.0f;
        this.f12137 = -101;
        this.f12136 = -1;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC9179.f23373);
        this.f12108 = typedArrayObtainStyledAttributes.getInt(46, 1);
        if (m8653()) {
            this.f12144 = typedArrayObtainStyledAttributes.getColor(48, -101);
            this.f12149 = typedArrayObtainStyledAttributes.getDimension(52, -1.0f);
            float dimension = typedArrayObtainStyledAttributes.getDimension(51, -1.0f);
            this.f12146 = dimension;
            if (this.f12144 == -101) {
                C6755.m11867("shapeMode为MODE_DASHLINE,需设置stroke_color值");
                throw null;
            }
            float f = this.f12149;
            if (f == -1.0f) {
                C6755.m11867("shapeMode为MODE_DASHLINE,需设置stroke_dashWidth值");
                throw null;
            }
            if ((f == -1.0f && dimension != -1.0f) || (f != -1.0f && dimension == -1.0f)) {
                C6755.m11867("使用了虚线边框,必须设置以下2个属性：ShadowLayout_hl_stroke_dashWidth，ShadowLayout_hl_stroke_dashGap");
                throw null;
            }
            Paint paint = new Paint();
            this.f12140 = paint;
            paint.setAntiAlias(true);
            this.f12140.setColor(this.f12144);
            this.f12140.setStyle(Paint.Style.STROKE);
            this.f12140.setPathEffect(new DashPathEffect(new float[]{this.f12149, this.f12146}, 0.0f));
            this.f12139 = new Path();
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f12109 = !typedArrayObtainStyledAttributes.getBoolean(37, false);
            this.f12116 = !typedArrayObtainStyledAttributes.getBoolean(39, false);
            this.f12115 = !typedArrayObtainStyledAttributes.getBoolean(40, false);
            this.f12113 = !typedArrayObtainStyledAttributes.getBoolean(38, false);
            this.f12114 = !typedArrayObtainStyledAttributes.getBoolean(41, false);
            this.f12128 = typedArrayObtainStyledAttributes.getDimension(27, getResources().getDimension(C0328R.dimen.dp_0));
            this.f12129 = typedArrayObtainStyledAttributes.getDimension(29, -1.0f);
            this.f12127 = typedArrayObtainStyledAttributes.getDimension(28, -1.0f);
            this.f12126 = typedArrayObtainStyledAttributes.getDimension(31, -1.0f);
            this.f12117 = typedArrayObtainStyledAttributes.getDimension(30, -1.0f);
            float dimension2 = typedArrayObtainStyledAttributes.getDimension(42, 0.0f);
            this.f12131 = dimension2;
            if (dimension2 == 0.0f) {
                this.f12109 = false;
            }
            this.f12125 = typedArrayObtainStyledAttributes.getDimension(43, 0.0f);
            this.f12124 = typedArrayObtainStyledAttributes.getDimension(44, 0.0f);
            this.f12130 = typedArrayObtainStyledAttributes.getColor(36, getResources().getColor(C0328R.color.default_shadow_color));
            this.f12118 = typedArrayObtainStyledAttributes.getBoolean(45, true);
            this.f12107 = getResources().getColor(C0328R.color.default_shadowback_color);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(33);
            if (drawable != null) {
                if (drawable instanceof ColorDrawable) {
                    this.f12107 = ((ColorDrawable) drawable).getColor();
                } else {
                    this.f12110 = drawable;
                }
            }
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(35);
            if (drawable2 != null) {
                if (drawable2 instanceof ColorDrawable) {
                    this.f12103 = ((ColorDrawable) drawable2).getColor();
                } else {
                    this.f12106 = drawable2;
                }
            }
            if (this.f12103 != -101 && this.f12110 != null) {
                C6755.m11867("使用了ShadowLayout_hl_layoutBackground_true属性，必须先设置ShadowLayout_hl_layoutBackground属性。且设置颜色时，必须保持都为颜色");
                throw null;
            }
            if (this.f12110 == null && this.f12106 != null) {
                C6755.m11867("使用了ShadowLayout_hl_layoutBackground_true属性，必须先设置ShadowLayout_hl_layoutBackground属性。且设置图片时，必须保持都为图片");
                throw null;
            }
            this.f12144 = typedArrayObtainStyledAttributes.getColor(48, -101);
            int color = typedArrayObtainStyledAttributes.getColor(49, -101);
            this.f12148 = color;
            if (this.f12144 == -101 && color != -101) {
                C6755.m11867("使用了ShadowLayout_hl_strokeColor_true属性，必须先设置ShadowLayout_hl_strokeColor属性");
                throw null;
            }
            this.f12145 = typedArrayObtainStyledAttributes.getDimension(50, (int) ((1.0f * getContext().getResources().getDisplayMetrics().density) + 0.5f));
            this.f12149 = typedArrayObtainStyledAttributes.getDimension(52, -1.0f);
            float dimension3 = typedArrayObtainStyledAttributes.getDimension(51, -1.0f);
            this.f12146 = dimension3;
            float f2 = this.f12149;
            if ((f2 == -1.0f && dimension3 != -1.0f) || (f2 != -1.0f && dimension3 == -1.0f)) {
                C6755.m11867("使用了虚线边框,必须设置以下2个属性：ShadowLayout_hl_stroke_dashWidth，ShadowLayout_hl_stroke_dashGap");
                throw null;
            }
            Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(34);
            if (drawable3 != null) {
                if (drawable3 instanceof ColorDrawable) {
                    this.f12137 = ((ColorDrawable) drawable3).getColor();
                } else {
                    this.f12138 = drawable3;
                }
            }
            this.f12102 = typedArrayObtainStyledAttributes.getColor(47, -101);
            this.f12105 = typedArrayObtainStyledAttributes.getColor(26, -101);
            int color2 = typedArrayObtainStyledAttributes.getColor(32, -101);
            this.f12104 = color2;
            if (this.f12102 != -101 && color2 == -101) {
                C6755.m11867("使用了ShadowLayout_hl_startColor渐变起始色，必须搭配终止色ShadowLayout_hl_endColor");
                throw null;
            }
            int i = typedArrayObtainStyledAttributes.getInt(24, 0);
            this.f12100 = i;
            if (i % 45 != 0) {
                C6755.m11869("Linear gradient requires 'angle' attribute to be a multiple of 45");
                throw null;
            }
            if (this.f12108 == 3) {
                if (this.f12107 == -101 || this.f12103 == -101) {
                    C3466.m5903("使用了ShadowLayout的水波纹，必须设置使用了ShadowLayout_hl_layoutBackground和使用了ShadowLayout_hl_layoutBackground_true属性，且为颜色值");
                    throw null;
                }
                if (this.f12110 != null) {
                    this.f12108 = 1;
                }
            }
            this.f12136 = typedArrayObtainStyledAttributes.getResourceId(25, -1);
            this.f12134 = typedArrayObtainStyledAttributes.getColor(54, -101);
            this.f12133 = typedArrayObtainStyledAttributes.getColor(55, -101);
            this.f12142 = typedArrayObtainStyledAttributes.getString(53);
            this.f12143 = typedArrayObtainStyledAttributes.getString(56);
            boolean z = typedArrayObtainStyledAttributes.getBoolean(13, true);
            this.f12147 = z;
            setClickable(z);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (m8653()) {
            return;
        }
        Paint paint2 = new Paint();
        this.f12132 = paint2;
        paint2.setAntiAlias(true);
        this.f12132.setStyle(Paint.Style.FILL);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f12111 = gradientDrawable;
        int i2 = this.f12107;
        gradientDrawable.setColors(new int[]{i2, i2});
        int i3 = this.f12144;
        if (i3 != -101) {
            this.f12101 = i3;
        }
        if (this.f12109) {
            float f3 = this.f12131;
            if (f3 > 0.0f) {
                if (this.f12118) {
                    int iAbs = (int) (Math.abs(this.f12125) + f3);
                    int iAbs2 = (int) (Math.abs(this.f12124) + this.f12131);
                    if (this.f12116) {
                        this.f12112 = iAbs;
                    } else {
                        this.f12112 = 0;
                    }
                    if (this.f12114) {
                        this.f12123 = iAbs2;
                    } else {
                        this.f12123 = 0;
                    }
                    if (this.f12115) {
                        this.f12122 = iAbs;
                    } else {
                        this.f12122 = 0;
                    }
                    if (this.f12113) {
                        this.f12121 = iAbs2;
                    } else {
                        this.f12121 = 0;
                    }
                } else {
                    float fAbs = Math.abs(this.f12124);
                    float f4 = this.f12131;
                    if (fAbs > f4) {
                        if (this.f12124 > 0.0f) {
                            this.f12124 = f4;
                        } else {
                            this.f12124 = 0.0f - f4;
                        }
                    }
                    float fAbs2 = Math.abs(this.f12125);
                    float f5 = this.f12131;
                    if (fAbs2 > f5) {
                        if (this.f12125 > 0.0f) {
                            this.f12125 = f5;
                        } else {
                            this.f12125 = 0.0f - f5;
                        }
                    }
                    if (this.f12114) {
                        this.f12123 = (int) (f5 - this.f12124);
                    } else {
                        this.f12123 = 0;
                    }
                    if (this.f12113) {
                        this.f12121 = (int) (this.f12124 + f5);
                    } else {
                        this.f12121 = 0;
                    }
                    if (this.f12115) {
                        this.f12122 = (int) (f5 - this.f12125);
                    } else {
                        this.f12122 = 0;
                    }
                    if (this.f12116) {
                        this.f12112 = (int) (f5 + this.f12125);
                    } else {
                        this.f12112 = 0;
                    }
                }
                setPadding(this.f12112, this.f12123, this.f12122, this.f12121);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f12120;
        int i = (int) (rectF.bottom - rectF.top);
        if (getChildAt(0) != null) {
            if (this.f12129 == -1.0f && this.f12127 == -1.0f && this.f12126 == -1.0f && this.f12117 == -1.0f) {
                float f = i / 2;
                float f2 = this.f12128;
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
                float[] fArrM8655 = m8655(i);
                Path path3 = new Path();
                path3.addRoundRect(this.f12112, this.f12123, getWidth() - this.f12122, getHeight() - this.f12121, fArrM8655, Path.Direction.CW);
                canvas.clipPath(path3);
            }
        }
        super.dispatchDraw(canvas);
    }

    public float getCornerRadius() {
        return this.f12128;
    }

    public float getShadowLimit() {
        return this.f12131;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (m8653()) {
            int width = getWidth();
            int height = getHeight();
            Paint paint = this.f12140;
            Path path = this.f12139;
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
        float f3 = this.f12112;
        RectF rectF = this.f12120;
        rectF.left = f3;
        rectF.top = this.f12123;
        rectF.right = getWidth() - this.f12122;
        rectF.bottom = getHeight() - this.f12121;
        int i = (int) (rectF.bottom - rectF.top);
        int i2 = this.f12144;
        if (i2 != -101) {
            float f4 = i / 2;
            if (this.f12145 > f4) {
                this.f12145 = f4;
            }
        }
        if (this.f12110 == null && this.f12106 == null) {
            float[] fArrM8655 = m8655(i);
            int i3 = this.f12108;
            float f5 = this.f12146;
            float f6 = this.f12149;
            GradientDrawable gradientDrawable = this.f12111;
            if (i3 != 3) {
                gradientDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                if (i2 != -101) {
                    float f7 = this.f12145;
                    if (f6 != -1.0f) {
                        gradientDrawable.setStroke(Math.round(f7), this.f12101, f6, f5);
                    } else {
                        gradientDrawable.setStroke(Math.round(f7), this.f12101);
                    }
                }
                gradientDrawable.setCornerRadii(fArrM8655);
                gradientDrawable.draw(canvas);
                return;
            }
            int[][] iArr = {new int[]{R.attr.state_pressed}, new int[]{R.attr.state_focused}, new int[]{R.attr.state_activated}, new int[0]};
            int i4 = this.f12107;
            int i5 = this.f12103;
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{i5, i5, i5, i4});
            RoundRectShape roundRectShape = new RoundRectShape(fArrM8655, null, null);
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            shapeDrawable.setShape(roundRectShape);
            shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
            if (i2 != -101) {
                float f8 = this.f12145;
                if (f6 != -1.0f) {
                    gradientDrawable.setStroke(Math.round(f8), this.f12101, f6, f5);
                } else {
                    gradientDrawable.setStroke(Math.round(f8), this.f12101);
                }
            }
            gradientDrawable.setCornerRadii(fArrM8655);
            if (this.f12102 != -101) {
                m8654(gradientDrawable);
            }
            this.f12119.setBackground(new RippleDrawable(colorStateList, gradientDrawable, shapeDrawable));
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (m8653()) {
            if (getChildAt(0) == null) {
                return;
            }
            C6755.m11867("shapeMode为MODE_DASHLINE，不支持子view");
            return;
        }
        int i = this.f12136;
        if (i != -1) {
            TextView textView = (TextView) findViewById(i);
            this.f12135 = textView;
            if (textView == null) {
                C3466.m5903("ShadowLayout找不到hl_bindTextView，请确保绑定的资源id在ShadowLayout内");
                return;
            }
            if (this.f12134 == -101) {
                this.f12134 = textView.getCurrentTextColor();
            }
            if (this.f12133 == -101) {
                this.f12133 = this.f12135.getCurrentTextColor();
            }
            this.f12135.setTextColor(this.f12134);
            if (!TextUtils.isEmpty(this.f12142)) {
                this.f12135.setText(this.f12142);
            }
        }
        this.f12119 = getChildAt(0);
        if (this.f12110 != null && this.f12109 && this.f12131 > 0.0f && getChildAt(0) == null) {
            C6755.m11867("使用了图片又加上阴影的情况下，必须加上子view才会生效!~");
            return;
        }
        if (this.f12119 == null) {
            this.f12119 = this;
            this.f12109 = false;
        }
        if (this.f12119 != null) {
            if (this.f12108 == 2) {
                m8652(this.f12110, "onFinishInflate");
                return;
            }
            if (this.f12147) {
                m8652(this.f12110, "onFinishInflate");
                return;
            }
            m8652(this.f12138, "onFinishInflate");
            int i2 = this.f12137;
            if (i2 != -101) {
                this.f12111.setColors(new int[]{i2, i2});
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
        if (m8653()) {
            setBackgroundColor(Color.parseColor("#00000000"));
            return;
        }
        if (i <= 0 || i2 <= 0) {
            return;
        }
        if (this.f12109) {
            int i5 = this.f12130;
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
                String strM12140 = AbstractC7012.m12140("#2a", hexString, hexString2, hexString3);
                if (!strM12140.startsWith("#")) {
                    strM12140 = "#".concat(strM12140);
                }
                this.f12130 = Color.parseColor(strM12140);
            }
            int i6 = this.f12130;
            float f3 = this.f12125 / 4.0f;
            float f4 = this.f12124 / 4.0f;
            int i7 = i / 4;
            if (i7 == 0) {
                i7 = 1;
            }
            int i8 = i2 / 4;
            if (i8 == 0) {
                i8 = 1;
            }
            float f5 = this.f12128;
            float f6 = f5 / 4.0f;
            float f7 = this.f12131 / 4.0f;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            boolean z = this.f12116;
            float f8 = this.f12127;
            float f9 = this.f12129;
            float fMax3 = z ? f7 : Math.max(Math.max(Math.max(f6, f9), Math.max(f6, f8)), f7) / 2.0f;
            boolean z2 = this.f12114;
            float f10 = this.f12126;
            if (z2) {
                bitmap = bitmapCreateBitmap;
                fMax = f7;
            } else {
                bitmap = bitmapCreateBitmap;
                fMax = Math.max(Math.max(Math.max(f6, f9), Math.max(f6, f10)), f7) / 2.0f;
            }
            boolean z3 = this.f12115;
            float f11 = this.f12117;
            if (z3) {
                fMax2 = i7 - f7;
                f2 = f10;
                f = f9;
            } else {
                f = f9;
                f2 = f10;
                fMax2 = i7 - (Math.max(Math.max(Math.max(f6, f10), Math.max(f6, f11)), f7) / 2.0f);
            }
            RectF rectF = new RectF(fMax3, fMax, fMax2, this.f12113 ? i8 - f7 : i8 - (Math.max(Math.max(Math.max(f6, f8), Math.max(f6, f11)), f7) / 2.0f));
            if (this.f12118) {
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
            Paint paint = this.f12132;
            paint.setColor(0);
            if (!isInEditMode()) {
                paint.setShadowLayer(f7 / 2.0f, f3, f4, i6);
            }
            if (f8 == -1.0f && f == -1.0f && f2 == -1.0f && f11 == -1.0f) {
                canvas.drawRoundRect(rectF, f6, f6, paint);
            } else {
                float f12 = this.f12112;
                RectF rectF2 = this.f12120;
                rectF2.left = f12;
                rectF2.top = this.f12123;
                rectF2.right = getWidth() - this.f12122;
                rectF2.bottom = getHeight() - this.f12121;
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
        } else if (getChildAt(0) != null || (drawable = this.f12110) == null) {
            setBackgroundColor(Color.parseColor("#00000000"));
        } else {
            this.f12119 = this;
            if (this.f12147) {
                m8652(drawable, "setBackgroundCompat");
            } else {
                m8656();
            }
        }
        if (this.f12102 != -101) {
            m8654(this.f12111);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TextView textView;
        int i = this.f12108;
        if (i == 3) {
            if (this.f12147) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    TextView textView2 = this.f12135;
                    if (textView2 != null) {
                        textView2.setTextColor(this.f12133);
                        if (!TextUtils.isEmpty(this.f12143)) {
                            this.f12135.setText(this.f12143);
                        }
                    }
                } else if ((action == 1 || action == 3) && (textView = this.f12135) != null) {
                    textView.setTextColor(this.f12134);
                    if (!TextUtils.isEmpty(this.f12142)) {
                        this.f12135.setText(this.f12142);
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        if ((this.f12103 != -101 || this.f12148 != -101 || this.f12106 != null) && this.f12147 && i == 1) {
            int action2 = motionEvent.getAction();
            if (action2 == 0) {
                int i2 = this.f12103;
                if (i2 != -101) {
                    this.f12111.setColors(new int[]{i2, i2});
                }
                int i3 = this.f12148;
                if (i3 != -101) {
                    this.f12101 = i3;
                }
                Drawable drawable = this.f12106;
                if (drawable != null) {
                    m8652(drawable, "onTouchEvent");
                }
                postInvalidate();
                TextView textView3 = this.f12135;
                if (textView3 != null) {
                    textView3.setTextColor(this.f12133);
                    if (!TextUtils.isEmpty(this.f12143)) {
                        this.f12135.setText(this.f12143);
                    }
                }
            } else if (action2 == 1 || action2 == 3) {
                int i4 = this.f12107;
                this.f12111.setColors(new int[]{i4, i4});
                if (this.f12102 != -101) {
                    m8654(this.f12111);
                }
                int i5 = this.f12144;
                if (i5 != -101) {
                    this.f12101 = i5;
                }
                Drawable drawable2 = this.f12110;
                if (drawable2 != null) {
                    m8652(drawable2, "onTouchEvent");
                }
                postInvalidate();
                TextView textView4 = this.f12135;
                if (textView4 != null) {
                    textView4.setTextColor(this.f12134);
                    if (!TextUtils.isEmpty(this.f12142)) {
                        this.f12135.setText(this.f12142);
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        if (m8653()) {
            C3466.m5899("shapeMode为MODE_DASHLINE,不允许设置此属性");
            return;
        }
        super.setClickable(z);
        this.f12147 = z;
        m8656();
        if (this.f12147) {
            super.setOnClickListener(this.f12141);
        }
        GradientDrawable gradientDrawable = this.f12111;
        if (gradientDrawable == null || this.f12102 == -101 || this.f12104 == -101) {
            return;
        }
        m8654(gradientDrawable);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f12141 = onClickListener;
        if (this.f12147) {
            super.setOnClickListener(onClickListener);
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        if (getWidth() == 0) {
            addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC3922(this, 3));
            return;
        }
        if (this.f12108 == 2) {
            GradientDrawable gradientDrawable = this.f12111;
            if (z) {
                int i = this.f12103;
                if (i != -101) {
                    gradientDrawable.setColors(new int[]{i, i});
                }
                int i2 = this.f12148;
                if (i2 != -101) {
                    this.f12101 = i2;
                }
                Drawable drawable = this.f12106;
                if (drawable != null) {
                    m8652(drawable, "setSelected");
                }
                TextView textView = this.f12135;
                if (textView != null) {
                    textView.setTextColor(this.f12133);
                    String str = this.f12143;
                    if (!TextUtils.isEmpty(str)) {
                        this.f12135.setText(str);
                    }
                }
            } else {
                int i3 = this.f12107;
                gradientDrawable.setColors(new int[]{i3, i3});
                if (this.f12102 != -101) {
                    m8654(gradientDrawable);
                }
                int i4 = this.f12144;
                if (i4 != -101) {
                    this.f12101 = i4;
                }
                Drawable drawable2 = this.f12110;
                if (drawable2 != null) {
                    m8652(drawable2, "setSelected");
                }
                TextView textView2 = this.f12135;
                if (textView2 != null) {
                    textView2.setTextColor(this.f12134);
                    String str2 = this.f12142;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f12135.setText(str2);
                    }
                }
            }
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8652(Drawable drawable, String str) {
        this.f12119.setTag(C0328R.id.action_container, str);
        View view = this.f12119;
        if (view == null || drawable == null) {
            return;
        }
        float f = this.f12129;
        float f2 = this.f12117;
        float f3 = this.f12126;
        float f4 = this.f12127;
        float f5 = this.f12128;
        int i = 1;
        if (f == -1.0f && f4 == -1.0f && f3 == -1.0f && f2 == -1.0f) {
            int i2 = 0;
            if (f5 == 0.0f) {
                view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC9176(view, drawable, str, i2));
                if (view.getMeasuredWidth() == 0 && view.getMeasuredHeight() == 0) {
                    return;
                }
                C3894 c3894 = (C3894) ((C3894) ComponentCallbacks2C3890.m7324(view).m7360(Drawable.class).m7346(drawable).mo7179((C3881) new C3881().m7176(C3845.f9927)).m7172(new C3874(), true)).m7186(view.getMeasuredWidth(), view.getMeasuredHeight());
                c3894.m7348(new C9175(view, 0), c3894);
                return;
            }
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC9174(view, drawable, f5, str));
            if (view.getMeasuredWidth() == 0 && view.getMeasuredHeight() == 0) {
                return;
            }
            C3894 c3894M7358 = ComponentCallbacks2C3890.m7324(view).m7358(drawable);
            InterfaceC9228[] interfaceC9228Arr = {new C3874(), new C3853((int) f5)};
            c3894M7358.getClass();
            C3894 c38942 = (C3894) ((C3894) c3894M7358.m7172(new C9221(interfaceC9228Arr), true)).m7186(view.getMeasuredWidth(), view.getMeasuredHeight());
            c38942.m7348(new C9175(view, 1), c38942);
            return;
        }
        int i3 = f == -1.0f ? (int) f5 : (int) f;
        float f6 = i3;
        float f7 = f4 == -1.0f ? (int) f5 : (int) f4;
        float f8 = f3 == -1.0f ? (int) f5 : (int) f3;
        float f9 = f2 == -1.0f ? (int) f5 : (int) f2;
        if (f6 == 0.0f && f7 == 0.0f && f8 == 0.0f && f9 == 0.0f) {
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC9176(view, drawable, str, i));
            if (view.getMeasuredWidth() == 0 && view.getMeasuredHeight() == 0) {
                return;
            }
            C3894 c38943 = (C3894) ComponentCallbacks2C3890.m7324(view).m7358(drawable).m7186(view.getMeasuredWidth(), view.getMeasuredHeight());
            c38943.m7348(new C9175(view, 2), c38943);
            return;
        }
        Context context = view.getContext();
        C9178 c9178 = new C9178();
        c9178.f23372 = ComponentCallbacks2C3890.m7327(context).f10119;
        c9178.f23371 = f6;
        c9178.f23370 = f7;
        c9178.f23369 = f8;
        c9178.f23368 = f9;
        view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC9173(view, drawable, c9178, str));
        if (view.getMeasuredWidth() == 0 && view.getMeasuredHeight() == 0) {
            return;
        }
        C3894 c38944 = (C3894) ((C3894) ComponentCallbacks2C3890.m7324(view).m7358(drawable).m7172(c9178, true)).m7186(view.getMeasuredWidth(), view.getMeasuredHeight());
        c38944.m7348(new C9180(str, view), c38944);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m8653() {
        return this.f12108 == 4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m8654(GradientDrawable gradientDrawable) {
        if (this.f12147) {
            int i = this.f12104;
            int i2 = this.f12105;
            int i3 = this.f12102;
            gradientDrawable.setColors(i2 == -101 ? new int[]{i3, i} : new int[]{i3, i2, i});
            int i4 = this.f12100;
            if (i4 < 0) {
                this.f12100 = (i4 % 360) + 360;
            }
            switch ((this.f12100 % 360) / 45) {
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
    public final float[] m8655(int i) {
        float f = this.f12129;
        float f2 = this.f12128;
        int i2 = f == -1.0f ? (int) f2 : (int) f;
        int i3 = i / 2;
        if (i2 > i3) {
            i2 = i3;
        }
        float f3 = this.f12126;
        int i4 = f3 == -1.0f ? (int) f2 : (int) f3;
        if (i4 > i3) {
            i4 = i3;
        }
        float f4 = this.f12117;
        int i5 = f4 == -1.0f ? (int) f2 : (int) f4;
        if (i5 > i3) {
            i5 = i3;
        }
        float f5 = this.f12127;
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
    public final void m8656() {
        View view;
        if (this.f12108 != 1 || (view = this.f12119) == null) {
            return;
        }
        if (this.f12147) {
            Drawable drawable = this.f12110;
            if (drawable != null) {
                m8652(drawable, "changeSwitchClickable");
            } else if (view.getBackground() != null) {
                this.f12119.getBackground().setAlpha(0);
            }
            int i = this.f12107;
            this.f12111.setColors(new int[]{i, i});
            postInvalidate();
            return;
        }
        if (this.f12137 != -101) {
            if (this.f12110 != null) {
                view.getBackground().setAlpha(0);
            }
            int i2 = this.f12137;
            this.f12111.setColors(new int[]{i2, i2});
            postInvalidate();
            return;
        }
        Drawable drawable2 = this.f12138;
        if (drawable2 != null) {
            m8652(drawable2, "changeSwitchClickable");
            this.f12111.setColors(new int[]{Color.parseColor("#00000000"), Color.parseColor("#00000000")});
            postInvalidate();
        }
    }
}
