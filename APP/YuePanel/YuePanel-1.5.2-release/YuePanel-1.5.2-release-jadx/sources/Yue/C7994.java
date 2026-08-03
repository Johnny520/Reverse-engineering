package Yue;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: renamed from: Yue.ۥۣۢۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7994 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f3173 = 1048576;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean f3174;

    /* JADX INFO: renamed from: Yue.ۥۣۢۢۡ$ۥ */
    @InterfaceC7113(28)
    public static class C1399 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Bitmap m4005(Picture picture) {
            return Bitmap.createBitmap(picture);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۢۡ$ۥ۟ */
    public static class C1400 implements TypeEvaluator<Matrix> {

        /* JADX INFO: renamed from: ۥ */
        public final float[] f3175 = new float[9];

        /* JADX INFO: renamed from: ۥ۟ */
        public final float[] f3176 = new float[9];

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Matrix f23768 = new Matrix();

        /* JADX DEBUG: Method merged with bridge method: evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f3175);
            matrix2.getValues(this.f3176);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f3176;
                float f2 = fArr[i];
                float f3 = this.f3175[i];
                fArr[i] = f3 + ((f2 - f3) * f);
            }
            this.f23768.setValues(this.f3176);
            return this.f23768;
        }
    }

    static {
        f3174 = Build.VERSION.SDK_INT >= 28;
    }

    /* JADX INFO: renamed from: ۥ */
    public static View m4003(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        C8371.m27936(view, matrix);
        C8371.m27937(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int iRound = Math.round(rectF.left);
        int iRound2 = Math.round(rectF.top);
        int iRound3 = Math.round(rectF.right);
        int iRound4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap bitmapM4004 = m4004(view, matrix, rectF, viewGroup);
        if (bitmapM4004 != null) {
            imageView.setImageBitmap(bitmapM4004);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
        imageView.layout(iRound, iRound2, iRound3, iRound4);
        return imageView;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static Bitmap m4004(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        boolean z = !view.isAttachedToWindow();
        int iIndexOfChild = 0;
        boolean z2 = viewGroup != null && viewGroup.isAttachedToWindow();
        Bitmap bitmapCreateBitmap = null;
        if (!z) {
            viewGroup2 = null;
        } else {
            if (!z2) {
                return null;
            }
            viewGroup2 = (ViewGroup) view.getParent();
            iIndexOfChild = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        }
        int iRound = Math.round(rectF.width());
        int iRound2 = Math.round(rectF.height());
        if (iRound > 0 && iRound2 > 0) {
            float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound2));
            int iRound3 = Math.round(iRound * fMin);
            int iRound4 = Math.round(iRound2 * fMin);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(fMin, fMin);
            if (f3174) {
                Picture picture = new Picture();
                Canvas canvasBeginRecording = picture.beginRecording(iRound3, iRound4);
                canvasBeginRecording.concat(matrix);
                view.draw(canvasBeginRecording);
                picture.endRecording();
                bitmapCreateBitmap = C1399.m4005(picture);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(iRound3, iRound4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (z) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, iIndexOfChild);
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Animator m25201(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
