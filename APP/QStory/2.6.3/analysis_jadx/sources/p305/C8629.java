package p305;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p308.C8651;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8629 extends AbstractC8621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8634 f24225;

    public C8629(C8634 c8634) {
        this.f24225 = c8634;
    }

    @Override // p305.AbstractC8621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo14306(Matrix matrix, C8651 c8651, int i, Canvas canvas) {
        C8634 c8634 = this.f24225;
        float f = c8634.f24235;
        float f2 = c8634.f24240;
        RectF rectF = new RectF(c8634.f24239, c8634.f24238, c8634.f24237, c8634.f24236);
        Paint paint = c8651.f24349;
        boolean z = f2 < 0.0f;
        Path path = c8651.f24352;
        int[] iArr = C8651.f24341;
        if (z) {
            iArr[0] = 0;
            iArr[1] = c8651.f24345;
            iArr[2] = c8651.f24346;
            iArr[3] = c8651.f24347;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = c8651.f24347;
            iArr[2] = c8651.f24346;
            iArr[3] = c8651.f24345;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = C8651.f24342;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c8651.f24351);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
