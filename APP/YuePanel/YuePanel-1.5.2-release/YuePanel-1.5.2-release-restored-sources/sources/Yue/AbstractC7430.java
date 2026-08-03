package Yue;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥۡۨۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7430 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f2878 = 1048576;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f22523 = "sharedElement:snapshot:bitmap";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f22524 = "sharedElement:snapshot:imageScaleType";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f22525 = "sharedElement:snapshot:imageMatrix";

    /* JADX INFO: renamed from: ۥ */
    public Matrix f2879;

    /* JADX INFO: renamed from: Yue.ۥۡۨۨ۟$ۥ */
    public interface InterfaceC1258 {
        /* JADX INFO: renamed from: ۥ */
        void mo196();
    }

    /* JADX INFO: renamed from: ۥ */
    public static Bitmap m3623(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return null;
        }
        float fMin = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
        if ((drawable instanceof BitmapDrawable) && fMin == 1.0f) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int i = (int) (intrinsicWidth * fMin);
        int i2 = (int) (intrinsicHeight * fMin);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect bounds = drawable.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(canvas);
        drawable.setBounds(i3, i4, i5, i6);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public Parcelable m3624(View view, Matrix matrix, RectF rectF) {
        Bitmap bitmapM3623;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (drawable != null && background == null && (bitmapM3623 = m3623(drawable)) != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(f22523, bitmapM3623);
                bundle.putString(f22524, imageView.getScaleType().toString());
                if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                    float[] fArr = new float[9];
                    imageView.getImageMatrix().getValues(fArr);
                    bundle.putFloatArray(f22525, fArr);
                }
                return bundle;
            }
        }
        int iRound = Math.round(rectF.width());
        int iRound2 = Math.round(rectF.height());
        if (iRound <= 0 || iRound2 <= 0) {
            return null;
        }
        float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound2));
        int i = (int) (iRound * fMin);
        int i2 = (int) (iRound2 * fMin);
        if (this.f2879 == null) {
            this.f2879 = new Matrix();
        }
        this.f2879.set(matrix);
        this.f2879.postTranslate(-rectF.left, -rectF.top);
        this.f2879.postScale(fMin, fMin);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.concat(this.f2879);
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public View m23263(Context context, Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            if (!(parcelable instanceof Bitmap)) {
                return null;
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageBitmap((Bitmap) parcelable);
            return imageView;
        }
        Bundle bundle = (Bundle) parcelable;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f22523);
        if (bitmap == null) {
            return null;
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageBitmap(bitmap);
        imageView2.setScaleType(ImageView.ScaleType.valueOf(bundle.getString(f22524)));
        if (imageView2.getScaleType() != ImageView.ScaleType.MATRIX) {
            return imageView2;
        }
        float[] floatArray = bundle.getFloatArray(f22525);
        Matrix matrix = new Matrix();
        matrix.setValues(floatArray);
        imageView2.setImageMatrix(matrix);
        return imageView2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m23264(List<String> list, Map<String, View> map) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m23265(List<View> list) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m23266(List<String> list, List<View> list2, List<View> list3) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m23267(List<String> list, List<View> list2, List<View> list3) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m23268(List<String> list, List<View> list2, InterfaceC1258 interfaceC1258) {
        interfaceC1258.mo196();
    }
}
