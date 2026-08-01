package p321;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p324.C9480;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9458 extends AbstractC9450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C9463 f24570;

    public C9458(C9463 c9463) {
        this.f24570 = c9463;
    }

    @Override // p321.AbstractC9450
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo14865(Matrix matrix, C9480 c9480, int i, Canvas canvas) {
        C9463 c9463 = this.f24570;
        float f = c9463.f24580;
        float f2 = c9463.f24585;
        RectF rectF = new RectF(c9463.f24584, c9463.f24583, c9463.f24582, c9463.f24581);
        Paint paint = c9480.f24694;
        boolean z = f2 < 0.0f;
        Path path = c9480.f24697;
        int[] iArr = C9480.f24686;
        if (z) {
            iArr[0] = 0;
            iArr[1] = c9480.f24690;
            iArr[2] = c9480.f24691;
            iArr[3] = c9480.f24692;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = c9480.f24692;
            iArr[2] = c9480.f24691;
            iArr[3] = c9480.f24690;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = C9480.f24687;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c9480.f24696);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
