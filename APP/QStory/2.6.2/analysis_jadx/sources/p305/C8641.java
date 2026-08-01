package p305;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import p308.C8659;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8641 extends AbstractC8629 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f24240;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f24241;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8639 f24242;

    public C8641(C8639 c8639, float f, float f2) {
        this.f24242 = c8639;
        this.f24241 = f;
        this.f24240 = f2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m14296() {
        C8639 c8639 = this.f24242;
        return (float) Math.toDegrees(Math.atan((c8639.f24237 - this.f24240) / (c8639.f24238 - this.f24241)));
    }

    @Override // p305.AbstractC8629
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo14287(Matrix matrix, C8659 c8659, int i, Canvas canvas) {
        C8639 c8639 = this.f24242;
        float f = c8639.f24237;
        float f2 = this.f24240;
        float f3 = c8639.f24238;
        float f4 = this.f24241;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.f24223;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(m14296());
        c8659.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = c8659.f24354;
        int[] iArr = C8659.f24352;
        iArr[0] = i2;
        iArr[1] = c8659.f24355;
        iArr[2] = c8659.f24356;
        Paint paint = c8659.f24357;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, C8659.f24353, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }
}
