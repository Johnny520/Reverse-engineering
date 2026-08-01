package com.lxj.xpopup.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.lxj.xpopup.util.AbstractC4620;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class BubbleLayout extends FrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final Rect f12198;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final Paint f12199;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public int f12200;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public int f12201;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final RectF f12202;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public Bitmap f12203;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public int f12204;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public int f12205;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public int f12206;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f12207;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public int f12208;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public int f12209;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f12210;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public int f12211;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f12212;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f12213;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f12214;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f12215;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public int f12216;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public int f12217;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f12218;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f12219;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f12220;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f12221;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Paint f12222;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f12223;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f12224;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f12225;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Path f12226;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Look f12227;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f12228;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f12229;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f12230;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public int f12231;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final Paint f12232;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public int f12233;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final Paint f12234;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Look {
        LEFT(1),
        TOP(2),
        RIGHT(3),
        BOTTOM(4);

        int value;

        Look(int i) {
            this.value = i;
        }

        public static Look getType(int i) {
            return i != 1 ? i != 2 ? i != 3 ? BOTTOM : RIGHT : TOP : LEFT;
        }
    }

    public BubbleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f12209 = -1;
        this.f12200 = -1;
        this.f12203 = null;
        this.f12202 = new RectF();
        this.f12198 = new Rect();
        Paint paint = new Paint(5);
        this.f12199 = paint;
        this.f12232 = new Paint(5);
        this.f12231 = -16777216;
        this.f12233 = 0;
        this.f12234 = new Paint(5);
        setLayerType(1, null);
        setWillNotDraw(false);
        this.f12227 = Look.BOTTOM;
        this.f12230 = 0;
        this.f12228 = AbstractC4620.m8665(getContext(), 10.0f);
        this.f12229 = AbstractC4620.m8665(getContext(), 9.0f);
        this.f12221 = 0;
        this.f12220 = 0;
        this.f12219 = 0;
        this.f12218 = AbstractC4620.m8665(getContext(), 8.0f);
        this.f12216 = -1;
        this.f12207 = -1;
        this.f12206 = -1;
        this.f12209 = -1;
        this.f12208 = AbstractC4620.m8665(getContext(), 1.0f);
        this.f12204 = AbstractC4620.m8665(getContext(), 1.0f);
        this.f12205 = AbstractC4620.m8665(getContext(), 1.0f);
        this.f12201 = AbstractC4620.m8665(getContext(), 1.0f);
        this.f12224 = AbstractC4620.m8665(getContext(), 0.0f);
        this.f12210 = -12303292;
        this.f12217 = Color.parseColor("#3b3c3d");
        this.f12231 = 0;
        this.f12233 = 0;
        Paint paint2 = new Paint(5);
        this.f12222 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f12226 = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public int getArrowDownLeftRadius() {
        return this.f12205;
    }

    public int getArrowDownRightRadius() {
        return this.f12201;
    }

    public int getArrowTopLeftRadius() {
        return this.f12208;
    }

    public int getArrowTopRightRadius() {
        return this.f12204;
    }

    public int getBubbleColor() {
        return this.f12217;
    }

    public int getBubbleRadius() {
        return this.f12218;
    }

    public int getLDR() {
        int i = this.f12209;
        return i == -1 ? this.f12218 : i;
    }

    public int getLTR() {
        int i = this.f12216;
        return i == -1 ? this.f12218 : i;
    }

    public Look getLook() {
        return this.f12227;
    }

    public int getLookLength() {
        return this.f12229;
    }

    public int getLookPosition() {
        return this.f12230;
    }

    public int getLookWidth() {
        return this.f12228;
    }

    public Paint getPaint() {
        return this.f12222;
    }

    public Path getPath() {
        return this.f12226;
    }

    public int getRDR() {
        int i = this.f12206;
        return i == -1 ? this.f12218 : i;
    }

    public int getRTR() {
        int i = this.f12207;
        return i == -1 ? this.f12218 : i;
    }

    public int getShadowColor() {
        return this.f12210;
    }

    public int getShadowRadius() {
        return this.f12221;
    }

    public int getShadowX() {
        return this.f12220;
    }

    public int getShadowY() {
        return this.f12219;
    }

    @Override // android.view.View
    public final void invalidate() {
        m8672();
        super.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f12222;
        Path path = this.f12226;
        canvas.drawPath(path, paint);
        if (this.f12203 != null) {
            RectF rectF = this.f12202;
            path.computeBounds(rectF, true);
            int iSaveLayer = canvas.saveLayer(rectF, null, 31);
            canvas.drawPath(path, this.f12232);
            float fWidth = rectF.width() / rectF.height();
            float width = (this.f12203.getWidth() * 1.0f) / this.f12203.getHeight();
            Bitmap bitmap = this.f12203;
            Rect rect = this.f12198;
            if (fWidth > width) {
                int height = (int) ((bitmap.getHeight() - (this.f12203.getWidth() / fWidth)) / 2.0f);
                rect.set(0, height, this.f12203.getWidth(), ((int) (this.f12203.getWidth() / fWidth)) + height);
            } else {
                int width2 = (int) ((bitmap.getWidth() - (this.f12203.getHeight() * fWidth)) / 2.0f);
                rect.set(width2, 0, ((int) (this.f12203.getHeight() * fWidth)) + width2, this.f12203.getHeight());
            }
            canvas.drawBitmap(this.f12203, rect, rectF, this.f12199);
            canvas.restoreToCount(iSaveLayer);
        }
        if (this.f12233 != 0) {
            canvas.drawPath(path, this.f12234);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f12230 = bundle.getInt("mLookPosition");
        this.f12228 = bundle.getInt("mLookWidth");
        this.f12229 = bundle.getInt("mLookLength");
        this.f12210 = bundle.getInt("mShadowColor");
        this.f12221 = bundle.getInt("mShadowRadius");
        this.f12220 = bundle.getInt("mShadowX");
        this.f12219 = bundle.getInt("mShadowY");
        this.f12218 = bundle.getInt("mBubbleRadius");
        this.f12216 = bundle.getInt("mLTR");
        this.f12207 = bundle.getInt("mRTR");
        this.f12206 = bundle.getInt("mRDR");
        this.f12209 = bundle.getInt("mLDR");
        this.f12224 = bundle.getInt("mBubblePadding");
        this.f12208 = bundle.getInt("mArrowTopLeftRadius");
        this.f12204 = bundle.getInt("mArrowTopRightRadius");
        this.f12205 = bundle.getInt("mArrowDownLeftRadius");
        this.f12201 = bundle.getInt("mArrowDownRightRadius");
        this.f12225 = bundle.getInt("mWidth");
        this.f12215 = bundle.getInt("mHeight");
        this.f12214 = bundle.getInt("mLeft");
        this.f12213 = bundle.getInt("mTop");
        this.f12212 = bundle.getInt("mRight");
        this.f12211 = bundle.getInt("mBottom");
        int i = bundle.getInt("mBubbleBgRes");
        this.f12200 = i;
        if (i != -1) {
            this.f12203 = BitmapFactory.decodeResource(getResources(), this.f12200);
        }
        this.f12233 = bundle.getInt("mBubbleBorderSize");
        this.f12231 = bundle.getInt("mBubbleBorderColor");
        super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mLookPosition", this.f12230);
        bundle.putInt("mLookWidth", this.f12228);
        bundle.putInt("mLookLength", this.f12229);
        bundle.putInt("mShadowColor", this.f12210);
        bundle.putInt("mShadowRadius", this.f12221);
        bundle.putInt("mShadowX", this.f12220);
        bundle.putInt("mShadowY", this.f12219);
        bundle.putInt("mBubbleRadius", this.f12218);
        bundle.putInt("mLTR", this.f12216);
        bundle.putInt("mRTR", this.f12207);
        bundle.putInt("mRDR", this.f12206);
        bundle.putInt("mLDR", this.f12209);
        bundle.putInt("mBubblePadding", this.f12224);
        bundle.putInt("mArrowTopLeftRadius", this.f12208);
        bundle.putInt("mArrowTopRightRadius", this.f12204);
        bundle.putInt("mArrowDownLeftRadius", this.f12205);
        bundle.putInt("mArrowDownRightRadius", this.f12201);
        bundle.putInt("mWidth", this.f12225);
        bundle.putInt("mHeight", this.f12215);
        bundle.putInt("mLeft", this.f12214);
        bundle.putInt("mTop", this.f12213);
        bundle.putInt("mRight", this.f12212);
        bundle.putInt("mBottom", this.f12211);
        bundle.putInt("mBubbleBgRes", this.f12200);
        bundle.putInt("mBubbleBorderColor", this.f12231);
        bundle.putInt("mBubbleBorderSize", this.f12233);
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f12225 = i;
        this.f12215 = i2;
        m8672();
    }

    @Override // android.view.View
    public final void postInvalidate() {
        m8672();
        super.postInvalidate();
    }

    public void setArrowDownLeftRadius(int i) {
        this.f12205 = i;
    }

    public void setArrowDownRightRadius(int i) {
        this.f12201 = i;
    }

    public void setArrowRadius(int i) {
        setArrowDownLeftRadius(i);
        setArrowDownRightRadius(i);
        setArrowTopLeftRadius(i);
        setArrowTopRightRadius(i);
    }

    public void setArrowTopLeftRadius(int i) {
        this.f12208 = i;
    }

    public void setArrowTopRightRadius(int i) {
        this.f12204 = i;
    }

    public void setBubbleBorderColor(int i) {
        this.f12231 = i;
    }

    public void setBubbleBorderSize(int i) {
        this.f12233 = i;
    }

    public void setBubbleColor(int i) {
        this.f12217 = i;
    }

    public void setBubbleImageBg(Bitmap bitmap) {
        this.f12203 = bitmap;
    }

    public void setBubbleImageBgRes(int i) {
        this.f12203 = BitmapFactory.decodeResource(getResources(), i);
    }

    public void setBubblePadding(int i) {
        this.f12224 = i;
    }

    public void setBubbleRadius(int i) {
        this.f12218 = i;
    }

    public void setLDR(int i) {
        this.f12209 = i;
    }

    public void setLTR(int i) {
        this.f12216 = i;
    }

    public void setLook(Look look) {
        this.f12227 = look;
        m8671();
    }

    public void setLookLength(int i) {
        this.f12229 = i;
        m8671();
    }

    public void setLookPosition(int i) {
        this.f12230 = i;
    }

    public void setLookPositionCenter(boolean z) {
        this.f12223 = z;
    }

    public void setLookWidth(int i) {
        this.f12228 = i;
    }

    public void setRDR(int i) {
        this.f12206 = i;
    }

    public void setRTR(int i) {
        this.f12207 = i;
    }

    public void setShadowColor(int i) {
        this.f12210 = i;
    }

    public void setShadowRadius(int i) {
        this.f12221 = i;
    }

    public void setShadowX(int i) {
        this.f12220 = i;
    }

    public void setShadowY(int i) {
        this.f12219 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8671() {
        int i = this.f12224 + this.f12221;
        int iOrdinal = this.f12227.ordinal();
        if (iOrdinal == 0) {
            setPadding(this.f12229 + i, i, this.f12220 + i, this.f12219 + i);
            return;
        }
        if (iOrdinal == 1) {
            setPadding(i, this.f12229 + i, this.f12220 + i, this.f12219 + i);
        } else if (iOrdinal == 2) {
            setPadding(i, i, this.f12229 + i + this.f12220, this.f12219 + i);
        } else {
            if (iOrdinal != 3) {
                return;
            }
            setPadding(i, i, this.f12220 + i, this.f12229 + i + this.f12219);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8672() {
        int i;
        int i2;
        m8671();
        if (this.f12223) {
            Look look = this.f12227;
            if (look == Look.LEFT || look == Look.RIGHT) {
                i = this.f12215 / 2;
                i2 = this.f12229;
            } else {
                i = this.f12225 / 2;
                i2 = this.f12228;
            }
            this.f12230 = i - (i2 / 2);
        }
        this.f12230 = this.f12230;
        float f = this.f12221;
        float f2 = this.f12220;
        float f3 = this.f12219;
        int i3 = this.f12210;
        Paint paint = this.f12222;
        paint.setShadowLayer(f, f2, f3, i3);
        int i4 = this.f12231;
        Paint paint2 = this.f12234;
        paint2.setColor(i4);
        paint2.setStrokeWidth(this.f12233);
        paint2.setStyle(Paint.Style.STROKE);
        int i5 = this.f12221;
        int i6 = this.f12220;
        int i7 = (i6 < 0 ? -i6 : 0) + i5;
        Look look2 = this.f12227;
        this.f12214 = i7 + (look2 == Look.LEFT ? this.f12229 : 0);
        int i8 = this.f12219;
        this.f12213 = (i8 < 0 ? -i8 : 0) + i5 + (look2 == Look.TOP ? this.f12229 : 0);
        this.f12212 = ((this.f12225 - i5) + (i6 > 0 ? -i6 : 0)) - (look2 == Look.RIGHT ? this.f12229 : 0);
        this.f12211 = ((this.f12215 - i5) + (i8 > 0 ? -i8 : 0)) - (look2 == Look.BOTTOM ? this.f12229 : 0);
        paint.setColor(this.f12217);
        Path path = this.f12226;
        path.reset();
        int i9 = this.f12230;
        int i10 = this.f12229 + i9;
        int i11 = this.f12211;
        if (i10 > i11) {
            i9 = i11 - this.f12228;
        }
        int iMax = Math.max(i9, this.f12221);
        int i12 = this.f12230;
        int i13 = this.f12229 + i12;
        int i14 = this.f12212;
        if (i13 > i14) {
            i12 = i14 - this.f12228;
        }
        int iMax2 = Math.max(i12, this.f12221);
        int iOrdinal = this.f12227.ordinal();
        if (iOrdinal == 0) {
            if (iMax >= getLTR() + this.f12201) {
                path.moveTo(this.f12214, iMax - r2);
                int i15 = this.f12201;
                int i16 = this.f12229;
                int i17 = this.f12228;
                path.rCubicTo(0.0f, i15, -i16, ((i17 / 2.0f) - this.f12204) + i15, -i16, (i17 / 2.0f) + i15);
            } else {
                path.moveTo(this.f12214 - this.f12229, (this.f12228 / 2.0f) + iMax);
            }
            int i18 = this.f12228 + iMax;
            int ldr = this.f12211 - getLDR();
            int i19 = this.f12205;
            if (i18 < ldr - i19) {
                float f4 = this.f12208;
                int i20 = this.f12229;
                int i21 = this.f12228;
                path.rCubicTo(0.0f, f4, i20, i21 / 2.0f, i20, (i21 / 2.0f) + i19);
                path.lineTo(this.f12214, this.f12211 - getLDR());
            }
            path.quadTo(this.f12214, this.f12211, getLDR() + r1, this.f12211);
            path.lineTo(this.f12212 - getRDR(), this.f12211);
            int i22 = this.f12212;
            path.quadTo(i22, this.f12211, i22, r3 - getRDR());
            path.lineTo(this.f12212, getRTR() + this.f12213);
            path.quadTo(this.f12212, this.f12213, r1 - getRTR(), this.f12213);
            path.lineTo(getLTR() + this.f12214, this.f12213);
            if (iMax >= getLTR() + this.f12201) {
                int i23 = this.f12214;
                path.quadTo(i23, this.f12213, i23, getLTR() + r2);
            } else {
                path.quadTo(this.f12214, this.f12213, r1 - this.f12229, (this.f12228 / 2.0f) + iMax);
            }
        } else if (iOrdinal == 1) {
            if (iMax2 >= getLTR() + this.f12205) {
                path.moveTo(iMax2 - r1, this.f12213);
                int i24 = this.f12205;
                int i25 = this.f12228;
                int i26 = this.f12229;
                path.rCubicTo(i24, 0.0f, ((i25 / 2.0f) - this.f12208) + i24, -i26, (i25 / 2.0f) + i24, -i26);
            } else {
                path.moveTo((this.f12228 / 2.0f) + iMax2, this.f12213 - this.f12229);
            }
            int i27 = this.f12228 + iMax2;
            int rtr = this.f12212 - getRTR();
            int i28 = this.f12201;
            if (i27 < rtr - i28) {
                float f5 = this.f12204;
                int i29 = this.f12228;
                int i30 = this.f12229;
                path.rCubicTo(f5, 0.0f, i29 / 2.0f, i30, (i29 / 2.0f) + i28, i30);
                path.lineTo(this.f12212 - getRTR(), this.f12213);
            }
            int i31 = this.f12212;
            path.quadTo(i31, this.f12213, i31, getRTR() + r3);
            path.lineTo(this.f12212, this.f12211 - getRDR());
            path.quadTo(this.f12212, this.f12211, r0 - getRDR(), this.f12211);
            path.lineTo(getLDR() + this.f12214, this.f12211);
            int i32 = this.f12214;
            path.quadTo(i32, this.f12211, i32, r3 - getLDR());
            path.lineTo(this.f12214, getLTR() + this.f12213);
            if (iMax2 >= getLTR() + this.f12205) {
                path.quadTo(this.f12214, this.f12213, getLTR() + r0, this.f12213);
            } else {
                path.quadTo(this.f12214, this.f12213, (this.f12228 / 2.0f) + iMax2, r1 - this.f12229);
            }
        } else if (iOrdinal == 2) {
            if (iMax >= getRTR() + this.f12205) {
                path.moveTo(this.f12212, iMax - r2);
                int i33 = this.f12205;
                int i34 = this.f12229;
                int i35 = this.f12228;
                path.rCubicTo(0.0f, i33, i34, ((i35 / 2.0f) - this.f12208) + i33, i34, (i35 / 2.0f) + i33);
            } else {
                path.moveTo(this.f12212 + this.f12229, (this.f12228 / 2.0f) + iMax);
            }
            int i36 = this.f12228 + iMax;
            int rdr = this.f12211 - getRDR();
            int i37 = this.f12201;
            if (i36 < rdr - i37) {
                float f6 = this.f12204;
                int i38 = this.f12229;
                int i39 = this.f12228;
                path.rCubicTo(0.0f, f6, -i38, i39 / 2.0f, -i38, (i39 / 2.0f) + i37);
                path.lineTo(this.f12212, this.f12211 - getRDR());
            }
            path.quadTo(this.f12212, this.f12211, r1 - getRDR(), this.f12211);
            path.lineTo(getLDR() + this.f12214, this.f12211);
            int i40 = this.f12214;
            path.quadTo(i40, this.f12211, i40, r3 - getLDR());
            path.lineTo(this.f12214, getLTR() + this.f12213);
            path.quadTo(this.f12214, this.f12213, getLTR() + r1, this.f12213);
            path.lineTo(this.f12212 - getRTR(), this.f12213);
            if (iMax >= getRTR() + this.f12205) {
                int i41 = this.f12212;
                path.quadTo(i41, this.f12213, i41, getRTR() + r2);
            } else {
                path.quadTo(this.f12212, this.f12213, r1 + this.f12229, (this.f12228 / 2.0f) + iMax);
            }
        } else if (iOrdinal == 3) {
            if (iMax2 >= getLDR() + this.f12201) {
                path.moveTo(iMax2 - r1, this.f12211);
                int i42 = this.f12201;
                int i43 = this.f12228;
                int i44 = this.f12229;
                path.rCubicTo(i42, 0.0f, ((i43 / 2.0f) - this.f12204) + i42, i44, (i43 / 2.0f) + i42, i44);
            } else {
                path.moveTo((this.f12228 / 2.0f) + iMax2, this.f12211 + this.f12229);
            }
            int i45 = this.f12228 + iMax2;
            int rdr2 = this.f12212 - getRDR();
            int i46 = this.f12205;
            if (i45 < rdr2 - i46) {
                float f7 = this.f12208;
                int i47 = this.f12228;
                int i48 = this.f12229;
                path.rCubicTo(f7, 0.0f, i47 / 2.0f, -i48, (i47 / 2.0f) + i46, -i48);
                path.lineTo(this.f12212 - getRDR(), this.f12211);
            }
            int i49 = this.f12212;
            path.quadTo(i49, this.f12211, i49, r3 - getRDR());
            path.lineTo(this.f12212, getRTR() + this.f12213);
            path.quadTo(this.f12212, this.f12213, r0 - getRTR(), this.f12213);
            path.lineTo(getLTR() + this.f12214, this.f12213);
            int i50 = this.f12214;
            path.quadTo(i50, this.f12213, i50, getLTR() + r3);
            path.lineTo(this.f12214, this.f12211 - getLDR());
            if (iMax2 >= getLDR() + this.f12201) {
                path.quadTo(this.f12214, this.f12211, getLDR() + r0, this.f12211);
            } else {
                path.quadTo(this.f12214, this.f12211, (this.f12228 / 2.0f) + iMax2, r1 + this.f12229);
            }
        }
        path.close();
    }
}
