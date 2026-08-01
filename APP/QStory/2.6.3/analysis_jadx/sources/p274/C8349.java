package p274;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bumptech.glide.load.engine.InterfaceC2989;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979;
import com.bumptech.glide.load.resource.bitmap.C3026;
import java.security.MessageDigest;
import p286.InterfaceC8399;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏世子兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8349 implements InterfaceC8399 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f23023;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f23024;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f23025;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f23026;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC2979 f23027;

    @Override // p286.InterfaceC8399
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2989 mo6535(Context context, InterfaceC2989 interfaceC2989, int i, int i2) {
        int height;
        int width;
        InterfaceC2979 interfaceC2979 = this.f23027;
        Bitmap bitmap = (Bitmap) interfaceC2989.get();
        if (i > i2) {
            float f = i2;
            float f2 = i;
            height = bitmap.getWidth();
            width = (int) (bitmap.getWidth() * (f / f2));
            if (width > bitmap.getHeight()) {
                width = bitmap.getHeight();
                height = (int) (bitmap.getHeight() * (f2 / f));
            }
        } else if (i < i2) {
            float f3 = i;
            float f4 = i2;
            int height2 = bitmap.getHeight();
            int height3 = (int) (bitmap.getHeight() * (f3 / f4));
            if (height3 > bitmap.getWidth()) {
                height = bitmap.getWidth();
                width = (int) (bitmap.getWidth() * (f4 / f3));
            } else {
                height = height3;
                width = height2;
            }
        } else {
            height = bitmap.getHeight();
            width = height;
        }
        float f5 = width / i2;
        this.f23026 *= f5;
        this.f23025 *= f5;
        this.f23024 *= f5;
        this.f23023 *= f5;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapMo6459 = interfaceC2979.mo6459(height, width, config);
        if (bitmapMo6459 == null) {
            bitmapMo6459 = Bitmap.createBitmap(height, width, config);
        }
        Canvas canvas = new Canvas(bitmapMo6459);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        int width2 = (bitmap.getWidth() - height) / 2;
        int height4 = (bitmap.getHeight() - width) / 2;
        if (width2 != 0 || height4 != 0) {
            Matrix matrix = new Matrix();
            matrix.setTranslate(-width2, -height4);
            bitmapShader.setLocalMatrix(matrix);
        }
        paint.setShader(bitmapShader);
        paint.setAntiAlias(true);
        RectF rectF = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        float f6 = this.f23026;
        float f7 = this.f23024;
        float f8 = this.f23023;
        float f9 = this.f23025;
        float[] fArr = {f6, f6, f7, f7, f8, f8, f9, f9};
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return C3026.m6536(bitmapMo6459, interfaceC2979);
    }

    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6468(MessageDigest messageDigest) {
    }
}
