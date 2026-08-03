package Yue;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.widget.C8778;

/* JADX INFO: renamed from: Yue.ۥۡۡۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6285 extends C6230 {

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final String f15817 = "MotionTelltales";

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public Paint f15818;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public C6273 f15819;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public float[] f15820;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public Matrix f15821;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public int f15822;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public int f15823;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public float f15824;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6285(Context context) {
        super(context);
        this.f15818 = new Paint();
        this.f15820 = new float[2];
        this.f15821 = new Matrix();
        this.f15822 = 0;
        this.f15823 = -65281;
        this.f15824 = 0.25f;
        m2759(context, null);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // Yue.C6230, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f15821);
        if (this.f15819 == null) {
            ViewParent parent = getParent();
            if (parent instanceof C6273) {
                this.f15819 = (C6273) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i = 0; i < 5; i++) {
            float f = fArr[i];
            for (int i2 = 0; i2 < 5; i2++) {
                float f2 = fArr[i2];
                this.f15819.m19399(this, f2, f, this.f15820, this.f15822);
                this.f15821.mapVectors(this.f15820);
                float f3 = width * f2;
                float f4 = height * f;
                float[] fArr2 = this.f15820;
                float f5 = fArr2[0];
                float f6 = this.f15824;
                float f7 = f4 - (fArr2[1] * f6);
                this.f15821.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f7, this.f15818);
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f15391 = charSequence.toString();
        requestLayout();
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m2759(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8778.C8789.f29227);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C8778.C8789.f29228) {
                    this.f15823 = typedArrayObtainStyledAttributes.getColor(index, this.f15823);
                } else if (index == C8778.C8789.f29230) {
                    this.f15822 = typedArrayObtainStyledAttributes.getInt(index, this.f15822);
                } else if (index == C8778.C8789.f29229) {
                    this.f15824 = typedArrayObtainStyledAttributes.getFloat(index, this.f15824);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f15818.setColor(this.f15823);
        this.f15818.setStrokeWidth(5.0f);
    }

    public C6285(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15818 = new Paint();
        this.f15820 = new float[2];
        this.f15821 = new Matrix();
        this.f15822 = 0;
        this.f15823 = -65281;
        this.f15824 = 0.25f;
        m2759(context, attributeSet);
    }

    public C6285(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15818 = new Paint();
        this.f15820 = new float[2];
        this.f15821 = new Matrix();
        this.f15822 = 0;
        this.f15823 = -65281;
        this.f15824 = 0.25f;
        m2759(context, attributeSet);
    }
}
