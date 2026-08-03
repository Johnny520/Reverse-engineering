package Yue;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.constraintlayout.widget.C8778;

/* JADX INFO: renamed from: Yue.ۥ۠ۥ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5419 extends C3314 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C5420 f13311;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f13312;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public float f13313;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public float f13314;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public float f13315;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public Path f13316;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public ViewOutlineProvider f13317;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public RectF f13318;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public Drawable[] f13319;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public LayerDrawable f13320;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۠ۧ$ۥ */
    public class C0756 extends ViewOutlineProvider {
        public C0756() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, C5419.this.getWidth(), C5419.this.getHeight(), (Math.min(r3, r4) * C5419.this.f13314) / 2.0f);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۠ۧ$ۥ۟ */
    public class C0757 extends ViewOutlineProvider {
        public C0757() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, C5419.this.getWidth(), C5419.this.getHeight(), C5419.this.f13315);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۠ۧ$ۥ۟۟, reason: contains not printable characters */
    public static class C5420 {

        /* JADX INFO: renamed from: ۥ */
        public float[] f1498 = new float[20];

        /* JADX INFO: renamed from: ۥ۟ */
        public ColorMatrix f1499 = new ColorMatrix();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public ColorMatrix f13321 = new ColorMatrix();

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public float f13322 = 1.0f;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public float f13323 = 1.0f;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public float f13324 = 1.0f;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public float f13325 = 1.0f;

        /* JADX INFO: renamed from: ۥ */
        public final void m2188(float f) {
            float[] fArr = this.f1498;
            fArr[0] = f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final void m2189(float f) {
            float f2 = 1.0f - f;
            float f3 = 0.2999f * f2;
            float f4 = 0.587f * f2;
            float f5 = f2 * 0.114f;
            float[] fArr = this.f1498;
            fArr[0] = f3 + f;
            fArr[1] = f4;
            fArr[2] = f5;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f3;
            fArr[6] = f4 + f;
            fArr[7] = f5;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f3;
            fArr[11] = f4;
            fArr[12] = f5 + f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m16905(ImageView imageView) {
            boolean z;
            this.f1499.reset();
            float f = this.f13323;
            boolean z2 = true;
            if (f != 1.0f) {
                m2189(f);
                this.f1499.set(this.f1498);
                z = true;
            } else {
                z = false;
            }
            float f2 = this.f13324;
            if (f2 != 1.0f) {
                this.f13321.setScale(f2, f2, f2, 1.0f);
                this.f1499.postConcat(this.f13321);
                z = true;
            }
            float f3 = this.f13325;
            if (f3 != 1.0f) {
                m16906(f3);
                this.f13321.set(this.f1498);
                this.f1499.postConcat(this.f13321);
                z = true;
            }
            float f4 = this.f13322;
            if (f4 != 1.0f) {
                m2188(f4);
                this.f13321.set(this.f1498);
                this.f1499.postConcat(this.f13321);
            } else {
                z2 = z;
            }
            if (z2) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f1499));
            } else {
                imageView.clearColorFilter();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m16906(float f) {
            float fLog;
            float fPow;
            if (f <= 0.0f) {
                f = 0.01f;
            }
            float f2 = (5000.0f / f) / 100.0f;
            if (f2 > 66.0f) {
                double d = f2 - 60.0f;
                fPow = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                fLog = ((float) Math.pow(d, 0.07551484555006027d)) * 288.12216f;
            } else {
                fLog = (((float) Math.log(f2)) * 99.4708f) - 161.11957f;
                fPow = 255.0f;
            }
            float fLog2 = f2 < 66.0f ? f2 > 19.0f ? (((float) Math.log(f2 - 10.0f)) * 138.51773f) - 305.0448f : 0.0f : 255.0f;
            float fMin = Math.min(255.0f, Math.max(fPow, 0.0f));
            float fMin2 = Math.min(255.0f, Math.max(fLog, 0.0f));
            float fMin3 = Math.min(255.0f, Math.max(fLog2, 0.0f));
            float fLog3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
            float fLog4 = (((float) Math.log(40.0f)) * 138.51773f) - 305.0448f;
            float fMin4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float fMin5 = Math.min(255.0f, Math.max(fLog3, 0.0f));
            float fMin6 = fMin3 / Math.min(255.0f, Math.max(fLog4, 0.0f));
            float[] fArr = this.f1498;
            fArr[0] = fMin / fMin4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fMin2 / fMin5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = fMin6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5419(Context context) {
        super(context);
        this.f13311 = new C5420();
        this.f13312 = true;
        this.f13313 = 0.0f;
        this.f13314 = 0.0f;
        this.f13315 = Float.NaN;
        m16904(context, null);
    }

    private void setOverlay(boolean z) {
        this.f13312 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    private void m16904(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C8778.C8789.f28977);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C8778.C8789.f28978);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C8778.C8789.f28981) {
                    this.f13313 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == C8778.C8789.f28986) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C8778.C8789.f28985) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C8778.C8789.f28980) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C8778.C8789.f28983) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C8778.C8789.f28984) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C8778.C8789.f28982) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f13312));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f13319 = drawableArr;
                drawableArr[0] = getDrawable();
                this.f13319[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f13319);
                this.f13320 = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f13313 * 255.0f));
                super.setImageDrawable(this.f13320);
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getBrightness() {
        return this.f13311.f13322;
    }

    public float getContrast() {
        return this.f13311.f13324;
    }

    public float getCrossfade() {
        return this.f13313;
    }

    public float getRound() {
        return this.f13315;
    }

    public float getRoundPercent() {
        return this.f13314;
    }

    public float getSaturation() {
        return this.f13311.f13323;
    }

    public float getWarmth() {
        return this.f13311.f13325;
    }

    public void setBrightness(float f) {
        C5420 c5420 = this.f13311;
        c5420.f13322 = f;
        c5420.m16905(this);
    }

    public void setContrast(float f) {
        C5420 c5420 = this.f13311;
        c5420.f13324 = f;
        c5420.m16905(this);
    }

    public void setCrossfade(float f) {
        this.f13313 = f;
        if (this.f13319 != null) {
            if (!this.f13312) {
                this.f13320.getDrawable(0).setAlpha((int) ((1.0f - this.f13313) * 255.0f));
            }
            this.f13320.getDrawable(1).setAlpha((int) (this.f13313 * 255.0f));
            super.setImageDrawable(this.f13320);
        }
    }

    @InterfaceC7113(21)
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f13315 = f;
            float f2 = this.f13314;
            this.f13314 = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f13315 != f;
        this.f13315 = f;
        if (f != 0.0f) {
            if (this.f13316 == null) {
                this.f13316 = new Path();
            }
            if (this.f13318 == null) {
                this.f13318 = new RectF();
            }
            if (this.f13317 == null) {
                C0757 c0757 = new C0757();
                this.f13317 = c0757;
                setOutlineProvider(c0757);
            }
            setClipToOutline(true);
            this.f13318.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f13316.reset();
            Path path = this.f13316;
            RectF rectF = this.f13318;
            float f3 = this.f13315;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    @InterfaceC7113(21)
    public void setRoundPercent(float f) {
        boolean z = this.f13314 != f;
        this.f13314 = f;
        if (f != 0.0f) {
            if (this.f13316 == null) {
                this.f13316 = new Path();
            }
            if (this.f13318 == null) {
                this.f13318 = new RectF();
            }
            if (this.f13317 == null) {
                C0756 c0756 = new C0756();
                this.f13317 = c0756;
                setOutlineProvider(c0756);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f13314) / 2.0f;
            this.f13318.set(0.0f, 0.0f, width, height);
            this.f13316.reset();
            this.f13316.addRoundRect(this.f13318, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        C5420 c5420 = this.f13311;
        c5420.f13323 = f;
        c5420.m16905(this);
    }

    public void setWarmth(float f) {
        C5420 c5420 = this.f13311;
        c5420.f13325 = f;
        c5420.m16905(this);
    }

    public C5419(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13311 = new C5420();
        this.f13312 = true;
        this.f13313 = 0.0f;
        this.f13314 = 0.0f;
        this.f13315 = Float.NaN;
        m16904(context, attributeSet);
    }

    public C5419(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13311 = new C5420();
        this.f13312 = true;
        this.f13313 = 0.0f;
        this.f13314 = 0.0f;
        this.f13315 = Float.NaN;
        m16904(context, attributeSet);
    }
}
