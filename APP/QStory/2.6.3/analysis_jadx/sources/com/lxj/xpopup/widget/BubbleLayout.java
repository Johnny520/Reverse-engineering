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
import com.lxj.xpopup.util.AbstractC3788;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class BubbleLayout extends FrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final Rect f11853;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final Paint f11854;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public int f11855;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public int f11856;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final RectF f11857;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public Bitmap f11858;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public int f11859;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public int f11860;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public int f11861;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f11862;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public int f11863;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public int f11864;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f11865;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public int f11866;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f11867;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f11868;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f11869;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f11870;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public int f11871;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public int f11872;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f11873;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f11874;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f11875;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f11876;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Paint f11877;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f11878;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f11879;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f11880;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Path f11881;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Look f11882;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f11883;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11884;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f11885;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public int f11886;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final Paint f11887;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public int f11888;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final Paint f11889;

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
        this.f11864 = -1;
        this.f11855 = -1;
        this.f11858 = null;
        this.f11857 = new RectF();
        this.f11853 = new Rect();
        Paint paint = new Paint(5);
        this.f11854 = paint;
        this.f11887 = new Paint(5);
        this.f11886 = -16777216;
        this.f11888 = 0;
        this.f11889 = new Paint(5);
        setLayerType(1, null);
        setWillNotDraw(false);
        this.f11882 = Look.BOTTOM;
        this.f11885 = 0;
        this.f11883 = AbstractC3788.m8106(getContext(), 10.0f);
        this.f11884 = AbstractC3788.m8106(getContext(), 9.0f);
        this.f11876 = 0;
        this.f11875 = 0;
        this.f11874 = 0;
        this.f11873 = AbstractC3788.m8106(getContext(), 8.0f);
        this.f11871 = -1;
        this.f11862 = -1;
        this.f11861 = -1;
        this.f11864 = -1;
        this.f11863 = AbstractC3788.m8106(getContext(), 1.0f);
        this.f11859 = AbstractC3788.m8106(getContext(), 1.0f);
        this.f11860 = AbstractC3788.m8106(getContext(), 1.0f);
        this.f11856 = AbstractC3788.m8106(getContext(), 1.0f);
        this.f11879 = AbstractC3788.m8106(getContext(), 0.0f);
        this.f11865 = -12303292;
        this.f11872 = Color.parseColor("#3b3c3d");
        this.f11886 = 0;
        this.f11888 = 0;
        Paint paint2 = new Paint(5);
        this.f11877 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f11881 = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public int getArrowDownLeftRadius() {
        return this.f11860;
    }

    public int getArrowDownRightRadius() {
        return this.f11856;
    }

    public int getArrowTopLeftRadius() {
        return this.f11863;
    }

    public int getArrowTopRightRadius() {
        return this.f11859;
    }

    public int getBubbleColor() {
        return this.f11872;
    }

    public int getBubbleRadius() {
        return this.f11873;
    }

    public int getLDR() {
        int i = this.f11864;
        return i == -1 ? this.f11873 : i;
    }

    public int getLTR() {
        int i = this.f11871;
        return i == -1 ? this.f11873 : i;
    }

    public Look getLook() {
        return this.f11882;
    }

    public int getLookLength() {
        return this.f11884;
    }

    public int getLookPosition() {
        return this.f11885;
    }

    public int getLookWidth() {
        return this.f11883;
    }

    public Paint getPaint() {
        return this.f11877;
    }

    public Path getPath() {
        return this.f11881;
    }

    public int getRDR() {
        int i = this.f11861;
        return i == -1 ? this.f11873 : i;
    }

    public int getRTR() {
        int i = this.f11862;
        return i == -1 ? this.f11873 : i;
    }

    public int getShadowColor() {
        return this.f11865;
    }

    public int getShadowRadius() {
        return this.f11876;
    }

    public int getShadowX() {
        return this.f11875;
    }

    public int getShadowY() {
        return this.f11874;
    }

    @Override // android.view.View
    public final void invalidate() {
        m8113();
        super.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f11877;
        Path path = this.f11881;
        canvas.drawPath(path, paint);
        if (this.f11858 != null) {
            RectF rectF = this.f11857;
            path.computeBounds(rectF, true);
            int iSaveLayer = canvas.saveLayer(rectF, null, 31);
            canvas.drawPath(path, this.f11887);
            float fWidth = rectF.width() / rectF.height();
            float width = (this.f11858.getWidth() * 1.0f) / this.f11858.getHeight();
            Bitmap bitmap = this.f11858;
            Rect rect = this.f11853;
            if (fWidth > width) {
                int height = (int) ((bitmap.getHeight() - (this.f11858.getWidth() / fWidth)) / 2.0f);
                rect.set(0, height, this.f11858.getWidth(), ((int) (this.f11858.getWidth() / fWidth)) + height);
            } else {
                int width2 = (int) ((bitmap.getWidth() - (this.f11858.getHeight() * fWidth)) / 2.0f);
                rect.set(width2, 0, ((int) (this.f11858.getHeight() * fWidth)) + width2, this.f11858.getHeight());
            }
            canvas.drawBitmap(this.f11858, rect, rectF, this.f11854);
            canvas.restoreToCount(iSaveLayer);
        }
        if (this.f11888 != 0) {
            canvas.drawPath(path, this.f11889);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f11885 = bundle.getInt("mLookPosition");
        this.f11883 = bundle.getInt("mLookWidth");
        this.f11884 = bundle.getInt("mLookLength");
        this.f11865 = bundle.getInt("mShadowColor");
        this.f11876 = bundle.getInt("mShadowRadius");
        this.f11875 = bundle.getInt("mShadowX");
        this.f11874 = bundle.getInt("mShadowY");
        this.f11873 = bundle.getInt("mBubbleRadius");
        this.f11871 = bundle.getInt("mLTR");
        this.f11862 = bundle.getInt("mRTR");
        this.f11861 = bundle.getInt("mRDR");
        this.f11864 = bundle.getInt("mLDR");
        this.f11879 = bundle.getInt("mBubblePadding");
        this.f11863 = bundle.getInt("mArrowTopLeftRadius");
        this.f11859 = bundle.getInt("mArrowTopRightRadius");
        this.f11860 = bundle.getInt("mArrowDownLeftRadius");
        this.f11856 = bundle.getInt("mArrowDownRightRadius");
        this.f11880 = bundle.getInt("mWidth");
        this.f11870 = bundle.getInt("mHeight");
        this.f11869 = bundle.getInt("mLeft");
        this.f11868 = bundle.getInt("mTop");
        this.f11867 = bundle.getInt("mRight");
        this.f11866 = bundle.getInt("mBottom");
        int i = bundle.getInt("mBubbleBgRes");
        this.f11855 = i;
        if (i != -1) {
            this.f11858 = BitmapFactory.decodeResource(getResources(), this.f11855);
        }
        this.f11888 = bundle.getInt("mBubbleBorderSize");
        this.f11886 = bundle.getInt("mBubbleBorderColor");
        super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mLookPosition", this.f11885);
        bundle.putInt("mLookWidth", this.f11883);
        bundle.putInt("mLookLength", this.f11884);
        bundle.putInt("mShadowColor", this.f11865);
        bundle.putInt("mShadowRadius", this.f11876);
        bundle.putInt("mShadowX", this.f11875);
        bundle.putInt("mShadowY", this.f11874);
        bundle.putInt("mBubbleRadius", this.f11873);
        bundle.putInt("mLTR", this.f11871);
        bundle.putInt("mRTR", this.f11862);
        bundle.putInt("mRDR", this.f11861);
        bundle.putInt("mLDR", this.f11864);
        bundle.putInt("mBubblePadding", this.f11879);
        bundle.putInt("mArrowTopLeftRadius", this.f11863);
        bundle.putInt("mArrowTopRightRadius", this.f11859);
        bundle.putInt("mArrowDownLeftRadius", this.f11860);
        bundle.putInt("mArrowDownRightRadius", this.f11856);
        bundle.putInt("mWidth", this.f11880);
        bundle.putInt("mHeight", this.f11870);
        bundle.putInt("mLeft", this.f11869);
        bundle.putInt("mTop", this.f11868);
        bundle.putInt("mRight", this.f11867);
        bundle.putInt("mBottom", this.f11866);
        bundle.putInt("mBubbleBgRes", this.f11855);
        bundle.putInt("mBubbleBorderColor", this.f11886);
        bundle.putInt("mBubbleBorderSize", this.f11888);
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f11880 = i;
        this.f11870 = i2;
        m8113();
    }

    @Override // android.view.View
    public final void postInvalidate() {
        m8113();
        super.postInvalidate();
    }

    public void setArrowDownLeftRadius(int i) {
        this.f11860 = i;
    }

    public void setArrowDownRightRadius(int i) {
        this.f11856 = i;
    }

    public void setArrowRadius(int i) {
        setArrowDownLeftRadius(i);
        setArrowDownRightRadius(i);
        setArrowTopLeftRadius(i);
        setArrowTopRightRadius(i);
    }

    public void setArrowTopLeftRadius(int i) {
        this.f11863 = i;
    }

    public void setArrowTopRightRadius(int i) {
        this.f11859 = i;
    }

    public void setBubbleBorderColor(int i) {
        this.f11886 = i;
    }

    public void setBubbleBorderSize(int i) {
        this.f11888 = i;
    }

    public void setBubbleColor(int i) {
        this.f11872 = i;
    }

    public void setBubbleImageBg(Bitmap bitmap) {
        this.f11858 = bitmap;
    }

    public void setBubbleImageBgRes(int i) {
        this.f11858 = BitmapFactory.decodeResource(getResources(), i);
    }

    public void setBubblePadding(int i) {
        this.f11879 = i;
    }

    public void setBubbleRadius(int i) {
        this.f11873 = i;
    }

    public void setLDR(int i) {
        this.f11864 = i;
    }

    public void setLTR(int i) {
        this.f11871 = i;
    }

    public void setLook(Look look) {
        this.f11882 = look;
        m8112();
    }

    public void setLookLength(int i) {
        this.f11884 = i;
        m8112();
    }

    public void setLookPosition(int i) {
        this.f11885 = i;
    }

    public void setLookPositionCenter(boolean z) {
        this.f11878 = z;
    }

    public void setLookWidth(int i) {
        this.f11883 = i;
    }

    public void setRDR(int i) {
        this.f11861 = i;
    }

    public void setRTR(int i) {
        this.f11862 = i;
    }

    public void setShadowColor(int i) {
        this.f11865 = i;
    }

    public void setShadowRadius(int i) {
        this.f11876 = i;
    }

    public void setShadowX(int i) {
        this.f11875 = i;
    }

    public void setShadowY(int i) {
        this.f11874 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8112() {
        int i = this.f11879 + this.f11876;
        int iOrdinal = this.f11882.ordinal();
        if (iOrdinal == 0) {
            setPadding(this.f11884 + i, i, this.f11875 + i, this.f11874 + i);
            return;
        }
        if (iOrdinal == 1) {
            setPadding(i, this.f11884 + i, this.f11875 + i, this.f11874 + i);
        } else if (iOrdinal == 2) {
            setPadding(i, i, this.f11884 + i + this.f11875, this.f11874 + i);
        } else {
            if (iOrdinal != 3) {
                return;
            }
            setPadding(i, i, this.f11875 + i, this.f11884 + i + this.f11874);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8113() {
        int i;
        int i2;
        m8112();
        if (this.f11878) {
            Look look = this.f11882;
            if (look == Look.LEFT || look == Look.RIGHT) {
                i = this.f11870 / 2;
                i2 = this.f11884;
            } else {
                i = this.f11880 / 2;
                i2 = this.f11883;
            }
            this.f11885 = i - (i2 / 2);
        }
        this.f11885 = this.f11885;
        float f = this.f11876;
        float f2 = this.f11875;
        float f3 = this.f11874;
        int i3 = this.f11865;
        Paint paint = this.f11877;
        paint.setShadowLayer(f, f2, f3, i3);
        int i4 = this.f11886;
        Paint paint2 = this.f11889;
        paint2.setColor(i4);
        paint2.setStrokeWidth(this.f11888);
        paint2.setStyle(Paint.Style.STROKE);
        int i5 = this.f11876;
        int i6 = this.f11875;
        int i7 = (i6 < 0 ? -i6 : 0) + i5;
        Look look2 = this.f11882;
        this.f11869 = i7 + (look2 == Look.LEFT ? this.f11884 : 0);
        int i8 = this.f11874;
        this.f11868 = (i8 < 0 ? -i8 : 0) + i5 + (look2 == Look.TOP ? this.f11884 : 0);
        this.f11867 = ((this.f11880 - i5) + (i6 > 0 ? -i6 : 0)) - (look2 == Look.RIGHT ? this.f11884 : 0);
        this.f11866 = ((this.f11870 - i5) + (i8 > 0 ? -i8 : 0)) - (look2 == Look.BOTTOM ? this.f11884 : 0);
        paint.setColor(this.f11872);
        Path path = this.f11881;
        path.reset();
        int i9 = this.f11885;
        int i10 = this.f11884 + i9;
        int i11 = this.f11866;
        if (i10 > i11) {
            i9 = i11 - this.f11883;
        }
        int iMax = Math.max(i9, this.f11876);
        int i12 = this.f11885;
        int i13 = this.f11884 + i12;
        int i14 = this.f11867;
        if (i13 > i14) {
            i12 = i14 - this.f11883;
        }
        int iMax2 = Math.max(i12, this.f11876);
        int iOrdinal = this.f11882.ordinal();
        if (iOrdinal == 0) {
            if (iMax >= getLTR() + this.f11856) {
                path.moveTo(this.f11869, iMax - r2);
                int i15 = this.f11856;
                int i16 = this.f11884;
                int i17 = this.f11883;
                path.rCubicTo(0.0f, i15, -i16, ((i17 / 2.0f) - this.f11859) + i15, -i16, (i17 / 2.0f) + i15);
            } else {
                path.moveTo(this.f11869 - this.f11884, (this.f11883 / 2.0f) + iMax);
            }
            int i18 = this.f11883 + iMax;
            int ldr = this.f11866 - getLDR();
            int i19 = this.f11860;
            if (i18 < ldr - i19) {
                float f4 = this.f11863;
                int i20 = this.f11884;
                int i21 = this.f11883;
                path.rCubicTo(0.0f, f4, i20, i21 / 2.0f, i20, (i21 / 2.0f) + i19);
                path.lineTo(this.f11869, this.f11866 - getLDR());
            }
            path.quadTo(this.f11869, this.f11866, getLDR() + r1, this.f11866);
            path.lineTo(this.f11867 - getRDR(), this.f11866);
            int i22 = this.f11867;
            path.quadTo(i22, this.f11866, i22, r3 - getRDR());
            path.lineTo(this.f11867, getRTR() + this.f11868);
            path.quadTo(this.f11867, this.f11868, r1 - getRTR(), this.f11868);
            path.lineTo(getLTR() + this.f11869, this.f11868);
            if (iMax >= getLTR() + this.f11856) {
                int i23 = this.f11869;
                path.quadTo(i23, this.f11868, i23, getLTR() + r2);
            } else {
                path.quadTo(this.f11869, this.f11868, r1 - this.f11884, (this.f11883 / 2.0f) + iMax);
            }
        } else if (iOrdinal == 1) {
            if (iMax2 >= getLTR() + this.f11860) {
                path.moveTo(iMax2 - r1, this.f11868);
                int i24 = this.f11860;
                int i25 = this.f11883;
                int i26 = this.f11884;
                path.rCubicTo(i24, 0.0f, ((i25 / 2.0f) - this.f11863) + i24, -i26, (i25 / 2.0f) + i24, -i26);
            } else {
                path.moveTo((this.f11883 / 2.0f) + iMax2, this.f11868 - this.f11884);
            }
            int i27 = this.f11883 + iMax2;
            int rtr = this.f11867 - getRTR();
            int i28 = this.f11856;
            if (i27 < rtr - i28) {
                float f5 = this.f11859;
                int i29 = this.f11883;
                int i30 = this.f11884;
                path.rCubicTo(f5, 0.0f, i29 / 2.0f, i30, (i29 / 2.0f) + i28, i30);
                path.lineTo(this.f11867 - getRTR(), this.f11868);
            }
            int i31 = this.f11867;
            path.quadTo(i31, this.f11868, i31, getRTR() + r3);
            path.lineTo(this.f11867, this.f11866 - getRDR());
            path.quadTo(this.f11867, this.f11866, r0 - getRDR(), this.f11866);
            path.lineTo(getLDR() + this.f11869, this.f11866);
            int i32 = this.f11869;
            path.quadTo(i32, this.f11866, i32, r3 - getLDR());
            path.lineTo(this.f11869, getLTR() + this.f11868);
            if (iMax2 >= getLTR() + this.f11860) {
                path.quadTo(this.f11869, this.f11868, getLTR() + r0, this.f11868);
            } else {
                path.quadTo(this.f11869, this.f11868, (this.f11883 / 2.0f) + iMax2, r1 - this.f11884);
            }
        } else if (iOrdinal == 2) {
            if (iMax >= getRTR() + this.f11860) {
                path.moveTo(this.f11867, iMax - r2);
                int i33 = this.f11860;
                int i34 = this.f11884;
                int i35 = this.f11883;
                path.rCubicTo(0.0f, i33, i34, ((i35 / 2.0f) - this.f11863) + i33, i34, (i35 / 2.0f) + i33);
            } else {
                path.moveTo(this.f11867 + this.f11884, (this.f11883 / 2.0f) + iMax);
            }
            int i36 = this.f11883 + iMax;
            int rdr = this.f11866 - getRDR();
            int i37 = this.f11856;
            if (i36 < rdr - i37) {
                float f6 = this.f11859;
                int i38 = this.f11884;
                int i39 = this.f11883;
                path.rCubicTo(0.0f, f6, -i38, i39 / 2.0f, -i38, (i39 / 2.0f) + i37);
                path.lineTo(this.f11867, this.f11866 - getRDR());
            }
            path.quadTo(this.f11867, this.f11866, r1 - getRDR(), this.f11866);
            path.lineTo(getLDR() + this.f11869, this.f11866);
            int i40 = this.f11869;
            path.quadTo(i40, this.f11866, i40, r3 - getLDR());
            path.lineTo(this.f11869, getLTR() + this.f11868);
            path.quadTo(this.f11869, this.f11868, getLTR() + r1, this.f11868);
            path.lineTo(this.f11867 - getRTR(), this.f11868);
            if (iMax >= getRTR() + this.f11860) {
                int i41 = this.f11867;
                path.quadTo(i41, this.f11868, i41, getRTR() + r2);
            } else {
                path.quadTo(this.f11867, this.f11868, r1 + this.f11884, (this.f11883 / 2.0f) + iMax);
            }
        } else if (iOrdinal == 3) {
            if (iMax2 >= getLDR() + this.f11856) {
                path.moveTo(iMax2 - r1, this.f11866);
                int i42 = this.f11856;
                int i43 = this.f11883;
                int i44 = this.f11884;
                path.rCubicTo(i42, 0.0f, ((i43 / 2.0f) - this.f11859) + i42, i44, (i43 / 2.0f) + i42, i44);
            } else {
                path.moveTo((this.f11883 / 2.0f) + iMax2, this.f11866 + this.f11884);
            }
            int i45 = this.f11883 + iMax2;
            int rdr2 = this.f11867 - getRDR();
            int i46 = this.f11860;
            if (i45 < rdr2 - i46) {
                float f7 = this.f11863;
                int i47 = this.f11883;
                int i48 = this.f11884;
                path.rCubicTo(f7, 0.0f, i47 / 2.0f, -i48, (i47 / 2.0f) + i46, -i48);
                path.lineTo(this.f11867 - getRDR(), this.f11866);
            }
            int i49 = this.f11867;
            path.quadTo(i49, this.f11866, i49, r3 - getRDR());
            path.lineTo(this.f11867, getRTR() + this.f11868);
            path.quadTo(this.f11867, this.f11868, r0 - getRTR(), this.f11868);
            path.lineTo(getLTR() + this.f11869, this.f11868);
            int i50 = this.f11869;
            path.quadTo(i50, this.f11868, i50, getLTR() + r3);
            path.lineTo(this.f11869, this.f11866 - getLDR());
            if (iMax2 >= getLDR() + this.f11856) {
                path.quadTo(this.f11869, this.f11866, getLDR() + r0, this.f11866);
            } else {
                path.quadTo(this.f11869, this.f11866, (this.f11883 / 2.0f) + iMax2, r1 + this.f11884);
            }
        }
        path.close();
    }
}
