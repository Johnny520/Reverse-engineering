package Yue;

import Yue.C5419;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.C8778;

/* JADX INFO: renamed from: Yue.ۥ۠ۥ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5418 extends C3311 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C5419.C5420 f13301;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public float f13302;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public float f13303;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public float f13304;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public Path f13305;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public ViewOutlineProvider f13306;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public RectF f13307;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public Drawable[] f13308;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public LayerDrawable f13309;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean f13310;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۠ۦ$ۥ */
    public class C0754 extends ViewOutlineProvider {
        public C0754() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, C5418.this.getWidth(), C5418.this.getHeight(), (Math.min(r3, r4) * C5418.this.f13303) / 2.0f);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۠ۦ$ۥ۟ */
    public class C0755 extends ViewOutlineProvider {
        public C0755() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, C5418.this.getWidth(), C5418.this.getHeight(), C5418.this.f13304);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5418(Context context) {
        super(context);
        this.f13301 = new C5419.C5420();
        this.f13302 = 0.0f;
        this.f13303 = 0.0f;
        this.f13304 = Float.NaN;
        this.f13310 = true;
        m16901(context, null);
    }

    private void setOverlay(boolean z) {
        this.f13310 = z;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getContrast() {
        return this.f13301.f13324;
    }

    public float getCrossfade() {
        return this.f13302;
    }

    public float getRound() {
        return this.f13304;
    }

    public float getRoundPercent() {
        return this.f13303;
    }

    public float getSaturation() {
        return this.f13301.f13323;
    }

    public float getWarmth() {
        return this.f13301.f13325;
    }

    public void setBrightness(float f) {
        C5419.C5420 c5420 = this.f13301;
        c5420.f13322 = f;
        c5420.m16905(this);
    }

    public void setContrast(float f) {
        C5419.C5420 c5420 = this.f13301;
        c5420.f13324 = f;
        c5420.m16905(this);
    }

    public void setCrossfade(float f) {
        this.f13302 = f;
        if (this.f13308 != null) {
            if (!this.f13310) {
                this.f13309.getDrawable(0).setAlpha((int) ((1.0f - this.f13302) * 255.0f));
            }
            this.f13309.getDrawable(1).setAlpha((int) (this.f13302 * 255.0f));
            super.setImageDrawable(this.f13309);
        }
    }

    @InterfaceC7113(21)
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f13304 = f;
            float f2 = this.f13303;
            this.f13303 = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f13304 != f;
        this.f13304 = f;
        if (f != 0.0f) {
            if (this.f13305 == null) {
                this.f13305 = new Path();
            }
            if (this.f13307 == null) {
                this.f13307 = new RectF();
            }
            if (this.f13306 == null) {
                C0755 c0755 = new C0755();
                this.f13306 = c0755;
                setOutlineProvider(c0755);
            }
            setClipToOutline(true);
            this.f13307.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f13305.reset();
            Path path = this.f13305;
            RectF rectF = this.f13307;
            float f3 = this.f13304;
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
        boolean z = this.f13303 != f;
        this.f13303 = f;
        if (f != 0.0f) {
            if (this.f13305 == null) {
                this.f13305 = new Path();
            }
            if (this.f13307 == null) {
                this.f13307 = new RectF();
            }
            if (this.f13306 == null) {
                C0754 c0754 = new C0754();
                this.f13306 = c0754;
                setOutlineProvider(c0754);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f13303) / 2.0f;
            this.f13307.set(0.0f, 0.0f, width, height);
            this.f13305.reset();
            this.f13305.addRoundRect(this.f13307, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        C5419.C5420 c5420 = this.f13301;
        c5420.f13323 = f;
        c5420.m16905(this);
    }

    public void setWarmth(float f) {
        C5419.C5420 c5420 = this.f13301;
        c5420.f13325 = f;
        c5420.m16905(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m16901(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C8778.C8789.f28977);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C8778.C8789.f28978);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C8778.C8789.f28981) {
                    this.f13302 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
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
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f13310));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f13308 = drawableArr;
                drawableArr[0] = getDrawable();
                this.f13308[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f13308);
                this.f13309 = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f13302 * 255.0f));
                super.setImageDrawable(this.f13309);
            }
        }
    }

    public C5418(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13301 = new C5419.C5420();
        this.f13302 = 0.0f;
        this.f13303 = 0.0f;
        this.f13304 = Float.NaN;
        this.f13310 = true;
        m16901(context, attributeSet);
    }

    public C5418(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13301 = new C5419.C5420();
        this.f13302 = 0.0f;
        this.f13303 = 0.0f;
        this.f13304 = Float.NaN;
        this.f13310 = true;
        m16901(context, attributeSet);
    }
}
