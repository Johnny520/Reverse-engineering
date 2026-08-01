package p305;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import p308.C8651;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8633 extends AbstractC8621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f24231;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f24232;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8631 f24233;

    public C8633(C8631 c8631, float f, float f2) {
        this.f24233 = c8631;
        this.f24232 = f;
        this.f24231 = f2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m14314() {
        C8631 c8631 = this.f24233;
        return (float) Math.toDegrees(Math.atan((c8631.f24228 - this.f24231) / (c8631.f24229 - this.f24232)));
    }

    @Override // p305.AbstractC8621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo14306(Matrix matrix, C8651 c8651, int i, Canvas canvas) {
        C8631 c8631 = this.f24233;
        float f = c8631.f24228;
        float f2 = this.f24231;
        float f3 = c8631.f24229;
        float f4 = this.f24232;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.f24214;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(m14314());
        c8651.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = c8651.f24345;
        int[] iArr = C8651.f24343;
        iArr[0] = i2;
        iArr[1] = c8651.f24346;
        iArr[2] = c8651.f24347;
        Paint paint = c8651.f24348;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, C8651.f24344, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }
}
