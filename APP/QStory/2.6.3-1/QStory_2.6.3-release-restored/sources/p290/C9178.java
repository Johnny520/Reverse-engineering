package p290;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bumptech.glide.load.engine.InterfaceC3821;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811;
import com.bumptech.glide.load.resource.bitmap.C3858;
import java.security.MessageDigest;
import p302.InterfaceC9228;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏世子兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9178 implements InterfaceC9228 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f23368;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f23369;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f23370;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f23371;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC3811 f23372;

    @Override // p302.InterfaceC9228
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC3821 mo7095(Context context, InterfaceC3821 interfaceC3821, int i, int i2) {
        int height;
        int width;
        InterfaceC3811 interfaceC3811 = this.f23372;
        Bitmap bitmap = (Bitmap) interfaceC3821.get();
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
        this.f23371 *= f5;
        this.f23370 *= f5;
        this.f23369 *= f5;
        this.f23368 *= f5;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapMo7019 = interfaceC3811.mo7019(height, width, config);
        if (bitmapMo7019 == null) {
            bitmapMo7019 = Bitmap.createBitmap(height, width, config);
        }
        Canvas canvas = new Canvas(bitmapMo7019);
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
        float f6 = this.f23371;
        float f7 = this.f23369;
        float f8 = this.f23368;
        float f9 = this.f23370;
        float[] fArr = {f6, f6, f7, f7, f8, f8, f9, f9};
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return C3858.m7096(bitmapMo7019, interfaceC3811);
    }

    @Override // p302.InterfaceC9222
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7028(MessageDigest messageDigest) {
    }
}
