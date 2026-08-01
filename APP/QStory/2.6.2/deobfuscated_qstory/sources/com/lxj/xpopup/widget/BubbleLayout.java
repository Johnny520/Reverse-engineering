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
import com.lxj.xpopup.util.AbstractC3787;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class BubbleLayout extends FrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final Rect f11848;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final Paint f11849;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public int f11850;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public int f11851;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final RectF f11852;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public Bitmap f11853;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public int f11854;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public int f11855;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public int f11856;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f11857;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public int f11858;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public int f11859;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f11860;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public int f11861;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f11862;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f11863;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f11864;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f11865;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public int f11866;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public int f11867;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f11868;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f11869;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f11870;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f11871;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Paint f11872;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f11873;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f11874;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f11875;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Path f11876;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Look f11877;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f11878;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11879;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f11880;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public int f11881;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final Paint f11882;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public int f11883;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final Paint f11884;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
        this.f11859 = -1;
        this.f11850 = -1;
        this.f11853 = null;
        this.f11852 = new RectF();
        this.f11848 = new Rect();
        Paint paint = new Paint(5);
        this.f11849 = paint;
        this.f11882 = new Paint(5);
        this.f11881 = -16777216;
        this.f11883 = 0;
        this.f11884 = new Paint(5);
        setLayerType(1, null);
        setWillNotDraw(false);
        this.f11877 = Look.BOTTOM;
        this.f11880 = 0;
        this.f11878 = AbstractC3787.m8119(getContext(), 10.0f);
        this.f11879 = AbstractC3787.m8119(getContext(), 9.0f);
        this.f11871 = 0;
        this.f11870 = 0;
        this.f11869 = 0;
        this.f11868 = AbstractC3787.m8119(getContext(), 8.0f);
        this.f11866 = -1;
        this.f11857 = -1;
        this.f11856 = -1;
        this.f11859 = -1;
        this.f11858 = AbstractC3787.m8119(getContext(), 1.0f);
        this.f11854 = AbstractC3787.m8119(getContext(), 1.0f);
        this.f11855 = AbstractC3787.m8119(getContext(), 1.0f);
        this.f11851 = AbstractC3787.m8119(getContext(), 1.0f);
        this.f11874 = AbstractC3787.m8119(getContext(), 0.0f);
        this.f11860 = -12303292;
        this.f11867 = Color.parseColor("#3b3c3d");
        this.f11881 = 0;
        this.f11883 = 0;
        Paint paint2 = new Paint(5);
        this.f11872 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f11876 = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public int getArrowDownLeftRadius() {
        return this.f11855;
    }

    public int getArrowDownRightRadius() {
        return this.f11851;
    }

    public int getArrowTopLeftRadius() {
        return this.f11858;
    }

    public int getArrowTopRightRadius() {
        return this.f11854;
    }

    public int getBubbleColor() {
        return this.f11867;
    }

    public int getBubbleRadius() {
        return this.f11868;
    }

    public int getLDR() {
        int i = this.f11859;
        return i == -1 ? this.f11868 : i;
    }

    public int getLTR() {
        int i = this.f11866;
        return i == -1 ? this.f11868 : i;
    }

    public Look getLook() {
        return this.f11877;
    }

    public int getLookLength() {
        return this.f11879;
    }

    public int getLookPosition() {
        return this.f11880;
    }

    public int getLookWidth() {
        return this.f11878;
    }

    public Paint getPaint() {
        return this.f11872;
    }

    public Path getPath() {
        return this.f11876;
    }

    public int getRDR() {
        int i = this.f11856;
        return i == -1 ? this.f11868 : i;
    }

    public int getRTR() {
        int i = this.f11857;
        return i == -1 ? this.f11868 : i;
    }

    public int getShadowColor() {
        return this.f11860;
    }

    public int getShadowRadius() {
        return this.f11871;
    }

    public int getShadowX() {
        return this.f11870;
    }

    public int getShadowY() {
        return this.f11869;
    }

    @Override // android.view.View
    public final void invalidate() {
        m8126();
        super.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f11872;
        Path path = this.f11876;
        canvas.drawPath(path, paint);
        if (this.f11853 != null) {
            RectF rectF = this.f11852;
            path.computeBounds(rectF, true);
            int iSaveLayer = canvas.saveLayer(rectF, null, 31);
            canvas.drawPath(path, this.f11882);
            float fWidth = rectF.width() / rectF.height();
            float width = (this.f11853.getWidth() * 1.0f) / this.f11853.getHeight();
            Bitmap bitmap = this.f11853;
            Rect rect = this.f11848;
            if (fWidth > width) {
                int height = (int) ((bitmap.getHeight() - (this.f11853.getWidth() / fWidth)) / 2.0f);
                rect.set(0, height, this.f11853.getWidth(), ((int) (this.f11853.getWidth() / fWidth)) + height);
            } else {
                int width2 = (int) ((bitmap.getWidth() - (this.f11853.getHeight() * fWidth)) / 2.0f);
                rect.set(width2, 0, ((int) (this.f11853.getHeight() * fWidth)) + width2, this.f11853.getHeight());
            }
            canvas.drawBitmap(this.f11853, rect, rectF, this.f11849);
            canvas.restoreToCount(iSaveLayer);
        }
        if (this.f11883 != 0) {
            canvas.drawPath(path, this.f11884);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f11880 = bundle.getInt("mLookPosition");
        this.f11878 = bundle.getInt("mLookWidth");
        this.f11879 = bundle.getInt("mLookLength");
        this.f11860 = bundle.getInt("mShadowColor");
        this.f11871 = bundle.getInt("mShadowRadius");
        this.f11870 = bundle.getInt("mShadowX");
        this.f11869 = bundle.getInt("mShadowY");
        this.f11868 = bundle.getInt("mBubbleRadius");
        this.f11866 = bundle.getInt("mLTR");
        this.f11857 = bundle.getInt("mRTR");
        this.f11856 = bundle.getInt("mRDR");
        this.f11859 = bundle.getInt("mLDR");
        this.f11874 = bundle.getInt("mBubblePadding");
        this.f11858 = bundle.getInt("mArrowTopLeftRadius");
        this.f11854 = bundle.getInt("mArrowTopRightRadius");
        this.f11855 = bundle.getInt("mArrowDownLeftRadius");
        this.f11851 = bundle.getInt("mArrowDownRightRadius");
        this.f11875 = bundle.getInt("mWidth");
        this.f11865 = bundle.getInt("mHeight");
        this.f11864 = bundle.getInt("mLeft");
        this.f11863 = bundle.getInt("mTop");
        this.f11862 = bundle.getInt("mRight");
        this.f11861 = bundle.getInt("mBottom");
        int i = bundle.getInt("mBubbleBgRes");
        this.f11850 = i;
        if (i != -1) {
            this.f11853 = BitmapFactory.decodeResource(getResources(), this.f11850);
        }
        this.f11883 = bundle.getInt("mBubbleBorderSize");
        this.f11881 = bundle.getInt("mBubbleBorderColor");
        super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mLookPosition", this.f11880);
        bundle.putInt("mLookWidth", this.f11878);
        bundle.putInt("mLookLength", this.f11879);
        bundle.putInt("mShadowColor", this.f11860);
        bundle.putInt("mShadowRadius", this.f11871);
        bundle.putInt("mShadowX", this.f11870);
        bundle.putInt("mShadowY", this.f11869);
        bundle.putInt("mBubbleRadius", this.f11868);
        bundle.putInt("mLTR", this.f11866);
        bundle.putInt("mRTR", this.f11857);
        bundle.putInt("mRDR", this.f11856);
        bundle.putInt("mLDR", this.f11859);
        bundle.putInt("mBubblePadding", this.f11874);
        bundle.putInt("mArrowTopLeftRadius", this.f11858);
        bundle.putInt("mArrowTopRightRadius", this.f11854);
        bundle.putInt("mArrowDownLeftRadius", this.f11855);
        bundle.putInt("mArrowDownRightRadius", this.f11851);
        bundle.putInt("mWidth", this.f11875);
        bundle.putInt("mHeight", this.f11865);
        bundle.putInt("mLeft", this.f11864);
        bundle.putInt("mTop", this.f11863);
        bundle.putInt("mRight", this.f11862);
        bundle.putInt("mBottom", this.f11861);
        bundle.putInt("mBubbleBgRes", this.f11850);
        bundle.putInt("mBubbleBorderColor", this.f11881);
        bundle.putInt("mBubbleBorderSize", this.f11883);
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f11875 = i;
        this.f11865 = i2;
        m8126();
    }

    @Override // android.view.View
    public final void postInvalidate() {
        m8126();
        super.postInvalidate();
    }

    public void setArrowDownLeftRadius(int i) {
        this.f11855 = i;
    }

    public void setArrowDownRightRadius(int i) {
        this.f11851 = i;
    }

    public void setArrowRadius(int i) {
        setArrowDownLeftRadius(i);
        setArrowDownRightRadius(i);
        setArrowTopLeftRadius(i);
        setArrowTopRightRadius(i);
    }

    public void setArrowTopLeftRadius(int i) {
        this.f11858 = i;
    }

    public void setArrowTopRightRadius(int i) {
        this.f11854 = i;
    }

    public void setBubbleBorderColor(int i) {
        this.f11881 = i;
    }

    public void setBubbleBorderSize(int i) {
        this.f11883 = i;
    }

    public void setBubbleColor(int i) {
        this.f11867 = i;
    }

    public void setBubbleImageBg(Bitmap bitmap) {
        this.f11853 = bitmap;
    }

    public void setBubbleImageBgRes(int i) {
        this.f11853 = BitmapFactory.decodeResource(getResources(), i);
    }

    public void setBubblePadding(int i) {
        this.f11874 = i;
    }

    public void setBubbleRadius(int i) {
        this.f11868 = i;
    }

    public void setLDR(int i) {
        this.f11859 = i;
    }

    public void setLTR(int i) {
        this.f11866 = i;
    }

    public void setLook(Look look) {
        this.f11877 = look;
        m8125();
    }

    public void setLookLength(int i) {
        this.f11879 = i;
        m8125();
    }

    public void setLookPosition(int i) {
        this.f11880 = i;
    }

    public void setLookPositionCenter(boolean z) {
        this.f11873 = z;
    }

    public void setLookWidth(int i) {
        this.f11878 = i;
    }

    public void setRDR(int i) {
        this.f11856 = i;
    }

    public void setRTR(int i) {
        this.f11857 = i;
    }

    public void setShadowColor(int i) {
        this.f11860 = i;
    }

    public void setShadowRadius(int i) {
        this.f11871 = i;
    }

    public void setShadowX(int i) {
        this.f11870 = i;
    }

    public void setShadowY(int i) {
        this.f11869 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8125() {
        int i = this.f11874 + this.f11871;
        int iOrdinal = this.f11877.ordinal();
        if (iOrdinal == 0) {
            setPadding(this.f11879 + i, i, this.f11870 + i, this.f11869 + i);
            return;
        }
        if (iOrdinal == 1) {
            setPadding(i, this.f11879 + i, this.f11870 + i, this.f11869 + i);
        } else if (iOrdinal == 2) {
            setPadding(i, i, this.f11879 + i + this.f11870, this.f11869 + i);
        } else {
            if (iOrdinal != 3) {
                return;
            }
            setPadding(i, i, this.f11870 + i, this.f11879 + i + this.f11869);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8126() {
        int i;
        int i2;
        m8125();
        if (this.f11873) {
            Look look = this.f11877;
            if (look == Look.LEFT || look == Look.RIGHT) {
                i = this.f11865 / 2;
                i2 = this.f11879;
            } else {
                i = this.f11875 / 2;
                i2 = this.f11878;
            }
            this.f11880 = i - (i2 / 2);
        }
        this.f11880 = this.f11880;
        float f = this.f11871;
        float f2 = this.f11870;
        float f3 = this.f11869;
        int i3 = this.f11860;
        Paint paint = this.f11872;
        paint.setShadowLayer(f, f2, f3, i3);
        int i4 = this.f11881;
        Paint paint2 = this.f11884;
        paint2.setColor(i4);
        paint2.setStrokeWidth(this.f11883);
        paint2.setStyle(Paint.Style.STROKE);
        int i5 = this.f11871;
        int i6 = this.f11870;
        int i7 = (i6 < 0 ? -i6 : 0) + i5;
        Look look2 = this.f11877;
        this.f11864 = i7 + (look2 == Look.LEFT ? this.f11879 : 0);
        int i8 = this.f11869;
        this.f11863 = (i8 < 0 ? -i8 : 0) + i5 + (look2 == Look.TOP ? this.f11879 : 0);
        this.f11862 = ((this.f11875 - i5) + (i6 > 0 ? -i6 : 0)) - (look2 == Look.RIGHT ? this.f11879 : 0);
        this.f11861 = ((this.f11865 - i5) + (i8 > 0 ? -i8 : 0)) - (look2 == Look.BOTTOM ? this.f11879 : 0);
        paint.setColor(this.f11867);
        Path path = this.f11876;
        path.reset();
        int i9 = this.f11880;
        int i10 = this.f11879 + i9;
        int i11 = this.f11861;
        if (i10 > i11) {
            i9 = i11 - this.f11878;
        }
        int iMax = Math.max(i9, this.f11871);
        int i12 = this.f11880;
        int i13 = this.f11879 + i12;
        int i14 = this.f11862;
        if (i13 > i14) {
            i12 = i14 - this.f11878;
        }
        int iMax2 = Math.max(i12, this.f11871);
        int iOrdinal = this.f11877.ordinal();
        if (iOrdinal == 0) {
            if (iMax >= getLTR() + this.f11851) {
                path.moveTo(this.f11864, iMax - r2);
                int i15 = this.f11851;
                int i16 = this.f11879;
                int i17 = this.f11878;
                path.rCubicTo(0.0f, i15, -i16, ((i17 / 2.0f) - this.f11854) + i15, -i16, (i17 / 2.0f) + i15);
            } else {
                path.moveTo(this.f11864 - this.f11879, (this.f11878 / 2.0f) + iMax);
            }
            int i18 = this.f11878 + iMax;
            int ldr = this.f11861 - getLDR();
            int i19 = this.f11855;
            if (i18 < ldr - i19) {
                float f4 = this.f11858;
                int i20 = this.f11879;
                int i21 = this.f11878;
                path.rCubicTo(0.0f, f4, i20, i21 / 2.0f, i20, (i21 / 2.0f) + i19);
                path.lineTo(this.f11864, this.f11861 - getLDR());
            }
            path.quadTo(this.f11864, this.f11861, getLDR() + r1, this.f11861);
            path.lineTo(this.f11862 - getRDR(), this.f11861);
            int i22 = this.f11862;
            path.quadTo(i22, this.f11861, i22, r3 - getRDR());
            path.lineTo(this.f11862, getRTR() + this.f11863);
            path.quadTo(this.f11862, this.f11863, r1 - getRTR(), this.f11863);
            path.lineTo(getLTR() + this.f11864, this.f11863);
            if (iMax >= getLTR() + this.f11851) {
                int i23 = this.f11864;
                path.quadTo(i23, this.f11863, i23, getLTR() + r2);
            } else {
                path.quadTo(this.f11864, this.f11863, r1 - this.f11879, (this.f11878 / 2.0f) + iMax);
            }
        } else if (iOrdinal == 1) {
            if (iMax2 >= getLTR() + this.f11855) {
                path.moveTo(iMax2 - r1, this.f11863);
                int i24 = this.f11855;
                int i25 = this.f11878;
                int i26 = this.f11879;
                path.rCubicTo(i24, 0.0f, ((i25 / 2.0f) - this.f11858) + i24, -i26, (i25 / 2.0f) + i24, -i26);
            } else {
                path.moveTo((this.f11878 / 2.0f) + iMax2, this.f11863 - this.f11879);
            }
            int i27 = this.f11878 + iMax2;
            int rtr = this.f11862 - getRTR();
            int i28 = this.f11851;
            if (i27 < rtr - i28) {
                float f5 = this.f11854;
                int i29 = this.f11878;
                int i30 = this.f11879;
                path.rCubicTo(f5, 0.0f, i29 / 2.0f, i30, (i29 / 2.0f) + i28, i30);
                path.lineTo(this.f11862 - getRTR(), this.f11863);
            }
            int i31 = this.f11862;
            path.quadTo(i31, this.f11863, i31, getRTR() + r3);
            path.lineTo(this.f11862, this.f11861 - getRDR());
            path.quadTo(this.f11862, this.f11861, r0 - getRDR(), this.f11861);
            path.lineTo(getLDR() + this.f11864, this.f11861);
            int i32 = this.f11864;
            path.quadTo(i32, this.f11861, i32, r3 - getLDR());
            path.lineTo(this.f11864, getLTR() + this.f11863);
            if (iMax2 >= getLTR() + this.f11855) {
                path.quadTo(this.f11864, this.f11863, getLTR() + r0, this.f11863);
            } else {
                path.quadTo(this.f11864, this.f11863, (this.f11878 / 2.0f) + iMax2, r1 - this.f11879);
            }
        } else if (iOrdinal == 2) {
            if (iMax >= getRTR() + this.f11855) {
                path.moveTo(this.f11862, iMax - r2);
                int i33 = this.f11855;
                int i34 = this.f11879;
                int i35 = this.f11878;
                path.rCubicTo(0.0f, i33, i34, ((i35 / 2.0f) - this.f11858) + i33, i34, (i35 / 2.0f) + i33);
            } else {
                path.moveTo(this.f11862 + this.f11879, (this.f11878 / 2.0f) + iMax);
            }
            int i36 = this.f11878 + iMax;
            int rdr = this.f11861 - getRDR();
            int i37 = this.f11851;
            if (i36 < rdr - i37) {
                float f6 = this.f11854;
                int i38 = this.f11879;
                int i39 = this.f11878;
                path.rCubicTo(0.0f, f6, -i38, i39 / 2.0f, -i38, (i39 / 2.0f) + i37);
                path.lineTo(this.f11862, this.f11861 - getRDR());
            }
            path.quadTo(this.f11862, this.f11861, r1 - getRDR(), this.f11861);
            path.lineTo(getLDR() + this.f11864, this.f11861);
            int i40 = this.f11864;
            path.quadTo(i40, this.f11861, i40, r3 - getLDR());
            path.lineTo(this.f11864, getLTR() + this.f11863);
            path.quadTo(this.f11864, this.f11863, getLTR() + r1, this.f11863);
            path.lineTo(this.f11862 - getRTR(), this.f11863);
            if (iMax >= getRTR() + this.f11855) {
                int i41 = this.f11862;
                path.quadTo(i41, this.f11863, i41, getRTR() + r2);
            } else {
                path.quadTo(this.f11862, this.f11863, r1 + this.f11879, (this.f11878 / 2.0f) + iMax);
            }
        } else if (iOrdinal == 3) {
            if (iMax2 >= getLDR() + this.f11851) {
                path.moveTo(iMax2 - r1, this.f11861);
                int i42 = this.f11851;
                int i43 = this.f11878;
                int i44 = this.f11879;
                path.rCubicTo(i42, 0.0f, ((i43 / 2.0f) - this.f11854) + i42, i44, (i43 / 2.0f) + i42, i44);
            } else {
                path.moveTo((this.f11878 / 2.0f) + iMax2, this.f11861 + this.f11879);
            }
            int i45 = this.f11878 + iMax2;
            int rdr2 = this.f11862 - getRDR();
            int i46 = this.f11855;
            if (i45 < rdr2 - i46) {
                float f7 = this.f11858;
                int i47 = this.f11878;
                int i48 = this.f11879;
                path.rCubicTo(f7, 0.0f, i47 / 2.0f, -i48, (i47 / 2.0f) + i46, -i48);
                path.lineTo(this.f11862 - getRDR(), this.f11861);
            }
            int i49 = this.f11862;
            path.quadTo(i49, this.f11861, i49, r3 - getRDR());
            path.lineTo(this.f11862, getRTR() + this.f11863);
            path.quadTo(this.f11862, this.f11863, r0 - getRTR(), this.f11863);
            path.lineTo(getLTR() + this.f11864, this.f11863);
            int i50 = this.f11864;
            path.quadTo(i50, this.f11863, i50, getLTR() + r3);
            path.lineTo(this.f11864, this.f11861 - getLDR());
            if (iMax2 >= getLDR() + this.f11851) {
                path.quadTo(this.f11864, this.f11861, getLDR() + r0, this.f11861);
            } else {
                path.quadTo(this.f11864, this.f11861, (this.f11878 / 2.0f) + iMax2, r1 + this.f11879);
            }
        }
        path.close();
    }
}
