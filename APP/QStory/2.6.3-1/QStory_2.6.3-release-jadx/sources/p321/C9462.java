package p321;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import p324.C9480;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9462 extends AbstractC9450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f24576;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f24577;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C9460 f24578;

    public C9462(C9460 c9460, float f, float f2) {
        this.f24578 = c9460;
        this.f24577 = f;
        this.f24576 = f2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m14873() {
        C9460 c9460 = this.f24578;
        return (float) Math.toDegrees(Math.atan((c9460.f24573 - this.f24576) / (c9460.f24574 - this.f24577)));
    }

    @Override // p321.AbstractC9450
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo14865(Matrix matrix, C9480 c9480, int i, Canvas canvas) {
        C9460 c9460 = this.f24578;
        float f = c9460.f24573;
        float f2 = this.f24576;
        float f3 = c9460.f24574;
        float f4 = this.f24577;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.f24559;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(m14873());
        c9480.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = c9480.f24690;
        int[] iArr = C9480.f24688;
        iArr[0] = i2;
        iArr[1] = c9480.f24691;
        iArr[2] = c9480.f24692;
        Paint paint = c9480.f24693;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, C9480.f24689, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }
}
