package p305;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p308.C8659;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8637 extends AbstractC8629 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8642 f24234;

    public C8637(C8642 c8642) {
        this.f24234 = c8642;
    }

    @Override // p305.AbstractC8629
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo14287(Matrix matrix, C8659 c8659, int i, Canvas canvas) {
        C8642 c8642 = this.f24234;
        float f = c8642.f24244;
        float f2 = c8642.f24249;
        RectF rectF = new RectF(c8642.f24248, c8642.f24247, c8642.f24246, c8642.f24245);
        Paint paint = c8659.f24358;
        boolean z = f2 < 0.0f;
        Path path = c8659.f24361;
        int[] iArr = C8659.f24350;
        if (z) {
            iArr[0] = 0;
            iArr[1] = c8659.f24354;
            iArr[2] = c8659.f24355;
            iArr[3] = c8659.f24356;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = c8659.f24356;
            iArr[2] = c8659.f24355;
            iArr[3] = c8659.f24354;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = C8659.f24351;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c8659.f24360);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
