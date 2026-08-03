package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorMatrix;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import p000.AbstractC0639Ou;
import p000.AbstractC1406fG;
import p000.C0520M3;
import p000.C1146al;
import p000.C1226bl;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterView extends C0520M3 {

    /* JADX INFO: renamed from: d */
    public final C1226bl f3854d;

    /* JADX INFO: renamed from: e */
    public boolean f3855e;

    /* JADX INFO: renamed from: f */
    public Drawable f3856f;

    /* JADX INFO: renamed from: g */
    public Drawable f3857g;

    /* JADX INFO: renamed from: h */
    public float f3858h;

    /* JADX INFO: renamed from: i */
    public float f3859i;

    /* JADX INFO: renamed from: j */
    public float f3860j;

    /* JADX INFO: renamed from: k */
    public Path f3861k;

    /* JADX INFO: renamed from: l */
    public ViewOutlineProvider f3862l;

    /* JADX INFO: renamed from: m */
    public RectF f3863m;

    /* JADX INFO: renamed from: n */
    public final Drawable[] f3864n;

    /* JADX INFO: renamed from: o */
    public LayerDrawable f3865o;

    /* JADX INFO: renamed from: p */
    public float f3866p;

    /* JADX INFO: renamed from: q */
    public float f3867q;

    /* JADX INFO: renamed from: r */
    public float f3868r;

    /* JADX INFO: renamed from: s */
    public float f3869s;

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C1226bl c1226bl = new C1226bl();
        c1226bl.f4183a = new float[20];
        c1226bl.f4184b = new ColorMatrix();
        c1226bl.f4185c = new ColorMatrix();
        c1226bl.f4186d = 1.0f;
        c1226bl.f4187e = 1.0f;
        c1226bl.f4188f = 1.0f;
        c1226bl.f4189g = 1.0f;
        this.f3854d = c1226bl;
        this.f3855e = true;
        this.f3856f = null;
        this.f3857g = null;
        this.f3858h = 0.0f;
        this.f3859i = 0.0f;
        this.f3860j = Float.NaN;
        Drawable[] drawableArr = new Drawable[2];
        this.f3864n = drawableArr;
        this.f3866p = Float.NaN;
        this.f3867q = Float.NaN;
        this.f3868r = Float.NaN;
        this.f3869s = Float.NaN;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0639Ou.f2038e);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.f3856f = typedArrayObtainStyledAttributes.getDrawable(0);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 4) {
                    this.f3858h = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == 13) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 12) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 3) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 2) {
                    setBrightness(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 10) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 11) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 9) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f3855e));
                } else if (index == 5) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.f3866p));
                } else if (index == 6) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.f3867q));
                } else if (index == 7) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.f3869s));
                } else if (index == 8) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.f3868r));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f3857g = drawable;
            if (this.f3856f == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f3857g = drawable2;
                if (drawable2 != null) {
                    Drawable drawableMutate = drawable2.mutate();
                    this.f3857g = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable drawableMutate2 = getDrawable().mutate();
            this.f3857g = drawableMutate2;
            drawableArr[0] = drawableMutate2;
            drawableArr[1] = this.f3856f.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            this.f3865o = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f3858h * 255.0f));
            if (!this.f3855e) {
                this.f3865o.getDrawable(0).setAlpha((int) ((1.0f - this.f3858h) * 255.0f));
            }
            super.setImageDrawable(this.f3865o);
        }
    }

    private void setOverlay(boolean z) {
        this.f3855e = z;
    }

    /* JADX INFO: renamed from: c */
    public final void m2121c() {
        if (Float.isNaN(this.f3866p) && Float.isNaN(this.f3867q) && Float.isNaN(this.f3868r) && Float.isNaN(this.f3869s)) {
            return;
        }
        float f = Float.isNaN(this.f3866p) ? 0.0f : this.f3866p;
        float f2 = Float.isNaN(this.f3867q) ? 0.0f : this.f3867q;
        float f3 = Float.isNaN(this.f3868r) ? 1.0f : this.f3868r;
        float f4 = Float.isNaN(this.f3869s) ? 0.0f : this.f3869s;
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f5 = f3 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f5, f5);
        float f6 = intrinsicWidth * f5;
        float f7 = f5 * intrinsicHeight;
        matrix.postTranslate(((((width - f6) * f) + width) - f6) * 0.5f, ((((height - f7) * f2) + height) - f7) * 0.5f);
        matrix.postRotate(f4, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* JADX INFO: renamed from: d */
    public final void m2122d() {
        if (Float.isNaN(this.f3866p) && Float.isNaN(this.f3867q) && Float.isNaN(this.f3868r) && Float.isNaN(this.f3869s)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            m2121c();
        }
    }

    public float getBrightness() {
        return this.f3854d.f4186d;
    }

    public float getContrast() {
        return this.f3854d.f4188f;
    }

    public float getCrossfade() {
        return this.f3858h;
    }

    public float getImagePanX() {
        return this.f3866p;
    }

    public float getImagePanY() {
        return this.f3867q;
    }

    public float getImageRotate() {
        return this.f3869s;
    }

    public float getImageZoom() {
        return this.f3868r;
    }

    public float getRound() {
        return this.f3860j;
    }

    public float getRoundPercent() {
        return this.f3859i;
    }

    public float getSaturation() {
        return this.f3854d.f4187e;
    }

    public float getWarmth() {
        return this.f3854d.f4189g;
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        m2121c();
    }

    public void setAltImageDrawable(Drawable drawable) {
        Drawable drawableMutate = drawable.mutate();
        this.f3856f = drawableMutate;
        Drawable drawable2 = this.f3857g;
        Drawable[] drawableArr = this.f3864n;
        drawableArr[0] = drawable2;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.f3865o = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f3858h);
    }

    public void setAltImageResource(int i) {
        Drawable drawableM2695U = AbstractC1406fG.m2695U(getContext(), i);
        this.f3856f = drawableM2695U;
        setAltImageDrawable(drawableM2695U);
    }

    public void setBrightness(float f) {
        C1226bl c1226bl = this.f3854d;
        c1226bl.f4186d = f;
        c1226bl.m2353a(this);
    }

    public void setContrast(float f) {
        C1226bl c1226bl = this.f3854d;
        c1226bl.f4188f = f;
        c1226bl.m2353a(this);
    }

    public void setCrossfade(float f) {
        this.f3858h = f;
        if (this.f3864n != null) {
            if (!this.f3855e) {
                this.f3865o.getDrawable(0).setAlpha((int) ((1.0f - this.f3858h) * 255.0f));
            }
            this.f3865o.getDrawable(1).setAlpha((int) (this.f3858h * 255.0f));
            super.setImageDrawable(this.f3865o);
        }
    }

    @Override // p000.C0520M3, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f3856f == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f3857g = drawableMutate;
        Drawable[] drawableArr = this.f3864n;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f3856f;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.f3865o = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f3858h);
    }

    public void setImagePanX(float f) {
        this.f3866p = f;
        m2122d();
    }

    public void setImagePanY(float f) {
        this.f3867q = f;
        m2122d();
    }

    @Override // p000.C0520M3, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.f3856f == null) {
            super.setImageResource(i);
            return;
        }
        Drawable drawableMutate = AbstractC1406fG.m2695U(getContext(), i).mutate();
        this.f3857g = drawableMutate;
        Drawable[] drawableArr = this.f3864n;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f3856f;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.f3865o = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f3858h);
    }

    public void setImageRotate(float f) {
        this.f3869s = f;
        m2122d();
    }

    public void setImageZoom(float f) {
        this.f3868r = f;
        m2122d();
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f3860j = f;
            float f2 = this.f3859i;
            this.f3859i = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f3860j != f;
        this.f3860j = f;
        if (f != 0.0f) {
            if (this.f3861k == null) {
                this.f3861k = new Path();
            }
            if (this.f3863m == null) {
                this.f3863m = new RectF();
            }
            if (this.f3862l == null) {
                C1146al c1146al = new C1146al(this, 1);
                this.f3862l = c1146al;
                setOutlineProvider(c1146al);
            }
            setClipToOutline(true);
            this.f3863m.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f3861k.reset();
            Path path = this.f3861k;
            RectF rectF = this.f3863m;
            float f3 = this.f3860j;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.f3859i != f;
        this.f3859i = f;
        if (f != 0.0f) {
            if (this.f3861k == null) {
                this.f3861k = new Path();
            }
            if (this.f3863m == null) {
                this.f3863m = new RectF();
            }
            if (this.f3862l == null) {
                C1146al c1146al = new C1146al(this, 0);
                this.f3862l = c1146al;
                setOutlineProvider(c1146al);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f3859i) / 2.0f;
            this.f3863m.set(0.0f, 0.0f, width, height);
            this.f3861k.reset();
            this.f3861k.addRoundRect(this.f3863m, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        C1226bl c1226bl = this.f3854d;
        c1226bl.f4187e = f;
        c1226bl.m2353a(this);
    }

    public void setWarmth(float f) {
        C1226bl c1226bl = this.f3854d;
        c1226bl.f4189g = f;
        c1226bl.m2353a(this);
    }
}
