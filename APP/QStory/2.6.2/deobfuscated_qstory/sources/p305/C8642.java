package p305;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8642 extends AbstractC8640 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final RectF f24243 = new RectF();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f24244;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f24245;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f24246;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f24247;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f24248;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f24249;

    public C8642(float f, float f2, float f3, float f4) {
        this.f24248 = f;
        this.f24247 = f2;
        this.f24246 = f3;
        this.f24245 = f4;
    }

    @Override // p305.AbstractC8640
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo14295(Matrix matrix, Path path) {
        Matrix matrix2 = this.f24239;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.f24246;
        float f2 = this.f24245;
        RectF rectF = f24243;
        rectF.set(this.f24248, this.f24247, f, f2);
        path.arcTo(rectF, this.f24244, this.f24249, false);
        path.transform(matrix);
    }
}
